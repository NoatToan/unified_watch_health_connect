package com.xiaomi.hm.health.bt.proto;

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

/* JADX INFO: loaded from: classes11.dex */
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
        private static volatile vkh<AltitudeMessage> PARSER = null;
        public static final int TOTALCLIMBDISTANCE_FIELD_NUMBER = 4;
        private int averageAltitude_;
        private int bitField0_;
        private int elevationGain_;
        private int elevationLoss_;
        private int highestAltitude_;
        private int lowestAltitude_;
        private int totalClimbDistance_;

        public static final class Builder extends GeneratedMessageLite.a<AltitudeMessage, Builder> implements AltitudeMessageOrBuilder {
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

            public Builder setAverageAltitude(int i) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setAverageAltitude(i);
                return this;
            }

            public Builder setElevationGain(int i) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setElevationGain(i);
                return this;
            }

            public Builder setElevationLoss(int i) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setElevationLoss(i);
                return this;
            }

            public Builder setHighestAltitude(int i) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setHighestAltitude(i);
                return this;
            }

            public Builder setLowestAltitude(int i) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setLowestAltitude(i);
                return this;
            }

            public Builder setTotalClimbDistance(int i) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setTotalClimbDistance(i);
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

        public static AltitudeMessage parseDelimitedFrom(InputStream inputStream) {
            return (AltitudeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AltitudeMessage parseFrom(ByteBuffer byteBuffer) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AltitudeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageAltitude(int i) {
            this.bitField0_ |= 4;
            this.averageAltitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setElevationGain(int i) {
            this.bitField0_ |= 16;
            this.elevationGain_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setElevationLoss(int i) {
            this.bitField0_ |= 32;
            this.elevationLoss_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestAltitude(int i) {
            this.bitField0_ |= 1;
            this.highestAltitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowestAltitude(int i) {
            this.bitField0_ |= 2;
            this.lowestAltitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalClimbDistance(int i) {
            this.bitField0_ |= 8;
            this.totalClimbDistance_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AltitudeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "highestAltitude_", "lowestAltitude_", "averageAltitude_", "totalClimbDistance_", "elevationGain_", "elevationLoss_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AltitudeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AltitudeMessage.class) {
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

        public static Builder newBuilder(AltitudeMessage altitudeMessage) {
            return DEFAULT_INSTANCE.createBuilder(altitudeMessage);
        }

        public static AltitudeMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AltitudeMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AltitudeMessage parseFrom(ByteString byteString) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AltitudeMessage parseFrom(ByteString byteString, t tVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AltitudeMessage parseFrom(byte[] bArr) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AltitudeMessage parseFrom(byte[] bArr, t tVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AltitudeMessage parseFrom(InputStream inputStream) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AltitudeMessage parseFrom(InputStream inputStream, t tVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AltitudeMessage parseFrom(j jVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AltitudeMessage parseFrom(j jVar, t tVar) {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AltitudeMessageOrBuilder extends bsf {
        int getAverageAltitude();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class CaloriesMessage extends GeneratedMessageLite<CaloriesMessage, Builder> implements CaloriesMessageOrBuilder {
        public static final int CAL_FIELD_NUMBER = 1;
        private static final CaloriesMessage DEFAULT_INSTANCE;
        private static volatile vkh<CaloriesMessage> PARSER;
        private int bitField0_;
        private int cal_;

        public static final class Builder extends GeneratedMessageLite.a<CaloriesMessage, Builder> implements CaloriesMessageOrBuilder {
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

            public Builder setCal(int i) {
                copyOnWrite();
                ((CaloriesMessage) this.instance).setCal(i);
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

        public static CaloriesMessage parseDelimitedFrom(InputStream inputStream) {
            return (CaloriesMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaloriesMessage parseFrom(ByteBuffer byteBuffer) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CaloriesMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCal(int i) {
            this.bitField0_ |= 1;
            this.cal_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CaloriesMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "cal_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CaloriesMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CaloriesMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.CaloriesMessageOrBuilder
        public int getCal() {
            return this.cal_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.CaloriesMessageOrBuilder
        public boolean hasCal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(CaloriesMessage caloriesMessage) {
            return DEFAULT_INSTANCE.createBuilder(caloriesMessage);
        }

        public static CaloriesMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CaloriesMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CaloriesMessage parseFrom(ByteString byteString) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CaloriesMessage parseFrom(ByteString byteString, t tVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CaloriesMessage parseFrom(byte[] bArr) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CaloriesMessage parseFrom(byte[] bArr, t tVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CaloriesMessage parseFrom(InputStream inputStream) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CaloriesMessage parseFrom(InputStream inputStream, t tVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CaloriesMessage parseFrom(j jVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CaloriesMessage parseFrom(j jVar, t tVar) {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CaloriesMessageOrBuilder extends bsf {
        int getCal();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean hasCal();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class ChartMessage extends GeneratedMessageLite<ChartMessage, Builder> implements ChartMessageOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 4;
        private static final ChartMessage DEFAULT_INSTANCE;
        public static final int GPS_FIELD_NUMBER = 5;
        public static final int HR_FIELD_NUMBER = 1;
        public static final int PACE_FIELD_NUMBER = 3;
        private static volatile vkh<ChartMessage> PARSER = null;
        public static final int SPEED_FIELD_NUMBER = 2;
        public static final int TEMP_FIELD_NUMBER = 6;
        private boolean altitude_;
        private int bitField0_;
        private boolean gps_;
        private boolean hr_;
        private boolean pace_;
        private boolean speed_;
        private boolean temp_;

        public static final class Builder extends GeneratedMessageLite.a<ChartMessage, Builder> implements ChartMessageOrBuilder {
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

            public Builder setAltitude(boolean z) {
                copyOnWrite();
                ((ChartMessage) this.instance).setAltitude(z);
                return this;
            }

            public Builder setGps(boolean z) {
                copyOnWrite();
                ((ChartMessage) this.instance).setGps(z);
                return this;
            }

            public Builder setHr(boolean z) {
                copyOnWrite();
                ((ChartMessage) this.instance).setHr(z);
                return this;
            }

            public Builder setPace(boolean z) {
                copyOnWrite();
                ((ChartMessage) this.instance).setPace(z);
                return this;
            }

            public Builder setSpeed(boolean z) {
                copyOnWrite();
                ((ChartMessage) this.instance).setSpeed(z);
                return this;
            }

            public Builder setTemp(boolean z) {
                copyOnWrite();
                ((ChartMessage) this.instance).setTemp(z);
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

        public static ChartMessage parseDelimitedFrom(InputStream inputStream) {
            return (ChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChartMessage parseFrom(ByteBuffer byteBuffer) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ChartMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(boolean z) {
            this.bitField0_ |= 8;
            this.altitude_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGps(boolean z) {
            this.bitField0_ |= 16;
            this.gps_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHr(boolean z) {
            this.bitField0_ |= 1;
            this.hr_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPace(boolean z) {
            this.bitField0_ |= 4;
            this.pace_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(boolean z) {
            this.bitField0_ |= 2;
            this.speed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemp(boolean z) {
            this.bitField0_ |= 32;
            this.temp_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChartMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "hr_", "speed_", "pace_", "altitude_", "gps_", "temp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ChartMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ChartMessage.class) {
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

        public static Builder newBuilder(ChartMessage chartMessage) {
            return DEFAULT_INSTANCE.createBuilder(chartMessage);
        }

        public static ChartMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (ChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChartMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ChartMessage parseFrom(ByteString byteString) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChartMessage parseFrom(ByteString byteString, t tVar) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ChartMessage parseFrom(byte[] bArr) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChartMessage parseFrom(byte[] bArr, t tVar) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ChartMessage parseFrom(InputStream inputStream) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChartMessage parseFrom(InputStream inputStream, t tVar) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChartMessage parseFrom(j jVar) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ChartMessage parseFrom(j jVar, t tVar) {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ChartMessageOrBuilder extends bsf {
        boolean getAltitude();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class DistanceMessage extends GeneratedMessageLite<DistanceMessage, Builder> implements DistanceMessageOrBuilder {
        private static final DistanceMessage DEFAULT_INSTANCE;
        public static final int DISTANCE_FIELD_NUMBER = 1;
        private static volatile vkh<DistanceMessage> PARSER;
        private int bitField0_;
        private float distance_;

        public static final class Builder extends GeneratedMessageLite.a<DistanceMessage, Builder> implements DistanceMessageOrBuilder {
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

            public Builder setDistance(float f) {
                copyOnWrite();
                ((DistanceMessage) this.instance).setDistance(f);
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

        public static DistanceMessage parseDelimitedFrom(InputStream inputStream) {
            return (DistanceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DistanceMessage parseFrom(ByteBuffer byteBuffer) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<DistanceMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistance(float f) {
            this.bitField0_ |= 1;
            this.distance_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DistanceMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "distance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<DistanceMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (DistanceMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DistanceMessageOrBuilder
        public float getDistance() {
            return this.distance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DistanceMessageOrBuilder
        public boolean hasDistance() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DistanceMessage distanceMessage) {
            return DEFAULT_INSTANCE.createBuilder(distanceMessage);
        }

        public static DistanceMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (DistanceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DistanceMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static DistanceMessage parseFrom(ByteString byteString) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DistanceMessage parseFrom(ByteString byteString, t tVar) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static DistanceMessage parseFrom(byte[] bArr) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DistanceMessage parseFrom(byte[] bArr, t tVar) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static DistanceMessage parseFrom(InputStream inputStream) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DistanceMessage parseFrom(InputStream inputStream, t tVar) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DistanceMessage parseFrom(j jVar) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DistanceMessage parseFrom(j jVar, t tVar) {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface DistanceMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        float getDistance();

        boolean hasDistance();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class DownhillMessage extends GeneratedMessageLite<DownhillMessage, Builder> implements DownhillMessageOrBuilder {
        private static final DownhillMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMDOWNHILLDROP_FIELD_NUMBER = 3;
        private static volatile vkh<DownhillMessage> PARSER = null;
        public static final int TIMESOFDOWNHILL_FIELD_NUMBER = 1;
        public static final int TOTALDISTANCEOFDOWNHILL_FIELD_NUMBER = 2;
        public static final int TOTALDOWNHILLDROP_FIELD_NUMBER = 4;
        private int bitField0_;
        private int maximumDownhillDrop_;
        private int timesOfDownhill_;
        private int totalDistanceOfDownhill_;
        private int totalDownhillDrop_;

        public static final class Builder extends GeneratedMessageLite.a<DownhillMessage, Builder> implements DownhillMessageOrBuilder {
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

            public Builder setMaximumDownhillDrop(int i) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setMaximumDownhillDrop(i);
                return this;
            }

            public Builder setTimesOfDownhill(int i) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setTimesOfDownhill(i);
                return this;
            }

            public Builder setTotalDistanceOfDownhill(int i) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setTotalDistanceOfDownhill(i);
                return this;
            }

            public Builder setTotalDownhillDrop(int i) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setTotalDownhillDrop(i);
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

        public static DownhillMessage parseDelimitedFrom(InputStream inputStream) {
            return (DownhillMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DownhillMessage parseFrom(ByteBuffer byteBuffer) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<DownhillMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumDownhillDrop(int i) {
            this.bitField0_ |= 4;
            this.maximumDownhillDrop_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimesOfDownhill(int i) {
            this.bitField0_ |= 1;
            this.timesOfDownhill_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDistanceOfDownhill(int i) {
            this.bitField0_ |= 2;
            this.totalDistanceOfDownhill_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDownhillDrop(int i) {
            this.bitField0_ |= 8;
            this.totalDownhillDrop_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DownhillMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "timesOfDownhill_", "totalDistanceOfDownhill_", "maximumDownhillDrop_", "totalDownhillDrop_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<DownhillMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (DownhillMessage.class) {
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

        public static Builder newBuilder(DownhillMessage downhillMessage) {
            return DEFAULT_INSTANCE.createBuilder(downhillMessage);
        }

        public static DownhillMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (DownhillMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DownhillMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static DownhillMessage parseFrom(ByteString byteString) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DownhillMessage parseFrom(ByteString byteString, t tVar) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static DownhillMessage parseFrom(byte[] bArr) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DownhillMessage parseFrom(byte[] bArr, t tVar) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static DownhillMessage parseFrom(InputStream inputStream) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DownhillMessage parseFrom(InputStream inputStream, t tVar) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DownhillMessage parseFrom(j jVar) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DownhillMessage parseFrom(j jVar, t tVar) {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface DownhillMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getMaximumDownhillDrop();

        int getTimesOfDownhill();

        int getTotalDistanceOfDownhill();

        int getTotalDownhillDrop();

        boolean hasMaximumDownhillDrop();

        boolean hasTimesOfDownhill();

        boolean hasTotalDistanceOfDownhill();

        boolean hasTotalDownhillDrop();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class FloorsMessage extends GeneratedMessageLite<FloorsMessage, Builder> implements FloorsMessageOrBuilder {
        public static final int AVERAGEFLOORSCLIMBEDPERMINUTE_FIELD_NUMBER = 5;
        private static final FloorsMessage DEFAULT_INSTANCE;
        public static final int DOWNSTAIRFLOORS_FIELD_NUMBER = 2;
        public static final int DOWNSTAIRHEIGHT_FIELD_NUMBER = 4;
        private static volatile vkh<FloorsMessage> PARSER = null;
        public static final int UPSTAIRFLOORS_FIELD_NUMBER = 1;
        public static final int UPSTAIRHEIGHT_FIELD_NUMBER = 3;
        private float averageFloorsClimbedPerMinute_;
        private int bitField0_;
        private int downstairFloors_;
        private float downstairHeight_;
        private int upstairFloors_;
        private float upstairHeight_;

        public static final class Builder extends GeneratedMessageLite.a<FloorsMessage, Builder> implements FloorsMessageOrBuilder {
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

            public Builder setAverageFloorsClimbedPerMinute(float f) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setAverageFloorsClimbedPerMinute(f);
                return this;
            }

            public Builder setDownstairFloors(int i) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setDownstairFloors(i);
                return this;
            }

            public Builder setDownstairHeight(float f) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setDownstairHeight(f);
                return this;
            }

            public Builder setUpstairFloors(int i) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setUpstairFloors(i);
                return this;
            }

            public Builder setUpstairHeight(float f) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setUpstairHeight(f);
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

        public static FloorsMessage parseDelimitedFrom(InputStream inputStream) {
            return (FloorsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FloorsMessage parseFrom(ByteBuffer byteBuffer) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<FloorsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageFloorsClimbedPerMinute(float f) {
            this.bitField0_ |= 16;
            this.averageFloorsClimbedPerMinute_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownstairFloors(int i) {
            this.bitField0_ |= 2;
            this.downstairFloors_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownstairHeight(float f) {
            this.bitField0_ |= 8;
            this.downstairHeight_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpstairFloors(int i) {
            this.bitField0_ |= 1;
            this.upstairFloors_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpstairHeight(float f) {
            this.bitField0_ |= 4;
            this.upstairHeight_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FloorsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"bitField0_", "upstairFloors_", "downstairFloors_", "upstairHeight_", "downstairHeight_", "averageFloorsClimbedPerMinute_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<FloorsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (FloorsMessage.class) {
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

        public static Builder newBuilder(FloorsMessage floorsMessage) {
            return DEFAULT_INSTANCE.createBuilder(floorsMessage);
        }

        public static FloorsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (FloorsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FloorsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static FloorsMessage parseFrom(ByteString byteString) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FloorsMessage parseFrom(ByteString byteString, t tVar) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static FloorsMessage parseFrom(byte[] bArr) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FloorsMessage parseFrom(byte[] bArr, t tVar) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static FloorsMessage parseFrom(InputStream inputStream) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FloorsMessage parseFrom(InputStream inputStream, t tVar) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FloorsMessage parseFrom(j jVar) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static FloorsMessage parseFrom(j jVar, t tVar) {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface FloorsMessageOrBuilder extends bsf {
        float getAverageFloorsClimbedPerMinute();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDownstairFloors();

        float getDownstairHeight();

        int getUpstairFloors();

        float getUpstairHeight();

        boolean hasAverageFloorsClimbedPerMinute();

        boolean hasDownstairFloors();

        boolean hasDownstairHeight();

        boolean hasUpstairFloors();

        boolean hasUpstairHeight();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class FrequencyMessage extends GeneratedMessageLite<FrequencyMessage, Builder> implements FrequencyMessageOrBuilder {
        public static final int AVERAGEFREQUENCY_FIELD_NUMBER = 1;
        private static final FrequencyMessage DEFAULT_INSTANCE;
        public static final int HIGHESTFREQUENCY_FIELD_NUMBER = 2;
        private static volatile vkh<FrequencyMessage> PARSER;
        private int averageFrequency_;
        private int bitField0_;
        private int highestFrequency_;

        public static final class Builder extends GeneratedMessageLite.a<FrequencyMessage, Builder> implements FrequencyMessageOrBuilder {
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

            public Builder setAverageFrequency(int i) {
                copyOnWrite();
                ((FrequencyMessage) this.instance).setAverageFrequency(i);
                return this;
            }

            public Builder setHighestFrequency(int i) {
                copyOnWrite();
                ((FrequencyMessage) this.instance).setHighestFrequency(i);
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

        public static FrequencyMessage parseDelimitedFrom(InputStream inputStream) {
            return (FrequencyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FrequencyMessage parseFrom(ByteBuffer byteBuffer) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<FrequencyMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageFrequency(int i) {
            this.bitField0_ |= 1;
            this.averageFrequency_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestFrequency(int i) {
            this.bitField0_ |= 2;
            this.highestFrequency_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FrequencyMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "averageFrequency_", "highestFrequency_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<FrequencyMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (FrequencyMessage.class) {
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

        public static Builder newBuilder(FrequencyMessage frequencyMessage) {
            return DEFAULT_INSTANCE.createBuilder(frequencyMessage);
        }

        public static FrequencyMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FrequencyMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static FrequencyMessage parseFrom(ByteString byteString) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FrequencyMessage parseFrom(ByteString byteString, t tVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static FrequencyMessage parseFrom(byte[] bArr) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FrequencyMessage parseFrom(byte[] bArr, t tVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static FrequencyMessage parseFrom(InputStream inputStream) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FrequencyMessage parseFrom(InputStream inputStream, t tVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FrequencyMessage parseFrom(j jVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static FrequencyMessage parseFrom(j jVar, t tVar) {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface FrequencyMessageOrBuilder extends bsf {
        int getAverageFrequency();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getHighestFrequency();

        boolean hasAverageFrequency();

        boolean hasHighestFrequency();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class GoalMessage extends GeneratedMessageLite<GoalMessage, Builder> implements GoalMessageOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final GoalMessage DEFAULT_INSTANCE;
        private static volatile vkh<GoalMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private float data_;
        private byte memoizedIsInitialized = 2;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.a<GoalMessage, Builder> implements GoalMessageOrBuilder {
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

            public Builder setData(float f) {
                copyOnWrite();
                ((GoalMessage) this.instance).setData(f);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((GoalMessage) this.instance).setType(i);
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

        public static GoalMessage parseDelimitedFrom(InputStream inputStream) {
            return (GoalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GoalMessage parseFrom(ByteBuffer byteBuffer) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<GoalMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(float f) {
            this.bitField0_ |= 2;
            this.data_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GoalMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔁ\u0001", new Object[]{"bitField0_", "type_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<GoalMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (GoalMessage.class) {
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

        public static Builder newBuilder(GoalMessage goalMessage) {
            return DEFAULT_INSTANCE.createBuilder(goalMessage);
        }

        public static GoalMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (GoalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static GoalMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static GoalMessage parseFrom(ByteString byteString) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GoalMessage parseFrom(ByteString byteString, t tVar) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static GoalMessage parseFrom(byte[] bArr) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GoalMessage parseFrom(byte[] bArr, t tVar) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static GoalMessage parseFrom(InputStream inputStream) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GoalMessage parseFrom(InputStream inputStream, t tVar) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static GoalMessage parseFrom(j jVar) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static GoalMessage parseFrom(j jVar, t tVar) {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface GoalMessageOrBuilder extends bsf {
        float getData();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getType();

        boolean hasData();

        boolean hasType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class GolfMessage extends GeneratedMessageLite<GolfMessage, Builder> implements GolfMessageOrBuilder {
        public static final int AVERAGEANGLE_FIELD_NUMBER = 7;
        public static final int AVERAGEBEAT_FIELD_NUMBER = 2;
        public static final int AVERAGEDOWNTIME_FIELD_NUMBER = 4;
        public static final int AVERAGESCORE_FIELD_NUMBER = 6;
        public static final int AVERAGEUPTIME_FIELD_NUMBER = 3;
        private static final GolfMessage DEFAULT_INSTANCE;
        private static volatile vkh<GolfMessage> PARSER = null;
        public static final int TOTALSWINGS_FIELD_NUMBER = 1;
        private int averageAngle_;
        private float averageBeat_;
        private float averageDownTime_;
        private int averageScore_;
        private float averageUpTime_;
        private int bitField0_;
        private int totalSwings_;

        public static final class Builder extends GeneratedMessageLite.a<GolfMessage, Builder> implements GolfMessageOrBuilder {
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

            public Builder setAverageAngle(int i) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageAngle(i);
                return this;
            }

            public Builder setAverageBeat(float f) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageBeat(f);
                return this;
            }

            public Builder setAverageDownTime(float f) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageDownTime(f);
                return this;
            }

            public Builder setAverageScore(int i) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageScore(i);
                return this;
            }

            public Builder setAverageUpTime(float f) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageUpTime(f);
                return this;
            }

            public Builder setTotalSwings(int i) {
                copyOnWrite();
                ((GolfMessage) this.instance).setTotalSwings(i);
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

        public static GolfMessage parseDelimitedFrom(InputStream inputStream) {
            return (GolfMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GolfMessage parseFrom(ByteBuffer byteBuffer) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<GolfMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageAngle(int i) {
            this.bitField0_ |= 32;
            this.averageAngle_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageBeat(float f) {
            this.bitField0_ |= 2;
            this.averageBeat_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageDownTime(float f) {
            this.bitField0_ |= 8;
            this.averageDownTime_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageScore(int i) {
            this.bitField0_ |= 16;
            this.averageScore_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageUpTime(float f) {
            this.bitField0_ |= 4;
            this.averageUpTime_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalSwings(int i) {
            this.bitField0_ |= 1;
            this.totalSwings_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GolfMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0006ဋ\u0004\u0007င\u0005", new Object[]{"bitField0_", "totalSwings_", "averageBeat_", "averageUpTime_", "averageDownTime_", "averageScore_", "averageAngle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<GolfMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (GolfMessage.class) {
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

        public static Builder newBuilder(GolfMessage golfMessage) {
            return DEFAULT_INSTANCE.createBuilder(golfMessage);
        }

        public static GolfMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (GolfMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static GolfMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static GolfMessage parseFrom(ByteString byteString) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GolfMessage parseFrom(ByteString byteString, t tVar) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static GolfMessage parseFrom(byte[] bArr) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GolfMessage parseFrom(byte[] bArr, t tVar) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static GolfMessage parseFrom(InputStream inputStream) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GolfMessage parseFrom(InputStream inputStream, t tVar) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static GolfMessage parseFrom(j jVar) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static GolfMessage parseFrom(j jVar, t tVar) {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface GolfMessageOrBuilder extends bsf {
        int getAverageAngle();

        float getAverageBeat();

        float getAverageDownTime();

        int getAverageScore();

        float getAverageUpTime();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getTotalSwings();

        boolean hasAverageAngle();

        boolean hasAverageBeat();

        boolean hasAverageDownTime();

        boolean hasAverageScore();

        boolean hasAverageUpTime();

        boolean hasTotalSwings();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class HeartRateMessage extends GeneratedMessageLite<HeartRateMessage, Builder> implements HeartRateMessageOrBuilder {
        public static final int AVERAGEHEARTRATE_FIELD_NUMBER = 1;
        private static final HeartRateMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMHEARTRATE_FIELD_NUMBER = 2;
        public static final int MINIMUMHEARTRATE_FIELD_NUMBER = 3;
        private static volatile vkh<HeartRateMessage> PARSER;
        private int averageHeartRate_;
        private int bitField0_;
        private int maximumHeartRate_;
        private int minimumHeartRate_;

        public static final class Builder extends GeneratedMessageLite.a<HeartRateMessage, Builder> implements HeartRateMessageOrBuilder {
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

            public Builder setAverageHeartRate(int i) {
                copyOnWrite();
                ((HeartRateMessage) this.instance).setAverageHeartRate(i);
                return this;
            }

            public Builder setMaximumHeartRate(int i) {
                copyOnWrite();
                ((HeartRateMessage) this.instance).setMaximumHeartRate(i);
                return this;
            }

            public Builder setMinimumHeartRate(int i) {
                copyOnWrite();
                ((HeartRateMessage) this.instance).setMinimumHeartRate(i);
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

        public static HeartRateMessage parseDelimitedFrom(InputStream inputStream) {
            return (HeartRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateMessage parseFrom(ByteBuffer byteBuffer) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<HeartRateMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageHeartRate(int i) {
            this.bitField0_ |= 1;
            this.averageHeartRate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumHeartRate(int i) {
            this.bitField0_ |= 2;
            this.maximumHeartRate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumHeartRate(int i) {
            this.bitField0_ |= 4;
            this.minimumHeartRate_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeartRateMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "averageHeartRate_", "maximumHeartRate_", "minimumHeartRate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<HeartRateMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (HeartRateMessage.class) {
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

        public static Builder newBuilder(HeartRateMessage heartRateMessage) {
            return DEFAULT_INSTANCE.createBuilder(heartRateMessage);
        }

        public static HeartRateMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static HeartRateMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static HeartRateMessage parseFrom(ByteString byteString) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartRateMessage parseFrom(ByteString byteString, t tVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static HeartRateMessage parseFrom(byte[] bArr) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartRateMessage parseFrom(byte[] bArr, t tVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static HeartRateMessage parseFrom(InputStream inputStream) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateMessage parseFrom(InputStream inputStream, t tVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static HeartRateMessage parseFrom(j jVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HeartRateMessage parseFrom(j jVar, t tVar) {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface HeartRateMessageOrBuilder extends bsf {
        int getAverageHeartRate();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getMaximumHeartRate();

        int getMinimumHeartRate();

        boolean hasAverageHeartRate();

        boolean hasMaximumHeartRate();

        boolean hasMinimumHeartRate();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class HeartrateZoneMessage extends GeneratedMessageLite<HeartrateZoneMessage, Builder> implements HeartrateZoneMessageOrBuilder {
        private static final HeartrateZoneMessage DEFAULT_INSTANCE;
        public static final int HEART_FIELD_NUMBER = 2;
        private static volatile vkh<HeartrateZoneMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int ZONE_FIELD_NUMBER = 3;
        private int bitField0_;
        private int type_;
        private byte memoizedIsInitialized = 2;
        private d0.g heart_ = GeneratedMessageLite.emptyIntList();
        private d0.g zone_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.a<HeartrateZoneMessage, Builder> implements HeartrateZoneMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllHeart(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addAllHeart(iterable);
                return this;
            }

            public Builder addAllZone(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addAllZone(iterable);
                return this;
            }

            public Builder addHeart(int i) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addHeart(i);
                return this;
            }

            public Builder addZone(int i) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addZone(i);
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
            public int getHeart(int i) {
                return ((HeartrateZoneMessage) this.instance).getHeart(i);
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
            public int getZone(int i) {
                return ((HeartrateZoneMessage) this.instance).getZone(i);
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

            public Builder setHeart(int i, int i2) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).setHeart(i, i2);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).setType(i);
                return this;
            }

            public Builder setZone(int i, int i2) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).setZone(i, i2);
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
        public void addAllHeart(Iterable<? extends Integer> iterable) {
            ensureHeartIsMutable();
            b.addAll((Iterable) iterable, (List) this.heart_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllZone(Iterable<? extends Integer> iterable) {
            ensureZoneIsMutable();
            b.addAll((Iterable) iterable, (List) this.zone_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHeart(int i) {
            ensureHeartIsMutable();
            this.heart_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addZone(int i) {
            ensureZoneIsMutable();
            this.zone_.Q(i);
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
            d0.g gVar = this.heart_;
            if (gVar.c()) {
                return;
            }
            this.heart_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureZoneIsMutable() {
            d0.g gVar = this.zone_;
            if (gVar.c()) {
                return;
            }
            this.zone_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static HeartrateZoneMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartrateZoneMessage parseDelimitedFrom(InputStream inputStream) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartrateZoneMessage parseFrom(ByteBuffer byteBuffer) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<HeartrateZoneMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeart(int i, int i2) {
            ensureHeartIsMutable();
            this.heart_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZone(int i, int i2) {
            ensureZoneIsMutable();
            this.zone_.K(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeartrateZoneMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ᔋ\u0000\u0002\u001d\u0003\u001d", new Object[]{"bitField0_", "type_", "heart_", "zone_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<HeartrateZoneMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (HeartrateZoneMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public int getHeart(int i) {
            return this.heart_.getInt(i);
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
        public int getZone(int i) {
            return this.zone_.getInt(i);
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

        public static Builder newBuilder(HeartrateZoneMessage heartrateZoneMessage) {
            return DEFAULT_INSTANCE.createBuilder(heartrateZoneMessage);
        }

        public static HeartrateZoneMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static HeartrateZoneMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static HeartrateZoneMessage parseFrom(ByteString byteString) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartrateZoneMessage parseFrom(ByteString byteString, t tVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static HeartrateZoneMessage parseFrom(byte[] bArr) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartrateZoneMessage parseFrom(byte[] bArr, t tVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static HeartrateZoneMessage parseFrom(InputStream inputStream) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartrateZoneMessage parseFrom(InputStream inputStream, t tVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static HeartrateZoneMessage parseFrom(j jVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HeartrateZoneMessage parseFrom(j jVar, t tVar) {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface HeartrateZoneMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getHeart(int i);

        int getHeartCount();

        List<Integer> getHeartList();

        int getType();

        int getZone(int i);

        int getZoneCount();

        List<Integer> getZoneList();

        boolean hasType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class MarathonMessage extends GeneratedMessageLite<MarathonMessage, Builder> implements MarathonMessageOrBuilder {
        private static final MarathonMessage DEFAULT_INSTANCE;
        public static final int DISTANCE_FIELD_NUMBER = 3;
        private static volatile vkh<MarathonMessage> PARSER = null;
        public static final int TIMEUSAGE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int distance_;
        private byte memoizedIsInitialized = 2;
        private int timeUsage_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.a<MarathonMessage, Builder> implements MarathonMessageOrBuilder {
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

            public Builder setDistance(int i) {
                copyOnWrite();
                ((MarathonMessage) this.instance).setDistance(i);
                return this;
            }

            public Builder setTimeUsage(int i) {
                copyOnWrite();
                ((MarathonMessage) this.instance).setTimeUsage(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((MarathonMessage) this.instance).setType(i);
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

        public static MarathonMessage parseDelimitedFrom(InputStream inputStream) {
            return (MarathonMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MarathonMessage parseFrom(ByteBuffer byteBuffer) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<MarathonMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistance(int i) {
            this.bitField0_ |= 4;
            this.distance_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeUsage(int i) {
            this.bitField0_ |= 2;
            this.timeUsage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MarathonMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "type_", "timeUsage_", "distance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<MarathonMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (MarathonMessage.class) {
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

        public static Builder newBuilder(MarathonMessage marathonMessage) {
            return DEFAULT_INSTANCE.createBuilder(marathonMessage);
        }

        public static MarathonMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (MarathonMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static MarathonMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static MarathonMessage parseFrom(ByteString byteString) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MarathonMessage parseFrom(ByteString byteString, t tVar) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static MarathonMessage parseFrom(byte[] bArr) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MarathonMessage parseFrom(byte[] bArr, t tVar) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static MarathonMessage parseFrom(InputStream inputStream) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MarathonMessage parseFrom(InputStream inputStream, t tVar) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static MarathonMessage parseFrom(j jVar) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MarathonMessage parseFrom(j jVar, t tVar) {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface MarathonMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDistance();

        int getTimeUsage();

        int getType();

        boolean hasDistance();

        boolean hasTimeUsage();

        boolean hasType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class NumberMessage extends GeneratedMessageLite<NumberMessage, Builder> implements NumberMessageOrBuilder {
        private static final NumberMessage DEFAULT_INSTANCE;
        public static final int NUMBEROFBREAK_FIELD_NUMBER = 3;
        private static volatile vkh<NumberMessage> PARSER = null;
        public static final int TOTALNUMBEROFJUMPS_FIELD_NUMBER = 1;
        public static final int TOTALTIMESOFROWING_FIELD_NUMBER = 2;
        private int bitField0_;
        private int numberOfBreak_;
        private int totalNumberOfJumps_;
        private int totalTimesOfRowing_;

        public static final class Builder extends GeneratedMessageLite.a<NumberMessage, Builder> implements NumberMessageOrBuilder {
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

            public Builder setNumberOfBreak(int i) {
                copyOnWrite();
                ((NumberMessage) this.instance).setNumberOfBreak(i);
                return this;
            }

            public Builder setTotalNumberOfJumps(int i) {
                copyOnWrite();
                ((NumberMessage) this.instance).setTotalNumberOfJumps(i);
                return this;
            }

            public Builder setTotalTimesOfRowing(int i) {
                copyOnWrite();
                ((NumberMessage) this.instance).setTotalTimesOfRowing(i);
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

        public static NumberMessage parseDelimitedFrom(InputStream inputStream) {
            return (NumberMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NumberMessage parseFrom(ByteBuffer byteBuffer) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<NumberMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumberOfBreak(int i) {
            this.bitField0_ |= 4;
            this.numberOfBreak_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalNumberOfJumps(int i) {
            this.bitField0_ |= 1;
            this.totalNumberOfJumps_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalTimesOfRowing(int i) {
            this.bitField0_ |= 2;
            this.totalTimesOfRowing_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NumberMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "totalNumberOfJumps_", "totalTimesOfRowing_", "numberOfBreak_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<NumberMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (NumberMessage.class) {
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

        public static Builder newBuilder(NumberMessage numberMessage) {
            return DEFAULT_INSTANCE.createBuilder(numberMessage);
        }

        public static NumberMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (NumberMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NumberMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static NumberMessage parseFrom(ByteString byteString) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NumberMessage parseFrom(ByteString byteString, t tVar) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static NumberMessage parseFrom(byte[] bArr) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NumberMessage parseFrom(byte[] bArr, t tVar) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static NumberMessage parseFrom(InputStream inputStream) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NumberMessage parseFrom(InputStream inputStream, t tVar) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NumberMessage parseFrom(j jVar) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NumberMessage parseFrom(j jVar, t tVar) {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface NumberMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getNumberOfBreak();

        int getTotalNumberOfJumps();

        int getTotalTimesOfRowing();

        boolean hasNumberOfBreak();

        boolean hasTotalNumberOfJumps();

        boolean hasTotalTimesOfRowing();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class OtherMessage extends GeneratedMessageLite<OtherMessage, Builder> implements OtherMessageOrBuilder {
        public static final int AEROBICTRAININGEFFECT_FIELD_NUMBER = 4;
        public static final int ANAEROBICTRAININGEFFECT_FIELD_NUMBER = 5;
        private static final OtherMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMSPO2_FIELD_NUMBER = 2;
        public static final int MINIMUMSPO2_FIELD_NUMBER = 3;
        private static volatile vkh<OtherMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<OtherMessage, Builder> implements OtherMessageOrBuilder {
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

            public Builder setAerobicTrainingEffect(float f) {
                copyOnWrite();
                ((OtherMessage) this.instance).setAerobicTrainingEffect(f);
                return this;
            }

            public Builder setAnaerobicTrainingEffect(float f) {
                copyOnWrite();
                ((OtherMessage) this.instance).setAnaerobicTrainingEffect(f);
                return this;
            }

            public Builder setMaximumSpO2(int i) {
                copyOnWrite();
                ((OtherMessage) this.instance).setMaximumSpO2(i);
                return this;
            }

            public Builder setMinimumSpO2(int i) {
                copyOnWrite();
                ((OtherMessage) this.instance).setMinimumSpO2(i);
                return this;
            }

            public Builder setTotalGroups(int i) {
                copyOnWrite();
                ((OtherMessage) this.instance).setTotalGroups(i);
                return this;
            }

            public Builder setTrainingLoadOfThisActivity(int i) {
                copyOnWrite();
                ((OtherMessage) this.instance).setTrainingLoadOfThisActivity(i);
                return this;
            }

            public Builder setVO2Max(int i) {
                copyOnWrite();
                ((OtherMessage) this.instance).setVO2Max(i);
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

        public static OtherMessage parseDelimitedFrom(InputStream inputStream) {
            return (OtherMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OtherMessage parseFrom(ByteBuffer byteBuffer) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<OtherMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAerobicTrainingEffect(float f) {
            this.bitField0_ |= 8;
            this.aerobicTrainingEffect_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnaerobicTrainingEffect(float f) {
            this.bitField0_ |= 16;
            this.anaerobicTrainingEffect_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumSpO2(int i) {
            this.bitField0_ |= 2;
            this.maximumSpO2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumSpO2(int i) {
            this.bitField0_ |= 4;
            this.minimumSpO2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalGroups(int i) {
            this.bitField0_ |= 1;
            this.totalGroups_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadOfThisActivity(int i) {
            this.bitField0_ |= 32;
            this.trainingLoadOfThisActivity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVO2Max(int i) {
            this.bitField0_ |= 64;
            this.vO2Max_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OtherMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "totalGroups_", "maximumSpO2_", "minimumSpO2_", "aerobicTrainingEffect_", "anaerobicTrainingEffect_", "trainingLoadOfThisActivity_", "vO2Max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<OtherMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (OtherMessage.class) {
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

        public static Builder newBuilder(OtherMessage otherMessage) {
            return DEFAULT_INSTANCE.createBuilder(otherMessage);
        }

        public static OtherMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (OtherMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static OtherMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static OtherMessage parseFrom(ByteString byteString) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OtherMessage parseFrom(ByteString byteString, t tVar) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static OtherMessage parseFrom(byte[] bArr) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OtherMessage parseFrom(byte[] bArr, t tVar) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static OtherMessage parseFrom(InputStream inputStream) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OtherMessage parseFrom(InputStream inputStream, t tVar) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static OtherMessage parseFrom(j jVar) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static OtherMessage parseFrom(j jVar, t tVar) {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface OtherMessageOrBuilder extends bsf {
        float getAerobicTrainingEffect();

        float getAnaerobicTrainingEffect();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class PaceMessage extends GeneratedMessageLite<PaceMessage, Builder> implements PaceMessageOrBuilder {
        public static final int AVERAGEPACE_FIELD_NUMBER = 1;
        public static final int BESTPACE_FIELD_NUMBER = 2;
        private static final PaceMessage DEFAULT_INSTANCE;
        private static volatile vkh<PaceMessage> PARSER;
        private float averagePace_;
        private float bestPace_;
        private int bitField0_;

        public static final class Builder extends GeneratedMessageLite.a<PaceMessage, Builder> implements PaceMessageOrBuilder {
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

            public Builder setAveragePace(float f) {
                copyOnWrite();
                ((PaceMessage) this.instance).setAveragePace(f);
                return this;
            }

            public Builder setBestPace(float f) {
                copyOnWrite();
                ((PaceMessage) this.instance).setBestPace(f);
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

        public static PaceMessage parseDelimitedFrom(InputStream inputStream) {
            return (PaceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaceMessage parseFrom(ByteBuffer byteBuffer) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PaceMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePace(float f) {
            this.bitField0_ |= 1;
            this.averagePace_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBestPace(float f) {
            this.bitField0_ |= 2;
            this.bestPace_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PaceMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "averagePace_", "bestPace_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PaceMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PaceMessage.class) {
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

        public static Builder newBuilder(PaceMessage paceMessage) {
            return DEFAULT_INSTANCE.createBuilder(paceMessage);
        }

        public static PaceMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PaceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PaceMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PaceMessage parseFrom(ByteString byteString) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PaceMessage parseFrom(ByteString byteString, t tVar) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PaceMessage parseFrom(byte[] bArr) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaceMessage parseFrom(byte[] bArr, t tVar) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PaceMessage parseFrom(InputStream inputStream) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaceMessage parseFrom(InputStream inputStream, t tVar) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PaceMessage parseFrom(j jVar) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PaceMessage parseFrom(j jVar, t tVar) {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PaceMessageOrBuilder extends bsf {
        float getAveragePace();

        float getBestPace();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean hasAveragePace();

        boolean hasBestPace();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class PowerMessage extends GeneratedMessageLite<PowerMessage, Builder> implements PowerMessageOrBuilder {
        public static final int AVERAGEPOWER_FIELD_NUMBER = 1;
        private static final PowerMessage DEFAULT_INSTANCE;
        public static final int DEVICEWORK_FIELD_NUMBER = 3;
        public static final int MAXIMUMPOWER_FIELD_NUMBER = 2;
        private static volatile vkh<PowerMessage> PARSER;
        private int averagePower_;
        private int bitField0_;
        private int deviceWork_;
        private int maximumPower_;

        public static final class Builder extends GeneratedMessageLite.a<PowerMessage, Builder> implements PowerMessageOrBuilder {
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

            public Builder setAveragePower(int i) {
                copyOnWrite();
                ((PowerMessage) this.instance).setAveragePower(i);
                return this;
            }

            public Builder setDeviceWork(int i) {
                copyOnWrite();
                ((PowerMessage) this.instance).setDeviceWork(i);
                return this;
            }

            public Builder setMaximumPower(int i) {
                copyOnWrite();
                ((PowerMessage) this.instance).setMaximumPower(i);
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

        public static PowerMessage parseDelimitedFrom(InputStream inputStream) {
            return (PowerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PowerMessage parseFrom(ByteBuffer byteBuffer) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PowerMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePower(int i) {
            this.bitField0_ |= 1;
            this.averagePower_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceWork(int i) {
            this.bitField0_ |= 4;
            this.deviceWork_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumPower(int i) {
            this.bitField0_ |= 2;
            this.maximumPower_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PowerMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "averagePower_", "maximumPower_", "deviceWork_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PowerMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PowerMessage.class) {
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

        public static Builder newBuilder(PowerMessage powerMessage) {
            return DEFAULT_INSTANCE.createBuilder(powerMessage);
        }

        public static PowerMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PowerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PowerMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PowerMessage parseFrom(ByteString byteString) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PowerMessage parseFrom(ByteString byteString, t tVar) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PowerMessage parseFrom(byte[] bArr) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PowerMessage parseFrom(byte[] bArr, t tVar) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PowerMessage parseFrom(InputStream inputStream) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PowerMessage parseFrom(InputStream inputStream, t tVar) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PowerMessage parseFrom(j jVar) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PowerMessage parseFrom(j jVar, t tVar) {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PowerMessageOrBuilder extends bsf {
        int getAveragePower();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDeviceWork();

        int getMaximumPower();

        boolean hasAveragePower();

        boolean hasDeviceWork();

        boolean hasMaximumPower();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class PressureMessage extends GeneratedMessageLite<PressureMessage, Builder> implements PressureMessageOrBuilder {
        public static final int AVERAGEPRESSURE_FIELD_NUMBER = 1;
        private static final PressureMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMPRESSURE_FIELD_NUMBER = 2;
        public static final int MINIMUMPRESSURE_FIELD_NUMBER = 3;
        private static volatile vkh<PressureMessage> PARSER;
        private int averagePressure_;
        private int bitField0_;
        private int maximumPressure_;
        private int minimumPressure_;

        public static final class Builder extends GeneratedMessageLite.a<PressureMessage, Builder> implements PressureMessageOrBuilder {
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

            public Builder setAveragePressure(int i) {
                copyOnWrite();
                ((PressureMessage) this.instance).setAveragePressure(i);
                return this;
            }

            public Builder setMaximumPressure(int i) {
                copyOnWrite();
                ((PressureMessage) this.instance).setMaximumPressure(i);
                return this;
            }

            public Builder setMinimumPressure(int i) {
                copyOnWrite();
                ((PressureMessage) this.instance).setMinimumPressure(i);
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

        public static PressureMessage parseDelimitedFrom(InputStream inputStream) {
            return (PressureMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PressureMessage parseFrom(ByteBuffer byteBuffer) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PressureMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePressure(int i) {
            this.bitField0_ |= 1;
            this.averagePressure_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumPressure(int i) {
            this.bitField0_ |= 2;
            this.maximumPressure_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumPressure(int i) {
            this.bitField0_ |= 4;
            this.minimumPressure_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PressureMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "averagePressure_", "maximumPressure_", "minimumPressure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PressureMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PressureMessage.class) {
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

        public static Builder newBuilder(PressureMessage pressureMessage) {
            return DEFAULT_INSTANCE.createBuilder(pressureMessage);
        }

        public static PressureMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PressureMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PressureMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PressureMessage parseFrom(ByteString byteString) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PressureMessage parseFrom(ByteString byteString, t tVar) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PressureMessage parseFrom(byte[] bArr) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PressureMessage parseFrom(byte[] bArr, t tVar) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PressureMessage parseFrom(InputStream inputStream) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PressureMessage parseFrom(InputStream inputStream, t tVar) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PressureMessage parseFrom(j jVar) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PressureMessage parseFrom(j jVar, t tVar) {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PressureMessageOrBuilder extends bsf {
        int getAveragePressure();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getMaximumPressure();

        int getMinimumPressure();

        boolean hasAveragePressure();

        boolean hasMaximumPressure();

        boolean hasMinimumPressure();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
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
        private static volatile vkh<RecordMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<RecordMessage, Builder> implements RecordMessageOrBuilder {
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

            public Builder setAltitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setAltitude(i);
                return this;
            }

            public Builder setCourseTitle(String str) {
                copyOnWrite();
                ((RecordMessage) this.instance).setCourseTitle(str);
                return this;
            }

            public Builder setCourseTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((RecordMessage) this.instance).setCourseTitleBytes(byteString);
                return this;
            }

            public Builder setLatitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setLatitude(i);
                return this;
            }

            public Builder setLongitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setLongitude(i);
                return this;
            }

            public Builder setMaxLatitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMaxLatitude(i);
                return this;
            }

            public Builder setMaxLongitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMaxLongitude(i);
                return this;
            }

            public Builder setMinLatitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMinLatitude(i);
                return this;
            }

            public Builder setMinLongitude(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMinLongitude(i);
                return this;
            }

            public Builder setParentId(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setParentId(i);
                return this;
            }

            public Builder setTrackId(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setTrackId(i);
                return this;
            }

            public Builder setZone(int i) {
                copyOnWrite();
                ((RecordMessage) this.instance).setZone(i);
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

        public static RecordMessage parseDelimitedFrom(InputStream inputStream) {
            return (RecordMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecordMessage parseFrom(ByteBuffer byteBuffer) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<RecordMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(int i) {
            this.bitField0_ |= 32;
            this.altitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCourseTitle(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.courseTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCourseTitleBytes(ByteString byteString) {
            this.courseTitle_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatitude(int i) {
            this.bitField0_ |= 8;
            this.latitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongitude(int i) {
            this.bitField0_ |= 16;
            this.longitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLatitude(int i) {
            this.bitField0_ |= 64;
            this.maxLatitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLongitude(int i) {
            this.bitField0_ |= 256;
            this.maxLongitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinLatitude(int i) {
            this.bitField0_ |= 128;
            this.minLatitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinLongitude(int i) {
            this.bitField0_ |= 512;
            this.minLongitude_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParentId(int i) {
            this.bitField0_ |= 2;
            this.parentId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackId(int i) {
            this.bitField0_ |= 1;
            this.trackId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZone(int i) {
            this.bitField0_ |= 4;
            this.zone_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecordMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔄ\u0002\u0005ဏ\u0003\u0006ဏ\u0004\u0007ဏ\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fဈ\n", new Object[]{"bitField0_", "trackId_", "parentId_", "zone_", "latitude_", "longitude_", "altitude_", "maxLatitude_", "minLatitude_", "maxLongitude_", "minLongitude_", "courseTitle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<RecordMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (RecordMessage.class) {
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

        public static Builder newBuilder(RecordMessage recordMessage) {
            return DEFAULT_INSTANCE.createBuilder(recordMessage);
        }

        public static RecordMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (RecordMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static RecordMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static RecordMessage parseFrom(ByteString byteString) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RecordMessage parseFrom(ByteString byteString, t tVar) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static RecordMessage parseFrom(byte[] bArr) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecordMessage parseFrom(byte[] bArr, t tVar) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static RecordMessage parseFrom(InputStream inputStream) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecordMessage parseFrom(InputStream inputStream, t tVar) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static RecordMessage parseFrom(j jVar) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static RecordMessage parseFrom(j jVar, t tVar) {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface RecordMessageOrBuilder extends bsf {
        int getAltitude();

        String getCourseTitle();

        ByteString getCourseTitleBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class RowingMessage extends GeneratedMessageLite<RowingMessage, Builder> implements RowingMessageOrBuilder {
        public static final int AVERAGEPADDLETIME_FIELD_NUMBER = 4;
        public static final int AVERAGEPULLINGTIME_FIELD_NUMBER = 3;
        public static final int AVERAGEROWINGFREQUENCY_FIELD_NUMBER = 1;
        private static final RowingMessage DEFAULT_INSTANCE;
        public static final int HIGHESTROWINGFREQUENCY_FIELD_NUMBER = 2;
        private static volatile vkh<RowingMessage> PARSER;
        private float averagePaddleTime_;
        private float averagePullingTime_;
        private int averageRowingFrequency_;
        private int bitField0_;
        private int highestRowingFrequency_;

        public static final class Builder extends GeneratedMessageLite.a<RowingMessage, Builder> implements RowingMessageOrBuilder {
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

            public Builder setAveragePaddleTime(float f) {
                copyOnWrite();
                ((RowingMessage) this.instance).setAveragePaddleTime(f);
                return this;
            }

            public Builder setAveragePullingTime(float f) {
                copyOnWrite();
                ((RowingMessage) this.instance).setAveragePullingTime(f);
                return this;
            }

            public Builder setAverageRowingFrequency(int i) {
                copyOnWrite();
                ((RowingMessage) this.instance).setAverageRowingFrequency(i);
                return this;
            }

            public Builder setHighestRowingFrequency(int i) {
                copyOnWrite();
                ((RowingMessage) this.instance).setHighestRowingFrequency(i);
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

        public static RowingMessage parseDelimitedFrom(InputStream inputStream) {
            return (RowingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RowingMessage parseFrom(ByteBuffer byteBuffer) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<RowingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePaddleTime(float f) {
            this.bitField0_ |= 8;
            this.averagePaddleTime_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePullingTime(float f) {
            this.bitField0_ |= 4;
            this.averagePullingTime_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageRowingFrequency(int i) {
            this.bitField0_ |= 1;
            this.averageRowingFrequency_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestRowingFrequency(int i) {
            this.bitField0_ |= 2;
            this.highestRowingFrequency_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RowingMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "averageRowingFrequency_", "highestRowingFrequency_", "averagePullingTime_", "averagePaddleTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<RowingMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (RowingMessage.class) {
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

        public static Builder newBuilder(RowingMessage rowingMessage) {
            return DEFAULT_INSTANCE.createBuilder(rowingMessage);
        }

        public static RowingMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (RowingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static RowingMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static RowingMessage parseFrom(ByteString byteString) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RowingMessage parseFrom(ByteString byteString, t tVar) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static RowingMessage parseFrom(byte[] bArr) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RowingMessage parseFrom(byte[] bArr, t tVar) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static RowingMessage parseFrom(InputStream inputStream) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RowingMessage parseFrom(InputStream inputStream, t tVar) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static RowingMessage parseFrom(j jVar) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static RowingMessage parseFrom(j jVar, t tVar) {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface RowingMessageOrBuilder extends bsf {
        float getAveragePaddleTime();

        float getAveragePullingTime();

        int getAverageRowingFrequency();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getHighestRowingFrequency();

        boolean hasAveragePaddleTime();

        boolean hasAveragePullingTime();

        boolean hasAverageRowingFrequency();

        boolean hasHighestRowingFrequency();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SWingMessage extends GeneratedMessageLite<SWingMessage, Builder> implements SWingMessageOrBuilder {
        public static final int BACKHANDPERCENTAGE_FIELD_NUMBER = 6;
        private static final SWingMessage DEFAULT_INSTANCE;
        public static final int FOREHANDPERCENTAGE_FIELD_NUMBER = 5;
        private static volatile vkh<SWingMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<SWingMessage, Builder> implements SWingMessageOrBuilder {
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

            public Builder setBackhandPercentage(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setBackhandPercentage(i);
                return this;
            }

            public Builder setForehandPercentage(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setForehandPercentage(i);
                return this;
            }

            public Builder setPercentageOfServeTimes(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setPercentageOfServeTimes(i);
                return this;
            }

            public Builder setServeTimes(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setServeTimes(i);
                return this;
            }

            public Builder setTimesOfBackhandSwing(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setTimesOfBackhandSwing(i);
                return this;
            }

            public Builder setTimesOfForehandSwing(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setTimesOfForehandSwing(i);
                return this;
            }

            public Builder setTotalTimesOfSwing(int i) {
                copyOnWrite();
                ((SWingMessage) this.instance).setTotalTimesOfSwing(i);
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

        public static SWingMessage parseDelimitedFrom(InputStream inputStream) {
            return (SWingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SWingMessage parseFrom(ByteBuffer byteBuffer) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SWingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackhandPercentage(int i) {
            this.bitField0_ |= 32;
            this.backhandPercentage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForehandPercentage(int i) {
            this.bitField0_ |= 16;
            this.forehandPercentage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentageOfServeTimes(int i) {
            this.bitField0_ |= 64;
            this.percentageOfServeTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServeTimes(int i) {
            this.bitField0_ |= 8;
            this.serveTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimesOfBackhandSwing(int i) {
            this.bitField0_ |= 4;
            this.timesOfBackhandSwing_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimesOfForehandSwing(int i) {
            this.bitField0_ |= 2;
            this.timesOfForehandSwing_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalTimesOfSwing(int i) {
            this.bitField0_ |= 1;
            this.totalTimesOfSwing_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SWingMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "totalTimesOfSwing_", "timesOfForehandSwing_", "timesOfBackhandSwing_", "serveTimes_", "forehandPercentage_", "backhandPercentage_", "percentageOfServeTimes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SWingMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SWingMessage.class) {
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

        public static Builder newBuilder(SWingMessage sWingMessage) {
            return DEFAULT_INSTANCE.createBuilder(sWingMessage);
        }

        public static SWingMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SWingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SWingMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SWingMessage parseFrom(ByteString byteString) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SWingMessage parseFrom(ByteString byteString, t tVar) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SWingMessage parseFrom(byte[] bArr) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SWingMessage parseFrom(byte[] bArr, t tVar) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SWingMessage parseFrom(InputStream inputStream) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SWingMessage parseFrom(InputStream inputStream, t tVar) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SWingMessage parseFrom(j jVar) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SWingMessage parseFrom(j jVar, t tVar) {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SWingMessageOrBuilder extends bsf {
        int getBackhandPercentage();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SlopeChartMessage extends GeneratedMessageLite<SlopeChartMessage, Builder> implements SlopeChartMessageOrBuilder {
        private static final SlopeChartMessage DEFAULT_INSTANCE;
        public static final int DOWNHILLDISTANCE_FIELD_NUMBER = 2;
        public static final int DOWNHILLTIME_FIELD_NUMBER = 4;
        private static volatile vkh<SlopeChartMessage> PARSER = null;
        public static final int UPHILLDISTANCE_FIELD_NUMBER = 1;
        public static final int UPHILLTIME_FIELD_NUMBER = 3;
        private int bitField0_;
        private int downhillDistance_;
        private int downhillTime_;
        private int uphillDistance_;
        private int uphillTime_;

        public static final class Builder extends GeneratedMessageLite.a<SlopeChartMessage, Builder> implements SlopeChartMessageOrBuilder {
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

            public Builder setDownhillDistance(int i) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setDownhillDistance(i);
                return this;
            }

            public Builder setDownhillTime(int i) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setDownhillTime(i);
                return this;
            }

            public Builder setUphillDistance(int i) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setUphillDistance(i);
                return this;
            }

            public Builder setUphillTime(int i) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setUphillTime(i);
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

        public static SlopeChartMessage parseDelimitedFrom(InputStream inputStream) {
            return (SlopeChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SlopeChartMessage parseFrom(ByteBuffer byteBuffer) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SlopeChartMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownhillDistance(int i) {
            this.bitField0_ |= 2;
            this.downhillDistance_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownhillTime(int i) {
            this.bitField0_ |= 8;
            this.downhillTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUphillDistance(int i) {
            this.bitField0_ |= 1;
            this.uphillDistance_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUphillTime(int i) {
            this.bitField0_ |= 4;
            this.uphillTime_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SlopeChartMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "uphillDistance_", "downhillDistance_", "uphillTime_", "downhillTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SlopeChartMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SlopeChartMessage.class) {
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

        public static Builder newBuilder(SlopeChartMessage slopeChartMessage) {
            return DEFAULT_INSTANCE.createBuilder(slopeChartMessage);
        }

        public static SlopeChartMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SlopeChartMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SlopeChartMessage parseFrom(ByteString byteString) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SlopeChartMessage parseFrom(ByteString byteString, t tVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SlopeChartMessage parseFrom(byte[] bArr) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SlopeChartMessage parseFrom(byte[] bArr, t tVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SlopeChartMessage parseFrom(InputStream inputStream) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SlopeChartMessage parseFrom(InputStream inputStream, t tVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SlopeChartMessage parseFrom(j jVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SlopeChartMessage parseFrom(j jVar, t tVar) {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SlopeChartMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDownhillDistance();

        int getDownhillTime();

        int getUphillDistance();

        int getUphillTime();

        boolean hasDownhillDistance();

        boolean hasDownhillTime();

        boolean hasUphillDistance();

        boolean hasUphillTime();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SlopeMessage extends GeneratedMessageLite<SlopeMessage, Builder> implements SlopeMessageOrBuilder {
        public static final int AVERAGESLOPE_FIELD_NUMBER = 1;
        private static final SlopeMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMSLOPE_FIELD_NUMBER = 2;
        private static volatile vkh<SlopeMessage> PARSER;
        private int averageSlope_;
        private int bitField0_;
        private int maximumSlope_;

        public static final class Builder extends GeneratedMessageLite.a<SlopeMessage, Builder> implements SlopeMessageOrBuilder {
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

            public Builder setAverageSlope(int i) {
                copyOnWrite();
                ((SlopeMessage) this.instance).setAverageSlope(i);
                return this;
            }

            public Builder setMaximumSlope(int i) {
                copyOnWrite();
                ((SlopeMessage) this.instance).setMaximumSlope(i);
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

        public static SlopeMessage parseDelimitedFrom(InputStream inputStream) {
            return (SlopeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SlopeMessage parseFrom(ByteBuffer byteBuffer) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SlopeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageSlope(int i) {
            this.bitField0_ |= 1;
            this.averageSlope_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumSlope(int i) {
            this.bitField0_ |= 2;
            this.maximumSlope_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SlopeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "averageSlope_", "maximumSlope_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SlopeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SlopeMessage.class) {
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

        public static Builder newBuilder(SlopeMessage slopeMessage) {
            return DEFAULT_INSTANCE.createBuilder(slopeMessage);
        }

        public static SlopeMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SlopeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SlopeMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SlopeMessage parseFrom(ByteString byteString) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SlopeMessage parseFrom(ByteString byteString, t tVar) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SlopeMessage parseFrom(byte[] bArr) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SlopeMessage parseFrom(byte[] bArr, t tVar) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SlopeMessage parseFrom(InputStream inputStream) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SlopeMessage parseFrom(InputStream inputStream, t tVar) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SlopeMessage parseFrom(j jVar) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SlopeMessage parseFrom(j jVar, t tVar) {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SlopeMessageOrBuilder extends bsf {
        int getAverageSlope();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getMaximumSlope();

        boolean hasAverageSlope();

        boolean hasMaximumSlope();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SpeedMessage extends GeneratedMessageLite<SpeedMessage, Builder> implements SpeedMessageOrBuilder {
        public static final int AVERAGESPEED_FIELD_NUMBER = 1;
        private static final SpeedMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMSPEED_FIELD_NUMBER = 2;
        private static volatile vkh<SpeedMessage> PARSER;
        private float averageSpeed_;
        private int bitField0_;
        private float maximumSpeed_;

        public static final class Builder extends GeneratedMessageLite.a<SpeedMessage, Builder> implements SpeedMessageOrBuilder {
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

            public Builder setAverageSpeed(float f) {
                copyOnWrite();
                ((SpeedMessage) this.instance).setAverageSpeed(f);
                return this;
            }

            public Builder setMaximumSpeed(float f) {
                copyOnWrite();
                ((SpeedMessage) this.instance).setMaximumSpeed(f);
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

        public static SpeedMessage parseDelimitedFrom(InputStream inputStream) {
            return (SpeedMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeedMessage parseFrom(ByteBuffer byteBuffer) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SpeedMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageSpeed(float f) {
            this.bitField0_ |= 1;
            this.averageSpeed_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumSpeed(float f) {
            this.bitField0_ |= 2;
            this.maximumSpeed_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SpeedMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "averageSpeed_", "maximumSpeed_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SpeedMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SpeedMessage.class) {
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

        public static Builder newBuilder(SpeedMessage speedMessage) {
            return DEFAULT_INSTANCE.createBuilder(speedMessage);
        }

        public static SpeedMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SpeedMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SpeedMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SpeedMessage parseFrom(ByteString byteString) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SpeedMessage parseFrom(ByteString byteString, t tVar) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SpeedMessage parseFrom(byte[] bArr) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SpeedMessage parseFrom(byte[] bArr, t tVar) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SpeedMessage parseFrom(InputStream inputStream) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SpeedMessage parseFrom(InputStream inputStream, t tVar) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SpeedMessage parseFrom(j jVar) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SpeedMessage parseFrom(j jVar, t tVar) {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SpeedMessageOrBuilder extends bsf {
        float getAverageSpeed();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        float getMaximumSpeed();

        boolean hasAverageSpeed();

        boolean hasMaximumSpeed();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
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
        private static volatile vkh<SportSummaryMessage> PARSER = null;
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
        private d0.i<MarathonMessage> marathon_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<SportSummaryMessage, Builder> implements SportSummaryMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMarathon(Iterable<? extends MarathonMessage> iterable) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addAllMarathon(iterable);
                return this;
            }

            public Builder addMarathon(MarathonMessage marathonMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(marathonMessage);
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
            public MarathonMessage getMarathon(int i) {
                return ((SportSummaryMessage) this.instance).getMarathon(i);
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

            public Builder mergeAltitude(AltitudeMessage altitudeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeAltitude(altitudeMessage);
                return this;
            }

            public Builder mergeCalories(CaloriesMessage caloriesMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeCalories(caloriesMessage);
                return this;
            }

            public Builder mergeDistance(DistanceMessage distanceMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeDistance(distanceMessage);
                return this;
            }

            public Builder mergeDownhill(DownhillMessage downhillMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeDownhill(downhillMessage);
                return this;
            }

            public Builder mergeFloors(FloorsMessage floorsMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeFloors(floorsMessage);
                return this;
            }

            public Builder mergeFrequency(FrequencyMessage frequencyMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeFrequency(frequencyMessage);
                return this;
            }

            public Builder mergeGoal(GoalMessage goalMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeGoal(goalMessage);
                return this;
            }

            public Builder mergeGolf(GolfMessage golfMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeGolf(golfMessage);
                return this;
            }

            public Builder mergeHeartRate(HeartRateMessage heartRateMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeHeartRate(heartRateMessage);
                return this;
            }

            public Builder mergeHrZone(HeartrateZoneMessage heartrateZoneMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeHrZone(heartrateZoneMessage);
                return this;
            }

            public Builder mergeNumber(NumberMessage numberMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeNumber(numberMessage);
                return this;
            }

            public Builder mergeOther(OtherMessage otherMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeOther(otherMessage);
                return this;
            }

            public Builder mergePace(PaceMessage paceMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergePace(paceMessage);
                return this;
            }

            public Builder mergePower(PowerMessage powerMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergePower(powerMessage);
                return this;
            }

            public Builder mergePressure(PressureMessage pressureMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergePressure(pressureMessage);
                return this;
            }

            public Builder mergeRecord(RecordMessage recordMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeRecord(recordMessage);
                return this;
            }

            public Builder mergeRowing(RowingMessage rowingMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeRowing(rowingMessage);
                return this;
            }

            public Builder mergeSlope(SlopeMessage slopeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSlope(slopeMessage);
                return this;
            }

            public Builder mergeSlopeChart(SlopeChartMessage slopeChartMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSlopeChart(slopeChartMessage);
                return this;
            }

            public Builder mergeSteps(StepsMessage stepsMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSteps(stepsMessage);
                return this;
            }

            public Builder mergeSwim(SwimMessage swimMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSwim(swimMessage);
                return this;
            }

            public Builder mergeSwing(SWingMessage sWingMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSwing(sWingMessage);
                return this;
            }

            public Builder mergeTemp(TempMessage tempMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeTemp(tempMessage);
                return this;
            }

            public Builder mergeTimes(TimeMessage timeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeTimes(timeMessage);
                return this;
            }

            public Builder mergeType(TypeMessage typeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeType(typeMessage);
                return this;
            }

            public Builder removeMarathon(int i) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).removeMarathon(i);
                return this;
            }

            public Builder setAltitude(AltitudeMessage altitudeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setAltitude(altitudeMessage);
                return this;
            }

            public Builder setCalories(CaloriesMessage caloriesMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setCalories(caloriesMessage);
                return this;
            }

            public Builder setDistance(DistanceMessage distanceMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDistance(distanceMessage);
                return this;
            }

            public Builder setDownhill(DownhillMessage downhillMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDownhill(downhillMessage);
                return this;
            }

            public Builder setFloors(FloorsMessage floorsMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFloors(floorsMessage);
                return this;
            }

            public Builder setFrequency(FrequencyMessage frequencyMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFrequency(frequencyMessage);
                return this;
            }

            public Builder setGoal(GoalMessage goalMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGoal(goalMessage);
                return this;
            }

            public Builder setGolf(GolfMessage golfMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGolf(golfMessage);
                return this;
            }

            public Builder setHeartRate(HeartRateMessage heartRateMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHeartRate(heartRateMessage);
                return this;
            }

            public Builder setHrZone(HeartrateZoneMessage heartrateZoneMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHrZone(heartrateZoneMessage);
                return this;
            }

            public Builder setMarathon(int i, MarathonMessage marathonMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setMarathon(i, marathonMessage);
                return this;
            }

            public Builder setNumber(NumberMessage numberMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setNumber(numberMessage);
                return this;
            }

            public Builder setOther(OtherMessage otherMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setOther(otherMessage);
                return this;
            }

            public Builder setPace(PaceMessage paceMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPace(paceMessage);
                return this;
            }

            public Builder setPower(PowerMessage powerMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPower(powerMessage);
                return this;
            }

            public Builder setPressure(PressureMessage pressureMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPressure(pressureMessage);
                return this;
            }

            public Builder setRecord(RecordMessage recordMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRecord(recordMessage);
                return this;
            }

            public Builder setRowing(RowingMessage rowingMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRowing(rowingMessage);
                return this;
            }

            public Builder setSlope(SlopeMessage slopeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlope(slopeMessage);
                return this;
            }

            public Builder setSlopeChart(SlopeChartMessage slopeChartMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlopeChart(slopeChartMessage);
                return this;
            }

            public Builder setSteps(StepsMessage stepsMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSteps(stepsMessage);
                return this;
            }

            public Builder setSwim(SwimMessage swimMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwim(swimMessage);
                return this;
            }

            public Builder setSwing(SWingMessage sWingMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwing(sWingMessage);
                return this;
            }

            public Builder setTemp(TempMessage tempMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTemp(tempMessage);
                return this;
            }

            public Builder setTimes(TimeMessage timeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTimes(timeMessage);
                return this;
            }

            public Builder setType(TypeMessage typeMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setType(typeMessage);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setVersionBytes(byteString);
                return this;
            }

            private Builder() {
                super(SportSummaryMessage.DEFAULT_INSTANCE);
            }

            public Builder addMarathon(int i, MarathonMessage marathonMessage) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(i, marathonMessage);
                return this;
            }

            public Builder setAltitude(AltitudeMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setAltitude(builder.build());
                return this;
            }

            public Builder setCalories(CaloriesMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setCalories(builder.build());
                return this;
            }

            public Builder setDistance(DistanceMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDistance(builder.build());
                return this;
            }

            public Builder setDownhill(DownhillMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDownhill(builder.build());
                return this;
            }

            public Builder setFloors(FloorsMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFloors(builder.build());
                return this;
            }

            public Builder setFrequency(FrequencyMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFrequency(builder.build());
                return this;
            }

            public Builder setGoal(GoalMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGoal(builder.build());
                return this;
            }

            public Builder setGolf(GolfMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGolf(builder.build());
                return this;
            }

            public Builder setHeartRate(HeartRateMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHeartRate(builder.build());
                return this;
            }

            public Builder setHrZone(HeartrateZoneMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHrZone(builder.build());
                return this;
            }

            public Builder setMarathon(int i, MarathonMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setMarathon(i, builder.build());
                return this;
            }

            public Builder setNumber(NumberMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setNumber(builder.build());
                return this;
            }

            public Builder setOther(OtherMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setOther(builder.build());
                return this;
            }

            public Builder setPace(PaceMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPace(builder.build());
                return this;
            }

            public Builder setPower(PowerMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPower(builder.build());
                return this;
            }

            public Builder setPressure(PressureMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPressure(builder.build());
                return this;
            }

            public Builder setRecord(RecordMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRecord(builder.build());
                return this;
            }

            public Builder setRowing(RowingMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRowing(builder.build());
                return this;
            }

            public Builder setSlope(SlopeMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlope(builder.build());
                return this;
            }

            public Builder setSlopeChart(SlopeChartMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlopeChart(builder.build());
                return this;
            }

            public Builder setSteps(StepsMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSteps(builder.build());
                return this;
            }

            public Builder setSwim(SwimMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwim(builder.build());
                return this;
            }

            public Builder setSwing(SWingMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwing(builder.build());
                return this;
            }

            public Builder setTemp(TempMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTemp(builder.build());
                return this;
            }

            public Builder setTimes(TimeMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTimes(builder.build());
                return this;
            }

            public Builder setType(TypeMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setType(builder.build());
                return this;
            }

            public Builder addMarathon(MarathonMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(builder.build());
                return this;
            }

            public Builder addMarathon(int i, MarathonMessage.Builder builder) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(i, builder.build());
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
        public void addAllMarathon(Iterable<? extends MarathonMessage> iterable) {
            ensureMarathonIsMutable();
            b.addAll((Iterable) iterable, (List) this.marathon_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMarathon(MarathonMessage marathonMessage) {
            marathonMessage.getClass();
            ensureMarathonIsMutable();
            this.marathon_.add(marathonMessage);
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
            d0.i<MarathonMessage> iVar = this.marathon_;
            if (iVar.c()) {
                return;
            }
            this.marathon_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static SportSummaryMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAltitude(AltitudeMessage altitudeMessage) {
            altitudeMessage.getClass();
            AltitudeMessage altitudeMessage2 = this.altitude_;
            if (altitudeMessage2 == null || altitudeMessage2 == AltitudeMessage.getDefaultInstance()) {
                this.altitude_ = altitudeMessage;
            } else {
                this.altitude_ = AltitudeMessage.newBuilder(this.altitude_).mergeFrom(altitudeMessage).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCalories(CaloriesMessage caloriesMessage) {
            caloriesMessage.getClass();
            CaloriesMessage caloriesMessage2 = this.calories_;
            if (caloriesMessage2 == null || caloriesMessage2 == CaloriesMessage.getDefaultInstance()) {
                this.calories_ = caloriesMessage;
            } else {
                this.calories_ = CaloriesMessage.newBuilder(this.calories_).mergeFrom(caloriesMessage).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDistance(DistanceMessage distanceMessage) {
            distanceMessage.getClass();
            DistanceMessage distanceMessage2 = this.distance_;
            if (distanceMessage2 == null || distanceMessage2 == DistanceMessage.getDefaultInstance()) {
                this.distance_ = distanceMessage;
            } else {
                this.distance_ = DistanceMessage.newBuilder(this.distance_).mergeFrom(distanceMessage).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDownhill(DownhillMessage downhillMessage) {
            downhillMessage.getClass();
            DownhillMessage downhillMessage2 = this.downhill_;
            if (downhillMessage2 == null || downhillMessage2 == DownhillMessage.getDefaultInstance()) {
                this.downhill_ = downhillMessage;
            } else {
                this.downhill_ = DownhillMessage.newBuilder(this.downhill_).mergeFrom(downhillMessage).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFloors(FloorsMessage floorsMessage) {
            floorsMessage.getClass();
            FloorsMessage floorsMessage2 = this.floors_;
            if (floorsMessage2 == null || floorsMessage2 == FloorsMessage.getDefaultInstance()) {
                this.floors_ = floorsMessage;
            } else {
                this.floors_ = FloorsMessage.newBuilder(this.floors_).mergeFrom(floorsMessage).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFrequency(FrequencyMessage frequencyMessage) {
            frequencyMessage.getClass();
            FrequencyMessage frequencyMessage2 = this.frequency_;
            if (frequencyMessage2 == null || frequencyMessage2 == FrequencyMessage.getDefaultInstance()) {
                this.frequency_ = frequencyMessage;
            } else {
                this.frequency_ = FrequencyMessage.newBuilder(this.frequency_).mergeFrom(frequencyMessage).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGoal(GoalMessage goalMessage) {
            goalMessage.getClass();
            GoalMessage goalMessage2 = this.goal_;
            if (goalMessage2 == null || goalMessage2 == GoalMessage.getDefaultInstance()) {
                this.goal_ = goalMessage;
            } else {
                this.goal_ = GoalMessage.newBuilder(this.goal_).mergeFrom(goalMessage).buildPartial();
            }
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGolf(GolfMessage golfMessage) {
            golfMessage.getClass();
            GolfMessage golfMessage2 = this.golf_;
            if (golfMessage2 == null || golfMessage2 == GolfMessage.getDefaultInstance()) {
                this.golf_ = golfMessage;
            } else {
                this.golf_ = GolfMessage.newBuilder(this.golf_).mergeFrom(golfMessage).buildPartial();
            }
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeartRate(HeartRateMessage heartRateMessage) {
            heartRateMessage.getClass();
            HeartRateMessage heartRateMessage2 = this.heartRate_;
            if (heartRateMessage2 == null || heartRateMessage2 == HeartRateMessage.getDefaultInstance()) {
                this.heartRate_ = heartRateMessage;
            } else {
                this.heartRate_ = HeartRateMessage.newBuilder(this.heartRate_).mergeFrom(heartRateMessage).buildPartial();
            }
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHrZone(HeartrateZoneMessage heartrateZoneMessage) {
            heartrateZoneMessage.getClass();
            HeartrateZoneMessage heartrateZoneMessage2 = this.hrZone_;
            if (heartrateZoneMessage2 == null || heartrateZoneMessage2 == HeartrateZoneMessage.getDefaultInstance()) {
                this.hrZone_ = heartrateZoneMessage;
            } else {
                this.hrZone_ = HeartrateZoneMessage.newBuilder(this.hrZone_).mergeFrom(heartrateZoneMessage).buildPartial();
            }
            this.bitField0_ |= EventRecurrence.TH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNumber(NumberMessage numberMessage) {
            numberMessage.getClass();
            NumberMessage numberMessage2 = this.number_;
            if (numberMessage2 == null || numberMessage2 == NumberMessage.getDefaultInstance()) {
                this.number_ = numberMessage;
            } else {
                this.number_ = NumberMessage.newBuilder(this.number_).mergeFrom(numberMessage).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOther(OtherMessage otherMessage) {
            otherMessage.getClass();
            OtherMessage otherMessage2 = this.other_;
            if (otherMessage2 == null || otherMessage2 == OtherMessage.getDefaultInstance()) {
                this.other_ = otherMessage;
            } else {
                this.other_ = OtherMessage.newBuilder(this.other_).mergeFrom(otherMessage).buildPartial();
            }
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePace(PaceMessage paceMessage) {
            paceMessage.getClass();
            PaceMessage paceMessage2 = this.pace_;
            if (paceMessage2 == null || paceMessage2 == PaceMessage.getDefaultInstance()) {
                this.pace_ = paceMessage;
            } else {
                this.pace_ = PaceMessage.newBuilder(this.pace_).mergeFrom(paceMessage).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePower(PowerMessage powerMessage) {
            powerMessage.getClass();
            PowerMessage powerMessage2 = this.power_;
            if (powerMessage2 == null || powerMessage2 == PowerMessage.getDefaultInstance()) {
                this.power_ = powerMessage;
            } else {
                this.power_ = PowerMessage.newBuilder(this.power_).mergeFrom(powerMessage).buildPartial();
            }
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePressure(PressureMessage pressureMessage) {
            pressureMessage.getClass();
            PressureMessage pressureMessage2 = this.pressure_;
            if (pressureMessage2 == null || pressureMessage2 == PressureMessage.getDefaultInstance()) {
                this.pressure_ = pressureMessage;
            } else {
                this.pressure_ = PressureMessage.newBuilder(this.pressure_).mergeFrom(pressureMessage).buildPartial();
            }
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRecord(RecordMessage recordMessage) {
            recordMessage.getClass();
            RecordMessage recordMessage2 = this.record_;
            if (recordMessage2 == null || recordMessage2 == RecordMessage.getDefaultInstance()) {
                this.record_ = recordMessage;
            } else {
                this.record_ = RecordMessage.newBuilder(this.record_).mergeFrom(recordMessage).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRowing(RowingMessage rowingMessage) {
            rowingMessage.getClass();
            RowingMessage rowingMessage2 = this.rowing_;
            if (rowingMessage2 == null || rowingMessage2 == RowingMessage.getDefaultInstance()) {
                this.rowing_ = rowingMessage;
            } else {
                this.rowing_ = RowingMessage.newBuilder(this.rowing_).mergeFrom(rowingMessage).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlope(SlopeMessage slopeMessage) {
            slopeMessage.getClass();
            SlopeMessage slopeMessage2 = this.slope_;
            if (slopeMessage2 == null || slopeMessage2 == SlopeMessage.getDefaultInstance()) {
                this.slope_ = slopeMessage;
            } else {
                this.slope_ = SlopeMessage.newBuilder(this.slope_).mergeFrom(slopeMessage).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlopeChart(SlopeChartMessage slopeChartMessage) {
            slopeChartMessage.getClass();
            SlopeChartMessage slopeChartMessage2 = this.slopeChart_;
            if (slopeChartMessage2 == null || slopeChartMessage2 == SlopeChartMessage.getDefaultInstance()) {
                this.slopeChart_ = slopeChartMessage;
            } else {
                this.slopeChart_ = SlopeChartMessage.newBuilder(this.slopeChart_).mergeFrom(slopeChartMessage).buildPartial();
            }
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSteps(StepsMessage stepsMessage) {
            stepsMessage.getClass();
            StepsMessage stepsMessage2 = this.steps_;
            if (stepsMessage2 == null || stepsMessage2 == StepsMessage.getDefaultInstance()) {
                this.steps_ = stepsMessage;
            } else {
                this.steps_ = StepsMessage.newBuilder(this.steps_).mergeFrom(stepsMessage).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSwim(SwimMessage swimMessage) {
            swimMessage.getClass();
            SwimMessage swimMessage2 = this.swim_;
            if (swimMessage2 == null || swimMessage2 == SwimMessage.getDefaultInstance()) {
                this.swim_ = swimMessage;
            } else {
                this.swim_ = SwimMessage.newBuilder(this.swim_).mergeFrom(swimMessage).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSwing(SWingMessage sWingMessage) {
            sWingMessage.getClass();
            SWingMessage sWingMessage2 = this.swing_;
            if (sWingMessage2 == null || sWingMessage2 == SWingMessage.getDefaultInstance()) {
                this.swing_ = sWingMessage;
            } else {
                this.swing_ = SWingMessage.newBuilder(this.swing_).mergeFrom(sWingMessage).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemp(TempMessage tempMessage) {
            tempMessage.getClass();
            TempMessage tempMessage2 = this.temp_;
            if (tempMessage2 == null || tempMessage2 == TempMessage.getDefaultInstance()) {
                this.temp_ = tempMessage;
            } else {
                this.temp_ = TempMessage.newBuilder(this.temp_).mergeFrom(tempMessage).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimes(TimeMessage timeMessage) {
            timeMessage.getClass();
            TimeMessage timeMessage2 = this.times_;
            if (timeMessage2 == null || timeMessage2 == TimeMessage.getDefaultInstance()) {
                this.times_ = timeMessage;
            } else {
                this.times_ = TimeMessage.newBuilder(this.times_).mergeFrom(timeMessage).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeType(TypeMessage typeMessage) {
            typeMessage.getClass();
            TypeMessage typeMessage2 = this.type_;
            if (typeMessage2 == null || typeMessage2 == TypeMessage.getDefaultInstance()) {
                this.type_ = typeMessage;
            } else {
                this.type_ = TypeMessage.newBuilder(this.type_).mergeFrom(typeMessage).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportSummaryMessage parseDelimitedFrom(InputStream inputStream) {
            return (SportSummaryMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportSummaryMessage parseFrom(ByteBuffer byteBuffer) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SportSummaryMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMarathon(int i) {
            ensureMarathonIsMutable();
            this.marathon_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(AltitudeMessage altitudeMessage) {
            altitudeMessage.getClass();
            this.altitude_ = altitudeMessage;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalories(CaloriesMessage caloriesMessage) {
            caloriesMessage.getClass();
            this.calories_ = caloriesMessage;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistance(DistanceMessage distanceMessage) {
            distanceMessage.getClass();
            this.distance_ = distanceMessage;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownhill(DownhillMessage downhillMessage) {
            downhillMessage.getClass();
            this.downhill_ = downhillMessage;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloors(FloorsMessage floorsMessage) {
            floorsMessage.getClass();
            this.floors_ = floorsMessage;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrequency(FrequencyMessage frequencyMessage) {
            frequencyMessage.getClass();
            this.frequency_ = frequencyMessage;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoal(GoalMessage goalMessage) {
            goalMessage.getClass();
            this.goal_ = goalMessage;
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGolf(GolfMessage golfMessage) {
            golfMessage.getClass();
            this.golf_ = golfMessage;
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartRate(HeartRateMessage heartRateMessage) {
            heartRateMessage.getClass();
            this.heartRate_ = heartRateMessage;
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrZone(HeartrateZoneMessage heartrateZoneMessage) {
            heartrateZoneMessage.getClass();
            this.hrZone_ = heartrateZoneMessage;
            this.bitField0_ |= EventRecurrence.TH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMarathon(int i, MarathonMessage marathonMessage) {
            marathonMessage.getClass();
            ensureMarathonIsMutable();
            this.marathon_.set(i, marathonMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(NumberMessage numberMessage) {
            numberMessage.getClass();
            this.number_ = numberMessage;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOther(OtherMessage otherMessage) {
            otherMessage.getClass();
            this.other_ = otherMessage;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPace(PaceMessage paceMessage) {
            paceMessage.getClass();
            this.pace_ = paceMessage;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPower(PowerMessage powerMessage) {
            powerMessage.getClass();
            this.power_ = powerMessage;
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressure(PressureMessage pressureMessage) {
            pressureMessage.getClass();
            this.pressure_ = pressureMessage;
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecord(RecordMessage recordMessage) {
            recordMessage.getClass();
            this.record_ = recordMessage;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRowing(RowingMessage rowingMessage) {
            rowingMessage.getClass();
            this.rowing_ = rowingMessage;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlope(SlopeMessage slopeMessage) {
            slopeMessage.getClass();
            this.slope_ = slopeMessage;
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlopeChart(SlopeChartMessage slopeChartMessage) {
            slopeChartMessage.getClass();
            this.slopeChart_ = slopeChartMessage;
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSteps(StepsMessage stepsMessage) {
            stepsMessage.getClass();
            this.steps_ = stepsMessage;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwim(SwimMessage swimMessage) {
            swimMessage.getClass();
            this.swim_ = swimMessage;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwing(SWingMessage sWingMessage) {
            sWingMessage.getClass();
            this.swing_ = sWingMessage;
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemp(TempMessage tempMessage) {
            tempMessage.getClass();
            this.temp_ = tempMessage;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimes(TimeMessage timeMessage) {
            timeMessage.getClass();
            this.times_ = timeMessage;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(TypeMessage typeMessage) {
            typeMessage.getClass();
            this.type_ = typeMessage;
            this.bitField0_ |= 4;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SportSummaryMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001e\u001b\u0000\u0001\u0006\u0001ᔈ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ᐉ\u0014\u0017ဉ\u0015\u001aЛ\u001bဉ\u0016\u001cᐉ\u0017\u001dဉ\u0018\u001eဉ\u0019", new Object[]{"bitField0_", "version_", "record_", "type_", "distance_", "number_", "downhill_", "times_", "floors_", "swim_", "pace_", "steps_", "altitude_", "slope_", "swing_", "calories_", "rowing_", "frequency_", "heartRate_", "temp_", "other_", "hrZone_", "slopeChart_", "marathon_", MarathonMessage.class, "pressure_", "goal_", "golf_", "power_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SportSummaryMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SportSummaryMessage.class) {
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
        public MarathonMessage getMarathon(int i) {
            return this.marathon_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public int getMarathonCount() {
            return this.marathon_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public List<MarathonMessage> getMarathonList() {
            return this.marathon_;
        }

        public MarathonMessageOrBuilder getMarathonOrBuilder(int i) {
            return this.marathon_.get(i);
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
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
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
            return (this.bitField0_ & EventRecurrence.TH) != 0;
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

        public static Builder newBuilder(SportSummaryMessage sportSummaryMessage) {
            return DEFAULT_INSTANCE.createBuilder(sportSummaryMessage);
        }

        public static SportSummaryMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportSummaryMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SportSummaryMessage parseFrom(ByteString byteString) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMarathon(int i, MarathonMessage marathonMessage) {
            marathonMessage.getClass();
            ensureMarathonIsMutable();
            this.marathon_.add(i, marathonMessage);
        }

        public static SportSummaryMessage parseFrom(ByteString byteString, t tVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SportSummaryMessage parseFrom(byte[] bArr) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SportSummaryMessage parseFrom(byte[] bArr, t tVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SportSummaryMessage parseFrom(InputStream inputStream) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportSummaryMessage parseFrom(InputStream inputStream, t tVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportSummaryMessage parseFrom(j jVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SportSummaryMessage parseFrom(j jVar, t tVar) {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SportSummaryMessageOrBuilder extends bsf {
        AltitudeMessage getAltitude();

        CaloriesMessage getCalories();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        DistanceMessage getDistance();

        DownhillMessage getDownhill();

        FloorsMessage getFloors();

        FrequencyMessage getFrequency();

        GoalMessage getGoal();

        GolfMessage getGolf();

        HeartRateMessage getHeartRate();

        HeartrateZoneMessage getHrZone();

        MarathonMessage getMarathon(int i);

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class StepsMessage extends GeneratedMessageLite<StepsMessage, Builder> implements StepsMessageOrBuilder {
        public static final int AVERAGECADENCE_FIELD_NUMBER = 1;
        public static final int AVERAGESTRIDE_FIELD_NUMBER = 3;
        private static final StepsMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMCADENCE_FIELD_NUMBER = 2;
        private static volatile vkh<StepsMessage> PARSER = null;
        public static final int STEPS_FIELD_NUMBER = 4;
        private float averageCadence_;
        private int averageStride_;
        private int bitField0_;
        private float maximumCadence_;
        private int steps_;

        public static final class Builder extends GeneratedMessageLite.a<StepsMessage, Builder> implements StepsMessageOrBuilder {
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

            public Builder setAverageCadence(float f) {
                copyOnWrite();
                ((StepsMessage) this.instance).setAverageCadence(f);
                return this;
            }

            public Builder setAverageStride(int i) {
                copyOnWrite();
                ((StepsMessage) this.instance).setAverageStride(i);
                return this;
            }

            public Builder setMaximumCadence(float f) {
                copyOnWrite();
                ((StepsMessage) this.instance).setMaximumCadence(f);
                return this;
            }

            public Builder setSteps(int i) {
                copyOnWrite();
                ((StepsMessage) this.instance).setSteps(i);
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

        public static StepsMessage parseDelimitedFrom(InputStream inputStream) {
            return (StepsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StepsMessage parseFrom(ByteBuffer byteBuffer) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<StepsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageCadence(float f) {
            this.bitField0_ |= 1;
            this.averageCadence_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageStride(int i) {
            this.bitField0_ |= 4;
            this.averageStride_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumCadence(float f) {
            this.bitField0_ |= 2;
            this.maximumCadence_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSteps(int i) {
            this.bitField0_ |= 8;
            this.steps_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StepsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "averageCadence_", "maximumCadence_", "averageStride_", "steps_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<StepsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (StepsMessage.class) {
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

        public static Builder newBuilder(StepsMessage stepsMessage) {
            return DEFAULT_INSTANCE.createBuilder(stepsMessage);
        }

        public static StepsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (StepsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static StepsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static StepsMessage parseFrom(ByteString byteString) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StepsMessage parseFrom(ByteString byteString, t tVar) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static StepsMessage parseFrom(byte[] bArr) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StepsMessage parseFrom(byte[] bArr, t tVar) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static StepsMessage parseFrom(InputStream inputStream) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StepsMessage parseFrom(InputStream inputStream, t tVar) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static StepsMessage parseFrom(j jVar) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static StepsMessage parseFrom(j jVar, t tVar) {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface StepsMessageOrBuilder extends bsf {
        float getAverageCadence();

        int getAverageStride();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        float getMaximumCadence();

        int getSteps();

        boolean hasAverageCadence();

        boolean hasAverageStride();

        boolean hasMaximumCadence();

        boolean hasSteps();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SwimMessage extends GeneratedMessageLite<SwimMessage, Builder> implements SwimMessageOrBuilder {
        public static final int AVERAGEDISTANCEPERSTROKE_FIELD_NUMBER = 4;
        public static final int AVERAGESTROKERATE_FIELD_NUMBER = 6;
        private static final SwimMessage DEFAULT_INSTANCE;
        public static final int MAINSWIMMINGSTYLE_FIELD_NUMBER = 1;
        public static final int MAXIMUMSTROKERATE_FIELD_NUMBER = 7;
        private static volatile vkh<SwimMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<SwimMessage, Builder> implements SwimMessageOrBuilder {
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

            public Builder setAverageDistancePerStroke(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setAverageDistancePerStroke(i);
                return this;
            }

            public Builder setAverageStrokeRate(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setAverageStrokeRate(i);
                return this;
            }

            public Builder setMainSwimmingStyle(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setMainSwimmingStyle(i);
                return this;
            }

            public Builder setMaximumStrokeRate(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setMaximumStrokeRate(i);
                return this;
            }

            public Builder setPoolLength(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setPoolLength(i);
                return this;
            }

            public Builder setSwolf(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setSwolf(i);
                return this;
            }

            public Builder setTotalStrokes(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setTotalStrokes(i);
                return this;
            }

            public Builder setTrips(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setTrips(i);
                return this;
            }

            public Builder setUnit(int i) {
                copyOnWrite();
                ((SwimMessage) this.instance).setUnit(i);
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

        public static SwimMessage parseDelimitedFrom(InputStream inputStream) {
            return (SwimMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwimMessage parseFrom(ByteBuffer byteBuffer) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SwimMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageDistancePerStroke(int i) {
            this.bitField0_ |= 8;
            this.averageDistancePerStroke_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageStrokeRate(int i) {
            this.bitField0_ |= 32;
            this.averageStrokeRate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMainSwimmingStyle(int i) {
            this.bitField0_ |= 1;
            this.mainSwimmingStyle_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumStrokeRate(int i) {
            this.bitField0_ |= 64;
            this.maximumStrokeRate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolLength(int i) {
            this.bitField0_ |= 128;
            this.poolLength_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwolf(int i) {
            this.bitField0_ |= 16;
            this.swolf_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalStrokes(int i) {
            this.bitField0_ |= 4;
            this.totalStrokes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrips(int i) {
            this.bitField0_ |= 2;
            this.trips_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnit(int i) {
            this.bitField0_ |= 256;
            this.unit_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwimMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"bitField0_", "mainSwimmingStyle_", "trips_", "totalStrokes_", "averageDistancePerStroke_", "swolf_", "averageStrokeRate_", "maximumStrokeRate_", "poolLength_", "unit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SwimMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SwimMessage.class) {
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

        public static Builder newBuilder(SwimMessage swimMessage) {
            return DEFAULT_INSTANCE.createBuilder(swimMessage);
        }

        public static SwimMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SwimMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SwimMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SwimMessage parseFrom(ByteString byteString) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SwimMessage parseFrom(ByteString byteString, t tVar) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SwimMessage parseFrom(byte[] bArr) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwimMessage parseFrom(byte[] bArr, t tVar) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SwimMessage parseFrom(InputStream inputStream) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwimMessage parseFrom(InputStream inputStream, t tVar) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SwimMessage parseFrom(j jVar) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SwimMessage parseFrom(j jVar, t tVar) {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SwimMessageOrBuilder extends bsf {
        int getAverageDistancePerStroke();

        int getAverageStrokeRate();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class TempMessage extends GeneratedMessageLite<TempMessage, Builder> implements TempMessageOrBuilder {
        public static final int AVERAGETEMPERATURE_FIELD_NUMBER = 1;
        private static final TempMessage DEFAULT_INSTANCE;
        public static final int HIGHESTTEMPERATURE_FIELD_NUMBER = 2;
        public static final int LOWESTTEMPERATURE_FIELD_NUMBER = 3;
        private static volatile vkh<TempMessage> PARSER;
        private float averageTemperature_;
        private int bitField0_;
        private float highestTemperature_;
        private float lowestTemperature_;

        public static final class Builder extends GeneratedMessageLite.a<TempMessage, Builder> implements TempMessageOrBuilder {
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

            public Builder setAverageTemperature(float f) {
                copyOnWrite();
                ((TempMessage) this.instance).setAverageTemperature(f);
                return this;
            }

            public Builder setHighestTemperature(float f) {
                copyOnWrite();
                ((TempMessage) this.instance).setHighestTemperature(f);
                return this;
            }

            public Builder setLowestTemperature(float f) {
                copyOnWrite();
                ((TempMessage) this.instance).setLowestTemperature(f);
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

        public static TempMessage parseDelimitedFrom(InputStream inputStream) {
            return (TempMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TempMessage parseFrom(ByteBuffer byteBuffer) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TempMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageTemperature(float f) {
            this.bitField0_ |= 1;
            this.averageTemperature_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestTemperature(float f) {
            this.bitField0_ |= 2;
            this.highestTemperature_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowestTemperature(float f) {
            this.bitField0_ |= 4;
            this.lowestTemperature_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TempMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "averageTemperature_", "highestTemperature_", "lowestTemperature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TempMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TempMessage.class) {
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

        public static Builder newBuilder(TempMessage tempMessage) {
            return DEFAULT_INSTANCE.createBuilder(tempMessage);
        }

        public static TempMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TempMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TempMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TempMessage parseFrom(ByteString byteString) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TempMessage parseFrom(ByteString byteString, t tVar) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TempMessage parseFrom(byte[] bArr) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TempMessage parseFrom(byte[] bArr, t tVar) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TempMessage parseFrom(InputStream inputStream) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TempMessage parseFrom(InputStream inputStream, t tVar) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TempMessage parseFrom(j jVar) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TempMessage parseFrom(j jVar, t tVar) {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TempMessageOrBuilder extends bsf {
        float getAverageTemperature();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        float getHighestTemperature();

        float getLowestTemperature();

        boolean hasAverageTemperature();

        boolean hasHighestTemperature();

        boolean hasLowestTemperature();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class TimeMessage extends GeneratedMessageLite<TimeMessage, Builder> implements TimeMessageOrBuilder {
        public static final int CYCLINGTIME_FIELD_NUMBER = 6;
        private static final TimeMessage DEFAULT_INSTANCE;
        public static final int EXERCISETIME_FIELD_NUMBER = 2;
        private static volatile vkh<TimeMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<TimeMessage, Builder> implements TimeMessageOrBuilder {
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

            public Builder setCyclingTime(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setCyclingTime(i);
                return this;
            }

            public Builder setExerciseTime(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setExerciseTime(i);
                return this;
            }

            public Builder setPauseTime(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setPauseTime(i);
                return this;
            }

            public Builder setRestTimeBetweenGroups(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setRestTimeBetweenGroups(i);
                return this;
            }

            public Builder setRunningTime(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setRunningTime(i);
                return this;
            }

            public Builder setSwimmingTime(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setSwimmingTime(i);
                return this;
            }

            public Builder setSwitchTime1(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setSwitchTime1(i);
                return this;
            }

            public Builder setSwitchTime2(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setSwitchTime2(i);
                return this;
            }

            public Builder setTotalTime(int i) {
                copyOnWrite();
                ((TimeMessage) this.instance).setTotalTime(i);
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

        public static TimeMessage parseDelimitedFrom(InputStream inputStream) {
            return (TimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeMessage parseFrom(ByteBuffer byteBuffer) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TimeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCyclingTime(int i) {
            this.bitField0_ |= 32;
            this.cyclingTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseTime(int i) {
            this.bitField0_ |= 2;
            this.exerciseTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPauseTime(int i) {
            this.bitField0_ |= 4;
            this.pauseTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestTimeBetweenGroups(int i) {
            this.bitField0_ |= 8;
            this.restTimeBetweenGroups_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunningTime(int i) {
            this.bitField0_ |= 64;
            this.runningTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimmingTime(int i) {
            this.bitField0_ |= 16;
            this.swimmingTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitchTime1(int i) {
            this.bitField0_ |= 128;
            this.switchTime1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitchTime2(int i) {
            this.bitField0_ |= 256;
            this.switchTime2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalTime(int i) {
            this.bitField0_ |= 1;
            this.totalTime_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"bitField0_", "totalTime_", "exerciseTime_", "pauseTime_", "restTimeBetweenGroups_", "swimmingTime_", "cyclingTime_", "runningTime_", "switchTime1_", "switchTime2_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TimeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TimeMessage.class) {
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

        public static Builder newBuilder(TimeMessage timeMessage) {
            return DEFAULT_INSTANCE.createBuilder(timeMessage);
        }

        public static TimeMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TimeMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TimeMessage parseFrom(ByteString byteString) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimeMessage parseFrom(ByteString byteString, t tVar) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TimeMessage parseFrom(byte[] bArr) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeMessage parseFrom(byte[] bArr, t tVar) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TimeMessage parseFrom(InputStream inputStream) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeMessage parseFrom(InputStream inputStream, t tVar) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TimeMessage parseFrom(j jVar) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TimeMessage parseFrom(j jVar, t tVar) {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TimeMessageOrBuilder extends bsf {
        int getCyclingTime();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class TypeMessage extends GeneratedMessageLite<TypeMessage, Builder> implements TypeMessageOrBuilder {
        private static final TypeMessage DEFAULT_INSTANCE;
        private static volatile vkh<TypeMessage> PARSER = null;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int subtype_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.a<TypeMessage, Builder> implements TypeMessageOrBuilder {
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

            public Builder setSubtype(int i) {
                copyOnWrite();
                ((TypeMessage) this.instance).setSubtype(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TypeMessage) this.instance).setType(i);
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

        public static TypeMessage parseDelimitedFrom(InputStream inputStream) {
            return (TypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TypeMessage parseFrom(ByteBuffer byteBuffer) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TypeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtype(int i) {
            this.bitField0_ |= 2;
            this.subtype_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TypeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "type_", "subtype_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TypeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TypeMessage.class) {
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

        public static Builder newBuilder(TypeMessage typeMessage) {
            return DEFAULT_INSTANCE.createBuilder(typeMessage);
        }

        public static TypeMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TypeMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TypeMessage parseFrom(ByteString byteString) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TypeMessage parseFrom(ByteString byteString, t tVar) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TypeMessage parseFrom(byte[] bArr) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TypeMessage parseFrom(byte[] bArr, t tVar) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TypeMessage parseFrom(InputStream inputStream) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TypeMessage parseFrom(InputStream inputStream, t tVar) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TypeMessage parseFrom(j jVar) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TypeMessage parseFrom(j jVar, t tVar) {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TypeMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getSubtype();

        int getType();

        boolean hasSubtype();

        boolean hasType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private SportSummary2() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

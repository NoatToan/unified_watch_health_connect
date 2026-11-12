package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Counter;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.DownhillStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.FloorActivityStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.FrequencyStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateStatistics;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.IronManStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MarathonInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PowerStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RowingStatisticInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Slope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Spo2Statistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportAccumInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportPressureStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SwimInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.TemperatureStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApiV2Impl;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.AltNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.AltitudeCalibration;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.BaseNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.DiffGpsNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.EventNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.FixedLapNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.FullGpsNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.GolfGroupNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.GolfRtNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.HeartRateNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.LapNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PaceNode1;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PaceNode2;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PlaygroundNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.PressureNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.RtPowerNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.Spo2Node;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.StrengthGroupNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.TemperatureNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.TimeStampNode;
import com.xiaomi.hm.health.bt.proto.SportSummary2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\t\u001a\u00020\u0005*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\u001a\u0010\n\u001a\u00020\u0005*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000b\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u000b\u001a\u0016\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011\"\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0015\"1\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00180\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0016\u0010!\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 \"\u0016\u0010#\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0016\u0010%\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 \"\u0016\u0010'\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 \"\u0016\u0010)\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010 \"\u0016\u0010+\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010 \"\u0016\u0010-\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010 \"\u0016\u0010/\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010 \"\u0016\u00101\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010 \"\u0016\u00103\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010 ¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/bt/proto/SportSummary2$SportSummaryMessage;", "", "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "toSportSummary", "", "Lkotlin/Function0;", "", "action", "a", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtPaceInfo;", "lastPace", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "lastGpsPoint", "distanceUnit", "", "distance", "fixedLapIndex", "", "Ljava/lang/String;", "TAG", "", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "Ljava/util/Map;", "getParserMap", "()Ljava/util/Map;", "parserMap", "DISTANCE_UNIT_KM", LogUtil.I, "DISTANCE_UNIT_MILE", "c", "DEVICE_SPORT_MODE_DEFAULT", GoogleApiAvailabilityLight.a, "DEVICE_SPORT_MODE_AUTO", "e", "DEVICE_SPORT_MODE_INTERMITTENT", "f", "DEVICE_SPORT_MODE_COURSE", "g", "CLOUD_SPORT_MODE_DEFAULT", "h", "CLOUD_SPORT_MODE_INTERMITTENT", "i", "CLOUD_SPORT_MODE_COURSE", com.loc.z.j, "DEFAULT_GOLF_ANGLE", hl.k, "MILE_TO_M", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SportUtilsKt {
    public static final int DISTANCE_UNIT_KM = 0;
    public static final int DISTANCE_UNIT_MILE = 1;

    @NotNull
    private static final String a = "Sport800Utils";

    @NotNull
    private static final Map<Integer, Function1<byte[], BaseNode>> b = kotlin.collections.r.mapOf(TuplesKt.to(1, new k(TimeStampNode.INSTANCE)), TuplesKt.to(2, new l(FullGpsNode.INSTANCE)), TuplesKt.to(3, new m(DiffGpsNode.INSTANCE)), TuplesKt.to(4, new n(EventNode.INSTANCE)), TuplesKt.to(5, new o(PaceNode1.INSTANCE)), TuplesKt.to(6, new p(PaceNode2.INSTANCE)), TuplesKt.to(7, new q(AltNode.INSTANCE)), TuplesKt.to(8, new r(HeartRateNode.INSTANCE)), TuplesKt.to(9, new s(Spo2Node.INSTANCE)), TuplesKt.to(10, new a(FixedLapNode.INSTANCE)), TuplesKt.to(11, new b(LapNode.INSTANCE)), TuplesKt.to(12, new c(PressureNode.INSTANCE)), TuplesKt.to(13, new d(TemperatureNode.INSTANCE)), TuplesKt.to(14, new e(AltitudeCalibration.INSTANCE)), TuplesKt.to(15, new f(StrengthGroupNode.INSTANCE)), TuplesKt.to(16, new g(GolfGroupNode.INSTANCE)), TuplesKt.to(17, new h(GolfRtNode.INSTANCE)), TuplesKt.to(18, new i(RtPowerNode.INSTANCE)), TuplesKt.to(19, new j(PlaygroundNode.INSTANCE)));
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 4;
    private static final int g = 0;
    private static final int h = 4;
    private static final int i = 2;
    private static final int j = -51;
    private static final int k = 1609;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], FixedLapNode> {
        public a(FixedLapNode.Companion companion) {
            super(1, companion, FixedLapNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FixedLapNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FixedLapNode invoke(@NotNull byte[] bArr) {
            return ((FixedLapNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<Unit> {
        public static final a0 a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无频率信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setTargetType(this.b.getGoal().getType());
            this.a.setTargetValue((int) (((this.b.getGoal().getType() == 7 || this.b.getGoal().getType() == 8) ? 10 : 1) * this.b.getGoal().getData()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<byte[], LapNode> {
        public b(LapNode.Companion companion) {
            super(1, companion, LapNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LapNode invoke(@NotNull byte[] bArr) {
            return ((LapNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setFrequencyStatistic(new FrequencyStatistic(this.b.getFrequency().getAverageFrequency(), this.b.getFrequency().getHighestFrequency()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b1 extends Lambda implements Function0<Unit> {
        public static final b1 a = new b1();

        public b1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无压力数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<byte[], PressureNode> {
        public c(PressureNode.Companion companion) {
            super(1, companion, PressureNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PressureNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PressureNode invoke(@NotNull byte[] bArr) {
            return ((PressureNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<Unit> {
        public static final c0 a = new c0();

        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无心率区间");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.b.setPressure(new SportPressureStatistic(this.a.getPressure().getAveragePressure() > 100 ? -1 : this.a.getPressure().getAveragePressure(), this.a.getPressure().getMaximumPressure() <= 100 ? this.a.getPressure().getMaximumPressure() : -1, this.a.getPressure().getMinimumPressure() > 100 ? -1 : this.a.getPressure().getMinimumPressure()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<byte[], TemperatureNode> {
        public d(TemperatureNode.Companion companion) {
            super(1, companion, TemperatureNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/TemperatureNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TemperatureNode invoke(@NotNull byte[] bArr) {
            return ((TemperatureNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<Unit> {
        public static final d0 a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws SportSummaryParseException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws SportSummaryParseException {
            throw new SportSummaryParseException("No sport type");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a.getTemp().hasAverageTemperature() && this.a.getTemp().hasHighestTemperature() && this.a.getTemp().hasLowestTemperature()) {
                this.b.setTemperatureStatistic(new TemperatureStatistic(this.a.getTemp().getAverageTemperature(), this.a.getTemp().getHighestTemperature(), this.a.getTemp().getLowestTemperature()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<byte[], AltitudeCalibration> {
        public e(AltitudeCalibration.Companion companion) {
            super(1, companion, AltitudeCalibration.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/AltitudeCalibration;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AltitudeCalibration invoke(@NotNull byte[] bArr) {
            return ((AltitudeCalibration.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setHrZoneWrapperApi(new HrZoneWrapperApiV2Impl(this.b.getHrZone().getType() ^ 1, this.b.getHrZone().getHeartList(), this.b.getHrZone().getZoneList()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a.getSwing().hasTotalTimesOfSwing() && this.a.getSwing().hasTimesOfBackhandSwing() && this.a.getSwing().hasTimesOfForehandSwing() && this.a.getSwing().hasServeTimes()) {
                this.b.setSwingCnt(new int[]{this.a.getSwing().getTotalTimesOfSwing(), this.a.getSwing().getTimesOfForehandSwing(), this.a.getSwing().getTimesOfBackhandSwing(), this.a.getSwing().getServeTimes(), 0});
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1<byte[], StrengthGroupNode> {
        public f(StrengthGroupNode.Companion companion) {
            super(1, companion, StrengthGroupNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StrengthGroupNode invoke(@NotNull byte[] bArr) {
            return ((StrengthGroupNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<Unit> {
        public static final f0 a = new f0();

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无海拔数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setGolfStatistic(new GolfStatistic(this.b.getGolf().getTotalSwings(), this.b.getGolf().getAverageBeat(), this.b.getGolf().getAverageUpTime(), this.b.getGolf().getAverageDownTime(), this.b.getGolf().hasAverageAngle() ? this.b.getGolf().getAverageAngle() : SportUtilsKt.j, this.b.getGolf().getAverageScore()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1<byte[], GolfGroupNode> {
        public g(GolfGroupNode.Companion companion) {
            super(1, companion, GolfGroupNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfGroupNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GolfGroupNode invoke(@NotNull byte[] bArr) {
            return ((GolfGroupNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setMaxAltitude(this.b.getAltitude().getHighestAltitude() / 100.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setAvgAltitude(this.b.getAltitude().getAverageAltitude() / 100.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setMinAltitude(this.b.getAltitude().getLowestAltitude() / 100.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setClimbDistance(this.b.getAltitude().getTotalClimbDistance() / 100.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setAscendMeter(this.b.getAltitude().getElevationGain() / 100.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setDescendMeter(this.b.getAltitude().getElevationLoss() / 100.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SportUtilsKt.b(this.a.getAltitude().hasHighestAltitude(), new a(this.b, this.a));
            SportUtilsKt.b(this.a.getAltitude().hasAverageAltitude(), new b(this.b, this.a));
            SportUtilsKt.b(this.a.getAltitude().hasLowestAltitude(), new c(this.b, this.a));
            SportUtilsKt.b(this.a.getAltitude().hasTotalClimbDistance(), new d(this.b, this.a));
            SportUtilsKt.b(this.a.getAltitude().hasElevationGain(), new e(this.b, this.a));
            SportUtilsKt.b(this.a.getAltitude().hasElevationLoss(), new f(this.b, this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setPowerStatistic(new PowerStatistic(this.b.getPower().getMaximumPower(), this.b.getPower().getAveragePower(), this.b.getPower().getDeviceWork()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1<byte[], GolfRtNode> {
        public h(GolfRtNode.Companion companion) {
            super(1, companion, GolfRtNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfRtNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GolfRtNode invoke(@NotNull byte[] bArr) {
            return ((GolfRtNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<Unit> {
        public static final h0 a = new h0();

        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无卡路里");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h1 extends Lambda implements Function0<Unit> {
        public static final h1 a = new h1();

        public h1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无距离数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class i extends FunctionReferenceImpl implements Function1<byte[], RtPowerNode> {
        public i(RtPowerNode.Companion companion) {
            super(1, companion, RtPowerNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/RtPowerNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RtPowerNode invoke(@NotNull byte[] bArr) {
            return ((RtPowerNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getAccInfo().setSportCalories(this.b.getCalories().getCal());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setDistance(this.b.getDistance().getDistance());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SportUtilsKt.b(this.a.getDistance().hasDistance(), new a(this.b, this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class j extends FunctionReferenceImpl implements Function1<byte[], PlaygroundNode> {
        public j(PlaygroundNode.Companion companion) {
            super(1, companion, PlaygroundNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlaygroundNode invoke(@NotNull byte[] bArr) {
            return ((PlaygroundNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<Unit> {
        public static final j0 a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无计数数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j1 extends Lambda implements Function0<Unit> {
        public static final j1 a = new j1();

        public j1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "没有时间信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class k extends FunctionReferenceImpl implements Function1<byte[], TimeStampNode> {
        public k(TimeStampNode.Companion companion) {
            super(1, companion, TimeStampNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/TimeStampNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeStampNode invoke(@NotNull byte[] bArr) {
            return ((TimeStampNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setCounter(new Counter(this.b.getNumber().getTotalNumberOfJumps(), this.b.getNumber().hasTotalTimesOfRowing() ? this.b.getNumber().getTotalTimesOfRowing() : -1, this.b.getNumber().hasNumberOfBreak() ? this.b.getNumber().getNumberOfBreak() : -1));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SportSummary sportSummary = this.a;
                sportSummary.setEndTime(sportSummary.getStartTime() + ((long) (this.b.getTimes().getTotalTime() * 1000)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setActiveTime(this.b.getTimes().getExerciseTime());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setPauseTime(this.b.getTimes().getPauseTime());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getAccInfo().setRestTimeBetweenGroups(this.b.getTimes().getRestTimeBetweenGroups());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setIronManStatistic(new IronManStatistic(this.b.getTimes().getSwimmingTime(), this.b.getTimes().getCyclingTime(), this.b.getTimes().getRunningTime(), this.b.getTimes().getSwitchTime1(), this.b.getTimes().getSwitchTime2()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SportUtilsKt.b(this.a.getTimes().hasTotalTime(), new a(this.b, this.a));
            SportUtilsKt.b(this.a.getTimes().hasExerciseTime(), new b(this.b, this.a));
            SportUtilsKt.b(this.a.getTimes().hasPauseTime(), new c(this.b, this.a));
            SportUtilsKt.b(this.a.getTimes().hasRestTimeBetweenGroups(), new d(this.b, this.a));
            SportUtilsKt.b(this.a.getTimes().hasSwimmingTime() || this.a.getTimes().hasCyclingTime() || this.a.getTimes().hasRunningTime() || this.a.getTimes().hasSwitchTime1() || this.a.getTimes().hasSwitchTime2(), new e(this.b, this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class l extends FunctionReferenceImpl implements Function1<byte[], BaseNode> {
        public l(FullGpsNode.Companion companion) {
            super(1, companion, FullGpsNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseNode invoke(@NotNull byte[] bArr) {
            return ((FullGpsNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l0 extends Lambda implements Function0<Unit> {
        public static final l0 a = new l0();

        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无划船机信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l1 extends Lambda implements Function0<Unit> {
        public static final l1 a = new l1();

        public l1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "没有心率信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class m extends FunctionReferenceImpl implements Function1<byte[], DiffGpsNode> {
        public m(DiffGpsNode.Companion companion) {
            super(1, companion, DiffGpsNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/DiffGpsNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DiffGpsNode invoke(@NotNull byte[] bArr) {
            return ((DiffGpsNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setRowingStatisticInfo(new RowingStatisticInfo(this.b.getRowing().getAverageRowingFrequency(), this.b.getRowing().getHighestRowingFrequency(), this.b.getRowing().getAveragePullingTime(), this.b.getRowing().getAveragePaddleTime()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class n extends FunctionReferenceImpl implements Function1<byte[], EventNode> {
        public n(EventNode.Companion companion) {
            super(1, companion, EventNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/EventNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventNode invoke(@NotNull byte[] bArr) {
            return ((EventNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n0 extends Lambda implements Function0<Unit> {
        public static final n0 a = new n0();

        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无坡度统计信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class o extends FunctionReferenceImpl implements Function1<byte[], PaceNode1> {
        public o(PaceNode1.Companion companion) {
            super(1, companion, PaceNode1.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaceNode1 invoke(@NotNull byte[] bArr) {
            return ((PaceNode1.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setSportTypeValue(this.b.getType().getType());
            if (this.b.getType().getSubtype() == 1) {
                this.a.setAutoRecognition(true);
            }
            int subtype = this.b.getType().getSubtype();
            if (subtype == 2) {
                this.a.setSportMode(4);
            } else if (subtype != 4) {
                this.a.setSportMode(this.b.getType().getSubtype());
            } else {
                this.a.setSportMode(2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class p extends FunctionReferenceImpl implements Function1<byte[], PaceNode2> {
        public p(PaceNode2.Companion companion) {
            super(1, companion, PaceNode2.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode2;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaceNode2 invoke(@NotNull byte[] bArr) {
            return ((PaceNode2.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setSlope(new Slope(this.b.getSlope().getAverageSlope(), this.b.getSlope().getMaximumSlope()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class q extends FunctionReferenceImpl implements Function1<byte[], AltNode> {
        public q(AltNode.Companion companion) {
            super(1, companion, AltNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/AltNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AltNode invoke(@NotNull byte[] bArr) {
            return ((AltNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getSlopeChart().setUphillDistance(Integer.valueOf(this.b.getSlopeChart().getUphillDistance()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getSlopeChart().setDownhillDistance(Integer.valueOf(this.b.getSlopeChart().getDownhillDistance()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getSlopeChart().setUphillTime(Integer.valueOf(this.b.getSlopeChart().getUphillTime()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getSlopeChart().setDownhillTime(Integer.valueOf(this.b.getSlopeChart().getDownhillTime()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setSlopeChart(new SlopeChart(null, null, null, null, 15, null));
            SportUtilsKt.b(this.b.getSlopeChart().hasUphillDistance(), new a(this.a, this.b));
            SportUtilsKt.b(this.b.getSlopeChart().hasDownhillDistance(), new b(this.a, this.b));
            SportUtilsKt.b(this.b.getSlopeChart().hasUphillTime(), new c(this.a, this.b));
            SportUtilsKt.b(this.b.getSlopeChart().hasDownhillTime(), new d(this.a, this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class r extends FunctionReferenceImpl implements Function1<byte[], HeartRateNode> {
        public r(HeartRateNode.Companion companion) {
            super(1, companion, HeartRateNode.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/HeartRateNode;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeartRateNode invoke(@NotNull byte[] bArr) {
            return ((HeartRateNode.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r0 extends Lambda implements Function0<Unit> {
        public static final r0 a = new r0();

        public r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无游泳数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class s extends FunctionReferenceImpl implements Function1<byte[], Spo2Node> {
        public s(Spo2Node.Companion companion) {
            super(1, companion, Spo2Node.Companion.class, "parse", "parse([B)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/Spo2Node;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Spo2Node invoke(@NotNull byte[] bArr) {
            return ((Spo2Node.Companion) this.receiver).parse(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SwimStyleAdapter800Impl b;
            public final /* synthetic */ SportSummary2.SportSummaryMessage c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SwimInfo swimInfo, SwimStyleAdapter800Impl swimStyleAdapter800Impl, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = swimStyleAdapter800Impl;
                this.c = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setStkStyle(this.b.convertToAppDefine(this.c.getSwim().getMainSwimmingStyle()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SwimInfo swimInfo, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setTrips(this.b.getSwim().getTrips());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SwimInfo swimInfo, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setStrokes(this.b.getSwim().getTotalStrokes());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SwimInfo swimInfo, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setDistancePerStroke(this.b.getSwim().getAverageDistancePerStroke() / 100.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SwimInfo swimInfo, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setAvgSwolf(this.b.getSwim().getSwolf());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(SwimInfo swimInfo, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setAvgStrokeSpeed(this.b.getSwim().getAverageStrokeRate() / 60.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SwimInfo a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(SwimInfo swimInfo, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = swimInfo;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setMaxStrokeSpeed(this.b.getSwim().getMaximumStrokeRate() / 60.0f);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setSwimPoolLength(this.b.getSwim().getPoolLength());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setDistanceUnit(this.b.getSwim().getUnit());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SwimInfo swimInfo = new SwimInfo();
            SportUtilsKt.b(this.a.getSwim().hasMainSwimmingStyle(), new a(swimInfo, new SwimStyleAdapter800Impl(), this.a));
            SportUtilsKt.b(this.a.getSwim().hasTrips(), new b(swimInfo, this.a));
            SportUtilsKt.b(this.a.getSwim().hasTotalStrokes(), new c(swimInfo, this.a));
            SportUtilsKt.b(this.a.getSwim().hasAverageDistancePerStroke(), new d(swimInfo, this.a));
            SportUtilsKt.b(this.a.getSwim().hasSwolf(), new e(swimInfo, this.a));
            SportUtilsKt.b(this.a.getSwim().hasAverageStrokeRate(), new f(swimInfo, this.a));
            SportUtilsKt.b(this.a.getSwim().hasMaximumStrokeRate(), new g(swimInfo, this.a));
            SportUtilsKt.b(this.a.getSwim().hasPoolLength(), new h(this.b, this.a));
            SportUtilsKt.b(this.a.getSwim().hasUnit(), new i(this.b, this.a));
            this.b.setSwimInfo(swimInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setHeartRateStatistics(new HeartRateStatistics(this.b.getHeartRate().getAverageHeartRate(), this.b.getHeartRate().getMaximumHeartRate(), this.b.getHeartRate().getMinimumHeartRate()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t0 extends Lambda implements Function0<Unit> {
        public static final t0 a = new t0();

        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无滑降数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<Unit> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "没有其它信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setDownhillStatistic(new DownhillStatistic(this.b.getDownhill().getTimesOfDownhill(), this.b.getDownhill().getTotalDistanceOfDownhill(), this.b.getDownhill().getMaximumDownhillDrop(), this.b.getDownhill().getTotalDownhillDrop()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary2.SportSummaryMessage a;
        public final /* synthetic */ SportSummary b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setTe((int) (this.b.getOther().getAerobicTrainingEffect() * 10));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setAnaerobicTE((int) (this.b.getOther().getAnaerobicTrainingEffect() * 10));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setTrainLoad(this.b.getOther().getTrainingLoadOfThisActivity());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setVo2Max(this.b.getOther().getVO2Max());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setSpo2Statistic(new Spo2Statistic(this.b.getOther().getMaximumSpO2(), this.b.getOther().getMinimumSpO2()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(SportSummary2.SportSummaryMessage sportSummaryMessage, SportSummary sportSummary) {
            super(0);
            this.a = sportSummaryMessage;
            this.b = sportSummary;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SportUtilsKt.b(this.a.getOther().hasAerobicTrainingEffect(), new a(this.b, this.a));
            SportUtilsKt.b(this.a.getOther().hasAnaerobicTrainingEffect(), new b(this.b, this.a));
            SportUtilsKt.b(this.a.getOther().hasTrainingLoadOfThisActivity(), new c(this.b, this.a));
            SportUtilsKt.b(this.a.getOther().hasVO2Max(), new d(this.b, this.a));
            SportUtilsKt.b(this.a.getOther().hasMaximumSpO2() && this.a.getOther().hasMinimumSpO2(), new e(this.b, this.a));
            this.b.setTotalGroup(this.a.getOther().getTotalGroups());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v0 extends Lambda implements Function0<Unit> {
        public static final v0 a = new v0();

        public v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无上下楼数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<Unit> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "没有步态信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setFloorActivityStatistic(new FloorActivityStatistic(this.b.getFloors().getUpstairFloors(), this.b.getFloors().getDownstairFloors(), this.b.getFloors().getUpstairHeight(), this.b.getFloors().getDownstairHeight(), this.b.getFloors().getAverageFloorsClimbedPerMinute()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getAccInfo().setAvgCadence(this.b.getSteps().getAverageCadence());
            this.a.getAccInfo().setMaxCadence(this.b.getSteps().getMaximumCadence());
            this.a.getAccInfo().setAvgStride(this.b.getSteps().getAverageStride());
            this.a.getAccInfo().setStep(this.b.getSteps().getSteps());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x0 extends Lambda implements Function0<Unit> {
        public static final x0 a = new x0();

        public x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "无目标数据");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<Unit> {
        public static final y a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "没有配速信息");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y0 extends Lambda implements Function0<Unit> {
        public static final y0 a = new y0();

        public y0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(SportUtilsKt.a, "此运动没有运动记录");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getAccInfo().setMaxPace(this.b.getPace().getBestPace());
            this.a.getAccInfo().setAvgPace(this.b.getPace().getAveragePace());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z0 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SportSummary a;
        public final /* synthetic */ SportSummary2.SportSummaryMessage b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportSummary a;
            public final /* synthetic */ SportSummary2.SportSummaryMessage b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
                super(0);
                this.a = sportSummary;
                this.b = sportSummaryMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.setCourseTitle(this.b.getRecord().getCourseTitle());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(SportSummary sportSummary, SportSummary2.SportSummaryMessage sportSummaryMessage) {
            super(0);
            this.a = sportSummary;
            this.b = sportSummaryMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            long j = 1000;
            this.a.setStartTime(((long) this.b.getRecord().getTrackId()) * j);
            this.a.setParentStartTime(((long) this.b.getRecord().getParentId()) * j);
            this.a.setZone(this.b.getRecord().getZone());
            SportUtilsKt.b(this.b.getRecord().hasCourseTitle(), new a(this.a, this.b));
        }
    }

    private static final boolean a(boolean z2, Function0<Unit> function0) {
        if (!z2) {
            function0.invoke();
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(boolean z2, Function0<Unit> function0) {
        if (z2) {
            function0.invoke();
        }
        return z2;
    }

    public static final int fixedLapIndex(int i2, long j2) {
        if (i2 == 0) {
            return (int) (j2 / ((long) 1000));
        }
        if (i2 == 1) {
            return (int) (j2 / ((long) k));
        }
        return 0;
    }

    @NotNull
    public static final Map<Integer, Function1<byte[], BaseNode>> getParserMap() {
        return b;
    }

    @Nullable
    public static final GpsPoint lastGpsPoint(@NotNull SportDetail sportDetail) {
        if (sportDetail.getGpsPoints().isEmpty()) {
            return null;
        }
        return (GpsPoint) CollectionsKt.last((List) sportDetail.getGpsPoints());
    }

    @Nullable
    public static final RtPaceInfo lastPace(@NotNull SportDetail sportDetail) {
        if (sportDetail.getRtPaceInfos().isEmpty()) {
            return null;
        }
        return (RtPaceInfo) CollectionsKt.last((List) sportDetail.getRtPaceInfos());
    }

    @NotNull
    public static final SportSummary toSportSummary(@NotNull SportSummary2.SportSummaryMessage sportSummaryMessage, int i2) {
        SportSummary sportSummary = new SportSummary();
        sportSummary.setAccInfo(new SportAccumInfo());
        sportSummary.setVersion(i2);
        b(a(sportSummaryMessage.hasType(), d0.a), new o0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasRecord(), y0.a), new z0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasDistance(), h1.a), new i1(sportSummaryMessage, sportSummary));
        b(a(sportSummaryMessage.hasTimes(), j1.a), new k1(sportSummaryMessage, sportSummary));
        b(a(sportSummaryMessage.hasHeartRate(), l1.a), new t(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasOther(), u.a), new v(sportSummaryMessage, sportSummary));
        b(a(sportSummaryMessage.hasSteps(), w.a), new x(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasPace(), y.a), new z(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasFrequency(), a0.a), new b0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasHrZone(), c0.a), new e0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasAltitude(), f0.a), new g0(sportSummaryMessage, sportSummary));
        b(a(sportSummaryMessage.hasCalories(), h0.a), new i0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasNumber(), j0.a), new k0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasRowing(), l0.a), new m0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasSlope(), n0.a), new p0(sportSummary, sportSummaryMessage));
        b(sportSummaryMessage.hasSlopeChart(), new q0(sportSummary, sportSummaryMessage));
        List<SportSummary2.MarathonMessage> marathonList = sportSummaryMessage.getMarathonList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(marathonList, 10));
        for (SportSummary2.MarathonMessage marathonMessage : marathonList) {
            MarathonInfo marathonInfo = new MarathonInfo(marathonMessage.getType());
            marathonInfo.setDistance(marathonMessage.getDistance());
            marathonInfo.setTimeUsage(marathonMessage.getTimeUsage());
            arrayList.add(marathonInfo);
        }
        sportSummary.setMarathonInfo(arrayList);
        b(a(sportSummaryMessage.hasSwim(), r0.a), new s0(sportSummaryMessage, sportSummary));
        b(a(sportSummaryMessage.hasDownhill(), t0.a), new u0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasFloors(), v0.a), new w0(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasGoal(), x0.a), new a1(sportSummary, sportSummaryMessage));
        b(a(sportSummaryMessage.hasPressure(), b1.a), new c1(sportSummaryMessage, sportSummary));
        b(sportSummaryMessage.hasTemp(), new d1(sportSummaryMessage, sportSummary));
        b(sportSummaryMessage.hasSwing(), new e1(sportSummaryMessage, sportSummary));
        b(sportSummaryMessage.hasGolf(), new f1(sportSummary, sportSummaryMessage));
        b(sportSummaryMessage.hasPower(), new g1(sportSummary, sportSummaryMessage));
        Debug.fi(a, sportSummary.toString());
        return sportSummary;
    }
}

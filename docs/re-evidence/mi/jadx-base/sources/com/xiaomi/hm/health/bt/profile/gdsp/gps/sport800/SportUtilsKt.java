package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

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
import defpackage.t5t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002\u001a\f\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020 \u001a\f\u0010!\u001a\u0004\u0018\u00010\"*\u00020 \u001a\u0012\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001\u001a\u001a\u0010'\u001a\u00020\u001a*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\")\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"CLOUD_SPORT_MODE_COURSE", "", "CLOUD_SPORT_MODE_DEFAULT", "CLOUD_SPORT_MODE_INTERMITTENT", "DEFAULT_GOLF_ANGLE", "DEVICE_SPORT_MODE_AUTO", "DEVICE_SPORT_MODE_COURSE", "DEVICE_SPORT_MODE_DEFAULT", "DEVICE_SPORT_MODE_INTERMITTENT", "DISTANCE_UNIT_KM", "DISTANCE_UNIT_MILE", "MILE_TO_M", "TAG", "", "parserMap", "", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "getParserMap", "()Ljava/util/Map;", "fixedLapIndex", "distanceUnit", "distance", "", "falseAction", "", "action", "Lkotlin/Function0;", "", "lastGpsPoint", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "lastPace", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtPaceInfo;", "toSportSummary", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "Lcom/xiaomi/hm/health/bt/proto/SportSummary2$SportSummaryMessage;", "version", "trueAction", "bluetooth_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SportUtilsKt {
    private static final int CLOUD_SPORT_MODE_COURSE = 2;
    private static final int CLOUD_SPORT_MODE_DEFAULT = 0;
    private static final int CLOUD_SPORT_MODE_INTERMITTENT = 4;
    private static final int DEFAULT_GOLF_ANGLE = -51;
    private static final int DEVICE_SPORT_MODE_AUTO = 1;
    private static final int DEVICE_SPORT_MODE_COURSE = 4;
    private static final int DEVICE_SPORT_MODE_DEFAULT = 0;
    private static final int DEVICE_SPORT_MODE_INTERMITTENT = 2;
    public static final int DISTANCE_UNIT_KM = 0;
    public static final int DISTANCE_UNIT_MILE = 1;
    private static final int MILE_TO_M = 1609;

    @NotNull
    private static final String TAG = "Sport800Utils";

    @NotNull
    private static final Map<Integer, Function1<byte[], BaseNode>> parserMap = MapsKt__MapsKt.mapOf(TuplesKt.to(1, new SportUtilsKt$parserMap$1(TimeStampNode.INSTANCE)), TuplesKt.to(2, new SportUtilsKt$parserMap$2(FullGpsNode.INSTANCE)), TuplesKt.to(3, new SportUtilsKt$parserMap$3(DiffGpsNode.INSTANCE)), TuplesKt.to(4, new SportUtilsKt$parserMap$4(EventNode.INSTANCE)), TuplesKt.to(5, new SportUtilsKt$parserMap$5(PaceNode1.INSTANCE)), TuplesKt.to(6, new SportUtilsKt$parserMap$6(PaceNode2.INSTANCE)), TuplesKt.to(7, new SportUtilsKt$parserMap$7(AltNode.INSTANCE)), TuplesKt.to(8, new SportUtilsKt$parserMap$8(HeartRateNode.INSTANCE)), TuplesKt.to(9, new SportUtilsKt$parserMap$9(Spo2Node.INSTANCE)), TuplesKt.to(10, new SportUtilsKt$parserMap$10(FixedLapNode.INSTANCE)), TuplesKt.to(11, new SportUtilsKt$parserMap$11(LapNode.INSTANCE)), TuplesKt.to(12, new SportUtilsKt$parserMap$12(PressureNode.INSTANCE)), TuplesKt.to(13, new SportUtilsKt$parserMap$13(TemperatureNode.INSTANCE)), TuplesKt.to(14, new SportUtilsKt$parserMap$14(AltitudeCalibration.INSTANCE)), TuplesKt.to(15, new SportUtilsKt$parserMap$15(StrengthGroupNode.INSTANCE)), TuplesKt.to(16, new SportUtilsKt$parserMap$16(GolfGroupNode.INSTANCE)), TuplesKt.to(17, new SportUtilsKt$parserMap$17(GolfRtNode.INSTANCE)), TuplesKt.to(18, new SportUtilsKt$parserMap$18(RtPowerNode.INSTANCE)), TuplesKt.to(19, new SportUtilsKt$parserMap$19(PlaygroundNode.INSTANCE)));

    private static final boolean falseAction(boolean z, Function0<Unit> function0) {
        if (!z) {
            function0.invoke();
        }
        return z;
    }

    public static final int fixedLapIndex(int i, long j) {
        if (i == 0) {
            return (int) (j / ((long) 1000));
        }
        if (i == 1) {
            return (int) (j / ((long) MILE_TO_M));
        }
        return 0;
    }

    @NotNull
    public static final Map<Integer, Function1<byte[], BaseNode>> getParserMap() {
        return parserMap;
    }

    @Nullable
    public static final GpsPoint lastGpsPoint(@NotNull SportDetail sportDetail) {
        Intrinsics.checkNotNullParameter(sportDetail, "<this>");
        if (sportDetail.getGpsPoints().isEmpty()) {
            return null;
        }
        ArrayList<GpsPoint> gpsPoints = sportDetail.getGpsPoints();
        Intrinsics.checkNotNullExpressionValue(gpsPoints, "gpsPoints");
        return (GpsPoint) CollectionsKt___CollectionsKt.last((List) gpsPoints);
    }

    @Nullable
    public static final RtPaceInfo lastPace(@NotNull SportDetail sportDetail) {
        Intrinsics.checkNotNullParameter(sportDetail, "<this>");
        if (sportDetail.getRtPaceInfos().isEmpty()) {
            return null;
        }
        ArrayList<RtPaceInfo> rtPaceInfos = sportDetail.getRtPaceInfos();
        Intrinsics.checkNotNullExpressionValue(rtPaceInfos, "rtPaceInfos");
        return (RtPaceInfo) CollectionsKt___CollectionsKt.last((List) rtPaceInfos);
    }

    @NotNull
    public static final SportSummary toSportSummary(@NotNull final SportSummary2.SportSummaryMessage sportSummaryMessage, int i) {
        Intrinsics.checkNotNullParameter(sportSummaryMessage, "<this>");
        final SportSummary sportSummary = new SportSummary();
        sportSummary.setAccInfo(new SportAccumInfo());
        sportSummary.setVersion(i);
        trueAction(falseAction(sportSummaryMessage.hasType(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws SportSummaryParseException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws SportSummaryParseException {
                throw new SportSummaryParseException("No sport type");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setSportTypeValue(sportSummaryMessage.getType().getType());
                if (sportSummaryMessage.getType().getSubtype() == 1) {
                    sportSummary.setAutoRecognition(true);
                }
                int subtype = sportSummaryMessage.getType().getSubtype();
                if (subtype != 1) {
                    if (subtype == 2) {
                        sportSummary.setSportMode(4);
                    } else if (subtype != 4) {
                        sportSummary.setSportMode(sportSummaryMessage.getType().getSubtype());
                    } else {
                        sportSummary.setSportMode(2);
                    }
                }
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasRecord(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.3
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "此运动没有运动记录");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long j = 1000;
                sportSummary.setStartTime(((long) sportSummaryMessage.getRecord().getTrackId()) * j);
                sportSummary.setParentStartTime(((long) sportSummaryMessage.getRecord().getParentId()) * j);
                sportSummary.setZone(sportSummaryMessage.getRecord().getZone());
                boolean zHasCourseTitle = sportSummaryMessage.getRecord().hasCourseTitle();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasCourseTitle, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary2.setCourseTitle(sportSummaryMessage2.getRecord().getCourseTitle());
                    }
                });
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasDistance(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.5
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无距离数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean zHasDistance = sportSummaryMessage.getDistance().hasDistance();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasDistance, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.6.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary2.getAccInfo().setDistance(sportSummaryMessage2.getDistance().getDistance());
                    }
                });
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasTimes(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.7
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "没有时间信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean zHasTotalTime = sportSummaryMessage.getTimes().hasTotalTime();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasTotalTime, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.8.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SportSummary sportSummary3 = sportSummary2;
                        sportSummary3.setEndTime(sportSummary3.getStartTime() + ((long) (sportSummaryMessage2.getTimes().getTotalTime() * 1000)));
                    }
                });
                boolean zHasExerciseTime = sportSummaryMessage.getTimes().hasExerciseTime();
                final SportSummary sportSummary3 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage3 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasExerciseTime, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.8.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary3.getAccInfo().setActiveTime(sportSummaryMessage3.getTimes().getExerciseTime());
                    }
                });
                boolean zHasPauseTime = sportSummaryMessage.getTimes().hasPauseTime();
                final SportSummary sportSummary4 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage4 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasPauseTime, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.8.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary4.getAccInfo().setPauseTime(sportSummaryMessage4.getTimes().getPauseTime());
                    }
                });
                boolean zHasRestTimeBetweenGroups = sportSummaryMessage.getTimes().hasRestTimeBetweenGroups();
                final SportSummary sportSummary5 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage5 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasRestTimeBetweenGroups, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.8.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary5.getAccInfo().setRestTimeBetweenGroups(sportSummaryMessage5.getTimes().getRestTimeBetweenGroups());
                    }
                });
                boolean z = sportSummaryMessage.getTimes().hasSwimmingTime() || sportSummaryMessage.getTimes().hasCyclingTime() || sportSummaryMessage.getTimes().hasRunningTime() || sportSummaryMessage.getTimes().hasSwitchTime1() || sportSummaryMessage.getTimes().hasSwitchTime2();
                final SportSummary sportSummary6 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage6 = sportSummaryMessage;
                SportUtilsKt.trueAction(z, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.8.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary6.setIronManStatistic(new IronManStatistic(sportSummaryMessage6.getTimes().getSwimmingTime(), sportSummaryMessage6.getTimes().getCyclingTime(), sportSummaryMessage6.getTimes().getRunningTime(), sportSummaryMessage6.getTimes().getSwitchTime1(), sportSummaryMessage6.getTimes().getSwitchTime2()));
                    }
                });
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasHeartRate(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.9
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "没有心率信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setHeartRateStatistics(new HeartRateStatistics(sportSummaryMessage.getHeartRate().getAverageHeartRate(), sportSummaryMessage.getHeartRate().getMaximumHeartRate(), sportSummaryMessage.getHeartRate().getMinimumHeartRate()));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasOther(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.11
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "没有其它信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean zHasAerobicTrainingEffect = sportSummaryMessage.getOther().hasAerobicTrainingEffect();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasAerobicTrainingEffect, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.12.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary2.setTe((int) (sportSummaryMessage2.getOther().getAerobicTrainingEffect() * 10));
                    }
                });
                boolean zHasAnaerobicTrainingEffect = sportSummaryMessage.getOther().hasAnaerobicTrainingEffect();
                final SportSummary sportSummary3 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage3 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasAnaerobicTrainingEffect, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.12.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary3.setAnaerobicTE((int) (sportSummaryMessage3.getOther().getAnaerobicTrainingEffect() * 10));
                    }
                });
                boolean zHasTrainingLoadOfThisActivity = sportSummaryMessage.getOther().hasTrainingLoadOfThisActivity();
                final SportSummary sportSummary4 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage4 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasTrainingLoadOfThisActivity, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.12.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary4.setTrainLoad(sportSummaryMessage4.getOther().getTrainingLoadOfThisActivity());
                    }
                });
                boolean zHasVO2Max = sportSummaryMessage.getOther().hasVO2Max();
                final SportSummary sportSummary5 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage5 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasVO2Max, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.12.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary5.setVo2Max(sportSummaryMessage5.getOther().getVO2Max());
                    }
                });
                boolean z = sportSummaryMessage.getOther().hasMaximumSpO2() && sportSummaryMessage.getOther().hasMinimumSpO2();
                final SportSummary sportSummary6 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage6 = sportSummaryMessage;
                SportUtilsKt.trueAction(z, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.12.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary6.setSpo2Statistic(new Spo2Statistic(sportSummaryMessage6.getOther().getMaximumSpO2(), sportSummaryMessage6.getOther().getMinimumSpO2()));
                    }
                });
                sportSummary.setTotalGroup(sportSummaryMessage.getOther().getTotalGroups());
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasSteps(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.13
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "没有步态信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.getAccInfo().setAvgCadence(sportSummaryMessage.getSteps().getAverageCadence());
                sportSummary.getAccInfo().setMaxCadence(sportSummaryMessage.getSteps().getMaximumCadence());
                sportSummary.getAccInfo().setAvgStride(sportSummaryMessage.getSteps().getAverageStride());
                sportSummary.getAccInfo().setStep(sportSummaryMessage.getSteps().getSteps());
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasPace(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.15
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "没有配速信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.getAccInfo().setMaxPace(sportSummaryMessage.getPace().getBestPace());
                sportSummary.getAccInfo().setAvgPace(sportSummaryMessage.getPace().getAveragePace());
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasFrequency(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.17
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无频率信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.18
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setFrequencyStatistic(new FrequencyStatistic(sportSummaryMessage.getFrequency().getAverageFrequency(), sportSummaryMessage.getFrequency().getHighestFrequency()));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasHrZone(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.19
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无心率区间");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.20
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SportSummary sportSummary2 = sportSummary;
                int type = sportSummaryMessage.getHrZone().getType() ^ 1;
                List<Integer> heartList = sportSummaryMessage.getHrZone().getHeartList();
                Intrinsics.checkNotNullExpressionValue(heartList, "hrZone.heartList");
                List<Integer> zoneList = sportSummaryMessage.getHrZone().getZoneList();
                Intrinsics.checkNotNullExpressionValue(zoneList, "hrZone.zoneList");
                sportSummary2.setHrZoneWrapperApi(new HrZoneWrapperApiV2Impl(type, heartList, zoneList));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasAltitude(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.21
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无海拔数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean zHasHighestAltitude = sportSummaryMessage.getAltitude().hasHighestAltitude();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasHighestAltitude, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary2.getAccInfo().setMaxAltitude(sportSummaryMessage2.getAltitude().getHighestAltitude() / 100.0f);
                    }
                });
                boolean zHasAverageAltitude = sportSummaryMessage.getAltitude().hasAverageAltitude();
                final SportSummary sportSummary3 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage3 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasAverageAltitude, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary3.getAccInfo().setAvgAltitude(sportSummaryMessage3.getAltitude().getAverageAltitude() / 100.0f);
                    }
                });
                boolean zHasLowestAltitude = sportSummaryMessage.getAltitude().hasLowestAltitude();
                final SportSummary sportSummary4 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage4 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasLowestAltitude, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary4.getAccInfo().setMinAltitude(sportSummaryMessage4.getAltitude().getLowestAltitude() / 100.0f);
                    }
                });
                boolean zHasTotalClimbDistance = sportSummaryMessage.getAltitude().hasTotalClimbDistance();
                final SportSummary sportSummary5 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage5 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasTotalClimbDistance, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary5.getAccInfo().setClimbDistance(sportSummaryMessage5.getAltitude().getTotalClimbDistance() / 100.0f);
                    }
                });
                boolean zHasElevationGain = sportSummaryMessage.getAltitude().hasElevationGain();
                final SportSummary sportSummary6 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage6 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasElevationGain, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary6.getAccInfo().setAscendMeter(sportSummaryMessage6.getAltitude().getElevationGain() / 100.0f);
                    }
                });
                boolean zHasElevationLoss = sportSummaryMessage.getAltitude().hasElevationLoss();
                final SportSummary sportSummary7 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage7 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasElevationLoss, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.22.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary7.getAccInfo().setDescendMeter(sportSummaryMessage7.getAltitude().getElevationLoss() / 100.0f);
                    }
                });
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasCalories(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.23
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无卡路里");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.getAccInfo().setSportCalories(sportSummaryMessage.getCalories().getCal());
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasNumber(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.25
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无计数数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setCounter(new Counter(sportSummaryMessage.getNumber().getTotalNumberOfJumps(), sportSummaryMessage.getNumber().hasTotalTimesOfRowing() ? sportSummaryMessage.getNumber().getTotalTimesOfRowing() : -1, sportSummaryMessage.getNumber().hasNumberOfBreak() ? sportSummaryMessage.getNumber().getNumberOfBreak() : -1));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasRowing(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.27
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无划船机信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.28
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setRowingStatisticInfo(new RowingStatisticInfo(sportSummaryMessage.getRowing().getAverageRowingFrequency(), sportSummaryMessage.getRowing().getHighestRowingFrequency(), sportSummaryMessage.getRowing().getAveragePullingTime(), sportSummaryMessage.getRowing().getAveragePaddleTime()));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasSlope(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.29
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无坡度统计信息");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.30
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setSlope(new Slope(sportSummaryMessage.getSlope().getAverageSlope(), sportSummaryMessage.getSlope().getMaximumSlope()));
            }
        });
        trueAction(sportSummaryMessage.hasSlopeChart(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setSlopeChart(new SlopeChart(null, null, null, null, 15, null));
                boolean zHasUphillDistance = sportSummaryMessage.getSlopeChart().hasUphillDistance();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasUphillDistance, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.31.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary2.getSlopeChart().setUphillDistance(Integer.valueOf(sportSummaryMessage2.getSlopeChart().getUphillDistance()));
                    }
                });
                boolean zHasDownhillDistance = sportSummaryMessage.getSlopeChart().hasDownhillDistance();
                final SportSummary sportSummary3 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage3 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasDownhillDistance, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.31.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary3.getSlopeChart().setDownhillDistance(Integer.valueOf(sportSummaryMessage3.getSlopeChart().getDownhillDistance()));
                    }
                });
                boolean zHasUphillTime = sportSummaryMessage.getSlopeChart().hasUphillTime();
                final SportSummary sportSummary4 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage4 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasUphillTime, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.31.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary4.getSlopeChart().setUphillTime(Integer.valueOf(sportSummaryMessage4.getSlopeChart().getUphillTime()));
                    }
                });
                boolean zHasDownhillTime = sportSummaryMessage.getSlopeChart().hasDownhillTime();
                final SportSummary sportSummary5 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage5 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasDownhillTime, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.31.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary5.getSlopeChart().setDownhillTime(Integer.valueOf(sportSummaryMessage5.getSlopeChart().getDownhillTime()));
                    }
                });
            }
        });
        List<SportSummary2.MarathonMessage> marathonList = sportSummaryMessage.getMarathonList();
        Intrinsics.checkNotNullExpressionValue(marathonList, "marathonList");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(marathonList, 10));
        for (SportSummary2.MarathonMessage marathonMessage : marathonList) {
            MarathonInfo marathonInfo = new MarathonInfo(marathonMessage.getType());
            marathonInfo.setDistance(marathonMessage.getDistance());
            marathonInfo.setTimeUsage(marathonMessage.getTimeUsage());
            arrayList.add(marathonInfo);
        }
        sportSummary.setMarathonInfo(arrayList);
        trueAction(falseAction(sportSummaryMessage.hasSwim(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.33
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无游泳数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final SwimInfo swimInfo = new SwimInfo();
                final SwimStyleAdapter800Impl swimStyleAdapter800Impl = new SwimStyleAdapter800Impl();
                boolean zHasMainSwimmingStyle = sportSummaryMessage.getSwim().hasMainSwimmingStyle();
                final SportSummary2.SportSummaryMessage sportSummaryMessage2 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasMainSwimmingStyle, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setStkStyle(swimStyleAdapter800Impl.convertToAppDefine(sportSummaryMessage2.getSwim().getMainSwimmingStyle()));
                    }
                });
                boolean zHasTrips = sportSummaryMessage.getSwim().hasTrips();
                final SportSummary2.SportSummaryMessage sportSummaryMessage3 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasTrips, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setTrips(sportSummaryMessage3.getSwim().getTrips());
                    }
                });
                boolean zHasTotalStrokes = sportSummaryMessage.getSwim().hasTotalStrokes();
                final SportSummary2.SportSummaryMessage sportSummaryMessage4 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasTotalStrokes, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setStrokes(sportSummaryMessage4.getSwim().getTotalStrokes());
                    }
                });
                boolean zHasAverageDistancePerStroke = sportSummaryMessage.getSwim().hasAverageDistancePerStroke();
                final SportSummary2.SportSummaryMessage sportSummaryMessage5 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasAverageDistancePerStroke, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setDistancePerStroke(sportSummaryMessage5.getSwim().getAverageDistancePerStroke() / 100.0f);
                    }
                });
                boolean zHasSwolf = sportSummaryMessage.getSwim().hasSwolf();
                final SportSummary2.SportSummaryMessage sportSummaryMessage6 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasSwolf, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setAvgSwolf(sportSummaryMessage6.getSwim().getSwolf());
                    }
                });
                boolean zHasAverageStrokeRate = sportSummaryMessage.getSwim().hasAverageStrokeRate();
                final SportSummary2.SportSummaryMessage sportSummaryMessage7 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasAverageStrokeRate, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setAvgStrokeSpeed(sportSummaryMessage7.getSwim().getAverageStrokeRate() / 60.0f);
                    }
                });
                boolean zHasMaximumStrokeRate = sportSummaryMessage.getSwim().hasMaximumStrokeRate();
                final SportSummary2.SportSummaryMessage sportSummaryMessage8 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasMaximumStrokeRate, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        swimInfo.setMaxStrokeSpeed(sportSummaryMessage8.getSwim().getMaximumStrokeRate() / 60.0f);
                    }
                });
                boolean zHasPoolLength = sportSummaryMessage.getSwim().hasPoolLength();
                final SportSummary sportSummary2 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage9 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasPoolLength, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary2.setSwimPoolLength(sportSummaryMessage9.getSwim().getPoolLength());
                    }
                });
                boolean zHasUnit = sportSummaryMessage.getSwim().hasUnit();
                final SportSummary sportSummary3 = sportSummary;
                final SportSummary2.SportSummaryMessage sportSummaryMessage10 = sportSummaryMessage;
                SportUtilsKt.trueAction(zHasUnit, new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.34.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sportSummary3.setDistanceUnit(sportSummaryMessage10.getSwim().getUnit());
                    }
                });
                sportSummary.setSwimInfo(swimInfo);
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasDownhill(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.35
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无滑降数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.36
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setDownhillStatistic(new DownhillStatistic(sportSummaryMessage.getDownhill().getTimesOfDownhill(), sportSummaryMessage.getDownhill().getTotalDistanceOfDownhill(), sportSummaryMessage.getDownhill().getMaximumDownhillDrop(), sportSummaryMessage.getDownhill().getTotalDownhillDrop()));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasFloors(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.37
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无上下楼数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setFloorActivityStatistic(new FloorActivityStatistic(sportSummaryMessage.getFloors().getUpstairFloors(), sportSummaryMessage.getFloors().getDownstairFloors(), sportSummaryMessage.getFloors().getUpstairHeight(), sportSummaryMessage.getFloors().getDownstairHeight(), sportSummaryMessage.getFloors().getAverageFloorsClimbedPerMinute()));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasGoal(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.39
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无目标数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setTargetType(sportSummaryMessage.getGoal().getType());
                sportSummary.setTargetValue((int) (((sportSummaryMessage.getGoal().getType() == 7 || sportSummaryMessage.getGoal().getType() == 8) ? 10 : 1) * sportSummaryMessage.getGoal().getData()));
            }
        });
        trueAction(falseAction(sportSummaryMessage.hasPressure(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.41
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t5t.d(SportUtilsKt.TAG, "无压力数据");
            }
        }), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.42
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setPressure(new SportPressureStatistic(sportSummaryMessage.getPressure().getAveragePressure() > 100 ? -1 : sportSummaryMessage.getPressure().getAveragePressure(), sportSummaryMessage.getPressure().getMaximumPressure() <= 100 ? sportSummaryMessage.getPressure().getMaximumPressure() : -1, sportSummaryMessage.getPressure().getMinimumPressure() > 100 ? -1 : sportSummaryMessage.getPressure().getMinimumPressure()));
            }
        });
        trueAction(sportSummaryMessage.hasTemp(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.43
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (sportSummaryMessage.getTemp().hasAverageTemperature() && sportSummaryMessage.getTemp().hasHighestTemperature() && sportSummaryMessage.getTemp().hasLowestTemperature()) {
                    sportSummary.setTemperatureStatistic(new TemperatureStatistic(sportSummaryMessage.getTemp().getAverageTemperature(), sportSummaryMessage.getTemp().getHighestTemperature(), sportSummaryMessage.getTemp().getLowestTemperature()));
                }
            }
        });
        trueAction(sportSummaryMessage.hasSwing(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.44
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (sportSummaryMessage.getSwing().hasTotalTimesOfSwing() && sportSummaryMessage.getSwing().hasTimesOfBackhandSwing() && sportSummaryMessage.getSwing().hasTimesOfForehandSwing() && sportSummaryMessage.getSwing().hasServeTimes()) {
                    sportSummary.setSwingCnt(new int[]{sportSummaryMessage.getSwing().getTotalTimesOfSwing(), sportSummaryMessage.getSwing().getTimesOfForehandSwing(), sportSummaryMessage.getSwing().getTimesOfBackhandSwing(), sportSummaryMessage.getSwing().getServeTimes(), 0});
                }
            }
        });
        trueAction(sportSummaryMessage.hasGolf(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setGolfStatistic(new GolfStatistic(sportSummaryMessage.getGolf().getTotalSwings(), sportSummaryMessage.getGolf().getAverageBeat(), sportSummaryMessage.getGolf().getAverageUpTime(), sportSummaryMessage.getGolf().getAverageDownTime(), sportSummaryMessage.getGolf().hasAverageAngle() ? sportSummaryMessage.getGolf().getAverageAngle() : -51, sportSummaryMessage.getGolf().getAverageScore()));
            }
        });
        trueAction(sportSummaryMessage.hasPower(), new Function0<Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt.toSportSummary.46
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                sportSummary.setPowerStatistic(new PowerStatistic(sportSummaryMessage.getPower().getMaximumPower(), sportSummaryMessage.getPower().getAveragePower(), sportSummaryMessage.getPower().getDeviceWork()));
            }
        });
        t5t.d(TAG, sportSummary.toString());
        return sportSummary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean trueAction(boolean z, Function0<Unit> function0) {
        if (z) {
            function0.invoke();
        }
        return z;
    }
}

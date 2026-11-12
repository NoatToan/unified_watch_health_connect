package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.AltitudePoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfGroupInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfRtInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PauseInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PlaygroundInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Row;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPowerInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtSpo2Info;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkipRope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRtPressure;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRtTemperature;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrengthGroupInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrokeSpeedInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber.BerLength;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber.BerTag;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.AltNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.AltitudeCalibration;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.BaseNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.DiffGpsNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.DiffGpsNodeKt;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.EventNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.FixedLapNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.FullGpsNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.FullGpsNodeKt;
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
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.SportEvent;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.StrengthGroupNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.TemperatureNode;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.TimeStampNode;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b3\u00104J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SportDetail800DataParser;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "detail", "", "value", "", "startTime", "", "parser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "getSportSummary", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "sportSummary", "Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "()Lio/netty/buffer/ByteBuf;", "detailBytesBuf", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerTag;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerTag;", "berTag", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerLength;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerLength;", "berLength", "e", "J", "timeAnchor", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "f", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "lastGpsNode", "g", "mLastPauseTime", "", "h", "Z", "isPause", "", "i", LogUtil.I, "gpsPointIndex", "", z.j, LogUtil.D, "lastAltitude", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetail800DataParser implements ISportDetailDataParser {

    @NotNull
    private static final String k = "SportDetail800DataParser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SportSummary sportSummary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy detailBytesBuf = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final BerTag berTag = new BerTag();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BerLength berLength = new BerLength();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long timeAnchor = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private FullGpsNode lastGpsNode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long mLastPauseTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isPause;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int gpsPointIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private double lastAltitude;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportEvent.values().length];
            iArr[SportEvent.NODE_EVENT_AUTO_PAUSE.ordinal()] = 1;
            iArr[SportEvent.NODE_EVENT_PAUSE.ordinal()] = 2;
            iArr[SportEvent.NODE_EVENT_RESUME.ordinal()] = 3;
            iArr[SportEvent.NODE_EVENT_AUTO_RESUME.ordinal()] = 4;
            iArr[SportEvent.NODE_EVENT_SECOND_HALF.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ByteBuf> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteBuf getA() {
            return Unpooled.buffer(128);
        }
    }

    public SportDetail800DataParser(@NotNull SportSummary sportSummary) {
        this.sportSummary = sportSummary;
    }

    private final ByteBuf a() {
        return (ByteBuf) this.detailBytesBuf.getValue();
    }

    @NotNull
    public final SportSummary getSportSummary() {
        return this.sportSummary;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(@NotNull SportDetail detail, @NotNull byte[] value, long startTime) {
        int number;
        a().writeBytes(value);
        try {
            Result.Companion companion = Result.Companion;
            while (true) {
                if (this.berTag.needContinue()) {
                    this.berTag.feed(a().readByte());
                } else if (!this.berLength.needContinue()) {
                    number = this.berTag.getNumber();
                    byte[] bArr = new byte[this.berLength.getLength()];
                    a().readBytes(bArr);
                    this.berTag.reset();
                    this.berLength.reset();
                    Function1<byte[], BaseNode> function1 = SportUtilsKt.getParserMap().get(Integer.valueOf(number));
                    GpsPoint gpsPoint = null;
                    BaseNode baseNodeInvoke = function1 == null ? null : function1.invoke(bArr);
                    if (!(baseNodeInvoke instanceof TimeStampNode)) {
                        int pace = 0;
                        if (!(baseNodeInvoke instanceof FullGpsNode)) {
                            if (!(baseNodeInvoke instanceof DiffGpsNode)) {
                                if (baseNodeInvoke instanceof EventNode) {
                                    int i = WhenMappings.$EnumSwitchMapping$0[((EventNode) baseNodeInvoke).getEventType().ordinal()];
                                    if (i == 1 || i == 2) {
                                        GpsPoint gpsPointLastGpsPoint = SportUtilsKt.lastGpsPoint(detail);
                                        if (gpsPointLastGpsPoint != null) {
                                            gpsPointLastGpsPoint.setState(2);
                                        }
                                        this.isPause = true;
                                        this.mLastPauseTime = ((EventNode) baseNodeInvoke).currentTime(this.timeAnchor);
                                    } else if (i == 3 || i == 4) {
                                        this.isPause = false;
                                        detail.addPauseInfo(new PauseInfo(this.mLastPauseTime, (int) (((EventNode) baseNodeInvoke).currentTime(this.timeAnchor) - this.mLastPauseTime)));
                                    } else if (i == 5) {
                                        detail.setSecondHalfStartTime((int) ((((EventNode) baseNodeInvoke).currentTime(this.timeAnchor) - getSportSummary().getStartTime()) / ((long) 1000)));
                                    }
                                } else if (baseNodeInvoke instanceof AltNode) {
                                    this.lastAltitude = ((AltNode) baseNodeInvoke).getAlt();
                                    detail.addAltitudePoint(new AltitudePoint(((AltNode) baseNodeInvoke).currentTime(this.timeAnchor), (int) (((AltNode) baseNodeInvoke).getAlt() * 100)));
                                } else if (baseNodeInvoke instanceof PaceNode1) {
                                    detail.addRtPaceInfo(new RtPaceInfo(((PaceNode1) baseNodeInvoke).currentTime(this.timeAnchor), ((PaceNode1) baseNodeInvoke).getPace(), ((PaceNode1) baseNodeInvoke).getFreq(), ((PaceNode1) baseNodeInvoke).getStride()));
                                    GpsPoint gpsPointLastGpsPoint2 = SportUtilsKt.lastGpsPoint(detail);
                                    if (gpsPointLastGpsPoint2 != null) {
                                        gpsPointLastGpsPoint2.setPace(((PaceNode1) baseNodeInvoke).getPace());
                                    }
                                } else if (baseNodeInvoke instanceof PaceNode2) {
                                    if (getSportSummary().getType() == SportType.SPORT_TYPE_OPEN_WATER_SWIM || getSportSummary().getType() == SportType.SPORT_TYPE_POOL_SWIM) {
                                        detail.addStrokeSpeedInfo(new StrokeSpeedInfo(((PaceNode2) baseNodeInvoke).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke).getFreq() / 60.0f));
                                    }
                                    detail.addRowInfo(new Row(((PaceNode2) baseNodeInvoke).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke).getFreq()));
                                    if (getSportSummary().getType() == SportType.SPORT_TYPE_JUMP_ROPE) {
                                        detail.addSkipRopeInfo(new SkipRope(((PaceNode2) baseNodeInvoke).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke).getFreq()));
                                    }
                                    detail.addRtPaceInfo(new RtPaceInfo(((PaceNode2) baseNodeInvoke).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke).getPace()));
                                } else if (baseNodeInvoke instanceof Spo2Node) {
                                    detail.addSpo2(new RtSpo2Info(((Spo2Node) baseNodeInvoke).currentTime(this.timeAnchor), ((Spo2Node) baseNodeInvoke).getSpo2()));
                                } else if (baseNodeInvoke instanceof FixedLapNode) {
                                    int unit = ((FixedLapNode) baseNodeInvoke).getUnit();
                                    int iFixedLapIndex = SportUtilsKt.fixedLapIndex(unit, ((FixedLapNode) baseNodeInvoke).getDistance());
                                    if (unit == 0) {
                                        detail.addKmPaceInfo(new KmPaceInfo(iFixedLapIndex, ((FixedLapNode) baseNodeInvoke).getTimeUsage(), SportUtilsKt.lastGpsPoint(detail), this.gpsPointIndex));
                                    } else if (unit == 1) {
                                        detail.addMilePaceInfo(new MilePaceInfo(iFixedLapIndex, ((FixedLapNode) baseNodeInvoke).getTimeUsage(), SportUtilsKt.lastGpsPoint(detail), this.gpsPointIndex));
                                    }
                                } else if (baseNodeInvoke instanceof LapNode) {
                                    ((LapNode) baseNodeInvoke).getLapInfo().setOffsetToStart(((((LapNode) baseNodeInvoke).getTimeDiff() + this.timeAnchor) - startTime) / ((long) 1000));
                                    ((LapNode) baseNodeInvoke).getLapInfo().setSportMode(getSportSummary().getSportMode());
                                    ((LapNode) baseNodeInvoke).getLapInfo().setLapType(SportDetail800DataParserKt.a(((LapNode) baseNodeInvoke).getLapInfo().getLapType(), getSportSummary().getSportTypeValue()));
                                    detail.addLapInfo(((LapNode) baseNodeInvoke).getLapInfo());
                                } else if (baseNodeInvoke instanceof HeartRateNode) {
                                    detail.addHeartRateInfo(new HeartRateInfo(((HeartRateNode) baseNodeInvoke).currentTime(this.timeAnchor), ((HeartRateNode) baseNodeInvoke).getHeartRate()));
                                } else if (baseNodeInvoke instanceof PressureNode) {
                                    detail.addPressure(new SportRtPressure(((PressureNode) baseNodeInvoke).currentTime(this.timeAnchor), ((PressureNode) baseNodeInvoke).getPressure()));
                                } else if (baseNodeInvoke instanceof TemperatureNode) {
                                    detail.addRtTemperature(new SportRtTemperature(((TemperatureNode) baseNodeInvoke).currentTime(this.timeAnchor), ((TemperatureNode) baseNodeInvoke).getTemperature()));
                                } else if (baseNodeInvoke instanceof AltitudeCalibration) {
                                    for (GpsPoint gpsPoint2 : detail.getGpsPoints()) {
                                        gpsPoint2.setAltitude(gpsPoint2.getAltitude() + ((double) ((AltitudeCalibration) baseNodeInvoke).getAlt()));
                                    }
                                    for (AltitudePoint altitudePoint : detail.getAltitudePoints()) {
                                        altitudePoint.setAltitude(altitudePoint.getAltitude() + ((int) (((AltitudeCalibration) baseNodeInvoke).getAlt() * 100)));
                                    }
                                } else if (baseNodeInvoke instanceof StrengthGroupNode) {
                                    detail.addStrengthGroupNode(new StrengthGroupInfo(((StrengthGroupNode) baseNodeInvoke).currentTime(this.timeAnchor), ((StrengthGroupNode) baseNodeInvoke).getIndex(), ((StrengthGroupNode) baseNodeInvoke).getAvgHr(), ((StrengthGroupNode) baseNodeInvoke).getCal(), ((StrengthGroupNode) baseNodeInvoke).getTimeUsage(), ((StrengthGroupNode) baseNodeInvoke).getType(), ((StrengthGroupNode) baseNodeInvoke).getWeight(), ((StrengthGroupNode) baseNodeInvoke).getTimes(), ((StrengthGroupNode) baseNodeInvoke).getUnit(), ((StrengthGroupNode) baseNodeInvoke).getLapType()));
                                } else if (baseNodeInvoke instanceof GolfGroupNode) {
                                    detail.addGolfGroupNodes(new GolfGroupInfo(((GolfGroupNode) baseNodeInvoke).currentTime(this.timeAnchor), ((GolfGroupNode) baseNodeInvoke).getIndex(), ((GolfGroupNode) baseNodeInvoke).getCount(), ((GolfGroupNode) baseNodeInvoke).getTimeUsage(), ((GolfGroupNode) baseNodeInvoke).getAvgHr()));
                                } else if (baseNodeInvoke instanceof GolfRtNode) {
                                    detail.addGolfRtNode(new GolfRtInfo(((GolfRtNode) baseNodeInvoke).currentTime(this.timeAnchor), ((GolfRtNode) baseNodeInvoke).getAngle(), ((GolfRtNode) baseNodeInvoke).getBeat(), ((GolfRtNode) baseNodeInvoke).getUpTime(), ((GolfRtNode) baseNodeInvoke).getDownTime()));
                                } else if (baseNodeInvoke instanceof RtPowerNode) {
                                    detail.addRtPower(new RtPowerInfo(((RtPowerNode) baseNodeInvoke).currentTime(this.timeAnchor), ((RtPowerNode) baseNodeInvoke).getPower()));
                                } else if (!(baseNodeInvoke instanceof PlaygroundNode)) {
                                    break;
                                } else {
                                    detail.addPlayGroundInfos(new PlaygroundInfo(((PlaygroundNode) baseNodeInvoke).currentTime(this.timeAnchor), ((PlaygroundNode) baseNodeInvoke).getGpsDistance(), ((PlaygroundNode) baseNodeInvoke).getLoopDistance(), ((PlaygroundNode) baseNodeInvoke).getToleranceDistance(), ((PlaygroundNode) baseNodeInvoke).getPlaygroundTemplatePara()));
                                }
                            } else if (!this.isPause) {
                                FullGpsNode fullGpsNodeAdd = DiffGpsNodeKt.add((DiffGpsNode) baseNodeInvoke, this.lastGpsNode);
                                this.lastGpsNode = fullGpsNodeAdd;
                                if (fullGpsNodeAdd != null) {
                                    gpsPoint = FullGpsNodeKt.toGpsPoint(fullGpsNodeAdd, this.timeAnchor);
                                }
                                detail.addGpsPoint(gpsPoint);
                                GpsPoint gpsPointLastGpsPoint3 = SportUtilsKt.lastGpsPoint(detail);
                                if (gpsPointLastGpsPoint3 != null) {
                                    RtPaceInfo rtPaceInfoLastPace = SportUtilsKt.lastPace(detail);
                                    if (rtPaceInfoLastPace != null) {
                                        pace = rtPaceInfoLastPace.getPace();
                                    }
                                    gpsPointLastGpsPoint3.setPace(pace);
                                }
                                GpsPoint gpsPointLastGpsPoint4 = SportUtilsKt.lastGpsPoint(detail);
                                if (gpsPointLastGpsPoint4 != null) {
                                    gpsPointLastGpsPoint4.setAltitude(this.lastAltitude);
                                }
                            }
                        } else if (!this.isPause) {
                            this.gpsPointIndex++;
                            this.lastGpsNode = (FullGpsNode) baseNodeInvoke;
                            detail.addGpsPoint(FullGpsNodeKt.toGpsPoint((FullGpsNode) baseNodeInvoke, this.timeAnchor));
                            GpsPoint gpsPointLastGpsPoint5 = SportUtilsKt.lastGpsPoint(detail);
                            if (gpsPointLastGpsPoint5 != null) {
                                RtPaceInfo rtPaceInfoLastPace2 = SportUtilsKt.lastPace(detail);
                                if (rtPaceInfoLastPace2 != null) {
                                    pace = rtPaceInfoLastPace2.getPace();
                                }
                                gpsPointLastGpsPoint5.setPace(pace);
                            }
                            GpsPoint gpsPointLastGpsPoint6 = SportUtilsKt.lastGpsPoint(detail);
                            if (gpsPointLastGpsPoint6 != null) {
                                gpsPointLastGpsPoint6.setAltitude(this.lastAltitude);
                            }
                        }
                    } else {
                        this.timeAnchor = ((TimeStampNode) baseNodeInvoke).getTime();
                    }
                } else {
                    this.berLength.feed(a().readByte());
                }
            }
            throw new Exception(Intrinsics.stringPlus("Not support node:", Integer.valueOf(number)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th)));
            if (thM3848exceptionOrNullimpl != null) {
                Debug.fi(k, Intrinsics.stringPlus("Parse Exception:", thM3848exceptionOrNullimpl));
                Debug.fi(k, Intrinsics.stringPlus("Data remain:", Integer.valueOf(a().readableBytes())));
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}

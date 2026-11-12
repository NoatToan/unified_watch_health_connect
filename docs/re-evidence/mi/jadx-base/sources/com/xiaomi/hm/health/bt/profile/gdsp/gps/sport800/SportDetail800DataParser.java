package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

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
import defpackage.t5t;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SportDetail800DataParser;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "sportSummary", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;)V", "berLength", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerLength;", "berTag", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerTag;", "detailBytesBuf", "Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "getDetailBytesBuf", "()Lio/netty/buffer/ByteBuf;", "detailBytesBuf$delegate", "Lkotlin/Lazy;", "gpsPointIndex", "", "isPause", "", "lastAltitude", "", "lastGpsNode", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "mLastPauseTime", "", "getSportSummary", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "timeAnchor", "parser", "", "detail", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "value", "", "startTime", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SportDetail800DataParser implements ISportDetailDataParser {

    @NotNull
    private static final String TAG = "SportDetail800DataParser";

    @NotNull
    private final BerLength berLength;

    @NotNull
    private final BerTag berTag;

    /* JADX INFO: renamed from: detailBytesBuf$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy detailBytesBuf;
    private int gpsPointIndex;
    private boolean isPause;
    private double lastAltitude;

    @Nullable
    private FullGpsNode lastGpsNode;
    private long mLastPauseTime;

    @NotNull
    private final SportSummary sportSummary;
    private long timeAnchor;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportEvent.values().length];
            try {
                iArr[SportEvent.NODE_EVENT_AUTO_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportEvent.NODE_EVENT_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportEvent.NODE_EVENT_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportEvent.NODE_EVENT_AUTO_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportEvent.NODE_EVENT_SECOND_HALF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SportDetail800DataParser(@NotNull SportSummary sportSummary) {
        Intrinsics.checkNotNullParameter(sportSummary, "sportSummary");
        this.sportSummary = sportSummary;
        this.detailBytesBuf = LazyKt__LazyJVMKt.lazy(new Function0<ByteBuf>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportDetail800DataParser$detailBytesBuf$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ByteBuf invoke() {
                return Unpooled.buffer(128);
            }
        });
        this.berTag = new BerTag();
        this.berLength = new BerLength();
        this.timeAnchor = -1L;
    }

    private final ByteBuf getDetailBytesBuf() {
        return (ByteBuf) this.detailBytesBuf.getValue();
    }

    @NotNull
    public final SportSummary getSportSummary() {
        return this.sportSummary;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(@NotNull SportDetail detail, @NotNull byte[] value, long startTime) {
        int number;
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(value, "value");
        getDetailBytesBuf().writeBytes(value);
        try {
            Result.Companion companion = Result.Companion;
            while (true) {
                if (this.berTag.needContinue()) {
                    this.berTag.feed(getDetailBytesBuf().readByte());
                } else if (!this.berLength.needContinue()) {
                    number = this.berTag.getNumber();
                    byte[] bArr = new byte[this.berLength.getLength()];
                    getDetailBytesBuf().readBytes(bArr);
                    this.berTag.reset();
                    this.berLength.reset();
                    Function1<byte[], BaseNode> function1 = SportUtilsKt.getParserMap().get(Integer.valueOf(number));
                    BaseNode baseNodeInvoke2 = function1 != null ? function1.invoke2(bArr) : null;
                    if (baseNodeInvoke2 instanceof TimeStampNode) {
                        this.timeAnchor = ((TimeStampNode) baseNodeInvoke2).getTime();
                    } else if (!(baseNodeInvoke2 instanceof FullGpsNode)) {
                        if (!(baseNodeInvoke2 instanceof DiffGpsNode)) {
                            if (baseNodeInvoke2 instanceof EventNode) {
                                int i = WhenMappings.$EnumSwitchMapping$0[((EventNode) baseNodeInvoke2).getEventType().ordinal()];
                                if (i == 1 || i == 2) {
                                    GpsPoint gpsPointLastGpsPoint = SportUtilsKt.lastGpsPoint(detail);
                                    if (gpsPointLastGpsPoint != null) {
                                        gpsPointLastGpsPoint.setState(2);
                                    }
                                    this.isPause = true;
                                    this.mLastPauseTime = ((EventNode) baseNodeInvoke2).currentTime(this.timeAnchor);
                                } else if (i == 3 || i == 4) {
                                    this.isPause = false;
                                    detail.addPauseInfo(new PauseInfo(this.mLastPauseTime, (int) (((EventNode) baseNodeInvoke2).currentTime(this.timeAnchor) - this.mLastPauseTime)));
                                } else if (i == 5) {
                                    detail.setSecondHalfStartTime((int) ((((EventNode) baseNodeInvoke2).currentTime(this.timeAnchor) - this.sportSummary.getStartTime()) / ((long) 1000)));
                                }
                            } else if (baseNodeInvoke2 instanceof AltNode) {
                                this.lastAltitude = ((AltNode) baseNodeInvoke2).getAlt();
                                detail.addAltitudePoint(new AltitudePoint(((AltNode) baseNodeInvoke2).currentTime(this.timeAnchor), (int) (((AltNode) baseNodeInvoke2).getAlt() * 100)));
                            } else if (baseNodeInvoke2 instanceof PaceNode1) {
                                detail.addRtPaceInfo(new RtPaceInfo(((PaceNode1) baseNodeInvoke2).currentTime(this.timeAnchor), ((PaceNode1) baseNodeInvoke2).getPace(), ((PaceNode1) baseNodeInvoke2).getFreq(), ((PaceNode1) baseNodeInvoke2).getStride()));
                                GpsPoint gpsPointLastGpsPoint2 = SportUtilsKt.lastGpsPoint(detail);
                                if (gpsPointLastGpsPoint2 != null) {
                                    gpsPointLastGpsPoint2.setPace(((PaceNode1) baseNodeInvoke2).getPace());
                                }
                            } else if (baseNodeInvoke2 instanceof PaceNode2) {
                                if (this.sportSummary.getType() == SportType.SPORT_TYPE_OPEN_WATER_SWIM || this.sportSummary.getType() == SportType.SPORT_TYPE_POOL_SWIM) {
                                    detail.addStrokeSpeedInfo(new StrokeSpeedInfo(((PaceNode2) baseNodeInvoke2).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke2).getFreq() / 60.0f));
                                }
                                detail.addRowInfo(new Row(((PaceNode2) baseNodeInvoke2).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke2).getFreq()));
                                if (this.sportSummary.getType() == SportType.SPORT_TYPE_JUMP_ROPE) {
                                    detail.addSkipRopeInfo(new SkipRope(((PaceNode2) baseNodeInvoke2).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke2).getFreq()));
                                }
                                detail.addRtPaceInfo(new RtPaceInfo(((PaceNode2) baseNodeInvoke2).currentTime(this.timeAnchor), ((PaceNode2) baseNodeInvoke2).getPace()));
                            } else if (baseNodeInvoke2 instanceof Spo2Node) {
                                detail.addSpo2(new RtSpo2Info(((Spo2Node) baseNodeInvoke2).currentTime(this.timeAnchor), ((Spo2Node) baseNodeInvoke2).getSpo2()));
                            } else if (baseNodeInvoke2 instanceof FixedLapNode) {
                                int unit = ((FixedLapNode) baseNodeInvoke2).getUnit();
                                int iFixedLapIndex = SportUtilsKt.fixedLapIndex(unit, ((FixedLapNode) baseNodeInvoke2).getDistance());
                                if (unit == 0) {
                                    detail.addKmPaceInfo(new KmPaceInfo(iFixedLapIndex, ((FixedLapNode) baseNodeInvoke2).getTimeUsage(), SportUtilsKt.lastGpsPoint(detail), this.gpsPointIndex));
                                } else if (unit == 1) {
                                    detail.addMilePaceInfo(new MilePaceInfo(iFixedLapIndex, ((FixedLapNode) baseNodeInvoke2).getTimeUsage(), SportUtilsKt.lastGpsPoint(detail), this.gpsPointIndex));
                                }
                            } else if (baseNodeInvoke2 instanceof LapNode) {
                                ((LapNode) baseNodeInvoke2).getLapInfo().setOffsetToStart(((((LapNode) baseNodeInvoke2).getTimeDiff() + this.timeAnchor) - startTime) / ((long) 1000));
                                ((LapNode) baseNodeInvoke2).getLapInfo().setSportMode(this.sportSummary.getSportMode());
                                ((LapNode) baseNodeInvoke2).getLapInfo().setLapType(SportDetail800DataParserKt.lapTypeAdapt(((LapNode) baseNodeInvoke2).getLapInfo().getLapType(), this.sportSummary.getSportTypeValue()));
                                detail.addLapInfo(((LapNode) baseNodeInvoke2).getLapInfo());
                            } else if (baseNodeInvoke2 instanceof HeartRateNode) {
                                detail.addHeartRateInfo(new HeartRateInfo(((HeartRateNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((HeartRateNode) baseNodeInvoke2).getHeartRate()));
                            } else if (baseNodeInvoke2 instanceof PressureNode) {
                                detail.addPressure(new SportRtPressure(((PressureNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((PressureNode) baseNodeInvoke2).getPressure()));
                            } else if (baseNodeInvoke2 instanceof TemperatureNode) {
                                detail.addRtTemperature(new SportRtTemperature(((TemperatureNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((TemperatureNode) baseNodeInvoke2).getTemperature()));
                            } else if (baseNodeInvoke2 instanceof AltitudeCalibration) {
                                ArrayList<GpsPoint> gpsPoints = detail.getGpsPoints();
                                Intrinsics.checkNotNullExpressionValue(gpsPoints, "detail.gpsPoints");
                                for (GpsPoint gpsPoint : gpsPoints) {
                                    gpsPoint.setAltitude(gpsPoint.getAltitude() + ((double) ((AltitudeCalibration) baseNodeInvoke2).getAlt()));
                                }
                                List<AltitudePoint> altitudePoints = detail.getAltitudePoints();
                                Intrinsics.checkNotNullExpressionValue(altitudePoints, "detail.altitudePoints");
                                for (AltitudePoint altitudePoint : altitudePoints) {
                                    altitudePoint.setAltitude(altitudePoint.getAltitude() + ((int) (((AltitudeCalibration) baseNodeInvoke2).getAlt() * 100)));
                                }
                            } else if (baseNodeInvoke2 instanceof StrengthGroupNode) {
                                detail.addStrengthGroupNode(new StrengthGroupInfo(((StrengthGroupNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((StrengthGroupNode) baseNodeInvoke2).getIndex(), ((StrengthGroupNode) baseNodeInvoke2).getAvgHr(), ((StrengthGroupNode) baseNodeInvoke2).getCal(), ((StrengthGroupNode) baseNodeInvoke2).getTimeUsage(), ((StrengthGroupNode) baseNodeInvoke2).getType(), ((StrengthGroupNode) baseNodeInvoke2).getWeight(), ((StrengthGroupNode) baseNodeInvoke2).getTimes(), ((StrengthGroupNode) baseNodeInvoke2).getUnit(), ((StrengthGroupNode) baseNodeInvoke2).getLapType()));
                            } else if (baseNodeInvoke2 instanceof GolfGroupNode) {
                                detail.addGolfGroupNodes(new GolfGroupInfo(((GolfGroupNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((GolfGroupNode) baseNodeInvoke2).getIndex(), ((GolfGroupNode) baseNodeInvoke2).getCount(), ((GolfGroupNode) baseNodeInvoke2).getTimeUsage(), ((GolfGroupNode) baseNodeInvoke2).getAvgHr()));
                            } else if (baseNodeInvoke2 instanceof GolfRtNode) {
                                detail.addGolfRtNode(new GolfRtInfo(((GolfRtNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((GolfRtNode) baseNodeInvoke2).getAngle(), ((GolfRtNode) baseNodeInvoke2).getBeat(), ((GolfRtNode) baseNodeInvoke2).getUpTime(), ((GolfRtNode) baseNodeInvoke2).getDownTime()));
                            } else if (baseNodeInvoke2 instanceof RtPowerNode) {
                                detail.addRtPower(new RtPowerInfo(((RtPowerNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((RtPowerNode) baseNodeInvoke2).getPower()));
                            } else if (!(baseNodeInvoke2 instanceof PlaygroundNode)) {
                                break;
                            } else {
                                detail.addPlayGroundInfos(new PlaygroundInfo(((PlaygroundNode) baseNodeInvoke2).currentTime(this.timeAnchor), ((PlaygroundNode) baseNodeInvoke2).getGpsDistance(), ((PlaygroundNode) baseNodeInvoke2).getLoopDistance(), ((PlaygroundNode) baseNodeInvoke2).getToleranceDistance(), ((PlaygroundNode) baseNodeInvoke2).getPlaygroundTemplatePara()));
                            }
                        } else if (!this.isPause) {
                            FullGpsNode fullGpsNode = this.lastGpsNode;
                            Intrinsics.checkNotNull(fullGpsNode);
                            FullGpsNode fullGpsNodeAdd = DiffGpsNodeKt.add((DiffGpsNode) baseNodeInvoke2, fullGpsNode);
                            this.lastGpsNode = fullGpsNodeAdd;
                            detail.addGpsPoint(fullGpsNodeAdd != null ? FullGpsNodeKt.toGpsPoint(fullGpsNodeAdd, this.timeAnchor) : null);
                            GpsPoint gpsPointLastGpsPoint3 = SportUtilsKt.lastGpsPoint(detail);
                            if (gpsPointLastGpsPoint3 != null) {
                                RtPaceInfo rtPaceInfoLastPace = SportUtilsKt.lastPace(detail);
                                gpsPointLastGpsPoint3.setPace(rtPaceInfoLastPace != null ? rtPaceInfoLastPace.getPace() : 0);
                            }
                            GpsPoint gpsPointLastGpsPoint4 = SportUtilsKt.lastGpsPoint(detail);
                            if (gpsPointLastGpsPoint4 != null) {
                                gpsPointLastGpsPoint4.setAltitude(this.lastAltitude);
                            }
                        }
                    } else if (!this.isPause) {
                        this.gpsPointIndex++;
                        this.lastGpsNode = (FullGpsNode) baseNodeInvoke2;
                        detail.addGpsPoint(FullGpsNodeKt.toGpsPoint((FullGpsNode) baseNodeInvoke2, this.timeAnchor));
                        GpsPoint gpsPointLastGpsPoint5 = SportUtilsKt.lastGpsPoint(detail);
                        if (gpsPointLastGpsPoint5 != null) {
                            RtPaceInfo rtPaceInfoLastPace2 = SportUtilsKt.lastPace(detail);
                            gpsPointLastGpsPoint5.setPace(rtPaceInfoLastPace2 != null ? rtPaceInfoLastPace2.getPace() : 0);
                        }
                        GpsPoint gpsPointLastGpsPoint6 = SportUtilsKt.lastGpsPoint(detail);
                        if (gpsPointLastGpsPoint6 != null) {
                            gpsPointLastGpsPoint6.setAltitude(this.lastAltitude);
                        }
                    }
                } else {
                    this.berLength.feed(getDetailBytesBuf().readByte());
                }
            }
            throw new Exception("Not support node:" + number);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
            if (thM889exceptionOrNullimpl != null) {
                t5t.d(TAG, "Parse Exception:" + thM889exceptionOrNullimpl);
                t5t.d(TAG, "Data remain:" + getDetailBytesBuf().readableBytes());
            }
        }
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.LapPace;
import defpackage.pr;
import defpackage.t5t;
import defpackage.tet;
import defpackage.y2;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailParserNew implements ISportDetailDataParser {
    private static String TAG = "SportDetailParser102";
    private long baseAlt;
    private long baseLat;
    private long baseLng;
    private boolean isTimeX;
    private ByteArrayOutputStream lastSegmentNameBytes;
    private int mGpsIndex;
    private GpsPoint mLastGpsPoint;
    private int mLastKmPaceIndex;
    private int mLastMilePaceIndex;
    private NodeType mLastNodeType;
    private long mLastPauseTime;
    private int mLastRelTime;
    private long mTotalTime;
    private int sportMode;
    private int version;

    public SportDetailParserNew(SportSummary sportSummary, boolean z) {
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mTotalTime = 0L;
        this.mLastRelTime = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.mLastNodeType = nodeType;
        this.baseLng = 0L;
        this.baseLat = 0L;
        this.baseAlt = 0L;
        this.mLastPauseTime = 0L;
        this.sportMode = 0;
        this.version = -1;
        this.lastSegmentNameBytes = new ByteArrayOutputStream();
        this.isTimeX = false;
        this.version = sportSummary.version;
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mLastNodeType = nodeType;
        this.mLastRelTime = 0;
        this.mTotalTime = sportSummary.getStartTime();
        this.baseLng = sportSummary.getBaseLng();
        this.baseLat = sportSummary.getBaseLat();
        this.baseAlt = sportSummary.getBaseAlt();
        this.sportMode = sportSummary.sportMode;
        this.isTimeX = z;
    }

    private GpsPoint getGpsPoint(long j, double d, double d2, double d3) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setAltitude(d);
        gpsPoint.setLatitude(d2);
        gpsPoint.setLongitude(d3);
        gpsPoint.setTime(j);
        t5t.m(TAG, "GpsPoint:" + gpsPoint);
        return gpsPoint;
    }

    private LapInfo getLastLapInfo(SportDetail sportDetail) {
        int size = sportDetail.getLapInfos().size();
        if (size <= 0) {
            return null;
        }
        return sportDetail.getLapInfos().get(size - 1);
    }

    private void parseGpsDetailNew(SportDetail sportDetail, byte[] bArr, int i, long j) {
        t5t.m(TAG, "parseGpsDetail:" + tet.x(bArr));
        int length = bArr.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i2 = 0; i2 < length; i2 += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(bArr[i2] & 255);
            t5t.d(TAG, "NodeType:" + nodeTypeFromValue);
            int i3 = (bArr[i2 + 1] & 255) * 1000;
            t5t.d(TAG, "relTime:" + i3);
            if (i3 < this.mLastRelTime) {
                this.mTotalTime += 255000;
            }
            this.mLastRelTime = i3;
            long j2 = this.mTotalTime + ((long) i3);
            if (nodeTypeFromValue == NodeType.NODE_TYPE_HEARTRATE) {
                sportDetail.addHeartRateInfo(new HeartRateInfo(j2, bArr[i2 + 2] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i4 = this.mLastKmPaceIndex + 1;
                this.mLastKmPaceIndex = i4;
                sportDetail.addKmPaceInfo(new KmPaceInfo(i4, (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else {
                if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                    int i5 = this.mLastMilePaceIndex + 1;
                    this.mLastMilePaceIndex = i5;
                    sportDetail.addMilePaceInfo(new MilePaceInfo(i5, (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
                } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                    int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8);
                    GpsPoint gpsPoint = this.mLastGpsPoint;
                    if (gpsPoint != null) {
                        gpsPoint.setPace(i6);
                    }
                    if (i == 515) {
                        int i7 = (bArr[i2 + 4] & 255) | ((bArr[i2 + 5] & 255) << 8);
                        int i8 = (bArr[i2 + 6] & 255) | ((bArr[i2 + 7] & 255) << 8);
                        t5t.d(TAG, "203 version cadence: " + i7 + ", stride: " + i8 + ", currTime: " + j2);
                        RtPaceInfo rtPaceInfo = new RtPaceInfo(j2, i6);
                        rtPaceInfo.setTime(j2);
                        rtPaceInfo.setCadence(i7);
                        rtPaceInfo.setStride(i8);
                        sportDetail.addRtPaceInfo(rtPaceInfo);
                    } else {
                        sportDetail.addRtPaceInfo(new RtPaceInfo(j2, i6));
                    }
                } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                    long j3 = this.baseLng + ((long) ((short) ((bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8))));
                    this.baseLng = j3;
                    this.baseLat += (long) ((short) ((bArr[i2 + 4] & 255) | ((bArr[i2 + 5] & 255) << 8)));
                    this.baseAlt += (long) ((short) ((bArr[i2 + 6] & 255) | ((bArr[i2 + 7] & 255) << 8)));
                    if (this.mLastNodeType != NodeType.NODE_TYPE_SPORT_PAUSE) {
                        GpsPoint gpsPoint2 = getGpsPoint(j2, this.baseAlt, SportDetailParserUtils.convert(this.baseLat), SportDetailParserUtils.convert(j3));
                        sportDetail.addGpsPoint(gpsPoint2);
                        this.mLastGpsPoint = gpsPoint2;
                        this.mGpsIndex++;
                    }
                } else {
                    NodeType nodeType = NodeType.NODE_TYPE_SPORT_PAUSE;
                    if (nodeTypeFromValue == nodeType) {
                        GpsPoint gpsPoint3 = this.mLastGpsPoint;
                        if (gpsPoint3 != null) {
                            gpsPoint3.setState(2);
                        }
                        this.mLastNodeType = nodeType;
                        this.mLastPauseTime = j2;
                    } else {
                        NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_RESUME;
                        if (nodeTypeFromValue == nodeType2) {
                            this.mLastNodeType = nodeType2;
                            long j4 = this.mLastPauseTime;
                            sportDetail.addPauseInfo(new PauseInfo(j4, (int) (j2 - j4)));
                        } else if (nodeTypeFromValue == NodeType.NODE_TYPE_DUMMY || nodeTypeFromValue == NodeType.NODE_TYPE_TIME_CHANGE) {
                            t5t.m(TAG, "dummy");
                        } else if (nodeTypeFromValue == NodeType.NODE_TYPE_SWIM) {
                            sportDetail.addStrokeSpeedInfo(new StrokeSpeedInfo(j2, ((bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8)) / 1000.0f));
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_STEP_MODE.getValue() && this.isTimeX) {
                            parseStepMode(sportDetail, j2, bArr, i2 + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_PACE_KM.getValue() && this.isTimeX) {
                            parseLapPace(sportDetail, bArr, i2 + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_SEGMENT_DETAIL.getValue() && this.isTimeX) {
                            parseSegmentDetail(sportDetail, bArr, i2 + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_PACE_MILE.getValue() && this.isTimeX) {
                            parseMileLapPace(sportDetail, bArr, i2 + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_0.getValue()) {
                            long j5 = (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8) | ((bArr[i2 + 4] & 255) << 16) | ((bArr[i2 + 5] & 255) << 24);
                            int i9 = bArr[i2 + 6] & 255;
                            int i10 = bArr[i2 + 7] & 255;
                            LapInfo lapInfo = new LapInfo(i9);
                            lapInfo.setTimeUsage(j5);
                            lapInfo.setAvgHr(i10);
                            lapInfo.setSportMode(this.sportMode);
                            sportDetail.addLapInfo(lapInfo);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_1.getValue()) {
                            long j6 = (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8) | ((bArr[i2 + 4] & 255) << 16) | ((bArr[i2 + 5] & 255) << 24);
                            int i11 = (bArr[i2 + 6] & 255) | ((bArr[i2 + 7] & 255) << 8);
                            LapInfo lastLapInfo = getLastLapInfo(sportDetail);
                            if (lastLapInfo != null) {
                                lastLapInfo.setOffsetToStart((j2 - j) / 1000);
                                lastLapInfo.setLapDistance((int) j6);
                                lastLapInfo.setIndex(i11);
                                lastLapInfo.setAvgPace(j6 > 0 ? (lastLapInfo.getTimeUsage() * 1.0f) / j6 : 0.0f);
                            }
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_2.getValue()) {
                            int i12 = (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 8);
                            int i13 = (bArr[i2 + 4] & 255) | ((bArr[i2 + 5] & 255) << 8);
                            int i14 = (bArr[i2 + 6] & 255) | ((bArr[i2 + 7] & 255) << 8);
                            LapInfo lastLapInfo2 = getLastLapInfo(sportDetail);
                            if (lastLapInfo2 != null) {
                                lastLapInfo2.setLapCalorie(i12);
                                lastLapInfo2.setLapClimbUp(i13);
                                lastLapInfo2.setLapClimbDown(i14);
                            }
                        }
                    }
                }
            }
        }
    }

    private int parseLapPace(SportDetail sportDetail, byte[] bArr, int i) {
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, i, bArr2, 0, 6);
        t5t.m(TAG, "parse KM LapPace: " + tet.x(bArr2));
        LapPace lapPace = new LapPace(bArr2);
        t5t.m(TAG, "Parsed LapPace: " + lapPace);
        sportDetail.addKmLapPace(lapPace);
        return 6;
    }

    private int parseMileLapPace(SportDetail sportDetail, byte[] bArr, int i) {
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, i, bArr2, 0, 6);
        t5t.m(TAG, "parse Mile LapPace: " + tet.x(bArr2));
        LapPace lapPace = new LapPace(bArr2);
        t5t.m(TAG, "Parsed Mile LapPace: " + lapPace);
        sportDetail.addMileLapPace(lapPace);
        return 6;
    }

    private int parseSegmentDetail(SportDetail sportDetail, byte[] bArr, int i) {
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, i, bArr2, 0, 6);
        t5t.d(TAG, "parseSegmentDetail: " + tet.x(bArr2));
        pr prVar = new pr(bArr2);
        t5t.d(TAG, "Parsed SegmentDetail: " + prVar);
        if (prVar.b()) {
            byte[] bArrA = prVar.a();
            this.lastSegmentNameBytes.write(bArrA, 0, bArrA.length);
            List<pr> segments = sportDetail.getSegments();
            if (segments != null && segments.size() > 0) {
                segments.get(segments.size() - 1).a(y2.a(this.lastSegmentNameBytes.toByteArray(), 0, -1));
            }
        } else {
            sportDetail.addSegment(prVar);
            this.lastSegmentNameBytes.reset();
        }
        return 6;
    }

    private int parseStepMode(SportDetail sportDetail, long j, byte[] bArr, int i) {
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, i, bArr2, 0, 6);
        t5t.m(TAG, "parseStepMode: " + tet.x(bArr2));
        TxStepMode txStepMode = new TxStepMode(j, bArr2);
        t5t.m(TAG, "Parsed StepMode: " + txStepMode);
        sportDetail.addTxStepMode(txStepMode);
        return 6;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail sportDetail, byte[] bArr, long j) {
        parseGpsDetailNew(sportDetail, bArr, this.version, j);
    }
}

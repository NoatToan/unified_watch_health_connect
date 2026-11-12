package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt;
import defpackage.t5t;
import defpackage.tet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailParer206 implements ISportDetailDataParser {
    private static String TAG = "SportDetailParer206";
    private long baseAlt;
    private long baseLat;
    private long baseLng;
    private int distanceUnit;
    private long kmPace;
    private float kmSpeed;
    private int lastPace;
    private int mGpsIndex;
    private GpsPoint mLastGpsPoint;
    private int mLastKmPaceIndex;
    private int mLastMilePaceIndex;
    private int mLastNodeType;
    private long mLastPauseTime;
    private int mLastRelTime;
    private long mTotalTime;
    private int sportMode;
    private SportType sportType;

    public SportDetailParer206(SportSummary sportSummary) {
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mTotalTime = 0L;
        this.mLastRelTime = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.mLastNodeType = nodeType.getValue();
        this.baseLng = 0L;
        this.baseLat = 0L;
        this.baseAlt = 0L;
        this.mLastPauseTime = 0L;
        this.distanceUnit = -1;
        this.lastPace = 0;
        this.kmPace = -1L;
        this.kmSpeed = -1.0f;
        this.sportMode = 0;
        this.sportType = SportType.SPORT_TYPE_NONE;
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mLastNodeType = nodeType.getValue();
        this.mLastRelTime = 0;
        this.mTotalTime = sportSummary.getStartTime();
        this.baseLng = sportSummary.getBaseLng();
        this.baseLat = sportSummary.getBaseLat();
        this.baseAlt = sportSummary.getBaseAlt();
        this.distanceUnit = sportSummary.getDistanceUnit();
        this.sportMode = sportSummary.sportMode;
        this.lastPace = 0;
        this.sportType = sportSummary.type;
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

    private int kmIndex(int i, long j) {
        return SportUtilsKt.fixedLapIndex(i, j);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0477  */
    /* JADX WARN: Code duplicated, block: B:102:0x047c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0484  */
    /* JADX WARN: Code duplicated, block: B:105:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:107:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x0507  */
    /* JADX WARN: Code duplicated, block: B:115:0x0516  */
    /* JADX WARN: Code duplicated, block: B:117:0x051e  */
    /* JADX WARN: Code duplicated, block: B:118:0x052d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0534 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0419  */
    /* JADX WARN: Code duplicated, block: B:96:0x044f  */
    /* JADX WARN: Code duplicated, block: B:97:0x045a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0462  */
    private void parseGpsDetailVersion206(SportDetail sportDetail, byte[] bArr, long j) {
        int i;
        long j2;
        long j3;
        List<MarathonInfo> marathonInfo;
        int i2;
        LapInfo lastLapInfo;
        int i3;
        int i4;
        LapInfo lastLapInfo2;
        byte[] bArr2 = bArr;
        t5t.m(TAG, "parseGpsDetail:" + tet.x(bArr));
        int length = bArr2.length;
        if (length % 8 != 0) {
            return;
        }
        int i5 = 0;
        while (i5 < length) {
            int i6 = bArr2[i5] & 255;
            if (this.kmPace > 0 && i6 != NodeType.NODE_TYPE_KM_1.getValue()) {
                t5t.d(TAG, "Wrong data");
            }
            int i7 = (bArr2[i5 + 1] & 255) * 1000;
            if (i7 < this.mLastRelTime) {
                this.mTotalTime += 255000;
            }
            this.mLastRelTime = i7;
            long j4 = this.mTotalTime + ((long) i7);
            if (i6 == NodeType.NODE_TYPE_HEARTRATE.getValue()) {
                sportDetail.addHeartRateInfo(new HeartRateInfo(j4, bArr2[i5 + 2] & 255));
            } else if (i6 == NodeType.NODE_TYPE_PACE_KM.getValue()) {
                int i8 = this.mLastKmPaceIndex + 1;
                this.mLastKmPaceIndex = i8;
                sportDetail.addKmPaceInfo(new KmPaceInfo(i8, (bArr2[i5 + 2] & 255) | ((bArr2[i5 + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else if (i6 == NodeType.NODE_TYPE_PACE_MILE.getValue()) {
                int i9 = this.mLastMilePaceIndex + 1;
                this.mLastMilePaceIndex = i9;
                sportDetail.addMilePaceInfo(new MilePaceInfo(i9, (bArr2[i5 + 2] & 255) | ((bArr2[i5 + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else {
                if (i6 == NodeType.NODE_TYPE_REALTIME_PACE.getValue()) {
                    int i10 = (bArr2[i5 + 2] & 255) | ((bArr2[i5 + 3] & 255) << 8);
                    GpsPoint gpsPoint = this.mLastGpsPoint;
                    if (gpsPoint != null) {
                        gpsPoint.setPace(i10);
                    }
                    sportDetail.addRtPaceInfo(new RtPaceInfo(j4, i10));
                } else {
                    if (i6 == NodeType.NODE_TYPE_GPS_POINT.getValue()) {
                        this.baseLng += (long) ((short) ((bArr2[i5 + 2] & 255) | ((bArr2[i5 + 3] & 255) << 8)));
                        this.baseLat += (long) ((short) ((bArr2[i5 + 4] & 255) | ((bArr2[i5 + 5] & 255) << 8)));
                        this.baseAlt += (long) ((short) ((bArr2[i5 + 6] & 255) | ((bArr2[i5 + 7] & 255) << 8)));
                        if (this.mLastNodeType == NodeType.NODE_TYPE_SPORT_PAUSE.getValue()) {
                            i = length;
                        } else {
                            i = length;
                            j2 = j4;
                            GpsPoint gpsPoint2 = getGpsPoint(j4, this.baseAlt, SportDetailParserUtils.convert(this.baseLat), SportDetailParserUtils.convert(this.baseLng));
                            sportDetail.addGpsPoint(gpsPoint2);
                            gpsPoint2.setPace(this.lastPace);
                            this.mLastGpsPoint = gpsPoint2;
                            this.mGpsIndex++;
                        }
                    } else {
                        i = length;
                        j2 = j4;
                        NodeType nodeType = NodeType.NODE_TYPE_SPORT_PAUSE;
                        if (i6 == nodeType.getValue()) {
                            GpsPoint gpsPoint3 = this.mLastGpsPoint;
                            if (gpsPoint3 != null) {
                                gpsPoint3.setState(2);
                            }
                            this.mLastNodeType = nodeType.getValue();
                            this.mLastPauseTime = j2;
                        } else {
                            NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_RESUME;
                            if (i6 == nodeType2.getValue()) {
                                this.mLastNodeType = nodeType2.getValue();
                                long j5 = this.mLastPauseTime;
                                sportDetail.addPauseInfo(new PauseInfo(j5, (int) (j2 - j5)));
                            } else if (i6 == NodeType.NODE_TYPE_SWIM.getValue()) {
                                j3 = j2;
                                sportDetail.addStrokeSpeedInfo(new StrokeSpeedInfo(j3, ((bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8)) / 1000.0f));
                            } else {
                                j3 = j2;
                                if (i6 == NodeType.NODE_TYPE_RT_VAL.getValue()) {
                                    sportDetail.addHeartRateInfo(new HeartRateInfo(j3, bArr[i5 + 2] & 255));
                                    int i11 = (bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8);
                                    GpsPoint gpsPoint4 = this.mLastGpsPoint;
                                    if (gpsPoint4 != null) {
                                        gpsPoint4.setPace(i11);
                                    }
                                    this.lastPace = i11;
                                    int i12 = bArr[i5 + 6] & 255;
                                    int i13 = bArr[i5 + 7] & 255;
                                    SportType sportType = this.sportType;
                                    if (sportType == SportType.SPORT_TYPE_OPEN_WATER_SWIM || sportType == SportType.SPORT_TYPE_POOL_SWIM) {
                                        sportDetail.addStrokeSpeedInfo(new StrokeSpeedInfo(j3, (i12 | (i13 << 8)) / 60.0f));
                                        sportDetail.addRtPaceInfo(new RtPaceInfo(j3, i11));
                                    } else {
                                        sportDetail.addRtPaceInfo(new RtPaceInfo(j3, i11, i12, i13));
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_KM_0.getValue()) {
                                    this.kmPace = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                    this.kmSpeed = ((bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8)) / 1000.0f;
                                } else if (i6 == NodeType.NODE_TYPE_KM_1.getValue()) {
                                    long j6 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                    int i14 = bArr[i5 + 6] & 255;
                                    if (this.kmPace > 0) {
                                        KmPaceInfo kmPaceInfo = new KmPaceInfo(kmIndex(this.distanceUnit, j6), (int) this.kmPace, this.mLastGpsPoint, this.mGpsIndex);
                                        kmPaceInfo.setTe(i14);
                                        kmPaceInfo.setSpeed(this.kmSpeed);
                                        sportDetail.addKmPaceInfo(kmPaceInfo);
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_LAP_COMMON_0.getValue()) {
                                    long j7 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                    int i15 = bArr[i5 + 6] & 255;
                                    int i16 = bArr[i5 + 7] & 255;
                                    LapInfo lapInfo = new LapInfo(i15);
                                    lapInfo.setTimeUsage(j7);
                                    lapInfo.setAvgHr(i16);
                                    lapInfo.setSportMode(this.sportMode);
                                    sportDetail.addLapInfo(lapInfo);
                                } else if (i6 == NodeType.NODE_TYPE_LAP_COMMON_1.getValue()) {
                                    long j8 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                    int i17 = (bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8);
                                    LapInfo lastLapInfo3 = getLastLapInfo(sportDetail);
                                    if (lastLapInfo3 != null) {
                                        lastLapInfo3.setOffsetToStart(j3 - j);
                                        lastLapInfo3.setLapDistance((int) j8);
                                        lastLapInfo3.setIndex(i17);
                                        lastLapInfo3.setAvgPace(j8 > 0 ? (lastLapInfo3.getTimeUsage() * 1.0f) / j8 : 0.0f);
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_LAP_COMMON_2.getValue()) {
                                    int i18 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8);
                                    int i19 = (bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8);
                                    int i20 = (bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8);
                                    LapInfo lastLapInfo4 = getLastLapInfo(sportDetail);
                                    if (lastLapInfo4 != null) {
                                        lastLapInfo4.setLapCalorie(i18);
                                        lastLapInfo4.setLapClimbUp(i19);
                                        lastLapInfo4.setLapClimbDown(i20);
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_LAP_SWIM.getValue()) {
                                    int i21 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8);
                                    int i22 = (bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8);
                                    LapInfo lastLapInfo5 = getLastLapInfo(sportDetail);
                                    if (lastLapInfo5 != null) {
                                        lastLapInfo5.setStrokeSpeed(i21);
                                        lastLapInfo5.setLapSwolf(i22);
                                        lastLapInfo5.setStrokes((int) ((i21 / 60.0f) * lastLapInfo5.getTimeUsage()));
                                    }
                                }
                            }
                            if (i6 == NodeType.NODE_TYPE_LAP_RUN_RIDE.getValue()) {
                                i3 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                i4 = (bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8);
                                lastLapInfo2 = getLastLapInfo(sportDetail);
                                if (lastLapInfo2 != null) {
                                    lastLapInfo2.setAscend(i3);
                                    lastLapInfo2.setMaxPace(i4 / 1000.0f);
                                }
                            } else if (i6 == NodeType.NODE_TYPE_LAP_FOOT.getValue()) {
                                i2 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8);
                                lastLapInfo = getLastLapInfo(sportDetail);
                                if (lastLapInfo != null) {
                                    lastLapInfo.setCadence(i2);
                                }
                            } else if (i6 == NodeType.NODE_TYPE_MARATHON_0.getValue()) {
                                long j9 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                MarathonInfo marathonInfo2 = new MarathonInfo(bArr[i5 + 6] & 255);
                                marathonInfo2.setTimeUsage(j9);
                                sportDetail.addMarathonInfo(marathonInfo2);
                            } else if (i6 == NodeType.NODE_TYPE_MARATHON_1.getValue()) {
                                long j10 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                                marathonInfo = sportDetail.getMarathonInfo();
                                if (marathonInfo == null && !marathonInfo.isEmpty()) {
                                    marathonInfo.get(marathonInfo.size() - 1).setDistance(j10);
                                }
                            } else if (i6 == NodeType.NODE_TYPE_ROW.getValue()) {
                                sportDetail.addRowInfo(new Row(j3, bArr[i5 + 2] & 255));
                            } else if (i6 == NodeType.NODE_TYPE_SKIPROPE.getValue()) {
                                sportDetail.addSkipRopeInfo(new SkipRope(j3, bArr[i5 + 2] & 255));
                            } else {
                                t5t.m(TAG, "dummy");
                            }
                        }
                    }
                    j3 = j2;
                    if (i6 == NodeType.NODE_TYPE_LAP_RUN_RIDE.getValue()) {
                        i3 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                        i4 = (bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8);
                        lastLapInfo2 = getLastLapInfo(sportDetail);
                        if (lastLapInfo2 != null) {
                            lastLapInfo2.setAscend(i3);
                            lastLapInfo2.setMaxPace(i4 / 1000.0f);
                        }
                    } else if (i6 == NodeType.NODE_TYPE_LAP_FOOT.getValue()) {
                        i2 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8);
                        lastLapInfo = getLastLapInfo(sportDetail);
                        if (lastLapInfo != null) {
                            lastLapInfo.setCadence(i2);
                        }
                    } else if (i6 == NodeType.NODE_TYPE_MARATHON_0.getValue()) {
                        long j11 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                        MarathonInfo marathonInfo3 = new MarathonInfo(bArr[i5 + 6] & 255);
                        marathonInfo3.setTimeUsage(j11);
                        sportDetail.addMarathonInfo(marathonInfo3);
                    } else if (i6 == NodeType.NODE_TYPE_MARATHON_1.getValue()) {
                        long j12 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                        marathonInfo = sportDetail.getMarathonInfo();
                        if (marathonInfo == null) {
                        }
                    } else if (i6 == NodeType.NODE_TYPE_ROW.getValue()) {
                        sportDetail.addRowInfo(new Row(j3, bArr[i5 + 2] & 255));
                    } else if (i6 == NodeType.NODE_TYPE_SKIPROPE.getValue()) {
                        sportDetail.addSkipRopeInfo(new SkipRope(j3, bArr[i5 + 2] & 255));
                    } else {
                        t5t.m(TAG, "dummy");
                    }
                }
                i5 += 8;
                bArr2 = bArr;
                length = i;
            }
            j3 = j4;
            i = length;
            if (i6 == NodeType.NODE_TYPE_LAP_RUN_RIDE.getValue()) {
                i3 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                i4 = (bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8);
                lastLapInfo2 = getLastLapInfo(sportDetail);
                if (lastLapInfo2 != null) {
                    lastLapInfo2.setAscend(i3);
                    lastLapInfo2.setMaxPace(i4 / 1000.0f);
                }
            } else if (i6 == NodeType.NODE_TYPE_LAP_FOOT.getValue()) {
                i2 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8);
                lastLapInfo = getLastLapInfo(sportDetail);
                if (lastLapInfo != null) {
                    lastLapInfo.setCadence(i2);
                }
            } else if (i6 == NodeType.NODE_TYPE_MARATHON_0.getValue()) {
                long j13 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                MarathonInfo marathonInfo4 = new MarathonInfo(bArr[i5 + 6] & 255);
                marathonInfo4.setTimeUsage(j13);
                sportDetail.addMarathonInfo(marathonInfo4);
            } else if (i6 == NodeType.NODE_TYPE_MARATHON_1.getValue()) {
                long j14 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8) | ((bArr[i5 + 4] & 255) << 16) | ((bArr[i5 + 5] & 255) << 24);
                marathonInfo = sportDetail.getMarathonInfo();
                if (marathonInfo == null) {
                }
            } else if (i6 == NodeType.NODE_TYPE_ROW.getValue()) {
                sportDetail.addRowInfo(new Row(j3, bArr[i5 + 2] & 255));
            } else if (i6 == NodeType.NODE_TYPE_SKIPROPE.getValue()) {
                sportDetail.addSkipRopeInfo(new SkipRope(j3, bArr[i5 + 2] & 255));
            } else {
                t5t.m(TAG, "dummy");
            }
            i5 += 8;
            bArr2 = bArr;
            length = i;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail sportDetail, byte[] bArr, long j) {
        parseGpsDetailVersion206(sportDetail, bArr, j);
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.t5t;
import defpackage.tet;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailParer205 implements ISportDetailDataParser {
    private static String TAG = "SportDetailParer205";
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
    private NodeType mLastNodeType;
    private long mLastPauseTime;
    private int mLastRelTime;
    private long mTotalTime;
    private int sportMode;

    public SportDetailParer205(SportSummary sportSummary) {
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mTotalTime = 0L;
        this.mLastRelTime = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.baseLng = 0L;
        this.baseLat = 0L;
        this.baseAlt = 0L;
        this.mLastPauseTime = 0L;
        this.distanceUnit = -1;
        this.lastPace = 0;
        this.sportMode = 0;
        this.kmPace = -1L;
        this.kmSpeed = -1.0f;
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
        this.distanceUnit = sportSummary.getDistanceUnit();
        this.sportMode = sportSummary.sportMode;
        this.lastPace = 0;
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
        long j2;
        if (i == 0) {
            j2 = j / 1000;
        } else {
            if (i != 1) {
                return 0;
            }
            j2 = j / 1069;
        }
        return (int) j2;
    }

    private void parseGpsDetailAneto(SportDetail sportDetail, byte[] bArr, long j) {
        t5t.m(TAG, "parseGpsDetail:" + tet.x(bArr));
        int length = bArr.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(bArr[i] & 255);
            if (this.kmPace > 0 && nodeTypeFromValue != NodeType.NODE_TYPE_KM_1) {
                t5t.d(TAG, "Wrong data");
            }
            int i2 = (bArr[i + 1] & 255) * 1000;
            if (i2 < this.mLastRelTime) {
                this.mTotalTime += 256000;
            }
            this.mLastRelTime = i2;
            long j2 = this.mTotalTime + ((long) i2);
            if (nodeTypeFromValue == NodeType.NODE_TYPE_HEARTRATE) {
                sportDetail.addHeartRateInfo(new HeartRateInfo(j2, bArr[i + 2] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.mLastKmPaceIndex + 1;
                this.mLastKmPaceIndex = i3;
                sportDetail.addKmPaceInfo(new KmPaceInfo(i3, (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                int i4 = this.mLastMilePaceIndex + 1;
                this.mLastMilePaceIndex = i4;
                sportDetail.addMilePaceInfo(new MilePaceInfo(i4, (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                int i5 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8);
                GpsPoint gpsPoint = this.mLastGpsPoint;
                if (gpsPoint != null) {
                    gpsPoint.setPace(i5);
                }
                sportDetail.addRtPaceInfo(new RtPaceInfo(j2, i5));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                long j3 = this.baseLng + ((long) ((short) ((bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8))));
                this.baseLng = j3;
                this.baseLat += (long) ((short) ((bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8)));
                this.baseAlt += (long) ((short) ((bArr[i + 6] & 255) | ((bArr[i + 7] & 255) << 8)));
                if (this.mLastNodeType != NodeType.NODE_TYPE_SPORT_PAUSE) {
                    GpsPoint gpsPoint2 = getGpsPoint(j2, this.baseAlt, SportDetailParserUtils.convert(this.baseLat), SportDetailParserUtils.convert(j3));
                    gpsPoint2.setPace(this.lastPace);
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
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_SWIM) {
                        sportDetail.addStrokeSpeedInfo(new StrokeSpeedInfo(j2, ((bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8)) / 1000.0f));
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_RT_VAL.getValue()) {
                        sportDetail.addHeartRateInfo(new HeartRateInfo(j2, bArr[i + 2] & 255));
                        int i6 = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8);
                        sportDetail.addRtPaceInfo(new RtPaceInfo(j2, i6, bArr[i + 6] & 255, bArr[i + 7] & 255));
                        this.lastPace = i6;
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_KM_0.getValue()) {
                        this.kmPace = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                        this.kmSpeed = ((bArr[i + 6] & 255) | ((bArr[i + 7] & 255) << 8)) / 1000.0f;
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_KM_1.getValue()) {
                        long j5 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                        int i7 = bArr[i + 6] & 255;
                        if (this.kmPace > 0) {
                            KmPaceInfo kmPaceInfo = new KmPaceInfo(kmIndex(this.distanceUnit, j5), (int) this.kmPace, this.mLastGpsPoint, this.mGpsIndex);
                            kmPaceInfo.setTe(i7);
                            kmPaceInfo.setSpeed(this.kmSpeed);
                            sportDetail.addKmPaceInfo(kmPaceInfo);
                        }
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_0.getValue()) {
                        long j6 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                        int i8 = bArr[i + 6] & 255;
                        int i9 = bArr[i + 7] & 255;
                        LapInfo lapInfo = new LapInfo(i8);
                        lapInfo.setTimeUsage(j6);
                        lapInfo.setAvgHr(i9);
                        sportDetail.addLapInfo(lapInfo);
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_COMMON_1) {
                        long j7 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                        int i10 = (bArr[i + 6] & 255) | ((bArr[i + 7] & 255) << 8);
                        LapInfo lastLapInfo = getLastLapInfo(sportDetail);
                        if (lastLapInfo != null) {
                            lastLapInfo.setOffsetToStart((j2 - j) / 1000);
                            lastLapInfo.setLapDistance((int) j7);
                            lastLapInfo.setIndex(i10);
                            lastLapInfo.setAvgPace(j7 > 0 ? (lastLapInfo.getTimeUsage() * 1.0f) / j7 : 0.0f);
                            lastLapInfo.setSportMode(this.sportMode);
                        }
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_COMMON_2) {
                        int i11 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8);
                        int i12 = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8);
                        int i13 = (bArr[i + 6] & 255) | ((bArr[i + 7] & 255) << 8);
                        LapInfo lastLapInfo2 = getLastLapInfo(sportDetail);
                        if (lastLapInfo2 != null) {
                            lastLapInfo2.setLapCalorie(i11);
                            lastLapInfo2.setLapClimbUp(i12);
                            lastLapInfo2.setLapClimbDown(i13);
                        }
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_SWIM) {
                        int i14 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8);
                        int i15 = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8);
                        LapInfo lastLapInfo3 = getLastLapInfo(sportDetail);
                        if (lastLapInfo3 != null) {
                            lastLapInfo3.setStrokeSpeed(i14);
                            lastLapInfo3.setStrokes((int) ((i14 / 60.0f) * lastLapInfo3.getTimeUsage()));
                            lastLapInfo3.setLapSwolf(i15);
                        }
                    }
                }
            }
            if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_RUN_RIDE) {
                int i16 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                int i17 = (bArr[i + 6] & 255) | ((bArr[i + 7] & 255) << 8);
                LapInfo lastLapInfo4 = getLastLapInfo(sportDetail);
                if (lastLapInfo4 != null) {
                    lastLapInfo4.setAscend(i16);
                    lastLapInfo4.setMaxPace(i17 / 1000.0f);
                }
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_FOOT) {
                int i18 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8);
                LapInfo lastLapInfo5 = getLastLapInfo(sportDetail);
                if (lastLapInfo5 != null) {
                    lastLapInfo5.setCadence(i18);
                }
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_MARATHON_0) {
                long j8 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                MarathonInfo marathonInfo = new MarathonInfo(bArr[i + 6] & 255);
                marathonInfo.setTimeUsage(j8);
                sportDetail.addMarathonInfo(marathonInfo);
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_MARATHON_1) {
                long j9 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8) | ((bArr[i + 4] & 255) << 16) | ((bArr[i + 5] & 255) << 24);
                MarathonInfo marathonInfo2 = sportDetail.getMarathonInfo().get(sportDetail.getMarathonInfo().size() - 1);
                if (marathonInfo2 != null) {
                    marathonInfo2.setDistance(j9);
                }
            } else {
                t5t.m(TAG, "dummy");
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail sportDetail, byte[] bArr, long j) {
        parseGpsDetailAneto(sportDetail, bArr, j);
    }
}

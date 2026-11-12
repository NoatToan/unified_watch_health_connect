package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.t5t;
import defpackage.tet;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailParser102 implements ISportDetailDataParser {
    private static String TAG = "SportDetailParser102";
    private long baseAlt;
    private long baseLat;
    private long baseLng;
    private int lastPace;
    private int mGpsIndex;
    private GpsPoint mLastGpsPoint;
    private int mLastHrRelTime;
    private int mLastKmPaceIndex;
    private int mLastMilePaceIndex;
    private NodeType mLastNodeType;
    private long mLastPauseTime;
    private int mLastRelTime;
    private long mTotalHrTime;
    private long mTotalTime;

    public SportDetailParser102(SportSummary sportSummary) {
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mTotalTime = 0L;
        this.mLastRelTime = 0;
        this.mTotalHrTime = 0L;
        this.mLastHrRelTime = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.baseLng = 0L;
        this.baseLat = 0L;
        this.baseAlt = 0L;
        this.mLastPauseTime = 0L;
        this.lastPace = 0;
        this.mLastKmPaceIndex = 0;
        this.mLastMilePaceIndex = 0;
        this.mLastGpsPoint = null;
        this.mGpsIndex = 0;
        this.mLastNodeType = nodeType;
        this.mLastRelTime = 0;
        this.mLastHrRelTime = 0;
        this.mTotalTime = sportSummary.getStartTime();
        this.mTotalHrTime = sportSummary.getStartTime();
        this.baseLng = sportSummary.getBaseLng();
        this.baseLat = sportSummary.getBaseLat();
        this.baseAlt = sportSummary.getBaseAlt();
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

    private HeartRateInfo getHeartRateInfo(int i, int i2) {
        if (i < this.mLastHrRelTime) {
            this.mTotalHrTime += 255000;
        }
        this.mLastHrRelTime = i;
        HeartRateInfo heartRateInfo = new HeartRateInfo(this.mTotalHrTime + ((long) i), i2);
        t5t.m(TAG, "HeartRateInfo:" + heartRateInfo);
        return heartRateInfo;
    }

    private void parseGpsDetail(SportDetail sportDetail, byte[] bArr) {
        t5t.m(TAG, "parseGpsDetail:" + tet.x(bArr));
        int length = bArr.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(bArr[i] & 255);
            int i2 = (bArr[i + 1] & 255) * 1000;
            NodeType nodeType = NodeType.NODE_TYPE_HEARTRATE;
            if (nodeTypeFromValue != nodeType) {
                if (i2 < this.mLastRelTime) {
                    this.mTotalTime += 255000;
                }
                this.mLastRelTime = i2;
            }
            long j = this.mTotalTime + ((long) i2);
            if (nodeTypeFromValue == nodeType) {
                sportDetail.addHeartRateInfo(getHeartRateInfo((bArr[i + 2] & 255) * 1000, bArr[i + 3] & 255));
                sportDetail.addHeartRateInfo(getHeartRateInfo((bArr[i + 4] & 255) * 1000, bArr[i + 5] & 255));
                sportDetail.addHeartRateInfo(getHeartRateInfo((bArr[i + 6] & 255) * 1000, bArr[i + 7] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.mLastKmPaceIndex + 1;
                this.mLastKmPaceIndex = i3;
                sportDetail.addKmPaceInfo(new KmPaceInfo(i3, (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                int i4 = this.mLastMilePaceIndex + 1;
                this.mLastMilePaceIndex = i4;
                sportDetail.addMilePaceInfo(new MilePaceInfo(i4, (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8), this.mLastGpsPoint, this.mGpsIndex));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                long j2 = this.baseLng + ((long) ((short) ((bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8))));
                this.baseLng = j2;
                this.baseLat += (long) ((short) ((bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8)));
                this.baseAlt += (long) ((short) ((bArr[i + 6] & 255) | ((bArr[i + 7] & 255) << 8)));
                if (this.mLastNodeType != NodeType.NODE_TYPE_SPORT_PAUSE) {
                    GpsPoint gpsPoint = getGpsPoint(j, this.baseAlt, SportDetailParserUtils.convert(this.baseLat), SportDetailParserUtils.convert(j2));
                    gpsPoint.setPace(this.lastPace);
                    sportDetail.addGpsPoint(gpsPoint);
                    this.mLastGpsPoint = gpsPoint;
                    this.mGpsIndex++;
                }
            } else {
                NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_PAUSE;
                if (nodeTypeFromValue == nodeType2) {
                    GpsPoint gpsPoint2 = this.mLastGpsPoint;
                    if (gpsPoint2 != null) {
                        gpsPoint2.setState(2);
                    }
                    this.mLastNodeType = nodeType2;
                    this.mLastPauseTime = j;
                } else {
                    NodeType nodeType3 = NodeType.NODE_TYPE_SPORT_RESUME;
                    if (nodeTypeFromValue == nodeType3) {
                        this.mLastNodeType = nodeType3;
                        long j3 = this.mLastPauseTime;
                        sportDetail.addPauseInfo(new PauseInfo(j3, (int) (j - j3)));
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                        int i5 = (bArr[i + 2] & 255) | ((bArr[i + 3] & 255) << 8);
                        t5t.d(TAG, "realtime Pace:" + i5);
                        GpsPoint gpsPoint3 = this.mLastGpsPoint;
                        if (gpsPoint3 != null) {
                            gpsPoint3.setPace(i5);
                        }
                        this.lastPace = i5;
                        sportDetail.addRtPaceInfo(new RtPaceInfo(j, i5));
                    }
                }
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail sportDetail, byte[] bArr, long j) {
        parseGpsDetail(sportDetail, bArr);
    }
}

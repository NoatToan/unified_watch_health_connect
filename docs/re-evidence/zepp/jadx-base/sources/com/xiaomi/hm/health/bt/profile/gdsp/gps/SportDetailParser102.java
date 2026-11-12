package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes18.dex */
public class SportDetailParser102 implements ISportDetailDataParser {
    private static String o = "SportDetailParser102";
    private int a;
    private int b;
    private GpsPoint c;
    private int d;
    private long e;
    private int f;
    private long g;
    private int h;
    private NodeType i;
    private long j;
    private long k;
    private long l;
    private long m;
    private int n;

    public SportDetailParser102(SportSummary sportSummary) {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        this.g = 0L;
        this.h = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.i = nodeType;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.i = nodeType;
        this.f = 0;
        this.h = 0;
        this.e = sportSummary.getStartTime();
        this.g = sportSummary.getStartTime();
        this.j = sportSummary.getBaseLng();
        this.k = sportSummary.getBaseLat();
        this.l = sportSummary.getBaseAlt();
        this.n = 0;
    }

    private GpsPoint a(long currentTime, double alt, double lat, double lng) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setAltitude(alt);
        gpsPoint.setLatitude(lat);
        gpsPoint.setLongitude(lng);
        gpsPoint.setTime(currentTime);
        Debug.i(o, "GpsPoint:" + gpsPoint);
        return gpsPoint;
    }

    private HeartRateInfo b(int relTime, int hr) {
        if (relTime < this.h) {
            this.g += 255000;
        }
        this.h = relTime;
        HeartRateInfo heartRateInfo = new HeartRateInfo(this.g + ((long) relTime), hr);
        Debug.i(o, "HeartRateInfo:" + heartRateInfo);
        return heartRateInfo;
    }

    private void c(SportDetail detail, byte[] value) {
        Debug.i(o, "parseGpsDetail:" + GattUtils.bytesToHexString(value));
        int length = value.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(value[i] & 255);
            int i2 = (value[i + 1] & 255) * 1000;
            NodeType nodeType = NodeType.NODE_TYPE_HEARTRATE;
            if (nodeTypeFromValue != nodeType) {
                if (i2 < this.f) {
                    this.e += 255000;
                }
                this.f = i2;
            }
            long j = this.e + ((long) i2);
            if (nodeTypeFromValue == nodeType) {
                detail.addHeartRateInfo(b((value[i + 2] & 255) * 1000, value[i + 3] & 255));
                detail.addHeartRateInfo(b((value[i + 4] & 255) * 1000, value[i + 5] & 255));
                detail.addHeartRateInfo(b((value[i + 6] & 255) * 1000, value[i + 7] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.a + 1;
                this.a = i3;
                detail.addKmPaceInfo(new KmPaceInfo(i3, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.c, this.d));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                int i4 = this.b + 1;
                this.b = i4;
                detail.addMilePaceInfo(new MilePaceInfo(i4, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.c, this.d));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                long j2 = this.j + ((long) ((short) ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8))));
                this.j = j2;
                this.k += (long) ((short) ((value[i + 4] & 255) | ((value[i + 5] & 255) << 8)));
                this.l += (long) ((short) ((value[i + 6] & 255) | ((value[i + 7] & 255) << 8)));
                if (this.i != NodeType.NODE_TYPE_SPORT_PAUSE) {
                    GpsPoint gpsPointA = a(j, this.l, SportDetailParserUtils.convert(this.k), SportDetailParserUtils.convert(j2));
                    gpsPointA.setPace(this.n);
                    detail.addGpsPoint(gpsPointA);
                    this.c = gpsPointA;
                    this.d++;
                }
            } else {
                NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_PAUSE;
                if (nodeTypeFromValue == nodeType2) {
                    GpsPoint gpsPoint = this.c;
                    if (gpsPoint != null) {
                        gpsPoint.setState(2);
                    }
                    this.i = nodeType2;
                    this.m = j;
                } else {
                    NodeType nodeType3 = NodeType.NODE_TYPE_SPORT_RESUME;
                    if (nodeTypeFromValue == nodeType3) {
                        this.i = nodeType3;
                        long j3 = this.m;
                        detail.addPauseInfo(new PauseInfo(j3, (int) (j - j3)));
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                        int i5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                        Debug.fi(o, "realtime Pace:" + i5);
                        GpsPoint gpsPoint2 = this.c;
                        if (gpsPoint2 != null) {
                            gpsPoint2.setPace(i5);
                        }
                        this.n = i5;
                        detail.addRtPaceInfo(new RtPaceInfo(j, i5));
                    }
                }
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail detail, byte[] value, long startTime) {
        c(detail, value);
    }
}

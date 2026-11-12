package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes18.dex */
public class SportDetailParer205 implements ISportDetailDataParser {
    private static String q = "SportDetailParer205";
    private int a;
    private int b;
    private GpsPoint c;
    private int d;
    private long e;
    private int f;
    private NodeType g;
    private long h;
    private long i;
    private long j;
    private long k;
    private int l;
    private int m;
    private int n;
    private long o;
    private float p;

    public SportDetailParer205(SportSummary summary) {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.g = nodeType;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = -1L;
        this.p = -1.0f;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.g = nodeType;
        this.f = 0;
        this.e = summary.getStartTime();
        this.h = summary.getBaseLng();
        this.i = summary.getBaseLat();
        this.j = summary.getBaseAlt();
        this.l = summary.getDistanceUnit();
        this.n = summary.c;
        this.m = 0;
    }

    private GpsPoint a(long currentTime, double alt, double lat, double lng) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setAltitude(alt);
        gpsPoint.setLatitude(lat);
        gpsPoint.setLongitude(lng);
        gpsPoint.setTime(currentTime);
        Debug.i(q, "GpsPoint:" + gpsPoint);
        return gpsPoint;
    }

    @Nullable
    private LapInfo b(SportDetail detail) {
        int size = detail.getLapInfos().size();
        if (size <= 0) {
            return null;
        }
        return detail.getLapInfos().get(size - 1);
    }

    private int c(int distanceUnit, long distance) {
        long j;
        if (distanceUnit == 0) {
            j = distance / 1000;
        } else {
            if (distanceUnit != 1) {
                return 0;
            }
            j = distance / 1069;
        }
        return (int) j;
    }

    private void d(SportDetail detail, byte[] value, long startTime) {
        Debug.i(q, "parseGpsDetail:" + GattUtils.bytesToHexString(value));
        int length = value.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(value[i] & 255);
            if (this.o > 0 && nodeTypeFromValue != NodeType.NODE_TYPE_KM_1) {
                Debug.fi(q, "Wrong data");
            }
            int i2 = (value[i + 1] & 255) * 1000;
            if (i2 < this.f) {
                this.e += 256000;
            }
            this.f = i2;
            long j = this.e + ((long) i2);
            if (nodeTypeFromValue == NodeType.NODE_TYPE_HEARTRATE) {
                detail.addHeartRateInfo(new HeartRateInfo(j, value[i + 2] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.a + 1;
                this.a = i3;
                detail.addKmPaceInfo(new KmPaceInfo(i3, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.c, this.d));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                int i4 = this.b + 1;
                this.b = i4;
                detail.addMilePaceInfo(new MilePaceInfo(i4, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.c, this.d));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                int i5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                GpsPoint gpsPoint = this.c;
                if (gpsPoint != null) {
                    gpsPoint.setPace(i5);
                }
                detail.addRtPaceInfo(new RtPaceInfo(j, i5));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                long j2 = this.h + ((long) ((short) ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8))));
                this.h = j2;
                this.i += (long) ((short) ((value[i + 4] & 255) | ((value[i + 5] & 255) << 8)));
                this.j += (long) ((short) ((value[i + 6] & 255) | ((value[i + 7] & 255) << 8)));
                if (this.g != NodeType.NODE_TYPE_SPORT_PAUSE) {
                    GpsPoint gpsPointA = a(j, this.j, SportDetailParserUtils.convert(this.i), SportDetailParserUtils.convert(j2));
                    gpsPointA.setPace(this.m);
                    detail.addGpsPoint(gpsPointA);
                    this.c = gpsPointA;
                    this.d++;
                }
            } else {
                NodeType nodeType = NodeType.NODE_TYPE_SPORT_PAUSE;
                if (nodeTypeFromValue == nodeType) {
                    GpsPoint gpsPoint2 = this.c;
                    if (gpsPoint2 != null) {
                        gpsPoint2.setState(2);
                    }
                    this.g = nodeType;
                    this.k = j;
                } else {
                    NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_RESUME;
                    if (nodeTypeFromValue == nodeType2) {
                        this.g = nodeType2;
                        long j3 = this.k;
                        detail.addPauseInfo(new PauseInfo(j3, (int) (j - j3)));
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_SWIM) {
                        detail.addStrokeSpeedInfo(new StrokeSpeedInfo(j, ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8)) / 1000.0f));
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_RT_VAL.getValue()) {
                        detail.addHeartRateInfo(new HeartRateInfo(j, value[i + 2] & 255));
                        int i6 = (value[i + 4] & 255) | ((value[i + 5] & 255) << 8);
                        detail.addRtPaceInfo(new RtPaceInfo(j, i6, value[i + 6] & 255, value[i + 7] & 255));
                        this.m = i6;
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_KM_0.getValue()) {
                        this.o = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                        this.p = ((value[i + 6] & 255) | ((value[i + 7] & 255) << 8)) / 1000.0f;
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_KM_1.getValue()) {
                        long j4 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                        int i7 = value[i + 6] & 255;
                        if (this.o > 0) {
                            KmPaceInfo kmPaceInfo = new KmPaceInfo(c(this.l, j4), (int) this.o, this.c, this.d);
                            kmPaceInfo.setTe(i7);
                            kmPaceInfo.setSpeed(this.p);
                            detail.addKmPaceInfo(kmPaceInfo);
                        }
                    } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_0.getValue()) {
                        long j5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                        int i8 = value[i + 6] & 255;
                        int i9 = value[i + 7] & 255;
                        LapInfo lapInfo = new LapInfo(i8);
                        lapInfo.setTimeUsage(j5);
                        lapInfo.setAvgHr(i9);
                        detail.addLapInfo(lapInfo);
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_COMMON_1) {
                        long j6 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                        int i10 = (value[i + 6] & 255) | ((value[i + 7] & 255) << 8);
                        LapInfo lapInfoB = b(detail);
                        if (lapInfoB != null) {
                            lapInfoB.setOffsetToStart((j - startTime) / 1000);
                            lapInfoB.setLapDistance((int) j6);
                            lapInfoB.setIndex(i10);
                            lapInfoB.setAvgPace(j6 > 0 ? (lapInfoB.getTimeUsage() * 1.0f) / j6 : 0.0f);
                            lapInfoB.setSportMode(this.n);
                        }
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_COMMON_2) {
                        int i11 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                        int i12 = (value[i + 4] & 255) | ((value[i + 5] & 255) << 8);
                        int i13 = (value[i + 6] & 255) | ((value[i + 7] & 255) << 8);
                        LapInfo lapInfoB2 = b(detail);
                        if (lapInfoB2 != null) {
                            lapInfoB2.setLapCalorie(i11);
                            lapInfoB2.setLapClimbUp(i12);
                            lapInfoB2.setLapClimbDown(i13);
                        }
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_SWIM) {
                        int i14 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                        int i15 = (value[i + 4] & 255) | ((value[i + 5] & 255) << 8);
                        LapInfo lapInfoB3 = b(detail);
                        if (lapInfoB3 != null) {
                            lapInfoB3.setStrokeSpeed(i14);
                            lapInfoB3.setStrokes((int) ((i14 / 60.0f) * lapInfoB3.getTimeUsage()));
                            lapInfoB3.setLapSwolf(i15);
                        }
                    }
                }
            }
            if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_RUN_RIDE) {
                int i16 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                int i17 = (value[i + 6] & 255) | ((value[i + 7] & 255) << 8);
                LapInfo lapInfoB4 = b(detail);
                if (lapInfoB4 != null) {
                    lapInfoB4.setAscend(i16);
                    lapInfoB4.setMaxPace(i17 / 1000.0f);
                }
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_LAP_FOOT) {
                int i18 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                LapInfo lapInfoB5 = b(detail);
                if (lapInfoB5 != null) {
                    lapInfoB5.setCadence(i18);
                }
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_MARATHON_0) {
                long j7 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                MarathonInfo marathonInfo = new MarathonInfo(value[i + 6] & 255);
                marathonInfo.setTimeUsage(j7);
                detail.addMarathonInfo(marathonInfo);
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_MARATHON_1) {
                long j8 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                MarathonInfo marathonInfo2 = detail.getMarathonInfo().get(detail.getMarathonInfo().size() - 1);
                if (marathonInfo2 != null) {
                    marathonInfo2.setDistance(j8);
                }
            } else {
                Debug.i(q, "dummy");
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail detail, byte[] value, long startTime) {
        d(detail, value, startTime);
    }
}

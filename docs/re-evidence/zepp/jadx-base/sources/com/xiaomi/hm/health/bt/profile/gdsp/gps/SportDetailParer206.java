package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportUtilsKt;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SportDetailParer206 implements ISportDetailDataParser {
    private static String r = "SportDetailParer206";
    private int a;
    private int b;
    private GpsPoint c;
    private int d;
    private long e;
    private int f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private int l;
    private int m;
    private long n;
    private float o;
    private int p;
    private SportType q;

    public SportDetailParer206(SportSummary summary) {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        NodeType nodeType = NodeType.NODE_TYPE_GPS_POINT;
        this.g = nodeType.getValue();
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = -1;
        this.m = 0;
        this.n = -1L;
        this.o = -1.0f;
        this.p = 0;
        this.q = SportType.SPORT_TYPE_NONE;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.g = nodeType.getValue();
        this.f = 0;
        this.e = summary.getStartTime();
        this.h = summary.getBaseLng();
        this.i = summary.getBaseLat();
        this.j = summary.getBaseAlt();
        this.l = summary.getDistanceUnit();
        this.p = summary.c;
        this.m = 0;
        this.q = summary.b;
    }

    private GpsPoint a(long currentTime, double alt, double lat, double lng) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setAltitude(alt);
        gpsPoint.setLatitude(lat);
        gpsPoint.setLongitude(lng);
        gpsPoint.setTime(currentTime);
        Debug.i(r, "GpsPoint:" + gpsPoint);
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
        return SportUtilsKt.fixedLapIndex(distanceUnit, distance);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0479  */
    /* JADX WARN: Code duplicated, block: B:102:0x047e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0486  */
    /* JADX WARN: Code duplicated, block: B:105:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:109:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x0501  */
    /* JADX WARN: Code duplicated, block: B:114:0x0509  */
    /* JADX WARN: Code duplicated, block: B:115:0x0518  */
    /* JADX WARN: Code duplicated, block: B:117:0x0520  */
    /* JADX WARN: Code duplicated, block: B:118:0x052f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0536 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x041b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0451  */
    /* JADX WARN: Code duplicated, block: B:97:0x045c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0464  */
    private void d(SportDetail detail, byte[] value, long startTime) {
        int i;
        long j;
        long j2;
        List<MarathonInfo> marathonInfo;
        int i2;
        LapInfo lapInfoB;
        int i3;
        int i4;
        LapInfo lapInfoB2;
        byte[] bArr = value;
        Debug.i(r, "parseGpsDetail:" + GattUtils.bytesToHexString(value));
        int length = bArr.length;
        if (length % 8 != 0) {
            return;
        }
        int i5 = 0;
        while (i5 < length) {
            int i6 = bArr[i5] & 255;
            if (this.n > 0 && i6 != NodeType.NODE_TYPE_KM_1.getValue()) {
                Debug.fi(r, "Wrong data");
            }
            int i7 = (bArr[i5 + 1] & 255) * 1000;
            if (i7 < this.f) {
                this.e += 255000;
            }
            this.f = i7;
            long j3 = this.e + ((long) i7);
            if (i6 == NodeType.NODE_TYPE_HEARTRATE.getValue()) {
                detail.addHeartRateInfo(new HeartRateInfo(j3, bArr[i5 + 2] & 255));
            } else if (i6 == NodeType.NODE_TYPE_PACE_KM.getValue()) {
                int i8 = this.a + 1;
                this.a = i8;
                detail.addKmPaceInfo(new KmPaceInfo(i8, (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8), this.c, this.d));
            } else if (i6 == NodeType.NODE_TYPE_PACE_MILE.getValue()) {
                int i9 = this.b + 1;
                this.b = i9;
                detail.addMilePaceInfo(new MilePaceInfo(i9, (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8), this.c, this.d));
            } else {
                if (i6 == NodeType.NODE_TYPE_REALTIME_PACE.getValue()) {
                    int i10 = (bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8);
                    GpsPoint gpsPoint = this.c;
                    if (gpsPoint != null) {
                        gpsPoint.setPace(i10);
                    }
                    detail.addRtPaceInfo(new RtPaceInfo(j3, i10));
                } else {
                    if (i6 == NodeType.NODE_TYPE_GPS_POINT.getValue()) {
                        this.h += (long) ((short) ((bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8)));
                        this.i += (long) ((short) ((bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8)));
                        this.j += (long) ((short) ((bArr[i5 + 6] & 255) | ((bArr[i5 + 7] & 255) << 8)));
                        if (this.g == NodeType.NODE_TYPE_SPORT_PAUSE.getValue()) {
                            i = length;
                        } else {
                            i = length;
                            j = j3;
                            GpsPoint gpsPointA = a(j3, this.j, SportDetailParserUtils.convert(this.i), SportDetailParserUtils.convert(this.h));
                            detail.addGpsPoint(gpsPointA);
                            gpsPointA.setPace(this.m);
                            this.c = gpsPointA;
                            this.d++;
                        }
                    } else {
                        i = length;
                        j = j3;
                        NodeType nodeType = NodeType.NODE_TYPE_SPORT_PAUSE;
                        if (i6 == nodeType.getValue()) {
                            GpsPoint gpsPoint2 = this.c;
                            if (gpsPoint2 != null) {
                                gpsPoint2.setState(2);
                            }
                            this.g = nodeType.getValue();
                            this.k = j;
                        } else {
                            NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_RESUME;
                            if (i6 == nodeType2.getValue()) {
                                this.g = nodeType2.getValue();
                                long j4 = this.k;
                                detail.addPauseInfo(new PauseInfo(j4, (int) (j - j4)));
                            } else if (i6 == NodeType.NODE_TYPE_SWIM.getValue()) {
                                j2 = j;
                                detail.addStrokeSpeedInfo(new StrokeSpeedInfo(j2, ((value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8)) / 1000.0f));
                            } else {
                                j2 = j;
                                if (i6 == NodeType.NODE_TYPE_RT_VAL.getValue()) {
                                    detail.addHeartRateInfo(new HeartRateInfo(j2, value[i5 + 2] & 255));
                                    int i11 = (value[i5 + 4] & 255) | ((value[i5 + 5] & 255) << 8);
                                    GpsPoint gpsPoint3 = this.c;
                                    if (gpsPoint3 != null) {
                                        gpsPoint3.setPace(i11);
                                    }
                                    this.m = i11;
                                    int i12 = value[i5 + 6] & 255;
                                    int i13 = value[i5 + 7] & 255;
                                    SportType sportType = this.q;
                                    if (sportType == SportType.SPORT_TYPE_OPEN_WATER_SWIM || sportType == SportType.SPORT_TYPE_POOL_SWIM) {
                                        detail.addStrokeSpeedInfo(new StrokeSpeedInfo(j2, (i12 | (i13 << 8)) / 60.0f));
                                        detail.addRtPaceInfo(new RtPaceInfo(j2, i11));
                                    } else {
                                        detail.addRtPaceInfo(new RtPaceInfo(j2, i11, i12, i13));
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_KM_0.getValue()) {
                                    this.n = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                    this.o = ((value[i5 + 6] & 255) | ((value[i5 + 7] & 255) << 8)) / 1000.0f;
                                } else if (i6 == NodeType.NODE_TYPE_KM_1.getValue()) {
                                    long j5 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                    int i14 = value[i5 + 6] & 255;
                                    if (this.n > 0) {
                                        KmPaceInfo kmPaceInfo = new KmPaceInfo(c(this.l, j5), (int) this.n, this.c, this.d);
                                        kmPaceInfo.setTe(i14);
                                        kmPaceInfo.setSpeed(this.o);
                                        detail.addKmPaceInfo(kmPaceInfo);
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_LAP_COMMON_0.getValue()) {
                                    long j6 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                    int i15 = value[i5 + 6] & 255;
                                    int i16 = value[i5 + 7] & 255;
                                    LapInfo lapInfo = new LapInfo(i15);
                                    lapInfo.setTimeUsage(j6);
                                    lapInfo.setAvgHr(i16);
                                    lapInfo.setSportMode(this.p);
                                    detail.addLapInfo(lapInfo);
                                } else if (i6 == NodeType.NODE_TYPE_LAP_COMMON_1.getValue()) {
                                    long j7 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                    int i17 = (value[i5 + 6] & 255) | ((value[i5 + 7] & 255) << 8);
                                    LapInfo lapInfoB3 = b(detail);
                                    if (lapInfoB3 != null) {
                                        lapInfoB3.setOffsetToStart(j2 - startTime);
                                        lapInfoB3.setLapDistance((int) j7);
                                        lapInfoB3.setIndex(i17);
                                        lapInfoB3.setAvgPace(j7 > 0 ? (lapInfoB3.getTimeUsage() * 1.0f) / j7 : 0.0f);
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_LAP_COMMON_2.getValue()) {
                                    int i18 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8);
                                    int i19 = (value[i5 + 4] & 255) | ((value[i5 + 5] & 255) << 8);
                                    int i20 = (value[i5 + 6] & 255) | ((value[i5 + 7] & 255) << 8);
                                    LapInfo lapInfoB4 = b(detail);
                                    if (lapInfoB4 != null) {
                                        lapInfoB4.setLapCalorie(i18);
                                        lapInfoB4.setLapClimbUp(i19);
                                        lapInfoB4.setLapClimbDown(i20);
                                    }
                                } else if (i6 == NodeType.NODE_TYPE_LAP_SWIM.getValue()) {
                                    int i21 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8);
                                    int i22 = (value[i5 + 4] & 255) | ((value[i5 + 5] & 255) << 8);
                                    LapInfo lapInfoB5 = b(detail);
                                    if (lapInfoB5 != null) {
                                        lapInfoB5.setStrokeSpeed(i21);
                                        lapInfoB5.setLapSwolf(i22);
                                        lapInfoB5.setStrokes((int) ((i21 / 60.0f) * lapInfoB5.getTimeUsage()));
                                    }
                                }
                            }
                            if (i6 == NodeType.NODE_TYPE_LAP_RUN_RIDE.getValue()) {
                                i3 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                i4 = (value[i5 + 6] & 255) | ((value[i5 + 7] & 255) << 8);
                                lapInfoB2 = b(detail);
                                if (lapInfoB2 != null) {
                                    lapInfoB2.setAscend(i3);
                                    lapInfoB2.setMaxPace(i4 / 1000.0f);
                                }
                            } else if (i6 == NodeType.NODE_TYPE_LAP_FOOT.getValue()) {
                                i2 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8);
                                lapInfoB = b(detail);
                                if (lapInfoB != null) {
                                    lapInfoB.setCadence(i2);
                                }
                            } else if (i6 == NodeType.NODE_TYPE_MARATHON_0.getValue()) {
                                long j8 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                MarathonInfo marathonInfo2 = new MarathonInfo(value[i5 + 6] & 255);
                                marathonInfo2.setTimeUsage(j8);
                                detail.addMarathonInfo(marathonInfo2);
                            } else if (i6 == NodeType.NODE_TYPE_MARATHON_1.getValue()) {
                                long j9 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                                marathonInfo = detail.getMarathonInfo();
                                if (marathonInfo == null && !marathonInfo.isEmpty()) {
                                    marathonInfo.get(marathonInfo.size() - 1).setDistance(j9);
                                }
                            } else if (i6 == NodeType.NODE_TYPE_ROW.getValue()) {
                                detail.addRowInfo(new Row(j2, value[i5 + 2] & 255));
                            } else if (i6 == NodeType.NODE_TYPE_SKIPROPE.getValue()) {
                                detail.addSkipRopeInfo(new SkipRope(j2, value[i5 + 2] & 255));
                            } else {
                                Debug.i(r, "dummy");
                            }
                        }
                    }
                    j2 = j;
                    if (i6 == NodeType.NODE_TYPE_LAP_RUN_RIDE.getValue()) {
                        i3 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                        i4 = (value[i5 + 6] & 255) | ((value[i5 + 7] & 255) << 8);
                        lapInfoB2 = b(detail);
                        if (lapInfoB2 != null) {
                            lapInfoB2.setAscend(i3);
                            lapInfoB2.setMaxPace(i4 / 1000.0f);
                        }
                    } else if (i6 == NodeType.NODE_TYPE_LAP_FOOT.getValue()) {
                        i2 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8);
                        lapInfoB = b(detail);
                        if (lapInfoB != null) {
                            lapInfoB.setCadence(i2);
                        }
                    } else if (i6 == NodeType.NODE_TYPE_MARATHON_0.getValue()) {
                        long j10 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                        MarathonInfo marathonInfo3 = new MarathonInfo(value[i5 + 6] & 255);
                        marathonInfo3.setTimeUsage(j10);
                        detail.addMarathonInfo(marathonInfo3);
                    } else if (i6 == NodeType.NODE_TYPE_MARATHON_1.getValue()) {
                        long j11 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                        marathonInfo = detail.getMarathonInfo();
                        if (marathonInfo == null) {
                        }
                    } else if (i6 == NodeType.NODE_TYPE_ROW.getValue()) {
                        detail.addRowInfo(new Row(j2, value[i5 + 2] & 255));
                    } else if (i6 == NodeType.NODE_TYPE_SKIPROPE.getValue()) {
                        detail.addSkipRopeInfo(new SkipRope(j2, value[i5 + 2] & 255));
                    } else {
                        Debug.i(r, "dummy");
                    }
                }
                i5 += 8;
                bArr = value;
                length = i;
            }
            j2 = j3;
            i = length;
            if (i6 == NodeType.NODE_TYPE_LAP_RUN_RIDE.getValue()) {
                i3 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                i4 = (value[i5 + 6] & 255) | ((value[i5 + 7] & 255) << 8);
                lapInfoB2 = b(detail);
                if (lapInfoB2 != null) {
                    lapInfoB2.setAscend(i3);
                    lapInfoB2.setMaxPace(i4 / 1000.0f);
                }
            } else if (i6 == NodeType.NODE_TYPE_LAP_FOOT.getValue()) {
                i2 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8);
                lapInfoB = b(detail);
                if (lapInfoB != null) {
                    lapInfoB.setCadence(i2);
                }
            } else if (i6 == NodeType.NODE_TYPE_MARATHON_0.getValue()) {
                long j12 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                MarathonInfo marathonInfo4 = new MarathonInfo(value[i5 + 6] & 255);
                marathonInfo4.setTimeUsage(j12);
                detail.addMarathonInfo(marathonInfo4);
            } else if (i6 == NodeType.NODE_TYPE_MARATHON_1.getValue()) {
                long j13 = (value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8) | ((value[i5 + 4] & 255) << 16) | ((value[i5 + 5] & 255) << 24);
                marathonInfo = detail.getMarathonInfo();
                if (marathonInfo == null) {
                }
            } else if (i6 == NodeType.NODE_TYPE_ROW.getValue()) {
                detail.addRowInfo(new Row(j2, value[i5 + 2] & 255));
            } else if (i6 == NodeType.NODE_TYPE_SKIPROPE.getValue()) {
                detail.addSkipRopeInfo(new SkipRope(j2, value[i5 + 2] & 255));
            } else {
                Debug.i(r, "dummy");
            }
            i5 += 8;
            bArr = value;
            length = i;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail detail, byte[] value, long startTime) {
        d(detail, value, startTime);
    }
}

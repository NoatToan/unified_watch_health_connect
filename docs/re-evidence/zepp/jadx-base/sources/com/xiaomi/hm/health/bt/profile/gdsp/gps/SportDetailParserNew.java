package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.sport.LapPace;
import com.xiaomi.hm.health.bt.profile.sport.SegmentDetail;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SportDetailParserNew implements ISportDetailDataParser {
    private static String p = "SportDetailParser102";
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
    private ByteArrayOutputStream n;
    private boolean o;

    public SportDetailParserNew(SportSummary sportSummary, boolean isTimeX) {
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
        this.l = 0;
        this.m = -1;
        this.n = new ByteArrayOutputStream();
        this.o = false;
        this.m = sportSummary.a;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.g = nodeType;
        this.f = 0;
        this.e = sportSummary.getStartTime();
        this.h = sportSummary.getBaseLng();
        this.i = sportSummary.getBaseLat();
        this.j = sportSummary.getBaseAlt();
        this.l = sportSummary.c;
        this.o = isTimeX;
    }

    private GpsPoint a(long currentTime, double alt, double lat, double lng) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setAltitude(alt);
        gpsPoint.setLatitude(lat);
        gpsPoint.setLongitude(lng);
        gpsPoint.setTime(currentTime);
        Debug.i(p, "GpsPoint:" + gpsPoint);
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

    private void c(SportDetail detail, byte[] value, int version, long startTime) {
        Debug.i(p, "parseGpsDetail:" + GattUtils.bytesToHexString(value));
        int length = value.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(value[i] & 255);
            Debug.fi(p, "NodeType:" + nodeTypeFromValue);
            int i2 = (value[i + 1] & 255) * 1000;
            Debug.fi(p, "relTime:" + i2);
            if (i2 < this.f) {
                this.e += 255000;
            }
            this.f = i2;
            long j = this.e + ((long) i2);
            if (nodeTypeFromValue == NodeType.NODE_TYPE_HEARTRATE) {
                detail.addHeartRateInfo(new HeartRateInfo(j, value[i + 2] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.a + 1;
                this.a = i3;
                detail.addKmPaceInfo(new KmPaceInfo(i3, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.c, this.d));
            } else {
                if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                    int i4 = this.b + 1;
                    this.b = i4;
                    detail.addMilePaceInfo(new MilePaceInfo(i4, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.c, this.d));
                } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                    int i5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                    GpsPoint gpsPoint = this.c;
                    if (gpsPoint != null) {
                        gpsPoint.setPace(i5);
                    }
                    if (version == 515) {
                        int i6 = (value[i + 4] & 255) | ((value[i + 5] & 255) << 8);
                        int i7 = (value[i + 6] & 255) | ((value[i + 7] & 255) << 8);
                        Debug.fi(p, "203 version cadence: " + i6 + ", stride: " + i7 + ", currTime: " + j);
                        RtPaceInfo rtPaceInfo = new RtPaceInfo(j, i5);
                        rtPaceInfo.setTime(j);
                        rtPaceInfo.setCadence(i6);
                        rtPaceInfo.setStride(i7);
                        detail.addRtPaceInfo(rtPaceInfo);
                    } else {
                        detail.addRtPaceInfo(new RtPaceInfo(j, i5));
                    }
                } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                    long j2 = this.h + ((long) ((short) ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8))));
                    this.h = j2;
                    this.i += (long) ((short) ((value[i + 4] & 255) | ((value[i + 5] & 255) << 8)));
                    this.j += (long) ((short) ((value[i + 6] & 255) | ((value[i + 7] & 255) << 8)));
                    if (this.g != NodeType.NODE_TYPE_SPORT_PAUSE) {
                        GpsPoint gpsPointA = a(j, this.j, SportDetailParserUtils.convert(this.i), SportDetailParserUtils.convert(j2));
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
                        } else if (nodeTypeFromValue == NodeType.NODE_TYPE_DUMMY || nodeTypeFromValue == NodeType.NODE_TYPE_TIME_CHANGE) {
                            Debug.i(p, "dummy");
                        } else if (nodeTypeFromValue == NodeType.NODE_TYPE_SWIM) {
                            detail.addStrokeSpeedInfo(new StrokeSpeedInfo(j, ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8)) / 1000.0f));
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_STEP_MODE.getValue() && this.o) {
                            g(detail, j, value, i + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_PACE_KM.getValue() && this.o) {
                            d(detail, value, i + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_SEGMENT_DETAIL.getValue() && this.o) {
                            f(detail, value, i + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_PACE_MILE.getValue() && this.o) {
                            e(detail, value, i + 2);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_0.getValue()) {
                            long j4 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                            int i8 = value[i + 6] & 255;
                            int i9 = value[i + 7] & 255;
                            LapInfo lapInfo = new LapInfo(i8);
                            lapInfo.setTimeUsage(j4);
                            lapInfo.setAvgHr(i9);
                            lapInfo.setSportMode(this.l);
                            detail.addLapInfo(lapInfo);
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_1.getValue()) {
                            long j5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8) | ((value[i + 4] & 255) << 16) | ((value[i + 5] & 255) << 24);
                            int i10 = (value[i + 6] & 255) | ((value[i + 7] & 255) << 8);
                            LapInfo lapInfoB = b(detail);
                            if (lapInfoB != null) {
                                lapInfoB.setOffsetToStart((j - startTime) / 1000);
                                lapInfoB.setLapDistance((int) j5);
                                lapInfoB.setIndex(i10);
                                lapInfoB.setAvgPace(j5 > 0 ? (lapInfoB.getTimeUsage() * 1.0f) / j5 : 0.0f);
                            }
                        } else if (nodeTypeFromValue.getValue() == NodeType.NODE_TYPE_LAP_COMMON_2.getValue()) {
                            int i11 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                            int i12 = (value[i + 4] & 255) | ((value[i + 5] & 255) << 8);
                            int i13 = (value[i + 6] & 255) | ((value[i + 7] & 255) << 8);
                            LapInfo lapInfoB2 = b(detail);
                            if (lapInfoB2 != null) {
                                lapInfoB2.setLapCalorie(i11);
                                lapInfoB2.setLapClimbUp(i12);
                                lapInfoB2.setLapClimbDown(i13);
                            }
                        }
                    }
                }
            }
        }
    }

    private int d(SportDetail detail, byte[] value, int offset) {
        byte[] bArr = new byte[6];
        System.arraycopy(value, offset, bArr, 0, 6);
        Debug.i(p, "parse KM LapPace: " + GattUtils.bytesToHexString(bArr));
        LapPace lapPace = new LapPace(bArr);
        Debug.i(p, "Parsed LapPace: " + lapPace);
        detail.addKmLapPace(lapPace);
        return 6;
    }

    private int e(SportDetail detail, byte[] value, int offset) {
        byte[] bArr = new byte[6];
        System.arraycopy(value, offset, bArr, 0, 6);
        Debug.i(p, "parse Mile LapPace: " + GattUtils.bytesToHexString(bArr));
        LapPace lapPace = new LapPace(bArr);
        Debug.i(p, "Parsed Mile LapPace: " + lapPace);
        detail.addMileLapPace(lapPace);
        return 6;
    }

    private int f(SportDetail detail, byte[] value, int offset) {
        byte[] bArr = new byte[6];
        System.arraycopy(value, offset, bArr, 0, 6);
        Debug.fi(p, "parseSegmentDetail: " + GattUtils.bytesToHexString(bArr));
        SegmentDetail segmentDetail = new SegmentDetail(bArr);
        Debug.fi(p, "Parsed SegmentDetail: " + segmentDetail);
        if (segmentDetail.isSegmentName()) {
            byte[] segmentNameByteArray = segmentDetail.getSegmentNameByteArray();
            this.n.write(segmentNameByteArray, 0, segmentNameByteArray.length);
            List<SegmentDetail> segments = detail.getSegments();
            if (segments != null && segments.size() > 0) {
                segments.get(segments.size() - 1).setSegmentName(ByteArrayKt.toString(this.n.toByteArray(), 0, -1));
            }
        } else {
            detail.addSegment(segmentDetail);
            this.n.reset();
        }
        return 6;
    }

    private int g(SportDetail detail, long time, byte[] value, int offset) {
        byte[] bArr = new byte[6];
        System.arraycopy(value, offset, bArr, 0, 6);
        Debug.i(p, "parseStepMode: " + GattUtils.bytesToHexString(bArr));
        TxStepMode txStepMode = new TxStepMode(time, bArr);
        Debug.i(p, "Parsed StepMode: " + txStepMode);
        detail.addTxStepMode(txStepMode);
        return 6;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser
    public void parser(SportDetail detail, byte[] value, long startTime) {
        c(detail, value, this.m, startTime);
    }
}

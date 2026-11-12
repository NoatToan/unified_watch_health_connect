package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.classic.HMSyncGpsDataProfile;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.NodeType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PauseInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RiddingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkiingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportAccumInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportStatisInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrokeSpeedInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SwimInfo;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes19.dex */
public class HMSyncGpsDataProfile extends HMProSyncDataBaseProfile {
    private final double d;
    private final double e;
    private int f;
    private int g;
    private int h;
    private GpsPoint i;
    private int j;
    private long k;
    private int l;
    private long m;
    private int n;
    private NodeType o;
    private long p;
    private long q;
    private long r;
    private long s;

    public HMSyncGpsDataProfile(ITransport transport) {
        super(transport);
        this.d = Math.pow(2.0d, 31.0d);
        this.e = Math.pow(2.0d, 32.0d);
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = 0;
        this.k = 0L;
        this.l = 0;
        this.m = 0L;
        this.n = 0;
        this.o = NodeType.NODE_TYPE_GPS_POINT;
        this.p = 0L;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
    }

    private double i(long value) {
        double d = value;
        if (d > this.d) {
            d -= this.e;
        }
        return new BigDecimal(d / 3000000.0d).setScale(8, 4).doubleValue();
    }

    private DataHeader j(Calendar startTime, byte type) {
        DataHeader dataHeader = getDataHeader(type, (short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone().getOffset(startTime.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar = dataHeader.calendar;
            calendar.setTimeInMillis(calendar.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar)));
        }
        return dataHeader;
    }

    private GpsPoint k(long currentTime, double alt, double lat, double lng) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setAltitude(alt);
        gpsPoint.setLatitude(lat);
        gpsPoint.setLongitude(lng);
        gpsPoint.setTime(currentTime);
        Debug.i(HMProSyncDataBaseProfile.TAG, "GpsPoint:" + gpsPoint);
        return gpsPoint;
    }

    private HeartRateInfo l(int relTime, int hr) {
        if (relTime < this.n) {
            this.m += 255000;
        }
        this.n = relTime;
        HeartRateInfo heartRateInfo = new HeartRateInfo(this.m + ((long) relTime), hr);
        Debug.i(HMProSyncDataBaseProfile.TAG, "HeartRateInfo:" + heartRateInfo);
        return heartRateInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(AtomicInteger atomicInteger, SportSummary sportSummary, SportDetail sportDetail, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "detail data:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        atomicInteger.getAndSet(atomicInteger.get() + length);
        if (sportSummary.getVersion() == 258) {
            q(sportDetail, bArr2);
        } else if (sportSummary.getVersion() >= 259) {
            r(sportDetail, bArr2);
        }
        int i2 = this.f;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            atomicBoolean.getAndSet(false);
        } else {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "missing package!!!");
            atomicBoolean.getAndSet(true);
            countDownLatch.countDown();
        }
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "detail control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "summary data:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        int i2 = this.f;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            atomicBoolean.set(false);
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi(HMProSyncDataBaseProfile.TAG, "exception:" + e.getMessage());
                atomicBoolean.set(true);
                countDownLatch.countDown();
            }
        } else {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "missing package!!!");
            atomicBoolean.set(true);
            countDownLatch.countDown();
        }
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "summary control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        countDownLatch.countDown();
    }

    private void q(SportDetail detail, byte[] value) {
        Debug.i(HMProSyncDataBaseProfile.TAG, "parseGpsDetail:" + GattUtils.bytesToHexString(value));
        int length = value.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(value[i] & 255);
            Debug.fi(HMProSyncDataBaseProfile.TAG, "NodeType:" + nodeTypeFromValue);
            int i2 = (value[i + 1] & 255) * 1000;
            Debug.fi(HMProSyncDataBaseProfile.TAG, "relTime:" + i2);
            NodeType nodeType = NodeType.NODE_TYPE_HEARTRATE;
            if (nodeTypeFromValue != nodeType) {
                if (i2 < this.l) {
                    this.k += 255000;
                }
                this.l = i2;
            }
            long j = this.k + ((long) i2);
            if (nodeTypeFromValue == nodeType) {
                detail.addHeartRateInfo(l((value[i + 2] & 255) * 1000, value[i + 3] & 255));
                detail.addHeartRateInfo(l((value[i + 4] & 255) * 1000, value[i + 5] & 255));
                detail.addHeartRateInfo(l((value[i + 6] & 255) * 1000, value[i + 7] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.g + 1;
                this.g = i3;
                detail.addKmPaceInfo(new KmPaceInfo(i3, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.i, this.j));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                int i4 = this.h + 1;
                this.h = i4;
                detail.addMilePaceInfo(new MilePaceInfo(i4, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.i, this.j));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                long j2 = this.p + ((long) ((short) ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8))));
                this.p = j2;
                this.q += (long) ((short) ((value[i + 4] & 255) | ((value[i + 5] & 255) << 8)));
                this.r += (long) ((short) ((value[i + 6] & 255) | ((value[i + 7] & 255) << 8)));
                if (this.o != NodeType.NODE_TYPE_SPORT_PAUSE) {
                    GpsPoint gpsPointK = k(j, this.r, i(this.q), i(j2));
                    detail.addGpsPoint(gpsPointK);
                    this.i = gpsPointK;
                    this.j++;
                }
            } else {
                NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_PAUSE;
                if (nodeTypeFromValue == nodeType2) {
                    GpsPoint gpsPoint = this.i;
                    if (gpsPoint != null) {
                        gpsPoint.setState(2);
                    }
                    this.o = nodeType2;
                    this.s = j;
                } else {
                    NodeType nodeType3 = NodeType.NODE_TYPE_SPORT_RESUME;
                    if (nodeTypeFromValue == nodeType3) {
                        this.o = nodeType3;
                        long j3 = this.s;
                        detail.addPauseInfo(new PauseInfo(j3, (int) (j - j3)));
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                        int i5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                        Debug.fi(HMProSyncDataBaseProfile.TAG, "realtime Pace:" + i5);
                        GpsPoint gpsPoint2 = this.i;
                        if (gpsPoint2 != null) {
                            gpsPoint2.setPace(i5);
                        }
                        detail.addRtPaceInfo(new RtPaceInfo(j, i5));
                    }
                }
            }
        }
    }

    private void r(SportDetail detail, byte[] value) {
        Debug.i(HMProSyncDataBaseProfile.TAG, "parseGpsDetail:" + GattUtils.bytesToHexString(value));
        int length = value.length;
        if (length % 8 != 0) {
            return;
        }
        for (int i = 0; i < length; i += 8) {
            NodeType nodeTypeFromValue = NodeType.fromValue(value[i] & 255);
            Debug.fi(HMProSyncDataBaseProfile.TAG, "NodeType:" + nodeTypeFromValue);
            int i2 = (value[i + 1] & 255) * 1000;
            Debug.fi(HMProSyncDataBaseProfile.TAG, "relTime:" + i2);
            if (i2 < this.l) {
                this.k += 255000;
            }
            this.l = i2;
            long j = this.k + ((long) i2);
            if (nodeTypeFromValue == NodeType.NODE_TYPE_HEARTRATE) {
                detail.addHeartRateInfo(new HeartRateInfo(j, value[i + 2] & 255));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_KM) {
                int i3 = this.g + 1;
                this.g = i3;
                detail.addKmPaceInfo(new KmPaceInfo(i3, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.i, this.j));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_PACE_MILE) {
                int i4 = this.h + 1;
                this.h = i4;
                detail.addMilePaceInfo(new MilePaceInfo(i4, (value[i + 2] & 255) | ((value[i + 3] & 255) << 8), this.i, this.j));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_REALTIME_PACE) {
                int i5 = (value[i + 2] & 255) | ((value[i + 3] & 255) << 8);
                GpsPoint gpsPoint = this.i;
                if (gpsPoint != null) {
                    gpsPoint.setPace(i5);
                }
                detail.addRtPaceInfo(new RtPaceInfo(j, i5));
            } else if (nodeTypeFromValue == NodeType.NODE_TYPE_GPS_POINT) {
                long j2 = this.p + ((long) ((short) ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8))));
                this.p = j2;
                this.q += (long) ((short) ((value[i + 4] & 255) | ((value[i + 5] & 255) << 8)));
                this.r += (long) ((short) ((value[i + 6] & 255) | ((value[i + 7] & 255) << 8)));
                if (this.o != NodeType.NODE_TYPE_SPORT_PAUSE) {
                    GpsPoint gpsPointK = k(j, this.r, i(this.q), i(j2));
                    detail.addGpsPoint(gpsPointK);
                    this.i = gpsPointK;
                    this.j++;
                }
            } else {
                NodeType nodeType = NodeType.NODE_TYPE_SPORT_PAUSE;
                if (nodeTypeFromValue == nodeType) {
                    GpsPoint gpsPoint2 = this.i;
                    if (gpsPoint2 != null) {
                        gpsPoint2.setState(2);
                    }
                    this.o = nodeType;
                    this.s = j;
                } else {
                    NodeType nodeType2 = NodeType.NODE_TYPE_SPORT_RESUME;
                    if (nodeTypeFromValue == nodeType2) {
                        this.o = nodeType2;
                        long j3 = this.s;
                        detail.addPauseInfo(new PauseInfo(j3, (int) (j - j3)));
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_DUMMY || nodeTypeFromValue == NodeType.NODE_TYPE_TIME_CHANGE) {
                        Debug.i(HMProSyncDataBaseProfile.TAG, "dummy");
                    } else if (nodeTypeFromValue == NodeType.NODE_TYPE_SWIM) {
                        detail.addStrokeSpeedInfo(new StrokeSpeedInfo(j, ((value[i + 2] & 255) | ((value[i + 3] & 255) << 8)) / 1000.0f));
                    }
                }
            }
        }
    }

    private SportSummary s(byte[] value) {
        int i;
        int i2;
        int i3;
        int i4;
        SportSummary sportSummary;
        SportSummary sportSummary2 = new SportSummary();
        int i5 = (value[0] & 255) | ((value[1] & 255) << 8);
        sportSummary2.setVersion(i5);
        SportType sportTypeFromValue = SportType.fromValue((value[2] & 255) | ((value[3] & 255) << 8));
        int i6 = 4;
        if (i5 == 514) {
            sportSummary2.setUserId((value[4] & 255) | ((value[5] & 255) << 8) | ((value[6] & 255) << 16) | ((value[7] & 255) << 24));
            i6 = 8;
        }
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        int i9 = (value[i6] & 255) | ((value[i7] & 255) << 8);
        int i10 = i8 + 1;
        int i11 = i9 | ((value[i8] & 255) << 16);
        int i12 = i10 + 1;
        long j = i11 | ((value[i10] & 255) << 24);
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        int i15 = (value[i12] & 255) | ((value[i13] & 255) << 8);
        int i16 = i14 + 1;
        int i17 = i15 | ((value[i14] & 255) << 16);
        int i18 = i16 + 1;
        long j2 = i17 | ((value[i16] & 255) << 24);
        int i19 = i18 + 1;
        int i20 = i19 + 1;
        int i21 = (value[i18] & 255) | ((value[i19] & 255) << 8);
        int i22 = i20 + 1;
        int i23 = i21 | ((value[i20] & 255) << 16);
        int i24 = i22 + 1;
        long j3 = i23 | ((value[i22] & 255) << 24);
        int i25 = i24 + 1;
        int i26 = i25 + 1;
        int i27 = (value[i24] & 255) | ((value[i25] & 255) << 8);
        int i28 = i26 + 1;
        int i29 = i27 | ((value[i26] & 255) << 16);
        int i30 = i28 + 1;
        long j4 = i29 | ((value[i28] & 255) << 24);
        int i31 = i30 + 1;
        int i32 = i31 + 1;
        int i33 = (value[i30] & 255) | ((value[i31] & 255) << 8);
        int i34 = i32 + 1;
        int i35 = i33 | ((value[i32] & 255) << 16);
        int i36 = i34 + 1;
        long j5 = i35 | ((value[i34] & 255) << 24);
        sportSummary2.setType(sportTypeFromValue);
        sportSummary2.setStartTime(j * 1000);
        sportSummary2.setEndTime(j2 * 1000);
        sportSummary2.setBaseLng(j3);
        sportSummary2.setBaseLat(j4);
        sportSummary2.setBaseAlt(j5);
        if (i5 < 512) {
            SportAccumInfo sportAccumInfo = new SportAccumInfo();
            int i37 = i36 + 1;
            int i38 = i37 + 1;
            int i39 = i38 + 1;
            int i40 = ((value[i37] & 255) << 8) | (value[i36] & 255) | ((value[i38] & 255) << 16);
            int i41 = i39 + 1;
            float fIntBitsToFloat = Float.intBitsToFloat(i40 | ((value[i39] & 255) << 24));
            int i42 = i41 + 1;
            int i43 = i42 + 1;
            int i44 = ((value[i42] & 255) << 8) | (value[i41] & 255);
            int i45 = i43 + 1;
            int i46 = i44 | ((value[i43] & 255) << 16);
            int i47 = i45 + 1;
            float fIntBitsToFloat2 = Float.intBitsToFloat(i46 | ((value[i45] & 255) << 24));
            int i48 = i47 + 1;
            int i49 = i48 + 1;
            int i50 = ((value[i48] & 255) << 8) | (value[i47] & 255);
            int i51 = i49 + 1;
            int i52 = i50 | ((value[i49] & 255) << 16);
            int i53 = i51 + 1;
            float fIntBitsToFloat3 = Float.intBitsToFloat(i52 | ((value[i51] & 255) << 24));
            int i54 = i53 + 1;
            int i55 = i54 + 1;
            int i56 = ((value[i54] & 255) << 8) | (value[i53] & 255);
            int i57 = i55 + 1;
            int i58 = i56 | ((value[i55] & 255) << 16);
            int i59 = i57 + 1;
            float fIntBitsToFloat4 = Float.intBitsToFloat(i58 | ((value[i57] & 255) << 24));
            int i60 = i59 + 1;
            int i61 = i60 + 1;
            int i62 = ((value[i60] & 255) << 8) | (value[i59] & 255);
            int i63 = i61 + 1;
            int i64 = i62 | ((value[i61] & 255) << 16);
            int i65 = i63 + 1;
            float fIntBitsToFloat5 = Float.intBitsToFloat(i64 | ((value[i63] & 255) << 24));
            int i66 = i65 + 1;
            int i67 = i66 + 1;
            int i68 = ((value[i66] & 255) << 8) | (value[i65] & 255);
            int i69 = i67 + 1;
            int i70 = i68 | ((value[i67] & 255) << 16);
            int i71 = i69 + 1;
            int i72 = i70 | ((value[i69] & 255) << 24);
            int i73 = i71 + 1;
            int i74 = i73 + 1;
            int i75 = ((value[i73] & 255) << 8) | (value[i71] & 255);
            int i76 = i74 + 1;
            int i77 = i76 + 1;
            int i78 = i75 | ((value[i74] & 255) << 16) | ((value[i76] & 255) << 24);
            int i79 = i77 + 1;
            int i80 = i79 + 1;
            int i81 = ((value[i79] & 255) << 8) | (value[i77] & 255);
            int i82 = i80 + 1;
            int i83 = ((value[i80] & 255) << 16) | i81;
            int i84 = i82 + 1;
            int i85 = i83 | ((value[i82] & 255) << 24);
            int i86 = i84 + 1;
            int i87 = i86 + 1;
            int i88 = (value[i84] & 255) | ((value[i86] & 255) << 8);
            int i89 = i87 + 1;
            int i90 = i89 + 1;
            int i91 = ((value[i87] & 255) << 16) | i88 | ((value[i89] & 255) << 24);
            int i92 = i90 + 1;
            int i93 = i92 + 1;
            int i94 = (value[i90] & 255) | ((value[i92] & 255) << 8);
            int i95 = i93 + 1;
            int i96 = i94 | ((value[i93] & 255) << 16);
            int i97 = i95 + 1;
            long j6 = i96 | ((value[i95] & 255) << 24);
            int i98 = i97 + 1;
            int i99 = value[i97] & 255;
            int i100 = i98 + 1;
            int i101 = ((value[i98] & 255) << 8) | i99;
            int i102 = i100 + 1;
            int i103 = i101 | ((value[i100] & 255) << 16);
            int i104 = i102 + 1;
            long j7 = i103 | ((value[i102] & 255) << 24);
            int i105 = i104 + 1;
            int i106 = value[i104] & 255;
            int i107 = i105 + 1;
            int i108 = ((value[i105] & 255) << 8) | i106;
            int i109 = i107 + 1;
            int i110 = i108 | ((value[i107] & 255) << 16);
            int i111 = i109 + 1;
            float fIntBitsToFloat6 = Float.intBitsToFloat(i110 | ((value[i109] & 255) << 24));
            int i112 = i111 + 1;
            int i113 = i112 + 1;
            int i114 = ((value[i112] & 255) << 8) | (value[i111] & 255);
            int i115 = i113 + 1;
            int i116 = ((value[i113] & 255) << 16) | i114;
            int i117 = i115 + 1;
            float fIntBitsToFloat7 = Float.intBitsToFloat(i116 | ((value[i115] & 255) << 24));
            int i118 = i117 + 1;
            int i119 = i118 + 1;
            int i120 = (value[i117] & 255) | ((value[i118] & 255) << 8);
            int i121 = i119 + 1;
            int i122 = ((value[i119] & 255) << 16) | i120;
            int i123 = i121 + 1;
            float fIntBitsToFloat8 = Float.intBitsToFloat(i122 | ((value[i121] & 255) << 24));
            int i124 = i123 + 1;
            int i125 = i124 + 1;
            int i126 = (value[i123] & 255) | ((value[i124] & 255) << 8);
            int i127 = i125 + 1;
            int i128 = ((value[i125] & 255) << 16) | i126;
            int i129 = i127 + 1;
            float fIntBitsToFloat9 = Float.intBitsToFloat(i128 | ((value[i127] & 255) << 24));
            int i130 = i129 + 1;
            int i131 = i130 + 1;
            int i132 = (value[i129] & 255) | ((value[i130] & 255) << 8);
            int i133 = i131 + 1;
            int i134 = ((value[i131] & 255) << 16) | i132;
            int i135 = i133 + 1;
            float fIntBitsToFloat10 = Float.intBitsToFloat(i134 | ((value[i133] & 255) << 24));
            int i136 = i135 + 1;
            int i137 = i136 + 1;
            int i138 = (value[i135] & 255) | ((value[i136] & 255) << 8);
            int i139 = i137 + 1;
            int i140 = ((value[i137] & 255) << 16) | i138;
            int i141 = i139 + 1;
            long j8 = i140 | ((value[i139] & 255) << 24);
            sportAccumInfo.setDistance(fIntBitsToFloat);
            sportAccumInfo.setAscendMeter(fIntBitsToFloat2);
            sportAccumInfo.setDescendMeter(fIntBitsToFloat3);
            sportAccumInfo.setMinAltitude(fIntBitsToFloat4);
            sportAccumInfo.setMaxAltitude(fIntBitsToFloat5);
            sportAccumInfo.setMinLatitude(i72);
            sportAccumInfo.setMaxLatitude(i78);
            sportAccumInfo.setMinLongitude(i85);
            sportAccumInfo.setMaxLongitude(i91);
            sportAccumInfo.setStep(j6);
            sportAccumInfo.setActiveTime(j7);
            sportAccumInfo.setSportCalories(fIntBitsToFloat6);
            sportAccumInfo.setMaxSpeed(fIntBitsToFloat7);
            sportAccumInfo.setMinPace(fIntBitsToFloat8);
            sportAccumInfo.setMaxPace(fIntBitsToFloat9);
            sportAccumInfo.setTotalStride(fIntBitsToFloat10);
            sportAccumInfo.setSecCountHasStep(j8);
            sportSummary2.setAccInfo(sportAccumInfo);
            if (j2 <= j) {
                Debug.i(HMProSyncDataBaseProfile.TAG, "endTime <= startTime,timezone changed maybe!");
                sportSummary2.setEndTime((j + j7) * 1000);
            }
            if (sportTypeFromValue == SportType.SPORT_TYPE_POOL_SWIM || sportTypeFromValue == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
                SwimInfo swimInfo = new SwimInfo();
                int i142 = i141 + 1;
                int i143 = i142 + 1;
                int i144 = i143 + 1;
                int i145 = (value[i141] & 255) | ((value[i142] & 255) << 8) | ((value[i143] & 255) << 16);
                int i146 = i144 + 1;
                float fIntBitsToFloat11 = Float.intBitsToFloat(i145 | ((value[i144] & 255) << 24));
                int i147 = i146 + 1;
                int i148 = i147 + 1;
                int i149 = (value[i146] & 255) | ((value[i147] & 255) << 8);
                int i150 = i148 + 1;
                int i151 = i149 | ((value[i148] & 255) << 16);
                int i152 = i150 + 1;
                float fIntBitsToFloat12 = Float.intBitsToFloat(i151 | ((value[i150] & 255) << 24));
                int i153 = i152 + 1;
                int i154 = i153 + 1;
                int i155 = ((value[i153] & 255) << 8) | (value[i152] & 255);
                int i156 = i154 + 1;
                int i157 = i155 | ((value[i154] & 255) << 16);
                int i158 = i156 + 1;
                float fIntBitsToFloat13 = Float.intBitsToFloat(i157 | ((value[i156] & 255) << 24));
                int i159 = i158 + 1;
                int i160 = i159 + 1;
                int i161 = ((value[i159] & 255) << 8) | (value[i158] & 255);
                int i162 = i160 + 1;
                int i163 = i162 + 1;
                int i164 = ((value[i162] & 255) << 8) | (value[i160] & 255);
                int i165 = i163 + 1;
                int i166 = value[i163] & 255;
                int i167 = i165 + 1;
                int i168 = value[i165] & 255;
                swimInfo.setDistancePerStroke(fIntBitsToFloat11);
                swimInfo.setAvgStrokeSpeed(fIntBitsToFloat12);
                swimInfo.setAvgPace(fIntBitsToFloat13);
                swimInfo.setStrokes(i161);
                swimInfo.setAvgSwolf(i164);
                swimInfo.setStkStyle(i166);
                swimInfo.setTrips(i168);
                swimInfo.setMaxStrokeSpeed(fIntBitsToFloat7);
                i = i167 + 10;
                sportSummary2.setSwimInfo(swimInfo);
            } else {
                RiddingInfo riddingInfo = new RiddingInfo();
                int i169 = i141 + 1;
                int i170 = i169 + 1;
                int i171 = i170 + 1;
                int i172 = (value[i141] & 255) | ((value[i169] & 255) << 8) | ((value[i170] & 255) << 16);
                int i173 = i171 + 1;
                float fIntBitsToFloat14 = Float.intBitsToFloat(i172 | ((value[i171] & 255) << 24));
                int i174 = i173 + 1;
                int i175 = i174 + 1;
                int i176 = (value[i173] & 255) | ((value[i174] & 255) << 8);
                int i177 = i175 + 1;
                int i178 = i176 | ((value[i175] & 255) << 16);
                int i179 = i177 + 1;
                float fIntBitsToFloat15 = Float.intBitsToFloat(i178 | ((value[i177] & 255) << 24));
                int i180 = i179 + 1;
                int i181 = i180 + 1;
                int i182 = ((value[i180] & 255) << 8) | (value[i179] & 255);
                int i183 = i181 + 1;
                int i184 = i182 | ((value[i181] & 255) << 16);
                int i185 = i183 + 1;
                long j9 = i184 | ((value[i183] & 255) << 24);
                int i186 = i185 + 1;
                int i187 = i186 + 1;
                int i188 = (value[i185] & 255) | ((value[i186] & 255) << 8);
                int i189 = i187 + 1;
                int i190 = i188 | ((value[i187] & 255) << 16);
                int i191 = i189 + 1;
                float fIntBitsToFloat16 = Float.intBitsToFloat(i190 | ((value[i189] & 255) << 24));
                int i192 = i191 + 1;
                int i193 = i192 + 1;
                int i194 = ((value[i192] & 255) << 8) | (value[i191] & 255);
                int i195 = i193 + 1;
                int i196 = i194 | ((value[i193] & 255) << 16);
                int i197 = i195 + 1;
                long j10 = i196 | ((value[i195] & 255) << 24);
                int i198 = i197 + 1;
                int i199 = i198 + 1;
                int i200 = (value[i197] & 255) | ((value[i198] & 255) << 8);
                int i201 = i199 + 1;
                int i202 = i200 | ((value[i199] & 255) << 16);
                int i203 = i201 + 1;
                float fIntBitsToFloat17 = Float.intBitsToFloat(i202 | ((value[i201] & 255) << 24));
                int i204 = i203 + 1;
                int i205 = i204 + 1;
                int i206 = ((value[i204] & 255) << 8) | (value[i203] & 255);
                int i207 = i205 + 1;
                int i208 = i206 | ((value[i205] & 255) << 16);
                i = i207 + 1;
                long j11 = i208 | ((value[i207] & 255) << 24);
                riddingInfo.setDistance3DAscend(fIntBitsToFloat14);
                riddingInfo.setSpeed3D(fIntBitsToFloat15);
                riddingInfo.setTimeAscend(j9);
                riddingInfo.setDistance3DDescend(fIntBitsToFloat16);
                riddingInfo.setTimeDescend(j10);
                riddingInfo.setDistance3DFlat(fIntBitsToFloat17);
                riddingInfo.setTimeFlat(j11);
                sportSummary2.setRiddingInfo(riddingInfo);
            }
            int i209 = i + 1;
            int i210 = i209 + 1;
            int i211 = i210 + 1;
            int i212 = i211 + 1;
            sportSummary2.setStatisInfo(new SportStatisInfo(((value[i209] & 255) << 8) | (value[i] & 255), ((value[i211] & 255) << 8) | (value[i210] & 255), ((value[i212 + 1] & 255) << 8) | (value[i212] & 255)));
            return sportSummary2;
        }
        SportAccumInfo sportAccumInfo2 = new SportAccumInfo();
        int i213 = i36 + 1;
        int i214 = i213 + 1;
        int i215 = i214 + 1;
        int i216 = ((value[i213] & 255) << 8) | (value[i36] & 255) | ((value[i214] & 255) << 16);
        int i217 = i215 + 1;
        long j12 = i216 | ((value[i215] & 255) << 24);
        int i218 = i217 + 1;
        int i219 = i218 + 1;
        int i220 = (value[i217] & 255) | ((value[i218] & 255) << 8);
        int i221 = i219 + 1;
        int i222 = i220 | ((value[i219] & 255) << 16);
        int i223 = i221 + 1;
        long j13 = i222 | ((value[i221] & 255) << 24);
        int i224 = i223 + 1;
        int i225 = i224 + 1;
        int i226 = (value[i223] & 255) | ((value[i224] & 255) << 8);
        int i227 = i225 + 1;
        int i228 = i226 | ((value[i225] & 255) << 16);
        int i229 = i227 + 1;
        int i230 = i228 | ((value[i227] & 255) << 24);
        int i231 = i229 + 1;
        int i232 = i231 + 1;
        int i233 = ((value[i231] & 255) << 8) | (value[i229] & 255);
        int i234 = i232 + 1;
        int i235 = i233 | ((value[i232] & 255) << 16);
        int i236 = i234 + 1;
        int i237 = i235 | ((value[i234] & 255) << 24);
        int i238 = i236 + 1;
        int i239 = i238 + 1;
        int i240 = ((value[i238] & 255) << 8) | (value[i236] & 255);
        int i241 = i239 + 1;
        int i242 = i240 | ((value[i239] & 255) << 16);
        int i243 = i241 + 1;
        int i244 = i242 | ((value[i241] & 255) << 24);
        int i245 = i243 + 1;
        int i246 = i245 + 1;
        int i247 = ((value[i245] & 255) << 8) | (value[i243] & 255);
        int i248 = i246 + 1;
        int i249 = i247 | ((value[i246] & 255) << 16);
        int i250 = i248 + 1;
        int i251 = i249 | ((value[i248] & 255) << 24);
        int i252 = i250 + 1;
        int i253 = i252 + 1;
        int i254 = ((value[i252] & 255) << 8) | (value[i250] & 255);
        int i255 = i253 + 1;
        int i256 = i254 | ((value[i253] & 255) << 16);
        int i257 = i255 + 1;
        float fIntBitsToFloat18 = Float.intBitsToFloat(i256 | ((value[i255] & 255) << 24));
        int i258 = i257 + 1;
        int i259 = i258 + 1;
        int i260 = ((value[i258] & 255) << 8) | (value[i257] & 255);
        int i261 = i259 + 1;
        int i262 = i260 | ((value[i259] & 255) << 16);
        int i263 = i261 + 1;
        float fIntBitsToFloat19 = Float.intBitsToFloat(i262 | ((value[i261] & 255) << 24));
        int i264 = i263 + 1;
        int i265 = i264 + 1;
        int i266 = ((value[i264] & 255) << 8) | (value[i263] & 255);
        int i267 = i265 + 1;
        int i268 = ((value[i265] & 255) << 16) | i266;
        int i269 = i267 + 1;
        float fIntBitsToFloat20 = Float.intBitsToFloat(i268 | ((value[i267] & 255) << 24));
        int i270 = i269 + 1;
        int i271 = i270 + 1;
        int i272 = (value[i269] & 255) | ((value[i270] & 255) << 8);
        int i273 = i271 + 1;
        int i274 = ((value[i271] & 255) << 16) | i272;
        int i275 = i273 + 1;
        float fIntBitsToFloat21 = Float.intBitsToFloat(i274 | ((value[i273] & 255) << 24));
        int i276 = i275 + 1;
        int i277 = i276 + 1;
        int i278 = (value[i275] & 255) | ((value[i276] & 255) << 8);
        int i279 = i277 + 1;
        int i280 = ((value[i277] & 255) << 16) | i278;
        int i281 = i279 + 1;
        float fIntBitsToFloat22 = Float.intBitsToFloat(i280 | ((value[i279] & 255) << 24));
        int i282 = i281 + 1;
        int i283 = i282 + 1;
        int i284 = (value[i281] & 255) | ((value[i282] & 255) << 8);
        int i285 = i283 + 1;
        int i286 = ((value[i283] & 255) << 16) | i284;
        int i287 = i285 + 1;
        float fIntBitsToFloat23 = Float.intBitsToFloat(i286 | ((value[i285] & 255) << 24));
        int i288 = i287 + 1;
        int i289 = i288 + 1;
        int i290 = (value[i287] & 255) | ((value[i288] & 255) << 8);
        int i291 = i289 + 1;
        int i292 = ((value[i289] & 255) << 16) | i290;
        int i293 = i291 + 1;
        float fIntBitsToFloat24 = Float.intBitsToFloat(i292 | ((value[i291] & 255) << 24));
        int i294 = i293 + 1;
        int i295 = i294 + 1;
        int i296 = (value[i293] & 255) | ((value[i294] & 255) << 8);
        int i297 = i295 + 1;
        int i298 = ((value[i295] & 255) << 16) | i296;
        int i299 = i297 + 1;
        float fIntBitsToFloat25 = Float.intBitsToFloat(i298 | ((value[i297] & 255) << 24));
        int i300 = i299 + 1;
        int i301 = i300 + 1;
        int i302 = (value[i299] & 255) | ((value[i300] & 255) << 8);
        int i303 = i301 + 1;
        int i304 = ((value[i301] & 255) << 16) | i302;
        int i305 = i303 + 1;
        float fIntBitsToFloat26 = Float.intBitsToFloat(i304 | ((value[i303] & 255) << 24));
        int i306 = i305 + 1;
        int i307 = i306 + 1;
        int i308 = (value[i305] & 255) | ((value[i306] & 255) << 8);
        int i309 = i307 + 1;
        int i310 = ((value[i307] & 255) << 16) | i308;
        int i311 = i309 + 1;
        float fIntBitsToFloat27 = Float.intBitsToFloat(i310 | ((value[i309] & 255) << 24));
        int i312 = i311 + 1;
        int i313 = i312 + 1;
        int i314 = (value[i311] & 255) | ((value[i312] & 255) << 8);
        int i315 = i313 + 1;
        int i316 = ((value[i313] & 255) << 16) | i314;
        int i317 = i315 + 1;
        float fIntBitsToFloat28 = Float.intBitsToFloat(i316 | ((value[i315] & 255) << 24));
        int i318 = i317 + 1;
        int i319 = i318 + 1;
        int i320 = (value[i317] & 255) | ((value[i318] & 255) << 8);
        int i321 = i319 + 1;
        int i322 = ((value[i319] & 255) << 16) | i320;
        int i323 = i321 + 1;
        float fIntBitsToFloat29 = Float.intBitsToFloat(i322 | ((value[i321] & 255) << 24));
        int i324 = i323 + 1;
        int i325 = i324 + 1;
        int i326 = (value[i323] & 255) | ((value[i324] & 255) << 8);
        int i327 = i325 + 1;
        int i328 = ((value[i325] & 255) << 16) | i326;
        int i329 = i327 + 1;
        float fIntBitsToFloat30 = Float.intBitsToFloat(i328 | ((value[i327] & 255) << 24));
        int i330 = i329 + 1;
        int i331 = i330 + 1;
        int i332 = (value[i329] & 255) | ((value[i330] & 255) << 8);
        int i333 = i331 + 1;
        int i334 = ((value[i331] & 255) << 16) | i332;
        int i335 = i333 + 1;
        float fIntBitsToFloat31 = Float.intBitsToFloat(i334 | ((value[i333] & 255) << 24));
        int i336 = i335 + 1;
        int i337 = i336 + 1;
        int i338 = (value[i335] & 255) | ((value[i336] & 255) << 8);
        int i339 = i337 + 1;
        int i340 = ((value[i337] & 255) << 16) | i338;
        int i341 = i339 + 1;
        float fIntBitsToFloat32 = Float.intBitsToFloat(i340 | ((value[i339] & 255) << 24));
        int i342 = i341 + 1;
        int i343 = i342 + 1;
        int i344 = (value[i341] & 255) | ((value[i342] & 255) << 8);
        int i345 = i343 + 1;
        int i346 = ((value[i343] & 255) << 16) | i344;
        int i347 = i345 + 1;
        float fIntBitsToFloat33 = Float.intBitsToFloat(i346 | ((value[i345] & 255) << 24));
        int i348 = i347 + 1;
        int i349 = i348 + 1;
        int i350 = (value[i347] & 255) | ((value[i348] & 255) << 8);
        int i351 = i349 + 1;
        int i352 = ((value[i349] & 255) << 16) | i350;
        int i353 = i351 + 1;
        float fIntBitsToFloat34 = Float.intBitsToFloat(i352 | ((value[i351] & 255) << 24));
        int i354 = i353 + 1;
        int i355 = i354 + 1;
        int i356 = (value[i353] & 255) | ((value[i354] & 255) << 8);
        int i357 = i355 + 1;
        int i358 = ((value[i355] & 255) << 16) | i356;
        int i359 = i357 + 1;
        float fIntBitsToFloat35 = Float.intBitsToFloat(i358 | ((value[i357] & 255) << 24));
        int i360 = i359 + 1;
        int i361 = i360 + 1;
        int i362 = (value[i359] & 255) | ((value[i360] & 255) << 8);
        int i363 = i361 + 1;
        int i364 = ((value[i361] & 255) << 16) | i362;
        int i365 = i363 + 1;
        float fIntBitsToFloat36 = Float.intBitsToFloat(i364 | ((value[i363] & 255) << 24));
        int i366 = i365 + 1;
        int i367 = i366 + 1;
        int i368 = (value[i365] & 255) | ((value[i366] & 255) << 8);
        int i369 = i367 + 1;
        int i370 = ((value[i367] & 255) << 16) | i368;
        int i371 = i369 + 1;
        float fIntBitsToFloat37 = Float.intBitsToFloat(i370 | ((value[i369] & 255) << 24));
        int i372 = i371 + 1;
        int i373 = i372 + 1;
        int i374 = (value[i371] & 255) | ((value[i372] & 255) << 8);
        int i375 = i373 + 1;
        int i376 = ((value[i373] & 255) << 16) | i374;
        int i377 = i375 + 1;
        long j14 = i376 | ((value[i375] & 255) << 24);
        sportAccumInfo2.setStep(j12);
        sportAccumInfo2.setActiveTime(j13);
        sportAccumInfo2.setMaxLatitude(i230);
        sportAccumInfo2.setMinLatitude(i237);
        sportAccumInfo2.setMaxLongitude(i244);
        sportAccumInfo2.setMinLongitude(i251);
        sportAccumInfo2.setSportCalories(fIntBitsToFloat18);
        sportAccumInfo2.setDistance(fIntBitsToFloat19);
        sportAccumInfo2.setAscendMeter(fIntBitsToFloat20);
        sportAccumInfo2.setDescendMeter(fIntBitsToFloat21);
        sportAccumInfo2.setMaxAltitude(fIntBitsToFloat22);
        sportAccumInfo2.setMinAltitude(fIntBitsToFloat23);
        sportAccumInfo2.setAvgAltitude(fIntBitsToFloat24);
        sportAccumInfo2.setMaxSpeed(fIntBitsToFloat25);
        sportAccumInfo2.setMinSpeed(fIntBitsToFloat26);
        sportAccumInfo2.setAvgSpeed(fIntBitsToFloat27);
        sportAccumInfo2.setMaxPace(fIntBitsToFloat28);
        sportAccumInfo2.setMinPace(fIntBitsToFloat29);
        sportAccumInfo2.setAvgPace(fIntBitsToFloat30);
        sportAccumInfo2.setMaxCadence(fIntBitsToFloat31);
        sportAccumInfo2.setMinCadence(fIntBitsToFloat32);
        sportAccumInfo2.setAvgCadence(fIntBitsToFloat33);
        sportAccumInfo2.setMaxStride(fIntBitsToFloat34);
        sportAccumInfo2.setMinStride(fIntBitsToFloat35);
        sportAccumInfo2.setAvgStride(fIntBitsToFloat36);
        sportAccumInfo2.setDistanceHasStep(fIntBitsToFloat37);
        sportAccumInfo2.setStepHasDistance(j14);
        SportSummary sportSummary3 = sportSummary2;
        sportSummary3.setAccInfo(sportAccumInfo2);
        if (i5 >= 513) {
            int i378 = i377 + 1;
            int i379 = i378 + 1;
            int i380 = (value[i377] & 255) | ((value[i378] & 255) << 8);
            int i381 = i379 + 1;
            int i382 = i381 + 1;
            int i383 = (value[i379] & 255) | ((value[i381] & 255) << 8);
            int i384 = i382 + 1;
            int i385 = i384 + 1;
            int i386 = ((value[i384] & 255) << 8) | (value[i382] & 255);
            int i387 = i385 + 1;
            i2 = i387 + 1;
            sportSummary3.setStatisInfo(new SportStatisInfo(i380, i383, i386, (value[i385] & 255) | ((value[i387] & 255) << 8)));
        } else {
            i2 = i377;
        }
        if (sportTypeFromValue == SportType.SPORT_TYPE_POOL_SWIM || sportTypeFromValue == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            i3 = i5;
            SwimInfo swimInfo2 = new SwimInfo();
            int i388 = i2 + 1;
            int i389 = i388 + 1;
            int i390 = i389 + 1;
            int i391 = ((value[i388] & 255) << 8) | (value[i2] & 255) | ((value[i389] & 255) << 16);
            int i392 = i390 + 1;
            float fIntBitsToFloat38 = Float.intBitsToFloat(i391 | ((value[i390] & 255) << 24));
            int i393 = i392 + 1;
            int i394 = i393 + 1;
            int i395 = ((value[i393] & 255) << 8) | (value[i392] & 255);
            int i396 = i394 + 1;
            int i397 = i395 | ((value[i394] & 255) << 16);
            int i398 = i396 + 1;
            float fIntBitsToFloat39 = Float.intBitsToFloat(i397 | ((value[i396] & 255) << 24));
            int i399 = i398 + 1;
            int i400 = i399 + 1;
            int i401 = ((value[i399] & 255) << 8) | (value[i398] & 255);
            int i402 = i400 + 1;
            int i403 = i401 | ((value[i400] & 255) << 16);
            int i404 = i402 + 1;
            float fIntBitsToFloat40 = Float.intBitsToFloat(i403 | ((value[i402] & 255) << 24));
            int i405 = i404 + 1;
            int i406 = i405 + 1;
            int i407 = ((value[i405] & 255) << 8) | (value[i404] & 255);
            int i408 = i406 + 1;
            int i409 = i407 | ((value[i406] & 255) << 16);
            int i410 = i408 + 1;
            float fIntBitsToFloat41 = Float.intBitsToFloat(i409 | ((value[i408] & 255) << 24));
            int i411 = i410 + 1;
            int i412 = i411 + 1;
            int i413 = ((value[i411] & 255) << 8) | (value[i410] & 255);
            int i414 = i412 + 1;
            int i415 = i413 | ((value[i412] & 255) << 16);
            int i416 = i414 + 1;
            float fIntBitsToFloat42 = Float.intBitsToFloat(i415 | ((value[i414] & 255) << 24));
            int i417 = i416 + 1;
            int i418 = i417 + 1;
            int i419 = ((value[i417] & 255) << 8) | (value[i416] & 255);
            int i420 = i418 + 1;
            int i421 = i419 | ((value[i418] & 255) << 16);
            int i422 = i420 + 1;
            float fIntBitsToFloat43 = Float.intBitsToFloat(i421 | ((value[i420] & 255) << 24));
            int i423 = i422 + 1;
            int i424 = i423 + 1;
            int i425 = ((value[i423] & 255) << 8) | (value[i422] & 255);
            int i426 = i424 + 1;
            int i427 = i426 + 1;
            int i428 = ((value[i426] & 255) << 8) | (value[i424] & 255);
            int i429 = i427 + 1;
            int i430 = i429 + 1;
            int i431 = ((value[i429] & 255) << 8) | (value[i427] & 255);
            int i432 = i430 + 1;
            int i433 = i432 + 1;
            int i434 = ((value[i432] & 255) << 8) | (value[i430] & 255);
            int i435 = i433 + 1;
            int i436 = value[i433] & 255;
            int i437 = i435 + 1;
            int i438 = i436 | ((value[i435] & 255) << 8);
            int i439 = i437 + 1;
            int i440 = value[i437] & 255;
            int i441 = i439 + 1;
            int i442 = value[i439] & 255;
            swimInfo2.setRealtimeDPS(fIntBitsToFloat38);
            swimInfo2.setDistancePerStroke(fIntBitsToFloat39);
            swimInfo2.setAvgStrokeSpeed(fIntBitsToFloat43);
            swimInfo2.setAvgPace(fIntBitsToFloat30);
            swimInfo2.setStrokes(i425);
            swimInfo2.setAvgSwolf(i438);
            swimInfo2.setStkStyle(i440);
            swimInfo2.setTrips(i442);
            swimInfo2.setMaxStrokeSpeed(fIntBitsToFloat25);
            swimInfo2.setRealtimeStrokeSpeed(fIntBitsToFloat40);
            swimInfo2.setMaxStrokeSpeed(fIntBitsToFloat41);
            swimInfo2.setMinStrokeSpeed(fIntBitsToFloat42);
            swimInfo2.setRealtimeSwolf(i428);
            swimInfo2.setMaxSwolf(i431);
            swimInfo2.setMinSwolf(i434);
            i4 = i441 + 10;
            sportSummary = sportSummary3;
            sportSummary.setSwimInfo(swimInfo2);
        } else {
            if (sportTypeFromValue == SportType.SPORT_TYPE_SKIING) {
                SkiingInfo skiingInfo = new SkiingInfo();
                int i443 = i2 + 1;
                int i444 = i443 + 1;
                int i445 = i444 + 1;
                int i446 = ((value[i443] & 255) << 8) | (value[i2] & 255) | ((value[i444] & 255) << 16);
                int i447 = i445 + 1;
                float fIntBitsToFloat44 = Float.intBitsToFloat(i446 | ((value[i445] & 255) << 24));
                int i448 = i447 + 1;
                int i449 = i448 + 1;
                int i450 = ((value[i448] & 255) << 8) | (value[i447] & 255);
                int i451 = i449 + 1;
                int i452 = i450 | ((value[i449] & 255) << 16);
                int i453 = i451 + 1;
                float fIntBitsToFloat45 = Float.intBitsToFloat(i452 | ((value[i451] & 255) << 24));
                int i454 = i453 + 1;
                int i455 = i454 + 1;
                int i456 = ((value[i454] & 255) << 8) | (value[i453] & 255);
                int i457 = i455 + 1;
                int i458 = i456 | ((value[i455] & 255) << 16);
                int i459 = i457 + 1;
                float fIntBitsToFloat46 = Float.intBitsToFloat(i458 | ((value[i457] & 255) << 24));
                int i460 = i459 + 1;
                int i461 = i460 + 1;
                int i462 = ((value[i460] & 255) << 8) | (value[i459] & 255);
                int i463 = i461 + 1;
                int i464 = i462 | ((value[i461] & 255) << 16);
                int i465 = i463 + 1;
                float fIntBitsToFloat47 = Float.intBitsToFloat(i464 | ((value[i463] & 255) << 24));
                int i466 = i465 + 1;
                int i467 = i466 + 1;
                int i468 = ((value[i466] & 255) << 8) | (value[i465] & 255);
                int i469 = i467 + 1;
                int i470 = i468 | ((value[i467] & 255) << 16);
                int i471 = i469 + 1;
                float fIntBitsToFloat48 = Float.intBitsToFloat(i470 | ((value[i469] & 255) << 24));
                int i472 = i471 + 1;
                int i473 = i472 + 1;
                int i474 = ((value[i472] & 255) << 8) | (value[i471] & 255);
                int i475 = i473 + 1;
                int i476 = i474 | ((value[i473] & 255) << 16);
                int i477 = i475 + 1;
                float fIntBitsToFloat49 = Float.intBitsToFloat(i476 | ((value[i475] & 255) << 24));
                int i478 = i477 + 1;
                int i479 = i478 + 1;
                int i480 = ((value[i478] & 255) << 8) | (value[i477] & 255);
                int i481 = i479 + 1;
                int i482 = i480 | ((value[i479] & 255) << 16);
                int i483 = i481 + 1;
                float fIntBitsToFloat50 = Float.intBitsToFloat(i482 | ((value[i481] & 255) << 24));
                int i484 = i483 + 1;
                int i485 = i484 + 1;
                int i486 = ((value[i484] & 255) << 8) | (value[i483] & 255);
                int i487 = i485 + 1;
                int i488 = i486 | ((value[i485] & 255) << 16);
                int i489 = i487 + 1;
                float fIntBitsToFloat51 = Float.intBitsToFloat(i488 | ((value[i487] & 255) << 24));
                int i490 = i489 + 1;
                int i491 = i490 + 1;
                int i492 = ((value[i490] & 255) << 8) | (value[i489] & 255);
                int i493 = i491 + 1;
                int i494 = i492 | ((value[i491] & 255) << 16);
                int i495 = i493 + 1;
                float fIntBitsToFloat52 = Float.intBitsToFloat(i494 | ((value[i493] & 255) << 24));
                int i496 = i495 + 1;
                int i497 = i496 + 1;
                int i498 = ((value[i496] & 255) << 8) | (value[i495] & 255);
                int i499 = i497 + 1;
                int i500 = i498 | ((value[i497] & 255) << 16);
                int i501 = i499 + 1;
                float fIntBitsToFloat53 = Float.intBitsToFloat(i500 | ((value[i499] & 255) << 24));
                int i502 = i501 + 1;
                int i503 = i502 + 1;
                int i504 = ((value[i502] & 255) << 8) | (value[i501] & 255);
                int i505 = i503 + 1;
                int i506 = i504 | ((value[i503] & 255) << 16);
                int i507 = i505 + 1;
                float fIntBitsToFloat54 = Float.intBitsToFloat(i506 | ((value[i505] & 255) << 24));
                int i508 = i507 + 1;
                int i509 = i508 + 1;
                int i510 = ((value[i508] & 255) << 8) | (value[i507] & 255);
                int i511 = i509 + 1;
                i3 = i5;
                int i512 = ((value[i509] & 255) << 16) | i510;
                int i513 = i511 + 1;
                float fIntBitsToFloat55 = Float.intBitsToFloat(i512 | ((value[i511] & 255) << 24));
                int i514 = i513 + 1;
                int i515 = i514 + 1;
                int i516 = (value[i513] & 255) | ((value[i514] & 255) << 8);
                int i517 = i515 + 1;
                int i518 = ((value[i515] & 255) << 16) | i516;
                int i519 = i517 + 1;
                float fIntBitsToFloat56 = Float.intBitsToFloat(i518 | ((value[i517] & 255) << 24));
                int i520 = i519 + 1;
                int i521 = i520 + 1;
                int i522 = (value[i519] & 255) | ((value[i520] & 255) << 8);
                int i523 = i521 + 1;
                int i524 = ((value[i521] & 255) << 16) | i522;
                int i525 = i523 + 1;
                float fIntBitsToFloat57 = Float.intBitsToFloat(i524 | ((value[i523] & 255) << 24));
                int i526 = i525 + 1;
                i4 = i526 + 1;
                int i527 = (value[i525] & 255) | ((value[i526] & 255) << 8);
                skiingInfo.setTripDistance(fIntBitsToFloat45);
                skiingInfo.setTripAvgSpeed(fIntBitsToFloat46);
                skiingInfo.setTripMaxSpeed(fIntBitsToFloat47);
                skiingInfo.setTripAcmDescendMeter(fIntBitsToFloat52);
                skiingInfo.setTotalTripsAcmDescendMeter(fIntBitsToFloat53);
                skiingInfo.setMaxSlope(fIntBitsToFloat54);
                skiingInfo.setAvgSlope(fIntBitsToFloat55);
                skiingInfo.setTripSlope(fIntBitsToFloat57);
                skiingInfo.setTrips(i527);
                skiingInfo.setTotalTripsAcmDistance(fIntBitsToFloat44);
                skiingInfo.setAvgSpeed(fIntBitsToFloat49);
                skiingInfo.setTripMinSpeed(fIntBitsToFloat48);
                skiingInfo.setMaxSpeed(fIntBitsToFloat50);
                skiingInfo.setMinSpeed(fIntBitsToFloat51);
                skiingInfo.setMinSlope(fIntBitsToFloat56);
                sportSummary3 = sportSummary3;
                sportSummary3.setSkiingInfo(skiingInfo);
            } else {
                i3 = i5;
                if (sportTypeFromValue == SportType.SPORT_TYPE_RIDING) {
                    RiddingInfo riddingInfo2 = new RiddingInfo();
                    int i528 = i2 + 1;
                    int i529 = i528 + 1;
                    int i530 = i529 + 1;
                    int i531 = ((value[i528] & 255) << 8) | (value[i2] & 255) | ((value[i529] & 255) << 16);
                    int i532 = i530 + 1;
                    float fIntBitsToFloat58 = Float.intBitsToFloat(i531 | ((value[i530] & 255) << 24));
                    int i533 = i532 + 1;
                    int i534 = i533 + 1;
                    int i535 = ((value[i533] & 255) << 8) | (value[i532] & 255);
                    int i536 = i534 + 1;
                    int i537 = i535 | ((value[i534] & 255) << 16);
                    int i538 = i536 + 1;
                    float fIntBitsToFloat59 = Float.intBitsToFloat(i537 | ((value[i536] & 255) << 24));
                    int i539 = i538 + 1;
                    int i540 = i539 + 1;
                    int i541 = ((value[i539] & 255) << 8) | (value[i538] & 255);
                    int i542 = i540 + 1;
                    int i543 = i541 | ((value[i540] & 255) << 16);
                    int i544 = i542 + 1;
                    long j15 = i543 | ((value[i542] & 255) << 24);
                    int i545 = i544 + 1;
                    int i546 = i545 + 1;
                    int i547 = (value[i544] & 255) | ((value[i545] & 255) << 8);
                    int i548 = i546 + 1;
                    int i549 = i547 | ((value[i546] & 255) << 16);
                    int i550 = i548 + 1;
                    float fIntBitsToFloat60 = Float.intBitsToFloat(i549 | ((value[i548] & 255) << 24));
                    int i551 = i550 + 1;
                    int i552 = i551 + 1;
                    int i553 = ((value[i551] & 255) << 8) | (value[i550] & 255);
                    int i554 = i552 + 1;
                    int i555 = i553 | ((value[i552] & 255) << 16);
                    int i556 = i554 + 1;
                    long j16 = i555 | ((value[i554] & 255) << 24);
                    int i557 = i556 + 1;
                    int i558 = i557 + 1;
                    int i559 = (value[i556] & 255) | ((value[i557] & 255) << 8);
                    int i560 = i558 + 1;
                    int i561 = i559 | ((value[i558] & 255) << 16);
                    int i562 = i560 + 1;
                    float fIntBitsToFloat61 = Float.intBitsToFloat(i561 | ((value[i560] & 255) << 24));
                    int i563 = i562 + 1;
                    int i564 = i563 + 1;
                    int i565 = ((value[i563] & 255) << 8) | (value[i562] & 255);
                    int i566 = i564 + 1;
                    i4 = i566 + 1;
                    long j17 = i565 | ((value[i564] & 255) << 16) | ((value[i566] & 255) << 24);
                    riddingInfo2.setDistance3DAscend(fIntBitsToFloat59);
                    riddingInfo2.setSpeed3D(fIntBitsToFloat58);
                    riddingInfo2.setTimeAscend(j15);
                    riddingInfo2.setDistance3DDescend(fIntBitsToFloat60);
                    riddingInfo2.setTimeDescend(j16);
                    riddingInfo2.setDistance3DFlat(fIntBitsToFloat61);
                    riddingInfo2.setTimeFlat(j17);
                    sportSummary3.setRiddingInfo(riddingInfo2);
                } else {
                    i4 = i2 + 58;
                }
            }
            sportSummary = sportSummary3;
        }
        if (i3 == 512) {
            int i567 = i4 + 1;
            int i568 = i567 + 1;
            int i569 = i568 + 1;
            int i570 = i569 + 1;
            sportSummary.setStatisInfo(new SportStatisInfo(((value[i567] & 255) << 8) | (value[i4] & 255), ((value[i569] & 255) << 8) | (value[i568] & 255), ((value[i570 + 1] & 255) << 8) | (value[i570] & 255)));
        }
        return sportSummary;
    }

    public SportDetail fetchDetailData(final SportSummary summary, int size) {
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = 0;
        this.o = NodeType.NODE_TYPE_GPS_POINT;
        this.l = 0;
        this.n = 0;
        this.k = summary.getStartTime();
        this.m = summary.getStartTime();
        this.p = summary.getBaseLng();
        this.q = summary.getBaseLat();
        this.r = summary.getBaseAlt();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final SportDetail sportDetail = new SportDetail();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        IGattCallback.INotifyCallback iNotifyCallback = new IGattCallback.INotifyCallback() { // from class: kj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.m(atomicInteger, summary, sportDetail, atomicBoolean, countDownLatch, bArr);
            }
        };
        if (!b(iNotifyCallback)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerDataCallback failed!!!");
            return null;
        }
        IGattCallback.INotifyCallback iNotifyCallback2 = new IGattCallback.INotifyCallback() { // from class: lj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncGpsDataProfile.n(atomicBoolean, countDownLatch, bArr);
            }
        };
        if (!a(iNotifyCallback2)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerControlCallback failed!!!");
            d(iNotifyCallback);
            return null;
        }
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                try {
                    countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }
        d(iNotifyCallback);
        c(iNotifyCallback2);
        if (atomicInteger.get() == size) {
            return sportDetail;
        }
        Debug.fi(HMProSyncDataBaseProfile.TAG, "rSize:" + atomicInteger.get() + ",hSize:" + size);
        return null;
    }

    public SportSummary fetchSummaryData(int targetSize) {
        this.f = -1;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        IGattCallback.INotifyCallback iNotifyCallback = new IGattCallback.INotifyCallback() { // from class: jj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.o(atomicBoolean, countDownLatch, byteArrayOutputStream, bArr);
            }
        };
        if (!b(iNotifyCallback)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerDataCallback failed!!!");
            return null;
        }
        IGattCallback.INotifyCallback iNotifyCallback2 = new IGattCallback.INotifyCallback() { // from class: mj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncGpsDataProfile.p(atomicBoolean, countDownLatch, bArr);
            }
        };
        if (!a(iNotifyCallback2)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerControlCallback failed!!!");
            d(iNotifyCallback);
            return null;
        }
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                try {
                    countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }
        d(iNotifyCallback);
        c(iNotifyCallback2);
        if (targetSize == byteArrayOutputStream.size()) {
            return s(byteArrayOutputStream.toByteArray());
        }
        Debug.fi(HMProSyncDataBaseProfile.TAG, "get size is not match target size<" + targetSize + "," + byteArrayOutputStream.size() + SearchCriteria.GT);
        return null;
    }

    public DataHeader getDetailHeader(Calendar startTime) {
        return j(startTime, (byte) 6);
    }

    public DataHeader getSummaryHeader(Calendar startTime) {
        return j(startTime, (byte) 5);
    }
}

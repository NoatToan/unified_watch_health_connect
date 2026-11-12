package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes18.dex */
public class TimexSummaryParser implements ISportSummaryDataParser {
    private static String c = "TimexSummaryParser";
    private int a;
    private final int b = 28;

    public TimexSummaryParser(int version) {
        this.a = 0;
        this.a = version;
    }

    private int a(SportSummary summary, byte[] value, int offset) {
        int length = value.length - offset;
        byte[] bArr = new byte[length];
        System.arraycopy(value, offset, bArr, 0, length);
        Debug.fi(c, "parseCoach: " + GattUtils.bytesToHexString(bArr));
        CoachingInfo coachingInfo = new CoachingInfo(bArr);
        Debug.fi(c, "Parsed CoachingInfo: " + coachingInfo);
        summary.setCoachingInfo(coachingInfo);
        if (length < 52) {
            return length;
        }
        return 52;
    }

    private int b(SportSummary summary, byte[] value, int offset) {
        byte[] bArr = new byte[4];
        System.arraycopy(value, offset, bArr, 0, 4);
        Debug.fi(c, "parseCrossFit: " + GattUtils.bytesToHexString(bArr));
        CrossFitInfo crossFitInfo = new CrossFitInfo(bArr);
        Debug.fi(c, "Parsed CrossFitInfo: " + crossFitInfo);
        summary.setCrossFitInfo(crossFitInfo);
        return 4;
    }

    private int c(SportSummary summary, byte[] value, int offset) {
        if (value.length - offset >= 12) {
            byte[] bArr = new byte[12];
            System.arraycopy(value, offset, bArr, 0, 12);
            Debug.fi(c, "parse RaceMode: " + GattUtils.bytesToHexString(bArr));
            RaceModeInfo raceModeInfo = new RaceModeInfo(bArr);
            Debug.fi(c, "Parsed RaceModeInfo: " + raceModeInfo);
            summary.setRaceModeInfo(raceModeInfo);
        }
        return 12;
    }

    private int d(int version, SportSummary summary, byte[] value, int offset, int maxHr) {
        int i = offset + 1;
        int i2 = i + 1;
        int i3 = ((value[i] & 255) << 8) | (value[offset] & 255);
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((value[i4] & 255) << 8) | (value[i2] & 255);
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        summary.setStatisInfo(new SportStatisInfo(i3, i6, ((value[i7] & 255) << 8) | (value[i5] & 255), maxHr));
        if (version >= 261) {
            i8 += 2;
        }
        return i8 - offset;
    }

    private SportSummary e(byte[] value) {
        boolean z;
        boolean z2;
        boolean z3;
        SportType sportTypeFromValue;
        int i;
        SportSummary sportSummary = new SportSummary();
        sportSummary.setVersion(this.a);
        int i2 = 2;
        byte[] bArr = {value[0], value[1]};
        SportType sportType = SportType.SPORT_TYPE_NONE;
        if (this.a < 261) {
            sportTypeFromValue = SportType.fromValue(((bArr[1] & 255) << 8) | (bArr[0] & 255));
            z = false;
            z2 = true;
            z3 = false;
        } else {
            boolean z4 = (bArr[0] & 16) > 0;
            boolean z5 = (bArr[0] & 32) > 0;
            boolean z6 = (bArr[0] & 64) > 0;
            if (z4) {
                z = z6;
                z2 = z4;
                z3 = z5;
                sportTypeFromValue = SportType.fromValue(bArr[0] & 15);
            } else {
                z = z6;
                z2 = z4;
                z3 = z5;
                sportTypeFromValue = sportType;
            }
        }
        sportSummary.setCoaching(z3);
        sportSummary.setCrossFit(z);
        sportSummary.setType(sportTypeFromValue);
        if (this.a >= 261) {
            i = (value[4] & 255) | ((value[5] & 255) << 8);
            i2 = 6;
        } else {
            i = 0;
        }
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (value[i2] & 255) | ((value[i3] & 255) << 8);
        int i6 = i4 + 1;
        int i7 = i5 | ((value[i4] & 255) << 16);
        int i8 = i6 + 1;
        long j = i7 | ((value[i6] & 255) << 24);
        int i9 = i8 + 1;
        int i10 = i9 + 1;
        int i11 = (value[i8] & 255) | ((value[i9] & 255) << 8);
        int i12 = i10 + 1;
        int i13 = i11 | ((value[i10] & 255) << 16);
        int i14 = i12 + 1;
        long j2 = i13 | ((value[i12] & 255) << 24);
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        int i17 = (value[i14] & 255) | ((value[i15] & 255) << 8);
        int i18 = i16 + 1;
        int i19 = i17 | ((value[i16] & 255) << 16);
        int i20 = i18 + 1;
        SportType sportType2 = sportTypeFromValue;
        long j3 = i19 | ((value[i18] & 255) << 24);
        int i21 = i20 + 1;
        int i22 = i21 + 1;
        int i23 = ((value[i21] & 255) << 8) | (value[i20] & 255);
        int i24 = i22 + 1;
        int i25 = i24 + 1;
        int i26 = i23 | ((value[i22] & 255) << 16) | ((value[i24] & 255) << 24);
        boolean z7 = z;
        boolean z8 = z2;
        long j4 = i26;
        int i27 = i25 + 1;
        int i28 = i27 + 1;
        int i29 = ((value[i27] & 255) << 8) | (value[i25] & 255);
        int i30 = i28 + 1;
        int i31 = i29 | ((value[i28] & 255) << 16);
        int i32 = i30 + 1;
        boolean z9 = z3;
        long j5 = i31 | ((value[i30] & 255) << 24);
        int i33 = i;
        sportSummary.setStartTime(j * 1000);
        sportSummary.setEndTime(j2 * 1000);
        sportSummary.setBaseLng(j3);
        sportSummary.setBaseLat(j4);
        sportSummary.setBaseAlt(j5);
        SportAccumInfo sportAccumInfo = new SportAccumInfo();
        int i34 = i32 + 1;
        int i35 = i34 + 1;
        int i36 = i35 + 1;
        int i37 = ((value[i34] & 255) << 8) | (value[i32] & 255) | ((value[i35] & 255) << 16);
        int i38 = i36 + 1;
        float fIntBitsToFloat = Float.intBitsToFloat(i37 | ((value[i36] & 255) << 24));
        int i39 = i38 + 1;
        int i40 = i39 + 1;
        int i41 = ((value[i39] & 255) << 8) | (value[i38] & 255);
        int i42 = i40 + 1;
        int i43 = i41 | ((value[i40] & 255) << 16);
        int i44 = i42 + 1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i43 | ((value[i42] & 255) << 24));
        int i45 = i44 + 1;
        int i46 = i45 + 1;
        int i47 = ((value[i45] & 255) << 8) | (value[i44] & 255);
        int i48 = i46 + 1;
        int i49 = i47 | ((value[i46] & 255) << 16);
        int i50 = i48 + 1;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i49 | ((value[i48] & 255) << 24));
        int i51 = i50 + 1;
        int i52 = i51 + 1;
        int i53 = ((value[i51] & 255) << 8) | (value[i50] & 255);
        int i54 = i52 + 1;
        int i55 = i53 | ((value[i52] & 255) << 16);
        int i56 = i54 + 1;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i55 | ((value[i54] & 255) << 24));
        int i57 = i56 + 1;
        int i58 = i57 + 1;
        int i59 = ((value[i57] & 255) << 8) | (value[i56] & 255);
        int i60 = i58 + 1;
        int i61 = i59 | ((value[i58] & 255) << 16);
        int i62 = i60 + 1;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i61 | ((value[i60] & 255) << 24));
        int i63 = i62 + 1;
        int i64 = i63 + 1;
        int i65 = ((value[i63] & 255) << 8) | (value[i62] & 255);
        int i66 = i64 + 1;
        int i67 = i65 | ((value[i64] & 255) << 16);
        int i68 = i66 + 1;
        int i69 = i67 | ((value[i66] & 255) << 24);
        int i70 = i68 + 1;
        int i71 = i70 + 1;
        int i72 = ((value[i70] & 255) << 8) | (value[i68] & 255);
        int i73 = i71 + 1;
        int i74 = ((value[i71] & 255) << 16) | i72;
        int i75 = i73 + 1;
        int i76 = i74 | ((value[i73] & 255) << 24);
        int i77 = i75 + 1;
        int i78 = i77 + 1;
        int i79 = (value[i75] & 255) | ((value[i77] & 255) << 8);
        int i80 = i78 + 1;
        int i81 = i80 + 1;
        int i82 = ((value[i78] & 255) << 16) | i79 | ((value[i80] & 255) << 24);
        int i83 = i81 + 1;
        int i84 = i83 + 1;
        int i85 = (value[i81] & 255) | ((value[i83] & 255) << 8);
        int i86 = i84 + 1;
        int i87 = i85 | ((value[i84] & 255) << 16);
        int i88 = i86 + 1;
        int i89 = i87 | ((value[i86] & 255) << 24);
        int i90 = i88 + 1;
        int i91 = i90 + 1;
        int i92 = ((value[i90] & 255) << 8) | (value[i88] & 255);
        int i93 = i91 + 1;
        int i94 = i93 + 1;
        long j6 = ((value[i91] & 255) << 16) | i92 | ((value[i93] & 255) << 24);
        int i95 = i94 + 1;
        int i96 = i95 + 1;
        int i97 = ((value[i95] & 255) << 8) | (value[i94] & 255);
        int i98 = i96 + 1;
        int i99 = i98 + 1;
        long j7 = i97 | ((value[i96] & 255) << 16) | ((value[i98] & 255) << 24);
        int i100 = i99 + 1;
        int i101 = i100 + 1;
        int i102 = i101 + 1;
        int i103 = ((value[i100] & 255) << 8) | (value[i99] & 255) | ((value[i101] & 255) << 16);
        int i104 = i102 + 1;
        float fIntBitsToFloat6 = Float.intBitsToFloat(i103 | ((value[i102] & 255) << 24));
        int i105 = i104 + 1;
        int i106 = i105 + 1;
        int i107 = ((value[i105] & 255) << 8) | (value[i104] & 255);
        int i108 = i106 + 1;
        int i109 = ((value[i106] & 255) << 16) | i107;
        int i110 = i108 + 1;
        float fIntBitsToFloat7 = Float.intBitsToFloat(i109 | ((value[i108] & 255) << 24));
        int i111 = i110 + 1;
        int i112 = i111 + 1;
        int i113 = ((value[i111] & 255) << 8) | (value[i110] & 255);
        int i114 = i112 + 1;
        int i115 = i114 + 1;
        float fIntBitsToFloat8 = Float.intBitsToFloat(i113 | ((value[i112] & 255) << 16) | ((value[i114] & 255) << 24));
        int i116 = i115 + 1;
        int i117 = i116 + 1;
        int i118 = ((value[i116] & 255) << 8) | (value[i115] & 255);
        int i119 = i117 + 1;
        int i120 = ((value[i117] & 255) << 16) | i118;
        int i121 = i119 + 1;
        float fIntBitsToFloat9 = Float.intBitsToFloat(i120 | ((value[i119] & 255) << 24));
        int i122 = i121 + 1;
        int i123 = i122 + 1;
        int i124 = (value[i121] & 255) | ((value[i122] & 255) << 8);
        int i125 = i123 + 1;
        int i126 = ((value[i123] & 255) << 16) | i124;
        int i127 = i125 + 1;
        float fIntBitsToFloat10 = Float.intBitsToFloat(i126 | ((value[i125] & 255) << 24));
        int i128 = i127 + 1;
        int i129 = i128 + 1;
        int i130 = (value[i127] & 255) | ((value[i128] & 255) << 8);
        int i131 = i129 + 1;
        int i132 = ((value[i129] & 255) << 16) | i130;
        int iD = i131 + 1;
        long j8 = i132 | ((value[i131] & 255) << 24);
        sportAccumInfo.setDistance(fIntBitsToFloat);
        sportAccumInfo.setAscendMeter(fIntBitsToFloat2);
        sportAccumInfo.setDescendMeter(fIntBitsToFloat3);
        sportAccumInfo.setMinAltitude(fIntBitsToFloat4);
        sportAccumInfo.setMaxAltitude(fIntBitsToFloat5);
        sportAccumInfo.setMinLatitude(i69);
        sportAccumInfo.setMaxLatitude(i76);
        sportAccumInfo.setMinLongitude(i82);
        sportAccumInfo.setMaxLongitude(i89);
        sportAccumInfo.setStep(j6);
        sportAccumInfo.setActiveTime(j7);
        sportAccumInfo.setSportCalories(fIntBitsToFloat6);
        sportAccumInfo.setMaxSpeed(fIntBitsToFloat7);
        sportAccumInfo.setMinPace(fIntBitsToFloat8);
        sportAccumInfo.setMaxPace(fIntBitsToFloat9);
        sportAccumInfo.setTotalStride(fIntBitsToFloat10);
        sportAccumInfo.setSecCountHasStep(j8);
        sportSummary.setAccInfo(sportAccumInfo);
        if (j2 <= j) {
            Debug.fi(c, "Error sport data: startTime - " + j + ", endTime - " + j2 + ", activeTime - " + j7);
            sportSummary.setEndTime((j + (j7 > 0 ? j7 : 1L)) * 1000);
        }
        int i133 = this.a;
        if (i133 < 261) {
            d(i133, sportSummary, value, iD + 28, i33);
        } else {
            iD += d(i133, sportSummary, value, iD, i33);
        }
        int i134 = iD;
        if (z9) {
            a(sportSummary, value, i134);
        } else if (z7) {
            b(sportSummary, value, i134);
        } else if (z8) {
            f(sportSummary, sportType2, value, i134, fIntBitsToFloat7);
        }
        c(sportSummary, value, i134 + 52);
        return sportSummary;
    }

    private int f(SportSummary summary, SportType type, byte[] value, int offset, float maxSpeed) {
        if (type == SportType.SPORT_TYPE_POOL_SWIM || type == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            SwimInfo swimInfo = new SwimInfo();
            int i = offset + 1;
            int i2 = i + 1;
            int i3 = (value[offset] & 255) | ((value[i] & 255) << 8);
            int i4 = i2 + 1;
            int i5 = i3 | ((value[i2] & 255) << 16);
            int i6 = i4 + 1;
            float fIntBitsToFloat = Float.intBitsToFloat(i5 | ((value[i4] & 255) << 24));
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = ((value[i7] & 255) << 8) | (value[i6] & 255);
            int i10 = i8 + 1;
            int i11 = i9 | ((value[i8] & 255) << 16);
            int i12 = i10 + 1;
            float fIntBitsToFloat2 = Float.intBitsToFloat(i11 | ((value[i10] & 255) << 24));
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = ((value[i13] & 255) << 8) | (value[i12] & 255);
            int i16 = i14 + 1;
            int i17 = i15 | ((value[i14] & 255) << 16);
            int i18 = i16 + 1;
            float fIntBitsToFloat3 = Float.intBitsToFloat(i17 | ((value[i16] & 255) << 24));
            int i19 = i18 + 1;
            int i20 = i19 + 1;
            int i21 = ((value[i19] & 255) << 8) | (value[i18] & 255);
            int i22 = i20 + 1;
            int i23 = i22 + 1;
            int i24 = ((value[i22] & 255) << 8) | (value[i20] & 255);
            int i25 = i23 + 1;
            int i26 = value[i23] & 255;
            int i27 = value[i25] & 255;
            swimInfo.setDistancePerStroke(fIntBitsToFloat);
            swimInfo.setAvgStrokeSpeed(fIntBitsToFloat2);
            swimInfo.setAvgPace(fIntBitsToFloat3);
            swimInfo.setStrokes(i21);
            swimInfo.setAvgSwolf(i24);
            swimInfo.setStkStyle(i26);
            swimInfo.setTrips(i27);
            swimInfo.setMaxStrokeSpeed(maxSpeed);
            summary.setSwimInfo(swimInfo);
            return 28;
        }
        RiddingInfo riddingInfo = new RiddingInfo();
        int i28 = offset + 1;
        int i29 = i28 + 1;
        int i30 = (value[offset] & 255) | ((value[i28] & 255) << 8);
        int i31 = i29 + 1;
        int i32 = i30 | ((value[i29] & 255) << 16);
        int i33 = i31 + 1;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i32 | ((value[i31] & 255) << 24));
        int i34 = i33 + 1;
        int i35 = i34 + 1;
        int i36 = ((value[i34] & 255) << 8) | (value[i33] & 255);
        int i37 = i35 + 1;
        int i38 = i36 | ((value[i35] & 255) << 16);
        int i39 = i37 + 1;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i38 | ((value[i37] & 255) << 24));
        int i40 = i39 + 1;
        int i41 = i40 + 1;
        int i42 = ((value[i40] & 255) << 8) | (value[i39] & 255);
        int i43 = i41 + 1;
        int i44 = i42 | ((value[i41] & 255) << 16);
        int i45 = i43 + 1;
        long j = i44 | ((value[i43] & 255) << 24);
        int i46 = i45 + 1;
        int i47 = i46 + 1;
        int i48 = (value[i45] & 255) | ((value[i46] & 255) << 8);
        int i49 = i47 + 1;
        int i50 = i48 | ((value[i47] & 255) << 16);
        int i51 = i49 + 1;
        float fIntBitsToFloat6 = Float.intBitsToFloat(i50 | ((value[i49] & 255) << 24));
        int i52 = i51 + 1;
        int i53 = i52 + 1;
        int i54 = ((value[i52] & 255) << 8) | (value[i51] & 255);
        int i55 = i53 + 1;
        int i56 = i54 | ((value[i53] & 255) << 16);
        int i57 = i55 + 1;
        long j2 = i56 | ((value[i55] & 255) << 24);
        int i58 = i57 + 1;
        int i59 = i58 + 1;
        int i60 = (value[i57] & 255) | ((value[i58] & 255) << 8);
        int i61 = i59 + 1;
        int i62 = i60 | ((value[i59] & 255) << 16);
        int i63 = i61 + 1;
        float fIntBitsToFloat7 = Float.intBitsToFloat(i62 | ((value[i61] & 255) << 24));
        int i64 = i63 + 1;
        int i65 = i64 + 1;
        long j3 = ((value[i65 + 1] & 255) << 24) | ((value[i64] & 255) << 8) | (value[i63] & 255) | ((value[i65] & 255) << 16);
        riddingInfo.setDistance3DAscend(fIntBitsToFloat4);
        riddingInfo.setSpeed3D(fIntBitsToFloat5);
        riddingInfo.setTimeAscend(j);
        riddingInfo.setDistance3DDescend(fIntBitsToFloat6);
        riddingInfo.setTimeDescend(j2);
        riddingInfo.setDistance3DFlat(fIntBitsToFloat7);
        riddingInfo.setTimeFlat(j3);
        summary.setRiddingInfo(riddingInfo);
        return 28;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    public SportSummary parser(byte[] bytes) {
        return e(bytes);
    }
}

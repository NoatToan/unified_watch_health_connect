package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApiV3Impl;
import defpackage.t5t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
class SportSummary208DataParser implements ISportSummaryDataParser {
    private static String TAG = "SportSummary207DataParser";
    private int version;

    public SportSummary208DataParser(int i) {
        this.version = i;
    }

    public SportSummary parseGpsSummary(byte[] bArr) {
        SportSummary sportSummary = new SportSummary();
        sportSummary.setVersion(this.version);
        int i = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
        SportType sportTypeFromValue = SportType.fromValue(i);
        long j = (bArr[2] & 255) | ((bArr[3] & 255) << 8) | ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 24);
        long j2 = (bArr[6] & 255) | ((bArr[7] & 255) << 8) | ((bArr[8] & 255) << 16) | ((bArr[9] & 255) << 24);
        long j3 = (bArr[10] & 255) | ((bArr[11] & 255) << 8) | ((bArr[12] & 255) << 16) | ((bArr[13] & 255) << 24);
        long j4 = (bArr[14] & 255) | ((bArr[15] & 255) << 8) | ((bArr[16] & 255) << 16) | ((bArr[17] & 255) << 24);
        long j5 = (bArr[18] & 255) | ((bArr[19] & 255) << 8) | ((bArr[20] & 255) << 16) | ((bArr[21] & 255) << 24);
        sportSummary.setSportTypeValue(i);
        sportSummary.setStartTime(j * 1000);
        sportSummary.setEndTime(1000 * j2);
        sportSummary.setBaseLng(j3);
        sportSummary.setBaseLat(j4);
        sportSummary.setBaseAlt(j5);
        int i2 = bArr[22] & 255;
        int i3 = bArr[23] & 255;
        int i4 = bArr[24] & 255;
        int i5 = bArr[25] & 255;
        int i6 = bArr[26] & 255;
        int i7 = bArr[27] & 255;
        int i8 = bArr[28] & 255;
        byte b2 = bArr[29];
        byte b3 = bArr[30];
        byte b4 = bArr[31];
        int i9 = ((bArr[33] & 255) << 8) | (bArr[32] & 255);
        byte b5 = bArr[34];
        byte b6 = bArr[35];
        byte b7 = bArr[36];
        byte b8 = bArr[37];
        long j6 = ((bArr[39] & 255) << 8) | (bArr[38] & 255) | ((bArr[40] & 255) << 16) | ((bArr[41] & 255) << 24);
        ArrayList arrayList = new ArrayList();
        int i10 = 42;
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            int i13 = i10 + 3;
            SportType sportType = sportTypeFromValue;
            int i14 = ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
            i10 += 4;
            arrayList.add(Long.valueOf(i14 | ((bArr[i13] & 255) << 24)));
            i11++;
            sportTypeFromValue = sportType;
        }
        SportType sportType2 = sportTypeFromValue;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        for (int i16 = 6; i15 < i16; i16 = 6) {
            int i17 = i10 + 1;
            int i18 = bArr[i10] & 255;
            i10 += 2;
            arrayList2.add(Integer.valueOf(i18 | ((bArr[i17] & 255) << 8)));
            i15++;
        }
        long j7 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
        byte b9 = bArr[i10 + 4];
        byte b10 = bArr[i10 + 5];
        int i19 = i10 + 7;
        int i20 = bArr[i10 + 6] & 255;
        int i21 = i10 + 8;
        int i22 = bArr[i19] & 255;
        sportSummary.setIntervalType(i2);
        sportSummary.setMinHr(i3);
        sportSummary.setTe(i4);
        sportSummary.setAnaerobicTE(i5);
        sportSummary.setSwimPoolLength(i6);
        sportSummary.setDistanceUnit(i7);
        sportSummary.setDailyPerfermance(i8);
        sportSummary.setSecHalfStartTime(i9);
        sportSummary.setParentStartTime(j6 * 1000);
        sportSummary.setChildStartTime(arrayList);
        sportSummary.setChildType(arrayList2);
        sportSummary.setRopeSkipRestTime(j7);
        sportSummary.setMaxTemperature(b9);
        sportSummary.setMinTemperature(b10);
        sportSummary.setWeatherFrom(i20);
        sportSummary.setWeatherTo(i22);
        int[] iArr = new int[5];
        int i23 = 0;
        for (int i24 = 5; i23 < i24; i24 = 5) {
            int i25 = i21 + 1;
            int i26 = bArr[i21] & 255;
            i21 += 2;
            iArr[i23] = ((bArr[i25] & 255) << 8) | i26;
            i23++;
        }
        int i27 = bArr[i21] & 255;
        int i28 = bArr[i21 + 1] & 255;
        int i29 = (bArr[i21 + 2] & 255) | ((bArr[i21 + 3] & 255) << 8) | ((bArr[i21 + 4] & 255) << 16) | ((bArr[i21 + 5] & 255) << 24);
        byte b11 = bArr[i21 + 6];
        int i30 = i21 + 10;
        int i31 = 0;
        for (int i32 = 5; i31 < i32; i32 = 5) {
            int i33 = i30 + 3;
            int i34 = ((bArr[i30 + 1] & 255) << 8) | (bArr[i30] & 255) | ((bArr[i30 + 2] & 255) << 16);
            i30 += 4;
            iArr[i31] = i34 | ((bArr[i33] & 255) << 24);
            i31++;
        }
        sportSummary.setTargetType(i28);
        sportSummary.setTargetValue(i29);
        SportAccumInfo sportAccumInfo = new SportAccumInfo();
        long j8 = ((bArr[i30 + 13] & 255) << 8) | (bArr[i30 + 12] & 255) | ((bArr[i30 + 14] & 255) << 16) | ((bArr[i30 + 15] & 255) << 24);
        long j9 = ((bArr[i30 + 17] & 255) << 8) | (bArr[i30 + 16] & 255) | ((bArr[i30 + 18] & 255) << 16) | ((bArr[i30 + 19] & 255) << 24);
        int i35 = ((bArr[i30 + 21] & 255) << 8) | (bArr[i30 + 20] & 255) | ((bArr[i30 + 22] & 255) << 16) | ((bArr[i30 + 23] & 255) << 24);
        int i36 = ((bArr[i30 + 25] & 255) << 8) | (bArr[i30 + 24] & 255) | ((bArr[i30 + 26] & 255) << 16) | ((bArr[i30 + 27] & 255) << 24);
        int i37 = ((bArr[i30 + 29] & 255) << 8) | (bArr[i30 + 28] & 255) | ((bArr[i30 + 30] & 255) << 16) | ((bArr[i30 + 31] & 255) << 24);
        int i38 = ((bArr[i30 + 33] & 255) << 8) | (bArr[i30 + 32] & 255) | ((bArr[i30 + 34] & 255) << 16) | ((bArr[i30 + 35] & 255) << 24);
        float fIntBitsToFloat = Float.intBitsToFloat(((bArr[i30 + 37] & 255) << 8) | (bArr[i30 + 36] & 255) | ((bArr[i30 + 38] & 255) << 16) | ((bArr[i30 + 39] & 255) << 24));
        float fIntBitsToFloat2 = Float.intBitsToFloat(((bArr[i30 + 42] & 255) << 16) | ((bArr[i30 + 41] & 255) << 8) | (bArr[i30 + 40] & 255) | ((bArr[i30 + 43] & 255) << 24));
        float fIntBitsToFloat3 = Float.intBitsToFloat(((bArr[i30 + 46] & 255) << 16) | (bArr[i30 + 44] & 255) | ((bArr[i30 + 45] & 255) << 8) | ((bArr[i30 + 47] & 255) << 24));
        float fIntBitsToFloat4 = Float.intBitsToFloat(((bArr[i30 + 50] & 255) << 16) | (bArr[i30 + 48] & 255) | ((bArr[i30 + 49] & 255) << 8) | ((bArr[i30 + 51] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat(((bArr[i30 + 54] & 255) << 16) | (bArr[i30 + 52] & 255) | ((bArr[i30 + 53] & 255) << 8) | ((bArr[i30 + 55] & 255) << 24));
        float fIntBitsToFloat6 = Float.intBitsToFloat(((bArr[i30 + 58] & 255) << 16) | (bArr[i30 + 56] & 255) | ((bArr[i30 + 57] & 255) << 8) | ((bArr[i30 + 59] & 255) << 24));
        float fIntBitsToFloat7 = Float.intBitsToFloat(((bArr[i30 + 62] & 255) << 16) | (bArr[i30 + 60] & 255) | ((bArr[i30 + 61] & 255) << 8) | ((bArr[i30 + 63] & 255) << 24));
        float fIntBitsToFloat8 = Float.intBitsToFloat(((bArr[i30 + 66] & 255) << 16) | (bArr[i30 + 64] & 255) | ((bArr[i30 + 65] & 255) << 8) | ((bArr[i30 + 67] & 255) << 24));
        float fIntBitsToFloat9 = Float.intBitsToFloat(((bArr[i30 + 70] & 255) << 16) | (bArr[i30 + 68] & 255) | ((bArr[i30 + 69] & 255) << 8) | ((bArr[i30 + 71] & 255) << 24));
        float fIntBitsToFloat10 = Float.intBitsToFloat(((bArr[i30 + 74] & 255) << 16) | (bArr[i30 + 72] & 255) | ((bArr[i30 + 73] & 255) << 8) | ((bArr[i30 + 75] & 255) << 24));
        float fIntBitsToFloat11 = Float.intBitsToFloat(((bArr[i30 + 78] & 255) << 16) | (bArr[i30 + 76] & 255) | ((bArr[i30 + 77] & 255) << 8) | ((bArr[i30 + 79] & 255) << 24));
        float fIntBitsToFloat12 = Float.intBitsToFloat(((bArr[i30 + 82] & 255) << 16) | (bArr[i30 + 80] & 255) | ((bArr[i30 + 81] & 255) << 8) | ((bArr[i30 + 83] & 255) << 24));
        float fIntBitsToFloat13 = Float.intBitsToFloat(((bArr[i30 + 86] & 255) << 16) | (bArr[i30 + 84] & 255) | ((bArr[i30 + 85] & 255) << 8) | ((bArr[i30 + 87] & 255) << 24));
        float fIntBitsToFloat14 = Float.intBitsToFloat(((bArr[i30 + 90] & 255) << 16) | (bArr[i30 + 88] & 255) | ((bArr[i30 + 89] & 255) << 8) | ((bArr[i30 + 91] & 255) << 24));
        float fIntBitsToFloat15 = Float.intBitsToFloat(((bArr[i30 + 94] & 255) << 16) | (bArr[i30 + 92] & 255) | ((bArr[i30 + 93] & 255) << 8) | ((bArr[i30 + 95] & 255) << 24));
        float fIntBitsToFloat16 = Float.intBitsToFloat(((bArr[i30 + 98] & 255) << 16) | (bArr[i30 + 96] & 255) | ((bArr[i30 + 97] & 255) << 8) | ((bArr[i30 + 99] & 255) << 24));
        float fIntBitsToFloat17 = Float.intBitsToFloat(((bArr[i30 + 102] & 255) << 16) | (bArr[i30 + 100] & 255) | ((bArr[i30 + 101] & 255) << 8) | ((bArr[i30 + 103] & 255) << 24));
        float fIntBitsToFloat18 = Float.intBitsToFloat(((bArr[i30 + 106] & 255) << 16) | (bArr[i30 + 104] & 255) | ((bArr[i30 + 105] & 255) << 8) | ((bArr[i30 + 107] & 255) << 24));
        float fIntBitsToFloat19 = Float.intBitsToFloat(((bArr[i30 + 110] & 255) << 16) | (bArr[i30 + 108] & 255) | ((bArr[i30 + 109] & 255) << 8) | ((bArr[i30 + 111] & 255) << 24));
        float fIntBitsToFloat20 = Float.intBitsToFloat(((bArr[i30 + 114] & 255) << 16) | (bArr[i30 + 112] & 255) | ((bArr[i30 + 113] & 255) << 8) | ((bArr[i30 + 115] & 255) << 24));
        long j10 = ((bArr[i30 + 118] & 255) << 16) | (bArr[i30 + 116] & 255) | ((bArr[i30 + 117] & 255) << 8) | ((bArr[i30 + 119] & 255) << 24);
        sportSummary.setHrZoneWrapperApi(new HrZoneWrapperApiV3Impl(i27, iArr, j9));
        sportAccumInfo.setStep(j8);
        sportAccumInfo.setActiveTime(j9);
        sportAccumInfo.setMaxLatitude(i35);
        sportAccumInfo.setMinLatitude(i36);
        sportAccumInfo.setMaxLongitude(i37);
        sportAccumInfo.setMinLongitude(i38);
        sportAccumInfo.setSportCalories(fIntBitsToFloat);
        sportAccumInfo.setDistance(fIntBitsToFloat2);
        sportAccumInfo.setAscendMeter(fIntBitsToFloat3);
        sportAccumInfo.setDescendMeter(fIntBitsToFloat4);
        sportAccumInfo.setMaxAltitude(fIntBitsToFloat5);
        sportAccumInfo.setMinAltitude(fIntBitsToFloat6);
        sportAccumInfo.setAvgAltitude(fIntBitsToFloat7);
        sportAccumInfo.setMaxSpeed(fIntBitsToFloat8);
        sportAccumInfo.setMinSpeed(fIntBitsToFloat9);
        sportAccumInfo.setAvgSpeed(fIntBitsToFloat10);
        sportAccumInfo.setMaxPace(fIntBitsToFloat11);
        sportAccumInfo.setMinPace(fIntBitsToFloat12);
        sportAccumInfo.setAvgPace(fIntBitsToFloat13);
        sportAccumInfo.setMaxCadence(fIntBitsToFloat14);
        sportAccumInfo.setMinCadence(fIntBitsToFloat15);
        sportAccumInfo.setAvgCadence(fIntBitsToFloat16);
        sportAccumInfo.setMaxStride(fIntBitsToFloat17);
        sportAccumInfo.setMinStride(fIntBitsToFloat18);
        sportAccumInfo.setAvgStride(fIntBitsToFloat19);
        sportAccumInfo.setDistanceHasStep(fIntBitsToFloat20);
        sportAccumInfo.setStepHasDistance(j10);
        sportSummary.setAccInfo(sportAccumInfo);
        int i39 = i30 + 128;
        sportSummary.setStatisInfo(new SportStatisInfo(((bArr[i30 + 121] & 255) << 8) | (bArr[i30 + 120] & 255), ((bArr[i30 + 123] & 255) << 8) | (bArr[i30 + 122] & 255), ((bArr[i30 + 125] & 255) << 8) | (bArr[i30 + 124] & 255), (bArr[i30 + 126] & 255) | ((bArr[i30 + 127] & 255) << 8)));
        if (sportType2 == SportType.SPORT_TYPE_POOL_SWIM || sportType2 == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            SwimInfo swimInfo = new SwimInfo();
            float fIntBitsToFloat21 = Float.intBitsToFloat(((bArr[i30 + 129] & 255) << 8) | (bArr[i39] & 255) | ((bArr[i30 + 130] & 255) << 16) | ((bArr[i30 + 131] & 255) << 24));
            float fIntBitsToFloat22 = Float.intBitsToFloat(((bArr[i30 + 133] & 255) << 8) | (bArr[i30 + 132] & 255) | ((bArr[i30 + 134] & 255) << 16) | ((bArr[i30 + 135] & 255) << 24));
            float fIntBitsToFloat23 = Float.intBitsToFloat(((bArr[i30 + 137] & 255) << 8) | (bArr[i30 + 136] & 255) | ((bArr[i30 + 138] & 255) << 16) | ((bArr[i30 + 139] & 255) << 24));
            float fIntBitsToFloat24 = Float.intBitsToFloat(((bArr[i30 + 141] & 255) << 8) | (bArr[i30 + 140] & 255) | ((bArr[i30 + 142] & 255) << 16) | ((bArr[i30 + 143] & 255) << 24));
            float fIntBitsToFloat25 = Float.intBitsToFloat(((bArr[i30 + 145] & 255) << 8) | (bArr[i30 + 144] & 255) | ((bArr[i30 + 146] & 255) << 16) | ((bArr[i30 + 147] & 255) << 24));
            float fIntBitsToFloat26 = Float.intBitsToFloat(((bArr[i30 + 149] & 255) << 8) | (bArr[i30 + 148] & 255) | ((bArr[i30 + 150] & 255) << 16) | ((bArr[i30 + 151] & 255) << 24));
            int i40 = ((bArr[i30 + 153] & 255) << 8) | (bArr[i30 + 152] & 255);
            int i41 = ((bArr[i30 + 155] & 255) << 8) | (bArr[i30 + 154] & 255);
            int i42 = ((bArr[i30 + 157] & 255) << 8) | (bArr[i30 + 156] & 255);
            int i43 = (bArr[i30 + 158] & 255) | ((bArr[i30 + 159] & 255) << 8);
            int i44 = (bArr[i30 + 160] & 255) | ((bArr[i30 + 161] & 255) << 8);
            int i45 = bArr[i30 + 162] & 255;
            int i46 = bArr[i30 + 163] & 255;
            swimInfo.setRealtimeDPS(fIntBitsToFloat21);
            swimInfo.setDistancePerStroke(fIntBitsToFloat22);
            swimInfo.setAvgStrokeSpeed(fIntBitsToFloat26);
            swimInfo.setAvgPace(fIntBitsToFloat13);
            swimInfo.setStrokes(i40);
            swimInfo.setAvgSwolf(i44);
            swimInfo.setStkStyle(i45);
            swimInfo.setTrips(i46);
            swimInfo.setMaxStrokeSpeed(fIntBitsToFloat8);
            swimInfo.setRealtimeStrokeSpeed(fIntBitsToFloat23);
            swimInfo.setMaxStrokeSpeed(fIntBitsToFloat24);
            swimInfo.setMinStrokeSpeed(fIntBitsToFloat25);
            swimInfo.setRealtimeSwolf(i41);
            swimInfo.setMaxSwolf(i42);
            swimInfo.setMinSwolf(i43);
            sportSummary = sportSummary;
            sportSummary.setSwimInfo(swimInfo);
        } else if (sportType2 == SportType.SPORT_TYPE_SKIING || sportType2 == SportType.SPORT_TYPE_BOARD_SKIING || sportType2 == SportType.SPORT_TYPE_ALPINE_SKIING || sportType2 == SportType.SPORT_TYPE_CROSS_COUNTRY_SKIING || sportType2 == SportType.SPORT_TYPE_SKIING_DOUBLE_BOARD || sportType2 == SportType.SPORT_TYPE_ORIENTEER_SKIING) {
            SkiingInfo skiingInfo = new SkiingInfo();
            float fIntBitsToFloat27 = Float.intBitsToFloat(((bArr[i30 + 129] & 255) << 8) | (bArr[i39] & 255) | ((bArr[i30 + 130] & 255) << 16) | ((bArr[i30 + 131] & 255) << 24));
            float fIntBitsToFloat28 = Float.intBitsToFloat(((bArr[i30 + 133] & 255) << 8) | (bArr[i30 + 132] & 255) | ((bArr[i30 + 134] & 255) << 16) | ((bArr[i30 + 135] & 255) << 24));
            float fIntBitsToFloat29 = Float.intBitsToFloat(((bArr[i30 + 137] & 255) << 8) | (bArr[i30 + 136] & 255) | ((bArr[i30 + 138] & 255) << 16) | ((bArr[i30 + 139] & 255) << 24));
            float fIntBitsToFloat30 = Float.intBitsToFloat(((bArr[i30 + 141] & 255) << 8) | (bArr[i30 + 140] & 255) | ((bArr[i30 + 142] & 255) << 16) | ((bArr[i30 + 143] & 255) << 24));
            float fIntBitsToFloat31 = Float.intBitsToFloat(((bArr[i30 + 145] & 255) << 8) | (bArr[i30 + 144] & 255) | ((bArr[i30 + 146] & 255) << 16) | ((bArr[i30 + 147] & 255) << 24));
            float fIntBitsToFloat32 = Float.intBitsToFloat(((bArr[i30 + 149] & 255) << 8) | (bArr[i30 + 148] & 255) | ((bArr[i30 + 150] & 255) << 16) | ((bArr[i30 + 151] & 255) << 24));
            float fIntBitsToFloat33 = Float.intBitsToFloat(((bArr[i30 + 153] & 255) << 8) | (bArr[i30 + 152] & 255) | ((bArr[i30 + 154] & 255) << 16) | ((bArr[i30 + 155] & 255) << 24));
            float fIntBitsToFloat34 = Float.intBitsToFloat(((bArr[i30 + 157] & 255) << 8) | (bArr[i30 + 156] & 255) | ((bArr[i30 + 158] & 255) << 16) | ((bArr[i30 + 159] & 255) << 24));
            float fIntBitsToFloat35 = Float.intBitsToFloat(((bArr[i30 + 161] & 255) << 8) | (bArr[i30 + 160] & 255) | ((bArr[i30 + 162] & 255) << 16) | ((bArr[i30 + 163] & 255) << 24));
            float fIntBitsToFloat36 = Float.intBitsToFloat(((bArr[i30 + 165] & 255) << 8) | (bArr[i30 + 164] & 255) | ((bArr[i30 + 166] & 255) << 16) | ((bArr[i30 + 167] & 255) << 24));
            float fIntBitsToFloat37 = Float.intBitsToFloat(((bArr[i30 + 169] & 255) << 8) | (bArr[i30 + 168] & 255) | ((bArr[i30 + 170] & 255) << 16) | ((bArr[i30 + 171] & 255) << 24));
            float fIntBitsToFloat38 = Float.intBitsToFloat(((bArr[i30 + 174] & 255) << 16) | ((bArr[i30 + 173] & 255) << 8) | (bArr[i30 + 172] & 255) | ((bArr[i30 + 175] & 255) << 24));
            float fIntBitsToFloat39 = Float.intBitsToFloat(((bArr[i30 + 178] & 255) << 16) | (bArr[i30 + 176] & 255) | ((bArr[i30 + 177] & 255) << 8) | ((bArr[i30 + 179] & 255) << 24));
            int i47 = (bArr[i30 + 180] & 255) | ((bArr[i30 + 181] & 255) << 8);
            int i48 = i30 + SportReportBaseParser.ReportType.entryTime;
            int i49 = ((bArr[i30 + 182] & 255) << 16) | i47;
            int i50 = i30 + SportReportBaseParser.ReportType.exitTime;
            float fIntBitsToFloat40 = Float.intBitsToFloat(i49 | ((bArr[i48] & 255) << 24));
            int i51 = ((bArr[i30 + 185] & 255) << 8) | (bArr[i50] & 255);
            skiingInfo.setTripDistance(fIntBitsToFloat28);
            skiingInfo.setTripAvgSpeed(fIntBitsToFloat29);
            skiingInfo.setTripMaxSpeed(fIntBitsToFloat30);
            skiingInfo.setTripAcmDescendMeter(fIntBitsToFloat35);
            skiingInfo.setTotalTripsAcmDescendMeter(fIntBitsToFloat36);
            skiingInfo.setMaxSlope(fIntBitsToFloat37);
            skiingInfo.setAvgSlope(fIntBitsToFloat38);
            skiingInfo.setTripSlope(fIntBitsToFloat40);
            skiingInfo.setTrips(i51);
            skiingInfo.setTotalTripsAcmDistance(fIntBitsToFloat27);
            skiingInfo.setAvgSpeed(fIntBitsToFloat32);
            skiingInfo.setTripMinSpeed(fIntBitsToFloat31);
            skiingInfo.setMaxSpeed(fIntBitsToFloat33);
            skiingInfo.setMinSpeed(fIntBitsToFloat34);
            skiingInfo.setMinSlope(fIntBitsToFloat39);
            sportSummary = sportSummary;
            sportSummary.setSkiingInfo(skiingInfo);
        } else if (sportType2 == SportType.SPORT_TYPE_JUMP_ROPE) {
            sportSummary.setSkipRopeInfo(new SkipRopeInfo(((bArr[i30 + 129] & 255) << 8) | (bArr[i39] & 255) | ((bArr[i30 + 130] & 255) << 16) | ((bArr[i30 + 131] & 255) << 24), (bArr[i30 + 132] & 255) | ((bArr[i30 + 133] & 255) << 8) | ((bArr[i30 + 134] & 255) << 16) | ((bArr[i30 + 135] & 255) << 24), Float.intBitsToFloat((bArr[i30 + 136] & 255) | ((bArr[i30 + 137] & 255) << 8) | ((bArr[i30 + 138] & 255) << 16) | ((bArr[i30 + 139] & 255) << 24)), Float.intBitsToFloat(((bArr[i30 + 141] & 255) << 8) | (bArr[i30 + 140] & 255) | ((bArr[i30 + 142] & 255) << 16) | ((bArr[i30 + 143] & 255) << 24)), Float.intBitsToFloat(((bArr[i30 + 145] & 255) << 8) | (bArr[i30 + 144] & 255) | ((bArr[i30 + 146] & 255) << 16) | ((bArr[i30 + 147] & 255) << 24)), ((bArr[i30 + 149] & 255) << 8) | (bArr[i30 + 148] & 255) | ((bArr[i30 + 150] & 255) << 16) | ((bArr[i30 + 151] & 255) << 24), Float.intBitsToFloat((bArr[i30 + 152] & 255) | ((bArr[i30 + 153] & 255) << 8) | ((bArr[i30 + 154] & 255) << 16) | ((bArr[i30 + 155] & 255) << 24)), Float.intBitsToFloat(((bArr[i30 + 157] & 255) << 8) | (bArr[i30 + 156] & 255) | ((bArr[i30 + 158] & 255) << 16) | ((bArr[i30 + 159] & 255) << 24)), ((bArr[i30 + 163] & 255) << 24) | ((bArr[i30 + 161] & 255) << 8) | (bArr[i30 + 160] & 255) | ((bArr[i30 + 162] & 255) << 16)));
        } else if (sportType2 == SportType.SPORT_TYPE_ROWING || sportType2 == SportType.SPORT_TYPE_OUTDOOR_ROWING) {
            long j11 = ((bArr[i30 + 129] & 255) << 8) | (bArr[i39] & 255) | ((bArr[i30 + 130] & 255) << 16) | ((bArr[i30 + 131] & 255) << 24);
            long j12 = (bArr[i30 + 132] & 255) | ((bArr[i30 + 133] & 255) << 8) | ((bArr[i30 + 134] & 255) << 16) | ((bArr[i30 + 135] & 255) << 24);
            float fIntBitsToFloat41 = Float.intBitsToFloat((bArr[i30 + 136] & 255) | ((bArr[i30 + 137] & 255) << 8) | ((bArr[i30 + 138] & 255) << 16) | ((bArr[i30 + 139] & 255) << 24));
            float fIntBitsToFloat42 = Float.intBitsToFloat(((bArr[i30 + 141] & 255) << 8) | (bArr[i30 + 140] & 255) | ((bArr[i30 + 142] & 255) << 16) | ((bArr[i30 + 143] & 255) << 24));
            float fIntBitsToFloat43 = Float.intBitsToFloat(((bArr[i30 + 145] & 255) << 8) | (bArr[i30 + 144] & 255) | ((bArr[i30 + 146] & 255) << 16) | ((bArr[i30 + 147] & 255) << 24));
            float fIntBitsToFloat44 = Float.intBitsToFloat(((bArr[i30 + 149] & 255) << 8) | (bArr[i30 + 148] & 255) | ((bArr[i30 + 150] & 255) << 16) | ((bArr[i30 + 151] & 255) << 24));
            RowingInfo rowingInfo = new RowingInfo(j11, j12, fIntBitsToFloat41, fIntBitsToFloat42, ((bArr[i30 + 153] & 255) << 8) | (bArr[i30 + 152] & 255) | ((bArr[i30 + 154] & 255) << 16) | ((bArr[i30 + 155] & 255) << 24), Float.intBitsToFloat((bArr[i30 + 156] & 255) | ((bArr[i30 + 157] & 255) << 8) | ((bArr[i30 + 158] & 255) << 16) | ((bArr[i30 + 159] & 255) << 24)), Float.intBitsToFloat(((bArr[i30 + 161] & 255) << 8) | (bArr[i30 + 160] & 255) | ((bArr[i30 + 162] & 255) << 16) | ((bArr[i30 + 163] & 255) << 24)), ((bArr[i30 + 165] & 255) << 8) | (bArr[i30 + 164] & 255) | ((bArr[i30 + 166] & 255) << 16) | ((bArr[i30 + 167] & 255) << 24), Float.intBitsToFloat(((bArr[i30 + 170] & 255) << 16) | ((bArr[i30 + 169] & 255) << 8) | (bArr[i30 + 168] & 255) | ((bArr[i30 + 171] & 255) << 24)), Float.intBitsToFloat(((bArr[i30 + 173] & 255) << 8) | (bArr[i30 + 172] & 255) | ((bArr[i30 + 174] & 255) << 16) | ((bArr[i30 + 175] & 255) << 24)), Float.intBitsToFloat(((bArr[i30 + 179] & 255) << 24) | ((bArr[i30 + 177] & 255) << 8) | (bArr[i30 + 176] & 255) | ((bArr[i30 + 178] & 255) << 16)));
            rowingInfo.setMaxCadence(fIntBitsToFloat43);
            rowingInfo.setMinCadence(fIntBitsToFloat44);
            sportSummary.setRowingInfo(rowingInfo);
        } else if (sportType2 == SportType.SPORT_TYPE_TENNIS) {
            int[] iArr2 = new int[5];
            while (i39 < 5) {
                iArr2[0] = ((bArr[i39 + 1] & 255) << 8) | (bArr[i39] & 255) | ((bArr[i39 + 2] & 255) << 16) | ((bArr[i39 + 3] & 255) << 24);
                i39 += 5;
            }
            sportSummary.setSwingCnt(iArr2);
        } else {
            RiddingInfo riddingInfo = new RiddingInfo();
            float fIntBitsToFloat45 = Float.intBitsToFloat(((bArr[i30 + 129] & 255) << 8) | (bArr[i39] & 255) | ((bArr[i30 + 130] & 255) << 16) | ((bArr[i30 + 131] & 255) << 24));
            float fIntBitsToFloat46 = Float.intBitsToFloat(((bArr[i30 + 133] & 255) << 8) | (bArr[i30 + 132] & 255) | ((bArr[i30 + 134] & 255) << 16) | ((bArr[i30 + 135] & 255) << 24));
            long j13 = ((bArr[i30 + 137] & 255) << 8) | (bArr[i30 + 136] & 255) | ((bArr[i30 + 138] & 255) << 16) | ((bArr[i30 + 139] & 255) << 24);
            float fIntBitsToFloat47 = Float.intBitsToFloat(((bArr[i30 + 141] & 255) << 8) | (bArr[i30 + 140] & 255) | ((bArr[i30 + 142] & 255) << 16) | ((bArr[i30 + 143] & 255) << 24));
            long j14 = ((bArr[i30 + 145] & 255) << 8) | (bArr[i30 + 144] & 255) | ((bArr[i30 + 146] & 255) << 16) | ((bArr[i30 + 147] & 255) << 24);
            float fIntBitsToFloat48 = Float.intBitsToFloat((bArr[i30 + 148] & 255) | ((bArr[i30 + 149] & 255) << 8) | ((bArr[i30 + 150] & 255) << 16) | ((bArr[i30 + 151] & 255) << 24));
            long j15 = ((bArr[i30 + 155] & 255) << 24) | ((bArr[i30 + 153] & 255) << 8) | (bArr[i30 + 152] & 255) | ((bArr[i30 + 154] & 255) << 16);
            riddingInfo.setDistance3DAscend(fIntBitsToFloat46);
            riddingInfo.setSpeed3D(fIntBitsToFloat45);
            riddingInfo.setTimeAscend(j13);
            riddingInfo.setDistance3DDescend(fIntBitsToFloat47);
            riddingInfo.setTimeDescend(j14);
            riddingInfo.setDistance3DFlat(fIntBitsToFloat48);
            riddingInfo.setTimeFlat(j15);
            sportSummary.setRiddingInfo(riddingInfo);
        }
        if (j2 <= j) {
            t5t.m(TAG, "endTime <= startTime,timezone changed maybe!");
            sportSummary.setEndTime((j + j9) * 1000);
        }
        return sportSummary;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    public SportSummary parser(byte[] bArr) {
        return parseGpsSummary(bArr);
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.t5t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
class SportSummaryDataParser implements ISportSummaryDataParser {
    private static String TAG = "SportSummaryDataParser";
    private int version;

    public SportSummaryDataParser(int i) {
        this.version = i;
    }

    public static boolean hasRiddingInfo(SportType sportType, int i) {
        return true;
    }

    public SportSummary parseGpsSummary(byte[] bArr) {
        long j;
        int i;
        int i2;
        int i3;
        SportSummary sportSummary;
        SportSummaryDataParser sportSummaryDataParser;
        SportSummary sportSummary2 = new SportSummary();
        sportSummary2.setVersion(this.version);
        int i4 = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
        SportType sportTypeFromValue = SportType.fromValue(i4);
        long j2 = (bArr[2] & 255) | ((bArr[3] & 255) << 8) | ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 24);
        long j3 = (bArr[6] & 255) | ((bArr[7] & 255) << 8) | ((bArr[8] & 255) << 16) | ((bArr[9] & 255) << 24);
        long j4 = (bArr[10] & 255) | ((bArr[11] & 255) << 8) | ((bArr[12] & 255) << 16) | ((bArr[13] & 255) << 24);
        long j5 = ((bArr[15] & 255) << 8) | (bArr[14] & 255) | ((bArr[16] & 255) << 16) | ((bArr[17] & 255) << 24);
        long j6 = ((bArr[20] & 255) << 16) | (bArr[18] & 255) | ((bArr[19] & 255) << 8) | ((bArr[21] & 255) << 24);
        sportSummary2.setSportTypeValue(i4);
        sportSummary2.setStartTime(j2 * 1000);
        sportSummary2.setEndTime(1000 * j3);
        sportSummary2.setBaseLng(j4);
        sportSummary2.setBaseLat(j5);
        sportSummary2.setBaseAlt(j6);
        int i5 = 22;
        if (this.version == 517) {
            int i6 = bArr[22] & 255;
            int i7 = bArr[23] & 255;
            int i8 = bArr[24] & 255;
            int i9 = bArr[25] & 255;
            int i10 = bArr[26] & 255;
            int i11 = bArr[27] & 255;
            int i12 = ((bArr[29] & 255) << 8) | (bArr[28] & 255);
            byte b2 = bArr[30];
            byte b3 = bArr[31];
            byte b4 = bArr[32];
            byte b5 = bArr[33];
            long j7 = (bArr[34] & 255) | ((bArr[35] & 255) << 8) | ((bArr[36] & 255) << 16) | ((bArr[37] & 255) << 24);
            ArrayList arrayList = new ArrayList();
            int i13 = 38;
            int i14 = 0;
            while (i14 < 6) {
                long j8 = j3;
                int i15 = i13 + 3;
                int i16 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
                i13 += 4;
                arrayList.add(Long.valueOf(i16 | ((bArr[i15] & 255) << 24)));
                i14++;
                j3 = j8;
            }
            j = j3;
            ArrayList arrayList2 = new ArrayList();
            for (int i17 = 0; i17 < 6; i17++) {
                int i18 = i13 + 1;
                int i19 = bArr[i13] & 255;
                i13 += 2;
                arrayList2.add(Integer.valueOf(i19 | ((bArr[i18] & 255) << 8)));
            }
            long j9 = ((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24);
            byte b6 = bArr[i13 + 4];
            byte b7 = bArr[i13 + 5];
            int i20 = bArr[i13 + 6] & 255;
            int i21 = bArr[i13 + 7] & 255;
            sportSummary2.setIntervalType(i6);
            sportSummary2.setMinHr(i7);
            sportSummary2.setTe(i8);
            sportSummary2.setSwimPoolLength(i9);
            sportSummary2.setDistanceUnit(i10);
            sportSummary2.setDailyPerfermance(i11);
            sportSummary2.setSecHalfStartTime(i12);
            sportSummary2.setParentStartTime(1000 * j7);
            sportSummary2.setChildStartTime(arrayList);
            sportSummary2.setChildType(arrayList2);
            sportSummary2.setRopeSkipRestTime(j9);
            sportSummary2.setMaxTemperature(b6);
            sportSummary2.setMinTemperature(b7);
            sportSummary2.setWeatherFrom(i20);
            sportSummary2.setWeatherTo(i21);
            i5 = i13 + 20;
        } else {
            j = j3;
        }
        if (this.version < 512) {
            SportAccumInfo sportAccumInfo = new SportAccumInfo();
            float fIntBitsToFloat = Float.intBitsToFloat(((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24));
            float fIntBitsToFloat2 = Float.intBitsToFloat(((bArr[i5 + 5] & 255) << 8) | (bArr[i5 + 4] & 255) | ((bArr[i5 + 6] & 255) << 16) | ((bArr[i5 + 7] & 255) << 24));
            float fIntBitsToFloat3 = Float.intBitsToFloat(((bArr[i5 + 9] & 255) << 8) | (bArr[i5 + 8] & 255) | ((bArr[i5 + 10] & 255) << 16) | ((bArr[i5 + 11] & 255) << 24));
            float fIntBitsToFloat4 = Float.intBitsToFloat(((bArr[i5 + 13] & 255) << 8) | (bArr[i5 + 12] & 255) | ((bArr[i5 + 14] & 255) << 16) | ((bArr[i5 + 15] & 255) << 24));
            float fIntBitsToFloat5 = Float.intBitsToFloat(((bArr[i5 + 17] & 255) << 8) | (bArr[i5 + 16] & 255) | ((bArr[i5 + 18] & 255) << 16) | ((bArr[i5 + 19] & 255) << 24));
            int i22 = ((bArr[i5 + 21] & 255) << 8) | (bArr[i5 + 20] & 255) | ((bArr[i5 + 22] & 255) << 16) | ((bArr[i5 + 23] & 255) << 24);
            int i23 = ((bArr[i5 + 25] & 255) << 8) | (bArr[i5 + 24] & 255) | ((bArr[i5 + 26] & 255) << 16) | ((bArr[i5 + 27] & 255) << 24);
            int i24 = ((bArr[i5 + 29] & 255) << 8) | (bArr[i5 + 28] & 255) | ((bArr[i5 + 30] & 255) << 16) | ((bArr[i5 + 31] & 255) << 24);
            int i25 = ((bArr[i5 + 33] & 255) << 8) | (bArr[i5 + 32] & 255) | ((bArr[i5 + 34] & 255) << 16) | ((bArr[i5 + 35] & 255) << 24);
            long j10 = ((bArr[i5 + 38] & 255) << 16) | ((bArr[i5 + 37] & 255) << 8) | (bArr[i5 + 36] & 255) | ((bArr[i5 + 39] & 255) << 24);
            long j11 = ((bArr[i5 + 42] & 255) << 16) | (bArr[i5 + 40] & 255) | ((bArr[i5 + 41] & 255) << 8) | ((bArr[i5 + 43] & 255) << 24);
            float fIntBitsToFloat6 = Float.intBitsToFloat(((bArr[i5 + 45] & 255) << 8) | (bArr[i5 + 44] & 255) | ((bArr[i5 + 46] & 255) << 16) | ((bArr[i5 + 47] & 255) << 24));
            float fIntBitsToFloat7 = Float.intBitsToFloat(((bArr[i5 + 50] & 255) << 16) | ((bArr[i5 + 49] & 255) << 8) | (bArr[i5 + 48] & 255) | ((bArr[i5 + 51] & 255) << 24));
            float fIntBitsToFloat8 = Float.intBitsToFloat(((bArr[i5 + 54] & 255) << 16) | (bArr[i5 + 52] & 255) | ((bArr[i5 + 53] & 255) << 8) | ((bArr[i5 + 55] & 255) << 24));
            float fIntBitsToFloat9 = Float.intBitsToFloat(((bArr[i5 + 58] & 255) << 16) | (bArr[i5 + 56] & 255) | ((bArr[i5 + 57] & 255) << 8) | ((bArr[i5 + 59] & 255) << 24));
            float fIntBitsToFloat10 = Float.intBitsToFloat(((bArr[i5 + 62] & 255) << 16) | (bArr[i5 + 60] & 255) | ((bArr[i5 + 61] & 255) << 8) | ((bArr[i5 + 63] & 255) << 24));
            int i26 = i5 + 68;
            long j12 = ((bArr[i5 + 66] & 255) << 16) | (bArr[i5 + 64] & 255) | ((bArr[i5 + 65] & 255) << 8) | ((bArr[i5 + 67] & 255) << 24);
            sportAccumInfo.setDistance(fIntBitsToFloat);
            sportAccumInfo.setAscendMeter(fIntBitsToFloat2);
            sportAccumInfo.setDescendMeter(fIntBitsToFloat3);
            sportAccumInfo.setMinAltitude(fIntBitsToFloat4);
            sportAccumInfo.setMaxAltitude(fIntBitsToFloat5);
            sportAccumInfo.setMinLatitude(i22);
            sportAccumInfo.setMaxLatitude(i23);
            sportAccumInfo.setMinLongitude(i24);
            sportAccumInfo.setMaxLongitude(i25);
            sportAccumInfo.setStep(j10);
            sportAccumInfo.setActiveTime(j11);
            sportAccumInfo.setSportCalories(fIntBitsToFloat6);
            sportAccumInfo.setMaxSpeed(fIntBitsToFloat7);
            sportAccumInfo.setMinPace(fIntBitsToFloat8);
            sportAccumInfo.setMaxPace(fIntBitsToFloat9);
            sportAccumInfo.setTotalStride(fIntBitsToFloat10);
            sportAccumInfo.setSecCountHasStep(j12);
            sportSummary2.setAccInfo(sportAccumInfo);
            if (j <= j2) {
                t5t.m(TAG, "endTime <= startTime,timezone changed maybe!");
                sportSummary2.setEndTime((j2 + j11) * 1000);
            }
            if (r4 == SportType.SPORT_TYPE_POOL_SWIM || r4 == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
                SwimInfo swimInfo = new SwimInfo();
                float fIntBitsToFloat11 = Float.intBitsToFloat(((bArr[i5 + 69] & 255) << 8) | (bArr[i26] & 255) | ((bArr[i5 + 70] & 255) << 16) | ((bArr[i5 + 71] & 255) << 24));
                float fIntBitsToFloat12 = Float.intBitsToFloat(((bArr[i5 + 73] & 255) << 8) | (bArr[i5 + 72] & 255) | ((bArr[i5 + 74] & 255) << 16) | ((bArr[i5 + 75] & 255) << 24));
                float fIntBitsToFloat13 = Float.intBitsToFloat(((bArr[i5 + 77] & 255) << 8) | (bArr[i5 + 76] & 255) | ((bArr[i5 + 78] & 255) << 16) | ((bArr[i5 + 79] & 255) << 24));
                int i27 = ((bArr[i5 + 81] & 255) << 8) | (bArr[i5 + 80] & 255);
                int i28 = ((bArr[i5 + 83] & 255) << 8) | (bArr[i5 + 82] & 255);
                int i29 = bArr[i5 + 84] & 255;
                int i30 = bArr[i5 + 85] & 255;
                swimInfo.setDistancePerStroke(fIntBitsToFloat11);
                swimInfo.setAvgStrokeSpeed(fIntBitsToFloat12);
                swimInfo.setAvgPace(fIntBitsToFloat13);
                swimInfo.setStrokes(i27);
                swimInfo.setAvgSwolf(i28);
                swimInfo.setStkStyle(i29);
                swimInfo.setTrips(i30);
                swimInfo.setMaxStrokeSpeed(fIntBitsToFloat7);
                i = i5 + 96;
                sportSummary2.setSwimInfo(swimInfo);
            } else {
                RiddingInfo riddingInfo = new RiddingInfo();
                float fIntBitsToFloat14 = Float.intBitsToFloat(((bArr[i5 + 69] & 255) << 8) | (bArr[i26] & 255) | ((bArr[i5 + 70] & 255) << 16) | ((bArr[i5 + 71] & 255) << 24));
                float fIntBitsToFloat15 = Float.intBitsToFloat(((bArr[i5 + 73] & 255) << 8) | (bArr[i5 + 72] & 255) | ((bArr[i5 + 74] & 255) << 16) | ((bArr[i5 + 75] & 255) << 24));
                long j13 = ((bArr[i5 + 77] & 255) << 8) | (bArr[i5 + 76] & 255) | ((bArr[i5 + 78] & 255) << 16) | ((bArr[i5 + 79] & 255) << 24);
                float fIntBitsToFloat16 = Float.intBitsToFloat(((bArr[i5 + 81] & 255) << 8) | (bArr[i5 + 80] & 255) | ((bArr[i5 + 82] & 255) << 16) | ((bArr[i5 + 83] & 255) << 24));
                long j14 = ((bArr[i5 + 85] & 255) << 8) | (bArr[i5 + 84] & 255) | ((bArr[i5 + 86] & 255) << 16) | ((bArr[i5 + 87] & 255) << 24);
                float fIntBitsToFloat17 = Float.intBitsToFloat((bArr[i5 + 88] & 255) | ((bArr[i5 + 89] & 255) << 8) | ((bArr[i5 + 90] & 255) << 16) | ((bArr[i5 + 91] & 255) << 24));
                int i31 = i5 + 95;
                int i32 = ((bArr[i5 + 93] & 255) << 8) | (bArr[i5 + 92] & 255) | ((bArr[i5 + 94] & 255) << 16);
                i = i5 + 96;
                long j15 = i32 | ((bArr[i31] & 255) << 24);
                riddingInfo.setDistance3DAscend(fIntBitsToFloat14);
                riddingInfo.setSpeed3D(fIntBitsToFloat15);
                riddingInfo.setTimeAscend(j13);
                riddingInfo.setDistance3DDescend(fIntBitsToFloat16);
                riddingInfo.setTimeDescend(j14);
                riddingInfo.setDistance3DFlat(fIntBitsToFloat17);
                riddingInfo.setTimeFlat(j15);
                sportSummary2.setRiddingInfo(riddingInfo);
            }
            sportSummary2.setStatisInfo(new SportStatisInfo(((bArr[i + 1] & 255) << 8) | (bArr[i] & 255), ((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255), (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8)));
            return sportSummary2;
        }
        SportAccumInfo sportAccumInfo2 = new SportAccumInfo();
        long j16 = ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24);
        long j17 = (bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8) | ((bArr[i5 + 6] & 255) << 16) | ((bArr[i5 + 7] & 255) << 24);
        int i33 = (bArr[i5 + 8] & 255) | ((bArr[i5 + 9] & 255) << 8) | ((bArr[i5 + 10] & 255) << 16) | ((bArr[i5 + 11] & 255) << 24);
        int i34 = ((bArr[i5 + 13] & 255) << 8) | (bArr[i5 + 12] & 255) | ((bArr[i5 + 14] & 255) << 16) | ((bArr[i5 + 15] & 255) << 24);
        int i35 = ((bArr[i5 + 17] & 255) << 8) | (bArr[i5 + 16] & 255) | ((bArr[i5 + 18] & 255) << 16) | ((bArr[i5 + 19] & 255) << 24);
        int i36 = ((bArr[i5 + 21] & 255) << 8) | (bArr[i5 + 20] & 255) | ((bArr[i5 + 22] & 255) << 16) | ((bArr[i5 + 23] & 255) << 24);
        float fIntBitsToFloat18 = Float.intBitsToFloat(((bArr[i5 + 25] & 255) << 8) | (bArr[i5 + 24] & 255) | ((bArr[i5 + 26] & 255) << 16) | ((bArr[i5 + 27] & 255) << 24));
        float fIntBitsToFloat19 = Float.intBitsToFloat(((bArr[i5 + 29] & 255) << 8) | (bArr[i5 + 28] & 255) | ((bArr[i5 + 30] & 255) << 16) | ((bArr[i5 + 31] & 255) << 24));
        float fIntBitsToFloat20 = Float.intBitsToFloat(((bArr[i5 + 34] & 255) << 16) | ((bArr[i5 + 33] & 255) << 8) | (bArr[i5 + 32] & 255) | ((bArr[i5 + 35] & 255) << 24));
        float fIntBitsToFloat21 = Float.intBitsToFloat(((bArr[i5 + 38] & 255) << 16) | (bArr[i5 + 36] & 255) | ((bArr[i5 + 37] & 255) << 8) | ((bArr[i5 + 39] & 255) << 24));
        float fIntBitsToFloat22 = Float.intBitsToFloat(((bArr[i5 + 42] & 255) << 16) | (bArr[i5 + 40] & 255) | ((bArr[i5 + 41] & 255) << 8) | ((bArr[i5 + 43] & 255) << 24));
        float fIntBitsToFloat23 = Float.intBitsToFloat(((bArr[i5 + 46] & 255) << 16) | (bArr[i5 + 44] & 255) | ((bArr[i5 + 45] & 255) << 8) | ((bArr[i5 + 47] & 255) << 24));
        float fIntBitsToFloat24 = Float.intBitsToFloat(((bArr[i5 + 50] & 255) << 16) | (bArr[i5 + 48] & 255) | ((bArr[i5 + 49] & 255) << 8) | ((bArr[i5 + 51] & 255) << 24));
        float fIntBitsToFloat25 = Float.intBitsToFloat(((bArr[i5 + 54] & 255) << 16) | (bArr[i5 + 52] & 255) | ((bArr[i5 + 53] & 255) << 8) | ((bArr[i5 + 55] & 255) << 24));
        float fIntBitsToFloat26 = Float.intBitsToFloat(((bArr[i5 + 58] & 255) << 16) | (bArr[i5 + 56] & 255) | ((bArr[i5 + 57] & 255) << 8) | ((bArr[i5 + 59] & 255) << 24));
        float fIntBitsToFloat27 = Float.intBitsToFloat(((bArr[i5 + 62] & 255) << 16) | (bArr[i5 + 60] & 255) | ((bArr[i5 + 61] & 255) << 8) | ((bArr[i5 + 63] & 255) << 24));
        float fIntBitsToFloat28 = Float.intBitsToFloat(((bArr[i5 + 66] & 255) << 16) | (bArr[i5 + 64] & 255) | ((bArr[i5 + 65] & 255) << 8) | ((bArr[i5 + 67] & 255) << 24));
        float fIntBitsToFloat29 = Float.intBitsToFloat(((bArr[i5 + 70] & 255) << 16) | (bArr[i5 + 68] & 255) | ((bArr[i5 + 69] & 255) << 8) | ((bArr[i5 + 71] & 255) << 24));
        float fIntBitsToFloat30 = Float.intBitsToFloat(((bArr[i5 + 74] & 255) << 16) | (bArr[i5 + 72] & 255) | ((bArr[i5 + 73] & 255) << 8) | ((bArr[i5 + 75] & 255) << 24));
        float fIntBitsToFloat31 = Float.intBitsToFloat(((bArr[i5 + 78] & 255) << 16) | (bArr[i5 + 76] & 255) | ((bArr[i5 + 77] & 255) << 8) | ((bArr[i5 + 79] & 255) << 24));
        float fIntBitsToFloat32 = Float.intBitsToFloat(((bArr[i5 + 82] & 255) << 16) | (bArr[i5 + 80] & 255) | ((bArr[i5 + 81] & 255) << 8) | ((bArr[i5 + 83] & 255) << 24));
        float fIntBitsToFloat33 = Float.intBitsToFloat(((bArr[i5 + 86] & 255) << 16) | (bArr[i5 + 84] & 255) | ((bArr[i5 + 85] & 255) << 8) | ((bArr[i5 + 87] & 255) << 24));
        float fIntBitsToFloat34 = Float.intBitsToFloat(((bArr[i5 + 90] & 255) << 16) | (bArr[i5 + 88] & 255) | ((bArr[i5 + 89] & 255) << 8) | ((bArr[i5 + 91] & 255) << 24));
        float fIntBitsToFloat35 = Float.intBitsToFloat(((bArr[i5 + 94] & 255) << 16) | (bArr[i5 + 92] & 255) | ((bArr[i5 + 93] & 255) << 8) | ((bArr[i5 + 95] & 255) << 24));
        float fIntBitsToFloat36 = Float.intBitsToFloat(((bArr[i5 + 98] & 255) << 16) | (bArr[i5 + 96] & 255) | ((bArr[i5 + 97] & 255) << 8) | ((bArr[i5 + 99] & 255) << 24));
        float fIntBitsToFloat37 = Float.intBitsToFloat(((bArr[i5 + 102] & 255) << 16) | (bArr[i5 + 100] & 255) | ((bArr[i5 + 101] & 255) << 8) | ((bArr[i5 + 103] & 255) << 24));
        int i37 = i5 + 108;
        long j18 = ((bArr[i5 + 106] & 255) << 16) | (bArr[i5 + 104] & 255) | ((bArr[i5 + 105] & 255) << 8) | ((bArr[i5 + 107] & 255) << 24);
        sportAccumInfo2.setStep(j16);
        sportAccumInfo2.setActiveTime(j17);
        sportAccumInfo2.setMaxLatitude(i33);
        sportAccumInfo2.setMinLatitude(i34);
        sportAccumInfo2.setMaxLongitude(i35);
        sportAccumInfo2.setMinLongitude(i36);
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
        sportAccumInfo2.setStepHasDistance(j18);
        sportSummary2.setAccInfo(sportAccumInfo2);
        if (this.version >= 513) {
            i2 = i5 + 116;
            sportSummary2.setStatisInfo(new SportStatisInfo(((bArr[i5 + 109] & 255) << 8) | (bArr[i37] & 255), ((bArr[i5 + 111] & 255) << 8) | (bArr[i5 + 110] & 255), ((bArr[i5 + 113] & 255) << 8) | (bArr[i5 + 112] & 255), ((bArr[i5 + 115] & 255) << 8) | (bArr[i5 + 114] & 255)));
        } else {
            i2 = i37;
        }
        if (sportTypeFromValue == SportType.SPORT_TYPE_POOL_SWIM || sportTypeFromValue == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            SwimInfo swimInfo2 = new SwimInfo();
            float fIntBitsToFloat38 = Float.intBitsToFloat(((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24));
            float fIntBitsToFloat39 = Float.intBitsToFloat(((bArr[i2 + 5] & 255) << 8) | (bArr[i2 + 4] & 255) | ((bArr[i2 + 6] & 255) << 16) | ((bArr[i2 + 7] & 255) << 24));
            float fIntBitsToFloat40 = Float.intBitsToFloat(((bArr[i2 + 9] & 255) << 8) | (bArr[i2 + 8] & 255) | ((bArr[i2 + 10] & 255) << 16) | ((bArr[i2 + 11] & 255) << 24));
            float fIntBitsToFloat41 = Float.intBitsToFloat(((bArr[i2 + 13] & 255) << 8) | (bArr[i2 + 12] & 255) | ((bArr[i2 + 14] & 255) << 16) | ((bArr[i2 + 15] & 255) << 24));
            float fIntBitsToFloat42 = Float.intBitsToFloat(((bArr[i2 + 17] & 255) << 8) | (bArr[i2 + 16] & 255) | ((bArr[i2 + 18] & 255) << 16) | ((bArr[i2 + 19] & 255) << 24));
            float fIntBitsToFloat43 = Float.intBitsToFloat(((bArr[i2 + 21] & 255) << 8) | (bArr[i2 + 20] & 255) | ((bArr[i2 + 22] & 255) << 16) | ((bArr[i2 + 23] & 255) << 24));
            int i38 = ((bArr[i2 + 25] & 255) << 8) | (bArr[i2 + 24] & 255);
            int i39 = ((bArr[i2 + 27] & 255) << 8) | (bArr[i2 + 26] & 255);
            int i40 = ((bArr[i2 + 29] & 255) << 8) | (bArr[i2 + 28] & 255);
            int i41 = (bArr[i2 + 30] & 255) | ((bArr[i2 + 31] & 255) << 8);
            int i42 = (bArr[i2 + 32] & 255) | ((bArr[i2 + 33] & 255) << 8);
            int i43 = i2 + 35;
            int i44 = i2;
            int i45 = bArr[i2 + 34] & 255;
            int i46 = bArr[i43] & 255;
            swimInfo2.setRealtimeDPS(fIntBitsToFloat38);
            swimInfo2.setDistancePerStroke(fIntBitsToFloat39);
            swimInfo2.setAvgStrokeSpeed(fIntBitsToFloat43);
            swimInfo2.setAvgPace(fIntBitsToFloat30);
            swimInfo2.setStrokes(i38);
            swimInfo2.setAvgSwolf(i42);
            swimInfo2.setStkStyle(i45);
            swimInfo2.setTrips(i46);
            swimInfo2.setMaxStrokeSpeed(fIntBitsToFloat25);
            swimInfo2.setRealtimeStrokeSpeed(fIntBitsToFloat40);
            swimInfo2.setMaxStrokeSpeed(fIntBitsToFloat41);
            swimInfo2.setMinStrokeSpeed(fIntBitsToFloat42);
            swimInfo2.setRealtimeSwolf(i39);
            swimInfo2.setMaxSwolf(i40);
            swimInfo2.setMinSwolf(i41);
            i3 = i44 + 46;
            sportSummary = sportSummary2;
            sportSummary.setSwimInfo(swimInfo2);
            sportSummaryDataParser = this;
        } else if (sportTypeFromValue == SportType.SPORT_TYPE_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_BOARD_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_ALPINE_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_CROSS_COUNTRY_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_SKIING_DOUBLE_BOARD || sportTypeFromValue == SportType.SPORT_TYPE_ORIENTEER_SKIING) {
            SkiingInfo skiingInfo = new SkiingInfo();
            float fIntBitsToFloat44 = Float.intBitsToFloat(((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24));
            float fIntBitsToFloat45 = Float.intBitsToFloat(((bArr[i2 + 5] & 255) << 8) | (bArr[i2 + 4] & 255) | ((bArr[i2 + 6] & 255) << 16) | ((bArr[i2 + 7] & 255) << 24));
            float fIntBitsToFloat46 = Float.intBitsToFloat(((bArr[i2 + 9] & 255) << 8) | (bArr[i2 + 8] & 255) | ((bArr[i2 + 10] & 255) << 16) | ((bArr[i2 + 11] & 255) << 24));
            float fIntBitsToFloat47 = Float.intBitsToFloat(((bArr[i2 + 13] & 255) << 8) | (bArr[i2 + 12] & 255) | ((bArr[i2 + 14] & 255) << 16) | ((bArr[i2 + 15] & 255) << 24));
            float fIntBitsToFloat48 = Float.intBitsToFloat(((bArr[i2 + 17] & 255) << 8) | (bArr[i2 + 16] & 255) | ((bArr[i2 + 18] & 255) << 16) | ((bArr[i2 + 19] & 255) << 24));
            float fIntBitsToFloat49 = Float.intBitsToFloat(((bArr[i2 + 21] & 255) << 8) | (bArr[i2 + 20] & 255) | ((bArr[i2 + 22] & 255) << 16) | ((bArr[i2 + 23] & 255) << 24));
            float fIntBitsToFloat50 = Float.intBitsToFloat(((bArr[i2 + 25] & 255) << 8) | (bArr[i2 + 24] & 255) | ((bArr[i2 + 26] & 255) << 16) | ((bArr[i2 + 27] & 255) << 24));
            float fIntBitsToFloat51 = Float.intBitsToFloat(((bArr[i2 + 29] & 255) << 8) | (bArr[i2 + 28] & 255) | ((bArr[i2 + 30] & 255) << 16) | ((bArr[i2 + 31] & 255) << 24));
            float fIntBitsToFloat52 = Float.intBitsToFloat(((bArr[i2 + 33] & 255) << 8) | (bArr[i2 + 32] & 255) | ((bArr[i2 + 34] & 255) << 16) | ((bArr[i2 + 35] & 255) << 24));
            float fIntBitsToFloat53 = Float.intBitsToFloat(((bArr[i2 + 37] & 255) << 8) | (bArr[i2 + 36] & 255) | ((bArr[i2 + 38] & 255) << 16) | ((bArr[i2 + 39] & 255) << 24));
            float fIntBitsToFloat54 = Float.intBitsToFloat(((bArr[i2 + 42] & 255) << 16) | ((bArr[i2 + 41] & 255) << 8) | (bArr[i2 + 40] & 255) | ((bArr[i2 + 43] & 255) << 24));
            float fIntBitsToFloat55 = Float.intBitsToFloat(((bArr[i2 + 46] & 255) << 16) | (bArr[i2 + 44] & 255) | ((bArr[i2 + 45] & 255) << 8) | ((bArr[i2 + 47] & 255) << 24));
            float fIntBitsToFloat56 = Float.intBitsToFloat(((bArr[i2 + 50] & 255) << 16) | (bArr[i2 + 48] & 255) | ((bArr[i2 + 49] & 255) << 8) | ((bArr[i2 + 51] & 255) << 24));
            float fIntBitsToFloat57 = Float.intBitsToFloat(((bArr[i2 + 54] & 255) << 16) | (bArr[i2 + 52] & 255) | ((bArr[i2 + 53] & 255) << 8) | ((bArr[i2 + 55] & 255) << 24));
            int i47 = i2 + 57;
            int i48 = bArr[i2 + 56] & 255;
            i3 = i2 + 58;
            int i49 = i48 | ((bArr[i47] & 255) << 8);
            skiingInfo.setTripDistance(fIntBitsToFloat45);
            skiingInfo.setTripAvgSpeed(fIntBitsToFloat46);
            skiingInfo.setTripMaxSpeed(fIntBitsToFloat47);
            skiingInfo.setTripAcmDescendMeter(fIntBitsToFloat52);
            skiingInfo.setTotalTripsAcmDescendMeter(fIntBitsToFloat53);
            skiingInfo.setMaxSlope(fIntBitsToFloat54);
            skiingInfo.setAvgSlope(fIntBitsToFloat55);
            skiingInfo.setTripSlope(fIntBitsToFloat57);
            skiingInfo.setTrips(i49);
            skiingInfo.setTotalTripsAcmDistance(fIntBitsToFloat44);
            skiingInfo.setAvgSpeed(fIntBitsToFloat49);
            skiingInfo.setTripMinSpeed(fIntBitsToFloat48);
            skiingInfo.setMaxSpeed(fIntBitsToFloat50);
            skiingInfo.setMinSpeed(fIntBitsToFloat51);
            skiingInfo.setMinSlope(fIntBitsToFloat56);
            sportSummary2.setSkiingInfo(skiingInfo);
            sportSummaryDataParser = this;
            sportSummary = sportSummary2;
        } else {
            if (sportTypeFromValue == SportType.SPORT_TYPE_JUMP_ROPE) {
                long j19 = ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
                long j20 = (bArr[i2 + 4] & 255) | ((bArr[i2 + 5] & 255) << 8) | ((bArr[i2 + 6] & 255) << 16) | ((bArr[i2 + 7] & 255) << 24);
                float fIntBitsToFloat58 = Float.intBitsToFloat((bArr[i2 + 8] & 255) | ((bArr[i2 + 9] & 255) << 8) | ((bArr[i2 + 10] & 255) << 16) | ((bArr[i2 + 11] & 255) << 24));
                float fIntBitsToFloat59 = Float.intBitsToFloat(((bArr[i2 + 13] & 255) << 8) | (bArr[i2 + 12] & 255) | ((bArr[i2 + 14] & 255) << 16) | ((bArr[i2 + 15] & 255) << 24));
                float fIntBitsToFloat60 = Float.intBitsToFloat(((bArr[i2 + 17] & 255) << 8) | (bArr[i2 + 16] & 255) | ((bArr[i2 + 18] & 255) << 16) | ((bArr[i2 + 19] & 255) << 24));
                long j21 = ((bArr[i2 + 21] & 255) << 8) | (bArr[i2 + 20] & 255) | ((bArr[i2 + 22] & 255) << 16) | ((bArr[i2 + 23] & 255) << 24);
                float fIntBitsToFloat61 = Float.intBitsToFloat((bArr[i2 + 24] & 255) | ((bArr[i2 + 25] & 255) << 8) | ((bArr[i2 + 26] & 255) << 16) | ((bArr[i2 + 27] & 255) << 24));
                float fIntBitsToFloat62 = Float.intBitsToFloat(((bArr[i2 + 29] & 255) << 8) | (bArr[i2 + 28] & 255) | ((bArr[i2 + 30] & 255) << 16) | ((bArr[i2 + 31] & 255) << 24));
                int i50 = i2 + 35;
                int i51 = ((bArr[i2 + 33] & 255) << 8) | (bArr[i2 + 32] & 255) | ((bArr[i2 + 34] & 255) << 16);
                i3 = i2 + 36;
                sportSummary2.setSkipRopeInfo(new SkipRopeInfo(j19, j20, fIntBitsToFloat58, fIntBitsToFloat59, fIntBitsToFloat60, j21, fIntBitsToFloat61, fIntBitsToFloat62, i51 | ((bArr[i50] & 255) << 24)));
            } else if (sportTypeFromValue == SportType.SPORT_TYPE_ROWING) {
                long j22 = ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
                long j23 = (bArr[i2 + 4] & 255) | ((bArr[i2 + 5] & 255) << 8) | ((bArr[i2 + 6] & 255) << 16) | ((bArr[i2 + 7] & 255) << 24);
                float fIntBitsToFloat63 = Float.intBitsToFloat((bArr[i2 + 8] & 255) | ((bArr[i2 + 9] & 255) << 8) | ((bArr[i2 + 10] & 255) << 16) | ((bArr[i2 + 11] & 255) << 24));
                float fIntBitsToFloat64 = Float.intBitsToFloat(((bArr[i2 + 13] & 255) << 8) | (bArr[i2 + 12] & 255) | ((bArr[i2 + 14] & 255) << 16) | ((bArr[i2 + 15] & 255) << 24));
                long j24 = ((bArr[i2 + 17] & 255) << 8) | (bArr[i2 + 16] & 255) | ((bArr[i2 + 18] & 255) << 16) | ((bArr[i2 + 19] & 255) << 24);
                float fIntBitsToFloat65 = Float.intBitsToFloat((bArr[i2 + 20] & 255) | ((bArr[i2 + 21] & 255) << 8) | ((bArr[i2 + 22] & 255) << 16) | ((bArr[i2 + 23] & 255) << 24));
                float fIntBitsToFloat66 = Float.intBitsToFloat(((bArr[i2 + 25] & 255) << 8) | (bArr[i2 + 24] & 255) | ((bArr[i2 + 26] & 255) << 16) | ((bArr[i2 + 27] & 255) << 24));
                long j25 = ((bArr[i2 + 29] & 255) << 8) | (bArr[i2 + 28] & 255) | ((bArr[i2 + 30] & 255) << 16) | ((bArr[i2 + 31] & 255) << 24);
                float fIntBitsToFloat67 = Float.intBitsToFloat((bArr[i2 + 32] & 255) | ((bArr[i2 + 33] & 255) << 8) | ((bArr[i2 + 34] & 255) << 16) | ((bArr[i2 + 35] & 255) << 24));
                float fIntBitsToFloat68 = Float.intBitsToFloat(((bArr[i2 + 37] & 255) << 8) | (bArr[i2 + 36] & 255) | ((bArr[i2 + 38] & 255) << 16) | ((bArr[i2 + 39] & 255) << 24));
                int i52 = i2 + 43;
                int i53 = ((bArr[i2 + 41] & 255) << 8) | (bArr[i2 + 40] & 255) | ((bArr[i2 + 42] & 255) << 16);
                i3 = i2 + 44;
                sportSummary2.setRowingInfo(new RowingInfo(j22, j23, fIntBitsToFloat63, fIntBitsToFloat64, j24, fIntBitsToFloat65, fIntBitsToFloat66, j25, fIntBitsToFloat67, fIntBitsToFloat68, Float.intBitsToFloat(i53 | ((bArr[i52] & 255) << 24))));
            } else {
                RiddingInfo riddingInfo2 = new RiddingInfo();
                float fIntBitsToFloat69 = Float.intBitsToFloat(((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24));
                float fIntBitsToFloat70 = Float.intBitsToFloat(((bArr[i2 + 5] & 255) << 8) | (bArr[i2 + 4] & 255) | ((bArr[i2 + 6] & 255) << 16) | ((bArr[i2 + 7] & 255) << 24));
                long j26 = ((bArr[i2 + 9] & 255) << 8) | (bArr[i2 + 8] & 255) | ((bArr[i2 + 10] & 255) << 16) | ((bArr[i2 + 11] & 255) << 24);
                float fIntBitsToFloat71 = Float.intBitsToFloat((bArr[i2 + 12] & 255) | ((bArr[i2 + 13] & 255) << 8) | ((bArr[i2 + 14] & 255) << 16) | ((bArr[i2 + 15] & 255) << 24));
                long j27 = ((bArr[i2 + 17] & 255) << 8) | (bArr[i2 + 16] & 255) | ((bArr[i2 + 18] & 255) << 16) | ((bArr[i2 + 19] & 255) << 24);
                float fIntBitsToFloat72 = Float.intBitsToFloat((bArr[i2 + 20] & 255) | ((bArr[i2 + 21] & 255) << 8) | ((bArr[i2 + 22] & 255) << 16) | ((bArr[i2 + 23] & 255) << 24));
                int i54 = i2 + 27;
                int i55 = ((bArr[i2 + 25] & 255) << 8) | (bArr[i2 + 24] & 255) | ((bArr[i2 + 26] & 255) << 16);
                i3 = i2 + 28;
                long j28 = i55 | ((bArr[i54] & 255) << 24);
                riddingInfo2.setDistance3DAscend(fIntBitsToFloat70);
                riddingInfo2.setSpeed3D(fIntBitsToFloat69);
                riddingInfo2.setTimeAscend(j26);
                riddingInfo2.setDistance3DDescend(fIntBitsToFloat71);
                riddingInfo2.setTimeDescend(j27);
                riddingInfo2.setDistance3DFlat(fIntBitsToFloat72);
                riddingInfo2.setTimeFlat(j28);
                sportSummary2.setRiddingInfo(riddingInfo2);
            }
            sportSummaryDataParser = this;
            sportSummary = sportSummary2;
        }
        if (sportSummaryDataParser.version == 512) {
            sportSummary.setStatisInfo(new SportStatisInfo(((bArr[i3 + 1] & 255) << 8) | (bArr[i3] & 255), ((bArr[i3 + 3] & 255) << 8) | (bArr[i3 + 2] & 255), (bArr[i3 + 4] & 255) | ((bArr[i3 + 5] & 255) << 8)));
        }
        return sportSummary;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    public SportSummary parser(byte[] bArr) {
        return parseGpsSummary(bArr);
    }
}

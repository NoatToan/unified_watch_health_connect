package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.t5t;
import defpackage.tet;

/* JADX INFO: loaded from: classes11.dex */
public class TimexSummaryParser implements ISportSummaryDataParser {
    private static String TAG = "TimexSummaryParser";
    private final int WORKOUT_DATA_LEN = 28;
    private int version;

    public TimexSummaryParser(int i) {
        this.version = i;
    }

    private int parseCoach(SportSummary sportSummary, byte[] bArr, int i) {
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        t5t.d(TAG, "parseCoach: " + tet.x(bArr2));
        CoachingInfo coachingInfo = new CoachingInfo(bArr2);
        t5t.d(TAG, "Parsed CoachingInfo: " + coachingInfo);
        sportSummary.setCoachingInfo(coachingInfo);
        if (length < 52) {
            return length;
        }
        return 52;
    }

    private int parseCrossFit(SportSummary sportSummary, byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i, bArr2, 0, 4);
        t5t.d(TAG, "parseCrossFit: " + tet.x(bArr2));
        CrossFitInfo crossFitInfo = new CrossFitInfo(bArr2);
        t5t.d(TAG, "Parsed CrossFitInfo: " + crossFitInfo);
        sportSummary.setCrossFitInfo(crossFitInfo);
        return 4;
    }

    private int parseRaceMode(SportSummary sportSummary, byte[] bArr, int i) {
        if (bArr.length - i >= 12) {
            byte[] bArr2 = new byte[12];
            System.arraycopy(bArr, i, bArr2, 0, 12);
            t5t.d(TAG, "parse RaceMode: " + tet.x(bArr2));
            RaceModeInfo raceModeInfo = new RaceModeInfo(bArr2);
            t5t.d(TAG, "Parsed RaceModeInfo: " + raceModeInfo);
            sportSummary.setRaceModeInfo(raceModeInfo);
        }
        return 12;
    }

    private int parseSportAvgInfo(int i, SportSummary sportSummary, byte[] bArr, int i2, int i3) {
        int i4 = i2 + 6;
        sportSummary.setStatisInfo(new SportStatisInfo(((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255), ((bArr[i2 + 3] & 255) << 8) | (bArr[i2 + 2] & 255), ((bArr[i2 + 5] & 255) << 8) | (bArr[i2 + 4] & 255), i3));
        if (i >= 261) {
            i4 = i2 + 8;
        }
        return i4 - i2;
    }

    private SportSummary parseTimexGpsSummary(byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        SportType sportTypeFromValue;
        int i;
        int i2;
        int sportAvgInfo;
        SportSummary sportSummary = new SportSummary();
        sportSummary.setVersion(this.version);
        byte[] bArr2 = {bArr[0], bArr[1]};
        SportType sportTypeFromValue2 = SportType.SPORT_TYPE_NONE;
        if (this.version < 261) {
            z2 = false;
            z3 = false;
            sportTypeFromValue = SportType.fromValue((bArr2[0] & 255) | ((bArr2[1] & 255) << 8));
            z = true;
        } else {
            byte b2 = bArr2[0];
            z = (b2 & 16) > 0;
            z2 = (b2 & 32) > 0;
            z3 = (b2 & 64) > 0;
            if (z) {
                sportTypeFromValue2 = SportType.fromValue(b2 & 15);
            }
            sportTypeFromValue = sportTypeFromValue2;
        }
        sportSummary.setCoaching(z2);
        sportSummary.setCrossFit(z3);
        sportSummary.setType(sportTypeFromValue);
        if (this.version >= 261) {
            i = (bArr[4] & 255) | ((bArr[5] & 255) << 8);
            i2 = 6;
        } else {
            i = 0;
            i2 = 2;
        }
        long j = (bArr[i2] & 255) | ((bArr[1 + i2] & 255) << 8) | ((bArr[2 + i2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
        boolean z4 = z2;
        long j2 = ((bArr[6 + i2] & 255) << 16) | ((bArr[5 + i2] & 255) << 8) | (bArr[4 + i2] & 255) | ((bArr[i2 + 7] & 255) << 24);
        long j3 = ((bArr[i2 + 9] & 255) << 8) | (bArr[i2 + 8] & 255) | ((bArr[i2 + 10] & 255) << 16) | ((bArr[i2 + 11] & 255) << 24);
        SportType sportType = sportTypeFromValue;
        boolean z5 = z;
        long j4 = (bArr[i2 + 12] & 255) | ((bArr[i2 + 13] & 255) << 8) | ((bArr[i2 + 14] & 255) << 16) | ((bArr[i2 + 15] & 255) << 24);
        boolean z6 = z3;
        long j5 = ((bArr[i2 + 17] & 255) << 8) | (bArr[i2 + 16] & 255) | ((bArr[i2 + 18] & 255) << 16) | ((bArr[i2 + 19] & 255) << 24);
        int i3 = i;
        sportSummary.setStartTime(j * 1000);
        sportSummary.setEndTime(j2 * 1000);
        sportSummary.setBaseLng(j3);
        sportSummary.setBaseLat(j4);
        sportSummary.setBaseAlt(j5);
        SportAccumInfo sportAccumInfo = new SportAccumInfo();
        float fIntBitsToFloat = Float.intBitsToFloat(((bArr[i2 + 21] & 255) << 8) | (bArr[i2 + 20] & 255) | ((bArr[i2 + 22] & 255) << 16) | ((bArr[i2 + 23] & 255) << 24));
        float fIntBitsToFloat2 = Float.intBitsToFloat(((bArr[i2 + 25] & 255) << 8) | (bArr[i2 + 24] & 255) | ((bArr[i2 + 26] & 255) << 16) | ((bArr[i2 + 27] & 255) << 24));
        float fIntBitsToFloat3 = Float.intBitsToFloat(((bArr[i2 + 29] & 255) << 8) | (bArr[i2 + 28] & 255) | ((bArr[i2 + 30] & 255) << 16) | ((bArr[i2 + 31] & 255) << 24));
        float fIntBitsToFloat4 = Float.intBitsToFloat(((bArr[i2 + 33] & 255) << 8) | (bArr[i2 + 32] & 255) | ((bArr[i2 + 34] & 255) << 16) | ((bArr[i2 + 35] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat(((bArr[i2 + 37] & 255) << 8) | (bArr[i2 + 36] & 255) | ((bArr[i2 + 38] & 255) << 16) | ((bArr[i2 + 39] & 255) << 24));
        int i4 = ((bArr[i2 + 42] & 255) << 16) | ((bArr[i2 + 41] & 255) << 8) | (bArr[i2 + 40] & 255) | ((bArr[i2 + 43] & 255) << 24);
        int i5 = ((bArr[i2 + 46] & 255) << 16) | (bArr[i2 + 44] & 255) | ((bArr[i2 + 45] & 255) << 8) | ((bArr[i2 + 47] & 255) << 24);
        int i6 = (bArr[i2 + 48] & 255) | ((bArr[i2 + 49] & 255) << 8) | ((bArr[i2 + 50] & 255) << 16) | ((bArr[i2 + 51] & 255) << 24);
        int i7 = ((bArr[i2 + 54] & 255) << 16) | ((bArr[i2 + 53] & 255) << 8) | (bArr[i2 + 52] & 255) | ((bArr[i2 + 55] & 255) << 24);
        long j6 = (bArr[i2 + 56] & 255) | ((bArr[i2 + 57] & 255) << 8) | ((bArr[i2 + 58] & 255) << 16) | ((bArr[i2 + 59] & 255) << 24);
        long j7 = ((bArr[i2 + 61] & 255) << 8) | (bArr[i2 + 60] & 255) | ((bArr[i2 + 62] & 255) << 16) | ((bArr[i2 + 63] & 255) << 24);
        float fIntBitsToFloat6 = Float.intBitsToFloat(((bArr[i2 + 65] & 255) << 8) | (bArr[i2 + 64] & 255) | ((bArr[i2 + 66] & 255) << 16) | ((bArr[i2 + 67] & 255) << 24));
        float fIntBitsToFloat7 = Float.intBitsToFloat(((bArr[i2 + 69] & 255) << 8) | (bArr[i2 + 68] & 255) | ((bArr[i2 + 70] & 255) << 16) | ((bArr[i2 + 71] & 255) << 24));
        float fIntBitsToFloat8 = Float.intBitsToFloat(((bArr[i2 + 74] & 255) << 16) | ((bArr[i2 + 73] & 255) << 8) | (bArr[i2 + 72] & 255) | ((bArr[i2 + 75] & 255) << 24));
        float fIntBitsToFloat9 = Float.intBitsToFloat(((bArr[i2 + 78] & 255) << 16) | (bArr[i2 + 76] & 255) | ((bArr[i2 + 77] & 255) << 8) | ((bArr[i2 + 79] & 255) << 24));
        float fIntBitsToFloat10 = Float.intBitsToFloat(((bArr[i2 + 82] & 255) << 16) | (bArr[i2 + 80] & 255) | ((bArr[i2 + 81] & 255) << 8) | ((bArr[i2 + 83] & 255) << 24));
        int i8 = i2 + 88;
        long j8 = ((bArr[i2 + 86] & 255) << 16) | (bArr[i2 + 84] & 255) | ((bArr[i2 + 85] & 255) << 8) | ((bArr[i2 + 87] & 255) << 24);
        sportAccumInfo.setDistance(fIntBitsToFloat);
        sportAccumInfo.setAscendMeter(fIntBitsToFloat2);
        sportAccumInfo.setDescendMeter(fIntBitsToFloat3);
        sportAccumInfo.setMinAltitude(fIntBitsToFloat4);
        sportAccumInfo.setMaxAltitude(fIntBitsToFloat5);
        sportAccumInfo.setMinLatitude(i4);
        sportAccumInfo.setMaxLatitude(i5);
        sportAccumInfo.setMinLongitude(i6);
        sportAccumInfo.setMaxLongitude(i7);
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
            t5t.d(TAG, "Error sport data: startTime - " + j + ", endTime - " + j2 + ", activeTime - " + j7);
            sportSummary.setEndTime((j + (j7 > 0 ? j7 : 1L)) * 1000);
        }
        int i9 = this.version;
        if (i9 < 261) {
            parseSportAvgInfo(i9, sportSummary, bArr, i2 + 116, i3);
        } else {
            sportAvgInfo = i8 + parseSportAvgInfo(i9, sportSummary, bArr, i8, i3);
        }
        if (z4) {
            sportAvgInfo = i8;
            parseCoach(sportSummary, bArr, sportAvgInfo);
        } else if (z6) {
            parseCrossFit(sportSummary, bArr, sportAvgInfo);
        } else if (z5) {
            parseWorkout(sportSummary, sportType, bArr, sportAvgInfo, fIntBitsToFloat7);
        }
        parseRaceMode(sportSummary, bArr, sportAvgInfo + 52);
        return sportSummary;
    }

    private int parseWorkout(SportSummary sportSummary, SportType sportType, byte[] bArr, int i, float f) {
        if (sportType == SportType.SPORT_TYPE_POOL_SWIM || sportType == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            SwimInfo swimInfo = new SwimInfo();
            float fIntBitsToFloat = Float.intBitsToFloat(((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24));
            float fIntBitsToFloat2 = Float.intBitsToFloat(((bArr[i + 5] & 255) << 8) | (bArr[i + 4] & 255) | ((bArr[i + 6] & 255) << 16) | ((bArr[i + 7] & 255) << 24));
            float fIntBitsToFloat3 = Float.intBitsToFloat(((bArr[i + 9] & 255) << 8) | (bArr[i + 8] & 255) | ((bArr[i + 10] & 255) << 16) | ((bArr[i + 11] & 255) << 24));
            int i2 = ((bArr[i + 13] & 255) << 8) | (bArr[i + 12] & 255);
            int i3 = ((bArr[i + 15] & 255) << 8) | (bArr[i + 14] & 255);
            int i4 = bArr[i + 16] & 255;
            int i5 = bArr[i + 17] & 255;
            swimInfo.setDistancePerStroke(fIntBitsToFloat);
            swimInfo.setAvgStrokeSpeed(fIntBitsToFloat2);
            swimInfo.setAvgPace(fIntBitsToFloat3);
            swimInfo.setStrokes(i2);
            swimInfo.setAvgSwolf(i3);
            swimInfo.setStkStyle(i4);
            swimInfo.setTrips(i5);
            swimInfo.setMaxStrokeSpeed(f);
            sportSummary.setSwimInfo(swimInfo);
            return 28;
        }
        RiddingInfo riddingInfo = new RiddingInfo();
        float fIntBitsToFloat4 = Float.intBitsToFloat(((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat(((bArr[i + 5] & 255) << 8) | (bArr[i + 4] & 255) | ((bArr[i + 6] & 255) << 16) | ((bArr[i + 7] & 255) << 24));
        long j = ((bArr[i + 9] & 255) << 8) | (bArr[i + 8] & 255) | ((bArr[i + 10] & 255) << 16) | ((bArr[i + 11] & 255) << 24);
        float fIntBitsToFloat6 = Float.intBitsToFloat((bArr[i + 12] & 255) | ((bArr[i + 13] & 255) << 8) | ((bArr[i + 14] & 255) << 16) | ((bArr[i + 15] & 255) << 24));
        long j2 = ((bArr[i + 17] & 255) << 8) | (bArr[i + 16] & 255) | ((bArr[i + 18] & 255) << 16) | ((bArr[i + 19] & 255) << 24);
        float fIntBitsToFloat7 = Float.intBitsToFloat((bArr[i + 20] & 255) | ((bArr[i + 21] & 255) << 8) | ((bArr[i + 22] & 255) << 16) | ((bArr[i + 23] & 255) << 24));
        long j3 = ((bArr[i + 27] & 255) << 24) | ((bArr[i + 25] & 255) << 8) | (bArr[i + 24] & 255) | ((bArr[i + 26] & 255) << 16);
        riddingInfo.setDistance3DAscend(fIntBitsToFloat4);
        riddingInfo.setSpeed3D(fIntBitsToFloat5);
        riddingInfo.setTimeAscend(j);
        riddingInfo.setDistance3DDescend(fIntBitsToFloat6);
        riddingInfo.setTimeDescend(j2);
        riddingInfo.setDistance3DFlat(fIntBitsToFloat7);
        riddingInfo.setTimeFlat(j3);
        sportSummary.setRiddingInfo(riddingInfo);
        return 28;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    public SportSummary parser(byte[] bArr) {
        return parseTimexGpsSummary(bArr);
    }
}

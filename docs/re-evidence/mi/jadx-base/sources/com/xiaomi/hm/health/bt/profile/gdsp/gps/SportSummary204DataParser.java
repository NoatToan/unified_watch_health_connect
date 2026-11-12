package com.xiaomi.hm.health.bt.profile.gdsp.gps;

/* JADX INFO: loaded from: classes11.dex */
class SportSummary204DataParser implements ISportSummaryDataParser {
    private static String TAG = "SportSummaryDataParser";
    private int version;

    public SportSummary204DataParser(int i) {
        this.version = i;
    }

    public static boolean hasRiddingInfo(SportType sportType, int i) {
        return ((i == 515 || i == 516 || i == 518) && sportType == SportType.SPORT_TYPE_ODRUN) || sportType == SportType.SPORT_TYPE_RIDING || sportType == SportType.SPORT_TYPE_CROSS_COUNTRY_RUN || sportType == SportType.SPORT_TYPE_CLIMB || sportType == SportType.SPORT_TYPE_ODTREKKING;
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
        long j5 = ((bArr[19] & 255) << 8) | (bArr[18] & 255) | ((bArr[20] & 255) << 16) | ((bArr[21] & 255) << 24);
        sportSummary.parentStartTime = ((long) (((bArr[23] & 255) << 8) | (bArr[22] & 255) | ((bArr[24] & 255) << 16) | ((bArr[25] & 255) << 24))) * 1000;
        sportSummary.setSportTypeValue(i);
        sportSummary.setStartTime(j * 1000);
        sportSummary.setEndTime(j2 * 1000);
        sportSummary.setBaseLng(j3);
        sportSummary.setBaseLat(j4);
        sportSummary.setBaseAlt(j5);
        SportAccumInfo sportAccumInfo = new SportAccumInfo();
        long j6 = (bArr[26] & 255) | ((bArr[27] & 255) << 8) | ((bArr[28] & 255) << 16) | ((bArr[29] & 255) << 24);
        long j7 = (bArr[30] & 255) | ((bArr[31] & 255) << 8) | ((bArr[32] & 255) << 16) | ((bArr[33] & 255) << 24);
        int i2 = (bArr[34] & 255) | ((bArr[35] & 255) << 8) | ((bArr[36] & 255) << 16) | ((bArr[37] & 255) << 24);
        int i3 = (bArr[38] & 255) | ((bArr[39] & 255) << 8) | ((bArr[40] & 255) << 16) | ((bArr[41] & 255) << 24);
        int i4 = (bArr[42] & 255) | ((bArr[43] & 255) << 8) | ((bArr[44] & 255) << 16) | ((bArr[45] & 255) << 24);
        int i5 = (bArr[46] & 255) | ((bArr[47] & 255) << 8) | ((bArr[48] & 255) << 16) | ((bArr[49] & 255) << 24);
        float fIntBitsToFloat = Float.intBitsToFloat((bArr[50] & 255) | ((bArr[51] & 255) << 8) | ((bArr[52] & 255) << 16) | ((bArr[53] & 255) << 24));
        float fIntBitsToFloat2 = Float.intBitsToFloat((bArr[54] & 255) | ((bArr[55] & 255) << 8) | ((bArr[56] & 255) << 16) | ((bArr[57] & 255) << 24));
        float fIntBitsToFloat3 = Float.intBitsToFloat((bArr[58] & 255) | ((bArr[59] & 255) << 8) | ((bArr[60] & 255) << 16) | ((bArr[61] & 255) << 24));
        float fIntBitsToFloat4 = Float.intBitsToFloat((bArr[62] & 255) | ((bArr[63] & 255) << 8) | ((bArr[64] & 255) << 16) | ((bArr[65] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat(((bArr[67] & 255) << 8) | (bArr[66] & 255) | ((bArr[68] & 255) << 16) | ((bArr[69] & 255) << 24));
        float fIntBitsToFloat6 = Float.intBitsToFloat(((bArr[71] & 255) << 8) | (bArr[70] & 255) | ((bArr[72] & 255) << 16) | ((bArr[73] & 255) << 24));
        float fIntBitsToFloat7 = Float.intBitsToFloat(((bArr[75] & 255) << 8) | (bArr[74] & 255) | ((bArr[76] & 255) << 16) | ((bArr[77] & 255) << 24));
        float fIntBitsToFloat8 = Float.intBitsToFloat(((bArr[79] & 255) << 8) | (bArr[78] & 255) | ((bArr[80] & 255) << 16) | ((bArr[81] & 255) << 24));
        float fIntBitsToFloat9 = Float.intBitsToFloat(((bArr[83] & 255) << 8) | (bArr[82] & 255) | ((bArr[84] & 255) << 16) | ((bArr[85] & 255) << 24));
        float fIntBitsToFloat10 = Float.intBitsToFloat(((bArr[87] & 255) << 8) | (bArr[86] & 255) | ((bArr[88] & 255) << 16) | ((bArr[89] & 255) << 24));
        float fIntBitsToFloat11 = Float.intBitsToFloat(((bArr[91] & 255) << 8) | (bArr[90] & 255) | ((bArr[92] & 255) << 16) | ((bArr[93] & 255) << 24));
        float fIntBitsToFloat12 = Float.intBitsToFloat(((bArr[95] & 255) << 8) | (bArr[94] & 255) | ((bArr[96] & 255) << 16) | ((bArr[97] & 255) << 24));
        float fIntBitsToFloat13 = Float.intBitsToFloat(((bArr[99] & 255) << 8) | (bArr[98] & 255) | ((bArr[100] & 255) << 16) | ((bArr[101] & 255) << 24));
        float fIntBitsToFloat14 = Float.intBitsToFloat(((bArr[103] & 255) << 8) | (bArr[102] & 255) | ((bArr[104] & 255) << 16) | ((bArr[105] & 255) << 24));
        float fIntBitsToFloat15 = Float.intBitsToFloat(((bArr[107] & 255) << 8) | (bArr[106] & 255) | ((bArr[108] & 255) << 16) | ((bArr[109] & 255) << 24));
        float fIntBitsToFloat16 = Float.intBitsToFloat(((bArr[111] & 255) << 8) | (bArr[110] & 255) | ((bArr[112] & 255) << 16) | ((bArr[113] & 255) << 24));
        float fIntBitsToFloat17 = Float.intBitsToFloat(((bArr[115] & 255) << 8) | (bArr[114] & 255) | ((bArr[116] & 255) << 16) | ((bArr[117] & 255) << 24));
        float fIntBitsToFloat18 = Float.intBitsToFloat(((bArr[119] & 255) << 8) | (bArr[118] & 255) | ((bArr[120] & 255) << 16) | ((bArr[121] & 255) << 24));
        float fIntBitsToFloat19 = Float.intBitsToFloat(((bArr[123] & 255) << 8) | (bArr[122] & 255) | ((bArr[124] & 255) << 16) | ((bArr[125] & 255) << 24));
        float fIntBitsToFloat20 = Float.intBitsToFloat(((bArr[127] & 255) << 8) | (bArr[126] & 255) | ((bArr[128] & 255) << 16) | ((bArr[129] & 255) << 24));
        long j8 = ((bArr[131] & 255) << 8) | (bArr[130] & 255) | ((bArr[132] & 255) << 16) | ((bArr[133] & 255) << 24);
        sportAccumInfo.setStep(j6);
        sportAccumInfo.setActiveTime(j7);
        sportAccumInfo.setMaxLatitude(i2);
        sportAccumInfo.setMinLatitude(i3);
        sportAccumInfo.setMaxLongitude(i4);
        sportAccumInfo.setMinLongitude(i5);
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
        sportAccumInfo.setStepHasDistance(j8);
        sportSummary.setAccInfo(sportAccumInfo);
        sportSummary.setStatisInfo(new SportStatisInfo((bArr[134] & 255) | ((bArr[135] & 255) << 8), (bArr[136] & 255) | ((bArr[137] & 255) << 8), (bArr[138] & 255) | ((bArr[139] & 255) << 8), (bArr[140] & 255) | ((bArr[141] & 255) << 8)));
        if (sportTypeFromValue == SportType.SPORT_TYPE_POOL_SWIM || sportTypeFromValue == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            SwimInfo swimInfo = new SwimInfo();
            float fIntBitsToFloat21 = Float.intBitsToFloat((bArr[142] & 255) | ((bArr[143] & 255) << 8) | ((bArr[144] & 255) << 16) | ((bArr[145] & 255) << 24));
            float fIntBitsToFloat22 = Float.intBitsToFloat((bArr[146] & 255) | ((bArr[147] & 255) << 8) | ((bArr[148] & 255) << 16) | ((bArr[149] & 255) << 24));
            float fIntBitsToFloat23 = Float.intBitsToFloat(((bArr[153] & 255) << 24) | ((bArr[152] & 255) << 16) | ((bArr[151] & 255) << 8) | (bArr[150] & 255));
            float fIntBitsToFloat24 = Float.intBitsToFloat(((bArr[157] & 255) << 24) | ((bArr[156] & 255) << 16) | ((bArr[155] & 255) << 8) | (bArr[154] & 255));
            float fIntBitsToFloat25 = Float.intBitsToFloat((bArr[158] & 255) | ((bArr[159] & 255) << 8) | ((bArr[160] & 255) << 16) | ((bArr[161] & 255) << 24));
            float fIntBitsToFloat26 = Float.intBitsToFloat((bArr[162] & 255) | ((bArr[163] & 255) << 8) | ((bArr[164] & 255) << 16) | ((bArr[165] & 255) << 24));
            int i6 = (bArr[166] & 255) | ((bArr[167] & 255) << 8);
            int i7 = (bArr[168] & 255) | ((bArr[169] & 255) << 8);
            int i8 = (bArr[170] & 255) | ((bArr[171] & 255) << 8);
            int i9 = (bArr[172] & 255) | ((bArr[173] & 255) << 8);
            int i10 = ((bArr[175] & 255) << 8) | (bArr[174] & 255);
            int i11 = bArr[176] & 255;
            int i12 = bArr[177] & 255;
            swimInfo.setRealtimeDPS(fIntBitsToFloat21);
            swimInfo.setDistancePerStroke(fIntBitsToFloat22);
            swimInfo.setAvgStrokeSpeed(fIntBitsToFloat26);
            swimInfo.setAvgPace(fIntBitsToFloat13);
            swimInfo.setStrokes(i6);
            swimInfo.setAvgSwolf(i10);
            swimInfo.setStkStyle(i11);
            swimInfo.setTrips(i12);
            swimInfo.setMaxStrokeSpeed(fIntBitsToFloat8);
            swimInfo.setRealtimeStrokeSpeed(fIntBitsToFloat23);
            swimInfo.setMaxStrokeSpeed(fIntBitsToFloat24);
            swimInfo.setMinStrokeSpeed(fIntBitsToFloat25);
            swimInfo.setRealtimeSwolf(i7);
            swimInfo.setMaxSwolf(i8);
            swimInfo.setMinSwolf(i9);
            sportSummary.setSwimInfo(swimInfo);
            return sportSummary;
        }
        if (sportTypeFromValue != SportType.SPORT_TYPE_SKIING && sportTypeFromValue != SportType.SPORT_TYPE_BOARD_SKIING && sportTypeFromValue != SportType.SPORT_TYPE_ALPINE_SKIING && sportTypeFromValue != SportType.SPORT_TYPE_CROSS_COUNTRY_SKIING && sportTypeFromValue != SportType.SPORT_TYPE_SKIING_DOUBLE_BOARD && sportTypeFromValue != SportType.SPORT_TYPE_ORIENTEER_SKIING) {
            if (sportTypeFromValue == SportType.SPORT_TYPE_JUMP_ROPE) {
                sportSummary.setSkipRopeInfo(new SkipRopeInfo((bArr[142] & 255) | ((bArr[143] & 255) << 8) | ((bArr[144] & 255) << 16) | ((bArr[145] & 255) << 24), (bArr[146] & 255) | ((bArr[147] & 255) << 8) | ((bArr[148] & 255) << 16) | ((bArr[149] & 255) << 24), Float.intBitsToFloat((bArr[150] & 255) | ((bArr[151] & 255) << 8) | ((bArr[152] & 255) << 16) | ((bArr[153] & 255) << 24)), Float.intBitsToFloat((bArr[154] & 255) | ((bArr[155] & 255) << 8) | ((bArr[156] & 255) << 16) | ((bArr[157] & 255) << 24)), Float.intBitsToFloat((bArr[158] & 255) | ((bArr[159] & 255) << 8) | ((bArr[160] & 255) << 16) | ((bArr[161] & 255) << 24)), (bArr[162] & 255) | ((bArr[163] & 255) << 8) | ((bArr[164] & 255) << 16) | ((bArr[165] & 255) << 24), Float.intBitsToFloat((bArr[166] & 255) | ((bArr[167] & 255) << 8) | ((bArr[168] & 255) << 16) | ((bArr[169] & 255) << 24)), Float.intBitsToFloat((bArr[170] & 255) | ((bArr[171] & 255) << 8) | ((bArr[172] & 255) << 16) | ((bArr[173] & 255) << 24)), (bArr[174] & 255) | ((bArr[175] & 255) << 8) | ((bArr[176] & 255) << 16) | ((bArr[177] & 255) << 24)));
            } else if (sportTypeFromValue == SportType.SPORT_TYPE_ROWING || sportTypeFromValue == SportType.SPORT_TYPE_OUTDOOR_ROWING) {
                sportSummary.setRowingInfo(new RowingInfo((bArr[142] & 255) | ((bArr[143] & 255) << 8) | ((bArr[144] & 255) << 16) | ((bArr[145] & 255) << 24), (bArr[146] & 255) | ((bArr[147] & 255) << 8) | ((bArr[148] & 255) << 16) | ((bArr[149] & 255) << 24), Float.intBitsToFloat((bArr[150] & 255) | ((bArr[151] & 255) << 8) | ((bArr[152] & 255) << 16) | ((bArr[153] & 255) << 24)), Float.intBitsToFloat((bArr[154] & 255) | ((bArr[155] & 255) << 8) | ((bArr[156] & 255) << 16) | ((bArr[157] & 255) << 24)), (bArr[158] & 255) | ((bArr[159] & 255) << 8) | ((bArr[160] & 255) << 16) | ((bArr[161] & 255) << 24), Float.intBitsToFloat((bArr[162] & 255) | ((bArr[163] & 255) << 8) | ((bArr[164] & 255) << 16) | ((bArr[165] & 255) << 24)), Float.intBitsToFloat((bArr[166] & 255) | ((bArr[167] & 255) << 8) | ((bArr[168] & 255) << 16) | ((bArr[169] & 255) << 24)), (bArr[170] & 255) | ((bArr[171] & 255) << 8) | ((bArr[172] & 255) << 16) | ((bArr[173] & 255) << 24), Float.intBitsToFloat((bArr[174] & 255) | ((bArr[175] & 255) << 8) | ((bArr[176] & 255) << 16) | ((bArr[177] & 255) << 24)), Float.intBitsToFloat((bArr[178] & 255) | ((bArr[179] & 255) << 8) | ((bArr[180] & 255) << 16) | ((bArr[181] & 255) << 24)), Float.intBitsToFloat((bArr[182] & 255) | ((bArr[183] & 255) << 8) | ((bArr[184] & 255) << 16) | ((bArr[185] & 255) << 24))));
            } else {
                RiddingInfo riddingInfo = new RiddingInfo();
                float fIntBitsToFloat27 = Float.intBitsToFloat((bArr[142] & 255) | ((bArr[143] & 255) << 8) | ((bArr[144] & 255) << 16) | ((bArr[145] & 255) << 24));
                float fIntBitsToFloat28 = Float.intBitsToFloat((bArr[146] & 255) | ((bArr[147] & 255) << 8) | ((bArr[148] & 255) << 16) | ((bArr[149] & 255) << 24));
                long j9 = (bArr[150] & 255) | ((bArr[151] & 255) << 8) | ((bArr[152] & 255) << 16) | ((bArr[153] & 255) << 24);
                float fIntBitsToFloat29 = Float.intBitsToFloat(((bArr[157] & 255) << 24) | ((bArr[156] & 255) << 16) | ((bArr[155] & 255) << 8) | (bArr[154] & 255));
                long j10 = (bArr[158] & 255) | ((bArr[159] & 255) << 8) | ((bArr[160] & 255) << 16) | ((bArr[161] & 255) << 24);
                float fIntBitsToFloat30 = Float.intBitsToFloat((bArr[162] & 255) | ((bArr[163] & 255) << 8) | ((bArr[164] & 255) << 16) | ((bArr[165] & 255) << 24));
                long j11 = (bArr[166] & 255) | ((bArr[167] & 255) << 8) | ((bArr[168] & 255) << 16) | ((bArr[169] & 255) << 24);
                riddingInfo.setDistance3DAscend(fIntBitsToFloat28);
                riddingInfo.setSpeed3D(fIntBitsToFloat27);
                riddingInfo.setTimeAscend(j9);
                riddingInfo.setDistance3DDescend(fIntBitsToFloat29);
                riddingInfo.setTimeDescend(j10);
                riddingInfo.setDistance3DFlat(fIntBitsToFloat30);
                riddingInfo.setTimeFlat(j11);
                sportSummary.setRiddingInfo(riddingInfo);
            }
            return sportSummary;
        }
        SkiingInfo skiingInfo = new SkiingInfo();
        float fIntBitsToFloat31 = Float.intBitsToFloat((bArr[142] & 255) | ((bArr[143] & 255) << 8) | ((bArr[144] & 255) << 16) | ((bArr[145] & 255) << 24));
        float fIntBitsToFloat32 = Float.intBitsToFloat((bArr[146] & 255) | ((bArr[147] & 255) << 8) | ((bArr[148] & 255) << 16) | ((bArr[149] & 255) << 24));
        float fIntBitsToFloat33 = Float.intBitsToFloat((bArr[150] & 255) | ((bArr[151] & 255) << 8) | ((bArr[152] & 255) << 16) | ((bArr[153] & 255) << 24));
        float fIntBitsToFloat34 = Float.intBitsToFloat((bArr[154] & 255) | ((bArr[155] & 255) << 8) | ((bArr[156] & 255) << 16) | ((bArr[157] & 255) << 24));
        float fIntBitsToFloat35 = Float.intBitsToFloat((bArr[158] & 255) | ((bArr[159] & 255) << 8) | ((bArr[160] & 255) << 16) | ((bArr[161] & 255) << 24));
        float fIntBitsToFloat36 = Float.intBitsToFloat((bArr[162] & 255) | ((bArr[163] & 255) << 8) | ((bArr[164] & 255) << 16) | ((bArr[165] & 255) << 24));
        float fIntBitsToFloat37 = Float.intBitsToFloat((bArr[166] & 255) | ((bArr[167] & 255) << 8) | ((bArr[168] & 255) << 16) | ((bArr[169] & 255) << 24));
        float fIntBitsToFloat38 = Float.intBitsToFloat((bArr[170] & 255) | ((bArr[171] & 255) << 8) | ((bArr[172] & 255) << 16) | ((bArr[173] & 255) << 24));
        float fIntBitsToFloat39 = Float.intBitsToFloat((bArr[174] & 255) | ((bArr[175] & 255) << 8) | ((bArr[176] & 255) << 16) | ((bArr[177] & 255) << 24));
        float fIntBitsToFloat40 = Float.intBitsToFloat((bArr[178] & 255) | ((bArr[179] & 255) << 8) | ((bArr[180] & 255) << 16) | ((bArr[181] & 255) << 24));
        float fIntBitsToFloat41 = Float.intBitsToFloat((bArr[182] & 255) | ((bArr[183] & 255) << 8) | ((bArr[184] & 255) << 16) | ((bArr[185] & 255) << 24));
        float fIntBitsToFloat42 = Float.intBitsToFloat((bArr[186] & 255) | ((bArr[187] & 255) << 8) | ((bArr[188] & 255) << 16) | ((bArr[189] & 255) << 24));
        float fIntBitsToFloat43 = Float.intBitsToFloat((bArr[190] & 255) | ((bArr[191] & 255) << 8) | ((bArr[192] & 255) << 16) | ((bArr[193] & 255) << 24));
        float fIntBitsToFloat44 = Float.intBitsToFloat(((bArr[195] & 255) << 8) | (bArr[194] & 255) | ((bArr[196] & 255) << 16) | ((bArr[197] & 255) << 24));
        int i13 = ((bArr[199] & 255) << 8) | (bArr[198] & 255);
        skiingInfo.setTripDistance(fIntBitsToFloat32);
        skiingInfo.setTripAvgSpeed(fIntBitsToFloat33);
        skiingInfo.setTripMaxSpeed(fIntBitsToFloat34);
        skiingInfo.setTripAcmDescendMeter(fIntBitsToFloat39);
        skiingInfo.setTotalTripsAcmDescendMeter(fIntBitsToFloat40);
        skiingInfo.setMaxSlope(fIntBitsToFloat41);
        skiingInfo.setAvgSlope(fIntBitsToFloat42);
        skiingInfo.setTripSlope(fIntBitsToFloat44);
        skiingInfo.setTrips(i13);
        skiingInfo.setTotalTripsAcmDistance(fIntBitsToFloat31);
        skiingInfo.setAvgSpeed(fIntBitsToFloat36);
        skiingInfo.setTripMinSpeed(fIntBitsToFloat35);
        skiingInfo.setMaxSpeed(fIntBitsToFloat37);
        skiingInfo.setMinSpeed(fIntBitsToFloat38);
        skiingInfo.setMinSlope(fIntBitsToFloat43);
        sportSummary.setSkiingInfo(skiingInfo);
        return sportSummary;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    public SportSummary parser(byte[] bArr) {
        return parseGpsSummary(bArr);
    }
}

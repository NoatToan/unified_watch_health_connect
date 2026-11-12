package com.xiaomi.hm.health.bt.profile.gdsp.gps;

/* JADX INFO: loaded from: classes18.dex */
class a implements ISportSummaryDataParser {
    private static String b = "SportSummaryDataParser";
    private int a;

    public a(int version) {
        this.a = 0;
        this.a = version;
    }

    public static boolean a(SportType type, int version) {
        return ((version == 515 || version == 516 || version == 518) && type == SportType.SPORT_TYPE_ODRUN) || type == SportType.SPORT_TYPE_RIDING || type == SportType.SPORT_TYPE_CROSS_COUNTRY_RUN || type == SportType.SPORT_TYPE_CLIMB || type == SportType.SPORT_TYPE_ODTREKKING;
    }

    public SportSummary b(byte[] value) {
        SportSummary sportSummary = new SportSummary();
        sportSummary.setVersion(this.a);
        int i = (value[0] & 255) | ((value[1] & 255) << 8);
        SportType sportTypeFromValue = SportType.fromValue(i);
        long j = (value[2] & 255) | ((value[3] & 255) << 8) | ((value[4] & 255) << 16) | ((value[5] & 255) << 24);
        long j2 = (value[6] & 255) | ((value[7] & 255) << 8) | ((value[8] & 255) << 16) | ((value[9] & 255) << 24);
        long j3 = (value[10] & 255) | ((value[11] & 255) << 8) | ((value[12] & 255) << 16) | ((value[13] & 255) << 24);
        long j4 = (value[14] & 255) | ((value[15] & 255) << 8) | ((value[16] & 255) << 16) | ((value[17] & 255) << 24);
        long j5 = ((value[19] & 255) << 8) | (value[18] & 255) | ((value[20] & 255) << 16) | ((value[21] & 255) << 24);
        sportSummary.C = ((long) (((value[23] & 255) << 8) | (value[22] & 255) | ((value[24] & 255) << 16) | ((value[25] & 255) << 24))) * 1000;
        sportSummary.setSportTypeValue(i);
        sportSummary.setStartTime(j * 1000);
        sportSummary.setEndTime(j2 * 1000);
        sportSummary.setBaseLng(j3);
        sportSummary.setBaseLat(j4);
        sportSummary.setBaseAlt(j5);
        SportAccumInfo sportAccumInfo = new SportAccumInfo();
        long j6 = (value[26] & 255) | ((value[27] & 255) << 8) | ((value[28] & 255) << 16) | ((value[29] & 255) << 24);
        long j7 = (value[30] & 255) | ((value[31] & 255) << 8) | ((value[32] & 255) << 16) | ((value[33] & 255) << 24);
        int i2 = (value[34] & 255) | ((value[35] & 255) << 8) | ((value[36] & 255) << 16) | ((value[37] & 255) << 24);
        int i3 = (value[38] & 255) | ((value[39] & 255) << 8) | ((value[40] & 255) << 16) | ((value[41] & 255) << 24);
        int i4 = (value[42] & 255) | ((value[43] & 255) << 8) | ((value[44] & 255) << 16) | ((value[45] & 255) << 24);
        int i5 = (value[46] & 255) | ((value[47] & 255) << 8) | ((value[48] & 255) << 16) | ((value[49] & 255) << 24);
        float fIntBitsToFloat = Float.intBitsToFloat((value[50] & 255) | ((value[51] & 255) << 8) | ((value[52] & 255) << 16) | ((value[53] & 255) << 24));
        float fIntBitsToFloat2 = Float.intBitsToFloat((value[54] & 255) | ((value[55] & 255) << 8) | ((value[56] & 255) << 16) | ((value[57] & 255) << 24));
        float fIntBitsToFloat3 = Float.intBitsToFloat((value[58] & 255) | ((value[59] & 255) << 8) | ((value[60] & 255) << 16) | ((value[61] & 255) << 24));
        float fIntBitsToFloat4 = Float.intBitsToFloat((value[62] & 255) | ((value[63] & 255) << 8) | ((value[64] & 255) << 16) | ((value[65] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat(((value[67] & 255) << 8) | (value[66] & 255) | ((value[68] & 255) << 16) | ((value[69] & 255) << 24));
        float fIntBitsToFloat6 = Float.intBitsToFloat(((value[71] & 255) << 8) | (value[70] & 255) | ((value[72] & 255) << 16) | ((value[73] & 255) << 24));
        float fIntBitsToFloat7 = Float.intBitsToFloat(((value[75] & 255) << 8) | (value[74] & 255) | ((value[76] & 255) << 16) | ((value[77] & 255) << 24));
        float fIntBitsToFloat8 = Float.intBitsToFloat(((value[79] & 255) << 8) | (value[78] & 255) | ((value[80] & 255) << 16) | ((value[81] & 255) << 24));
        float fIntBitsToFloat9 = Float.intBitsToFloat(((value[83] & 255) << 8) | (value[82] & 255) | ((value[84] & 255) << 16) | ((value[85] & 255) << 24));
        float fIntBitsToFloat10 = Float.intBitsToFloat(((value[87] & 255) << 8) | (value[86] & 255) | ((value[88] & 255) << 16) | ((value[89] & 255) << 24));
        float fIntBitsToFloat11 = Float.intBitsToFloat(((value[91] & 255) << 8) | (value[90] & 255) | ((value[92] & 255) << 16) | ((value[93] & 255) << 24));
        float fIntBitsToFloat12 = Float.intBitsToFloat(((value[95] & 255) << 8) | (value[94] & 255) | ((value[96] & 255) << 16) | ((value[97] & 255) << 24));
        float fIntBitsToFloat13 = Float.intBitsToFloat(((value[99] & 255) << 8) | (value[98] & 255) | ((value[100] & 255) << 16) | ((value[101] & 255) << 24));
        float fIntBitsToFloat14 = Float.intBitsToFloat(((value[103] & 255) << 8) | (value[102] & 255) | ((value[104] & 255) << 16) | ((value[105] & 255) << 24));
        float fIntBitsToFloat15 = Float.intBitsToFloat(((value[107] & 255) << 8) | (value[106] & 255) | ((value[108] & 255) << 16) | ((value[109] & 255) << 24));
        float fIntBitsToFloat16 = Float.intBitsToFloat(((value[111] & 255) << 8) | (value[110] & 255) | ((value[112] & 255) << 16) | ((value[113] & 255) << 24));
        float fIntBitsToFloat17 = Float.intBitsToFloat(((value[115] & 255) << 8) | (value[114] & 255) | ((value[116] & 255) << 16) | ((value[117] & 255) << 24));
        float fIntBitsToFloat18 = Float.intBitsToFloat(((value[119] & 255) << 8) | (value[118] & 255) | ((value[120] & 255) << 16) | ((value[121] & 255) << 24));
        float fIntBitsToFloat19 = Float.intBitsToFloat(((value[123] & 255) << 8) | (value[122] & 255) | ((value[124] & 255) << 16) | ((value[125] & 255) << 24));
        float fIntBitsToFloat20 = Float.intBitsToFloat(((value[127] & 255) << 8) | (value[126] & 255) | ((value[128] & 255) << 16) | ((value[129] & 255) << 24));
        long j8 = ((value[131] & 255) << 8) | (value[130] & 255) | ((value[132] & 255) << 16) | ((value[133] & 255) << 24);
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
        sportSummary.setStatisInfo(new SportStatisInfo((value[134] & 255) | ((value[135] & 255) << 8), (value[136] & 255) | ((value[137] & 255) << 8), (value[138] & 255) | ((value[139] & 255) << 8), (value[140] & 255) | ((value[141] & 255) << 8)));
        if (sportTypeFromValue == SportType.SPORT_TYPE_POOL_SWIM || sportTypeFromValue == SportType.SPORT_TYPE_OPEN_WATER_SWIM) {
            SwimInfo swimInfo = new SwimInfo();
            float fIntBitsToFloat21 = Float.intBitsToFloat((value[142] & 255) | ((value[143] & 255) << 8) | ((value[144] & 255) << 16) | ((value[145] & 255) << 24));
            float fIntBitsToFloat22 = Float.intBitsToFloat((value[146] & 255) | ((value[147] & 255) << 8) | ((value[148] & 255) << 16) | ((value[149] & 255) << 24));
            float fIntBitsToFloat23 = Float.intBitsToFloat(((value[153] & 255) << 24) | ((value[152] & 255) << 16) | ((value[151] & 255) << 8) | (value[150] & 255));
            float fIntBitsToFloat24 = Float.intBitsToFloat(((value[157] & 255) << 24) | ((value[156] & 255) << 16) | ((value[155] & 255) << 8) | (value[154] & 255));
            float fIntBitsToFloat25 = Float.intBitsToFloat((value[158] & 255) | ((value[159] & 255) << 8) | ((value[160] & 255) << 16) | ((value[161] & 255) << 24));
            float fIntBitsToFloat26 = Float.intBitsToFloat(((value[163] & 255) << 8) | (value[162] & 255) | ((value[164] & 255) << 16) | ((value[165] & 255) << 24));
            int i6 = ((value[167] & 255) << 8) | (value[166] & 255);
            int i7 = ((value[169] & 255) << 8) | (value[168] & 255);
            int i8 = ((value[171] & 255) << 8) | (value[170] & 255);
            int i9 = ((value[173] & 255) << 8) | (value[172] & 255);
            int i10 = (value[174] & 255) | ((value[175] & 255) << 8);
            int i11 = value[176] & 255;
            int i12 = value[177] & 255;
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
        if (sportTypeFromValue == SportType.SPORT_TYPE_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_BOARD_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_ALPINE_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_CROSS_COUNTRY_SKIING || sportTypeFromValue == SportType.SPORT_TYPE_SKIING_DOUBLE_BOARD || sportTypeFromValue == SportType.SPORT_TYPE_ORIENTEER_SKIING) {
            SkiingInfo skiingInfo = new SkiingInfo();
            float fIntBitsToFloat27 = Float.intBitsToFloat((value[142] & 255) | ((value[143] & 255) << 8) | ((value[144] & 255) << 16) | ((value[145] & 255) << 24));
            float fIntBitsToFloat28 = Float.intBitsToFloat((value[146] & 255) | ((value[147] & 255) << 8) | ((value[148] & 255) << 16) | ((value[149] & 255) << 24));
            float fIntBitsToFloat29 = Float.intBitsToFloat((value[150] & 255) | ((value[151] & 255) << 8) | ((value[152] & 255) << 16) | ((value[153] & 255) << 24));
            float fIntBitsToFloat30 = Float.intBitsToFloat((value[154] & 255) | ((value[155] & 255) << 8) | ((value[156] & 255) << 16) | ((value[157] & 255) << 24));
            float fIntBitsToFloat31 = Float.intBitsToFloat((value[158] & 255) | ((value[159] & 255) << 8) | ((value[160] & 255) << 16) | ((value[161] & 255) << 24));
            float fIntBitsToFloat32 = Float.intBitsToFloat(((value[163] & 255) << 8) | (value[162] & 255) | ((value[164] & 255) << 16) | ((value[165] & 255) << 24));
            float fIntBitsToFloat33 = Float.intBitsToFloat(((value[167] & 255) << 8) | (value[166] & 255) | ((value[168] & 255) << 16) | ((value[169] & 255) << 24));
            float fIntBitsToFloat34 = Float.intBitsToFloat(((value[171] & 255) << 8) | (value[170] & 255) | ((value[172] & 255) << 16) | ((value[173] & 255) << 24));
            float fIntBitsToFloat35 = Float.intBitsToFloat(((value[175] & 255) << 8) | (value[174] & 255) | ((value[176] & 255) << 16) | ((value[177] & 255) << 24));
            float fIntBitsToFloat36 = Float.intBitsToFloat(((value[179] & 255) << 8) | (value[178] & 255) | ((value[180] & 255) << 16) | ((value[181] & 255) << 24));
            float fIntBitsToFloat37 = Float.intBitsToFloat(((value[183] & 255) << 8) | (value[182] & 255) | ((value[184] & 255) << 16) | ((value[185] & 255) << 24));
            float fIntBitsToFloat38 = Float.intBitsToFloat(((value[187] & 255) << 8) | (value[186] & 255) | ((value[188] & 255) << 16) | ((value[189] & 255) << 24));
            float fIntBitsToFloat39 = Float.intBitsToFloat(((value[191] & 255) << 8) | (value[190] & 255) | ((value[192] & 255) << 16) | ((value[193] & 255) << 24));
            float fIntBitsToFloat40 = Float.intBitsToFloat(((value[195] & 255) << 8) | (value[194] & 255) | ((value[196] & 255) << 16) | ((value[197] & 255) << 24));
            int i13 = (value[198] & 255) | ((value[199] & 255) << 8);
            skiingInfo.setTripDistance(fIntBitsToFloat28);
            skiingInfo.setTripAvgSpeed(fIntBitsToFloat29);
            skiingInfo.setTripMaxSpeed(fIntBitsToFloat30);
            skiingInfo.setTripAcmDescendMeter(fIntBitsToFloat35);
            skiingInfo.setTotalTripsAcmDescendMeter(fIntBitsToFloat36);
            skiingInfo.setMaxSlope(fIntBitsToFloat37);
            skiingInfo.setAvgSlope(fIntBitsToFloat38);
            skiingInfo.setTripSlope(fIntBitsToFloat40);
            skiingInfo.setTrips(i13);
            skiingInfo.setTotalTripsAcmDistance(fIntBitsToFloat27);
            skiingInfo.setAvgSpeed(fIntBitsToFloat32);
            skiingInfo.setTripMinSpeed(fIntBitsToFloat31);
            skiingInfo.setMaxSpeed(fIntBitsToFloat33);
            skiingInfo.setMinSpeed(fIntBitsToFloat34);
            skiingInfo.setMinSlope(fIntBitsToFloat39);
            sportSummary.setSkiingInfo(skiingInfo);
            return sportSummary;
        }
        if (sportTypeFromValue == SportType.SPORT_TYPE_JUMP_ROPE) {
            sportSummary.setSkipRopeInfo(new SkipRopeInfo((value[142] & 255) | ((value[143] & 255) << 8) | ((value[144] & 255) << 16) | ((value[145] & 255) << 24), (value[146] & 255) | ((value[147] & 255) << 8) | ((value[148] & 255) << 16) | ((value[149] & 255) << 24), Float.intBitsToFloat((value[150] & 255) | ((value[151] & 255) << 8) | ((value[152] & 255) << 16) | ((value[153] & 255) << 24)), Float.intBitsToFloat((value[154] & 255) | ((value[155] & 255) << 8) | ((value[156] & 255) << 16) | ((value[157] & 255) << 24)), Float.intBitsToFloat((value[158] & 255) | ((value[159] & 255) << 8) | ((value[160] & 255) << 16) | ((value[161] & 255) << 24)), ((value[163] & 255) << 8) | (value[162] & 255) | ((value[164] & 255) << 16) | ((value[165] & 255) << 24), Float.intBitsToFloat(((value[167] & 255) << 8) | (value[166] & 255) | ((value[168] & 255) << 16) | ((value[169] & 255) << 24)), Float.intBitsToFloat(((value[171] & 255) << 8) | (value[170] & 255) | ((value[172] & 255) << 16) | ((value[173] & 255) << 24)), ((value[175] & 255) << 8) | (value[174] & 255) | ((value[176] & 255) << 16) | ((value[177] & 255) << 24)));
        } else if (sportTypeFromValue == SportType.SPORT_TYPE_ROWING) {
            sportSummary.setRowingInfo(new RowingInfo((value[142] & 255) | ((value[143] & 255) << 8) | ((value[144] & 255) << 16) | ((value[145] & 255) << 24), (value[146] & 255) | ((value[147] & 255) << 8) | ((value[148] & 255) << 16) | ((value[149] & 255) << 24), Float.intBitsToFloat((value[150] & 255) | ((value[151] & 255) << 8) | ((value[152] & 255) << 16) | ((value[153] & 255) << 24)), Float.intBitsToFloat((value[154] & 255) | ((value[155] & 255) << 8) | ((value[156] & 255) << 16) | ((value[157] & 255) << 24)), (value[158] & 255) | ((value[159] & 255) << 8) | ((value[160] & 255) << 16) | ((value[161] & 255) << 24), Float.intBitsToFloat(((value[163] & 255) << 8) | (value[162] & 255) | ((value[164] & 255) << 16) | ((value[165] & 255) << 24)), Float.intBitsToFloat(((value[167] & 255) << 8) | (value[166] & 255) | ((value[168] & 255) << 16) | ((value[169] & 255) << 24)), ((value[171] & 255) << 8) | (value[170] & 255) | ((value[172] & 255) << 16) | ((value[173] & 255) << 24), Float.intBitsToFloat(((value[175] & 255) << 8) | (value[174] & 255) | ((value[176] & 255) << 16) | ((value[177] & 255) << 24)), Float.intBitsToFloat(((value[179] & 255) << 8) | (value[178] & 255) | ((value[180] & 255) << 16) | ((value[181] & 255) << 24)), Float.intBitsToFloat(((value[183] & 255) << 8) | (value[182] & 255) | ((value[184] & 255) << 16) | ((value[185] & 255) << 24))));
        } else {
            RiddingInfo riddingInfo = new RiddingInfo();
            float fIntBitsToFloat41 = Float.intBitsToFloat((value[142] & 255) | ((value[143] & 255) << 8) | ((value[144] & 255) << 16) | ((value[145] & 255) << 24));
            float fIntBitsToFloat42 = Float.intBitsToFloat((value[146] & 255) | ((value[147] & 255) << 8) | ((value[148] & 255) << 16) | ((value[149] & 255) << 24));
            long j9 = (value[150] & 255) | ((value[151] & 255) << 8) | ((value[152] & 255) << 16) | ((value[153] & 255) << 24);
            float fIntBitsToFloat43 = Float.intBitsToFloat(((value[157] & 255) << 24) | ((value[156] & 255) << 16) | ((value[155] & 255) << 8) | (value[154] & 255));
            long j10 = (value[158] & 255) | ((value[159] & 255) << 8) | ((value[160] & 255) << 16) | ((value[161] & 255) << 24);
            float fIntBitsToFloat44 = Float.intBitsToFloat(((value[163] & 255) << 8) | (value[162] & 255) | ((value[164] & 255) << 16) | ((value[165] & 255) << 24));
            long j11 = ((value[167] & 255) << 8) | (value[166] & 255) | ((value[168] & 255) << 16) | ((value[169] & 255) << 24);
            riddingInfo.setDistance3DAscend(fIntBitsToFloat42);
            riddingInfo.setSpeed3D(fIntBitsToFloat41);
            riddingInfo.setTimeAscend(j9);
            riddingInfo.setDistance3DDescend(fIntBitsToFloat43);
            riddingInfo.setTimeDescend(j10);
            riddingInfo.setDistance3DFlat(fIntBitsToFloat44);
            riddingInfo.setTimeFlat(j11);
            sportSummary.setRiddingInfo(riddingInfo);
        }
        return sportSummary;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportSummaryDataParser
    public SportSummary parser(byte[] bytes) {
        return b(bytes);
    }
}

package com.xiaomi.hm.health.ui.sportfitness.manager;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.gson.reflect.TypeToken;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.webapi.GetSportStatAPI;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.traininglib.model.TrainingRecordStatInfo;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatData;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatSportCountData;
import com.xiaomi.hm.health.utils.Utils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseTypeChooseManager {
    public static final int DEF_EXER_ALL = 0;
    public static final int DEF_EXER_TRAINING = -1;
    public static final int EXER_TYPE_AQUATICS = 113;
    public static final int EXER_TYPE_BALL = 110;
    public static final int EXER_TYPE_CHESS_AND_CARD = 116;
    public static final int EXER_TYPE_CYCLE = 102;
    public static final int EXER_TYPE_DANCE = 109;
    public static final int EXER_TYPE_EXTREME = 115;
    public static final int EXER_TYPE_FIGHT = 111;
    public static final int EXER_TYPE_GLOBAL = 100;
    public static final int EXER_TYPE_ICE_SNOW = 105;
    public static final int EXER_TYPE_INDOOR = 108;
    public static final int EXER_TYPE_LEISURE = 114;
    public static final int EXER_TYPE_OTHER = 112;
    public static final int EXER_TYPE_OUTDOOR = 104;
    public static final int EXER_TYPE_RUN = 101;
    public static final int EXER_TYPE_SWIM = 107;
    public static final int EXER_TYPE_TRAINING = 106;
    public static final int EXER_TYPE_WALK = 103;
    private static final String g = "ExerciseTypeChooseManager";
    private static volatile ExerciseTypeChooseManager h = null;
    private static final int i = 100;
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private static final int o = 5;
    private static final int p = 6;
    private static final int q = 7;
    private static final int r = 8;
    private static final int s = 9;
    private static final int t = 10;
    private static final int u = 11;
    private static final int v = 12;
    private static final int w = 13;
    private static final int x = 14;
    private static final int y = 15;
    private static final int z = 16;
    private int[] a;
    private int[] b;
    private List<Integer> c;
    private int[] d;
    private int[] e;
    private int f = R.string.sports_type_work_out;

    public class a extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
        public a() {
        }
    }

    public class b implements Comparator<Integer> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }

    public class c extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
        public c() {
        }
    }

    public class d extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
        public d() {
        }
    }

    private ExerciseTypeChooseManager() {
    }

    public static void deInit() {
        h = null;
    }

    public static ExerciseTypeChooseManager getInstance() {
        if (h == null) {
            synchronized (ExerciseTypeChooseManager.class) {
                if (h == null) {
                    h = new ExerciseTypeChooseManager();
                }
            }
        }
        return h;
    }

    public int[][] filterExerciseType(boolean isUpdate) {
        int[] iArr;
        int[] iArr2;
        int[][] iArr3 = new int[2][];
        if (!isUpdate && (iArr = this.d) != null && (iArr2 = this.e) != null) {
            iArr3[0] = iArr;
            iArr3[1] = iArr2;
            return iArr3;
        }
        this.c.clear();
        List list = (List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new a().getType());
        TrainingRecordStatInfo trainingRecordStatInfo = (TrainingRecordStatInfo) Utils.getGson().fromJson(HMKeeper.getExerTrainStatData(), TrainingRecordStatInfo.class);
        boolean z2 = (trainingRecordStatInfo != null && trainingRecordStatInfo.totalCount > 0) & (!HistoryRecordManager.getInstance().isOverSea());
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((GetSportStatAPI.StatDataEntity) it2.next()).sportType));
            }
        }
        TreeSet<Integer> treeSet = new TreeSet(new b());
        if (z2) {
            treeSet.add(6);
        }
        if (arrayList.contains(1) || arrayList.contains(8) || arrayList.contains(25) || arrayList.contains(26) || arrayList.contains(7) || arrayList.contains(110) || arrayList.contains(192)) {
            treeSet.add(1);
        }
        if (arrayList.contains(6) || arrayList.contains(40) || arrayList.contains(131)) {
            treeSet.add(3);
        }
        if (arrayList.contains(9) || arrayList.contains(10) || arrayList.contains(47) || arrayList.contains(48)) {
            treeSet.add(2);
        }
        if (arrayList.contains(14) || arrayList.contains(15) || arrayList.contains(155) || arrayList.contains(156)) {
            treeSet.add(7);
        }
        if (arrayList.contains(11) || arrayList.contains(41) || arrayList.contains(42) || arrayList.contains(43) || arrayList.contains(44) || arrayList.contains(45) || arrayList.contains(105) || arrayList.contains(46) || arrayList.contains(125) || arrayList.contains(126) || arrayList.contains(127) || arrayList.contains(128) || arrayList.contains(136) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING))) {
            treeSet.add(5);
        }
        if (arrayList.contains(12) || arrayList.contains(23) || arrayList.contains(24) || arrayList.contains(16) || arrayList.contains(49) || arrayList.contains(50) || arrayList.contains(51) || arrayList.contains(52) || arrayList.contains(53) || arrayList.contains(54) || arrayList.contains(55) || arrayList.contains(57) || arrayList.contains(58) || arrayList.contains(59) || arrayList.contains(60) || arrayList.contains(61) || arrayList.contains(108) || arrayList.contains(109) || arrayList.contains(111) || arrayList.contains(114) || arrayList.contains(130) || arrayList.contains(143) || arrayList.contains(149) || arrayList.contains(150) || arrayList.contains(183) || arrayList.contains(167)) {
            treeSet.add(8);
        }
        if (arrayList.contains(13) || arrayList.contains(22) || arrayList.contains(63) || arrayList.contains(64) || arrayList.contains(66) || arrayList.contains(67) || arrayList.contains(69) || arrayList.contains(70) || arrayList.contains(129) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_BOULDERING)) || arrayList.contains(190) || arrayList.contains(137)) {
            treeSet.add(4);
        }
        if (arrayList.contains(71) || arrayList.contains(72) || arrayList.contains(73) || arrayList.contains(74) || arrayList.contains(75) || arrayList.contains(76) || arrayList.contains(77) || arrayList.contains(112) || arrayList.contains(113) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_MODERN_DANCE)) || arrayList.contains(165) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_DISCO)) || arrayList.contains(166) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_TAP_DANCE)) || arrayList.contains(168) || arrayList.contains(146)) {
            treeSet.add(9);
        }
        if (arrayList.contains(18) || arrayList.contains(17) || arrayList.contains(78) || arrayList.contains(79) || arrayList.contains(80) || arrayList.contains(81) || arrayList.contains(82) || arrayList.contains(83) || arrayList.contains(84) || arrayList.contains(85) || arrayList.contains(86) || arrayList.contains(87) || arrayList.contains(88) || arrayList.contains(89) || arrayList.contains(90) || arrayList.contains(91) || arrayList.contains(92) || arrayList.contains(121) || arrayList.contains(122) || arrayList.contains(188) || arrayList.contains(142) || arrayList.contains(145) || arrayList.contains(151) || arrayList.contains(152) || arrayList.contains(153) || arrayList.contains(154) || arrayList.contains(158) || arrayList.contains(162) || arrayList.contains(164) || arrayList.contains(169) || arrayList.contains(170) || arrayList.contains(171)) {
            treeSet.add(10);
        }
        if (arrayList.contains(95) || arrayList.contains(96) || arrayList.contains(97) || arrayList.contains(98) || arrayList.contains(99) || arrayList.contains(100) || arrayList.contains(101) || arrayList.contains(102) || arrayList.contains(103) || arrayList.contains(104) || arrayList.contains(147) || arrayList.contains(148)) {
            treeSet.add(11);
        }
        if (arrayList.contains(2001) || arrayList.contains(21) || arrayList.contains(2002) || arrayList.contains(93) || arrayList.contains(94) || arrayList.contains(132)) {
            treeSet.add(12);
        }
        if (arrayList.contains(65) || arrayList.contains(68) || arrayList.contains(62) || arrayList.contains(106) || arrayList.contains(123) || arrayList.contains(124) || arrayList.contains(140) || arrayList.contains(141) || arrayList.contains(138) || arrayList.contains(172) || arrayList.contains(139) || arrayList.contains(157)) {
            treeSet.add(13);
        }
        if (arrayList.contains(115) || arrayList.contains(116) || arrayList.contains(117) || arrayList.contains(118) || arrayList.contains(119) || arrayList.contains(120) || arrayList.contains(189) || arrayList.contains(144) || arrayList.contains(159) || arrayList.contains(160) || arrayList.contains(161) || arrayList.contains(163) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_SHOOT))) {
            treeSet.add(14);
        }
        if (arrayList.contains(133) || arrayList.contains(180) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_DOWNHILL)) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING))) {
            treeSet.add(15);
        }
        if (arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHESS)) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHECKERS)) || arrayList.contains(175) || arrayList.contains(Integer.valueOf(DataTypeSource.SPORT_TYPE_BRIDGE)) || arrayList.contains(177)) {
            treeSet.add(16);
        }
        if (treeSet.size() <= 1) {
            treeSet.clear();
        }
        treeSet.add(0);
        this.d = new int[treeSet.size()];
        this.e = new int[treeSet.size()];
        int i2 = 0;
        for (Integer num : treeSet) {
            HMLog.d(g, "indexSet:" + num, new Object[0]);
            this.c.add(Integer.valueOf(num.intValue() + 100));
            this.d[i2] = this.a[num.intValue()];
            this.e[i2] = this.b[num.intValue()];
            i2++;
        }
        iArr3[0] = this.d;
        iArr3[1] = this.e;
        return iArr3;
    }

    public ExerciseStatData getClassifyExerciseStatData() {
        ExerciseStatData exerciseStatData = new ExerciseStatData();
        ArrayList arrayList = new ArrayList();
        switch (HMKeeper.getChooseExerciseType()) {
            case 100:
                exerciseStatData = null;
                break;
            case 101:
                arrayList.add(1);
                arrayList.add(7);
                arrayList.add(8);
                arrayList.add(25);
                arrayList.add(26);
                arrayList.add(110);
                arrayList.add(192);
                break;
            case 102:
                arrayList.add(9);
                arrayList.add(10);
                arrayList.add(47);
                arrayList.add(48);
                break;
            case 103:
                arrayList.add(6);
                arrayList.add(40);
                arrayList.add(131);
                break;
            case 104:
                arrayList.add(13);
                arrayList.add(22);
                arrayList.add(63);
                arrayList.add(64);
                arrayList.add(66);
                arrayList.add(67);
                arrayList.add(69);
                arrayList.add(70);
                arrayList.add(129);
                arrayList.add(190);
                arrayList.add(137);
                break;
            case 105:
                arrayList.add(11);
                arrayList.add(41);
                arrayList.add(42);
                arrayList.add(43);
                arrayList.add(44);
                arrayList.add(45);
                arrayList.add(105);
                arrayList.add(46);
                arrayList.add(125);
                arrayList.add(126);
                arrayList.add(127);
                arrayList.add(128);
                arrayList.add(136);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING));
                break;
            case 106:
                TrainingRecordStatInfo trainingRecordStatInfo = (TrainingRecordStatInfo) Utils.getGson().fromJson(HMKeeper.getExerTrainStatData(), TrainingRecordStatInfo.class);
                exerciseStatData.totalExerciseCount = trainingRecordStatInfo.totalCount;
                exerciseStatData.totalCostTime = trainingRecordStatInfo.totalDuration / 1000;
                exerciseStatData.totalCalorie = trainingRecordStatInfo.totalConsumption;
                break;
            case 107:
                arrayList.add(14);
                arrayList.add(15);
                arrayList.add(155);
                arrayList.add(156);
                break;
            case 108:
                arrayList.add(12);
                arrayList.add(23);
                arrayList.add(24);
                arrayList.add(16);
                arrayList.add(49);
                arrayList.add(50);
                arrayList.add(51);
                arrayList.add(52);
                arrayList.add(53);
                arrayList.add(54);
                arrayList.add(55);
                arrayList.add(57);
                arrayList.add(58);
                arrayList.add(59);
                arrayList.add(60);
                arrayList.add(61);
                arrayList.add(108);
                arrayList.add(109);
                arrayList.add(111);
                arrayList.add(114);
                arrayList.add(130);
                arrayList.add(143);
                arrayList.add(149);
                arrayList.add(150);
                arrayList.add(183);
                arrayList.add(167);
                break;
            case 109:
                arrayList.add(71);
                arrayList.add(72);
                arrayList.add(73);
                arrayList.add(74);
                arrayList.add(75);
                arrayList.add(77);
                arrayList.add(76);
                arrayList.add(112);
                arrayList.add(113);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_MODERN_DANCE));
                arrayList.add(165);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_DISCO));
                arrayList.add(166);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_TAP_DANCE));
                arrayList.add(168);
                arrayList.add(146);
                break;
            case 110:
                arrayList.add(18);
                arrayList.add(17);
                arrayList.add(78);
                arrayList.add(79);
                arrayList.add(80);
                arrayList.add(81);
                arrayList.add(82);
                arrayList.add(83);
                arrayList.add(84);
                arrayList.add(85);
                arrayList.add(86);
                arrayList.add(87);
                arrayList.add(88);
                arrayList.add(89);
                arrayList.add(90);
                arrayList.add(91);
                arrayList.add(92);
                arrayList.add(121);
                arrayList.add(122);
                arrayList.add(188);
                arrayList.add(142);
                arrayList.add(145);
                arrayList.add(151);
                arrayList.add(152);
                arrayList.add(153);
                arrayList.add(154);
                arrayList.add(158);
                arrayList.add(162);
                arrayList.add(164);
                arrayList.add(169);
                arrayList.add(170);
                arrayList.add(171);
                break;
            case 111:
                arrayList.add(95);
                arrayList.add(96);
                arrayList.add(97);
                arrayList.add(98);
                arrayList.add(99);
                arrayList.add(100);
                arrayList.add(101);
                arrayList.add(102);
                arrayList.add(103);
                arrayList.add(104);
                arrayList.add(147);
                arrayList.add(148);
                break;
            case 112:
                arrayList.add(2001);
                arrayList.add(21);
                arrayList.add(2002);
                arrayList.add(93);
                arrayList.add(94);
                arrayList.add(132);
                break;
            case 113:
                arrayList.add(65);
                arrayList.add(68);
                arrayList.add(62);
                arrayList.add(106);
                arrayList.add(123);
                arrayList.add(124);
                arrayList.add(140);
                arrayList.add(141);
                arrayList.add(138);
                arrayList.add(172);
                arrayList.add(139);
                arrayList.add(157);
                break;
            case 114:
                arrayList.add(115);
                arrayList.add(116);
                arrayList.add(117);
                arrayList.add(118);
                arrayList.add(119);
                arrayList.add(120);
                arrayList.add(189);
                arrayList.add(144);
                arrayList.add(159);
                arrayList.add(160);
                arrayList.add(161);
                arrayList.add(163);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_SHOOT));
                break;
            case 115:
                arrayList.add(133);
                arrayList.add(180);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_DOWNHILL));
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING));
                break;
            case 116:
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHESS));
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHECKERS));
                arrayList.add(175);
                arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BRIDGE));
                arrayList.add(177);
                break;
        }
        if (!arrayList.isEmpty()) {
            for (GetSportStatAPI.StatDataEntity statDataEntity : (List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new c().getType())) {
                if (arrayList.contains(Integer.valueOf(statDataEntity.sportType))) {
                    exerciseStatData.totalExerciseCount += (long) statDataEntity.count;
                    exerciseStatData.totalDistance += statDataEntity.distance;
                    exerciseStatData.totalCostTime += (long) statDataEntity.costTime;
                    exerciseStatData.totalCalorie += statDataEntity.calorie;
                }
            }
        }
        return exerciseStatData;
    }

    public int getDefaultExerType() {
        return 100;
    }

    public String getExerTypes() {
        int chooseExerciseType = HMKeeper.getChooseExerciseType();
        if (chooseExerciseType == 106) {
            return String.valueOf(-1);
        }
        if (chooseExerciseType == 100) {
            return String.valueOf(0);
        }
        if (chooseExerciseType == 101) {
            return "1,7,8,25,26,110,192";
        }
        if (chooseExerciseType == 103) {
            return "6,40,131";
        }
        if (chooseExerciseType == 102) {
            return "9,10,47,48";
        }
        if (chooseExerciseType == 107) {
            return "14,15,155,156";
        }
        if (chooseExerciseType == 105) {
            return "11,41,42,43,44,45,105,46,125,126,127,128,136,178";
        }
        if (chooseExerciseType == 108) {
            return "12,23,24,16,49,50,51,52,53,54,55,57,58,59,60,61,108,109,111,114,130,143,149,150,183,167";
        }
        if (chooseExerciseType == 104) {
            return "13,22,63,64,66,67,69,70,129,190,137";
        }
        if (chooseExerciseType == 109) {
            return "71,72,73,74,75,77,76,112,113,185,165,186,166,187,168,146";
        }
        if (chooseExerciseType == 110) {
            return "18,17,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,121,122,188,142,145,151,152,153,154,158,162,164,169,170,171";
        }
        if (chooseExerciseType == 111) {
            return "95,96,97,98,99,100,101,102,103,104,147,148";
        }
        if (chooseExerciseType == 112) {
            return "2001,21,2002,93,94,132";
        }
        if (chooseExerciseType == 113) {
            return "65,68,62,106,123,124,140,141,138,172,139,157";
        }
        if (chooseExerciseType == 114) {
            return "115,116,117,118,119,120,189,144,159,160,161,163,179";
        }
        if (chooseExerciseType == 115) {
            return "133,180,181,182";
        }
        return chooseExerciseType == 116 ? "173,174,175,176,177" : "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ArrayList<ExerciseStatSportCountData> getExerciseStatShareSportCountData() {
        ArrayList<ExerciseStatSportCountData> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = true;
        switch (HMKeeper.getChooseExerciseType()) {
            case 100:
                break;
            case 101:
                arrayList2.add(1);
                arrayList2.add(7);
                arrayList2.add(8);
                arrayList2.add(110);
                arrayList2.add(192);
                z2 = false;
                break;
            case 102:
                arrayList2.add(9);
                arrayList2.add(10);
                arrayList2.add(47);
                arrayList2.add(48);
                z2 = false;
                break;
            case 103:
                arrayList2.add(6);
                arrayList2.add(40);
                arrayList2.add(131);
                z2 = false;
                break;
            case 104:
                arrayList2.add(13);
                arrayList2.add(22);
                arrayList2.add(63);
                arrayList2.add(64);
                arrayList2.add(66);
                arrayList2.add(67);
                arrayList2.add(69);
                arrayList2.add(70);
                arrayList2.add(129);
                arrayList2.add(190);
                arrayList2.add(137);
                z2 = false;
                break;
            case 105:
                arrayList2.add(11);
                arrayList2.add(41);
                arrayList2.add(42);
                arrayList2.add(43);
                arrayList2.add(44);
                arrayList2.add(45);
                arrayList2.add(105);
                arrayList2.add(46);
                arrayList2.add(125);
                arrayList2.add(126);
                arrayList2.add(127);
                arrayList2.add(128);
                arrayList2.add(136);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING));
                z2 = false;
                break;
            case 106:
                arrayList.add(new ExerciseStatSportCountData(((TrainingRecordStatInfo) Utils.getGson().fromJson(HMKeeper.getExerTrainStatData(), TrainingRecordStatInfo.class)).totalCount, -100));
                z2 = false;
                break;
            case 107:
                arrayList2.add(14);
                arrayList2.add(15);
                arrayList2.add(155);
                arrayList2.add(156);
                z2 = false;
                break;
            case 108:
                arrayList2.add(12);
                arrayList2.add(23);
                arrayList2.add(24);
                arrayList2.add(16);
                arrayList2.add(49);
                arrayList2.add(50);
                arrayList2.add(51);
                arrayList2.add(52);
                arrayList2.add(53);
                arrayList2.add(54);
                arrayList2.add(55);
                arrayList2.add(57);
                arrayList2.add(58);
                arrayList2.add(59);
                arrayList2.add(60);
                arrayList2.add(61);
                arrayList2.add(108);
                arrayList2.add(109);
                arrayList2.add(111);
                arrayList2.add(114);
                arrayList2.add(130);
                arrayList2.add(143);
                arrayList2.add(149);
                arrayList2.add(150);
                arrayList2.add(183);
                arrayList2.add(167);
                z2 = false;
                break;
            case 109:
                arrayList2.add(71);
                arrayList2.add(72);
                arrayList2.add(73);
                arrayList2.add(74);
                arrayList2.add(75);
                arrayList2.add(77);
                arrayList2.add(112);
                arrayList2.add(113);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_MODERN_DANCE));
                arrayList2.add(165);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_DISCO));
                arrayList2.add(166);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_TAP_DANCE));
                arrayList2.add(168);
                arrayList2.add(146);
                z2 = false;
                break;
            case 110:
                arrayList2.add(18);
                arrayList2.add(17);
                arrayList2.add(78);
                arrayList2.add(79);
                arrayList2.add(80);
                arrayList2.add(81);
                arrayList2.add(82);
                arrayList2.add(83);
                arrayList2.add(84);
                arrayList2.add(85);
                arrayList2.add(86);
                arrayList2.add(87);
                arrayList2.add(88);
                arrayList2.add(89);
                arrayList2.add(90);
                arrayList2.add(91);
                arrayList2.add(92);
                arrayList2.add(121);
                arrayList2.add(122);
                arrayList2.add(188);
                arrayList2.add(142);
                arrayList2.add(145);
                arrayList2.add(151);
                arrayList2.add(152);
                arrayList2.add(153);
                arrayList2.add(154);
                arrayList2.add(158);
                arrayList2.add(162);
                arrayList2.add(164);
                arrayList2.add(169);
                arrayList2.add(170);
                arrayList2.add(171);
                z2 = false;
                break;
            case 111:
                arrayList2.add(95);
                arrayList2.add(96);
                arrayList2.add(97);
                arrayList2.add(98);
                arrayList2.add(99);
                arrayList2.add(100);
                arrayList2.add(101);
                arrayList2.add(102);
                arrayList2.add(103);
                arrayList2.add(104);
                arrayList2.add(147);
                arrayList2.add(148);
                z2 = false;
                break;
            case 112:
                arrayList2.add(2001);
                arrayList2.add(21);
                arrayList2.add(2002);
                arrayList2.add(93);
                arrayList2.add(94);
                arrayList2.add(132);
                z2 = false;
                break;
            case 113:
                arrayList2.add(65);
                arrayList2.add(68);
                arrayList2.add(62);
                arrayList2.add(106);
                arrayList2.add(123);
                arrayList2.add(124);
                arrayList2.add(140);
                arrayList2.add(141);
                arrayList2.add(138);
                arrayList2.add(172);
                arrayList2.add(139);
                arrayList2.add(157);
                z2 = false;
                break;
            case 114:
                arrayList2.add(115);
                arrayList2.add(116);
                arrayList2.add(117);
                arrayList2.add(118);
                arrayList2.add(119);
                arrayList2.add(120);
                arrayList2.add(189);
                arrayList2.add(144);
                arrayList2.add(159);
                arrayList2.add(160);
                arrayList2.add(161);
                arrayList2.add(163);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_SHOOT));
                z2 = false;
                break;
            case 115:
                arrayList2.add(133);
                arrayList2.add(180);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_DOWNHILL));
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING));
                z2 = false;
                break;
            case 116:
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHESS));
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHECKERS));
                arrayList2.add(175);
                arrayList2.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BRIDGE));
                arrayList2.add(177);
                z2 = false;
                break;
            default:
                z2 = false;
                break;
        }
        for (GetSportStatAPI.StatDataEntity statDataEntity : (List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new d().getType())) {
            if (z2 || arrayList2.contains(Integer.valueOf(statDataEntity.sportType))) {
                arrayList.add(new ExerciseStatSportCountData(statDataEntity.count, statDataEntity.sportType));
            }
        }
        return arrayList;
    }

    public int getHeaderBg() {
        switch (HMKeeper.getChooseExerciseType()) {
            case 100:
            default:
                return R.drawable.bg_sport_his_stat_all_sport;
            case 101:
                return R.drawable.bg_sport_his_stat_running;
            case 102:
                return R.drawable.bg_sport_his_stat_riding;
            case 103:
                return R.drawable.bg_sport_his_stat_walk;
            case 104:
                return R.drawable.bg_sport_his_stat_outdoor;
            case 105:
                return R.drawable.bg_sport_his_stat_ice_snow;
            case 106:
                return R.drawable.bg_sport_his_stat_work_out;
            case 107:
                return R.drawable.bg_sport_his_stat_swim;
            case 108:
                return R.drawable.bg_sport_his_stat_indoor;
            case 109:
                return R.drawable.bg_sport_his_stat_dance;
            case 110:
                return R.drawable.bg_sport_his_stat_ball;
            case 111:
                return R.drawable.bg_sport_his_stat_fight;
            case 112:
                return R.drawable.bg_sport_his_stat_other;
            case 113:
                return R.drawable.bg_sport_his_stat_aquatic;
            case 114:
                return R.drawable.bg_sport_his_stat_leisure;
            case 115:
                return R.drawable.bg_sport_his_stat_extreme;
            case 116:
                return R.drawable.bg_sport_his_stat_chess;
        }
    }

    public int getHeaderMainDataType() {
        int chooseExerciseType = HMKeeper.getChooseExerciseType();
        return (chooseExerciseType == 100 || chooseExerciseType == 101 || chooseExerciseType == 102 || chooseExerciseType == 103 || chooseExerciseType == 107 || chooseExerciseType == 105 || chooseExerciseType == 104 || chooseExerciseType == 113) ? 0 : 1;
    }

    public int getIndexByExerType(int type) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if (type == this.c.get(i2).intValue()) {
                return i2;
            }
        }
        return -1;
    }

    public List<Integer> getIndexTypeList() {
        return this.c;
    }

    public int getTypeString() {
        return this.b[HMKeeper.getChooseExerciseType() - 100];
    }

    public int getWorkoutStrId() {
        return this.f;
    }

    public void initChooseType(Context context) {
        if (this.a == null || this.b == null) {
            this.c = new ArrayList();
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(R.array.exercise_type_images_x);
            int length = typedArrayObtainTypedArray.length();
            this.a = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.a[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
            }
            TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(R.array.exercise_type_titles);
            int length2 = typedArrayObtainTypedArray2.length();
            this.b = new int[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                this.b[i3] = typedArrayObtainTypedArray2.getResourceId(i3, 0);
            }
            typedArrayObtainTypedArray.recycle();
            typedArrayObtainTypedArray2.recycle();
        }
    }

    public void setWorkoutStrId(int strId) {
        this.f = strId;
        filterExerciseType(true);
    }
}

package com.xiaomi.fitness.sport_eco.view.launch.gym;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG_INTERVAL_TRAINING", "", "TAG_FTP_TEST", "TAG_ENVIRONMENTAL", "TAG_SPORT_DYNAMIC", "TAG_SPORT_HISTORY", "getFunctionList", "", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FunctionListDataKt {

    @NotNull
    public static final String TAG_ENVIRONMENTAL = "tag_environmental";

    @NotNull
    public static final String TAG_FTP_TEST = "tag_ftp_test";

    @NotNull
    public static final String TAG_INTERVAL_TRAINING = "tag_interval_training";

    @NotNull
    public static final String TAG_SPORT_DYNAMIC = "tag_sport_dynamic";

    @NotNull
    public static final String TAG_SPORT_HISTORY = "tag_sport_history";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r3.equals("yunmai.jmprope.sr804") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r3.equals("yunmai.jmprope.sr803") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r3.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData> getFunctionList() {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference r3 = com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference.INSTANCE
            java.lang.String r3 = r3.getKEY_GYM_LOCAL_SPORT_TYPE()
            int r4 = r3.hashCode()
            r5 = -1798122615(0xffffffff94d2d389, float:-2.1288017E-26)
            if (r4 == r5) goto L5d
            r5 = -1454035281(0xffffffffa9552eaf, float:-4.7335992E-14)
            if (r4 == r5) goto L45
            switch(r4) {
                case 405899618: goto L2d;
                case 405899619: goto L24;
                case 405899620: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L74
        L1b:
            java.lang.String r4 = "yunmai.jmprope.sr805"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L36
            goto L74
        L24:
            java.lang.String r4 = "yunmai.jmprope.sr804"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L36
            goto L74
        L2d:
            java.lang.String r4 = "yunmai.jmprope.sr803"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L36
            goto L74
        L36:
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData[] r2 = new com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData[r2]
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData$RopeIntervalTraining r3 = com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData.RopeIntervalTraining.INSTANCE
            r2[r1] = r3
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData$RopeSportHistory r1 = com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData.RopeSportHistory.INSTANCE
            r2[r0] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r2)
            goto L79
        L45:
            java.lang.String r4 = "runmi.exbike.jscrm1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4e
            goto L74
        L4e:
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData[] r2 = new com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData[r2]
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData$FtpTest r3 = com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData.FtpTest.INSTANCE
            r2[r1] = r3
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData$SportDynamic r1 = com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData.SportDynamic.INSTANCE
            r2[r0] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r2)
            goto L79
        L5d:
            java.lang.String r4 = "yesoul.exbike.jsc01y"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L74
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData[] r2 = new com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData[r2]
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData$FtpTest r3 = com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData.FtpTest.INSTANCE
            r2[r1] = r3
            com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData$Environmental r1 = com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListData.Environmental.INSTANCE
            r2[r0] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r2)
            goto L79
        L74:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListDataKt.getFunctionList():java.util.List");
    }
}

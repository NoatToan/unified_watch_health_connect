package com.xiaomi.fitness.sport_eco.course;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"getAudioList", "", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseGridAudioDataKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r5.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r5.equals("yunmai.jmprope.sr803") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r5.equals("runmi.exbike.jscrm1") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r5.equals("yesoul.exbike.jsc01y") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        return kotlin.collections.CollectionsKt__CollectionsKt.mutableListOf(com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.BasicTraining.INSTANCE, com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.BurningTraining.INSTANCE, com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.EfficientTraining.INSTANCE, com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.EnduranceTraining.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return kotlin.collections.CollectionsKt__CollectionsKt.mutableListOf(com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.PrimaryGreaseBurning.INSTANCE, com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.EfficientAndAdvanced.INSTANCE);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.xiaomi.fitness.sport_eco.course.CourseGridAudioData> getAudioList() {
        /*
            r0 = 3
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 0
            com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference r5 = com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference.INSTANCE
            java.lang.String r5 = r5.getKEY_GYM_LOCAL_SPORT_TYPE()
            int r6 = r5.hashCode()
            switch(r6) {
                case -1798122615: goto L5d;
                case -1454035281: goto L54;
                case 405899618: goto L3c;
                case 405899620: goto L33;
                case 1396900280: goto L13;
                default: goto L12;
            }
        L12:
            goto L65
        L13:
            java.lang.String r6 = "ksmb.treadmill.m1v1"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L1c
            goto L65
        L1c:
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData[] r1 = new com.xiaomi.fitness.sport_eco.course.CourseGridAudioData[r1]
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$BriskWalk r5 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.BriskWalk.INSTANCE
            r1[r4] = r5
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$BurningRun r4 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.BurningRun.INSTANCE
            r1[r3] = r4
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$Endurance r3 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.Endurance.INSTANCE
            r1[r2] = r3
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$HrRun r2 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.HrRun.INSTANCE
            r1[r0] = r2
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r1)
            goto L81
        L33:
            java.lang.String r0 = "yunmai.jmprope.sr805"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L45
            goto L65
        L3c:
            java.lang.String r0 = "yunmai.jmprope.sr803"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L45
            goto L65
        L45:
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData[] r0 = new com.xiaomi.fitness.sport_eco.course.CourseGridAudioData[r2]
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$PrimaryGreaseBurning r1 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.PrimaryGreaseBurning.INSTANCE
            r0[r4] = r1
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$EfficientAndAdvanced r1 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.EfficientAndAdvanced.INSTANCE
            r0[r3] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r0)
            goto L81
        L54:
            java.lang.String r6 = "runmi.exbike.jscrm1"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L6b
            goto L65
        L5d:
            java.lang.String r6 = "yesoul.exbike.jsc01y"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L6b
        L65:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L81
        L6b:
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData[] r1 = new com.xiaomi.fitness.sport_eco.course.CourseGridAudioData[r1]
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$BasicTraining r5 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.BasicTraining.INSTANCE
            r1[r4] = r5
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$BurningTraining r4 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.BurningTraining.INSTANCE
            r1[r3] = r4
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$EfficientTraining r3 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.EfficientTraining.INSTANCE
            r1[r2] = r3
            com.xiaomi.fitness.sport_eco.course.CourseGridAudioData$EnduranceTraining r2 = com.xiaomi.fitness.sport_eco.course.CourseGridAudioData.EnduranceTraining.INSTANCE
            r1[r0] = r2
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r1)
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.course.CourseGridAudioDataKt.getAudioList():java.util.List");
    }
}

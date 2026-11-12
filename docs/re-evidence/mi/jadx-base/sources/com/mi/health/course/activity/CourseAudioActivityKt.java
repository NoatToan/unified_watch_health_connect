package com.mi.health.course.activity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "TIMEOUT", "", "startAudio", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseAudioActivityKt {

    @NotNull
    private static final String TAG = "CourseAudioActivity";
    public static final long TIMEOUT = 10000;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r0.equals("yunmai.jmprope.sr803") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r6.setClass(r5, com.mi.health.course.eco.activity.EcoCourseAudioActivity.class);
        r5.startActivity(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r0.equals("runmi.exbike.jscrm1") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r0.equals("yesoul.exbike.jsc01y") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r6.setClass(r5, com.mi.health.course.activity.eco.EcoCourseAudioActivity.class);
        r5.startActivity(r6);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void startAudio(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull android.content.Intent r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "course_device_model"
            boolean r1 = r6.hasExtra(r0)
            java.lang.Class<com.mi.health.course.activity.CourseAudioActivity> r2 = com.mi.health.course.activity.CourseAudioActivity.class
            if (r1 == 0) goto L72
            java.lang.String r1 = r6.getStringExtra(r0)
            java.lang.String r3 = "runmi.exbike.jscrm1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            java.lang.String r4 = "yesoul.exbike.jsc01y"
            if (r1 != 0) goto L2c
            java.lang.String r1 = r6.getStringExtra(r0)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == 0) goto L72
        L2c:
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 == 0) goto L6b
            int r1 = r0.hashCode()
            switch(r1) {
                case -1798122615: goto L5c;
                case -1454035281: goto L55;
                case 405899618: goto L43;
                case 405899620: goto L3a;
                default: goto L39;
            }
        L39:
            goto L6b
        L3a:
            java.lang.String r1 = "yunmai.jmprope.sr805"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L6b
        L43:
            java.lang.String r1 = "yunmai.jmprope.sr803"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L6b
        L4c:
            java.lang.Class<com.mi.health.course.eco.activity.EcoCourseAudioActivity> r0 = com.mi.health.course.eco.activity.EcoCourseAudioActivity.class
            r6.setClass(r5, r0)
            r5.startActivity(r6)
            goto L78
        L55:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L62
            goto L6b
        L5c:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L6b
        L62:
            java.lang.Class<com.mi.health.course.activity.eco.EcoCourseAudioActivity> r0 = com.mi.health.course.activity.eco.EcoCourseAudioActivity.class
            r6.setClass(r5, r0)
            r5.startActivity(r6)
            goto L78
        L6b:
            r6.setClass(r5, r2)
            r5.startActivity(r6)
            goto L78
        L72:
            r6.setClass(r5, r2)
            r5.startActivity(r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.course.activity.CourseAudioActivityKt.startAudio(android.content.Context, android.content.Intent):void");
    }
}

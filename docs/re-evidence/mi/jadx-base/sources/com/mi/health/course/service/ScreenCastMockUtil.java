package com.mi.health.course.service;

import com.mi.health.course.data.CastScreenCMD;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import defpackage.ded;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/mi/health/course/service/ScreenCastMockUtil;", "", "", DailyRecordKey.sportType, "Lded;", "mockPhoneSportData", "(I)Lded;", "Lcom/mi/health/course/data/CastScreenCMD$FloatWindowData;", "floatWindowData", "projectionData", "", "builderFloatWindowData", "(Lcom/mi/health/course/data/CastScreenCMD$FloatWindowData;Lded;)V", "<init>", "()V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ScreenCastMockUtil {

    @NotNull
    public static final ScreenCastMockUtil INSTANCE = new ScreenCastMockUtil();

    private ScreenCastMockUtil() {
    }

    public final void builderFloatWindowData(@NotNull CastScreenCMD.FloatWindowData floatWindowData, @NotNull ded projectionData) {
        Intrinsics.checkNotNullParameter(floatWindowData, "floatWindowData");
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        floatWindowData.sportType = projectionData.c;
        floatWindowData.startTime = projectionData.d;
        floatWindowData.duration = projectionData.e;
        floatWindowData.hrm = projectionData.f;
        floatWindowData.calorie = projectionData.g;
        int i = projectionData.i;
        if (i > 0) {
            floatWindowData.distance = Float.valueOf(i);
        }
        int i2 = projectionData.j;
        if (i2 > 0) {
            floatWindowData.pace = Integer.valueOf(i2);
        }
        float f = projectionData.f15440k;
        if (f > 0.0f) {
            floatWindowData.speed = Float.valueOf(f);
        }
        int i3 = projectionData.h;
        if (i3 > 0) {
            floatWindowData.steps = Integer.valueOf(i3);
        }
        int i4 = projectionData.l;
        if (i4 > 0) {
            floatWindowData.count = Integer.valueOf(i4);
        }
        double d = 100;
        floatWindowData.resistance = Integer.valueOf(((int) (Math.random() * d)) + 10);
        floatWindowData.cadence = Integer.valueOf(((int) (d * Math.random())) + 100);
        int i5 = projectionData.m;
        if (i5 > 0) {
            floatWindowData.stumbleTimes = Integer.valueOf(i5);
        }
    }

    @NotNull
    public final ded mockPhoneSportData(int sportType) {
        ded dedVar = new ded();
        dedVar.c = sportType;
        dedVar.d = (int) (System.currentTimeMillis() / ((long) 1000));
        double d = 1000;
        dedVar.e = ((int) (Math.random() * d)) + 3600;
        double d2 = 150;
        dedVar.f = ((int) (Math.random() * d2)) + 50;
        dedVar.j = ((int) (((double) 420) * Math.random())) + 120;
        dedVar.i = ((int) (Math.random() * d)) + 100;
        dedVar.f15440k = xr5.e(2, (float) (((double) 5) + (((double) 30) * Math.random())));
        dedVar.h = ((int) (d2 * Math.random())) + 50;
        dedVar.g = ((int) (d * Math.random())) + 50;
        double d3 = 100;
        dedVar.l = ((int) (Math.random() * d3)) + 10;
        dedVar.m = ((int) (d3 * Math.random())) + 15;
        return dedVar;
    }
}

package com.xiaomi.fitness.milink.screencast;

import com.xiaomi.fitness.milink_sdk.CastScreenCMD;
import defpackage.ded;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/milink/screencast/ScreenCastMockUtil;", "", "", "projectionType", "convertProjectionTypeToScreenCastType", "(I)I", "", "isHundredSportType", "(I)Z", "Lcom/xiaomi/fitness/milink_sdk/CastScreenCMD$FloatWindowData;", "floatWindowData", "Lded;", "projectionData", "", "builderFloatWindowData", "(Lcom/xiaomi/fitness/milink_sdk/CastScreenCMD$FloatWindowData;Lded;)V", "<init>", "()V", "milink_release"}, k = 1, mv = {2, 0, 0})
public final class ScreenCastMockUtil {

    @NotNull
    public static final ScreenCastMockUtil INSTANCE = new ScreenCastMockUtil();

    private ScreenCastMockUtil() {
    }

    private final int convertProjectionTypeToScreenCastType(int projectionType) {
        if (projectionType == 3) {
            return 3;
        }
        if (projectionType == 11) {
            return 5;
        }
        if (projectionType == 13) {
            return 6;
        }
        if (projectionType == 14) {
            return 7;
        }
        if (projectionType == 16) {
            return 8;
        }
        return (projectionType == 7 || projectionType == 8 || projectionType == 12 || isHundredSportType(projectionType)) ? 4 : -1;
    }

    private final boolean isHundredSportType(int projectionType) {
        return projectionType > 100;
    }

    public final void builderFloatWindowData(@NotNull CastScreenCMD.FloatWindowData floatWindowData, @NotNull ded projectionData) {
        Intrinsics.checkNotNullParameter(floatWindowData, "floatWindowData");
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        floatWindowData.sportType = convertProjectionTypeToScreenCastType(projectionData.c);
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
        if (projectionData.n != null) {
            floatWindowData.groupFlag = 1;
            CastScreenCMD.GroupInfo groupInfo = new CastScreenCMD.GroupInfo();
            floatWindowData.groupInfo = groupInfo;
            ded.c cVar = projectionData.n;
            groupInfo.duration = cVar.e;
            groupInfo.startTime = cVar.d;
            groupInfo.type = cVar.c;
            groupInfo.index = Integer.valueOf(cVar.f);
            CastScreenCMD.GroupInfo groupInfo2 = floatWindowData.groupInfo;
            ded.c cVar2 = projectionData.n;
            groupInfo2.recommendHrm = cVar2.i;
            groupInfo2.calories = cVar2.h;
            groupInfo2.count = cVar2.g;
        }
    }
}

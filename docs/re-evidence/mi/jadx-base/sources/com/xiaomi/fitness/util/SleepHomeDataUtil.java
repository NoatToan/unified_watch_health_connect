package com.xiaomi.fitness.util;

import com.xiaomi.fitness.chart.entrys.SleepEntry;
import defpackage.c0j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/util/SleepHomeDataUtil;", "", "<init>", "()V", "createHomeEntry", "", "Lcom/xiaomi/fitness/chart/entrys/SleepEntry;", "qualityType", "", "timestamp", "", "getSleepQuality", "", "sleepType", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepHomeDataUtil {

    @NotNull
    public static final SleepHomeDataUtil INSTANCE = new SleepHomeDataUtil();

    private SleepHomeDataUtil() {
    }

    @NotNull
    public final List<SleepEntry> createHomeEntry(int qualityType, long timestamp) {
        int i = 0;
        int[] iArr = {0, 0, 0, 0};
        if (qualityType == 1) {
            iArr = new int[]{1, 0, 0, 0};
        } else if (qualityType == 2) {
            iArr = new int[]{1, 1, 0, 0};
        } else if (qualityType == 3) {
            iArr = new int[]{1, 1, 1, 0};
        } else if (qualityType == 4) {
            iArr = new int[]{1, 1, 1, 1};
        }
        ArrayList arrayList = new ArrayList();
        while (i < 4) {
            SleepEntry sleepEntry = new SleepEntry(i, iArr[i], timestamp, 2);
            i++;
            sleepEntry.a(i);
            arrayList.add(sleepEntry);
        }
        return arrayList;
    }

    @NotNull
    public final String getSleepQuality(int sleepType) {
        if (sleepType == 1) {
            return ExtUtilKt.getString(c0j.Ud);
        }
        if (sleepType == 2) {
            return ExtUtilKt.getString(c0j.qh);
        }
        if (sleepType != 3) {
            return sleepType != 4 ? "" : ExtUtilKt.getString(c0j.Xd);
        }
        return ExtUtilKt.getString(c0j.Yd);
    }
}

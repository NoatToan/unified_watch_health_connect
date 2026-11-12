package com.xiaomi.fitness.health.sleep.view.wm;

import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.view.wm.a;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.c54;
import defpackage.tzc;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T extends tzc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12293a = 480;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12294b = 0;
    public int c = 0;
    public int d = 172800;
    public boolean e;

    public static /* synthetic */ int b(tzc tzcVar, tzc tzcVar2) {
        return Long.compare(tzcVar.getStartTime(), tzcVar2.getStartTime());
    }

    public static <T extends tzc> void d(List<SleepRegularView.a<T>> list, List<T> list2) {
        Calendar calendar = Calendar.getInstance();
        Objects.requireNonNull(list);
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < list2.size(); i++) {
            T t = list2.get(i);
            calendar.setTimeInMillis(t.getTimestamp() * 1000);
            c54.e(calendar);
            long timeInMillis = calendar.getTimeInMillis();
            List linkedList = (List) linkedHashMap.get(Long.valueOf(timeInMillis));
            if (linkedList == null) {
                linkedList = new LinkedList();
                linkedHashMap.put(Long.valueOf(timeInMillis), linkedList);
            }
            linkedList.add(t);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List list3 = (List) entry.getValue();
            if (!list3.isEmpty()) {
                Collections.sort(list3, new Comparator() { // from class: frm
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return a.b((tzc) obj, (tzc) obj2);
                    }
                });
                list.add(new SleepRegularView.a<>(list3, ((Long) entry.getKey()).longValue() / 1000, ((tzc) list3.get(0)).getStartTime(), ((tzc) list3.get(list3.size() - 1)).getEndTime()));
            }
        }
    }

    public void c(List<SleepRegularView.a<T>> list, Calendar calendar) {
        long j;
        boolean z;
        long jMax;
        if (list == null || list.isEmpty()) {
            return;
        }
        Calendar calendar2 = calendar == null ? Calendar.getInstance() : calendar;
        Iterator<SleepRegularView.a<T>> it = list.iterator();
        while (true) {
            j = 1000;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            SleepRegularView.a<T> next = it.next();
            long j2 = next.c;
            long j3 = next.d;
            calendar2.setTimeInMillis(j2 * 1000);
            c54.e(calendar2);
            long timeInMillis = calendar2.getTimeInMillis();
            calendar2.setTimeInMillis(j3 * 1000);
            c54.e(calendar2);
            if (timeInMillis != calendar2.getTimeInMillis()) {
                z = true;
                break;
            }
        }
        long jMin = Long.MAX_VALUE;
        long j4 = Long.MIN_VALUE;
        for (SleepRegularView.a<T> aVar : list) {
            long j5 = aVar.c;
            long j6 = aVar.d;
            long j7 = j4;
            calendar2.setTimeInMillis(j5 * j);
            c54.e(calendar2);
            long timeInMillis2 = calendar2.getTimeInMillis() / j;
            long j8 = jMin;
            calendar2.setTimeInMillis(j6 * j);
            c54.e(calendar2);
            long timeInMillis3 = calendar2.getTimeInMillis() / j;
            if (!z || timeInMillis2 == timeInMillis3) {
                jMin = Math.min(j8, (j5 - timeInMillis2) + 86400);
                jMax = Math.max(j7, (j6 - timeInMillis2) + 86400);
            } else {
                jMin = Math.min(j8, j5 - timeInMillis2);
                jMax = Math.max(j7, j6 - timeInMillis2);
            }
            j4 = jMax;
            j = 1000;
        }
        int i = (int) (jMin / 60);
        int i2 = (int) (j4 / 60);
        Logger.i("SleepRegularHelper", "sleepMins:" + i + "/wakeupMins:" + i2);
        int i3 = HMSedentaryConfig.DEFAULT_STOP_INDEX;
        if (i < 1260) {
            while (i3 > i) {
                i3 += AMapEngineUtils.MIN_LONGITUDE_DEGREE;
            }
        }
        int i4 = 2700;
        if (i2 > 2700) {
            while (i4 < i2) {
                i4 += 180;
            }
        }
        int i5 = i4 - i3;
        this.f12293a = i5 / 6;
        this.d = i5 * 60;
        this.e = i3 < 1440;
        this.f12294b = i3 % 1440;
        Logger.i("SleepRegularHelper", "latestWakeupTime:" + i4 + "/earliestSleepTime:" + i3 + "totoal:" + i5 + "/mTimeGap:" + this.f12293a + "/mColumnTimeDuration" + this.d);
    }
}

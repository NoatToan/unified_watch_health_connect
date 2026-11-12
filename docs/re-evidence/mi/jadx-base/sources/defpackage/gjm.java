package defpackage;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValue;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.HealthUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class gjm {
    public static List<SleepItemEntry> b(SleepSegmentReport sleepSegmentReport, Boolean bool) {
        LinkedList linkedList = new LinkedList();
        List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
        if (ArrayUtils.isEmpty(sleepItems)) {
            return linkedList;
        }
        SleepStateItem sleepStateItem = sleepItems.get(0);
        LinkedList<Integer> linkedListI = i(sleepItems);
        long startTime = sleepStateItem.getStartTime();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i < sleepItems.size()) {
            SleepStateItem sleepStateItem2 = sleepItems.get(i);
            SleepItemEntry sleepItemEntry = new SleepItemEntry();
            npm npmVar = new npm();
            int sleepType = HealthUtil.getSleepType(sleepStateItem2.getSleepState());
            npmVar.c = sleepType;
            npmVar.f28234b = npm.c(sleepType);
            npmVar.d = g(npmVar.c, linkedListI);
            if (i == 0) {
                sleepItemEntry.type = 1;
            } else {
                sleepItemEntry.type = 2;
            }
            int i6 = i;
            npmVar.f = sleepStateItem2.getStartTime();
            npmVar.g = sleepStateItem2.getEndTime();
            if (bool.booleanValue()) {
                if (sleepSegmentReport.getHrDetailRecords() != null) {
                    for (int i7 = 0; i7 < sleepSegmentReport.getHrDetailRecords().size(); i7++) {
                        TimedValue<Integer> timedValue = sleepSegmentReport.getHrDetailRecords().get(i7);
                        long time = timedValue.getTime();
                        if (time >= sleepStateItem2.getStartTime() && time <= sleepStateItem2.getEndTime()) {
                            if (timedValue.getValue().intValue() > npmVar.i) {
                                npmVar.i = timedValue.getValue().intValue();
                            }
                            int iIntValue = timedValue.getValue().intValue();
                            int i8 = npmVar.j;
                            if ((iIntValue < i8 || i8 == 0) && timedValue.getValue().intValue() > 0) {
                                npmVar.j = timedValue.getValue().intValue();
                            }
                        }
                    }
                    int i9 = npmVar.i;
                    if (i9 != 0) {
                        i2 = i9;
                    } else {
                        npmVar.i = i2;
                    }
                    int i10 = npmVar.j;
                    if (i10 != 0) {
                        i3 = i10;
                    } else {
                        npmVar.j = i3;
                    }
                }
                if (sleepSegmentReport.getSpo2DetailRecords() != null) {
                    for (int i11 = 0; i11 < sleepSegmentReport.getSpo2DetailRecords().size(); i11++) {
                        TimedValue<Integer> timedValue2 = sleepSegmentReport.getSpo2DetailRecords().get(i11);
                        long time2 = timedValue2.getTime();
                        if (time2 >= sleepStateItem2.getStartTime() && time2 <= sleepStateItem2.getEndTime()) {
                            if (timedValue2.getValue().intValue() > npmVar.f28235k) {
                                npmVar.f28235k = timedValue2.getValue().intValue();
                            }
                            int iIntValue2 = timedValue2.getValue().intValue();
                            int i12 = npmVar.l;
                            if ((iIntValue2 < i12 || i12 == 0) && timedValue2.getValue().intValue() > 0) {
                                npmVar.l = timedValue2.getValue().intValue();
                            }
                        }
                    }
                    int i13 = npmVar.f28235k;
                    if (i13 != 0) {
                        i4 = i13;
                    } else {
                        npmVar.f28235k = i4;
                    }
                    int i14 = npmVar.l;
                    if (i14 != 0) {
                        i5 = i14;
                    } else {
                        npmVar.l = i5;
                    }
                }
            }
            sleepItemEntry.localDate = TimeDateUtil.timestampToLocalDate(npmVar.g);
            sleepItemEntry.timestamp = npmVar.g;
            sleepItemEntry.f11764a = npmVar;
            sleepItemEntry.setY(npmVar.c + 1);
            sleepItemEntry.setX(npmVar.f - startTime);
            int i15 = (int) (npmVar.g - npmVar.f);
            npmVar.e = i15;
            if (i15 == 0) {
                npmVar.e = 1;
            }
            linkedList.add(0, sleepItemEntry);
            i = i6 + 1;
        }
        return linkedList;
    }

    public static List<SleepEntry> c(int i, long j) {
        int i2 = 0;
        int[] iArr = {0, 0, 0, 0};
        if (i == 1) {
            iArr = new int[]{1, 0, 0, 0};
        } else if (i == 2) {
            iArr = new int[]{1, 1, 0, 0};
        } else if (i == 3) {
            iArr = new int[]{1, 1, 1, 0};
        } else if (i == 4) {
            iArr = new int[]{1, 1, 1, 1};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < 4) {
            SleepEntry sleepEntry = new SleepEntry(i2, iArr[i2], j, 2);
            i2++;
            sleepEntry.a(i2);
            arrayList.add(sleepEntry);
        }
        return arrayList;
    }

    public static c0n d(AllDaySleepReport allDaySleepReport) {
        ArrayList arrayList = new ArrayList();
        if (allDaySleepReport != null) {
            if (allDaySleepReport.getDeepDuration() > 0) {
                npm npmVar = new npm();
                npmVar.f28233a = k(allDaySleepReport.getDeepDuration());
                npmVar.c = 3;
                arrayList.add(npmVar);
            }
            if (allDaySleepReport.getLightDuration() > 0) {
                npm npmVar2 = new npm();
                npmVar2.f28233a = k(allDaySleepReport.getLightDuration());
                npmVar2.c = 2;
                arrayList.add(npmVar2);
            }
            if (allDaySleepReport.getRemDuration() != null && allDaySleepReport.getRemDuration().intValue() != 0) {
                npm npmVar3 = new npm();
                npmVar3.f28233a = k(allDaySleepReport.getRemDuration().intValue());
                npmVar3.c = 1;
                arrayList.add(npmVar3);
            }
            int totalDuration = allDaySleepReport.getTotalDuration() - ((allDaySleepReport.getDeepDuration() + allDaySleepReport.getLightDuration()) + (allDaySleepReport.getRemDuration() != null ? allDaySleepReport.getRemDuration().intValue() : 0));
            if (totalDuration > 0) {
                npm npmVar4 = new npm();
                npmVar4.f28233a = k(totalDuration);
                npmVar4.c = 4;
                arrayList.add(npmVar4);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                npm npmVar5 = (npm) arrayList.get(size);
                if (npmVar5.f28233a > 0.0f) {
                    npmVar5.h = true;
                    break;
                }
            }
        }
        return new c0n(arrayList);
    }

    public static int e(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        return i;
    }

    public static float f(c0n c0nVar) {
        int size = c0nVar.f4804a.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f += c0nVar.f4804a.get(i).f28233a;
        }
        return f;
    }

    public static int g(int i, LinkedList<Integer> linkedList) {
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            if (linkedList.get(i2).intValue() == i) {
                return i2;
            }
        }
        return -1;
    }

    public static int[] h(SleepSegmentReport sleepSegmentReport) {
        int[] iArr = new int[4];
        if (sleepSegmentReport != null && sleepSegmentReport.getSleepDuration() > 0) {
            float sleepDuration = sleepSegmentReport.getSleepDuration();
            float[] fArr = {q2h.a(Float.valueOf((sleepSegmentReport.getDeepDuration() * 100) / sleepDuration), 1), q2h.a(Float.valueOf((sleepSegmentReport.getLightDuration() * 100) / sleepDuration), 1), q2h.a(Float.valueOf(((sleepSegmentReport.getRemDuration() == null ? 0 : sleepSegmentReport.getRemDuration().intValue()) * 100) / sleepDuration), 1), q2h.a(Float.valueOf(((sleepSegmentReport.getSleepTraceDuration() == null ? 0 : sleepSegmentReport.getSleepTraceDuration().intValue()) * 100) / sleepDuration), 1)};
            float[] fArr2 = new float[4];
            HashMap map = new HashMap();
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                float f = fArr[i2];
                int i3 = (int) ((f * 100.0f) / 100.0f);
                iArr[i2] = i3;
                i += i3;
                fArr2[i2] = q2h.a(Float.valueOf(f - i3), 1);
                map.put(Integer.valueOf(i2), Float.valueOf(fArr2[i2]));
            }
            int i4 = 100 - i;
            if (i4 > 0 && i4 <= 4) {
                Comparator comparator = new Comparator() { // from class: fjm
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return gjm.j((Map.Entry) obj, (Map.Entry) obj2);
                    }
                };
                ArrayList arrayList = new ArrayList(map.entrySet());
                Collections.sort(arrayList, comparator);
                Iterator it = arrayList.subList(0, i4).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) ((Map.Entry) it.next()).getKey()).intValue();
                    iArr[iIntValue] = iArr[iIntValue] + 1;
                }
            }
        }
        return iArr;
    }

    public static LinkedList<Integer> i(List<SleepStateItem> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<SleepStateItem> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(HealthUtil.getSleepType(it.next().getSleepState())));
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(0, linkedHashSet);
        Collections.sort(linkedList);
        return linkedList;
    }

    public static /* synthetic */ int j(Map.Entry entry, Map.Entry entry2) {
        float fFloatValue = ((Float) entry2.getValue()).floatValue();
        float fFloatValue2 = ((Float) entry.getValue()).floatValue();
        if (fFloatValue2 < fFloatValue) {
            return 1;
        }
        if (fFloatValue2 > fFloatValue) {
            return -1;
        }
        return Integer.compare(e(((Integer) entry.getKey()).intValue()), e(((Integer) entry2.getKey()).intValue()));
    }

    public static float k(float f) {
        return (f * 1.0f) / 60.0f;
    }
}

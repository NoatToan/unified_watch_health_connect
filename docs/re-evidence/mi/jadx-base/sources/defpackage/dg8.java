package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fitness.common.unit.LengthUnit;
import com.xiaomi.fitness.common.unit.SpeedUnit;
import com.xiaomi.fitness.migration.exercise.entity.ExerciseRecord;
import com.xiaomi.fitness.migration.exercise.transformation.PressureFileUtils;
import com.xiaomi.fitness.migration.exercise.transformation.PressureSegment;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes9.dex */
public class dg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f15507a = new Gson();

    public static List<StepItem> a(List<? extends ozc> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        Calendar calendar = Calendar.getInstance();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ozc ozcVar : list) {
            int iA = ozcVar.a();
            long jD = ozcVar.d();
            long jC = ozcVar.c();
            calendar.setTimeInMillis(jD);
            int i = calendar.get(11);
            int i2 = calendar.get(12);
            int i3 = calendar.get(13);
            calendar.setTimeInMillis(jC);
            int i4 = calendar.get(11);
            int i5 = calendar.get(12);
            int i6 = calendar.get(13);
            long minutes = TimeUnit.MILLISECONDS.toMinutes(jD);
            if (i == i4 && i2 == i5) {
                Integer num = (Integer) linkedHashMap.get(Long.valueOf(minutes));
                linkedHashMap.put(Long.valueOf(minutes), num != null ? Integer.valueOf(num.intValue() + iA) : Integer.valueOf(iA));
            } else {
                if (i > 0 && i4 == 0) {
                    i4 = 24;
                }
                int i7 = ((i4 - i) * 3600) + ((i5 - i2) * 60) + (i6 - i3);
                if (i7 != 0) {
                    float f = (iA * 1.0f) / i7;
                    int i8 = 60 - i3;
                    int i9 = (int) (i8 * f);
                    Integer num2 = (Integer) linkedHashMap.get(Long.valueOf(minutes));
                    linkedHashMap.put(Long.valueOf(minutes), num2 != null ? Integer.valueOf(num2.intValue() + i9) : Integer.valueOf(i9));
                    int i10 = i7 - i8;
                    int i11 = iA - i9;
                    long j = minutes + 1;
                    int i12 = (int) (60 * f);
                    while (true) {
                        int i13 = i10 - 60;
                        if (i13 < 0) {
                            break;
                        }
                        Integer num3 = (Integer) linkedHashMap.get(Long.valueOf(j));
                        linkedHashMap.put(Long.valueOf(j), num3 != null ? Integer.valueOf(num3.intValue() + i12) : Integer.valueOf(i12));
                        i11 -= i12;
                        j++;
                        i10 = i13;
                    }
                    if (i10 > 0 && i11 > 0) {
                        Integer num4 = (Integer) linkedHashMap.get(Long.valueOf(j));
                        linkedHashMap.put(Long.valueOf(j), num4 != null ? Integer.valueOf(num4.intValue() + i11) : Integer.valueOf(i11));
                    }
                }
            }
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Long) entry.getKey()).longValue() * 60;
            int iIntValue = ((Integer) entry.getValue()).intValue();
            long seconds = TimeUnit.MINUTES.toSeconds(1L);
            float fC = c(iIntValue);
            linkedList.add(new StepItem(jLongValue, iIntValue, (int) fC, b(e(fC, seconds), iIntValue)));
        }
        return linkedList;
    }

    public static float b(float f, int i) {
        return fg8.a(f) * i;
    }

    public static float c(int i) {
        return LengthUnit.CENTIMETER.toMeter(i * 60.0f);
    }

    public static <T> T d(Gson gson, Class<T> cls, String str) {
        Objects.requireNonNull(cls);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) gson.fromJson(str, (Type) cls);
    }

    public static float e(float f, long j) {
        return SpeedUnit.METER_PER_SECOND.toKMPerHour(f / j);
    }

    public static ActiveStageItem f(Context context, ExerciseRecord exerciseRecord) {
        int iA = bh8.a(exerciseRecord.V());
        if (iA == 0) {
            return null;
        }
        int iH = h(exerciseRecord);
        return new ActiveStageItem(exerciseRecord.d() / 1000, exerciseRecord.c() / 1000, iA, Integer.valueOf(iH), exerciseRecord.C(), exerciseRecord.B(), Float.valueOf(g(context, exerciseRecord)));
    }

    public static float g(Context context, ExerciseRecord exerciseRecord) {
        String strR = exerciseRecord.R();
        if (TextUtils.isEmpty(strR)) {
            return 0.0f;
        }
        PressureSegment pressureFile = PressureFileUtils.readPressureFile(context, strR);
        float totalUpAltitude = pressureFile != null ? pressureFile.getTotalUpAltitude() : 0.0f;
        PressureFileUtils.deletePressureFile(context, strR);
        return totalUpAltitude;
    }

    public static int h(ExerciseRecord exerciseRecord) {
        wg8 wg8Var;
        String strV = exerciseRecord.V();
        if ((Objects.equals(strV, "WALKING") || Objects.equals(strV, DebugCoroutineInfoImplKt.RUNNING) || Objects.equals(strV, "STAIR_CLIMBING")) && (wg8Var = (wg8) d(f15507a, wg8.class, exerciseRecord.H())) != null) {
            return wg8Var.g();
        }
        return 0;
    }
}

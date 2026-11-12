package com.xiaomi.fitness.health.sleep.utils;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.ui.adapter.ScheduleItem;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import defpackage.c0j;
import defpackage.iji;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\t0\bJ\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\bJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\bJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\bJ\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\b\u0001\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepAnimalHelper;", "", "<init>", "()V", "exampleStartTime", "", "ONE_DAY", "buildSleepScheduleExampleMap", "", "", "Lkotlin/Pair;", "buildContinuityExampleData", "", "buildSleepDayNapExample", "buildSleepStressExample", "buildSleepStrengthExample", "buildSleepSampleDateExample", "buildScheduleList", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/ScheduleItem;", "type", "context", "Landroid/content/Context;", "buildSheepScheduleList", "buildBrownBearScheduleList", "buildSharkAndKoalaScheduleList", "buildPenguinAndOwlScheduleList", "formatMinute", "", "minute", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAnimalHelper {

    @NotNull
    public static final SleepAnimalHelper INSTANCE = new SleepAnimalHelper();
    private static final long ONE_DAY = 86400;
    private static final long exampleStartTime = 1688947200;

    private SleepAnimalHelper() {
    }

    private final List<ScheduleItem> buildBrownBearScheduleList(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = iji.W1;
        String minute = formatMinute(420L);
        String string = context.getString(c0j.Le);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new ScheduleItem(i, minute, string));
        int i2 = iji.X1;
        String minute2 = formatMinute(540L);
        String string2 = context.getString(c0j.Oe);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new ScheduleItem(i2, minute2, string2));
        int i3 = iji.S1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(600L), formatMinute(720L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string3 = context.getString(c0j.Ie);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new ScheduleItem(i3, str, string3));
        int i4 = iji.a2;
        String minute3 = formatMinute(780L);
        String string4 = context.getString(c0j.Ne);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new ScheduleItem(i4, minute3, string4));
        int i5 = iji.U1;
        String str2 = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(900L), formatMinute(1080L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String string5 = context.getString(c0j.Je);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new ScheduleItem(i5, str2, string5));
        int i6 = iji.V1;
        String minute4 = formatMinute(1140L);
        String string6 = context.getString(c0j.Ke);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new ScheduleItem(i6, minute4, string6));
        int i7 = iji.X1;
        String str3 = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(1200L), formatMinute(1320L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String string7 = context.getString(c0j.Fe);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        arrayList.add(new ScheduleItem(i7, str3, string7));
        int i8 = iji.b2;
        String minute5 = formatMinute(1380L);
        String string8 = context.getString(c0j.Qe);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new ScheduleItem(i8, minute5, string8));
        return arrayList;
    }

    private final List<ScheduleItem> buildPenguinAndOwlScheduleList(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = iji.W1;
        String minute = formatMinute(420L);
        String string = context.getString(c0j.Le);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new ScheduleItem(i, minute, string));
        int i2 = iji.T1;
        String minute2 = formatMinute(570L);
        String string2 = context.getString(c0j.Ge);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new ScheduleItem(i2, minute2, string2));
        int i3 = iji.U1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(600L), formatMinute(720L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string3 = context.getString(c0j.Je);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new ScheduleItem(i3, str, string3));
        int i4 = iji.d2;
        String minute3 = formatMinute(780L);
        String string4 = context.getString(c0j.Te);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new ScheduleItem(i4, minute3, string4));
        int i5 = iji.S1;
        String str2 = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(960L), formatMinute(1080L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String string5 = context.getString(c0j.Ie);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new ScheduleItem(i5, str2, string5));
        int i6 = iji.V1;
        String minute4 = formatMinute(1080L);
        String string6 = context.getString(c0j.Ke);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new ScheduleItem(i6, minute4, string6));
        int i7 = iji.a2;
        String minute5 = formatMinute(1350L);
        String string7 = context.getString(c0j.Pe);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        arrayList.add(new ScheduleItem(i7, minute5, string7));
        int i8 = iji.b2;
        String minute6 = formatMinute(1410L);
        String string8 = context.getString(c0j.Qe);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new ScheduleItem(i8, minute6, string8));
        return arrayList;
    }

    private final List<ScheduleItem> buildSharkAndKoalaScheduleList(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = iji.W1;
        String minute = formatMinute(450L);
        String string = context.getString(c0j.Le);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new ScheduleItem(i, minute, string));
        int i2 = iji.V1;
        String minute2 = formatMinute(510L);
        String string2 = context.getString(c0j.Me);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new ScheduleItem(i2, minute2, string2));
        int i3 = iji.X1;
        String minute3 = formatMinute(540L);
        String string3 = context.getString(c0j.Oe);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new ScheduleItem(i3, minute3, string3));
        int i4 = iji.R1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(600L), formatMinute(720L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string4 = context.getString(c0j.He);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new ScheduleItem(i4, str, string4));
        int i5 = iji.S1;
        String str2 = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(900L), formatMinute(1080L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String string5 = context.getString(c0j.Ie);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new ScheduleItem(i5, str2, string5));
        int i6 = iji.V1;
        String minute4 = formatMinute(1080L);
        String string6 = context.getString(c0j.Ke);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new ScheduleItem(i6, minute4, string6));
        int i7 = iji.a2;
        String minute5 = formatMinute(1380L);
        String string7 = context.getString(c0j.Pe);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        arrayList.add(new ScheduleItem(i7, minute5, string7));
        int i8 = iji.b2;
        String minute6 = formatMinute(DateTimeHelper.sDayInMinutes);
        String string8 = context.getString(c0j.Qe);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new ScheduleItem(i8, minute6, string8));
        return arrayList;
    }

    private final List<ScheduleItem> buildSheepScheduleList(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = iji.W1;
        String minute = formatMinute(390L);
        String string = context.getString(c0j.Le);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new ScheduleItem(i, minute, string));
        int i2 = iji.X1;
        String minute2 = formatMinute(450L);
        String string2 = context.getString(c0j.Oe);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new ScheduleItem(i2, minute2, string2));
        int i3 = iji.T1;
        String minute3 = formatMinute(540L);
        String string3 = context.getString(c0j.Ge);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new ScheduleItem(i3, minute3, string3));
        int i4 = iji.S1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(600L), formatMinute(720L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string4 = context.getString(c0j.Ie);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new ScheduleItem(i4, str, string4));
        int i5 = iji.U1;
        String str2 = String.format("%s-%s", Arrays.copyOf(new Object[]{formatMinute(780L), formatMinute(1020L)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String string5 = context.getString(c0j.Fe);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new ScheduleItem(i5, str2, string5));
        int i6 = iji.V1;
        String minute4 = formatMinute(1020L);
        String string6 = context.getString(c0j.Ke);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new ScheduleItem(i6, minute4, string6));
        int i7 = iji.a2;
        String minute5 = formatMinute(1320L);
        String string7 = context.getString(c0j.Pe);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        arrayList.add(new ScheduleItem(i7, minute5, string7));
        int i8 = iji.b2;
        String minute6 = formatMinute(1380L);
        String string8 = context.getString(c0j.Qe);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new ScheduleItem(i8, minute6, string8));
        return arrayList;
    }

    private final String formatMinute(long minute) {
        return TimeUtils.parseMinutesToHHMM(minute);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    @NotNull
    public final Map<Long, Integer> buildContinuityExampleData() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 7; i++) {
            long j = (((long) i) * 86400) + exampleStartTime;
            int i2 = 4;
            if (i != 0) {
                if (i == 1) {
                    i2 = 1;
                } else if (i == 2) {
                    i2 = 0;
                } else if (i == 3) {
                    i2 = 1;
                } else if (i == 4) {
                    i2 = 6;
                } else if (i != 5) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            linkedHashMap.put(Long.valueOf(j), Integer.valueOf(i2));
        }
        return linkedHashMap;
    }

    @NotNull
    public final List<ScheduleItem> buildScheduleList(@SleepAnimalType int type, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        switch (type) {
            case 1:
            case 4:
                return buildPenguinAndOwlScheduleList(context);
            case 2:
                return buildBrownBearScheduleList(context);
            case 3:
                return buildSheepScheduleList(context);
            case 5:
            case 6:
                return buildSharkAndKoalaScheduleList(context);
            default:
                return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    @NotNull
    public final Map<Long, Integer> buildSleepDayNapExample() {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < 7; i2++) {
            long j = (((long) i2) * 86400) + exampleStartTime;
            if (i2 != 0) {
                i = 5;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = 0;
                    } else if (i2 == 3) {
                        i = 20;
                    } else if (i2 == 4) {
                        i = 50;
                    } else if (i2 != 5) {
                        i = 35;
                    } else {
                        i = 0;
                    }
                }
            } else {
                i = 40;
            }
            linkedHashMap.put(Long.valueOf(j), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    @NotNull
    public final List<Long> buildSleepSampleDateExample() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            arrayList.add(Long.valueOf((((long) i) * 86400) + exampleStartTime));
        }
        return arrayList;
    }

    @NotNull
    public final Map<Long, List<Pair<Long, Long>>> buildSleepScheduleExampleMap() {
        Pair pair;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < 7) {
            long j = (((long) i) * 86400) + exampleStartTime;
            if (i == 0) {
                pair = new Pair(Long.valueOf(((long) HMSedentaryConfig.INGORE_START_INDEX) + j), Long.valueOf(((long) 25920) + j));
            } else if (i == 1) {
                pair = new Pair(Long.valueOf(j - ((long) 1800)), Long.valueOf(((long) 26100) + j));
            } else if (i == 2) {
                pair = new Pair(Long.valueOf(j - ((long) 900)), Long.valueOf(((long) 26400) + j));
            } else if (i == 3) {
                pair = new Pair(Long.valueOf(j - ((long) 3000)), Long.valueOf(((long) 22560) + j));
            } else if (i != 4) {
                pair = i != 5 ? new Pair(Long.valueOf(((long) 240) + j), Long.valueOf(((long) 25800) + j)) : new Pair(Long.valueOf(j - ((long) 1920)), Long.valueOf(((long) 25500) + j));
            } else {
                pair = new Pair(Long.valueOf(((long) 600) + j), Long.valueOf(((long) 27000) + j));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair);
            linkedHashMap.put(Long.valueOf(j), arrayList);
            i++;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    @NotNull
    public final Map<Long, Integer> buildSleepStrengthExample() {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < 7; i2++) {
            long j = (((long) i2) * 86400) + exampleStartTime;
            if (i2 == 0) {
                i = 40;
            } else if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 30;
            } else if (i2 == 3) {
                i = 0;
            } else if (i2 == 4) {
                i = 60;
            } else if (i2 != 5) {
                i = 50;
            } else {
                i = 0;
            }
            linkedHashMap.put(Long.valueOf(j), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<Long, Integer> buildSleepStressExample() {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < 7; i2++) {
            long j = (((long) i2) * 86400) + exampleStartTime;
            if (i2 == 0) {
                i = 85;
            } else if (i2 != 1) {
                i = 30;
                if (i2 != 2) {
                    if (i2 == 3) {
                        i = 35;
                    } else if (i2 == 4) {
                        i = 90;
                    } else if (i2 == 5) {
                        i = 20;
                    }
                }
            } else {
                i = 45;
            }
            linkedHashMap.put(Long.valueOf(j), Integer.valueOf(i));
        }
        return linkedHashMap;
    }
}

package com.xiaomi.fitness.health.sleep.utils;

import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.entity.SleepAnalyzeItem;
import com.xiaomi.fitness.health.sleep.ui.SleepLevel;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.iji;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepAnalyzeHelper;", "", "<init>", "()V", "TAG", "", "SLEEP_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "", "transformSleepAnalyzeList", "", "Lcom/xiaomi/fitness/health/sleep/entity/SleepAnalyzeItem;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "preReport", "buildTotalDurationAnalyzeItem", FitnessReportKey.totalDuration, "", "buildDeepAnalyzeItem", "buildThreeSegmentSleepLevelList", "Lcom/xiaomi/fitness/health/sleep/ui/SleepLevel;", "range", "", "minMax", "Lkotlin/Pair;", "", "getDeepPercent", "buildRemAnalyzeItem", "getRemPercent", "buildBedTimeAnalyzeItem", "buildSleepRegularAnalyzeItem", "getEarliestBedTime", "", "getSleepLevelList", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAnalyzeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnalyzeHelper.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepAnalyzeHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
public final class SleepAnalyzeHelper {

    @NotNull
    public static final SleepAnalyzeHelper INSTANCE = new SleepAnalyzeHelper();

    @NotNull
    private static final int[] SLEEP_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH = {iji.D1, iji.E1, iji.u0};

    @NotNull
    public static final String TAG = "SleepAnalyzeHelper";

    private SleepAnalyzeHelper() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    private final SleepAnalyzeItem buildBedTimeAnalyzeItem(AllDaySleepReport report) {
        Float second;
        String string;
        int i = 2;
        long earliestBedTime = getEarliestBedTime(report);
        if (earliestBedTime <= 0) {
            return null;
        }
        long time = earliestBedTime - (report.getTime() - TimeUnit.DAYS.toSeconds(1L));
        if (time <= 0) {
            return null;
        }
        float fFloatValue = time / 60.0f;
        SleepAnalyzeItem sleepAnalyzeItem = new SleepAnalyzeItem();
        float[] fArr = {1320.0f, 1440.0f};
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(1080.0f), Float.valueOf(1620.0f));
        if (fFloatValue >= pair.getFirst().floatValue()) {
            if (fFloatValue > pair.getSecond().floatValue()) {
                second = pair.getSecond();
            }
            if (fFloatValue < fArr[0]) {
                i = 0;
            } else if (fFloatValue <= fArr[1]) {
                i = 1;
            }
            float fFloatValue2 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
            sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.ek));
            if (fFloatValue < fArr[0]) {
                string = ExtUtilKt.getString(c0j.If);
            } else if (fFloatValue > fArr[1]) {
                string = ExtUtilKt.getString(c0j.fh);
            } else {
                string = ExtUtilKt.getString(c0j.ei);
            }
            sleepAnalyzeItem.setEvaluationCoreStr(string);
            sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.fk));
            sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
            sleepAnalyzeItem.setSelectPosition(i);
            sleepAnalyzeItem.setSelectPercent(fFloatValue2);
            return sleepAnalyzeItem;
        }
        second = pair.getFirst();
        fFloatValue = second.floatValue();
        if (fFloatValue < fArr[0]) {
            i = 0;
        } else if (fFloatValue <= fArr[1]) {
            i = 1;
        }
        float fFloatValue3 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
        sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.ek));
        if (fFloatValue < fArr[0]) {
            string = ExtUtilKt.getString(c0j.If);
        } else if (fFloatValue > fArr[1]) {
            string = ExtUtilKt.getString(c0j.fh);
        } else {
            string = ExtUtilKt.getString(c0j.ei);
        }
        sleepAnalyzeItem.setEvaluationCoreStr(string);
        sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.fk));
        sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
        sleepAnalyzeItem.setSelectPosition(i);
        sleepAnalyzeItem.setSelectPercent(fFloatValue3);
        return sleepAnalyzeItem;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    private final SleepAnalyzeItem buildDeepAnalyzeItem(AllDaySleepReport report) {
        float fFloatValue;
        Float second;
        String string;
        float deepPercent = getDeepPercent(report);
        SleepAnalyzeItem sleepAnalyzeItem = new SleepAnalyzeItem();
        int i = 2;
        float[] fArr = {20.0f, 60.0f};
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(0.0f), Float.valueOf(100.0f));
        if (deepPercent >= pair.getFirst().floatValue()) {
            if (deepPercent > pair.getSecond().floatValue()) {
                second = pair.getSecond();
            } else {
                fFloatValue = deepPercent;
            }
            if (fFloatValue < fArr[0]) {
                i = 0;
            } else if (fFloatValue <= fArr[1]) {
                i = 1;
            }
            float fFloatValue2 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
            sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.ae));
            if (deepPercent >= fArr[0] || deepPercent > fArr[1]) {
                string = ExtUtilKt.getString(c0j.uk);
            } else {
                string = ExtUtilKt.getString(c0j.rh);
            }
            sleepAnalyzeItem.setEvaluationCoreStr(string);
            sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.Zd));
            sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
            sleepAnalyzeItem.setSelectPosition(i);
            sleepAnalyzeItem.setSelectPercent(fFloatValue2);
            return sleepAnalyzeItem;
        }
        second = pair.getFirst();
        fFloatValue = second.floatValue();
        if (fFloatValue < fArr[0]) {
            i = 0;
        } else if (fFloatValue <= fArr[1]) {
            i = 1;
        }
        float fFloatValue3 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
        sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.ae));
        if (deepPercent >= fArr[0]) {
            string = ExtUtilKt.getString(c0j.uk);
        } else {
            string = ExtUtilKt.getString(c0j.uk);
        }
        sleepAnalyzeItem.setEvaluationCoreStr(string);
        sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.Zd));
        sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
        sleepAnalyzeItem.setSelectPosition(i);
        sleepAnalyzeItem.setSelectPercent(fFloatValue3);
        return sleepAnalyzeItem;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    private final SleepAnalyzeItem buildRemAnalyzeItem(AllDaySleepReport report) {
        float fFloatValue;
        Float second;
        String string;
        float remPercent = getRemPercent(report);
        SleepAnalyzeItem sleepAnalyzeItem = new SleepAnalyzeItem();
        int i = 2;
        float[] fArr = {10.0f, 30.0f};
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(0.0f), Float.valueOf(100.0f));
        if (remPercent >= pair.getFirst().floatValue()) {
            if (remPercent > pair.getSecond().floatValue()) {
                second = pair.getSecond();
            } else {
                fFloatValue = remPercent;
            }
            if (fFloatValue < fArr[0]) {
                i = 0;
            } else if (fFloatValue <= fArr[1]) {
                i = 1;
            }
            float fFloatValue2 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
            sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.lh));
            if (remPercent >= fArr[0] || remPercent > fArr[1]) {
                string = ExtUtilKt.getString(c0j.vk);
            } else {
                string = ExtUtilKt.getString(c0j.sh);
            }
            sleepAnalyzeItem.setEvaluationCoreStr(string);
            sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.kh));
            sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
            sleepAnalyzeItem.setSelectPosition(i);
            sleepAnalyzeItem.setSelectPercent(fFloatValue2);
            return sleepAnalyzeItem;
        }
        second = pair.getFirst();
        fFloatValue = second.floatValue();
        if (fFloatValue < fArr[0]) {
            i = 0;
        } else if (fFloatValue <= fArr[1]) {
            i = 1;
        }
        float fFloatValue3 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
        sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.lh));
        if (remPercent >= fArr[0]) {
            string = ExtUtilKt.getString(c0j.vk);
        } else {
            string = ExtUtilKt.getString(c0j.vk);
        }
        sleepAnalyzeItem.setEvaluationCoreStr(string);
        sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.kh));
        sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
        sleepAnalyzeItem.setSelectPosition(i);
        sleepAnalyzeItem.setSelectPercent(fFloatValue3);
        return sleepAnalyzeItem;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c9  */
    private final SleepAnalyzeItem buildSleepRegularAnalyzeItem(AllDaySleepReport report, AllDaySleepReport preReport) {
        Object second;
        int i;
        SleepAnalyzeItem sleepAnalyzeItem = new SleepAnalyzeItem();
        sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.gk));
        if (preReport == null) {
            sleepAnalyzeItem.setEvaluationCoreStr("");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s\n%s", Arrays.copyOf(new Object[]{ExtUtilKt.getString(c0j.ph), ExtUtilKt.getString(c0j.hk)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sleepAnalyzeItem.setAnalyzeDetailStr(str);
            sleepAnalyzeItem.setLevelItems(null);
        } else {
            long earliestBedTime = getEarliestBedTime(report) - report.getTime();
            TimeUnit timeUnit = TimeUnit.DAYS;
            float fAbs = Math.abs((((getEarliestBedTime(preReport) - preReport.getTime()) - timeUnit.toSeconds(1L)) - (earliestBedTime - timeUnit.toSeconds(1L))) / 60.0f);
            float[] fArr = {60.0f};
            sleepAnalyzeItem.setEvaluationCoreStr(fAbs < fArr[0] ? ExtUtilKt.getString(c0j.Sf) : ExtUtilKt.getString(c0j.Dh));
            Pair pair = new Pair(Float.valueOf(0.0f), Float.valueOf(180.0f));
            if (fAbs < ((Number) pair.getFirst()).floatValue()) {
                second = pair.getFirst();
            } else {
                if (fAbs > ((Number) pair.getSecond()).floatValue()) {
                    second = pair.getSecond();
                }
                if (fAbs < fArr[0]) {
                    i = 0;
                } else {
                    i = 1;
                }
                float fFloatValue = (fAbs - ((Number) pair.getFirst()).floatValue()) / (((Number) pair.getSecond()).floatValue() - ((Number) pair.getFirst()).floatValue());
                float fFloatValue2 = ((Number) pair.getSecond()).floatValue() - ((Number) pair.getFirst()).floatValue();
                ArrayList arrayList = new ArrayList();
                int[] iArr = SLEEP_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
                arrayList.add(new SleepLevel(iArr[1], (fArr[0] - ((Number) pair.getFirst()).floatValue()) / fFloatValue2));
                arrayList.add(new SleepLevel(iArr[2], (((Number) pair.getSecond()).floatValue() - fArr[0]) / fFloatValue2));
                sleepAnalyzeItem.setLevelItems(arrayList);
                sleepAnalyzeItem.setSelectPosition(i);
                sleepAnalyzeItem.setSelectPercent(fFloatValue);
                sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.hk));
            }
            fAbs = ((Number) second).floatValue();
            if (fAbs < fArr[0]) {
                i = 0;
            } else {
                i = 1;
            }
            float fFloatValue3 = (fAbs - ((Number) pair.getFirst()).floatValue()) / (((Number) pair.getSecond()).floatValue() - ((Number) pair.getFirst()).floatValue());
            float fFloatValue4 = ((Number) pair.getSecond()).floatValue() - ((Number) pair.getFirst()).floatValue();
            ArrayList arrayList2 = new ArrayList();
            int[] iArr2 = SLEEP_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
            arrayList2.add(new SleepLevel(iArr2[1], (fArr[0] - ((Number) pair.getFirst()).floatValue()) / fFloatValue4));
            arrayList2.add(new SleepLevel(iArr2[2], (((Number) pair.getSecond()).floatValue() - fArr[0]) / fFloatValue4));
            sleepAnalyzeItem.setLevelItems(arrayList2);
            sleepAnalyzeItem.setSelectPosition(i);
            sleepAnalyzeItem.setSelectPercent(fFloatValue3);
            sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.hk));
        }
        return sleepAnalyzeItem;
    }

    private final List<SleepLevel> buildThreeSegmentSleepLevelList(float[] range, Pair<Float, Float> minMax) {
        float fFloatValue = minMax.getSecond().floatValue() - minMax.getFirst().floatValue();
        ArrayList arrayList = new ArrayList();
        int[] iArr = SLEEP_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
        arrayList.add(new SleepLevel(iArr[0], (range[0] - minMax.getFirst().floatValue()) / fFloatValue));
        arrayList.add(new SleepLevel(iArr[1], (range[1] - range[0]) / fFloatValue));
        arrayList.add(new SleepLevel(iArr[2], (minMax.getSecond().floatValue() - range[1]) / fFloatValue));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    private final SleepAnalyzeItem buildTotalDurationAnalyzeItem(int totalDuration) {
        float fFloatValue;
        Float second;
        String string;
        int i = 2;
        if (totalDuration <= 0) {
            return null;
        }
        SleepAnalyzeItem sleepAnalyzeItem = new SleepAnalyzeItem();
        float[] fArr = {420.0f, 540.0f};
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(180.0f), Float.valueOf(780.0f));
        sleepAnalyzeItem.setTitleStr(ExtUtilKt.getString(c0j.Xn));
        float f = totalDuration;
        if (f >= pair.getFirst().floatValue()) {
            if (f > pair.getSecond().floatValue()) {
                second = pair.getSecond();
            } else {
                fFloatValue = f;
            }
            if (fFloatValue < fArr[0]) {
                i = 0;
            } else if (fFloatValue <= fArr[1]) {
                i = 1;
            }
            float fFloatValue2 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
            if (f < fArr[0]) {
                string = ExtUtilKt.getString(c0j.eg);
            } else if (f > fArr[1]) {
                string = ExtUtilKt.getString(c0j.Mf);
            } else {
                string = ExtUtilKt.getString(c0j.wk);
            }
            sleepAnalyzeItem.setEvaluationCoreStr(string);
            sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.Ak));
            sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
            sleepAnalyzeItem.setSelectPosition(i);
            sleepAnalyzeItem.setSelectPercent(fFloatValue2);
            return sleepAnalyzeItem;
        }
        second = pair.getFirst();
        fFloatValue = second.floatValue();
        if (fFloatValue < fArr[0]) {
            i = 0;
        } else if (fFloatValue <= fArr[1]) {
            i = 1;
        }
        float fFloatValue3 = (fFloatValue - pair.getFirst().floatValue()) / (pair.getSecond().floatValue() - pair.getFirst().floatValue());
        if (f < fArr[0]) {
            string = ExtUtilKt.getString(c0j.eg);
        } else if (f > fArr[1]) {
            string = ExtUtilKt.getString(c0j.Mf);
        } else {
            string = ExtUtilKt.getString(c0j.wk);
        }
        sleepAnalyzeItem.setEvaluationCoreStr(string);
        sleepAnalyzeItem.setAnalyzeDetailStr(ExtUtilKt.getString(c0j.Ak));
        sleepAnalyzeItem.setLevelItems(buildThreeSegmentSleepLevelList(fArr, pair));
        sleepAnalyzeItem.setSelectPosition(i);
        sleepAnalyzeItem.setSelectPercent(fFloatValue3);
        return sleepAnalyzeItem;
    }

    private final float getDeepPercent(AllDaySleepReport report) {
        List<SleepSegmentReport> sleepSegments = report.getSleepSegments();
        List<SleepSegmentReport> list = sleepSegments;
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        int sleepDuration = 0;
        int deepDuration = 0;
        for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
            if (sleepSegmentReport.getDeepDuration() > 0) {
                sleepDuration += sleepSegmentReport.getSleepDuration();
                deepDuration += sleepSegmentReport.getDeepDuration();
            }
        }
        if (sleepDuration == 0) {
            return 0.0f;
        }
        return (deepDuration / sleepDuration) * 100;
    }

    private final long getEarliestBedTime(AllDaySleepReport report) {
        List<SleepSegmentReport> sleepSegments = report.getSleepSegments();
        List<SleepSegmentReport> list = sleepSegments;
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        long bedTime = 0;
        for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
            if (sleepSegmentReport.getSleepDuration() >= 180) {
                bedTime = bedTime == 0 ? sleepSegmentReport.getBedTime() : Math.min(bedTime, sleepSegmentReport.getBedTime());
            }
        }
        return bedTime;
    }

    private final float getRemPercent(AllDaySleepReport report) {
        List<SleepSegmentReport> sleepSegments = report.getSleepSegments();
        List<SleepSegmentReport> list = sleepSegments;
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        int sleepDuration = 0;
        int iIntValue = 0;
        for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
            if (sleepSegmentReport.getRemDuration() != null) {
                Integer remDuration = sleepSegmentReport.getRemDuration();
                Intrinsics.checkNotNull(remDuration);
                if (remDuration.intValue() > 0) {
                    sleepDuration += sleepSegmentReport.getSleepDuration();
                    Integer remDuration2 = sleepSegmentReport.getRemDuration();
                    Intrinsics.checkNotNull(remDuration2);
                    iIntValue += remDuration2.intValue();
                }
            }
        }
        if (sleepDuration == 0) {
            return 0.0f;
        }
        return (iIntValue / sleepDuration) * 100;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> getSleepLevelList() {
        ArrayList arrayList = new ArrayList();
        int i = iji.r3;
        int[] iArr = SLEEP_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
        arrayList.add(new LevelBarView.LevelItem(iArr[0], i, c0j.jk));
        arrayList.add(new LevelBarView.LevelItem(iArr[1], i, c0j.kk));
        arrayList.add(new LevelBarView.LevelItem(iArr[2], i, c0j.ik));
        return arrayList;
    }

    @NotNull
    public final List<SleepAnalyzeItem> transformSleepAnalyzeList(@NotNull AllDaySleepReport report, @Nullable AllDaySleepReport preReport) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        SleepAnalyzeItem sleepAnalyzeItemBuildTotalDurationAnalyzeItem = buildTotalDurationAnalyzeItem(report.getTotalDuration());
        if (sleepAnalyzeItemBuildTotalDurationAnalyzeItem != null) {
            arrayList.add(sleepAnalyzeItemBuildTotalDurationAnalyzeItem);
        }
        SleepAnalyzeItem sleepAnalyzeItemBuildDeepAnalyzeItem = buildDeepAnalyzeItem(report);
        if (sleepAnalyzeItemBuildDeepAnalyzeItem != null) {
            arrayList.add(sleepAnalyzeItemBuildDeepAnalyzeItem);
        }
        SleepAnalyzeItem sleepAnalyzeItemBuildRemAnalyzeItem = buildRemAnalyzeItem(report);
        if (sleepAnalyzeItemBuildRemAnalyzeItem != null) {
            arrayList.add(sleepAnalyzeItemBuildRemAnalyzeItem);
        }
        SleepAnalyzeItem sleepAnalyzeItemBuildBedTimeAnalyzeItem = buildBedTimeAnalyzeItem(report);
        if (sleepAnalyzeItemBuildBedTimeAnalyzeItem != null) {
            arrayList.add(sleepAnalyzeItemBuildBedTimeAnalyzeItem);
        }
        arrayList.add(buildSleepRegularAnalyzeItem(report, preReport));
        Logger.i(TAG, "transformSleepAnalyzeList " + report.getTime() + " result:" + arrayList);
        return arrayList;
    }
}

package com.xiaomi.fitness.migration.exercise.transformation;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.migration.exercise.transformation.StepItemInserter;
import com.xiaomi.fitness.stand.export.StandDetectExtKt;
import com.xiaomi.fitness.stand.export.StandDetectManager;
import defpackage.b2c;
import defpackage.dg8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/migration/exercise/transformation/StepItemInserter;", "", "", "beginTime", "endTime", "", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "Lcom/xiaomi/fitness/migration/exercise/transformation/FitnessStepItem;", "stepList", "", "insertCalories", "(JJLjava/util/List;)V", "insertValidStand", "", "filterItemsByHour", "(Ljava/util/List;)Ljava/util/Set;", "", "requestPhoneSid", "()Ljava/lang/String;", "Lb2c;", "stepRecordList", "insertStepItemToDB", "(JJLjava/util/List;)Ljava/lang/Long;", "TAG", "Ljava/lang/String;", "", "PAGE_SIZE", "I", "MINUTES_5", "J", "curTZOffsetInSecond$delegate", "Lkotlin/Lazy;", "getCurTZOffsetInSecond", "()I", "curTZOffsetInSecond", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter", "Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl;", "dbWriter$delegate", "getDbWriter", "()Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl;", "dbWriter", "<init>", "()V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStepItemInserter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepItemInserter.kt\ncom/xiaomi/fitness/migration/exercise/transformation/StepItemInserter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1863#2,2:164\n1863#2,2:167\n1863#2,2:169\n1863#2,2:171\n1#3:166\n*S KotlinDebug\n*F\n+ 1 StepItemInserter.kt\ncom/xiaomi/fitness/migration/exercise/transformation/StepItemInserter\n*L\n59#1:164,2\n109#1:167,2\n139#1:169,2\n151#1:171,2\n*E\n"})
public final class StepItemInserter {
    private static final int PAGE_SIZE = 500;

    @NotNull
    private static final String TAG = "StepItemInserter";

    @NotNull
    public static final StepItemInserter INSTANCE = new StepItemInserter();
    private static final long MINUTES_5 = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: curTZOffsetInSecond$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy curTZOffsetInSecond = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oeo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec());
        }
    });

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: peo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StepItemInserter.dbGetter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: dbWriter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dbWriter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qeo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StepItemInserter.dbWriter_delegate$lambda$2();
        }
    });

    private StepItemInserter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$1() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorderImpl dbWriter_delegate$lambda$2() {
        return FitnessDataRecorderImpl.INSTANCE.getInstance();
    }

    private final Set<Long> filterItemsByHour(List<StepItem> stepList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = stepList.iterator();
        while (it.hasNext()) {
            long j = 3600;
            long time = (((StepItem) it.next()).getTime() / j) * j;
            if (!linkedHashSet.contains(Long.valueOf(time))) {
                linkedHashSet.add(Long.valueOf(time));
            }
        }
        return linkedHashSet;
    }

    private final int getCurTZOffsetInSecond() {
        return ((Number) curTZOffsetInSecond.getValue()).intValue();
    }

    private final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) dbGetter.getValue();
    }

    private final FitnessDataRecorderImpl getDbWriter() {
        return (FitnessDataRecorderImpl) dbWriter.getValue();
    }

    private final void insertCalories(long beginTime, long endTime, List<StepItem> stepList) {
        LinkedList linkedList = new LinkedList();
        for (StepItem stepItem : stepList) {
            linkedList.add(new CaloriesItem(stepItem.getTime(), stepItem.getCalories()));
        }
        String strRequestPhoneSid = requestPhoneSid();
        FitnessDataGetter dbGetter2 = getDbGetter();
        long j = 1000;
        long j2 = MINUTES_5;
        Map<String, List<DailyRecordItem>> theDailyItems = dbGetter2.getTheDailyItems(strRequestPhoneSid, (beginTime / j) - j2, (endTime / j) + j2, getCurTZOffsetInSecond(), "calories");
        int i = 1;
        if (!theDailyItems.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<DailyRecordItem> list = theDailyItems.get("calories");
            if (list != null) {
                for (DailyRecordItem dailyRecordItem : list) {
                    Long lValueOf = Long.valueOf(dailyRecordItem.getTimestamp());
                    Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.CaloriesItem");
                    linkedHashMap.put(lValueOf, (CaloriesItem) dailyRecordItem);
                }
            }
            for (CaloriesItem caloriesItem : linkedList) {
                CaloriesItem caloriesItem2 = (CaloriesItem) linkedHashMap.get(Long.valueOf(caloriesItem.getTime()));
                if (caloriesItem2 != null) {
                    caloriesItem.add(caloriesItem2);
                }
            }
        }
        int size = linkedList.size();
        if (size < 500) {
            getDbWriter().recordCalorie(strRequestPhoneSid, getCurTZOffsetInSecond(), linkedList);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(linkedList.get(i2));
            if (i2 >= i * 500) {
                getDbWriter().recordCalorie(strRequestPhoneSid, getCurTZOffsetInSecond(), arrayList);
                arrayList.clear();
                i++;
            }
        }
        getDbWriter().recordCalorie(strRequestPhoneSid, getCurTZOffsetInSecond(), arrayList);
    }

    private final void insertValidStand(long beginTime, long endTime, List<StepItem> stepList) {
        Set<Long> setFilterItemsByHour = filterItemsByHour(stepList);
        FitnessLogUtils.i(TAG, "hour (" + setFilterItemsByHour.size() + ") times");
        Iterator<T> it = setFilterItemsByHour.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            try {
                FitnessLogUtils.i(TAG, "valid stand(" + jLongValue + "-" + StandDetectExtKt.getInstance(StandDetectManager.INSTANCE).checkStandAndRecordIfDone(jLongValue) + ")");
            } catch (Exception e) {
                FitnessLogUtils.i(TAG, "record error data " + jLongValue + " error info " + e);
            }
        }
    }

    private final String requestPhoneSid() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
    }

    @Nullable
    public final Long insertStepItemToDB(long beginTime, long endTime, @NotNull List<? extends b2c> stepRecordList) {
        Intrinsics.checkNotNullParameter(stepRecordList, "stepRecordList");
        Long l = null;
        if (stepRecordList.isEmpty()) {
            return null;
        }
        List<StepItem> listA = dg8.a(stepRecordList);
        String strRequestPhoneSid = requestPhoneSid();
        FitnessDataGetter dbGetter2 = getDbGetter();
        long j = 1000;
        long j2 = MINUTES_5;
        Map<String, List<DailyRecordItem>> theDailyItems = dbGetter2.getTheDailyItems(strRequestPhoneSid, (beginTime / j) - j2, (endTime / j) + j2, getCurTZOffsetInSecond(), "steps");
        int i = 1;
        if (!theDailyItems.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<DailyRecordItem> list = theDailyItems.get("steps");
            if (list != null) {
                for (DailyRecordItem dailyRecordItem : list) {
                    Long lValueOf = Long.valueOf(dailyRecordItem.getTimestamp());
                    Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.StepItem");
                    linkedHashMap.put(lValueOf, (StepItem) dailyRecordItem);
                }
            }
            for (StepItem stepItem : listA) {
                StepItem stepItem2 = (StepItem) linkedHashMap.get(Long.valueOf(stepItem.getTime()));
                if (stepItem2 != null) {
                    stepItem.add(stepItem2);
                }
            }
        }
        try {
            int size = listA.size();
            if (size < 500) {
                FitnessDataRecorderImpl dbWriter2 = getDbWriter();
                int curTZOffsetInSecond2 = getCurTZOffsetInSecond();
                Intrinsics.checkNotNull(listA);
                dbWriter2.recordStep(strRequestPhoneSid, curTZOffsetInSecond2, listA);
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < size; i2++) {
                    StepItem stepItem3 = listA.get(i2);
                    Intrinsics.checkNotNullExpressionValue(stepItem3, "get(...)");
                    arrayList.add(stepItem3);
                    if (i2 >= i * 500) {
                        getDbWriter().recordStep(strRequestPhoneSid, getCurTZOffsetInSecond(), arrayList);
                        arrayList.clear();
                        i++;
                    }
                }
                getDbWriter().recordStep(strRequestPhoneSid, getCurTZOffsetInSecond(), arrayList);
            }
            Intrinsics.checkNotNull(listA);
            insertCalories(beginTime, endTime, listA);
            insertValidStand(beginTime, endTime, listA);
            Iterator<T> it = stepRecordList.iterator();
            if (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((b2c) it.next()).B());
                loop2: while (true) {
                    l = lValueOf2;
                    while (it.hasNext()) {
                        lValueOf2 = Long.valueOf(((b2c) it.next()).B());
                        if (l.compareTo(lValueOf2) < 0) {
                        }
                    }
                    break loop2;
                }
            }
            return l;
        } catch (SQLiteDatabaseLockedException e) {
            Logger.e("DatabaseHandler", "Failed to record data to dataBase " + beginTime + "  " + e);
            return Long.valueOf(beginTime);
        }
    }
}

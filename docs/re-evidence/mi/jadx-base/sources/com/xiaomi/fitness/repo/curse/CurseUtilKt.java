package com.xiaomi.fitness.repo.curse;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthStatus;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e*\b\u0012\u0004\u0012\u00020\f0\u000e\u001a\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0012j\b\u0012\u0004\u0012\u00020\u0011`\u0010*\u00020\f¢\u0006\u0002\u0010\u0013\u001a\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\b\u0012\u0004\u0012\u00020\f0\u000e\u001a\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e*\b\u0012\u0004\u0012\u00020\u00150\u000e\u001a\n\u0010\u0016\u001a\u00020\f*\u00020\u000b\u001a\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u000e\u001a\n\u0010\u000f\u001a\u00020\u0018*\u00020\u0019\u001a\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e*\b\u0012\u0004\u0012\u00020\u00190\u000e\u001a\u001e\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00150\u00150\u000e*\b\u0012\u0004\u0012\u00020\u00190\u000e\u001a\u001a\u0010\u001d\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0001\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"curTZOffset", "", "getCurTZOffset", "()I", "today0TZ", "", "getToday0TZ", "()J", "manualSid", "", "toEntity", "Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordEntity;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "toEntities", "", "toStatus", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;", "Ljava/util/ArrayList;", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;)Ljava/util/ArrayList;", "getDeleteKey", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "toRecord", "toRecords", "Lcom/xiaomi/fitness/repo/curse/CurseTimeItem;", "Lcom/xiaomi/fit/fitness/persist/db/internal/WomenHealthRecordEntity;", "toCurseStatus", "toCurseSymptom", "kotlin.jvm.PlatformType", "copyWith", "newTime", "newStatus", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseUtil.kt\ncom/xiaomi/fitness/repo/curse/CurseUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1557#2:94\n1628#2,3:95\n1368#2:98\n1454#2,5:99\n1557#2:104\n1628#2,3:105\n1557#2:108\n1628#2,3:109\n1557#2:112\n1628#2,3:113\n1557#2:116\n1628#2,3:117\n*S KotlinDebug\n*F\n+ 1 CurseUtil.kt\ncom/xiaomi/fitness/repo/curse/CurseUtilKt\n*L\n35#1:94\n35#1:95,3\n49#1:98\n49#1:99,5\n51#1:104\n51#1:105,3\n60#1:108\n60#1:109,3\n73#1:112\n73#1:113,3\n74#1:116\n74#1:117,3\n*E\n"})
public final class CurseUtilKt {

    @NotNull
    public static final String manualSid = "xiaomiwear_app_manually";

    @NotNull
    public static final CurseTimeItem copyWith(@NotNull CurseTimeItem curseTimeItem, long j, int i) {
        Intrinsics.checkNotNullParameter(curseTimeItem, "<this>");
        return new CurseTimeItem(j, i, curseTimeItem.getUpdateTime(), curseTimeItem.getIsDelete(), curseTimeItem.getIsUpload());
    }

    public static final int getCurTZOffset() {
        return FitnessDateUtils.getCurrentTZOffsetInSec();
    }

    @NotNull
    public static final List<Long> getDeleteKey(@NotNull List<WomenHealthSymptoms> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<WomenHealthSymptoms> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((WomenHealthSymptoms) it.next()).getTime()));
        }
        return arrayList;
    }

    public static final long getToday0TZ() {
        return FitnessDateUtils.changeToDestZeroTimeOneDay(FitnessDateUtils.getTodayZeroTimeInSec(), getCurTZOffset(), 0);
    }

    @NotNull
    public static final List<CurseTimeItem> toCurseStatus(@NotNull List<WomenHealthRecordEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<WomenHealthRecordEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toStatus((WomenHealthRecordEntity) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<WomenHealthSymptoms> toCurseSymptom(@NotNull List<WomenHealthRecordEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<WomenHealthRecordEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (WomenHealthRecordEntity womenHealthRecordEntity : list2) {
            WomenHealthSymptoms womenHealthSymptoms = (WomenHealthSymptoms) FitnessDataSingleModuleKt.getGson().fromJson(womenHealthRecordEntity.getValue(), WomenHealthSymptoms.class);
            womenHealthSymptoms.setTime(FitnessDateUtils.changeToDestZeroTimeOneDay(womenHealthRecordEntity.getTime(), 0, getCurTZOffset()) * ((long) 1000));
            arrayList.add(womenHealthSymptoms);
        }
        return arrayList;
    }

    @NotNull
    public static final List<CurseRecordEntity> toEntities(@NotNull List<Record> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Record> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toEntity((Record) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final CurseRecordEntity toEntity(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j = 1000;
        return new CurseRecordEntity(FitnessDateUtils.changeToDestZeroTimeOneDay(record.getStartMills() / j, currentTZOffsetInSec, 0), FitnessDateUtils.changeToDestZeroTimeOneDay(record.getEndMills() / j, currentTZOffsetInSec, 0), record.getUpdateTime(), record.getInterval(), record.getId());
    }

    @NotNull
    public static final Record toRecord(@NotNull CurseRecordEntity curseRecordEntity) {
        Intrinsics.checkNotNullParameter(curseRecordEntity, "<this>");
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        return new Record(FitnessDateUtils.changeToDestZeroTimeOneDay(curseRecordEntity.getStartSec0TZ(), 0, currentTZOffsetInSec) * 1000, FitnessDateUtils.changeToDestZeroTimeOneDay(curseRecordEntity.getEndSec0TZ(), 0, currentTZOffsetInSec) * 1000, curseRecordEntity.getUpdateTime(), curseRecordEntity.getInterval(), curseRecordEntity.getId());
    }

    @NotNull
    public static final List<Record> toRecords(@NotNull List<CurseRecordEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<CurseRecordEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toRecord((CurseRecordEntity) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList<WomenHealthStatus> toStatus(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        ArrayList<WomenHealthStatus> arrayList = new ArrayList<>();
        long j = 1000;
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(record.getStartMills() / j, getCurTZOffset(), 0);
        long jChangeToDestZeroTimeOneDay2 = FitnessDateUtils.changeToDestZeroTimeOneDay(record.getEndMills() / j, getCurTZOffset(), 0);
        if (jChangeToDestZeroTimeOneDay == jChangeToDestZeroTimeOneDay2) {
            arrayList.add(new WomenHealthStatus(jChangeToDestZeroTimeOneDay, 3, record.getUpdateTime()));
        } else {
            arrayList.add(new WomenHealthStatus(jChangeToDestZeroTimeOneDay, 1, record.getUpdateTime()));
            arrayList.add(new WomenHealthStatus(jChangeToDestZeroTimeOneDay2, 2, record.getUpdateTime()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<WomenHealthStatus> toStatus(@NotNull List<Record> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, toStatus((Record) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final CurseTimeItem toStatus(@NotNull WomenHealthRecordEntity womenHealthRecordEntity) {
        Intrinsics.checkNotNullParameter(womenHealthRecordEntity, "<this>");
        WomenHealthStatus womenHealthStatus = (WomenHealthStatus) FitnessDataSingleModuleKt.getGson().fromJson(womenHealthRecordEntity.getValue(), WomenHealthStatus.class);
        return new CurseTimeItem(womenHealthRecordEntity.getTime(), womenHealthStatus.getStatus(), womenHealthStatus.getUpdateTime(), womenHealthRecordEntity.getIsDeleted(), womenHealthRecordEntity.getIsUpload());
    }
}

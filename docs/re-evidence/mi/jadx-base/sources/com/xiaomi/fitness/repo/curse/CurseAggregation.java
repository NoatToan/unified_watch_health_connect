package com.xiaomi.fitness.repo.curse;

import com.xiaomi.fitness.aggregation.health.entity.CurseRecordEntity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/curse/CurseAggregation;", "", "<init>", "()V", "convertPointToSegmentRecord", "", "Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordEntity;", "pointList", "Lcom/xiaomi/fitness/repo/curse/CurseTimeItem;", "buildRecordByFilterPoints", "getPointListHasUpdateStatus", "", "buildRecordAddEndPoint", "startItem", "mensesDays", "commonAggregationSegmentRecords", "segmentRecords", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseAggregation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseAggregation.kt\ncom/xiaomi/fitness/repo/curse/CurseAggregation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,304:1\n1053#2:305\n1872#2,3:306\n774#2:309\n865#2,2:310\n1053#2:312\n774#2:313\n865#2,2:314\n1053#2:316\n1863#2,2:317\n1053#2:319\n*S KotlinDebug\n*F\n+ 1 CurseAggregation.kt\ncom/xiaomi/fitness/repo/curse/CurseAggregation\n*L\n36#1:305\n47#1:306,3\n164#1:309\n164#1:310,2\n164#1:312\n166#1:313\n166#1:314,2\n166#1:316\n188#1:317,2\n225#1:319\n*E\n"})
public final class CurseAggregation {
    private static final int ABNORMAL_NEED_DEAL_INTERVAL = 15;
    private static final long DAY_IN_SEC = 86400;
    private static final long INVALID = -1;
    private static final long MIN_SPACE_SEC = 432000;

    @NotNull
    public static final String TAG = "CurseAggregation";

    private final CurseRecordEntity buildRecordAddEndPoint(CurseTimeItem startItem, int mensesDays) {
        return new CurseRecordEntity(startItem.getTime(), startItem.getTime() + TimeUnit.DAYS.toSeconds(mensesDays), startItem.getUpdateTime(), -1, 0, 16, null);
    }

    private final CurseRecordEntity buildRecordByFilterPoints(List<CurseTimeItem> pointList) {
        Logger.i(TAG, "buildRecordByFilterPoints before " + pointList);
        List<CurseTimeItem> list = pointList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CurseTimeItem) obj).getStatus() == 1) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.repo.curse.CurseAggregation$buildRecordByFilterPoints$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CurseTimeItem) t).getUpdateTime()), Long.valueOf(((CurseTimeItem) t2).getUpdateTime()));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((CurseTimeItem) obj2).getStatus() == 2) {
                arrayList2.add(obj2);
            }
        }
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.fitness.repo.curse.CurseAggregation$buildRecordByFilterPoints$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CurseTimeItem) t).getUpdateTime()), Long.valueOf(((CurseTimeItem) t2).getUpdateTime()));
            }
        });
        CurseRecordEntity curseRecordEntity = getPointListHasUpdateStatus(pointList) == 2 ? new CurseRecordEntity(((CurseTimeItem) CollectionsKt___CollectionsKt.last(listSortedWith)).getTime(), ((CurseTimeItem) CollectionsKt___CollectionsKt.last(listSortedWith2)).getTime(), Math.max(((CurseTimeItem) CollectionsKt___CollectionsKt.last(listSortedWith)).getUpdateTime(), ((CurseTimeItem) CollectionsKt___CollectionsKt.last(listSortedWith2)).getUpdateTime()), -1, 0, 16, null) : new CurseRecordEntity(((CurseTimeItem) CollectionsKt___CollectionsKt.first((List) pointList)).getTime(), ((CurseTimeItem) CollectionsKt___CollectionsKt.last((List) pointList)).getTime(), Math.max(((CurseTimeItem) CollectionsKt___CollectionsKt.last(listSortedWith)).getUpdateTime(), ((CurseTimeItem) CollectionsKt___CollectionsKt.last(listSortedWith2)).getUpdateTime()), -1, 0, 16, null);
        Logger.i(TAG, "buildRecordByFilterPoints result " + curseRecordEntity);
        return curseRecordEntity;
    }

    private final int getPointListHasUpdateStatus(List<CurseTimeItem> pointList) {
        Iterator<T> it = pointList.iterator();
        Boolean boolValueOf = null;
        while (true) {
            if (!it.hasNext()) {
                return (boolValueOf == null || !boolValueOf.booleanValue()) ? 0 : 2;
            }
            boolean z = ((CurseTimeItem) it.next()).getUpdateTime() > 0;
            if (boolValueOf != null && ((boolValueOf.booleanValue() && !z) || (!boolValueOf.booleanValue() && z))) {
                return 1;
            }
            boolValueOf = Boolean.valueOf(z);
        }
    }

    @NotNull
    public final List<CurseRecordEntity> commonAggregationSegmentRecords(@NotNull List<CurseRecordEntity> segmentRecords) {
        Intrinsics.checkNotNullParameter(segmentRecords, "segmentRecords");
        if (segmentRecords.size() < 2) {
            return segmentRecords;
        }
        ArrayList arrayList = new ArrayList();
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(segmentRecords, new Comparator() { // from class: com.xiaomi.fitness.repo.curse.CurseAggregation$commonAggregationSegmentRecords$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CurseRecordEntity) t).getStartSec0TZ()), Long.valueOf(((CurseRecordEntity) t2).getStartSec0TZ()));
            }
        });
        int size = listSortedWith.size();
        for (int i = 0; i < size; i++) {
            CurseRecordEntity curseRecordEntity = (CurseRecordEntity) listSortedWith.get(i);
            if (i == 0) {
                arrayList.add(curseRecordEntity);
            } else {
                CurseRecordEntity curseRecordEntity2 = (CurseRecordEntity) CollectionsKt___CollectionsKt.last((List) arrayList);
                boolean z = curseRecordEntity2.getStartSec0TZ() < curseRecordEntity.getStartSec0TZ() && curseRecordEntity2.getEndSec0TZ() < curseRecordEntity.getStartSec0TZ();
                if (z && curseRecordEntity.getStartSec0TZ() - curseRecordEntity2.getEndSec0TZ() < MIN_SPACE_SEC) {
                    curseRecordEntity2.setEndSec0TZ(curseRecordEntity.getEndSec0TZ());
                    curseRecordEntity2.setUpdateTime(Math.max(curseRecordEntity2.getUpdateTime(), curseRecordEntity.getUpdateTime()));
                    curseRecordEntity2.setInterval(-1);
                } else if (z) {
                    arrayList.add(curseRecordEntity);
                    curseRecordEntity2.setInterval((int) ((curseRecordEntity.getStartSec0TZ() - curseRecordEntity2.getStartSec0TZ()) / 86400));
                } else {
                    boolean z2 = curseRecordEntity2.getUpdateTime() > 0;
                    boolean z3 = curseRecordEntity.getUpdateTime() > 0;
                    if (z2 && z3) {
                        if (Boolean.compare(z3, z2) > 0) {
                            arrayList.removeLast();
                            arrayList.add(curseRecordEntity);
                        }
                    } else if (!z3 && !z2) {
                        arrayList.removeLast();
                        arrayList.add(new CurseRecordEntity(Math.min(curseRecordEntity2.getStartSec0TZ(), curseRecordEntity.getStartSec0TZ()), Math.max(curseRecordEntity2.getEndSec0TZ(), curseRecordEntity.getEndSec0TZ()), 0L, -1, 0, 16, null));
                    } else if (z3) {
                        arrayList.removeLast();
                        arrayList.add(curseRecordEntity);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    @NotNull
    public final List<CurseRecordEntity> convertPointToSegmentRecord(@NotNull List<CurseTimeItem> pointList) {
        int i;
        long j;
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(pointList, new Comparator() { // from class: com.xiaomi.fitness.repo.curse.CurseAggregation$convertPointToSegmentRecord$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CurseTimeItem) t).getTime()), Long.valueOf(((CurseTimeItem) t2).getTime()));
            }
        });
        if (listSortedWith.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", "curse").valueToObject(CurseSetting.class);
        CurseSetting curseSetting = objValueToObject instanceof CurseSetting ? (CurseSetting) objValueToObject : null;
        int estimatedMenstrualDays = curseSetting != null ? curseSetting.getEstimatedMenstrualDays() : 5;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        long time = -1;
        for (Object obj : listSortedWith) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CurseTimeItem curseTimeItem = (CurseTimeItem) obj;
            int status = curseTimeItem.getStatus();
            List list = listSortedWith;
            int i4 = i2 - 1;
            CurseTimeItem curseTimeItem2 = (i4 < 0 || i4 >= list.size()) ? null : (CurseTimeItem) listSortedWith.get(i4);
            CurseTimeItem curseTimeItem3 = (i3 < 0 || i3 >= list.size()) ? null : (CurseTimeItem) listSortedWith.get(i3);
            if (status != 1) {
                if (status != 2) {
                    if (status == 3) {
                        if (time == -1) {
                            arrayList.add(new CurseRecordEntity(curseTimeItem.getTime(), curseTimeItem.getTime(), curseTimeItem.getUpdateTime(), -1, 0, 16, null));
                        } else {
                            arrayList2.clear();
                        }
                    }
                    j = time;
                    i = i3;
                } else if (time != -1) {
                    arrayList2.add(curseTimeItem);
                    if (curseTimeItem3 == null || curseTimeItem3.getStatus() != 2) {
                        arrayList.add(buildRecordByFilterPoints(CollectionsKt___CollectionsKt.toList(arrayList2)));
                        arrayList2.clear();
                    }
                } else if (curseTimeItem2 != null) {
                    long j2 = 1000;
                    if (TimeDateUtil.getIntervalDay(curseTimeItem2.getTime() * j2, j2 * curseTimeItem.getTime()) > 15) {
                        if ((!arrayList2.isEmpty()) && arrayList2.size() > 1) {
                            arrayList.add(buildRecordByFilterPoints(CollectionsKt___CollectionsKt.toList(arrayList2)));
                        }
                        arrayList2.clear();
                        arrayList.add(new CurseRecordEntity(curseTimeItem.getTime() - TimeUnit.DAYS.toSeconds(estimatedMenstrualDays), curseTimeItem.getTime(), curseTimeItem.getUpdateTime(), -1, 0, 16, null));
                    } else {
                        arrayList2.add(curseTimeItem);
                        if (curseTimeItem3 == null || curseTimeItem3.getStatus() != 2) {
                            arrayList.add(buildRecordByFilterPoints(CollectionsKt___CollectionsKt.toList(arrayList2)));
                            arrayList2.clear();
                        }
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(buildRecordByFilterPoints(CollectionsKt___CollectionsKt.toList(arrayList2)));
                    }
                    arrayList2.clear();
                    arrayList.add(new CurseRecordEntity(curseTimeItem.getTime() - TimeUnit.DAYS.toSeconds(estimatedMenstrualDays), curseTimeItem.getTime(), curseTimeItem.getUpdateTime(), -1, 0, 16, null));
                }
                i = i3;
                j = -1;
            } else {
                if (time == -1) {
                    if (curseTimeItem3 == null) {
                        arrayList.add(buildRecordAddEndPoint(curseTimeItem, estimatedMenstrualDays));
                    } else {
                        time = curseTimeItem.getTime();
                        arrayList2.add(curseTimeItem);
                    }
                    time = time;
                    i = i3;
                } else {
                    if (curseTimeItem2 != null) {
                        long j3 = 1000;
                        if (TimeDateUtil.getIntervalDay(curseTimeItem2.getTime() * j3, j3 * curseTimeItem.getTime()) > 15) {
                            i = i3;
                            arrayList2.add(CurseUtilKt.copyWith(curseTimeItem2, curseTimeItem2.getTime() + TimeUnit.DAYS.toSeconds(estimatedMenstrualDays), 2));
                            arrayList.add(buildRecordByFilterPoints(CollectionsKt___CollectionsKt.toList(arrayList2)));
                            arrayList2.clear();
                            if (curseTimeItem3 == null) {
                                arrayList.add(buildRecordAddEndPoint(curseTimeItem, estimatedMenstrualDays));
                                time = -1;
                            } else {
                                long time2 = curseTimeItem.getTime();
                                arrayList2.add(curseTimeItem);
                                time = time2;
                            }
                        }
                    }
                    i = i3;
                    arrayList2.add(curseTimeItem);
                }
                j = time;
            }
            i2 = i;
            time = j;
        }
        return arrayList;
    }
}

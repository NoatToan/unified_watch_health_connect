package com.xiaomi.fitness.repo;

import com.google.gson.Gson;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.IPointTimeData;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fitness.aggregation.health.dao.TimeZoneUtil;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00180\u00182\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0018H\u0004JC\u0010\u001d\u001a\u00028\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00192\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0018H&¢\u0006\u0002\u0010\"J:\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0018H\u0016J\u0016\u0010%\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001aJ\u0016\u0010)\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001aJ\u0016\u0010*\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001aJ\u0016\u0010+\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001aJ\u0016\u0010,\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001aJ\u0016\u0010-\u001a\u00020&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001aJL\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H/0\u001a0\u0018\"\b\b\u0001\u0010/*\u00020\u001b2\u0006\u00100\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u00010\u001a2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u000103JL\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H/0\u001a0\u0018\"\b\b\u0001\u0010/*\u00020\u001b2\u0006\u00100\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u00010\u001a2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u000103JL\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H/0\u001a0\u0018\"\b\b\u0001\u0010/*\u00020\u001b2\u0006\u00100\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u00010\u001a2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u000103JL\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H/0\u001a0\u0018\"\b\b\u0001\u0010/*\u00020\u001b2\u0006\u00100\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u00010\u001a2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u000103JT\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H/0\u001a0\u0018\"\b\b\u0001\u0010/*\u00020\u001b2\u0006\u00100\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u00010\u001a2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u000103J2\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H/0\u001a0\u0018\"\b\b\u0001\u0010/*\u00020\u001b2\u000e\u00101\u001a\n\u0012\u0004\u0012\u0002H/\u0018\u00010\u001aJv\u0010:\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00180;2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00182\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020>0=2 \b\u0002\u0010?\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010@H\u0004J'\u0010A\u001a\u00028\u00002\u0006\u0010B\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0002\u0010ER\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0012\u001a\u00020\u00138DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Report", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "calendar$delegate", "Lkotlin/Lazy;", "calendarZero", "getCalendarZero", "calendarZero$delegate", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "summaryByDay", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "entityMap", "splitDailyReport", "sid", CloudContract.COL_VIEW_TAG, "timestamp", "itemMap", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)Ljava/lang/Object;", "splitDailyReports", "recordMap", "getAvgPrimaryValue", "", "list", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "getAvgSecondaryValue", "getMaxPrimaryValue", "getMaxSecondaryValue", "getMinPrimaryValue", "getMinSecondaryValue", "groupByMinute", "T", "beginDayInSecond", "itemList", "distinct", "Lcom/xiaomi/fitness/repo/IDistinctListener;", "groupByHour", "groupByHalfHour", "groupByDay", "groupDataByGap", "gap", "groupByMonth", "spiltRecordList", "Lkotlin/Pair;", "validate", "Lkotlin/Function1;", "", "selector", "Lkotlin/Function2;", "convertServerAggregateReport", "time", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "(JLjava/lang/String;Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseProcessBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseProcessBiz.kt\ncom/xiaomi/fitness/repo/BaseProcessBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,285:1\n216#2,2:286\n216#2,2:291\n1#3:288\n1863#4,2:289\n*S KotlinDebug\n*F\n+ 1 BaseProcessBiz.kt\ncom/xiaomi/fitness/repo/BaseProcessBiz\n*L\n87#1:286,2\n245#1:291,2\n220#1:289,2\n*E\n"})
public abstract class BaseProcessBiz<Report> {

    @NotNull
    private final String TAG = "DataBiz";

    /* JADX INFO: renamed from: calendar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy calendar = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: aa2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Calendar.getInstance();
        }
    });

    /* JADX INFO: renamed from: calendarZero$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy calendarZero = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ba2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Calendar.getInstance();
        }
    });

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ca2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseProcessBiz.gson_delegate$lambda$2();
        }
    });

    public BaseProcessBiz() {
        getCalendarZero().setTimeZone(TimeZoneUtil.INSTANCE.getTimeZone(0));
    }

    public static /* synthetic */ Map groupByDay$default(BaseProcessBiz baseProcessBiz, long j, List list, IDistinctListener iDistinctListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupByDay");
        }
        if ((i & 4) != 0) {
            iDistinctListener = null;
        }
        return baseProcessBiz.groupByDay(j, list, iDistinctListener);
    }

    public static /* synthetic */ Map groupByHalfHour$default(BaseProcessBiz baseProcessBiz, long j, List list, IDistinctListener iDistinctListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupByHalfHour");
        }
        if ((i & 4) != 0) {
            iDistinctListener = null;
        }
        return baseProcessBiz.groupByHalfHour(j, list, iDistinctListener);
    }

    public static /* synthetic */ Map groupByHour$default(BaseProcessBiz baseProcessBiz, long j, List list, IDistinctListener iDistinctListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupByHour");
        }
        if ((i & 4) != 0) {
            iDistinctListener = null;
        }
        return baseProcessBiz.groupByHour(j, list, iDistinctListener);
    }

    public static /* synthetic */ Map groupByMinute$default(BaseProcessBiz baseProcessBiz, long j, List list, IDistinctListener iDistinctListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupByMinute");
        }
        if ((i & 4) != 0) {
            iDistinctListener = null;
        }
        return baseProcessBiz.groupByMinute(j, list, iDistinctListener);
    }

    public static /* synthetic */ Map groupDataByGap$default(BaseProcessBiz baseProcessBiz, long j, long j2, List list, IDistinctListener iDistinctListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupDataByGap");
        }
        if ((i & 8) != 0) {
            iDistinctListener = null;
        }
        return baseProcessBiz.groupDataByGap(j, j2, list, iDistinctListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$2() {
        return new Gson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair spiltRecordList$default(BaseProcessBiz baseProcessBiz, Map map, Function1 function1, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: spiltRecordList");
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        return baseProcessBiz.spiltRecordList(map, function1, function2);
    }

    public static /* synthetic */ Object splitDailyReport$default(BaseProcessBiz baseProcessBiz, String str, String str2, long j, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: splitDailyReport");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return baseProcessBiz.splitDailyReport(str, str2, j, map);
    }

    public Report convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final int getAvgPrimaryValue(@Nullable List<? extends IPointTimeData> list) {
        List<? extends IPointTimeData> list2 = list;
        int iIntValue = 0;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            iIntValue += ((IPointTimeData) it.next()).getPrimaryValue().intValue();
        }
        return iIntValue / list.size();
    }

    public final int getAvgSecondaryValue(@Nullable List<? extends IPointTimeData> list) {
        List<? extends IPointTimeData> list2 = list;
        int iIntValue = 0;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            iIntValue += ((IPointTimeData) it.next()).getSecondaryValue().intValue();
        }
        return iIntValue / list.size();
    }

    @NotNull
    public final Calendar getCalendar() {
        Object value = this.calendar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    @NotNull
    public final Calendar getCalendarZero() {
        Object value = this.calendarZero.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    @NotNull
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    public final int getMaxPrimaryValue(@Nullable List<? extends IPointTimeData> list) {
        List<? extends IPointTimeData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((IPointTimeData) it.next()).getPrimaryValue().intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((IPointTimeData) it.next()).getPrimaryValue().intValue();
            if (iIntValue < iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        return iIntValue;
    }

    public final int getMaxSecondaryValue(@Nullable List<? extends IPointTimeData> list) {
        List<? extends IPointTimeData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((IPointTimeData) it.next()).getSecondaryValue().intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((IPointTimeData) it.next()).getSecondaryValue().intValue();
            if (iIntValue < iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        return iIntValue;
    }

    public final int getMinPrimaryValue(@Nullable List<? extends IPointTimeData> list) {
        List<? extends IPointTimeData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((IPointTimeData) it.next()).getPrimaryValue().intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((IPointTimeData) it.next()).getPrimaryValue().intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        return iIntValue;
    }

    public final int getMinSecondaryValue(@Nullable List<? extends IPointTimeData> list) {
        List<? extends IPointTimeData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((IPointTimeData) it.next()).getSecondaryValue().intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((IPointTimeData) it.next()).getSecondaryValue().intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        return iIntValue;
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final <T extends DailyRecordItem> Map<Long, List<T>> groupByDay(long beginDayInSecond, @Nullable List<? extends T> itemList, @Nullable IDistinctListener<T> distinct) {
        return groupDataByGap(beginDayInSecond, 86400L, itemList, distinct);
    }

    @NotNull
    public final <T extends DailyRecordItem> Map<Long, List<T>> groupByHalfHour(long beginDayInSecond, @Nullable List<? extends T> itemList, @Nullable IDistinctListener<T> distinct) {
        return groupDataByGap(beginDayInSecond, RepositoryManager.GAP_X_MINUTE, itemList, distinct);
    }

    @NotNull
    public final <T extends DailyRecordItem> Map<Long, List<T>> groupByHour(long beginDayInSecond, @Nullable List<? extends T> itemList, @Nullable IDistinctListener<T> distinct) {
        return groupDataByGap(beginDayInSecond, TimeDateUtil.TIME_HOUR, itemList, distinct);
    }

    @NotNull
    public final <T extends DailyRecordItem> Map<Long, List<T>> groupByMinute(long beginDayInSecond, @Nullable List<? extends T> itemList, @Nullable IDistinctListener<T> distinct) {
        return groupDataByGap(beginDayInSecond, 60L, itemList, distinct);
    }

    @NotNull
    public final <T extends DailyRecordItem> Map<Long, List<T>> groupByMonth(@Nullable List<? extends T> itemList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (itemList != null) {
            Iterator<T> it = itemList.iterator();
            while (it.hasNext()) {
                DailyRecordItem dailyRecordItem = (DailyRecordItem) it.next();
                long j = 1000;
                getCalendar().setTimeInMillis(dailyRecordItem.getTimestamp() * j);
                getCalendar().set(5, 1);
                TimeUtils.setToZeroOClock(getCalendar());
                long timeInMillis = getCalendar().getTimeInMillis() / j;
                List arrayList = (List) linkedHashMap.get(Long.valueOf(timeInMillis));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(Long.valueOf(timeInMillis), arrayList);
                }
                ListExtKt.add(arrayList, dailyRecordItem);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final <T extends DailyRecordItem> Map<Long, List<T>> groupDataByGap(long beginDayInSecond, long gap, @Nullable List<? extends T> itemList, @Nullable IDistinctListener<T> distinct) {
        List<? extends T> list = itemList;
        if (list == null || list.isEmpty()) {
            Map<Long, List<T>> mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "emptyMap(...)");
            return mapEmptyMap;
        }
        HashMap map = new HashMap();
        Map<Long, T> linkedHashMap = new LinkedHashMap<>();
        ArrayList<DailyRecordItem> arrayList = new ArrayList();
        if (distinct != null) {
            Iterator<? extends T> it = itemList.iterator();
            while (it.hasNext()) {
                distinct.distinct(linkedHashMap, it.next());
            }
            arrayList.addAll(linkedHashMap.values());
            linkedHashMap.clear();
        } else {
            arrayList.addAll(list);
        }
        for (DailyRecordItem dailyRecordItem : arrayList) {
            long timestamp = dailyRecordItem.getTimestamp();
            if (timestamp >= beginDayInSecond) {
                long j = (((timestamp - beginDayInSecond) / gap) * gap) + beginDayInSecond;
                List arrayList2 = (List) map.get(Long.valueOf(j));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Long.valueOf(j), arrayList2);
                }
                arrayList2.add(dailyRecordItem);
            }
        }
        return map;
    }

    @NotNull
    public final Pair<String, Map<String, List<DailyRecordItem>>> spiltRecordList(@NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap, @NotNull Function1<? super DailyRecordItem, Boolean> validate, @Nullable Function2<? super DailyRecordItem, ? super DailyRecordItem, ? extends DailyRecordItem> selector) {
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        Intrinsics.checkNotNullParameter(validate, "validate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it = itemMap.entrySet().iterator();
        long timestamp = Long.MIN_VALUE;
        String sid = "Default";
        while (it.hasNext()) {
            List<? extends DailyRecordItem> value = it.next().getValue();
            List<? extends DailyRecordItem> list = value;
            if (list != null && !list.isEmpty()) {
                DailyRecordItem dailyRecordItemInvoke = null;
                for (DailyRecordItem dailyRecordItem : value) {
                    String sid2 = dailyRecordItem.getSid();
                    if (sid2 != null && sid2.length() != 0) {
                        List arrayList = (List) linkedHashMap.get(sid2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(sid2, arrayList);
                        }
                        if (validate.invoke2(dailyRecordItem).booleanValue()) {
                            ListExtKt.add(arrayList, dailyRecordItem);
                            if (timestamp <= dailyRecordItem.getTimestamp()) {
                                timestamp = dailyRecordItem.getTimestamp();
                                if (selector != null) {
                                    dailyRecordItemInvoke = selector.invoke(dailyRecordItem, dailyRecordItemInvoke);
                                    Intrinsics.checkNotNull(dailyRecordItemInvoke);
                                    sid = dailyRecordItemInvoke.getSid();
                                    Intrinsics.checkNotNull(sid);
                                } else {
                                    sid = sid2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return new Pair<>(sid, linkedHashMap);
    }

    public abstract Report splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap);

    @NotNull
    public List<Report> splitDailyReports(@Nullable String sid, @NotNull String viewTag, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> recordMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(recordMap, "recordMap");
        Map<Long, Map<String, List<DailyRecordItem>>> mapSummaryByDay = summaryByDay(recordMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, Map<String, List<DailyRecordItem>>> entry : mapSummaryByDay.entrySet()) {
            arrayList.add(splitDailyReport(sid, viewTag, entry.getKey().longValue(), entry.getValue()));
        }
        return arrayList;
    }

    @NotNull
    public final Map<Long, Map<String, List<DailyRecordItem>>> summaryByDay(@NotNull Map<String, ? extends List<? extends DailyRecordItem>> entityMap) {
        Intrinsics.checkNotNullParameter(entityMap, "entityMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Calendar calendarZero = getCalendarZero();
        for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : entityMap.entrySet()) {
            String key = entry.getKey();
            for (DailyRecordItem dailyRecordItem : entry.getValue()) {
                long j = 1000;
                calendarZero.setTimeInMillis(dailyRecordItem.getTimestamp() * j);
                TimeUtils.setToZeroOClock(calendarZero);
                long timeInMillis = calendarZero.getTimeInMillis() / j;
                Map linkedHashMap2 = (Map) linkedHashMap.get(Long.valueOf(timeInMillis));
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(Long.valueOf(timeInMillis), linkedHashMap2);
                }
                List arrayList = (List) linkedHashMap2.get(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(key, arrayList);
                }
                arrayList.add(dailyRecordItem);
            }
        }
        return linkedHashMap;
    }
}

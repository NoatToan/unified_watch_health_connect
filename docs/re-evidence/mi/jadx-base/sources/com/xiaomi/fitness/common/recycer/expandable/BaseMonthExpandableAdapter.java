package com.xiaomi.fitness.common.recycer.expandable;

import android.annotation.SuppressLint;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableItem;
import defpackage.c0j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J \u0010\u001a\u001a\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u001cJ-\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010!J\u001d\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\u0014H\u0002J$\u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u0014H\u0002J\u001d\u0010*\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\n2\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010#J\u001d\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\nH&¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u0017J\u0006\u00100\u001a\u00020\u0017J\u0016\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020\u00172\u0006\u00102\u001a\u000203J\b\u00107\u001a\u00020\u0017H\u0007R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "W", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "D", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter;", "<init>", "()V", "originDataMap", "", "", "", "getOriginDataMap", "()Ljava/util/Map;", "adapterDataList", "", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;", "getAdapterDataList", "()Ljava/util/List;", "expandStatusMapCache", "", "checkAttachBottomCallback", "Lkotlin/Function0;", "", "setCheckAttachBottomCallback", "callback", "bindOriginDataMap", "map", "", "dealCurrentWithLastItem", "recordMonthStartTimeMillis", "lastRecord", "curDailyItem", "(JLcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "appendHeaderAndNormalIfNeed", "(JLcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getExpandStatusCacheIfNeed", "monthTimeMillis", "defaultStatus", "appendNewHeader", "expandStatus", "showArrow", "appendNormalItem", "originItem", "convertDailyRecordItemToWrapper", "item", "(Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;J)Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "clearData", "clearExpandCacheFocus", "dealExpandAction", "headerItem", "Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "position", "", "dealFoldAction", "refresh", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseMonthExpandableAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMonthExpandableAdapter.kt\ncom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n216#2:173\n217#2:176\n1863#3,2:174\n1557#3:177\n1628#3,3:178\n*S KotlinDebug\n*F\n+ 1 BaseMonthExpandableAdapter.kt\ncom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter\n*L\n33#1:173\n33#1:176\n37#1:174,2\n142#1:177\n142#1:178,3\n*E\n"})
public abstract class BaseMonthExpandableAdapter<W extends ExpandableBaseDataItem, D extends DailyRecordItem> extends BaseExpandableAdapter<W> {

    @NotNull
    private final Map<Long, List<D>> originDataMap = new LinkedHashMap();

    @NotNull
    private final List<ExpandableItem<W>> adapterDataList = new ArrayList();

    @NotNull
    private final Map<Long, Boolean> expandStatusMapCache = new LinkedHashMap();

    @NotNull
    private Function0<Unit> checkAttachBottomCallback = new Function0() { // from class: k92
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    private final void appendHeaderAndNormalIfNeed(long recordMonthStartTimeMillis, D curDailyItem) {
        boolean expandStatusCacheIfNeed$default = getExpandStatusCacheIfNeed$default(this, recordMonthStartTimeMillis, false, 2, null);
        appendNewHeader$default(this, recordMonthStartTimeMillis, expandStatusCacheIfNeed$default, false, 4, null);
        if (expandStatusCacheIfNeed$default) {
            appendNormalItem(recordMonthStartTimeMillis, curDailyItem);
        }
    }

    private final void appendNewHeader(long monthTimeMillis, boolean expandStatus, boolean showArrow) {
        ExpandableItem<W> expandableItem = new ExpandableItem<>();
        expandableItem.setHeadItem(new HeaderItem(expandStatus, monthTimeMillis, ResourceExtKt.getString(c0j.f4799k), showArrow));
        this.adapterDataList.add(expandableItem);
        this.expandStatusMapCache.put(Long.valueOf(monthTimeMillis), Boolean.valueOf(expandStatus));
    }

    public static /* synthetic */ void appendNewHeader$default(BaseMonthExpandableAdapter baseMonthExpandableAdapter, long j, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendNewHeader");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        baseMonthExpandableAdapter.appendNewHeader(j, z, z2);
    }

    private final void appendNormalItem(long monthTimeMillis, D originItem) {
        this.adapterDataList.add(new ExpandableItem().setItemData(convertDailyRecordItemToWrapper(originItem, monthTimeMillis)));
    }

    private final void dealCurrentWithLastItem(long recordMonthStartTimeMillis, ExpandableItem<W> lastRecord, D curDailyItem) {
        if (lastRecord == null) {
            appendHeaderAndNormalIfNeed(recordMonthStartTimeMillis, curDailyItem);
            return;
        }
        if (lastRecord.getHeadItem() == null) {
            ExpandableBaseDataItem itemDetail = lastRecord.getItemDetail();
            Intrinsics.checkNotNull(itemDetail);
            if (itemDetail.getGroupTimestampMillis() == recordMonthStartTimeMillis) {
                appendNormalItem(recordMonthStartTimeMillis, curDailyItem);
                return;
            } else {
                appendHeaderAndNormalIfNeed(recordMonthStartTimeMillis, curDailyItem);
                return;
            }
        }
        HeaderItem headItem = lastRecord.getHeadItem();
        if (headItem == null || headItem.getHeaderTimeMillis() != recordMonthStartTimeMillis) {
            appendHeaderAndNormalIfNeed(recordMonthStartTimeMillis, curDailyItem);
            return;
        }
        HeaderItem headItem2 = lastRecord.getHeadItem();
        Intrinsics.checkNotNull(headItem2);
        if (headItem2.getExpandStatus()) {
            appendNormalItem(recordMonthStartTimeMillis, curDailyItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dealFoldAction$lambda$4(HeaderItem headerItem, ExpandableItem curtDataItem) {
        Intrinsics.checkNotNullParameter(headerItem, "$headerItem");
        Intrinsics.checkNotNullParameter(curtDataItem, "curtDataItem");
        ExpandableBaseDataItem itemDetail = curtDataItem.getItemDetail();
        Long lValueOf = itemDetail != null ? Long.valueOf(itemDetail.getGroupTimestampMillis()) : null;
        if (lValueOf == null) {
            return false;
        }
        return lValueOf.longValue() == headerItem.getHeaderTimeMillis();
    }

    private final boolean getExpandStatusCacheIfNeed(long monthTimeMillis, boolean defaultStatus) {
        Boolean bool = this.expandStatusMapCache.get(Long.valueOf(monthTimeMillis));
        return bool != null ? bool.booleanValue() : defaultStatus;
    }

    public static /* synthetic */ boolean getExpandStatusCacheIfNeed$default(BaseMonthExpandableAdapter baseMonthExpandableAdapter, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExpandStatusCacheIfNeed");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return baseMonthExpandableAdapter.getExpandStatusCacheIfNeed(j, z);
    }

    public final void bindOriginDataMap(@NotNull Map<Long, ? extends List<? extends D>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<Long, ? extends List<? extends D>> entry : map.entrySet()) {
            List<? extends D> value = entry.getValue();
            if (value.isEmpty()) {
                return;
            }
            long jLongValue = entry.getKey().longValue() * ((long) 1000);
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                dealCurrentWithLastItem(jLongValue, (ExpandableItem) CollectionsKt___CollectionsKt.lastOrNull((List) this.adapterDataList), (DailyRecordItem) it.next());
            }
            if (this.originDataMap.containsKey(Long.valueOf(jLongValue))) {
                List<D> list = this.originDataMap.get(Long.valueOf(jLongValue));
                Intrinsics.checkNotNull(list);
                ListExtKt.addAll(list, value);
            } else {
                this.originDataMap.put(Long.valueOf(jLongValue), value);
            }
        }
    }

    public final void clearData() {
        this.adapterDataList.clear();
        this.originDataMap.clear();
    }

    public final void clearExpandCacheFocus() {
        this.expandStatusMapCache.clear();
    }

    @NotNull
    public abstract W convertDailyRecordItemToWrapper(@NotNull D item, long monthTimeMillis);

    public final void dealExpandAction(@NotNull HeaderItem headerItem, int position) {
        Intrinsics.checkNotNullParameter(headerItem, "headerItem");
        headerItem.setExpandStatus(true);
        this.expandStatusMapCache.put(Long.valueOf(headerItem.getHeaderTimeMillis()), Boolean.TRUE);
        List<D> list = this.originDataMap.get(Long.valueOf(headerItem.getHeaderTimeMillis()));
        Intrinsics.checkNotNull(list);
        List<D> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExpandableItem().setItemData(convertDailyRecordItemToWrapper((DailyRecordItem) it.next(), headerItem.getHeaderTimeMillis())));
        }
        this.adapterDataList.addAll(position + 1, arrayList);
        refresh();
    }

    public final void dealFoldAction(@NotNull final HeaderItem headerItem) {
        Intrinsics.checkNotNullParameter(headerItem, "headerItem");
        headerItem.setExpandStatus(false);
        this.expandStatusMapCache.put(Long.valueOf(headerItem.getHeaderTimeMillis()), Boolean.FALSE);
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.adapterDataList, new Function1() { // from class: l92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BaseMonthExpandableAdapter.dealFoldAction$lambda$4(headerItem, (ExpandableItem) obj));
            }
        });
        refresh();
    }

    @NotNull
    public final List<ExpandableItem<W>> getAdapterDataList() {
        return this.adapterDataList;
    }

    @NotNull
    public final Map<Long, List<D>> getOriginDataMap() {
        return this.originDataMap;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void refresh() {
        notifyDataSetChanged();
        this.checkAttachBottomCallback.invoke();
    }

    public final void setCheckAttachBottomCallback(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.checkAttachBottomCallback = callback;
    }
}

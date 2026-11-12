package com.xiaomi.fit.fitness.persist.db.utils;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\rJ!\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0012JC\u0010\u000e\u001a\u0004\u0018\u0001H\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0010\"\b\b\u0001\u0010\u0013*\u00020\t2\u0006\u0010\u000f\u001a\u0002H\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0017JM\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00130\b\"\b\b\u0000\u0010\u0014*\u00020\u0010\"\b\b\u0001\u0010\u0013*\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001aJ3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001eJ7\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/ItemEntityUtil;", "", "<init>", "()V", "TAG", "", "convertRelativeDataToItem", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "modelList", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "curTZOffset", "", "convertEntityToItem", "entity", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "zoneOffsetInSec", "(Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "To", "From", "clazz", "Ljava/lang/Class;", "(Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;Ljava/lang/Class;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "convertEntityToItemList", "list", "(Ljava/util/List;Ljava/lang/Class;Ljava/lang/Integer;)Ljava/util/List;", "convertEntityToItemListByKey", "persistKey", "entityList", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Ljava/util/List;", "convertEntityToItemMap", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/util/Map;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nItemEntityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemEntityUtil.kt\ncom/xiaomi/fit/fitness/persist/db/utils/ItemEntityUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1863#2,2:130\n*S KotlinDebug\n*F\n+ 1 ItemEntityUtil.kt\ncom/xiaomi/fit/fitness/persist/db/utils/ItemEntityUtil\n*L\n84#1:130,2\n*E\n"})
public final class ItemEntityUtil {

    @NotNull
    public static final ItemEntityUtil INSTANCE = new ItemEntityUtil();

    @NotNull
    private static final String TAG = "ItemEntityUtil";

    private ItemEntityUtil() {
    }

    public static /* synthetic */ DailyRecordItem convertEntityToItem$default(ItemEntityUtil itemEntityUtil, DailyRecordBaseEntity dailyRecordBaseEntity, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return itemEntityUtil.convertEntityToItem(dailyRecordBaseEntity, num);
    }

    public static /* synthetic */ List convertEntityToItemList$default(ItemEntityUtil itemEntityUtil, List list, Class cls, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return itemEntityUtil.convertEntityToItemList(list, cls, num);
    }

    public static /* synthetic */ List convertEntityToItemListByKey$default(ItemEntityUtil itemEntityUtil, String str, List list, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return itemEntityUtil.convertEntityToItemListByKey(str, list, num);
    }

    public static /* synthetic */ Map convertEntityToItemMap$default(ItemEntityUtil itemEntityUtil, List list, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return itemEntityUtil.convertEntityToItemMap(list, num);
    }

    @Nullable
    public final DailyRecordItem convertEntityToItem(@NotNull DailyRecordBaseEntity entity, @Nullable Integer zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Class<? extends DailyRecordItem> recordItemClazz = DailyRecordDaoRepo.INSTANCE.getRecordItemClazz(entity.getKey());
        if (recordItemClazz != null) {
            return convertEntityToItem(entity, recordItemClazz, zoneOffsetInSec);
        }
        FitnessLogUtils.w(TAG, entity.getKey() + ", no support clazz");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <From extends DailyRecordBaseEntity, To extends DailyRecordItem> List<To> convertEntityToItemList(@NotNull List<? extends From> list, @NotNull Class<To> clazz, @Nullable Integer zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DailyRecordItem dailyRecordItemConvertEntityToItem = INSTANCE.convertEntityToItem((DailyRecordBaseEntity) it.next(), clazz, zoneOffsetInSec);
            if (dailyRecordItemConvertEntityToItem != null) {
                arrayList.add(dailyRecordItemConvertEntityToItem);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<DailyRecordItem> convertEntityToItemListByKey(@NotNull String persistKey, @NotNull List<? extends DailyRecordBaseEntity> entityList, @Nullable Integer zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        Class<? extends DailyRecordItem> recordItemClazz = DailyRecordDaoRepo.INSTANCE.getRecordItemClazz(persistKey);
        if (recordItemClazz != null) {
            return convertEntityToItemList(entityList, recordItemClazz, zoneOffsetInSec);
        }
        FitnessLogUtils.w(TAG, persistKey + ", no support clazz");
        List<DailyRecordItem> listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        return listEmptyList;
    }

    @NotNull
    public final Map<String, List<DailyRecordItem>> convertEntityToItemMap(@NotNull List<? extends DailyRecordBaseEntity> entityList, @Nullable Integer zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyRecordBaseEntity dailyRecordBaseEntity : entityList) {
            FitnessPersistUtils.INSTANCE.getMapValueList(linkedHashMap, dailyRecordBaseEntity.getKey()).add(dailyRecordBaseEntity);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), convertEntityToItemListByKey((String) entry.getKey(), (List) entry.getValue(), zoneOffsetInSec));
        }
        return linkedHashMap2;
    }

    @NotNull
    public final Map<String, List<DailyRecordItem>> convertRelativeDataToItem(@NotNull List<RelativeDataModel> modelList, int curTZOffset) {
        Intrinsics.checkNotNullParameter(modelList, "modelList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (RelativeDataModel relativeDataModel : modelList) {
            Class<? extends DailyRecordItem> recordItemClazz = DailyRecordDaoRepo.INSTANCE.getRecordItemClazz(relativeDataModel.getKey());
            if (recordItemClazz == null) {
                FitnessLogUtils.w(TAG, relativeDataModel.getKey() + ", no support clazz");
            } else {
                DailyRecordItem dailyRecordItem = (DailyRecordItem) FitnessPersistUtils.INSTANCE.fromJson(relativeDataModel.getValue(), recordItemClazz);
                List arrayList = (List) linkedHashMap.get(relativeDataModel.getKey());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(relativeDataModel.getKey(), arrayList);
                }
                if (dailyRecordItem != null) {
                    dailyRecordItem.setTimestamp((relativeDataModel.getTime() + ((long) relativeDataModel.getZoneOffsetInSec())) - ((long) curTZOffset));
                    dailyRecordItem.setSid(relativeDataModel.getSid());
                    ListExtKt.add(arrayList, dailyRecordItem);
                }
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ DailyRecordItem convertEntityToItem$default(ItemEntityUtil itemEntityUtil, DailyRecordBaseEntity dailyRecordBaseEntity, Class cls, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return itemEntityUtil.convertEntityToItem(dailyRecordBaseEntity, cls, num);
    }

    @Nullable
    public final <From extends DailyRecordBaseEntity, To extends DailyRecordItem> To convertEntityToItem(@NotNull From entity, @NotNull Class<To> clazz, @Nullable Integer zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        To to = (To) FitnessPersistUtils.INSTANCE.fromJson(entity.getValue(), clazz);
        if (to == null || to.getTimestamp() <= 0) {
            return null;
        }
        to.setDbKey(entity.getKey());
        to.setDbTime(Long.valueOf(entity.getTime()));
        to.setSid(entity.getSid());
        to.setZoneOffsetInSec(Integer.valueOf(entity.getZoneOffsetInSec()));
        if (zoneOffsetInSec != null && Intrinsics.compare(zoneOffsetInSec.intValue(), entity.getZoneOffsetInSec()) != 0) {
            to.setZoneOffsetInSec(zoneOffsetInSec);
            to.setTimestamp((to.getTimestamp() + ((long) entity.getZoneOffsetInSec())) - ((long) zoneOffsetInSec.intValue()));
        }
        return to;
    }
}

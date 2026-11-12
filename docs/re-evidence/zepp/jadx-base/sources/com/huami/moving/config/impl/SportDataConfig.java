package com.huami.moving.config.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.moving.config.DataGroup;
import com.huami.moving.config.DataItem;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0003B7\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005J \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\u0006\u0010\u0006\u001a\u00020\u0005R\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R6\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/moving/config/impl/SportDataConfig;", "", "", "a", "b", "", "sportGroupId", "", "Lcom/huami/moving/config/DataItem;", "getDataCardItems", "", "Lcom/huami/moving/config/DataGroup;", "getDataList", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "sportDataJson", "dataGroupJson", "c", "sportDataCardJson", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "dataCardConfig", "e", "dataConfig", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "f", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataConfig {

    @Deprecated
    @NotNull
    public static final String TAG = "SportDataConfig";

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> sportDataJson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> dataGroupJson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> sportDataCardJson;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Map<String, ? extends List<? extends DataItem>> dataCardConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Map<String, ? extends Map<DataGroup, ? extends List<? extends DataItem>>> dataConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/moving/config/impl/SportDataConfig$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SportDataConfig(@NotNull Function0<String> function0, @NotNull Function0<String> function1, @NotNull Function0<String> function2) {
        this.sportDataJson = function0;
        this.dataGroupJson = function1;
        this.sportDataCardJson = function2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    private final void a() {
        List<SportDataItem> mutableList;
        String strInvoke = this.sportDataCardJson.invoke();
        if (strInvoke == null) {
            mutableList = null;
        } else {
            try {
                mutableList = ArraysKt___ArraysKt.toMutableList((Object[]) new Gson().fromJson(strInvoke, SportDataItem[].class));
            } catch (JsonSyntaxException e) {
                LogKit.e(TAG, "Init sport data card config error: " + e.getMessage());
                mutableList = null;
            }
            if (mutableList == null || !(!mutableList.isEmpty())) {
                mutableList = null;
            }
        }
        if (mutableList == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SportDataItem sportDataItem : mutableList) {
            ArrayList arrayList = new ArrayList();
            for (String str : sportDataItem.getData()) {
                DataItem itemById = DataItem.INSTANCE.getItemById(str);
                if ((itemById == null ? null : Boolean.valueOf(arrayList.add(itemById))) == null) {
                    LogKit.w(TAG, "Can not find item by id: " + str);
                }
            }
            linkedHashMap.put(sportDataItem.getSportGroup(), arrayList);
        }
        Unit unit = Unit.INSTANCE;
        this.dataCardConfig = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    /* JADX WARN: Code duplicated, block: B:55:0x017f  */
    private final void b() {
        List mutableList;
        List list;
        List<SportDataGroupItem> mutableList2;
        LinkedHashMap linkedHashMap;
        Unit unit;
        String strInvoke = this.sportDataJson.invoke();
        if (strInvoke == null) {
            list = null;
        } else {
            try {
                mutableList = ArraysKt___ArraysKt.toMutableList((Object[]) new Gson().fromJson(strInvoke, SportDataItem[].class));
            } catch (JsonSyntaxException e) {
                LogKit.e(TAG, "Init sport data config error: " + e.getMessage());
                e.printStackTrace();
                mutableList = null;
            }
            if (mutableList != null && (!mutableList.isEmpty())) {
                list = mutableList;
            } else {
                list = null;
            }
        }
        if (list == null) {
            return;
        }
        String strInvoke2 = this.dataGroupJson.invoke();
        if (strInvoke2 == null) {
            linkedHashMap = null;
        } else {
            try {
                mutableList2 = ArraysKt___ArraysKt.toMutableList((Object[]) new Gson().fromJson(strInvoke2, SportDataGroupItem[].class));
            } catch (JsonSyntaxException e2) {
                LogKit.e(TAG, "Init sport data group config error: " + e2.getMessage());
                e2.printStackTrace();
                mutableList2 = null;
            }
            if (mutableList2 != null) {
                if (!(!mutableList2.isEmpty())) {
                    mutableList2 = null;
                }
                if (mutableList2 == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList2, 10)), 16));
                    for (SportDataGroupItem sportDataGroupItem : mutableList2) {
                        Pair pair = new Pair(sportDataGroupItem.getDataGroup(), sportDataGroupItem.getData());
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                }
            } else {
                linkedHashMap = null;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SportDataItem sportDataItem = (SportDataItem) it2.next();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if (linkedHashMap != null) {
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    ArrayList arrayList = new ArrayList();
                    for (String str : (Iterable) entry.getValue()) {
                        if (sportDataItem.getData().contains(str)) {
                            DataItem itemById = DataItem.INSTANCE.getItemById(str);
                            if ((itemById == null ? null : Boolean.valueOf(arrayList.add(itemById))) == null) {
                                LogKit.e(TAG, "Can not find item by id: " + str + "(" + sportDataItem.getSportGroup() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + entry.getKey() + ")");
                            }
                        }
                        it2 = it2;
                        linkedHashMap = linkedHashMap;
                        it3 = it3;
                    }
                    Iterator it4 = it2;
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    Iterator it5 = it3;
                    if (!arrayList.isEmpty()) {
                        DataGroup groupById = DataGroup.INSTANCE.getGroupById((String) entry.getKey());
                        if (groupById == null) {
                            unit = null;
                        } else {
                            linkedHashMap3.put(groupById, arrayList);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            LogKit.e(TAG, "Can not find group by id: " + entry + "(" + sportDataItem.getSportGroup() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + entry.getKey() + ")");
                        }
                    }
                    it2 = it4;
                    linkedHashMap = linkedHashMap4;
                    it3 = it5;
                }
            }
            Iterator it6 = it2;
            LinkedHashMap linkedHashMap5 = linkedHashMap;
            if (!linkedHashMap3.isEmpty()) {
                linkedHashMap2.put(sportDataItem.getSportGroup(), linkedHashMap3);
            }
            it2 = it6;
            linkedHashMap = linkedHashMap5;
        }
        Unit unit2 = Unit.INSTANCE;
        this.dataConfig = linkedHashMap2;
    }

    @NotNull
    public final List<DataItem> getDataCardItems(@NotNull String sportGroupId) {
        if (this.dataCardConfig == null) {
            a();
        }
        Map<String, ? extends List<? extends DataItem>> map = this.dataCardConfig;
        List<DataItem> list = map == null ? null : (List) map.get(sportGroupId);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Map<DataGroup, List<DataItem>> getDataList(@NotNull String sportGroupId) {
        if (this.dataConfig == null) {
            b();
        }
        Map<String, ? extends Map<DataGroup, ? extends List<? extends DataItem>>> map = this.dataConfig;
        Map<DataGroup, List<DataItem>> map2 = map == null ? null : (Map) map.get(sportGroupId);
        return map2 == null ? r.emptyMap() : map2;
    }
}

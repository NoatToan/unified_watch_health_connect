package com.huami.wallet.lib.util;

import com.huami.wallet.lib.entity.CitySimpleInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/wallet/lib/util/CitySimpleInfoCache;", "", "", "appCode", "Lcom/huami/wallet/lib/entity/CitySimpleInfo;", "city", "", "putCityInfo", "getCityInfo", "", "isEmpty", "aid", "getCityInfoByAid", "getAid", "getMiCardName", "", "a", "Ljava/util/Map;", "cityInfoMap", "<init>", "()V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final class CitySimpleInfoCache {

    @NotNull
    public static final CitySimpleInfoCache INSTANCE = new CitySimpleInfoCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, CitySimpleInfo> cityInfoMap = new LinkedHashMap();

    private CitySimpleInfoCache() {
    }

    @Nullable
    public final String getAid(@NotNull String appCode) {
        CitySimpleInfo citySimpleInfo = cityInfoMap.get(appCode);
        if (citySimpleInfo == null) {
            return null;
        }
        return citySimpleInfo.getAid();
    }

    @Nullable
    public final CitySimpleInfo getCityInfo(@NotNull String appCode) {
        return cityInfoMap.get(appCode);
    }

    @Nullable
    public final CitySimpleInfo getCityInfoByAid(@NotNull String aid) {
        Object next;
        Iterator<T> it2 = cityInfoMap.values().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(((CitySimpleInfo) next).getAid(), aid)) {
                return (CitySimpleInfo) next;
            }
        }
        next = null;
        return (CitySimpleInfo) next;
    }

    @NotNull
    public final String getMiCardName(@NotNull String appCode) {
        String miCardName;
        CitySimpleInfo citySimpleInfo = cityInfoMap.get(appCode);
        return (citySimpleInfo == null || (miCardName = citySimpleInfo.getMiCardName()) == null) ? "" : miCardName;
    }

    public final boolean isEmpty() {
        return cityInfoMap.isEmpty();
    }

    public final void putCityInfo(@NotNull String appCode, @NotNull CitySimpleInfo city) {
        cityInfoMap.put(appCode, city);
    }
}

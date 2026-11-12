package com.huami.moving.sport.ui.usecase;

import com.huami.moving.sport.ui.webapi.ApiResult;
import com.huami.moving.sport.ui.webapi.DeviceMeta;
import com.huami.moving.sport.ui.webapi.DeviceSettingApi;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.ranges.e;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/sport/ui/usecase/GetDeviceIconUserCase;", "", "", "", "idList", "", "", Constant.METHOD_EXECUTE, "Lcom/huami/moving/sport/ui/webapi/DeviceSettingApi;", "a", "Lcom/huami/moving/sport/ui/webapi/DeviceSettingApi;", "api", "<init>", "(Lcom/huami/moving/sport/ui/webapi/DeviceSettingApi;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class GetDeviceIconUserCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceSettingApi api;

    public GetDeviceIconUserCase(@NotNull DeviceSettingApi deviceSettingApi) {
        this.api = deviceSettingApi;
    }

    @NotNull
    public final Map<Integer, String> execute(@NotNull List<Integer> idList) {
        ApiResult<List<DeviceMeta>> apiResultQueryMeta = this.api.queryMeta(idList);
        if (!(apiResultQueryMeta instanceof ApiResult.Success)) {
            return r.emptyMap();
        }
        Iterable iterable = (Iterable) ((ApiResult.Success) apiResultQueryMeta).getData();
        ArrayList<DeviceMeta> arrayList = new ArrayList();
        for (Object obj : iterable) {
            String thumbnail = ((DeviceMeta) obj).getThumbnail();
            if (!(thumbnail == null || m.isBlank(thumbnail))) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (DeviceMeta deviceMeta : arrayList) {
            Pair pair = TuplesKt.to(Integer.valueOf(deviceMeta.getSource()), deviceMeta.getThumbnail());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}

package com.xiaomi.hm.health.device.callback;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a.\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "gpsRecords", "", "", "Lcom/xiaomi/hm/health/device/callback/ChildSportIndex;", "assembleChildList", "list", "", "generateChildListData", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class MixSportUtilsKt {
    @NotNull
    public static final Map<Long, List<ChildSportIndex>> assembleChildList(@NotNull HMDeviceSource hMDeviceSource, @NotNull List<? extends GpsRecord> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GpsRecord gpsRecord : list) {
            if (gpsRecord.getSummary().getParentStartTime() > 0) {
                long j = 1000;
                long parentStartTime = gpsRecord.getSummary().getParentStartTime() / j;
                long startTime = gpsRecord.getSummary().getStartTime() / j;
                if (!linkedHashMap.containsKey(Long.valueOf(parentStartTime))) {
                    linkedHashMap.put(Long.valueOf(parentStartTime), new ArrayList());
                }
                int iConvertSportType = SportTypeAdapter.INSTANCE.convertSportType(gpsRecord.getSummary().getType(), gpsRecord.getSummary().getSportTypeValue(), DataSourceUtilsKt.getRecordSource(hMDeviceSource)) + 1000;
                List list2 = (List) linkedHashMap.get(Long.valueOf(parentStartTime));
                if (list2 != null) {
                    list2.add(new ChildSportIndex(startTime, iConvertSportType));
                }
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final String generateChildListData(@Nullable List<ChildSportIndex> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (ChildSportIndex childSportIndex : list) {
            long trackID = childSportIndex.getTrackID();
            int type = childSportIndex.getType();
            if (trackID != 0 && type != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trackid", trackID);
                    jSONObject.put("type", type);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONArray.toString();
    }
}

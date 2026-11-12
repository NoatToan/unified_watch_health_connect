package com.huami.watch.dataflow.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.cloud.api.HealthDataAPI;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.HeartRateData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.dataflow.sync.util.SyncParser;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SingleHeartRateSync extends BaseDataSync<HeartRateData> {
    private static final String b = "DataFlow-Sync-HeartRate";

    public class a implements Comparator<HeartRateData.Item> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HeartRateData.Item item, HeartRateData.Item item2) {
            return (int) (item.getGeneratedTime() - item2.getGeneratedTime());
        }
    }

    public SingleHeartRateSync() {
        super(DataType.HEART_RATE);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull HeartRateData heartRateData) {
        return true;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return b;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull HeartRateData heartRateData) {
        return ArraysUtil.isEmpty(heartRateData.getItems());
    }

    @Override // com.huami.watch.dataflow.sync.a
    public HeartRateData parseSyncData(@NonNull String str) {
        return SyncParser.toHeartRateData(str);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull HeartRateData heartRateData) {
        Collections.sort(heartRateData.getItems(), new a());
        Log.d(b, "HRData Sorted Items: " + ArraysUtil.toString(heartRateData.getItems()), new Object[0]);
        JSONArray jSONArray = new JSONArray();
        Iterator<HeartRateData.Item> it2 = heartRateData.getItems().iterator();
        while (it2.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it2.next().getData()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        String string = jSONArray.toString();
        boolean zPostHeartRate = HealthDataAPI.postHeartRate(context, string);
        Log.d(b, "Post HRData: " + string + ", Success: " + zPostHeartRate, new Object[0]);
        return zPostHeartRate;
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull HeartRateData heartRateData) {
        SyncResult syncResult = new SyncResult();
        syncResult.needContinue = true;
        syncResult.data = heartRateData;
        return syncResult;
    }
}

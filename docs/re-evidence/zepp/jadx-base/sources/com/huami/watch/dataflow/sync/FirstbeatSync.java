package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.cloud.api.FirstbeatDataAPI;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.dataflow.sync.util.SyncParser;
import com.huami.watch.dataflow.util.FirstBeatDataValidUtil;
import com.huami.watch.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FirstbeatSync extends BaseDataSync<FirstbeatData> {
    private static final String b = "DataFlow-Sync-Firstbeat";

    public FirstbeatSync() {
        super(DataType.FIRSTBEAT);
    }

    private boolean a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            boolean zIsConfigValid = FirstBeatDataValidUtil.isConfigValid(str);
            Log.d(b, "FirstbeatConfig Item: " + str + ",valid:" + zIsConfigValid, new Object[0]);
            if (zIsConfigValid) {
                return FirstbeatDataAPI.postConfig(context, str);
            }
        }
        return true;
    }

    private boolean b(Context context, List<FirstbeatData.Item> list) {
        boolean zPostSportLoad = true;
        for (FirstbeatData.Item item : list) {
            boolean zIsSportThaValid = FirstBeatDataValidUtil.isSportThaValid(item.getData());
            Log.d(b, "SportThaInfo Item: " + item + ",valid:" + zIsSportThaValid, new Object[0]);
            if (zIsSportThaValid && !(zPostSportLoad = FirstbeatDataAPI.postSportLoad(context, item.getData()))) {
                break;
            }
        }
        return zPostSportLoad;
    }

    private boolean c(Context context, List<FirstbeatData.Item> list) {
        boolean zPostVO2max = true;
        for (FirstbeatData.Item item : list) {
            boolean zIsVo2MaxValid = FirstBeatDataValidUtil.isVo2MaxValid(item.getData());
            Log.d(b, "VO2max Item: " + item + ",valid:" + zIsVo2MaxValid, new Object[0]);
            if (zIsVo2MaxValid && !(zPostVO2max = FirstbeatDataAPI.postVO2max(context, item.getData()))) {
                break;
            }
        }
        return zPostVO2max;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull FirstbeatData firstbeatData) {
        return true;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return b;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull FirstbeatData firstbeatData) {
        return TextUtils.isEmpty(firstbeatData.firstbeatconfig) && firstbeatData.getVo2max().size() == 0 && firstbeatData.getSportThaInfo().size() == 0;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public FirstbeatData parseSyncData(@NonNull String str) {
        return SyncParser.toFirstbeatData(str);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull FirstbeatData firstbeatData) {
        return a(context, firstbeatData.firstbeatconfig) && c(context, firstbeatData.getVo2max()) && b(context, firstbeatData.getSportThaInfo());
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull FirstbeatData firstbeatData) {
        SyncResult syncResult = new SyncResult();
        syncResult.needContinue = true;
        syncResult.data = firstbeatData;
        return syncResult;
    }
}

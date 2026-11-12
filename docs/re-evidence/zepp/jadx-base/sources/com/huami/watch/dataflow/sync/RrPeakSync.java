package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.dataflow.cloud.api.AtrialFibrillationDataAPI;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.RrPeakData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class RrPeakSync extends BaseDataSync<RrPeakData> {

    public class a {

        @SerializedName("time")
        @Expose
        public long a;

        public a() {
        }
    }

    public RrPeakSync() {
        super(DataType.RR_PEAK);
    }

    private boolean a(Context context, @NonNull RrPeakData rrPeakData) {
        RrPeakData.AfResult afResult = rrPeakData.afResult;
        if (afResult == null || afResult.resultMap.isEmpty()) {
            return true;
        }
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        RrPeakData.AfResult afResult2 = rrPeakData.afResult;
        return AtrialFibrillationDataAPI.postAfResults(context, currentUid, afResult2.resultMap, afResult2.timeZone, rrPeakData.deviceSource, currentDevice.getSN(), currentDevice.info().getAndroidDId(), rrPeakData.afResult.fwVer);
    }

    private boolean b(Context context, @NonNull RrPeakData rrPeakData) {
        RrPeakData.RrPeak rrPeak = rrPeakData.rrPeak;
        if (rrPeak == null || TextUtils.isEmpty(rrPeak.rawData)) {
            return true;
        }
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        HashMap map = new HashMap();
        map.put("fwVer", rrPeakData.rrPeak.fwVer);
        map.put("deviceSource", Integer.valueOf(rrPeakData.deviceSource));
        map.put("sn", currentDevice.getSN());
        map.put("deviceId", currentDevice.info().getAndroidDId());
        map.put("lastRrPackageTime", Long.valueOf(rrPeakData.rrPeak.lastRrPackageTime));
        boolean zUploadData = AtrialFibrillationDataAPI.uploadData(context, currentUid, 1000 * rrPeakData.rrPeak.generatedTime, 8, map, rrPeakData.time + "_rrpeak.zip", Base64.decode(rrPeakData.rrPeak.rawData, 0));
        Log.d(tag(), "Upload acc info result:" + zUploadData, new Object[0]);
        return zUploadData;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull RrPeakData rrPeakData) {
        return true;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return "DataFlow-Sync-RrPeak";
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull RrPeakData rrPeakData) {
        RrPeakData.AfResult afResult;
        RrPeakData.RrPeak rrPeak;
        return rrPeakData.time <= 0 || (((afResult = rrPeakData.afResult) == null || afResult.resultMap.isEmpty()) && ((rrPeak = rrPeakData.rrPeak) == null || TextUtils.isEmpty(rrPeak.rawData)));
    }

    @Override // com.huami.watch.dataflow.sync.a
    @Nullable
    public RrPeakData parseSyncData(@NonNull String str) {
        try {
            return (RrPeakData) new Gson().fromJson(str, RrPeakData.class);
        } catch (Exception e) {
            Log.e(tag(), "parse sync data to rrpeak error", e, new Object[0]);
            return null;
        }
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull RrPeakData rrPeakData) {
        boolean zA = a(context, rrPeakData);
        return zA ? b(context, rrPeakData) : zA;
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull RrPeakData rrPeakData) {
        SyncResult syncResult = new SyncResult();
        a aVar = new a();
        if (isSyncDataEmpty(rrPeakData)) {
            syncResult.needContinue = false;
            syncResult.dataEmpty = true;
        } else {
            syncResult.needContinue = true;
            aVar.a = rrPeakData.time;
        }
        syncResult.data = aVar;
        return syncResult;
    }
}

package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.dataflow.cloud.api.AtrialFibrillationDataAPI;
import com.huami.watch.dataflow.model.health.bean.AtrialFibrillationDataItem;
import com.huami.watch.dataflow.sync.bean.AtrialFibrillationData;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.dataflow.sync.util.SyncParser;
import com.huami.watch.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class AtrialFibrillationSync extends BaseDataSync<AtrialFibrillationData> {
    private static final String b = "DataFlow-Sync-AtrialFibrillation";
    private static final String c = "17_1";
    private static final String d = "17_2";

    public class a {

        @SerializedName("time")
        @Expose
        public long a;

        public a() {
        }
    }

    public AtrialFibrillationSync() {
        super(DataType.ATRIAL_FIBRILLATION);
    }

    private boolean a(Context context, String str, @NonNull AtrialFibrillationData atrialFibrillationData) {
        Log.d(b, "Start upload acc info", new Object[0]);
        AtrialFibrillationData.AccInfo accInfo = atrialFibrillationData.accInfo;
        if (accInfo == null) {
            Log.d(b, "Acc info is empty,do not need upload", new Object[0]);
            return true;
        }
        if (TextUtils.isEmpty(accInfo.accRawData)) {
            Log.w(b, "AccInfo rawdata is empty", new Object[0]);
            return false;
        }
        byte[] bArrDecode = Base64.decode(atrialFibrillationData.accInfo.accRawData, 0);
        String str2 = atrialFibrillationData.time + "_accinfo.zip";
        HashMap map = new HashMap(5);
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        map.put("deviceSource", Integer.valueOf(atrialFibrillationData.accInfo.deviceSource));
        map.put("deviceId", currentDevice.info().getAndroidDId());
        map.put("fwVer", atrialFibrillationData.accInfo.hwVer);
        if (atrialFibrillationData.flag > 0) {
            map.put("afResult", Integer.valueOf(atrialFibrillationData.afResult));
        }
        map.put("sn", currentDevice.getSN());
        boolean zUploadData = AtrialFibrillationDataAPI.uploadData(context, str, atrialFibrillationData.time, 30, map, str2, bArrDecode);
        Log.d(b, "Upload acc info result:" + zUploadData, new Object[0]);
        return zUploadData;
    }

    private boolean b(Context context, String str, @NonNull AtrialFibrillationData atrialFibrillationData) {
        Log.d(b, "Start upload ppg info", new Object[0]);
        byte[] bArrDecode = Base64.decode(atrialFibrillationData.rawdata, 0);
        String str2 = atrialFibrillationData.time + "_atrifibrillation.zip";
        HashMap map = new HashMap(5);
        if (atrialFibrillationData.ppgInfo != null) {
            Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
            map.put("deviceSource", Integer.valueOf(atrialFibrillationData.ppgInfo.deviceSource));
            map.put("deviceId", currentDevice.info().getAndroidDId());
            map.put("fwVer", atrialFibrillationData.ppgInfo.hwVer);
            if (atrialFibrillationData.flag > 0) {
                map.put("afResult", Integer.valueOf(atrialFibrillationData.afResult));
            }
            map.put("sn", currentDevice.getSN());
        }
        boolean zUploadData = AtrialFibrillationDataAPI.uploadData(context, str, atrialFibrillationData.time, 11, map, str2, bArrDecode);
        Log.d(b, "Upload ppg info result:" + zUploadData, new Object[0]);
        return zUploadData;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull AtrialFibrillationData atrialFibrillationData) {
        return true;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return b;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull AtrialFibrillationData atrialFibrillationData) {
        return atrialFibrillationData.time <= 0 || TextUtils.isEmpty(atrialFibrillationData.rawdata);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public AtrialFibrillationData parseSyncData(@NonNull String str) {
        return SyncParser.toAtrialFibrillationData(str);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull AtrialFibrillationData atrialFibrillationData) {
        String str;
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (atrialFibrillationData.flag > 0) {
            str = atrialFibrillationData.eventType;
        } else {
            AtrialFibrillationData.PpgInfo ppgInfo = atrialFibrillationData.ppgInfo;
            if (ppgInfo != null) {
                str = ppgInfo.eventType;
            } else {
                str = atrialFibrillationData.active == 0 ? d : c;
            }
        }
        String str2 = str;
        if (!str2.equals(c)) {
            return true;
        }
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        boolean zPostEvents = AtrialFibrillationDataAPI.postEvents(context, currentUid, str2, atrialFibrillationData.time, atrialFibrillationData.active, currentDevice.getSN(), currentDevice.info().getAndroidDId(), atrialFibrillationData.ppgInfo.deviceSource);
        if (zPostEvents) {
            zPostEvents = b(context, currentUid, atrialFibrillationData);
        }
        if (zPostEvents) {
            zPostEvents = a(context, currentUid, atrialFibrillationData);
        }
        if (zPostEvents) {
            AtrialFibrillationDataItem atrialFibrillationDataItem = new AtrialFibrillationDataItem();
            atrialFibrillationDataItem.active = atrialFibrillationData.active;
            atrialFibrillationDataItem.eventType = str2;
            atrialFibrillationDataItem.timestamp = atrialFibrillationData.time;
            atrialFibrillationDataItem.userId = currentUid;
            AtriDbObserver.INSTANCE.getInstance().onNext(atrialFibrillationDataItem);
        }
        return zPostEvents;
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull AtrialFibrillationData atrialFibrillationData) {
        SyncResult syncResult = new SyncResult();
        a aVar = new a();
        if (isSyncDataEmpty(atrialFibrillationData)) {
            syncResult.needContinue = false;
            syncResult.dataEmpty = true;
        } else {
            syncResult.needContinue = true;
            aVar.a = atrialFibrillationData.time;
        }
        syncResult.data = aVar;
        return syncResult;
    }
}

package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.thirdpartservice.syncdata.SyncTask;
import com.huawei.ui.thirdpartservice.syncdata.constants.KomootOauthConstant;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.ui.thirdpartservice.syncdata.net.SyncDataToKomootApi;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xbv extends SyncTask {
    private final SyncDataToKomootApi d;

    xbv(HiHealthData hiHealthData, String str, File file, SyncDataToKomootApi syncDataToKomootApi) {
        super(hiHealthData, str, file);
        this.d = syncDataToKomootApi;
        this.mUploadDomain = lon.c().d("domain_komoot");
    }

    public xbv(SyncDataToKomootApi syncDataToKomootApi) {
        super(new HiHealthData(), "", null);
        this.d = syncDataToKomootApi;
        this.mUploadDomain = lon.c().d("domain_komoot");
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public String getTag() {
        return "KomootSyncTask";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public void retryTooManyTimes() {
        xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), this.mDescription, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT, "", "failed to retry too many times.");
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public void sportDataException() {
        xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), this.mDescription, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT, "", "sport data exception.");
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public void doUpload() {
        a(this.mGpxFile, String.format(Locale.ENGLISH, this.mUploadDomain + KomootOauthConstant.KOMOOT_UPLOAD_PATH, this.mDescription, this.mDescription + " " + qrk.a(this.mHiHealthData.getStartTime())), this.mDescription);
    }

    private void a(File file, String str, final String str2) {
        String accessToken = xbp.b().getAccessToken();
        HashMap map = new HashMap();
        map.put("User-Agent", SyncDataConstant.SYNC_DATA_HEADER_UA);
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accessToken);
        this.d.uploadGpxToKomoot(str, map, RequestBody.create(MediaType.parse(FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM), file)).enqueue(new ResultCallback<String>() { // from class: xbv.3
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<String> response) {
                String str3;
                int code = response.getCode();
                LogUtil.a("KomootSyncTask", "upload success. code = ", Integer.valueOf(code), " json = ", response.getBody());
                if (response.isSuccessful()) {
                    xbv.this.callResult(true);
                    xbv.this.recordUploadBiEvent(str2, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT);
                    ReleaseLogUtil.c("R_KomootSyncTask", "upload success :", Integer.valueOf(xbv.this.mHiHealthData.getSubType()));
                    return;
                }
                if (response.getCode() == 401) {
                    xbv.this.tokenInvalidation();
                    str3 = "token invalid";
                } else {
                    xbv.this.callResult(false);
                    str3 = "sync data failed.";
                }
                ReleaseLogUtil.d("R_KomootSyncTask", str3);
                xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), str2, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT, String.valueOf(response.getCode()), str3);
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), str2, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT, "", "sync data failed.");
                ReleaseLogUtil.d("R_KomootSyncTask", "upload failure：", ExceptionUtils.c(th));
                xbv.this.callResult(false);
            }
        });
    }

    public void d(String str, ResultCallback<String> resultCallback) {
        String str2 = String.format(Locale.ENGLISH, this.mUploadDomain + KomootOauthConstant.KOMOOT_ROAD, str);
        String accessToken = xbp.b().getAccessToken();
        HashMap map = new HashMap();
        map.put("id", str);
        HashMap map2 = new HashMap();
        map2.put("User-Agent", SyncDataConstant.SYNC_DATA_HEADER_UA);
        map2.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accessToken);
        this.d.getRoad(str2, map2, map).enqueue(resultCallback);
    }

    public void e(String str, String str2, int i, ResultCallback<String> resultCallback) {
        HashMap map = new HashMap();
        map.put(BleConstants.LIMIT, HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY);
        map.put("page", String.valueOf(i));
        map.put("only_unlocked", "true");
        if (!TextUtils.isEmpty(str2)) {
            map.put("sport_types", str2);
        }
        HashMap map2 = new HashMap();
        map2.put("User-Agent", SyncDataConstant.SYNC_DATA_HEADER_UA);
        map2.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + xbp.b().getAccessToken());
        this.d.getRoadList(String.format(Locale.ENGLISH, this.mUploadDomain + KomootOauthConstant.KOMOOT_ROAD_LIST, str), map2, map).enqueue(resultCallback);
    }
}

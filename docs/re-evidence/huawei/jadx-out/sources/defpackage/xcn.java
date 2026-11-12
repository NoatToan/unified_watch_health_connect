package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.trans.MultipartBody;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler;
import com.huawei.ui.thirdpartservice.syncdata.SyncTask;
import com.huawei.ui.thirdpartservice.syncdata.constants.StravaInfo;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.ui.thirdpartservice.syncdata.net.SyncDataToStravaApi;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class xcn extends SyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SyncDataToStravaApi f52702b;

    xcn(HiHealthData hiHealthData, String str, File file, SyncDataToStravaApi syncDataToStravaApi) {
        super(hiHealthData, str, file);
        this.f52702b = syncDataToStravaApi;
        this.mUploadDomain = lon.c().d("domain_strava");
        this.f52701a = a(hiHealthData.getSubType(), BaseApplication.b());
    }

    private String a(int i, Context context) {
        String strE = vrg.e(i, context);
        LogUtil.a("StravaSyncTask", "getSportName.", strE);
        return strE;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public String getTag() {
        return "StravaSyncTask";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public void retryTooManyTimes() {
        xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), this.mDescription, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA, "", "failed to retry too many times.");
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public void sportDataException() {
        xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), this.mDescription, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA, "", "sport data exception.");
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask
    public void doUpload() {
        c(this.mGpxFile, this.mUploadDomain + StravaInfo.STRAVA_UPLOAD_PATH, this.mDescription, this.mHiHealthData.getStartTime());
    }

    private void c(File file, String str, String str2, long j) {
        HashMap map = new HashMap();
        map.put("authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + xcj.c().getAccessToken());
        this.f52702b.uploadGpxToStrava(str, map, e(file, str2, j)).enqueue(e(file, str2));
    }

    private MultipartBody e(File file, String str, long j) {
        MediaType mediaType = MediaType.parse("text/*");
        return new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("name", this.f52701a).addFormDataPart("description", str + " " + qrk.a(j) + " " + e()).addFormDataPart("data_type", BasePlatformHandler.SYNC_FILE_TYPE_FIT).addFormDataPart("trainer", "0").addFormDataPart("commute", "0").addFormDataPart("external_id", System.currentTimeMillis() + "").addFormDataPart("file", file.getName(), RequestBody.create(mediaType, file)).build();
    }

    private String e() {
        String str;
        int trackType;
        String str2;
        String strE;
        int i = this.mHiHealthData.getInt("trackdata_deviceType");
        String string = this.mHiHealthData.getString("device_prodid");
        String string2 = this.mHiHealthData.getString("device_subprodid");
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(this.mHiHealthData.getMetaData(), HiTrackMetaData.class);
        if (hiTrackMetaData == null) {
            str = "";
            trackType = 0;
            str2 = "";
        } else {
            str = hiTrackMetaData.getExtendTrackMap().get("localDeviceId");
            if (TextUtils.isEmpty(string)) {
                string = hiTrackMetaData.getExtendTrackMap().get("localProdId");
            }
            str2 = hiTrackMetaData.getExtendTrackMap().get("localSubProdId");
            trackType = hiTrackMetaData.getTrackType();
        }
        if (SportSupportUtil.a(trackType, i) == 0) {
            strE = SportSupportUtil.b("deviceId", str, str2);
            if (TextUtils.isEmpty(strE)) {
                strE = SportSupportUtil.b("smartProductId", string, str2);
            }
        } else {
            strE = een.e(i, BaseApplication.b(), BaseApplication.b().getPackageName(), string, string2);
        }
        if (TextUtils.isEmpty(strE)) {
            strE = BaseApplication.b().getString(R.string.IDS_app_name_health);
        }
        LogUtil.a("StravaSyncTask", "getDeviceName = ", strE);
        return strE;
    }

    private ResultCallback<String> e(File file, final String str) {
        return new ResultCallback<String>() { // from class: xcn.1
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<String> response) {
                String str2;
                int code = response.getCode();
                LogUtil.a("StravaSyncTask", "upload success. code = ", Integer.valueOf(code), " json = ", response.getBody());
                if (response.isSuccessful()) {
                    xcn.this.callResult(true);
                    xcn.this.recordUploadBiEvent(str, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA);
                    ReleaseLogUtil.d("R_HL_StravaSyncTask", "upload success :", xcn.this.f52701a);
                    return;
                }
                if (response.getCode() == 401) {
                    xcn.this.tokenInvalidation();
                    str2 = "token invalid";
                } else {
                    xcn.this.callResult(false);
                    str2 = "sync data failed.";
                }
                ReleaseLogUtil.e("R_HL_StravaSyncTask", str2);
                xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), str, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA, String.valueOf(response.getCode()), str2);
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                xcl.a(OperationKey.HEALTH_APP_SYNC_DATA_80070005.value(), str, SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA, "", "sync data failed.");
                ReleaseLogUtil.d("R_HL_StravaSyncTask", "upload failure：", th.getMessage());
                xcn.this.callResult(false);
            }
        };
    }
}

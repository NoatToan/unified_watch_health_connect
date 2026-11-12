package defpackage;

import android.text.TextUtils;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginhealthzone.cloud.CloudApi;
import com.huawei.pluginhealthzone.cloud.HttpDataCallback;
import health.compact.a.LogAnonymous;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pfn implements CloudApi {
    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void getVerifyCode(HttpDataCallback httpDataCallback) {
        if (httpDataCallback == null) {
            LogUtil.j("CloudImpl", "getShareTypes input params error, callback is null!");
        } else {
            pfk.c("healthCloudUrl", "/healthCare/user/getVerifyCode", new JSONObject(), null, httpDataCallback);
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void getMyFollowRelations(Collection<Long> collection, HttpDataCallback httpDataCallback) {
        if (httpDataCallback == null) {
            LogUtil.j("CloudImpl", "getMyFollowRelations input params error, callback is null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (njy.b(collection)) {
                jSONObject.put("authUser", collection.toArray()[0]);
            }
            pfk.c("healthCloudUrl", "/healthCare/user/getUserListByFollowUser", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.e("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void getPushInformationByNotifyTime(long j, int i, HttpDataCallback httpDataCallback) {
        if (httpDataCallback == null) {
            LogUtil.e("CloudImpl", "getPushInformationByPushId input params error, callback is null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notifyTime", j);
            jSONObject.put("pushType", i);
            pfk.c("healthCloudUrl", "/healthCare/pushdata/getPushInfoByNotifytime", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.j("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void uploadPosition(String str, pgp pgpVar, int i, HttpDataCallback httpDataCallback) {
        if (c(str, httpDataCallback)) {
            LogUtil.j("CloudImpl", "uploadPosition input params is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coordinate", pgpVar.d());
            jSONObject.put(JsbMapKeyNames.H5_LOC_LON, pgpVar.b());
            jSONObject.put(JsbMapKeyNames.H5_LOC_LAT, pgpVar.a());
            jSONObject.put("altitude", pgpVar.e());
            jSONObject.put("clientTime", pgpVar.c());
            jSONObject.put("type", pgpVar.j());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("udid", str);
            jSONObject2.put("locationDataJson", jSONObject);
            jSONObject2.put("positionResultCode", i);
            pfk.c("healthCloudUrl", "/healthCare/position/uploadPosition", jSONObject2, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.j("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void getPositionPushInfo(String str, int i, HttpDataCallback httpDataCallback) {
        if (c(str, httpDataCallback)) {
            LogUtil.j("CloudImpl", "getPositionPushInfo input params is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pushId", str);
            jSONObject.put("headFlag", i);
            pfk.c("healthCloudUrl", "/healthCare/position/getPositionPushInfo", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.j("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void setLocationPermission(String str, int i, HttpDataCallback httpDataCallback) {
        if (c(str, httpDataCallback)) {
            LogUtil.j("CloudImpl", "setLocationPermission input params is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("memberHuid", str);
            jSONObject.put("permission", i);
            pfk.c("healthCloudUrl", "/healthCare/position/setLocationPermission", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.e("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void getCommonUsedDevices(String str, HttpDataCallback httpDataCallback) {
        if (c(str, httpDataCallback)) {
            LogUtil.j("CloudImpl", "getCommonUsedDevices input params is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commonUse", str);
            pfk.c("healthCloudUrl", "/healthCare/position/getCommonUsedDevices", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.e("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void notifyMemberToCheckHealth(String str, HttpDataCallback httpDataCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("memberHuidHash", str);
            pfk.c("healthCloudUrl", "/healthCare/user/notifyMemberToMedical", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.e("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    @Override // com.huawei.pluginhealthzone.cloud.CloudApi
    public void setCommonUsedDevices(List<gqb> list, HttpDataCallback httpDataCallback) {
        if (httpDataCallback == null) {
            LogUtil.j("CloudImpl", "setCommonUsedDevices callback is null!");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("CloudImpl", "setCommonUsedDevices settings is empty!");
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceListData", vov.a(list, gqb.class));
            pfk.c("healthCloudUrl", "/healthCare/position/setCommonUsedDevices", jSONObject, null, httpDataCallback);
        } catch (JSONException e) {
            LogUtil.e("CloudImpl", LogAnonymous.b(e));
            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        }
    }

    private boolean c(String str, HttpDataCallback httpDataCallback) {
        if (httpDataCallback == null) {
            LogUtil.j("CloudImpl", "isParamsNull callback is null!");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        LogUtil.j("CloudImpl", "isParamsNull udId is null!");
        httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
        return true;
    }
}

package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.AccessoryCapabilities;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceDetail;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.sdk.C0423a;
import com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class QueryDeviceDetailApiCall extends BaseTaskApiCall {

    public static class QueryDeviceDetailTypeToken extends TypeToken<FindNetworkResult<DeviceDetail>> {
        private QueryDeviceDetailTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.e("QueryDeviceDetailApiCall", "handleBusiness invalid, body null.");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body null")));
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new QueryDeviceDetailTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.e("QueryDeviceDetailApiCall", "handleBusiness invalid, body parse error.");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        if (findNetworkResult.getRespCode() != 0) {
            HmsFindSDKLog.e("QueryDeviceDetailApiCall", "handleBusiness failed. code:" + findNetworkResult.getRespCode());
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
            return;
        }
        DeviceDetail deviceDetail = (DeviceDetail) findNetworkResult.getData();
        if (deviceDetail == null) {
            HmsFindSDKLog.e("QueryDeviceDetailApiCall", "handleBusiness invalid. device null.");
            taskCompletionSource.setException(new ApiException(new Status(-1, "device null")));
            return;
        }
        Map map = (Map) JsonUtils.json2Object(deviceDetail.getAccessoryCapabilities(), AccessoryCapabilities.class);
        if (map != null && map.get(DeviceDetail.CAP_KEY_ULTRA_SOUND) != null && ((Integer) map.get(DeviceDetail.CAP_KEY_ULTRA_SOUND)).intValue() != 0) {
            map.put(DeviceDetail.CAP_KEY_ULTRA_SOUND, Integer.valueOf(FindExactSdkManager.a().a(hmsClient.getContext(), deviceDetail.getProductId(), deviceDetail.getSequence()) ? 1 : 0));
            deviceDetail.setAccessoryCapabilities(JsonUtils.object2Json(map));
        }
        if ("localDevice".equals(deviceDetail.getExtendData()) && !C0423a.c().c(hmsClient.getContext()) && map != null && map.containsKey(DeviceDetail.CAP_KEY_LOST_NEAR_LINK_NAVIGATION)) {
            map.put(DeviceDetail.CAP_KEY_LOST_NEAR_LINK_NAVIGATION, 0);
            deviceDetail.setAccessoryCapabilities(JsonUtils.object2Json(map));
        }
        HmsFindSDKLog.i("QueryDeviceDetailApiCall", "handleBusiness succeed." + deviceDetail);
        taskCompletionSource.setResult(findNetworkResult);
    }

    public QueryDeviceDetailApiCall(BaseRequestBean baseRequestBean) {
        super("findnetwork.queryDeviceDetail", baseRequestBean);
    }
}

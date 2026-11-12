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
import com.huawei.hms.findnetwork.comm.request.bean.PairedDeviceInfo;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.CollectionUtil;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class QueryPairedDevicesApiCall extends BaseTaskApiCall {

    public static class QueryPairedDevicesTypeToken extends TypeToken<FindNetworkResult<List<PairedDeviceInfo>>> {
        private QueryPairedDevicesTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        Map map;
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("QueryPairedDevicesApiCall", "body null");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body null")));
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new QueryPairedDevicesTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("QueryPairedDevicesApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        HmsFindSDKLog.i("QueryPairedDevicesApiCall", "success to call query paired devices. fncResult=" + findNetworkResult.getRespCode());
        if (findNetworkResult.getRespCode() != 0) {
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
            return;
        }
        List<PairedDeviceInfo> list = (List) findNetworkResult.getData();
        if (CollectionUtil.isEmpty(list)) {
            taskCompletionSource.setResult(findNetworkResult);
            return;
        }
        for (PairedDeviceInfo pairedDeviceInfo : list) {
            if (pairedDeviceInfo != null && (map = (Map) JsonUtils.json2Object(pairedDeviceInfo.getAccessoryCapabilities(), AccessoryCapabilities.class)) != null && map.get(DeviceDetail.CAP_KEY_ULTRA_SOUND) != null && ((Integer) map.get(DeviceDetail.CAP_KEY_ULTRA_SOUND)).intValue() != 0) {
                boolean zA = FindExactSdkManager.a().a(hmsClient.getContext(), pairedDeviceInfo.getProductId(), pairedDeviceInfo.getSequence());
                map.put(DeviceDetail.CAP_KEY_ULTRA_SOUND, Integer.valueOf(zA ? 1 : 0));
                pairedDeviceInfo.setAccessoryCapabilities(JsonUtils.object2Json(map));
                HmsFindSDKLog.i("QueryPairedDevicesApiCall", MaskUtil.maskSn(pairedDeviceInfo.getSn()) + " supportResult:" + (zA ? 1 : 0) + ", productId:" + pairedDeviceInfo.getProductId() + ", sequence:" + pairedDeviceInfo.getSequence());
            }
        }
        taskCompletionSource.setResult(findNetworkResult);
    }

    public QueryPairedDevicesApiCall(BaseRequestBean baseRequestBean) {
        super("findnetwork.queryPairedDevices", baseRequestBean);
    }
}

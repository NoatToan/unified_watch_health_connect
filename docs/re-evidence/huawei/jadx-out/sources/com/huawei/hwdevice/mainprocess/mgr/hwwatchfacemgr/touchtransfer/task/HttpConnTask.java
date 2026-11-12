package com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.restclienthttp.StringDeleteRestClientService;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.restclienthttp.StringGetRestClientService;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.restclienthttp.StringRestClientService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mdw;
import defpackage.mdy;
import defpackage.mea;
import health.compact.a.CommonUtil;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class HttpConnTask<Result, RequestParams> {
    private static final int MAP_INIT_SIZE = 1;
    private static final String TAG = "HttpConnTask";
    protected Context mContext;
    private String mUrl;
    private int mRequestType = 2;
    private Map<String, String> mHeaderMap = new LinkedHashMap(1);

    protected abstract String prepareRequestString(RequestParams requestparams);

    protected abstract Result readErrorResponse(int i);

    protected abstract Result readSuccessResponse(JSONObject jSONObject);

    public HttpConnTask(Context context, String str) {
        this.mContext = context;
        this.mUrl = str;
    }

    public Result processTask(RequestParams requestparams) {
        if (!CommonUtil.ab(this.mContext)) {
            LogUtil.j(TAG, "processTask, no network");
            return readErrorResponse(-2);
        }
        return executeRequest(requestparams);
    }

    private Result executeRequest(RequestParams requestparams) {
        try {
            RestClient restClientB = mdw.b(this.mUrl, this.mContext);
            if (restClientB == null) {
                LogUtil.j(TAG, "restClient is null");
                return readErrorResponse(-3);
            }
            Submit submit = getSubmit(restClientB, requestparams);
            if (submit == null) {
                LogUtil.j(TAG, "submit is null");
                return readErrorResponse(-4);
            }
            return processResponse(submit.execute());
        } catch (IllegalArgumentException unused) {
            LogUtil.e(TAG, "processTask illegalArgumentException");
            return readErrorResponse(-4);
        } catch (MalformedURLException unused2) {
            LogUtil.e(TAG, "MalformedURLException url :", this.mUrl);
            return readErrorResponse(-4);
        } catch (IOException unused3) {
            LogUtil.e(TAG, "processTask IOException");
            return readErrorResponse(-3);
        }
    }

    private Result processResponse(Response response) {
        String str;
        if (response == null) {
            LogUtil.j(TAG, "response is null");
            return readErrorResponse(-3);
        }
        if (!response.isOK()) {
            LogUtil.j(TAG, "error message :", "url :", this.mUrl, "rc :", Integer.valueOf(response.getCode()));
            return readErrorResponse(-3);
        }
        if (!(response.getBody() instanceof String)) {
            str = "";
        } else {
            str = (String) response.getBody();
        }
        LogUtil.a(TAG, "response is :", str);
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String strB = mea.b(jSONObject2, "errorCode");
            String strB2 = mea.b(jSONObject2, "merchantID");
            String strB3 = mea.b(jSONObject2, "response");
            int iA = mea.a(jSONObject2, "keyIndex");
            if (strB != null) {
                LogUtil.j(TAG, "handleResponse, return code :", strB);
                return readSuccessResponse(null);
            }
            if (mdy.d().equals(strB2) && iA == -1 && !TextUtils.isEmpty(strB3)) {
                JSONObject jSONObject3 = new JSONObject(strB3);
                if (mea.b(jSONObject3, "returnCode") == null) {
                    LogUtil.j(TAG, "handleResponse, returnCode is invalid");
                    return readSuccessResponse(null);
                }
                jSONObject = jSONObject3;
                return readSuccessResponse(jSONObject);
            }
            LogUtil.j(TAG, "handleResponse, unexpected error from server");
            return readSuccessResponse(null);
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "processResponse NumberFormatException");
        } catch (JSONException unused2) {
            LogUtil.e(TAG, "processResponse JSONException exception");
        }
    }

    private Submit getSubmit(RestClient restClient, RequestParams requestparams) {
        Map<String, String> defaultMaps;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        int i = this.mRequestType;
        if (i == 1) {
            return ((StringGetRestClientService) restClient.create(StringGetRestClientService.class)).executeRestClientRequest(this.mHeaderMap, this.mUrl, linkedHashMap);
        }
        if (i == 3) {
            return ((StringDeleteRestClientService) restClient.create(StringDeleteRestClientService.class)).executeRestClientRequest(this.mHeaderMap, this.mUrl, linkedHashMap);
        }
        String strPrepareRequestString = prepareRequestString(requestparams);
        if (strPrepareRequestString == null) {
            LogUtil.j(TAG, " processTask, invalid request params");
            return null;
        }
        LogUtil.a(TAG, "prepareRequestString :", strPrepareRequestString);
        StringRestClientService stringRestClientService = (StringRestClientService) restClient.create(StringRestClientService.class);
        Map<String, String> map = this.mHeaderMap;
        if (map == null || map.isEmpty()) {
            defaultMaps = getDefaultMaps();
        } else {
            defaultMaps = this.mHeaderMap;
        }
        return stringRestClientService.executeRestClientRequest(defaultMaps, this.mUrl, strPrepareRequestString);
    }

    private Map<String, String> getDefaultMaps() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("Charset", "UTF-8");
        return linkedHashMap;
    }
}

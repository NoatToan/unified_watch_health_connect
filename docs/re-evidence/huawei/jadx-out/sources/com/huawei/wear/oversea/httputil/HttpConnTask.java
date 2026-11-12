package com.huawei.wear.oversea.httputil;

import android.content.Context;
import android.text.TextUtils;
import defpackage.xmq;
import defpackage.xmr;
import defpackage.xmv;
import defpackage.xmw;
import defpackage.xmx;
import defpackage.xnd;
import defpackage.xpf;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HttpConnTask<Result, RequestParams> extends BaseRestClient<Result, RequestParams> {
    private static final String TAG = "HttpConnTask";
    private String commander;
    protected Context mContext;
    private String mUrl;
    private String srcTranID;
    private xmq timeExecuteBuilder;

    protected abstract void onReportEvent(String str, String str2, String str3, String str4, String str5, String str6);

    protected abstract String prepareRequestStr(RequestParams requestparams);

    protected abstract Result readErrorResponse(int i);

    protected abstract Result readSuccessResponse(String str);

    public HttpConnTask(Context context, String str) {
        super(context, str, null, null);
        this.mContext = context;
        this.mUrl = str;
    }

    public HttpConnTask(Context context, String str, int i, int i2) {
        super(context, str, null, null);
        this.mContext = context;
        this.mUrl = str;
    }

    public HttpConnTask(Context context, String str, int i, Map<String, String> map, Map<String, String> map2) {
        super(context, str, map, map2);
        this.mContext = context;
        this.mUrl = str;
        this.mRequestType = i;
    }

    public HttpConnTask(Context context, String str, int i, Map<String, String> map, Map<String, String> map2, String str2) {
        super(context, str, map, map2);
        this.mContext = context;
        this.mUrl = str;
        this.mRequestType = i;
        this.commander = str2;
    }

    public Result processTask(RequestParams requestparams) {
        String strPrepareRequestStr;
        this.timeExecuteBuilder = new xmq();
        if (!xpf.c()) {
            xnd.b(TAG, "processTask  no network ", false);
            logDebugHttpConnTask("processTask, no network." + this.mUrl);
            return readErrorResponse(-1);
        }
        this.timeExecuteBuilder.c(" prepareRequestStr " + System.currentTimeMillis());
        if (requestparams != null) {
            strPrepareRequestStr = prepareRequestStr(requestparams);
            if (strPrepareRequestStr == null) {
                xnd.b(TAG, "processTask, prepareRequestStr is null", false);
                return readErrorResponse(-3);
            }
        } else {
            strPrepareRequestStr = null;
        }
        try {
            preGetWalletReportStr(strPrepareRequestStr);
            this.timeExecuteBuilder.c(" |before open https connection:" + System.currentTimeMillis());
            xnd.c(TAG, "processTask request string " + strPrepareRequestStr, false);
            return excuteRestClient(strPrepareRequestStr);
        } catch (xmx e) {
            onReportEvent("TokenErrorException, " + e.c() + " -7000", "SERVICE_TOKEN_INVALID", this.commander, this.sendMsg, this.srcTranID, "");
            return readErrorResponse(-2);
        }
    }

    private void preGetWalletReportStr(String str) throws xmx {
        if (TextUtils.isEmpty(str)) {
            xnd.b(TAG, "preGetWalletReportStr requestStr is null", false);
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString("data");
            if (TextUtils.isEmpty(strOptString)) {
                xnd.b(TAG, "dataString is null", false);
                return;
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(strOptString).optJSONObject("header");
            if (jSONObjectOptJSONObject == null) {
                xnd.b(TAG, "preGetWalletReportStr null == head", false);
                return;
            }
            this.srcTranID = jSONObjectOptJSONObject.optString("srcTranID");
            this.commander = jSONObjectOptJSONObject.optString("commander");
            Object objOpt = jSONObjectOptJSONObject.opt("serviceTokenAuth");
            Object objOpt2 = jSONObjectOptJSONObject.opt("accessTokenAuth");
            if (objOpt != null && (objOpt instanceof Integer) && ((Integer) objOpt).intValue() == 1048832) {
                throw new xmx("ServiceToken");
            }
            if (objOpt2 != null && (objOpt2 instanceof Integer) && ((Integer) objOpt2).intValue() == 1048832) {
                throw new xmx("AccessToken");
            }
        } catch (JSONException unused) {
            xnd.d(TAG, "Something wrong when get srcTranID and commander", false);
        }
    }

    private Result excuteRestClient(String str) {
        try {
            return doRestClientProcessTask(this.timeExecuteBuilder, str);
        } catch (IOException e) {
            xnd.d(TAG, "processTask IOException : ", true);
            logDebugHttpConnTask("IOException ioEx" + this.mUrl);
            onReportEvent("Send request failed, IOException  RESPONSE_CONNECTION_FAILED_MESSAGE,ioEx error ", String.valueOf(-2), this.commander, this.sendMsg, this.srcTranID, e.getMessage());
            return readErrorResponse(-2);
        } catch (IllegalArgumentException e2) {
            xnd.d(TAG, "processTask IOException : ", true);
            logDebugHttpConnTask("logDebugHttpConnTask(MalformedURLException+mUrl);" + this.mUrl);
            onReportEvent("Send request IllegalArgumentException, RESPONSE_MESSAGE_CONNECTION_FAILED,uEx error ", "RESPONSE_MESSAGE_CONNECTION_FAILED_NO_SUCH_ALGORITHM_EXCEPTION", this.commander, this.sendMsg, this.srcTranID, e2.getMessage());
            return readErrorResponse(-3);
        } catch (MalformedURLException e3) {
            logDebugHttpConnTask("MalformedURLException" + this.mUrl);
            onReportEvent("Send request failed MalformedURLException, RESPONSE_MESSAGE_PARAMS_ERROR_MALFORMED_URL_EXCEPTION,urlEx error ", String.valueOf(1), this.commander, this.sendMsg, this.srcTranID, e3.getMessage());
            return readErrorResponse(-3);
        } catch (xmr unused) {
            xnd.d(TAG, "restClient is null : ", true);
            logDebugHttpConnTask("restClient is null :" + this.mUrl);
            onReportEvent("restClient is null, -10042", "REQUEST_REST_CLIENT_IS_NULL", this.commander, this.sendMsg, this.srcTranID, "");
            return readErrorResponse(-2);
        } catch (xmv unused2) {
            xnd.d(TAG, "submit is null : ", true);
            logDebugHttpConnTask("submit is null :" + this.mUrl);
            Result errorResponse = readErrorResponse(-3);
            onReportEvent("submit is null, -10040,ioEx error ", "RESTCLIENT_RESPONSE_SUBMIT_IS_NULL", this.commander, this.sendMsg, this.srcTranID, "");
            return errorResponse;
        } catch (xmw unused3) {
            xnd.d(TAG, "response is null ", true);
            logDebugHttpConnTask("response is null " + this.mUrl);
            onReportEvent("submit is null, -10041,ioEx error ", "RESPONSE_REST_CLIENT_RESPONSE_NULL", this.commander, this.sendMsg, this.srcTranID, "");
            return readErrorResponse(-2);
        } catch (Exception e4) {
            xnd.d(TAG, "processTask Exception : ", true);
            logDebugHttpConnTask("Exception ex" + this.mUrl);
            onReportEvent("Send request failed, Exception  RESPONSE_CONNECTION_FAILED_MESSAGE,Exception error ", String.valueOf(-2), this.commander, this.sendMsg, this.srcTranID, e4.getMessage());
            return readErrorResponse(-2);
        }
    }

    @Override // com.huawei.wear.oversea.httputil.BaseRestClient
    protected Result handleSucceedResult(String str) {
        Result successResponse = readSuccessResponse(str);
        uploadWalletMsg(str);
        return successResponse;
    }

    private void uploadWalletMsg(String str) {
        if (TextUtils.isEmpty(str)) {
            xnd.b(TAG, "responseStr is null", false);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("response");
            if (!TextUtils.isEmpty(strOptString)) {
                String strOptString2 = new JSONObject(strOptString).optString("returnCode");
                if (!TextUtils.isEmpty(strOptString2) && this.timeExecuteBuilder != null && strOptString2.equals("0")) {
                    return;
                }
            }
            String strOptString3 = jSONObject.optString("errorCode");
            String strOptString4 = jSONObject.optString("errorMsg");
            String strOptString5 = jSONObject.optString("response");
            if (TextUtils.isEmpty(strOptString3)) {
                return;
            }
            xnd.c(TAG, "handleResponse, return code : " + strOptString3 + ", return msg : " + strOptString4, false);
            StringBuilder sb = new StringBuilder("handleResponse, return code : ");
            sb.append(strOptString3);
            onReportEvent(sb.toString(), strOptString3, this.commander, this.receiveMsg, this.srcTranID, "errorMsg: " + strOptString4 + "responseDataStr:" + strOptString5);
        } catch (JSONException unused) {
            xnd.b(TAG, "uploadWalletMsg JSONException", false);
        }
    }

    @Override // com.huawei.wear.oversea.httputil.BaseRestClient
    protected Result handleFailResult(int i, String str, Object obj) {
        String str2 = "url:" + this.mUrl + " rc:" + i;
        xnd.b(TAG, "Service err. handleFailResult resultCode :" + i, false);
        onReportEvent("RESPONSE_MESSAGE_CONNECTION_FAILED", String.valueOf(i), this.commander, this.receiveMsg, this.srcTranID, str2);
        if (i == 410) {
            return readErrorResponse(410);
        }
        return readErrorResponse(-2);
    }

    private void logDebugHttpConnTask(String str) {
        xnd.e(TAG, str);
    }
}

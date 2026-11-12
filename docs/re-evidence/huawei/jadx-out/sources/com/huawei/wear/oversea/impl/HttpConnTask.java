package com.huawei.wear.oversea.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.maps.model.MyLocationStyle;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.wear.oversea.restclient.BaseRestClient;
import defpackage.xmq;
import defpackage.xmr;
import defpackage.xmv;
import defpackage.xmw;
import defpackage.xmx;
import defpackage.xnd;
import defpackage.xno;
import defpackage.xnw;
import defpackage.xnx;
import defpackage.xov;
import defpackage.xpi;
import defpackage.xpn;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HttpConnTask<Result, RequestParams> extends BaseRestClient<Result, RequestParams> {
    private static final int SERVER_OVERLOAD_ERRORCODE = 503;
    private static final String TAG = "HttpConnTask";
    String commander;
    private boolean isSignatureError;
    protected Context mContext;
    private String receiveMsg;
    private String sendMsg;
    String srcTranID;
    private String standardCode;
    private xmq timeExecuteBuilder;

    protected abstract String prepareRequestStr(RequestParams requestparams);

    protected abstract Result readErrorResponse(int i, String str);

    protected abstract Result readSuccessResponse(int i, String str, JSONObject jSONObject);

    public HttpConnTask(Context context, String str) {
        super(context, str, null, null);
        this.receiveMsg = "Recv_http_msg";
        this.sendMsg = "Send_http_msg";
        this.srcTranID = "";
        this.commander = "";
        this.mContext = context;
        this.mUrl = str;
    }

    public Result processTask(RequestParams requestparams) {
        return processTask(requestparams, false);
    }

    public Result processTask(RequestParams requestparams, boolean z) {
        String strPrepareRequestStr;
        Result errorResponse;
        Result errorResponse2;
        String str = TAG;
        xnd.d(str, "processTask isRetry=" + z);
        this.isSignatureError = false;
        this.timeExecuteBuilder = new xmq();
        this.standardCode = "00";
        Result resultPreCheckNetWork = preCheckNetWork();
        if (resultPreCheckNetWork != null) {
            return resultPreCheckNetWork;
        }
        this.timeExecuteBuilder.c(" |prepareRequestStr:" + System.currentTimeMillis());
        if (requestparams != null) {
            strPrepareRequestStr = prepareRequestStr(requestparams);
            if (TextUtils.isEmpty(strPrepareRequestStr) && this.mRequestType == 2) {
                xnd.d(str, "processTask, invalid request params.");
                this.standardCode = "11";
                return readErrorResponse(1, "RESPONSE_MESSAGE_PARAMS_ERROR");
            }
        } else {
            strPrepareRequestStr = null;
        }
        try {
            preGetWalletReportStr(strPrepareRequestStr);
            xnd.c(str, "http request start, start connect", false);
            this.timeExecuteBuilder.c(" |before open https connection:" + System.currentTimeMillis());
            xnd.c(str, "processTask request string : " + strPrepareRequestStr, false);
            try {
                errorResponse2 = doRestClientProcessTask(this.timeExecuteBuilder, strPrepareRequestStr);
            } catch (IllegalArgumentException e) {
                xnd.d(TAG, "Request Http IllegalArgumentException", true);
                this.standardCode = "18";
                errorResponse = readErrorResponse(-13, "IllegalArgumentException.");
                onReportEvent("Send request IllegalArgumentException, RESPONSE_MESSAGE_CONNECTION_FAILED,uEx error ", "RESPONSE_MESSAGE_CONNECTION_FAILED_NO_SUCH_ALGORITHM_EXCEPTION", this.commander, this.sendMsg, this.srcTranID, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                errorResponse2 = errorResponse;
            } catch (MalformedURLException e2) {
                xnd.d(TAG, "processTask url invalid.", false);
                this.standardCode = "11";
                StringBuilder sb = new StringBuilder("RESPONSE_MESSAGE_PARAMS_ERROR_MALFORMED_URL_EXCEPTION,urlEx = ");
                sb.append(!TextUtils.isEmpty(e2.getMessage()) ? e2.getMessage() : "");
                errorResponse = readErrorResponse(1, sb.toString());
                onReportEvent("Send request failed MalformedURLException, RESPONSE_MESSAGE_PARAMS_ERROR_MALFORMED_URL_EXCEPTION,urlEx error ", String.valueOf(1), this.commander, this.sendMsg, this.srcTranID, !TextUtils.isEmpty(e2.getMessage()) ? e2.getMessage() : "");
                errorResponse2 = errorResponse;
            } catch (SocketTimeoutException e3) {
                xnd.a(TAG, "Request Http RestClient timeout.", e3, true);
                onReportEvent("Send request timeout, RESPONSE_CONNECTION_TIMEOUT_MESSAGE,tEx error ", String.valueOf(-11), this.commander, this.sendMsg, this.srcTranID, !TextUtils.isEmpty(e3.getMessage()) ? e3.getMessage() : "");
                this.standardCode = "16";
                errorResponse2 = readErrorResponse(-11, "RESPONSE_CONNECTION_TIMEOUT_MESSAGESocketTimeoutException.");
            } catch (UnknownHostException e4) {
                xnd.a(TAG, "Request Http RestClient UnknownHost.", e4, true);
                this.standardCode = "17";
                errorResponse = readErrorResponse(-12, "UnknownHostException.");
                onReportEvent("Send request UnknownHost, RESPONSE_CONNECTION_UNKNOWNHOST_MESSAGE,uEx error ", String.valueOf(-12), this.commander, this.sendMsg, this.srcTranID, !TextUtils.isEmpty(e4.getMessage()) ? e4.getMessage() : "");
                errorResponse2 = errorResponse;
            } catch (IOException e5) {
                xnd.a(TAG, "processTask IOException : ", e5, true);
                this.standardCode = "19";
                StringBuilder sb2 = new StringBuilder("RESPONSE_CONNECTION_FAILED_MESSAGE,ioEx = ");
                sb2.append(TextUtils.isEmpty(e5.getMessage()) ? "" : e5.getMessage());
                errorResponse2 = readErrorResponse(-2, sb2.toString());
                onReportEvent("Send request failed, IOException  RESPONSE_CONNECTION_FAILED_MESSAGE,ioEx error ", String.valueOf(-2), this.commander, this.sendMsg, this.srcTranID, "IOException in processTask");
            } catch (xmr unused) {
                xnd.d(TAG, "restClient is null : ", false);
                onReportEvent("restClient is null, -10042", "REQUEST_REST_CLIENT_IS_NULL", this.commander, this.sendMsg, this.srcTranID, "");
                this.standardCode = "13";
                return readErrorResponse(-10042, "restClient is null.");
            } catch (xmv unused2) {
                onReportEvent("submit is null, -10040,ioEx error ", "RESTCLIENT_RESPONSE_SUBMIT_IS_NULL", this.commander, this.sendMsg, this.srcTranID, "");
                xnd.d(TAG, "submit is null", false);
                this.standardCode = "13";
                return readErrorResponse(-4, "submit is null");
            } catch (xmw unused3) {
                onReportEvent("submit is null, -10041,ioEx error ", "RESPONSE_REST_CLIENT_RESPONSE_NULL", this.commander, this.sendMsg, this.srcTranID, "");
                this.standardCode = "14";
                return readErrorResponse(-4, "RESPONSE_MESSAGE_SERVER_OVERLOAD_ERROR");
            } catch (Exception e6) {
                xnd.d(TAG, "processTask IOException : ", true);
                this.standardCode = "19";
                StringBuilder sb3 = new StringBuilder("RESPONSE_CONNECTION_FAILED_MESSAGE,Exception = ");
                sb3.append(!TextUtils.isEmpty(e6.getMessage()) ? e6.getMessage() : "");
                errorResponse = readErrorResponse(-2, sb3.toString());
                onReportEvent("Send request failed, Exception  RESPONSE_CONNECTION_FAILED_MESSAGE,Exception error ", String.valueOf(-2), this.commander, this.sendMsg, this.srcTranID, !TextUtils.isEmpty(e6.getMessage()) ? e6.getMessage() : "");
                errorResponse2 = errorResponse;
            }
            if (!this.isSignatureError || z) {
                return errorResponse2;
            }
            xnd.d(TAG, "commander:" + this.commander + " try again");
            return processTask(requestparams, true);
        } catch (xmx e7) {
            onReportEvent("TokenErrorException, " + e7.c() + " -7000", "SERVICE_TOKEN_INVALID", this.commander, this.sendMsg, this.srcTranID, "");
            this.standardCode = "12";
            return readErrorResponse(-7000, "SERVICE_TOKEN_INVALID");
        }
    }

    private Result preCheckNetWork() {
        if (NetworkUtil.isNetworkAvailable(this.mContext)) {
            return null;
        }
        xnd.d(TAG, "processTask, no network.", false);
        this.standardCode = "15";
        return readErrorResponse(-1, "RESPONSE_MESSAGE_NO_NETWORK_FAILED");
    }

    private void preGetWalletReportStr(String str) throws xmx {
        if (TextUtils.isEmpty(str)) {
            xnd.b(TAG, "preGetWalletReportStr requestStr is null", false);
            return;
        }
        try {
            String strD = xpn.d(new JSONObject(str), "data");
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = xpn.d(new JSONObject(strD), "header");
            if (TextUtils.isEmpty(strD2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strD2);
            this.srcTranID = xpn.d(jSONObject, "srcTranID");
            this.commander = xpn.d(jSONObject, "commander");
            Object objOpt = jSONObject.opt("serviceTokenAuth");
            Object objOpt2 = jSONObject.opt("accessTokenAuth");
            if (objOpt != null && (objOpt instanceof Integer) && ((Integer) objOpt).intValue() == 1048832) {
                xnd.b(TAG, "not login,serviceTokenValue=null", false);
                throw new xmx("ServiceToken");
            }
            if (objOpt2 != null && (objOpt2 instanceof Integer) && ((Integer) objOpt2).intValue() == 1048832) {
                xnd.b(TAG, "not login,accessTokenValue=null", false);
                throw new xmx("AccessToken");
            }
        } catch (JSONException e) {
            xnd.d(TAG, "Something wrong when get srcTranID and commander", false);
            onReportEvent("Something wrong when get srcTranID", "-1", this.commander, this.sendMsg, this.srcTranID, e.getMessage());
        }
    }

    @Override // com.huawei.wear.oversea.restclient.BaseRestClient
    public Result handleSucceedResult(String str) {
        Result resultHandleResponse = handleResponse(str, this.srcTranID, this.commander);
        xnd.c(TAG, "HttpConnTaskprocessTask json string : " + str, false);
        return resultHandleResponse;
    }

    @Override // com.huawei.wear.oversea.restclient.BaseRestClient
    public Result handleFailResult(int i, String str, Object obj) {
        if (503 == i) {
            xnd.d(TAG, "processTask resultCode=SERVER_OVERLOAD_ERRORCODE.", false);
            this.standardCode = "14";
            Result errorResponse = readErrorResponse(-4, "RESPONSE_MESSAGE_SERVER_OVERLOAD_ERROR,code: 503,msg: " + str);
            onReportEvent("RESPONSE_MESSAGE_SERVER_OVERLOAD_ERROR", String.valueOf(i), this.commander, this.sendMsg, this.srcTranID, "");
            return errorResponse;
        }
        xnd.d(TAG, "processTask resultCode=" + i, false);
        this.standardCode = "19";
        Result errorResponse2 = readErrorResponse(-2, "RESPONSE_MESSAGE_CONNECTION_FAILED,code: " + i + ",msg: " + str);
        onReportEvent("RESPONSE_MESSAGE_CONNECTION_FAILED", String.valueOf(i), this.commander, this.sendMsg, this.srcTranID, "");
        return errorResponse2;
    }

    protected String getStandardCode() {
        return this.standardCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected Result handleResponse(String str, String str2, String str3) {
        JSONObject jSONObject;
        String strD;
        int i;
        int i2;
        int i3;
        String str4 = TAG;
        xnd.c(str4, "handleResponse response str : " + str, true);
        if (str == null) {
            onReportEvent("Error with unknown", String.valueOf(-99), str3, this.receiveMsg, str2, "");
            this.standardCode = "21";
            return readSuccessResponse(-99, null, null);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            int iB = xpn.b(jSONObject2, "keyIndex");
            String strD2 = xpn.d(jSONObject2, "merchantID");
            String strD3 = xpn.d(jSONObject2, "errorCode");
            String strD4 = xpn.d(jSONObject2, "errorMsg");
            String strD5 = xpn.d(jSONObject2, "response");
            if (strD3 != null) {
                xnd.e(str4, "handleResponse, return code : " + strD3 + ", return msg : " + strD4, false);
                int i4 = Integer.parseInt(strD3);
                onReportEvent("handleResponse, return code : " + strD3 + ", return msg : " + strD4, strD3, str3, this.receiveMsg, str2, "");
                this.standardCode = "23";
                return readSuccessResponse(i4, strD4, null);
            }
            if (xov.a().equals(strD2) && -1 == iB && !xpi.d(strD5, true)) {
                xnd.c(str4, "handleResponse, responseDataStr : " + strD5, true);
                jSONObject = new JSONObject(strD5);
                try {
                    try {
                        String strD6 = xpn.d(jSONObject, "returnCode");
                        if (strD6 == null) {
                            xnd.c(str4, "handleResponse, returnCode is invalid.", false);
                            onReportEvent("handleResponse, returnCode is invalid.", String.valueOf(-99), str3, this.receiveMsg, str2, "");
                            this.standardCode = "22";
                            return readSuccessResponse(-99, "handleResponse, returnCode is invalid.", null);
                        }
                        if (isNumber(strD6)) {
                            i3 = Integer.parseInt(strD6);
                        } else {
                            try {
                                if (xpi.d(strD6)) {
                                    if (strD6.startsWith("0X") || strD6.startsWith("0x")) {
                                        strD6 = strD6.substring(2, strD6.length());
                                    }
                                    i3 = Integer.parseInt(strD6, 16);
                                } else if (strD6.startsWith(ExifInterface.GPS_DIRECTION_TRUE)) {
                                    i3 = Integer.parseInt(strD6.substring(1, strD6.length()));
                                } else {
                                    i3 = -98;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                        this.standardCode = "24";
                        strD = xpn.d(jSONObject, "returnDesc");
                        onReportEvent(strD, String.valueOf(i3), str3, this.receiveMsg, str2, "");
                        i2 = i3;
                        Result successResponse = readSuccessResponse(i2, strD, jSONObject);
                        if (successResponse instanceof xnw) {
                            xnw xnwVar = (xnw) successResponse;
                            if (xnwVar.d() == null) {
                                setErrorInfo(jSONObject, xnwVar);
                            }
                        }
                        return successResponse;
                    } catch (NumberFormatException e) {
                        e = e;
                        xnd.d(TAG, "readSuccessResponse, NumberFormatException : ", true);
                        String str5 = ((String) null) + "readSuccessResponse, NumberFormatException error ";
                        this.standardCode = "22";
                        i = -99;
                        onReportEvent("readSuccessResponse, NumberFormatException error ", String.valueOf(-99), str3, this.receiveMsg, str2, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                        strD = str5;
                        i2 = i;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    xnd.d(TAG, "readSuccessResponse, JSONException : ", true);
                    String str6 = ((String) null) + "readSuccessResponse, JSONException error ";
                    this.standardCode = "22";
                    onReportEvent("readSuccessResponse, JSONException error ", String.valueOf(-99), str3, this.receiveMsg, str2, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                    strD = str6;
                    i = -99;
                    i2 = i;
                }
            }
            xnd.c(str4, "handleResponse, unexpected error from server.", false);
            onReportEvent("handleResponse, unexpected error from server.", String.valueOf(-99), str3, this.receiveMsg, str2, "");
            this.standardCode = "22";
            return readSuccessResponse(-99, "handleResponse, unexpected error from server.", null);
        } catch (NumberFormatException e3) {
            e = e3;
            jSONObject = null;
        } catch (JSONException e4) {
            e = e4;
            jSONObject = null;
        }
    }

    public boolean isNumber(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            long j = Long.parseLong(str);
            Long lValueOf = Long.valueOf(j);
            lValueOf.getClass();
            if (j > 2147483647L) {
                return false;
            }
            lValueOf.getClass();
            return j >= -2147483648L;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    protected void setErrorInfo(JSONObject jSONObject, xnw xnwVar) {
        xno xnoVarB;
        if (jSONObject != null && jSONObject.has(MyLocationStyle.ERROR_INFO)) {
            try {
                xnoVarB = xno.b(jSONObject.getJSONObject(MyLocationStyle.ERROR_INFO));
            } catch (JSONException unused) {
                xnd.d(TAG, "setErrorInfo, JSONException", false);
                xnwVar.f53201b = -99;
                xnoVarB = null;
            }
            xnwVar.c(xnoVarB);
        }
    }

    private void onReportEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = "commander:" + str3 + "; srcTranID:" + str5 + ";  ; result:" + str + "; returnCode:" + str2 + "; ";
        xnd.b(TAG, "HttpConnTask onReportEvent, action:" + str4 + ", Report data: " + str7, false);
        xnx.b(str4, str7 + " exception:" + str6);
    }
}

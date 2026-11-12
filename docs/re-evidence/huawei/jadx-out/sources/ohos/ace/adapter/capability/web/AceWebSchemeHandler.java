package ohos.ace.adapter.capability.web;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebSchemeHandler {
    private static final String LOG_TAG = "AceWebSchemeHandler";
    private static final int WEB_ERROR_CODE = -104;
    private boolean isMainFrame;
    private boolean isRedirect;
    private boolean isRequestGesture;
    private Map<String, String> requestHeaders;
    private String requestMethod;
    private String requestUrl;
    private Map<String, String> responseHeaders;
    private WebResourceResponse response = null;
    private int errorCode = 0;
    private String errorInfo = "";
    private String responseUrl = "";
    private String responseMimeType = "";
    private String responseEncoding = "";
    private int responseStatusCode = 0;
    private String responseReason = "";
    private String responseData = "";
    private boolean isFinished = false;
    private boolean isResponseFail = false;
    private int responseErrorCode = 0;
    private String responseErrorInfo = "";
    private boolean isReceiveResponseFinished = false;

    public AceWebSchemeHandler(WebResourceRequest webResourceRequest) {
        this.requestUrl = "";
        this.requestMethod = "";
        this.isRequestGesture = false;
        this.isMainFrame = false;
        this.isRedirect = false;
        if (webResourceRequest == null) {
            ALog.e(LOG_TAG, "AceWebSchemeHandler: request is null");
            return;
        }
        this.requestUrl = webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "";
        this.requestMethod = webResourceRequest.getMethod() != null ? webResourceRequest.getMethod().toString() : "";
        this.isRequestGesture = webResourceRequest.hasGesture();
        this.isMainFrame = webResourceRequest.isForMainFrame();
        this.isRedirect = webResourceRequest.isRedirect();
        this.requestHeaders = webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new HashMap<>();
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public String getMethod() {
        return this.requestMethod;
    }

    public boolean isRequestGesture() {
        return this.isRequestGesture;
    }

    public boolean isMainFrame() {
        return this.isMainFrame;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public Map<String, String> getRequestHeader() {
        return this.requestHeaders;
    }

    public WebResourceResponse getResponse() {
        try {
            if (this.responseErrorCode != 0) {
                this.isResponseFail = true;
                WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8)));
                this.response = webResourceResponse;
                return webResourceResponse;
            }
            this.response = new WebResourceResponse(this.responseMimeType, this.responseEncoding, this.responseStatusCode, this.responseReason, this.responseHeaders, new ByteArrayInputStream(this.responseData.getBytes(StandardCharsets.UTF_8)));
            return this.response;
        } catch (IllegalArgumentException e) {
            ALog.e(LOG_TAG, "getResponse throw IllegalArgumentException " + e);
            this.isResponseFail = true;
            this.response = new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8)));
        }
    }

    public void didFail(int i, String str, boolean z) {
        this.errorCode = i;
        if (str == null) {
            str = "";
        }
        this.errorInfo = str;
        if (i != 0) {
            this.isResponseFail = true;
        }
        if (this.isReceiveResponseFinished || !z) {
            return;
        }
        ALog.e(LOG_TAG, "getResponse didReceiveResponse is not finished");
        this.errorCode = -104;
        this.errorInfo = "ERR_CONNECTION_FAILED";
        this.isResponseFail = true;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }

    public void setResponseUrl(String str) {
        if (str == null) {
            str = "";
        }
        this.responseUrl = str;
    }

    public String getResponseUrl() {
        return this.responseUrl;
    }

    public void setResponse(String str, String str2, int i, String str3, HashMap<String, String> map, String str4) {
        this.responseMimeType = str;
        this.responseEncoding = str2;
        this.responseStatusCode = i;
        this.responseReason = str3;
        this.responseData = str4;
        this.responseHeaders = map;
        this.isReceiveResponseFinished = true;
    }

    public void setResponseData(String str) {
        if (str == null) {
            str = "";
        }
        this.responseData = str;
    }

    public void setResponseFinish(boolean z) {
        this.isFinished = z;
    }

    public boolean getResponseFinish() {
        return this.isFinished;
    }

    public boolean getResponseFail() {
        return this.isResponseFail;
    }

    public void setResponseFail(int i, String str) {
        this.responseErrorCode = i;
        if (str == null) {
            str = "";
        }
        this.responseErrorInfo = str;
        if (i != 0) {
            this.isResponseFail = true;
        }
    }

    public int getResponseErrCode() {
        return this.responseErrorCode;
    }

    public String getResponseErrInfo() {
        return this.responseErrorInfo;
    }
}

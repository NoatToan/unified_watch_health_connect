package ohos.ace.adapter.capability.web;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebHttpErrorReceiveObject extends AceWebResourceRequestObject {
    private static final String LOG_TAG = "AceWebHttpErrorReceiveObject";
    private WebResourceResponse response;

    public AceWebHttpErrorReceiveObject(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super(webResourceRequest);
        this.response = webResourceResponse;
    }

    public String getResponseMimeType() {
        if (this.response.getMimeType() != null) {
            return this.response.getMimeType().toString();
        }
        return "";
    }

    public String getResponseEncoding() {
        if (this.response.getEncoding() != null) {
            return this.response.getEncoding().toString();
        }
        return "";
    }

    public int getResponseCode() {
        return this.response.getStatusCode();
    }

    public String getResponseData() {
        if (this.response.getData() != null) {
            return this.response.getData().toString();
        }
        return "";
    }

    public String getReason() {
        if (this.response.getReasonPhrase() != null) {
            return this.response.getReasonPhrase();
        }
        return "";
    }

    public Map<String, String> getResponseHeader() {
        if (this.response.getResponseHeaders() != null) {
            return this.response.getResponseHeaders();
        }
        return new HashMap();
    }
}

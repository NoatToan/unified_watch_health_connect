package ohos.ace.adapter.capability.web;

import android.webkit.WebResourceRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebResourceRequestObject {
    private WebResourceRequest request;

    public AceWebResourceRequestObject(WebResourceRequest webResourceRequest) {
        this.request = webResourceRequest;
    }

    public String getRequestUrl() {
        if (this.request.getUrl() != null) {
            return this.request.getUrl().toString();
        }
        return "";
    }

    public String getMethod() {
        if (this.request.getMethod() != null) {
            return this.request.getMethod().toString();
        }
        return "";
    }

    public boolean isRequestGesture() {
        return this.request.hasGesture();
    }

    public boolean isMainFrame() {
        return this.request.isForMainFrame();
    }

    public boolean isRedirect() {
        return this.request.isRedirect();
    }

    public Map<String, String> getRequestHeader() {
        if (this.request.getRequestHeaders() != null) {
            return this.request.getRequestHeaders();
        }
        return new HashMap();
    }
}

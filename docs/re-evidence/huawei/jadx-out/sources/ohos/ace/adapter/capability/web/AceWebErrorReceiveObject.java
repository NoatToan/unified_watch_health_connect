package ohos.ace.adapter.capability.web;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebErrorReceiveObject extends AceWebResourceRequestObject implements IAceWebErrorReceiveObject {
    private static final String LOG_TAG = "AceWebErrorReceiveObject";
    private WebResourceError error;
    private int errorCode;
    private String errorInfo;

    public AceWebErrorReceiveObject(int i, String str, WebResourceRequest webResourceRequest) {
        super(webResourceRequest);
        this.errorCode = i;
        this.errorInfo = str;
    }

    @Override // ohos.ace.adapter.capability.web.IAceWebErrorReceiveObject
    public String getErrorInfo() {
        return this.errorInfo;
    }

    @Override // ohos.ace.adapter.capability.web.IAceWebErrorReceiveObject
    public int getErrorCode() {
        return this.errorCode;
    }
}

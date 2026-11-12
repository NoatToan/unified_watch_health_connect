package miuipub.hybrid;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class Request {
    private String action;
    private Callback callback;
    private NativeInterface nativeInterface;
    private PageContext pageContext;
    private String rawParams;
    private WebView view;

    public String getAction() {
        return this.action;
    }

    public Callback getCallback() {
        return this.callback;
    }

    public NativeInterface getNativeInterface() {
        return this.nativeInterface;
    }

    public PageContext getPageContext() {
        return this.pageContext;
    }

    public String getRawParams() {
        return this.rawParams;
    }

    public WebView getView() {
        return this.view;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setNativeInterface(NativeInterface nativeInterface) {
        this.nativeInterface = nativeInterface;
    }

    public void setPageContext(PageContext pageContext) {
        this.pageContext = pageContext;
    }

    public void setRawParams(String str) {
        this.rawParams = str;
    }

    public void setView(WebView webView) {
        this.view = webView;
    }
}

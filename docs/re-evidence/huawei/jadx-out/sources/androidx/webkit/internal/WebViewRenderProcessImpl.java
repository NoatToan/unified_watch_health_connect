package androidx.webkit.internal;

import androidx.webkit.WebViewRenderProcess;
import defpackage.kh;
import defpackage.zuq;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: loaded from: classes21.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {
    private static final WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> sFrameworkMap = new WeakHashMap<>();
    private WebViewRendererBoundaryInterface mBoundaryInterface;
    private WeakReference<android.webkit.WebViewRenderProcess> mFrameworkObject;

    public WebViewRenderProcessImpl(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.mBoundaryInterface = webViewRendererBoundaryInterface;
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.mFrameworkObject = new WeakReference<>(webViewRenderProcess);
    }

    public static WebViewRenderProcessImpl forInvocationHandler(InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) zuq.c(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable() { // from class: androidx.webkit.internal.WebViewRenderProcessImpl$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WebViewRenderProcessImpl.lambda$forInvocationHandler$0(webViewRendererBoundaryInterface);
            }
        });
    }

    static /* synthetic */ Object lambda$forInvocationHandler$0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) throws Exception {
        return new WebViewRenderProcessImpl(webViewRendererBoundaryInterface);
    }

    public static WebViewRenderProcessImpl forFrameworkObject(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> weakHashMap = sFrameworkMap;
        WebViewRenderProcessImpl webViewRenderProcessImpl = weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    @Override // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
        ApiFeature.Q q = WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE;
        if (q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcessJ_ = kh.J_(this.mFrameworkObject.get());
            return webViewRenderProcessJ_ != null && ApiHelperForQ.terminate(webViewRenderProcessJ_);
        }
        if (q.isSupportedByWebView()) {
            return this.mBoundaryInterface.terminate();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}

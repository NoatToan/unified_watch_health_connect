package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mipay.sdk.app.MipayWebActivity;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;

/* JADX INFO: loaded from: classes.dex */
public class pbr implements HybridFeature {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f30220a;

        public a(WebView webView) {
            this.f30220a = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f30220a;
            if (webView != null) {
                webView.clearHistory();
            }
        }
    }

    public static /* synthetic */ void c(MipayWebActivity mipayWebActivity, WebView webView, boolean z) {
        try {
            if (mipayWebActivity.getApplicationInfo().targetSdkVersion >= 33 && Build.VERSION.SDK_INT >= 33) {
                webView.getSettings().setAlgorithmicDarkeningAllowed(z);
            } else if (Build.VERSION.SDK_INT >= 29) {
                webView.setForceDarkAllowed(z);
                webView.getSettings().setForceDark(z ? 2 : 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final Response b(Request request) {
        request.getNativeInterface().getActivity().runOnUiThread(new a(request.getView()));
        return new Response(0);
    }

    public final Response d(Request request) {
        String rawParams = request.getRawParams();
        if (!"true".equalsIgnoreCase(rawParams) && !"false".equalsIgnoreCase(rawParams)) {
            return new Response(204, "invalid param");
        }
        final boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(rawParams);
        final MipayWebActivity mipayWebActivity = (MipayWebActivity) request.getNativeInterface().getActivity();
        final WebView view = request.getView();
        if (view == null || mipayWebActivity == null || mipayWebActivity.isFinishing() || mipayWebActivity.isDestroyed()) {
            return new Response(204, "illegal state");
        }
        mipayWebActivity.runOnUiThread(new Runnable() { // from class: obr
            @Override // java.lang.Runnable
            public final void run() {
                pbr.c(mipayWebActivity, view, zEqualsIgnoreCase);
            }
        });
        return new Response(0);
    }

    @Override // miuipub.hybrid.HybridFeature
    public HybridFeature.Mode getInvocationMode(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "clearHistory") || TextUtils.equals(action, "setForceDarkAllowed")) {
            return HybridFeature.Mode.SYNC;
        }
        return null;
    }

    @Override // miuipub.hybrid.HybridFeature
    public Response invoke(Request request) {
        String action = request.getAction();
        if (TextUtils.equals(action, "clearHistory")) {
            return b(request);
        }
        if (TextUtils.equals(action, "setForceDarkAllowed")) {
            return d(request);
        }
        return new Response(200, "action not support: " + action);
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.UriConstants;
import com.huawei.ui.thirdpartservice.R;
import health.compact.a.GRSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICloudOperationResult<String> f52614a;
    private WebView e;

    public wzi(WebView webView, ICloudOperationResult<String> iCloudOperationResult) {
        this.e = webView;
        this.f52614a = iCloudOperationResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        WebView webView = this.e;
        if (webView == null) {
            LogUtil.e("OpenAuthService", "WebView is null");
        } else {
            webView.loadUrl(a(), e());
            this.e.setWebViewClient(new WebViewClient() { // from class: wzi.4
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    LogUtil.a("OpenAuthService", "response = ", str);
                    String queryParameter = Uri.parse(str).getQueryParameter("code");
                    if (wzi.this.f52614a != null) {
                        LogUtil.d("OpenAuthService", "parse code = ", queryParameter);
                        boolean zIsEmpty = TextUtils.isEmpty(queryParameter);
                        ICloudOperationResult iCloudOperationResult = wzi.this.f52614a;
                        if (zIsEmpty) {
                            queryParameter = null;
                        }
                        iCloudOperationResult.operationResult(str, queryParameter, !zIsEmpty);
                    }
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    super.onPageFinished(webView2, str);
                    LogUtil.d("OpenAuthService", "onPageFinished:", str);
                }
            });
        }
    }

    private Map<String, String> e() {
        HashMap map = new HashMap();
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015));
        return map;
    }

    private String a() {
        StringBuilder sb = new StringBuilder(GRSManager.c(BaseApplication.getContext()).getUrl("domainAccessTokenUrl") + UriConstants.OAUTH_URL_AUTHORIZE);
        sb.append("?response_type=code&access_type=offline&state=state_parameter_passthrough_value&client_id=105901045&redirect_uri=hms://localhost/&");
        sb.append(b());
        sb.append("&display=touch");
        LogUtil.d("OpenAuthService", "buildAuthUrl = ", sb.toString());
        return sb.toString();
    }

    private String b() {
        String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.wx_auth_scope);
        StringBuilder sb = new StringBuilder("scope=openid");
        for (String str : stringArray) {
            sb.append(" ");
            sb.append(str);
        }
        return sb.toString();
    }
}

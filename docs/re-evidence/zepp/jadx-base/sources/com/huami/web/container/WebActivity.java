package com.huami.web.container;

import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.WebLoadCallback;
import com.huami.discovery.bridge.jsbridge.JsBridgeNativeAPI;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.discovery.bridge.util.NetUtil;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.download.CustomDownloadHandler;
import com.huami.web.container.event.EventWeChatResp;
import com.huami.web.container.event.EventWebViewExit;
import com.huami.web.container.jsbridge.JsBridgeAdapter;
import com.huami.web.container.utils.UtilsKt;
import com.huami.web.service.event.EventWebActivityFinish;
import com.huami.widget.share.FunctionActionListener;
import com.huami.widget.share.FunctionItem;
import com.huami.widget.share.FunctionSheet;
import com.huami.widget.share.FunctionType;
import com.huami.widget.share.ShareContent;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import de.greenrobot.event.EventBus;
import defpackage.yp8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class WebActivity extends BaseTitleActivity {
    private static final String C = "WebActivity";
    private static final String D = "com.xiaomi.hm.health.action.WEB_URL";
    private static final String E = "Title";
    public static final String KEY_WEB_ITEM = "WEB_ITEM";
    private FunctionActionListener A = new a();
    private boolean B;
    public WebFragment mWebFragment;
    private WebItem x;
    private ProgressBar y;
    private FunctionSheet z;

    public class a implements FunctionActionListener {
        public a() {
        }

        @Override // com.huami.widget.share.ShareListener
        public void onFailed(int i, String str) {
            HMLog.e(WebActivity.C, "onFailed:" + str, new Object[0]);
        }

        @Override // com.huami.widget.share.FunctionActionListener
        public void onFunctionItemClicked(FunctionItem functionItem) {
            HMLog.e(WebActivity.C, "onFunctionItemClicked:" + functionItem.title, new Object[0]);
            if (functionItem.getFunctionType() == FunctionType.refresh) {
                WebActivity.this.mWebFragment.reload();
            }
        }

        @Override // com.huami.widget.share.ShareListener
        public ShareContent onShareContentCreated(int i) {
            HMLog.e(WebActivity.C, "onShareContentCreated:" + i, new Object[0]);
            return null;
        }

        @Override // com.huami.widget.share.ShareListener
        public void onStart(int i) {
            HMLog.e(WebActivity.C, "onStart:" + i, new Object[0]);
            WebActivity.this.z.shareTo(WebActivity.this.s(i));
        }

        @Override // com.huami.widget.share.ShareListener
        public void onSuccess(int i) {
            HMLog.e(WebActivity.C, "onSuccess:" + i, new Object[0]);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebActivity.this.w();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebActivity.this.onBackPressed();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebActivity.this.finish();
        }
    }

    public class e implements WebLoadCallback {
        public e() {
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onError(int i) {
            WebActivity.this.y.setVisibility(4);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onPageFinish() {
            WebActivity.this.y.setVisibility(4);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onPageStart() {
            WebActivity.this.y.setVisibility(0);
            WebActivity.this.y();
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onProgressChanged(int i) {
            WebActivity.this.y.setProgress(i);
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public void onReceivedTitle(String str) {
            if (WebActivity.this.x != null && WebActivity.this.x.isFromHomePopup() && URLUtil.isValidUrl(str)) {
                WebActivity.this.setTitleText("");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                WebActivity.this.setTitleText(str);
            }
        }

        @Override // com.huami.discovery.bridge.WebLoadCallback
        public /* synthetic */ void onSslError(SslError sslError) {
            yp8.a(this, sslError);
        }
    }

    public class f extends JsBridgeAdapter {
        public f(BaseTitleActivity baseTitleActivity) {
            super(baseTitleActivity);
        }

        @Override // com.huami.web.container.jsbridge.JsBridgeAdapter, com.huami.discovery.bridge.jsbridge.JsBridgeCallback
        public void loadPage(String str) {
            WebActivity.this.mWebFragment.loadPage(str);
        }

        @Override // com.huami.web.container.jsbridge.JsBridgeAdapter, com.huami.discovery.bridge.jsbridge.JsBridgeCallback
        public void onFinishActivity() {
            if (WebActivity.this.x.isShouldNotifyFinish) {
                EventBus.getDefault().post(new EventWebViewExit());
            }
            super.onFinishActivity();
        }

        @Override // com.huami.web.container.jsbridge.JsBridgeAdapter, com.huami.discovery.bridge.jsbridge.JsBridgeCallback
        public void setIsRefresh(boolean z) {
            WebActivity.this.mWebFragment.setIsRefresh(z);
        }
    }

    public class g extends BraceletAdapter {
        public g(BaseTitleActivity baseTitleActivity) {
            super(baseTitleActivity);
        }

        @Override // com.huami.web.container.BraceletAdapter
        public String getWebUrl() {
            return WebActivity.this.x.url;
        }

        @Override // com.huami.web.container.BraceletAdapter
        public WebView getWebView() {
            return WebActivity.this.mWebFragment.getWebView();
        }

        @Override // com.huami.web.container.BraceletAdapter
        public void loadPage(String str) {
            WebActivity.this.mWebFragment.loadPage(str);
        }
    }

    public static void launch(Context context, @NotNull String str, boolean z) {
        WebItem webItem = new WebItem();
        webItem.url = str;
        webItem.isShouldNotifyFinish = z;
        launch(context, webItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public ShareContent s(int i) {
        View viewFindViewById = findViewById(R.id.web_container);
        ShareContent shareContent = new ShareContent();
        shareContent.title = this.x.getShareTitle();
        shareContent.topic = this.x.getShareSubtitle();
        shareContent.url = this.x.getShareUrl();
        if (viewFindViewById != null) {
            HMLog.e(C, "Capture View!!", new Object[0]);
            shareContent.bitmapUrl = UtilsKt.captureViewShare(viewFindViewById, this);
        }
        HMLog.e(C, "onPreShareItem shareToUrl: " + shareContent.url + ", shareToBitmapUrl: " + shareContent.bitmapUrl, new Object[0]);
        shareContent.content = "";
        return shareContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        onBackPressed();
    }

    private void u() {
        overridePendingTransition(R.anim.anim_bottom_in, R.anim.anim_no);
    }

    private void v() {
        overridePendingTransition(R.anim.anim_no, R.anim.anim_bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        FunctionSheet functionSheetNewInstance = FunctionSheet.newInstance(this.x.isShareable());
        this.z = functionSheetNewInstance;
        functionSheetNewInstance.setFunctionListener(this.A);
        this.z.show(getSupportFragmentManager(), "");
    }

    private void x() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        WebFragment webFragmentNewInstance = WebFragment.newInstance(this.x);
        this.mWebFragment = webFragmentNewInstance;
        fragmentTransactionBeginTransaction.replace(R.id.web_container, webFragmentNewInstance);
        fragmentTransactionBeginTransaction.commit();
        this.mWebFragment.setWebDownloadCallback(new CustomDownloadHandler(this.x, this));
        this.mWebFragment.setLoadingCallback(new e());
        this.mWebFragment.setJsBridgeCallback(new f(this));
        this.mWebFragment.setBraceletCallback(new g(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        boolean z = !RainbowUtils.isDarkMode(this);
        int color = ContextCompat.getColor(this, R.color.s38);
        WebItem webItem = this.x;
        if (webItem.titleBarStyle == 3) {
            setStyle(BaseTitleActivity.STYLE.NONE, 0, false);
            return;
        }
        if (webItem.isFromHomePopup()) {
            setStyle(BaseTitleActivity.STYLE.SINGLE_TITLE, color, "", z);
            setBaseTitleColor(ContextCompat.getColor(this, R.color.s1));
            getRightImage().setImageResource(R.drawable.ic_home_popup_close);
            getRightImage().setOnClickListener(new View.OnClickListener() { // from class: qp8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.t(view);
                }
            });
            return;
        }
        if (GlobalConfig.get().isBuildMidong()) {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, color, "", z);
            setBaseTitleColor(ContextCompat.getColor(this, R.color.s1));
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, color, "", z);
            setBaseTitleColor(ContextCompat.getColor(this, R.color.s1));
        }
        if (this.x.isShowMore) {
            setRightImageRes(R.drawable.common_title_more, R.color.s1);
            getRightImage().setOnClickListener(new b());
        }
        int i = R.drawable.arrow_back_black;
        int i2 = R.color.s1;
        setLeftImageRes(i, i2);
        setLeftImageRes2(R.drawable.icon_common_close, i2);
        getLeft().setOnClickListener(new c());
        getLeft2().setOnClickListener(new d());
        setTitleBarVisible(true);
        setLeft2Visible(this.B);
        HMLog.e(C, "updateTitleBar: " + this.B, new Object[0]);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        WebItem webItem = this.x;
        if (webItem != null && webItem.hasFinishEvent) {
            EventBus.getDefault().post(new EventWebActivityFinish());
        }
        WebItem webItem2 = this.x;
        if (webItem2 == null || !webItem2.isFromHomePopup()) {
            return;
        }
        v();
    }

    public WebFragment getWebFragment() {
        return this.mWebFragment;
    }

    public WebItem getWebItem() {
        return this.x;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mWebFragment.onActivityResult(i, i2, intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mWebFragment.getWebView() != null && this.mWebFragment.getWebView().canGoBack()) {
            setLeft2Visible(true);
            updateTitleLayout();
            this.B = true;
            HMLog.e(C, "onBackPressed: can go back", new Object[0]);
        }
        if (this.mWebFragment.onBackPressed(true)) {
            super.onBackPressed();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            WebItem webItem = (WebItem) intent.getParcelableExtra(KEY_WEB_ITEM);
            this.x = webItem;
            if (webItem == null) {
                this.x = new WebItem(intent.getStringExtra(D));
            }
        }
        WebItem webItem2 = this.x;
        if (webItem2 == null) {
            throw new IllegalArgumentException("--> WebActivity must has webItem <--");
        }
        if (webItem2.webTheme != null) {
            getDelegate().setLocalNightMode(this.x.webTheme.equals("THEME_DARK") ? 2 : 1);
        }
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_web_new);
        if (this.x.isFromHomePopup()) {
            u();
        }
        HMLog.e(C, "web item:" + this.x.toString(), new Object[0]);
        y();
        x();
        this.y = (ProgressBar) findViewById(R.id.web_view_progress);
        EventBus.getDefault().register(this);
        if (NetUtil.isNetworkConnected(this)) {
            return;
        }
        Toast.makeText(this, getString(R.string.network_error), 0).show();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventWeChatResp eventWeChatResp) {
        JsBridgeNativeAPI.handleWechatPayCallback(eventWeChatResp.errCode);
    }

    public static void launch(Context context, @NotNull String str) {
        WebItem webItem = new WebItem();
        webItem.url = str;
        launch(context, webItem);
    }

    public static void launch(Context context, @NotNull String str, @NotNull String str2) {
        launch(context, str);
    }

    public static void launch(Context context, @NotNull WebItem webItem) {
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(KEY_WEB_ITEM, webItem);
        context.startActivity(intent);
    }
}

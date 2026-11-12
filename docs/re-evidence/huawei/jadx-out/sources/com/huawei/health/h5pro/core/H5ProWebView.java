package com.huawei.health.h5pro.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.jsbridge.H5ProJsBridge;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.jsbridge.system.option.LaunchOptionEntry;
import com.huawei.health.h5pro.jsbridge.system.prerequest.PreRequestEntry;
import com.huawei.health.h5pro.load.JsInterfacePreRequestTask;
import com.huawei.health.h5pro.service.H5ProServiceLiveTerm;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.service.theme.ThemeSvc;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.vengine.H5ProExecJsValueCbk;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProViewControls;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatus;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatusListener;
import com.huawei.health.h5pro.view.LoadErrorView;
import com.huawei.health.h5pro.webkit.WebChromeCustomViewListener;
import com.huawei.health.h5pro.webkit.WebKitInstance;
import com.huawei.health.h5pro.webkit.WebKitUtil;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import defpackage.exh;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProWebView extends LinearLayout implements H5ProAppLoadListener, WebViewConfigChangeListener, H5ProInstanceStatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6752c;
    private View d;
    private final Analyzer e;
    private H5ProAppLoader f;
    private H5ProAppLoadListener g;
    private H5ProInstance h;
    private H5ProCommand i;
    private Context j;
    private PreRequestEntry k;
    private String l;
    private H5ProLoadingView m;
    private ThemeSvc o;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6753c;
        private final WeakReference<H5ProWebView> e;

        public a(H5ProWebView h5ProWebView, String str) {
            this.f6753c = "";
            this.e = new WeakReference<>(h5ProWebView);
            this.f6753c = str;
        }

        private void b(H5ProWebView h5ProWebView) {
            h5ProWebView.removeAllViews();
            if (h5ProWebView.d == null) {
                LogUtil.w("H5PRO_H5ProWebView", "loadContentView：mContentView is null");
                return;
            }
            h5ProWebView.addView(h5ProWebView.d, h5ProWebView.getLayoutParams());
            if (h5ProWebView.f6751b) {
                h5ProWebView.d.setFocusable(true);
                h5ProWebView.d.requestFocus();
            }
        }

        private void c(final H5ProWebView h5ProWebView) {
            if (h5ProWebView.j == null) {
                LogUtil.w("H5PRO_H5ProWebView", "showExceptionView：mContext is null");
                return;
            }
            h5ProWebView.removeAllViews();
            LoadErrorView loadErrorView = new LoadErrorView(h5ProWebView.j);
            h5ProWebView.addView(loadErrorView, h5ProWebView.getLayoutParams());
            loadErrorView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.h5pro.core.H5ProWebView.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    H5ProWebView h5ProWebView2 = h5ProWebView;
                    h5ProWebView2.b(h5ProWebView2.i, false);
                }
            });
        }

        private void e(H5ProWebView h5ProWebView) {
            h5ProWebView.removeAllViews();
            if (h5ProWebView.m != null) {
                return;
            }
            if (h5ProWebView.j == null) {
                LogUtil.w("H5PRO_H5ProWebView", "showLoadView：mContext is null");
            } else {
                LayoutInflater.from(h5ProWebView.j).inflate(R.layout.loading, h5ProWebView);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            H5ProWebView h5ProWebView = (H5ProWebView) GeneralUtil.getReferent(this.e);
            if (h5ProWebView == null) {
                LogUtil.w("H5PRO_H5ProWebView", "h5ProWebView is null");
                return;
            }
            if (TextUtils.equals("LOAD_CONTENT_VIEW", this.f6753c)) {
                b(h5ProWebView);
            } else if (TextUtils.equals("SHOW_LOAD_VIEW", this.f6753c)) {
                e(h5ProWebView);
            } else if (TextUtils.equals("SHOW_EXCEPTION_VIEW", this.f6753c)) {
                c(h5ProWebView);
            }
        }
    }

    public H5ProWebView(Context context) {
        super(context);
        this.e = new Analyzer();
        this.d = null;
        this.f6750a = false;
        this.f6751b = false;
        this.f6752c = false;
        c(context);
    }

    private String a() {
        return LogUtil.getTag(this.h, "WebView");
    }

    private void a(H5ProCommand h5ProCommand) {
        if (this.j == null) {
            LogUtil.w(a(), "loadApp: mContext is null");
            return;
        }
        if (this.h == null) {
            LogUtil.w(a(), "loadApp: mH5ProInstance is null");
            return;
        }
        post(new a(this, "SHOW_LOAD_VIEW"));
        c(h5ProCommand);
        if (this.f == null) {
            LogUtil.w(a(), "loadApp: mH5ProAppLoader is null");
            return;
        }
        String packageName = h5ProCommand.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            String url = h5ProCommand.getUrl();
            if (TextUtils.isEmpty(url)) {
                LogUtil.e(a(), "loadApp: packageName and url is empty");
                return;
            } else {
                LogUtil.i(a(), "load url");
                this.f.loadLightApp(url);
                return;
            }
        }
        LogUtil.i(a(), com.huawei.health.h5pro.core.a.a("load: ", packageName));
        this.l = packageName;
        H5ProLaunchOption launchOption = h5ProCommand.getLaunchOption();
        String path = launchOption == null ? null : launchOption.getPath();
        this.h.setPath(path);
        this.f.loadMiniProgram(packageName, path);
    }

    private void a(H5ProLaunchOption h5ProLaunchOption) {
        H5ProBridgeManager h5ProBridgeManager = H5ProBridgeManager.getInstance();
        this.h.setJsCbkInvoker(h5ProBridgeManager.createJsCbkInvoker(new exh(this.f)));
        if (h5ProLaunchOption == null) {
            LogUtil.w("H5PRO_H5ProWebView", "initBridge: h5ProLaunchOption is null");
            return;
        }
        H5ProJsBridge.registerBridgeClass(h5ProLaunchOption.isDisableAllJsExtModules(), h5ProLaunchOption.getJsExtModules());
        for (Map.Entry<String, JsModuleBase> entry : h5ProBridgeManager.createBridges(this.j, this.h, h5ProLaunchOption.getCustomizeJsModules(), h5ProLaunchOption.getBundles()).entrySet()) {
            this.h.registerJsModule(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(H5ProCommand h5ProCommand, boolean z) {
        H5ProInstance h5ProInstance;
        if (h5ProCommand == null) {
            LogUtil.e("H5PRO_H5ProWebView", "h5ProCommand is null");
            return;
        }
        this.i = h5ProCommand;
        H5ProLoadingView h5ProLoadingView = this.m;
        if (h5ProLoadingView != null) {
            h5ProLoadingView.initLoadingView(h5ProCommand, this.h);
        }
        if (z) {
            Analyzer analyzer = new Analyzer();
            H5ProInstance h5ProInstance2 = this.h;
            if (h5ProInstance2 != null) {
                analyzer.setAppInfo(h5ProInstance2.getAppInfo());
            }
            analyzer.visitH5App(this.i.getPackageName(), this.i.getUrl());
            analyzer.biStartLoadH5App(h5ProCommand.getPackageName(), h5ProCommand.getUrl());
        }
        if (this.i.isEmbedded() && (h5ProInstance = this.h) != null) {
            h5ProInstance.setEmbedded();
        }
        if (this.i.getCommand() == 2) {
            a(this.i);
        } else {
            LogUtil.e("H5PRO_H5ProWebView", "invalid command");
        }
    }

    private void c(Context context) {
        if (context == null) {
            LogUtil.w("H5PRO_H5ProWebView", "init: context is null");
            return;
        }
        this.j = context;
        if (!(context instanceof H5ProWebViewActivity)) {
            context.setTheme(R.style.CommonActivityTheme);
            LogUtil.i("H5PRO_H5ProWebView", "init: Context#setTheme");
        }
        H5ProInstance h5ProInstanceCreateInstance = H5ProEngineFactory.getH5ProEngine().createInstance(this.j, this);
        this.h = h5ProInstanceCreateInstance;
        this.f = h5ProInstanceCreateInstance.getAppLoader();
        this.o = new ThemeSvc(getResources());
        this.h.setSafeUrls(this.j.getResources().getStringArray(R.array.safe_url_list));
        try {
            H5ProServiceManager.getInstance().registerService(this.o);
        } catch (Exception e) {
            LogUtil.e("H5PRO_H5ProWebView", e.getMessage());
        }
        this.h.registerInstanceStatusListener(this);
    }

    private void c(H5ProCommand h5ProCommand) {
        LaunchOptionEntry launchOptionEntry;
        if (this.f6752c) {
            LogUtil.w("H5PRO_H5ProWebView", "initLaunchOption: isInitializedLaunchOption -> true");
            return;
        }
        this.f6752c = true;
        H5ProLaunchOption launchOption = h5ProCommand.getLaunchOption();
        if (launchOption != null) {
            if (launchOption.isTextZoom()) {
                WebKitUtil.setTextZoom(this.j, this.h.getWebView());
            }
            if (launchOption.getForceDarkMode() >= 0) {
                WebKitInstance.setDarkMode(this.j, this.h.getWebView(), launchOption.getForceDarkMode());
            }
            if (launchOption.getGlobalBiParams() != null) {
                this.e.setGlobalParams(launchOption.getGlobalBiParams());
            }
            this.h.setBackGroundColor(launchOption.getBackgroundColor());
            this.h.setTextZoom(launchOption.isTextZoom());
            a(launchOption);
            launchOptionEntry = new LaunchOptionEntry(launchOption.getAllCustomizeArg());
            launchOptionEntry.onMount(this.j, this.h, launchOption.getBundles().get(TypeParams.QUESTION_CHOOSE_SINGEL));
            this.h.setIsEnableImageCache(launchOption.isEnableImageCache());
            this.h.setIsDisableImageProxy(launchOption.isDisableImageProxy());
        } else {
            a((H5ProLaunchOption) null);
            launchOptionEntry = new LaunchOptionEntry("");
            launchOptionEntry.onMount(this.j, this.h);
        }
        this.h.registerJsModule(TypeParams.QUESTION_CHOOSE_SINGEL, launchOptionEntry);
        PreRequestEntry preRequestEntry = new PreRequestEntry();
        this.k = preRequestEntry;
        this.h.registerJsModule(ConfigMapKeys.CLCT_PRE_REQ, preRequestEntry);
    }

    private void e() {
        LogUtil.i(a(), "destroy");
        H5ProReverseControlExecutor.f6746b.remove(this.h);
        H5ProBridgeManager.getInstance().destroy(this.h);
        try {
            H5ProServiceManager.getInstance().autoUnregisterService(H5ProServiceLiveTerm.WEB_VIEW);
        } catch (Exception e) {
            LogUtil.e("H5PRO_H5ProWebView", e.getMessage());
        }
        H5ProInstance h5ProInstance = this.h;
        if (h5ProInstance != null) {
            h5ProInstance.destroy();
        }
        LogUtil.logCacheFlushing();
    }

    public void execJs(String str, H5ProExecJsValueCbk h5ProExecJsValueCbk) {
        H5ProAppLoader h5ProAppLoader = this.f;
        if (h5ProAppLoader == null) {
            LogUtil.w(a(), "execJs: mH5ProAppLoader is null");
        } else {
            h5ProAppLoader.execJs(str, h5ProExecJsValueCbk);
        }
    }

    public H5ProInstance getInstance() {
        return this.h;
    }

    @Override // com.huawei.health.h5pro.core.WebViewConfigChangeListener
    public void onConfigurationChanged() {
        if (this.h != null) {
            H5ProBridgeManager.getInstance().onConfigurationChanged(this.h);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        e();
        super.onDetachedFromWindow();
        this.j = null;
        this.h = null;
        this.f = null;
        this.g = null;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onException(H5ProInstance h5ProInstance, String str) {
        LogUtil.e(a(), "load h5 application failed", str);
        this.f6750a = true;
        post(new a(this, "SHOW_EXCEPTION_VIEW"));
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onException(h5ProInstance, str);
        }
        this.e.reportLoadResult(h5ProInstance == null ? "" : h5ProInstance.getUrl(), str, h5ProInstance == null ? null : h5ProInstance.getAppInfo());
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onFloatingBarRequested(RecyclerView.Adapter adapter) {
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onFloatingBarRequested(adapter);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onNewPageLoaded(H5ProInstance h5ProInstance, String str) {
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onNewPageLoaded(h5ProInstance, str);
        }
        H5ProAppInfo appInfo = h5ProInstance == null ? null : h5ProInstance.getAppInfo();
        this.e.setAppInfo(appInfo);
        this.e.endLoading(str);
        this.e.reportLoadResult(str, "0", appInfo);
        if (h5ProInstance == null || h5ProInstance.isLoaded() || appInfo == null) {
            return;
        }
        h5ProInstance.setLoaded();
        this.e.biFinishLoadH5App(appInfo.getPkgName(), str);
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onNewPageStartLoad(H5ProInstance h5ProInstance, String str) {
        if (this.f6750a) {
            this.f6750a = false;
            post(new a(this, "LOAD_CONTENT_VIEW"));
        }
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onNewPageStartLoad(h5ProInstance, str);
        }
        this.e.startLoading(str);
    }

    public void onPause() {
        H5ProInstance h5ProInstance = this.h;
        if (h5ProInstance != null) {
            h5ProInstance.onPause();
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onProgressChanged(H5ProInstance h5ProInstance, int i) {
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onProgressChanged(h5ProInstance, i);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onReceiveTitle(H5ProInstance h5ProInstance, String str) {
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onReceiveTitle(h5ProInstance, str);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onResourceLoadErr(H5ProInstance h5ProInstance, String str, int i) {
        this.e.loadPageErr(h5ProInstance, str, i);
    }

    public void onResume() {
        H5ProInstance h5ProInstance = this.h;
        if (h5ProInstance != null) {
            h5ProInstance.onResume();
        }
    }

    @Override // com.huawei.health.h5pro.vengine.load.H5ProInstanceStatusListener
    public void onStatusChanged(H5ProInstanceStatus h5ProInstanceStatus) {
        LogUtil.i("H5PRO_H5ProWebView", "onStatusChanged: " + h5ProInstanceStatus);
        H5ProInstance h5ProInstance = this.h;
        if (h5ProInstance != null && h5ProInstanceStatus == H5ProInstanceStatus.CONFIG_PREPARED) {
            if (h5ProInstance.getAppInfo() == null) {
                H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
                h5ProAppInfo.setPkgName(this.l);
                h5ProInstance.setAppInfo(h5ProAppInfo);
            }
            h5ProInstance.onStatusChanged(h5ProInstanceStatus);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new JsInterfacePreRequestTask(this.l, this.j, h5ProInstance, this.k));
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onViewCreated(H5ProInstance h5ProInstance, View view) {
        H5ProReverseControlExecutor.f6746b.put(h5ProInstance);
        this.d = view;
        post(new a(this, "LOAD_CONTENT_VIEW"));
        H5ProAppLoadListener h5ProAppLoadListener = this.g;
        if (h5ProAppLoadListener != null) {
            h5ProAppLoadListener.onViewCreated(h5ProInstance, view);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoadListener
    public void onViewPreCreate(H5ProInstance h5ProInstance, View view) {
        this.d = view;
    }

    public void requestFocusToContentView() {
        this.f6751b = true;
    }

    public void setAppLoaderListener(H5ProAppLoadListener h5ProAppLoadListener) {
        this.g = h5ProAppLoadListener;
    }

    public void setCustomViewListener(WebChromeCustomViewListener webChromeCustomViewListener) {
        H5ProInstance h5ProInstance = this.h;
        if (h5ProInstance instanceof WebKitInstance) {
            ((WebKitInstance) h5ProInstance).setCustomViewListener(webChromeCustomViewListener);
        }
    }

    public void setViewControls(H5ProViewControls h5ProViewControls) {
        H5ProInstance h5ProInstance = this.h;
        if (h5ProInstance != null) {
            h5ProInstance.setViewControls(h5ProViewControls);
        }
    }

    public void execute(H5ProCommand h5ProCommand) {
        b(h5ProCommand, true);
    }

    public void execute(H5ProCommand h5ProCommand, H5ProLoadingView h5ProLoadingView) {
        this.m = h5ProLoadingView;
        execute(h5ProCommand);
    }

    public H5ProWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Analyzer();
        this.d = null;
        this.f6750a = false;
        this.f6751b = false;
        this.f6752c = false;
        c(context);
    }
}

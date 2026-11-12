package ohos.ace.adapter.capability.web;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.webkit.ProxyConfig;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.IAceOnResourceEvent;

/* JADX INFO: loaded from: classes46.dex */
public class AceWeb extends AceWebBase {
    private static final String ACE_OBJECT_NAME = "internalAceWebJS";
    private static final int ANDROID_VERSION_TIRAMISU = 33;
    private static final int CACHE_MODE_DEFAULT_VALUE = -1;
    private static final int CACHE_MODE_OH_DEFAULT_VALUE = 0;
    private static final int CAN_NOT_POST_MESSAGE = 17100010;
    private static final int CAN_NOT_REGISTER_MESSAGE_EVENT = 17100006;
    private static final int CAPACITY = 100;
    private static final int CORE_POOL_SIZE = 5;
    private static final int DEFAULT_LAYOUT_SIZE = 1;
    private static final String FAIL_TAG = "fail";
    private static final String LOG_TAG = "AceWeb";
    private static final int MAXIMUM_POOL_SIZE = 10;
    private static final int MIXED_MODE_DEFAULT_VALUE = 0;
    private static final int NO_ERROR = 0;
    private static final String NTC_BACKGROUND_COLOR = "backgroundColor";
    private static final String NTC_BLOCK_NETWORK = "blockNetwork";
    private static final String NTC_CACHE_MODE = "cacheMode";
    private static final String NTC_DOM_STORAGE_ACCESS = "domStorageAccess";
    private static final String NTC_FILE_ACCESS = "fileAccess";
    private static final String NTC_GEOLOCATION_ACCESS = "geolocationAccess";
    private static final String NTC_HORIZONTAL_SCROLLBAR_ACCESS = "horizontalScrollBarAccess";
    private static final String NTC_IMAGE_ACCESS = "imageAccess";
    private static final String NTC_JAVASCRIPT_ACCESS = "javascriptAccess";
    private static final String NTC_MEDIA_PLAY_GESTURE_ACCESS = "mediaPlayGestureAccess";
    private static final String NTC_MIN_FONT_SIZE = "minFontSize";
    private static final String NTC_MIXED_MODE = "mixedMode";
    private static final String NTC_ONLINE_IMAGE_ACCESS = "onlineImageAccess";
    private static final String NTC_PARAM_DEL_INTERFACE = "javaScriptInterfaceName";
    private static final String NTC_PARAM_LOADDATA_BASEURL = "load_data_base_url";
    private static final String NTC_PARAM_LOADDATA_DATA = "load_data_data";
    private static final String NTC_PARAM_LOADDATA_ENCODING = "load_data_encoding";
    private static final String NTC_PARAM_LOADDATA_HISTORY = "load_data_history_url";
    private static final String NTC_PARAM_LOADDATA_MIMETYPE = "load_data_mimetype";
    private static final String NTC_PARAM_REGISTER_JS_METHODLIST = "jsInterfaceMethodList";
    private static final String NTC_PARAM_REGISTER_JS_NAME = "jsInterfaceName";
    private static final String NTC_PARAM_SCROLLBY_DELTAX = "scroll_by_deltax";
    private static final String NTC_PARAM_SCROLLBY_DELTAY = "scroll_by_deltay";
    private static final String NTC_PARAM_SCROLLTO_X = "scroll_to_x";
    private static final String NTC_PARAM_SCROLLTO_Y = "scroll_to_y";
    private static final String NTC_TEXT_ZOOM_RATIO = "textZoomRatio";
    private static final String NTC_VERTICAL_SCROLLBAR_ACCESS = "verticalScrollBarAccess";
    private static final String NTC_ZOOM_ACCESS = "zoomAccess";
    private static final String NTC_ZOOM_FACTOR = "zoom_factor";
    private static final String ONE_STRING = "1";
    private static final String PAGE_INVALID_FLAG = "1";
    private static final int RECEIVER_EXPORTED = 2;
    private static final int SHOW_VIDEO_TIME = 200;
    private static final String SUCCESS_TAG = "success";
    private static final long THREAD_TIME_OUT = 1000;
    private static final String WEBVIEW_ACESS_STEP = "accessStep";
    private static final int WEBVIEW_DURATION = 500;
    private static final String WEBVIEW_HEIGHT = "height";
    private static final String WEBVIEW_NESTEDSCROLL_DOWN = "scrollDown";
    private static final String WEBVIEW_NESTEDSCROLL_LEFT = "scrollLeft";
    private static final String WEBVIEW_NESTEDSCROLL_RIGHT = "scrollRight";
    private static final String WEBVIEW_NESTEDSCROLL_UP = "scrollUp";
    private static final int WEBVIEW_PAGE_HALF = 2;
    private static final String WEBVIEW_PAGE_INVALID = "pageInvalid";
    private static final int WEBVIEW_PAGE_TOP = 0;
    private static final String WEBVIEW_PAGE_URL = "pageUrl";
    private static final String WEBVIEW_PARAM_LOAD_URL = "load_url";
    private static final String WEBVIEW_POSITION_LEFT = "left";
    private static final String WEBVIEW_POSITION_TOP = "top";
    private static final String WEBVIEW_SRC = "src";
    private static final String WEBVIEW_WIDTH = "width";
    private static final float WEBVIEW_ZOOMIN_VALUE = 1.2f;
    private static final float WEBVIEW_ZOOMOUT_VALUE = 0.8f;
    private static final int WEB_DOWNLOAD_CANCEL = 2;
    private static final int WEB_DOWNLOAD_COMPLETED = 1;
    private static final String WEB_DOWNLOAD_COMPLETE_EVENT = "webDownloadCompleteEvent";
    private static final String WEB_DOWNLOAD_CONCAT_DIR = "/Temp/";
    private static final int WEB_DOWNLOAD_DEPANDING = 4;
    private static final String WEB_DOWNLOAD_FAILED_EVENT = "webDownloadFailedEvent";
    private static final int WEB_DOWNLOAD_INTERRUPTED = 3;
    private static final int WEB_DOWNLOAD_PERCENT = 100;
    private static final int WEB_DOWNLOAD_RUNNING = 0;
    private static final long WEB_DOWNLOAD_SPEED_RATE = 2;
    private static final String WEB_DOWNLOAD_START_EVENT = "webDownloadStartEvent";
    private static final int WEB_DOWNLOAD_TASK_NUM = 3;
    private static final int WEB_DOWNLOAD_TIMER_DELAY = 500;
    private static final String WEB_DOWNLOAD_UPDATE_EVENT = "webDownloadUpdateEvent";
    private static final int WEB_DOWNLOAD_USER_CANCELED = 40;
    private static final Object WEB_LOCK = new Object();
    private static final String WEB_MESSAGE_PORT_ONE = "port1";
    private static final String WEB_MESSAGE_PORT_TWO = "port2";
    private static final int WEB_NETWORK_DISCONNECTED = 22;
    private static final int WEB_TEXT_ZOOM = 100;
    private static final String WEB_WEBVIEW_CACHE = "webviewCache.db";
    private static final String WEB_WEBVIEW_DB = "webview.db";
    private static String currentPageUrl;
    private static String routerUrl;
    private MotionEvent cacheDownEvent;
    private final IAceOnResourceEvent callback;
    private final Context context;
    private ExecutorService downloadExecutor_;
    private float height;
    private int initialPointerCount;
    private boolean isErrorOccurred;
    private boolean isFullScreenExit;
    private boolean isIncognitoMode;
    private boolean isJavaScriptEnabled;
    private boolean isMainFrame;
    private boolean isNeedParallelScroll;
    private boolean isParallelScrollLocked;
    private boolean isReceiverRegistered;
    private boolean isWebOnPage;
    private boolean isZoomAccess;
    private String[] jsAsyncMethod;
    private String jsObjectName;
    private String[] jsSyncMethod;
    private float left;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private MotionEvent motionEvent;
    private AceWebNestedScrollOptionsExtObject nestedScrollOptionsExtObject;
    private String referrer;
    private final AtomicReference<Boolean> resultRef;
    private final View rootView;
    private float top;
    private float touchStartX;
    private float touchStartY;
    private int videoHeight;
    private int videoWidth;
    private HashMap<Long, String> webDownloadItemIdMap_;
    private HashMap<String, AceWebDownloadItemObject> webDownloadItemMap_;
    private Timer webDownloadUpdateTimer_;
    private List<WebMessagePort> webMessagePorts;
    private ArrayList<String> webSchemeHandlerList;
    private final AceWebView webView;
    private WebviewBroadcastReceive webviewBroadcastReceive_;
    private float width;

    public AceWeb(long j, Context context, View view, IAceOnResourceEvent iAceOnResourceEvent) {
        super(j, iAceOnResourceEvent);
        this.isWebOnPage = true;
        this.isZoomAccess = true;
        this.isIncognitoMode = false;
        this.isErrorOccurred = false;
        this.isJavaScriptEnabled = false;
        this.webMessagePorts = new ArrayList();
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.isFullScreenExit = false;
        this.webDownloadUpdateTimer_ = null;
        this.webDownloadItemIdMap_ = new HashMap<>();
        this.webDownloadItemMap_ = new HashMap<>();
        this.webSchemeHandlerList = new ArrayList<>();
        this.resultRef = new AtomicReference<>(false);
        this.isMainFrame = false;
        this.isNeedParallelScroll = false;
        this.cacheDownEvent = null;
        this.isParallelScrollLocked = false;
        this.initialPointerCount = 0;
        this.isReceiverRegistered = false;
        this.nestedScrollOptionsExtObject = new AceWebNestedScrollOptionsExtObject();
        this.callback = iAceOnResourceEvent;
        this.context = context;
        this.rootView = view;
        AceWebView aceWebView = new AceWebView(context);
        this.webView = aceWebView;
        this.downloadExecutor_ = Executors.newFixedThreadPool(3);
        registerWebviewReceiver(context);
        aceWebView.getSettings().setJavaScriptEnabled(true);
        aceWebView.addJavascriptInterface(new AceWebJavascriptProxyCallback(context, aceWebView), "AceWebHandler");
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void release() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ALog.w(LOG_TAG, "release main thread");
            doRelease();
        } else {
            ALog.w(LOG_TAG, "release main thread post");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.doRelease();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRelease() {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            removeWebFromSurface(aceWebView);
            this.webView.destroy();
        }
        WebviewBroadcastReceive webviewBroadcastReceive = this.webviewBroadcastReceive_;
        if (webviewBroadcastReceive == null || !this.isReceiverRegistered) {
            return;
        }
        try {
            this.context.unregisterReceiver(webviewBroadcastReceive);
        } catch (IllegalArgumentException e) {
            ALog.e(LOG_TAG, "unregisterReceiver failed: " + e.getMessage());
        }
        this.isReceiverRegistered = false;
    }

    public WebView getWebview() {
        return this.webView;
    }

    public class AceWebView extends WebView {
        private static final String LOG_TAG = "AceWebView";
        private static final int SCROLL_END_DELAY_THRESHOLD = 150;
        private static final float SCROLL_THRESHOLD = 10.0f;
        private boolean isScrolling;
        private boolean isSendEnd;
        private boolean isTouching;
        private boolean mIsScrolling;
        private int mLastScrollX;
        private int mLastScrollY;
        private Handler mScrollHandler;
        private Runnable mScrollRunnable;
        private float startX;
        private float startY;

        public AceWebView(Context context) {
            super(context);
            this.mIsScrolling = false;
            this.mLastScrollX = 0;
            this.mLastScrollY = 0;
            this.startX = 0.0f;
            this.startY = 0.0f;
            this.isScrolling = false;
            this.isTouching = false;
            this.isSendEnd = false;
            this.mScrollHandler = new Handler(Looper.getMainLooper());
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (!this.mIsScrolling) {
                this.mIsScrolling = true;
                AceWeb.this.fireScrollWillStart(new AceWebScrollObject(i, i2));
                AceWeb.this.fireScrollStart(new AceWebScrollObject(i - this.mLastScrollX, i2 - this.mLastScrollY));
                AceWeb.this.fireScrollChanged(new AceWebScrollObject(i, i2, AceWeb.this.webView.computeHorizontalScrollRange(), (int) ((AceWeb.this.webView.getContentHeight() - 1) * getScale()), AceWeb.this.webView.getWidth(), AceWeb.this.webView.getHeight()));
            } else {
                AceWeb.this.fireScrollChanged(new AceWebScrollObject(i, i2, AceWeb.this.webView.computeHorizontalScrollRange(), (int) ((AceWeb.this.webView.getContentHeight() - 1) * getScale()), AceWeb.this.webView.getWidth(), AceWeb.this.webView.getHeight()));
            }
            Runnable runnable = this.mScrollRunnable;
            if (runnable != null) {
                this.mScrollHandler.removeCallbacks(runnable);
            }
            if (!this.isTouching) {
                sendScrollEndEvent();
            } else {
                this.isSendEnd = true;
            }
            this.mLastScrollX = i;
            this.mLastScrollY = i2;
        }

        @Override // android.view.View
        protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            onScrollChanged(i3 + i, i4 + i2, i3, i4);
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0052  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                this.isScrolling = false;
                this.isTouching = true;
                if (getParent() instanceof ViewGroup) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 1) {
                if (getParent() instanceof ViewGroup) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.isScrolling = false;
                this.isTouching = false;
                if (this.isSendEnd) {
                    sendScrollEndEvent();
                    this.isSendEnd = false;
                }
            } else if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.startX);
                float fAbs2 = Math.abs(motionEvent.getY() - this.startY);
                if (!this.isScrolling && (fAbs > 10.0f || fAbs2 > 10.0f)) {
                    this.isScrolling = true;
                    if (getParent() instanceof ViewGroup) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.isTouching = true;
            } else if (action == 3) {
                if (getParent() instanceof ViewGroup) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.isScrolling = false;
                this.isTouching = false;
                if (this.isSendEnd) {
                    sendScrollEndEvent();
                    this.isSendEnd = false;
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        private void sendScrollEndEvent() {
            Runnable runnable = new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb.AceWebView.1
                @Override // java.lang.Runnable
                public void run() {
                    AceWebView.this.mIsScrolling = false;
                    AceWeb.this.fireScrollEnd(new AceWebScrollObject(AceWebView.this.mLastScrollX, AceWebView.this.mLastScrollY));
                }
            };
            this.mScrollRunnable = runnable;
            this.mScrollHandler.postDelayed(runnable, 150L);
        }
    }

    public void setPageUrl(String str) {
        currentPageUrl = str;
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String getUrl() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return "";
        }
        return aceWebView.getUrl();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: updateWebLayout */
    public String m2010xfd048d90(Map<String, String> map) {
        if (!map.containsKey("left") || !map.containsKey("top") || !map.containsKey("width") || !map.containsKey("height")) {
            ALog.w(LOG_TAG, "setWebLayout fail");
            return "fail";
        }
        try {
            this.left = Float.parseFloat(map.get("left"));
            this.top = Float.parseFloat(map.get("top"));
            this.width = Float.parseFloat(map.get("width"));
            this.height = Float.parseFloat(map.get("height"));
            removeWebFromSurface(this.webView);
            addWebToSurface(buildLayoutParams(this.width, this.height, this.left, this.top));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "updateWebLayout NumberFormatException");
            return "fail";
        }
    }

    public void addWebToSurface(FrameLayout.LayoutParams layoutParams) {
        if (((Activity) this.webView.getContext()).getWindow() == null) {
            return;
        }
        View view = this.rootView;
        if (view == null) {
            ALog.w(LOG_TAG, "addWebToSurface rooView null");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            int childCount = frameLayout.getChildCount();
            frameLayout.addView(this.webView, childCount - 1, layoutParams);
            for (int i = 0; i < childCount; i++) {
                View childAt = frameLayout.getChildAt(i);
                if ("ohos.ace.adapter.WindowView".equals(childAt.getClass().getName())) {
                    childAt.setZ(100.0f);
                } else {
                    childAt.setZ(-1.0f);
                }
            }
            return;
        }
        ALog.w(LOG_TAG, "addWebToSurface error, not FrameLayout");
    }

    public void removeWebFromSurface(View view) {
        if (view == null) {
            ALog.e(LOG_TAG, "cannot remove web because web is null");
        } else if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public void setWebLayout(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.left = f3;
        this.top = f4;
    }

    public void initWebEventListener() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.setOnKeyListener(new View.OnKeyListener() { // from class: ohos.ace.adapter.capability.web.AceWeb.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVideoUrl(String str) {
        String contentType;
        try {
            URL url = new URL(str);
            if (str != null && !str.isEmpty()) {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.connect();
                    return httpURLConnection.getResponseCode() == 200 && (contentType = httpURLConnection.getContentType()) != null && contentType.startsWith("video");
                }
                return false;
            }
            ALog.w(LOG_TAG, "URL string is null or empty");
            return false;
        } catch (IOException unused) {
            ALog.e(LOG_TAG, "isVideoUrl is not right");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSize() {
        if (this.videoWidth == 0 || this.videoHeight == 0) {
            new Handler().postDelayed(new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AceWeb.this.videoWidth == 0 || AceWeb.this.videoHeight == 0) {
                        AceWeb.this.getSize();
                    } else {
                        AceWeb.this.showSend();
                    }
                }
            }, 200L);
        } else {
            showSend();
        }
    }

    public void initWebCallBack() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.setWebViewClient(new WebViewClient() { // from class: ohos.ace.adapter.capability.web.AceWeb.3
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                AceWeb.this.isErrorOccurred = true;
                AceWeb.this.fireErrorReceive(new AceWebErrorReceiveObject(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest));
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                AceWeb.this.onLoadingPage(str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, final String str) {
                if (!AceWeb.this.isJavaScriptEnabled && AceWeb.this.jsObjectName != null && (AceWeb.this.jsSyncMethod != null || AceWeb.this.jsAsyncMethod != null)) {
                    AceWeb aceWeb = AceWeb.this;
                    aceWeb.registerJavaScriptProxy(aceWeb.jsObjectName, AceWeb.this.jsSyncMethod, AceWeb.this.jsAsyncMethod, "");
                    AceWeb.this.isJavaScriptEnabled = true;
                }
                AceWeb.this.onPageLoaded(str);
                if (str != null) {
                    if (str.startsWith("http") || str.startsWith(ProxyConfig.MATCH_HTTPS)) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadPoolExecutor.CallerRunsPolicy());
                        threadPoolExecutor.execute(new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb.3.1
                            @Override // java.lang.Runnable
                            public void run() throws IOException {
                                StringBuilder sb;
                                if (AceWeb.this.isVideoUrl(str)) {
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                                    try {
                                        AceWeb.this.videoWidth = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                        AceWeb.this.videoHeight = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (IllegalStateException e) {
                                            e = e;
                                            sb = new StringBuilder("Failed to release MediaMetadataRetriever: ");
                                            sb.append(e.getMessage());
                                            String string = sb.toString();
                                        }
                                    } catch (Exception unused) {
                                        AceWeb.this.videoWidth = 0;
                                        AceWeb.this.videoHeight = 0;
                                        ALog.e(AceWeb.LOG_TAG, "Exception occurred while getting video dimensions");
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (IllegalStateException e2) {
                                            e = e2;
                                            sb = new StringBuilder("Failed to release MediaMetadataRetriever: ");
                                            sb.append(e.getMessage());
                                            String string2 = sb.toString();
                                        }
                                    } finally {
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (IllegalStateException e3) {
                                            ALog.e(AceWeb.LOG_TAG, "Failed to release MediaMetadataRetriever: " + e3.getMessage());
                                        }
                                    }
                                }
                            }
                        });
                        if (threadPoolExecutor.isTerminated()) {
                            threadPoolExecutor.shutdown();
                        }
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                AceWeb.this.fireHttpErrorReceive(new AceWebHttpErrorReceiveObject(webResourceRequest, webResourceResponse));
            }

            @Override // android.webkit.WebViewClient
            public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                if (AceWeb.this.isErrorOccurred) {
                    AceWeb.this.isErrorOccurred = false;
                } else {
                    AceWeb.this.fireRefreshHistory(new AceWebRefreshAccessedHistoryObject(str, z));
                }
            }

            @Override // android.webkit.WebViewClient
            public void onScaleChanged(WebView webView, float f, float f2) {
                AceWeb.this.fireScaleChanged(new AceWebScaleObject(f, f2));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                AceWebOverrideUrlObject aceWebOverrideUrlObject = new AceWebOverrideUrlObject(webResourceRequest);
                return AceWeb.this.fireUrlLoadIntercept(aceWebOverrideUrlObject) || AceWeb.this.fireOverrideUrlLoading(aceWebOverrideUrlObject);
            }

            @Override // android.webkit.WebViewClient
            public void onPageCommitVisible(WebView webView, String str) {
                AceWeb.this.firePageVisible(str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                AceWeb.this.fireHttpAuthRequestReceive(new AceWebHttpAuthRequestObject(httpAuthHandler, str, str2, AceWeb.this.context));
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                AceWeb.this.isMainFrame = webResourceRequest.isForMainFrame();
                AceWeb.this.referrer = webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders().get("Referer") : "";
                Object objFireShouldInterceptRequest = AceWeb.this.fireShouldInterceptRequest(new AceWebResourceRequestObject(webResourceRequest));
                if (!(objFireShouldInterceptRequest instanceof WebResourceResponse)) {
                    return AceWeb.this.handleSchemeRequest(webView, webResourceRequest);
                }
                return (WebResourceResponse) objFireShouldInterceptRequest;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (AceWeb.this.isMainFrame) {
                    AceWeb.this.fireSslErrorReceive(new AceWebSslErrorReceiveObject(sslError, sslErrorHandler));
                }
                AceWeb.this.fireAllSslErrorReceive(new AceWebAllSslErrorReceiveObject(sslError, sslErrorHandler, AceWeb.this.referrer, AceWeb.this.isMainFrame));
            }
        });
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: ohos.ace.adapter.capability.web.AceWeb.4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                AceWeb.this.firePageChanged(i);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                AceWeb.this.firePageRecvTitle(str);
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
                if (AceWeb.this.mCustomView != null || AceWeb.this.mCustomViewCallback != null) {
                    AceWeb.this.mCustomViewCallback.onCustomViewHidden();
                    return;
                }
                if (AceWeb.this.webView != null && AceWeb.this.webView.getParent() != null && (AceWeb.this.webView.getParent().getParent() instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) AceWeb.this.webView.getParent().getParent();
                    if (viewGroup == null) {
                        ALog.e(AceWeb.LOG_TAG, "Parent view is null");
                        return;
                    }
                    viewGroup.setVisibility(8);
                    if (viewGroup.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                        if (viewGroup2 == null) {
                            ALog.e(AceWeb.LOG_TAG, "Root layout is null");
                            return;
                        }
                        viewGroup2.addView(view, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
                AceWeb.this.mCustomView = view;
                AceWeb.this.mCustomViewCallback = customViewCallback;
                AceWeb.this.getSize();
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                super.onHideCustomView();
                if (AceWeb.this.mCustomView != null) {
                    if (AceWeb.this.mCustomViewCallback != null) {
                        AceWeb.this.mCustomViewCallback.onCustomViewHidden();
                        AceWeb.this.mCustomViewCallback = null;
                    }
                    if (AceWeb.this.mCustomView != null && AceWeb.this.mCustomView.getParent() != null) {
                        if (AceWeb.this.mCustomView.getParent() instanceof ViewGroup) {
                            ((ViewGroup) AceWeb.this.mCustomView.getParent()).removeView(AceWeb.this.mCustomView);
                        }
                        AceWeb aceWeb = AceWeb.this;
                        aceWeb.showParentCustomView(aceWeb.webView);
                        AceWeb.this.mCustomView = null;
                    }
                }
                AceWeb.this.fireFullScreenExit(new AceWebFullScreenExitObject());
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                AceWebJsDialogObject aceWebJsDialogObject = new AceWebJsDialogObject(str, str2, jsResult);
                boolean zFireJsBeforeUnload = AceWeb.this.fireJsBeforeUnload(aceWebJsDialogObject);
                if (!zFireJsBeforeUnload) {
                    aceWebJsDialogObject.cancel();
                }
                return zFireJsBeforeUnload;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return AceWeb.this.firePageOnConsoleMessage(new AceWebConsoleMessageObject(consoleMessage));
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return AceWeb.this.firePageOnShowFileChooser(new AceWebFileChooserObject(valueCallback, fileChooserParams));
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                AceWeb.this.firePageGeoPermission(new AceWebGeolocationPermissionsShowObject(str, callback, AceWeb.this.isIncognitoMode));
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                AceWeb.this.firePageGeoHidePermission();
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                AceWeb.this.firePermissionRequest(new AceWebPermissionRequestObject(permissionRequest));
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                AceWebJsPromptObject aceWebJsPromptObject = new AceWebJsPromptObject(str, str2, str3, jsPromptResult);
                if (AceWeb.this.fireJsPrompt(aceWebJsPromptObject)) {
                    return true;
                }
                aceWebJsPromptObject.cancel();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                AceWebJsDialogObject aceWebJsDialogObject = new AceWebJsDialogObject(str, str2, jsResult);
                if (AceWeb.this.fireJsAlert(aceWebJsDialogObject)) {
                    return true;
                }
                aceWebJsDialogObject.cancel();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                AceWebJsDialogObject aceWebJsDialogObject = new AceWebJsDialogObject(str, str2, jsResult);
                if (AceWeb.this.fireJsConfirm(aceWebJsDialogObject)) {
                    return true;
                }
                aceWebJsDialogObject.cancel();
                return true;
            }
        });
        this.webView.setDownloadListener(new DownloadListener() { // from class: ohos.ace.adapter.capability.web.AceWeb.5
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                AceWeb.this.fireDownloadStart(new AceWebDownloadStartObject(str, str2, str3, str4, j));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showParentCustomView(AceWebView aceWebView) {
        if (aceWebView == null || aceWebView.getParent() == null || aceWebView.getParent().getParent() == null || !(aceWebView.getParent().getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) aceWebView.getParent().getParent()).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSend() {
        AceWebFullScreenEnterObject aceWebFullScreenEnterObject = new AceWebFullScreenEnterObject(this.videoWidth, this.videoHeight);
        aceWebFullScreenEnterObject.setFullEnterRequestExitCallback(this.mCustomViewCallback);
        fireFullScreenEnter(aceWebFullScreenEnterObject);
    }

    public void initWeb() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.setFocusable(true);
        this.webView.setFocusableInTouchMode(true);
        initWebSetting();
        initWebEventListener();
        initWebCallBack();
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
    }

    public void onError(String str, int i, String str2) {
        fireError(str, i, str2);
    }

    public void onLoadingPage(String str) {
        firePageStarted(str);
    }

    public void onPageLoaded(String str) {
        firePageFinished(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebResourceResponse handleSchemeRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            if (!webResourceRequest.isForMainFrame()) {
                return null;
            }
            for (final String str : this.webSchemeHandlerList) {
                if (webResourceRequest.getUrl().getScheme().equals(str)) {
                    final AceWebSchemeHandler aceWebSchemeHandler = new AceWebSchemeHandler(webResourceRequest);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m2009xdf60f17a(str, aceWebSchemeHandler, countDownLatch);
                        }
                    });
                    if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        ALog.e(LOG_TAG, "onSchemeHandlerRequestStart timed out waiting for result.");
                        this.resultRef.set(false);
                    }
                    if (!this.resultRef.get().booleanValue()) {
                        break;
                    }
                    return handleInterceptRequest(webView, webResourceRequest, aceWebSchemeHandler, str);
                }
            }
            return null;
        } catch (InterruptedException unused) {
            ALog.e(LOG_TAG, "shouldInterceptRequest InterruptedException error");
            return null;
        }
    }

    /* JADX INFO: renamed from: lambda$handleSchemeRequest$0$ohos-ace-adapter-capability-web-AceWeb, reason: not valid java name */
    /* synthetic */ void m2009xdf60f17a(String str, AceWebSchemeHandler aceWebSchemeHandler, CountDownLatch countDownLatch) {
        this.resultRef.set(Boolean.valueOf(AceWebPluginBase.onSchemeHandlerRequestStart(str, aceWebSchemeHandler)));
        countDownLatch.countDown();
    }

    private WebResourceResponse handleInterceptRequest(final WebView webView, WebResourceRequest webResourceRequest, final AceWebSchemeHandler aceWebSchemeHandler, final String str) {
        if (aceWebSchemeHandler.getResponseErrCode() != 0) {
            fireErrorReceive(new AceWebErrorReceiveObject(aceWebSchemeHandler.getResponseErrCode(), aceWebSchemeHandler.getResponseErrInfo(), webResourceRequest));
        }
        if (aceWebSchemeHandler.getErrorCode() != 0) {
            fireErrorReceive(new AceWebErrorReceiveObject(aceWebSchemeHandler.getErrorCode(), aceWebSchemeHandler.getErrorInfo(), webResourceRequest));
        }
        if (!aceWebSchemeHandler.getResponseUrl().isEmpty() && aceWebSchemeHandler.getResponseErrCode() == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AceWeb.lambda$handleInterceptRequest$1(str, aceWebSchemeHandler, webView);
                }
            });
            return null;
        }
        if (aceWebSchemeHandler.getResponseFinish() || aceWebSchemeHandler.getResponseFail()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ohos.ace.adapter.capability.web.AceWeb$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AceWebPluginBase.onSchemeHandlerRequestStop(str, aceWebSchemeHandler);
                }
            });
        }
        return aceWebSchemeHandler.getResponse();
    }

    static /* synthetic */ void lambda$handleInterceptRequest$1(String str, AceWebSchemeHandler aceWebSchemeHandler, WebView webView) {
        AceWebPluginBase.onSchemeHandlerRequestStop(str, aceWebSchemeHandler);
        webView.loadUrl(aceWebSchemeHandler.getResponseUrl());
    }

    public void initWebSetting() {
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setDomStorageEnabled(true);
        settings.setBlockNetworkLoads(false);
        settings.setMixedContentMode(1);
        settings.setBlockNetworkImage(true);
        settings.setGeolocationEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(true);
        WebView.setWebContentsDebuggingEnabled(false);
    }

    public void setIncognitoMode(String str) {
        WebSettings settings = this.webView.getSettings();
        if ("1".equals(str)) {
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
            this.context.deleteDatabase(WEB_WEBVIEW_DB);
            this.context.deleteDatabase(WEB_WEBVIEW_CACHE);
            this.webView.clearCache(true);
            this.webView.clearHistory();
            this.webView.clearFormData();
            settings.setCacheMode(2);
            this.isIncognitoMode = true;
            return;
        }
        settings.setAppCacheEnabled(true);
        settings.setAppCachePath(this.webView.getContext().getApplicationContext().getDir("cache", 0).getPath());
        this.isIncognitoMode = false;
    }

    public FrameLayout.LayoutParams buildLayoutParams(float f, float f2, float f3, float f4) {
        if (f2 != 0.0f && f != 0.0f) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f, (int) f2);
            layoutParams.setMargins((int) f3, (int) f4, 0, 0);
            return layoutParams;
        }
        return new FrameLayout.LayoutParams(1, 1);
    }

    public boolean isEqual(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2) || Float.isInfinite(f) || Float.isInfinite(f2) || ((double) (f - f2)) >= 0.001d) ? false : true;
    }

    public String loadUrl(String str) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.loadUrl(str);
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void loadUrl(String str, Map<String, String> map) {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.loadUrl(str, map);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: loadData */
    public String m2012x82dd604e(Map<String, String> map) {
        if (!map.containsKey(NTC_PARAM_LOADDATA_DATA) || !map.containsKey(NTC_PARAM_LOADDATA_MIMETYPE) || !map.containsKey(NTC_PARAM_LOADDATA_ENCODING)) {
            return "fail";
        }
        String str = map.get(NTC_PARAM_LOADDATA_DATA);
        String str2 = map.get(NTC_PARAM_LOADDATA_MIMETYPE);
        String str3 = map.get(NTC_PARAM_LOADDATA_ENCODING);
        if (map.containsKey(NTC_PARAM_LOADDATA_BASEURL)) {
            this.webView.loadDataWithBaseURL(map.get(NTC_PARAM_LOADDATA_BASEURL), str, str2, str3, map.get(NTC_PARAM_LOADDATA_HISTORY));
            return "success";
        }
        this.webView.loadData(str, str2, str3);
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: reload */
    public String m2014x8b6330c(Map<String, String> map) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.reload();
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: stopLoading */
    public String m2015xcba29c6b(Map<String, String> map) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.stopLoading();
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: updateUrl */
    public String m2020xbe8d1e87(Map<String, String> map) {
        if (map == null || this.webView == null || !map.containsKey(WEBVIEW_SRC)) {
            return "fail";
        }
        String str = map.get(WEBVIEW_SRC);
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.loadUrl(str);
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: routerBack */
    public String m2021x817987e6(Map<String, String> map) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            removeWebFromSurface(aceWebView);
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: changePageUrl */
    public String m2022x4465f145(Map<String, String> map) {
        if (this.webView == null || !map.containsKey(WEBVIEW_PAGE_URL)) {
            return "fail";
        }
        if (map.get(WEBVIEW_PAGE_URL).equals(currentPageUrl)) {
            addWebToSurface(buildLayoutParams(this.width, this.height, this.left, this.top));
            this.webView.onResume();
            this.isWebOnPage = true;
            return "success";
        }
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: pagePathInvalid */
    public String m2023x7525aa4(Map<String, String> map) {
        if (this.webView == null || !map.containsKey(WEBVIEW_PAGE_INVALID)) {
            return "fail";
        }
        String str = map.get(WEBVIEW_PAGE_INVALID);
        if (!routerUrl.equals(currentPageUrl) && this.webView != null && "1".equals(str)) {
            this.isWebOnPage = false;
            removeWebFromSurface(this.webView);
            this.webView.onPause();
            return "success";
        }
        return "success";
    }

    public void setSupportZoom(boolean z) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.getSettings().setSupportZoom(z);
        }
    }

    public void setUseWideViewPort(boolean z) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.getSettings().setUseWideViewPort(z);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void onActivityPause() {
        ALog.i(LOG_TAG, "onActivityPause enter.");
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void onActivityResume() {
        ALog.i(LOG_TAG, "onActivityResume enter.");
    }

    public void onActivityDestroy() {
        this.webView.destroy();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: backward */
    public String m2024xf23573f9(Map<String, String> map) {
        this.webView.goBack();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: forward */
    public String m2025xb521dd58(Map<String, String> map) {
        this.webView.goForward();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: accessBackward */
    public String m2026x780e46b7(Map<String, String> map) {
        return String.valueOf(this.webView.canGoBack());
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: accessForward */
    public String m2027x3afab016(Map<String, String> map) {
        return String.valueOf(this.webView.canGoForward());
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: accessStep */
    public String m2013x45c9c9ad(Map<String, String> map) {
        if (map == null || this.webView == null) {
            return String.valueOf(false);
        }
        if (!map.containsKey(WEBVIEW_ACESS_STEP)) {
            return String.valueOf(false);
        }
        String str = map.get(WEBVIEW_ACESS_STEP);
        try {
            return String.valueOf(this.webView.canGoBackOrForward(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "JSAPI parse int error, accessStep:" + str);
            return String.valueOf(false);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: getHitTest */
    public String m2017x78633d9f(Map<String, String> map) {
        return String.valueOf(this.webView.getHitTestResult().getType());
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: onActive */
    public String m2028x14efed02(Map<String, String> map) {
        this.webView.onResume();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: requestFocus */
    public String m2019xfba0b528(Map<String, String> map) {
        this.webView.requestFocus();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: onInactive */
    public String m2029xd7dc5661(Map<String, String> map) {
        this.webView.onPause();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void setTouchEvent(MotionEvent motionEvent) {
        this.motionEvent = MotionEvent.obtain(motionEvent);
    }

    public void processTouchEvent() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null || this.webView == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEventObtain.getActionMasked();
        int pointerCount = motionEventObtain.getPointerCount();
        if (actionMasked == 0) {
            handleActionDown(motionEventObtain);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                handleActionMove(motionEventObtain, pointerCount);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    handleActionPointerDown(motionEventObtain, pointerCount);
                    return;
                } else {
                    if (actionMasked != 6) {
                        return;
                    }
                    handleActionPointerUp(motionEventObtain);
                    return;
                }
            }
        }
        handleActionUpOrCancel(motionEventObtain);
    }

    private void handleActionDown(MotionEvent motionEvent) {
        this.webView.requestFocus();
        this.touchStartX = motionEvent.getX();
        this.touchStartY = motionEvent.getY();
        this.isNeedParallelScroll = false;
        this.isParallelScrollLocked = false;
        this.initialPointerCount = 1;
        this.motionEvent = null;
        MotionEvent motionEvent2 = this.cacheDownEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.cacheDownEvent = MotionEvent.obtain(motionEvent);
    }

    private void handleActionPointerDown(MotionEvent motionEvent, int i) {
        this.isNeedParallelScroll = false;
        this.isParallelScrollLocked = false;
        MotionEvent motionEvent2 = this.cacheDownEvent;
        if (motionEvent2 != null) {
            motionEvent2.offsetLocation(-this.left, -this.top);
            this.webView.dispatchTouchEvent(this.cacheDownEvent);
            this.cacheDownEvent.recycle();
            this.cacheDownEvent = null;
        }
        motionEvent.offsetLocation(-this.left, -this.top);
        this.webView.dispatchTouchEvent(motionEvent);
        this.motionEvent = null;
        this.initialPointerCount = i;
    }

    private void handleActionMove(MotionEvent motionEvent, int i) {
        if (i > 1 || this.initialPointerCount > 1) {
            motionEvent.offsetLocation(-this.left, -this.top);
            this.webView.dispatchTouchEvent(motionEvent);
            this.motionEvent = null;
            return;
        }
        float x = motionEvent.getX();
        float f = this.touchStartX;
        float y = motionEvent.getY();
        float f2 = this.touchStartY;
        if (!this.isParallelScrollLocked) {
            boolean zNeedParallelScroll = this.nestedScrollOptionsExtObject.needParallelScroll(x - f, y - f2);
            this.isNeedParallelScroll = zNeedParallelScroll;
            this.isParallelScrollLocked = true;
            MotionEvent motionEvent2 = this.cacheDownEvent;
            if (motionEvent2 != null) {
                if (!zNeedParallelScroll) {
                    motionEvent2.offsetLocation(-this.left, -this.top);
                }
                this.webView.dispatchTouchEvent(this.cacheDownEvent);
                this.cacheDownEvent.recycle();
                this.cacheDownEvent = null;
            }
        }
        if (!this.isNeedParallelScroll) {
            motionEvent.offsetLocation(-this.left, -this.top);
        }
        this.webView.dispatchTouchEvent(motionEvent);
        this.motionEvent = null;
    }

    private void handleActionPointerUp(MotionEvent motionEvent) {
        if (!this.isNeedParallelScroll) {
            motionEvent.offsetLocation(-this.left, -this.top);
        }
        this.webView.dispatchTouchEvent(motionEvent);
        this.motionEvent = null;
    }

    private void handleActionUpOrCancel(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.cacheDownEvent;
        if (motionEvent2 != null) {
            if (!this.isNeedParallelScroll) {
                motionEvent2.offsetLocation(-this.left, -this.top);
            }
            this.webView.dispatchTouchEvent(this.cacheDownEvent);
            this.cacheDownEvent.recycle();
            this.cacheDownEvent = null;
        }
        if (!this.isNeedParallelScroll) {
            motionEvent.offsetLocation(-this.left, -this.top);
        }
        this.webView.dispatchTouchEvent(motionEvent);
        this.motionEvent = null;
        this.isNeedParallelScroll = false;
        this.isParallelScrollLocked = false;
        this.initialPointerCount = 0;
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: touchDown */
    public String m2046xa0cf945c(Map<String, String> map) {
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: touchUp */
    public String m2047x63bbfdbb(Map<String, String> map) {
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: touchMove */
    public String m2048x26a8671a(Map<String, String> map) {
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: touchCancel */
    public String m2049xe994d079(Map<String, String> map) {
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: updateLayout */
    public String m2050xa9e5dea3(Map<String, String> map) {
        if (this.webView == null) {
            return "fail";
        }
        try {
            this.left = Float.parseFloat(map.get("left"));
            this.top = Float.parseFloat(map.get("top"));
            this.width = Float.parseFloat(map.get("width"));
            float f = Float.parseFloat(map.get("height"));
            this.height = f;
            this.webView.setLayoutParams(buildLayoutParams(this.width, f, this.left, this.top));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "updateWebLayout NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: setNestedScrollExt */
    public String m2051x6cd24802(Map<String, String> map) {
        if (this.webView == null) {
            return "fail";
        }
        try {
            this.nestedScrollOptionsExtObject.set(Integer.parseInt(map.get(WEBVIEW_NESTEDSCROLL_UP)), Integer.parseInt(map.get(WEBVIEW_NESTEDSCROLL_DOWN)), Integer.parseInt(map.get(WEBVIEW_NESTEDSCROLL_LEFT)), Integer.parseInt(map.get(WEBVIEW_NESTEDSCROLL_RIGHT)));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "setNestedScrollExt NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: zoomAccess */
    public String m2030x48aa9f6a(Map<String, String> map) {
        if (!map.containsKey(NTC_ZOOM_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            boolean z = Integer.parseInt(map.get(NTC_ZOOM_ACCESS)) == 1;
            this.isZoomAccess = z;
            this.webView.getSettings().setSupportZoom(z);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "zoomAccess NumberFormatException");
            return "fail";
        }
    }

    private String getErrorInfo(String str) {
        ALog.w(LOG_TAG, str + " NumberFormatException");
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: onlineImageAccess */
    public String m2043x9d218103(Map<String, String> map) {
        if (!map.containsKey(NTC_ONLINE_IMAGE_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setBlockNetworkImage(Integer.parseInt(map.get(NTC_ONLINE_IMAGE_ACCESS)) != 0);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_ONLINE_IMAGE_ACCESS);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: geolocationAccess */
    public String m2044x600dea62(Map<String, String> map) {
        if (!map.containsKey(NTC_GEOLOCATION_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setGeolocationEnabled(Integer.parseInt(map.get(NTC_GEOLOCATION_ACCESS)) != 0);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_GEOLOCATION_ACCESS);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: blockNetwork */
    public String m2045x22fa53c1(Map<String, String> map) {
        if (!map.containsKey(NTC_BLOCK_NETWORK) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setBlockNetworkLoads(Integer.parseInt(map.get(NTC_BLOCK_NETWORK)) != 0);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_BLOCK_NETWORK);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: mixedMode */
    public String m2032xfab77c5f(Map<String, String> map) {
        if (!map.containsKey(NTC_MIXED_MODE) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setMixedContentMode(Integer.parseInt(map.get(NTC_MIXED_MODE)));
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_MIXED_MODE);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: domStorageAccess */
    public String m2033xbda3e5be(Map<String, String> map) {
        if (!map.containsKey(NTC_DOM_STORAGE_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setDomStorageEnabled(Integer.parseInt(map.get(NTC_DOM_STORAGE_ACCESS)) != 0);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_DOM_STORAGE_ACCESS);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: cacheMode */
    public String m2034x80904f1d(Map<String, String> map) {
        if (!map.containsKey(NTC_CACHE_MODE) || this.webView == null) {
            return "fail";
        }
        try {
            int i = Integer.parseInt(map.get(NTC_CACHE_MODE));
            if (i == 0) {
                i = -1;
            }
            this.webView.getSettings().setCacheMode(i);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_CACHE_MODE);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: fileAccess */
    public String m2036x66921db(Map<String, String> map) {
        if (this.webView == null || !map.containsKey(NTC_FILE_ACCESS)) {
            return "fail";
        }
        try {
            this.webView.getSettings().setAllowFileAccess(Integer.parseInt(map.get(NTC_FILE_ACCESS)) != 0);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_FILE_ACCESS);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: imageAccess */
    public String m2035x437cb87c(Map<String, String> map) {
        if (!map.containsKey(NTC_IMAGE_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setLoadsImagesAutomatically(Integer.parseInt(map.get(NTC_IMAGE_ACCESS)) != 0);
            return "success";
        } catch (NumberFormatException unused) {
            return getErrorInfo(NTC_IMAGE_ACCESS);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: javascriptAccess */
    public String m2031xb9708c9(Map<String, String> map) {
        if (!map.containsKey(NTC_JAVASCRIPT_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setJavaScriptEnabled(Integer.parseInt(map.get(NTC_JAVASCRIPT_ACCESS)) == 1);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "javascriptAccess NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: minFontSize */
    public String m2038xce837228(Map<String, String> map) {
        if (!map.containsKey(NTC_MIN_FONT_SIZE) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setMinimumFontSize(Integer.parseInt(map.get(NTC_MIN_FONT_SIZE)));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "minFontSize NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: textZoomRatio */
    public String m2037xc9558b3a(Map<String, String> map) {
        if (!map.containsKey(NTC_TEXT_ZOOM_RATIO) || this.webView == null) {
            ALog.e(LOG_TAG, "textZoomRatio failed");
            return "fail";
        }
        try {
            this.webView.getSettings().setTextZoom(Integer.parseInt(map.get(NTC_TEXT_ZOOM_RATIO)));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "textZoom NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: horizontalScrollBarAccess */
    public String m2039x916fdb87(Map<String, String> map) {
        if (!map.containsKey(NTC_HORIZONTAL_SCROLLBAR_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.setHorizontalScrollBarEnabled(Integer.parseInt(map.get(NTC_HORIZONTAL_SCROLLBAR_ACCESS)) == 1);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "horizontalScrollBarAccess NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: verticalScrollBarAccess */
    public String m2040x545c44e6(Map<String, String> map) {
        if (!map.containsKey(NTC_VERTICAL_SCROLLBAR_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.setVerticalScrollBarEnabled(Integer.parseInt(map.get(NTC_VERTICAL_SCROLLBAR_ACCESS)) == 1);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "verticalScrollBarAccess NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: backgroundColor */
    public String m2041x1748ae45(Map<String, String> map) {
        if (!map.containsKey("backgroundColor") || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.setBackgroundColor(Integer.parseInt(map.get("backgroundColor")));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "backgroundColor NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: mediaPlayGestureAccess */
    public String m2042xda3517a4(Map<String, String> map) {
        if (!map.containsKey(NTC_MEDIA_PLAY_GESTURE_ACCESS) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.getSettings().setMediaPlaybackRequiresUserGesture(Integer.parseInt(map.get(NTC_MEDIA_PLAY_GESTURE_ACCESS)) == 1);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "mediaPlayGestureAccess NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void evaluateJavascript(String str, final long j) {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.evaluateJavascript(str, new ValueCallback<String>() { // from class: ohos.ace.adapter.capability.web.AceWeb.6
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                ALog.w(AceWeb.LOG_TAG, "evaluateJavascript onReceiveValue:" + str2);
                AceWebPluginBase.onReceiveValue(str2, j);
            }
        });
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void evaluateJavascriptExt(String str, final long j) {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.evaluateJavascript(str, new ValueCallback<String>() { // from class: ohos.ace.adapter.capability.web.AceWeb.7
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (str2.equals(Constants.NULL)) {
                    str2 = "This type not support, only string is supported";
                }
                AceWebPluginBase.onReceiveRunJavaScriptExtValue(str2, j);
            }
        });
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public WebBackForwardList getBackForwardEntries() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return null;
        }
        return aceWebView.copyBackForwardList();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void clearCache(boolean z) {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.clearCache(z);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void goBackOrForward(int i) {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        aceWebView.goBackOrForward(i);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String getTitle() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return "";
        }
        return aceWebView.getTitle();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public int getContentHeight() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return -1;
        }
        return aceWebView.getContentHeight();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String[] createWebMessagePorts() {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = this.webView.createWebMessageChannel();
        this.webMessagePorts.clear();
        for (WebMessagePort webMessagePort : webMessagePortArrCreateWebMessageChannel) {
            this.webMessagePorts.add(webMessagePort);
        }
        return new String[]{WEB_MESSAGE_PORT_ONE, WEB_MESSAGE_PORT_TWO};
    }

    public WebMessagePort getWebMessagePort(String str) {
        if (this.webMessagePorts.isEmpty()) {
            return null;
        }
        if (WEB_MESSAGE_PORT_ONE.equals(str)) {
            return this.webMessagePorts.get(0);
        }
        if (WEB_MESSAGE_PORT_TWO.equals(str)) {
            return this.webMessagePorts.get(1);
        }
        return null;
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void postWebMessage(String str, String[] strArr, String str2) {
        if (this.webMessagePorts.isEmpty()) {
            return;
        }
        int length = strArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = getWebMessagePort(strArr[i]);
        }
        try {
            this.webView.postWebMessage(new WebMessage(str, webMessagePortArr), Uri.parse(str2));
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "Port is already transferred");
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void closeWebMessagePort(String str) {
        WebMessagePort webMessagePort;
        if (this.webMessagePorts.isEmpty() || str == null || (webMessagePort = getWebMessagePort(str)) == null) {
            return;
        }
        try {
            webMessagePort.close();
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "Port is already transferred");
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public int postMessageEvent(String str, String str2) {
        WebMessagePort webMessagePort;
        if (this.webMessagePorts.isEmpty() || str == null || (webMessagePort = getWebMessagePort(str)) == null) {
            return CAN_NOT_POST_MESSAGE;
        }
        try {
            webMessagePort.postMessage(new WebMessage(str2));
            return 0;
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "postMessageEvent has already disenabled");
            return CAN_NOT_POST_MESSAGE;
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public int postMessageEventExt(String str, String str2) {
        WebMessagePort webMessagePort;
        if (this.webMessagePorts.isEmpty() || str == null || (webMessagePort = getWebMessagePort(str)) == null) {
            return CAN_NOT_POST_MESSAGE;
        }
        ALog.e(LOG_TAG, "postMessageEventExt webMessageData:" + str2);
        try {
            webMessagePort.postMessage(new WebMessage(str2));
            return 0;
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "postMessageEventExt has already disenabled");
            return CAN_NOT_POST_MESSAGE;
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public int onWebMessagePortEvent(final long j, final String str) {
        WebMessagePort webMessagePort;
        if (this.webMessagePorts.isEmpty() || str == null || (webMessagePort = getWebMessagePort(str)) == null) {
            return CAN_NOT_REGISTER_MESSAGE_EVENT;
        }
        try {
            webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: ohos.ace.adapter.capability.web.AceWeb.8
                @Override // android.webkit.WebMessagePort.WebMessageCallback
                public void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                    if (webMessage == null) {
                        return;
                    }
                    AceWebPluginBase.onMessage(j, str, webMessage.getData());
                }
            });
            return 0;
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "onWebMessagePortEvent has already disenabled");
            return CAN_NOT_REGISTER_MESSAGE_EVENT;
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void startDownload(long j, String str) {
        String strCreateDownloadGuid = AceWebDownloadHelperObject.createDownloadGuid();
        AceWebDownloadItemObject aceWebDownloadItemObject = new AceWebDownloadItemObject(j, strCreateDownloadGuid, URLUtil.guessFileName(str, null, null), 4, str);
        synchronized (WEB_LOCK) {
            this.webDownloadItemMap_.put(strCreateDownloadGuid, aceWebDownloadItemObject);
        }
        try {
            this.downloadExecutor_.execute(new WebDownloadHeadRunnable(strCreateDownloadGuid));
        } catch (RejectedExecutionException e) {
            ALog.e(LOG_TAG, "startDownload failed:" + e);
            sendWebviewDownloadFailedBroadcast(strCreateDownloadGuid, 0);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void start(long j, String str, String str2) {
        DownloadManager downloadManager;
        synchronized (WEB_LOCK) {
            AceWebDownloadItemObject aceWebDownloadItemObject = this.webDownloadItemMap_.get(str);
            if (aceWebDownloadItemObject == null) {
                ALog.e(LOG_TAG, "can't find webdownload data");
                return;
            }
            setDownloadPath(str2, aceWebDownloadItemObject);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(aceWebDownloadItemObject.getUrl()));
            request.setNotificationVisibility(1);
            request.setAllowedOverMetered(false);
            request.setVisibleInDownloadsUi(true);
            request.setAllowedOverMetered(true);
            request.setAllowedNetworkTypes(3);
            request.setDestinationUri(Uri.fromFile(new File(aceWebDownloadItemObject.getRealPath(), aceWebDownloadItemObject.getRealName())));
            Object systemService = this.context.getSystemService("download");
            if (systemService != null && (systemService instanceof DownloadManager) && (downloadManager = (DownloadManager) systemService) != null) {
                long jEnqueue = downloadManager.enqueue(request);
                aceWebDownloadItemObject.setDownloadId(jEnqueue);
                this.webDownloadItemIdMap_.put(Long.valueOf(jEnqueue), str);
                startDownloadUpdateTimer();
                return;
            }
            sendWebviewDownloadFailedBroadcast(aceWebDownloadItemObject.getGuid(), 0);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void cancel(long j, String str) {
        synchronized (WEB_LOCK) {
            AceWebDownloadItemObject aceWebDownloadItemObject = this.webDownloadItemMap_.get(str);
            if (aceWebDownloadItemObject == null) {
                ALog.e(LOG_TAG, "download failed, start aceWebDownloadItemObject is null");
                return;
            }
            Object systemService = this.context.getSystemService("download");
            DownloadManager downloadManager = (systemService == null || !(systemService instanceof DownloadManager)) ? null : (DownloadManager) systemService;
            if (downloadManager != null) {
                downloadManager.remove(aceWebDownloadItemObject.getDownloadId());
            }
            updateDownloadDataWithState(aceWebDownloadItemObject, 2, 40);
            AceWebPluginBase.onDownloadFailedObject(aceWebDownloadItemObject.getWebId(), aceWebDownloadItemObject);
            clearAllDownloadDataByGuid(str, aceWebDownloadItemObject.getDownloadId(), aceWebDownloadItemObject.getFullPath());
        }
    }

    class WebDownloadHeadRunnable implements Runnable {
        private final String guid_;

        public WebDownloadHeadRunnable(String str) {
            this.guid_ = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (AceWeb.WEB_LOCK) {
                AceWebDownloadItemObject aceWebDownloadItemObject = (AceWebDownloadItemObject) AceWeb.this.webDownloadItemMap_.get(this.guid_);
                if (aceWebDownloadItemObject == null) {
                    AceWeb.this.clearAllDownloadDataByGuid(this.guid_, -1L, aceWebDownloadItemObject.getFullPath());
                    ALog.e(AceWeb.LOG_TAG, "can't find webdownload data");
                    return;
                }
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(aceWebDownloadItemObject.getUrl()).openConnection();
                    HttpURLConnection httpURLConnection = (uRLConnectionOpenConnection == null || !(uRLConnectionOpenConnection instanceof HttpURLConnection)) ? null : (HttpURLConnection) uRLConnectionOpenConnection;
                    if (httpURLConnection == null) {
                        AceWeb.this.sendWebviewDownloadBroadcastByKey(AceWeb.WEB_DOWNLOAD_START_EVENT, this.guid_);
                        return;
                    }
                    httpURLConnection.setRequestMethod("HEAD");
                    aceWebDownloadItemObject.setMethod("GET");
                    if (httpURLConnection.getResponseCode() == 200) {
                        long contentLength = httpURLConnection.getContentLength();
                        String contentType = httpURLConnection.getContentType();
                        if (contentLength == -1) {
                            contentLength = 0;
                        }
                        aceWebDownloadItemObject.setTotalBytes(contentLength);
                        if (contentType == null) {
                            contentType = "";
                        }
                        aceWebDownloadItemObject.setMimeType(contentType);
                    }
                    httpURLConnection.disconnect();
                    AceWeb.this.sendWebviewDownloadBroadcastByKey(AceWeb.WEB_DOWNLOAD_START_EVENT, this.guid_);
                } catch (ProtocolException e) {
                    AceWeb.this.sendWebviewDownloadFailedBroadcast(aceWebDownloadItemObject.getGuid(), 0);
                    ALog.e(AceWeb.LOG_TAG, "connect failed," + e);
                } catch (IOException e2) {
                    AceWeb.this.sendWebviewDownloadFailedBroadcast(aceWebDownloadItemObject.getGuid(), 22);
                    ALog.e(AceWeb.LOG_TAG, "connect failed," + e2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int queryDownloadState(AceWebDownloadItemObject aceWebDownloadItemObject) {
        Object systemService = this.context.getSystemService("download");
        DownloadManager downloadManager = (systemService == null || !(systemService instanceof DownloadManager)) ? null : (DownloadManager) systemService;
        DownloadManager.Query query = new DownloadManager.Query();
        if (downloadManager == null || aceWebDownloadItemObject == null) {
            ALog.e(LOG_TAG, "queryDownloadState failed");
            return 1;
        }
        query.setFilterById(aceWebDownloadItemObject.getDownloadId());
        Cursor cursorQuery = downloadManager.query(query);
        if (cursorQuery.moveToFirst()) {
            try {
                aceWebDownloadItemObject.setState(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status")));
                aceWebDownloadItemObject.setLastErrorCode(AceWebDownloadHelperObject.convertsHttpErrorCode(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("reason"))));
                aceWebDownloadItemObject.setReceivedBytes(cursorQuery.getLong(cursorQuery.getColumnIndex("bytes_so_far")));
                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                if (j != -1) {
                    aceWebDownloadItemObject.setTotalBytes(j);
                }
            } catch (IllegalArgumentException e) {
                ALog.e(LOG_TAG, "query failed," + e);
            }
        }
        return aceWebDownloadItemObject.getState();
    }

    private void startDownloadUpdateTimer() {
        synchronized (WEB_LOCK) {
            if (this.webDownloadUpdateTimer_ != null) {
                return;
            }
            this.webDownloadUpdateTimer_ = new Timer();
            TimerTask timerTask = new TimerTask() { // from class: ohos.ace.adapter.capability.web.AceWeb.9
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    synchronized (AceWeb.WEB_LOCK) {
                        if (AceWeb.this.webDownloadItemMap_.isEmpty()) {
                            AceWeb.this.stopDownloadUpdateTimer();
                        }
                        Iterator it = AceWeb.this.webDownloadItemMap_.entrySet().iterator();
                        while (it.hasNext()) {
                            AceWebDownloadItemObject aceWebDownloadItemObject = (AceWebDownloadItemObject) ((Map.Entry) it.next()).getValue();
                            if (aceWebDownloadItemObject != null && aceWebDownloadItemObject.getDownloadId() != -1) {
                                int iQueryDownloadState = AceWeb.this.queryDownloadState(aceWebDownloadItemObject);
                                if (iQueryDownloadState == 2) {
                                    AceWeb.this.updateDownloadDataWithState(aceWebDownloadItemObject, 0, 0);
                                    AceWeb.this.sendWebviewDownloadBroadcastByKey(AceWeb.WEB_DOWNLOAD_UPDATE_EVENT, aceWebDownloadItemObject.getGuid());
                                } else if (iQueryDownloadState == 4) {
                                    if (aceWebDownloadItemObject.getLastErrorCode() != 0) {
                                        Object systemService = AceWeb.this.context.getSystemService("download");
                                        DownloadManager downloadManager = (systemService == null || !(systemService instanceof DownloadManager)) ? null : (DownloadManager) systemService;
                                        if (downloadManager != null) {
                                            downloadManager.remove(aceWebDownloadItemObject.getDownloadId());
                                        }
                                        AceWeb.this.updateDownloadDataWithState(aceWebDownloadItemObject, 3, aceWebDownloadItemObject.getLastErrorCode());
                                        AceWeb.this.sendWebviewDownloadFailedBroadcast(aceWebDownloadItemObject.getGuid(), aceWebDownloadItemObject.getLastErrorCode());
                                    }
                                } else if (iQueryDownloadState == 16) {
                                    AceWeb.this.updateDownloadDataWithState(aceWebDownloadItemObject, 3, aceWebDownloadItemObject.getLastErrorCode());
                                    AceWeb.this.sendWebviewDownloadFailedBroadcast(aceWebDownloadItemObject.getGuid(), 0);
                                }
                            }
                        }
                    }
                }
            };
            Timer timer = this.webDownloadUpdateTimer_;
            if (timer != null) {
                timer.schedule(timerTask, 0L, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopDownloadUpdateTimer() {
        synchronized (WEB_LOCK) {
            if (this.webDownloadUpdateTimer_ != null && this.webDownloadItemMap_.isEmpty()) {
                this.webDownloadUpdateTimer_.cancel();
                this.webDownloadUpdateTimer_ = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDownloadDataWithState(AceWebDownloadItemObject aceWebDownloadItemObject, int i, int i2) {
        if (aceWebDownloadItemObject != null) {
            aceWebDownloadItemObject.setState(i);
            aceWebDownloadItemObject.setLastErrorCode(i2);
            if (i == 2 || i == 3) {
                aceWebDownloadItemObject.setPercentComplete(0);
                aceWebDownloadItemObject.setReceivedBytes(0L);
                aceWebDownloadItemObject.setFullPath("");
                return;
            }
            long lastBytes = aceWebDownloadItemObject.getLastBytes();
            long receivedBytes = aceWebDownloadItemObject.getReceivedBytes();
            long totalBytes = aceWebDownloadItemObject.getTotalBytes();
            long j = (receivedBytes - lastBytes) * 2;
            if (j > totalBytes) {
                j = totalBytes;
            }
            aceWebDownloadItemObject.setCurrentSpeed(j);
            aceWebDownloadItemObject.setLastBytes(receivedBytes);
            if (totalBytes > 0) {
                aceWebDownloadItemObject.setPercentComplete(Math.round((receivedBytes * 100) / totalBytes));
            }
        }
    }

    private void onWebviewDownloadFailedInMain(String str, int i) {
        synchronized (WEB_LOCK) {
            AceWebDownloadItemObject aceWebDownloadItemObject = this.webDownloadItemMap_.get(str);
            if (aceWebDownloadItemObject != null) {
                updateDownloadDataWithState(aceWebDownloadItemObject, 3, i);
                AceWebPluginBase.onDownloadFailedObject(aceWebDownloadItemObject.getWebId(), aceWebDownloadItemObject);
                clearAllDownloadDataByGuid(str, -1L, aceWebDownloadItemObject.getFullPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actionWebviewDownloadStart(Intent intent) {
        String stringExtra = intent.getStringExtra("guid");
        synchronized (WEB_LOCK) {
            AceWebDownloadItemObject aceWebDownloadItemObject = this.webDownloadItemMap_.get(stringExtra);
            if (aceWebDownloadItemObject != null) {
                AceWebPluginBase.onBeforeDownloadObject(aceWebDownloadItemObject.getWebId(), aceWebDownloadItemObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actionWebviewDownloadUpdate(Intent intent) {
        String stringExtra = intent.getStringExtra("guid");
        synchronized (WEB_LOCK) {
            AceWebDownloadItemObject aceWebDownloadItemObject = this.webDownloadItemMap_.get(stringExtra);
            if (aceWebDownloadItemObject != null) {
                AceWebPluginBase.onDownloadUpdatedObject(aceWebDownloadItemObject.getWebId(), aceWebDownloadItemObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actionWebviewDownloadFailed(Intent intent) {
        onWebviewDownloadFailedInMain(intent.getStringExtra("guid"), intent.getIntExtra("errCode", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actionWebviewDownloadComplete(Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        synchronized (WEB_LOCK) {
            String str = this.webDownloadItemIdMap_.get(Long.valueOf(longExtra));
            AceWebDownloadItemObject aceWebDownloadItemObject = this.webDownloadItemMap_.get(str);
            if (aceWebDownloadItemObject != null) {
                if (queryDownloadState(aceWebDownloadItemObject) == 16) {
                    updateDownloadDataWithState(aceWebDownloadItemObject, 3, aceWebDownloadItemObject.getLastErrorCode());
                    AceWebPluginBase.onDownloadFailedObject(aceWebDownloadItemObject.getWebId(), aceWebDownloadItemObject);
                } else {
                    updateDownloadDataWithState(aceWebDownloadItemObject, 1, 0);
                    AceWebPluginBase.onDownloadFinishObject(aceWebDownloadItemObject.getWebId(), aceWebDownloadItemObject);
                }
                clearAllDownloadDataByGuid(str, aceWebDownloadItemObject.getDownloadId(), aceWebDownloadItemObject.getFullPath());
            }
        }
    }

    class WebviewBroadcastReceive extends BroadcastReceiver {
        WebviewBroadcastReceive() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (AceWeb.WEB_DOWNLOAD_START_EVENT.equals(action)) {
                AceWeb.this.actionWebviewDownloadStart(intent);
                return;
            }
            if (AceWeb.WEB_DOWNLOAD_UPDATE_EVENT.equals(action)) {
                AceWeb.this.actionWebviewDownloadUpdate(intent);
            } else if (AceWeb.WEB_DOWNLOAD_FAILED_EVENT.equals(action)) {
                AceWeb.this.actionWebviewDownloadFailed(intent);
            } else if ("android.intent.action.DOWNLOAD_COMPLETE".equals(action)) {
                AceWeb.this.actionWebviewDownloadComplete(intent);
            }
        }
    }

    private void registerWebviewReceiver(Context context) {
        if (this.webviewBroadcastReceive_ == null) {
            this.webviewBroadcastReceive_ = new WebviewBroadcastReceive();
        }
        if (this.isReceiverRegistered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        intentFilter.addAction(WEB_DOWNLOAD_UPDATE_EVENT);
        intentFilter.addAction(WEB_DOWNLOAD_START_EVENT);
        intentFilter.addAction(WEB_DOWNLOAD_FAILED_EVENT);
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.webviewBroadcastReceive_, intentFilter, 2);
            } else {
                context.registerReceiver(this.webviewBroadcastReceive_, intentFilter);
            }
            this.isReceiverRegistered = true;
        } catch (IllegalArgumentException e) {
            ALog.e(LOG_TAG, "registerWebviewReceiver IllegalArgumentException: " + e.getMessage());
        } catch (SecurityException e2) {
            ALog.e(LOG_TAG, "registerWebviewReceiver SecurityException: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWebviewDownloadBroadcastByKey(String str, String str2) {
        Intent intent = new Intent(str);
        intent.putExtra("guid", str2);
        sendWebviewDownloadBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWebviewDownloadFailedBroadcast(String str, int i) {
        Intent intent = new Intent(WEB_DOWNLOAD_FAILED_EVENT);
        intent.putExtra("guid", str);
        intent.putExtra("errCode", i);
        sendWebviewDownloadBroadcast(intent);
    }

    private void sendWebviewDownloadBroadcast(Intent intent) {
        Context context = this.context;
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }

    private void setDownloadPath(String str, AceWebDownloadItemObject aceWebDownloadItemObject) {
        String nonDuplicatePath;
        if (aceWebDownloadItemObject.getFullPath().equals("")) {
            if (AceWebDownloadHelperObject.isLegalPath(str)) {
                nonDuplicatePath = AceWebDownloadHelperObject.getNonDuplicatePath(str);
            } else {
                nonDuplicatePath = AceWebDownloadHelperObject.getNonDuplicatePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + WEB_DOWNLOAD_CONCAT_DIR + aceWebDownloadItemObject.getSuggestedFileName());
            }
            int iLastIndexOf = nonDuplicatePath.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                int i = iLastIndexOf + 1;
                String strSubstring = nonDuplicatePath.substring(0, i);
                aceWebDownloadItemObject.setRealName(nonDuplicatePath.substring(i));
                aceWebDownloadItemObject.setRealPath(strSubstring);
            } else {
                aceWebDownloadItemObject.setRealPath(nonDuplicatePath);
            }
            aceWebDownloadItemObject.setFullPath(nonDuplicatePath);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllDownloadDataByGuid(String str, long j, String str2) {
        synchronized (WEB_LOCK) {
            this.webDownloadItemMap_.remove(str);
            this.webDownloadItemIdMap_.remove(Long.valueOf(j));
            AceWebDownloadHelperObject.removeFilePathFromList(str2);
            stopDownloadUpdateTimer();
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public int onWebMessagePortEventExt(final long j, final String str) {
        WebMessagePort webMessagePort;
        if (this.webMessagePorts.isEmpty() || str == null || (webMessagePort = getWebMessagePort(str)) == null) {
            return CAN_NOT_REGISTER_MESSAGE_EVENT;
        }
        try {
            webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: ohos.ace.adapter.capability.web.AceWeb.10
                @Override // android.webkit.WebMessagePort.WebMessageCallback
                public void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                    if (webMessage == null) {
                        return;
                    }
                    AceWebPluginBase.onMessageEventExt(j, str, webMessage.getData());
                }
            });
            return 0;
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "onWebMessagePortEventExt has already disenabled");
            return CAN_NOT_REGISTER_MESSAGE_EVENT;
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String scrollTo(Map<String, String> map) {
        if (!map.containsKey(NTC_PARAM_SCROLLTO_X) || !map.containsKey(NTC_PARAM_SCROLLTO_Y) || this.webView == null) {
            return "fail";
        }
        try {
            this.webView.scrollTo(Integer.parseInt(map.get(NTC_PARAM_SCROLLTO_X)), Integer.parseInt(map.get(NTC_PARAM_SCROLLTO_Y)));
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "scrollTo NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String scrollBy(Map<String, String> map) {
        if (!map.containsKey(NTC_PARAM_SCROLLBY_DELTAX) || !map.containsKey(NTC_PARAM_SCROLLBY_DELTAY) || this.webView == null) {
            return "fail";
        }
        try {
            int i = Integer.parseInt(map.get(NTC_PARAM_SCROLLBY_DELTAX));
            int i2 = Integer.parseInt(map.get(NTC_PARAM_SCROLLBY_DELTAY));
            int scrollX = this.webView.getScrollX();
            int scrollY = this.webView.getScrollY();
            AceWebView aceWebView = this.webView;
            if (scrollX + i < 0) {
                i = -scrollX;
            }
            if (scrollX + i2 < 0) {
                i2 = -scrollY;
            }
            aceWebView.scrollBy(i, i2);
            return "success";
        } catch (NumberFormatException unused) {
            ALog.w(LOG_TAG, "scrollBy NumberFormatException");
            return "fail";
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: zoom */
    public String m2016x8e8f05ca(Map<String, String> map) {
        if (map == null || this.webView == null || !map.containsKey(NTC_ZOOM_FACTOR)) {
            return "fail";
        }
        String str = map.get(NTC_ZOOM_FACTOR);
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.zoomBy(Float.parseFloat(str));
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String zoomIn() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null || aceWebView == null) {
            return "fail";
        }
        aceWebView.zoomBy(WEBVIEW_ZOOMIN_VALUE);
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String zoomOut() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null || aceWebView == null) {
            return "fail";
        }
        aceWebView.zoomBy(WEBVIEW_ZOOMOUT_VALUE);
        return "success";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void pageUp(boolean z) {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return;
        }
        int height = aceWebView.getHeight() / 2;
        int scrollY = this.webView.getScrollY();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, z ? 0 : Math.max(0, scrollY - height));
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ohos.ace.adapter.capability.web.AceWeb.11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AceWeb.this.webView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfInt.start();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String getOriginalUrl() {
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            return "";
        }
        return aceWebView.getOriginalUrl();
    }

    public boolean getZoomAccess() {
        return this.isZoomAccess;
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    /* JADX INFO: renamed from: clearHistory */
    public String m2018x38b44bc9(Map<String, String> map) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.clearHistory();
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void setUserAgentString(String str) {
        this.webView.getSettings().setUserAgentString(str);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String getUserAgentString() {
        return this.webView.getSettings().getUserAgentString();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void setWebDebuggingAccess(boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String pageDown(boolean z) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            int height = aceWebView.getHeight();
            int contentHeight = (int) ((this.webView.getContentHeight() * this.webView.getScale()) - height);
            int i = height / 2;
            int scrollY = this.webView.getScrollY();
            final int scrollX = this.webView.getScrollX();
            if (!z) {
                contentHeight = Math.min(contentHeight, i + scrollY);
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, contentHeight);
            valueAnimatorOfInt.setDuration(500L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ohos.ace.adapter.capability.web.AceWeb.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AceWeb.this.webView.scrollTo(scrollX, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String postUrl(String str, byte[] bArr) {
        AceWebView aceWebView = this.webView;
        if (aceWebView != null) {
            aceWebView.postUrl(str, bArr);
            return "success";
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void registerJavaScriptProxy(String str, String[] strArr, String[] strArr2, String str2) {
        ALog.i(LOG_TAG, "registerJavaScriptProxy objectName: " + str);
        if (!this.isJavaScriptEnabled) {
            this.jsObjectName = str;
            this.jsSyncMethod = strArr;
            this.jsAsyncMethod = strArr2;
        }
        AceWebView aceWebView = this.webView;
        if (aceWebView == null) {
            ALog.e(LOG_TAG, "registerJavaScriptProxy webView is null");
            return;
        }
        aceWebView.getSettings().setJavaScriptEnabled(true);
        for (String str3 : strArr) {
            this.webView.evaluateJavascript(String.format("window.%s = window.%s || {}; window.%s.%s = function(...args) {const paramsJson = JSON.stringify(args); let ret = AceWebHandler.callSyncFunction('%s', '%s', paramsJson);const obj = JSON.parse(ret);return obj.value;};", str, str, str, str3, str, str3), null);
        }
        for (String str4 : strArr2) {
            this.webView.evaluateJavascript(String.format("window.%s = window.%s || {}; window.%s.%s = function(...args) {const paramsJson = JSON.stringify(args); AceWebHandler.callAsyncFunction('%s', '%s', paramsJson);};", str, str, str, str4, str, str4), null);
        }
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void deleteJavaScriptRegister(String str) {
        ALog.i(LOG_TAG, "deleteJavaScriptRegister objectName: " + str);
        if (this.webView != null) {
            this.webView.evaluateJavascript(String.format("delete window.%s;", str), null);
        }
        this.jsObjectName = null;
        this.jsSyncMethod = null;
        this.jsAsyncMethod = null;
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public boolean setWebSchemeHandler(String str) {
        this.webSchemeHandlerList.add(str);
        return true;
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public void clearWebSchemeHandler() {
        this.webSchemeHandlerList.clear();
    }

    @Override // ohos.ace.adapter.capability.web.AceWebBase
    public String getDefaultUserAgent() {
        return WebSettings.getDefaultUserAgent(this.context);
    }
}

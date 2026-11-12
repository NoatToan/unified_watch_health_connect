package com.huami.web.container.jsbridge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.huami.discovery.bridge.jsbridge.JsBridgeCallback;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.share.ShareAnalyzeUtil;
import com.huami.discovery.bridge.model.JsCashierReq;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.WebExternalsKt;
import com.huami.web.container.jsbridge.JsBridgeAdapter;
import com.huami.web.container.utils.H5Utils;
import com.huami.web.container.utils.UtilsKt;
import com.huami.widget.share.FunctionActionListener;
import com.huami.widget.share.FunctionItem;
import com.huami.widget.share.FunctionSheet;
import com.huami.widget.share.FunctionType;
import com.huami.widget.share.ShareConfig;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.ShareDialog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes17.dex */
public abstract class JsBridgeAdapter implements JsBridgeCallback {
    private static final String f = "JsBridgeAdapter";
    private ShareDialog a;
    private ShareAnalyzeUtil.JSShareStruct b;
    private WebView c;
    private FunctionSheet d;
    private BaseTitleActivity e;

    public class a implements ShareDialog.OnShareItemClickedListener {
        public final /* synthetic */ ShareAnalyzeUtil.JSShareStruct a;

        /* JADX INFO: renamed from: com.huami.web.container.jsbridge.JsBridgeAdapter$a$a, reason: collision with other inner class name */
        public class C0712a implements Action1<ShareContent> {
            public C0712a() {
            }

            @Override // rx.functions.Action1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(ShareContent shareContent) {
                JsBridgeAdapter.this.a.shareTo(shareContent, null);
            }
        }

        public a(ShareAnalyzeUtil.JSShareStruct jSShareStruct) {
            this.a = jSShareStruct;
        }

        @Override // com.huami.widget.share.ShareDialog.OnShareItemClickedListener
        public void onShareItemClicked(int i, boolean z) {
            if (z) {
                JsBridgeAdapter.this.n(this.a, i, new C0712a());
            }
        }
    }

    public class b implements Observable.OnSubscribe<ShareContent> {
        public final /* synthetic */ ShareAnalyzeUtil.JSShareItem a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ShareContent c;

        public b(ShareAnalyzeUtil.JSShareItem jSShareItem, String str, ShareContent shareContent) {
            this.a = jSShareItem;
            this.b = str;
            this.c = shareContent;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super ShareContent> subscriber) {
            if (this.a.isCaptureLongScreen()) {
                HMLog.i(JsBridgeAdapter.f, "Capture Long View!!", new Object[0]);
                Bitmap bitmapO = JsBridgeAdapter.this.o();
                boolean zSaveBitmapToFile = UtilsKt.saveBitmapToFile(this.b, bitmapO, 100);
                if (!bitmapO.isRecycled()) {
                    bitmapO.recycle();
                }
                if (zSaveBitmapToFile) {
                    this.c.bitmapUrl = this.b;
                }
            } else {
                WebView webView = JsBridgeAdapter.this.c;
                if (webView != null) {
                    HMLog.i(JsBridgeAdapter.f, "Capture View!!", new Object[0]);
                    this.c.bitmapUrl = UtilsKt.captureViewShare(webView, JsBridgeAdapter.this.e);
                }
            }
            subscriber.onNext(this.c);
            HMLog.i(JsBridgeAdapter.f, "rx shareToUrl: " + this.c.url + ", shareToBitmapUrl : " + this.c.bitmapUrl, new Object[0]);
        }
    }

    public class c implements Observable.OnSubscribe<ShareContent> {
        public final /* synthetic */ ShareAnalyzeUtil.JSShareItem a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ShareContent c;

        public c(ShareAnalyzeUtil.JSShareItem jSShareItem, String str, ShareContent shareContent) {
            this.a = jSShareItem;
            this.b = str;
            this.c = shareContent;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super ShareContent> subscriber) {
            try {
                if (UtilsKt.saveBitmapToFile(this.b, HMImageLoader.with((FragmentActivity) JsBridgeAdapter.this.e).load(this.a.getImageUrl()).get(), 100)) {
                    this.c.bitmapUrl = this.b;
                }
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.i(JsBridgeAdapter.f, "FutureTarget Exception:" + e.getMessage(), new Object[0]);
            }
            HMLog.i(JsBridgeAdapter.f, "rx shareToUrl: " + this.c.url + ", shareToBitmapUrl : " + this.c.bitmapUrl, new Object[0]);
            subscriber.onNext(this.c);
        }
    }

    public class d implements FunctionActionListener {
        public final /* synthetic */ ShareAnalyzeUtil.JSShareStruct a;

        public class a implements Action1<ShareContent> {
            public a() {
            }

            @Override // rx.functions.Action1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(ShareContent shareContent) {
                JsBridgeAdapter.this.d.shareTo(shareContent);
            }
        }

        public d(ShareAnalyzeUtil.JSShareStruct jSShareStruct) {
            this.a = jSShareStruct;
        }

        @Override // com.huami.widget.share.ShareListener
        public void onFailed(int i, String str) {
        }

        @Override // com.huami.widget.share.FunctionActionListener
        public void onFunctionItemClicked(FunctionItem functionItem) {
            if (functionItem.getFunctionType() == FunctionType.refresh) {
                JsBridgeAdapter.this.c.reload();
            }
        }

        @Override // com.huami.widget.share.ShareListener
        public ShareContent onShareContentCreated(int i) {
            return null;
        }

        @Override // com.huami.widget.share.ShareListener
        public void onStart(int i) {
            JsBridgeAdapter.this.n(this.a, i, new a());
        }

        @Override // com.huami.widget.share.ShareListener
        public void onSuccess(int i) {
        }
    }

    public JsBridgeAdapter(BaseTitleActivity baseTitleActivity) {
        this.e = baseTitleActivity;
    }

    private ShareConfig l(ShareAnalyzeUtil.JSShareStruct jSShareStruct) {
        ShareConfig shareConfig = new ShareConfig();
        if (jSShareStruct != null) {
            ShareAnalyzeUtil.JSShareItem qzoneShareItem = jSShareStruct.getQzoneShareItem();
            if (qzoneShareItem == null) {
                qzoneShareItem = jSShareStruct.getDefaultShareItem();
            }
            shareConfig.qqZoneShareType = TextUtils.isEmpty(qzoneShareItem.getLink()) ? 19 : 18;
        }
        if (shareConfig.qqZoneShareType == 0) {
            shareConfig.isOnlyImage = false;
        }
        if (jSShareStruct.getShareTypeItems() != null) {
            shareConfig.shareItemType = 9;
            shareConfig.shareItems = jSShareStruct.getShareTypeItems();
        }
        return shareConfig;
    }

    private ShareConfig m(ShareAnalyzeUtil.JSShareStruct jSShareStruct) {
        ShareConfig shareConfig = new ShareConfig();
        shareConfig.qqZoneShareType = 0;
        if (jSShareStruct != null) {
            ShareAnalyzeUtil.JSShareItem qzoneShareItem = jSShareStruct.getQzoneShareItem();
            if (qzoneShareItem == null) {
                qzoneShareItem = jSShareStruct.getDefaultShareItem();
            }
            shareConfig.qqZoneShareType = TextUtils.isEmpty(qzoneShareItem.getLink()) ? 19 : 18;
        }
        if (shareConfig.qqZoneShareType == 0) {
            shareConfig.isOnlyImage = false;
        }
        return shareConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(ShareAnalyzeUtil.JSShareStruct jSShareStruct, int i, Action1<ShareContent> action1) {
        ShareAnalyzeUtil.JSShareItem jsShareItemByShareTo = jSShareStruct.getJsShareItemByShareTo(i);
        HMLog.i(f, "shareItem:" + jsShareItemByShareTo, new Object[0]);
        ShareContent shareContent = new ShareContent();
        shareContent.title = jsShareItemByShareTo.getTitle();
        shareContent.content = jsShareItemByShareTo.getDesc();
        shareContent.url = jsShareItemByShareTo.getLink();
        shareContent.h5ShareType = jsShareItemByShareTo.getType();
        if (TextUtils.isEmpty(shareContent.topic)) {
            shareContent.topic = shareContent.content;
        }
        String absolutePath = FileUtils.getShareImagePath(this.e).getAbsolutePath();
        if (jsShareItemByShareTo.isCapture()) {
            Observable.create(new b(jsShareItemByShareTo, absolutePath, shareContent)).subscribeOn(AndroidSchedulers.mainThread()).subscribe(action1, new Action1() { // from class: lj4
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    JsBridgeAdapter.q((Throwable) obj);
                }
            });
        } else if (!TextUtils.isEmpty(jsShareItemByShareTo.getImageUrl())) {
            Observable.create(new c(jsShareItemByShareTo, absolutePath, shareContent)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(action1, new Action1() { // from class: mj4
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    JsBridgeAdapter.s((Throwable) obj);
                }
            });
        }
        HMLog.i(f, "shareToUrl: " + shareContent.url + ", shareToBitmapUrl : " + shareContent.bitmapUrl, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap o() {
        int contentHeight = (int) (this.c.getContentHeight() * this.c.getScale());
        int height = this.c.getHeight() * 3;
        if (contentHeight > height) {
            contentHeight = height;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.c.getWidth(), contentHeight, Bitmap.Config.ARGB_4444);
        this.c.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(Throwable th) {
        return "Exception:" + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(final Throwable th) {
        HMLog.warn(f, th, new Function0() { // from class: jj4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return JsBridgeAdapter.p(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(Throwable th) {
        return "Exception:" + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(final Throwable th) {
        HMLog.warn(f, th, new Function0() { // from class: ij4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return JsBridgeAdapter.r(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(boolean z) {
        return "need refresh:" + z;
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void aliPay(String str, JsCallBackFunction jsCallBackFunction) {
        WebExternalsKt.getWebInjectDelegate().aliPay(this.e, str, jsCallBackFunction);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void loadPage(String str) {
        HMLog.i(f, "loadPage:" + str, new Object[0]);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void onFinishActivity() {
        H5Utils.finishActivity(this.e);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void onShowCashierDesk(JsCashierReq jsCashierReq, JsCallBackFunction jsCallBackFunction) {
        WebExternalsKt.getWebInjectDelegate().showCashierDesk(this.e, jsCashierReq, jsCallBackFunction);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void onShowFunctionSheet(ShareAnalyzeUtil.JSShareStruct jSShareStruct, WebView webView) {
        HMLog.i(f, "onShowFunctionSheet:" + jSShareStruct, new Object[0]);
        this.b = jSShareStruct;
        ShareConfig shareConfigM = m(jSShareStruct);
        shareConfigM.hasShare = jSShareStruct != null;
        this.c = webView;
        FunctionSheet functionSheetNewInstance = FunctionSheet.newInstance(shareConfigM);
        this.d = functionSheetNewInstance;
        functionSheetNewInstance.isAsync = false;
        functionSheetNewInstance.setFunctionListener(new d(jSShareStruct));
        this.d.show(this.e.getSupportFragmentManager(), "ShareExtDialog");
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void onShowShareDialog(ShareAnalyzeUtil.JSShareStruct jSShareStruct, WebView webView) {
        this.b = jSShareStruct;
        this.c = webView;
        HMLog.i(f, "onShowShareDialog:" + jSShareStruct, new Object[0]);
        ShareDialog shareDialogNewInstance = ShareDialog.newInstance(l(this.b));
        this.a = shareDialogNewInstance;
        shareDialogNewInstance.setOnShareItemClickedListener(new a(jSShareStruct));
        this.a.show(this.e.getSupportFragmentManager(), SportAnalytics.Params.VALUE_SHARE);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void setFunctionButtonVisible(boolean z, View.OnClickListener onClickListener) {
        H5Utils.setFunctionButtonVisible(this.e, z, onClickListener);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void setIsRefresh(final boolean z) {
        HMLog.info(f, new Function0() { // from class: kj4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return JsBridgeAdapter.t(z);
            }
        });
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void setTitleBarBackgroundColor(int i) {
        H5Utils.setTitleBarBackgroundColor(this.e, i);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void setTitleFgColor(int i) {
        H5Utils.setTitleFontColor(this.e, i);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void setTitleText(String str) {
        H5Utils.setTitleText(this.e, str);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void setTitleVisibility(boolean z) {
        H5Utils.setTitleVisibility(this.e, z);
    }

    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeCallback
    public void showCancelAuthButton(boolean z, View.OnClickListener onClickListener) {
        H5Utils.showCancelAuthButton(this.e, z, onClickListener);
    }
}

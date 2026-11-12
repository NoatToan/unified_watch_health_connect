package com.huawei.watchface.mvp.model.webview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.operation.h5pro.jsmodules.device.DevicePairUtils;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.secure.android.common.util.EncodeUtil;
import com.huawei.watchface.a2;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.c2;
import com.huawei.watchface.c4;
import com.huawei.watchface.c5;
import com.huawei.watchface.d;
import com.huawei.watchface.e4;
import com.huawei.watchface.e5;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f4;
import com.huawei.watchface.f5;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g;
import com.huawei.watchface.g5;
import com.huawei.watchface.i2;
import com.huawei.watchface.i3;
import com.huawei.watchface.i4;
import com.huawei.watchface.j2;
import com.huawei.watchface.k2;
import com.huawei.watchface.k3;
import com.huawei.watchface.k5;
import com.huawei.watchface.l2;
import com.huawei.watchface.m;
import com.huawei.watchface.m1;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.CommandJsonInfo;
import com.huawei.watchface.mvp.model.datatype.CouponsByproductBean;
import com.huawei.watchface.mvp.model.datatype.DownloadQueryBean;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.PackageNameForH5;
import com.huawei.watchface.mvp.model.datatype.PortraitImgInfo;
import com.huawei.watchface.mvp.model.datatype.ShareModel;
import com.huawei.watchface.mvp.model.datatype.VipOrderBean;
import com.huawei.watchface.mvp.model.datatype.VipOrderBeanForH5;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceAarAbility;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.model.info.VipPayInfo;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.model.pay.JsPayResult;
import com.huawei.watchface.mvp.model.pay.JsPayVipNewResult;
import com.huawei.watchface.mvp.model.thread.CommonH5Thread;
import com.huawei.watchface.mvp.ui.activity.ClipImageActivity;
import com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1;
import com.huawei.watchface.o0;
import com.huawei.watchface.q0;
import com.huawei.watchface.r2;
import com.huawei.watchface.s2;
import com.huawei.watchface.u2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.PowerThemeHelper;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.callback.CloseWebCallback;
import com.huawei.watchface.utils.callback.DelectUserDesignationWatchFaceCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IH5LoadingCallback;
import com.huawei.watchface.utils.callback.OnWebViewStatusCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.PluginOperationAdapter;
import com.huawei.watchface.utils.callback.SendCurrentUrlCallback;
import com.huawei.watchface.utils.callback.SendNoNetMsgCallback;
import com.huawei.watchface.utils.callback.SendServerErrorMsgCallback;
import com.huawei.watchface.utils.callback.ToastCallback;
import com.huawei.watchface.utils.callback.ViewOnClickListener;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.watchface.utils.constants.WebViewConstant$InterfaceName;
import com.huawei.watchface.v4;
import com.huawei.watchface.x2;
import com.huawei.watchface.x4;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class JSInterface {
    public static final String RESULT_FAILED = "1";
    public static final String RESULT_FAILED_JSON_EXCEPTION = "-2";
    private static final String RESULT_FAILED_NETWORK_UNCONNECTED = "-1";
    private static final String RESULT_FAILED_NO_JS_INTERFACE_PERMISSION = "-3";
    public static final String RESULT_SUCCESS = "0";
    private static final String TAG = "JSInterface";
    public PluginOperationAdapter mAdapter;
    private CloseWebCallback mCloseWebCallback;
    protected Context mContext;
    private DelectUserDesignationWatchFaceCallback mDelectUserDesignationWatchFaceCallback;
    private long mLastTransmitWatchInfoChange = 0;
    private IH5LoadingCallback mLoadingCallback;
    private OnWebViewStatusCallback mOnWebViewStatusCallback;
    protected OperateWatchFaceCallback mOperateWatchFaceCallback;
    protected SendCurrentUrlCallback mSendCurrentUrlCallback;
    private SendNoNetMsgCallback mSendNoNetMsgCallback;
    private SendServerErrorMsgCallback mSendServerErrorMsgCallback;
    private ToastCallback mToastCallback;
    public WebView mWebview;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30373b;

        public a(String str, String str2) {
            this.f30372a = str;
            this.f30373b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HwLog.i(JSInterface.TAG, "gotoPlugin...2");
            HwWatchFaceApi.getInstance(JSInterface.this.mContext).openPlugin((Activity) JSInterface.this.mContext, this.f30372a, this.f30373b);
        }
    }

    public class b implements i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JsPayResult f30375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30376b;

        public b(JsPayResult jsPayResult, String str) {
            this.f30375a = jsPayResult;
            this.f30376b = str;
        }

        @Override // com.huawei.watchface.i3
        public void a(int i, PayResultInfo payResultInfo) {
            String str = JSInterface.TAG;
            HwLog.d(str, "payForVip  resultCode = " + i);
            this.f30375a.setResultCode(i);
            this.f30375a.setPayResultInfo(payResultInfo);
            HwLog.d(str, "mAdapter payForVip --before callH5PayResult");
            JSInterface.this.callH5PayResult(this.f30375a, this.f30376b);
        }
    }

    public class c implements e5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e5 f30378a;

        public c(JSInterface jSInterface, e5 e5Var) {
            this.f30378a = e5Var;
        }

        @Override // com.huawei.watchface.e5.c
        public void onMembershipInfoUpdated(QuerySubInfoDetailResp querySubInfoDetailResp) {
            k2.a().a(this.f30378a.g(), (IBaseResponseCallback) null);
        }
    }

    public JSInterface(Context context) {
        this.mContext = context;
        this.mAdapter = (PluginOperationAdapter) k3.a(context).getAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callH5PayResult(JsPayResult jsPayResult, String str) {
        try {
            if (this.mWebview == null || TextUtils.isEmpty(str)) {
                return;
            }
            final String str2 = Constants.JAVA_SCRIPT + EncodeUtil.encodeForJavaScript(str) + Constants.LEFT_BRACKET_ONLY + c5.a().a(jsPayResult) + Constants.RIGHT_BRACKET_ONLY;
            FlavorConfig.safeHwLog(TAG, str2);
            this.mWebview.post(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$callH5PayResult$8(str2);
                }
            });
        } catch (Exception e) {
            HwLog.i(TAG, "callH5PayResult Exception: " + HwLog.printException(e));
        }
    }

    private void callH5VipOrderIAP4Result(VipOrderBean<?> vipOrderBean, VipPackageBean vipPackageBean, String str) {
        try {
            if (this.mWebview == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strEncodeForJavaScript = EncodeUtil.encodeForJavaScript(str);
            VipOrderBeanForH5 vipOrderBeanForH5 = new VipOrderBeanForH5();
            vipOrderBeanForH5.setVipOrderBean(vipOrderBean);
            vipOrderBeanForH5.setVipPackageBean(vipPackageBean);
            callH5VipOrderRes(strEncodeForJavaScript, c5.a().a(vipOrderBeanForH5));
        } catch (Exception e) {
            HwLog.i(TAG, "callH5VipOrderIAP4Result Exception: " + HwLog.printException(e));
        }
    }

    private void callH5VipOrderRes(String str, String str2) {
        final String str3 = Constants.JAVA_SCRIPT + str + Constants.LEFT_BRACKET_ONLY + str2 + Constants.RIGHT_BRACKET_ONLY;
        FlavorConfig.safeHwLog(TAG, str3);
        this.mWebview.post(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$callH5VipOrderRes$10(str3);
            }
        });
    }

    private void callH5VipOrderResult(VipOrderBean<?> vipOrderBean, VipPackageBean vipPackageBean, String str) {
        try {
            if (this.mWebview == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strEncodeForJavaScript = EncodeUtil.encodeForJavaScript(str);
            VipOrderBeanForH5 vipOrderBeanForH5 = new VipOrderBeanForH5();
            vipOrderBeanForH5.setVipOrderBean(vipOrderBean);
            vipOrderBeanForH5.setVipPackageBean(vipPackageBean);
            callH5VipOrderRes(strEncodeForJavaScript, c5.a().a(vipOrderBeanForH5));
        } catch (Exception e) {
            HwLog.i(TAG, "callH5VipOrderResult Exception: " + HwLog.printException(e));
        }
    }

    private boolean contextIsValidWebViewActivity() {
        if (!CommonUtils.k(this.mContext)) {
            HwLog.i(TAG, "contextIsValidWebViewActivity -- not valid activity");
            return false;
        }
        if (this.mContext instanceof WebViewActivity) {
            return true;
        }
        HwLog.i(TAG, "contextIsValidWebViewActivity -- not instanceof WebViewActivity");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePaymentResult, reason: merged with bridge method [inline-methods] */
    public void lambda$payForVipIAP4$2(String str, int i, PayResultInfo payResultInfo, JsPayVipNewResult jsPayVipNewResult) {
        HwLog.i(TAG, "payForVipIAP4 resultCode:" + i);
        if (i != 0) {
            i2.a((Context) Environment.getApplicationContext()).q();
        }
        jsPayVipNewResult.setResultCode(i);
        if (payResultInfo == null) {
            jsPayVipNewResult.setReturnCode(i);
        } else {
            jsPayVipNewResult.setPayResultInfo(payResultInfo);
        }
        callH5PayResult(jsPayVipNewResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callH5PayResult$8(String str) {
        WebView webView = this.mWebview;
        if (webView != null) {
            webView.evaluateJavascript(str, new ValueCallback() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda6
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    HwLog.i(JSInterface.TAG, "callH5PayResult start");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callH5VipOrderRes$10(String str) {
        WebView webView = this.mWebview;
        if (webView != null) {
            webView.evaluateJavascript(str, new ValueCallback() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda4
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    HwLog.i(JSInterface.TAG, "callH5VipOrderRes start");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$payCombination$4(JsPayVipNewResult jsPayVipNewResult, String str, int i, PayResultInfo payResultInfo) {
        HwLog.i(TAG, "payCombination resultCode:" + i);
        if (i != 0) {
            i2.a((Context) Environment.getApplicationContext()).q();
        }
        jsPayVipNewResult.setResultCode(i);
        if (payResultInfo == null) {
            jsPayVipNewResult.setReturnCode(i);
        } else {
            jsPayVipNewResult.setPayResultInfo(payResultInfo);
        }
        callH5PayResult(jsPayVipNewResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$payCombination$5(String str, VipOrderBean vipOrderBean, VipPackageBean vipPackageBean) {
        HwLog.i(TAG, "payCombination vipOrderResult callback");
        callH5VipOrderResult(vipOrderBean, vipPackageBean, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$payForVipByCoupons$6(CouponsByproductBean.CouponAndPrice couponAndPrice) {
        i2.a(this.mContext).a(couponAndPrice, CommonUtils.F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$payForVipIAP4$3(String str, VipOrderBean vipOrderBean, VipPackageBean vipPackageBean) {
        HwLog.i(TAG, "payForVipIAP4 vipOrderResult callback");
        callH5VipOrderIAP4Result(vipOrderBean, vipPackageBean, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$payForVipNew$0(JsPayVipNewResult jsPayVipNewResult, String str, int i, PayResultInfo payResultInfo) {
        HwLog.i(TAG, "payForVipNew resultCode:" + i);
        if (i != 0) {
            i2.a((Context) Environment.getApplicationContext()).q();
        }
        jsPayVipNewResult.setResultCode(i);
        if (payResultInfo == null) {
            jsPayVipNewResult.setReturnCode(i);
        } else {
            jsPayVipNewResult.setPayResultInfo(payResultInfo);
        }
        callH5PayResult(jsPayVipNewResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$payForVipNew$1(String str, VipOrderBean vipOrderBean, VipPackageBean vipPackageBean) {
        HwLog.i(TAG, "payForVipNew vipOrderResult callback");
        callH5VipOrderResult(vipOrderBean, vipPackageBean, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStatusBarFontColors$11(String str) {
        CommonUtils.a(str, (Activity) this.mContext);
    }

    private LinkedHashMap<String, String> parseOmData(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str.trim());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next));
            }
        } catch (JSONException unused) {
            HwLog.e(TAG, "reportOmData param json error");
        }
        return linkedHashMap;
    }

    @JavascriptInterface
    public void applyWatchFaceThemeAlbumInfo(String str) {
        String str2 = TAG;
        HwLog.i(str2, "applyWatchFaceThemeAlbumInfo() enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            JsInteractAddition.getInstance().a(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str);
        } else {
            HwLog.i(str2, "applyWatchFaceThemeAlbumInfo() isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public void cancelInstallWatchFace(String str, String str2) {
        HwLog.i(TAG, "cancelInstallWatchFace");
        JsInteractAddition.getInstance().a(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str, str2);
    }

    @JavascriptInterface
    public void cancelSearchImage() {
        String str = TAG;
        HwLog.i(str, "cancelSearchImage enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            a2.b().a(true, false);
        } else {
            HwLog.i(str, "cancelSearchImage() isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public void cancelTryOutWatchFace(String str, String str2) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "cancelTryOutWatchFace")) {
            HwLog.w(TAG, "cancelTryOutWatchFace -- not in white list");
            return;
        }
        String str3 = TAG;
        HwLog.i(str3, "cancelTryOutWatchFace hiTopId: " + str + " version:" + str2);
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.cancelTryOutWatchFace(str, str2);
        } else {
            HwLog.w(str3, "cancelTryOutWatchFace error adapter is null");
        }
    }

    @JavascriptInterface
    public boolean checkFile(String str) {
        String str2 = TAG;
        HwLog.i(str2, "checkFile() enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            File file = PversionSdUtils.getFile(str);
            return file != null && file.exists();
        }
        HwLog.e(str2, "checkFile() no whiteurl ");
        return false;
    }

    @JavascriptInterface
    public void choosePicToClip() {
        HwLog.i(TAG, WebViewConstant$InterfaceName.INTERFACE_CHOOSEPICTOCLIP);
        JsInteractAddition.getInstance().b(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public void choosePicToH5Clip(String str) {
        HwLog.i(TAG, "choosePicToH5Clip");
        JsInteractAddition.getInstance().a(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public void choosePicToH5Search(String str) {
        String str2 = TAG;
        HwLog.i(str2, "choosePicToH5Search jumpIndex:" + str);
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            a2.b().a(str);
        } else {
            HwLog.i(str2, "choosePicToH5Search() isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public void chooseWearPicToClip() {
        HwLog.i(TAG, WebViewConstant$InterfaceName.INTERFACE_CHOOSE_WEAR_TO_CLIP);
        JsInteractAddition.getInstance().c(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public void closeWeb() {
        CloseWebCallback closeWebCallback;
        HwLog.i(TAG, "closeWeb");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && (closeWebCallback = this.mCloseWebCallback) != null) {
            closeWebCallback.onCloseWebCallback();
        }
    }

    @JavascriptInterface
    public boolean createShortcuts() {
        String str = TAG;
        HwLog.i(str, "createShortcuts() enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return HwWatchFaceApi.getInstance(this.mContext).createShortcuts();
        }
        HwLog.i(str, "createShortcuts() isInURLWhiteList");
        return false;
    }

    @JavascriptInterface
    public boolean customClipPic(String str, boolean z) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(TAG, "customClipPic() isInURLWhiteList");
            return false;
        }
        HashMap mapC = l2.c(str);
        if (mapC == null) {
            HwLog.d(TAG, "customClipPic orgFilePath is empty");
            return false;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) ClipImageActivity.class);
        intent.putExtra("sourceImagePath", (String) mapC.get(ClipImageActivity.ORG_IMAGE_PATH));
        intent.putExtra("sourceImageUri", (String) mapC.get(ClipImageActivity.ORG_IMAGE_PATH));
        intent.putExtra("scaleX", (String) mapC.get("scaleX"));
        intent.putExtra("scaleY", (String) mapC.get("scaleY"));
        intent.putExtra(ClipImageActivity.SOURCE_IMAGE_TRANS_X, (String) mapC.get(ClipImageActivity.SOURCE_IMAGE_TRANS_X));
        intent.putExtra(ClipImageActivity.SOURCE_IMAGE_TRANS_Y, (String) mapC.get(ClipImageActivity.SOURCE_IMAGE_TRANS_Y));
        intent.putExtra(ClipImageActivity.ORG_WINDOWS_HEIGHT, (String) mapC.get(ClipImageActivity.ORG_WINDOWS_HEIGHT));
        intent.putExtra(ClipImageActivity.ORG_WINDOWS_WIDTH, (String) mapC.get(ClipImageActivity.ORG_WINDOWS_WIDTH));
        intent.putExtra("isSecondEdit", true);
        int watchFaceWidth = LatonaWatchFaceProvider.getInstance(this.mContext).getWatchFaceWidth();
        int watchFaceHeight = LatonaWatchFaceProvider.getInstance(this.mContext).getWatchFaceHeight();
        if (watchFaceWidth > 0 && watchFaceHeight > 0) {
            intent.putExtra(ClipImageActivity.CLIP_TARGET_WIDTH, watchFaceWidth);
            intent.putExtra(ClipImageActivity.CLIP_TARGET_HEIGHT, watchFaceHeight);
        }
        intent.putExtra(ClipImageActivity.CLIP_TARGET_SHAPE, z);
        CommonUtils.startActivityForResult((Activity) this.mContext, intent, 3);
        return true;
    }

    @JavascriptInterface
    public void deldetUserSelectWatchFace(String str, String str2) {
        PluginOperationAdapter pluginOperationAdapter;
        HwLog.i(TAG, "deldetUserSelectWatchFace hiTopId: " + str + ", version: " + str2);
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "deldetUserSelectWatchFace") && (pluginOperationAdapter = this.mAdapter) != null) {
            pluginOperationAdapter.deleteDesignationUserWatchFace(str, str2, this.mDelectUserDesignationWatchFaceCallback);
        }
    }

    @JavascriptInterface
    public void deleteSelectWatchFace(String str, String str2) {
        PluginOperationAdapter pluginOperationAdapter;
        HwLog.i(TAG, "deleteSelectWatchFace hiTopId: " + str + ", version: " + str2);
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "deldetUserSelectWatchFace") && (pluginOperationAdapter = this.mAdapter) != null) {
            pluginOperationAdapter.deleteDesignationWatchFace(str, str2);
        }
    }

    @JavascriptInterface
    public void deleteWatchFace(String str, String str2) {
        JsInteractAddition.getInstance().b(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str, str2);
    }

    @JavascriptInterface
    public void dismissPayVipDialog() {
        String str = TAG;
        HwLog.i(str, "closePayVipDialog: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            i2.a(this.mContext).b();
        } else {
            HwLog.e(str, "closePayVipDialog() !isInURLWhiteList.");
        }
    }

    @JavascriptInterface
    public String doRequestForH5(String str, String str2, String str3, String str4) {
        String str5 = TAG;
        HwLog.i(str5, "doRequestForH5: enter");
        FlavorConfig.safeHwLog(str5, "doRequestForH5 url:" + str);
        FlavorConfig.safeHwLog(str5, "doRequestForH5 body:" + str2);
        FlavorConfig.safeHwLog(str5, "doRequestForH5 header:" + str3);
        FlavorConfig.safeHwLog(str5, "doRequestForH5 tokenParms:" + str4);
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "doRequestForH5")) {
            HwLog.e(str5, "doRequestForH5() !isInURLWhiteList.");
            return "";
        }
        try {
            CommonH5Thread commonH5Thread = new CommonH5Thread(str, str3, str2, str4);
            return commonH5Thread.b(commonH5Thread.e());
        } catch (Exception e) {
            HwLog.e(TAG, "doRequestForH5 error:" + HwLog.printException(e));
            return "";
        }
    }

    @JavascriptInterface
    public void finishWatchFaceWebViewActivity() {
        String str = TAG;
        HwLog.i(str, "finishWatchFaceWebViewActivity");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (contextIsValidWebViewActivity()) {
                ((WebViewActivity) this.mContext).finish();
            } else {
                HwLog.i(str, "finishWatchFaceWebViewActivity -- not valid WebViewActivity");
            }
        }
    }

    @JavascriptInterface
    public String getAarVersion() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "10005151";
        }
        HwLog.w(TAG, "getWatchfaceAarVersion -- url not in white list");
        return "";
    }

    @JavascriptInterface
    public String getAlbumPackageName() {
        return JsInteractAddition.getInstance().d(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public String getAlbumPreviewPath() {
        String str = TAG;
        HwLog.i(str, "getAlbumPreviewPath() enter:");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return WatchFacePhotoAlbumManager.getInstance(this.mContext).u();
        }
        HwLog.i(str, "getAlbumPreviewPath() isInURLWhiteList");
        return "";
    }

    @JavascriptInterface
    public String getApplicationNameByPackageName(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getApplicationNameByPackageName: enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "getApplicationNameByPackageName() !isInURLWhiteList.");
            return "";
        }
        try {
            PackageNameForH5 packageNameForH5 = (PackageNameForH5) GsonHelper.fromJson(str, PackageNameForH5.class);
            if (packageNameForH5 == null) {
                HwLog.d(str2, "getApplicationNameByPackageName is null");
                return "";
            }
            String strA = WebViewUtils.a(packageNameForH5);
            HwLog.i(str2, "getApplicationNameByPackageName packageName:" + strA);
            return strA;
        } catch (Exception e) {
            HwLog.e(TAG, "getApplicationNameByPackageName error:" + HwLog.printException(e));
            return "";
        }
    }

    @JavascriptInterface
    public String getCommonParam() {
        String str = TAG;
        HwLog.i(str, "getCommonParam: enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str, "getCommonParam() !isInURLWhiteList.");
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
            jSONObject.put("initTime", hwWatchFaceApi.getInitTime());
            boolean zIsColdStart = hwWatchFaceApi.isColdStart();
            jSONObject.put("isColdStart", zIsColdStart);
            if (zIsColdStart) {
                hwWatchFaceApi.setColdStart(false);
            }
            HwLog.i(str, "getCommonParam:" + jSONObject);
            return jSONObject.toString();
        } catch (Exception e) {
            HwLog.e(TAG, "setAarAbility error:" + HwLog.printException(e));
            return "";
        }
    }

    @JavascriptInterface
    public String getCouponsBeanStr() {
        String str = TAG;
        HwLog.i(str, "getCouponsStr enter ");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return i2.a(this.mContext).e();
        }
        HwLog.i(str, "getCouponsStr is not InURLWhiteList ");
        return "";
    }

    @JavascriptInterface
    public boolean getCurrentUserIsDesignerState() {
        HwLog.i(TAG, "getCurrentUserIsDesignerState");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return e4.a("current_user_is_designer", "goal_steps_perference", false);
        }
        return false;
    }

    @JavascriptInterface
    public String getCurrentWatchFaceId() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String currentWatchFaceId = pluginOperationAdapter != null ? pluginOperationAdapter.getCurrentWatchFaceId() : "";
        HwLog.i(TAG, "getCurrentWatchFaceId retStr: " + currentWatchFaceId);
        return currentWatchFaceId;
    }

    @JavascriptInterface
    public String getCurrentWatchFaceInfo() {
        String str = TAG;
        HwLog.i(str, "getCurrentWatchFaceInfo enter.");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchFaceInfo = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchFaceInfo() : "";
        if (TextUtils.equals(watchFaceInfo, "1") || TextUtils.equals(watchFaceInfo, "0") || TextUtils.equals(watchFaceInfo, "")) {
            HwLog.d(str, "getCurrentWatchFaceInfo from sp");
            watchFaceInfo = k5.a(e4.c("watchface_info_key", "themename"), "storagePw");
        }
        String str2 = TextUtils.isEmpty(watchFaceInfo) ? "0" : watchFaceInfo;
        HwLog.i(str, "getCurrentWatchFaceInfo() watchFaceInfo: " + str2);
        return str2;
    }

    @JavascriptInterface
    public String getDisableWearInfo() {
        String str = TAG;
        HwLog.i(str, "getDisableWearInfo enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return HwWatchFaceApi.getInstance(this.mContext).getDisableWearInfo();
        }
        HwLog.i(str, "getDisableWearInfo isInURLWhiteList");
        return "";
    }

    @JavascriptInterface
    public String getImgUrlForSearch() {
        String str = TAG;
        HwLog.i(str, "getImgUrlForSearch enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return a2.b().a();
        }
        HwLog.i(str, "getImgUrlForSearch() isInURLWhiteList");
        return "";
    }

    @JavascriptInterface
    public boolean getIsSupportTouch() {
        String str = TAG;
        HwLog.i(str, "getIsSupportTouch() enter:");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return HwWatchFaceBtManager.getInstance(this.mContext).isSupportOneTouchAbility();
        }
        HwLog.i(str, "getIsSupportTouch() isInURLWhiteList");
        return false;
    }

    @JavascriptInterface
    public String getKaleidoscopePackageName() {
        return JsInteractAddition.getInstance().a(this.mAdapter);
    }

    @JavascriptInterface
    public String getMemberExpiredWatchFaceIdStore() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String memberExpiredWatchFaceIdStore = pluginOperationAdapter != null ? pluginOperationAdapter.getMemberExpiredWatchFaceIdStore() : "";
        HwLog.i(TAG, "getMemberExpiredWatchFaceIdStore retStr:" + memberExpiredWatchFaceIdStore);
        return memberExpiredWatchFaceIdStore;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4 A[Catch: JSONException -> 0x01a4, TryCatch #0 {JSONException -> 0x01a4, blocks: (B:7:0x0029, B:9:0x002f, B:11:0x0035, B:14:0x003c, B:16:0x0048, B:17:0x0056, B:20:0x0087, B:22:0x00b4, B:23:0x00be, B:25:0x01a0), top: B:31:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x01a0 A[Catch: JSONException -> 0x01a4, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01a4, blocks: (B:7:0x0029, B:9:0x002f, B:11:0x0035, B:14:0x003c, B:16:0x0048, B:17:0x0056, B:20:0x0087, B:22:0x00b4, B:23:0x00be, B:25:0x01a0), top: B:31:0x0029 }] */
    @JavascriptInterface
    public String getNativeParams() {
        Application applicationContext;
        IH5LoadingCallback iH5LoadingCallback;
        HwLog.i(TAG, "getNativeParams() enter.");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
        e5 e5VarC = e5.c();
        JSONObject jSONObject = new JSONObject();
        if (e5VarC != null) {
            try {
                QuerySubInfoDetailResp querySubInfoDetailRespF = e5VarC.f();
                if (querySubInfoDetailRespF != null) {
                    jSONObject.put("memberStatus", querySubInfoDetailRespF.getMemberStatus() != null ? querySubInfoDetailRespF.getMemberStatus() : "0");
                    if (querySubInfoDetailRespF.getSubInfo() != null) {
                        jSONObject.put("memberExpireDate", querySubInfoDetailRespF.getSubInfo().getValidDate());
                    }
                }
                jSONObject.put("statusbarHeight", DensityUtil.a(CommonUtils.e(Environment.getApplicationContext())));
                jSONObject.put("isBlackTheme", PowerThemeHelper.isDarkMode(this.mContext));
                jSONObject.put("isSupportedH5TitleBar", hwWatchFaceApi.isSupportedH5TitleBar());
                String deviceIdForH5 = hwWatchFaceApi.getDeviceIdForH5(true);
                jSONObject.put("deviceId", deviceIdForH5 != null ? deviceIdForH5 : "");
                jSONObject.put("uid", hwWatchFaceApi.getUserId());
                jSONObject.put("x-brandChannel", String.valueOf(q0.d()));
                jSONObject.put("x-accountBrand", hwWatchFaceApi.getAccountBrand());
                applicationContext = Environment.getApplicationContext();
                if (applicationContext != null) {
                    jSONObject.put("x-packagename", applicationContext.getPackageName());
                }
                jSONObject.put("x-appBrand", String.valueOf(q0.b()));
                jSONObject.put("sdk_int", Build.VERSION.SDK_INT);
                jSONObject.put("rom_version", Build.VERSION.RELEASE);
                jSONObject.put("phoneId", q0.e());
                jSONObject.put("watchDeviceId", q0.e());
                jSONObject.put("phoneBrand", q0.i());
                jSONObject.put("isHuaweiPhone", CommonUtils.u());
                jSONObject.put("appVersion", q0.k());
                jSONObject.put(DevicePairUtils.DEVICE_CONNECT_STATE, hwWatchFaceApi.getDeviceConnectState());
                jSONObject.put("locale", LanguageUtils.a(true));
                jSONObject.put("aarVersion", q0.a());
                jSONObject.put("aarAbilityVersion", "1019100");
                jSONObject.put("isoCode", hwWatchFaceApi.getCommonCountryCode());
                jSONObject.put("abilityList", GsonHelper.toJson(HwWatchFaceManager.getWatchAbility()));
                jSONObject.put("isKidAccount", c2.a(this.mContext).u());
                jSONObject.put("healthModelStatus", String.valueOf(m1.b().a()));
                jSONObject.put("lan", LanguageUtils.b());
                jSONObject.put("phoneModel", MobileInfoHelper.getDeviceName());
                jSONObject.put(CommonConstant.KEY_SERVICE_COUNTRY_CODE, c2.a(this.mContext).j());
                jSONObject.put("registerCountryCode", c2.a(this.mContext).i());
                iH5LoadingCallback = this.mLoadingCallback;
                if (iH5LoadingCallback != null) {
                    iH5LoadingCallback.onLoadSuccess();
                }
            } catch (JSONException e) {
                HwLog.e(TAG, "getNativeParams -- JSONException" + HwLog.printException((Exception) e));
            }
        } else {
            jSONObject.put("statusbarHeight", DensityUtil.a(CommonUtils.e(Environment.getApplicationContext())));
            jSONObject.put("isBlackTheme", PowerThemeHelper.isDarkMode(this.mContext));
            jSONObject.put("isSupportedH5TitleBar", hwWatchFaceApi.isSupportedH5TitleBar());
            String deviceIdForH6 = hwWatchFaceApi.getDeviceIdForH5(true);
            jSONObject.put("deviceId", deviceIdForH6 != null ? deviceIdForH6 : "");
            jSONObject.put("uid", hwWatchFaceApi.getUserId());
            jSONObject.put("x-brandChannel", String.valueOf(q0.d()));
            jSONObject.put("x-accountBrand", hwWatchFaceApi.getAccountBrand());
            applicationContext = Environment.getApplicationContext();
            if (applicationContext != null) {
                jSONObject.put("x-packagename", applicationContext.getPackageName());
            }
            jSONObject.put("x-appBrand", String.valueOf(q0.b()));
            jSONObject.put("sdk_int", Build.VERSION.SDK_INT);
            jSONObject.put("rom_version", Build.VERSION.RELEASE);
            jSONObject.put("phoneId", q0.e());
            jSONObject.put("watchDeviceId", q0.e());
            jSONObject.put("phoneBrand", q0.i());
            jSONObject.put("isHuaweiPhone", CommonUtils.u());
            jSONObject.put("appVersion", q0.k());
            jSONObject.put(DevicePairUtils.DEVICE_CONNECT_STATE, hwWatchFaceApi.getDeviceConnectState());
            jSONObject.put("locale", LanguageUtils.a(true));
            jSONObject.put("aarVersion", q0.a());
            jSONObject.put("aarAbilityVersion", "1019100");
            jSONObject.put("isoCode", hwWatchFaceApi.getCommonCountryCode());
            jSONObject.put("abilityList", GsonHelper.toJson(HwWatchFaceManager.getWatchAbility()));
            jSONObject.put("isKidAccount", c2.a(this.mContext).u());
            jSONObject.put("healthModelStatus", String.valueOf(m1.b().a()));
            jSONObject.put("lan", LanguageUtils.b());
            jSONObject.put("phoneModel", MobileInfoHelper.getDeviceName());
            jSONObject.put(CommonConstant.KEY_SERVICE_COUNTRY_CODE, c2.a(this.mContext).j());
            jSONObject.put("registerCountryCode", c2.a(this.mContext).i());
            iH5LoadingCallback = this.mLoadingCallback;
            if (iH5LoadingCallback != null) {
                iH5LoadingCallback.onLoadSuccess();
            }
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getPhoneWatchType() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String phoneWatchType = pluginOperationAdapter != null ? pluginOperationAdapter.getPhoneWatchType() : "";
        HwLog.i(TAG, "getPhoneWatchType retStr: " + phoneWatchType);
        return phoneWatchType;
    }

    @JavascriptInterface
    public String getPreWatchFaceIdStore() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String preWatchFaceIdStore = pluginOperationAdapter != null ? pluginOperationAdapter.getPreWatchFaceIdStore() : "";
        HwLog.i(TAG, "getPreWatchFaceIdStore retStr:" + preWatchFaceIdStore);
        return preWatchFaceIdStore;
    }

    @JavascriptInterface
    public String getSmartPicture(String str, String str2, String str3) {
        String str4 = TAG;
        HwLog.i(str4, "getSmartPicture");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return WatchFacePhotoAlbumManager.getInstance(this.mContext).a(str, str2, str3, (String) null, -1)[0];
        }
        HwLog.w(str4, "getSmartPicture -- url not in white list");
        return "";
    }

    @JavascriptInterface
    public String getSmartPictureList(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getSmartPictureList");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return WatchFacePhotoAlbumManager.getInstance(this.mContext).j(str);
        }
        HwLog.w(str2, "getSmartPictureList -- url not in white list");
        return "";
    }

    @JavascriptInterface
    public int getSoftKeyboardHeight() {
        OperateWatchFaceCallback operateWatchFaceCallback;
        HwLog.i(TAG, "getSoftKeyboardHeight");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && (operateWatchFaceCallback = this.mOperateWatchFaceCallback) != null) {
            return operateWatchFaceCallback.getSoftKeyboardHeight();
        }
        return 0;
    }

    @JavascriptInterface
    public String getSystemInstallAppName(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getSystemInstallAppName enter packageName:" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) || TextUtils.isEmpty(str)) {
            return "";
        }
        String strC = CommonUtils.c(Environment.getApplicationContext(), str);
        HwLog.i(str2, "getSystemInstallAppName appName:" + strC);
        return strC;
    }

    @JavascriptInterface
    public String getTokenAndDeviceType() {
        return JsInteractAddition.getInstance().e(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public String getTrialRemainTime() {
        String str = TAG;
        HwLog.i(str, "getTrialRemainTime: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return j2.g().i();
        }
        HwLog.e(str, "getTrialRemainTime() !isInURLWhiteList.");
        return "";
    }

    @JavascriptInterface
    public String getTryOutWatchFacePackageName() {
        return JsInteractAddition.getInstance().b(this.mAdapter);
    }

    @JavascriptInterface
    public int getVersionCode() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return CommonUtils.getVersionCode();
        }
        HwLog.w(TAG, "getVersionCode -- url not in white list");
        return 0;
    }

    @JavascriptInterface
    public String getVideoAlbumPackageName() {
        return JsInteractAddition.getInstance().c(this.mAdapter);
    }

    @JavascriptInterface
    public String getWatchFaceData() {
        HwLog.i(TAG, "getWatchFaceData");
        return JsInteractAddition.getInstance().d(this.mAdapter);
    }

    @JavascriptInterface
    public String getWatchFaceDownloadData() {
        String str = TAG;
        HwLog.i(str, "getWatchFaceDownloadData() enter.");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchFaceDownloadData = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchFaceDownloadData() : "";
        HwLog.i(str, "getWatchFaceDownloadData() watchFaceDownloadData: " + watchFaceDownloadData);
        return watchFaceDownloadData;
    }

    @JavascriptInterface
    public int getWatchFaceDownloadItemNum() {
        PluginOperationAdapter pluginOperationAdapter;
        HwLog.i(TAG, "getWatchFaceDownloadItemNum");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && (pluginOperationAdapter = this.mAdapter) != null) {
            return pluginOperationAdapter.getWatchFaceDownloadItemNum();
        }
        return 0;
    }

    @JavascriptInterface
    public String getWatchFaceIdStore() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchFaceIdStore = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchFaceIdStore() : "";
        HwLog.i(TAG, "getWatchFaceIdStore retStr: " + watchFaceIdStore);
        return watchFaceIdStore;
    }

    @JavascriptInterface
    public String getWatchFaceInfo() {
        String str = TAG;
        HwLog.i(str, "getWatchFaceInfo enter.");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchFaceInfo = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchFaceInfo() : "";
        HwLog.iBetaLog(str, "getWatchFaceInfo() watchFaceInfo: " + watchFaceInfo);
        return watchFaceInfo;
    }

    @JavascriptInterface
    public int getWatchFaceInstallState() {
        HwLog.i(TAG, "getWatchFaceInstallState");
        return JsInteractAddition.getInstance().f(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public void getWatchFaceKaleidoscopeInfo(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        HashMap map = new HashMap(32);
        map.put(JsInteractAddition.HI_TOP_ID, str);
        map.put("version", str2);
        map.put("url", str3);
        map.put(WatchFaceConstant.HASHCODE, str4);
        JsInteractAddition.getInstance().a(map, this.mWebview);
    }

    @JavascriptInterface
    public void getWatchFaceNames(String str) {
        HwLog.i(TAG, "getWatchFaceNames");
        JsInteractAddition.getInstance().b(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str);
    }

    @JavascriptInterface
    public void getWatchFacePayInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        HwLog.i(TAG, "getWatchFacePayInfo enter .");
        getWatchFacePayInfo(str, str2, str3, str4, str5, str6, str7, str8, null, false);
    }

    @JavascriptInterface
    public String getWatchFaceSort() {
        HwLog.i(TAG, "getWatchFaceSort");
        return JsInteractAddition.getInstance().f(this.mAdapter);
    }

    @JavascriptInterface
    public String getWatchFaceSortList() {
        HwLog.i(TAG, "getWatchFaceSortList");
        return JsInteractAddition.getInstance().e(this.mAdapter);
    }

    @JavascriptInterface
    public void getWatchFaceThemeAlbumInfo(String str, String str2, String str3) {
        getWatchFaceThemeAlbumInfo(str, str2, str3, "");
    }

    @JavascriptInterface
    public void getWatchFaceThemeWearAlbumInfo(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        HashMap map = new HashMap(32);
        map.put(JsInteractAddition.HI_TOP_ID, str);
        map.put("version", str2);
        map.put("url", str3);
        map.put(WatchFaceConstant.HASHCODE, str4);
        JsInteractAddition.getInstance().b(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, map);
    }

    @JavascriptInterface
    public String getWatchFaceUrlBase() {
        return JsInteractAddition.getInstance().g(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter);
    }

    @JavascriptInterface
    public String getWatchFaceWithFilterInfo(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getWatchFaceWithFilterInfo");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return WatchFacePhotoAlbumManager.getInstance(this.mContext).e(str);
        }
        HwLog.w(str2, "getWatchFaceWithFilterInfo -- url not in white list");
        return "";
    }

    @JavascriptInterface
    public String getWatchFileType() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchFileType = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchFileType() : "";
        HwLog.i(TAG, "getWatchFileType return:" + watchFileType);
        return watchFileType;
    }

    @JavascriptInterface
    public String getWatchOtherThemeVersion() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchOtherThemeVersion = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchOtherThemeVersion() : "";
        HwLog.i(TAG, "getWatchOtherThemeVersion otherRetStr: " + watchOtherThemeVersion);
        return watchOtherThemeVersion;
    }

    @JavascriptInterface
    public String getWatchThemeVersion() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String watchThemeVersion = pluginOperationAdapter != null ? pluginOperationAdapter.getWatchThemeVersion() : "";
        HwLog.i(TAG, "getWatchThemeVersion retStr: " + watchThemeVersion);
        return watchThemeVersion;
    }

    @JavascriptInterface
    public String getWatchfacePersonalSwitch() {
        String str = TAG;
        HwLog.i(str, "getWatchfacePersonalSwitch() enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str, "getWatchfacePersonalSwitch() isInURLWhiteList");
            return "0";
        }
        try {
            HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(this.mContext);
            if (hwWatchFaceApi != null) {
                String watchfacePersonalSwitch = hwWatchFaceApi.getWatchfacePersonalSwitch();
                HwLog.i(str, "getWatchfacePersonalSwitch() personalSwitch:" + watchfacePersonalSwitch);
                return watchfacePersonalSwitch;
            }
        } catch (Exception e) {
            HwLog.e(TAG, "getWatchfacePersonalSwitch exception: " + HwLog.printException(e));
        }
        return "0";
    }

    @JavascriptInterface
    public String getWearAlbumPackageName() {
        return JsInteractAddition.getInstance().a(this.mWebview, this.mAdapter);
    }

    @JavascriptInterface
    public void goBack() {
        String str = TAG;
        HwLog.i(str, "goBack");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str, "goBack url not in white list");
            return;
        }
        try {
            Context context = this.mContext;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            HwLog.i(str, "goBack finish");
            ((Activity) this.mContext).finish();
        } catch (Exception e) {
            HwLog.e(TAG, "goBack " + HwLog.printException(e));
        }
    }

    @JavascriptInterface
    public void gotoPlugin(String str, String str2, String str3) {
        HwLog.i(TAG, "gotoPlugin...1" + str + str3);
        ((Activity) this.mContext).runOnUiThread(new a(str, str2));
    }

    @JavascriptInterface
    public boolean hasSmartPick(boolean z) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.w(TAG, "hasSmartPick -- url not in white list");
            return false;
        }
        HwLog.i(TAG, "hasSmartPick -- isSupport:" + z);
        return z;
    }

    @JavascriptInterface
    public boolean isBigCD() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return JsInteractAddition.getInstance().a(this.mSendCurrentUrlCallback, this.mAdapter);
        }
        return false;
    }

    @JavascriptInterface
    public String isCloudConfigSupportedFreeTab() {
        HwLog.i(TAG, "isCloudConfigSupportedFreeTab() -- enter");
        return CommonUtils.r();
    }

    @JavascriptInterface
    public boolean isCreateShortcuts() {
        String str = TAG;
        HwLog.i(str, "isCreateShortcuts() enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return HwWatchFaceApi.getInstance(this.mContext).isExistShortCut("watchface_supermarket");
        }
        HwLog.i(str, "isCreateShortcuts() isInURLWhiteList");
        return false;
    }

    @JavascriptInterface
    public boolean isNetworkConnected() {
        HwLog.i(TAG, "isNetworkConnected");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return CommonUtils.C();
        }
        return false;
    }

    @JavascriptInterface
    public String isPluginSupported() {
        HwLog.i(TAG, "isPluginSupported");
        return "1";
    }

    @JavascriptInterface
    public void jumpHwWatchFaceDesigner() {
        String str = TAG;
        HwLog.i(str, "jumpHwWatchFaceDesigner");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "jumpHwWatchFaceDesigner")) {
            if (contextIsValidWebViewActivity()) {
                ((WebViewActivity) this.mContext).verifyStoragePermissions();
            } else {
                HwLog.i(str, "jumpHwWatchFaceDesigner -- not valid WebViewActivity");
            }
        }
    }

    @JavascriptInterface
    public void jumpHwWatchFacePrivacy() {
        String str = TAG;
        HwLog.i(str, "jumpHwWatchFacePrivacy");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (contextIsValidWebViewActivity()) {
                ((WebViewActivity) this.mContext).gotoPrivacyStatementActivity();
            } else {
                HwLog.i(str, "jumpHwWatchFacePrivacy -- not valid WebViewActivity");
            }
        }
    }

    @JavascriptInterface
    public void jumpMarketActivity(String str) {
        String str2 = TAG;
        HwLog.i(str2, "jumpMarketActivity() enter. appId:" + str);
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            WebViewUtils.b(this.mContext, str);
        } else {
            HwLog.i(str2, "jumpMarketActivity isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public void jumpMarketByPackageName(String str) {
        String str2 = TAG;
        HwLog.i(str2, "jumpMarketByPackageName() enter. packageName:" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str2, "jumpMarketByPackageName not in whiteList");
        } else if (MobileInfoHelper.isHuaweiDevice()) {
            WebViewUtils.c(this.mContext, str);
        } else {
            CommonUtils.b(this.mContext, str);
        }
    }

    @JavascriptInterface
    public void jumpOtherUrlActivity(String str) {
        String str2 = TAG;
        HwLog.i(str2, "jumpOtherUrlActivity() enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwWatchFaceApi.getInstance(this.mContext).jumpOtherUrlActivity(this.mContext, str);
        } else {
            HwLog.i(str2, "jumpOtherUrlActivity isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public void payCombination(String str, final String str2, final String str3) {
        String str4 = TAG;
        HwLog.i(str4, "payCombination enter ");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "payForVip")) {
            HwLog.e(str4, "payCombination() !isInSensitiveURLWhiteList.");
            return;
        }
        if (ViewOnClickListener.isSeriesClick()) {
            HwLog.i(str4, "payCombination isSeriesClick");
            return;
        }
        final JsPayVipNewResult jsPayVipNewResult = new JsPayVipNewResult();
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str4, "payCombination payReqJson is null");
            jsPayVipNewResult.setResultCode(-1);
            callH5PayResult(jsPayVipNewResult, str3);
            return;
        }
        FlavorConfig.safeHwLog(str4, "payCombination payJson:" + str);
        VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) GsonHelper.fromJson(str, VipPayInfoCoupons.class);
        if (vipPayInfoCoupons == null) {
            HwLog.i(str4, "payCombination payJson is null");
            jsPayVipNewResult.setResultCode(-1);
            callH5PayResult(jsPayVipNewResult, str3);
            return;
        }
        jsPayVipNewResult.setVipPayInfoCoupons(vipPayInfoCoupons);
        i2.a(this.mContext).b(vipPayInfoCoupons.getProductCode());
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.payCombination(vipPayInfoCoupons, new i3() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda11
                @Override // com.huawei.watchface.i3
                public final void a(int i, PayResultInfo payResultInfo) {
                    this.f$0.lambda$payCombination$4(jsPayVipNewResult, str3, i, payResultInfo);
                }
            }, new v4() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda1
                @Override // com.huawei.watchface.v4
                public final void a(VipOrderBean vipOrderBean, VipPackageBean vipPackageBean) {
                    this.f$0.lambda$payCombination$5(str2, vipOrderBean, vipPackageBean);
                }
            }, CommonUtils.F());
            return;
        }
        HwLog.i(str4, "payCombination mAdapter is null");
        jsPayVipNewResult.setResultCode(-1);
        callH5PayResult(jsPayVipNewResult, str3);
    }

    @JavascriptInterface
    public void payForVip(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "payForVip enter ");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "payForVip")) {
            HwLog.e(str3, "payForVip() !isInSensitiveURLWhiteList.");
            return;
        }
        if (ViewOnClickListener.isSeriesClick()) {
            HwLog.i(str3, "payForVip isSeriesClick");
            return;
        }
        JsPayResult jsPayResult = new JsPayResult();
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str3, "payForVip payReqJson is null");
            jsPayResult.setResultCode(-1);
            callH5PayResult(jsPayResult, str2);
            return;
        }
        VipPayInfo vipPayInfo = (VipPayInfo) GsonHelper.fromJson(str, VipPayInfo.class);
        if (vipPayInfo == null) {
            HwLog.i(str3, "pay payReq is null");
            jsPayResult.setResultCode(-1);
            callH5PayResult(jsPayResult, str2);
        } else {
            if (CommonUtils.g(vipPayInfo.getAmount())) {
                j2.g().n();
                return;
            }
            BaseReq withholdRequest = !f4.b(vipPayInfo.getTradeType()) ? vipPayInfo.getWithholdRequest(vipPayInfo) : vipPayInfo.getPayInfoReq(vipPayInfo);
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.payForVip(withholdRequest, new b(jsPayResult, str2));
            }
        }
    }

    @JavascriptInterface
    public void payForVipByCoupons(String str) {
        String str2 = TAG;
        HwLog.i(str2, "payForVipByCoupons enter, couponStr");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "payForVip")) {
            HwLog.e(str2, "payForVipByCoupons() !isInSensitiveURLWhiteList.");
        } else if (ViewOnClickListener.isSeriesClick()) {
            HwLog.i(str2, "payForVipByCoupons isSeriesClick");
        } else {
            final CouponsByproductBean.CouponAndPrice couponAndPrice = !TextUtils.isEmpty(str) ? (CouponsByproductBean.CouponAndPrice) GsonHelper.fromJson(str, CouponsByproductBean.CouponAndPrice.class) : null;
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$payForVipByCoupons$6(couponAndPrice);
                }
            });
        }
    }

    @JavascriptInterface
    public void payForVipIAP4(String str, final String str2, final String str3) {
        String str4 = TAG;
        HwLog.i(str4, "payForVipIAP4 enter ");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "payForVip")) {
            HwLog.e(str4, "payForVipIAP4() !isInSensitiveURLWhiteList.");
            return;
        }
        if (ViewOnClickListener.isSeriesClick()) {
            HwLog.i(str4, "payForVipIAP4 isSeriesClick");
            return;
        }
        final JsPayVipNewResult jsPayVipNewResult = new JsPayVipNewResult();
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str4, "payForVipIAP4 payReqJson is null");
            jsPayVipNewResult.setResultCode(-1);
            callH5PayResult(jsPayVipNewResult, str3);
            return;
        }
        VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) GsonHelper.fromJson(str, VipPayInfoCoupons.class);
        if (vipPayInfoCoupons == null) {
            HwLog.i(str4, "payForVipIAP4 vipPayJson is null");
            jsPayVipNewResult.setResultCode(-1);
            callH5PayResult(jsPayVipNewResult, str3);
        } else {
            jsPayVipNewResult.setVipPayInfoCoupons(vipPayInfoCoupons);
            i2.a(this.mContext).b(vipPayInfoCoupons.getProductCode());
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.payForVipIAP4(vipPayInfoCoupons, new i3() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda9
                    @Override // com.huawei.watchface.i3
                    public final void a(int i, PayResultInfo payResultInfo) {
                        this.f$0.lambda$payForVipIAP4$2(str3, jsPayVipNewResult, i, payResultInfo);
                    }
                }, new v4() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda10
                    @Override // com.huawei.watchface.v4
                    public final void a(VipOrderBean vipOrderBean, VipPackageBean vipPackageBean) {
                        this.f$0.lambda$payForVipIAP4$3(str2, vipOrderBean, vipPackageBean);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void payForVipNew(String str, final String str2, final String str3) {
        String str4 = TAG;
        HwLog.i(str4, "payForVipNew enter ");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "payForVip")) {
            HwLog.e(str4, "payForVipNew() !isInSensitiveURLWhiteList.");
            return;
        }
        if (ViewOnClickListener.isSeriesClick()) {
            HwLog.i(str4, "payForVipNew isSeriesClick");
            return;
        }
        final JsPayVipNewResult jsPayVipNewResult = new JsPayVipNewResult();
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str4, "payForVipNew payReqJson is null");
            jsPayVipNewResult.setResultCode(-1);
            callH5PayResult(jsPayVipNewResult, str3);
            return;
        }
        FlavorConfig.safeHwLog(str4, "payForVipNew vipPayJson:" + str);
        VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) GsonHelper.fromJson(str, VipPayInfoCoupons.class);
        if (vipPayInfoCoupons == null) {
            HwLog.i(str4, "payForVipNew vipPayJson is null");
            jsPayVipNewResult.setResultCode(-1);
            callH5PayResult(jsPayVipNewResult, str3);
            return;
        }
        jsPayVipNewResult.setVipPayInfoCoupons(vipPayInfoCoupons);
        i2.a(this.mContext).b(vipPayInfoCoupons.getProductCode());
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.payForVipNew(vipPayInfoCoupons, new i3() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda7
                @Override // com.huawei.watchface.i3
                public final void a(int i, PayResultInfo payResultInfo) {
                    this.f$0.lambda$payForVipNew$0(jsPayVipNewResult, str3, i, payResultInfo);
                }
            }, new v4() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda8
                @Override // com.huawei.watchface.v4
                public final void a(VipOrderBean vipOrderBean, VipPackageBean vipPackageBean) {
                    this.f$0.lambda$payForVipNew$1(str2, vipOrderBean, vipPackageBean);
                }
            }, CommonUtils.F());
            return;
        }
        HwLog.i(str4, "payForVipNew mAdapter is null");
        jsPayVipNewResult.setResultCode(-1);
        callH5PayResult(jsPayVipNewResult, str3);
    }

    @JavascriptInterface
    public void refreshMemberStatus() {
        String str = TAG;
        HwLog.i(str, "refreshMemberStatus enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str, "refreshMemberStatus() !isInURLWhiteList.");
        } else {
            e5 e5VarC = e5.c();
            e5VarC.b(new c(this, e5VarC));
        }
    }

    @JavascriptInterface
    public void register(String str) {
        String str2 = TAG;
        HwLog.i(str2, "register() enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).setRegisterH5(str);
        } else {
            HwLog.i(str2, "register() isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public String registerWebViewStatus(String str) {
        HwLog.i(TAG, "registerWebViewStatus functionRes : " + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return String.valueOf(Constants.CODE_UNKNOWN_ERROR);
        }
        OnWebViewStatusCallback onWebViewStatusCallback = this.mOnWebViewStatusCallback;
        if (onWebViewStatusCallback == null) {
            return String.valueOf(Constants.CODE_UNKNOWN_ERROR);
        }
        onWebViewStatusCallback.onWebViewStatusCallback(str);
        return String.valueOf(0);
    }

    @JavascriptInterface
    public void reportOmData(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "reportOmData");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (!str.equals("2180001")) {
                LinkedHashMap<String, String> omData = parseOmData(str2);
                if (omData.size() == 0) {
                    return;
                }
                new d(str, omData).j();
                return;
            }
            HwLog.i(str3, "reportOmData json:" + str2);
            LinkedHashMap<String, String> omData2 = parseOmData(str2);
            int iA = IntegerUtils.a(omData2.get("showSuccess"));
            long jA = r2.a(omData2.get("startts"), 0L);
            g gVar = new g();
            gVar.b(jA);
            gVar.e("2");
            if (iA == 1) {
                gVar.a(iA, "MSG_ON_LOAD_SUCCESS");
            } else {
                gVar.a(iA, "MSG_ON_LOAD_FAILED");
            }
            m.a(gVar, gVar.o());
        }
    }

    @JavascriptInterface
    public void reportVipPackageInfo(String str) {
        String str2 = TAG;
        HwLog.i(str2, "reportVipPackageInfo enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "payForVip")) {
            HwLog.e(str2, "reportVipPackageInfo() !isInSensitiveURLWhiteList.");
            return;
        }
        VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) GsonHelper.fromJson(str, VipPayInfoCoupons.class);
        if (vipPayInfoCoupons == null) {
            HwLog.i(str2, "vipPayInfoCoupons is null");
        } else {
            i2.a(this.mContext).a(vipPayInfoCoupons);
        }
    }

    @JavascriptInterface
    public void reselectionWearTransmit() {
        String str = TAG;
        HwLog.i(str, "reselectionWearTransmit() -- enter.");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "reselection")) {
            HwLog.i(str, "reselectionWearTransmit() -- is not in safe url.");
            return;
        }
        HwLog.i(str, "reselectionWearTransmit() -- executing adapter.");
        if (this.mAdapter != null) {
            HwLog.i(str, "reselectionWearTransmit() -- adapter is not null.");
            this.mAdapter.reselectionWearTransmit();
        }
    }

    @JavascriptInterface
    public void resetCurrentWatchface() {
        String str = TAG;
        HwLog.i(str, "resetCurrentWatchface: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            s2.b().c();
        } else {
            HwLog.e(str, "resetCurrentWatchface() !isInURLWhiteList.");
        }
    }

    @JavascriptInterface
    public void saveBase64ToFile(String str, String str2) throws Throwable {
        String str3 = TAG;
        HwLog.i(str3, "saveBase64ToFile() enter:");
        FlavorConfig.safeHwLog(str3, "saveBase64ToFile base64Str:" + str2);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str3, "saveBase64ToFile() isInURLWhiteList");
            return;
        }
        String strA = FileHelper.a(str2, str, WatchFacePhotoAlbumManager.getInstance(this.mContext).x(), false);
        if (TextUtils.isEmpty(strA)) {
            HwLog.d(str3, "saveBase64ToFile failed");
        } else {
            e4.b(q0.g(), strA, "album_background");
            WatchFacePhotoAlbumManager.getInstance(this.mContext).d(str);
        }
    }

    @JavascriptInterface
    public String saveImagePath(String str, String str2, String str3) throws Throwable {
        String str4 = TAG;
        HwLog.i(str4, "saveImagePath name = " + str3 + ",type =" + str2);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str4, "saveImagePath() isInURLWhiteList");
            return "-1";
        }
        if (TextUtils.isEmpty(str)) {
            return "-1";
        }
        PortraitImgInfo portraitImgInfo = (PortraitImgInfo) GsonHelper.fromJson(str, PortraitImgInfo.class);
        if (portraitImgInfo == null) {
            HwLog.e(str4, "portraitImgInfo is null");
            return "-1";
        }
        String str5 = (String) ArrayUtils.a(str3.split("_"), 0);
        if (TextUtils.isEmpty(portraitImgInfo.getFgImgUrl()) || TextUtils.isEmpty(portraitImgInfo.getBgImgUrl())) {
            Context context = this.mContext;
            String imgUrl = portraitImgInfo.getImgUrl();
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(".png");
            return PversionSdUtils.a(context, imgUrl, sb.toString(), str2) ? "0" : "-1";
        }
        boolean zA = PversionSdUtils.a(this.mContext, portraitImgInfo.getFgImgUrl(), str5 + "_fg.png", str2);
        Context context2 = this.mContext;
        String bgImgUrl = portraitImgInfo.getBgImgUrl();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        sb2.append("_bg.png");
        return (PversionSdUtils.a(context2, bgImgUrl, sb2.toString(), str2) && zA) ? "0" : "-1";
    }

    @JavascriptInterface
    public void saveWatchFaceThemeAlbumInfo(String str) {
        JsInteractAddition.getInstance().c(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str);
    }

    @JavascriptInterface
    public void saveWatchFaceThemeWearAlbumInfo(String str) {
        JsInteractAddition.getInstance().d(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str);
    }

    @JavascriptInterface
    public void sendBluetoothCommand(String str) {
        String str2 = TAG;
        HwLog.i(str2, "sendBluetoothCommand() enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str2, "sendBluetoothCommand() isInURLWhiteList");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str2, "sendBluetoothCommand() json is isEmpty");
            return;
        }
        CommandJsonInfo commandJsonInfo = (CommandJsonInfo) GsonHelper.fromJson(str, CommandJsonInfo.class);
        if (commandJsonInfo == null) {
            HwLog.i(str2, "sendBluetoothCommand() commandJsonInfo is isEmpty");
        } else {
            HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).h5ToSendDeviceCommand(commandJsonInfo.getBluetoothTlvName(), commandJsonInfo.getServiceId(), commandJsonInfo.getCommandId(), commandJsonInfo.getCommandType(), commandJsonInfo.getDeviceCommand());
        }
    }

    @JavascriptInterface
    public String sendContinueDownloadWatchFace(int i, String str) {
        String str2 = TAG;
        HwLog.i(str2, "sendContinueDownloadWatchFace--operationCode==" + i + " ,continueDownloadInfo==" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "sendContinueDownloadWatchFace")) {
            return "-3";
        }
        DownloadQueryBean downloadQueryBean = (DownloadQueryBean) GsonHelper.fromJson(str, DownloadQueryBean.class);
        if (downloadQueryBean == null) {
            HwLog.w(str2, "sendContinueDownloadWatchFace -- continueDownloadInfo parse failed");
            return "-2";
        }
        downloadQueryBean.setVipFreeWatchFace(HwWatchFaceManager.getInstance(this.mContext).isVipFreeWatchFaceContain(downloadQueryBean.getHitopId()));
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        return pluginOperationAdapter != null ? pluginOperationAdapter.sendContinueDownloadWatchFace(i, downloadQueryBean) : "1";
    }

    @JavascriptInterface
    public void sendNoNetMsg() {
        String str = TAG;
        HwLog.i(str, "sendNoNetMsg");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (CommonUtils.q()) {
                HwLog.i(str, "sendNoNetMsg is backGround");
            } else if (this.mSendNoNetMsgCallback != null) {
                HwLog.i(str, "sendNoNetMsg mSendNoNetMsgCallback != null");
                this.mSendNoNetMsgCallback.onSendNoNetMsgCallback();
            }
        }
    }

    @JavascriptInterface
    public void sendServerErrorMsg() {
        String str = TAG;
        HwLog.i(str, "sendServerErrorMsg");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && this.mSendServerErrorMsgCallback != null) {
            HwLog.i(str, "sendServerErrorMsg mSendServerErrorMsgCallback != null");
            this.mSendServerErrorMsgCallback.onSendServerErrorMsgCallback();
        }
    }

    @JavascriptInterface
    public String sendStartDownload(String str) {
        String str2 = TAG;
        HwLog.w(str2, "sendStartDownload enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "sendStartDownload")) {
            return "-3";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        DownloadQueryBean downloadQueryBean = (DownloadQueryBean) GsonHelper.fromJson(str, DownloadQueryBean.class);
        if (downloadQueryBean != null) {
            if (!downloadQueryBean.isUpdate() && Math.abs(jCurrentTimeMillis - this.mLastTransmitWatchInfoChange) < 500) {
                HwLog.w(str2, "sendStartDownload error:Short time interval");
                return "1";
            }
            this.mLastTransmitWatchInfoChange = jCurrentTimeMillis;
            if (downloadQueryBean.isVipFreeWatchFace()) {
                HwLog.i(str2, "sendStartDownload--downloadInfoJson== isVipFreeWatchFace");
                g5.c().a(CommonUtils.A());
            }
            if (this.mAdapter != null) {
                return JsInteractAddition.getInstance().a(this.mAdapter, downloadQueryBean);
            }
        }
        return "1";
    }

    @JavascriptInterface
    public void sendStartTryoutDownload(String str) {
        JsInteractAddition.getInstance().a(this.mAdapter, str);
    }

    @JavascriptInterface
    public void sendWatchFaceServerErrorMsg() {
        String str = TAG;
        HwLog.i(str, "sendWatchFaceServerErrorMsg");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && this.mSendServerErrorMsgCallback != null) {
            HwLog.i(str, "sendServerErrorMsg mSendServerErrorMsgCallback != null");
            this.mSendServerErrorMsgCallback.onSendWatchFaceServerErrorCallback();
        }
    }

    @JavascriptInterface
    public void sendWatchFaceServerRetryMsg() {
        String str = TAG;
        HwLog.i(str, "sendWatchFaceServerRetryMsg");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && this.mSendServerErrorMsgCallback != null) {
            HwLog.i(str, "sendServerErrorMsg mSendServerErrorMsgCallback != null");
            this.mSendServerErrorMsgCallback.onSendWatchFaceServerRetryCallback();
        }
    }

    @JavascriptInterface
    public void setAarAbility(String str) {
        String str2 = TAG;
        HwLog.i(str2, "setAarAbility: enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "setAarAbility() !isInURLWhiteList.");
            return;
        }
        try {
            WatchFaceAarAbility watchFaceAarAbility = (WatchFaceAarAbility) GsonHelper.fromJson(str, WatchFaceAarAbility.class);
            if (watchFaceAarAbility == null) {
                HwLog.d(str2, "watchFaceAarAbility is null");
                return;
            }
            x4.a().a(watchFaceAarAbility.getEnableAnrCollect());
            JsSafeUrlSystemParamManager.getInstance().a(watchFaceAarAbility.isEnableWebViewUrlCache());
            if (contextIsValidWebViewActivity()) {
                ((WebViewActivity) this.mContext).setReloadConfigChange(watchFaceAarAbility.isEnableReloadOnConfigChange());
            } else {
                HwLog.i(str2, "jumpHwWatchFacePrivacy -- not valid WebViewActivity");
            }
        } catch (Exception e) {
            HwLog.e(TAG, "setAarAbility error:" + HwLog.printException(e));
        }
    }

    @JavascriptInterface
    public void setDefaultWatchFace(String str, String str2) {
        setDefaultWatchFace(str, str2, "");
    }

    @JavascriptInterface
    public void setEnterWatchFaceMarket(boolean z) {
        HwLog.i(TAG, "setEnterWatchFaceMarket");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (z) {
                o0.e();
            }
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.setEnterWatchFaceMarket(z);
            }
        }
    }

    @JavascriptInterface
    public void setEnteringWatchFaceAlbum(boolean z) {
        PluginOperationAdapter pluginOperationAdapter;
        HwLog.i(TAG, "setEnteringWatchFaceAlbum");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && (pluginOperationAdapter = this.mAdapter) != null) {
            pluginOperationAdapter.setEnteringWatchFaceAlbum(z);
        }
    }

    @JavascriptInterface
    public void setH5LoadSuccess(boolean z) {
        String str = TAG;
        HwLog.i(str, "setH5LoadSuccess enter isSuccess：" + z);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str, "setH5LoadSuccess() !isInURLWhiteList.");
        } else if (contextIsValidWebViewActivity()) {
            ((WebViewActivity) this.mContext).setH5LoadSuccess(z);
        } else {
            HwLog.i(str, "setH5LoadSuccess -- not valid WebViewActivity");
        }
    }

    public void setH5LoadingCallback(IH5LoadingCallback iH5LoadingCallback) {
        this.mLoadingCallback = iH5LoadingCallback;
    }

    public void setMagicWebView(WebView webView) {
        this.mWebview = webView;
        JsInteractAddition.getInstance().a(webView);
    }

    public void setOperateWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback, DelectUserDesignationWatchFaceCallback delectUserDesignationWatchFaceCallback) {
        this.mOperateWatchFaceCallback = operateWatchFaceCallback;
        this.mDelectUserDesignationWatchFaceCallback = delectUserDesignationWatchFaceCallback;
    }

    public void setSendCallback(SendServerErrorMsgCallback sendServerErrorMsgCallback, SendNoNetMsgCallback sendNoNetMsgCallback, SendCurrentUrlCallback sendCurrentUrlCallback) {
        this.mSendServerErrorMsgCallback = sendServerErrorMsgCallback;
        this.mSendNoNetMsgCallback = sendNoNetMsgCallback;
        this.mSendCurrentUrlCallback = sendCurrentUrlCallback;
    }

    public void setStarAndEndCallback(CloseWebCallback closeWebCallback) {
        this.mCloseWebCallback = closeWebCallback;
    }

    @JavascriptInterface
    public void setStatusBarFontColors(String str) {
        String str2 = TAG;
        HwLog.i(str2, "setStatusBarFontColors() enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str2, "setStatusBarFontColors() isInURLWhiteList");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str2, "setStatusBarFontColors() json is isEmpty");
        }
        try {
            if (!x2.d()) {
                HwLog.i(str2, "setStatusBarFontColors() isNetworkAvailable false");
                return;
            }
            final String strOptString = new JSONObject(str).optString("statusColor");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (BackgroundTaskUtils.a()) {
                CommonUtils.a(strOptString, (Activity) this.mContext);
            } else {
                BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JSInterface$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$setStatusBarFontColors$11(strOptString);
                    }
                });
            }
        } catch (JSONException e) {
            HwLog.e(TAG, "setStatusBarFontColors() JSONException " + HwLog.printException((Exception) e));
        }
    }

    public void setTouchCallback(OnWebViewStatusCallback onWebViewStatusCallback) {
        this.mOnWebViewStatusCallback = onWebViewStatusCallback;
    }

    @JavascriptInterface
    public void setWatchFaceConfirmButton() {
        OperateWatchFaceCallback operateWatchFaceCallback;
        HwLog.i(TAG, "setWatchFaceConfirmButton");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && (operateWatchFaceCallback = this.mOperateWatchFaceCallback) != null) {
            operateWatchFaceCallback.setWatchFaceConfirmButton();
        }
    }

    @JavascriptInterface
    public void setWatchFaceDeleteButton(String str, String str2) {
        JsInteractAddition.getInstance().c(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, str, str2);
    }

    @JavascriptInterface
    public void setWatchFaceSortList(String str) {
        HwLog.i(TAG, "setWatchFaceSortList=" + str);
        JsInteractAddition.getInstance().a(str, this.mAdapter);
    }

    public void setWebView(WebView webView) {
        this.mWebview = webView;
        JsInteractAddition.getInstance().b(webView);
    }

    public void setWidgetCallback(ToastCallback toastCallback) {
        this.mToastCallback = toastCallback;
    }

    @JavascriptInterface
    public void shareWatchface(String str) {
        HwLog.i(TAG, "shareLink AAR Module enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            try {
                HwWatchFaceApi.getInstance(this.mContext).shareLink(str);
            } catch (Exception e) {
                HwLog.e(TAG, "shareWatchface -- JSONException" + HwLog.printException(e));
            }
        }
    }

    @JavascriptInterface
    public void shareWatchfaceNew(String str) throws Throwable {
        String str2 = TAG;
        HwLog.i(str2, "shareWatchfaceNew enter.");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "shareWatchfaceNew() !isInURLWhiteList.");
            return;
        }
        if (ViewOnClickListener.isSeriesClick(1000)) {
            HwLog.i(str2, "shareWatchfaceNew isSeriesClick");
            return;
        }
        try {
            FlavorConfig.safeHwLog(str2, "shareWatchfaceNew watchfaceShareContentJson:" + str);
            c4.a(this.mContext).a((ShareModel) GsonHelper.fromJson(str, ShareModel.class));
        } catch (Exception e) {
            HwLog.e(TAG, "shareWatchfaceNew -- Exception" + HwLog.printException(e));
        }
    }

    @JavascriptInterface
    public void startCheckLocalVipHiTopIds() {
        String str = TAG;
        HwLog.i(str, "startCheckVipHiTopId: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            u2.a(false);
        } else {
            HwLog.e(str, "startCheckVipHiTopId() !isInURLWhiteList.");
        }
    }

    @JavascriptInterface
    public void startSeparationPortrait(String str) {
        HwLog.i(TAG, "startSeparationPortrait : " + str);
        JsInteractAddition.getInstance().a(str);
    }

    @JavascriptInterface
    public void stopService(String str) {
        String str2 = TAG;
        HwLog.i(str2, "stopService enter. type：" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "stopService")) {
            HwLog.e(str2, "stopService() !isInURLWhiteList.");
            return;
        }
        if (ViewOnClickListener.isSeriesClick(1000)) {
            HwLog.i(str2, "stopService isSeriesClick");
            return;
        }
        try {
            if (contextIsValidWebViewActivity()) {
                HwWatchFaceManager.getInstance(this.mContext).stopService(str, (WebViewActivity) this.mContext);
            } else {
                HwLog.i(str2, "stopService -- not valid WebViewActivity");
            }
        } catch (Exception e) {
            HwLog.e(TAG, "stopService -- Exception" + HwLog.printException(e));
        }
    }

    @JavascriptInterface
    public void syncWatchFaceThemeAlbumInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.d(TAG, "syncWatchFaceThemeAlbumInfo msg is null");
        } else {
            JsInteractAddition.getInstance().b(this.mAdapter, str);
        }
    }

    @JavascriptInterface
    public void toCallCustomerService(String str) {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.w(TAG, "toCallCustomerService -- url not in white list");
            return;
        }
        if (ViewOnClickListener.isSeriesClick(1000)) {
            return;
        }
        Intent intent = new Intent(new Intent("android.intent.action.DIAL", Uri.parse(KakaConstants.SCHEME_TEL + str)));
        if (CommonUtils.setIntentComponent(this.mContext, intent)) {
            CommonUtils.a(this.mContext, intent);
        }
    }

    @JavascriptInterface
    public void toOpenSourceLicense() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.w(TAG, "toOpenSourceLicense -- url not in white list");
        } else {
            if (ViewOnClickListener.isSeriesClick(1000)) {
                return;
            }
            Intent intent = new Intent(this.mContext, (Class<?>) WatchfaceUrlActivityV1.class);
            intent.putExtra("WebType", 101);
            CommonUtils.a(this.mContext, intent);
        }
    }

    @JavascriptInterface
    public void toPrivacyInformation(String str) {
        String strOptString;
        String str2 = TAG;
        HwLog.i(str2, "toPrivacyInformation enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.w(str2, "toPrivacyInformation -- url not in white list");
            return;
        }
        try {
            strOptString = new JSONObject(str).optString("url");
        } catch (JSONException e) {
            HwLog.e(TAG, "JSONException : " + HwLog.printException((Exception) e));
            strOptString = "";
        }
        if (ViewOnClickListener.isSeriesClick(1000)) {
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) WatchfaceUrlActivityV1.class);
        intent.putExtra("WebType", 102);
        intent.putExtra("WebSource", strOptString);
        CommonUtils.a(this.mContext, intent);
    }

    @JavascriptInterface
    public void toast(String str, String str2) {
        ToastCallback toastCallback;
        HwLog.i(TAG, "toast content:" + str + ", time:" + str2);
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) && (toastCallback = this.mToastCallback) != null) {
            toastCallback.onToast(str, str2);
        }
    }

    @JavascriptInterface
    public void transmitWatchFiles(int i, int i2) {
        String str = TAG;
        HwLog.i(str, "transmitWatchFiles() enter:" + i2);
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            WatchFacePhotoAlbumManager.getInstance(this.mContext).c(i, i2);
        } else {
            HwLog.i(str, "transmitWatchFiles() isInURLWhiteList");
        }
    }

    @JavascriptInterface
    public void updateAllWifiCheck() {
        String str = TAG;
        HwLog.i(str, "updateAllWifiCheck AAR Module enter.");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (this.mOperateWatchFaceCallback == null) {
                HwLog.i(str, "mOperateWatchFaceCallback null");
                return;
            }
            if (CommonUtils.a() == 0) {
                this.mOperateWatchFaceCallback.transmitDownloadWatchFaceResult(null, null, 1003);
            } else if (CommonUtils.a() == 1) {
                this.mOperateWatchFaceCallback.transmitDownloadWatchFaceResult(null, null, 1004);
            } else {
                HwLog.i(str, "showNetworkWarningPopup no Internet connection");
            }
        }
    }

    @JavascriptInterface
    public void updatePersonalizedStatus(String str) {
        String str2 = TAG;
        HwLog.i(str2, "updatePersonalizedStatus() enter. result ：" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str2, "updatePersonalizedStatus() isInURLWhiteList");
            return;
        }
        try {
            boolean zOptBoolean = new JSONObject(str).optBoolean("status");
            i4.a(zOptBoolean ? "1" : "0");
            boolean zC = e4.c(this.mContext);
            HwLog.i(str2, "updatePersonalizedStatus() personalizedStatus is personalizedStatus=" + zOptBoolean + ",  originStatus=" + zC);
            if (zC == zOptBoolean) {
                e4.a(this.mContext, false);
            } else {
                e4.a(this.mContext, true);
            }
        } catch (JSONException e) {
            HwLog.e(TAG, "updatePersonalizedStatus：" + HwLog.printException((Exception) e));
        }
    }

    @JavascriptInterface
    public String getBuildNumber() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String buildNumber = pluginOperationAdapter != null ? pluginOperationAdapter.getBuildNumber() : "";
        HwLog.i(TAG, "getBuildNumber return: " + buildNumber);
        return buildNumber;
    }

    @JavascriptInterface
    public String getScreenSize() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String screenSize = pluginOperationAdapter != null ? pluginOperationAdapter.getScreenSize() : "";
        HwLog.i(TAG, "getScreenSize screenSize: " + screenSize);
        return screenSize;
    }

    @JavascriptInterface
    public void getWatchFaceThemeAlbumInfo(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        HashMap map = new HashMap(32);
        map.put(JsInteractAddition.HI_TOP_ID, str);
        String str5 = TAG;
        HwLog.i(str5, JsInteractAddition.HI_TOP_ID + str);
        map.put("version", str2);
        HwLog.i(str5, "version" + str2);
        map.put("url", str3);
        map.put(WatchFaceConstant.HASHCODE, str4);
        JsInteractAddition.getInstance().a(this.mContext, this.mSendCurrentUrlCallback, this.mAdapter, map);
    }

    @JavascriptInterface
    public void setDefaultWatchFace(String str, String str2, String str3) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "setDefaultWatchFace")) {
            HwLog.i(TAG, "setDefaultWatchFace hiTopId: " + str + " version: " + str2 + ", watchScreen: " + str3);
            if (this.mAdapter != null) {
                f5.c(String.valueOf(System.currentTimeMillis()));
                this.mAdapter.setDefaultWatchFace(str, str2, str3);
            }
        }
    }

    @JavascriptInterface
    public String getFirmware() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String firmware = pluginOperationAdapter != null ? pluginOperationAdapter.getFirmware() : "";
        HwLog.i(TAG, "getFirmware return:" + firmware);
        return firmware;
    }

    @JavascriptInterface
    public String getIsoCode() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String locale = pluginOperationAdapter != null ? pluginOperationAdapter.getLocale() : "";
        HwLog.i(TAG, "getLocale retStr: " + locale);
        return locale;
    }

    @JavascriptInterface
    public String getLocale() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        String locale = pluginOperationAdapter != null ? pluginOperationAdapter.getLocale() : "";
        HwLog.i(TAG, "getLocale return:" + locale);
        return locale;
    }

    @JavascriptInterface
    public void getWatchFacePayInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        HwLog.i(TAG, "getWatchFacePayInfo() hiTopId: " + str2 + ", version: " + str3 + ", price: " + str4 + ", symbolType: " + str6);
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "getWatchFacePayInfo") && this.mAdapter != null) {
            this.mAdapter.getWatchFacePayInfo(new InstallWatchFaceBean(str2, str3, str, str4, str5, str6, str7, str9, z, 2));
        }
    }

    @JavascriptInterface
    public String getWatchFaceSignBean() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "getWatchFaceSignBean")) {
            return "";
        }
        HwLog.i(TAG, "getWatchFaceSignBean");
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        return pluginOperationAdapter != null ? pluginOperationAdapter.getWatchFaceSignBean() : "";
    }

    @JavascriptInterface
    public void getWatchFacePayInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        getWatchFacePayInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, false);
    }

    @JavascriptInterface
    public void getWatchFacePayInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        getWatchFacePayInfo(str, str2, str3, str4, str5, str6, str7, "");
    }

    @JavascriptInterface
    public void getWatchFacePayInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        getWatchFacePayInfo(str, str2, str3, str4, str5, str6, "", "");
    }
}

package com.huawei.watchface.api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.view.WindowInsetsCompat;
import com.google.gson.Gson;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.entity.InAppPurchaseData;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.support.api.pay.HuaweiPay;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.paytask.Pay;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.uikit.hwbutton.widget.HwButton;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.uikit.phone.hwtextview.widget.HwTextView;
import com.huawei.watchface.R;
import com.huawei.watchface.b0;
import com.huawei.watchface.b3;
import com.huawei.watchface.b4;
import com.huawei.watchface.c2;
import com.huawei.watchface.c4;
import com.huawei.watchface.d2;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f2;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g;
import com.huawei.watchface.g4;
import com.huawei.watchface.g5;
import com.huawei.watchface.i2;
import com.huawei.watchface.j0;
import com.huawei.watchface.j2;
import com.huawei.watchface.j3;
import com.huawei.watchface.k;
import com.huawei.watchface.k3;
import com.huawei.watchface.k4;
import com.huawei.watchface.l1;
import com.huawei.watchface.l3;
import com.huawei.watchface.m;
import com.huawei.watchface.m1;
import com.huawei.watchface.m4;
import com.huawei.watchface.manager.PostJudgeDesigner;
import com.huawei.watchface.manager.WatchFaceKaleidoscopeManager;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.manager.WatchFaceWearManager;
import com.huawei.watchface.mvp.base.BaseActivity;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.DeveloperPayload;
import com.huawei.watchface.mvp.model.datatype.TryoutBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.model.kaleidoscope.basic.KaleidoscopeDraw;
import com.huawei.watchface.mvp.model.latona.BackgroundOptionalConfig;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.model.webview.JSInterface;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import com.huawei.watchface.mvp.ui.activity.ClipImageActivity;
import com.huawei.watchface.mvp.ui.view.CustomWebView;
import com.huawei.watchface.n;
import com.huawei.watchface.n1;
import com.huawei.watchface.p1;
import com.huawei.watchface.q0;
import com.huawei.watchface.r2;
import com.huawei.watchface.u4;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.ChoosePicUtil;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.HwSfpPolicyManagerHelper;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.PermissionUtils;
import com.huawei.watchface.utils.SafeHandler;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.PluginOperationAdapter;
import com.huawei.watchface.utils.permission.PermissionUtil;
import com.huawei.watchface.w2;
import com.huawei.watchface.x2;
import com.huawei.watchface.x3;
import com.huawei.watchface.x4;
import defpackage.orf;
import java.io.File;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class WebViewActivity extends BaseActivity implements View.OnClickListener, ActivityCompat.OnRequestPermissionsResultCallback {
    private static final String ACTION_REMOVE_ACCOUNT = "com.huawei.hwid.ACTION_REMOVE_ACCOUNT";
    private static final String ACTIVITY_URL = "huaweischeme://healthapp/devicemanagement?ProductID=&DeviceType=06D&SubMAC=";
    private static final String DESIGNER_STATE_COMMON = "1";
    public static final String HW_SIGNATURE_OR_SYSTEM = "huawei.android.permission.HW_SIGNATURE_OR_SYSTEM";
    private static final String PRIVACY_PATH = "com.huawei.ui.device.activity.watchface.PrivacyStatementActivity";
    private static final int REQUEST_EXTERNAL_STORAGE = 10010;
    private static final String TAG = "WebViewActivity";
    private static Activity sActivity;
    private WeakReference<Context> context;
    private PluginOperationAdapter mAdapter;
    private g mAnalyticsH5Event;
    private ImageView mBackImageView;
    private HwButton mBtnNetSetting;
    public ChoosePicUtil mChoosePicUtil;
    private CommonWebViewBroadcastReceiver mCommonWebViewBroadcastReceiver;
    public Context mContext;
    public CustomWebView mCustomWebView;
    private DoubleClickReceiver mDoubleClickReceiver;
    public SafeHandler mHandler;
    private Intent mIntent;
    private String mLastChooseClipResourceStyle;
    private String mLastLoadUrl;
    private RelativeLayout mNetworkLayout;
    private HwTextView mNoNetworkTips;
    private HwProgressBar mProgressBar;
    private RelativeLayout mReloadLayout;
    private ImageView mTipsImageView;
    private String mUrl;
    public SafeWebView mWebView;
    private LinearLayout mWebViewLayout;
    private HwTextView mWebViewTipsCheckDate;
    private HwTextView mWebViewTipsCustomerService;
    private HwTextView mWebViewTipsUpdate;
    private String[] permissions = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private int mKaleidoscopeCurrentMaxIndex = -1;
    private boolean isReloadConfigChange = true;
    private boolean isH5LoadSuccess = false;
    private IBaseResponseCallback mIBaseResponseCallback = new IBaseResponseCallback() { // from class: com.huawei.watchface.api.WebViewActivity.1
        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            HwLog.d(WebViewActivity.TAG, "mIBaseResponseCallback() onResponse responseCode: " + i);
            SafeHandler safeHandler = WebViewActivity.this.mHandler;
            if (safeHandler == null) {
                return;
            }
            if (safeHandler.hasMessages(2015)) {
                WebViewActivity.this.mHandler.removeMessages(2015);
            }
            WebViewActivity.this.mHandler.sendEmptyMessage(2015);
        }
    };

    public static class CommonWebViewActivityHandler extends SafeHandler<WebViewActivity> {
        public CommonWebViewActivityHandler(WebViewActivity webViewActivity) {
            super(webViewActivity);
        }

        @Override // com.huawei.watchface.utils.SafeHandler
        public void handlerMessageAction(Message message) {
            if (getObj() == null) {
                return;
            }
            int i = message.what;
            if (i == 2000) {
                HwLog.i(WebViewActivity.TAG, "MSG_PROGRESSBAR_GONE");
                getObj().mProgressBar.setVisibility(8);
            } else if (i == 2005) {
                HwLog.i(WebViewActivity.TAG, "MSG_POST_TOAST");
                Object obj = message.obj;
                if (obj instanceof String) {
                    Toast.makeText(getObj().mContext, (String) obj, 0).show();
                }
            } else if (i == 2030) {
                HwLog.i(WebViewActivity.TAG, "MSG_DEVICE_MODE_CHANGE");
                Object obj2 = message.obj;
                if (obj2 instanceof String) {
                    getObj().notifyWatchfaceRefresh((String) obj2);
                }
            } else if (i == 2099) {
                HwLog.i(WebViewActivity.TAG, "MSG_SHARE_FAIL_TOAST");
                k4.b(DensityUtil.getStringById(R.string.IDS_submit_error_message_1));
            } else if (i == 20196) {
                String str = (String) message.obj;
                HwLog.i(WebViewActivity.TAG, "handleMessage newText=" + str);
                getObj().loadSafeUrl("javascript:window.transmitSearch('" + str + Constants.RIGHT_BRACKET);
            } else if (i == 20991) {
                HwLog.i(WebViewActivity.TAG, "MSG_WEAR_RESELECTION");
                getObj().reselectionWearTransmit();
            } else if (i == 2023) {
                HwLog.i(WebViewActivity.TAG, "MSG_KALEIDOSCOPE_RESET_INDEX");
                getObj().resetKaleidoscopeCurrentMaxIndex();
            } else if (i != 2024) {
                getObj().handleServerOrNetWorkPage(getObj(), message);
            } else {
                HwLog.i(WebViewActivity.TAG, "MSG_DEVICE_MODE_CHANGE");
                Object obj3 = message.obj;
                if (obj3 instanceof Integer) {
                    getObj().notifyWatchfaceModeChange(((Integer) obj3).intValue());
                }
            }
            getObj().uploadH5LoadUrl();
        }
    }

    public class CommonWebViewBroadcastReceiver extends SafeBroadcastReceiver {
        private CommonWebViewBroadcastReceiver() {
        }

        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            String str = WebViewActivity.TAG;
            HwLog.i(str, "CommonWebViewBroadcastReceiver onReceiveMsg");
            if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                HwLog.i(str, "CommonWebViewBroadcastReceiver intent or action is null.");
                return;
            }
            if (MobileInfoHelper.isHuaweiDevice() && "com.huawei.hwid.ACTION_REMOVE_ACCOUNT".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(Objects.requireNonNull(intent.getAction()))) {
                if (WebViewActivity.this.mCustomWebView == null) {
                    HwLog.i(str, "CommonWebViewBroadcastReceiver mCustomWebView is null.");
                    return;
                }
                if (CommonUtils.C()) {
                    g5.c().a(CommonUtils.A(), false, false);
                } else if (f2.a(context).c()) {
                    k4.a(DensityUtil.getStringById(R.string.network_is_error));
                }
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.mCustomWebView.s(webViewActivity.getNetworkInfo());
                x2.a((Integer) null);
            }
        }
    }

    public class DoubleClickReceiver extends SafeBroadcastReceiver {
        public DoubleClickReceiver() {
        }

        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            HwLog.i(WebViewActivity.TAG, "DoubleClickReceiver onReceive()");
            SafeWebView safeWebView = WebViewActivity.this.mWebView;
            if (safeWebView != null) {
                safeWebView.setScrollY(0);
            }
        }
    }

    private void callJsBleCharacteristicRead(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsBleCharacteristicRead bundle is null");
            return;
        }
        String string = bundle.getString("function");
        String string2 = bundle.getString("errCode");
        String string3 = bundle.getString("data");
        if (string == null || string2 == null || string3 == null) {
            HwLog.e(TAG, "callJsBleCharacteristicRead bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", string3);
            jSONObject.put("errCode", string2);
            String string4 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string, string4));
            HwLog.d(TAG, "callJsBleCharacteristicRead " + string4);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsBleCharacteristicRead fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void callJsBleCharacteristicValueChange(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsBleCharacteristicValueChange bundle is null");
            return;
        }
        String string = bundle.getString("function");
        String string2 = bundle.getString("deviceId");
        String string3 = bundle.getString(BleConstants.KEY_CHARACTERISTICID);
        String string4 = bundle.getString("data");
        if (string == null || string2 == null || string3 == null || string4 == null) {
            HwLog.e(TAG, "callJsBleCharacteristicValueChange bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", string2);
            jSONObject.put("serviceId", "");
            jSONObject.put(BleConstants.KEY_CHARACTERISTICID, string3);
            jSONObject.put("data", string4);
            String string5 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string, string5));
            FlavorConfig.safeHwLog(TAG, "callJsBleCharacteristicValueChange " + string5);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsBleCharacteristicValueChange fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void callJsBleCharacteristicWrite(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsBleCharacteristicWrite bundle is null");
            return;
        }
        String string = bundle.getString("function");
        String string2 = bundle.getString("errCode");
        if (string == null || string2 == null) {
            HwLog.e(TAG, "callJsBleCharacteristicWrite bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", string2);
            String string3 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string, string3));
            HwLog.d(TAG, "callJsBleCharacteristicWrite " + string3);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsBleCharacteristicWrite fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void callJsBleServicesDiscovered(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsBleServicesDiscovered bundle is null");
            return;
        }
        String string = bundle.getString("errCode");
        String string2 = bundle.getString("function");
        if (string == null || string2 == null) {
            HwLog.e(TAG, "callJsBleServicesDiscovered bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", string);
            String string3 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string2, string3));
            HwLog.d(TAG, "callJsBleServicesDiscovered " + string3);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsBleServicesDiscovered fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void callJsGetBleAdapterState(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsGetBleAdapterState bundle is null");
            return;
        }
        String string = bundle.getString("function");
        boolean z = bundle.getBoolean(BleConstants.KEY_DISCOVERING);
        boolean z2 = bundle.getBoolean(BleConstants.KEY_AVAILABLE);
        String string2 = bundle.getString("errCode");
        if (string == null || string2 == null) {
            HwLog.e(TAG, "callJsGetBleAdapterState bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BleConstants.KEY_DISCOVERING, Boolean.valueOf(z));
            jSONObject.put(BleConstants.KEY_AVAILABLE, Boolean.valueOf(z2));
            jSONObject.put("errCode", string2);
            String string3 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string, string3));
            HwLog.d(TAG, "callJsGetBleAdapterState " + string3);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsGetBleAdapterState fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void callJsOnConnectionStateChange(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsOnConnectionStateChange bundle is null");
            return;
        }
        String string = bundle.getString("deviceId");
        boolean z = bundle.getBoolean(BleConstants.KEY_CONNECTSTATE);
        String string2 = bundle.getString("function");
        if (string == null || string2 == null) {
            HwLog.e(TAG, "callJsOnConnectionStateChange bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", string);
            jSONObject.put(BleConstants.KEY_CONNECTSTATE, Boolean.valueOf(z));
            String string3 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string2, string3));
            HwLog.d(TAG, "callJsOnConnectionStateChange " + string3);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsOnConnectionStateChange fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void callJsSaveResult(Bundle bundle) {
        if (bundle == null) {
            HwLog.e(TAG, "callJsSaveResult bundle is null");
            return;
        }
        String string = bundle.getString("function");
        int i = bundle.getInt("errCode");
        if (string == null) {
            HwLog.e(TAG, "callJsSaveResult bundle get.* is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", Integer.valueOf(i));
            String string2 = jSONObject.toString();
            loadSafeUrl(WebViewUtils.getUrl(string, string2));
            HwLog.d(TAG, "callJsSaveResult " + string2);
        } catch (JSONException e) {
            HwLog.e(TAG, "callJsSaveResult fail exception = " + HwLog.printException((Exception) e));
        }
    }

    private void clipPic(Intent intent, boolean z) {
        String fileSavedPath;
        Uri data;
        String str = TAG;
        HwLog.i(str, "clipPic() isFromGallery: " + z);
        if (this.mChoosePicUtil == null) {
            HwLog.e(str, "clipPic() mChoosePicUtil is null");
            this.mChoosePicUtil = new ChoosePicUtil(this.mContext);
        }
        if (!z) {
            fileSavedPath = this.mChoosePicUtil.getFileSavedPath();
            data = null;
        } else {
            if (intent == null) {
                HwLog.e(str, "clipPic() originData is null");
                return;
            }
            data = intent.getData();
            if (data == null) {
                HwLog.e(str, "clipPic() originalUri is null");
                return;
            }
            fileSavedPath = this.mChoosePicUtil.getPicPathByUri(this.mContext, data);
        }
        if (TextUtils.isEmpty(fileSavedPath)) {
            HwLog.e(str, "clipPic() filePath is empty.");
            return;
        }
        if (isChooseWearBack()) {
            HwLog.i(str, "clipPic() -- isChooseWearBack true");
            WatchFaceWearManager.getInstance(this.mContext).a(fileSavedPath, data);
        }
        saveClipPic(intent, fileSavedPath, data);
    }

    private void dealOnPageFinish(WebViewActivity webViewActivity, Object obj) {
        if (obj instanceof String) {
            if (this.mIntent != null) {
                this.mUrl = (String) obj;
            }
            if (!CommonUtils.C() || this.mNetworkLayout.getVisibility() == 0) {
                return;
            }
            u4.c(webViewActivity.mWebView, 0);
        }
    }

    private void dealUrlConfigParam() {
        if (Environment.getApplicationContext() == null) {
            HwLog.i(TAG, "dealUrlConfigParam getApplicationContext  is null");
            return;
        }
        String strE = JsSafeUrlSystemParamManager.getInstance().e();
        if (TextUtils.isEmpty(strE)) {
            HwLog.i(TAG, "dealUrlConfigParam releaseUrlConfig  is empty");
            return;
        }
        String str = this.mUrl;
        if (str != null && str.contains(strE)) {
            HwLog.i(TAG, "dealUrlConfigParam mUrl  is contains releaseUrlConfig");
            return;
        }
        HwLog.i(TAG, "dealUrlConfigParam releaseUrlConfig:" + strE);
        StringBuilder sb = new StringBuilder();
        sb.append(this.mUrl);
        sb.append(this.mUrl.contains("?") ? "&" : "?");
        sb.append(strE);
        this.mUrl = sb.toString();
    }

    private void destroyWebView() {
        String str = TAG;
        HwLog.i(str, "destroyWebView");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.H();
            this.mCustomWebView = null;
        }
        if (this.mWebView != null) {
            HwLog.i(str, "onDestroy destroyWebView");
            this.mWebView.setTag("0");
            ViewParent parent = this.mWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mWebView);
            }
            this.mWebView.stopLoading();
            this.mWebView.getSettings().setJavaScriptEnabled(false);
            this.mWebView.clearHistory();
            this.mWebView.clearView();
            this.mWebView.removeAllViews();
            this.mWebView.destroy();
            this.mWebView = null;
        }
    }

    private void disableWatchfaceService(int i) {
        if (i == -1) {
            finish();
        }
    }

    private void generateKaleidoscopeBg(String str, String str2, String str3, String str4) throws Throwable {
        if (!PversionSdUtils.getFile(str3 + str4).exists()) {
            WatchFaceBitmapUtil.saveBitmapToFile(new KaleidoscopeDraw(this, str2, str).b(), Bitmap.CompressFormat.PNG, str3, str4);
            return;
        }
        HwLog.i(TAG, "generateKaleidoscopeBg() already exist: " + str4);
    }

    private void generateKaleidoscopeInfo(String str) throws Throwable {
        String str2 = SafeString.substring(str, 0, str.lastIndexOf(".")) + File.separator;
        generateKaleidoscopeBg(KaleidoscopeDraw.a.HONEYCOMB.toString(), str, str2, "honeycomb.png");
        generateKaleidoscopeBg(KaleidoscopeDraw.a.RADIAL.toString(), str, str2, "radia.png");
        BackgroundOptionalConfig backgroundOptionalConfig = new BackgroundOptionalConfig();
        backgroundOptionalConfig.setResPreview(str);
        if (this.mKaleidoscopeCurrentMaxIndex == -1) {
            this.mKaleidoscopeCurrentMaxIndex = WatchFaceKaleidoscopeManager.getInstance(this).s();
        }
        HwLog.i(TAG, "generateKaleidoscopeInfo() mKaleidoscopeCurrentMaxIndex: " + this.mKaleidoscopeCurrentMaxIndex);
        int i = this.mKaleidoscopeCurrentMaxIndex + 1;
        this.mKaleidoscopeCurrentMaxIndex = i;
        backgroundOptionalConfig.setIndex(String.valueOf(i));
        backgroundOptionalConfig.setHoneycombBgPath(str2 + "honeycomb.png");
        backgroundOptionalConfig.setRadiationBgPath(str2 + "radia.png");
        this.mCustomWebView.b(backgroundOptionalConfig);
    }

    public static Activity getActivity() {
        HwLog.i(TAG, "getActivity");
        return sActivity;
    }

    private void getDesignerInfo() {
        HwLog.i(TAG, "getDesignerInfo() enter.");
        try {
            ThreadPoolManager.getInstance().execute(new PostJudgeDesigner(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda1
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    WebViewActivity.lambda$getDesignerInfo$10(i, obj);
                }
            }));
        } catch (Exception e) {
            HwLog.i(TAG, "getDesignerInfo() error: " + HwLog.printException(e));
        }
    }

    private void goBack() {
        String str = TAG;
        HwLog.i(str, "goBack");
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

    private void handleAfterMembershipPaymentResult(Intent intent, int i, PayResultInfo payResultInfo) {
        String str = TAG;
        HwLog.i(str, "handleAfterPaymentResult() start resolve huawei pay");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.transmitFinishPay("");
        }
        String strH = i2.a((Context) Environment.getApplicationContext()).h();
        if (payResultInfo != null && this.mAdapter != null) {
            HwLog.i(str, "handlePayResult() onActivityResult returnCode : " + payResultInfo.getReturnCode());
            if (strH == null) {
                strH = "VIP" + payResultInfo.getRequestId();
            }
            k.d(strH).g(payResultInfo.getOrderID()).a(BleConstants.KEY_PATH, this.mUrl).a("reqCode", String.valueOf(i)).a("ErrMsg", payResultInfo.getErrMsg()).a("Time", payResultInfo.getTime()).a("WithholdID", payResultInfo.getWithholdID()).a("ReturnCode", String.valueOf(payResultInfo.getReturnCode())).a("RequestId", payResultInfo.getRequestId());
            if (payResultInfo.getReturnCode() == 0) {
                HwLog.i(str, "handlePayResult() Payment result success");
                j2.g().n();
            } else if (payResultInfo.getReturnCode() == 30000) {
                HwLog.i(str, "handlePayResult() Payment result user cancel");
                i2.a(this.mContext).a(payResultInfo);
            } else if (payResultInfo.getReturnCode() == 30099) {
                HwLog.i(str, "handlePayResult() Payment result error");
                i2.a(this.mContext).a(payResultInfo);
            } else if (payResultInfo.getReturnCode() == -1) {
                HwLog.i(str, "handlePayResult() Payment result failed");
                i2.a(this.mContext).a(payResultInfo);
            } else {
                HwLog.i(str, "handlePayResult() Payment result unknow");
            }
        } else if (!CommonUtils.u()) {
            showPayFailDialog();
        }
        k.a(strH, payResultInfo != null ? payResultInfo.getReturnCode() : com.huawei.openalliance.ad.constant.Constants.COORDINATE_FAIL_DEF, null);
    }

    private void handleBleService(WebViewActivity webViewActivity, Message message) {
        Bundle data;
        if (webViewActivity == null || message == null || (data = message.getData()) == null) {
            return;
        }
        switch (message.what) {
            case 10002:
                HwLog.i(TAG, "BLE_CONNECTION_STATE_CHANGE");
                webViewActivity.callJsOnConnectionStateChange(data);
                break;
            case 10003:
                HwLog.i(TAG, "BLE_SERVICES_DISCOVERED");
                webViewActivity.callJsBleServicesDiscovered(data);
                break;
            case 10004:
                HwLog.i(TAG, "BLE_CHARACTERISTIC_VALUE_CHANGE");
                webViewActivity.callJsBleCharacteristicValueChange(data);
                break;
            case 10005:
                HwLog.i(TAG, "BLE_CHARACTERISTIC_WRITE");
                webViewActivity.callJsBleCharacteristicWrite(data);
                break;
            case 10006:
                HwLog.i(TAG, "BLE_CHARACTERISTIC_READ");
                webViewActivity.callJsBleCharacteristicRead(data);
                break;
            case 10007:
                HwLog.i(TAG, "GET_BLU_ADAPTER_STATE");
                webViewActivity.callJsGetBleAdapterState(data);
                break;
            case 10008:
            default:
                HwLog.d(TAG, "handleBleService default.");
                break;
            case 10009:
                HwLog.i(TAG, "SAVE_DATA_RESULT_MSG");
                webViewActivity.callJsSaveResult(data);
                break;
        }
    }

    private void handleCheckPwdResult(int i, SafeIntent safeIntent) {
        if (-1 == i) {
            if (safeIntent == null || TextUtils.isEmpty(safeIntent.getStringExtra(CommonConstant.KEY_ID_TOKEN))) {
                transmitVerityPwsRes("1", "handleCheckPwdResult safeIntent or idToken is empty");
                HwLog.i(TAG, "handleCheckPwdResult safeIntent or idToken is empty");
                return;
            }
            int intExtra = safeIntent.getIntExtra("resultCode", -1);
            HwLog.i(TAG, "handleCheckPwdResult success onResultCode：" + intExtra);
            transmitVerityPwsRes("0", "handleCheckPwdResult success");
            return;
        }
        if (safeIntent == null || TextUtils.isEmpty(safeIntent.getStringExtra("reason"))) {
            transmitVerityPwsRes("6", "handleCheckPwdResult safeIntent or reason is empty");
            HwLog.i(TAG, "handleCheckPwdResult safeIntent or reason is empty");
            return;
        }
        int intExtra2 = safeIntent.getIntExtra("resultCode", -1);
        String stringExtra = safeIntent.getStringExtra("reason");
        transmitVerityPwsRes(String.valueOf(intExtra2), stringExtra);
        HwLog.i(TAG, "handleCheckPwdResult error onResultCode:" + intExtra2 + ",reason:" + stringExtra);
    }

    private void handleIAP4PayResult(Intent intent, int i) {
        String str = TAG;
        HwLog.i(str, "handleIAP4PayResult --start");
        if (sActivity == null) {
            HwLog.i(str, "handleIAP4PayResult sActivity is null");
            return;
        }
        PayResultInfo payResultInfo = new PayResultInfo();
        PurchaseResultInfo purchaseResultInfoFromIntent = Iap.getIapClient(sActivity).parsePurchaseResultInfoFromIntent(intent);
        if (purchaseResultInfoFromIntent == null) {
            uploadSubscriptionPayResult(payResultInfo);
            HwLog.e(str, "handleIAP4PayResult purchaseResultInfo is null");
            return;
        }
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        String errMsg = purchaseResultInfoFromIntent.getErrMsg();
        HwLog.i(str, "handleIAP4PayResult -- returnCode:" + returnCode + ",errorMsg:" + errMsg);
        payResultInfo.setReturnCode(returnCode);
        payResultInfo.setErrMsg(errMsg);
        String inAppPurchaseData = purchaseResultInfoFromIntent.getInAppPurchaseData();
        if (TextUtils.isEmpty(inAppPurchaseData)) {
            HwLog.e(str, "handleIAP4PayResult inAppPurchaseDataString is null or empty");
            uploadSubscriptionPayResult(payResultInfo);
            handleAfterMembershipPaymentResult(intent, i, payResultInfo);
            return;
        }
        try {
            InAppPurchaseData inAppPurchaseData2 = new InAppPurchaseData(inAppPurchaseData);
            String string = BigDecimal.valueOf(inAppPurchaseData2.getPrice()).divide(BigDecimal.valueOf(100.0d), 2, 4).toString();
            DeveloperPayload developerPayload = (DeveloperPayload) GsonHelper.fromJson(inAppPurchaseData2.getDeveloperPayload(), DeveloperPayload.class);
            String requestId = developerPayload != null ? developerPayload.getRequestId() : "";
            payResultInfo.setAmount(string);
            payResultInfo.setOrderID(inAppPurchaseData2.getOrderID());
            payResultInfo.setRequestId(requestId);
            payResultInfo.setTime(String.valueOf(inAppPurchaseData2.getPurchaseTime()));
            payResultInfo.setWithholdID(inAppPurchaseData2.getOrderID());
            handleAfterMembershipPaymentResult(intent, i, payResultInfo);
        } catch (JSONException e) {
            HwLog.e(TAG, "handleIAP4PayResult JSONException:" + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e(TAG, "handleIAP4PayResult Exception:" + HwLog.printException(e2));
        }
        uploadSubscriptionPayResult(payResultInfo);
    }

    private void handleJsService(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        HwLog.d(TAG, "handleBleService.");
        webViewActivity.handleBleService(webViewActivity, message);
    }

    private void handleLoadPage(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2015) {
            HwLog.i(TAG, "handleLoadPage() MSG_GRS_GET_URL");
            handleLoadPage(webViewActivity);
        } else {
            if (i != 10086) {
                webViewActivity.handleJsService(webViewActivity, message);
                return;
            }
            HwLog.i(TAG, "handleLoadPage() ON_PAGE_FINISH");
            Object obj = message.obj;
            CustomWebView customWebView = this.mCustomWebView;
            if (customWebView != null && message.arg1 == 11) {
                customWebView.c(false);
            }
            dealOnPageFinish(webViewActivity, obj);
        }
    }

    private void handlePayResult(Intent intent, int i) {
        PayResultInfo payResultInfoFromIntent;
        String str = TAG;
        HwLog.i(str, "handlePayResult() start resolve huawei pay");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.transmitFinishPay("");
        }
        String strG = i2.a((Context) Environment.getApplicationContext()).g();
        if (i == 101) {
            payResultInfoFromIntent = HuaweiPay.HuaweiPayApi.getPayResultInfoFromIntent(intent);
        } else {
            payResultInfoFromIntent = i == 103 ? Pay.getPayClient((Activity) this).getPayResultInfoFromIntent(intent) : null;
        }
        if (payResultInfoFromIntent != null && this.mAdapter != null) {
            HwLog.i(str, "handlePayResult() onActivityResult returnCode : " + payResultInfoFromIntent.getReturnCode());
            k.d(strG).g(payResultInfoFromIntent.getOrderID()).a(BleConstants.KEY_PATH, this.mUrl).a("reqCode", String.valueOf(i)).a("ErrMsg", payResultInfoFromIntent.getErrMsg()).a("Time", payResultInfoFromIntent.getTime()).a("WithholdID", payResultInfoFromIntent.getWithholdID()).a("ReturnCode", String.valueOf(payResultInfoFromIntent.getReturnCode())).a("RequestId", payResultInfoFromIntent.getRequestId());
            if (payResultInfoFromIntent.getReturnCode() == 0) {
                HwLog.i(str, "handlePayResult() Payment result success");
            } else if (payResultInfoFromIntent.getReturnCode() == 30000) {
                HwLog.i(str, "handlePayResult() Payment result user cancel");
                i2.a(this.mContext).a(payResultInfoFromIntent);
            } else if (payResultInfoFromIntent.getReturnCode() == 30099) {
                HwLog.i(str, "handlePayResult() Payment result error");
                i2.a(this.mContext).a(payResultInfoFromIntent);
            } else if (payResultInfoFromIntent.getReturnCode() == -1) {
                HwLog.i(str, "handlePayResult() Payment result failed");
                i2.a(this.mContext).a(payResultInfoFromIntent);
            } else {
                HwLog.i(str, "handlePayResult() Payment result unknow");
            }
            this.mAdapter.uploadPayResult(String.valueOf(payResultInfoFromIntent.getReturnCode()), payResultInfoFromIntent.getErrMsg());
        } else if (!CommonUtils.u()) {
            showPayFailDialog();
        }
        k.a(strG, payResultInfoFromIntent != null ? payResultInfoFromIntent.getReturnCode() : com.huawei.openalliance.ad.constant.Constants.COORDINATE_FAIL_DEF, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleServerOrNetWorkPage(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2001) {
            if (CommonUtils.C()) {
                HwLog.i(TAG, "MSG_ON_RECEIVED_ERROR showNoServicePage");
                webViewActivity.showNoServicePage();
                this.mAnalyticsH5Event.a(message.what, "MSG_ON_RECEIVED_ERROR showNoServicePage");
                return;
            } else {
                HwLog.i(TAG, "MSG_ON_RECEIVED_ERROR showNoNetworkPage");
                webViewActivity.showNoNetworkPage();
                this.mAnalyticsH5Event.a(message.what, "MSG_ON_RECEIVED_ERROR showNoNetworkPage");
                return;
            }
        }
        if (i == 2003) {
            HwLog.i(TAG, "MSG_ON_NET_WORK");
            webViewActivity.showNoNetworkPage();
            this.mAnalyticsH5Event.a(message.what, "MSG_ON_NET_WORK noNetWork");
            return;
        }
        if (i == 4001) {
            HwLog.i(TAG, "MAG_WEB_VIEW_LOAD");
            webViewActivity.showUnstableNetworkPage();
            this.mAnalyticsH5Event.a(message.what, "MAG_WEB_VIEW_LOAD");
            return;
        }
        if (i == 2006) {
            HwLog.i(TAG, "MSG_SERVER_ERROR");
            webViewActivity.showServerErrorPage();
            this.mAnalyticsH5Event.a(message.what, "MSG_SERVER_ERROR");
            return;
        }
        if (i == 2007) {
            HwLog.i(TAG, "MSG_CONNECT_TIMEOUT");
            webViewActivity.showUnstableNetworkPage();
            this.mAnalyticsH5Event.a(message.what, "MSG_CONNECT_TIMEOUT");
        } else if (i == 2021) {
            HwLog.i(TAG, "MSG_WATCH_FACE_SERVER_ERROR");
            webViewActivity.showWatchFaceServerErrorPage();
            this.mAnalyticsH5Event.a(message.what, "MSG_WATCH_FACE_SERVER_ERROR");
        } else {
            if (i != 2022) {
                webViewActivity.handleTitle(webViewActivity, message);
                return;
            }
            HwLog.i(TAG, "MSG_WATCH_FACE_SERVER_RETRY");
            webViewActivity.showWatchFaceServerRetryPage();
            this.mAnalyticsH5Event.a(message.what, "MSG_WATCH_FACE_SERVER_RETRY");
        }
    }

    private void handleStartActivity(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i != 2004) {
            if (i != 2016) {
                webViewActivity.handleLoadPage(webViewActivity, message);
                return;
            }
            String str = TAG;
            HwLog.i(str, "MSG_START_WEB_PAGE");
            Bundle data = message.getData();
            if (data != null) {
                webViewActivity.startLoadUrl(data.getString("url"));
                return;
            } else {
                HwLog.w(str, "handleStartActivity MSG_START_WEB_PAGE bundle is null");
                return;
            }
        }
        String str2 = TAG;
        HwLog.i(str2, "MSG_START_MINI_SHOP_WEB_PAGE");
        Bundle data2 = message.getData();
        if (data2 == null) {
            HwLog.w(str2, "handleStartActivity MSG_START_MINI_SHOP_WEB_PAGE bundle is null");
            return;
        }
        String string = data2.getString("url");
        String string2 = data2.getString("type");
        Intent intent = new Intent(webViewActivity.mContext, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", string);
        intent.putExtra("type", string2);
        orf.a(webViewActivity.mContext, intent);
    }

    private void handleSubscriptionPayResult(Intent intent, int i) {
        PayResultInfo payResultInfoFromIntent;
        String str = TAG;
        HwLog.i(str, "handleSubscriptionPayResult --start");
        if (i == 104) {
            HwLog.i(str, "handleSubscriptionPayResult -- in SUB_HANDLER_EVENT_PAY_RESULT");
            payResultInfoFromIntent = HuaweiPay.HuaweiPayApi.getPayResultInfoFromIntent(intent);
        } else if (i == 105) {
            HwLog.i(str, "handleSubscriptionPayResult -- in SUB_IAP_EVENT_PAY_RESULT");
            payResultInfoFromIntent = Pay.getPayClient((Activity) this).getPayResultInfoFromIntent(intent);
        } else {
            payResultInfoFromIntent = null;
        }
        handleAfterMembershipPaymentResult(intent, i, payResultInfoFromIntent);
        if (payResultInfoFromIntent != null && this.mAdapter != null) {
            HwLog.i(str, "handleSubscriptionPayResult -- payResultInfo : " + payResultInfoFromIntent.getReturnCode());
            this.mAdapter.uploadSubscriptionPayResult(payResultInfoFromIntent);
            return;
        }
        if (payResultInfoFromIntent == null) {
            HwLog.e(str, "handleSubscriptionPayResult -- payResultInfo is null");
        }
        if (this.mAdapter == null) {
            HwLog.e(str, "handleSubscriptionPayResult -- mAdapter is null");
        }
    }

    private void handleTitle(WebViewActivity webViewActivity, Message message) {
        int i = message.what;
        if (i == 2025) {
            HwLog.i(TAG, "handleTitle() MSG_SHOW_WATCH_FACE_INSTALL_PROGRESS");
            webViewActivity.showInstallProgress(message.arg1);
        } else if (i != 20253) {
            webViewActivity.handleStartActivity(webViewActivity, message);
        } else {
            HwLog.i(TAG, "handleTitle() UPLOAD_SUCCESS");
            BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.api.WebViewActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    HwLog.i(WebViewActivity.TAG, "handleTitle() goBack");
                    CustomWebView customWebView = WebViewActivity.this.mCustomWebView;
                    if (customWebView != null) {
                        customWebView.k();
                    }
                }
            });
        }
    }

    private void initAnalyticsH5Event() {
        if (this.mAnalyticsH5Event == null) {
            this.mAnalyticsH5Event = new g();
        }
        this.mAnalyticsH5Event.b(System.currentTimeMillis());
        this.mAnalyticsH5Event.e("2");
    }

    private void initData() {
        HwLog.i(TAG, "initData() enter.");
        if (!CommonUtils.C()) {
            showNoNetworkPage();
        }
        initEvent();
    }

    private void initErrorView() {
        HwLog.i(TAG, "CommonUtil.isErrorWebView");
        ((HwButton) findViewById(R.id.btn_go_setting)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$initErrorView$2(view);
            }
        });
    }

    private void initEvent() {
        String str = TAG;
        HwLog.i(str, "initEvent() enter.");
        if (this.mCustomWebView != null) {
            HwLog.e(str, "init time onGlobalLayout:" + (System.currentTimeMillis() - HwWatchFaceApi.getInstance(this.mContext).getInitTime()));
            FlavorConfig.safeHwLog(str, "loadSafeUrl mUrl:" + this.mUrl);
            this.mCustomWebView.loadSafeUrl(this.mUrl, false);
        }
    }

    private void initGrsManager() {
        b3.b().f();
        if (!Environment.sIsAarInTheme) {
            JsSafeUrlSystemParamManager.getInstance().f();
        }
        if (this.mHandler == null) {
            this.mHandler = new CommonWebViewActivityHandler(this);
        }
        if (HwWatchFaceBtManager.getInstance(this).getWatchFaceSupportInfo() == null) {
            HwLog.d(TAG, "initGrsManager() getWatchFaceSupportInfo is null.");
            HwWatchFaceBtManager.getInstance(this).getDeviceInfoForUi(this.mIBaseResponseCallback);
        }
        handleLoadPage((WebViewActivity) this.mContext);
    }

    private void initIntentData() {
        String str = TAG;
        HwLog.i(str, "initIntentData() enter.");
        Intent intent = getIntent();
        this.mIntent = intent;
        if (intent != null) {
            this.mUrl = intent.getStringExtra("url");
            FlavorConfig.safeHwLog(str, "initIntentData mUrl:" + this.mUrl);
            if (!TextUtils.isEmpty(this.mLastLoadUrl)) {
                if (this.mLastLoadUrl.contains("&operateType=")) {
                    this.mLastLoadUrl = SafeString.replace(this.mLastLoadUrl, "&operateType=", "&operateTypeOrg=");
                }
                this.mUrl = this.mLastLoadUrl;
                this.mLastLoadUrl = null;
                this.mIntent.setAction(null);
                FlavorConfig.safeHwLog(str, "initIntentData mLastLoadUrl:" + this.mUrl);
            }
            TryoutBean tryoutBean = (TryoutBean) this.mIntent.getParcelableExtra("key_try_out_bean");
            if (TextUtils.isEmpty(this.mUrl) && tryoutBean != null) {
                String action = this.mIntent.getAction();
                if ("1".equals(action)) {
                    HwLog.i(str, "initIntentData - to buy watch face");
                    this.mUrl = j2.g().g(tryoutBean.getDetailUrl(), "1");
                } else if ("2".equals(action)) {
                    HwLog.i(str, "initIntentData - finish try out");
                    j2.g().b(tryoutBean);
                    this.mUrl = j2.g().g(tryoutBean.getDetailUrl(), "2");
                } else if ("3".equals(action)) {
                    HwLog.i(str, "initIntentData - open vip");
                    this.mUrl = j2.g().g(tryoutBean.getDetailUrl(), "4");
                }
            }
            if (TextUtils.isEmpty(this.mUrl)) {
                this.mUrl = "";
            }
            verifyExterUrl();
        }
    }

    private void initOperationAdapter(Context context) {
        String str = TAG;
        HwLog.i(str, "initOperationAdapter() enter.");
        if (((PluginOperationAdapter) k3.a(context).getAdapter()) == null) {
            HwLog.i(str, "initOperationAdapter() adapter is null.");
            k3 k3VarA = k3.a(context);
            k3VarA.setAdapter(l3.a(context));
            k3VarA.init(context);
        }
    }

    private void initView() {
        String str = TAG;
        HwLog.i(str, "initView() enter.");
        this.mContext = this;
        setActivity(this);
        PluginOperationAdapter pluginOperationAdapter = (PluginOperationAdapter) k3.a(this.mContext).getAdapter();
        this.mAdapter = pluginOperationAdapter;
        if (pluginOperationAdapter == null) {
            initOperationAdapter(this.mContext);
            this.mAdapter = (PluginOperationAdapter) k3.a(this.mContext).getAdapter();
        }
        if (this.mHandler == null) {
            this.mHandler = new CommonWebViewActivityHandler(this);
        }
        LinearLayout linearLayout = (LinearLayout) u4.a(this, R.id.webview_layout);
        this.mWebViewLayout = linearLayout;
        linearLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return WebViewActivity.lambda$initView$3(view, windowInsets);
            }
        });
        SafeWebView safeWebView = (SafeWebView) u4.a(this, R.id.web_view);
        this.mWebView = safeWebView;
        safeWebView.setLayerType(2, null);
        HwLog.i(str, "initView() isHardwareAccelerated: " + this.mWebView.isHardwareAccelerated());
        n1.a(this.mContext, this.mWebView);
        if (n1.a(getApplicationContext())) {
            HwLog.i(str, "initView setBackgroundColor #000000");
            this.mWebView.setBackgroundColor(Color.parseColor("#000000"));
        } else {
            HwLog.i(str, "initView setBackgroundColor #FFFFFF");
            this.mWebView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        this.mCustomWebView = getCustomWebView();
        setLastChooseClipResourceStyle();
        setWatchfaceCallback();
        HwProgressBar hwProgressBarE = this.mCustomWebView.e();
        this.mProgressBar = hwProgressBarE;
        u4.b(hwProgressBarE, CommonUtils.h(this));
        this.mReloadLayout = (RelativeLayout) u4.a(this, R.id.reload_layout);
        this.mNetworkLayout = (RelativeLayout) u4.a(this, R.id.net_work_layout);
        this.mBtnNetSetting = (HwButton) u4.a(this, R.id.btn_no_net_work);
        this.mTipsImageView = (ImageView) u4.a(this, R.id.img_no_net_work);
        this.mBackImageView = (ImageView) u4.a(this, R.id.img_back);
        this.mNoNetworkTips = (HwTextView) u4.a(this, R.id.tips_no_net_work);
        this.mWebViewTipsUpdate = (HwTextView) u4.a(this, R.id.tips_web_view_update);
        this.mWebViewTipsCheckDate = (HwTextView) u4.a(this, R.id.tips_web_view_check_date);
        this.mWebViewTipsCustomerService = (HwTextView) u4.a(this, R.id.tips_web_view_customer_service);
        u4.a(this.mReloadLayout, this);
        u4.a(this.mBtnNetSetting, this);
        u4.a(this.mBackImageView, new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$initView$4(view);
            }
        });
        HwLog.i(str, "init time initView:" + (System.currentTimeMillis() - HwWatchFaceApi.getInstance(this.mContext).getInitTime()));
        initData();
    }

    private boolean isChooseSearchBack() {
        CustomWebView customWebView = this.mCustomWebView;
        return customWebView != null && customWebView.getChooseToClipResourceStyle() == 4;
    }

    private boolean isChooseVideoBack() {
        CustomWebView customWebView = this.mCustomWebView;
        return customWebView != null && customWebView.getChooseToClipResourceStyle() == 1;
    }

    static /* synthetic */ void lambda$getDesignerInfo$10(int i, Object obj) {
        String str = TAG;
        HwLog.i(str, "getDesignerInfo() errorCode: " + i + ", object:" + obj);
        if (i == 0 && (obj instanceof String)) {
            boolean zEquals = "1".equals((String) obj);
            HwLog.i(str, "getDesignerInfo() onSuccess, isDesigner: " + zEquals);
            e4.a("current_user_is_designer", zEquals, "goal_steps_perference");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initErrorView$2(View view) {
        HwLog.i(TAG, "CommonUtil.uninstallApk");
        CommonUtils.e(this.mContext, "com.google.android.webview");
    }

    static /* synthetic */ WindowInsets lambda$initView$3(View view, WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        view.setPadding(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).left, 0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).right, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$4(View view) {
        goBack();
    }

    static /* synthetic */ void lambda$onCreate$0() {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 1) {
            e4.f("cache_device_id", l1.a(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdentify()));
            e4.f("cache_device_name", l1.a(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceName()));
        }
        HwSfpPolicyManagerHelper.initDefaultCeLabelInDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1() {
        w2.a(Environment.getApplicationContext());
        p1.a((Context) Environment.getApplicationContext(), true);
        e4.i(this.mContext);
        e4.h(this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$8(View view) {
        HwLog.d(TAG, "positiveListener click");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.b("0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$9(View view) {
        HwLog.d(TAG, "negativeListener click");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.b("0");
        }
    }

    static /* synthetic */ void lambda$showPayFailDialog$7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyStoragePermissions$5(View view) {
        HwLog.d(TAG, "positiveListener click");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.b("0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyStoragePermissions$6(View view) {
        HwLog.d(TAG, "negativeListener click");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.b("0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSafeUrl(final String str) {
        this.mAnalyticsH5Event.g(str);
        JsSafeUrlSystemParamManager.getInstance().c(new JsSafeUrlSystemParamManager.b() { // from class: com.huawei.watchface.api.WebViewActivity.3
            @Override // com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager.b
            public void onGetFinished() {
                g4 g4VarC = b3.b().c();
                if (g4VarC == null || !g4VarC.a(str)) {
                    HwLog.i(WebViewActivity.TAG, "loadSafeUrl - loadPage: SupportType is null.");
                    WebViewActivity.this.loadSafeUrlAfterloadWhite(str);
                } else {
                    SafeWebView safeWebView = WebViewActivity.this.mWebView;
                    if (safeWebView != null) {
                        safeWebView.loadUrl(str);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSafeUrlAfterloadWhite(final String str) {
        b3.b().a(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.WebViewActivity.4
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public void onResponse(int i, Object obj) {
                if (obj instanceof g4) {
                    boolean zA = ((g4) obj).a(str);
                    String str2 = WebViewActivity.TAG;
                    HwLog.i(str2, "reload whitelist isWhiteUrl : " + zA);
                    if (zA) {
                        WebViewActivity.this.mWebView.loadUrl(str);
                    } else {
                        HwLog.e(str2, "reload isWhiteUrl false.");
                    }
                }
            }
        });
        b3.b().f();
    }

    private void registerHealthBalanceObserver() {
        HwLog.i(TAG, "registerHealthBalanceObserver");
        m1 m1VarB = m1.b();
        if (m1VarB.c()) {
            return;
        }
        m1VarB.e();
    }

    private void registerWebviewReceiver() {
        if (this.mCommonWebViewBroadcastReceiver == null) {
            this.mCommonWebViewBroadcastReceiver = new CommonWebViewBroadcastReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (MobileInfoHelper.isHuaweiDevice()) {
            intentFilter.addAction("com.huawei.hwid.ACTION_REMOVE_ACCOUNT");
        }
        WeakReference<Context> weakReference = this.context;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (CommonUtils.isAndroid13()) {
            this.context.get().registerReceiver(this.mCommonWebViewBroadcastReceiver, intentFilter, HW_SIGNATURE_OR_SYSTEM, null, 4);
        } else {
            this.context.get().registerReceiver(this.mCommonWebViewBroadcastReceiver, intentFilter, HW_SIGNATURE_OR_SYSTEM, null);
        }
    }

    private void saveClipPic(Intent intent, String str, Uri uri) {
        if (isChooseSearchBack()) {
            customScanClipPic(str, uri);
        } else {
            customClipPic(intent, str, uri, isH5Clip());
        }
    }

    public static void setActivity(Activity activity) {
        HwLog.i(TAG, "setActivity");
        sActivity = activity;
    }

    private void setLastChooseClipResourceStyle() {
        if (this.mCustomWebView == null) {
            HwLog.i(TAG, "setLastChooseClipResourceStyle mCustomWebView is null");
        } else if (TextUtils.isEmpty(this.mLastChooseClipResourceStyle)) {
            HwLog.i(TAG, "setLastChooseClipResourceStyle mLastChooseClipResourceStyle is null");
        } else {
            this.mCustomWebView.e(r2.a(this.mLastChooseClipResourceStyle, 0));
        }
    }

    private void setLastLoadUrl(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.mLastLoadUrl = bundle.getString("lastLoadUrl");
        this.mLastChooseClipResourceStyle = bundle.getString("lastChooseClipResourceStyle");
        String str = TAG;
        HwLog.i(str, "setLastLoadUrl mLastChooseClipResourceStyle:" + this.mLastChooseClipResourceStyle);
        FlavorConfig.safeHwLog(str, "mLastLoadUrl:" + this.mLastLoadUrl);
    }

    private void setTxtTipsVisibility(int i) {
        this.mWebViewTipsUpdate.setVisibility(i);
        this.mWebViewTipsCheckDate.setVisibility(i);
        this.mWebViewTipsCustomerService.setVisibility(i);
    }

    private boolean shouldPerformCleanup() {
        return isRootActivity() && HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getOperateCallback() == this.mCustomWebView;
    }

    private void showInstallProgress(int i) {
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.showInstallProgress(i, this);
        }
    }

    private void showNoServicePage() {
        HwLog.i(TAG, "showNoServicePage");
        showToolsBar();
        this.mNetworkLayout.setVisibility(0);
        u4.c(this.mWebView, 4);
        setTxtTipsVisibility(8);
        this.mBtnNetSetting.setVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_unable_connect_server_tips));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    private void showPayFailDialog() {
        new j0.a(this).b(DensityUtil.getStringById(R.string.IDS_pay_failed)).a(DensityUtil.getStringById(R.string.IDS_watchface_watch_permission_pay_fail_content)).b(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.lambda$showPayFailDialog$7(view);
            }
        }).a().show();
    }

    private void showServerErrorPage() {
        HwLog.i(TAG, "showServerErrorPage");
        showToolsBar();
        this.mNetworkLayout.setVisibility(0);
        u4.c(this.mWebView, 4);
        this.mBtnNetSetting.setVisibility(8);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_servers_error));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    private void showUnstableNetworkPage() {
        HwLog.i(TAG, "showUnstableNetworkPage");
        showToolsBar();
        this.mNetworkLayout.setVisibility(0);
        u4.c(this.mWebView, 4);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mProgressBar.setVisibility(8);
        this.mNoNetworkTips.setText(getString(R.string.network_unstable_notice2));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    private void showWatchFaceServerErrorPage() {
        HwLog.i(TAG, "showWatchFaceServerErrorPage");
        showToolsBar();
        this.mNetworkLayout.setVisibility(0);
        u4.c(this.mWebView, 4);
        this.mBtnNetSetting.setVisibility(8);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_watchface_server_error));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    private void showWatchFaceServerRetryPage() {
        HwLog.i(TAG, "showWatchFaceServerRetryPage");
        showToolsBar();
        u4.c(this.mNetworkLayout, 0);
        u4.c(this.mWebView, 4);
        u4.c(this.mBtnNetSetting, 4);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_watchface_server_retry));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    private void transferWatchFaceFile(int i, Intent intent) {
        if (i != -1) {
            HwLog.i(TAG, "no select watch face file");
            return;
        }
        if (intent == null) {
            HwLog.w(TAG, "transferWatchFaceFile, intent is null.");
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            HwLog.i(TAG, "uri is null");
            return;
        }
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.transferWatchFaceFile(data, this);
        }
    }

    private void transmitClippedImageType(Intent intent) {
        String stringExtra = "";
        int intExtra = 0;
        try {
            stringExtra = intent.getStringExtra(ClipImageActivity.IMAGE_SUFFIX);
            intExtra = intent.getIntExtra(ClipImageActivity.IMAGE_SUFFIX_IS_NOT_SUPPORT, 0);
        } catch (ClassCastException unused) {
            HwLog.e(TAG, "transmitClippedImageType ClassCastException");
        } catch (Exception unused2) {
            HwLog.e(TAG, "transmitClippedImageType Exception");
        }
        HwLog.i(TAG, "transmitClippedImageType suffix:" + stringExtra + ",suffixSupportType:" + intExtra);
        if (intExtra == 1) {
            transmitClippedImageTypeIsNotSupport(stringExtra);
        }
    }

    private void transmitClippedImageTypeIsNotSupport(String str) {
        if (this.mCustomWebView != null) {
            HwLog.i(TAG, "transmitClippedImageTypeIsNotSupport suffix:" + str);
            this.mCustomWebView.x(str);
        }
    }

    private void transmitClippedPath(Intent intent) throws Throwable {
        String stringExtra;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra(ClipImageActivity.CLIP_RESULT_PATH);
            } catch (ClassCastException unused) {
                stringExtra = null;
            }
            String strFilterFilePath = CommonUtils.filterFilePath(stringExtra);
            if (TextUtils.isEmpty(strFilterFilePath)) {
                HwLog.e(TAG, "transmitClippedPath() clippedPath is empty");
                transmitClippedImageType(intent);
                return;
            }
            if (this.mCustomWebView != null) {
                String str = TAG;
                HwLog.e(str, "transmitClippedPath() --  mCustomWebView not null");
                LatonaWatchFaceProvider.getInstance(this.mContext).setTempImagePaths(strFilterFilePath);
                if (isChooseKaleidoscopeBack()) {
                    HwLog.i(str, "generateKaleidoscopeInfo");
                    generateKaleidoscopeInfo(strFilterFilePath);
                } else if (isChooseWearBack()) {
                    HwLog.i(str, "generateWearInfo");
                    generateWearInfo(strFilterFilePath);
                } else {
                    HwLog.i(str, "checkForPortrait");
                    checkForPortrait(strFilterFilePath, false);
                }
            }
        }
    }

    private void transmitSetDefaultWatchFaceResult() {
        if (this.mCustomWebView == null) {
            HwLog.d(TAG, "updateUiForDefaultWatchFace() mCustomWebView is null");
            return;
        }
        WatchResourcesInfo currentWatchFace = HwWatchFaceBtManager.getInstance(this.mContext).getCurrentWatchFace();
        if (currentWatchFace == null) {
            HwLog.d(TAG, "updateUiForDefaultWatchFace() watchResourcesInfo is null");
            return;
        }
        HwLog.d(TAG, "updateUiForDefaultWatchFace() enter.");
        this.mCustomWebView.transmitSetDefaultWatchFaceResult(currentWatchFace.getWatchInfoId(), currentWatchFace.getWatchInfoVersion(), 1);
    }

    private void transmitVerityPwsRes(String str, String str2) {
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.transmitVerityPwsRes(str, str2);
        }
    }

    private void unregisterWebviewReceiver() {
        try {
            WeakReference<Context> weakReference = this.context;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.context.get().unregisterReceiver(this.mCommonWebViewBroadcastReceiver);
        } catch (Exception e) {
            HwLog.i(TAG, "unregisterWebviewReceiver error=" + HwLog.printException(e));
        }
    }

    private void updateWatchfaceCallBack() {
        OperateWatchFaceCallback operateCallback = HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getOperateCallback();
        if (operateCallback == null || this.mAdapter == null) {
            return;
        }
        HwLog.i(TAG, "updateWatchfaceCallBack");
        this.mAdapter.setWatchFaceCallback(operateCallback, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadH5LoadUrl() {
        if (this.mAnalyticsH5Event.k() == null) {
            return;
        }
        g gVar = this.mAnalyticsH5Event;
        m.a(gVar, gVar.o());
    }

    private void uploadSubscriptionPayResult(PayResultInfo payResultInfo) {
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter == null || payResultInfo == null) {
            HwLog.i(TAG, "handleIAP4PayResult -- payResultInfo or mAdapter is null");
        } else {
            pluginOperationAdapter.uploadSubscriptionPayResult(payResultInfo);
        }
    }

    private void verifyExterUrl() {
        Uri uri;
        String queryParameter;
        String queryParameter2;
        String galleryWatchFaceUrl;
        if (TextUtils.isEmpty(this.mUrl)) {
            HwLog.i(TAG, "verifyExterUrl mUrl is null");
            return;
        }
        String fragment = null;
        try {
            this.mUrl = x3.a(this.mUrl);
            dealGreyUrl();
            dealUrlConfigParam();
            uri = Uri.parse(this.mUrl);
        } catch (NullPointerException e) {
            HwLog.e(TAG, "verifyExterUrl error " + HwLog.printException((Exception) e));
            uri = null;
        } catch (Exception e2) {
            HwLog.e(TAG, "verifyExterUrl Exception " + HwLog.printException(e2));
            uri = null;
        }
        if (uri == null) {
            return;
        }
        try {
            queryParameter = uri.getQueryParameter(FitRunPlayAudio.PLAY_TYPE_T);
        } catch (UnsupportedOperationException e3) {
            HwLog.e(TAG, "verifyExterUrl UnsupportedOperationException targetParam: " + HwLog.printException((Exception) e3));
            queryParameter = null;
        } catch (Exception e4) {
            HwLog.e(TAG, "verifyExterUrl Exception targetParam: " + HwLog.printException(e4));
            queryParameter = null;
        }
        String str = TAG;
        HwLog.d(str, "targetParam:" + queryParameter);
        if (queryParameter == null || !queryParameter.equals("1")) {
            HwLog.i(str, "target unknown " + queryParameter);
            return;
        }
        try {
            queryParameter2 = uri.getQueryParameter("f");
        } catch (UnsupportedOperationException e5) {
            HwLog.e(TAG, "verifyExterUrl UnsupportedOperationException flagParam: " + HwLog.printException((Exception) e5));
            queryParameter2 = null;
        } catch (Exception e6) {
            HwLog.e(TAG, "verifyExterUrl Exception flagParam: " + HwLog.printException(e6));
            queryParameter2 = null;
        }
        if (queryParameter2 == null || !queryParameter2.equals("1")) {
            try {
                fragment = uri.getFragment();
            } catch (Exception e7) {
                HwLog.e(TAG, "verifyExterUrl Exception fragment: " + HwLog.printException(e7));
            }
            HwLog.i(TAG, "flag unknown:" + queryParameter2 + ",fragment:" + fragment);
            galleryWatchFaceUrl = !TextUtils.isEmpty(fragment) ? HwWatchFaceApi.getInstance(this.mContext).getGalleryWatchFaceUrl() : HwWatchFaceApi.getInstance(this.mContext).getWatchFaceUrl(true);
        } else {
            galleryWatchFaceUrl = HwWatchFaceApi.getInstance(this.mContext).getWatchFaceUrl(false);
        }
        if (TextUtils.isEmpty(galleryWatchFaceUrl)) {
            HwLog.i(TAG, "h5DetailUrl is empty");
            return;
        }
        this.mUrl = SafeString.replace(this.mUrl, "https://n", galleryWatchFaceUrl);
        FlavorConfig.safeHwLog(TAG, "verifyExterUrl mUrl:" + this.mUrl);
    }

    public void checkForPortrait(String str, boolean z) {
        this.mCustomWebView.transmitClippedPath(str);
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity
    public void configChangeReload() {
        String str = TAG;
        HwLog.i(str, "configChangeReload() enter.");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView == null) {
            HwLog.i(str, "configChangeReload mCustomWebView is null");
            return;
        }
        customWebView.B();
        if (!this.isReloadConfigChange) {
            HwLog.i(str, "configChangeReload isReloadConfigChange false");
            return;
        }
        this.mCustomWebView.c(true);
        u4.c(this.mWebView, 4);
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView != null) {
            safeWebView.reload();
        }
    }

    public void customClipPic(Intent intent, String str, Uri uri, boolean z) {
        this.mChoosePicUtil.a((Activity) this.mContext, str, uri, isSquareBackground());
    }

    public void customScanClipPic(String str, Uri uri) {
        this.mChoosePicUtil.b((Activity) this.mContext, str, uri, isSquareBackground());
    }

    public void generateWearInfo(String str) {
    }

    public CustomWebView getCustomWebView() {
        return new CustomWebView(getJSInterface(), this.mContext, (HwProgressBar) findViewById(R.id.load_url_progress), this.mWebView, this.mHandler, 3002);
    }

    public JSInterface getJSInterface() {
        return new JSInterface(this.mContext);
    }

    public String getNetworkInfo() {
        String str;
        int iB = x2.b();
        if (iB != 1) {
            str = (iB == 2 || iB == 3 || iB == 4 || iB == 5) ? JsNetwork.NetworkType.MOBILE : "none";
        } else {
            str = "wifi";
        }
        return new Gson().toJson(new JsNetwork(str, x2.a(Environment.getApplicationContext())));
    }

    public void gotoPrivacyStatementActivity() {
        Intent intent = new Intent();
        intent.setClassName(Environment.b(), PRIVACY_PATH);
        orf.d(this, intent, 102);
    }

    public void hideLoadingDialog() {
        this.mCustomWebView.hideLoadingDialog();
    }

    public boolean isChooseKaleidoscopeBack() {
        CustomWebView customWebView = this.mCustomWebView;
        return customWebView != null && customWebView.getChooseToClipResourceStyle() == 2;
    }

    public boolean isChoosePhotoBack() {
        CustomWebView customWebView = this.mCustomWebView;
        return customWebView != null && customWebView.getChooseToClipResourceStyle() == 0;
    }

    public boolean isChooseWearBack() {
        CustomWebView customWebView = this.mCustomWebView;
        return customWebView != null && customWebView.getChooseToClipResourceStyle() == 3;
    }

    public boolean isH5Clip() {
        CustomWebView customWebView = this.mCustomWebView;
        return customWebView != null && customWebView.isH5Clip;
    }

    public boolean isH5LoadSuccess() {
        return this.isH5LoadSuccess;
    }

    public boolean isSquareBackground() {
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
        if (isChooseKaleidoscopeBack() || isChooseWearBack()) {
            return true;
        }
        return watchFaceSupportInfo != null && watchFaceSupportInfo.isPortraitModeSupported();
    }

    public void notifyH5ApplyPermission(String str) {
        HwLog.i(TAG, "notifyH5ApplyPermission");
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.b(str);
        }
    }

    public void notifyH5ClickSelectPhoto() {
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.C();
        }
    }

    public void notifyNotInstallation() {
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.D();
        }
    }

    public void notifyWatchfaceModeChange(int i) {
        HwLog.i(TAG, "notifyWatchfaceModeChange currentMode：" + i);
        reload();
    }

    public void notifyWatchfaceRefresh(String str) {
        HwLog.i(TAG, "notifyWatchfaceRefresh url is empty：" + TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str)) {
            reload();
        } else {
            loadSafeUrl(str);
        }
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            HwLog.i(TAG, "onActivityResult() data is null.");
        }
        String str = TAG;
        HwLog.i(str, "onActivityResult() requestCode is " + i + " resultCode is " + i2);
        SafeIntent safeIntent = new SafeIntent(intent);
        if (i == 10086) {
            if (this.mCustomWebView.g() == null) {
                HwLog.i(str, "onActivityResult FILE_CHOOSER_RESULT_CODE return");
                return;
            } else {
                this.mCustomWebView.g().onReceiveValue(i2 != -1 ? null : safeIntent.getData());
                this.mCustomWebView.a((ValueCallback) null);
                return;
            }
        }
        if (i != 10087) {
            if (i == 20001) {
                takePhoto(i2, safeIntent);
                return;
            } else {
                onActivityResultTwo(i, i2, safeIntent);
                return;
            }
        }
        if (this.mCustomWebView.h() == null) {
            HwLog.i(str, "onActivityResult FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5 return");
            return;
        }
        Uri data = i2 != -1 ? null : safeIntent.getData();
        if (data != null) {
            HwLog.i(str, "onActivityResult FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5 result not null");
            this.mCustomWebView.h().onReceiveValue(new Uri[]{data});
        } else {
            HwLog.i(str, "onActivityResult FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5 result null");
            this.mCustomWebView.h().onReceiveValue(new Uri[0]);
        }
        this.mCustomWebView.b((ValueCallback) null);
    }

    public void onActivityResultTwo(int i, int i2, SafeIntent safeIntent) throws Throwable {
        if (i == 0) {
            String str = TAG;
            HwLog.i(str, "onActivityResultTwo CHOOSE_PHOTO_REQUEST_CODE");
            if (this.mCustomWebView == null) {
                HwLog.i(str, "onActivityResultTwo mCustomWebView is null.");
                return;
            } else if (!isChooseVideoBack()) {
                clipPic(safeIntent, true);
            }
        } else if (i == 1) {
            HwLog.i(TAG, "onActivityResultTwo GO_CAMERA_REQUEST_CODE");
            if (!isChooseVideoBack()) {
                clipPic(safeIntent, false);
            }
        } else if (i == 3) {
            transmitClippedPath(safeIntent);
        } else if (i == 10088) {
            transferWatchFaceFile(i2, safeIntent);
        } else if (i == 101 || i == 103) {
            handlePayResult(safeIntent, i);
        } else if (i == 104 || i == 105) {
            handleSubscriptionPayResult(safeIntent, i);
        } else if (i == 106) {
            handleIAP4PayResult(safeIntent, i);
        } else if (i == 102) {
            disableWatchfaceService(i2);
        } else if (i == 42001) {
            if (i2 == 42002) {
                finish();
            }
        } else if (i == 10011) {
            handleCheckPwdResult(i2, safeIntent);
        } else {
            HwLog.i(TAG, "onActivityResultTwo invalid requestCode.");
        }
        if (i2 == 0 && this.mCustomWebView != null && isChooseSearchBack()) {
            this.mCustomWebView.I();
            this.mCustomWebView.y("6");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CustomWebView customWebView = this.mCustomWebView;
        boolean z = (customWebView.f30412a || customWebView.f30413b) ? false : true;
        if (customWebView == null || z || !this.isH5LoadSuccess) {
            HwLog.i(TAG, "super onBackPressed");
            super.onBackPressed();
        } else {
            HwLog.i(TAG, "onBackPressed -- transmitAppGoBack()");
            this.mCustomWebView.transmitAppGoBack();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HwLog.i(TAG, "reload");
        if (view == this.mReloadLayout) {
            reload();
        } else if (view == this.mBtnNetSetting) {
            CommonUtils.i(this.mContext);
        }
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Environment.setApplication((Application) getApplicationContext());
        super.onCreate(bundle);
        setLastLoadUrl(bundle);
        n.e().c();
        this.context = new WeakReference<>(this);
        getWindow().setSoftInputMode(48);
        d2.a().b();
        if (HwWatchFaceApi.getInstance(this).getAdapter() == null) {
            finish();
        }
        this.mContext = this;
        if (HwWatchFaceApi.getInstance(this).getInitTime() == 0) {
            HwLog.i(TAG, "update init time");
            HwWatchFaceApi.getInstance(this).setInitTime(System.currentTimeMillis());
        }
        FlavorConfig.irrupt(this);
        String str = TAG;
        HwLog.i(str, "onCreate() enter. watchface version:" + q0.a());
        initAnalyticsH5Event();
        if (isRootActivity()) {
            c2.a(this.mContext).C();
            getDesignerInfo();
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewActivity.lambda$onCreate$0();
                }
            });
            x4.a().a(true);
            x4.a().c();
        }
        initGrsManager();
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onCreate$1();
            }
        });
        setPortraitManeger();
        registerWebviewReceiver();
        registerHealthBalanceObserver();
        HwLog.i(str, "init time onCreate end:" + (System.currentTimeMillis() - HwWatchFaceApi.getInstance(this).getInitTime()));
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = TAG;
        HwLog.i(str, "onDestroy() enter.");
        if (!shouldPerformCleanup()) {
            HwLog.i(str, "onDestroy is not Clean callback");
            super.onDestroy();
            return;
        }
        n.e().c();
        HwWatchFaceBtManager.getInstance(this).clearRegisterH5();
        WatchFaceWearManager.getInstance(this.mContext).b();
        if (isRootActivity()) {
            HwLog.d(str, "isRootActivity setIsSyncAndDestroyWatchFace");
            WatchFacePhotoAlbumManager.getInstance(this.mContext).a(false, true);
            WatchFaceWearManager.getInstance(this.mContext).a(false, true);
            WatchFaceKaleidoscopeManager.getInstance(this.mContext).a(false, true);
            x4.a().a(false);
            x4.a().d();
        }
        unregisterWebviewReceiver();
        Intent intent = this.mIntent;
        if (intent != null) {
            intent.putExtra("url", this.mUrl);
            setIntent(this.mIntent);
        }
        if (this.mHandler != null) {
            HwLog.i(str, "onDestroy() mHandler remove.");
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        if (isRootActivity()) {
            this.mIBaseResponseCallback = null;
            destroyWebView();
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.setWatchFaceCallback(null, isRootActivity());
                this.mAdapter.releaseWatchFaceLoginHelper();
                HwLog.i(str, "onDestroy() clearWatchFaceCallback");
            }
            WatchFaceHttpUtil.a();
            HwWatchFaceApi.getInstance(this).clearCountryCode();
            HwWatchFaceApi.getInstance(this).setDisableWearInfoList(null);
            HwWatchFaceApi.getInstance(this).setConnectStatus(null);
            HwWatchFaceApi.getInstance(this).setDeviceInfo(null);
            HwWatchFaceApi.getInstance(this).setAccountInfoMap(null);
            x2.a((Integer) null);
            j2.g().o();
            p1.b(this);
            setActivity(null);
            b3.b().a();
            HwWatchFaceApi.getInstance(this.mContext).setInitTime(0L);
            c4.a(this).a();
            m.a();
        } else {
            ChoosePicUtil.a();
            updateWatchfaceCallBack();
        }
        super.onDestroy();
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        HwLog.d(TAG, "onNewIntent() enter.");
        setIntent(intent);
        initGrsManager();
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        String str = TAG;
        HwLog.i(str, BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (this.mCustomWebView != null && this.mWebView != null) {
            HwLog.d(str, "WatchFaceConstant.WEB_VIEW_STATUS_ON_PAUSE");
            this.mCustomWebView.a(Constants.WEBVIEW_STATUS_ON_PAUSE);
        }
        m.d().h();
        b4.a().c();
        unregisterReceiver(this.mDoubleClickReceiver);
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        String str = TAG;
        HwLog.i(str, "onRequestPermissionsResult requestCode is " + i);
        j3.a().a(strArr, iArr);
        if (i == 10010) {
            e4.a("android.permission.WRITE_EXTERNAL_STORAGE", false, "sp_permission_file");
            if (b0.a(this.mContext, strArr)) {
                PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
                if (pluginOperationAdapter != null) {
                    pluginOperationAdapter.openSystemFileManager(this);
                }
            } else {
                if (System.currentTimeMillis() - CustomWebView.E > 500) {
                    CustomWebView.notifyH5(this);
                    return;
                }
                HwWatchFaceApi.getInstance(this).showHealthAppSettingGuide(this, PermissionUtil.PermissionType.STORAGE.getPermission(), new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.lambda$onRequestPermissionsResult$8(view);
                    }
                }, new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.lambda$onRequestPermissionsResult$9(view);
                    }
                });
            }
        } else {
            HwLog.d(str, "onRequestPermissionsResult other");
        }
        boolean zVerifyPermissions = PermissionUtils.verifyPermissions(iArr);
        if (!zVerifyPermissions && System.currentTimeMillis() - CustomWebView.E > 500) {
            CustomWebView.notifyH5(this);
            return;
        }
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            customWebView.a(i, zVerifyPermissions);
            this.mCustomWebView.c(strArr);
        }
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = TAG;
        HwLog.i(str, BaseDialog.LIFE_CYCLE_ON_RESUME);
        this.mDoubleClickReceiver = new DoubleClickReceiver();
        IntentFilter intentFilter = new IntentFilter(Constants.CLICK_STATUS_BAR_ACTION);
        if (CommonUtils.isAndroid13()) {
            this.mContext.registerReceiver(this.mDoubleClickReceiver, intentFilter, Constants.SYSTEM_UI_PERMISSION, null, 4);
        } else {
            this.mContext.registerReceiver(this.mDoubleClickReceiver, intentFilter, Constants.SYSTEM_UI_PERMISSION, null);
        }
        if (this.mCustomWebView != null && this.mWebView != null) {
            HwLog.d(str, "WatchFaceConstant.WEB_VIEW_STATUS_ON_RESUME");
            this.mCustomWebView.a(Constants.WEBVIEW_STATUS_ON_RESUME);
        }
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            if (customWebView.c() != null) {
                this.mCustomWebView.c().dismiss();
            }
            this.mCustomWebView.b();
            PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
            if (pluginOperationAdapter != null) {
                pluginOperationAdapter.updateWatchFaceCallback(this.mCustomWebView, isRootActivity());
            }
            this.mCustomWebView.addJavascriptInterface(getJSInterface());
        }
        if (isRootActivity() && m4.a()) {
            transmitSetDefaultWatchFaceResult();
            m4.a(false);
        }
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = TAG;
        FlavorConfig.safeHwLog(str, "onSaveInstanceState mUrl:" + this.mUrl);
        bundle.putString("lastLoadUrl", this.mUrl);
        CustomWebView customWebView = this.mCustomWebView;
        if (customWebView != null) {
            int chooseToClipResourceStyle = customWebView.getChooseToClipResourceStyle();
            HwLog.i(str, "onSaveInstanceState mChooseToClipResourceStyle:" + chooseToClipResourceStyle);
            bundle.putString("lastChooseClipResourceStyle", String.valueOf(chooseToClipResourceStyle));
        }
    }

    public void reload() {
        String str = TAG;
        HwLog.i(str, "reload() enter.");
        if (!CommonUtils.C()) {
            HwLog.i(str, "reload() isNetworkConnected.");
            return;
        }
        u4.c(this.mNetworkLayout, 4);
        u4.c(this.mWebView, 0);
        String strA = WebViewUtils.a((WebView) this.mWebView);
        FlavorConfig.safeHwLog(str, "reloadWebViewUrl:" + strA);
        if (this.mCustomWebView != null) {
            if (TextUtils.isEmpty(strA) || TextUtils.equals(strA, Constants.ABOUT_BLANK)) {
                strA = this.mCustomWebView.f();
            }
            if (!TextUtils.isEmpty(strA)) {
                this.mCustomWebView.loadSafeUrl(strA, true);
            } else {
                HwLog.i(str, "reload() reloadUrl is empty.");
                this.mCustomWebView.loadSafeUrl(this.mUrl, false);
            }
        }
    }

    public void reselectionWearTransmit() {
    }

    public void resetKaleidoscopeCurrentMaxIndex() {
        this.mKaleidoscopeCurrentMaxIndex = -1;
    }

    public void setH5LoadSuccess(boolean z) {
        this.isH5LoadSuccess = z;
    }

    public void setPortraitManeger() {
    }

    public void setReloadConfigChange(boolean z) {
        HwLog.i(TAG, "setReloadConfigChange reloadConfigChange:" + z);
        this.isReloadConfigChange = z;
    }

    public void setWatchfaceCallback() {
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.setWatchFaceCallback(this.mCustomWebView, isRootActivity());
            this.mAdapter.setEnteringWatchFaceAlbum(false);
            HwLog.i(TAG, "initView() setWatchFaceCallback.");
        }
    }

    public void showLoadingDialog() {
        this.mCustomWebView.showLoadingDialog(DensityUtil.getStringById(R.string.saving));
    }

    public void showNoNetworkPage() {
        HwLog.i(TAG, "showNoNetworkPage");
        showToolsBar();
        this.mNetworkLayout.setVisibility(0);
        u4.c(this.mWebView, 4);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    public void showWatchFaceNetworkRetryPage() {
        HwLog.i(TAG, "showWatchFaceServerRetryPage");
        showToolsBar();
        u4.c(this.mNetworkLayout, 0);
        u4.c(this.mWebView, 4);
        u4.c(this.mBtnNetSetting, 0);
        setTxtTipsVisibility(8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_submit_error_message_1));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    public void startLoadUrl(String str) {
        String str2 = TAG;
        HwLog.i(str2, "startLoadUrl startLoadUrl the url");
        if (this.mCustomWebView == null) {
            HwLog.d(str2, "mCustomWebView is null startLoadUrl");
            return;
        }
        String strG = WebViewUtils.g(str);
        if (this.mCustomWebView.b(strG)) {
            this.mCustomWebView.b(true);
            loadSafeUrl(strG);
        } else {
            HwLog.d(str2, "isWhiteUrl is false url");
            this.mCustomWebView.b(false);
        }
    }

    public void updateWatchfaceCallback() {
        PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
        if (pluginOperationAdapter != null) {
            pluginOperationAdapter.updateWatchFaceCallback(this.mCustomWebView, isRootActivity());
            this.mAdapter.setEnteringWatchFaceAlbum(false);
            HwLog.i(TAG, "updateWatchfaceCallback() setWatchFaceCallback.");
        }
    }

    public void verifyStoragePermissions() {
        CustomWebView customWebView;
        boolean zIsAndroid13 = CommonUtils.isAndroid13();
        String str = BleConstants.CODE_AUTHORIZED_FAIL;
        if (zIsAndroid13) {
            if (android.os.Environment.isExternalStorageManager()) {
                PluginOperationAdapter pluginOperationAdapter = this.mAdapter;
                if (pluginOperationAdapter != null) {
                    pluginOperationAdapter.openSystemFileManager(this);
                    return;
                }
                return;
            }
            HwWatchFaceApi.getInstance(this).showHealthAppSettingGuide(this, PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE.getPermission(), new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.lambda$verifyStoragePermissions$5(view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.watchface.api.WebViewActivity$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.lambda$verifyStoragePermissions$6(view);
                }
            });
            CustomWebView customWebView2 = this.mCustomWebView;
            if (customWebView2 != null) {
                customWebView2.b(BleConstants.CODE_AUTHORIZED_FAIL);
                return;
            }
            return;
        }
        if ((CommonUtils.isAndroid13() ? ContextCompat.checkSelfPermission(this, this.permissions[0]) : PermissionChecker.checkSelfPermission(this, this.permissions[0])) == 0) {
            PluginOperationAdapter pluginOperationAdapter2 = this.mAdapter;
            if (pluginOperationAdapter2 != null) {
                pluginOperationAdapter2.openSystemFileManager(this);
                return;
            }
            return;
        }
        CustomWebView.a(System.currentTimeMillis());
        ActivityCompat.requestPermissions(this, this.permissions, 10010);
        if (PermissionUtils.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") || (customWebView = this.mCustomWebView) == null) {
            return;
        }
        if (CommonUtils.isAndroid11()) {
            str = ResultCode.ERROR_TS_TIMEOUT;
        }
        customWebView.b(str);
    }

    private void showToolsBar() {
        try {
            CommonUtils.a(getWindow(), 0, !n1.a(getApplicationContext()));
            u4.b(this.mNetworkLayout, CommonUtils.h(this));
        } catch (Exception unused) {
            HwLog.e(TAG, "showToolsBar Exception");
        }
    }

    private void takePhoto(int i, Intent intent) {
        String str = TAG;
        HwLog.i(str, "onActivityResult takePhoto REQ_CODE_TAKE_PHOTO SDK_INT >= 21");
        if (this.mCustomWebView.h() == null) {
            HwLog.i(str, "onActivityResult takePhoto REQ_CODE_TAKE_PHOTO getUploadMessageForAndroid5 null");
            return;
        }
        if (i == 0) {
            HwLog.i(str, "onActivityResult takePhoto REQ_CODE_TAKE_PHOTO resultCode == 0");
            this.mCustomWebView.h().onReceiveValue(new Uri[0]);
            this.mCustomWebView.b((ValueCallback) null);
            return;
        }
        HwLog.i(str, "onActivityResult takePhoto other");
        Uri uriD = (intent == null || i != -1) ? this.mCustomWebView.d() : intent.getData();
        if (uriD != null) {
            HwLog.i(str, "onActivityResult takePhoto REQ_CODE_TAKE_PHOTO result != null");
            this.mCustomWebView.h().onReceiveValue(new Uri[]{uriD});
        } else {
            HwLog.i(str, "onActivityResult takePhoto REQ_CODE_TAKE_PHOTO result is null");
            this.mCustomWebView.h().onReceiveValue(new Uri[0]);
        }
        this.mCustomWebView.b((ValueCallback) null);
    }

    private void dealGreyUrl() {
        if (Environment.getApplicationContext() == null) {
            HwLog.i(TAG, " getApplicationContext  is null");
            return;
        }
        if (!HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea() && TextUtils.equals("CN", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode())) {
            if (HwWatchFaceApi.getInstance(this.mContext) != null && HwWatchFaceApi.getInstance(this.mContext).isBetaVersion()) {
                HwLog.i(TAG, "dealGreyUrl() current is beta app.");
                return;
            } else {
                this.mUrl = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getWatchfaceReleaseSite(this.mUrl);
                return;
            }
        }
        HwLog.i(TAG, "dealGreyUrl() isOversea.");
    }

    private void handleLoadPage(WebViewActivity webViewActivity) {
        HwLog.e(TAG, "init time handleLoadPage:" + (System.currentTimeMillis() - HwWatchFaceApi.getInstance(this.mContext).getInitTime()));
        if (CommonUtils.j(Environment.getApplicationContext()) && !HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
            webViewActivity.setContentView(R.layout.watchface_fragment_web_view_error_1);
            webViewActivity.initErrorView();
            return;
        }
        try {
            setContentView(R.layout.watchface_activity_common_web_view);
            webViewActivity.initIntentData();
            webViewActivity.initView();
        } catch (RuntimeException unused) {
            HwLog.e(TAG, "handleLoadPage() webview error.");
            finish();
        }
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

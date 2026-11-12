package com.huami.web.container;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.i;
import com.google.gson.Gson;
import com.huami.discovery.bridge.bracelet.BraceletCallback;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.bean.WebShareItem;
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
import com.xiaomi.hm.health.relation.ConstantKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BraceletAdapter implements BraceletCallback {
    private static final String e = "BraceletAdapter";
    private static final boolean f = true;
    private static final String g = "base64,";
    private BaseTitleActivity a;
    private String b;
    private String c;
    private WebShareItem d;

    public static class JSType {
        public Object value;

        private JSType() {
        }

        public String toString() {
            Object obj = this.value;
            return obj == null ? "null" : obj.toString();
        }

        public JSType(Object obj) {
            this.value = obj;
        }
    }

    public static class JSTypeNonString extends JSType {
        public JSTypeNonString() {
            super();
        }
    }

    public static class JSTypeObject extends JSTypeNonString {
        public JSTypeObject() {
            this.value = new HashMap();
        }

        public void put(String str, Object obj) {
            ((Map) this.value).put(str, obj);
        }

        @Override // com.huami.web.container.BraceletAdapter.JSType
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            Map map = (Map) this.value;
            if (map.size() > 0) {
                int i = 0;
                for (String str : map.keySet()) {
                    sb.append("\"");
                    sb.append(str);
                    sb.append("\":");
                    JSType jSTypeH = BraceletAdapter.h(map.get(str));
                    if (jSTypeH instanceof JSTypeNonString) {
                        sb.append(jSTypeH);
                    } else {
                        sb.append("\"");
                        sb.append(jSTypeH);
                        sb.append("\"");
                    }
                    i++;
                    if (i < map.size()) {
                        sb.append(",");
                    }
                }
            }
            sb.append(i.d);
            return sb.toString();
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BraceletAdapter.this.k();
        }
    }

    public class b implements FunctionActionListener {
        public final /* synthetic */ FunctionSheet a;

        public b(FunctionSheet functionSheet) {
            this.a = functionSheet;
        }

        @Override // com.huami.widget.share.ShareListener
        public void onFailed(int i, String str) {
            HMLog.e(BraceletAdapter.e, "onFailed:" + str, new Object[0]);
        }

        @Override // com.huami.widget.share.FunctionActionListener
        public void onFunctionItemClicked(FunctionItem functionItem) {
            HMLog.e(BraceletAdapter.e, "onFunctionItemClicked:" + functionItem.title, new Object[0]);
            if (functionItem.getFunctionType() == FunctionType.refresh) {
                BraceletAdapter.this.getWebView().reload();
            }
        }

        @Override // com.huami.widget.share.ShareListener
        public ShareContent onShareContentCreated(int i) {
            HMLog.e(BraceletAdapter.e, "onShareContentCreated:" + i, new Object[0]);
            return null;
        }

        @Override // com.huami.widget.share.ShareListener
        public void onStart(int i) {
            HMLog.e(BraceletAdapter.e, "onStart:" + i, new Object[0]);
            this.a.shareTo(BraceletAdapter.this.e(i));
        }

        @Override // com.huami.widget.share.ShareListener
        public void onSuccess(int i) {
            HMLog.e(BraceletAdapter.e, "onSuccess:" + i, new Object[0]);
        }
    }

    public class c implements ShareDialog.OnShareItemClickedListener {
        public final /* synthetic */ ShareDialog a;

        public c(ShareDialog shareDialog) {
            this.a = shareDialog;
        }

        @Override // com.huami.widget.share.ShareDialog.OnShareItemClickedListener
        public void onShareItemClicked(int i, boolean z) {
            if (z) {
                this.a.shareTo(BraceletAdapter.this.e(i), null);
            }
        }
    }

    public static class d extends JSTypeNonString {
        public d(boolean z) {
            this.value = Boolean.valueOf(z);
        }

        @Override // com.huami.web.container.BraceletAdapter.JSType
        public String toString() {
            Object obj = this.value;
            return obj == null ? "false" : String.valueOf(obj);
        }
    }

    public BraceletAdapter(BaseTitleActivity baseTitleActivity) {
        this.a = baseTitleActivity;
    }

    public static void callJS(WebView webView, String str, Object... objArr) {
        HMLog.e(e, "Call JS : " + str + ", Params : " + Arrays.toString(objArr), new Object[0]);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append(str);
            sb.append("(");
            if (objArr != null && objArr.length > 0) {
                int i = 0;
                for (Object obj : objArr) {
                    if (h(obj) instanceof JSTypeNonString) {
                        sb.append(obj);
                    } else {
                        sb.append("'");
                        sb.append(obj);
                        sb.append("'");
                    }
                    i++;
                    if (i < objArr.length) {
                        sb.append(",");
                    }
                }
            }
            sb.append(")");
            HMLog.e(e, "Call JS : " + sb.toString(), new Object[0]);
            webView.loadUrl(sb.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private Bitmap d(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e2) {
            HMLog.e(e, e2.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ShareContent e(int i) {
        ShareContent shareContentI = i(i);
        if (TextUtils.isEmpty(shareContentI.topic)) {
            shareContentI.topic = shareContentI.content;
        }
        try {
            JSTypeObject jSTypeObject = new JSTypeObject();
            jSTypeObject.put("name", f(i, this.d).getItemName());
            callJS(getWebView(), this.d.getCallback(), jSTypeObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return shareContentI;
    }

    private WebShareItem.ShareItem f(int i, WebShareItem webShareItem) {
        WebShareItem.ShareItem weChatShareItem;
        switch (i) {
            case 1:
                weChatShareItem = webShareItem.getShare().getWeChatShareItem();
                break;
            case 2:
                weChatShareItem = webShareItem.getShare().getMomentsShareItem();
                break;
            case 3:
            case 10:
            case 11:
            case 12:
                weChatShareItem = webShareItem.getShare().getMiTalkShareItem();
                break;
            case 4:
                weChatShareItem = webShareItem.getShare().getWeiboShareItem();
                break;
            case 5:
                weChatShareItem = webShareItem.getShare().getQzoneShareItem();
                break;
            case 6:
                weChatShareItem = webShareItem.getShare().getQqShareItem();
                break;
            case 7:
                weChatShareItem = webShareItem.getShare().getLineShareItem();
                break;
            case 8:
                weChatShareItem = webShareItem.getShare().getFacebookShareItem();
                break;
            case 9:
                weChatShareItem = webShareItem.getShare().getTwitterShareItem();
                break;
            default:
                weChatShareItem = webShareItem.getShare().getDefaultShareItem();
                break;
        }
        return weChatShareItem == null ? webShareItem.getShare().getDefaultShareItem() : weChatShareItem;
    }

    private boolean g(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("data:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSType h(Object obj) {
        if (obj instanceof JSType) {
            return (JSType) obj;
        }
        return obj instanceof Boolean ? new d(((Boolean) obj).booleanValue()) : new JSType(obj);
    }

    @NonNull
    private ShareContent i(int i) {
        WebView webView;
        ShareContent shareContent = new ShareContent();
        WebShareItem.ShareItem shareItemF = f(i, this.d);
        HMLog.e(e, "ShareItem: " + shareItemF, new Object[0]);
        shareContent.title = shareItemF.getTitle();
        shareContent.topic = shareItemF.getContent();
        shareContent.content = shareItemF.getContent();
        shareContent.url = shareItemF.getUrl();
        String strJ = j(this.a, shareItemF.getIcon());
        shareContent.bitmapUrl = strJ;
        if (TextUtils.isEmpty(strJ) && (webView = getWebView()) != null) {
            HMLog.e(e, "Capture View!!", new Object[0]);
            shareContent.bitmapUrl = UtilsKt.captureViewShare(webView, this.a);
        }
        HMLog.e(e, "onPreShareItem shareToUrl: " + shareContent.url + ", shareToBitmapUrl: " + shareContent.bitmapUrl, new Object[0]);
        if (TextUtils.isEmpty(shareContent.title)) {
            shareContent.title = shareItemF.getTitle();
            HMLog.e(e, "onPreShareItem no shareTitle so set title", new Object[0]);
        }
        if (TextUtils.isEmpty(shareContent.topic)) {
            shareContent.topic = shareContent.content;
        }
        return shareContent;
    }

    private String j(Context context, String str) {
        String str2 = null;
        if (g(str)) {
            HMLog.e(e, "Parse Icon Start!!", new Object[0]);
            int iIndexOf = str.indexOf(g);
            if (iIndexOf >= 0) {
                str = str.substring(iIndexOf + 7);
            }
            HMLog.e(e, "Parse Icon Data : " + str, new Object[0]);
            Bitmap bitmapD = d(str);
            String absolutePath = FileUtils.getShareImagePath(context).getAbsolutePath();
            str2 = UtilsKt.saveBitmapToFile(absolutePath, bitmapD, 100) ? absolutePath : null;
            if (bitmapD != null && !bitmapD.isRecycled()) {
                bitmapD.recycle();
            }
        }
        HMLog.e(e, "Parse Icon Bmp Path : " + str2, new Object[0]);
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        FunctionSheet functionSheetNewInstance = FunctionSheet.newInstance(true);
        functionSheetNewInstance.setFunctionListener(new b(functionSheetNewInstance));
        functionSheetNewInstance.show(this.a.getSupportFragmentManager(), "sheet");
    }

    private void l() {
        ShareDialog shareDialogNewInstance = ShareDialog.newInstance(new ShareConfig());
        shareDialogNewInstance.setOnShareItemClickedListener(new c(shareDialogNewInstance));
        shareDialogNewInstance.show(this.a.getSupportFragmentManager(), "share");
    }

    private void m(Intent intent) {
        intent.setFlags(268435456);
        this.a.startActivity(intent);
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void finishActivity() {
        HMLog.e(e, "finishActivity:", new Object[0]);
        H5Utils.finishActivity(this.a);
    }

    public abstract String getWebUrl();

    public abstract WebView getWebView();

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void handleBackAction(String str, String str2) {
        HMLog.e(e, "handleBackAction: url:" + str + ",action:" + str2, new Object[0]);
        this.b = str2;
        this.c = str;
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public boolean handleBackPressed(boolean z) {
        HMLog.e(e, "OnBackKey Action : " + this.b, new Object[0]);
        HMLog.e(e, "OnBackKey Action Custom mBackUrl: " + this.c, new Object[0]);
        if (BraceletHandler.H5_PARAM_BACK_KEY_RELOAD.equals(this.b)) {
            loadPage(getWebUrl());
            return true;
        }
        if (BraceletHandler.H5_PARAM_BACK_KEY_HISTORY.equals(this.b)) {
            if (z || !getWebView().canGoBack()) {
                return false;
            }
            getWebView().goBack();
            return true;
        }
        if ("exit".equals(this.b)) {
            finishActivity();
            return true;
        }
        if ("custom".equals(this.b)) {
            if (!TextUtils.isEmpty(this.c)) {
                loadPage(this.c);
                return true;
            }
        } else if (TextUtils.isEmpty(this.b)) {
            if (!TextUtils.isEmpty(this.c)) {
                loadPage(this.c);
                return true;
            }
            if (z) {
                return false;
            }
            finishActivity();
            return true;
        }
        return false;
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void handleInvokeAction(String str, String str2) {
        String packageName = this.a.getPackageName();
        if ("run".equalsIgnoreCase(str)) {
            WebExternalsKt.getWebInjectDelegate().startRunning();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(packageName, ConstantKt.MAINTABACTIVITY_CLASS_PATH));
            intent.setFlags(268435456);
            m(intent);
            return;
        }
        if ("alarmclock".equalsIgnoreCase(str)) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(packageName, "com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity"));
            intent2.setPackage(packageName);
            m(intent2);
            onCallJs(str2, new Object[0]);
            return;
        }
        if ("friends".equalsIgnoreCase(str)) {
            Intent intent3 = new Intent();
            intent3.setComponent(new ComponentName(packageName, "com.xiaomi.hm.health.relation.FriendActivity"));
            intent3.setPackage(packageName);
            m(intent3);
        }
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void handleLoginAction(int i, String str) {
        if (i == 12) {
            WebExternalsKt.getWebInjectDelegate().logoutByExpire();
            return;
        }
        if (i == 11) {
            finishActivity();
            WebExternalsKt.getWebInjectDelegate().mutex(Long.parseLong(str));
        } else if (i == 15) {
            WebExternalsKt.getWebInjectDelegate().dealWebActivityLoginInvalid(str);
        }
    }

    public abstract void loadPage(String str);

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void onCallJs(String str, Object... objArr) {
        HMLog.e(e, "onCallJs:", new Object[0]);
        callJS(getWebView(), str, objArr);
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void onShowFunction(String str, boolean z) {
        WebShareItem webShareItem = (WebShareItem) new Gson().fromJson(str, WebShareItem.class);
        if (webShareItem == null || webShareItem.getShare() == null) {
            return;
        }
        this.d = webShareItem;
        H5Utils.setFunctionButtonVisible(this.a, true, new a());
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void onWebShare(String str) {
        WebShareItem webShareItem = (WebShareItem) new Gson().fromJson(str, WebShareItem.class);
        if (webShareItem == null || webShareItem.getShare() == null) {
            HMLog.i(e, "onWebShare error!!", new Object[0]);
        } else {
            this.d = webShareItem;
            l();
        }
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void setSystemBarColor(int i) {
        H5Utils.setSystemBarColor(this.a, i);
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void setTitleBarBackgroundColor(int i) {
        HMLog.e(e, "setTitleBarBackgroundColor:" + i, new Object[0]);
        H5Utils.setTitleBarBackgroundColor(this.a, i);
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void setTitleBarVisible(boolean z) {
        HMLog.e(e, "setTitleBarVisible:" + z, new Object[0]);
        H5Utils.setTitleVisibility(this.a, z);
    }

    @Override // com.huami.discovery.bridge.bracelet.BraceletCallback
    public void setTitleText(String str) {
        HMLog.e(e, "setTitleText:" + str, new Object[0]);
        H5Utils.setTitleText(this.a, str);
    }
}

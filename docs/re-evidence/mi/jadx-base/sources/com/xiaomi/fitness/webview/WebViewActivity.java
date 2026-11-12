package com.xiaomi.fitness.webview;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.im9;
import defpackage.iqc;
import defpackage.jbr;
import defpackage.kad;
import defpackage.kki;
import defpackage.pe5;
import defpackage.poi;
import defpackage.pvi;
import defpackage.q1j;
import defpackage.ue5;
import defpackage.uv1;
import defpackage.x2j;
import defpackage.zc8;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 \u0097\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002\u0097\u0001B\b¢\u0006\u0005\b\u0096\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00062\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\bJ\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000203H\u0014¢\u0006\u0004\b8\u00106J)\u0010:\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b:\u0010\u0010J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0012H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\bF\u0010GJ#\u0010H\u001a\u00020\u00062\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016¢\u0006\u0004\bH\u0010\u001cJ#\u0010I\u001a\u00020\u00062\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016¢\u0006\u0004\bI\u0010\u001cJ-\u0010M\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0006H\u0016¢\u0006\u0004\bO\u0010\bJ\u000f\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bP\u0010\bJ\u000f\u0010Q\u001a\u00020\u0014H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0014¢\u0006\u0004\bS\u0010\bJ\u0017\u0010U\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u0014H\u0014¢\u0006\u0004\bU\u0010$J\u0017\u0010W\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0012H\u0016¢\u0006\u0004\bW\u0010DJ\u000f\u0010X\u001a\u00020\u0006H\u0016¢\u0006\u0004\bX\u0010\bJ\u000f\u0010Y\u001a\u00020\u0006H\u0014¢\u0006\u0004\bY\u0010\bJ\u000f\u0010Z\u001a\u00020\u0006H\u0014¢\u0006\u0004\bZ\u0010\bJ\u000f\u0010[\u001a\u00020\u0006H\u0016¢\u0006\u0004\b[\u0010\bJ\u000f\u0010\\\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\\\u0010\bJ\u000f\u0010]\u001a\u00020\u0006H\u0014¢\u0006\u0004\b]\u0010\bJ\u000f\u0010^\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\bJ\u0019\u0010`\u001a\u00020\u00062\b\u0010_\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b`\u0010>J\u000f\u0010a\u001a\u00020\u0006H\u0016¢\u0006\u0004\ba\u0010\bJ\u0017\u0010b\u001a\u00020\u00062\u0006\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\bb\u0010+R\u0018\u0010c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010s\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010DR\u0016\u0010x\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR$\u0010z\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bz\u0010t\u001a\u0004\b{\u0010v\"\u0004\b|\u0010DR\"\u0010}\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b}\u0010y\u001a\u0004\b}\u0010R\"\u0004\b~\u0010$R#\u0010\u007f\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010y\u001a\u0004\b\u007f\u0010R\"\u0005\b\u0080\u0001\u0010$R'\u0010\u0081\u0001\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010/\"\u0005\b\u0084\u0001\u0010AR&\u0010\u0085\u0001\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010y\u001a\u0005\b\u0085\u0001\u0010R\"\u0005\b\u0086\u0001\u0010$R0\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0087\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u008e\u0001\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010y\u001a\u0005\b\u008e\u0001\u0010R\"\u0005\b\u008f\u0001\u0010$R&\u0010\u0090\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010y\u001a\u0005\b\u0090\u0001\u0010R\"\u0005\b\u0091\u0001\u0010$R\u0016\u0010\u0093\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010/R\u0016\u0010\u0095\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010/¨\u0006\u0098\u0001"}, d2 = {"Lcom/xiaomi/fitness/webview/WebViewActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/webview/WebViewVM;", "Ljbr;", "Liqc;", "Landroid/view/View$OnClickListener;", "", "initTitleBar", "()V", "initTitle", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "intent", "onActivityResultAboveL", "(IILandroid/content/Intent;)V", "refreshTitleBarMatchStatusBar", "", "currentUrl", "", "isCurrentUrl", "(Ljava/lang/String;)Z", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "valueCallback", "openCameraWithPermission", "(Landroid/webkit/ValueCallback;)V", "createImageUri", "()Landroid/net/Uri;", "Ljava/io/File;", "createImageFile", "()Ljava/io/File;", "visible", "setTitleBarVisible", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "initDataFromIntent", "(Landroid/content/Intent;)V", "initWebView", "addJavascriptInterfaceCustom", "getStatusBarHeight", "()I", "Lkad;", "getJavaScriptInterface", "()Lkad;", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "view", "showBottomView", "data", "onActivityResult", "Landroid/content/res/Configuration;", q.f13857a, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "newProgress", "onProgressChanged", "(I)V", "title", "setWebTitle", "(Ljava/lang/String;)V", "isFullScreen", "onVideoScreenModeChanged", "(ZLandroid/view/View;)V", "openFileChooser", "openCamera", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "showNoNetView", "hideNoNetView", "isInValid", "()Z", "onLoadStart", "result", "onLoadFinish", "url", "loadUrl", "showServerErrorView", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onBackPressed", "onFinish", LifecycleConstantKt.ON_DESTROY, "popHistory", "overrideConfiguration", "applyOverrideConfiguration", "finishFromWeb", "finishForResult", "cameraUri", "Landroid/net/Uri;", "CAMERA_PERMISSIONS", "[Ljava/lang/String;", "Lcom/xiaomi/fitness/webview/CustomWebView;", "webView", "Lcom/xiaomi/fitness/webview/CustomWebView;", "getWebView", "()Lcom/xiaomi/fitness/webview/CustomWebView;", "setWebView", "(Lcom/xiaomi/fitness/webview/CustomWebView;)V", "uploadMessageAboveL", "Landroid/webkit/ValueCallback;", "Lue5;", "webViewClient", "Lue5;", "mTitle", "Ljava/lang/String;", "getMTitle", "()Ljava/lang/String;", "setMTitle", "collapseTitle", "Z", "mUrl", "getMUrl", "setMUrl", "isTitleBarShow", "setTitleBarShow", "isTitleBarMatchStatusBar", "setTitleBarMatchStatusBar", "mTitleBgRes", "I", "getMTitleBgRes", "setMTitleBgRes", "isProgressBarShow", "setProgressBarShow", "Ljava/util/Stack;", "urlSets", "Ljava/util/Stack;", "getUrlSets", "()Ljava/util/Stack;", "setUrlSets", "(Ljava/util/Stack;)V", "isAddUrlToUrlSet", "setAddUrlToUrlSet", "isLightStatusBar", "setLightStatusBar", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewActivity.kt\ncom/xiaomi/fitness/webview/WebViewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,600:1\n1#2:601\n37#3:602\n36#3,3:603\n*S KotlinDebug\n*F\n+ 1 WebViewActivity.kt\ncom/xiaomi/fitness/webview/WebViewActivity\n*L\n229#1:602\n229#1:603,3\n*E\n"})
public class WebViewActivity extends Hilt_WebViewActivity<WebViewVM, jbr> implements iqc, View.OnClickListener {

    @NotNull
    public static final String BACK_MAIN_TAB_KEY = "back_main_tab";

    @NotNull
    public static final String COLLAPSE_TITLE = "collapse_title";
    private static final int FILE_CHOOSER_RESULT_CODE = 10000;

    @NotNull
    public static final String IS_ADD_URL_TO_URL_SET = "is_add_url_url_set";

    @NotNull
    public static final String IS_FROM_SCHEMA = "is_from_schema";

    @NotNull
    public static final String IS_LIGHT_STATUS_BAR = "is_light_status_bar";
    private static final int REQUEST_CAMERA_PERMISSION = 30000;
    private static final int REQUEST_CAPTURE_CODE = 20000;

    @NotNull
    public static final String SHOW_PROGRESS_BAR = "is_show_progress_bar";

    @NotNull
    public static final String SHOW_SINGLE_TITLE_BAR = "is_single_title_bar_show";

    @NotNull
    public static final String SHOW_TITLE_BAR = "is_title_bar_show";

    @NotNull
    public static final String SHOW_TITLE_COLOR = "is_title_color_show";

    @NotNull
    public static final String TAG = "|WEBVIEW|";

    @NotNull
    public static final String TITLE = "Title";

    @NotNull
    public static final String TITLE_BAR_MATCH_STATUS_BAR = "is_title_bar_match_status_bar";

    @NotNull
    public static final String URL = "URL";

    @Nullable
    private Uri cameraUri;
    private boolean isTitleBarMatchStatusBar;
    private boolean isTitleBarShow;

    @Nullable
    private String mTitle;

    @Nullable
    private String mUrl;

    @Nullable
    private ValueCallback<Uri[]> uploadMessageAboveL;
    protected CustomWebView webView;

    @Nullable
    private ue5 webViewClient;

    @NotNull
    private final String[] CAMERA_PERMISSIONS = {"android.permission.CAMERA"};
    private boolean collapseTitle = true;
    private int mTitleBgRes = -1;
    private boolean isProgressBarShow = true;

    @NotNull
    private Stack<String> urlSets = new Stack<>();
    private boolean isAddUrlToUrlSet = true;
    private boolean isLightStatusBar = true;

    private final File createImageFile() {
        try {
            String str = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()) + ".jpg";
            File externalFilesDir = AppUtil.getApp().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            if (externalFilesDir != null && !externalFilesDir.exists()) {
                externalFilesDir.mkdir();
            }
            File file = new File(externalFilesDir, str);
            if (Intrinsics.areEqual("mounted", zc8.a(file))) {
                return file;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Uri createImageUri() {
        return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted") ? AppUtil.getApp().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new ContentValues()) : AppUtil.getApp().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, new ContentValues());
    }

    private final void initTitle() {
        if (!this.isTitleBarShow) {
            setTitleBarVisible(false);
            return;
        }
        setTitleBarVisible(true);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, this.mTitleBgRes == kki.f23951a ? poi.f30588b : poi.f30587a, getString(q1j.f30993b), new View.OnClickListener() { // from class: qbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.initTitle$lambda$0(this.f31349a, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$0(WebViewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    private final void initTitleBar() {
        int i = this.mTitleBgRes;
        if (i == kki.f23951a || i != kki.d) {
            setTitleBackground(i);
        }
        setTitleBarVisible(this.isTitleBarShow);
        if (!this.isTitleBarShow) {
            hideBack();
        }
        if (TextUtils.isEmpty(this.mTitle)) {
            return;
        }
        setTitle(this.mTitle);
    }

    private final boolean isCurrentUrl(String currentUrl) {
        if (this.urlSets.empty()) {
            return false;
        }
        String strPeek = this.urlSets.peek();
        Intrinsics.checkNotNull(strPeek);
        if (StringsKt__StringsJVMKt.endsWith$default(strPeek, "/", false, 2, null)) {
            Intrinsics.checkNotNull(strPeek);
            strPeek = strPeek.substring(0, strPeek.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strPeek, "substring(...)");
        }
        if (StringsKt__StringsJVMKt.endsWith$default(currentUrl, "/", false, 2, null)) {
            currentUrl = currentUrl.substring(0, currentUrl.length() - 1);
            Intrinsics.checkNotNullExpressionValue(currentUrl, "substring(...)");
        }
        if (!this.isAddUrlToUrlSet) {
            Intrinsics.checkNotNull(strPeek);
            strPeek = StringsKt__StringsKt.substringBefore$default(strPeek, "&_locale=", (String) null, 2, (Object) null);
            currentUrl = StringsKt__StringsKt.substringBefore$default(currentUrl, "&_locale=", (String) null, 2, (Object) null);
            Logger.i("|WEBVIEW|", "isAddUrlToUrlSet  " + Intrinsics.areEqual(strPeek, currentUrl));
        }
        return Intrinsics.areEqual(strPeek, currentUrl);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    @TargetApi(21)
    private final void onActivityResultAboveL(int requestCode, int resultCode, Intent intent) {
        Object[] objArr;
        Object[] array;
        if ((requestCode == 10000 || requestCode == 20000) && this.uploadMessageAboveL != null) {
            if (resultCode != -1) {
                objArr = null;
            } else if (requestCode == 20000) {
                Uri uri = this.cameraUri;
                if (uri != null) {
                    objArr = new Uri[]{uri};
                } else {
                    objArr = null;
                }
            } else if (intent != null) {
                String dataString = intent.getDataString();
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    ArrayList arrayList = new ArrayList();
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        ClipData.Item itemAt = clipData.getItemAt(i);
                        Intrinsics.checkNotNullExpressionValue(itemAt, "getItemAt(...)");
                        arrayList.add(itemAt.getUri());
                    }
                    array = arrayList.toArray(new Uri[0]);
                } else {
                    array = null;
                }
                objArr = dataString != null ? new Uri[]{Uri.parse(dataString)} : array;
            } else {
                objArr = null;
            }
            ValueCallback<Uri[]> valueCallback = this.uploadMessageAboveL;
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Uri[]) objArr);
            }
            this.uploadMessageAboveL = null;
        }
    }

    private final void openCameraWithPermission(ValueCallback<Uri[]> valueCallback) {
        Uri uriForFile;
        this.uploadMessageAboveL = valueCallback;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(AppUtil.getApp().getPackageManager()) != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                uriForFile = createImageUri();
            } else {
                File fileCreateImageFile = createImageFile();
                uriForFile = fileCreateImageFile != null ? FileProvider.getUriForFile(AppUtil.getApp(), im9.B(), fileCreateImageFile) : null;
            }
            Logger.d("photoUri = " + uriForFile, new Object[0]);
            this.cameraUri = uriForFile;
            if (uriForFile != null) {
                intent.putExtra("output", uriForFile);
                intent.addFlags(2);
                startActivityForResult(intent, 20000);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshTitleBarMatchStatusBar() {
        int statusBarHeight = RomUtils.isXiaomi() ? UIUtils.INSTANCE.getStatusBarHeight(this) : 0;
        if (!this.isTitleBarMatchStatusBar) {
            statusBarHeight = 0;
        }
        ((jbr) getMBinding()).B.setPadding(0, statusBarHeight, 0, 0);
    }

    private final void setTitleBarVisible(boolean visible) {
        setActionBarDisplayable(visible);
        if (!visible || this.collapseTitle) {
            setActionBarExpandState(0);
            setActionBarResizeable(false);
        } else {
            setActionBarExpandState(1);
            setActionBarResizeable(true);
        }
    }

    public void addJavascriptInterfaceCustom() {
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(@Nullable Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override // defpackage.iqc
    public void finishForResult(@NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setResult(-1, data);
        finish();
    }

    @Override // defpackage.iqc
    public void finishFromWeb() {
        finish();
    }

    @NotNull
    public kad getJavaScriptInterface() {
        return new kad(this, this);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pvi.d;
    }

    @Nullable
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getMTitleBgRes() {
        return this.mTitleBgRes;
    }

    @Nullable
    public final String getMUrl() {
        return this.mUrl;
    }

    public int getStatusBarHeight() {
        int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return Resources.getSystem().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @NotNull
    public final Stack<String> getUrlSets() {
        return this.urlSets;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return uv1.f36176a;
    }

    @NotNull
    public final CustomWebView getWebView() {
        CustomWebView customWebView = this.webView;
        if (customWebView != null) {
            return customWebView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    @Override // defpackage.iqc
    public void hideNoNetView() {
        showContent();
    }

    public void initDataFromIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.mTitle = intent.getStringExtra(TITLE);
        this.mUrl = intent.getStringExtra("URL");
        this.collapseTitle = intent.getBooleanExtra(COLLAPSE_TITLE, true);
        this.isTitleBarShow = intent.getBooleanExtra(SHOW_TITLE_BAR, true);
        this.isTitleBarMatchStatusBar = intent.getBooleanExtra(TITLE_BAR_MATCH_STATUS_BAR, false);
        this.mTitleBgRes = intent.getIntExtra(SHOW_TITLE_COLOR, kki.d);
        this.isProgressBarShow = intent.getBooleanExtra(SHOW_PROGRESS_BAR, true);
        this.isLightStatusBar = intent.getBooleanExtra(IS_LIGHT_STATUS_BAR, true);
        this.isAddUrlToUrlSet = intent.getBooleanExtra(IS_ADD_URL_TO_URL_SET, true);
    }

    public void initView() {
        initTitleBar();
        initWebView();
        String str = this.mUrl;
        Intrinsics.checkNotNull(str);
        loadUrl(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWebView() {
        setWebView(((jbr) getMBinding()).F);
        getWebView().setWebChromeClient(new pe5(new WeakReference(this)));
        this.webViewClient = new ue5(new WeakReference(this));
        CustomWebView webView = getWebView();
        ue5 ue5Var = this.webViewClient;
        Intrinsics.checkNotNull(ue5Var);
        webView.setWebViewClient(ue5Var);
        try {
            boolean zL = a.l(this.mUrl);
            Logger.i("|WEBVIEW|", "url = " + this.mUrl + ", safe = " + zL);
            String cookie = CookieManager.getInstance().getCookie(this.mUrl);
            StringBuilder sb = new StringBuilder();
            sb.append("initWebView: cookie=");
            sb.append(cookie);
            if (zL) {
                getWebView().addJavascriptInterface(getJavaScriptInterface(), "m2w");
            }
        } catch (URISyntaxException e) {
            Logger.i("|WEBVIEW|", "url is outer");
            e.printStackTrace();
        }
        addJavascriptInterfaceCustom();
        if (this.isTitleBarMatchStatusBar) {
            Logger.d("|WEBVIEW|", "status?.height is " + getStatusBarHeight());
            ((jbr) getMBinding()).B.setPadding(0, getStatusBarHeight(), 0, 0);
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, this.isLightStatusBar);
    }

    /* JADX INFO: renamed from: isAddUrlToUrlSet, reason: from getter */
    public final boolean getIsAddUrlToUrlSet() {
        return this.isAddUrlToUrlSet;
    }

    @Override // defpackage.iqc
    public boolean isInValid() {
        return isFinishing() || isDestroyed();
    }

    /* JADX INFO: renamed from: isLightStatusBar, reason: from getter */
    public final boolean getIsLightStatusBar() {
        return this.isLightStatusBar;
    }

    /* JADX INFO: renamed from: isProgressBarShow, reason: from getter */
    public final boolean getIsProgressBarShow() {
        return this.isProgressBarShow;
    }

    /* JADX INFO: renamed from: isTitleBarMatchStatusBar, reason: from getter */
    public final boolean getIsTitleBarMatchStatusBar() {
        return this.isTitleBarMatchStatusBar;
    }

    /* JADX INFO: renamed from: isTitleBarShow, reason: from getter */
    public final boolean getIsTitleBarShow() {
        return this.isTitleBarShow;
    }

    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt__StringsJVMKt.startsWith$default(url, "http://", false, 2, null)) {
            getWebView().loadUrl(url);
            return;
        }
        Logger.i("|WEBVIEW|", "loadUrl fail url " + url);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 10000) {
            if (requestCode != 20000) {
                return;
            }
            onActivityResultAboveL(requestCode, resultCode, data);
        } else {
            if (this.uploadMessageAboveL == null) {
                return;
            }
            onActivityResultAboveL(requestCode, resultCode, data);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (this.urlSets.empty()) {
            onFinish();
            Logger.d("|WEBVIEW|sets empty onBackPressed", new Object[0]);
            return;
        }
        getWebView().setTouchFlag(true);
        if (getWebView().c()) {
            Logger.d("|WEBVIEW|isLoading true", new Object[0]);
        } else {
            Logger.d("|WEBVIEW|isLoading false sets pop", new Object[0]);
            this.urlSets.pop();
        }
        if (this.urlSets.empty()) {
            onFinish();
            Logger.d("|WEBVIEW|sets empty onBackPressed", new Object[0]);
            return;
        }
        String strPop = this.urlSets.pop();
        Intrinsics.checkNotNullExpressionValue(strPop, "pop(...)");
        loadUrl(strPop);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s go back,urlSets.size:%d", Arrays.copyOf(new Object[]{"|WEBVIEW|", Integer.valueOf(this.urlSets.size())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.d(str, new Object[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onConfigurationChanged(config);
        int i = config.orientation;
        if (i == 1) {
            getWindow().clearFlags(1024);
            getWindow().addFlags(2048);
        } else if (i == 2) {
            getWindow().clearFlags(2048);
            getWindow().addFlags(1024);
        }
        String str = this.mUrl;
        if (str != null) {
            loadUrl(str);
        }
    }

    @Override // com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        initDataFromIntent(intent);
        if (this.isTitleBarShow && this.mTitleBgRes == kki.f23951a) {
            setTheme(x2j.f38616a);
        }
        try {
            WebView.enableSlowWholeDocumentDraw();
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        initView();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            getWebView().getSettings().setAlgorithmicDarkeningAllowed(true);
        } else if (i >= 29) {
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                getWebView().getSettings().setForceDark(2);
            } else {
                getWebView().getSettings().setForceDark(0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ue5 ue5Var = this.webViewClient;
        if (ue5Var != null) {
            Intrinsics.checkNotNull(ue5Var);
            ue5Var.destroy();
        }
        ((jbr) getMBinding()).D.removeAllViews();
        getWebView().f();
        super.onDestroy();
    }

    public void onFinish() {
        super.lambda$onCreate$0();
    }

    public void onLoadFinish(boolean result) {
        if (!getWebView().getSettings().getLoadsImagesAutomatically()) {
            getWebView().getSettings().setLoadsImagesAutomatically(true);
        }
        showContent();
        Logger.i("|WEBVIEW|", " onLoadFinish:" + result);
    }

    public void onLoadStart() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getWebView().onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onProgressChanged(int newProgress) {
        if (newProgress < 100) {
            if (!getWebView().c() && getWebView().d()) {
                getWebView().setIsLoading(true);
                onLoadStart();
            }
            if (this.isProgressBarShow) {
                if (((jbr) getMBinding()).E.getVisibility() != 0) {
                    ((jbr) getMBinding()).E.setVisibility(0);
                }
                ((jbr) getMBinding()).E.setProgress(newProgress);
                return;
            }
            return;
        }
        String url = getWebView().getUrl();
        if (url != null) {
            if (getWebView().d()) {
                Logger.d("|WEBVIEW|currentUrl:" + url, new Object[0]);
                if (!isCurrentUrl(url)) {
                    getWebView().setTouchFlag(false);
                    this.urlSets.push(url);
                }
                ue5 ue5Var = this.webViewClient;
                Intrinsics.checkNotNull(ue5Var);
                onLoadFinish(ue5Var.onLoadFinish());
            } else {
                if (!this.urlSets.empty()) {
                    this.urlSets.pop();
                }
                this.urlSets.push(url);
                Logger.d("|WEBVIEW|re currentUrl:" + url, new Object[0]);
            }
        }
        getWebView().setIsLoading(false);
        ((jbr) getMBinding()).E.setVisibility(8);
        initTitle();
        refreshTitleBarMatchStatusBar();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
        if (!permissionsUtil.onRequestPermissionsResult(requestCode, grantResults)) {
            PermissionsUtil.showSettingDialog$default(permissionsUtil, this, permissions[0], false, null, 8, null);
        } else if (30000 == requestCode) {
            openCameraWithPermission(this.uploadMessageAboveL);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWebView().onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iqc
    public void onVideoScreenModeChanged(boolean isFullScreen, @Nullable View view) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (!isFullScreen) {
            setRequestedOrientation(-1);
            getWebView().setVisibility(0);
            ((jbr) getMBinding()).D.setVisibility(8);
            ((jbr) getMBinding()).D.removeAllViews();
            FrameLayout bottomContainer = ((jbr) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(bottomContainer, "bottomContainer");
            ViewExtKt.visible(bottomContainer);
            setActionBarDisplayable(true);
            return;
        }
        ((jbr) getMBinding()).D.removeAllViews();
        setRequestedOrientation(0);
        getWebView().setVisibility(8);
        ((jbr) getMBinding()).D.setVisibility(0);
        ((jbr) getMBinding()).D.addView(view);
        FrameLayout bottomContainer2 = ((jbr) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(bottomContainer2, "bottomContainer");
        ViewExtKt.gone(bottomContainer2);
        setActionBarDisplayable(false);
    }

    @Override // defpackage.iqc
    public void openCamera(@NotNull ValueCallback<Uri[]> valueCallback) {
        Intrinsics.checkNotNullParameter(valueCallback, "valueCallback");
        this.uploadMessageAboveL = valueCallback;
        if (PermissionsUtil.shouldRequestPermission(this.CAMERA_PERMISSIONS)) {
            PermissionsUtil.INSTANCE.requestPermissions(this, this.CAMERA_PERMISSIONS, 30000);
        } else {
            openCameraWithPermission(valueCallback);
        }
    }

    @Override // defpackage.iqc
    public void openFileChooser(@NotNull ValueCallback<Uri[]> valueCallback) {
        Intrinsics.checkNotNullParameter(valueCallback, "valueCallback");
        this.uploadMessageAboveL = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 10000);
    }

    @Override // defpackage.iqc
    public void popHistory() {
        if (this.urlSets.empty()) {
            return;
        }
        Logger.d("|WEBVIEW|redirect pop url:" + this.urlSets.pop(), new Object[0]);
    }

    public final void setAddUrlToUrlSet(boolean z) {
        this.isAddUrlToUrlSet = z;
    }

    public final void setLightStatusBar(boolean z) {
        this.isLightStatusBar = z;
    }

    public final void setMTitle(@Nullable String str) {
        this.mTitle = str;
    }

    public final void setMTitleBgRes(int i) {
        this.mTitleBgRes = i;
    }

    public final void setMUrl(@Nullable String str) {
        this.mUrl = str;
    }

    public final void setProgressBarShow(boolean z) {
        this.isProgressBarShow = z;
    }

    public final void setTitleBarMatchStatusBar(boolean z) {
        this.isTitleBarMatchStatusBar = z;
    }

    public final void setTitleBarShow(boolean z) {
        this.isTitleBarShow = z;
    }

    public final void setUrlSets(@NotNull Stack<String> stack) {
        Intrinsics.checkNotNullParameter(stack, "<set-?>");
        this.urlSets = stack;
    }

    @Override // defpackage.iqc
    public void setWebTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (!this.isTitleBarShow || !TextUtils.isEmpty(this.mTitle) || StringsKt__StringsKt.contains$default((CharSequence) title, (CharSequence) "http", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) title, (CharSequence) "watch.iot", false, 2, (Object) null)) {
            return;
        }
        setTitle(title);
    }

    public final void setWebView(@NotNull CustomWebView customWebView) {
        Intrinsics.checkNotNullParameter(customWebView, "<set-?>");
        this.webView = customWebView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showBottomView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (((jbr) getMBinding()).A.getChildCount() == 0) {
            ((jbr) getMBinding()).A.addView(view);
        }
        ((jbr) getMBinding()).A.setVisibility(0);
    }

    @Override // defpackage.iqc
    public void showNoNetView() {
        showNoNetwork();
    }

    public void showServerErrorView() {
        setTitleBarVisible(true);
    }
}

package com.xiaomi.fitness.webview.healthwebview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.service.OnMedalWallPageShareMethodListener;
import com.xiaomi.fitness.webview.CustomWebView;
import com.xiaomi.fitness.webview.OptionButton;
import com.xiaomi.fitness.webview.OptionMenu;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.a;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.jsi;
import defpackage.kad;
import defpackage.kki;
import defpackage.kq2;
import defpackage.lxb;
import defpackage.poi;
import defpackage.pvi;
import defpackage.q1j;
import defpackage.v84;
import defpackage.x2j;
import defpackage.ysc;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b^\u0010\u001cJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001e\u0010\u001cJ\u0019\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J-\u0010+\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b5\u0010\u0016J\u0019\u00107\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u0010\u000bJ\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010\u001cJ\u0017\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u001aR\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010@R\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@R$\u0010I\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010\u000bR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D¨\u0006_"}, d2 = {"Lcom/xiaomi/fitness/webview/healthwebview/HealthWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "Lysc;", "", "shareMethod", "", "oneTrackMedalWallShareMethod", "(I)V", "", "url", "initShowShare", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "showRightIcon", "(Landroid/graphics/Bitmap;)V", "showRightIcon2", "iconRes", "showRightDrawable2", "Lcom/xiaomi/fitness/webview/OptionButton$MenuItem;", "menuItem", "showShareButton", "(Lcom/xiaomi/fitness/webview/OptionButton$MenuItem;)V", "", "isTransparent", "setTitleTransparent", "(Z)V", "setWebViewTopMargin", "()V", "onOptionButtonClick", LifecycleConstantKt.ON_DESTROY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkad;", "getJavaScriptInterface", "()Lkad;", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/xiaomi/fitness/webview/OptionMenu;", "menuJson", "showPopMenu", "(Lcom/xiaomi/fitness/webview/OptionMenu;)V", "Lcom/xiaomi/fitness/webview/OptionButton;", "optionButton", "showOptionButton", "(Lcom/xiaomi/fitness/webview/OptionButton;)V", "triggerShare", "type", "showTitleBar", "loadUrl", "onFinish", "result", "onFeedbackResult", "Lcom/xiaomi/fitness/webview/a;", "webViewBusinessHelper", "Lcom/xiaomi/fitness/webview/a;", "isNeedShowShare", "Z", "OPTION_SHARE_TYPE", "Ljava/lang/String;", "getOPTION_SHARE_TYPE", "()Ljava/lang/String;", "IS_FROM_SCHEMA", "getIS_FROM_SCHEMA", "isFromSchema", "isSingleTitleBar", "native_header", "getNative_header", "setNative_header", "Landroid/widget/ImageView;", "mSharedView", "Landroid/widget/ImageView;", "mHistoryView", "Landroid/widget/LinearLayout;", "mViewGroap", "Landroid/widget/LinearLayout;", "", "startTime", "J", "endTime", "shareMenuItem", "Lcom/xiaomi/fitness/webview/OptionButton$MenuItem;", "", "shareConfigMap", "Ljava/util/Map;", "BACK_MAIN_TAB_KEY", "getBACK_MAIN_TAB_KEY", "<init>", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthWebViewActivity.kt\ncom/xiaomi/fitness/webview/healthwebview/HealthWebViewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1#2:409\n*E\n"})
public final class HealthWebViewActivity extends Hilt_HealthWebViewActivity implements ysc {
    private long endTime;
    private boolean isFromSchema;
    private boolean isNeedShowShare;
    private boolean isSingleTitleBar;

    @Nullable
    private ImageView mHistoryView;

    @Nullable
    private ImageView mSharedView;

    @Nullable
    private LinearLayout mViewGroap;

    @Nullable
    private String native_header;

    @Nullable
    private OptionButton.MenuItem shareMenuItem;
    private long startTime;

    @Nullable
    private a webViewBusinessHelper;

    @NotNull
    private final String OPTION_SHARE_TYPE = "share";

    @NotNull
    private final String IS_FROM_SCHEMA = WebViewActivity.IS_FROM_SCHEMA;

    @NotNull
    private final Map<String, OptionButton> shareConfigMap = new LinkedHashMap();

    @NotNull
    private final String BACK_MAIN_TAB_KEY = WebViewActivity.BACK_MAIN_TAB_KEY;

    private final void initShowShare(String url) {
        String queryParameter;
        Uri uri = Uri.parse(url);
        if (uri == null || (queryParameter = uri.getQueryParameter("share")) == null || !Intrinsics.areEqual(queryParameter, DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            this.isNeedShowShare = false;
        } else {
            this.isNeedShowShare = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(HealthWebViewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.shareMenuItem == null) {
            Logger.e("|WEBVIEW|", "share click item null");
            return;
        }
        a aVar = this$0.webViewBusinessHelper;
        Intrinsics.checkNotNull(aVar);
        CustomWebView webView = this$0.getWebView();
        OptionButton.MenuItem menuItem = this$0.shareMenuItem;
        Intrinsics.checkNotNull(menuItem);
        aVar.q(webView, menuItem.isShareTypeScreenShot(), 0.0f, 100.0f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(HealthWebViewActivity this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.mHistoryView;
        Object tag = imageView != null ? imageView.getTag() : null;
        if (tag == null) {
            return;
        }
        if (tag instanceof OptionButton.MenuItem) {
            this$0.onOptionButtonClick((OptionButton.MenuItem) tag);
            return;
        }
        ImageView imageView2 = this$0.mHistoryView;
        List<OptionMenu.MenuItem> list = (List) (imageView2 != null ? imageView2.getTag() : null);
        if (list != null) {
            a aVar = this$0.webViewBusinessHelper;
            Intrinsics.checkNotNull(aVar);
            aVar.F(view, list);
        }
    }

    private final void onOptionButtonClick(OptionButton.MenuItem menuItem) {
        if (menuItem.isDisabled()) {
            return;
        }
        if (menuItem.getType().equals(this.OPTION_SHARE_TYPE)) {
            a aVar = this.webViewBusinessHelper;
            Intrinsics.checkNotNull(aVar);
            aVar.n(menuItem.index, menuItem.isShareTypeScreenShot(), true);
        } else {
            getWebView().setTouchFlag(true);
            a aVar2 = this.webViewBusinessHelper;
            Intrinsics.checkNotNull(aVar2);
            aVar2.p(menuItem.index);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oneTrackMedalWallShareMethod(int shareMethod) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(TuplesKt.to("name", "share_medal_wall"), TuplesKt.to("method", MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getShareMethodString(shareMethod)), TuplesKt.to("device_model", wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null), TuplesKt.to("tip", "56.16.1.1.22920")));
    }

    private final void setTitleTransparent(boolean isTransparent) {
    }

    private final void setWebViewTopMargin() {
        v84.i(getWebView(), 0, v84.e(this), 0, 0);
    }

    private final void showRightDrawable2(int iconRes) {
        ImageView imageView = this.mHistoryView;
        if (imageView != null) {
            imageView.setImageDrawable(getDrawable(iconRes));
        }
        ImageView imageView2 = this.mHistoryView;
        if (imageView2 != null) {
            imageView2.invalidate();
        }
        ImageView imageView3 = this.mHistoryView;
        if (imageView3 != null) {
            imageView3.setContentDescription(getString(q1j.h));
        }
        ImageView imageView4 = this.mHistoryView;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    private final void showRightIcon(Bitmap bitmap) {
        ImageView imageView = this.mSharedView;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        ImageView imageView2 = this.mSharedView;
        if (imageView2 != null) {
            imageView2.setPadding(0, 0, ExtUtilsKt.getDp(Float.valueOf(26.0f)), 0);
        }
        ImageView imageView3 = this.mSharedView;
        if (imageView3 != null) {
            imageView3.setContentDescription(getString(q1j.j));
        }
        ImageView imageView4 = this.mSharedView;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    private final void showRightIcon2(Bitmap bitmap) {
        ImageView imageView = this.mHistoryView;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        ImageView imageView2 = this.mHistoryView;
        if (imageView2 != null) {
            imageView2.setContentDescription(getString(q1j.h));
        }
        ImageView imageView3 = this.mHistoryView;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
    }

    private final void showShareButton(OptionButton.MenuItem menuItem) {
        int i;
        Logger.i("|WEBVIEW|", "showShareButton " + menuItem);
        this.shareMenuItem = menuItem;
        Intrinsics.checkNotNull(menuItem);
        int i2 = menuItem.isDisabled() ? poi.e : poi.f;
        ImageView imageView = this.mHistoryView;
        if ((imageView != null ? imageView.getTag() : null) != null) {
            ImageView imageView2 = this.mHistoryView;
            if (imageView2 != null) {
                imageView2.setImageDrawable(getDrawable(i2));
            }
            ImageView imageView3 = this.mHistoryView;
            if (imageView3 != null) {
                imageView3.setContentDescription(getString(q1j.h));
            }
            ImageView imageView4 = this.mHistoryView;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.mHistoryView;
            if (imageView5 != null) {
                imageView5.setTag(menuItem);
                return;
            }
            return;
        }
        if (!this.isSingleTitleBar) {
            ImageView imageView6 = this.mSharedView;
            if (imageView6 != null) {
                imageView6.setImageDrawable(getDrawable(i2));
            }
            ImageView imageView7 = this.mSharedView;
            if (imageView7 != null) {
                imageView7.setContentDescription(getString(q1j.j));
            }
            ImageView imageView8 = this.mSharedView;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
            }
            ImageView imageView9 = this.mSharedView;
            if (imageView9 != null) {
                imageView9.setTag(menuItem);
                return;
            }
            return;
        }
        if (menuItem.isDisabled()) {
            i = poi.e;
        } else {
            i = getIsLightStatusBar() ? poi.f : poi.g;
        }
        ImageView imageView10 = this.mHistoryView;
        if (imageView10 != null) {
            imageView10.setVisibility(8);
        }
        ImageView imageView11 = this.mSharedView;
        if (imageView11 != null) {
            imageView11.setImageDrawable(getDrawable(i));
        }
        ImageView imageView12 = this.mSharedView;
        if (imageView12 != null) {
            imageView12.invalidate();
        }
        ImageView imageView13 = this.mSharedView;
        if (imageView13 != null) {
            imageView13.setVisibility(0);
        }
        ImageView imageView14 = this.mSharedView;
        if (imageView14 != null) {
            imageView14.setContentDescription(getString(q1j.j));
        }
        ImageView imageView15 = this.mSharedView;
        if (imageView15 != null) {
            imageView15.setTag(menuItem);
        }
    }

    @NotNull
    public final String getBACK_MAIN_TAB_KEY() {
        return this.BACK_MAIN_TAB_KEY;
    }

    @NotNull
    public final String getIS_FROM_SCHEMA() {
        return this.IS_FROM_SCHEMA;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    @NotNull
    public kad getJavaScriptInterface() {
        return new lxb(this, this, this);
    }

    @Nullable
    public final String getNative_header() {
        return this.native_header;
    }

    @NotNull
    public final String getOPTION_SHARE_TYPE() {
        return this.OPTION_SHARE_TYPE;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, defpackage.iqc
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        OptionButton optionButton = this.shareConfigMap.get(url);
        if (optionButton != null) {
            showOptionButton(optionButton);
            Logger.i("|WEBVIEW|", "loadUrl update optionButton");
            return;
        }
        ImageView imageView = this.mHistoryView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.mSharedView;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.startTime = System.currentTimeMillis();
        int intExtra = getIntent().getIntExtra(WebViewActivity.SHOW_TITLE_COLOR, kki.c);
        if (intExtra == kki.f23951a) {
            setTheme(x2j.f38616a);
        }
        super.onCreate(savedInstanceState);
        final View viewInflate = LayoutInflater.from(this).inflate(pvi.e, (ViewGroup) null);
        this.mSharedView = (ImageView) viewInflate.findViewById(jsi.f);
        this.mHistoryView = (ImageView) viewInflate.findViewById(jsi.c);
        this.mViewGroap = (LinearLayout) viewInflate.findViewById(jsi.g);
        Intrinsics.checkNotNull(viewInflate);
        setEndView(viewInflate);
        if (intExtra == kki.f23951a) {
            setTitleBackground(intExtra);
            viewInflate.setBackground(getDrawable(kki.f23951a));
            UIUtils.INSTANCE.setNavigationBarColor(this, kki.f23951a);
        } else {
            setTitleBackground(kki.c);
        }
        this.isFromSchema = getIntent().getBooleanExtra(this.IS_FROM_SCHEMA, false);
        this.isSingleTitleBar = getIntent().getBooleanExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, false);
        String mUrl = getMUrl();
        if (mUrl != null) {
            initShowShare(mUrl);
        }
        a aVar = new a(new WeakReference(this), new WeakReference(getWebView()));
        this.webViewBusinessHelper = aVar;
        aVar.setOnMedalWallPageShareMethodListener(new OnMedalWallPageShareMethodListener() { // from class: com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity.onCreate.2
            @Override // com.xiaomi.fitness.service.OnMedalWallPageShareMethodListener
            public void onShareMethodClicked(int shareMethod) {
                HealthWebViewActivity.this.oneTrackMedalWallShareMethod(shareMethod);
            }
        });
        String strS = a.s(getMUrl(), "native_header");
        this.native_header = strS;
        if (!TextUtils.isEmpty(strS)) {
            showTitleBar(this.native_header);
        }
        ImageView imageView = this.mSharedView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: r3c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthWebViewActivity.onCreate$lambda$1(this.f32138a, view);
                }
            });
        }
        ImageView imageView2 = this.mHistoryView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: s3c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthWebViewActivity.onCreate$lambda$2(this.f33240a, viewInflate, view);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.endTime = jCurrentTimeMillis;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - this.startTime);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "medal_wall_page"), TuplesKt.to("duration_sec", Long.valueOf(seconds)), TuplesKt.to("device_model", wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null), TuplesKt.to("tip", "56.16.1.1.22921")));
    }

    @Override // defpackage.ysc
    public /* bridge */ /* synthetic */ void onFeedbackResult(Boolean bool) {
        onFeedbackResult(bool.booleanValue());
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void onFinish() {
        if (this.isFromSchema) {
            MainExtKt.showMainActivity$default(this, null, null, 6, null);
        } else {
            super.onFinish();
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1000) {
            PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
            if (permissionsUtil.onRequestPermissionsResult(requestCode, grantResults)) {
                return;
            }
            permissionsUtil.doOnSelectNoMoreReminder(this, requestCode, permissions, grantResults, false);
        }
    }

    public final void setNative_header(@Nullable String str) {
        this.native_header = str;
    }

    @Override // defpackage.ysc
    public void showOptionButton(@NotNull OptionButton optionButton) {
        Intrinsics.checkNotNullParameter(optionButton, "optionButton");
        Logger.i("|WEBVIEW|", "showOptionButton " + optionButton);
        String mUrl = getMUrl();
        if (mUrl != null) {
            this.shareConfigMap.put(mUrl, optionButton);
        }
        List<OptionButton.MenuItem> items = optionButton.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        if (items.size() == 0) {
            ImageView imageView = this.mHistoryView;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.mSharedView;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.mHistoryView;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.mHistoryView;
        if (imageView4 != null) {
            imageView4.setTag(null);
        }
        ImageView imageView5 = this.mHistoryView;
        if ((imageView5 != null ? imageView5.getTag() : null) instanceof OptionButton.MenuItem) {
            ImageView imageView6 = this.mSharedView;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            ImageView imageView7 = this.mSharedView;
            if (imageView7 != null) {
                imageView7.setTag(null);
            }
        }
        int size = items.size();
        for (int i = 0; i < size; i++) {
            OptionButton.MenuItem menuItem = items.get(i);
            if (menuItem != null && menuItem.getType() != null) {
                menuItem.index = i;
                if (menuItem.isDisabled()) {
                    return;
                }
                if (menuItem.getType().equals(this.OPTION_SHARE_TYPE)) {
                    showShareButton(menuItem);
                } else {
                    Bitmap bitmapA = kq2.a(menuItem.getIcon(), DisplayUtil.INSTANCE.getScreenDensity(this) / 3.0f);
                    Intrinsics.checkNotNullExpressionValue(bitmapA, "base64ToBitmap(...)");
                    int i2 = getResources().getConfiguration().uiMode & 48;
                    if (i == 0) {
                        ImageView imageView8 = this.mSharedView;
                        if ((imageView8 != null ? imageView8.getTag() : null) != null) {
                            showRightIcon2(bitmapA);
                            ImageView imageView9 = this.mHistoryView;
                            if (imageView9 != null) {
                                imageView9.setTag(menuItem);
                            }
                        } else {
                            showRightIcon(bitmapA);
                            ImageView imageView10 = this.mSharedView;
                            if (imageView10 != null) {
                                imageView10.setTag(menuItem);
                            }
                        }
                    } else {
                        if (i2 == 32) {
                            showRightDrawable2(poi.c);
                        } else {
                            showRightIcon2(bitmapA);
                        }
                        ImageView imageView11 = this.mHistoryView;
                        if (imageView11 != null) {
                            imageView11.setTag(menuItem);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ysc
    public void showPopMenu(@NotNull OptionMenu menuJson) {
        Intrinsics.checkNotNullParameter(menuJson, "menuJson");
    }

    @Override // defpackage.ysc
    public void showTitleBar(@Nullable String type) {
        if (TextUtils.isEmpty(type) || type == null) {
            return;
        }
        int iHashCode = type.hashCode();
        if (iHashCode == -1726194350) {
            if (type.equals("transparent")) {
                setTitleBarShow(true);
                ImageView imageView = this.mSharedView;
                if (imageView != null) {
                    imageView.setContentDescription(getString(q1j.j));
                }
                ImageView imageView2 = this.mSharedView;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                v84.i(getWebView(), 0, 0, 0, 0);
                setTitleTransparent(true);
                return;
            }
            return;
        }
        if (iHashCode == 3387192) {
            if (type.equals("none")) {
                setTitleBarShow(false);
                ImageView imageView3 = this.mSharedView;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                setWebViewTopMargin();
                setTitleTransparent(false);
                return;
            }
            return;
        }
        if (iHashCode == 93832333 && type.equals("block")) {
            setTitleBarShow(true);
            ImageView imageView4 = this.mSharedView;
            if (imageView4 != null) {
                imageView4.setContentDescription(getString(q1j.j));
            }
            ImageView imageView5 = this.mSharedView;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
            }
            v84.i(getWebView(), 0, 0, 0, 0);
            setTitleTransparent(false);
        }
    }

    @Override // defpackage.ysc
    public void triggerShare(@Nullable OptionButton.MenuItem menuItem) {
        a aVar = this.webViewBusinessHelper;
        Intrinsics.checkNotNull(aVar);
        CustomWebView webView = getWebView();
        Intrinsics.checkNotNull(menuItem);
        aVar.q(webView, menuItem.isShareTypeScreenShot(), menuItem.getStartPercent(), menuItem.getEndPercent(), menuItem.isCancelable());
    }

    public void onFeedbackResult(boolean result) {
        Intent intent = new Intent();
        intent.putExtra("result", result);
        Logger.d("|WEBVIEW|", "result IS " + result);
        setResult(100, intent);
        finish();
    }
}

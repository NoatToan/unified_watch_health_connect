package com.xiaomi.fitness.about;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.about.AboutActivity;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.about.preference.SettingPreference;
import com.xiaomi.fitness.about.utils.AboutUrlsKt;
import com.xiaomi.fitness.about.widget.AboutUtil;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ComponentState;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.keep_alive.BootCompletedReceiver;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.webview.hyperlink.CommonTextLinkUtil;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.av6;
import defpackage.cni;
import defpackage.im9;
import defpackage.lzi;
import defpackage.my;
import defpackage.owk;
import defpackage.uqi;
import defpackage.vv1;
import defpackage.xii;
import defpackage.yti;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bE\u0010\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\rR\u001a\u0010%\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010(\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00101\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u001c\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u001c\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00107\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u0010+R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010&R\u001a\u0010?\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010#R\u0014\u0010B\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010#R\u0014\u0010D\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010#¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/about/AboutActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/about/AboutViewModel;", "Lmy;", "", "showCnPrivacyEnable", "()Z", "", "state", "", "showPrivacyDialog", "(I)V", "showDialog", "()V", "moveLogToDownload", "showRevokeDialog", "startCountDownTimer", "stopCountDownTimer", "", "identifyToken", "showConfirmRevokeDialog", "(Ljava/lang/String;)V", "isGpsLimitCountry", "oneTrackSettingsAboutReview", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lmy;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "layout", "initView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "getCurDeviceNums", "()I", "onBackPressed", "PRIVACY_STATE_NEED_UNBIND_ALL_DEVICE", "I", "getPRIVACY_STATE_NEED_UNBIND_ALL_DEVICE", "PRIVACY_STATE_RISK_ENSURE", "getPRIVACY_STATE_RISK_ENSURE", "TAG", "Ljava/lang/String;", "testCount", "", "testLastTime", "J", "devModeClickCount", "devModeClickLastTime", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mRevokeDialog", "mRevokeConfirmDialog", "startTime", "Landroid/widget/TextView;", "positiveButton", "Landroid/widget/TextView;", "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "VERIFY_FAILURE_CODE", "LOG_OFF_REQUEST_CODE", "getLOG_OFF_REQUEST_CODE", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAboutActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutActivity.kt\ncom/xiaomi/fitness/about/AboutActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,551:1\n54#2,3:552\n24#2:555\n57#2,6:556\n63#2,2:563\n57#3:562\n*S KotlinDebug\n*F\n+ 1 AboutActivity.kt\ncom/xiaomi/fitness/about/AboutActivity\n*L\n104#1:552,3\n104#1:555\n104#1:556,6\n104#1:563,2\n104#1:562\n*E\n"})
public final class AboutActivity extends Hilt_AboutActivity<AboutViewModel, my> {

    @Nullable
    private CountDownTimer countDownTimer;
    private int devModeClickCount;
    private long devModeClickLastTime;

    @Nullable
    private CommonDialog<?> mDialog;

    @Nullable
    private CommonDialog<?> mRevokeConfirmDialog;

    @Nullable
    private CommonDialog<?> mRevokeDialog;

    @Nullable
    private TextView positiveButton;
    private int testCount;
    private long testLastTime;
    private final int PRIVACY_STATE_NEED_UNBIND_ALL_DEVICE = 1;
    private final int PRIVACY_STATE_RISK_ENSURE = 2;

    @NotNull
    private final String TAG = "AboutActivity";

    @NotNull
    private final String startTime = "(10s)";
    private final int VERIFY_FAILURE_CODE = -4005001;
    private final int LOG_OFF_REQUEST_CODE = 1;

    /* JADX INFO: renamed from: com.xiaomi.fitness.about.AboutActivity$showConfirmRevokeDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/xiaomi/fitness/about/AboutActivity$showConfirmRevokeDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "", "isChecked", "onDialogMultiClick", "(Ljava/lang/String;IZ)V", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        final /* synthetic */ String $identifyToken;

        public AnonymousClass1(String str) {
            this.$identifyToken = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            Intrinsics.checkNotNullParameter(dialogName, "dialogName");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                AboutActivity.access$getMViewModel(AboutActivity.this).logOff(AboutActivity.this, this.$identifyToken, new Function1() { // from class: ky
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AboutActivity.AnonymousClass1.onDialogClick$lambda$0(((Boolean) obj).booleanValue());
                    }
                }, new Function1() { // from class: ly
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AboutActivity.AnonymousClass1.onDialogClick$lambda$1((ApiException) obj);
                    }
                });
            }
        }

        @Override // defpackage.av6
        public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
            Intrinsics.checkNotNullParameter(dialogName, "dialogName");
            super.onDialogMultiClick(dialogName, which, isChecked);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AboutViewModel access$getMViewModel(AboutActivity aboutActivity) {
        return (AboutViewModel) aboutActivity.getMViewModel();
    }

    private final boolean isGpsLimitCountry() {
        RegionManager.Companion companion = RegionManager.INSTANCE;
        return StringsKt__StringsJVMKt.contentEquals(RegionExtKt.getInstance(companion).getCurrentRegion(), "sg", true) && StringsKt__StringsJVMKt.contentEquals(RegionExtKt.getInstance(companion).getLocalCountry(), ServerConstants.NEW_KR_COUNTRY_CODE, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveLogToDownload() {
        im9.Q();
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        ToastExtKt.toastShort(application, "log has been transferred to：Download/wearablelog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.devModeClickLastTime >= 5000) {
            this$0.devModeClickCount = 0;
            this$0.devModeClickLastTime = System.currentTimeMillis();
            return;
        }
        int i = this$0.devModeClickCount + 1;
        this$0.devModeClickCount = i;
        if (i == 15) {
            AboutManagerExtKt.getInstance(AboutManager.INSTANCE).gotoPluginVersionActivity(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.mDialog;
        if (commonDialog == null || commonDialog == null || !commonDialog.isShowing()) {
            if (System.currentTimeMillis() - this$0.testLastTime >= 1000) {
                this$0.testCount = 0;
                this$0.testLastTime = System.currentTimeMillis();
                return;
            }
            int i = this$0.testCount + 1;
            this$0.testCount = i;
            if (i == 5) {
                this$0.showDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$10(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(AboutUtil.INSTANCE.getWorkoutSafetyPrecautionAndWarningUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(lzi.U), true, false, null, false, null, false, 248, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$11(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!NetworkUtils.isNetworkConnected(this$0)) {
            ToastUtil.showShortToast(lzi.f25587r);
        } else if (this$0.getCurDeviceNums() > 0) {
            this$0.showPrivacyDialog(this$0.PRIVACY_STATE_NEED_UNBIND_ALL_DEVICE);
        } else {
            this$0.showPrivacyDialog(this$0.PRIVACY_STATE_RISK_ENSURE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$12(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ComponentState.INSTANCE.enableComponent(false, BootCompletedReceiver.class);
        PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).startPassportWebActivityForLogoff(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$13(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (NetworkUtils.isNetworkConnected(this$0)) {
            this$0.showRevokeDialog();
        } else {
            ToastUtil.showShortToast(lzi.f25587r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$14(boolean z, ISwitchButton iSwitchButton) {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.setPREF_PRIVACY_EXPERIENCE_TAG(z);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).setPrivacyExperienceAccepted(regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$15(AboutActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        this$0.showConfirmRevokeDialog(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$16(AboutActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            Logger.d(this$0.TAG, "loading");
            this$0.showLoading(lzi.W, false);
        } else {
            Logger.d(this$0.TAG, "hide loading");
            this$0.hideLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(View view) {
        AppUtil.INSTANCE.goMiOrPlayMarket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(AboutUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"), this$0.getString(lzi.w), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(AboutUrlsKt.getWatchAgreementHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"), this$0.getString(lzi.j), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(AboutUrlsKt.getAppPrivacyBriefUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"), this$0.getString(lzi.f25586k), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(AboutUrlsKt.getWatchExperienceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"), this$0.getString(lzi.v), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            WebViewUtilKt.startWebView$default(AboutUrlsKt.getCollectPersonalUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(lzi.h), false, false, null, false, null, false, 252, null);
        } else {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(AboutUrlsKt.getThirdSharedListUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(lzi.S), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(View view) {
        WebViewUtilKt.startWebView$default(AboutUtil.getUserSensitiveInfoUrlOnFirst(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"), null, false, false, null, false, null, false, 254, null);
    }

    private final void oneTrackSettingsAboutReview() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36275"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_about")));
    }

    private final boolean showCnPrivacyEnable() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Logger.i(this.TAG, "app currentRegion:" + currentRegion);
        return !AppUtil.INSTANCE.isPlayChannel() && LocaleUtil.INSTANCE.isSimplifiedChinese() && (currentRegion.length() == 0 || StringsKt__StringsJVMKt.equals(currentRegion, "cn", true));
    }

    private final void showConfirmRevokeDialog(String identifyToken) {
        Logger.d(this.TAG, "showConfirmRevokeDialog");
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("revokeconfirm").setDialogTitle(lzi.y).setCancelable(false).setDialogDescription(lzi.z).setPositiveText(lzi.i).setNegativeText(lzi.common_cancel).create();
        this.mRevokeConfirmDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate != null ? commonDialogCreate.addDialogCallback(new AnonymousClass1(identifyToken)) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        CommonDialog<?> commonDialog = this.mRevokeConfirmDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showDialog() {
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("repeat").setDialogDescription(lzi.H).setPositiveText(lzi.i).setNegativeText(lzi.d).create();
        this.mDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate != null ? commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.AboutActivity.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    AboutActivity.this.moveLogToDownload();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        CommonDialog<?> commonDialog = this.mDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showPrivacyDialog(int state) {
        if (state == this.PRIVACY_STATE_NEED_UNBIND_ALL_DEVICE) {
            CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(lzi.E).setDialogDescription(lzi.C).setNeutralText(lzi.D).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.AboutActivity.showPrivacyDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        dialog.dismiss();
                    }
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    super.onDialogMultiClick(dialogName, which, isChecked);
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
            return;
        }
        if (state == this.PRIVACY_STATE_RISK_ENSURE) {
            CommonDialog commonDialogCreate2 = new CommonDialog.c("risk").setCustomLayoutId(yti.d).setPositiveText(lzi.A).setNeutralText(lzi.B).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate2, "create(...)");
            Intrinsics.checkNotNull(commonDialogCreate2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.AboutActivity.showPrivacyDialog.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        ComponentState.INSTANCE.enableComponent(false, BootCompletedReceiver.class);
                        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
                        if (currentActivity != null) {
                            PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).startPassportWebActivity(currentActivity);
                        } else {
                            Logger.e("startPassportWebActivity error: currentActivity is null", new Object[0]);
                        }
                    }
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    super.onDialogMultiClick(dialogName, which, isChecked);
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            commonDialogCreate2.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showRevokeDialog() {
        CommonDialog<?> commonDialog;
        View viewInflate = LayoutInflater.from(this).inflate(yti.e, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.positiveButton = (TextView) viewInflate.findViewById(uqi.p);
        TextView textView = (TextView) viewInflate.findViewById(uqi.m);
        ((TextView) viewInflate.findViewById(uqi.M)).setMovementMethod(ScrollingMovementMethod.getInstance());
        if (this.mRevokeDialog == null) {
            this.mRevokeDialog = new CommonDialog.c("revoke").setCustomView(viewInflate).setCancelable(false).create();
        }
        TextView textView2 = this.positiveButton;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: wx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutActivity.showRevokeDialog$lambda$19(this.f38446a, view);
                }
            });
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: xx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutActivity.showRevokeDialog$lambda$20(this.f39541a, view);
                }
            });
        }
        CommonDialog<?> commonDialog2 = this.mRevokeDialog;
        Boolean boolValueOf = commonDialog2 != null ? Boolean.valueOf(commonDialog2.isShowing()) : null;
        Intrinsics.checkNotNull(boolValueOf);
        if (!boolValueOf.booleanValue() && (commonDialog = this.mRevokeDialog) != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
        TextView textView3 = this.positiveButton;
        if (textView3 != null) {
            textView3.setText(this.startTime);
        }
        startCountDownTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showRevokeDialog$lambda$19(final AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "positiveButton");
        ((AboutViewModel) this$0.getMViewModel()).logOff(this$0, "", new Function1() { // from class: yx
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutActivity.showRevokeDialog$lambda$19$lambda$17(this.f40653a, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: ay
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutActivity.showRevokeDialog$lambda$19$lambda$18(this.f3553a, (ApiException) obj);
            }
        });
        CommonDialog<?> commonDialog = this$0.mRevokeDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this$0.mRevokeDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRevokeDialog$lambda$19$lambda$17(AboutActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "it success " + z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRevokeDialog$lambda$19$lambda$18(AboutActivity this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "it.errorCode is " + it.getErrorCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRevokeDialog$lambda$20(AboutActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "nativeButton");
        this$0.stopCountDownTimer();
        CommonDialog<?> commonDialog = this$0.mRevokeDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this$0.mRevokeDialog = null;
    }

    private final void startCountDownTimer() {
        stopCountDownTimer();
        TextView textView = this.positiveButton;
        if (textView != null) {
            textView.setClickable(false);
        }
        CountDownTimer countDownTimer = new CountDownTimer() { // from class: com.xiaomi.fitness.about.AboutActivity.startCountDownTimer.1
            {
                super(10000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                TextView textView2 = AboutActivity.this.positiveButton;
                if (textView2 != null) {
                    textView2.setClickable(true);
                }
                TextView textView3 = AboutActivity.this.positiveButton;
                if (textView3 != null) {
                    textView3.setText(lzi.i);
                }
            }

            @Override // android.os.CountDownTimer
            @SuppressLint({"DefaultLocale"})
            public void onTick(long millisUntilFinished) {
                TextView textView2 = AboutActivity.this.positiveButton;
                if (textView2 != null) {
                    textView2.setText(AboutActivity.this.getString(lzi.l, Long.valueOf(millisUntilFinished / ((long) 1000))));
                }
            }
        };
        this.countDownTimer = countDownTimer;
        countDownTimer.start();
    }

    private final void stopCountDownTimer() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.countDownTimer = null;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull my myVar) {
        Intrinsics.checkNotNullParameter(myVar, "<this>");
    }

    public final int getCurDeviceNums() {
        List<T> deviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels();
        if (deviceModels != 0) {
            return deviceModels.size();
        }
        return 0;
    }

    public final int getLOG_OFF_REQUEST_CODE() {
        return this.LOG_OFF_REQUEST_CODE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return yti.f40523a;
    }

    public final int getPRIVACY_STATE_NEED_UNBIND_ALL_DEVICE() {
        return this.PRIVACY_STATE_NEED_UNBIND_ALL_DEVICE;
    }

    public final int getPRIVACY_STATE_RISK_ENSURE() {
        return this.PRIVACY_STATE_RISK_ENSURE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return vv1.f37253a;
    }

    public final void initView(@NotNull ConstraintLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        oneTrackSettingsAboutReview();
        super.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.about.Hilt_AboutActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"StringFormatInvalid"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(lzi.f25584a);
        setTitleBackground(xii.f39161b);
        setActionBarDisplayable(true);
        ((my) getMBinding()).R.setText(getString(lzi.m, AppUtil.getVersionName()));
        ImageView imgView = ((my) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(imgView, "imgView");
        Coil.imageLoader(imgView.getContext()).enqueue(new ImageRequest.Builder(imgView.getContext()).data(Integer.valueOf(cni.f5577a)).target(imgView).build());
        ((my) getMBinding()).S.setOnClickListener(new View.OnClickListener() { // from class: dx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$0(this.f16017a, view);
            }
        });
        ((my) getMBinding()).M.setText(CommonTextLinkUtil.INSTANCE.getClickableHtml(getString(lzi.F, "https://beian.miit.gov.cn")));
        ((my) getMBinding()).M.setMovementMethod(LinkMovementMethod.getInstance());
        AppUtil appUtil = AppUtil.INSTANCE;
        if (appUtil.isPlayChannel()) {
            ((my) getMBinding()).M.setVisibility(8);
        }
        ((my) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: iy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$1(this.f22213a, view);
            }
        });
        ((my) getMBinding()).E.setVisibility((owk.b() || appUtil.isPlayChannel()) ? 0 : 8);
        ((my) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: jy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$2(view);
            }
        });
        ((my) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: gx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$3(this.f19420a, view);
            }
        });
        ((my) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: qx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$4(this.f31922a, view);
            }
        });
        boolean zShowCnPrivacyEnable = showCnPrivacyEnable();
        ((my) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: rx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$5(this.f32993a, view);
            }
        });
        RightArrowBindingSingleLineTextView commonPrivacyBrief = ((my) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(commonPrivacyBrief, "commonPrivacyBrief");
        ViewExtKt.setVisible(commonPrivacyBrief, zShowCnPrivacyEnable);
        ((my) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: sx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$6(this.f34071a, view);
            }
        });
        ((my) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: tx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$7(this.f35149a, view);
            }
        });
        RightArrowBindingSingleLineTextView collectPersonalList = ((my) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(collectPersonalList, "collectPersonalList");
        ViewExtKt.setVisible(collectPersonalList, zShowCnPrivacyEnable);
        ((my) getMBinding()).T.setOnClickListener(new View.OnClickListener() { // from class: ux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$8(this.f36239a, view);
            }
        });
        RightArrowBindingSingleLineTextView thirdPartySharedList = ((my) getMBinding()).T;
        Intrinsics.checkNotNullExpressionValue(thirdPartySharedList, "thirdPartySharedList");
        ViewExtKt.setVisible(thirdPartySharedList, zShowCnPrivacyEnable);
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ((my) getMBinding()).N.setVisibility(8);
        } else {
            ((my) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: vx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutActivity.onCreate$lambda$9(view);
                }
            });
        }
        ((my) getMBinding()).U.setOnClickListener(new View.OnClickListener() { // from class: zx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$10(this.f41760a, view);
            }
        });
        RegionManager.Companion companion = RegionManager.INSTANCE;
        ((my) getMBinding()).C.setVisibility(RegionExtKt.isInland(RegionExtKt.getInstance(companion)) && !appUtil.isPlayChannel() ? 0 : 8);
        ((my) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: cy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.onCreate$lambda$11(this.f14850a, view);
            }
        });
        ((my) getMBinding()).K.setVisibility(((AboutViewModel) getMViewModel()).isLogin() ? 0 : 8);
        if (RegionExtKt.isInland(RegionExtKt.getInstance(companion))) {
            ((my) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: dy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutActivity.onCreate$lambda$12(this.f16044a, view);
                }
            });
        } else {
            ((my) getMBinding()).K.setTitle(lzi.I);
            ((my) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: ey
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutActivity.onCreate$lambda$13(this.f17178a, view);
                }
            });
        }
        String str = this.TAG;
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        Logger.d(str, "RegionPreference.PREF_PRIVACY_EXPERIENCE_TAG is " + regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG());
        if (regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG()) {
            ((my) getMBinding()).O.setSwitch(true);
        } else {
            ((my) getMBinding()).O.setSwitch(false);
        }
        ((my) getMBinding()).O.setTitle(getString(lzi.x));
        ((my) getMBinding()).O.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: fy
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AboutActivity.onCreate$lambda$14(z, iSwitchButton);
            }
        });
        ConstraintLayout aboutClContent = ((my) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(aboutClContent, "aboutClContent");
        initView(aboutClContent);
        if (appUtil.isPlayChannel() && !isGpsLimitCountry() && !RegionExtKt.isInland(RegionExtKt.getInstance(companion))) {
            ((my) getMBinding()).P.setVisibility(0);
            ((my) getMBinding()).P.setSwitch(SettingPreference.INSTANCE.getNotUploadGpsEnable());
            ((my) getMBinding()).P.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.about.AboutActivity.onCreate.16
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public void onCheckedChanged(boolean isChecked, ISwitchButton switchButton) {
                    if (isChecked) {
                        SettingPreference.INSTANCE.setNotUploadGpsEnable(true);
                    } else {
                        SettingPreference.INSTANCE.setNotUploadGpsEnable(false);
                    }
                }
            });
        }
        ((AboutViewModel) getMViewModel()).getShowDialog().observe(this, new AboutActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gy
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutActivity.onCreate$lambda$15(this.f19449a, (String) obj);
            }
        }));
        ((AboutViewModel) getMViewModel()).getShowLoading().observe(this, new AboutActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hy
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutActivity.onCreate$lambda$16(this.f20588a, (Boolean) obj);
            }
        }));
    }
}

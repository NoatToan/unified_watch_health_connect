package com.xiaomi.fitness.login.privacy;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.xiaomi.accounts.Manifest;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.PrivacyEasyModePreference;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.mode.GuidePersonalizeActivity;
import com.xiaomi.fitness.login.preference.PrivacyPreference;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import com.xiaomi.fitness.login.region.RegionSelectActivity;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.login.util.PrivacyUrlsKt;
import com.xiaomi.fitness.login.util.hyperlink.a;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.res.preload.export.PreloadManagerExtKt;
import com.xiaomi.fitness.res.preload.export.ResPreloadManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.av6;
import defpackage.dv1;
import defpackage.g0j;
import defpackage.hqe;
import defpackage.lji;
import defpackage.mui;
import defpackage.v84;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Route(path = PrivacyExtKt.PRIVACY_PATH)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b<\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J!\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010\nR\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u000e0\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/login/privacy/PrivacyActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/privacy/PrivacyViewModel;", "Lhqe;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "showKrPrivacyEnable", "()Z", "", "dealEnterEasyModeAction", "()V", "showCnPrivacyEnable", "", "resultCode", "Landroid/content/Intent;", "data", "dealActivityResult", "(ILandroid/content/Intent;)V", "agreeClick", "", "getPrivacyDialogText", "()Ljava/lang/String;", "showPrivacyDialog", "handlePrivacyAgree", "clearSpan", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "TAG", "Ljava/lang/String;", "getTAG", "", "Landroid/widget/TextView;", "clickableViewList", "Ljava/util/List;", "privacyAgreeHasChecked", "Z", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPrivacyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyActivity.kt\ncom/xiaomi/fitness/login/privacy/PrivacyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 4 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,412:1\n1863#2:413\n1864#2:421\n32#3:414\n31#4,4:415\n13579#5,2:419\n*S KotlinDebug\n*F\n+ 1 PrivacyActivity.kt\ncom/xiaomi/fitness/login/privacy/PrivacyActivity\n*L\n401#1:413\n401#1:421\n404#1:414\n404#1:415,4\n404#1:419,2\n*E\n"})
public final class PrivacyActivity extends Hilt_PrivacyActivity<PrivacyViewModel, hqe> implements CompoundButton.OnCheckedChangeListener {

    @NotNull
    private final ActivityResultLauncher<Intent> activityForResult;
    public Context mContext;
    private boolean privacyAgreeHasChecked;

    @NotNull
    private final String TAG = "PrivacyActivity";

    @NotNull
    private final List<TextView> clickableViewList = new ArrayList();

    public PrivacyActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: p9i
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                PrivacyActivity.activityForResult$lambda$0(this.f30151a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.activityForResult = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activityForResult$lambda$0(PrivacyActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealActivityResult(activityResult.c(), activityResult.a());
    }

    private final void agreeClick() {
        if (this.privacyAgreeHasChecked) {
            handlePrivacyAgree();
        } else {
            showPrivacyDialog();
        }
    }

    private final void clearSpan() {
        for (TextView textView : this.clickableViewList) {
            CharSequence text = textView.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                    spannable.removeSpan(obj);
                }
                textView.setMovementMethod(null);
                textView.setText(" ");
            }
        }
        this.clickableViewList.clear();
    }

    private final void dealActivityResult(int resultCode, Intent data) {
        Logger.i(this.TAG, "dealActivityResult resultCode " + resultCode + ";data " + data);
        if (resultCode == 100) {
            dealEnterEasyModeAction();
        } else {
            if (resultCode != 101) {
                return;
            }
            AppManager.INSTANCE.getInstance().appExit();
        }
    }

    private final void dealEnterEasyModeAction() {
        PrivacyEasyModePreference.INSTANCE.setEasyMode(true);
        RegionManager.Companion companion = RegionManager.INSTANCE;
        RegionExtKt.getInstance(companion).setCurrentRegion("cn");
        RegionExtKt.getInstance(companion).setLocaleCountry(ServerConstants.NEW_CN_COUNTRY_CODE);
        RegionExtKt.getInstance(companion).setCurrentCountry("中国大陆");
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_SPORT());
        MainExtKt.showMainActivity(this, null, bundle);
        finish();
    }

    private final String getPrivacyDialogText() {
        if (showCnPrivacyEnable()) {
            Resources resources = getResources();
            int i = g0j.u;
            LocaleUtil localeUtil = LocaleUtil.INSTANCE;
            String string = resources.getString(i, PrivacyUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"), PrivacyUrlsKt.getWatchAgreementHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"), PrivacyUrlsKt.getAppPrivacyBriefUrl(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        Resources resources2 = getResources();
        int i2 = g0j.t;
        LocaleUtil localeUtil2 = LocaleUtil.INSTANCE;
        String string2 = resources2.getString(i2, PrivacyUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil2, false, false, 3, null), "app"), PrivacyUrlsKt.getWatchAgreementHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil2, false, false, 3, null), "app"));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePrivacyAgree() {
        String currentRegion;
        PrivacyEasyModePreference privacyEasyModePreference = PrivacyEasyModePreference.INSTANCE;
        boolean zIsEasyMode = privacyEasyModePreference.isEasyMode();
        PrivacyPreference privacyPreference = PrivacyPreference.INSTANCE;
        privacyPreference.setPrivacyAgreeTime(System.currentTimeMillis());
        privacyPreference.setPrivacyAgreeTag(true);
        privacyEasyModePreference.setEasyMode(false);
        if (zIsEasyMode || (currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()) == null || currentRegion.length() == 0) {
            startActivity(new Intent(this, (Class<?>) RegionSelectActivity.class));
        } else if (AppUtil.INSTANCE.isPlayChannel() || LoginUtil.INSTANCE.checkDeviceSettingForSelectMode() != CheckerUserSettingManager.INSTANCE.getUNKOWN_MODE() || ICompareKt.getINSTANCE(ICompare.INSTANCE).showAppV4Enable()) {
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            MainExtKt.showMainActivity$default(application, null, null, 6, null);
        } else {
            startActivity(new Intent(this, (Class<?>) GuidePersonalizeActivity.class));
        }
        PreloadManagerExtKt.getInstance(ResPreloadManager.INSTANCE).preloadIfNeed();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(View view) {
        AppManager.INSTANCE.getInstance().appExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(PrivacyActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.showCnPrivacyEnable()) {
            this$0.finish();
        } else {
            this$0.activityForResult.launch(new Intent(this$0, (Class<?>) EasyModeDetailActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(final PrivacyActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "privace agree");
        boolean zIsPermissionGranted = PermissionExtKt.isPermissionGranted(this$0, Manifest.permission.GET_ACCOUNTS);
        Logger.d(this$0.TAG, "isPermissionGranted(Manifest.permission.GET_ACCOUNTS) " + zIsPermissionGranted);
        if (!AppUtil.INSTANCE.isPlayChannel() || Build.VERSION.SDK_INT > 26 || !RomUtils.INSTANCE.isMIUIRom(this$0) || zIsPermissionGranted) {
            this$0.agreeClick();
        } else {
            PermissionExtKt.permission$default(this$0, Manifest.permission.GET_ACCOUNTS, (String) null, new Function1() { // from class: g9i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PrivacyActivity.onCreate$lambda$6$lambda$5(this.f18757a, (PermissionBuilder) obj);
                }
            }, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5(final PrivacyActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.denied(new Function1() { // from class: n9i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PrivacyActivity.onCreate$lambda$6$lambda$5$lambda$3((String) obj);
            }
        });
        permission.granted(new Function1() { // from class: o9i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PrivacyActivity.onCreate$lambda$6$lambda$5$lambda$4(this.f28896a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AppManager.INSTANCE.getInstance().appExit();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$4(PrivacyActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.agreeClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(View view) {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.setPREF_PRIVACY_EXPERIENCE_TAG(view.isClickable());
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).setPrivacyExperienceAccepted(regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(View view) {
        RegionPreference.INSTANCE.setPREF_PRIVACY_EXPERIENCE_TAG(view.isClickable());
    }

    private final boolean showCnPrivacyEnable() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Logger.i(this.TAG, "app currentRegion:" + currentRegion);
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            LocaleUtil localeUtil = LocaleUtil.INSTANCE;
            if ((localeUtil.isSameCountry(ServerConstants.NEW_CN_COUNTRY_CODE) || localeUtil.isSameCountry(ServerConstants.NEW_TW_COUNTRY_CODE)) && (currentRegion.length() == 0 || StringsKt__StringsJVMKt.equals(currentRegion, "cn", true))) {
                return true;
            }
        }
        return false;
    }

    private final boolean showKrPrivacyEnable() {
        LocaleUtil localeUtil = LocaleUtil.INSTANCE;
        if (!localeUtil.isSameCountry("kr")) {
            String language = Locale.KOREA.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            if (!localeUtil.isSameLanguage(language)) {
                return false;
            }
        }
        return true;
    }

    private final void showPrivacyDialog() {
        new CommonDialog.c("privacy_sure_dialog").setDialogTitle(g0j.v).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(this, getPrivacyDialogText(), Integer.valueOf(lji.f25134a), new LinkSpanHelper.a() { // from class: h9i
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                PrivacyActivity.showPrivacyDialog$lambda$9(view, str);
            }
        }))).setPositiveText(g0j.d).setNegativeText(g0j.f18429a).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.privacy.PrivacyActivity.showPrivacyDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    PrivacyActivity.this.handlePrivacyAgree();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrivacyDialog$lambda$9(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.c;
    }

    @NotNull
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.f15951a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@Nullable CompoundButton buttonView, boolean isChecked) {
        if (!showKrPrivacyEnable()) {
            this.privacyAgreeHasChecked = ((hqe) getMBinding()).R.isChecked();
            return;
        }
        if (buttonView != null && buttonView.getId() == ((hqe) getMBinding()).A.getId()) {
            v84.h(((hqe) getMBinding()).D, isChecked, this);
            v84.h(((hqe) getMBinding()).F, isChecked, this);
            v84.h(((hqe) getMBinding()).B, isChecked, this);
            v84.h(((hqe) getMBinding()).M, isChecked, this);
            this.privacyAgreeHasChecked = isChecked;
            return;
        }
        if (!isChecked) {
            if (!((hqe) getMBinding()).D.isChecked() || !((hqe) getMBinding()).B.isChecked()) {
                this.privacyAgreeHasChecked = false;
            }
            v84.h(((hqe) getMBinding()).A, false, this);
            return;
        }
        if (!((hqe) getMBinding()).D.isChecked() || !((hqe) getMBinding()).B.isChecked()) {
            this.privacyAgreeHasChecked = false;
            return;
        }
        if (((hqe) getMBinding()).F.isChecked() && ((hqe) getMBinding()).M.isChecked()) {
            v84.h(((hqe) getMBinding()).A, true, this);
        }
        this.privacyAgreeHasChecked = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.login.privacy.Hilt_PrivacyActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        setMContext(this);
        String str = this.TAG;
        Locale locale = Locale.getDefault();
        LocaleUtil localeUtil = LocaleUtil.INSTANCE;
        Logger.i(str, "phone defaultRegion:" + locale + ";current " + LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null));
        if (showKrPrivacyEnable()) {
            ((hqe) getMBinding()).Y.setText(g0j.x);
            ((hqe) getMBinding()).X.setText(g0j.J);
            String string = getResources().getString(g0j.G, PrivacyUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CharSequence charSequenceB = a.b(string);
            ((hqe) getMBinding()).E.setText(charSequenceB);
            ((hqe) getMBinding()).E.setContentDescription(charSequenceB.toString());
            ((hqe) getMBinding()).E.setMovementMethod(LinkMovementMethod.getInstance());
            List<TextView> list = this.clickableViewList;
            TextView agreeMiwearPolicyTv = ((hqe) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(agreeMiwearPolicyTv, "agreeMiwearPolicyTv");
            list.add(agreeMiwearPolicyTv);
            String string2 = getResources().getString(g0j.F, PrivacyUrlsKt.getPrivacyUserInfoHtmlUrl(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app_v3"));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            CharSequence charSequenceB2 = a.b(string2);
            ((hqe) getMBinding()).C.setText(charSequenceB2);
            ((hqe) getMBinding()).C.setContentDescription(charSequenceB2.toString());
            ((hqe) getMBinding()).C.setMovementMethod(LinkMovementMethod.getInstance());
            List<TextView> list2 = this.clickableViewList;
            TextView agreeCollectUserInfoTv = ((hqe) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(agreeCollectUserInfoTv, "agreeCollectUserInfoTv");
            list2.add(agreeCollectUserInfoTv);
            String string3 = getResources().getString(g0j.E, PrivacyUrlsKt.getPrivacyLocationHtmlUrl(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app_v3"));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            CharSequence charSequenceB3 = a.b(string3);
            ((hqe) getMBinding()).G.setText(charSequenceB3);
            ((hqe) getMBinding()).G.setContentDescription(charSequenceB3.toString());
            ((hqe) getMBinding()).G.setMovementMethod(LinkMovementMethod.getInstance());
            List<TextView> list3 = this.clickableViewList;
            TextView agreeUseLocationInfoTv = ((hqe) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(agreeUseLocationInfoTv, "agreeUseLocationInfoTv");
            list3.add(agreeUseLocationInfoTv);
            String string4 = getResources().getString(g0j.f18432r, PrivacyUrlsKt.getWatchExperienceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"));
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            CharSequence charSequenceB4 = a.b(string4);
            ((hqe) getMBinding()).W.setText(charSequenceB4);
            ((hqe) getMBinding()).W.setContentDescription(charSequenceB4.toString());
            ((hqe) getMBinding()).W.setMovementMethod(LinkMovementMethod.getInstance());
            List<TextView> list4 = this.clickableViewList;
            TextView privacyExperienceTvKr = ((hqe) getMBinding()).W;
            Intrinsics.checkNotNullExpressionValue(privacyExperienceTvKr, "privacyExperienceTvKr");
            list4.add(privacyExperienceTvKr);
            ((hqe) getMBinding()).F.setOnCheckedChangeListener(this);
            ((hqe) getMBinding()).D.setOnCheckedChangeListener(this);
            ((hqe) getMBinding()).B.setOnCheckedChangeListener(this);
            ((hqe) getMBinding()).A.setOnCheckedChangeListener(this);
            ((hqe) getMBinding()).J.setVisibility(8);
            ((hqe) getMBinding()).S.setVisibility(8);
            ((hqe) getMBinding()).T.setVisibility(8);
            ((hqe) getMBinding()).a0.setVisibility(8);
            ((hqe) getMBinding()).H.setVisibility(8);
            ((hqe) getMBinding()).N.setVisibility(8);
            ((hqe) getMBinding()).I.setVisibility(8);
        } else {
            String string5 = !showCnPrivacyEnable() ? getResources().getString(g0j.s, PrivacyUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"), PrivacyUrlsKt.getWatchAgreementHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app")) : getResources().getString(g0j.w, PrivacyUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"), PrivacyUrlsKt.getWatchAgreementHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"), PrivacyUrlsKt.getAppPrivacyBriefUrl(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"));
            Intrinsics.checkNotNull(string5);
            CharSequence charSequenceB5 = a.b(string5);
            ((hqe) getMBinding()).O.setText(charSequenceB5);
            ((hqe) getMBinding()).O.setContentDescription(charSequenceB5.toString());
            ((hqe) getMBinding()).O.setMovementMethod(LinkMovementMethod.getInstance());
            List<TextView> list5 = this.clickableViewList;
            TextView privacyAgreeActionTv = ((hqe) getMBinding()).O;
            Intrinsics.checkNotNullExpressionValue(privacyAgreeActionTv, "privacyAgreeActionTv");
            list5.add(privacyAgreeActionTv);
            ((hqe) getMBinding()).Y.setText(g0j.K);
            ((hqe) getMBinding()).X.setText(g0j.I);
            ((hqe) getMBinding()).Q.setText(g0j.d);
            ((hqe) getMBinding()).R.setOnCheckedChangeListener(this);
            ((hqe) getMBinding()).C.setVisibility(8);
            ((hqe) getMBinding()).E.setVisibility(8);
            ((hqe) getMBinding()).G.setVisibility(8);
            ((hqe) getMBinding()).F.setVisibility(8);
            ((hqe) getMBinding()).D.setVisibility(8);
            ((hqe) getMBinding()).B.setVisibility(8);
            ((hqe) getMBinding()).A.setVisibility(8);
            ((hqe) getMBinding()).P.setVisibility(8);
            ((hqe) getMBinding()).K.setVisibility(8);
            if (AppUtil.INSTANCE.isPlayChannel()) {
                ((hqe) getMBinding()).H.setVisibility(8);
            }
            if (showCnPrivacyEnable()) {
                ((hqe) getMBinding()).H.setVisibility(8);
                ((hqe) getMBinding()).N.setVisibility(8);
                ((hqe) getMBinding()).I.setVisibility(8);
                ((hqe) getMBinding()).J.setVisibility(8);
                ((hqe) getMBinding()).Q.setText(getString(g0j.z));
                ((hqe) getMBinding()).U.setText(getString(g0j.y));
                ((hqe) getMBinding()).X.setText(getString(g0j.H));
                ((hqe) getMBinding()).T.setVisibility(8);
                ((hqe) getMBinding()).Z.setVisibility(0);
                ((hqe) getMBinding()).Z.setText(getString(g0j.D));
                ((hqe) getMBinding()).Z.setOnClickListener(new View.OnClickListener() { // from class: i9i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PrivacyActivity.onCreate$lambda$1(view);
                    }
                });
            }
        }
        ((hqe) getMBinding()).Q.setEnabled(true);
        this.privacyAgreeHasChecked = false;
        ((hqe) getMBinding()).Q.setTextColor(getResources().getColor(lji.d));
        String string6 = getResources().getString(g0j.q, PrivacyUrlsKt.getWatchExperienceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null), "app"));
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        CharSequence charSequenceB6 = a.b(string6);
        ((hqe) getMBinding()).V.setText(charSequenceB6);
        ((hqe) getMBinding()).V.setContentDescription(charSequenceB6.toString());
        ((hqe) getMBinding()).V.setMovementMethod(LinkMovementMethod.getInstance());
        List<TextView> list6 = this.clickableViewList;
        TextView privacyExperienceTv = ((hqe) getMBinding()).V;
        Intrinsics.checkNotNullExpressionValue(privacyExperienceTv, "privacyExperienceTv");
        list6.add(privacyExperienceTv);
        ((hqe) getMBinding()).U.setOnClickListener(new View.OnClickListener() { // from class: j9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyActivity.onCreate$lambda$2(this.f22565a, view);
            }
        });
        ((hqe) getMBinding()).Q.setOnClickListener(new View.OnClickListener() { // from class: k9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyActivity.onCreate$lambda$6(this.f23636a, view);
            }
        });
        ((hqe) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: l9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyActivity.onCreate$lambda$7(view);
            }
        });
        ((hqe) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: m9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyActivity.onCreate$lambda$8(view);
            }
        });
    }

    @Override // com.xiaomi.fitness.login.privacy.Hilt_PrivacyActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        clearSpan();
        super.onDestroy();
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }
}

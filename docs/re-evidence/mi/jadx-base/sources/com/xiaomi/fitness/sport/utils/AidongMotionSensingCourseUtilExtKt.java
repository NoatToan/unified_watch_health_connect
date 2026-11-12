package com.xiaomi.fitness.sport.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt;
import com.xiaomi.fitness.webview.hyperlink.CommonTextLinkUtil;
import defpackage.aki;
import defpackage.av6;
import defpackage.ban;
import defpackage.c1j;
import defpackage.dan;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\u0007\u001a\u00020\u0001\u001a\b\u0010\b\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\b\u0010\u001a\u001a\u00020\u001bH\u0002\u001a\u001c\u0010\u001c\u001a\u00020\u00162\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u001eH\u0002\u001a.\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#\u001a\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018\u001a2\u0010&\u001a\u00020\u00162\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010#2\u0006\u0010 \u001a\u00020!2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010#\u001a;\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00160\u001eH\u0002\u001a.\u00101\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#\u001a\u0010\u00102\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0005\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u000f\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0005\"\u0004\b\u0011\u0010\u0012\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"HOST_OPERATION", "", "AIDONG_USER_NOTICE_URL_GLOBAL", "AIDONG_USER_NOTICE_URL", "getAIDONG_USER_NOTICE_URL", "()Ljava/lang/String;", "AIDONG_ENTRANCE_SUPPORT_LIST_URL_PATTERN", "getAidongEntranceNoticeSupportListUrl", "getOperationHost", "getRegionStr", "region", "AIDONG_PRIVACY_TERMS_URL_GLOBAL", "AIDONG_PRIVACY_TERMS_URL", "getAIDONG_PRIVACY_TERMS_URL", "TEMP_AIDONG_APK_DOWNLOAD_URL", "AIDONG_PACKAGE_NAME", "getAIDONG_PACKAGE_NAME", "setAIDONG_PACKAGE_NAME", "(Ljava/lang/String;)V", "AIDONG_APP_HOME_PAGE_CLASS_NAME", "AIDONG_APK_FILE_NAME", "goToAidongSDKEntrance", "", "context", "Landroid/content/Context;", "jumpToAidongApp", "checkIfAidongApkIsInstalled", "", "sendRequestToServerAndGetNewestAidongAPKUrl", "downloadApkAndPromptForInstallation", "Lkotlin/Function1;", "checkConnectionStatusAndShowGuideDialogIfNeed", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "fallbackFunction", "Lkotlin/Function0;", "nextStepCallback", "goGooglePlayAidong", "doAllNecessaryCheckAndGoToAidongSdkIfNeed", "successFunction", "setClickAble", "Landroid/text/SpannableString;", "originalText", "highColorId", "", "onClickListener", "Lkotlin/ParameterName;", "name", "index", "checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed", "goToConnectDevice", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAidongMotionSensingCourseUtilExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AidongMotionSensingCourseUtilExt.kt\ncom/xiaomi/fitness/sport/utils/AidongMotionSensingCourseUtilExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,353:1\n13467#2,3:354\n*S KotlinDebug\n*F\n+ 1 AidongMotionSensingCourseUtilExt.kt\ncom/xiaomi/fitness/sport/utils/AidongMotionSensingCourseUtilExtKt\n*L\n261#1:354,3\n*E\n"})
public final class AidongMotionSensingCourseUtilExtKt {

    @NotNull
    public static final String AIDONG_APK_FILE_NAME = "aidong_boxing_1.0.19_release_new.apk";

    @NotNull
    public static final String AIDONG_APP_HOME_PAGE_CLASS_NAME = "com.unity3d.player.UnityPlayerActivity";

    @NotNull
    private static final String AIDONG_ENTRANCE_SUPPORT_LIST_URL_PATTERN;

    @NotNull
    private static String AIDONG_PACKAGE_NAME = null;

    @NotNull
    private static final String AIDONG_PRIVACY_TERMS_URL;

    @NotNull
    public static final String AIDONG_PRIVACY_TERMS_URL_GLOBAL = "https://deg.aidong.me/agreement/index.html#/privacy?lang=en";

    @NotNull
    private static final String AIDONG_USER_NOTICE_URL;

    @NotNull
    public static final String AIDONG_USER_NOTICE_URL_GLOBAL = "https://deg.aidong.me/agreement/index.html#/user?lang=en";

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    public static final String TEMP_AIDONG_APK_DOWNLOAD_URL = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/aidong-apk/aidong_boxing_1.0.19_release_new.apk";

    static {
        AppUtil appUtil = AppUtil.INSTANCE;
        AIDONG_USER_NOTICE_URL = appUtil.isPlayChannel() ? AIDONG_USER_NOTICE_URL_GLOBAL : "https://coach.aidong.me/ad_agreement/index.html#/user?appName=%E7%88%B1%E5%8A%A8%E6%90%8F%E5%87%BB%E4%B8%96%E7%95%8CAPP";
        AIDONG_ENTRANCE_SUPPORT_LIST_URL_PATTERN = appUtil.isPlayChannel() ? "%s/html/motion-sensing-course/index.html?locale=%s" : "%s/html/motion-sensing-course-cn/index.html?locale=%s";
        AIDONG_PRIVACY_TERMS_URL = appUtil.isPlayChannel() ? AIDONG_PRIVACY_TERMS_URL_GLOBAL : "https://coach.aidong.me/ad_agreement/index.html#/privacy?appName=%E7%88%B1%E5%8A%A8%E6%90%8F%E5%87%BB%E4%B8%96%E7%95%8CAPP";
        AIDONG_PACKAGE_NAME = appUtil.isPlayChannel() ? "com.leyuan.boxing" : "com.aidong.xiaomiboxing";
    }

    public static final void checkConnectionStatusAndShowGuideDialogIfNeed(@NotNull final FragmentActivity activity, @Nullable final Function0<Unit> function0, @NotNull final Function0<Unit> nextStepCallback) {
        CommonDialog commonDialogAddDialogCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(nextStepCallback, "nextStepCallback");
        if (MotionSensingCourseHelperExtKt.getSupportsMotionSensingCourse()) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            SportBeanHelperExtKt.checkDeviceWearModeAndSwitchToBandModeIfNeed(supportFragmentManager, function0, new Function0() { // from class: mz0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AidongMotionSensingCourseUtilExtKt.checkConnectionStatusAndShowGuideDialogIfNeed$lambda$2(nextStepCallback);
                }
            });
            return;
        }
        CharSequence clickableHtml = CommonTextLinkUtil.INSTANCE.getClickableHtml(ResourceExtKt.getString(c1j.B, getAidongEntranceNoticeSupportListUrl()));
        ban banVarA0 = ban.A0(activity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(banVarA0, "inflate(...)");
        TextView desc = banVarA0.A;
        Intrinsics.checkNotNullExpressionValue(desc, "desc");
        desc.setText(clickableHtml);
        desc.setContentDescription(clickableHtml.toString());
        desc.setMovementMethod(LinkMovementMethod.getInstance());
        CommonDialog commonDialogCreate = new CommonDialog.c(ResourceExtKt.getString(c1j.u)).setDialogTitle(c1j.w).setPositiveText(c1j.A).setNegativeText(c1j.y).setCustomView(banVarA0.getRoot()).setCanceledOnTouchOutside(true).create();
        if (commonDialogCreate == null || (commonDialogAddDialogCallback = commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt.checkConnectionStatusAndShowGuideDialogIfNeed.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    nextStepCallback.invoke();
                    return;
                }
                if (which != -1) {
                    return;
                }
                AidongMotionSensingCourseUtilExtKt.goToConnectDevice(activity);
                Function0<Unit> function1 = function0;
                if (function1 != null) {
                    function1.invoke();
                }
            }
        })) == null) {
            return;
        }
        commonDialogAddDialogCallback.showIfNeed(activity.getSupportFragmentManager());
    }

    public static /* synthetic */ void checkConnectionStatusAndShowGuideDialogIfNeed$default(FragmentActivity fragmentActivity, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        checkConnectionStatusAndShowGuideDialogIfNeed(fragmentActivity, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkConnectionStatusAndShowGuideDialogIfNeed$lambda$2(Function0 nextStepCallback) {
        Intrinsics.checkNotNullParameter(nextStepCallback, "$nextStepCallback");
        nextStepCallback.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean checkIfAidongApkIsInstalled() {
        try {
            ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(AIDONG_PACKAGE_NAME, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed(@NotNull final FragmentActivity activity, @Nullable final Function0<Unit> function0, @NotNull final Function0<Unit> nextStepCallback) {
        CommonDialog commonDialogAddDialogCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(nextStepCallback, "nextStepCallback");
        boolean should_show_motion_sensor_course_user_notice = SportPreference.INSTANCE.getSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE();
        final dan danVarA0 = dan.A0(activity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(danVarA0, "inflate(...)");
        final SpannableString clickAble = setClickAble(ResourceExtKt.getString(c1j.C, AIDONG_USER_NOTICE_URL, AIDONG_PRIVACY_TERMS_URL), aki.c, new Function1() { // from class: kz0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AidongMotionSensingCourseUtilExtKt.checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed$lambda$6(((Integer) obj).intValue());
            }
        });
        TextView textView = danVarA0.C;
        textView.setText(clickAble);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (!should_show_motion_sensor_course_user_notice) {
            nextStepCallback.invoke();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("motion_sensor_course_user_notice").setDialogTitle(c1j.D).setPositiveText(c1j.f4829a).setNegativeText(c1j.common_exit).setCustomView(danVarA0.getRoot()).create();
        if (commonDialogCreate == null || (commonDialogAddDialogCallback = commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt.checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -1) {
                    Function0<Unit> function1 = function0;
                    if (function1 != null) {
                        function1.invoke();
                        return;
                    }
                    return;
                }
                if (danVarA0.A.isChecked()) {
                    SportPreference.INSTANCE.setSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE(false);
                    nextStepCallback.invoke();
                    return;
                }
                FragmentActivity fragmentActivity = activity;
                String string = clickAble.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                ToastExtKt.toastShort(fragmentActivity, string);
                Function0<Unit> function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
            }
        })) == null) {
            return;
        }
        commonDialogAddDialogCallback.showIfNeed(activity.getSupportFragmentManager());
    }

    public static /* synthetic */ void checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed$default(FragmentActivity fragmentActivity, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed(fragmentActivity, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed$lambda$6(int i) {
        if (i == 0) {
            com.xiaomi.fitness.webview.WebViewUtilKt.startWebView$default(AIDONG_USER_NOTICE_URL, " ", false, false, null, false, null, false, 252, null);
        } else {
            com.xiaomi.fitness.webview.WebViewUtilKt.startWebView$default(AIDONG_PRIVACY_TERMS_URL, " ", false, false, null, false, null, false, 252, null);
        }
        return Unit.INSTANCE;
    }

    public static final void doAllNecessaryCheckAndGoToAidongSdkIfNeed(@Nullable final Function0<Unit> function0, @NotNull final FragmentActivity activity, @Nullable final Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        checkIfFirstTimeEntryAndShowUserAgreementIfDialogNeed(activity, function0, new Function0() { // from class: lz0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed$lambda$4(activity, function0, function1);
            }
        });
    }

    public static /* synthetic */ void doAllNecessaryCheckAndGoToAidongSdkIfNeed$default(Function0 function0, FragmentActivity fragmentActivity, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        doAllNecessaryCheckAndGoToAidongSdkIfNeed(function0, fragmentActivity, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doAllNecessaryCheckAndGoToAidongSdkIfNeed$lambda$4(final FragmentActivity activity, Function0 function0, final Function0 function1) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        checkConnectionStatusAndShowGuideDialogIfNeed(activity, function0, new Function0() { // from class: jz0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed$lambda$4$lambda$3(function1, activity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doAllNecessaryCheckAndGoToAidongSdkIfNeed$lambda$4$lambda$3(Function0 function0, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (function0 != null) {
            function0.invoke();
        }
        goToAidongSDKEntrance(activity);
        return Unit.INSTANCE;
    }

    @NotNull
    public static final String getAIDONG_PACKAGE_NAME() {
        return AIDONG_PACKAGE_NAME;
    }

    @NotNull
    public static final String getAIDONG_PRIVACY_TERMS_URL() {
        return AIDONG_PRIVACY_TERMS_URL;
    }

    @NotNull
    public static final String getAIDONG_USER_NOTICE_URL() {
        return AIDONG_USER_NOTICE_URL;
    }

    @NotNull
    public static final String getAidongEntranceNoticeSupportListUrl() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(AIDONG_ENTRANCE_SUPPORT_LIST_URL_PATTERN, Arrays.copyOf(new Object[]{getOperationHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String getOperationHost() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{getRegionStr(lowerCase)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String getRegionStr(String str) {
        if (Intrinsics.areEqual(str, "cn")) {
            return "";
        }
        return str + ".";
    }

    public static final void goGooglePlayAidong(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (context.getPackageName() != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.leyuan.boxing"));
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.leyuan.boxing"));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }

    public static final void goToAidongSDKEntrance(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (checkIfAidongApkIsInstalled()) {
            jumpToAidongApp(context);
        } else if (AppUtil.INSTANCE.isPlayChannel()) {
            goGooglePlayAidong(context);
        } else {
            ToastExtKt.toastLong(context, c1j.z);
            sendRequestToServerAndGetNewestAidongAPKUrl(new Function1() { // from class: iz0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AidongMotionSensingCourseUtilExtKt.goToAidongSDKEntrance$lambda$0((String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToAidongSDKEntrance$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(SportBeanHelperExtKt.TAG, "downloadApkAndPromptForInstallation running.....");
        Logger.d(SportBeanHelperExtKt.TAG, "GetNewestAidongAPKUrl=" + it);
        AidongApkDownloadUtil.INSTANCE.startDownload(it, AIDONG_APK_FILE_NAME);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void goToConnectDevice(FragmentActivity fragmentActivity) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        MainExtKt.showMainActivity(fragmentActivity, null, bundle);
    }

    private static final void jumpToAidongApp(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(AIDONG_PACKAGE_NAME, AIDONG_APP_HOME_PAGE_CLASS_NAME));
        context.startActivity(intent);
    }

    private static final void sendRequestToServerAndGetNewestAidongAPKUrl(Function1<? super String, Unit> function1) {
        Logger.d(SportBeanHelperExtKt.TAG, "sendRequestToServerAndGetNewestAidongAPKUrl running.....");
        function1.invoke2(TEMP_AIDONG_APK_DOWNLOAD_URL);
    }

    public static final void setAIDONG_PACKAGE_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        AIDONG_PACKAGE_NAME = str;
    }

    private static final SpannableString setClickAble(String str, final int i, final Function1<? super Integer, Unit> function1) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        int i2 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        Intrinsics.checkNotNull(uRLSpanArr);
        int length = uRLSpanArr.length;
        final int i3 = 0;
        while (i2 < length) {
            URLSpan uRLSpan = uRLSpanArr[i2];
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt$setClickAble$1$clickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    function1.invoke2(Integer.valueOf(i3));
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    int i4 = i;
                    if (i4 != -1) {
                        ds.setColor(ExtUtilsKt.getColor(i4));
                    }
                    ds.setUnderlineText(true);
                }
            }, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            i2++;
            i3++;
        }
        return spannableString;
    }
}

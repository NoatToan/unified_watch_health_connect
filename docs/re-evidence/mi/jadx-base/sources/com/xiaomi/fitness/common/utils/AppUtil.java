package com.xiaomi.fitness.common.utils;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.q8p;
import defpackage.rzi;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010%\u001a\u00020\u000bH\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J\u0014\u0010*\u001a\u00020\u000b*\u00020)2\u0006\u0010+\u001a\u00020\u0005H\u0007J\u0016\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0005J\u0006\u0010-\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020\u0012J\b\u0010/\u001a\u00020\u0012H\u0002J\b\u00100\u001a\u00020\u0012H\u0002J\u0018\u00101\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u000103R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR!\u0010\u0019\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR!\u0010\u001f\u001a\u00020 8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/common/utils/AppUtil;", "", "<init>", "()V", "TAG", "", "PACKAGE_NAME_MIHEALTH", "PACKAGE_NAME_WEARABLE", "sApp", "Landroid/app/Application;", "isPlayChannel", "", "()Z", "setPlayChannel", "(Z)V", "isDevChannel", "setDevChannel", "init", "", "app", "hasInit", "getApp$annotations", "getApp", "()Landroid/app/Application;", "isMainThread", CommonConstants.KEY_VERSION_NAME, "getVersionName$annotations", "getVersionName", "()Ljava/lang/String;", "versionName$delegate", "Lkotlin/Lazy;", CommonConstants.KEY_VERSION_CODE, "", "getVersionCode$annotations", "getVersionCode", "()J", "versionCode$delegate", "isRTLDirection", "getTxtFontSize", "", "context", "Landroid/content/Context;", "hasPackage", Constants.KEY_PACKAGE_NAME, "appInstalled", "supportMiuiFunction", "goMiOrPlayMarket", "goMiMarket", "goPlayStore", "goToUriPage", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppUtil {

    @NotNull
    public static final String PACKAGE_NAME_MIHEALTH = "com.mi.health";

    @NotNull
    public static final String PACKAGE_NAME_WEARABLE = "com.xiaomi.wearable";

    @NotNull
    private static final String TAG = "AppUtil";
    private static boolean isDevChannel;
    private static boolean isPlayChannel;

    @Nullable
    private static volatile Application sApp;

    @NotNull
    public static final AppUtil INSTANCE = new AppUtil();

    /* JADX INFO: renamed from: versionName$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy versionName = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ji1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUtil.versionName_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: versionCode$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy versionCode = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ki1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(AppUtil.versionCode_delegate$lambda$1());
        }
    });

    private AppUtil() {
    }

    @NotNull
    public static final Application getApp() {
        if (sApp == null) {
            throw new AndroidRuntimeException("Please call AppUtil.init(Application app)");
        }
        Application application = sApp;
        Intrinsics.checkNotNull(application);
        return application;
    }

    @JvmStatic
    public static /* synthetic */ void getApp$annotations() {
    }

    @JvmStatic
    public static final float getTxtFontSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().fontScale;
    }

    public static final long getVersionCode() {
        return ((Number) versionCode.getValue()).longValue();
    }

    @JvmStatic
    public static /* synthetic */ void getVersionCode$annotations() {
    }

    @NotNull
    public static final String getVersionName() {
        return (String) versionName.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void getVersionName$annotations() {
    }

    private final void goMiMarket() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mimarket://comments?id=" + getApp().getPackageName()));
        intent.addFlags(268435456);
        try {
            getApp().startActivity(intent);
        } catch (Exception e) {
            Logger.e("Market", e.getMessage());
        }
    }

    private final void goPlayStore() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + getApp().getPackageName()));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        try {
            getApp().startActivity(intent);
        } catch (Exception e) {
            Logger.e(TAG, "goPlayStore 1: " + e.getMessage());
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApp().getPackageName()));
            intent2.addFlags(268435456);
            try {
                getApp().startActivity(intent2);
            } catch (Exception e2) {
                Logger.e(TAG, "goPlayStore 2: " + e2.getMessage());
                ToastUtil.INSTANCE.showToast(rzi.common_hint_unkonwn_error);
            }
        }
    }

    @JvmStatic
    public static final boolean hasPackage(@NotNull Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        if (MarketUtil.checkAppInstalled(context, pkgName)) {
            PackageInfo packageInfo = MarketUtil.INSTANCE.getPackageInfo(context, pkgName);
            String str = packageInfo != null ? packageInfo.versionName : null;
            if (str != null && str.length() != 0) {
                if (StringsKt__StringsJVMKt.startsWith$default(str, "2", false, 2, null)) {
                    Logger.i(TAG, "info.versionName is " + str);
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
                    Logger.i(TAG, "stringSplit is " + listSplit$default);
                    if ((!listSplit$default.isEmpty()) && listSplit$default.size() >= 2 && Integer.parseInt((String) listSplit$default.get(1)) > 15) {
                        Logger.i(TAG, "stringSplit is " + Integer.parseInt((String) listSplit$default.get(1)));
                        return true;
                    }
                } else if (StringsKt__StringsJVMKt.startsWith$default(str, UserConfig.KEY_LITE_SCENE_ORDER, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean isRTLDirection() {
        return q8p.a(Locale.getDefault()) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long versionCode_delegate$lambda$1() {
        return AppVersionUtil.INSTANCE.getAppVersionCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String versionName_delegate$lambda$0() {
        return AppVersionUtil.INSTANCE.getAppVersionName();
    }

    public final boolean appInstalled(@NotNull Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        return MarketUtil.checkAppInstalled(context, pkgName);
    }

    public final void goMiOrPlayMarket() {
        if (isPlayChannel) {
            goPlayStore();
        } else {
            goMiMarket();
        }
    }

    public final void goToUriPage(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(ApplicationExtKt.getApplication().getPackageManager()) != null) {
                intent.setFlags(268435456);
                context.startActivity(intent);
            } else {
                Logger.i(TAG, "goToUriPage,but cannot find page");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean hasInit() {
        return sApp != null;
    }

    public final void init(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        if (sApp != null) {
            throw new AndroidRuntimeException("App already init");
        }
        sApp = app;
    }

    public final boolean isDevChannel() {
        return isDevChannel;
    }

    public final boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean isPlayChannel() {
        return isPlayChannel;
    }

    public final void setDevChannel(boolean z) {
        isDevChannel = z;
    }

    public final void setPlayChannel(boolean z) {
        isPlayChannel = z;
    }

    public final boolean supportMiuiFunction() {
        return TextUtils.equals(getApp().getPackageName(), "com.mi.health") && RomUtils.isXiaomi() && !SystemProperties.INSTANCE.isGlobalMiuiRom();
    }
}

package com.mi.health.appupgrade;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.mi.health.appupgrade.AppUpgradeUtil;
import com.mi.health.appupgrade.model.AppUpgradeResult;
import com.mi.health.appupgrade.net.AppUpgradeRequest;
import com.mi.health.appupgrade.ui.AppUpgradeActivity;
import com.mi.health.appupgrade.util.AppUpgradePreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.av6;
import defpackage.bzi;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u0010\u001a\u00020\u0011J$\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/mi/health/appupgrade/AppUpgradeUtil;", "", "<init>", "()V", "TAG", "", "request", "Lcom/mi/health/appupgrade/net/AppUpgradeRequest;", "getRequest", "()Lcom/mi/health/appupgrade/net/AppUpgradeRequest;", "appUpgradeResult", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "getAppUpgradeResult", "()Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "setAppUpgradeResult", "(Lcom/mi/health/appupgrade/model/AppUpgradeResult;)V", "hasNewVersion", "", "getHasNewVersion", "()Z", "setHasNewVersion", "(Z)V", "mRequestProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "doCheckAppUpgrade", "", "manager", "Landroidx/fragment/app/FragmentManager;", "isMine", "isSync", "showUpdateDialogIfNeed", "fragmentManager", "updateResponse", "goToAppUpgradeActivity", "isForce", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppUpgradeUtil {

    @NotNull
    public static final String TAG = "AppUpgrade";

    @Nullable
    private static AppUpgradeResult appUpgradeResult;
    private static boolean hasNewVersion;

    @NotNull
    public static final AppUpgradeUtil INSTANCE = new AppUpgradeUtil();

    @NotNull
    private static final AppUpgradeRequest request = new AppUpgradeRequest();

    @NotNull
    private static final AtomicBoolean mRequestProcessing = new AtomicBoolean(false);

    private AppUpgradeUtil() {
    }

    public static /* synthetic */ void doCheckAppUpgrade$default(AppUpgradeUtil appUpgradeUtil, FragmentManager fragmentManager, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        appUpgradeUtil.doCheckAppUpgrade(fragmentManager, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCheckAppUpgrade$lambda$0(WeakReference reference, boolean z, boolean z2, AppUpgradeResult it) {
        Intrinsics.checkNotNullParameter(reference, "$reference");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentManager fragmentManager = (FragmentManager) reference.get();
        Logger.i(TAG, "request AppUpgrade success: " + it);
        mRequestProcessing.compareAndSet(true, false);
        appUpgradeResult = it;
        hasNewVersion = it.getNew_version() >= 0;
        if (z) {
            INSTANCE.goToAppUpgradeActivity(z2);
            return Unit.INSTANCE;
        }
        int new_version = it.getNew_version();
        if (new_version != 0) {
            if (new_version == 1) {
                if (System.currentTimeMillis() - AppUpgradePreference.INSTANCE.getAPP_UPGRADE_LAST_SHOW_TIME() >= TimeUnit.DAYS.toMillis(1L)) {
                    INSTANCE.showUpdateDialogIfNeed(fragmentManager, it, z2);
                }
            } else if (new_version == 2) {
                INSTANCE.showUpdateDialogIfNeed(fragmentManager, it, z2);
            }
        } else if (it.getNew_version_code() > AppUpgradePreference.INSTANCE.getAPP_UPGRADE_LAST_VERSION_CODE()) {
            INSTANCE.showUpdateDialogIfNeed(fragmentManager, it, z2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCheckAppUpgrade$lambda$1(boolean z, ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), bzi.f4750a);
        }
        mRequestProcessing.compareAndSet(true, false);
        Logger.i(TAG, "request AppUpgrade failed: " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToAppUpgradeActivity(boolean isForce) {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) AppUpgradeActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(AppUpgradeActivity.KEY_APP_FORCE_UPGRADE, isForce);
        app.startActivity(intent);
    }

    private final void showUpdateDialogIfNeed(FragmentManager fragmentManager, final AppUpgradeResult updateResponse, boolean isSync) {
        if (fragmentManager == null) {
            Logger.i(TAG, "showUpdateDialogIfNeed fm is null");
            return;
        }
        Fragment fragmentL0 = fragmentManager.l0("guide_upgrade");
        if ((fragmentL0 instanceof CommonDialog) && ((CommonDialog) fragmentL0).isShowing()) {
            Logger.i(TAG, "showUpdateDialogIfNeed isShowing");
            return;
        }
        final boolean z = updateResponse.getNew_version() == 2 || isSync;
        DialogParams.DialogDescriptionString dialogDescriptionString = new DialogParams.DialogDescriptionString(bzi.g, new Object[0]);
        CommonDialog.c canceledOnTouchOutside = new CommonDialog.c("guide_upgrade").setDialogTitle(dialogDescriptionString).setDialogDescriptionString(new DialogParams.DialogDescriptionString(bzi.c, new Object[0])).setPositiveText(bzi.d).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false);
        if (!z) {
            canceledOnTouchOutside.setNegativeText(bzi.o);
        }
        CommonDialog commonDialogCreate = canceledOnTouchOutside.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.mi.health.appupgrade.AppUpgradeUtil.showUpdateDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        AppUpgradePreference appUpgradePreference = AppUpgradePreference.INSTANCE;
                        appUpgradePreference.setAPP_UPGRADE_LAST_SHOW_TIME(System.currentTimeMillis());
                        appUpgradePreference.setAPP_UPGRADE_LAST_VERSION_CODE(updateResponse.getNew_version_code());
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                }
                if (!z && dialog != null) {
                    dialog.dismiss();
                }
                AppUpgradeUtil appUpgradeUtil = AppUpgradeUtil.INSTANCE;
                appUpgradeUtil.setAppUpgradeResult(updateResponse);
                appUpgradeUtil.goToAppUpgradeActivity(z);
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public static /* synthetic */ void showUpdateDialogIfNeed$default(AppUpgradeUtil appUpgradeUtil, FragmentManager fragmentManager, AppUpgradeResult appUpgradeResult2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        appUpgradeUtil.showUpdateDialogIfNeed(fragmentManager, appUpgradeResult2, z);
    }

    public final void doCheckAppUpgrade(@NotNull FragmentManager manager, final boolean isMine, final boolean isSync) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), bzi.common_hint_network_unavailable);
            return;
        }
        if (!mRequestProcessing.compareAndSet(false, true) && !isMine) {
            Logger.i(TAG, "doCheckAppUpgrade processing .. ");
            return;
        }
        String str = ApplicationExtKt.getApplication().getApplicationInfo().packageName;
        AppVersionUtil appVersionUtil = AppVersionUtil.INSTANCE;
        String appVersionName = appVersionUtil.getAppVersionName();
        long appVersionCode = appVersionUtil.getAppVersionCode();
        Logger.i(TAG, "getAppUpgrade pkgName:" + str + " versionName:" + appVersionName + " versionCode:" + appVersionCode);
        final WeakReference weakReference = new WeakReference(manager);
        Function5 appUpgradeUtil$doCheckAppUpgrade$requestFunction$1 = isMine ? new AppUpgradeUtil$doCheckAppUpgrade$requestFunction$1(request) : new AppUpgradeUtil$doCheckAppUpgrade$requestFunction$2(request);
        Intrinsics.checkNotNull(str);
        appUpgradeUtil$doCheckAppUpgrade$requestFunction$1.invoke(str, appVersionName, Long.valueOf(appVersionCode), new Function1() { // from class: fi1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppUpgradeUtil.doCheckAppUpgrade$lambda$0(weakReference, isMine, isSync, (AppUpgradeResult) obj);
            }
        }, new Function1() { // from class: gi1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppUpgradeUtil.doCheckAppUpgrade$lambda$1(isMine, (ApiException) obj);
            }
        });
    }

    @Nullable
    public final AppUpgradeResult getAppUpgradeResult() {
        return appUpgradeResult;
    }

    public final boolean getHasNewVersion() {
        return hasNewVersion;
    }

    @NotNull
    public final AppUpgradeRequest getRequest() {
        return request;
    }

    public final boolean hasNewVersion() {
        return hasNewVersion;
    }

    public final void setAppUpgradeResult(@Nullable AppUpgradeResult appUpgradeResult2) {
        appUpgradeResult = appUpgradeResult2;
    }

    public final void setHasNewVersion(boolean z) {
        hasNewVersion = z;
    }
}

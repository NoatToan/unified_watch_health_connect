package com.xiaomi.fitness.about;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResultLauncher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.about.preference.SettingPreference;
import com.xiaomi.fitness.about.setting.DeviceDualAuthorizationActivity;
import com.xiaomi.fitness.about.setting.SettingActivity;
import com.xiaomi.fitness.about.setting.SettingActivityKt;
import com.xiaomi.fitness.about.utils.AboutUrlsKt;
import com.xiaomi.fitness.about.version.YRNPluginVersionActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import defpackage.av6;
import defpackage.lzi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/about/AboutManagerImpl;", "Lcom/xiaomi/fitness/about/export/AboutManager;", "<init>", "()V", "gotoAboutActivity", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "gotoSettingActivity", SettingActivityKt.KEY_PARAMS_IS_V4, "", "gotoPluginVersionActivity", "isCoachMale", "getNotUploadGpsEnable", "addNotUploadGpsEnableListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "setNotUploadGpsEnable", "notUpload", "getPrivacyPageInfo", "Lkotlin/Pair;", "", "showHealthDeviceAccessSwitchDialog", "Landroidx/fragment/app/FragmentActivity;", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AboutManagerImpl implements AboutManager {
    @Override // com.xiaomi.fitness.about.export.AboutManager
    public void addNotUploadGpsEnableListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        SettingPreference.INSTANCE.addNotUploadGpsEnableListener(listener);
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public boolean getNotUploadGpsEnable() {
        return SettingPreference.INSTANCE.getNotUploadGpsEnable();
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    @NotNull
    public Pair<String, String> getPrivacyPageInfo() {
        return new Pair<>(AboutUrlsKt.getWatchUserLicenceHtmlUrlOnFirst(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app"), ResourceExtKt.getString(lzi.j));
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public void gotoAboutActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, AboutActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public void gotoPluginVersionActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, YRNPluginVersionActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public void gotoSettingActivity(@NotNull Activity activity, boolean isV4) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.putExtra(SettingActivityKt.KEY_PARAMS_IS_V4, isV4);
        intent.setClass(activity, SettingActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public boolean isCoachMale() {
        return SettingPreference.INSTANCE.isCoachMale();
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public void setNotUploadGpsEnable(boolean notUpload) {
        SettingPreference.INSTANCE.setNotUploadGpsEnable(notUpload);
    }

    @Override // com.xiaomi.fitness.about.export.AboutManager
    public void showHealthDeviceAccessSwitchDialog(@NotNull final FragmentActivity activity, @NotNull final ActivityResultLauncher<Intent> activityForResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityForResult, "activityForResult");
        CommonDialog commonDialogCreate = new CommonDialog.c("healthDeviceAccessSwitchDialog").setDialogTitle(lzi.e0).setDialogDescription(lzi.d0).setPositiveText(lzi.h0).setNegativeText(lzi.V).setCancelable(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.AboutManagerImpl.showHealthDeviceAccessSwitchDialog.1
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
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    activityForResult.launch(new Intent(activity, (Class<?>) DeviceDualAuthorizationActivity.class));
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }
}

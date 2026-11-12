package com.xiaomi.fitness.rn.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.settings.ui.DeviceUpdateActivity;
import com.xiaomi.fitness.rn.settings.ui.RnDeviceNameSetActivity;
import com.xiaomi.fitness.rn.settings.ui.RnPolicyActivity;
import com.xiaomi.fitness.rn.settings.util.RnBitmapShareDialog;
import com.xiaomi.fitness.rn.settings.util.RnDeviceDeleteDialog;
import com.xiaomi.fitness.rn.settings.util.RnDeviceRenameDialog;
import com.xiaomi.fitness.rn.settings.util.RnPluginOpenUtil;
import com.xiaomi.fitness.rn.settings.util.RnUserLicenseUriDialog;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J<\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u0011H\u0016JF\u0010\u0012\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011H\u0016JN\u0010\u0017\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0011H\u0016JL\u0010\u001d\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0016J \u0010!\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0016J2\u0010#\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0016¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/RnSettingsExportApiImpl;", "Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi;", "<init>", "()V", "openSetDeviceNamePage", "", "context", "Landroid/content/Context;", "mac", "", "name", "showRenameDeviceDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "did", "callBack", "Lkotlin/Function1;", "showDeleteDeviceDialog", "title", "pid", "", "", "showUserLicenseUriDialog", "deviceName", "agreementURL", "privacyURL", "privacyChangedContent", "agreeCallback", "openLawPolicyPageForResult", "revokePrivacyContent", AccountInteractActivity.KEY_REQUEST_CODE, "privacyId", "gotoOtaUpdateActivity", "type", "openShareBitmapWindow", "description", "imageUri", "onPluginOpened", "deviceModel", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnSettingsExportApiImpl implements RnSettingsExportApi {

    @NotNull
    private static final String TAG = "RnSettingsExportApiImpl";

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void gotoOtaUpdateActivity(@NotNull Activity activity, @NotNull String did, int type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        Intent intent = new Intent(activity, (Class<?>) DeviceUpdateActivity.class);
        intent.putExtra("sDid", did);
        intent.putExtra("sType", type);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void onPluginOpened(@NotNull RNDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        RnPluginOpenUtil.INSTANCE.getInstance().onPluginOpen(deviceModel);
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void openLawPolicyPageForResult(@NotNull Activity activity, @NotNull String did, int pid, @Nullable String agreementURL, @NotNull String privacyURL, @Nullable String revokePrivacyContent, int requestCode, int privacyId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyURL, "privacyURL");
        RnPolicyActivity.INSTANCE.launch(activity, did, pid, agreementURL, privacyURL, revokePrivacyContent, requestCode, privacyId);
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void openSetDeviceNamePage(@NotNull Context context, @NotNull String mac, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
        RnDeviceNameSetActivity.INSTANCE.launch(context, mac, name);
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void openShareBitmapWindow(@NotNull WeakReference<Activity> activity, @Nullable String title, @Nullable String description, @NotNull String imageUri) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        new RnBitmapShareDialog(activity, title, description, imageUri).show();
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void showDeleteDeviceDialog(@NotNull WeakReference<Activity> activity, @Nullable String title, @NotNull String did, int pid, @Nullable Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        new RnDeviceDeleteDialog(activity, title, did, pid, callBack).show();
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void showRenameDeviceDialog(@NotNull WeakReference<Activity> activity, @NotNull String did, @NotNull String name, @NotNull Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        new RnDeviceRenameDialog(activity, did, name, callBack).show();
    }

    @Override // com.xiaomi.fitness.rn.export.RnSettingsExportApi
    public void showUserLicenseUriDialog(@NotNull WeakReference<Activity> activity, @NotNull String deviceName, @Nullable String agreementURL, @NotNull String privacyURL, @Nullable String privacyChangedContent, @NotNull Function1<? super Boolean, Unit> agreeCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(privacyURL, "privacyURL");
        Intrinsics.checkNotNullParameter(agreeCallback, "agreeCallback");
        new RnUserLicenseUriDialog(activity, deviceName, agreementURL, privacyURL, privacyChangedContent, agreeCallback).show();
    }
}

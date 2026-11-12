package com.xiaomi.fitness.rn.export;

import android.app.Activity;
import android.content.Context;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 '2\u00020\u0001:\u0001'J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J<\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u000fH&JH\u0010\u0010\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH&JN\u0010\u0015\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u000fH&JL\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H&J2\u0010!\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u0007H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H&¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi;", "", "openSetDeviceNamePage", "", "context", "Landroid/content/Context;", "mac", "", "name", "showRenameDeviceDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "did", "callBack", "Lkotlin/Function1;", "showDeleteDeviceDialog", "title", "pid", "", "", "showUserLicenseUriDialog", "deviceName", "agreementURL", "privacyURL", "privacyChangedContent", "agreeCallback", "openLawPolicyPageForResult", "revokePrivacyContent", AccountInteractActivity.KEY_REQUEST_CODE, "privacyId", "gotoOtaUpdateActivity", "type", "openShareBitmapWindow", "description", "imageUri", "onPluginOpened", "deviceModel", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "Companion", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RnSettingsExportApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/rn/export/RnSettingsExportApi$Companion;", "", "<init>", "()V", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showDeleteDeviceDialog$default(RnSettingsExportApi rnSettingsExportApi, WeakReference weakReference, String str, String str2, int i, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDeleteDeviceDialog");
            }
            if ((i2 & 16) != 0) {
                function1 = null;
            }
            rnSettingsExportApi.showDeleteDeviceDialog(weakReference, str, str2, i, function1);
        }
    }

    void gotoOtaUpdateActivity(@NotNull Activity activity, @NotNull String did, int type);

    void onPluginOpened(@NotNull RNDeviceModel deviceModel);

    void openLawPolicyPageForResult(@NotNull Activity activity, @NotNull String did, int pid, @Nullable String agreementURL, @NotNull String privacyURL, @Nullable String revokePrivacyContent, int requestCode, int privacyId);

    void openSetDeviceNamePage(@NotNull Context context, @NotNull String mac, @NotNull String name);

    void openShareBitmapWindow(@NotNull WeakReference<Activity> activity, @Nullable String title, @Nullable String description, @NotNull String imageUri);

    void showDeleteDeviceDialog(@NotNull WeakReference<Activity> activity, @Nullable String title, @NotNull String did, int pid, @Nullable Function1<? super Boolean, Unit> callBack);

    void showRenameDeviceDialog(@NotNull WeakReference<Activity> activity, @NotNull String did, @NotNull String name, @NotNull Function1<? super String, Unit> callBack);

    void showUserLicenseUriDialog(@NotNull WeakReference<Activity> activity, @NotNull String deviceName, @Nullable String agreementURL, @NotNull String privacyURL, @Nullable String privacyChangedContent, @NotNull Function1<? super Boolean, Unit> agreeCallback);
}

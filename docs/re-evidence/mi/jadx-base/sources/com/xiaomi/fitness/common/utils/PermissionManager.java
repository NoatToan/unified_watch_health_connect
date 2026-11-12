package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/common/utils/PermissionManager;", "", "<init>", "()V", "ACTION_APP_DETAIL", "", "ACTION_APP_DETAIL_2", "ACTION_APP_PERMISSION_EDITOR", "PKG_MIUI_SECURITY_CENTER", "EXTRA_PACKAGE_NAME", "EXTRA_PACKAGE_NAME_PREM_EDITOR", "PERMISSION_AUTO_START", "TAG", "openPermissionEditorPage", "", "context", "Landroid/content/Context;", "getPermissionEditorIntent", "Landroid/content/Intent;", "getAppDetailSettingsIntent", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionManager {

    @NotNull
    public static final PermissionManager INSTANCE = new PermissionManager();

    @NotNull
    private static final String ACTION_APP_DETAIL = "miui.intent.action.APP_MANAGER_APPLICATION_DETAIL";

    @NotNull
    private static final String ACTION_APP_DETAIL_2 = "android.settings.APPLICATION_DETAILS_SETTINGS";

    @NotNull
    private static final String ACTION_APP_PERMISSION_EDITOR = Constants.ACTION_APP_PERM_EDITOR;

    @NotNull
    private static final String PKG_MIUI_SECURITY_CENTER = Constants.PACKAGE_NAME_SECURITYCENTER;

    @NotNull
    private static final String EXTRA_PACKAGE_NAME = "package_name";

    @NotNull
    private static final String EXTRA_PACKAGE_NAME_PREM_EDITOR = Constants.EXTRA_PKG_NAME;

    @NotNull
    private static final String PERMISSION_AUTO_START = "auto_start";

    @NotNull
    private static final String TAG = "PermissionManager";

    private PermissionManager() {
    }

    private final Intent getAppDetailSettingsIntent(Context context) {
        Objects.requireNonNull(context);
        String packageName = context.getPackageName();
        Intent intent = new Intent(ACTION_APP_DETAIL_2);
        intent.setData(Uri.fromParts("package", packageName, null));
        return intent;
    }

    private final Intent getPermissionEditorIntent(Context context) {
        Objects.requireNonNull(context);
        Intent intent = new Intent(ACTION_APP_PERMISSION_EDITOR).putExtra(EXTRA_PACKAGE_NAME_PREM_EDITOR, context.getPackageName()).setPackage(PKG_MIUI_SECURITY_CENTER);
        Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
        return intent;
    }

    public final boolean openPermissionEditorPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        try {
            Intent permissionEditorIntent = getPermissionEditorIntent(context);
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (!uIUtils.isIntentAvailable(context, permissionEditorIntent)) {
                String str = TAG;
                Logger.d(str, "can't open miui permission editor page, intent = %s", permissionEditorIntent.toUri(0), new Object[0]);
                permissionEditorIntent = getAppDetailSettingsIntent(context);
                if (!uIUtils.isIntentAvailable(context, permissionEditorIntent)) {
                    Logger.e(str, "can't open app detail settings, intent = %s", permissionEditorIntent.toUri(0), new Object[0]);
                    return false;
                }
            }
            context.startActivity(permissionEditorIntent);
            return true;
        } catch (Exception e) {
            Logger.d(TAG, "can't open permission editor page", e);
            return false;
        }
    }
}

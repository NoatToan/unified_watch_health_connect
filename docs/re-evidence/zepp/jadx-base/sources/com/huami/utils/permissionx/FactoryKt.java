package com.huami.utils.permissionx;

import android.app.Activity;
import androidx.view.result.ActivityResultRegistry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\n"}, d2 = {"Landroid/app/Activity;", "activity", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "showRationale", "Lcom/huami/utils/permissionx/AppSettingsRationale;", "appSetting", "Lcom/huami/utils/permissionx/RequestMultiplePermissions;", "createRequestMultiple", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class FactoryKt {
    @NotNull
    public static final RequestMultiplePermissions createRequestMultiple(@NotNull Activity activity, @NotNull ActivityResultRegistry activityResultRegistry, @Nullable MultiplePermissionRationale multiplePermissionRationale, @Nullable AppSettingsRationale appSettingsRationale) {
        return new RequestMultiplePermissionsImpl(new PlatformApiImpl(activity, activityResultRegistry), multiplePermissionRationale, appSettingsRationale);
    }
}

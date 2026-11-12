package com.huami.lib.v2;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.huami.utils.easypermission.EasyPermissions;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001\u001a%\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/app/Activity;", "", PointCategory.PERMISSION, "", "permanentlyDenied", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "", "hasPermission", "(Landroid/content/Context;[Ljava/lang/String;)Z", "zeppPermission_release"}, k = 2, mv = {1, 5, 1})
public final class ZeppPermissionManagerKt {
    public static final boolean hasPermission(@NotNull Context context, @NotNull String... strArr) {
        return EasyPermissions.hasPermissions(context, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean permanentlyDenied(@NotNull Activity activity, @NotNull String str) {
        return EasyPermissions.permissionPermanentlyDenied(activity, str);
    }

    public static final boolean permanentlyDenied(@NotNull Fragment fragment, @NotNull String str) {
        return EasyPermissions.permissionPermanentlyDenied(fragment, str);
    }
}

package com.permissionx.guolindev;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.permissionx.guolindev.dialog.PermissionMapKt;
import com.permissionx.guolindev.request.PermissionBuilder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/permissionx/guolindev/PermissionMediator;", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "permissions", "Lcom/permissionx/guolindev/request/PermissionBuilder;", "", "", "([Ljava/lang/String;)Lcom/permissionx/guolindev/request/PermissionBuilder;", "", "permissionx_release"}, k = 1, mv = {1, 4, 2})
public final class PermissionMediator {
    private FragmentActivity activity;
    private Fragment fragment;

    public PermissionMediator(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    @NotNull
    public final PermissionBuilder permissions(@NotNull List<String> permissions) {
        int i;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i2 = Build.VERSION.SDK_INT;
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity != null) {
            Intrinsics.checkNotNull(fragmentActivity);
            i = fragmentActivity.getApplicationInfo().targetSdkVersion;
        } else {
            Fragment fragment = this.fragment;
            Intrinsics.checkNotNull(fragment);
            Context context = fragment.getContext();
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNullExpressionValue(context, "fragment!!.context!!");
            i = context.getApplicationInfo().targetSdkVersion;
        }
        for (String str : permissions) {
            if (PermissionMapKt.getAllSpecialPermissions().contains(str)) {
                linkedHashSet2.add(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i2 == 29 || (i2 == 30 && i < 30))) {
            linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return new PermissionBuilder(this.activity, this.fragment, linkedHashSet, linkedHashSet2);
    }

    public PermissionMediator(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    @NotNull
    public final PermissionBuilder permissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return permissions(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(permissions, permissions.length)));
    }
}

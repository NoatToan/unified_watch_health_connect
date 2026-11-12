package com.xiaomi.fitness.common.permission;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.enk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u00011B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b.\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ)\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/common/permission/MiuiPermission;", "", "", "checkParamValid", "()V", "removeInvisibleFragment", "", "permission", "description", "(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/common/permission/MiuiPermission;", "", "permissions", "descriptions", "(Ljava/util/List;Ljava/util/List;)Lcom/xiaomi/fitness/common/permission/MiuiPermission;", "Lenk;", "callback", "request", "(Lenk;)V", "", "allGranted", "grantedList", "deniedList", "endRequest$common_release", "(ZLjava/util/List;Ljava/util/List;)V", "endRequest", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "permissionList", "Ljava/util/List;", "descList", "requestCallback", "Lenk;", "inRequestFlow", "Z", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/xiaomi/fitness/common/permission/PermissionInvisibleFragment;", "getInvisibleFragment", "()Lcom/xiaomi/fitness/common/permission/PermissionInvisibleFragment;", "invisibleFragment", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "(Landroidx/fragment/app/Fragment;)V", "Companion", "common_release"}, k = 1, mv = {2, 0, 0})
public final class MiuiPermission {

    @NotNull
    private static final String FRAGMENT_TAG = "PermissionInvisibleFragment";

    @NotNull
    public static final String TAG = "MiuiPermission";

    @Nullable
    private FragmentActivity activity;

    @Nullable
    private List<String> descList;

    @Nullable
    private Fragment fragment;
    private boolean inRequestFlow;

    @Nullable
    private List<String> permissionList;

    @Nullable
    private enk requestCallback;

    public MiuiPermission(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    private final void checkParamValid() {
        if (this.activity == null && this.fragment == null) {
            throw new IllegalStateException("activity and fragment can not both be null !");
        }
        if (ArrayUtils.isEmpty(this.permissionList)) {
            throw new IllegalStateException("permissionList can not be null !");
        }
    }

    private final FragmentManager getFragmentManager() {
        FragmentManager childFragmentManager;
        Fragment fragment = this.fragment;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            return childFragmentManager;
        }
        FragmentActivity fragmentActivity = this.activity;
        Intrinsics.checkNotNull(fragmentActivity);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }

    private final PermissionInvisibleFragment getInvisibleFragment() {
        PermissionInvisibleFragment permissionInvisibleFragment;
        try {
            Fragment fragmentL0 = getFragmentManager().l0(FRAGMENT_TAG);
            Logger.i(TAG, "findFragmentByTag existedFragment is " + fragmentL0);
            if (fragmentL0 != null) {
                permissionInvisibleFragment = (PermissionInvisibleFragment) fragmentL0;
            } else {
                permissionInvisibleFragment = new PermissionInvisibleFragment();
                getFragmentManager().o().f(permissionInvisibleFragment, FRAGMENT_TAG).o();
            }
            return permissionInvisibleFragment;
        } catch (Exception e) {
            Logger.i(TAG, "get invisibleFragment exception " + e);
            return null;
        }
    }

    private final void removeInvisibleFragment() {
        Fragment fragmentL0 = getFragmentManager().l0(FRAGMENT_TAG);
        Logger.i(TAG, "removeInvisibleFragment " + fragmentL0);
        if (fragmentL0 != null) {
            try {
                getFragmentManager().o().v(fragmentL0).o();
            } catch (Exception e) {
                Logger.i(TAG, "removeInvisibleFragment exception " + e);
            }
        }
    }

    public final void endRequest$common_release(boolean allGranted, @NotNull List<String> grantedList, @NotNull List<String> deniedList) {
        Intrinsics.checkNotNullParameter(grantedList, "grantedList");
        Intrinsics.checkNotNullParameter(deniedList, "deniedList");
        Logger.i(TAG, "end request grantedList " + grantedList + "; deniedList " + deniedList);
        removeInvisibleFragment();
        this.inRequestFlow = false;
        enk enkVar = this.requestCallback;
        if (enkVar != null) {
            Intrinsics.checkNotNull(enkVar);
            enkVar.onResult(allGranted, grantedList, deniedList);
        }
    }

    @NotNull
    public final MiuiPermission permission(@NotNull String permission, @NotNull String description) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(description, "description");
        this.permissionList = CollectionsKt__CollectionsJVMKt.listOf(permission);
        this.descList = CollectionsKt__CollectionsJVMKt.listOf(description);
        return this;
    }

    @NotNull
    public final MiuiPermission permissions(@NotNull List<String> permissions, @NotNull List<String> descriptions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        this.permissionList = permissions;
        this.descList = descriptions;
        return this;
    }

    public final void request(@Nullable enk callback) {
        if (this.inRequestFlow) {
            return;
        }
        Logger.i(TAG, "start request permissionList " + this.permissionList + "; descList " + this.descList);
        this.inRequestFlow = true;
        this.requestCallback = callback;
        checkParamValid();
        PermissionInvisibleFragment invisibleFragment = getInvisibleFragment();
        if (invisibleFragment != null) {
            List<String> list = this.permissionList;
            Intrinsics.checkNotNull(list);
            invisibleFragment.requestNow(this, list, this.descList);
        }
    }

    public MiuiPermission(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }
}

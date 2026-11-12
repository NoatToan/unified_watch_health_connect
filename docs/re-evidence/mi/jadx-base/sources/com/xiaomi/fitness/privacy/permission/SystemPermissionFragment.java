package com.xiaomi.fitness.privacy.permission;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.privacy.permission.PermissionAdapter;
import com.xiaomi.fitness.privacy.permission.SystemPermissionFragment;
import defpackage.r9i;
import defpackage.s0j;
import defpackage.wui;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/SystemPermissionFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/privacy/permission/SystemPermissionViewModel;", "Lr9i;", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;", "permissionItem", "", "onPermissionItemClicked", "(Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;)V", "Landroid/content/Context;", "context", "gotoNotificationAccessSetting", "(Landroid/content/Context;)V", "gotoNotificationPolicyAccessSetting", "oneTrackSettingsSystemPermissionsReview", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "setListener", "", "onBackPressed", "()Z", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter;", "mAdapter", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter;", "<init>", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SystemPermissionFragment extends BaseBindingFragment<SystemPermissionViewModel, r9i> {
    private PermissionAdapter mAdapter;

    public SystemPermissionFragment() {
        super(wui.c);
    }

    private final void gotoNotificationAccessSetting(Context context) {
        try {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final void gotoNotificationPolicyAccessSetting(Context context) {
        try {
            context.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void onPermissionItemClicked(PermissionAdapter.PermissionItem permissionItem) {
        PermissionHelper.Permission permission = permissionItem.getPermission();
        if (permission instanceof PermissionHelper.Permission.Notification) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            gotoNotificationAccessSetting(contextRequireContext);
        } else if (permission instanceof PermissionHelper.Permission.NotDisturb) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            gotoNotificationPolicyAccessSetting(contextRequireContext2);
        } else {
            PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            permissionsUtil.toPermissionSetting(fragmentActivityRequireActivity);
        }
    }

    private final void oneTrackSettingsSystemPermissionsReview() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36275"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_system_permissions")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(SystemPermissionFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        PermissionAdapter permissionAdapter = this$0.mAdapter;
        if (permissionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            permissionAdapter = null;
        }
        permissionAdapter.submitList(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$1(SystemPermissionFragment this$0, PermissionAdapter.PermissionItem item, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        this$0.onPermissionItemClicked(item);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        oneTrackSettingsSystemPermissionsReview();
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PermissionAdapter permissionAdapter = this.mAdapter;
        if (permissionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            permissionAdapter = null;
        }
        permissionAdapter.notifyDataChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.mAdapter = new PermissionAdapter();
        super.onViewCreated(view, savedInstanceState);
        setTitle(s0j.G);
        getMBinding().A.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        RecyclerView recyclerView = getMBinding().A;
        PermissionAdapter permissionAdapter = this.mAdapter;
        if (permissionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            permissionAdapter = null;
        }
        recyclerView.setAdapter(permissionAdapter);
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((SystemPermissionViewModel) getMViewModel()).loadPermissionList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((SystemPermissionViewModel) getMViewModel()).observerPermissionItems(this, new Observer() { // from class: gwo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SystemPermissionFragment.setListener$lambda$0(this.f19406a, (List) obj);
            }
        });
        PermissionAdapter permissionAdapter = this.mAdapter;
        if (permissionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            permissionAdapter = null;
        }
        permissionAdapter.setOnItemClickListener(new Function2() { // from class: hwo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SystemPermissionFragment.setListener$lambda$1(this.f20549a, (PermissionAdapter.PermissionItem) obj, ((Integer) obj2).intValue());
            }
        });
    }
}

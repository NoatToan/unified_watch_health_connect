package com.xiaomi.xms.wearable.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.button.BaseSwitchButton;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.xms.wearable.auth.Permission;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.extensions.ExtensionsKt;
import com.xiaomi.xms.wearable.ui.PermissionManagementFragment;
import defpackage.psi;
import defpackage.vsr;
import defpackage.wvi;
import defpackage.x1j;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b=\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/PermissionManagementFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/xms/wearable/auth/Permission;", "permission", "", "isChecked", "", "doPermissionSwitch", "(Lcom/xiaomi/xms/wearable/auth/Permission;Z)V", "isPermissionContained", "(Lcom/xiaomi/xms/wearable/auth/Permission;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "finish", "()V", "", "packageName", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "", "permissions", "[Lcom/xiaomi/xms/wearable/auth/Permission;", "getPermissions", "()[Lcom/xiaomi/xms/wearable/auth/Permission;", "setPermissions", "([Lcom/xiaomi/xms/wearable/auth/Permission;)V", "isRequest", "Z", "()Z", "setRequest", "(Z)V", "Ljava/util/ArrayList;", "grantedPermission", "Ljava/util/ArrayList;", "Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "repository", "Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "Lvsr;", "mDataBinding", "Lvsr;", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "onDataManagerCheckedChangeCallback", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "onNotifyCheckedChangedCallback", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPermissionManagementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionManagementFragment.kt\ncom/xiaomi/xms/wearable/ui/PermissionManagementFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,139:1\n11158#2:140\n11493#2,3:141\n37#3:144\n36#3,3:145\n*S KotlinDebug\n*F\n+ 1 PermissionManagementFragment.kt\ncom/xiaomi/xms/wearable/ui/PermissionManagementFragment\n*L\n89#1:140\n89#1:141,3\n89#1:144\n89#1:145,3\n*E\n"})
public final class PermissionManagementFragment extends BaseFragment {

    @NotNull
    public static final String KEY_IS_REQUEST = "key_is_request";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "key_package_name";

    @NotNull
    public static final String KEY_PERMISSIONS = "key_permissions";

    @NotNull
    private final ArrayList<String> grantedPermission;
    private boolean isRequest;
    private vsr mDataBinding;

    @NotNull
    private final ISwitchButton.a onDataManagerCheckedChangeCallback;

    @NotNull
    private final ISwitchButton.a onNotifyCheckedChangedCallback;

    @NotNull
    private String packageName;

    @NotNull
    private Permission[] permissions;

    @NotNull
    private final WatchAppRepository repository;

    public PermissionManagementFragment() {
        super(0, 1, null);
        this.packageName = "";
        this.permissions = new Permission[0];
        this.grantedPermission = new ArrayList<>();
        this.repository = WatchAppRepository.INSTANCE.getInstance();
        this.onDataManagerCheckedChangeCallback = new ISwitchButton.a() { // from class: ish
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                PermissionManagementFragment.onDataManagerCheckedChangeCallback$lambda$0(this.f22047a, z, iSwitchButton);
            }
        };
        this.onNotifyCheckedChangedCallback = new ISwitchButton.a() { // from class: jsh
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                PermissionManagementFragment.onNotifyCheckedChangedCallback$lambda$1(this.f23090a, z, iSwitchButton);
            }
        };
    }

    private final void doPermissionSwitch(Permission permission, boolean isChecked) {
        if (this.isRequest) {
            if (isChecked) {
                this.grantedPermission.add(permission.a());
            } else {
                this.grantedPermission.remove(permission.a());
            }
        }
        this.repository.updatePermission(this.packageName, permission, isChecked);
    }

    private final boolean isPermissionContained(Permission permission) {
        for (Permission permission2 : this.permissions) {
            if (Intrinsics.areEqual(permission2.a(), permission.a())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataManagerCheckedChangeCallback$lambda$0(PermissionManagementFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Permission DEVICE_MANAGER = Permission.DEVICE_MANAGER;
        Intrinsics.checkNotNullExpressionValue(DEVICE_MANAGER, "DEVICE_MANAGER");
        this$0.doPermissionSwitch(DEVICE_MANAGER, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNotifyCheckedChangedCallback$lambda$1(PermissionManagementFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Permission NOTIFY = Permission.NOTIFY;
        Intrinsics.checkNotNullExpressionValue(NOTIFY, "NOTIFY");
        this$0.doPermissionSwitch(NOTIFY, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(PermissionManagementFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Permission permission : this$0.permissions) {
            if (this$0.grantedPermission.contains(permission.a())) {
                this$0.repository.updatePermission(this$0.packageName, permission, true);
            }
        }
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void finish() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        super.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return wvi.f38407a;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final Permission[] getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: isRequest, reason: from getter */
    public final boolean getIsRequest() {
        return this.isRequest;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        vsr vsrVarA0 = vsr.A0(inflater, container, false);
        this.mDataBinding = vsrVarA0;
        vsr vsrVar = null;
        if (vsrVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            vsrVarA0 = null;
        }
        setRootView(vsrVarA0.getRoot());
        vsr vsrVar2 = this.mDataBinding;
        if (vsrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
        } else {
            vsrVar = vsrVar2;
        }
        View root = vsrVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Permission[] permissionArr;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(x1j.D);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.packageName = arguments.getString(KEY_PACKAGE_NAME, "");
            Parcelable[] parcelableArray = arguments.getParcelableArray(KEY_PERMISSIONS);
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.xiaomi.xms.wearable.auth.Permission");
                    arrayList.add((Permission) parcelable);
                }
                permissionArr = (Permission[]) arrayList.toArray(new Permission[0]);
                if (permissionArr == null) {
                    permissionArr = new Permission[0];
                }
            } else {
                permissionArr = new Permission[0];
            }
            this.permissions = permissionArr;
            this.isRequest = arguments.getBoolean(KEY_IS_REQUEST, false);
        }
        Button button = (Button) getRootView().findViewById(psi.m);
        boolean z = this.isRequest;
        Intrinsics.checkNotNull(button);
        if (z) {
            ViewExtKt.visible(button);
        } else {
            ViewExtKt.gone(button);
        }
        vsr vsrVar = null;
        if (this.isRequest) {
            vsr vsrVar2 = this.mDataBinding;
            if (vsrVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
                vsrVar2 = null;
            }
            TextView revokePath = vsrVar2.H;
            Intrinsics.checkNotNullExpressionValue(revokePath, "revokePath");
            ViewExtKt.visible(revokePath);
        } else {
            vsr vsrVar3 = this.mDataBinding;
            if (vsrVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
                vsrVar3 = null;
            }
            TextView revokePath2 = vsrVar3.H;
            Intrinsics.checkNotNullExpressionValue(revokePath2, "revokePath");
            ViewExtKt.gone(revokePath2);
        }
        vsr vsrVar4 = this.mDataBinding;
        if (vsrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            vsrVar4 = null;
        }
        vsrVar4.A.setImageDrawable(ExtensionsKt.getAppIcon(this.packageName));
        String appName = ExtensionsKt.getAppName(this.packageName);
        vsr vsrVar5 = this.mDataBinding;
        if (vsrVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            vsrVar5 = null;
        }
        vsrVar5.B.setText(appName);
        vsr vsrVar6 = this.mDataBinding;
        if (vsrVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            vsrVar6 = null;
        }
        TextView textView = vsrVar6.G;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(x1j.G);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{appName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        WatchAppRepository watchAppRepository = this.repository;
        String str2 = this.packageName;
        Permission DEVICE_MANAGER = Permission.DEVICE_MANAGER;
        Intrinsics.checkNotNullExpressionValue(DEVICE_MANAGER, "DEVICE_MANAGER");
        boolean zIsPermissionGranted = watchAppRepository.isPermissionGranted(str2, DEVICE_MANAGER);
        if (this.isRequest) {
            Intrinsics.checkNotNullExpressionValue(DEVICE_MANAGER, "DEVICE_MANAGER");
            if (!isPermissionContained(DEVICE_MANAGER)) {
                vsr vsrVar7 = this.mDataBinding;
                if (vsrVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
                    vsrVar7 = null;
                }
                vsrVar7.C.setVisibility(8);
            }
        }
        vsr vsrVar8 = this.mDataBinding;
        if (vsrVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            vsrVar8 = null;
        }
        BaseSwitchButton.j(vsrVar8.C.getSwitchButton(), zIsPermissionGranted, this.onDataManagerCheckedChangeCallback);
        WatchAppRepository watchAppRepository2 = this.repository;
        String str3 = this.packageName;
        Permission NOTIFY = Permission.NOTIFY;
        Intrinsics.checkNotNullExpressionValue(NOTIFY, "NOTIFY");
        boolean zIsPermissionGranted2 = watchAppRepository2.isPermissionGranted(str3, NOTIFY);
        if (this.isRequest) {
            Intrinsics.checkNotNullExpressionValue(NOTIFY, "NOTIFY");
            if (!isPermissionContained(NOTIFY)) {
                vsr vsrVar9 = this.mDataBinding;
                if (vsrVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
                    vsrVar9 = null;
                }
                vsrVar9.F.setVisibility(8);
            }
        }
        vsr vsrVar10 = this.mDataBinding;
        if (vsrVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
        } else {
            vsrVar = vsrVar10;
        }
        BaseSwitchButton.j(vsrVar.F.getSwitchButton(), zIsPermissionGranted2, this.onNotifyCheckedChangedCallback);
        button.setOnClickListener(new View.OnClickListener() { // from class: hsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PermissionManagementFragment.onViewCreated$lambda$4(this.f20405a, view2);
            }
        });
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setPermissions(@NotNull Permission[] permissionArr) {
        Intrinsics.checkNotNullParameter(permissionArr, "<set-?>");
        this.permissions = permissionArr;
    }

    public final void setRequest(boolean z) {
        this.isRequest = z;
    }
}

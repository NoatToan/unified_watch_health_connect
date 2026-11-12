package com.xiaomi.fitness.main;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mi.health.qrcode.QRCodeExportKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.single.Weak;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTabManager;
import com.xiaomi.fitness.device.manager.export.DeviceTabManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.main.BaseMainFragmentDelegateImpl;
import com.xiaomi.fitness.main.export.BaseMainFragment;
import com.xiaomi.fitness.main.export.BaseMainFragmentDelegate;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import defpackage.a4i;
import defpackage.h0j;
import defpackage.hri;
import defpackage.lli;
import defpackage.nui;
import defpackage.o1f;
import defpackage.owi;
import defpackage.p2j;
import defpackage.sk5;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\bD\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bJI\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000 \"\b\b\u0000\u0010\u0019*\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\u00022\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b-\u0010.J)\u00101\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00105\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R/\u0010@\u001a\u0004\u0018\u00010&2\b\u0010:\u001a\u0004\u0018\u00010&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010.R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/main/BaseMainFragmentDelegateImpl;", "Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "Landroid/view/View;", "contentView", "", "setPagePadding", "(Landroid/view/View;)V", "requestCameraPermission", "()V", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "fragment", "onAttach", "(Landroid/content/Context;Lcom/xiaomi/fitness/main/export/BaseMainFragment;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;Landroid/view/View;)V", LifecycleConstantKt.ON_DESTROY, "Landroidx/databinding/ViewDataBinding;", "D", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "", "layoutId", "Lkotlin/Pair;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;I)Lkotlin/Pair;", "view", "onViewCreated", "(Landroid/view/View;Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lkotlin/Function1;", "Landroid/view/MenuItem;", "onMenuClickListener", "showPopupMenu", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "scanToAddDevice", "(Landroidx/fragment/app/FragmentActivity;)V", "Lkotlin/Function0;", "callback", "addDevice", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "mContext", "Landroid/content/Context;", "mFragment", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "Lo1f;", "mBinding", "Lo1f;", "<set-?>", "mActivity$delegate", "Lcom/xiaomi/fitness/common/single/Weak;", "getMActivity", "()Landroidx/fragment/app/FragmentActivity;", "setMActivity", "mActivity", "La4i;", "mPopupMenu", "La4i;", "<init>", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseMainFragmentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMainFragmentDelegateImpl.kt\ncom/xiaomi/fitness/main/BaseMainFragmentDelegateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class BaseMainFragmentDelegateImpl implements BaseMainFragmentDelegate {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseMainFragmentDelegateImpl.class, "mActivity", "getMActivity()Landroidx/fragment/app/FragmentActivity;", 0))};

    /* JADX INFO: renamed from: mActivity$delegate, reason: from kotlin metadata */
    @NotNull
    private final Weak mActivity = new Weak();
    private o1f mBinding;
    private Context mContext;
    private BaseMainFragment<?, ?> mFragment;

    @Nullable
    private a4i mPopupMenu;

    private final FragmentActivity getMActivity() {
        return (FragmentActivity) this.mActivity.getValue(this, $$delegatedProperties[0]);
    }

    private final void requestCameraPermission() {
        if (getMActivity() == null) {
            return;
        }
        if (!PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.CAMERA"})) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                QRCodeExportKt.launchToQRCodeScan$default(mActivity, null, null, false, false, null, 31, null);
                return;
            }
            return;
        }
        final Function0 function0 = new Function0() { // from class: d92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMainFragmentDelegateImpl.requestCameraPermission$lambda$10(this.f15244a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            PermissionsUtil.INSTANCE.showCameraPermissionDialog(mActivity2, "android.permission.CAMERA", new PermissionsUtil.PermissionAuthDialogAgreeListener() { // from class: com.xiaomi.fitness.main.BaseMainFragmentDelegateImpl$requestCameraPermission$1$1
                @Override // com.xiaomi.fitness.baseui.utils.PermissionsUtil.PermissionAuthDialogAgreeListener
                public void onAuthDialogAgree(String permission) {
                    Intrinsics.checkNotNullParameter(permission, "permission");
                    function0.invoke();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$10(final BaseMainFragmentDelegateImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            PermissionExtKt.permission(mActivity, "android.permission.CAMERA", ResourceExtKt.getString(h0j.u), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: y82
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseMainFragmentDelegateImpl.requestCameraPermission$lambda$10$lambda$9(this.f39915a, (PermissionBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$10$lambda$9(final BaseMainFragmentDelegateImpl this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: b92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseMainFragmentDelegateImpl.requestCameraPermission$lambda$10$lambda$9$lambda$5(this.f3936a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: c92
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseMainFragmentDelegateImpl.requestCameraPermission$lambda$10$lambda$9$lambda$8(this.f5065a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$10$lambda$9$lambda$5(BaseMainFragmentDelegateImpl this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            QRCodeExportKt.launchToQRCodeScan$default(mActivity, null, null, false, false, null, 31, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$10$lambda$9$lambda$8(BaseMainFragmentDelegateImpl this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        final FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, mActivity, null, null, null, new Function0() { // from class: a92
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseMainFragmentDelegateImpl.requestCameraPermission$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(mActivity, it);
                }
            }, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(FragmentActivity act, String it) {
        Intrinsics.checkNotNullParameter(act, "$act");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(act, it, false, null);
        return Unit.INSTANCE;
    }

    private final void setMActivity(FragmentActivity fragmentActivity) {
        this.mActivity.setValue(this, $$delegatedProperties[0], fragmentActivity);
    }

    private final void setPagePadding(View contentView) {
        if (contentView != null) {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            int dimen = (int) ResourceExtKt.getDimen(context, lli.f25202a);
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen, marginLayoutParams.bottomMargin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$3(Function1 function1, BaseMainFragmentDelegateImpl this$0, boolean z, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == hri.f) {
            if (!DeviceTabManagerExtKt.getInstance(DeviceTabManager.INSTANCE).isShowRecoveryCommonAppDialog()) {
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity != null) {
                    DeviceManagerExtKt.launchToAddDevice(mActivity);
                }
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36381"), "name", "Device_page_Adddevice", "status", Integer.valueOf(z ? 1 : 0), "position_name", "Upper_Right_Corner_Add");
            } else if (function1 != null) {
                function1.invoke2(menuItem);
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                bundle.putBoolean(MainTab.KEY_SHOW_CHOOSE_COMMON_APP, true);
                FragmentActivity mActivity2 = this$0.getMActivity();
                if (mActivity2 != null) {
                    MainExtKt.showMainActivity(mActivity2, null, bundle);
                }
            }
        } else if (itemId == hri.g) {
            this$0.requestCameraPermission();
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36381"), "name", "Device_page_Adddevice", "status", Integer.valueOf(z ? 1 : 0), "position_name", "Upper_Right_Corner_Scan");
        }
        return true;
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void addDevice(@Nullable FragmentActivity activity, @Nullable Function0<Unit> callback) {
        if (activity == null) {
            return;
        }
        if (getMActivity() == null || !Intrinsics.areEqual(getMActivity(), activity)) {
            setMActivity(activity);
        }
        if (!DeviceTabManagerExtKt.getInstance(DeviceTabManager.INSTANCE).isShowRecoveryCommonAppDialog()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                DeviceManagerExtKt.launchToAddDevice(mActivity);
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36381"), "name", "Device_page_Adddevice", "status", Integer.valueOf(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceSize() != 0 ? 1 : 0), "position_name", "Device_Card_Add");
            return;
        }
        if (callback != null) {
            callback.invoke();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        bundle.putBoolean(MainTab.KEY_SHOW_CHOOSE_COMMON_APP, true);
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            MainExtKt.showMainActivity(mActivity2, null, bundle);
        }
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void onAttach(@NotNull Context context, @NotNull BaseMainFragment<?, ?> fragment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.mContext = context;
        this.mFragment = fragment;
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void onConfigurationChanged(@NotNull Configuration newConfig, @Nullable View contentView) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setPagePadding(contentView);
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BaseMainFragment<?, ?> baseMainFragment = this.mFragment;
        if (baseMainFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            baseMainFragment = null;
        }
        baseMainFragment.setThemeRes(p2j.f29939a);
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void onDestroy() {
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    @NotNull
    public <D extends ViewDataBinding> Pair<View, D> onInflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState, int layoutId) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (layoutId == -1) {
            throw new IllegalArgumentException("The layoutId must be passed in the constructor or override layoutId");
        }
        o1f o1fVar = (o1f) sk5.j(inflater, nui.f28380b, container, false);
        this.mBinding = o1fVar;
        o1f o1fVar2 = null;
        if (o1fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            o1fVar = null;
        }
        ViewDataBinding viewDataBindingJ = sk5.j(inflater, layoutId, o1fVar.A, true);
        o1f o1fVar3 = this.mBinding;
        if (o1fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            o1fVar2 = o1fVar3;
        }
        return new Pair<>(o1fVar2.getRoot(), viewDataBindingJ);
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void onViewCreated(@NotNull View view, @Nullable View contentView, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setPagePadding(contentView);
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void scanToAddDevice(@Nullable FragmentActivity activity) {
        if (activity == null) {
            return;
        }
        if (getMActivity() == null || !Intrinsics.areEqual(getMActivity(), activity)) {
            setMActivity(activity);
        }
        requestCameraPermission();
    }

    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragmentDelegate
    public void showPopupMenu(@Nullable FragmentActivity activity, @NotNull View view, @Nullable final Function1<? super MenuItem, Unit> onMenuClickListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (activity == null) {
            return;
        }
        final ?? r3 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceSize() != 0 ? 1 : 0;
        if (getMActivity() == null || !Intrinsics.areEqual(getMActivity(), activity)) {
            setMActivity(activity);
        }
        a4i a4iVar = this.mPopupMenu;
        if (a4iVar != null) {
            a4iVar.c();
        }
        FragmentActivity mActivity = getMActivity();
        a4i a4iVar2 = mActivity != null ? new a4i(mActivity, view) : null;
        this.mPopupMenu = a4iVar2;
        if (a4iVar2 != null) {
            a4iVar2.f(owi.f29771a);
        }
        a4i a4iVar3 = this.mPopupMenu;
        if (a4iVar3 != null) {
            a4iVar3.setOnMenuItemClickListener(new a4i.c() { // from class: z82
                @Override // a4i.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return BaseMainFragmentDelegateImpl.showPopupMenu$lambda$3(onMenuClickListener, this, r3, menuItem);
                }
            });
        }
        a4i a4iVar4 = this.mPopupMenu;
        if (a4iVar4 != null) {
            a4iVar4.g();
        }
        IOnetrack.Companion companion = IOnetrack.INSTANCE;
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36380"), "name", "Device_page_Adddevice", "status", Integer.valueOf((int) r3), "position_name", "Upper_Right_Corner_Scan");
        OneTrackExtKt.getInstance(companion).reportData(new OneTrackStatBean("expose_v3", "56.51.0.1.36380"), "name", "Device_page_Adddevice", "status", Integer.valueOf((int) r3), "position_name", "Upper_Right_Corner_Add");
    }
}

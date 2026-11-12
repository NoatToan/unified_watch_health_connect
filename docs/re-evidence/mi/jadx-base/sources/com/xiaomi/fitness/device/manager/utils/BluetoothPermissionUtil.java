package com.xiaomi.fitness.device.manager.utils;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil;
import defpackage.av6;
import defpackage.uzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000fJ3\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000fH\u0007J1\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000fJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\rJX\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0002\u0010\u001aJP\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0005H\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0002JZ\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001828\u0010&\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\b0'¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/device/manager/utils/BluetoothPermissionUtil;", "", "<init>", "()V", "checkBluetoothPermission", "", "hasConnectPermission", "requestLocationPermission", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "finishOnReject", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "requestBluetoothPermission", "requestBluetoothIfNeed", "needRequestBluetoothPermission", "showBluetoothSyncDataDialogIfNeed", "resultCallback", "showPermissionTipDialogIfNeed", "permissionDesc", "", "", "permissions", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "requestBluetoothDialog", "descs", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isXiaoMiAlwaysAllow", "locationPermissionAlwaysAllow", "", "turnOnPermissionSetting", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "title", "", "settings", "callBack", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "resultCode", "Landroid/content/Intent;", "data", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothPermissionUtil {

    @NotNull
    public static final BluetoothPermissionUtil INSTANCE = new BluetoothPermissionUtil();

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil$showPermissionTipDialogIfNeed$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/device/manager/utils/BluetoothPermissionUtil$showPermissionTipDialogIfNeed$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends av6 {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function1<MultiplePermissionsBuilder, Unit> $extension;
        final /* synthetic */ boolean $finishOnReject;
        final /* synthetic */ String[] $permissionDesc;
        final /* synthetic */ String[] $permissions;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, boolean z, Function1<? super MultiplePermissionsBuilder, Unit> function1) {
            this.$activity = fragmentActivity;
            this.$permissions = strArr;
            this.$permissionDesc = strArr2;
            this.$finishOnReject = z;
            this.$extension = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(Function1 extension, MultiplePermissionsBuilder requestBluetoothDialog) {
            Intrinsics.checkNotNullParameter(extension, "$extension");
            Intrinsics.checkNotNullParameter(requestBluetoothDialog, "$this$requestBluetoothDialog");
            extension.invoke2(requestBluetoothDialog);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (dialog != null) {
                dialog.dismiss();
            }
            if (which != -1) {
                if (this.$finishOnReject) {
                    this.$activity.finish();
                    return;
                }
                return;
            }
            BluetoothPermissionUtil bluetoothPermissionUtil = BluetoothPermissionUtil.INSTANCE;
            FragmentActivity fragmentActivity = this.$activity;
            String[] strArr = this.$permissions;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            String[] strArr3 = this.$permissionDesc;
            final Function1<MultiplePermissionsBuilder, Unit> function1 = this.$extension;
            bluetoothPermissionUtil.requestBluetoothDialog(fragmentActivity, strArr2, strArr3, new Function1() { // from class: z23
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothPermissionUtil.AnonymousClass2.onDialogClick$lambda$0(function1, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }

    private BluetoothPermissionUtil() {
    }

    private final boolean isXiaoMiAlwaysAllow() {
        return !AppUtil.INSTANCE.isPlayChannel() && RomUtils.isXiaomi() && Build.VERSION.SDK_INT >= 29;
    }

    private final List<String> locationPermissionAlwaysAllow() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add(ResourceExtKt.getString(uzi.l1));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestBluetoothDialog(FragmentActivity activity, String[] permissions, String[] descs, Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        final MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        PermissionExtKt.permissions(activity, (String[]) Arrays.copyOf(permissions, permissions.length), descs, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: u23
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothPermissionUtil.requestBluetoothDialog$lambda$5(multiplePermissionsBuilder, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothDialog$lambda$5(final MultiplePermissionsBuilder pb, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: v23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BluetoothPermissionUtil.requestBluetoothDialog$lambda$5$lambda$3(pb);
            }
        });
        permissions.denied(new Function1() { // from class: w23
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothPermissionUtil.requestBluetoothDialog$lambda$5$lambda$4(pb, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothDialog$lambda$5$lambda$3(MultiplePermissionsBuilder pb) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        pb.getAllGranted().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothDialog$lambda$5$lambda$4(MultiplePermissionsBuilder pb, List it) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(it, "it");
        pb.getDenied().invoke2(it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void requestBluetoothIfNeed$default(BluetoothPermissionUtil bluetoothPermissionUtil, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bluetoothPermissionUtil.requestBluetoothIfNeed(fragmentActivity, z, function1);
    }

    public static /* synthetic */ void requestBluetoothPermission$default(BluetoothPermissionUtil bluetoothPermissionUtil, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bluetoothPermissionUtil.requestBluetoothPermission(fragmentActivity, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothPermission$lambda$1(Function1 extension, MultiplePermissionsBuilder showPermissionTipDialogIfNeed) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(showPermissionTipDialogIfNeed, "$this$showPermissionTipDialogIfNeed");
        extension.invoke2(showPermissionTipDialogIfNeed);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void requestLocationPermission$default(BluetoothPermissionUtil bluetoothPermissionUtil, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bluetoothPermissionUtil.requestLocationPermission(fragmentActivity, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationPermission$lambda$0(Function1 extension, MultiplePermissionsBuilder showPermissionTipDialogIfNeed) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(showPermissionTipDialogIfNeed, "$this$showPermissionTipDialogIfNeed");
        extension.invoke2(showPermissionTipDialogIfNeed);
        return Unit.INSTANCE;
    }

    private final void showPermissionTipDialogIfNeed(FragmentActivity activity, String[] permissionDesc, String[] permissions, boolean finishOnReject, final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            requestBluetoothDialog(activity, (String[]) Arrays.copyOf(permissions, permissions.length), permissionDesc, new Function1() { // from class: t23
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothPermissionUtil.showPermissionTipDialogIfNeed$lambda$2(extension, (MultiplePermissionsBuilder) obj);
                }
            });
            return;
        }
        String str = permissionDesc[0];
        SpannableString spannableString = new SpannableString(str + "\n\r\n\r" + ResourceExtKt.getString(uzi.n1));
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 17);
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(uzi.G0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(uzi.f36320a).setNegativeText(uzi.o2).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new AnonymousClass2(activity, permissions, permissionDesc, finishOnReject, extension));
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionTipDialogIfNeed$lambda$2(Function1 extension, MultiplePermissionsBuilder requestBluetoothDialog) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(requestBluetoothDialog, "$this$requestBluetoothDialog");
        extension.invoke2(requestBluetoothDialog);
        return Unit.INSTANCE;
    }

    public final boolean checkBluetoothPermission() {
        return Build.VERSION.SDK_INT >= 31 ? PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT") : PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    public final boolean hasConnectPermission() {
        return Build.VERSION.SDK_INT < 31 || PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT");
    }

    public final boolean needRequestBluetoothPermission(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return !(Build.VERSION.SDK_INT >= 31 ? PermissionExtKt.isPermissionGranted(activity, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT") : PermissionExtKt.isPermissionGranted(activity, "android.permission.ACCESS_FINE_LOCATION"));
    }

    public final void requestBluetoothIfNeed(@NotNull FragmentActivity activity, boolean finishOnReject, @NotNull Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (Build.VERSION.SDK_INT >= 31) {
            requestBluetoothPermission(activity, finishOnReject, extension);
        } else {
            requestLocationPermission(activity, finishOnReject, extension);
        }
    }

    @RequiresApi(31)
    public final void requestBluetoothPermission(@NotNull FragmentActivity activity, boolean finishOnReject, @NotNull final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (!PermissionExtKt.isPermissionGranted(activity, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT")) {
            showPermissionTipDialogIfNeed(activity, new String[]{ResourceExtKt.getString(uzi.j1), ResourceExtKt.getString(uzi.j1)}, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, finishOnReject, new Function1() { // from class: x23
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothPermissionUtil.requestBluetoothPermission$lambda$1(extension, (MultiplePermissionsBuilder) obj);
                }
            });
            return;
        }
        MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        multiplePermissionsBuilder.getAllGranted().invoke();
    }

    public final void requestLocationPermission(@NotNull FragmentActivity activity, boolean finishOnReject, @NotNull final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (!PermissionExtKt.isPermissionGranted(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            showPermissionTipDialogIfNeed(activity, new String[]{ResourceExtKt.getString(uzi.k1)}, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, finishOnReject, new Function1() { // from class: y23
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothPermissionUtil.requestLocationPermission$lambda$0(extension, (MultiplePermissionsBuilder) obj);
                }
            });
            return;
        }
        MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
        extension.invoke2(multiplePermissionsBuilder);
        multiplePermissionsBuilder.getAllGranted().invoke();
    }

    public final void showBluetoothSyncDataDialogIfNeed(@NotNull FragmentActivity activity, @NotNull final Function1<? super Boolean, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        if (!needRequestBluetoothPermission(activity)) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        DevicePreference devicePreference = DevicePreference.INSTANCE;
        if (devicePreference.getAGREE_BLUE_DATA_ENABLE()) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        BluetoothPermissionTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(BluetoothPermissionTool.INSTANCE);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        deviceManagerExtKt.showBluetoothPermissionDialog(supportFragmentManager, new SyncDataDialogCallback() { // from class: com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil.showBluetoothSyncDataDialogIfNeed.1
            @Override // com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback
            public void onAgreeButtonClicked() {
                DevicePreference.INSTANCE.setAGREE_BLUE_DATA_ENABLE(true);
                resultCallback.invoke2(Boolean.TRUE);
            }

            @Override // com.xiaomi.fitness.device.manager.export.SyncDataDialogCallback
            public void onRejectButtonClicked() {
                resultCallback.invoke2(Boolean.FALSE);
            }
        });
        devicePreference.setLAST_SHOW_BLUE_DATA_DIALOG_TIME(System.currentTimeMillis());
    }

    public final void turnOnPermissionSetting(@NotNull final BaseActivity activity, int title, @NotNull final String settings, @NotNull final Function2<? super Integer, ? super Intent, Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogDescription(title).setPositiveText(uzi.X1).setNegativeText(uzi.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil.turnOnPermissionSetting.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    activity.startForActivityResult(new Intent(settings), callBack);
                } else {
                    callBack.invoke(0, null);
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }
}

package com.xiaomi.fitness.device.manager.ui.bind;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mi.fitness.checkupdate.export.CheckUpdateExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceWebUrlsKt;
import com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.scan.UriDeviceInfo;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.ubox.export.UboxGuideManager;
import com.xiaomi.fitness.ubox.export.UnboxGuideManagerExtKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.bji;
import defpackage.dui;
import defpackage.i16;
import defpackage.uzi;
import defpackage.zv1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 T*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0001TB\u0007¢\u0006\u0004\bS\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0007J\u001f\u0010$\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0015\u0010$\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010(\u001a\u00020\u0005H\u0014¢\u0006\u0004\b(\u0010\u0007J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0004\b*\u0010&J\u000f\u0010+\u001a\u00020\u0005H\u0014¢\u0006\u0004\b+\u0010\u0007J\u000f\u0010,\u001a\u00020\u0005H\u0014¢\u0006\u0004\b,\u0010\u0007R\"\u0010-\u001a\u00020\u001b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101R(\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010C\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020B\u0012\u0006\u0012\u0004\u0018\u00010\u00100A0@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindViewModel;", "VM", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Li16;", "", "onConnectionFail", "()V", "allSuccess", "showPrivacyDialog", "bluetoothPermissionDialog", "Landroid/view/View;", "bindingView", "scrollToCurrentView", "(Landroid/view/View;)V", "showCancelBindConfirmDialog", "", "message", "mac", "showErrorDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "dismissBindConfirmDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "observeBindStatus", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "restoreBindDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "bindView", "(Li16;)V", "onBindSuccess", "requestBluetoothPermissionIfNeed", "", "status", "showFailedTip", "(Ljava/lang/String;I)V", "(Ljava/lang/String;)V", "onBackPressed", "startBind", "oobNumber", "showBindConfirmDialog", LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "mDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "getMDeviceInfo", "setMDeviceInfo", "(Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mBindConfirmDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getMBindConfirmDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setMBindConfirmDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "mProductManager", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "getMProductManager", "()Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "setMProductManager", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;)V", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "connectionLiveData", "Landroidx/lifecycle/MutableLiveData;", "getConnectionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setConnectionLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/device/manager/OnDeviceFullStatusListener;", "devicestatuslistener", "Lcom/xiaomi/fitness/device/manager/OnDeviceFullStatusListener;", "getDevicestatuslistener", "()Lcom/xiaomi/fitness/device/manager/OnDeviceFullStatusListener;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BindDeviceActivity<VM extends BindViewModel> extends BaseBindingActivity<VM, i16> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_SCAN_PAIRED = "key_scan_paired";

    @NotNull
    private static final String TAG = "BindDevice";

    @NotNull
    private MutableLiveData<Pair<Boolean, String>> connectionLiveData = new MutableLiveData<>();

    @NotNull
    private final OnDeviceFullStatusListener devicestatuslistener = new OnDeviceFullStatusListener(this) { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity$devicestatuslistener$1
        final /* synthetic */ BindDeviceActivity<VM> this$0;

        {
            this.this$0 = this;
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            super.onConnectFailure(did, errorCode, retryTimes);
            Integer value = BindDeviceActivity.access$getMViewModel(this.this$0).getBindStatus$device_manager_chinaProductRelease().getValue();
            if (value == null || value.intValue() != 6) {
                Logger.i(BindViewModel.TAG, "BindDeviceActivity onConnectFailure() ignore errorCode = " + errorCode);
                return;
            }
            this.this$0.getConnectionLiveData().postValue(new Pair<>(Boolean.FALSE, did));
            Logger.i(BindViewModel.TAG, "BindDeviceActivity onConnectFailure did:" + did + " errorCode:" + errorCode);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            super.onConnectSuccess(did);
            this.this$0.getConnectionLiveData().postValue(new Pair<>(Boolean.TRUE, did));
            Logger.i(BindViewModel.TAG, "BindDeviceActivity onConnectSuccess did:" + did);
        }
    };

    @Nullable
    private CommonDialog<?> mBindConfirmDialog;
    protected BindDeviceInfo mDeviceInfo;
    public ProductManagerInternal mProductManager;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_SCAN_PAIRED", "launch", "", "context", "Landroid/content/Context;", "device", "Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;", "from", "", "to", "launch$device_manager_chinaProductRelease", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$device_manager_chinaProductRelease$default(Companion companion, Context context, ScannedDeviceInfo scannedDeviceInfo, int i, String str, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                str = null;
            }
            companion.launch$device_manager_chinaProductRelease(context, scannedDeviceInfo, i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launch$lambda$0(Bundle bundle, Intent it) {
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            Intrinsics.checkNotNullParameter(it, "it");
            it.putExtras(bundle);
            return Unit.INSTANCE;
        }

        public final void launch$device_manager_chinaProductRelease(@NotNull Context context, @NotNull ScannedDeviceInfo device, int from, @Nullable String to) {
            Class cls;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(device, "device");
            Logger.i("BindDevice", "start bind device (" + device.getBleDevice() + "), model " + device.getModel() + ", to (" + to + "), productId (" + device.getProductId() + "), from (" + (from == 2 ? MedicalIdSPContract.PREF_FIRST : "click") + ")");
            final Bundle bundle = new Bundle();
            bundle.putInt("from", from);
            bundle.putString("to", to);
            bundle.putParcelable("key_device_info", device);
            if (device.isWearOs()) {
                WearOsExtKt.getInstance(WearOSUtil.INSTANCE).launchBindWearOSPage(context, device.getBleMac(), device.getBleName(), device.getProductId(), null, device.getBleDevice().isPhoneSwitching());
                return;
            }
            if (device.isHuami()) {
                cls = BindHuaMiDeviceDeviceActivity.class;
            } else if (device.isSportMachine()) {
                cls = device.isEarPhone() ? BindHeadphoneDeviceActivity.class : BindLocalDeviceActivity.class;
            } else {
                cls = BindBleDeviceDeviceActivity.class;
            }
            LaunchExtensionKt.startActivity(context, (Class<?>) cls, (Function1<? super Intent, Unit>) new Function1() { // from class: gk2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BindDeviceActivity.Companion.launch$lambda$0(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BindViewModel access$getMViewModel(BindDeviceActivity bindDeviceActivity) {
        return (BindViewModel) bindDeviceActivity.getMViewModel();
    }

    private final void allSuccess() {
        if (getMDeviceInfo().isEarPhone()) {
            return;
        }
        if (CheckUpdateExtKt.getCheckUpdateManager().isCurrentDeviceSupportSilent()) {
            getMViewModel().getSilentUpgrade().set(0);
        }
        getMViewModel().getBindStatusTip().setValue(getString(uzi.a0));
        getMBinding().K.setVisibility(0);
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: mj2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindDeviceActivity.allSuccess$lambda$4(this.f26918a, view);
            }
        });
        hideBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void allSuccess$lambda$4(BindDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            String value = ((BindViewModel) this$0.getMViewModel()).getDid().getValue();
            if (value != null) {
                CheckUpdateExtKt.getCheckUpdateManager().setSilentDownloadOnlyWifi(value, this$0.getMBinding().I.isChecked());
            }
            UnboxGuideManagerExtKt.getInstance(UboxGuideManager.INSTANCE).startUBoxGuideActivity(this$0);
            return;
        }
        ToastUtil.INSTANCE.showToast(uzi.g0);
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        MainExtKt.showMainActivity(this$0, null, bundle);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10(BindDeviceActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null) {
            this$0.dismissBindConfirmDialog();
        } else {
            this$0.showBindConfirmDialog(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$11(BindDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BindViewModel) this$0.getMViewModel()).getConnectDeviceStatus$device_manager_chinaProductRelease().setValue(0);
        ((BindViewModel) this$0.getMViewModel()).getPairDeviceStatus$device_manager_chinaProductRelease().setValue(0);
        ((BindViewModel) this$0.getMViewModel()).getBindAccountStatus$device_manager_chinaProductRelease().setValue(0);
        ((BindViewModel) this$0.getMViewModel()).getIsFail().set(8);
        ((BindViewModel) this$0.getMViewModel()).getBindStatusTip().setValue(this$0.getString(uzi.b0));
        ((BindViewModel) this$0.getMViewModel()).setFrom(10);
        this$0.requestBluetoothPermissionIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$12(BindDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScanDeviceActivity.INSTANCE.launch$device_manager_chinaProductRelease(this$0, this$0.getMDeviceInfo().getDeviceInfo(), true);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7(BindDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 102) {
            String string = this$0.getString(uzi.y, DeviceWebUrlsKt.getConnectHelpUrl(this$0.getMDeviceInfo().getModel()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Intrinsics.checkNotNull(num);
            this$0.showFailedTip(string, num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8(Integer num) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9(BindDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((num == null || num.intValue() != 100) && num != null && num.intValue() == 101) {
            this$0.onBindSuccess();
        }
        return Unit.INSTANCE;
    }

    private final void bluetoothPermissionDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(uzi.G0).setDialogDescription(Build.VERSION.SDK_INT >= 31 ? uzi.j1 : uzi.k1).setPositiveText(uzi.f36320a).setNegativeText(uzi.o2).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity.bluetoothPermissionDialog.1
            final /* synthetic */ BindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    SystemSetting.INSTANCE.goToSetting(this.this$0);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void dismissBindConfirmDialog() {
        CommonDialog<?> commonDialog = this.mBindConfirmDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeBindStatus$lambda$5(BindDeviceActivity this$0, Integer num) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 1) {
            string = this$0.getString(uzi.y, DeviceWebUrlsKt.getConnectHelpUrl(this$0.getMDeviceInfo().getModel()));
        } else if (num != null && num.intValue() == 3) {
            string = this$0.getString(uzi.E, DeviceWebUrlsKt.getPairingFailHelpUrl(this$0.getMDeviceInfo().getModel()));
        } else {
            string = null;
            if (num != null && num.intValue() == 7) {
                String string2 = this$0.getString(uzi.m0);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                this$0.showErrorDialog(string2, this$0.getMDeviceInfo().getBleMac());
            } else if (num != null && num.intValue() == 5) {
                string = this$0.getString(uzi.D, DeviceWebUrlsKt.getBindFailHelpUrl(this$0.getMDeviceInfo().getModel()));
            } else if (num != null && num.intValue() == 12) {
                string = this$0.getString(uzi.A);
            } else if (num != null && num.intValue() == 8) {
                string = this$0.getString(uzi.common_network_connection_failed_please_retry);
            } else if (num != null && num.intValue() == 9) {
                string = this$0.getString(uzi.l2);
            }
        }
        if (string != null && string.length() != 0) {
            Intrinsics.checkNotNull(num);
            this$0.showFailedTip(string, num.intValue());
        }
        return Unit.INSTANCE;
    }

    private final void onConnectionFail() {
        String string = getString(uzi.B, DeviceWebUrlsKt.getConnectHelpUrl(getMDeviceInfo().getModel()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        showFailedTip(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(BindDeviceActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String value = ((BindViewModel) this$0.getMViewModel()).getDid().getValue();
        Logger.i("BindDevice", "BindDeviceActivity connectionLiveData.observe curDid:" + value);
        if (value != null && Intrinsics.areEqual(value, pair.getSecond()) && !this$0.getMDeviceInfo().isEarPhone()) {
            if (((Boolean) pair.getFirst()).booleanValue()) {
                this$0.allSuccess();
            } else {
                this$0.onConnectionFail();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(BindDeviceActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Pair<Boolean, String> value = this$0.connectionLiveData.getValue();
        Logger.i("BindDevice", "BindDeviceActivity mViewModel.did connectionValue:" + value);
        if (value != null && Intrinsics.areEqual(str, value.getSecond()) && !this$0.getMDeviceInfo().isEarPhone()) {
            if (value.getFirst().booleanValue()) {
                this$0.allSuccess();
            } else {
                this$0.onConnectionFail();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothPermissionIfNeed$lambda$17(final BindDeviceActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BluetoothPermissionUtil.INSTANCE.requestBluetoothIfNeed(this$0, false, new Function1() { // from class: uj2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BindDeviceActivity.requestBluetoothPermissionIfNeed$lambda$17$lambda$16(this.f35808a, (MultiplePermissionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothPermissionIfNeed$lambda$17$lambda$16(final BindDeviceActivity this$0, MultiplePermissionsBuilder requestBluetoothIfNeed) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestBluetoothIfNeed, "$this$requestBluetoothIfNeed");
        requestBluetoothIfNeed.allGranted(new Function0() { // from class: oj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindDeviceActivity.requestBluetoothPermissionIfNeed$lambda$17$lambda$16$lambda$13(this.f29211a);
            }
        });
        requestBluetoothIfNeed.denied(new Function1() { // from class: pj2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.requestBluetoothPermissionIfNeed$lambda$17$lambda$16$lambda$15(this.f30454a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothPermissionIfNeed$lambda$17$lambda$16$lambda$13(BindDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startBind();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestBluetoothPermissionIfNeed$lambda$17$lambda$16$lambda$15(final BindDeviceActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), this$0, it, null, null, new Function0() { // from class: wj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindDeviceActivity.requestBluetoothPermissionIfNeed$lambda$17$lambda$16$lambda$15$lambda$14(this.f38021a);
            }
        }, 24, null);
        ((BindViewModel) this$0.getMViewModel()).getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(102);
        ((BindViewModel) this$0.getMViewModel()).getBindStatus$device_manager_chinaProductRelease().postValue(1);
        ((BindViewModel) this$0.getMViewModel()).getIsFail().set(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBluetoothPermissionIfNeed$lambda$17$lambda$16$lambda$15$lambda$14(BindDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bluetoothPermissionDialog();
        return Unit.INSTANCE;
    }

    private final void scrollToCurrentView(final View bindingView) {
        getMBinding().D.postDelayed(new Runnable() { // from class: vj2
            @Override // java.lang.Runnable
            public final void run() {
                BindDeviceActivity.scrollToCurrentView$lambda$18(this.f36941a, bindingView);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToCurrentView$lambda$18(BindDeviceActivity this$0, View bindingView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindingView, "$bindingView");
        if (Build.VERSION.SDK_INT >= 29) {
            this$0.getMBinding().D.scrollToDescendant(bindingView);
        } else {
            this$0.getMBinding().D.scrollTo(0, bindingView.getBottom());
        }
    }

    private final void showCancelBindConfirmDialog() {
        String string = getString(uzi.O, getMDeviceInfo().getDeviceInfo().getName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("cancel_bind_dialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(uzi.d).setNegativeText(uzi.c).create();
        commonDialogCreate.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity.showCancelBindConfirmDialog.1
            final /* synthetic */ BindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1) {
                    return;
                }
                this.this$0.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showErrorDialog(String message, String mac) {
        CommonDialog commonDialogCreate = new CommonDialog.c("bind_error").setDialogTitle(uzi.l0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(uzi.k0, new Object[0])).setPositiveText(uzi.d).create();
        commonDialogCreate.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity.showErrorDialog.1
            final /* synthetic */ BindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.this$0.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFailedTip$lambda$19(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    private final void showPrivacyDialog() {
        new CommonDialog.c("privacy_dialog").setDialogTitle(uzi.z).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(this, getString(uzi.C, DeviceWebUrlsKt.getDeviceLicenseUrl(getMDeviceInfo().getModel()), DeviceWebUrlsKt.getDevicePrivacyUrl(getMDeviceInfo().getModel())), Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: nj2
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                BindDeviceActivity.showPrivacyDialog$lambda$6(view, str);
            }
        }))).setPositiveText(uzi.x).setNegativeText(uzi.c).setCanceledOnBackPressed(false).create().addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity.showPrivacyDialog.1
            final /* synthetic */ BindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    this.this$0.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    this.this$0.requestBluetoothPermissionIfNeed();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrivacyDialog$lambda$6(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$20(BindDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BindViewModel) this$0.getMViewModel()).startBind(this$0.getMDeviceInfo());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$21(BindDeviceActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, uzi.P);
        ((BindViewModel) this$0.getMViewModel()).getConnectDeviceStatus$device_manager_chinaProductRelease().setValue(102);
        ((BindViewModel) this$0.getMViewModel()).getIsFail().set(0);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull i16 i16Var) {
        Intrinsics.checkNotNullParameter(i16Var, "<this>");
        getMViewModel().getConnectDeviceStatus$device_manager_chinaProductRelease().observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ak2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.bindView$lambda$7(this.f1117a, (Integer) obj);
            }
        }));
        getMViewModel().getPairDeviceStatus$device_manager_chinaProductRelease().observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.bindView$lambda$8((Integer) obj);
            }
        }));
        getMViewModel().getBindAccountStatus$device_manager_chinaProductRelease().observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ck2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.bindView$lambda$9(this.f5414a, (Integer) obj);
            }
        }));
        getMViewModel().getPairCode$device_manager_chinaProductRelease().observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.bindView$lambda$10(this.f15604a, (String) obj);
            }
        }));
        i16Var.E.setOnClickListener(new View.OnClickListener() { // from class: ek2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindDeviceActivity.bindView$lambda$11(this.f16718a, view);
            }
        });
        i16Var.F.setMovementMethod(LinkMovementMethod.getInstance());
        i16Var.F.setAutoLinkMask(1);
        i16Var.F.setHighlightColor(0);
        i16Var.G.setOnClickListener(new View.OnClickListener() { // from class: fk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindDeviceActivity.bindView$lambda$12(this.f17860a, view);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getConnectionLiveData() {
        return this.connectionLiveData;
    }

    @NotNull
    public final OnDeviceFullStatusListener getDevicestatuslistener() {
        return this.devicestatuslistener;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dui.c;
    }

    @Nullable
    public final CommonDialog<?> getMBindConfirmDialog() {
        return this.mBindConfirmDialog;
    }

    @NotNull
    public final BindDeviceInfo getMDeviceInfo() {
        BindDeviceInfo bindDeviceInfo = this.mDeviceInfo;
        if (bindDeviceInfo != null) {
            return bindDeviceInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        return null;
    }

    @NotNull
    public final ProductManagerInternal getMProductManager() {
        ProductManagerInternal productManagerInternal = this.mProductManager;
        if (productManagerInternal != null) {
            return productManagerInternal;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mProductManager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return zv1.f41707k;
    }

    public void observeBindStatus() {
        getMViewModel().getBindStatus$device_manager_chinaProductRelease().observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zj2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.observeBindStatus$lambda$5(this.f41333a, (Integer) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        Integer value = getMViewModel().getBindStatus$device_manager_chinaProductRelease().getValue();
        if ((value != null && value.intValue() == 0) || ((value != null && value.intValue() == 2) || (value != null && value.intValue() == 4))) {
            showCancelBindConfirmDialog();
        } else {
            if (value != null && value.intValue() == 6) {
                return;
            }
            super.lambda$onCreate$0();
        }
    }

    public void onBindSuccess() {
        if (getMDeviceInfo().isSportMachine()) {
            if (!getMDeviceInfo().isEarPhone()) {
                finish();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
            MainExtKt.showMainActivity(this, null, bundle);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMDeviceInfo(restoreBindDeviceInfo());
        getMBinding().q0(zv1.e, getMDeviceInfo().getDeviceInfo());
        setTitle(uzi.q);
        Intent intent = getIntent();
        getMViewModel().setFrom(intent != null ? intent.getIntExtra("from", 1) : 1);
        getMViewModel().start(getMDeviceInfo());
        if (getMViewModel().needShowPrivacy()) {
            showPrivacyDialog();
        } else {
            requestBluetoothPermissionIfNeed();
        }
        observeBindStatus();
        WearableProduct wearableProduct = (WearableProduct) getMProductManager().getProductByModel(getMDeviceInfo().getModel());
        if (wearableProduct != null) {
            if (!DeviceExtKt.isBand(wearableProduct) && !DeviceExtKt.isWatch(wearableProduct)) {
                getMBinding().H.showImg(getMDeviceInfo().getDeviceInfo().getBigIcon());
            } else if (DeviceModelExtKt.isKongMing(wearableProduct)) {
                getMBinding().H.showKongMing(getMDeviceInfo().getModel());
            } else {
                getMBinding().H.showModelAndSize(getMDeviceInfo().getModel(), wearableProduct.getSize());
            }
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.devicestatuslistener);
        this.connectionLiveData.observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sj2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.onCreate$lambda$1(this.f33695a, (Pair) obj);
            }
        }));
        getMViewModel().getDid().observe(this, new BindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tj2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.onCreate$lambda$2(this.f34755a, (String) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.devicestatuslistener);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        CommonDialog<?> commonDialog = this.mBindConfirmDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        this.mBindConfirmDialog = null;
    }

    public void requestBluetoothPermissionIfNeed() {
        BluetoothPermissionUtil.INSTANCE.showBluetoothSyncDataDialogIfNeed(this, new Function1() { // from class: yj2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceActivity.requestBluetoothPermissionIfNeed$lambda$17(this.f40229a, ((Boolean) obj).booleanValue());
            }
        });
    }

    @NotNull
    public BindDeviceInfo restoreBindDeviceInfo() {
        int intExtra = getIntent().getIntExtra("from", -1);
        Logger.i("BindDevice", "restoreBindDeviceInfo: " + intExtra);
        if (intExtra == 1 || intExtra == 2) {
            Intent intent = getIntent();
            BindDeviceInfo bindDeviceInfo = (BindDeviceInfo) (intent != null ? intent.getParcelableExtra("key_device_info") : null);
            String stringExtra = getIntent().getStringExtra("to");
            Logger.i("BindDevice", "restoreBindDeviceInfo to=" + stringExtra);
            if (bindDeviceInfo instanceof ScannedDeviceInfo) {
                ((ScannedDeviceInfo) bindDeviceInfo).setTo(stringExtra);
            }
            Intrinsics.checkNotNull(bindDeviceInfo);
            return bindDeviceInfo;
        }
        if (intExtra == 6) {
            Intent intent2 = getIntent();
            Product product = intent2 != null ? (Product) intent2.getParcelableExtra("key_product_info") : null;
            Intrinsics.checkNotNull(product);
            String stringExtra2 = getIntent().getStringExtra("key_device_address");
            Intrinsics.checkNotNull(stringExtra2);
            return new NFCDeviceInfo(DeviceExtKt.toDeviceInfo(product), stringExtra2, product.getModel(), "", null, getIntent().getIntExtra(DeviceManagerExtKt.KEY_STEP, 0), 16, null);
        }
        Intent intent3 = getIntent();
        Product product2 = intent3 != null ? (Product) intent3.getParcelableExtra("key_product_info") : null;
        Intrinsics.checkNotNull(product2);
        String stringExtra3 = getIntent().getStringExtra("key_device_name");
        String stringExtra4 = getIntent().getStringExtra("key_device_address");
        Intrinsics.checkNotNull(stringExtra4);
        String stringExtra5 = getIntent().getStringExtra("key_device_oob");
        String stringExtra6 = getIntent().getStringExtra("to");
        DeviceInfo deviceInfo = DeviceExtKt.toDeviceInfo(product2);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        return new UriDeviceInfo(stringExtra4, stringExtra3, stringExtra5, deviceInfo, stringExtra6);
    }

    public final void setConnectionLiveData(@NotNull MutableLiveData<Pair<Boolean, String>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.connectionLiveData = mutableLiveData;
    }

    public final void setMBindConfirmDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mBindConfirmDialog = commonDialog;
    }

    public final void setMDeviceInfo(@NotNull BindDeviceInfo bindDeviceInfo) {
        Intrinsics.checkNotNullParameter(bindDeviceInfo, "<set-?>");
        this.mDeviceInfo = bindDeviceInfo;
    }

    public final void setMProductManager(@NotNull ProductManagerInternal productManagerInternal) {
        Intrinsics.checkNotNullParameter(productManagerInternal, "<set-?>");
        this.mProductManager = productManagerInternal;
    }

    public void showBindConfirmDialog(@NotNull String oobNumber) {
        Intrinsics.checkNotNullParameter(oobNumber, "oobNumber");
        CommonDialog<?> commonDialogAddDialogCallback = new PairCodeDialog.Builder(oobNumber).create().addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity.showBindConfirmDialog.1
            final /* synthetic */ BindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws RemoteException {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    BindDeviceActivity.access$getMViewModel(this.this$0).onConfirmResult(true);
                } else {
                    BindDeviceActivity.access$getMViewModel(this.this$0).onConfirmResult(false);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        });
        this.mBindConfirmDialog = commonDialogAddDialogCallback;
        Intrinsics.checkNotNull(commonDialogAddDialogCallback);
        commonDialogAddDialogCallback.showIfNeed(getSupportFragmentManager());
    }

    public void showFailedTip(@NotNull String message, int status) {
        Intrinsics.checkNotNullParameter(message, "message");
        showFailedTip(message);
    }

    public void startBind() {
        if (NetworkStateUtil.INSTANCE.getInstance(this).getStateInfo(this).isConnected()) {
            BluetoothExtKt.openBluetooth(this, new Function0() { // from class: qj2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BindDeviceActivity.startBind$lambda$20(this.f31561a);
                }
            }, new Function1() { // from class: rj2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BindDeviceActivity.startBind$lambda$21(this.f32595a, ((Integer) obj).intValue());
                }
            });
        } else {
            getMViewModel().getBindStatus$device_manager_chinaProductRelease().setValue(9);
            getMViewModel().getIsFail().set(0);
        }
    }

    public final void showFailedTip(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getMBinding().F.setText(StringExtKt.clickSpannable$default(message, null, bji.f4287b, 0, new Function2() { // from class: xj2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BindDeviceActivity.showFailedTip$lambda$19((String) obj, (String) obj2);
            }
        }, 5, null));
        getMViewModel().getBindStatusTip().setValue(getString(uzi.Y));
    }
}

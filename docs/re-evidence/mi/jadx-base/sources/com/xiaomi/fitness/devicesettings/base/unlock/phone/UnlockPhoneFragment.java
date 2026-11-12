package com.xiaomi.fitness.devicesettings.base.unlock.phone;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mijia.sdk.IProfileStateChangeCallback;
import com.xiaomi.fitness.mijia.sdk.MiBleUnlockProfile;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.UnlockScreenType;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.lhi;
import defpackage.puc;
import defpackage.wzi;
import defpackage.yi6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007*\u0001@\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001[B\u0007¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0014¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0006R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R!\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0010048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010C\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\rR(\u0010H\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bH\u00108\u0012\u0004\bK\u0010\u0006\u001a\u0004\bH\u0010\u0016\"\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u0010DR\u0014\u0010S\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010DR\u0014\u0010T\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u0010DR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010F¨\u0006\\"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneViewModel;", "Lyi6;", "", "doViewVisible", "()V", "showUnlockDistance", "hideUnlockDistance", "getUnlockScreenType", "", "index", "showUnlockDistanceRightValue", "(I)V", "which", "saveUnlockScreenType", "Landroid/content/Intent;", "getBindIntent", "()Landroid/content/Intent;", "setDesc", "", "isDeviceConnected", "()Z", "initRssiArr", "goBluetoothSettings", "resultCode", "data", "onMiuiBluetoothSettingResult", "(ILandroid/content/Intent;)V", "onVisible", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "devicemodel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "", "distanceLabels$delegate", "Lkotlin/Lazy;", "getDistanceLabels", "()[Ljava/lang/String;", "distanceLabels", "Landroidx/activity/result/ActivityResultLauncher;", "miuiBluetoothSettingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "isReplace", "Z", "Lpuc;", "unlockService", "Lpuc;", "getUnlockService", "()Lpuc;", "setUnlockService", "(Lpuc;)V", "com/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneFragment$serviceConnection$1", "serviceConnection", "Lcom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneFragment$serviceConnection$1;", "checkedIndex", "I", "getCheckedIndex", "()I", "setCheckedIndex", "isUnlockPhoneEnable", "setUnlockPhoneEnable", "(Z)V", "isUnlockPhoneEnable$annotations", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "onCheckedChangeCallback", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "Lcom/xiaomi/fitness/mijia/sdk/MiBleUnlockProfile;", "mUnlockPhoneProfile", "Lcom/xiaomi/fitness/mijia/sdk/MiBleUnlockProfile;", "huamiRssiClose", "huamiRssiNormal", "huamiRssiLittleFar", "", "rssiArr", "Ljava/util/List;", "getLayoutId", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UnlockPhoneFragment extends BaseLoadableBindingFragment<UnlockPhoneViewModel, yi6> {

    @NotNull
    public static final String SERVER_ACTION = "miui.bluetooth.mible.BluetoothUnlockService";

    @NotNull
    public static final String SERVER_CLASSNAME = "com.android.bluetooth.ble.BluetoothUnlockService";

    @NotNull
    public static final String SERVER_PACKAGE = "com.xiaomi.bluetooth";
    private static final int SETTINGS_REQUEST_CODE = 100;
    private boolean isReplace;

    @Nullable
    private MiBleUnlockProfile mUnlockPhoneProfile;
    private ActivityResultLauncher<Intent> miuiBluetoothSettingLauncher;
    private List<Integer> rssiArr;

    @Nullable
    private puc unlockService;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "UnlockPhoneFragment";

    @Nullable
    private WearableDeviceModel devicemodel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    /* JADX INFO: renamed from: distanceLabels$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy distanceLabels = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: raq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnlockPhoneFragment.distanceLabels_delegate$lambda$0(this.f32361a);
        }
    });

    @NotNull
    private final UnlockPhoneFragment$serviceConnection$1 serviceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) throws RemoteException {
            this.this$0.setUnlockService(puc.a.s2(service));
            this.this$0.getUnlockScreenType();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Logger.d(UnlockPhoneFragment.INSTANCE.getTAG() + " onServiceDisconnected:" + name, new Object[0]);
        }
    };
    private int checkedIndex = 1;
    private boolean isUnlockPhoneEnable = true;

    @NotNull
    private final ISwitchButton.a onCheckedChangeCallback = new ISwitchButton.a() { // from class: saq
        @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
        public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
            UnlockPhoneFragment.onCheckedChangeCallback$lambda$4(this.f33467a, z, iSwitchButton);
        }
    };
    private final int huamiRssiClose = -55;
    private final int huamiRssiNormal = -70;
    private final int huamiRssiLittleFar = -85;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/unlock/phone/UnlockPhoneFragment$Companion;", "", "<init>", "()V", "SERVER_ACTION", "", "SERVER_PACKAGE", "SERVER_CLASSNAME", "TAG", "getTAG", "()Ljava/lang/String;", "SETTINGS_REQUEST_CODE", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return UnlockPhoneFragment.TAG;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ yi6 access$getMBinding(UnlockPhoneFragment unlockPhoneFragment) {
        return (yi6) unlockPhoneFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] distanceLabels_delegate$lambda$0(UnlockPhoneFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getResources().getStringArray(lhi.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void doViewVisible() {
        this.isReplace = false;
        boolean zHasScreenLockPwd = ((UnlockPhoneViewModel) getMViewModel()).hasScreenLockPwd(getActivity());
        ((yi6) getMBinding()).F.setEnable(!zHasScreenLockPwd);
        ((yi6) getMBinding()).E.setEnable(zHasScreenLockPwd);
        String str = TAG;
        Logger.d(str + " hasScreenLockPwd:" + zHasScreenLockPwd, new Object[0]);
        if (!zHasScreenLockPwd) {
            hideUnlockDistance();
            return;
        }
        try {
            FragmentActivity activity = getActivity();
            int i = Settings.Secure.getInt(activity != null ? activity.getContentResolver() : null, "bluetooth_unlock_status", 0);
            if (i == 0) {
                hideUnlockDistance();
                ((yi6) getMBinding()).E.setEnable(zHasScreenLockPwd);
            } else if (i != 1) {
                hideUnlockDistance();
            } else {
                FragmentActivity activity2 = getActivity();
                String string = Settings.Secure.getString(activity2 != null ? activity2.getContentResolver() : null, "bluetooth_address_to_unlock");
                Logger.d(str + " addressToUnlock：" + string, new Object[0]);
                WearableDeviceModel wearableDeviceModel = this.devicemodel;
                Intrinsics.checkNotNull(wearableDeviceModel);
                if (Intrinsics.areEqual(string, DeviceModelExtKt.getMac(wearableDeviceModel))) {
                    ((yi6) getMBinding()).E.setEnable(false);
                    showUnlockDistance();
                } else {
                    hideUnlockDistance();
                    ((yi6) getMBinding()).E.setEnable(zHasScreenLockPwd);
                    this.isReplace = true;
                }
            }
            Logger.d(str + " unlockStatus:" + i, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final Intent getBindIntent() {
        Intent intent = new Intent("miui.bluetooth.mible.BluetoothUnlockService");
        intent.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothUnlockService"));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] getDistanceLabels() {
        Object value = this.distanceLabels.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String[]) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getUnlockScreenType() throws RemoteException {
        String str = TAG;
        if (str == null) {
            str = "";
        }
        Logger.i(str, "getUnlockScreenType " + (this.unlockService != null));
        puc pucVar = this.unlockService;
        if (pucVar != null) {
            WearableDeviceModel wearableDeviceModel = this.devicemodel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            int iQ0 = pucVar.q0(DeviceModelExtKt.getMac(wearableDeviceModel), Integer.MIN_VALUE, false);
            List<Integer> list = this.rssiArr;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
                list = null;
            }
            int iIndexOf = list.indexOf(Integer.valueOf(iQ0));
            this.checkedIndex = iIndexOf;
            showUnlockDistanceRightValue(iIndexOf);
        }
        if (this.mUnlockPhoneProfile != null) {
            ((UnlockPhoneViewModel) getMViewModel()).getUnlockScreenType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void goBluetoothSettings() {
        Product.Size size;
        WearableDeviceModel wearableDeviceModel = this.devicemodel;
        if (wearableDeviceModel != null && !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((UnlockPhoneViewModel) getMViewModel()).setAuthorizeUnlock(2, true);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(Constants.SETTINGS_PACKAGE, "com.android.settings.MiuiSecurityBluetoothSettings"));
        WearableDeviceModel wearableDeviceModel2 = this.devicemodel;
        Intrinsics.checkNotNull(wearableDeviceModel2);
        intent.putExtra("android.bluetooth.device.extra.NAME", DeviceModelExtKt.getMac(wearableDeviceModel2));
        WearableDeviceModel wearableDeviceModel3 = this.devicemodel;
        if (wearableDeviceModel3 == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel3)) {
            intent.putExtra("DEVICE_TYPE", "fdab");
            String str = "1";
            intent.putExtra("DEVICE_TYPE_MAJOR", "1");
            WearableDeviceModel wearableDeviceModel4 = this.devicemodel;
            Intrinsics.checkNotNull(wearableDeviceModel4);
            if (!DeviceModelExtKt.isWearOS(wearableDeviceModel4)) {
                WearableDeviceModel wearableDeviceModel5 = this.devicemodel;
                Intrinsics.checkNotNull(wearableDeviceModel5);
                if (DeviceModelExtKt.isBandType(wearableDeviceModel5)) {
                    str = "4";
                } else {
                    WearableDeviceModel wearableDeviceModel6 = this.devicemodel;
                    str = (wearableDeviceModel6 == null || (size = DeviceModelExtKt.getSize(wearableDeviceModel6)) == null || size.getWidth() / size.getRadius() != 2) ? "2" : "3";
                }
            }
            intent.putExtra("DEVICE_TYPE_MINOR", str);
        }
        try {
            puc pucVar = this.unlockService;
            if (pucVar != null) {
                WearableDeviceModel wearableDeviceModel7 = this.devicemodel;
                Intrinsics.checkNotNull(wearableDeviceModel7);
                pucVar.H0(DeviceModelExtKt.getMac(wearableDeviceModel7), true);
            }
        } catch (Exception e) {
            Logger.e(TAG, "setSpecialWatch error", e);
        }
        try {
            ActivityResultLauncher<Intent> activityResultLauncher = this.miuiBluetoothSettingLauncher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miuiBluetoothSettingLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(intent);
        } catch (Exception e2) {
            ToastUtil.showShortToast(wzi.common_hint_unkonwn_error);
            Logger.e(TAG, "goBluetoothSettings error", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideUnlockDistance() {
        ((yi6) getMBinding()).H.setVisibility(8);
        ((yi6) getMBinding()).A.setVisibility(8);
        ((yi6) getMBinding()).G.setVisibility(0);
    }

    private final void initRssiArr() {
        List<Integer> listArrayListOf;
        List<Integer> rssiArray;
        WearableDeviceModel wearableDeviceModel = this.devicemodel;
        List<Integer> list = null;
        if (wearableDeviceModel == null || (rssiArray = DeviceModelExtKt.getRssiArray(wearableDeviceModel)) == null || rssiArray.size() != 3) {
            listArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(this.huamiRssiClose), Integer.valueOf(this.huamiRssiNormal), Integer.valueOf(this.huamiRssiLittleFar));
        } else {
            WearableDeviceModel wearableDeviceModel2 = this.devicemodel;
            Intrinsics.checkNotNull(wearableDeviceModel2);
            List<Integer> rssiArray2 = DeviceModelExtKt.getRssiArray(wearableDeviceModel2);
            listArrayListOf = rssiArray2 != null ? CollectionsKt___CollectionsKt.filterNotNull(rssiArray2) : null;
            Intrinsics.checkNotNull(listArrayListOf, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        }
        this.rssiArr = listArrayListOf;
        String str = TAG;
        if (listArrayListOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
        } else {
            list = listArrayListOf;
        }
        Logger.d(str + " rssiArr:" + list, new Object[0]);
    }

    private final boolean isDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = this.devicemodel;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            return true;
        }
        ToastUtil.showLongToast(wzi.u);
        return false;
    }

    @Deprecated(message = "后续考虑移除，目前恒为true")
    public static /* synthetic */ void isUnlockPhoneEnable$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(UnlockPhoneFragment this$0, ActivityResult activityResult) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMiuiBluetoothSettingResult(activityResult.c(), activityResult.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCheckedChangeCallback$lambda$4(UnlockPhoneFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isUnlockPhoneEnable = z;
        if (z) {
            this$0.doViewVisible();
        } else {
            LinearLayout stepView = ((yi6) this$0.getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(stepView, "stepView");
            ViewExtKt.gone(stepView);
            RelativeLayout unlockDistanceView = ((yi6) this$0.getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(unlockDistanceView, "unlockDistanceView");
            ViewExtKt.gone(unlockDistanceView);
        }
        this$0.setDesc();
        this$0.showLoading();
        ((UnlockPhoneViewModel) this$0.getMViewModel()).setAuthorizeUnlock(2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onMiuiBluetoothSettingResult(int resultCode, Intent data) throws RemoteException {
        Logger.d(TAG, " onMiuiBluetoothSettingResult " + resultCode + " ");
        if (resultCode == -1) {
            this.checkedIndex = 1;
            puc pucVar = this.unlockService;
            List<Integer> list = null;
            if (pucVar != null) {
                WearableDeviceModel wearableDeviceModel = this.devicemodel;
                Intrinsics.checkNotNull(wearableDeviceModel);
                String mac = DeviceModelExtKt.getMac(wearableDeviceModel);
                List<Integer> list2 = this.rssiArr;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
                    list2 = null;
                }
                pucVar.q0(mac, list2.get(this.checkedIndex).intValue(), true);
            }
            MiBleUnlockProfile miBleUnlockProfile = this.mUnlockPhoneProfile;
            if (miBleUnlockProfile != null && miBleUnlockProfile.isReady()) {
                List<Integer> list3 = this.rssiArr;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
                } else {
                    list = list3;
                }
                miBleUnlockProfile.setRssiThreshold(list.get(this.checkedIndex).intValue());
                saveUnlockScreenType(this.checkedIndex);
            }
            ((yi6) getMBinding()).D.setRemindText(getDistanceLabels()[this.checkedIndex]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(UnlockPhoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.goBluetoothSettings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(final UnlockPhoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceConnected()) {
            if (!this$0.isReplace) {
                this$0.goBluetoothSettings();
                return;
            }
            CommonDialog commonDialogCreate = new CommonDialog.c("replace").setCancelable(false).setDialogDescription(wzi.M8).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment$onViewCreated$3$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        this.this$0.goBluetoothSettings();
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(this$0.getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(final UnlockPhoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("distanceDialog").setCancelable(false).setDialogTitle(wzi.O8).setItems(this$0.getDistanceLabels()).setItemsCheckedIndex(this$0.checkedIndex).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment$onViewCreated$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws RemoteException {
                boolean rssiThreshold;
                super.onDialogClick(dialogName, dialog, which);
                puc unlockService = this.this$0.getUnlockService();
                List list = null;
                if (unlockService != null) {
                    UnlockPhoneFragment unlockPhoneFragment = this.this$0;
                    WearableDeviceModel wearableDeviceModel = unlockPhoneFragment.devicemodel;
                    String mac = wearableDeviceModel != null ? DeviceModelExtKt.getMac(wearableDeviceModel) : null;
                    List list2 = unlockPhoneFragment.rssiArr;
                    if (list2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
                        list2 = null;
                    }
                    rssiThreshold = true;
                    int iQ0 = unlockService.q0(mac, ((Number) list2.get(which)).intValue(), true);
                    List list3 = unlockPhoneFragment.rssiArr;
                    if (list3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
                        list3 = null;
                    }
                    Logger.i("UnlockPhone", "set configRssi " + list3.get(which) + " result:" + iQ0);
                } else {
                    rssiThreshold = false;
                }
                MiBleUnlockProfile miBleUnlockProfile = this.this$0.mUnlockPhoneProfile;
                if (miBleUnlockProfile != null) {
                    UnlockPhoneFragment unlockPhoneFragment2 = this.this$0;
                    if (miBleUnlockProfile.isReady()) {
                        List list4 = unlockPhoneFragment2.rssiArr;
                        if (list4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rssiArr");
                        } else {
                            list = list4;
                        }
                        rssiThreshold = miBleUnlockProfile.setRssiThreshold(((Number) list.get(which)).intValue());
                        unlockPhoneFragment2.saveUnlockScreenType(which);
                    }
                }
                if (rssiThreshold) {
                    this.this$0.setCheckedIndex(which);
                    UnlockPhoneFragment.access$getMBinding(this.this$0).D.setRemindText(this.this$0.getDistanceLabels()[which]);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(UnlockPhoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goBluetoothSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveUnlockScreenType(int which) {
        UnlockScreenType unlockScreenType = new UnlockScreenType();
        unlockScreenType.setUnlockScreenType(which);
        DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
        WearableDeviceModel wearableDeviceModel = this.devicemodel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        companion.sendSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_UNLOCK_SCREEN_TYPE, unlockScreenType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDesc() {
        if (this.isUnlockPhoneEnable) {
            ((yi6) getMBinding()).I.setSubtitle(getString(wzi.L8));
        } else {
            ((yi6) getMBinding()).I.setSubtitle("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$10(UnlockPhoneFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Logger.d(TAG + " is Support unLock Phone:" + bool, new Object[0]);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this$0.isUnlockPhoneEnable = true;
            ((yi6) this$0.getMBinding()).I.setSwitch(zBooleanValue);
            ((yi6) this$0.getMBinding()).I.setOnCheckedChangeCallback(this$0.onCheckedChangeCallback);
            this$0.setDesc();
            if (this$0.isUnlockPhoneEnable) {
                this$0.doViewVisible();
            } else {
                LinearLayout stepView = ((yi6) this$0.getMBinding()).G;
                Intrinsics.checkNotNullExpressionValue(stepView, "stepView");
                ViewExtKt.gone(stepView);
                RelativeLayout unlockDistanceView = ((yi6) this$0.getMBinding()).H;
                Intrinsics.checkNotNullExpressionValue(unlockDistanceView, "unlockDistanceView");
                ViewExtKt.gone(unlockDistanceView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$11(UnlockPhoneFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Intrinsics.checkNotNull(num);
        this$0.showUnlockDistanceRightValue(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showUnlockDistance() throws RemoteException {
        ((yi6) getMBinding()).H.setVisibility(0);
        ((yi6) getMBinding()).A.setVisibility(0);
        ((yi6) getMBinding()).G.setVisibility(8);
        getUnlockScreenType();
        WearableDeviceModel wearableDeviceModel = this.devicemodel;
        if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((yi6) getMBinding()).B.setVisibility(0);
            ((yi6) getMBinding()).J.setText(getString(wzi.K8));
        } else {
            ((yi6) getMBinding()).B.setVisibility(4);
            ((yi6) getMBinding()).J.setText(getString(wzi.N8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showUnlockDistanceRightValue(int index) {
        if (index == -1) {
            index = 1;
        }
        this.checkedIndex = index;
        ((yi6) getMBinding()).D.setRemindText(getDistanceLabels()[this.checkedIndex]);
    }

    public final int getCheckedIndex() {
        return this.checkedIndex;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.F0;
    }

    @Nullable
    public final puc getUnlockService() {
        return this.unlockService;
    }

    /* JADX INFO: renamed from: isUnlockPhoneEnable, reason: from getter */
    public final boolean getIsUnlockPhoneEnable() {
        return this.isUnlockPhoneEnable;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.miuiBluetoothSettingLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: qaq
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) throws RemoteException {
                UnlockPhoneFragment.onAttach$lambda$1(this.f31298a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        FragmentActivity activity;
        super.onDestroy();
        if (this.unlockService != null && (activity = getActivity()) != null) {
            activity.unbindService(this.serviceConnection);
        }
        MiBleUnlockProfile miBleUnlockProfile = this.mUnlockPhoneProfile;
        if (miBleUnlockProfile != null) {
            miBleUnlockProfile.setProfileStateChangeCallback(null);
        }
        MiBleUnlockProfile miBleUnlockProfile2 = this.mUnlockPhoneProfile;
        if (miBleUnlockProfile2 != null) {
            miBleUnlockProfile2.disconnect();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.J8);
        WearableDeviceModel wearableDeviceModel = this.devicemodel;
        boolean zIsHuaMi = wearableDeviceModel != null ? DeviceModelExtKt.isHuaMi(wearableDeviceModel) : false;
        ((yi6) getMBinding()).I.setVisibility(8);
        ((yi6) getMBinding()).K.setVisibility(0);
        Intent bindIntent = getBindIntent();
        if (zIsHuaMi) {
            Application application = ApplicationExtKt.getApplication();
            WearableDeviceModel wearableDeviceModel2 = this.devicemodel;
            Intrinsics.checkNotNull(wearableDeviceModel2);
            MiBleUnlockProfile miBleUnlockProfile = new MiBleUnlockProfile(application, DeviceModelExtKt.getMac(wearableDeviceModel2), new IProfileStateChangeCallback() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment.onViewCreated.1
                @Override // com.xiaomi.fitness.mijia.sdk.IProfileStateChangeCallback
                public void onState(int var1) throws RemoteException {
                    Companion companion = UnlockPhoneFragment.INSTANCE;
                    Logger.i(companion.getTAG() + " mBleUnlockProfile state = " + var1, new Object[0]);
                    if (var1 == -1) {
                        ToastUtil.showShortToast(wzi.common_not_support);
                        UnlockPhoneFragment.this.onBackPressed();
                        return;
                    }
                    if (var1 != 4) {
                        return;
                    }
                    String tag = companion.getTAG();
                    MiBleUnlockProfile miBleUnlockProfile2 = UnlockPhoneFragment.this.mUnlockPhoneProfile;
                    Logger.i(tag + " mBleUnlockProfile rssi = " + (miBleUnlockProfile2 != null ? Integer.valueOf(miBleUnlockProfile2.getRssi()) : null), new Object[0]);
                    UnlockPhoneFragment.this.getUnlockScreenType();
                }
            });
            this.mUnlockPhoneProfile = miBleUnlockProfile;
            miBleUnlockProfile.connect();
        } else {
            WearableDeviceModel wearableDeviceModel3 = this.devicemodel;
            if (wearableDeviceModel3 != null && com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.isSupportUnlockPhone(wearableDeviceModel3)) {
                FragmentActivity activity = getActivity();
                Boolean boolValueOf = activity != null ? Boolean.valueOf(activity.bindService(bindIntent, this.serviceConnection, 1)) : null;
                Logger.i(TAG + " bind result : " + boolValueOf, new Object[0]);
            }
        }
        ((yi6) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: kaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UnlockPhoneFragment.onViewCreated$lambda$5(this.f23667a, view2);
            }
        });
        ((yi6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: laq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UnlockPhoneFragment.onViewCreated$lambda$6(this.f24840a, view2);
            }
        });
        ((yi6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: maq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UnlockPhoneFragment.onViewCreated$lambda$7(this.f25958a, view2);
            }
        });
        ((yi6) getMBinding()).B.getPaint().setFlags(8);
        ((yi6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: naq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UnlockPhoneFragment.onViewCreated$lambda$8(this.f27733a, view2);
            }
        });
        initRssiArr();
        WearableDeviceModel wearableDeviceModel4 = this.devicemodel;
        if (wearableDeviceModel4 == null || DeviceModelExtKt.isHuaMi(wearableDeviceModel4)) {
            return;
        }
        showLoading();
        ((UnlockPhoneViewModel) getMViewModel()).getAuthorizeUnlock();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        doViewVisible();
    }

    public final void setCheckedIndex(int i) {
        this.checkedIndex = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((UnlockPhoneViewModel) getMViewModel()).getUnlockEnable().observe(getViewLifecycleOwner(), new UnlockPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oaq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UnlockPhoneFragment.setListener$lambda$10(this.f28939a, (Boolean) obj);
            }
        }));
        ((UnlockPhoneViewModel) getMViewModel()).getUnlockDistanceRightValue().observe(getViewLifecycleOwner(), new UnlockPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: paq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UnlockPhoneFragment.setListener$lambda$11(this.f30178a, (Integer) obj);
            }
        }));
    }

    public final void setUnlockPhoneEnable(boolean z) {
        this.isUnlockPhoneEnable = z;
    }

    public final void setUnlockService(@Nullable puc pucVar) {
        this.unlockService = pucVar;
    }
}

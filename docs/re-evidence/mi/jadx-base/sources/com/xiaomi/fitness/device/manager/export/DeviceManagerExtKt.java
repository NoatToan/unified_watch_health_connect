package com.xiaomi.fitness.device.manager.export;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.onetrack.c.i;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.eu6;
import defpackage.kb;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0017\u001a \u0010\u001e\u001a\u00020\u0016*\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"\u001a2\u0010#\u001a\u00020\u0016*\u00020\u00172\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010%2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u001a\u0012\u0010(\u001a\u00020\u0016*\u00020)2\u0006\u0010*\u001a\u00020\u0014\u001aR\u0010L\u001a\u00020\u0016*\u00020\u00172\u0006\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00142\b\u0010O\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010P\u001a\u00020@2\u0006\u0010&\u001a\u00020\u00142\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\b\b\u0002\u0010S\u001a\u00020\"\u001aH\u0010W\u001a\u00020\u0016*\u00020X2\b\b\u0002\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00142\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010P\u001a\u00020@2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020@\u001a\n\u0010Z\u001a\u00020\u0016*\u00020\u0017\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\u0000\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0003\u0010\r\"\u001f\u0010\u0000\u001a\u00020\u000f*\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0003\u0010\u0011\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010V\u001a\u00020@X\u0086T¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"instance", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager$Companion;)Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager$Companion;", "(Lcom/xiaomi/fitness/device/manager/export/WearableProductManager$Companion;)Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "instance$delegate$1", "Lcom/xiaomi/fitness/device/manager/export/DeviceTool;", "Lcom/xiaomi/fitness/device/manager/export/DeviceTool$Companion;", "(Lcom/xiaomi/fitness/device/manager/export/DeviceTool$Companion;)Lcom/xiaomi/fitness/device/manager/export/DeviceTool;", "instance$delegate$2", "Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool;", "Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool$Companion;", "(Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool$Companion;)Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool;", "instance$delegate$3", "ADD_DEVICE_ACTIVITY_PATH", "", "launchToAddDevice", "", "Landroid/content/Context;", "SCAN_PATH", "SHARE_BIND_PATH", "PARAM_SHOW_LIST", "PARAM_PRODUCT", "PARAM_DEVICE", "VIEW_BLOOD_SUGAR_DEVICE", "launchToScanDevice", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "showList", "", "launchToScanDeviceWithIds", "products", "", "to", "TAG", "reportDeviceActive", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", i.d, "BIND_LOCAL_DEVICE_PATH", "BIND_WEAR_OS_DEVICE_PATH", "BIND_HUAMI_DEVICE_PATH", "BIND_BT_DEVICE_PATH", "BIND_ECO_DEVICE_PATH", "BIND_THIRD_PARTY_PATH", "BIND_HEAD_PHONE_DEVICE_PATH", "KEY_DEVICE_INFO", "KEY_PRODUCT_INFO", "KEY_DEVICE_NAME", "KEY_DEVICE_ADDRESS", "KEY_DEVICE_OOB", "KEY_SHARE_ID", "KEY_SHARE_USER_ID", "KEY_SHARE_DID", "KEY_SHARE_MODEL", DeviceManagerExtKt.KEY_FAST_PAIR, "FROM", "TO", DeviceManagerExtKt.KEY_STEP, "BIND_FROM_CLICK", "", "BIND_FROM_AUTO_FIRST", "FROM_QR_CODE", "FROM_SHARE_BIND", "FROM_FAST_PAIR", "FROM_INTERNAL_NFC", "FROM_EXTERNAL_NFC", "FROM_DEEP_LINK", "FROM_SCHEME_ACTIVITY", "FROM_RETRY", "FROM_REBIND", "BIND_THIRD_PARTY_REQUEST_CODE", "launchToBindDevice", "name", "mac", "oob", "from", "fastPairExtras", "Landroid/os/Bundle;", "phoneSwitching", "BAND", "BEAN", DeviceTypes.RING, "launchToBindBloodSugar", "Landroid/app/Activity;", "step", "viewBloodDevice", "device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceManagerExtKt {

    @NotNull
    public static final String ADD_DEVICE_ACTIVITY_PATH = "/device/activity/add";
    public static final int BAND = 0;
    public static final int BEAN = 1;

    @NotNull
    public static final String BIND_BT_DEVICE_PATH = "/device/activity/bind_bt";

    @NotNull
    public static final String BIND_ECO_DEVICE_PATH = "/device/activity/bind_eco";
    public static final int BIND_FROM_AUTO_FIRST = 2;
    public static final int BIND_FROM_CLICK = 1;

    @NotNull
    public static final String BIND_HEAD_PHONE_DEVICE_PATH = "/device/activity/bind_head_phone";

    @NotNull
    public static final String BIND_HUAMI_DEVICE_PATH = "/device/activity/bind_huami";

    @NotNull
    public static final String BIND_LOCAL_DEVICE_PATH = "/device/activity/bind_local";

    @NotNull
    public static final String BIND_THIRD_PARTY_PATH = "/device/activity/bind_third_party_nfc";
    public static final int BIND_THIRD_PARTY_REQUEST_CODE = 100;

    @NotNull
    public static final String BIND_WEAR_OS_DEVICE_PATH = "/device/activity/bind_wear_os";

    @NotNull
    public static final String FROM = "from";
    public static final int FROM_DEEP_LINK = 8;
    public static final int FROM_EXTERNAL_NFC = 7;
    public static final int FROM_FAST_PAIR = 5;
    public static final int FROM_INTERNAL_NFC = 6;
    public static final int FROM_QR_CODE = 3;
    public static final int FROM_REBIND = 11;
    public static final int FROM_RETRY = 10;
    public static final int FROM_SCHEME_ACTIVITY = 9;
    public static final int FROM_SHARE_BIND = 4;

    @NotNull
    public static final String KEY_DEVICE_ADDRESS = "key_device_address";

    @NotNull
    public static final String KEY_DEVICE_INFO = "key_device_info";

    @NotNull
    public static final String KEY_DEVICE_NAME = "key_device_name";

    @NotNull
    public static final String KEY_DEVICE_OOB = "key_device_oob";

    @NotNull
    public static final String KEY_FAST_PAIR = "KEY_FAST_PAIR";

    @NotNull
    public static final String KEY_PRODUCT_INFO = "key_product_info";

    @NotNull
    public static final String KEY_SHARE_DID = "KEY_SHARE_DID";

    @NotNull
    public static final String KEY_SHARE_ID = "KEY_SHARE_ID";

    @NotNull
    public static final String KEY_SHARE_MODEL = "KEY_SHARE_MODEL";

    @NotNull
    public static final String KEY_SHARE_USER_ID = "KEY_SHARE_USER_ID";

    @NotNull
    public static final String KEY_STEP = "KEY_STEP";

    @NotNull
    public static final String PARAM_DEVICE = "param_device";

    @NotNull
    public static final String PARAM_PRODUCT = "param_product";

    @NotNull
    public static final String PARAM_SHOW_LIST = "param_show_list";
    public static final int RING = 2;

    @NotNull
    public static final String SCAN_PATH = "/device/manager/scan";

    @NotNull
    public static final String SHARE_BIND_PATH = "/device/manager/share";

    @NotNull
    private static final String TAG = "DeviceManagerExt";

    @NotNull
    public static final String TO = "to";

    @NotNull
    public static final String VIEW_BLOOD_SUGAR_DEVICE = "view_blood_sugar_device";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: v96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerExtKt.instance_delegate$lambda$3();
        }
    });

    @NotNull
    public static final WearableDeviceManager getInstance(@NotNull WearableDeviceManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (WearableDeviceManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceManager instance_delegate$lambda$0() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getWearableDeviceManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableProductManager instance_delegate$lambda$1() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getWearableProductManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceTool instance_delegate$lambda$2() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getDeviceTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BluetoothPermissionTool instance_delegate$lambda$3() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getBluetoothPermissionDialogUtil();
    }

    public static final void launchToAddDevice(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(DeviceTool.INSTANCE).launchToScanDevice(context, null, true);
    }

    public static final void launchToBindBloodSugar(@NotNull Activity activity, @NotNull String name, @NotNull String mac, @Nullable String str, @NotNull Product product, int i, @NotNull String to, int i2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(to, "to");
        kb.c().a(BIND_THIRD_PARTY_PATH).withString("key_device_address", mac).withString("key_device_name", name).withParcelable("key_product_info", product).withString("key_device_oob", str).withString("to", to).withInt("from", i).withInt(KEY_STEP, i2).navigation(activity, 100);
    }

    public static final void launchToBindDevice(@NotNull Context context, @NotNull String name, @NotNull String mac, @Nullable String str, @NotNull Product product, int i, @NotNull String to, @Nullable Bundle bundle, boolean z) {
        String str2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(to, "to");
        if (DeviceModelExtKt.isLocalDevice(product)) {
            str2 = BIND_LOCAL_DEVICE_PATH;
        } else if (DeviceModelExtKt.isHuami(product)) {
            str2 = BIND_HUAMI_DEVICE_PATH;
        } else {
            str2 = DeviceModelExtKt.isBloodSugar(product) ? BIND_THIRD_PARTY_PATH : BIND_BT_DEVICE_PATH;
        }
        if (!DeviceModelExtKt.isWearOS(product)) {
            kb.c().a(str2).withString("key_device_address", mac).withString("key_device_name", name).withParcelable("key_product_info", product).withString("key_device_oob", str).withString("to", to).withInt("from", i).withInt("sProductId", product.getProductId()).withString("sDeviceName", product.getProductName()).withBundle(KEY_FAST_PAIR, bundle).navigation(context);
            return;
        }
        WearOSUtil.Companion companion = WearOSUtil.INSTANCE;
        if (WearOsExtKt.getInstance(companion).isWearosRequirementNotPass()) {
            ToastUtil.showToast("Please upgrade Google GMS version first");
        } else {
            WearOsExtKt.getInstance(companion).launchBindWearOSPage(context, mac, name, product.getProductId(), bundle, z);
        }
    }

    public static final void launchToScanDevice(@NotNull Context context, @Nullable Product product, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(DeviceTool.INSTANCE).launchToScanDevice(context, product, z);
    }

    public static /* synthetic */ void launchToScanDevice$default(Context context, Product product, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            product = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        launchToScanDevice(context, product, z);
    }

    public static final void launchToScanDeviceWithIds(@NotNull Context context, @Nullable List<? extends Product> list, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(DeviceTool.INSTANCE).launchToScanDeviceWithIds(context, list, z, str);
    }

    public static /* synthetic */ void launchToScanDeviceWithIds$default(Context context, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        launchToScanDeviceWithIds(context, list, z, str);
    }

    public static final void reportDeviceActive(@NotNull final WearableDeviceModel wearableDeviceModel, @NotNull final String eventName) {
        final String strValueOf;
        DeviceInfoExt deviceInfo;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Logger.i(TAG, "reportDeviceActive: " + eventName);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuamiApiCaller huaMiApiCaller = getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            strValueOf = String.valueOf((huaMiApiCaller == null || (deviceInfo = huaMiApiCaller.getDeviceInfo()) == null) ? null : Integer.valueOf(deviceInfo.getDeviceSource()));
        } else {
            strValueOf = "";
        }
        final Function1 function1 = new Function1() { // from class: q96
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceManagerExtKt.reportDeviceActive$lambda$4(wearableDeviceModel, strValueOf, eventName, (String) obj);
            }
        };
        String firmwareVersion = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
        if (firmwareVersion == null || firmwareVersion.length() == 0) {
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.reportDeviceActive.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    function1.invoke2("");
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Function1<String, Unit> function2 = function1;
                    String firmwareVersion2 = result.getFirmwareVersion();
                    if (firmwareVersion2 == null) {
                        firmwareVersion2 = "";
                    }
                    function2.invoke2(firmwareVersion2);
                }
            });
        } else {
            function1.invoke2(firmwareVersion);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceActive$lambda$4(WearableDeviceModel this_reportDeviceActive, String sku, String eventName, String version) {
        Intrinsics.checkNotNullParameter(this_reportDeviceActive, "$this_reportDeviceActive");
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(version, "version");
        String name = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(this_reportDeviceActive);
        String subcategory = this_reportDeviceActive.getProduct().getSubcategory();
        String str = subcategory == null ? "" : subcategory;
        String did = this_reportDeviceActive.getDid();
        String model = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(this_reportDeviceActive);
        String sn = this_reportDeviceActive.getDeviceInfo().getSn();
        getInstance(DeviceTool.INSTANCE).reportDeviceActive(eventName, new DeviceActiveBean(name, str, did, sn == null ? "" : sn, sku, model, version));
        return Unit.INSTANCE;
    }

    public static final void viewBloodDevice(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(DeviceTool.INSTANCE).launchToAddDevice(context, true);
    }

    @NotNull
    public static final WearableProductManager getInstance(@NotNull WearableProductManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (WearableProductManager) instance$delegate$1.getValue();
    }

    @NotNull
    public static final DeviceTool getInstance(@NotNull DeviceTool.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (DeviceTool) instance$delegate$2.getValue();
    }

    @NotNull
    public static final BluetoothPermissionTool getInstance(@NotNull BluetoothPermissionTool.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (BluetoothPermissionTool) instance$delegate$3.getValue();
    }
}

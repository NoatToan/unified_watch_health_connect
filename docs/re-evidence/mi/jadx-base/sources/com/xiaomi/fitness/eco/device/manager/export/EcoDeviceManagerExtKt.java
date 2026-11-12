package com.xiaomi.fitness.eco.device.manager.export;

import android.content.Context;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.onetrack.c.i;
import dagger.hilt.android.EntryPointAccessors;
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
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a<\u0010&\u001a\u00020\f*\u00020'2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u000f\u001a\u0014\u0010/\u001a\u00020\f*\u00020'2\b\u00100\u001a\u0004\u0018\u00010\u000f\u001a$\u00101\u001a\u00020\f\"\u0004\b\u0000\u00102*\b\u0012\u0004\u0012\u0002H2032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H205\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\"X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\"X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\"X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\"X\u0086T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"instance", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager$Companion;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager$Companion;", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager$Companion;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager;", "instance$delegate$1", "reportDeviceActive", "", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", i.d, "", "BIND_ROPE_SKIPPING_LIST_PATH", "BIND_ECO_DEVICE_PATH", "BIND_ECO_HUAMI_SCALE_DEVICE_PATH", "ECO_BIND_LOCAL_DEVICE_PATH", "ECO_BIND_BT_DEVICE_PATH", "ECO_KEY_DEVICE_DID", "ECO_KEY_DEVICE_INFO", "ECO_KEY_PRODUCT_INFO", "ECO_KEY_DEVICE_NAME", "ECO_KEY_DEVICE_ADDRESS", "ECO_KEY_DEVICE_OOB", "ECO_KEY_SHARE_ID", "ECO_KEY_SHARE_USER_ID", "ECO_KEY_SHARE_DID", "ECO_KEY_SHARE_MODEL", "ECO_FROM", "ECO_TO", "ECO_FROM_COMMON_SCAN", "", "ECO_FROM_NFC", "ECO_FROM_QR_CODE", "ECO_FROM_SHARE_BIND", "launchToBindDevice", "Landroid/content/Context;", "name", "mac", "oob", "product", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "from", "to", "launchToBindRopeSkippingList", "did", "setList", "E", "", "list", "", "eco-device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceManagerExtKt {

    @NotNull
    public static final String BIND_ECO_DEVICE_PATH = "/ecoDevice/activity/bind_eco";

    @NotNull
    public static final String BIND_ECO_HUAMI_SCALE_DEVICE_PATH = "/ecoDevice/activity/bind_eco_huami_scale";

    @NotNull
    public static final String BIND_ROPE_SKIPPING_LIST_PATH = "/ecoDevice/activity/bind_rope_skipping_list";

    @NotNull
    public static final String ECO_BIND_BT_DEVICE_PATH = "/ecoDevice/activity/bind_bt";

    @NotNull
    public static final String ECO_BIND_LOCAL_DEVICE_PATH = "/ecoDevice/activity/local_bind_eco";

    @NotNull
    public static final String ECO_FROM = "from";
    public static final int ECO_FROM_COMMON_SCAN = 1;
    public static final int ECO_FROM_NFC = 2;
    public static final int ECO_FROM_QR_CODE = 3;
    public static final int ECO_FROM_SHARE_BIND = 4;

    @NotNull
    public static final String ECO_KEY_DEVICE_ADDRESS = "key_device_address";

    @NotNull
    public static final String ECO_KEY_DEVICE_DID = "key_device_did";

    @NotNull
    public static final String ECO_KEY_DEVICE_INFO = "key_device_info";

    @NotNull
    public static final String ECO_KEY_DEVICE_NAME = "key_device_name";

    @NotNull
    public static final String ECO_KEY_DEVICE_OOB = "key_device_oob";

    @NotNull
    public static final String ECO_KEY_PRODUCT_INFO = "key_product_info";

    @NotNull
    public static final String ECO_KEY_SHARE_DID = "KEY_SHARE_DID";

    @NotNull
    public static final String ECO_KEY_SHARE_ID = "KEY_SHARE_ID";

    @NotNull
    public static final String ECO_KEY_SHARE_MODEL = "KEY_SHARE_MODEL";

    @NotNull
    public static final String ECO_KEY_SHARE_USER_ID = "KEY_SHARE_USER_ID";

    @NotNull
    public static final String ECO_TO = "to";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zr7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: as7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceManagerExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final EcoDeviceManager getInstance(@NotNull EcoDeviceManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoDeviceManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManager instance_delegate$lambda$0() {
        return ((EcoDevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDevicePoint.class)).getEcoDeviceManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoProductManager instance_delegate$lambda$1() {
        return ((EcoDevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDevicePoint.class)).getEcoProductManager();
    }

    public static final void launchToBindDevice(@NotNull Context context, @NotNull String name, @NotNull String mac, @Nullable String str, @NotNull EcoProduct product, int i, @NotNull String to) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(to, "to");
        kb.c().a(EcoDeviceModelExtKt.isLocalDevice(product) ? ECO_BIND_LOCAL_DEVICE_PATH : ECO_BIND_BT_DEVICE_PATH).withString("key_device_address", mac).withString("key_device_name", name).withParcelable("key_product_info", product).withString("key_device_oob", str).withString("to", to).withInt("from", i).navigation(context);
    }

    public static final void launchToBindRopeSkippingList(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        kb.c().a(BIND_ROPE_SKIPPING_LIST_PATH).withString("key_device_did", str).navigation(context);
    }

    public static final void reportDeviceActive(@NotNull final EcoDeviceModel ecoDeviceModel, @NotNull final String eventName) {
        final String strValueOf;
        DeviceInfoExt deviceInfo;
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Logger.i("EcoDeviceManager", "reportDeviceActive: " + eventName);
        if (EcoDeviceModelExtKt.isHuaMi(ecoDeviceModel)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(EcoDeviceModelExtKt.getMac(ecoDeviceModel));
            strValueOf = String.valueOf((huaMiApiCaller == null || (deviceInfo = huaMiApiCaller.getDeviceInfo()) == null) ? null : Integer.valueOf(deviceInfo.getDeviceSource()));
        } else {
            strValueOf = "";
        }
        Function1 function1 = new Function1() { // from class: yr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceManagerExtKt.reportDeviceActive$lambda$2(ecoDeviceModel, strValueOf, eventName, (String) obj);
            }
        };
        String firmwareVersion = EcoDeviceModelExtKt.getFirmwareVersion(ecoDeviceModel) == null ? EcoConnectPreference.INSTANCE.getFirmwareVersion(ecoDeviceModel.getDid()) : EcoDeviceModelExtKt.getFirmwareVersion(ecoDeviceModel);
        if (firmwareVersion == null || firmwareVersion.length() == 0) {
            return;
        }
        function1.invoke2(firmwareVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceActive$lambda$2(EcoDeviceModel this_reportDeviceActive, String sku, String eventName, String version) {
        Intrinsics.checkNotNullParameter(this_reportDeviceActive, "$this_reportDeviceActive");
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(version, "version");
        String name = EcoDeviceModelExtKt.getName(this_reportDeviceActive);
        String subcategory = this_reportDeviceActive.getProduct().getSubcategory();
        String str = subcategory == null ? "" : subcategory;
        String did = this_reportDeviceActive.getDid();
        String model = EcoDeviceModelExtKt.getModel(this_reportDeviceActive);
        String sn = this_reportDeviceActive.getDeviceInfo().getSn();
        DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).reportDeviceActive(eventName, new DeviceActiveBean(name, str, did, sn == null ? "" : sn, sku, model, version));
        return Unit.INSTANCE;
    }

    public static final <E> void setList(@NotNull List<E> list, @NotNull List<? extends E> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "list");
        list.clear();
        list.addAll(list2);
    }

    @NotNull
    public static final EcoProductManager getInstance(@NotNull EcoProductManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoProductManager) instance$delegate$1.getValue();
    }
}

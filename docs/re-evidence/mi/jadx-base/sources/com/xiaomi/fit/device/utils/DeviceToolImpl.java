package com.xiaomi.fit.device.utils;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.export.FoundDeviceCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.report.DeviceActiveTracker;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.c.i;
import defpackage.fai;
import defpackage.fu6;
import defpackage.gu6;
import defpackage.kb;
import defpackage.nrd;
import defpackage.s69;
import defpackage.xj4;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\tH\u0016J2\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017JO\u0010\u0013\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0002\b\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010\u001c\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010!\u001a\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0010H\u0096@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0012H\u0016J\u0018\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0012H\u0002¨\u00063"}, d2 = {"Lcom/xiaomi/fit/device/utils/DeviceToolImpl;", "Lcom/xiaomi/fitness/device/manager/export/DeviceTool;", "<init>", "()V", "launchToAddDevice", "", "context", "Landroid/content/Context;", "viewBloodSugarDevice", "", "launchToScanDevice", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "showList", "launchToScanDeviceWithIds", "products", "", "to", "", "foundDeviceByScanBluetooth", "namePrefixList", "wearProductIdList", "", "localProductIdList", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/FoundDeviceCallback;", "Lkotlin/ExtensionFunctionType;", "reportDeviceActive", i.d, "eventValue", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;", "firmwareVersion", "saveDeviceRecordToDatabase", "value", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeviceRecordFromDatabaseTimeout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncHuamiStatisticData", "selectOtherDeviceTab", "fragment", "Landroidx/fragment/app/Fragment;", "isVersionSupport", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", b.n, "compareFirmwareVersion", "latestVersion", "currentVersion", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceToolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceToolImpl.kt\ncom/xiaomi/fit/device/utils/DeviceToolImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1863#2,2:144\n1#3:146\n*S KotlinDebug\n*F\n+ 1 DeviceToolImpl.kt\ncom/xiaomi/fit/device/utils/DeviceToolImpl\n*L\n61#1:144,2\n*E\n"})
public final class DeviceToolImpl implements DeviceTool {

    @NotNull
    private static final String REGEX_FIRMWARE_VERSION = "^(\\d+).(\\d+).(\\d+)$";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ Annotation ajc$anno$1;
    private static /* synthetic */ nrd.a ajc$tjp_0;
    private static /* synthetic */ nrd.a ajc$tjp_1;

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("DeviceToolImpl.kt", DeviceToolImpl.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("1", "launchToAddDevice", "com.xiaomi.fit.device.utils.DeviceToolImpl", "android.content.Context:boolean", "context:viewBloodSugarDevice", "", "void"), 0);
        ajc$tjp_1 = s69Var.h("method-execution", s69Var.g("1", "launchToScanDeviceWithIds", "com.xiaomi.fit.device.utils.DeviceToolImpl", "android.content.Context:java.util.List:boolean:java.lang.String", "context:products:showList:to", "", "void"), 0);
    }

    private final int compareFirmwareVersion(String latestVersion, String currentVersion) {
        Pattern patternCompile = Pattern.compile(REGEX_FIRMWARE_VERSION);
        Matcher matcher = patternCompile.matcher(latestVersion);
        Matcher matcher2 = patternCompile.matcher(currentVersion);
        if (!matcher.matches() || !matcher2.matches()) {
            throw new IllegalArgumentException("firmware version not matched".toString());
        }
        for (int i = 1; i < 4; i++) {
            String strGroup = matcher.group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher2.group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
            int i3 = Integer.parseInt(strGroup2);
            if (i2 > i3) {
                return 1;
            }
            if (i2 < i3) {
                return -1;
            }
        }
        return 0;
    }

    public static final /* synthetic */ void launchToAddDevice_aroundBody0(DeviceToolImpl deviceToolImpl, Context context, boolean z, nrd nrdVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(DeviceManagerExtKt.ADD_DEVICE_ACTIVITY_PATH).withFlags(67108864).withBoolean(DeviceManagerExtKt.VIEW_BLOOD_SUGAR_DEVICE, z).navigation(context);
    }

    public static final /* synthetic */ void launchToScanDeviceWithIds_aroundBody2(DeviceToolImpl deviceToolImpl, Context context, List list, boolean z, String str, nrd nrdVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        DeviceInfo deviceInfo = null;
        if (list != null && (!list.isEmpty())) {
            deviceInfo = DeviceExtKt.toDeviceInfo((Product) list.get(0));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Product product = (Product) it.next();
                if (deviceInfo != null) {
                    deviceInfo.addProductId(product.getProductId());
                }
            }
        }
        kb.c().a(DeviceManagerExtKt.SCAN_PATH).withFlags(67108864).withParcelable(DeviceManagerExtKt.PARAM_DEVICE, deviceInfo).withBoolean(DeviceManagerExtKt.PARAM_SHOW_LIST, z).withString("to", str).navigation(context);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    @Nullable
    public Object deleteDeviceRecordFromDatabaseTimeout(@NotNull Continuation<? super Boolean> continuation) {
        return DeviceActiveTracker.INSTANCE.deleteDeviceRecordFromDatabaseTimeout(continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public void foundDeviceByScanBluetooth(@NotNull List<String> namePrefixList, @Nullable List<Integer> wearProductIdList, @Nullable List<Integer> localProductIdList, @NotNull Function1<? super FoundDeviceCallback, Unit> callback) {
        Intrinsics.checkNotNullParameter(namePrefixList, "namePrefixList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceActiveTracker.INSTANCE.foundDeviceByScanBluetooth(namePrefixList, wearProductIdList, localProductIdList, callback);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public boolean isVersionSupport(@NotNull WearableDeviceModel deviceModel, @NotNull String feature) {
        String str;
        String firmwareVersion;
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Map<String, String> featureMap = deviceModel.getProduct().getFeatureMap();
        if (featureMap == null || (str = featureMap.get(feature)) == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel)) == null) {
            return true;
        }
        return !(DeviceModelExtKt.isBluetooth(deviceModel) || DeviceModelExtKt.isWearOS(deviceModel)) || compareFirmwareVersion(firmwareVersion, str) >= 0;
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    @NeedLogin
    public void launchToAddDevice(@NotNull Context context, boolean viewBloodSugarDevice) throws Throwable {
        nrd nrdVarD = s69.d(ajc$tjp_0, this, this, context, xj4.a(viewBloodSugarDevice));
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new fu6(new Object[]{this, context, xj4.a(viewBloodSugarDevice), nrdVarD}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = DeviceToolImpl.class.getDeclaredMethod("launchToAddDevice", Context.class, Boolean.TYPE).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public void launchToScanDevice(@NotNull Context context, @Nullable Product product, boolean showList) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(DeviceManagerExtKt.SCAN_PATH).withFlags(67108864).withParcelable(DeviceManagerExtKt.PARAM_PRODUCT, product).withBoolean(DeviceManagerExtKt.PARAM_SHOW_LIST, showList).navigation(context);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    @NeedLogin
    public void launchToScanDeviceWithIds(@NotNull Context context, @Nullable List<? extends Product> products, boolean showList, @Nullable String to) throws Throwable {
        nrd nrdVarE = s69.e(ajc$tjp_1, this, this, new Object[]{context, products, xj4.a(showList), to});
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new gu6(new Object[]{this, context, products, xj4.a(showList), to, nrdVarE}).c(69648);
        Annotation annotation = ajc$anno$1;
        if (annotation == null) {
            annotation = DeviceToolImpl.class.getDeclaredMethod("launchToScanDeviceWithIds", Context.class, List.class, Boolean.TYPE, String.class).getAnnotation(NeedLogin.class);
            ajc$anno$1 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public void reportDeviceActive(@NotNull String eventName, @NotNull DeviceActiveBean eventValue) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        DeviceActiveTracker.INSTANCE.reportDeviceActive(eventName, eventValue);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    @Nullable
    public Object saveDeviceRecordToDatabase(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveDeviceRecordToDatabase = DeviceActiveTracker.INSTANCE.saveDeviceRecordToDatabase(list, continuation);
        return objSaveDeviceRecordToDatabase == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveDeviceRecordToDatabase : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public void selectOtherDeviceTab(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof DeviceTabParentFragmentV4) {
            ((DeviceTabParentFragmentV4) fragment).selectOtherDeviceTab();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public void syncHuamiStatisticData() {
        DeviceActiveTracker.INSTANCE.syncHuamiStatisticData();
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTool
    public void reportDeviceActive(@Nullable String firmwareVersion) {
        DeviceActiveTracker.INSTANCE.reportDeviceActive(firmwareVersion);
    }
}

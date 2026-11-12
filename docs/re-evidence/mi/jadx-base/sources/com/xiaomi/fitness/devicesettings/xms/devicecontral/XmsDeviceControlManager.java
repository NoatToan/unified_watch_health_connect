package com.xiaomi.fitness.devicesettings.xms.devicecontral;

import android.content.ContentResolver;
import com.google.gson.Gson;
import com.miui.circulate.device.api.BatteryInfo;
import com.miui.circulate.device.api.Constant;
import com.miui.circulate.device.api.DeviceInfo;
import com.miui.circulate.device.api.GlobalDeviceControl;
import com.miui.circulate.device.api.Icon;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\f\u0010\u0013\u001a\u00020\u0006*\u00020\nH\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/xms/devicecontral/XmsDeviceControlManager;", "Lcom/xiaomi/fitness/devicesettings/xms/devicecontral/DeviceControlImp;", "<init>", "()V", "getDeviceListOnDeviceControl", "", "Lcom/miui/circulate/device/api/DeviceInfo;", "addOrUpdateDevice", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deleteDevice", "did", "", "clearDevices", "", "atomicInsertDeviceByCategory", "", TSMAuthContants.PARAM_DEVICE_MODELS, "toDeviceControlDeviceInfo", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXmsDeviceControlManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmsDeviceControlManager.kt\ncom/xiaomi/fitness/devicesettings/xms/devicecontral/XmsDeviceControlManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 XmsDeviceControlManager.kt\ncom/xiaomi/fitness/devicesettings/xms/devicecontral/XmsDeviceControlManager\n*L\n83#1:123,2\n*E\n"})
public final class XmsDeviceControlManager implements DeviceControlImp {

    @NotNull
    public static final String TAG = "XmsDeviceControlManager";

    private final DeviceInfo toDeviceControlDeviceInfo(WearableDeviceModel wearableDeviceModel) throws UnsupportedEncodingException {
        Product.Size size;
        Product.Size size2;
        Product.Size size3;
        DeviceInfo.Builder builder = new DeviceInfo.Builder();
        String strEncode = URLEncoder.encode(wearableDeviceModel.getDid(), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        DeviceInfo.Builder mac = builder.setId(strEncode).setCategory(Constant.DeviceCategory.HEALTH).setDeviceType(wearableDeviceModel.getDeviceInfo().isWatch() ? Constant.DeviceType.WATCH : "band").setMac(DeviceModelExtKt.getMac(wearableDeviceModel));
        Icon.Companion companion = Icon.INSTANCE;
        String smallIcon = wearableDeviceModel.getProduct().getSmallIcon();
        if (smallIcon == null && (smallIcon = wearableDeviceModel.getProduct().getBigIcon()) == null) {
            smallIcon = "";
        }
        DeviceInfo.Builder state = mac.setIcon(companion.fromUri(smallIcon)).setTitle(DeviceModelExtKt.getName(wearableDeviceModel)).setBattery(wearableDeviceModel.getDeviceInfo().getBatteryInfo().getBattery() == -1 ? null : new BatteryInfo(new Double[]{Double.valueOf(((double) wearableDeviceModel.getDeviceInfo().getBatteryInfo().getBattery()) / 100.0d)})).setState(wearableDeviceModel.getIsDeviceConnected() ? 1 : 0);
        Gson gson = new Gson();
        boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(wearableDeviceModel.getDid()) & 2097152) != 0;
        Product product = wearableDeviceModel.getDeviceInfo().getProduct();
        int radius = (product == null || (size3 = product.getSize()) == null) ? 0 : size3.getRadius();
        Product product2 = wearableDeviceModel.getDeviceInfo().getProduct();
        int width = (product2 == null || (size2 = product2.getSize()) == null) ? 0 : size2.getWidth();
        Product product3 = wearableDeviceModel.getDeviceInfo().getProduct();
        return state.setPrivateData(gson.toJson(new DeviceControlPrivateData(z, radius, width, (product3 == null || (size = product3.getSize()) == null) ? 0 : size.getHeight(), wearableDeviceModel.getDeviceInfo().getModel()))).build();
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.devicecontral.DeviceControlImp
    public boolean addOrUpdateDevice(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (!DeviceModelExtKt.isSupportFeature(deviceModel, Feature.FIND)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(toDeviceControlDeviceInfo(deviceModel));
        Logger.i(TAG, "addOrUpdateDevice " + DeviceModelExtKt.getName(deviceModel) + ", battery " + deviceModel.getDeviceInfo().getBatteryInfo().getBattery());
        ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        GlobalDeviceControl.atomicInsertDeviceByCategory(contentResolver, Constant.DeviceCategory.HEALTH, arrayList);
        return true;
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.devicecontral.DeviceControlImp
    public int atomicInsertDeviceByCategory(@NotNull List<? extends WearableDeviceModel> deviceModels) {
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = deviceModels.iterator();
        while (it.hasNext()) {
            arrayList.add(toDeviceControlDeviceInfo((WearableDeviceModel) it.next()));
        }
        ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return GlobalDeviceControl.atomicInsertDeviceByCategory(contentResolver, Constant.DeviceCategory.HEALTH, arrayList);
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.devicecontral.DeviceControlImp
    public void clearDevices() {
        Logger.i(TAG, "clearDevices");
        ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        GlobalDeviceControl.atomicInsertDeviceByCategory(contentResolver, Constant.DeviceCategory.HEALTH, new ArrayList());
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.devicecontral.DeviceControlImp
    public boolean deleteDevice(@NotNull String did) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(did, "did");
        ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        String strEncode = URLEncoder.encode(did, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        boolean zDeleteDevice = GlobalDeviceControl.deleteDevice(contentResolver, strEncode);
        Logger.i(TAG, "deleteDevice " + zDeleteDevice);
        return zDeleteDevice;
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.devicecontral.DeviceControlImp
    @NotNull
    public List<DeviceInfo> getDeviceListOnDeviceControl() {
        ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return GlobalDeviceControl.getDeviceListByUri(contentResolver, Constant.INSTANCE.getHEALTH_DEVICE_LIST_URI());
    }
}

package com.xiaomi.fitness.device.manager.ui.add;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.f;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceModel;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import defpackage.uzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b*\u0010+J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u0004\u0018\u00010\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "otherList", "", "moveBloodSugarDeviceFirst", "(Ljava/util/List;)V", "deviceInfo", "watchList", "bandList", "addDevice", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "tempBandList", "addHuaMiDevice", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;Ljava/util/List;Ljava/util/List;)V", "", "", CardInfo.KEY_CARD_GROUP_ID, "", "isContainGroupId", "(Ljava/util/List;I)Z", "deviceInfos", "getSameGroupProductInfo", "(Ljava/util/List;I)Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "resId", "createLabelItem", "(I)Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "Landroidx/databinding/f;", "getDeviceList", "()Landroidx/databinding/f;", "filter", "(Ljava/util/List;)Landroidx/databinding/f;", "mHuaMiFlag", "Z", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "mProductManager", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "getMProductManager", "()Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "setMProductManager", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;)V", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddDeviceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceModel.kt\ncom/xiaomi/fitness/device/manager/ui/add/AddDeviceModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1863#2:227\n1863#2,2:228\n1864#2:230\n1863#2,2:231\n1872#2,3:233\n1863#2,2:236\n*S KotlinDebug\n*F\n+ 1 AddDeviceModel.kt\ncom/xiaomi/fitness/device/manager/ui/add/AddDeviceModel\n*L\n39#1:227\n45#1:228,2\n39#1:230\n53#1:231,2\n78#1:233,3\n143#1:236,2\n*E\n"})
public final class AddDeviceModel extends BaseModel {
    private boolean mHuaMiFlag = true;
    public ProductManagerInternal mProductManager;

    private final void addDevice(DeviceInfo deviceInfo, List<DeviceInfo> watchList, List<DeviceInfo> bandList, List<DeviceInfo> otherList) {
        List<DeviceInfo> list;
        if (deviceInfo.isWatch()) {
            list = watchList;
        } else {
            list = deviceInfo.isBand() ? bandList : otherList;
        }
        DeviceInfo sameGroupProductInfo = getSameGroupProductInfo(list, deviceInfo.getGroupId());
        if (sameGroupProductInfo == null) {
            deviceInfo.setScanMode(0);
            if (deviceInfo.isWatch()) {
                watchList.add(deviceInfo);
                return;
            } else if (deviceInfo.isBand()) {
                bandList.add(deviceInfo);
                return;
            } else {
                otherList.add(deviceInfo);
                return;
            }
        }
        if (sameGroupProductInfo.getProductId() == sameGroupProductInfo.getGroupId() || deviceInfo.getProductId() != deviceInfo.getGroupId()) {
            sameGroupProductInfo.addProductId(deviceInfo.getProductId());
            return;
        }
        if (deviceInfo.isWatch()) {
            watchList.remove(sameGroupProductInfo);
            watchList.add(deviceInfo);
        } else if (deviceInfo.isBand()) {
            bandList.remove(sameGroupProductInfo);
            bandList.add(deviceInfo);
        } else {
            otherList.remove(sameGroupProductInfo);
            otherList.add(deviceInfo);
        }
        if (sameGroupProductInfo.getProductIds() == null) {
            deviceInfo.addProductId(sameGroupProductInfo.getProductId());
            return;
        }
        List<Integer> productIds = sameGroupProductInfo.getProductIds();
        if (productIds != null) {
            Iterator<T> it = productIds.iterator();
            while (it.hasNext()) {
                deviceInfo.addProductId(((Number) it.next()).intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addHuaMiDevice(final DeviceInfo deviceInfo, List<DeviceInfo> bandList, List<DeviceInfo> tempBandList) {
        deviceInfo.setScanMode(0);
        if (deviceInfo.isKongMing()) {
            if (this.mHuaMiFlag) {
                this.mHuaMiFlag = false;
                deviceInfo.setName(ApplicationExtKt.getApplication().getString(uzi.C0));
                bandList.add(deviceInfo);
                return;
            }
            return;
        }
        if (deviceInfo.getProductId() == 0) {
            bandList.add(deviceInfo);
            return;
        }
        if (isContainGroupId(bandList, deviceInfo.getGroupId())) {
            return;
        }
        if (deviceInfo.getProductId() == deviceInfo.getGroupId()) {
            bandList.add(deviceInfo);
        } else if (((WearableProduct) getMProductManager().findProduct(new Function1() { // from class: hq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AddDeviceModel.addHuaMiDevice$lambda$6(deviceInfo, (WearableProduct) obj));
            }
        })) == null) {
            tempBandList.add(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addHuaMiDevice$lambda$6(DeviceInfo deviceInfo, WearableProduct it) {
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == deviceInfo.getGroupId();
    }

    private final DeviceInfo createLabelItem(int resId) {
        String string = ApplicationExtKt.getApplication().getString(resId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new DeviceInfo(11, string, null, null, null, null, 0, null, 0, null, null, false, false, false, false, false, false, 0, 0, 0, false, null, 4194300, null);
    }

    private final DeviceInfo getSameGroupProductInfo(List<DeviceInfo> deviceInfos, int groupId) {
        Object obj = null;
        if (groupId == 0) {
            return null;
        }
        for (Object obj2 : deviceInfos) {
            if (((DeviceInfo) obj2).getGroupId() == groupId) {
                obj = obj2;
                break;
            }
        }
        return (DeviceInfo) obj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f A[ORIG_RETURN, RETURN] */
    private final boolean isContainGroupId(List<DeviceInfo> bandList, int groupId) {
        for (Object obj : bandList) {
            if (((DeviceInfo) obj).getProductId() == groupId) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final void moveBloodSugarDeviceFirst(List<DeviceInfo> otherList) {
        int i = 0;
        int i2 = 0;
        for (Object obj : otherList) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((DeviceInfo) obj).isBloodSugar()) {
                DeviceInfo deviceInfo = otherList.get(i);
                otherList.set(i, otherList.get(i2));
                otherList.set(i2, deviceInfo);
                i2++;
            }
            i = i3;
        }
    }

    @NotNull
    public final f<DeviceInfo> filter(@NotNull List<DeviceInfo> deviceInfos) {
        Intrinsics.checkNotNullParameter(deviceInfos, "deviceInfos");
        ObservableArrayList observableArrayList = new ObservableArrayList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<DeviceInfo> arrayList4 = new ArrayList();
        this.mHuaMiFlag = true;
        for (DeviceInfo deviceInfo : deviceInfos) {
            if (deviceInfo.isHuami()) {
                addHuaMiDevice(deviceInfo, arrayList2, arrayList4);
            } else {
                addDevice(deviceInfo, arrayList, arrayList2, arrayList3);
            }
            for (DeviceInfo deviceInfo2 : arrayList4) {
                if (!isContainGroupId(arrayList2, deviceInfo2.getProductId())) {
                    arrayList2.add(deviceInfo2);
                }
            }
        }
        try {
            Iterator it = ProductManager.DefaultImpls.getProductList$default(ProductExtKt.getInstance(RNProductManager.INSTANCE), null, 1, null).iterator();
            while (it.hasNext()) {
                arrayList3.add(AddDeviceModelKt.toDeviceInfo((RNProduct) it.next()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i("AddDeviceModel", "RNProductManager.instance.getProductList() error");
        }
        if (!arrayList.isEmpty()) {
            observableArrayList.add(createLabelItem(uzi.d1));
            CollectionsKt__MutableCollectionsKt.addAll(observableArrayList, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            observableArrayList.add(createLabelItem(uzi.c1));
            CollectionsKt__MutableCollectionsKt.addAll(observableArrayList, arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            observableArrayList.add(createLabelItem(uzi.i1));
            moveBloodSugarDeviceFirst(arrayList3);
            CollectionsKt__MutableCollectionsKt.addAll(observableArrayList, arrayList3);
        }
        return observableArrayList;
    }

    @NotNull
    public final f<DeviceInfo> getDeviceList() {
        return filter(getMProductManager().getDeviceInfoList());
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

    public final void setMProductManager(@NotNull ProductManagerInternal productManagerInternal) {
        Intrinsics.checkNotNullParameter(productManagerInternal, "<set-?>");
        this.mProductManager = productManagerInternal;
    }
}

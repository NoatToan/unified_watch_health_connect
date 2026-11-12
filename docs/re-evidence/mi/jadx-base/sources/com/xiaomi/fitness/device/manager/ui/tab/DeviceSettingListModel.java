package com.xiaomi.fitness.device.manager.ui.tab;

import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.extensions.DeviceTabModelExtKt;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListModel;
import defpackage.dui;
import defpackage.uzi;
import defpackage.zv1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0002R0\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "contentItems", "", "", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "getContentItems$annotations", "getContentItems", "()Ljava/util/Map;", "setContentItems", "(Ljava/util/Map;)V", "contentItemBindings", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getContentItemBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getDeviceFeatureList", "", "currentModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "type", "buildTabTitle", "cardType", "hideList", "", "getHideList", "()Ljava/util/Set;", "hideList$delegate", "Lkotlin/Lazy;", "tempHide", "", "featureId", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSettingListModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingListModel.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n27#2,5:96\n1611#3,9:101\n1863#3:110\n1864#3:112\n1620#3:113\n774#3:114\n865#3,2:115\n1#4:111\n*S KotlinDebug\n*F\n+ 1 DeviceSettingListModel.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListModel\n*L\n29#1:96,5\n46#1:101,9\n46#1:110\n46#1:112\n46#1:113\n50#1:114\n50#1:115,2\n46#1:111\n*E\n"})
public final class DeviceSettingListModel extends BaseModel {

    @NotNull
    private final ItemBinding<TabContentItem> contentItemBindings;
    public Map<Integer, TabContentItem> contentItems;

    /* JADX INFO: renamed from: hideList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hideList;

    public DeviceSettingListModel() {
        final Function3 function3 = new Function3() { // from class: lc6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceSettingListModel.contentItemBindings$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (TabContentItem) obj3);
            }
        };
        this.contentItemBindings = ItemBinding.INSTANCE.of(new OnItemBind<TabContentItem>() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<TabContentItem> itemBinding, int position, TabContentItem item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.hideList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mc6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceSettingListModel.hideList_delegate$lambda$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit contentItemBindings$lambda$0(ItemBinding itemBinding, int i, TabContentItem item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemType = item.getItemType();
        if (itemType == 11) {
            itemBinding.set(zv1.g, dui.y);
        } else if (itemType == 13) {
            itemBinding.set(zv1.g, dui.G);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getContentItems$annotations() {
    }

    private final Set<Integer> getHideList() {
        return (Set) this.hideList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet hideList_delegate$lambda$4() {
        HashSet hashSet = new HashSet();
        hashSet.add(150);
        hashSet.add(148);
        return hashSet;
    }

    private final boolean tempHide(int featureId) {
        boolean zContains = getHideList().contains(Integer.valueOf(featureId));
        if (zContains) {
            Logger.w("hide feature item:" + featureId, new Object[0]);
        }
        return zContains;
    }

    public final int buildTabTitle(int cardType) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (cardType == 18) {
            return (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) ? uzi.b2 : uzi.c2;
        }
        switch (cardType) {
            case 6:
                return uzi.h1;
            case 7:
                return uzi.B0;
            case 8:
                return uzi.v;
            case 9:
                return uzi.N1;
            case 10:
                return uzi.G1;
            case 11:
                return uzi.e1;
            case 12:
                return uzi.w0;
            case 13:
                return uzi.D0;
            case 14:
                return uzi.Y1;
            case 15:
                return uzi.t;
            default:
                return -1;
        }
    }

    @NotNull
    public final ItemBinding<TabContentItem> getContentItemBindings() {
        return this.contentItemBindings;
    }

    @NotNull
    public final Map<Integer, TabContentItem> getContentItems() {
        Map<Integer, TabContentItem> map = this.contentItems;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentItems");
        return null;
    }

    @NotNull
    public final List<TabContentItem> getDeviceFeatureList(@NotNull WearableDeviceModel currentModel, int type) {
        Intrinsics.checkNotNullParameter(currentModel, "currentModel");
        ArrayList arrayList = new ArrayList();
        List<Integer> listBuildBleV4FeatureIds = DeviceModelExtKt.isBluetooth(currentModel) ? DeviceTabModelExtKt.buildBleV4FeatureIds(type) : DeviceModelExtKt.isWearOS(currentModel) ? DeviceTabModelExtKt.buildWearOSV4FeatureIds(type) : DeviceTabModelExtKt.buildHuamiV4FeatureIds(type);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listBuildBleV4FeatureIds.iterator();
        while (it.hasNext()) {
            Object obj = (TabContentItem) getContentItems().get(Integer.valueOf(((Number) it.next()).intValue()));
            if (obj instanceof IItemChangesWithDevice) {
                ((IItemChangesWithDevice) obj).onDeviceChanged(currentModel.getDid());
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            TabContentItem tabContentItem = (TabContentItem) obj2;
            if (!tempHide(tabContentItem.getType()) && tabContentItem.getItemVisible(currentModel)) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void setContentItems(@NotNull Map<Integer, TabContentItem> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.contentItems = map;
    }
}

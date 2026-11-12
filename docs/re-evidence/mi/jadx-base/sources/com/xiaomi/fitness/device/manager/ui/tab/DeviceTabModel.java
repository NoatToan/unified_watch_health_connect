package com.xiaomi.fitness.device.manager.ui.tab;

import androidx.lifecycle.MutableLiveData;
import com.fitness.banner.export.v2.BannerItemV2;
import com.mi.fitness.alexa.export.AlexaExportUtilKt;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.extensions.DeviceTabModelExtKt;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabModel;
import defpackage.d2m;
import defpackage.dui;
import defpackage.hni;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0018H\u0002R0\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "contentItems", "", "", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "getContentItems$annotations", "getContentItems", "()Ljava/util/Map;", "setContentItems", "(Ljava/util/Map;)V", "tabItemBindings", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getTabItemBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "settingTabItemBindings", "getSettingTabItemBindings", "bannerItemV4Bindings", "Lcom/fitness/banner/export/v2/BannerItemV2;", "getBannerItemV4Bindings", "getDeviceNormalTabList", "currentModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "type", "hideList", "", "getHideList", "()Ljava/util/Set;", "hideList$delegate", "Lkotlin/Lazy;", "tempHide", "", "featureId", "buildTabTitle", "cardType", "buildTabIcon", "deviceModel", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceTabModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceTabModel.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n27#2,5:157\n27#2,5:162\n27#2,5:167\n1611#3,9:172\n1863#3:181\n1864#3:183\n1620#3:184\n774#3:185\n865#3,2:186\n1#4:182\n*S KotlinDebug\n*F\n+ 1 DeviceTabModel.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabModel\n*L\n34#1:157,5\n59#1:162,5\n63#1:167,5\n72#1:172,9\n72#1:181\n72#1:183\n72#1:184\n76#1:185\n76#1:186,2\n72#1:182\n*E\n"})
public final class DeviceTabModel extends BaseModel {

    @NotNull
    private final ItemBinding<BannerItemV2> bannerItemV4Bindings;
    public Map<Integer, TabContentItem> contentItems;

    /* JADX INFO: renamed from: hideList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hideList;

    @NotNull
    private final ItemBinding<TabContentItem> settingTabItemBindings;

    @NotNull
    private final ItemBinding<TabContentItem> tabItemBindings;

    public DeviceTabModel() {
        final Function3 function3 = new Function3() { // from class: xr6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceTabModel.tabItemBindings$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (TabContentItem) obj3);
            }
        };
        ItemBinding.Companion companion = ItemBinding.INSTANCE;
        this.tabItemBindings = companion.of(new OnItemBind<TabContentItem>() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<TabContentItem> itemBinding, int position, TabContentItem item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        final Function3 function4 = new Function3() { // from class: yr6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceTabModel.settingTabItemBindings$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (TabContentItem) obj3);
            }
        };
        this.settingTabItemBindings = companion.of(new OnItemBind<TabContentItem>() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabModel$special$$inlined$itemBindingOf$2
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<TabContentItem> itemBinding, int position, TabContentItem item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function4.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        final Function3 function5 = new Function3() { // from class: zr6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceTabModel.bannerItemV4Bindings$lambda$2((ItemBinding) obj, ((Integer) obj2).intValue(), (BannerItemV2) obj3);
            }
        };
        this.bannerItemV4Bindings = companion.of(new OnItemBind<BannerItemV2>() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabModel$special$$inlined$itemBindingOf$3
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<BannerItemV2> itemBinding, int position, BannerItemV2 item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function5.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.hideList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: as6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabModel.hideList_delegate$lambda$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerItemV4Bindings$lambda$2(ItemBinding itemBinding, int i, BannerItemV2 item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(zv1.g, dui.v);
        return Unit.INSTANCE;
    }

    private final int buildTabIcon(int cardType, WearableDeviceModel deviceModel) {
        if (cardType == 18) {
            if (DeviceModelExtKt.isWearOS(deviceModel)) {
                return hni.p;
            }
            return AlexaExportUtilKt.isSupportAlexa(deviceModel) ? hni.z : hni.y;
        }
        if (cardType == 19) {
            return hni.s;
        }
        switch (cardType) {
            case 6:
                return hni.v;
            case 7:
                return hni.t;
            case 8:
                return hni.f20265r;
            case 9:
                return hni.x;
            case 10:
                return hni.w;
            case 11:
                return hni.u;
            default:
                return -1;
        }
    }

    public static /* synthetic */ void getContentItems$annotations() {
    }

    private final Set<Integer> getHideList() {
        return (Set) this.hideList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet hideList_delegate$lambda$6() {
        HashSet hashSet = new HashSet();
        hashSet.add(150);
        hashSet.add(148);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settingTabItemBindings$lambda$1(ItemBinding itemBinding, int i, TabContentItem item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(zv1.g, dui.L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tabItemBindings$lambda$0(ItemBinding itemBinding, int i, TabContentItem item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        int type = item.getType();
        if (type == 1) {
            itemBinding.set(zv1.g, dui.M);
        } else if (type == 102) {
            itemBinding.set(zv1.g, dui.C);
        } else if (type == 200) {
            itemBinding.set(zv1.g, dui.E);
        } else if (type == 203) {
            itemBinding.set(zv1.g, dui.s);
        } else if (type == 3) {
            itemBinding.set(zv1.g, dui.w);
        } else if (type == 4) {
            itemBinding.set(zv1.f41705a, dui.u);
        } else if (type == 5) {
            itemBinding.set(zv1.g, dui.B);
        }
        return Unit.INSTANCE;
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
            case 16:
            case 17:
            default:
                return -1;
            case 18:
                return (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) ? uzi.b2 : uzi.c2;
            case 19:
                return uzi.v0;
        }
    }

    @NotNull
    public final ItemBinding<BannerItemV2> getBannerItemV4Bindings() {
        return this.bannerItemV4Bindings;
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

    @Nullable
    public final TabContentItem getDeviceNormalTabList(@NotNull WearableDeviceModel currentModel, int type) {
        int iBuildTabTitle;
        Intrinsics.checkNotNullParameter(currentModel, "currentModel");
        List<Integer> listBuildBleV4FeatureIds = DeviceModelExtKt.isBluetooth(currentModel) ? DeviceTabModelExtKt.buildBleV4FeatureIds(type) : DeviceModelExtKt.isWearOS(currentModel) ? DeviceTabModelExtKt.buildWearOSV4FeatureIds(type) : DeviceTabModelExtKt.buildHuamiV4FeatureIds(type);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listBuildBleV4FeatureIds.iterator();
        while (it.hasNext()) {
            Object obj = (TabContentItem) getContentItems().get(Integer.valueOf(((Number) it.next()).intValue()));
            if (obj instanceof IItemChangesWithDevice) {
                ((IItemChangesWithDevice) obj).onDeviceChanged(currentModel.getDid());
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            TabContentItem tabContentItem = (TabContentItem) obj2;
            if (!tempHide(tabContentItem.getType()) && tabContentItem.getItemVisible(currentModel)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty() || (iBuildTabTitle = buildTabTitle(type)) == -1) {
            return null;
        }
        int iBuildTabIcon = buildTabIcon(type, currentModel);
        String string = ApplicationExtKt.getApplication().getString(iBuildTabTitle);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        MutableLiveData<String> liveData = StringExtKt.toLiveData(string);
        MutableLiveData<String> liveData2 = (type != 9 || d2m.y(ApplicationExtKt.getApplication())) ? StringExtKt.toLiveData("") : StringExtKt.toLiveData(" ");
        return new TabContentItem(11, type, iBuildTabIcon, liveData, null, false, null, null, null, null, null, null, liveData2, 4080, null);
    }

    @NotNull
    public final ItemBinding<TabContentItem> getSettingTabItemBindings() {
        return this.settingTabItemBindings;
    }

    @NotNull
    public final ItemBinding<TabContentItem> getTabItemBindings() {
        return this.tabItemBindings;
    }

    public final void setContentItems(@NotNull Map<Integer, TabContentItem> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.contentItems = map;
    }
}

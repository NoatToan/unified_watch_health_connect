package com.xiaomi.fitness.device.manager.ui.add;

import android.view.View;
import androidx.databinding.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceViewModel;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import defpackage.dui;
import defpackage.zv1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006*\u0001.\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 RY\u0010*\u001aD\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040(0!j\b\u0012\u0004\u0012\u00020\u0004`)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceModel;", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "list", "", "setList", "(Landroidx/databinding/f;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "mProductManager", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceListAdapter;", "adapter", "Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceListAdapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "deviceItemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getDeviceItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Landroidx/lifecycle/MutableLiveData;", "", "deviceItems", "Landroidx/lifecycle/MutableLiveData;", "getDeviceItems", "()Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "viewHolderFactory", "Lkotlin/jvm/functions/Function2;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "com/xiaomi/fitness/device/manager/ui/add/AddDeviceViewModel$mProductChangeListener$1", "mProductChangeListener", "Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewModel$mProductChangeListener$1;", "<init>", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,67:1\n27#2,5:68\n*S KotlinDebug\n*F\n+ 1 AddDeviceViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewModel\n*L\n29#1:68,5\n*E\n"})
public final class AddDeviceViewModel extends BaseViewModel<AddDeviceModel> {

    @NotNull
    private final AddDeviceListAdapter adapter;

    @NotNull
    private final ItemBinding<DeviceInfo> deviceItemBinding;

    @NotNull
    private final MutableLiveData<List<DeviceInfo>> deviceItems;

    @NotNull
    private final AddDeviceViewModel$mProductChangeListener$1 mProductChangeListener;

    @NotNull
    private final ProductManagerInternal mProductManager;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<DeviceInfo>> viewHolderFactory;

    /* JADX WARN: Type inference failed for: r3v6, types: [com.xiaomi.fitness.device.manager.ui.add.AddDeviceViewModel$mProductChangeListener$1] */
    public AddDeviceViewModel(@NotNull ProductManagerInternal mProductManager) {
        Intrinsics.checkNotNullParameter(mProductManager, "mProductManager");
        this.mProductManager = mProductManager;
        this.adapter = new AddDeviceListAdapter();
        final Function3 function3 = new Function3() { // from class: mq0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AddDeviceViewModel.deviceItemBinding$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (DeviceInfo) obj3);
            }
        };
        this.deviceItemBinding = ItemBinding.INSTANCE.of(new OnItemBind<DeviceInfo>() { // from class: com.xiaomi.fitness.device.manager.ui.add.AddDeviceViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<DeviceInfo> itemBinding, int position, DeviceInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.deviceItems = new MutableLiveData<>();
        this.viewHolderFactory = new Function2() { // from class: nq0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AddDeviceViewModel.viewHolderFactory$lambda$1(this.f28240a, (View) obj, ((Integer) obj2).intValue());
            }
        };
        this.mProductChangeListener = new OnProductChangeListener() { // from class: com.xiaomi.fitness.device.manager.ui.add.AddDeviceViewModel$mProductChangeListener$1
            @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
            public void onChange() {
                DeviceModelExtKt.logi("product change, and set product list");
                AddDeviceViewModel addDeviceViewModel = this.this$0;
                addDeviceViewModel.setList(addDeviceViewModel.getMModel().getDeviceList());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceItemBinding$lambda$0(ItemBinding itemBinding, int i, DeviceInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemType = item.getItemType();
        if (itemType == 11) {
            itemBinding.set(zv1.f, dui.A);
        } else if (itemType == 12) {
            itemBinding.set(zv1.f, dui.z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setList(f<DeviceInfo> list) {
        this.deviceItems.setValue(list);
        this.adapter.setDataList((List) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseViewHolder viewHolderFactory$lambda$1(AddDeviceViewModel this$0, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == dui.z) {
            Intrinsics.checkNotNull(view);
            return new AddDeviceViewHolder(view, this$0.adapter.getLifecycle());
        }
        Intrinsics.checkNotNull(view);
        return new AddDeviceLabelViewHolder(view);
    }

    @NotNull
    public final AddDeviceListAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final ItemBinding<DeviceInfo> getDeviceItemBinding() {
        return this.deviceItemBinding;
    }

    @NotNull
    public final MutableLiveData<List<DeviceInfo>> getDeviceItems() {
        return this.deviceItems;
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<DeviceInfo>> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.mProductManager.addProductChangeListener(this.mProductChangeListener);
        this.adapter.setLifecycle(owner.getLifecycle());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.mProductManager.removeProductChangeListener(this.mProductChangeListener);
    }
}

package com.xiaomi.fitness.device.manager.ui.manager;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.extensions.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.ui.AddNewDeviceViewHolder;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.dui;
import defpackage.hni;
import defpackage.n76;
import defpackage.qa6;
import defpackage.zv1;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u000214\b\u0007\u0018\u0000 T2\u00020\u0001:\u0002TUB\t\b\u0007¢\u0006\u0004\bS\u0010\u0018J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020*0=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020*0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FRY\u0010O\u001aD\u0012\u0015\u0012\u0013\u0018\u00010H¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(L\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0M0Gj\b\u0012\u0004\u0012\u00020*`N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "did", "", "connect", "", "status", "", "updateConnectStatus", "(Ljava/lang/String;ZI)V", "Lqa6;", "deviceModel", "isDeviceConnecting", "(Lqa6;)Z", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "updateDeviceItems", "()V", "isEditMode", "()Z", "editMode", "changeMode", "(Z)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/device/manager/l$a;", "callback", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l$a;)V", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "deviceManager", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "getDeviceManager", "()Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "setDeviceManager", "(Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;)V", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "mCurrentDeviceDetail", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceChangeListener", "Lkotlin/jvm/functions/Function1;", "com/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel$mDeviceStatusListener$1", "mDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel$mDeviceStatusListener$1;", "com/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel$mSyncStateListener$1", "mSyncStateListener", "Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel$mSyncStateListener$1;", "Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerAdapter;", "adapter", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Landroidx/databinding/ObservableArrayList;", "items", "Landroidx/databinding/ObservableArrayList;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "viewHolderFactory", "Lkotlin/jvm/functions/Function2;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "<init>", "Companion", "ManagerViewHolder", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nManagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n27#2,5:199\n774#3:204\n865#3,2:205\n774#3:207\n865#3,2:208\n1863#3,2:210\n*S KotlinDebug\n*F\n+ 1 ManagerViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel\n*L\n156#1:199,5\n111#1:204\n111#1:205,2\n116#1:207\n116#1:208,2\n118#1:210,2\n*E\n"})
public final class ManagerViewModel extends AbsViewModel {

    @NotNull
    public static final String ADD_NEW_DID = "did-1";

    @NotNull
    private static final String TAG = "ManagerViewModel";
    public WearableDeviceManagerWrapper deviceManager;

    @NotNull
    private final ItemBinding<DeviceDetail> itemBinding;

    @NotNull
    private final ObservableArrayList<DeviceDetail> items;

    @Nullable
    private DeviceDetail mCurrentDeviceDetail;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<DeviceDetail>> viewHolderFactory;

    @NotNull
    private final Function1<WearableDeviceModel, Unit> mDeviceChangeListener = new Function1() { // from class: o3f
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return ManagerViewModel.mDeviceChangeListener$lambda$0(this.f28693a, (WearableDeviceModel) obj);
        }
    };

    @NotNull
    private final ManagerViewModel$mDeviceStatusListener$1 mDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel$mDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            this.this$0.updateConnectStatus(did, false, 1);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
            this.this$0.updateConnectStatus(did, false, 2);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            this.this$0.updateConnectStatus(did, true, 3);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            this.this$0.updateConnectStatus(did, false, 4);
        }
    };

    @NotNull
    private final ManagerViewModel$mSyncStateListener$1 mSyncStateListener = new SyncStateListener() { // from class: com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel$mSyncStateListener$1
        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (DeviceManagerExtKt.isSyncing(this.this$0.getDeviceManager(), did)) {
                this.this$0.updateConnectStatus(did, true, 7);
            }
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (DeviceManagerExtKt.isSyncing(this.this$0.getDeviceManager(), did)) {
                this.this$0.updateConnectStatus(did, true, 6);
            }
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (DeviceManagerExtKt.isSyncing(this.this$0.getDeviceManager(), did)) {
                this.this$0.updateConnectStatus(did, true, 6);
            }
        }
    };

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p3f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ManagerViewModel.adapter_delegate$lambda$4();
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel$ManagerViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Ln76;", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Ln76;Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ManagerViewHolder extends BaseBindingViewHolder<n76, DeviceDetail> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManagerViewHolder(@NotNull View view) {
            super(zv1.d, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
        public void bindView(@NotNull n76 n76Var, @NotNull DeviceDetail t) {
            Intrinsics.checkNotNullParameter(n76Var, "<this>");
            Intrinsics.checkNotNullParameter(t, "t");
            n76Var.A.setLifecycle(getMAdapter().getLifecycle());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel$mDeviceStatusListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel$mSyncStateListener$1] */
    public ManagerViewModel() {
        final Function3 function3 = new Function3() { // from class: q3f
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ManagerViewModel.itemBinding$lambda$5((ItemBinding) obj, ((Integer) obj2).intValue(), (DeviceDetail) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<DeviceDetail>() { // from class: com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<DeviceDetail> itemBinding, int position, DeviceDetail item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.items = new ObservableArrayList<>();
        this.viewHolderFactory = new Function2() { // from class: r3f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ManagerViewModel.viewHolderFactory$lambda$6((View) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManagerAdapter adapter_delegate$lambda$4() {
        return new ManagerAdapter();
    }

    private final boolean isDeviceConnecting(qa6 deviceModel) {
        return deviceModel.isDeviceConnected() || deviceModel.getDeviceStatus() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$5(ItemBinding itemBinding, int i, DeviceDetail item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.areEqual(item.getDid(), ADD_NEW_DID)) {
            itemBinding.set(zv1.d, dui.t);
        } else {
            itemBinding.set(zv1.d, dui.x);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mDeviceChangeListener$lambda$0(ManagerViewModel this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateDeviceItems();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConnectStatus(String did, boolean connect, int status) {
        DeviceModelExtKt.logi("updateConnectStatus, did=" + did + ", connect=" + connect + ", status=" + status);
        getAdapter().updateItem(did, connect, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseViewHolder viewHolderFactory$lambda$6(View view, int i) {
        if (i == dui.t) {
            Intrinsics.checkNotNull(view);
            return new AddNewDeviceViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new ManagerViewHolder(view);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        DeviceDetail.INSTANCE.setMode(1);
        updateDeviceItems();
        getDeviceManager().addDeviceChangeListener(this.mDeviceChangeListener);
        getDeviceManager().addDeviceStatusListener(this.mDeviceStatusListener);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addSyncStateListener(this.mSyncStateListener);
    }

    public final void changeMode(boolean editMode) {
        DeviceDetail.INSTANCE.setMode(editMode ? 2 : 1);
        getAdapter().notifyItemRangeChanged(0, getAdapter().getItemCount(), 1);
    }

    @NotNull
    public final ManagerAdapter getAdapter() {
        return (ManagerAdapter) this.adapter.getValue();
    }

    @NotNull
    public final WearableDeviceManagerWrapper getDeviceManager() {
        WearableDeviceManagerWrapper wearableDeviceManagerWrapper = this.deviceManager;
        if (wearableDeviceManagerWrapper != null) {
            return wearableDeviceManagerWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceManager");
        return null;
    }

    @NotNull
    public final ItemBinding<DeviceDetail> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<DeviceDetail> getItems() {
        return this.items;
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<DeviceDetail>> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    public final boolean isEditMode() {
        return DeviceDetail.INSTANCE.checkIsEditMode();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        getAdapter().setLifecycle(owner.getLifecycle());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        getDeviceManager().removeDeviceChangeListener(this.mDeviceChangeListener);
        getDeviceManager().removeDeviceStatusListener(this.mDeviceStatusListener);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeSyncStateListener(this.mSyncStateListener);
    }

    public final void setDeviceManager(@NotNull WearableDeviceManagerWrapper wearableDeviceManagerWrapper) {
        Intrinsics.checkNotNullParameter(wearableDeviceManagerWrapper, "<set-?>");
        this.deviceManager = wearableDeviceManagerWrapper;
    }

    public final void unbindDevice(@NotNull String did, @NotNull l.a callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getDeviceManager().unbindDevice(did, callback);
    }

    public final void updateDeviceItems() {
        this.items.clear();
        Iterable deviceModels = getDeviceManager().getDeviceModels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : deviceModels) {
            if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLibai((WearableDeviceModel) obj)) {
                arrayList.add(obj);
            }
        }
        Logger.i(TAG, "device list changed to " + arrayList.size());
        this.mCurrentDeviceDetail = null;
        ArrayList<WearableDeviceModel> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.isThirdPartyDevice((WearableDeviceModel) obj2)) {
                arrayList2.add(obj2);
            }
        }
        for (WearableDeviceModel wearableDeviceModel : arrayList2) {
            DeviceDetail deviceDetail = new DeviceDetail();
            deviceDetail.setDid(wearableDeviceModel.getDid());
            deviceDetail.setIcon(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getPreviewIcon(wearableDeviceModel));
            deviceDetail.setDefaultIcon(com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBandType(wearableDeviceModel) ? hni.i : hni.l);
            deviceDetail.setName(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(wearableDeviceModel));
            Intrinsics.checkNotNull(wearableDeviceModel, "null cannot be cast to non-null type com.xiaomi.fitness.device.model.api.DeviceModelWrapper");
            qa6 qa6Var = (qa6) wearableDeviceModel;
            deviceDetail.setConnecting(isDeviceConnecting(qa6Var));
            deviceDetail.setConnectStatus(wearableDeviceModel.getDeviceStatus());
            deviceDetail.setCurrent(wearableDeviceModel.isCurrent());
            deviceDetail.setAccessory(qa6Var.isAccessory());
            deviceDetail.setMac(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            DeviceModelExtKt.logi("device did: " + wearableDeviceModel.getDid() + " is current " + wearableDeviceModel.isCurrent());
            if (wearableDeviceModel.isCurrent()) {
                this.mCurrentDeviceDetail = deviceDetail;
            } else {
                this.items.add(deviceDetail);
            }
        }
        DeviceDetail deviceDetail2 = this.mCurrentDeviceDetail;
        if (deviceDetail2 != null) {
            this.items.add(0, deviceDetail2);
        }
        DeviceDetail deviceDetail3 = new DeviceDetail();
        deviceDetail3.setDid(ADD_NEW_DID);
        this.items.add(deviceDetail3);
    }
}

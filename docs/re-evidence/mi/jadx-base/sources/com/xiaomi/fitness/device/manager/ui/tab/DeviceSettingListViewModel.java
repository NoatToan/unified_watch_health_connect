package com.xiaomi.fitness.device.manager.ui.tab;

import android.view.View;
import androidx.databinding.ObservableArrayList;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListViewModel;
import defpackage.dui;
import defpackage.zv1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020!J&\u0010*\u001a\u00020(2\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020(0,J\"\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020(01R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018RU\u0010\u001a\u001aD\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#0\u001cj\b\u0012\u0004\u0012\u00020\r`\u001b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "settingTabItems", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "getSettingTabItems", "()Landroidx/databinding/ObservableArrayList;", "settingTabBindings", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getSettingTabBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "settingTabBindings$delegate", "settingAdapter", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingsItemAdapter;", "getSettingAdapter", "()Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingsItemAdapter;", "settingAdapter$delegate", "settingHolder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "getSettingHolder", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "createSettingItems", "", "type", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function3;", "unbind", "did", "", "callback", "Lkotlin/Function1;", "TAG", "getTAG", "()Ljava/lang/String;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingListViewModel extends BaseViewModel<DeviceSettingListModel> {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pc6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceSettingListViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final ObservableArrayList<TabContentItem> settingTabItems = new ObservableArrayList<>();

    /* JADX INFO: renamed from: settingTabBindings$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingTabBindings = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qc6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceSettingListViewModel.settingTabBindings_delegate$lambda$1(this.f31357a);
        }
    });

    /* JADX INFO: renamed from: settingAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rc6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceSettingListViewModel.settingAdapter_delegate$lambda$2();
        }
    });

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<TabContentItem>> settingHolder = new Function2() { // from class: sc6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return DeviceSettingListViewModel.settingHolder$lambda$3((View) obj, ((Integer) obj2).intValue());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceSettingsItemAdapter settingAdapter_delegate$lambda$2() {
        return new DeviceSettingsItemAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseViewHolder settingHolder$lambda$3(View view, int i) {
        if (i == dui.G) {
            Intrinsics.checkNotNull(view);
            return new DeviceSettingsSwitchItemViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new DeviceSettingsNormalItemViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemBinding settingTabBindings_delegate$lambda$1(DeviceSettingListViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMModel().getContentItemBindings().bindExtra(zv1.f41707k, this$0);
    }

    public final void createSettingItems(int type) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        this.settingTabItems.clear();
        this.settingTabItems.addAll(getMModel().getDeviceFeatureList(wearableDeviceModel, type));
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    @NotNull
    public final DeviceSettingsItemAdapter getSettingAdapter() {
        return (DeviceSettingsItemAdapter) this.settingAdapter.getValue();
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<TabContentItem>> getSettingHolder() {
        return this.settingHolder;
    }

    @NotNull
    public final ItemBinding<TabContentItem> getSettingTabBindings() {
        return (ItemBinding) this.settingTabBindings.getValue();
    }

    @NotNull
    public final ObservableArrayList<TabContentItem> getSettingTabItems() {
        return this.settingTabItems;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "DeviceSettingListViewModel";
    }

    public final void setOnClickListener(@NotNull Function3<? super TabContentItem, ? super Integer, ? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getSettingAdapter().setOnItemClickListener(listener);
    }

    public final void unbind(@NotNull final String did, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        final boolean z = false;
        if (wearableDeviceModel != null && DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            z = true;
        }
        deviceManagerExtKt.unbindDevice(did, new l.a() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListViewModel.unbind.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                Logger.i(DeviceSettingListViewModel.this.getTAG(), "unbind device " + did + " fail: " + code);
                callback.invoke2(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                Logger.i(DeviceSettingListViewModel.this.getTAG(), "unbind device success: " + did);
                AnyExtKt.main$default(null, new DeviceSettingListViewModel$unbind$1$onSuccess$1(z, did, callback, null), 1, null);
            }
        });
    }
}

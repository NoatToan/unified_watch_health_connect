package com.xiaomi.fitness.devicesettings.huami.handletype;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.handletype.WearLocationFragment;
import com.xiaomi.fitness.settingitem.settingitem.WearHand;
import defpackage.eui;
import defpackage.iba;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/handletype/WearLocationFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/handletype/HuaMiHandlerTypeViewModel;", "Liba;", "Lcom/xiaomi/fitness/settingitem/settingitem/WearHand$Way;", "way", "", "updateWearHandleType", "(Lcom/xiaomi/fitness/settingitem/settingitem/WearHand$Way;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearLocationFragment extends BaseLoadableBindingFragment<HuaMiHandlerTypeViewModel, iba> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(WearLocationFragment this$0, WearHand wearHand) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = wearHand.getWay() == WearHand.Way.LEFT_HAND;
        ((iba) this$0.getMBinding()).A.setChecked(z);
        ((iba) this$0.getMBinding()).B.setChecked(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(WearLocationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateWearHandleType(WearHand.Way.LEFT_HAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(WearLocationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateWearHandleType(WearHand.Way.RIGHT_HAND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateWearHandleType(WearHand.Way way) {
        ((HuaMiHandlerTypeViewModel) getMViewModel()).setWearHandleType(way);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.x2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.l9);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if ((wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel) || !wearableDeviceModel.getIsDeviceConnected()) && (mActivity = getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
        ((HuaMiHandlerTypeViewModel) getMViewModel()).getSetWearHand().observe(getViewLifecycleOwner(), new Observer() { // from class: k7r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WearLocationFragment.onViewCreated$lambda$0(this.f23570a, (WearHand) obj);
            }
        });
        ((HuaMiHandlerTypeViewModel) getMViewModel()).loadWearHandleType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((iba) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: l7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearLocationFragment.setListener$lambda$1(this.f24751a, view);
            }
        });
        ((iba) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: m7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearLocationFragment.setListener$lambda$2(this.f25859a, view);
            }
        });
    }
}

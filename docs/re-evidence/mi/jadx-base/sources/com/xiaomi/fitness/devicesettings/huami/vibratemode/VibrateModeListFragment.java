package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListFragment;
import defpackage.ej6;
import defpackage.eui;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeListFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeListViewModel;", "Lej6;", "", "initActionBar", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter;", "mVibrateModeAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "modeList", "Ljava/util/ArrayList;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VibrateModeListFragment extends BaseLoadableBindingFragment<VibrateModeListViewModel, ej6> {
    public static final int SET_VIBRATE_REQUEST_CODE = 1001;
    private VibrateModeAdapter mVibrateModeAdapter;

    @NotNull
    private ArrayList<VibrateModeBean> modeList = new ArrayList<>();

    private final void initActionBar() {
        setTitle(wzi.f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(VibrateModeListFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VibrateModeAdapter vibrateModeAdapter = this$0.mVibrateModeAdapter;
        if (vibrateModeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVibrateModeAdapter");
            vibrateModeAdapter = null;
        }
        ArrayList<VibrateModeBean> arrayList = ListExtKt.toArrayList(list);
        Intrinsics.checkNotNull(arrayList);
        vibrateModeAdapter.updateData(arrayList);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.I0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1001) {
            ((VibrateModeListViewModel) getMViewModel()).loadModeSettingList(getContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if ((wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) && (mActivity = getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
        this.mVibrateModeAdapter = new VibrateModeAdapter(this.modeList);
        ((ej6) getMBinding()).A.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = ((ej6) getMBinding()).A;
        VibrateModeAdapter vibrateModeAdapter = this.mVibrateModeAdapter;
        VibrateModeAdapter vibrateModeAdapter2 = null;
        if (vibrateModeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVibrateModeAdapter");
            vibrateModeAdapter = null;
        }
        recyclerView.setAdapter(vibrateModeAdapter);
        ((VibrateModeListViewModel) getMViewModel()).getModeList().observe(getViewLifecycleOwner(), new VibrateModeListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tpq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VibrateModeListFragment.onViewCreated$lambda$0(this.f34918a, (List) obj);
            }
        }));
        ((VibrateModeListViewModel) getMViewModel()).loadModeSettingList(getContext());
        VibrateModeAdapter vibrateModeAdapter3 = this.mVibrateModeAdapter;
        if (vibrateModeAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVibrateModeAdapter");
        } else {
            vibrateModeAdapter2 = vibrateModeAdapter3;
        }
        vibrateModeAdapter2.setOnItemClickListener(new VibrateModeAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListFragment.onViewCreated.2
            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAdapter.OnItemClickListener
            public void onItemClick(int position) {
                WearableDeviceModel wearableDeviceModel2 = wearableDeviceModel;
                if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
                    return;
                }
                Object obj = this.modeList.get(position);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Bundle bundle = new Bundle();
                bundle.putSerializable(VibrateModeSetFragment.VIBRATE, (VibrateModeBean) obj);
                BaseFragmentExKt.gotoPageForResult(this, (Class<?>) VibrateModeSetFragment.class, bundle, 1001);
            }
        });
    }
}

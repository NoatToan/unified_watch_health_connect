package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceInfoFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceInfoModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.aw1;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.sh6;
import defpackage.sli;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoViewModel;", "Lsh6;", "", "initContentView", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "<init>", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLocalDeviceInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDeviceInfoFragment.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,67:1\n54#2,3:68\n24#2:71\n57#2,6:72\n63#2,2:79\n57#3:78\n*S KotlinDebug\n*F\n+ 1 LocalDeviceInfoFragment.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalDeviceInfoFragment\n*L\n52#1:68,3\n52#1:71\n52#1:72,6\n52#1:79,2\n52#1:78\n*E\n"})
public final class LocalDeviceInfoFragment extends BaseBindingFragment<LocalDeviceInfoViewModel, sh6> {

    @Nullable
    private EcoDeviceModel deviceModel;

    public LocalDeviceInfoFragment() {
        super(fvi.m, aw1.f3505b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initContentView() {
        getMBinding().E.setVisibility(8);
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        Logger.d(BaseFragment.TAG, "initContentView product:" + (ecoDeviceModel != null ? ecoDeviceModel.getProduct() : null));
        ImageView deviceImageview = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(deviceImageview, "deviceImageview");
        EcoDeviceModel ecoDeviceModel2 = this.deviceModel;
        Intrinsics.checkNotNull(ecoDeviceModel2);
        Coil.imageLoader(deviceImageview.getContext()).enqueue(new ImageRequest.Builder(deviceImageview.getContext()).data(DeviceModelExtKt.getDeviceIconUrl(ecoDeviceModel2, 2)).target(deviceImageview).build());
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((LocalDeviceInfoViewModel) getMViewModel()).loadLocalDeviceInfo(this.deviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(LocalDeviceInfoFragment this$0, LocalDeviceInfoModel localDeviceInfoModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(sli.f33764a);
        getMBinding().G.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        this.deviceModel = localDeviceModel;
        Logger.d(BaseFragment.TAG, "onCreate deviceModel:" + localDeviceModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(e1j.N3);
        if (this.deviceModel != null) {
            initContentView();
        } else {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, e1j.f);
            }
            onBackPressed();
        }
        ((LocalDeviceInfoViewModel) getMViewModel()).getDeviceInfo().observe(getViewLifecycleOwner(), new LocalDeviceInfoFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalDeviceInfoFragment.onViewCreated$lambda$2(this.f26925a, (LocalDeviceInfoModel) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
    }
}

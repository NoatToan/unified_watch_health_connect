package com.xiaomi.fitness.device.manager.ui.add;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import defpackage.bji;
import defpackage.dui;
import defpackage.eli;
import defpackage.g16;
import defpackage.uzi;
import defpackage.zv1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = DeviceManagerExtKt.ADD_DEVICE_ACTIVITY_PATH)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewModel;", "Lg16;", "", "setRecyclerView", "()V", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "device", "onPrivacyAccepted", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;)V", "bindView", "(Lg16;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "isTabletAndLandscape", "()Z", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddDeviceActivity extends Hilt_AddDeviceActivity<AddDeviceViewModel, g16> {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AddDeviceViewModel access$getMViewModel(AddDeviceActivity addDeviceActivity) {
        return (AddDeviceViewModel) addDeviceActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTabletAndLandscape() {
        return UIUtils.INSTANCE.isTabletAndLandscape(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final AddDeviceActivity this$0, final DeviceInfo device, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(view, "view");
        if (device.getItemType() == 11) {
            return Unit.INSTANCE;
        }
        boolean z = false;
        try {
            RNProductManager productExtKt = ProductExtKt.getInstance(RNProductManager.INSTANCE);
            String model = device.getModel();
            if (model == null) {
                model = "";
            }
            if (productExtKt.getProductByModel(model) != null) {
                z = true;
            }
        } catch (Exception e) {
            Logger.e("AddDeviceActivity", "device is illegal ", e);
        }
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(this$0);
        } else if (!device.isVersionSupport()) {
            ToastExtKt.toastShort(this$0, uzi.a2);
        } else if (Intrinsics.areEqual("yunmai.scales.ms3001", device.getModel()) || z) {
            EcoProduct ecoProduct = new EcoProduct();
            String model2 = device.getModel();
            Intrinsics.checkNotNull(model2);
            ecoProduct.setModel(model2);
            ecoProduct.setProductId(device.getProductId());
            ecoProduct.setProductName(device.getName());
            EcoBindDeviceManager.DefaultImpls.showResetGuideView$default(EcoBindDeviceManagerExtKt.getInstance(EcoBindDeviceManager.INSTANCE), this$0, ecoProduct, new IBindGuideAction() { // from class: com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity$onCreate$1$1
                @Override // com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction
                public void onBack() {
                }

                @Override // com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction
                public void onKnown() {
                    ScanDeviceActivity.Companion companion = ScanDeviceActivity.INSTANCE;
                    AddDeviceActivity addDeviceActivity = this.this$0;
                    DeviceInfo deviceInfo = device;
                    companion.launch$device_manager_chinaProductRelease(addDeviceActivity, deviceInfo, !deviceInfo.isBand());
                }
            }, this$0.getMiuiActionBar(), false, 16, null);
        } else {
            PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).showPrivacySensitiveDialogIfNeed(this$0, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity$onCreate$1$2
                @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
                public void onPrivacyAccepted() {
                    this.this$0.onPrivacyAccepted(device);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrivacyAccepted(DeviceInfo device) {
        if (device.getType() == 12) {
            BloodSugarExtKt.launchBloodSugarBind$default(this, device.getProductId(), null, 2, null);
        } else {
            ScanDeviceActivity.INSTANCE.launch$device_manager_chinaProductRelease(this, device, !device.isBand());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRecyclerView() {
        RecyclerView.o layoutManager = ((g16) getMBinding()).A.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        gridLayoutManager.C(isTabletAndLandscape() ? 4 : 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity.setRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                DeviceInfo itemData = AddDeviceActivity.access$getMViewModel(AddDeviceActivity.this).getAdapter().getItemData(position);
                if (itemData == null) {
                    return 0;
                }
                int itemType = itemData.getItemType();
                if (itemType != 11) {
                    if (itemType == 12) {
                        return 1;
                    }
                    if (!UIUtils.INSTANCE.isTabletAndLandscape(AddDeviceActivity.this)) {
                        return 2;
                    }
                } else if (!AddDeviceActivity.this.isTabletAndLandscape()) {
                    return 2;
                }
                return 4;
            }
        });
        float dimen = ResourceExtKt.getDimen(this, eli.e);
        ((g16) getMBinding()).A.addItemDecoration(new GridItemSpace(dimen, dimen, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final g16 g16Var) {
        Intrinsics.checkNotNullParameter(g16Var, "<this>");
        setRecyclerView();
        ((AddDeviceViewModel) getMViewModel()).getDeviceItems().observe(this, new Observer<List<? extends DeviceInfo>>() { // from class: com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity.bindView.1
            @Override // androidx.lifecycle.Observer
            public /* bridge */ /* synthetic */ void onChanged(List<? extends DeviceInfo> list) {
                onChanged2((List<DeviceInfo>) list);
            }

            /* JADX INFO: renamed from: onChanged, reason: avoid collision after fix types in other method */
            public void onChanged2(List<DeviceInfo> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AddDeviceActivity addDeviceActivity = AddDeviceActivity.this;
                g16 g16Var2 = g16Var;
                Logger.i("AddDeviceActivity", "deviceitems = " + it);
                if (!it.isEmpty()) {
                    int i = 0;
                    if (addDeviceActivity.getIntent().getBooleanExtra(DeviceManagerExtKt.VIEW_BLOOD_SUGAR_DEVICE, false)) {
                        for (Object obj : it) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            if (((DeviceInfo) obj).isBloodSugar()) {
                                g16Var2.A.scrollToPosition(i);
                            }
                            i = i2;
                        }
                    }
                }
                AddDeviceActivity.access$getMViewModel(AddDeviceActivity.this).getDeviceItems().removeObserver(this);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dui.f15941b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return zv1.f41707k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setRecyclerView();
        ((g16) getMBinding()).A.setPaddingRelative((int) ResourceExtKt.getDimen(this, eli.f16776b), 0, (int) ResourceExtKt.getDimen(this, eli.f16775a), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.add.Hilt_AddDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AddDeviceViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3() { // from class: fq0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AddDeviceActivity.onCreate$lambda$1(this.f18072a, (DeviceInfo) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        setTitle(uzi.q);
        setActionBarResizeable(true);
        setTitleBackground(bji.e);
    }
}

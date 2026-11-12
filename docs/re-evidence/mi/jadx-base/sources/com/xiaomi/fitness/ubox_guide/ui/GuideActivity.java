package com.xiaomi.fitness.ubox_guide.ui;

import android.app.ActionBar;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.e;
import androidx.navigation.fragment.NavHostFragment;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import defpackage.esi;
import defpackage.g6q;
import defpackage.l8q;
import defpackage.lvi;
import defpackage.mxi;
import defpackage.wc0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/GuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/ubox_guide/ui/GuideViewModel;", "Ll8q;", "Landroidx/navigation/NavController;", "navController", "", "startSetup", "(Landroidx/navigation/NavController;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideActivity extends Hilt_GuideActivity<GuideViewModel, l8q> {
    public GuideNavigator guideNavigator;

    private final void startSetup(NavController navController) {
        e eVarC = navController.k().c(mxi.f27314a);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            List<String> features = wearableDeviceModel.getProduct().getFeatures();
            boolean z = false;
            if (features != null && features.contains(Feature.APP_LAYOUT)) {
                z = true;
            }
            g6q.a("GuideActivity hasAppLayout:" + z);
            if (z) {
                eVarC.P(esi.f17022a);
            } else {
                eVarC.P(esi.i);
            }
        } else {
            g6q.a("GuideActivity currentDeviceModel is null");
            finish();
        }
        navController.E(eVarC);
    }

    @NotNull
    public final GuideNavigator getGuideNavigator() {
        GuideNavigator guideNavigator = this.guideNavigator;
        if (guideNavigator != null) {
            return guideNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideNavigator");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return lvi.f25473a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.xiaomi.fitness.ubox_guide.ui.Hilt_GuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        wc0 appCompatActionBar = getAppCompatActionBar();
        if (appCompatActionBar != null) {
            appCompatActionBar.hide();
        }
        Fragment fragmentK0 = getSupportFragmentManager().k0(esi.h);
        Intrinsics.checkNotNull(fragmentK0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController navControllerP = ((NavHostFragment) fragmentK0).p();
        Intrinsics.checkNotNullExpressionValue(navControllerP, "getNavController(...)");
        startSetup(navControllerP);
        getGuideNavigator().bind(navControllerP);
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }
}

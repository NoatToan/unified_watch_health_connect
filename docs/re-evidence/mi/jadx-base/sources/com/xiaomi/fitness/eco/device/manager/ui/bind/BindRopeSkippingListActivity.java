package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.RopeSkippingDevice;
import defpackage.dji;
import defpackage.dw1;
import defpackage.fui;
import defpackage.sq7;
import defpackage.yzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = EcoDeviceManagerExtKt.BIND_ROPE_SKIPPING_LIST_PATH)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel;", "Lsq7;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lsq7;)V", LifecycleConstantKt.ON_RESUME, "()V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BindRopeSkippingListActivity extends Hilt_BindRopeSkippingListActivity<BindRopeSkippingListViewModel, sq7> {

    @NotNull
    public static final String BIND_ROPE_SKIPPING_LIST_CLASS = "com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListActivity";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String GYM_LAUNCH_ECO_SPORT_CLASS = "com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity";

    @NotNull
    public static final String PLUGIN_RN_CLASS = "com.miot.rn.plugin.activity.PluginRNActivity";

    @NotNull
    private static final String TAG = "BindRopeSkippingListActivity";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListActivity$Companion;", "", "<init>", "()V", "TAG", "", "PLUGIN_RN_CLASS", "BIND_ROPE_SKIPPING_LIST_CLASS", "GYM_LAUNCH_ECO_SPORT_CLASS", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(BindRopeSkippingListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceManagerExtKt.launchToAddDevice(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RopeSkippingDevice device, int i, View view) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(view, "view");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull sq7 sq7Var) {
        Intrinsics.checkNotNullParameter(sq7Var, "<this>");
        sq7Var.A.setOnClickListener(new View.OnClickListener() { // from class: dn2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindRopeSkippingListActivity.bindView$lambda$1(this.f15710a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dw1.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.Hilt_BindRopeSkippingListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(yzi.f40720a);
        setTitleBackground(dji.c);
        ((BindRopeSkippingListViewModel) getMViewModel()).setDid(String.valueOf(getIntent().getStringExtra("key_device_did")));
        ((BindRopeSkippingListViewModel) getMViewModel()).setOnItemClickListener(new Function3() { // from class: en2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindRopeSkippingListActivity.onCreate$lambda$0((RopeSkippingDevice) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((BindRopeSkippingListViewModel) getMViewModel()).updateDeviceList(true);
    }
}

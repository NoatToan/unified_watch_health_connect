package com.xiaomi.fitness.device.manager.ui.bind;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.ui.bind.BindHuaMiDeviceDeviceActivity;
import com.xiaomi.fitness.main.export.MainExtKt;
import defpackage.uzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = DeviceManagerExtKt.BIND_HUAMI_DEVICE_PATH)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindHuaMiDeviceDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindHuamiViewModel;", "<init>", "()V", "startBind", "", "showFailedTip", "message", "", "status", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindHuaMiDeviceDeviceActivity extends Hilt_BindHuaMiDeviceDeviceActivity<BindHuamiViewModel> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFailedTip$lambda$3(BindHuaMiDeviceDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MainExtKt.showMainActivity$default(this$0, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$2(final BindHuaMiDeviceDeviceActivity this$0, MultiplePermissionsBuilder requestBluetoothIfNeed) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestBluetoothIfNeed, "$this$requestBluetoothIfNeed");
        requestBluetoothIfNeed.allGranted(new Function0() { // from class: rl2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindHuaMiDeviceDeviceActivity.startBind$lambda$2$lambda$0(this.f32656a);
            }
        });
        requestBluetoothIfNeed.denied(new Function1() { // from class: sl2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindHuaMiDeviceDeviceActivity.startBind$lambda$2$lambda$1(this.f33750a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$2$lambda$0(BindHuaMiDeviceDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.startBind();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$2$lambda$1(BindHuaMiDeviceDeviceActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void showFailedTip(@NotNull String message, int status) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (status != 12) {
            super.showFailedTip(message, status);
            return;
        }
        getMBinding().F.setText(message);
        getMBinding().E.setText(uzi.common_exit);
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: ql2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindHuaMiDeviceDeviceActivity.showFailedTip$lambda$3(this.f31616a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void startBind() {
        BluetoothPermissionTool.DefaultImpls.requestBluetoothIfNeed$default(DeviceManagerExtKt.getInstance(BluetoothPermissionTool.INSTANCE), this, false, new Function1() { // from class: pl2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindHuaMiDeviceDeviceActivity.startBind$lambda$2(this.f30512a, (MultiplePermissionsBuilder) obj);
            }
        }, 2, null);
    }
}

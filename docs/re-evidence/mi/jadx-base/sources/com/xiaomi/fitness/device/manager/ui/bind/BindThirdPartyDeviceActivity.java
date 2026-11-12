package com.xiaomi.fitness.device.manager.ui.bind;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceWebUrlsKt;
import com.xiaomi.fitness.device.manager.ui.bind.BindThirdPartyDeviceActivity;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = DeviceManagerExtKt.BIND_THIRD_PARTY_PATH)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeBindStatus", "showFailedTip", "message", "", "status", "", "onBindSuccess", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindThirdPartyDeviceActivity extends Hilt_BindThirdPartyDeviceActivity<BindThirdPartyDeviceViewModel> {

    @NotNull
    private static final String TAG = "BindBloodSugarDeviceAct";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeBindStatus$lambda$3(BindThirdPartyDeviceActivity this$0, Integer num) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 8) {
            string = this$0.getString(uzi.G, DeviceWebUrlsKt.getBindBloodSugarHelpUrl());
        } else if (num != null && num.intValue() == 10) {
            string = this$0.getString(uzi.F, DeviceWebUrlsKt.getBindBloodSugarHelpUrl());
        } else if (num != null && num.intValue() == 9) {
            string = this$0.getString(uzi.H, DeviceWebUrlsKt.getBindBloodSugarHelpUrl());
        } else if (num != null && num.intValue() == 5) {
            string = this$0.getString(uzi.D, DeviceWebUrlsKt.getBindBloodSugarHelpUrl());
        } else {
            string = (num != null && num.intValue() == 1) ? this$0.getString(uzi.y, DeviceWebUrlsKt.getBindBloodSugarHelpUrl()) : null;
        }
        if (string != null && string.length() != 0) {
            Intrinsics.checkNotNull(num);
            this$0.showFailedTip(string, num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(BindThirdPartyDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BindThirdPartyDeviceViewModel) this$0.getMViewModel()).getNeedNfcActivate().postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BindThirdPartyDeviceActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("needNfcActivate", true);
            this$0.setResult(-1, intent);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(BindThirdPartyDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getMDeviceInfo().isSportMachine()) {
            BloodSugarExtKt.launchBloodSugarGuide(this$0);
        }
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void observeBindStatus() {
        ((BindThirdPartyDeviceViewModel) getMViewModel()).getBindStatus$device_manager_chinaProductRelease().observe(this, new BindThirdPartyDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ko2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindThirdPartyDeviceActivity.observeBindStatus$lambda$3(this.f24033a, (Integer) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void onBindSuccess() {
        getMBinding().K.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.bind.Hilt_BindThirdPartyDeviceActivity, com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().getIntExtra(DeviceManagerExtKt.KEY_STEP, 0);
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: ho2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindThirdPartyDeviceActivity.onCreate$lambda$0(this.f20276a, view);
            }
        });
        ((BindThirdPartyDeviceViewModel) getMViewModel()).getNeedNfcActivate().observe(this, new BindThirdPartyDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindThirdPartyDeviceActivity.onCreate$lambda$1(this.f21934a, (Boolean) obj);
            }
        }));
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: jo2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindThirdPartyDeviceActivity.onCreate$lambda$2(this.f22963a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void showFailedTip(@NotNull String message, int status) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.showFailedTip(message, status);
        getMBinding().G.setVisibility(8);
    }
}

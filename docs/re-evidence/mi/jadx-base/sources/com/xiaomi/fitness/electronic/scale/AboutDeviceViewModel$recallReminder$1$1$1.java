package com.xiaomi.fitness.electronic.scale;

import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.electronic.scale.AboutDeviceViewModel$recallReminder$1$1$1;
import com.xiaomi.fitness.electronic.scale.config.main.UnbindDeviceCallback;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelperExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import defpackage.qal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/xiaomi/fitness/electronic/scale/AboutDeviceViewModel$recallReminder$1$1$1", "Lcom/xiaomi/fitness/electronic/scale/config/main/UnbindDeviceCallback;", "onUnbindSuccess", "", "onUnbindFailure", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AboutDeviceViewModel$recallReminder$1$1$1 implements UnbindDeviceCallback {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ AboutDeviceViewModel this$0;

    public AboutDeviceViewModel$recallReminder$1$1$1(BaseActivity baseActivity, AboutDeviceViewModel aboutDeviceViewModel) {
        this.$activity = baseActivity;
        this.this$0 = aboutDeviceViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUnbindSuccess$lambda$0() {
        qal.c("recallReminder, EcoDeviceManager.instance.deauthorize success");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUnbindSuccess$lambda$1(int i) {
        qal.b("recallReminder, EcoDeviceManager.instance.deauthorize failed, code: " + i);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.UnbindDeviceCallback
    public void onUnbindFailure() {
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.UnbindDeviceCallback
    public void onUnbindSuccess() {
        MainExtKt.showMainActivity$default(this.$activity, null, null, 6, null);
        ElectronicScaleActivityFinishHelperExtKt.getInstance(ElectronicScaleActivityFinishHelper.INSTANCE).finish();
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String did = this.this$0.getDid();
        Intrinsics.checkNotNull(did);
        ecoDeviceManagerExtKt.deauthorize(did, new Function0() { // from class: wy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AboutDeviceViewModel$recallReminder$1$1$1.onUnbindSuccess$lambda$0();
            }
        }, new Function1() { // from class: xy
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutDeviceViewModel$recallReminder$1$1$1.onUnbindSuccess$lambda$1(((Integer) obj).intValue());
            }
        });
    }
}

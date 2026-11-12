package com.xiaomi.fitness.devicesettings.common.avs;

import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseSpringBackBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.avs.AivsSettingFragment;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.utils.Constants;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.eui;
import defpackage.sf6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/avs/AivsSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/avs/AivsViewModel;", "Lsf6;", "", "bindView", "(Lsf6;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AivsSettingFragment extends BaseSpringBackBindingFragment<AivsViewModel, sf6> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(AivsSettingFragment this$0, View view) {
        String alias;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (alias = DeviceModelExtKt.getAlias(wearableDeviceModel)) == null) {
            Logger.e("gotoXiaoaiSkillCenter error:getAlias is null", new Object[0]);
        } else {
            WebViewUtilKt.startWebView$default(Constants.INSTANCE.getXiaoAiHelpUrl(alias), this$0.getString(wzi.Ka), false, false, null, false, null, false, 252, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$2(AivsSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AivsViewModel) this$0.getMViewModel()).switchOptimiseOpen(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull sf6 sf6Var) {
        Intrinsics.checkNotNullParameter(sf6Var, "<this>");
        setTitle(wzi.Ja);
        sf6Var.A0((AivsViewModel) getMViewModel());
        ((AivsViewModel) getMViewModel()).init();
        sf6Var.C.setOnClickListener(new View.OnClickListener() { // from class: q21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AivsSettingFragment.bindView$lambda$1(this.f31004a, view);
            }
        });
        sf6Var.B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: r21
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AivsSettingFragment.bindView$lambda$2(this.f32098a, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.Q;
    }
}

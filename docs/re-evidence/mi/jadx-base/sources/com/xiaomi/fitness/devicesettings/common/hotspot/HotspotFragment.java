package com.xiaomi.fitness.devicesettings.common.hotspot;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.devicesettings.common.hotspot.HotspotFragment;
import defpackage.d2m;
import defpackage.eui;
import defpackage.gh6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/hotspot/HotspotFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/hotspot/HotspotViewModel;", "Lgh6;", "", "bindView", "(Lgh6;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HotspotFragment extends Hilt_HotspotFragment<HotspotViewModel, gh6> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(HotspotFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            d2m.x(mActivity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull gh6 gh6Var) {
        Intrinsics.checkNotNullParameter(gh6Var, "<this>");
        setTitle(wzi.d5);
        ((gh6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: ebc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotspotFragment.bindView$lambda$1(this.f16461a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.k0;
    }
}

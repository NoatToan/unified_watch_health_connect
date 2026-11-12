package com.xiaomi.fitness.devicesettings.base.cta;

import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPDebugFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import defpackage.eui;
import defpackage.ge6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPDebugFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugViewModel;", "Lge6;", "", "bindView", "(Lge6;)V", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInstallAPPDebugFragment extends Hilt_DeviceInstallAPPDebugFragment<DeviceInstallAPPInfoDebugViewModel, ge6> {

    @NotNull
    public static final String TAG = "GOOGLE_LICENSE";

    public DeviceInstallAPPDebugFragment() {
        super(eui.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(DeviceInstallAPPDebugFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BaseFragmentExKt.gotoPage(this$0, DeviceInstallAPPInfoDebugFragment.class, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(DeviceInstallAPPDebugFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BaseFragmentExKt.gotoPage(this$0, DeviceInstallAPPBehaviorDebugFragment.class, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ge6 ge6Var) {
        Intrinsics.checkNotNullParameter(ge6Var, "<this>");
        ViewExtKt.clickWithTrigger$default(ge6Var.A, 0L, new Function1() { // from class: t66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceInstallAPPDebugFragment.bindView$lambda$0(this.f34360a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(ge6Var.B, 0L, new Function1() { // from class: u66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceInstallAPPDebugFragment.bindView$lambda$1(this.f35449a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
    }
}

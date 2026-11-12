package com.xiaomi.fitness.device.manager.bindingadapter;

import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bindingadapter/BindingAdapters;", "", "Lcom/xiaomi/fitness/widget/SwitchButtonBindingTwoLineTextView;", "switchView", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "callback", "", "setOnSwitchChangedListener", "(Lcom/xiaomi/fitness/widget/SwitchButtonBindingTwoLineTextView;Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;)V", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BindingAdapters {

    @NotNull
    public static final BindingAdapters INSTANCE = new BindingAdapters();

    private BindingAdapters() {
    }

    @JvmStatic
    public static final void setOnSwitchChangedListener(@NotNull SwitchButtonBindingTwoLineTextView switchView, @NotNull ISwitchButton.a callback) {
        Intrinsics.checkNotNullParameter(switchView, "switchView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        switchView.setOnCheckedChangeCallback(callback);
    }
}

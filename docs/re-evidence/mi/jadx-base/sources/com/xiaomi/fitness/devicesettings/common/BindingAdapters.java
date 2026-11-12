package com.xiaomi.fitness.devicesettings.common;

import com.xiaomi.fitness.devicesettings.widget.SetRadioGroup;
import com.xiaomi.fitness.widget.button.SetSwitchView;
import com.xiaomi.fitness.widget.view.SetRightArrowView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u0011J?\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0007¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/BindingAdapters;", "", "<init>", "()V", "setSwitch", "", "switchView", "Lcom/xiaomi/fitness/widget/button/SetSwitchView;", "setSwitchOn", "", "isEnabled", "(Lcom/xiaomi/fitness/widget/button/SetSwitchView;ZLjava/lang/Boolean;)V", "setRightValue", "rightArrowView", "Lcom/xiaomi/fitness/widget/view/SetRightArrowView;", "value", "", "(Lcom/xiaomi/fitness/widget/view/SetRightArrowView;Ljava/lang/String;Ljava/lang/Boolean;)V", "setRadioGroup", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup;", "title", "items", "", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItem;", "selected", "", "(Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "setBindingRightValue", "view", "rightValue", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindingAdapters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindingAdapters.kt\ncom/xiaomi/fitness/devicesettings/common/BindingAdapters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class BindingAdapters {

    @NotNull
    public static final BindingAdapters INSTANCE = new BindingAdapters();

    private BindingAdapters() {
    }

    @JvmStatic
    public static final void setBindingRightValue(@NotNull SetRightArrowView view, @Nullable String rightValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (rightValue == null) {
            rightValue = "";
        }
        view.setRightValue(rightValue);
    }

    @JvmStatic
    public static final void setRadioGroup(@NotNull SetRadioGroup setRadioGroup, @NotNull String title, @NotNull List<SetRadioGroup.RadioItem> items, @Nullable Integer selected, @Nullable Boolean isEnabled) {
        Intrinsics.checkNotNullParameter(setRadioGroup, "setRadioGroup");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        setRadioGroup.setTitle(title);
        setRadioGroup.setRadioItems(items);
        if (selected != null) {
            setRadioGroup.setSelected(selected.intValue());
        }
        if (isEnabled != null) {
            setRadioGroup.setEnabled(isEnabled.booleanValue());
        }
    }

    @JvmStatic
    public static final void setRightValue(@NotNull SetRightArrowView rightArrowView, @NotNull String value, @Nullable Boolean isEnabled) {
        Intrinsics.checkNotNullParameter(rightArrowView, "rightArrowView");
        Intrinsics.checkNotNullParameter(value, "value");
        rightArrowView.setRightValue(value);
        if (isEnabled != null) {
            rightArrowView.setEnabled(isEnabled.booleanValue());
        }
    }

    @JvmStatic
    public static final void setSwitch(@NotNull SetSwitchView switchView, boolean setSwitchOn, @Nullable Boolean isEnabled) {
        Intrinsics.checkNotNullParameter(switchView, "switchView");
        switchView.getSwitch().setChecked(setSwitchOn);
        if (isEnabled != null) {
            switchView.setEnabled(isEnabled.booleanValue());
        }
    }
}

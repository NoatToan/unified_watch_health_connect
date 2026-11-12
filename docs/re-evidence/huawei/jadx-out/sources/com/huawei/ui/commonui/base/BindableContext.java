package com.huawei.ui.commonui.base;

import android.app.Activity;

/* JADX INFO: loaded from: classes43.dex */
public interface BindableContext {
    Activity getTargetActivity();

    Bindable queryBindable(Consumable.ConsumableType consumableType);
}

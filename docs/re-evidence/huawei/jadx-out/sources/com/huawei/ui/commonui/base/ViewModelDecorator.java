package com.huawei.ui.commonui.base;

import com.huawei.ui.commonui.base.viewmodel.ObservableViewModel;
import java.util.Collection;

/* JADX INFO: loaded from: classes43.dex */
public interface ViewModelDecorator<T extends ObservableViewModel> {
    Collection<T> decorate(Consumable consumable);
}

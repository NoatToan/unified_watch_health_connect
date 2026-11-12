package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingViewModelFactory implements ViewModelProvider.Factory {
    private final Map<Class<? extends ViewModel>, Provider<ViewModel>> a;

    @Inject
    public TrainingViewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> map) {
        this.a = map;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        Provider<ViewModel> value = this.a.get(cls);
        if (value == null) {
            for (Map.Entry<Class<? extends ViewModel>, Provider<ViewModel>> entry : this.a.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    value = entry.getValue();
                    break;
                }
            }
        }
        if (value != null) {
            try {
                return (T) value.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        throw new IllegalArgumentException("unknown model class " + cls);
    }
}

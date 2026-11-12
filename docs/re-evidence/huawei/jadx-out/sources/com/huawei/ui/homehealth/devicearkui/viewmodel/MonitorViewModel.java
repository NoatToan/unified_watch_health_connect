package com.huawei.ui.homehealth.devicearkui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class MonitorViewModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25396b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Consumer<Object>> f25397a = Collections.synchronizedSet(new LinkedHashSet());

    public void c(Consumer<Object> consumer) {
        if (consumer == null) {
            LogUtil.j("MonitorViewModel", "registerViewTahiti callback is null");
        } else {
            this.f25397a.add(consumer);
        }
    }

    public void e(Consumer<Object> consumer) {
        if (consumer == null) {
            LogUtil.j("MonitorViewModel", "unregisterViewTahiti callback is null");
        } else {
            this.f25397a.remove(consumer);
        }
    }

    public void c() {
        this.f25397a.forEach(new Consumer<Consumer<Object>>() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.MonitorViewModel.4
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void accept(Consumer<Object> consumer) {
                consumer.accept(MonitorViewModel.f25396b);
            }
        });
    }
}

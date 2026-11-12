package com.huawei.hmf.services.inject;

import com.huawei.hmf.services.Module;

/* JADX INFO: loaded from: classes33.dex */
public interface InjectInstanceCreator<T> {
    T createInstance(Module module, String str);
}

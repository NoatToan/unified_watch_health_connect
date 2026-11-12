package com.huawei.watchface;

import com.huawei.watchface.mvp.model.latona.provider.ElementsProvider;
import com.huawei.watchface.mvp.model.latona.provider.ResourceResolver;
import com.huawei.watchface.utils.callback.IPackageNamePathCallback;

/* JADX INFO: loaded from: classes45.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResourceResolver f30544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ElementsProvider f30545b;

    public q(String str, String str2, String str3, IPackageNamePathCallback iPackageNamePathCallback) {
        this.f30544a = new ResourceResolver(str, str2, str3, iPackageNamePathCallback);
    }

    public ElementsProvider a(boolean z) {
        if (this.f30545b == null) {
            this.f30545b = new ElementsProvider(this.f30544a, z);
        }
        return this.f30545b;
    }
}

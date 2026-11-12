package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.ui.main.stories.OperationBundleModule;
import defpackage.woh;
import defpackage.wop;

/* JADX INFO: loaded from: classes33.dex */
public final class OperationBundleModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(woh.class, "com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi");
        builder.add(wop.class, "com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi");
        new ModuleProviderWrapper(new OperationBundleModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "OperationBundle";
    }
}

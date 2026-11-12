package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.cwa;
import defpackage.cwd;
import defpackage.cwg;
import defpackage.cyt;

/* JADX INFO: loaded from: classes33.dex */
public final class module_routeModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(cyt.class, "com.huawei.health.todo.api.TodoDataApi");
        builder.add(cwd.class, "com.huawei.health.userprofilemgr.api.UserProfileMgrApi");
        builder.add(cwa.class, "com.huawei.health.userprofilemgr.api.RouteApi");
        new ModuleProviderWrapper(new cwg(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "module_route";
    }
}

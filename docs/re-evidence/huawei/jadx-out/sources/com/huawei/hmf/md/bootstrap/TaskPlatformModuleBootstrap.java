package com.huawei.hmf.md.bootstrap;

import com.huawei.health.taskplatform.TaskPlatformImp;
import com.huawei.health.taskplatform.TaskPlatformModule;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;

/* JADX INFO: loaded from: classes33.dex */
public final class TaskPlatformModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(TaskPlatformImp.class, "com.huawei.taskplatform.api.TaskPlatformApi");
        new ModuleProviderWrapper(new TaskPlatformModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "TaskPlatform";
    }
}

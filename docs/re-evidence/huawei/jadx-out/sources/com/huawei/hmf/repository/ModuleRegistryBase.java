package com.huawei.hmf.repository;

import com.huawei.hmf.orb.IMessageEntity;
import com.huawei.hmf.orb.RemoteModuleBootstrap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public abstract class ModuleRegistryBase implements IMessageEntity {
    private Map<String, RemoteModuleBootstrap> mRemoteModuleBootstrapMap;

    public abstract void register(Repository repository);

    protected abstract void registerRemoteModule(Map map);

    public Object getRemoteModuleBootstrap(String str) {
        RemoteModuleBootstrap remoteModuleBootstrap;
        synchronized (this) {
            if (this.mRemoteModuleBootstrapMap == null) {
                HashMap map = new HashMap();
                this.mRemoteModuleBootstrapMap = map;
                registerRemoteModule(map);
            }
            remoteModuleBootstrap = this.mRemoteModuleBootstrapMap.get(str);
        }
        return remoteModuleBootstrap;
    }
}

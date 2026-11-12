package com.huawei.hmf.orb.tbis;

import android.util.Log;
import com.huawei.hmf.orb.RemoteConnector;
import com.huawei.hmf.orb.RemoteRepository;
import com.huawei.hmf.orb.exception.ConnectRemoteException;
import com.huawei.hmf.repository.ComponentRepository;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.Module;
import com.huawei.hmf.services.ui.UIModule;

/* JADX INFO: loaded from: classes33.dex */
public final class TBModuleService {
    private static final String TAG = "TBModuleService";
    private final TBModuleRegistry mModuleRegistry;
    private Repository mRepository;

    public TBModuleService(TBModuleRegistry tBModuleRegistry) {
        this.mModuleRegistry = tBModuleRegistry;
        this.mRepository = ComponentRepository.getRepository();
    }

    public TBModuleService(TBModuleRegistry tBModuleRegistry, RemoteConnector remoteConnector) {
        this.mModuleRegistry = tBModuleRegistry;
        try {
            this.mRepository = ComponentRepository.getRepository(remoteConnector);
        } catch (ConnectRemoteException e) {
            Log.e(TAG, "connect to remote repository failed:" + e.getStatus());
        }
    }

    public String getName() {
        return this.mModuleRegistry.getName();
    }

    public final Class<?> getService(String str) {
        TBModuleRegistry.RegistryInfo registry = this.mModuleRegistry.getRegistry(str);
        if (registry == null) {
            return null;
        }
        return registry.uri;
    }

    public Object create(String str) {
        TBModuleRegistry.RegistryInfo registry = this.mModuleRegistry.getRegistry(str);
        return create(str, registry != null ? registry.alias : null);
    }

    public Object create(String str, String str2) {
        if (this.mRepository == null) {
            return null;
        }
        Class<?> service = getService(str);
        Module moduleLookup = this.mRepository.lookup(getName());
        if (moduleLookup == null || service == null) {
            return null;
        }
        if (str2 != null) {
            return moduleLookup.create(service, str2);
        }
        return moduleLookup.create(service);
    }

    public TBUIModule createUIModule(String str) {
        Module moduleLookup;
        UIModule uIModuleCreateUIModule;
        Repository repository = this.mRepository;
        if (repository == null || (moduleLookup = repository.lookup(getName())) == null || (uIModuleCreateUIModule = moduleLookup.createUIModule(str)) == null) {
            return null;
        }
        return new TBUIModule(uIModuleCreateUIModule);
    }

    public void destroy() {
        Repository repository = this.mRepository;
        if (repository instanceof RemoteRepository) {
            ((RemoteRepository) repository).close();
        }
    }
}

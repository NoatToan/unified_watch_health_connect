package com.huawei.hmf.repository;

/* JADX INFO: loaded from: classes3.dex */
public class ModuleRegistry {
    private static final IModuleRegistry IMPL = createRegistry();

    interface IModuleRegistry {
        Object getRemoteModuleBootstrap(String str);

        void register(Repository repository);
    }

    private static IModuleRegistry createRegistry() {
        try {
            return (IModuleRegistry) Class.forName("com.huawei.hmf.repository.ModuleRegistryImpl").newInstance();
        } catch (Exception unused) {
            return new DefaultModuleRegistry();
        }
    }

    public static void register(Repository repository) {
        IMPL.register(repository);
    }

    public static Object getRemoteModuleBootstrap(String str) {
        return IMPL.getRemoteModuleBootstrap(str);
    }

    static class DefaultModuleRegistry implements IModuleRegistry {
        @Override // com.huawei.hmf.repository.ModuleRegistry.IModuleRegistry
        public Object getRemoteModuleBootstrap(String str) {
            return null;
        }

        @Override // com.huawei.hmf.repository.ModuleRegistry.IModuleRegistry
        public void register(Repository repository) {
        }

        DefaultModuleRegistry() {
        }
    }
}

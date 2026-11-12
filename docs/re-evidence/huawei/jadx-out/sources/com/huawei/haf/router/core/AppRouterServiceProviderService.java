package com.huawei.haf.router.core;

import com.huawei.haf.router.facade.service.ServiceProviderService;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterServiceProviderService {
    private final ServiceProviderService e = (ServiceProviderService) AppRouterHelper.a(ServiceProviderService.class);

    AppRouterServiceProviderService() {
    }

    <T> T a(String str, Class<T> cls, String str2) {
        ServiceProviderService serviceProviderService = this.e;
        if (serviceProviderService != null) {
            return (T) serviceProviderService.getService(str, cls, str2);
        }
        return null;
    }

    void e(ClassLoader classLoader, String str, String[] strArr) {
        ServiceProviderService serviceProviderService = this.e;
        if (serviceProviderService != null) {
            serviceProviderService.loadRegistry(classLoader, str, strArr);
        }
    }
}

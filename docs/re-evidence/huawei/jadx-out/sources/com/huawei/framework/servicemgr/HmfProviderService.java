package com.huawei.framework.servicemgr;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.router.facade.service.ServiceProviderService;
import com.huawei.hmf.repository.ComponentRepository;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.Module;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HmfProviderService implements ServiceProviderService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.ServiceProviderService
    public <T> T getService(String str, Class<T> cls, String str2) {
        Module moduleLookup = ComponentRepository.getRepository().lookup(str);
        if (moduleLookup != null) {
            return TextUtils.isEmpty(str2) ? (T) moduleLookup.create(cls) : (T) moduleLookup.create(cls, str2);
        }
        LogUtil.e("HmfProviderService", "The provider module not exist: ", str);
        return null;
    }

    @Override // com.huawei.haf.router.facade.service.ServiceProviderService
    public void loadRegistry(ClassLoader classLoader, String str, String[] strArr) {
        d(classLoader, str, Arrays.asList(strArr));
    }

    public static void a(ClassLoader classLoader, String str) {
        d(classLoader, str, Collections.singletonList(str));
    }

    private static void d(ClassLoader classLoader, String str, List<String> list) {
        try {
            Class<?> clsA = a("com.huawei.hmf.md.bundle." + str + "ModuleRegistry", classLoader);
            if (clsA != null) {
                b(clsA, str, "pluginName");
                return;
            }
            for (String str2 : list) {
                Class<?> clsA2 = a("com.huawei.hmf.md.bootstrap." + str2 + "ModuleBootstrap", classLoader);
                if (clsA2 != null) {
                    b(clsA2, str2, "provider");
                }
            }
        } catch (Exception e) {
            LogUtil.d("HmfProviderService", "Initialize registry information failed: ", str, ", cause: ", LogUtil.c(e));
        }
    }

    private static Class<?> a(String str, ClassLoader classLoader) {
        try {
            return ReflectionUtils.e(str, classLoader);
        } catch (ClassNotFoundException e) {
            LogUtil.c("HmfProviderService", "getClass ex=", LogUtil.c(e));
            return null;
        }
    }

    private static void b(Class<?> cls, String str, String str2) {
        try {
            cls.getMethod("register", Repository.class).invoke(null, ComponentRepository.getRepository());
            LogUtil.b("HmfProviderService", "The registry information of ", str2, "=", str, " was initialized successfully");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.b("HmfProviderService", "The registry information NOT found: ", str, ", cause: ", LogUtil.c(e));
        }
    }
}

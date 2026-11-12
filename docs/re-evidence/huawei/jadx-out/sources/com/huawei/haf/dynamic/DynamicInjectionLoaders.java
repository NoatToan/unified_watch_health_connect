package com.huawei.haf.dynamic;

import com.huawei.haf.common.utils.CollectionUtils;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicInjectionLoaders {
    private static final Map<String, Object[]> d = new ConcurrentHashMap();

    private DynamicInjectionLoaders() {
    }

    public static void e(String str, ClassLoader classLoader, File file, List<File> list) throws DynamicLoaderException {
        if (list.isEmpty()) {
            return;
        }
        Map<String, Object[]> map = d;
        if (map.containsKey(str)) {
            throw new DynamicLoaderException("loadDex exist needs to unloadDex first, moduleName:" + str);
        }
        Object[] objArrE = DynamicDexLoader.e(classLoader, file, list);
        if (objArrE == null || objArrE.length == 0) {
            return;
        }
        map.put(str, objArrE);
    }

    public static void b(String str, ClassLoader classLoader) throws DynamicLoaderException {
        Map<String, Object[]> map = d;
        Object[] objArr = map.get(str);
        if (CollectionUtils.d(objArr)) {
            return;
        }
        DynamicDexLoader.c(classLoader, objArr);
        map.remove(str);
    }

    public static void b(ClassLoader classLoader, File file) throws DynamicLoaderException {
        DynamicLibraryLoader.d(classLoader, file);
    }
}

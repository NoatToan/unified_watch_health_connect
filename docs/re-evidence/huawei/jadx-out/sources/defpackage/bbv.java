package defpackage;

import com.huawei.android.bundlecore.load.ModuleLoader;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.dynamic.DynamicInjectionLoaders;
import com.huawei.haf.dynamic.DynamicLoaderException;
import health.compact.a.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bbv extends ModuleLoader {
    bbv() {
    }

    @Override // com.huawei.android.bundlecore.load.ModuleLoader
    public ClassLoader loadCode(String str, List<String> list, File file, File file2, List<String> list2) throws bbq {
        ClassLoader classLoader = ModuleLoader.class.getClassLoader();
        d(classLoader, file2);
        a(str, classLoader, list, file);
        return classLoader;
    }

    @Override // com.huawei.android.bundlecore.load.ModuleLoader
    public void unloadCode(String str, ClassLoader classLoader) throws bbq {
        try {
            DynamicInjectionLoaders.b(str, classLoader);
        } catch (DynamicLoaderException e) {
            throw new bbq(-24, e);
        }
    }

    private void d(ClassLoader classLoader, File file) throws bbq {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            LogUtil.d("Bundle_ModuleLoader", "load, folder ", file, " is illegal");
            return;
        }
        try {
            DynamicInjectionLoaders.b(classLoader, file);
        } catch (DynamicLoaderException e) {
            throw new bbq(-22, e);
        }
    }

    private void a(String str, ClassLoader classLoader, List<String> list, File file) throws bbq {
        if (CollectionUtils.a(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new File(it.next()));
        }
        try {
            DynamicInjectionLoaders.e(str, classLoader, file, arrayList);
        } catch (DynamicLoaderException e) {
            throw new bbq(-23, e);
        }
    }
}

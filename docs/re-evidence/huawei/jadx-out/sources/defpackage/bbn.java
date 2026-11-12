package defpackage;

import com.huawei.android.bundlecore.load.ModuleLoader;
import com.huawei.haf.dynamic.DynamicApplicationLoaders;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bbn extends ModuleLoader {
    bbn() {
    }

    @Override // com.huawei.android.bundlecore.load.ModuleLoader
    public ClassLoader loadCode(String str, List<String> list, File file, File file2, List<String> list2) {
        ClassLoader classLoaderE = DynamicApplicationLoaders.e(str);
        if (classLoaderE != null) {
            return classLoaderE;
        }
        ClassLoader classLoaderB = DynamicApplicationLoaders.b(str, list, file, file2, list2);
        DynamicApplicationLoaders.d(classLoaderB);
        return classLoaderB;
    }

    @Override // com.huawei.android.bundlecore.load.ModuleLoader
    public void unloadCode(String str, ClassLoader classLoader) {
        DynamicApplicationLoaders.c(classLoader);
    }
}

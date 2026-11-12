package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.bundle.AppBundleExtension;
import com.huawei.haf.bundle.AppBundleSetting;
import com.huawei.haf.bundle.extension.BundleExtension;
import com.huawei.haf.bundle.extension.ComponentInfoProvider;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class bca implements AppBundleExtension {
    @Override // com.huawei.haf.bundle.AppBundleExtension
    public Set<String> getAllBundleModules(Context context, boolean z) {
        Set<String> setB = AppBundleBuildConfig.b();
        if (!z) {
            return setB;
        }
        HashSet hashSet = new HashSet(setB);
        for (String str : setB) {
            if (isBuiltInModule(context, str)) {
                hashSet.remove(str);
            }
        }
        return hashSet;
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public Set<String> getUpdateModules(Context context, boolean z) {
        Set<String> setD = BundleExtension.d().d();
        if (setD.isEmpty()) {
            return setD;
        }
        HashSet hashSet = new HashSet(setD);
        hashSet.removeAll(BundleExtension.e().getLoadedModuleNames());
        for (String str : setD) {
            if (!isBundleModule(str)) {
                hashSet.remove(str);
            } else if (z && isBuiltInModule(context, str)) {
                hashSet.remove(str);
            } else if (BundleExtension.e().checkModuleExisted(str, false)) {
                hashSet.remove(str);
            }
        }
        return hashSet;
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public long getModuleZipSize(Context context, String str) {
        baj bajVarE = baq.a().e(context, str);
        if (bajVarE == null || bajVarE.n()) {
            return 0L;
        }
        return bajVarE.l();
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public List<String> getModuleDependencies(Context context, String str) {
        baj bajVarE = baq.a().e(context, str);
        if (bajVarE == null) {
            return Collections.EMPTY_LIST;
        }
        return bajVarE.d();
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public boolean isBundleModule(String str) {
        return AppBundleBuildConfig.b().contains(str);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public boolean isBuiltInModule(Context context, String str) {
        baj bajVarE = baq.a().e(context, str);
        if (bajVarE == null) {
            return false;
        }
        return bajVarE.n();
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public String getModuleTitle(Context context, String str) {
        return ComponentInfoProvider.c().c(context, str);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public String getModuleDescription(Context context, String str) {
        return ComponentInfoProvider.c().b(context, str);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public String getModuleForComponent(String str) {
        return ComponentInfoProvider.c().b(str);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public boolean loadLocalModules(List<String> list) {
        return BundleExtension.e().loadInstalledModules(list);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public boolean isExistLocalModule(String str) {
        return BundleExtension.e().checkModuleExisted(str, true);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public boolean isUnistalledModule(String str) {
        return BundleExtension.e().checkModuleUninstalled(str, true);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public boolean updateModuleInfo(Context context, String str, String str2) {
        return ban.b(context, str, str2);
    }

    @Override // com.huawei.haf.bundle.AppBundleExtension
    public AppBundleSetting getSetting() {
        return BundleExtension.d();
    }
}

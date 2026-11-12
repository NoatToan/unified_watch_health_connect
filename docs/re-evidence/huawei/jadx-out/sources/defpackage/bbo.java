package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.huawei.android.bundlecore.load.listener.OnModuleLoadListener;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.bundle.extension.BundleClassNotFoundInterceptor;
import com.huawei.haf.bundle.extension.BundleExtension;
import com.huawei.haf.bundle.extension.BundleLoadManager;
import com.huawei.haf.bundle.extension.BundleLoadMode;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.dynamic.DynamicApplicationLoaders;
import com.huawei.haf.dynamic.DynamicLoaderException;
import dalvik.system.PathClassLoader;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class bbo implements BundleLoadManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bbo f943c = new bbo();
    private final Map<String, String> j = new ConcurrentHashMap();
    private final Map<String, String> g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f944a = AppBundleBuildConfig.a();
    private final BundleLoadMode d = BundleLoadMode.valueOf(AppBundleBuildConfig.f());
    private final boolean e = AppBundleBuildConfig.o();
    private final String[] f = AppBundleBuildConfig.j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f945b = AppBundleBuildConfig.h();

    private bbo() {
        BundleExtension.c(this);
    }

    public static bbo d() {
        return f943c;
    }

    public void e() {
        if (g() && i()) {
            c(c().getClassLoader());
        }
        ClassLoader classLoader = c().getClassLoader();
        if (DynamicApplicationLoaders.b(classLoader)) {
            DynamicApplicationLoaders.c(classLoader, new BundleClassNotFoundInterceptor(getClass().getClassLoader(), this, this.d));
        }
    }

    public void b() {
        if (this.e && i()) {
            j();
        }
    }

    public Runnable a(List<Intent> list, OnModuleLoadListener onModuleLoadListener) {
        return new bbp(this, list, onModuleLoadListener);
    }

    @Override // com.huawei.haf.bundle.extension.BundleLoadManager
    public Set<String> getLoadedModuleNames() {
        return this.j.keySet();
    }

    @Override // com.huawei.haf.bundle.extension.BundleLoadManager
    public Set<String> getLoadedModuleApkPaths() {
        return this.g.keySet();
    }

    @Override // com.huawei.haf.bundle.extension.BundleLoadManager
    public boolean checkModuleLoaded(String str) {
        return this.j.containsKey(str);
    }

    @Override // com.huawei.haf.bundle.extension.BundleLoadManager
    public boolean checkModuleExisted(String str, boolean z) {
        baj bajVarE;
        return checkModuleLoaded(str) || (bajVarE = baq.a().e(c(), str)) == null || d(bajVarE, z);
    }

    @Override // com.huawei.haf.bundle.extension.BundleLoadManager
    public boolean checkModuleUninstalled(String str, boolean z) {
        baj bajVarE = baq.a().e(c(), str);
        return bajVarE != null && a(bajVarE, z);
    }

    @Override // com.huawei.haf.bundle.extension.BundleLoadManager
    public boolean loadInstalledModules(List<String> list) {
        return d(b(list), true);
    }

    public BundleLoadMode a() {
        return this.d;
    }

    Context c() {
        return this.f944a;
    }

    void d(String str, String str2) {
        this.j.put(str, str2);
        this.g.put(str2, str);
    }

    private boolean g() {
        if (Build.VERSION.SDK_INT < 29) {
            return this.e;
        }
        return this.e && !DynamicApplicationLoaders.b(c().getClassLoader());
    }

    private List<Intent> e(Collection<baj> collection, boolean z) {
        String strReplace = z ? null : ProcessUtil.c().replace(c().getPackageName(), "");
        ArrayList arrayList = new ArrayList(collection.size());
        for (baj bajVar : collection) {
            if (checkModuleLoaded(bajVar.f())) {
                if (!z) {
                    LogUtil.b("Bundle_LoadManager", bajVar.f(), " has been loaded, ignore it!");
                }
            } else if (!z && !e(bajVar, strReplace)) {
                LogUtil.b("Bundle_LoadManager", bajVar.f(), " do not need work in process ", ProcessUtil.c());
            } else {
                Intent intentE = e(bajVar, z);
                if (intentE != null) {
                    arrayList.add(intentE);
                }
                if (!z) {
                    LogUtil.b("Bundle_LoadManager", bajVar.f(), " will work in process ", ProcessUtil.c(), ", ", intentE == null ? "but" : "and", " it is ", intentE == null ? "not installed" : "installed");
                }
            }
        }
        return arrayList;
    }

    private boolean e(baj bajVar, String str) {
        List<String> listK = bajVar.k();
        if (CollectionUtils.a(listK)) {
            return true;
        }
        return listK.contains(str);
    }

    private void j() {
        final Collection<baj> collectionC = baq.a().c(c());
        if (Looper.myLooper() == null) {
            d(collectionC, false);
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: bbo.5
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    bbo.this.d((Collection<baj>) collectionC, false);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Collection<baj> collection, boolean z) {
        if (collection.isEmpty()) {
            return false;
        }
        List<Intent> listE = e(collection, z);
        if (listE.isEmpty()) {
            return false;
        }
        a(listE, (OnModuleLoadListener) null).run();
        return true;
    }

    private boolean a(baj bajVar, boolean z) {
        if (bbf.a().h(bajVar).exists()) {
            return true;
        }
        List<String> listD = bajVar.d();
        if (!z || listD.isEmpty()) {
            return false;
        }
        for (String str : listD) {
            baj bajVarE = baq.a().e(c(), str);
            if (bajVarE != null && bbf.a().h(bajVarE).exists()) {
                LogUtil.b("Bundle_LoadManager", "Dependency ", str, " is uninstalled!");
                return true;
            }
        }
        return false;
    }

    private boolean d(baj bajVar, boolean z) {
        if (!bbi.b(bajVar)) {
            return false;
        }
        List<String> listD = bajVar.d();
        if (!z || listD.isEmpty()) {
            return true;
        }
        LogUtil.b("Bundle_LoadManager", "Module ", bajVar.f(), " has dependencies ", listD);
        for (String str : listD) {
            baj bajVarE = baq.a().e(c(), str);
            if (bajVarE != null && !checkModuleLoaded(str) && !bbi.b(bajVarE)) {
                LogUtil.b("Bundle_LoadManager", "Dependency module ", str, " mark file is not existed!");
                return false;
            }
        }
        return true;
    }

    private Intent e(baj bajVar, boolean z) {
        ArrayList<String> arrayList = null;
        if (!d(bajVar, true) || (!z && a(bajVar, true))) {
            return null;
        }
        File fileD = bbf.a().d(bajVar);
        if (bajVar.m()) {
            arrayList = new ArrayList<>();
            arrayList.add(fileD.getAbsolutePath());
        }
        Intent intent = new Intent();
        intent.putExtra("moduleName", bajVar.f());
        intent.putExtra("apk", fileD.getAbsolutePath());
        if (arrayList != null) {
            intent.putStringArrayListExtra("added-dex", arrayList);
        }
        return intent;
    }

    private Collection<baj> b(List<String> list) {
        if (CollectionUtils.a(list)) {
            return Collections.EMPTY_LIST;
        }
        Collection<baj> collectionC = baq.a().c(c());
        ArrayList arrayList = new ArrayList(list.size());
        c(arrayList, collectionC, list);
        Set<String> setA = a(arrayList);
        if (!setA.isEmpty()) {
            setA.removeAll(list);
            LogUtil.b("Bundle_LoadManager", "Automatically add dependencies ", setA.toString(), " for load module ", list.toString());
            c(arrayList, collectionC, setA);
        }
        return arrayList;
    }

    private void c(List<baj> list, Collection<baj> collection, Collection<String> collection2) {
        for (baj bajVar : collection) {
            if (collection2.contains(bajVar.f())) {
                list.add(bajVar);
            }
        }
    }

    private Set<String> a(List<baj> list) {
        HashSet hashSet = new HashSet();
        Iterator<baj> it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().d());
        }
        return hashSet;
    }

    private Context f() {
        Context contextC = c();
        while (contextC instanceof ContextWrapper) {
            contextC = ((ContextWrapper) contextC).getBaseContext();
        }
        return contextC;
    }

    private void c(ClassLoader classLoader) {
        if (classLoader instanceof PathClassLoader) {
            try {
                DynamicApplicationLoaders.b(classLoader, f());
            } catch (DynamicLoaderException e) {
                LogUtil.d("Bundle_LoadManager", "Failed to hook PathClassloader, ex=", LogUtil.c(e));
            }
        }
    }

    private boolean i() {
        if ((this.f.length == 0 && this.f945b.length == 0) || ProcessUtil.b()) {
            return true;
        }
        String strC = ProcessUtil.c();
        for (String str : this.f945b) {
            if (b(str).equals(strC)) {
                return false;
            }
        }
        String[] strArr = this.f;
        int length = strArr.length;
        for (int i = 0; i < length && !b(strArr[i]).equals(strC); i++) {
        }
        return true;
    }

    private String b(String str) {
        String packageName = c().getPackageName();
        if (TextUtils.isEmpty(str)) {
            return packageName;
        }
        if (str.startsWith(packageName)) {
            return str;
        }
        return packageName + str;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.huawei.android.bundlecore.load.ModuleLoader;
import com.huawei.android.bundlecore.load.listener.OnModuleLoadListener;
import com.huawei.haf.bundle.extension.BundleExtensionException;
import com.huawei.haf.bundle.extension.BundleLoadMode;
import com.huawei.haf.bundle.extension.ContentProviderProxy;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes22.dex */
final class bbp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bbo f947a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Intent> f948c;
    private final OnModuleLoadListener d;
    private final Object e = new Object();

    bbp(bbo bboVar, List<Intent> list, OnModuleLoadListener onModuleLoadListener) {
        this.f947a = bboVar;
        this.f948c = list;
        this.d = onModuleLoadListener;
    }

    private Context a() {
        return this.f947a.c();
    }

    /* JADX INFO: renamed from: bbp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f949a;

        static {
            int[] iArr = new int[BundleLoadMode.values().length];
            f949a = iArr;
            try {
                iArr[BundleLoadMode.MULTIPLE_CLASSLOADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f949a[BundleLoadMode.SINGLE_CLASSLOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ModuleLoader b(baj bajVar) {
        int i = AnonymousClass1.f949a[this.f947a.a().ordinal()];
        if (i == 1) {
            return new bbn();
        }
        if (i != 2) {
            return bajVar.p() ? new bbn() : new bbv();
        }
        return new bbv();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (CollectionUtils.a(this.f948c)) {
            OnModuleLoadListener onModuleLoadListener = this.d;
            if (onModuleLoadListener != null) {
                onModuleLoadListener.onFailed(-28);
            }
            LogUtil.b("Bundle_LoadTask", "reportLoadResult failed, moduleFileIntents is empty.");
            return;
        }
        if (HandlerExecutor.c()) {
            e(a());
            return;
        }
        synchronized (this.e) {
            e(a(), new CountDownLatch(1));
        }
    }

    private void e(final Context context, final CountDownLatch countDownLatch) {
        HandlerExecutor.c(new Runnable() { // from class: bbp.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bbp.this.e(context);
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            String stringExtra = this.f948c.get(0).getStringExtra("moduleName");
            baj bajVarE = baq.a().e(context, stringExtra);
            if (bajVarE != null) {
                e(Collections.EMPTY_LIST, Collections.singletonList(new bbs(new bbu(stringExtra, bajVarE.h(), bajVarE.n()), -26, e)), 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(0);
        ArrayList arrayList2 = new ArrayList(this.f948c.size());
        for (Intent intent : this.f948c) {
            String stringExtra = intent.getStringExtra("moduleName");
            if (this.f947a.checkModuleLoaded(stringExtra)) {
                LogUtil.b("Bundle_LoadTask", "Module ", stringExtra, " has been loaded!");
            } else {
                String stringExtra2 = intent.getStringExtra("apk");
                baj bajVarE = baq.a().e(context, stringExtra);
                if (bajVarE == null) {
                    LogUtil.e("Bundle_LoadTask", "loadModuleInternal info = null");
                } else {
                    bbu bbuVar = new bbu(stringExtra, bajVarE.h(), bajVarE.n());
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            bbi.d(bajVarE);
                        }
                        a(context, bajVarE, intent, stringExtra2);
                        if (!bbf.a().c(bajVarE).setLastModified(System.currentTimeMillis())) {
                            LogUtil.e("Bundle_LoadTask", "Failed to set last modified time for ", bajVarE.f());
                        }
                        arrayList2.add(bbuVar);
                        this.f947a.d(stringExtra, stringExtra2);
                    } catch (bbq e) {
                        bbi.e(bajVarE);
                        arrayList.add(new bbs(bbuVar, e.c(), e.getCause()));
                    }
                }
            }
        }
        e(arrayList2, arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
    }

    private void a(Context context, baj bajVar, Intent intent, String str) throws bbq {
        ModuleLoader moduleLoaderB = b(bajVar);
        try {
            moduleLoaderB.loadResources(context, str);
            try {
                ClassLoader classLoaderLoadCode = moduleLoaderB.loadCode(bajVar.f(), intent.getStringArrayListExtra("added-dex"), bbf.a().e(bajVar), bajVar.o() ? bbf.a().b(bajVar) : null, bajVar.d());
                try {
                    e(classLoaderLoadCode, bajVar);
                } catch (bbq e) {
                    LogUtil.d("Bundle_LoadTask", "Failed to activate ", bajVar.f());
                    moduleLoaderB.unloadCode(bajVar.f(), classLoaderLoadCode);
                    throw e;
                }
            } catch (bbq e2) {
                LogUtil.d("Bundle_LoadTask", "Failed to load module ", bajVar.f(), " code!");
                throw e2;
            }
        } catch (bbq e3) {
            LogUtil.d("Bundle_LoadTask", "Failed to load module ", bajVar.f(), " resources!");
            throw e3;
        }
    }

    private void e(ClassLoader classLoader, baj bajVar) throws bbq {
        try {
            ContentProviderProxy.createAndActivateModuleProviders(classLoader, bajVar.f());
        } catch (BundleExtensionException e) {
            throw new bbq(-25, e);
        }
    }

    private void e(List<bbu> list, List<bbs> list2, long j) {
        if (!list2.isEmpty()) {
            if (this.d != null) {
                this.d.onFailed(list2.get(list2.size() - 1).b());
            }
            LogUtil.b("Bundle_LoadTask", "reportLoadResult failed, ", list2.toString(), ", cost time:", Long.valueOf(j), "ms");
            return;
        }
        OnModuleLoadListener onModuleLoadListener = this.d;
        if (onModuleLoadListener != null) {
            onModuleLoadListener.onCompleted();
        }
        if (list.isEmpty()) {
            return;
        }
        LogUtil.b("Bundle_LoadTask", "reportLoadResult completed, ", list.toString(), ", cost time:", Long.valueOf(j), "ms");
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher;
import com.huawei.android.appbundle.splitinstall.SplitSessionLoader;
import com.huawei.android.bundlecore.load.listener.OnModuleLoadListener;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public class azs {
    private static final AtomicReference<azs> d = new AtomicReference<>(null);

    private azs() {
    }

    public static boolean b(Context context) {
        if (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(d, null, new azs())) {
            return true;
        }
        bag.c(new c());
        azx.a(new d());
        return true;
    }

    static class d implements LoadedSplitFetcher {
        private d() {
        }

        @Override // com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher
        public Set<String> loadedSplits() {
            return new HashSet(bbo.d().getLoadedModuleNames());
        }

        @Override // com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher
        public boolean loadLocalSplits(List<String> list) {
            return bbo.d().loadInstalledModules(list);
        }

        @Override // com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher
        public boolean checkModuleExisted(String str) {
            return bbo.d().checkModuleExisted(str, true);
        }

        @Override // com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher
        public boolean checkModuleUninstalled(String str) {
            return bbo.d().checkModuleUninstalled(str, false);
        }
    }

    static class c implements SplitSessionLoader {
        private c() {
        }

        @Override // com.huawei.android.appbundle.splitinstall.SplitSessionLoader
        public void load(List<Intent> list, bah bahVar) {
            TaskExecutors.uiThread().execute(new b(list, bahVar));
        }
    }

    static class b implements Runnable, OnModuleLoadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bah f850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Intent> f851c;

        b(List<Intent> list, bah bahVar) {
            this.f851c = list;
            this.f850b = bahVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bbo.d().a(this.f851c, this).run();
        }

        @Override // com.huawei.android.bundlecore.load.listener.OnModuleLoadListener
        public void onCompleted() {
            this.f850b.d(5);
        }

        @Override // com.huawei.android.bundlecore.load.listener.OnModuleLoadListener
        public void onFailed(int i) {
            this.f850b.b(6, i);
        }
    }
}

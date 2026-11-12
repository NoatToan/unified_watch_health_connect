package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.android.bundlecore.download.DownloadCallback;
import com.huawei.android.bundlecore.download.DownloadRequest;
import com.huawei.android.bundlecore.download.Downloader;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
final class bay extends ModuleInstallSupervisor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bba f917c;
    private final boolean d;
    private final long e;
    private final Class<?> f;
    private final Downloader h;
    private final bbb j;

    bay(Context context, Downloader downloader, Class<? extends Activity> cls) {
        this.f916b = context;
        this.j = new bbb(context);
        this.h = downloader;
        long downloadSizeThresholdWhenUsingMobileData = downloader.getDownloadSizeThresholdWhenUsingMobileData();
        this.e = downloadSizeThresholdWhenUsingMobileData < 0 ? Long.MAX_VALUE : downloadSizeThresholdWhenUsingMobileData;
        this.f915a = bam.c(context);
        this.f = cls;
        boolean zN = AppBundleBuildConfig.n();
        this.d = zN;
        this.f917c = new bba(context, zN);
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void initialize(Context context) {
        try {
            NetworkUtil.d((ConnectivityManager.NetworkCallback) null);
        } catch (RuntimeException e2) {
            ReleaseLogUtil.b("R_Bundle_SupervisorImpl", "registerWifiConnectReceiver registerNetworkCallback exception", ExceptionUtils.c(e2));
        }
        postTask(context, new bas(context, bas.e(context), bas.d("Bundle_SupervisorImpl", context, this.f917c, true)));
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void startInstall(List<Bundle> list, ModuleInstallSupervisor.Callback callback) {
        List<String> listExtractBundleModuleNames = extractBundleModuleNames(list);
        int i = i(listExtractBundleModuleNames);
        if (i != 0) {
            callback.onError(bundleErrorCode(i));
            return;
        }
        List<baj> listC = c(listExtractBundleModuleNames);
        if (!b(listC) && !NetworkUtil.i()) {
            callback.onError(bundleErrorCode(-6));
        } else {
            c(listExtractBundleModuleNames, listC, callback);
        }
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void deferredInstall(List<Bundle> list, ModuleInstallSupervisor.Callback callback) {
        List<String> listExtractBundleModuleNames = extractBundleModuleNames(list);
        int i = i(listExtractBundleModuleNames);
        if (i != 0) {
            callback.onError(bundleErrorCode(i));
        } else if (b().isEmpty()) {
            b(c(listExtractBundleModuleNames), callback);
        } else if (b().containsAll(listExtractBundleModuleNames)) {
            callback.onDeferredInstall(null);
        }
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void deferredUninstall(List<Bundle> list, ModuleInstallSupervisor.Callback callback) {
        if (!b().isEmpty()) {
            callback.onError(bundleErrorCode(-98));
            return;
        }
        int iC = c();
        if (iC != 0) {
            callback.onError(bundleErrorCode(iC));
            return;
        }
        List<String> listExtractBundleModuleNames = extractBundleModuleNames(list);
        if (f(listExtractBundleModuleNames)) {
            callback.onError(bundleErrorCode(-3));
        } else {
            d(listExtractBundleModuleNames, callback);
        }
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void cancelInstall(int i, ModuleInstallSupervisor.Callback callback) {
        LogUtil.b("Bundle_SupervisorImpl", "start to cancel task id ", Integer.valueOf(i), " installation");
        bax baxVarA = this.j.a(i);
        if (baxVarA == null) {
            LogUtil.b("Bundle_SupervisorImpl", "Task id is not found!");
            callback.onError(bundleErrorCode(-4));
        } else {
            if (baxVarA.a() == 1 || baxVarA.a() == 2) {
                boolean zCancelDownloadSync = this.h.cancelDownloadSync(i);
                LogUtil.c("Bundle_SupervisorImpl", "result of cancel request : ", Boolean.valueOf(zCancelDownloadSync));
                if (zCancelDownloadSync) {
                    callback.onCancelInstall(i, null);
                    return;
                } else {
                    callback.onError(bundleErrorCode(-3));
                    return;
                }
            }
            callback.onError(bundleErrorCode(-3));
        }
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void getSessionState(int i, ModuleInstallSupervisor.Callback callback) {
        bax baxVarA = this.j.a(i);
        if (baxVarA == null) {
            callback.onError(bundleErrorCode(-4));
        } else {
            callback.onGetSession(i, bax.e(baxVarA));
        }
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public void getSessionStates(ModuleInstallSupervisor.Callback callback) {
        List<bax> listB = this.j.b();
        if (listB.isEmpty()) {
            callback.onGetSessionStates(Collections.EMPTY_LIST);
            return;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<bax> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(bax.e(it.next()));
        }
        callback.onGetSessionStates(arrayList);
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public boolean continueInstallWithUserConfirmation(int i) {
        bax baxVarA = this.j.a(i);
        if (baxVarA == null) {
            return false;
        }
        e eVar = new e(this.f917c, i, this.j, baxVarA.d);
        this.j.c(i, 1);
        this.j.c(baxVarA);
        this.h.startDownload(baxVarA.d(), baxVarA.b(), eVar);
        return true;
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor
    public boolean cancelInstallWithoutUserConfirmation(int i) {
        bax baxVarA = this.j.a(i);
        if (baxVarA == null) {
            return false;
        }
        this.j.c(i, 7);
        this.j.c(baxVarA);
        return true;
    }

    private boolean b(List<baj> list) {
        Iterator<baj> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().n()) {
                return false;
            }
        }
        return true;
    }

    private int i(List<String> list) {
        if (!b().isEmpty()) {
            return !b().containsAll(list) ? -3 : 0;
        }
        int iC = c();
        return iC == 0 ? a(list) : iC;
    }

    private Set<String> b() {
        return this.f915a;
    }

    private int a(List<String> list) {
        if (f(list)) {
            return -3;
        }
        return !j(list) ? -2 : 0;
    }

    private int c() {
        baq baqVarA = baq.a();
        if (baqVarA.c(this.f916b).isEmpty()) {
            LogUtil.e("Bundle_SupervisorImpl", "Failed to parse json file of module info!");
            return -100;
        }
        String strB = baqVarA.b(this.f916b);
        String strM = AppBundleBuildConfig.m();
        if (TextUtils.isEmpty(strB) || !strB.equals(strM)) {
            LogUtil.e("Bundle_SupervisorImpl", "Failed to match base app version-name excepted base app mVersion ", strM, " but ", strB);
            return -100;
        }
        String strA = baqVarA.a(this.f916b);
        String strD = AppBundleBuildConfig.d();
        if (!TextUtils.isEmpty(strA) && strA.equals(strD)) {
            return 0;
        }
        LogUtil.e("Bundle_SupervisorImpl", "Failed to match base app bundle-version excepted ", strD, " but ", strA);
        return -100;
    }

    private void a(List<baj> list, Collection<baj> collection, Collection<String> collection2) {
        for (baj bajVar : collection) {
            if (collection2.contains(bajVar.f())) {
                list.add(bajVar);
            }
        }
    }

    private Set<String> e(List<baj> list) {
        HashSet hashSet = new HashSet();
        Iterator<baj> it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().d());
        }
        return hashSet;
    }

    private List<baj> c(List<String> list) {
        Collection<baj> collectionC = baq.a().c(this.f916b);
        ArrayList arrayList = new ArrayList(list.size());
        a(arrayList, collectionC, list);
        Set<String> setE = e(arrayList);
        if (!setE.isEmpty()) {
            setE.removeAll(list);
            LogUtil.b("Bundle_SupervisorImpl", "Automatically add dependencies ", setE.toString(), " for install module ", list.toString());
            a(arrayList, collectionC, setE);
        }
        return arrayList;
    }

    private void b(List<baj> list, ModuleInstallSupervisor.Callback callback) {
        try {
            ArrayList arrayList = new ArrayList(list.size());
            long jE = e(list, arrayList);
            callback.onDeferredInstall(null);
            int iCreateSessionId = createSessionId(list);
            boolean z = false;
            LogUtil.c("Bundle_SupervisorImpl", "DeferredInstall task id: ", Integer.valueOf(iCreateSessionId));
            c cVar = new c(this.f917c, list);
            if (jE == 0) {
                LogUtil.c("Bundle_SupervisorImpl", "Deferred modules have been downloaded, install them directly!");
                cVar.onCompleted();
            } else {
                if (jE < this.e && !this.h.isDeferredDownloadOnlyWhenUsingWifiData()) {
                    z = true;
                }
                this.h.deferredDownload(iCreateSessionId, d(arrayList), cVar, z);
            }
        } catch (IOException unused) {
            callback.onError(bundleErrorCode(-99));
            LogUtil.d("Bundle_SupervisorImpl", "Failed to copy builtin module apks (onDeferredInstall)");
        }
    }

    private void c(List<String> list, List<baj> list2, ModuleInstallSupervisor.Callback callback) {
        if (this.j.d()) {
            LogUtil.e("Bundle_SupervisorImpl", "Start install request error code: ACTIVE_SESSIONS_LIMIT_EXCEEDED");
            callback.onError(bundleErrorCode(-1));
            return;
        }
        int iCreateSessionId = createSessionId(list2);
        LogUtil.b("Bundle_SupervisorImpl", "startInstall task id: ", Integer.valueOf(iCreateSessionId), ", moduleNames=", list);
        bax baxVarA = this.j.a(iCreateSessionId);
        if ((baxVarA == null || baxVarA.a() != 8) && this.j.c(list)) {
            LogUtil.e("Bundle_SupervisorImpl", "Start install request error code: INCOMPATIBLE_WITH_EXISTING_SESSION");
            callback.onError(bundleErrorCode(-8));
            return;
        }
        try {
            e(iCreateSessionId, baxVarA, list, list2, callback);
        } catch (IOException e2) {
            LogUtil.e("Bundle_SupervisorImpl", "Failed to copy internal modules, ex=", LogUtil.c(e2));
            callback.onError(bundleErrorCode(-99));
        }
    }

    private void e(int i, bax baxVar, List<String> list, List<baj> list2, ModuleInstallSupervisor.Callback callback) throws IOException {
        bax baxVar2;
        ArrayList arrayList = new ArrayList(list2.size());
        long jE = e(list2, arrayList);
        callback.onStartInstall(i, null);
        List<DownloadRequest> listD = d(arrayList);
        if (baxVar == null) {
            baxVar2 = new bax(i, list, list2, listD, jE);
        } else {
            baxVar.a(listD, jE);
            baxVar2 = baxVar;
        }
        this.j.c(i, baxVar2);
        if (jE <= 0) {
            LogUtil.c("Bundle_SupervisorImpl", "Modules have been downloaded, install them directly!");
            new e(this.f917c, i, this.j, list2).onCompleted();
        } else {
            e(baxVar2);
        }
    }

    private void e(bax baxVar) {
        Intent intent = new Intent();
        intent.putExtra("sessionId", baxVar.d());
        intent.putExtra("realDownloadTotalBytes", baxVar.f());
        intent.putStringArrayListExtra("moduleNames", (ArrayList) baxVar.e());
        intent.putStringArrayListExtra("downloadModuleNames", (ArrayList) baxVar.c());
        intent.setPackage(this.f916b.getPackageName());
        intent.setClass(this.f916b, this.f);
        baxVar.e(PendingIntent.getActivity(this.f916b, baxVar.d(), intent, 167772160));
        this.j.c(baxVar.d(), 8);
        this.j.c(baxVar);
    }

    private void d(List<String> list, ModuleInstallSupervisor.Callback callback) {
        LogUtil.b("Bundle_SupervisorImpl", "start uninstall modules ", list.toString());
        for (String str : list) {
            baj bajVarE = baq.a().e(this.f916b, str);
            if (bajVarE != null) {
                try {
                    this.f917c.d(bajVarE);
                    LogUtil.b("Bundle_SupervisorImpl", str, " record uninstall succeed.");
                } catch (bba.a e2) {
                    LogUtil.e("Bundle_SupervisorImpl", str, " record uninstall failed. ex=", LogUtil.c(e2));
                    callback.onError(bundleErrorCode(-100));
                    return;
                }
            }
        }
        callback.onDeferredUninstall(null);
    }

    private boolean f(List<String> list) {
        return list.isEmpty() || !AppBundleBuildConfig.b().containsAll(list);
    }

    private boolean j(List<String> list) {
        for (baj bajVar : baq.a().c(this.f916b)) {
            if (list.contains(bajVar.f()) && !e(bajVar)) {
                return false;
            }
        }
        return true;
    }

    private boolean e(baj bajVar) {
        return b(bajVar);
    }

    private boolean b(baj bajVar) {
        return bajVar.c() <= Build.VERSION.SDK_INT;
    }

    private List<DownloadRequest> d(List<baj> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (baj bajVar : list) {
            arrayList.add(DownloadRequest.newBuilder().c(bajVar.j()).a(bbf.a().c(bajVar).getAbsolutePath()).b(bajVar.f() + ".tmp").d(bajVar.f()).c(bajVar.e()).e());
        }
        return arrayList;
    }

    private long e(List<baj> list, List<baj> list2) throws IOException {
        long jL = 0;
        for (baj bajVar : list) {
            if (!a(bajVar)) {
                list2.add(bajVar);
                jL += bajVar.l();
            }
        }
        return jL;
    }

    private boolean a(baj bajVar) throws IOException {
        baz bazVar = new baz(bbf.a().c(bajVar), bbf.a().d(bajVar));
        try {
            boolean zC = bazVar.c(this.f916b, bajVar, this.d);
            if (zC) {
                FileUtils.j(bbf.a().h(bajVar));
            }
            return zC;
        } finally {
            FileUtils.a(bazVar);
        }
    }

    static class e implements DownloadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bba f921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final bbb f922c;
        private final List<baj> d;

        e(bba bbaVar, int i, bbb bbbVar, List<baj> list) {
            this.f921b = bbaVar;
            this.f920a = i;
            this.f922c = bbbVar;
            this.d = list;
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onStart() {
            bax baxVarA = this.f922c.a(this.f920a);
            if (baxVarA != null) {
                this.f922c.c(this.f920a, 2);
                e(baxVarA);
            }
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onCanceled() {
            bax baxVarA = this.f922c.a(this.f920a);
            if (baxVarA != null) {
                this.f922c.c(this.f920a, 7);
                e(baxVarA);
            }
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onCanceling() {
            bax baxVarA = this.f922c.a(this.f920a);
            if (baxVarA != null) {
                this.f922c.c(this.f920a, 9);
                e(baxVarA);
            }
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onProgress(long j) {
            bax baxVarA = this.f922c.a(this.f920a);
            if (baxVarA != null) {
                baxVarA.d(j);
                this.f922c.c(this.f920a, 2);
                e(baxVarA);
            }
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onCompleted() {
            bax baxVarA = this.f922c.a(this.f920a);
            if (baxVarA != null) {
                this.f922c.c(this.f920a, 3);
                e(baxVarA);
                bau.e(new bbg(this.f921b, this.d, this.f920a, this.f922c));
            }
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onError(int i) {
            bax baxVarA = this.f922c.a(this.f920a);
            if (baxVarA != null) {
                baxVarA.a(-10);
                this.f922c.c(this.f920a, 6);
                e(baxVarA);
            }
        }

        private void e(bax baxVar) {
            this.f922c.c(baxVar);
        }
    }

    static class c implements DownloadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<baj> f918a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final bba f919c;

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onCanceled() {
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onCanceling() {
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onError(int i) {
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onProgress(long j) {
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onStart() {
        }

        c(bba bbaVar, List<baj> list) {
            this.f918a = list;
            this.f919c = bbaVar;
        }

        @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadCallback
        public void onCompleted() {
            bau.e(new baw(this.f919c, this.f918a));
        }
    }
}

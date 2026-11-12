package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleDownloader;
import com.huawei.haf.bundle.extension.BundleExtension;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.download.DownloadPluginCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.AuthorizationUtils;
import health.compact.a.GrsDownloadPluginUrl;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class djx implements AppBundleDownloader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pjl f31826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, Integer> f31827c = new HashMap();
    private boolean d;

    djx() {
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader
    public void startDownload(int i, List<AppBundleDownloader.DownloadRequest> list, AppBundleDownloader.DownloadCallback downloadCallback) {
        c(false, i, list, downloadCallback);
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader
    public void deferredDownload(int i, List<AppBundleDownloader.DownloadRequest> list, AppBundleDownloader.DownloadCallback downloadCallback) {
        c(true, i, list, downloadCallback);
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader
    public boolean cancelDownloadSync(int i) {
        int iC = c(i);
        if (iC <= 0) {
            return true;
        }
        e().c(iC);
        return true;
    }

    private void c(boolean z, int i, List<AppBundleDownloader.DownloadRequest> list, AppBundleDownloader.DownloadCallback downloadCallback) {
        if (b(i)) {
            LogUtil.b("Bundle_Downloader", "exist same download task. taskId=", String.valueOf(i), ", ", "isDeferred=", String.valueOf(z));
            if (z) {
                return;
            }
        }
        if (!AuthorizationUtils.c(BaseApplication.b())) {
            downloadCallback.onError(7);
            LogUtil.e("Bundle_Downloader", "not authorize");
            return;
        }
        GrsDownloadPluginUrl grsDownloadPluginUrlC = c();
        List<String> listD = d.d(list);
        if (listD.isEmpty()) {
            downloadCallback.onCompleted();
            return;
        }
        d(listD);
        if (b(i, z, e().d(listD, -1, new b(z, i, list, downloadCallback, listD), grsDownloadPluginUrlC), listD)) {
            return;
        }
        downloadCallback.onError(3);
        LogUtil.e("Bundle_Downloader", "updatePlugins task fail.");
    }

    private pjl e() {
        if (this.f31826b == null) {
            pjl pjlVarC = d.c((String) null);
            this.f31826b = pjlVarC;
            pia.b(new a(pjlVarC.b().getIndexSaveKey()));
        }
        return this.f31826b;
    }

    private GrsDownloadPluginUrl c() {
        String strC;
        boolean zB = BundleExtension.d().b();
        if (BundleExtension.d().a()) {
            strC = BundleExtension.d().c();
            String strE = BundleExtension.d().e();
            LogUtil.b("Bundle_Downloader", "isTestAllow isUseHealthConfigCenter=", String.valueOf(zB), ", verion=", String.valueOf(strE));
            this.f31826b = d.c(strE);
            this.d = true;
        } else {
            if (this.d) {
                this.f31826b = d.c((String) null);
                this.d = false;
            }
            strC = null;
        }
        return new c(strC, zB);
    }

    private boolean b(int i, boolean z, int i2, List<String> list) {
        if (i2 <= 0) {
            return false;
        }
        synchronized (this.f31827c) {
            this.f31827c.put(Integer.valueOf(i), Integer.valueOf(z ? -i2 : i2));
        }
        LogUtil.b("Bundle_Downloader", "begin download taskId=", Integer.valueOf(i), ", taskNo=", Integer.valueOf(i2), ", isDeferred=", String.valueOf(z), ", plugins=", list.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, boolean z, int i2) {
        int iC;
        synchronized (this.f31827c) {
            iC = c(i);
            if (iC < 0 && z) {
                iC = -iC;
                this.f31827c.remove(Integer.valueOf(i));
            } else if (iC <= 0 || z) {
                iC = 0;
            } else {
                this.f31827c.remove(Integer.valueOf(i));
            }
        }
        LogUtil.b("Bundle_Downloader", "end download taskId=", Integer.valueOf(i), ", taskNo=", Integer.valueOf(iC), ", isDeferred=", String.valueOf(z), ", result=", Integer.valueOf(i2));
    }

    private int c(int i) {
        int iIntValue;
        synchronized (this.f31827c) {
            Integer num = this.f31827c.get(Integer.valueOf(i));
            iIntValue = num instanceof Integer ? num.intValue() : 0;
        }
        return iIntValue;
    }

    private boolean b(int i) {
        boolean zContainsKey;
        synchronized (this.f31827c) {
            zContainsKey = this.f31827c.containsKey(Integer.valueOf(i));
        }
        return zContainsKey;
    }

    private void d(List<String> list) {
        new d(e(), false).b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, List<AppBundleDownloader.DownloadRequest> list) throws IOException {
        new d(e(), false).d(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<String> list, List<AppBundleDownloader.DownloadRequest> list2, AppBundleDownloader.DownloadCallback downloadCallback) {
        return new d(e(), true).c(list, list2, downloadCallback);
    }

    /* JADX INFO: loaded from: classes26.dex */
    static class a implements FilenameFilter {
        private final String e;

        a(String str) {
            this.e = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str != null && str.startsWith("index_bundle_")) {
                return !str.equals(this.e);
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    static class c extends GrsDownloadPluginUrl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31831b;

        c(String str, boolean z) {
            super(z);
            this.f31831b = str;
        }

        @Override // health.compact.a.GrsDownloadPluginUrl, com.huawei.haf.download.DownloadPluginUrl
        public String getDownloadPluginUrl(String str, boolean z) {
            return e(str, this.f31831b, z);
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    class b implements DownloadPluginCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f31828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppBundleDownloader.DownloadCallback f31829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31830c;
        private boolean e;
        private final int f;
        private final List<String> h;
        private final List<AppBundleDownloader.DownloadRequest> i;
        private int j = 0;

        b(boolean z, int i, List<AppBundleDownloader.DownloadRequest> list, AppBundleDownloader.DownloadCallback downloadCallback, List<String> list2) {
            this.f31828a = z;
            this.f = i;
            this.i = list;
            this.f31829b = downloadCallback;
            this.h = list2;
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public boolean onDownloadPluginResult(int i, String str, int i2) {
            LogUtil.b("Bundle_Downloader", "onDownloadPluginResult taskNo=", Integer.valueOf(i), ", name=", str, ", result=", Integer.valueOf(i2));
            if (i2 != 0) {
                return false;
            }
            try {
                djx.this.e(str, this.i);
                return false;
            } catch (IOException e) {
                LogUtil.e("Bundle_Downloader", "moveFile fail. ex=", LogUtil.c(e));
                this.f31830c = true;
                return false;
            }
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void startDownloadProgress(int i) {
            this.e = true;
            this.f31829b.onStart();
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void showDownloadProgress(int i, int i2, int i3) {
            if (i3 - this.j >= 5 || i3 >= 95) {
                this.f31829b.onProgress(i2);
                this.j = i3;
            }
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void onDownloadResult(int i, int i2) {
            LogUtil.b("Bundle_Downloader", "onDownloadResult taskNo=", Integer.valueOf(i), ", reason=", Integer.valueOf(i2));
            if (!this.e && djx.this.a(this.h, this.i, this.f31829b)) {
                d(0, false);
                return;
            }
            if (this.f31830c) {
                i2 = 3;
            }
            d(i2, true);
        }

        private void d(int i, boolean z) {
            int i2;
            if (i != 0) {
                i2 = (this.f31828a ? 100 : 0) + i;
            } else {
                i2 = i;
            }
            djx.this.d(this.f, this.f31828a, i2);
            if (i == 0) {
                this.f31829b.onCompleted();
            } else if (i == 1) {
                this.f31829b.onCanceling();
                this.f31829b.onCanceled();
            } else {
                this.f31829b.onError(i);
            }
            if (z) {
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_BUNDLE_DOWNLOAD_85070030.value(), i2);
            }
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    static class d {
        private static boolean e = LogUtil.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final pjl f31832b;
        private final e d;

        d(pjl pjlVar, boolean z) {
            this.f31832b = pjlVar;
            this.d = z ? new e(pjlVar.b().getVersion()) : null;
        }

        static pjl c(String str) {
            if (!TextUtils.isEmpty(str)) {
                e = str.indexOf(45) != -1;
            } else {
                e = LogUtil.b();
            }
            return new pjl(new dka("com.huawei.health_bundle_two", str, e));
        }

        static List<String> d(List<AppBundleDownloader.DownloadRequest> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (AppBundleDownloader.DownloadRequest downloadRequest : list) {
                if (downloadRequest.getUrl().startsWith("config://")) {
                    e(arrayList, downloadRequest);
                }
            }
            return arrayList;
        }

        private static void e(List<String> list, AppBundleDownloader.DownloadRequest downloadRequest) {
            int fileNum = downloadRequest.getFileNum();
            if (fileNum <= 1) {
                list.add(d(downloadRequest.getModuleName()));
                return;
            }
            for (int i = 1; i <= fileNum; i++) {
                list.add(e(downloadRequest.getModuleName(), i));
            }
        }

        private static String e(String str, int i) {
            return d(str + "-split-" + i);
        }

        private static String d(String str) {
            if (!e) {
                return str;
            }
            return "Beta_" + str;
        }

        private static AppBundleDownloader.DownloadRequest a(String str, List<AppBundleDownloader.DownloadRequest> list) {
            for (AppBundleDownloader.DownloadRequest downloadRequest : list) {
                if (str.startsWith(d(downloadRequest.getModuleName()))) {
                    return downloadRequest;
                }
            }
            return null;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0038 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void d(String str, List<AppBundleDownloader.DownloadRequest> list) throws IOException {
            AppBundleDownloader.DownloadRequest downloadRequestA = a(str, list);
            if (downloadRequestA == null) {
                e(str);
                return;
            }
            if (str.equals(d(downloadRequestA.getModuleName()))) {
                File fileA = a(str);
                if (fileA == null || !fileA.exists()) {
                    return;
                }
                File file = new File(downloadRequestA.getFileDir(), downloadRequestA.getFileName());
                try {
                    FileUtils.e(fileA, file);
                    e(str);
                    return;
                } catch (IOException e2) {
                    FileUtils.j(file);
                    throw e2;
                }
            }
            b(downloadRequestA);
        }

        boolean c(List<String> list, List<AppBundleDownloader.DownloadRequest> list2, AppBundleDownloader.DownloadCallback downloadCallback) {
            e eVar = this.d;
            boolean z = false;
            if (eVar == null || !eVar.c()) {
                return false;
            }
            downloadCallback.onStart();
            long jC = 0;
            for (String str : list) {
                try {
                    d(str, list2);
                } catch (IOException e2) {
                    LogUtil.e("Bundle_Downloader", "moveFile fail. ex=", LogUtil.c(e2));
                    z = true;
                }
                jC += this.d.c(str);
                downloadCallback.onProgress(jC);
            }
            return !z;
        }

        void b(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }

        void e(String str) {
            e eVar = this.d;
            if (eVar != null) {
                FileUtils.b(eVar.b(str));
            } else {
                FileUtils.d(new File(this.f31832b.b().getPluginSavePath(str).toString()));
            }
        }

        private File a(String str) {
            e eVar = this.d;
            if (eVar != null) {
                return eVar.b(str);
            }
            return this.f31832b.e(str);
        }

        private void b(AppBundleDownloader.DownloadRequest downloadRequest) throws IOException {
            int fileNum = downloadRequest.getFileNum();
            File[] fileArr = new File[fileNum];
            for (int i = 1; i <= fileNum; i++) {
                File fileA = a(e(downloadRequest.getModuleName(), i));
                if (fileA == null || !fileA.exists()) {
                    return;
                }
                fileArr[i - 1] = fileA;
            }
            File file = new File(downloadRequest.getFileDir(), downloadRequest.getFileName());
            try {
                try {
                    FileUtils.b(fileArr, file);
                    c(downloadRequest);
                } catch (IOException e2) {
                    FileUtils.j(file);
                    throw e2;
                }
            } catch (Throwable th) {
                c(downloadRequest);
                throw th;
            }
        }

        private void c(AppBundleDownloader.DownloadRequest downloadRequest) {
            int fileNum = downloadRequest.getFileNum();
            for (int i = 1; i <= fileNum; i++) {
                e(e(downloadRequest.getModuleName(), i));
            }
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<phz> f31833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f31834c;

        e(String str) {
            File file = new File(BaseApplication.b().getExternalCacheDir(), "bundle-plugins");
            this.f31834c = file;
            File file2 = new File(file, "index_plugins_" + str + ".json");
            if (file2.exists()) {
                this.f31833b = phw.c(pia.a(file2)).c();
                LogUtil.b("Bundle_Downloader", "DownloadPluginTestHelper indexFile=", file2.getName(), ", size=", Integer.valueOf(this.f31833b.size()));
            }
        }

        boolean c() {
            List<phz> list = this.f31833b;
            return (list == null || list.isEmpty()) ? false : true;
        }

        File b(String str) {
            phz phzVarE = e(str);
            String strC = phzVarE != null ? phzVarE.c() : null;
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            File file = new File(this.f31834c, strC);
            if (file.exists()) {
                return file;
            }
            return null;
        }

        long c(String str) {
            phz phzVarE = e(str);
            if (phzVarE != null) {
                return phzVarE.b();
            }
            return 0L;
        }

        private phz e(String str) {
            List<phz> list = this.f31833b;
            if (list == null) {
                return null;
            }
            for (phz phzVar : list) {
                if (str.equals(phzVar.a())) {
                    return phzVar;
                }
            }
            return null;
        }
    }
}

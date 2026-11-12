package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProInstallDirCleanTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f7026b;
    private ExecutorService e = Executors.newSingleThreadExecutor();

    public H5ProInstallDirCleanTask(Context context) {
        this.f7026b = new WeakReference<>(a(context));
    }

    public void execute(String str) {
        this.e.submit(new d(str));
    }

    class d implements Runnable {
        private String e;

        d(String str) {
            this.e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] fileArrListFiles;
            LogUtil.i(b(), "start.");
            Context context = (Context) H5ProInstallDirCleanTask.this.f7026b.get();
            if (context == null) {
                LogUtil.w(b(), "context is null");
                return;
            }
            String rootDir = HpkManager.e.getRootDir(context);
            File file = new File(String.format(Locale.ENGLISH, "%s/%s-version.json", rootDir, this.e));
            if (file.exists()) {
                file.delete();
                LogUtil.i(b(), "exist old version.json, del.");
            }
            File file2 = new File(String.format(Locale.ENGLISH, "%s/%s.installed", rootDir, this.e));
            if (file2.exists()) {
                file2.delete();
                LogUtil.i(b(), "exist old installed file, del.");
            }
            File file3 = new File(HpkManager.e.getH5WorkPath(context, this.e));
            if (!file3.exists() || (fileArrListFiles = file3.listFiles()) == null || fileArrListFiles.length == 0) {
                return;
            }
            File file4 = new File(file3 + "/entry");
            if (file4.exists()) {
                LogUtil.i(b(), "exist old entry, del.");
                FileDownloadManager.deleteFiles(file4, true);
            }
            File file5 = new File(file3 + "/manifest.json");
            if (file5.exists()) {
                file5.delete();
            }
            String userFlag = EnvironmentHelper.getInstance().getUserFlag();
            if (TextUtils.isEmpty(userFlag)) {
                LogUtil.i(b(), "user flag is empty, return.");
                return;
            }
            File file6 = new File(HpkManager.e.getInitFilePath(context, this.e));
            if (file6.exists()) {
                String installDirNamePrefix = HpkManager.e.getInstallDirNamePrefix(String.valueOf(file6.lastModified()));
                String str = installDirNamePrefix + userFlag;
                for (File file7 : fileArrListFiles) {
                    if (!TextUtils.isEmpty(installDirNamePrefix) && !file7.getName().equals(str) && file7.getName().startsWith(installDirNamePrefix)) {
                        LogUtil.i(b(), "Switch to a new user, del the old installation dir.");
                        FileDownloadManager.deleteFiles(file7, true);
                        return;
                    }
                }
            }
        }

        private String b() {
            return LogUtil.getTag(this.e, "H5ProInstallDirCleanTask");
        }
    }

    private Context a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}

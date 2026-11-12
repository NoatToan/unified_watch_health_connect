package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.android.hms.ppskit.RemoteInstallReq;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20006a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static pe f20007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20008c;

    public interface a {
        void a();

        void a(int i);

        void b();
    }

    public void a(AppInfo appInfo, AppDownloadTask appDownloadTask, a aVar) {
        a(appInfo, true, appDownloadTask, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.g())) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pe.2
            @Override // java.lang.Runnable
            public void run() {
                nb.a(pe.this.f20008c).a(appInfo.getPackageName(), appInfo.g(), appInfo.h());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(AppInfo appInfo, String str, a aVar) {
        String str2;
        int i;
        if (com.huawei.openalliance.ad.utils.ai.b(str)) {
            File file = new File(str);
            if (appInfo.getFileSize() != file.length()) {
                str2 = "installApkViaHiFolder, file size error";
            } else {
                if (!appInfo.isCheckSha256() || com.huawei.openalliance.ad.utils.ai.a(appInfo.getSha256(), file)) {
                    return true;
                }
                str2 = "installApkViaHiFolder, file sha256 error";
            }
            hw.c("InstallProcessor", str2);
            com.huawei.openalliance.ad.utils.ai.e(file);
            i = R.string.hiad_download_file_corrupted;
        } else {
            hw.c("InstallProcessor", "installApkViaHiFolder, file not exist");
            i = R.string.hiad_download_file_not_exist;
        }
        a(appInfo, i, aVar);
        return false;
    }

    private void a(final AppInfo appInfo, final boolean z, final AppDownloadTask appDownloadTask, final a aVar) {
        if (appDownloadTask == null) {
            hw.c("InstallProcessor", "installApk task is null");
        } else {
            final String strD = appDownloadTask.d();
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.pe.1
                @Override // java.lang.Runnable
                public void run() {
                    if (pe.this.a(appInfo, strD, aVar)) {
                        String strE = appDownloadTask.E();
                        if (z && "3".equals(strE)) {
                            appDownloadTask.d(3);
                            com.huawei.openalliance.ad.utils.k.a(appDownloadTask, EventType.APPINSTALLSTART, 3);
                            pe.this.b(appInfo);
                            com.huawei.openalliance.ad.utils.k.a(pe.this.f20008c, strD, appInfo.getPackageName(), aVar);
                            return;
                        }
                        if (z && "4".equals(strE)) {
                            appDownloadTask.d(4);
                            com.huawei.openalliance.ad.utils.k.a(appDownloadTask, EventType.APPINSTALLSTART, 4);
                            com.huawei.openalliance.ad.utils.k.a(pe.this.f20008c, new RemoteInstallReq(appDownloadTask.M(), "3.4.84.300", appInfo.getPackageName(), appDownloadTask.N(), pe.this.a(appInfo), appInfo.h()), strD, appInfo.getPackageName(), aVar);
                            return;
                        }
                        pe.this.a(appInfo, strD, appDownloadTask, aVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppInfo appInfo, String str, AppDownloadTask appDownloadTask, a aVar) {
        if (aVar != null) {
            aVar.b();
        }
        if (appDownloadTask != null) {
            com.huawei.openalliance.ad.utils.k.a(appDownloadTask, EventType.APPINSTALLSTART, 2);
            appDownloadTask.d(2);
        }
        com.huawei.openalliance.ad.utils.k.a(this.f20008c, str, appInfo.getPackageName());
    }

    private void a(AppInfo appInfo, final int i, final a aVar) {
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.pe.3
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(pe.this.f20008c, i, 0).show();
                aVar.a(6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(AppInfo appInfo) {
        if (appInfo == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String strG = appInfo.g();
            if (!com.huawei.openalliance.ad.utils.dg.b(strG)) {
                jSONObject = new JSONObject(com.huawei.openalliance.ad.utils.dg.e(strG));
            }
            jSONObject.put("appType", appInfo.B());
            return com.huawei.openalliance.ad.utils.dg.f(jSONObject.toString());
        } catch (Throwable th) {
            hw.c("InstallProcessor", "putAppTypeToChannel err: " + th.getClass().getSimpleName());
            return appInfo.g();
        }
    }

    public static pe a(Context context) {
        pe peVar;
        synchronized (f20006a) {
            if (f20007b == null) {
                f20007b = new pe(context);
            }
            peVar = f20007b;
        }
        return peVar;
    }

    private pe(Context context) {
        if (context != null) {
            this.f20008c = context.getApplicationContext();
        }
    }
}

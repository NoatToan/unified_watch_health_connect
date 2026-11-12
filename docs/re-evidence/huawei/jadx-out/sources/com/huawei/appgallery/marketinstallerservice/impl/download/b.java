package com.huawei.appgallery.marketinstallerservice.impl.download;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.AsyncTask;
import androidx.core.content.FileProvider;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.ui.MarketDownloadActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import defpackage.bid;
import defpackage.bir;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes23.dex */
public class b extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5235b;
    private a d;
    private InstallParamSpec e;

    public interface a {
        void a(boolean z);

        Context b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        bir.e("MarketInstallTask", "start install task result:" + bool);
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        PendingIntent activity;
        a aVar = this.d;
        if (aVar == null) {
            bir.d("MarketInstallTask", "callback is null!");
            return false;
        }
        File file = new File(bid.c(aVar.b()));
        if (!file.exists()) {
            bir.e("MarketInstallTask", "download file is empty!");
            return false;
        }
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        PackageInstaller packageInstaller = this.d.b().getPackageManager().getPackageInstaller();
        PackageInstaller.Session sessionOpenSession = null;
        try {
            int iCreateSession = packageInstaller.createSession(sessionParams);
            sessionOpenSession = packageInstaller.openSession(iCreateSession);
            boolean zE = e(file, sessionOpenSession);
            if (zE) {
                InstallParamSpec installParamSpec = this.e;
                if (installParamSpec == null || !installParamSpec.isSilentDownload()) {
                    activity = PendingIntent.getActivity(this.d.b(), iCreateSession, new Intent(this.d.b(), (Class<?>) MarketDownloadActivity.class), 134217728);
                } else {
                    Intent intent = new Intent(this.d.b(), (Class<?>) MarketInstallReceiver.class);
                    intent.putExtra("callback_key", this.f5235b);
                    activity = PendingIntent.getBroadcast(this.d.b(), iCreateSession, intent, 134217728);
                }
                sessionOpenSession.commit(activity.getIntentSender());
            }
            return Boolean.valueOf(zE);
        } catch (Exception unused) {
            bir.d("MarketInstallTask", "start install Exception!");
            return false;
        } finally {
            if (sessionOpenSession != null) {
                sessionOpenSession.close();
            }
        }
    }

    public static boolean c(Context context) {
        try {
            if (context.getPackageManager().checkPermission("android.permission.INSTALL_PACKAGES", context.getPackageName()) == 0) {
                return true;
            }
            bir.e("MarketInstallTask", "has not silent install permission!");
            return false;
        } catch (Exception unused) {
            bir.e("MarketInstallTask", "has not silent install permission Exception!");
            return false;
        }
    }

    private boolean e(File file, PackageInstaller.Session session) throws Throwable {
        OutputStream outputStream;
        byte[] bArr = new byte[131072];
        FileInputStream fileInputStream = null;
        outputStreamOpenWrite = null;
        OutputStream outputStreamOpenWrite = null;
        fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                outputStreamOpenWrite = session.openWrite("MarketInstallService", 0L, file.length());
                while (true) {
                    int i = fileInputStream2.read(bArr);
                    if (i == -1) {
                        session.fsync(outputStreamOpenWrite);
                        c(fileInputStream2, outputStreamOpenWrite);
                        return true;
                    }
                    outputStreamOpenWrite.write(bArr, 0, i);
                }
            } catch (IOException e) {
                e = e;
                outputStream = outputStreamOpenWrite;
                fileInputStream = fileInputStream2;
                try {
                    bir.d("MarketInstallTask", "copyApk apk error", e);
                    c(fileInputStream, outputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    c(fileInputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStreamOpenWrite;
                fileInputStream = fileInputStream2;
                c(fileInputStream, outputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            outputStream = null;
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    private void c(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                bir.e("MarketInstallTask", "fis close Exception");
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
                bir.e("MarketInstallTask", "fos close Exception");
            }
        }
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(FileProvider.getUriForFile(context, context.getPackageName() + ".marketinstall.fileprovider", new File(bid.c(context))), "application/vnd.android.package-archive");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.putExtra("android.intent.extra.RETURN_RESULT", true);
        return intent;
    }

    public b(a aVar, InstallParamSpec installParamSpec, String str) {
        this.d = aVar;
        this.e = installParamSpec;
        this.f5235b = str;
    }

    public b(a aVar) {
        this.e = null;
        this.f5235b = "";
        this.d = aVar;
    }
}

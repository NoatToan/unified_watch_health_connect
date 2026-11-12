package com.unionpay.tsm;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class TsmServiceDownloader {
    private static final String g = "UnionPay-TsmServiceDownloader";
    private static final String h = "com.huami.watch.companion.fileprovider";
    private static final String i = "com.android.providers.downloads";
    private Context a;
    private long b;
    private DownloadManager c;
    private BroadcastReceiver d;
    private Disposable e;
    private DownloadProgressListener f;

    public interface DownloadProgressListener {
        void onProgress(int i);
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction()) && intent.getLongExtra("extra_download_id", -1L) == TsmServiceDownloader.this.b) {
                TsmServiceDownloader.this.f();
                TsmServiceDownloader.this.i();
                if (TsmServiceDownloader.this.f != null) {
                    TsmServiceDownloader.this.f.onProgress(100);
                }
            }
        }
    }

    public TsmServiceDownloader(Context context) {
        this.a = context;
        this.c = (DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Disposable disposable = this.e;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.e.dispose();
    }

    private boolean g() {
        int applicationEnabledSetting = this.a.getPackageManager().getApplicationEnabledSetting(i);
        return applicationEnabledSetting == 2 || applicationEnabledSetting == 3 || applicationEnabledSetting == 4;
    }

    private int h() {
        Cursor cursorQuery = this.c.query(new DownloadManager.Query().setFilterById(this.b));
        if (!cursorQuery.moveToFirst()) {
            return 0;
        }
        return (int) ((cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bytes_so_far")) * 100) / cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("total_size")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00d0 A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #2 {all -> 0x00ce, blocks: (B:5:0x0028, B:7:0x002e, B:9:0x0034, B:11:0x0059, B:13:0x005f, B:15:0x0065, B:16:0x0096, B:18:0x00b8, B:21:0x00d0), top: B:40:0x0028, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00d9 A[Catch: Exception -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e8, blocks: (B:3:0x0010, B:23:0x00d9, B:30:0x00e7, B:29:0x00e4, B:26:0x00df, B:5:0x0028, B:7:0x002e, B:9:0x0034, B:11:0x0059, B:13:0x005f, B:15:0x0065, B:16:0x0096, B:18:0x00b8, B:21:0x00d0), top: B:39:0x0010, inners: #0, #2 }] */
    public void i() {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        Uri uriForFile = null;
        try {
            Cursor cursorQuery = this.c.query(new DownloadManager.Query().setFilterById(this.b));
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        HMLog.i(g, "Unable to parse downloaded file!!", new Object[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        intent.addFlags(1);
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
                        HMLog.i(g, "OnDownloaded LocalUri : " + string, new Object[0]);
                        if (string != null && (uri = Uri.parse(string)) != null && uri.getPath() != null) {
                            String absolutePath = new File(uri.getPath()).getAbsolutePath();
                            HMLog.i(g, "OnDownloaded File : " + absolutePath, new Object[0]);
                            uriForFile = FileProvider.getUriForFile(this.a, h, new File(absolutePath));
                        }
                    } else {
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("local_filename"));
                        HMLog.i(g, "OnDownload LocalFile : " + string2, new Object[0]);
                        if (string2 != null) {
                            uriForFile = Uri.parse("file://" + string2);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                HMLog.i(g, "Unable to parse downloaded file!!", new Object[0]);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        HMLog.i(g, "OnDownloaded : " + uriForFile, new Object[0]);
        if (uriForFile != null) {
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            this.a.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Long l) throws Exception {
        if (this.f != null) {
            HMLog.i(g, "Progress:" + h(), new Object[0]);
            this.f.onProgress(h());
        }
    }

    private void k() {
        f();
        this.e = Observable.interval(1L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: q08
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.j((Long) obj);
            }
        });
    }

    private void l() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:com.android.providers.downloads"));
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            this.a.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        }
    }

    private void m() {
        this.d = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        intentFilter.addAction("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED");
        this.a.registerReceiver(this.d, intentFilter);
    }

    public void cancel() {
        try {
            this.c.remove(this.b);
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                this.a.unregisterReceiver(broadcastReceiver);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        f();
    }

    public void download(String str, DownloadProgressListener downloadProgressListener) {
        HMLog.i(g, "Download Start,Url:" + str, new Object[0]);
        if (g()) {
            HMLog.i(g, "Download Manager is Disable", new Object[0]);
            l();
            return;
        }
        this.f = downloadProgressListener;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setAllowedNetworkTypes(3);
        request.setDestinationInExternalFilesDir(this.a, Environment.DIRECTORY_DOWNLOADS, "tsm.apk");
        request.setMimeType("application/vnd.android.package-archive");
        request.setNotificationVisibility(3);
        this.b = this.c.enqueue(request);
        m();
        k();
    }
}

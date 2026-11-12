package com.huawei.hms.update.download;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.download.api.IOtaUpdate;
import com.huawei.hms.update.download.api.IUpdateCallback;
import com.huawei.hms.update.download.api.UpdateInfo;
import com.huawei.hms.update.http.CanceledException;
import com.huawei.hms.update.http.HttpRequestHelper;
import com.huawei.hms.update.http.IHttpRequestHelper;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes34.dex */
public class UpdateDownload implements IOtaUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IHttpRequestHelper f16704b = new HttpRequestHelper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DownloadRecord f16705c = new DownloadRecord();
    private IUpdateCallback d;
    private File e;

    public UpdateDownload(Context context) {
        this.f16703a = context.getApplicationContext();
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public void cancel() {
        HMSLog.i("UpdateDownload", "Enter cancel.");
        a((IUpdateCallback) null);
        this.f16704b.cancel();
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public void downloadPackage(IUpdateCallback iUpdateCallback, UpdateInfo updateInfo) {
        Checker.checkNonNull(iUpdateCallback, "callback must not be null.");
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        a(iUpdateCallback);
        if (updateInfo == null || !updateInfo.isValid()) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Invalid update info.");
            a(2201, 0, 0);
            return;
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Invalid external storage for downloading file.");
            a(2204, 0, 0);
            return;
        }
        String str = updateInfo.mPackageName;
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
            a(2201, 0, 0);
            return;
        }
        File localFile = UpdateProvider.getLocalFile(this.f16703a, str + ".apk");
        this.e = localFile;
        if (localFile == null) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Failed to get local file for downloading.");
            a(2204, 0, 0);
            return;
        }
        File parentFile = localFile.getParentFile();
        if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Failed to create directory for downloading file.");
            a(2201, 0, 0);
        } else if (parentFile.getUsableSpace() < updateInfo.mSize * 3) {
            HMSLog.e("UpdateDownload", "In downloadPackage, No space for downloading file.");
            a(2203, 0, 0);
        } else {
            try {
                a(updateInfo);
            } catch (CanceledException unused) {
                HMSLog.w("UpdateDownload", "In downloadPackage, Canceled to download the update file.");
                a(2101, 0, 0);
            }
        }
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public Context getContext() {
        return this.f16703a;
    }

    private void a(IUpdateCallback iUpdateCallback) {
        synchronized (this) {
            this.d = iUpdateCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, int i3) {
        synchronized (this) {
            IUpdateCallback iUpdateCallback = this.d;
            if (iUpdateCallback != null) {
                iUpdateCallback.onDownloadPackage(i, i2, i3, this.e);
            }
        }
    }

    void a(UpdateInfo updateInfo) throws CanceledException {
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        RandomFileOutputStream randomFileOutputStreamA = null;
        try {
            try {
                String str = updateInfo.mPackageName;
                if (TextUtils.isEmpty(str)) {
                    HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                    a(2201, 0, 0);
                    return;
                }
                this.f16705c.load(getContext(), str);
                if (this.f16705c.isValid(updateInfo.mUri, updateInfo.mSize, updateInfo.mHash)) {
                    if (this.f16705c.a() == this.f16705c.getSize()) {
                        if (FileUtil.verifyHash(updateInfo.mHash, this.e)) {
                            a(2000, 0, 0);
                            return;
                        } else {
                            this.f16705c.init(updateInfo.mUri, updateInfo.mSize, updateInfo.mHash);
                            randomFileOutputStreamA = a(this.e, updateInfo.mSize, str);
                        }
                    } else {
                        randomFileOutputStreamA = a(this.e, updateInfo.mSize, str);
                        randomFileOutputStreamA.seek(this.f16705c.a());
                    }
                } else {
                    this.f16705c.init(updateInfo.mUri, updateInfo.mSize, updateInfo.mHash);
                    randomFileOutputStreamA = a(this.e, updateInfo.mSize, str);
                }
                int i = this.f16704b.get(updateInfo.mUri, randomFileOutputStreamA, this.f16705c.a(), this.f16705c.getSize(), this.f16703a);
                if (i != 200 && i != 206) {
                    HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package, HTTP code: " + i);
                    a(2201, 0, 0);
                    return;
                }
                if (!FileUtil.verifyHash(updateInfo.mHash, this.e)) {
                    a(2202, 0, 0);
                } else {
                    a(2000, 0, 0);
                }
            } catch (IOException e) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Failed to download." + e.getMessage());
                a(2201, 0, 0);
            }
        } finally {
            this.f16704b.close();
            IOUtils.closeQuietly((OutputStream) null);
        }
    }

    private RandomFileOutputStream a(File file, final int i, final String str) throws IOException {
        return new RandomFileOutputStream(file, i) { // from class: com.huawei.hms.update.download.UpdateDownload.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f16706b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f16707c;

            {
                this.f16707c = UpdateDownload.this.f16705c.a();
            }

            private void a(int i2) {
                UpdateDownload.this.f16705c.update(UpdateDownload.this.getContext(), i2, str);
                UpdateDownload.this.a(2100, i2, i);
            }

            @Override // com.huawei.hms.update.download.RandomFileOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i2, int i3) throws IOException {
                super.write(bArr, i2, i3);
                int i4 = this.f16707c + i3;
                this.f16707c = i4;
                if (i4 > 209715200) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - this.f16706b) > 1000) {
                    this.f16706b = jCurrentTimeMillis;
                    a(this.f16707c);
                }
                int i5 = this.f16707c;
                if (i5 == i) {
                    a(i5);
                }
            }
        };
    }
}

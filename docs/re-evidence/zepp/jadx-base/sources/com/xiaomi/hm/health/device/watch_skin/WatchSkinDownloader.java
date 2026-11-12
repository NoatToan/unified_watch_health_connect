package com.xiaomi.hm.health.device.watch_skin;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.huami.account.api.model.HMWebAccess;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.SyncHttpClient;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinDownloader extends FileAsyncHttpResponseHandler {
    public static final String TAG = "WatchSkinDownloader";
    private String a;
    private DownloadProgressListener b;
    private Handler c;
    private boolean d;

    public interface DownloadProgressListener {
        void onFailure();

        void onProgress(float f);

        void onStart();

        void onSuccess();
    }

    public WatchSkinDownloader(String str, String str2) {
        this(str, str2, true);
    }

    public static String f() {
        File externalFilesDir = "mounted".equals(Environment.getExternalStorageState()) ? DeviceXFunctionsKt.getContext().getExternalFilesDir(WatchSkinConstant.SKIN_FOLDER) : DeviceXFunctionsKt.getContext().getFilesDir();
        if (externalFilesDir == null) {
            externalFilesDir = DeviceXFunctionsKt.getContext().getFilesDir();
        }
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return FileUtils.getExternalStorageDirectoryCompatible(DeviceXFunctionsKt.getContext()).getPath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + WatchSkinConstant.SKIN_FOLDER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.b.onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(int i, int i2) {
        this.b.onProgress(i / i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.b.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.b.onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        HMLog.i(TAG, "start download, url: " + this.a, new Object[0]);
        SyncHttpClient syncHttpClient = new SyncHttpClient();
        if (this.d) {
            syncHttpClient.get(this.a, this);
            return;
        }
        HMLog.i(TAG, this.d + "add header " + this.a, new Object[0]);
        BasicHeader[] basicHeaderArr = {new BasicHeader("apptoken", HMWebAccess.getToken()), new BasicHeader("appname", HMAppConfig.getPackageName())};
        RequestParams requestParams = new RequestParams();
        requestParams.add("userid", HMPersonInfo.getInstance().getUserInfo().getUserid());
        syncHttpClient.get(null, this.a, basicHeaderArr, requestParams, this);
    }

    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
        HMLog.i(TAG, "watch skin download fail, statusCode: " + i, new Object[0]);
        if (this.b != null) {
            this.c.post(new Runnable() { // from class: yj8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g();
                }
            });
        }
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public void onProgress(final int i, final int i2) {
        super.onProgress(i, i2);
        if (this.b != null) {
            this.c.post(new Runnable() { // from class: ak8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h(i, i2);
                }
            });
        }
    }

    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, File file) {
        HMLog.i(TAG, "watch skin download success.", new Object[0]);
        if (this.b != null) {
            this.c.post(new Runnable() { // from class: wj8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i();
                }
            });
        }
    }

    public void setProgressListener(DownloadProgressListener downloadProgressListener) {
        this.b = downloadProgressListener;
    }

    public void startDownload() {
        if (this.b != null) {
            this.c.post(new Runnable() { // from class: xj8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j();
                }
            });
        }
        new Thread(new Runnable() { // from class: zj8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }).start();
    }

    public WatchSkinDownloader(String str, String str2, boolean z) {
        super(new File(str2));
        this.a = str;
        this.c = new Handler(Looper.getMainLooper());
        this.d = z;
    }
}

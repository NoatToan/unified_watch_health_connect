package com.xiaomi.hm.health.traininglib.media;

import android.content.Context;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.xiaomi.hm.health.traininglib.model.DownloadInfo;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes22.dex */
class MediaDownloadTask {
    private static final String d = "MediaDownloadTask";
    private DownloadInfo a;
    private DownloadTaskListener b;
    private int c;

    public interface DownloadTaskListener {
        public static final int STATE_FAIL = 2;
        public static final int STATE_NO_DATA = -1;
        public static final int STATE_SIZE_NO_FIX = 3;
        public static final int STATE_SUCCESS = 1;

        void downloadProgress(DownloadInfo downloadInfo, long j);

        void downloadResult(DownloadInfo downloadInfo, int i);
    }

    public class a extends FileAsyncHttpResponseHandler {
        private long a;

        public a(File file, long j) {
            super(file);
            this.a = j;
        }

        @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
        public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
            th.printStackTrace();
            HMLog.w(MediaDownloadTask.d, th, "文件下载失败, " + file.getAbsolutePath(), new Object[0]);
            MediaDownloadTask.this.f(2);
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onProgress(int i, int i2) {
            HMLog.d(MediaDownloadTask.d, "文件下载进度: " + i + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i2, new Object[0]);
            int i3 = i - MediaDownloadTask.this.c;
            MediaDownloadTask.this.c = i;
            if (MediaDownloadTask.this.b != null) {
                MediaDownloadTask.this.b.downloadProgress(MediaDownloadTask.this.a, i3);
            }
            super.onProgress(i, i2);
        }

        @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
        public void onSuccess(int i, Header[] headerArr, File file) {
            if (file.length() == this.a) {
                HMLog.i(MediaDownloadTask.d, "文件下载完成: " + file.getAbsolutePath(), new Object[0]);
                MediaDownloadTask.this.f(1);
                return;
            }
            HMLog.w(MediaDownloadTask.d, "文件下载完成，但是大小不符合预期, 预期大小:" + this.a + ", 实际大小:" + file.length() + ", " + file.getAbsolutePath(), new Object[0]);
            MediaDownloadTask.this.f(3);
        }
    }

    public MediaDownloadTask(DownloadInfo downloadInfo) {
        this.a = downloadInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        DownloadTaskListener downloadTaskListener = this.b;
        if (downloadTaskListener != null) {
            downloadTaskListener.downloadResult(this.a, i);
        }
    }

    public void g(DownloadTaskListener downloadTaskListener) {
        this.b = downloadTaskListener;
    }

    public long h(AsyncHttpClient asyncHttpClient, Context context) {
        asyncHttpClient.get(context, this.a.url, new a(MediaFileUtils.newMedialPathByUrl(this.a.url), this.a.size));
        return this.a.size;
    }
}

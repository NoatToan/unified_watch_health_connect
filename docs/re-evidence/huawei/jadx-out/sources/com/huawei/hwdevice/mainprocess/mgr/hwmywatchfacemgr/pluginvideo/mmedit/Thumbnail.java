package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit;

import android.os.AsyncTask;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class Thumbnail {
    private static final String TAG = "Thumbnail";
    public static final int THUMBNAIL_READ_MODE_KEY = 1;
    private ThumbnailReceiver mReceiver;
    private int mThumbnailNum;
    private ThumbnailImpl thumbnailImpl;
    private ThumbnailAsyncTask mAsyncTask = null;
    private int mStatus = -1;
    private Object mSyncObj = new Object();

    public interface ThumbnailReceiver {
        void onReceiveThumbnail(ThumbnailInfo thumbnailInfo);
    }

    public Thumbnail() {
        this.thumbnailImpl = null;
        this.thumbnailImpl = new ThumbnailImpl();
    }

    protected int initThumbnail(String str, int i, int i2) {
        return this.thumbnailImpl.init(str, i, i2);
    }

    protected int startThumbnail(int[] iArr, int i, ThumbnailReceiver thumbnailReceiver) {
        LogUtil.a(TAG, "startThumbnail entry");
        if (this.mStatus == 1) {
            LogUtil.a(TAG, " startThumbnail Thumbnail Task is running");
            return -11;
        }
        synchronized (this.mSyncObj) {
            this.mStatus = 1;
            ThumbnailAsyncTask thumbnailAsyncTask = this.mAsyncTask;
            if (thumbnailAsyncTask != null) {
                if (!thumbnailAsyncTask.isCancelled() && this.mAsyncTask.getStatus() == AsyncTask.Status.RUNNING && !this.mAsyncTask.cancel(true)) {
                    LogUtil.e(TAG, "startThumbnail AsyncTask cancel failed");
                    this.mStatus = -1;
                    return -1000000;
                }
                this.mAsyncTask = null;
            }
            LogUtil.d(TAG, "startThumbnail Get thumbnail start");
            int iStart = this.thumbnailImpl.start(iArr, thumbnailReceiver);
            if (iStart != 0) {
                this.mStatus = -1;
                LogUtil.e(TAG, "startThumbnail Native start failed ", Integer.valueOf(iStart));
                return iStart;
            }
            this.mReceiver = thumbnailReceiver;
            this.mThumbnailNum = iArr.length;
            ThumbnailAsyncTask thumbnailAsyncTask2 = new ThumbnailAsyncTask();
            this.mAsyncTask = thumbnailAsyncTask2;
            thumbnailAsyncTask2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return 0;
        }
    }

    protected int getStatus() {
        return this.mStatus;
    }

    protected int destroyThumbnail() {
        int iRelease;
        ThumbnailAsyncTask thumbnailAsyncTask = this.mAsyncTask;
        if (thumbnailAsyncTask != null) {
            if (!thumbnailAsyncTask.isCancelled() && this.mAsyncTask.getStatus() == AsyncTask.Status.RUNNING) {
                this.mAsyncTask.cancel(true);
            }
            this.mAsyncTask = null;
        }
        synchronized (this.mSyncObj) {
            this.mStatus = -1;
            iRelease = this.thumbnailImpl.release();
        }
        return iRelease;
    }

    class ThumbnailAsyncTask extends AsyncTask<Void, ThumbnailInfo, Integer> {
        ThumbnailAsyncTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Integer doInBackground(Void... voidArr) {
            int i;
            synchronized (Thumbnail.this.mSyncObj) {
                i = 0;
                while (!isCancelled()) {
                    if (!Thumbnail.this.thumbnailImpl.isNullDecoder()) {
                        ThumbnailInfo thumbnailInfo = Thumbnail.this.thumbnailImpl.getThumbnailInfo();
                        if (thumbnailInfo != null) {
                            i++;
                            LogUtil.d(Thumbnail.TAG, "doInBackground bmpCount = " + i);
                            if (thumbnailInfo.getBitmap() != null) {
                                publishProgress(thumbnailInfo);
                            }
                            if (i == Thumbnail.this.mThumbnailNum) {
                                LogUtil.d(Thumbnail.TAG, "doInBackground Get thumbnail stop");
                                Thumbnail.this.thumbnailImpl.stop();
                                break;
                            }
                        }
                    } else {
                        LogUtil.j(Thumbnail.TAG, "doInBackground thumbnailDeocder is null, stop decoding!");
                        break;
                    }
                }
                Thumbnail.this.mStatus = -1;
            }
            return Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(ThumbnailInfo... thumbnailInfoArr) {
            if (Thumbnail.this.mReceiver != null) {
                Thumbnail.this.mReceiver.onReceiveThumbnail(thumbnailInfoArr[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Integer num) {
            LogUtil.a(Thumbnail.TAG, "onPostExecute Count of Bitmap is ", num);
            if (Thumbnail.this.mReceiver != null) {
                Thumbnail.this.mReceiver.onReceiveThumbnail(MMEdit.EOS);
            }
        }
    }
}

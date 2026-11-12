package com.ximalaya.ting.android.player;

import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes22.dex */
public class HlsReadThread extends Thread {
    private static final String TAG = "dl_hls";
    private volatile LinkedBlockingQueue<BufferItem> buffItemQueue;
    private volatile int curIndex;
    private volatile int fromIndex;
    private volatile boolean isResetIndex;
    private boolean isStop;
    public volatile boolean isWaiting;
    private int mDownloadIndex;
    private HlsAudioFile mHlsAudioFile;
    private String mSourceUrl;
    private XMediaplayerJNI mXMediaplayerJNI;
    private volatile Object synKey;
    public Object synObject;
    public Object synWaitObject;

    public HlsReadThread(HlsAudioFile hlsAudioFile, XMediaplayerJNI xMediaplayerJNI, String str, LinkedBlockingQueue<BufferItem> linkedBlockingQueue) {
        super("HlsReadThreadForPlayer");
        this.isStop = false;
        this.synObject = new Object();
        this.synWaitObject = new Object();
        this.isWaiting = false;
        this.synKey = new Object();
        this.mHlsAudioFile = hlsAudioFile;
        this.mXMediaplayerJNI = xMediaplayerJNI;
        this.mSourceUrl = str;
        this.buffItemQueue = linkedBlockingQueue;
        this.isResetIndex = true;
        setPriority(10);
    }

    private void putItem(BufferItem bufferItem) {
        if (this.isResetIndex) {
            Logger.log(TAG, "putItem buffItemQueue.size()2:" + this.buffItemQueue.size());
            return;
        }
        Logger.log(TAG, "putItem url:" + this.mHlsAudioFile.getPlayUrl(bufferItem.getIndex()) + " item Index:" + bufferItem.getIndex());
        StringBuilder sb = new StringBuilder();
        sb.append("putItem buffItemQueue.size()0:");
        sb.append(this.buffItemQueue.size());
        Logger.log(TAG, sb.toString());
        try {
            this.buffItemQueue.put(bufferItem);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Logger.log(TAG, "putItem buffItemQueue.size()1:" + this.buffItemQueue.size());
    }

    private int readChunkData(File file, BufferItem bufferItem) throws Throwable {
        int i;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            try {
                int length = (int) randomAccessFile2.length();
                byte[] bArr = new byte[length];
                int i2 = 0;
                do {
                    i = randomAccessFile2.read(bArr, i2, length - i2);
                    i2 += i;
                } while (i > 0);
                bufferItem.setBuffer(bArr);
                randomAccessFile2.close();
                try {
                    randomAccessFile2.close();
                } catch (IOException unused) {
                }
                return i2;
            } catch (IOException unused2) {
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile == null) {
                    return -1;
                }
                try {
                    randomAccessFile.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void close() {
        this.isStop = true;
        if (this.buffItemQueue != null) {
            this.buffItemQueue.clear();
        }
        Logger.log(XMediaplayerJNI.Tag, "HlsReadThread hls readData close");
    }

    public int getCacheIndex() {
        int i = this.mDownloadIndex;
        return i == 0 ? this.mHlsAudioFile.getPlayIndex() : i;
    }

    public boolean isClose() {
        return this.isStop;
    }

    public void notifyDownload() {
        if (this.isWaiting) {
            synchronized (this.synWaitObject) {
                this.isWaiting = false;
                this.synWaitObject.notify();
            }
        }
    }

    public void resetIndex(LinkedBlockingQueue<BufferItem> linkedBlockingQueue) {
        synchronized (this.synKey) {
            Logger.log(TAG, "resetIndex bq.size()0:" + linkedBlockingQueue.size());
            this.isResetIndex = true;
            this.fromIndex = this.mHlsAudioFile.getPlayIndex();
            if (this.buffItemQueue != null) {
                this.buffItemQueue.clear();
            }
            this.buffItemQueue = linkedBlockingQueue;
            Logger.log(TAG, "resetIndex bq.size()1:" + linkedBlockingQueue.size());
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(-19);
        this.fromIndex = this.mHlsAudioFile.getPlayIndex();
        this.isResetIndex = true;
        while (!this.isStop && MD5.getFileNameMd5(this.mXMediaplayerJNI.getPlayUrl()).equals(MD5.getFileNameMd5(this.mSourceUrl))) {
            synchronized (this.synKey) {
                if (this.isResetIndex) {
                    Logger.log(TAG, "resetIndex isResetIndex buffItemQueue.size():" + this.buffItemQueue.size());
                    this.isResetIndex = false;
                    this.curIndex = this.fromIndex;
                    this.mDownloadIndex = this.fromIndex;
                }
            }
            if (this.curIndex >= this.mHlsAudioFile.getPlayUrlsLength() && !this.mXMediaplayerJNI.getAudioType().equals(XMediaplayerJNI.AudioType.HLS_FILE) && !this.isResetIndex) {
                break;
            }
            if (this.mDownloadIndex < this.curIndex) {
                this.mDownloadIndex = this.curIndex;
            }
            int i = XMediaPlayerConstants.DOWNLOAD_QUEUE_SIZE - 3;
            while (this.mDownloadIndex - this.curIndex < i && this.buffItemQueue.size() >= 3 && !this.isStop && this.mDownloadIndex < this.mHlsAudioFile.getPlayUrlsLength() && !this.isResetIndex) {
                String playUrl = this.mHlsAudioFile.getPlayUrl(this.mDownloadIndex);
                if (new HlsDownloadThread(playUrl, null).download() > 0) {
                    Logger.log(TAG, "url:" + playUrl + " downloadIndex:" + this.mDownloadIndex + "下载并且缓存成功1");
                    this.mDownloadIndex = this.mDownloadIndex + 1;
                    this.mXMediaplayerJNI.onBufferingUpdateInner(this.mHlsAudioFile.getCachePercent());
                } else {
                    Logger.log(TAG, "url:" + playUrl + " downloadIndex:" + this.mDownloadIndex + "下载失败error1");
                }
                Logger.log(TAG, "getCachePercent percent mDownloadIndex:" + this.mDownloadIndex);
            }
            if (!this.isStop) {
                if (!this.isResetIndex) {
                    String playUrl2 = this.mHlsAudioFile.getPlayUrl(this.curIndex);
                    Logger.log(TAG, "HlsReadThread downUrl0:" + playUrl2 + "    cacheIndex:" + this.curIndex + "getPlayUrlsLength:" + this.mHlsAudioFile.getPlayUrlsLength());
                    if (playUrl2 != null) {
                        BufferItem bufferItem = new BufferItem();
                        bufferItem.setIndex(this.curIndex);
                        if (new HlsDownloadThread(playUrl2, bufferItem).download() <= 0) {
                            Logger.log(TAG, "url:" + playUrl2 + " curIndex:" + this.curIndex + "下载并且缓存失败2");
                            break;
                        }
                        putItem(bufferItem);
                        Logger.log(TAG, "url:" + playUrl2 + " curIndex:" + this.curIndex + "下载并且缓存成功2");
                        this.curIndex = this.curIndex + 1;
                        this.mXMediaplayerJNI.onBufferingUpdateInner(this.mHlsAudioFile.getCachePercent());
                    } else {
                        if (!this.mXMediaplayerJNI.getAudioType().equals(XMediaplayerJNI.AudioType.HLS_FILE)) {
                            break;
                        }
                        synchronized (this.synWaitObject) {
                            this.isWaiting = true;
                            try {
                                this.synWaitObject.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        BufferItem bufferItem2 = new BufferItem();
        bufferItem2.setIndex(this.curIndex);
        bufferItem2.fails = true;
        putItem(bufferItem2);
        this.isStop = true;
        Logger.log(XMediaplayerJNI.Tag, "HlsReadThread isStop:" + this.isStop + "cacheIndex:" + this.curIndex);
    }
}

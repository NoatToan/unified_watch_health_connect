package com.ximalaya.ting.android.player;

import com.ximalaya.ting.android.player.model.JNIDataModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public class HlsAudioFile {
    private LinkedBlockingQueue<BufferItem> buffItemQueue;
    private HlsReadThread mHlsReadThread;
    private String mPlayUrl;
    private String mSourceUrl;
    private XMediaplayerJNI mXMediaplayerJNI;
    private List<String> mHlsPlayUrls = new ArrayList();
    private volatile boolean isPollData = false;
    private boolean isRunning = false;
    private int lastIndex = -1;

    public HlsAudioFile(String str, XMediaplayerJNI xMediaplayerJNI) {
        this.mSourceUrl = str;
        this.mXMediaplayerJNI = xMediaplayerJNI;
    }

    private void startChacheFile() {
        HlsReadThread hlsReadThread = this.mHlsReadThread;
        if (hlsReadThread == null || hlsReadThread.isClose()) {
            this.buffItemQueue = new LinkedBlockingQueue<>(3);
            this.mHlsReadThread = new HlsReadThread(this, this.mXMediaplayerJNI, this.mSourceUrl, this.buffItemQueue);
            this.isRunning = false;
        }
        if (!this.mHlsReadThread.isAlive() && !this.isRunning && getPlayIndex() >= 0) {
            this.isRunning = true;
            this.mHlsReadThread.start();
        }
        this.mHlsReadThread.notifyDownload();
    }

    public void addPlayUrls(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.mHlsPlayUrls.addAll(Arrays.asList(strArr));
        startChacheFile();
    }

    public int getCachePercent() {
        if (this.mHlsReadThread == null || getPlayUrlsLength() == 0) {
            return 0;
        }
        Logger.log(XMediaplayerJNI.Tag, "DownloadThread hls mHlsReadThread.getCacheIndex():" + this.mHlsReadThread.getCacheIndex() + "getPlayUrlsLength():" + getPlayUrlsLength());
        int cacheIndex = (int) ((((float) (this.mHlsReadThread.getCacheIndex() + (-1))) / ((float) getPlayUrlsLength())) * 100.0f);
        if (cacheIndex < 0) {
            return 0;
        }
        return cacheIndex;
    }

    public List<String> getHlsPlayUrls() {
        return this.mHlsPlayUrls;
    }

    public int getPlayIndex() {
        String str = this.mPlayUrl;
        if (str == null) {
            return -1;
        }
        return this.mHlsPlayUrls.indexOf(str);
    }

    public String getPlayUrl() {
        return this.mPlayUrl;
    }

    public int getPlayUrlsLength() {
        return this.mHlsPlayUrls.size();
    }

    public long readData(JNIDataModel jNIDataModel) {
        boolean z;
        Logger.log(XMediaplayerJNI.Tag, "hls readData callback:" + System.currentTimeMillis());
        this.mPlayUrl = jNIDataModel.filePath;
        if (this.mXMediaplayerJNI.getAudioType().equals(XMediaplayerJNI.AudioType.HLS_FILE)) {
            z = false;
        } else {
            int playIndex = getPlayIndex();
            Logger.log(XMediaplayerJNI.Tag, "HlsReadThread notify555 curIndex:" + playIndex + "lastIndex:" + this.lastIndex);
            z = this.lastIndex + 1 != playIndex;
            this.lastIndex = playIndex;
        }
        startChacheFile();
        if (z) {
            LinkedBlockingQueue<BufferItem> linkedBlockingQueue = new LinkedBlockingQueue<>(3);
            this.buffItemQueue = linkedBlockingQueue;
            this.mHlsReadThread.resetIndex(linkedBlockingQueue);
        }
        try {
            this.isPollData = true;
            BufferItem bufferItemPoll = this.buffItemQueue.poll(30000L, TimeUnit.MILLISECONDS);
            this.isPollData = false;
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 3");
            if (bufferItemPoll != null && !bufferItemPoll.fails) {
                byte[] bArrArray = bufferItemPoll.getBuffer().array();
                jNIDataModel.buf = bArrArray;
                long length = bArrArray.length;
                jNIDataModel.fileSize = length;
                return length;
            }
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null");
            release();
            return -1L;
        } catch (InterruptedException unused) {
            release();
            return -1L;
        }
    }

    public void release() {
        HlsReadThread hlsReadThread = this.mHlsReadThread;
        if (hlsReadThread != null) {
            hlsReadThread.close();
        }
        LinkedBlockingQueue<BufferItem> linkedBlockingQueue = this.buffItemQueue;
        if (linkedBlockingQueue != null) {
            if (linkedBlockingQueue.size() != 0 || !this.isPollData) {
                this.buffItemQueue.clear();
                return;
            }
            BufferItem bufferItem = new BufferItem();
            bufferItem.fails = true;
            bufferItem.errorCode = 500;
            this.buffItemQueue.add(bufferItem);
        }
    }

    public void setPlayUrl(String str) {
        this.mPlayUrl = str;
    }

    public String getPlayUrl(int i) {
        if (i < this.mHlsPlayUrls.size()) {
            return this.mHlsPlayUrls.get(i);
        }
        return null;
    }
}

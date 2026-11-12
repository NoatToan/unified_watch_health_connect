package com.ximalaya.ting.android.player.liveflv;

import com.ximalaya.ting.android.player.BufferItem;
import com.ximalaya.ting.android.player.Logger;
import com.ximalaya.ting.android.player.PlayerUtil;
import com.ximalaya.ting.android.player.XMediaplayerJNI;
import com.ximalaya.ting.android.player.model.JNIDataModel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public class FlvLiveAudioFile {
    private FlvLiveReadThread mHlsReadThread;
    private XMediaplayerJNI mXMediaplayerJNI;
    private int LastUseLessBlockCode = 800;
    private volatile boolean isPollData = false;
    private volatile boolean isFirst = true;
    private int mBufNumForStart = 100;
    private Object waitObject = new Object();
    private boolean isRunning = false;
    private LinkedBlockingQueue<BufferItem> buffItemQueue = new LinkedBlockingQueue<>(1024);

    public FlvLiveAudioFile(XMediaplayerJNI xMediaplayerJNI) {
        this.mXMediaplayerJNI = xMediaplayerJNI;
    }

    private void startChacheFile() {
        FlvLiveReadThread flvLiveReadThread = this.mHlsReadThread;
        if (flvLiveReadThread == null || flvLiveReadThread.isClose()) {
            this.buffItemQueue = new LinkedBlockingQueue<>(1024);
            FlvLiveReadThread flvLiveReadThread2 = this.mHlsReadThread;
            if (flvLiveReadThread2 != null) {
                flvLiveReadThread2.setFlvDataCallbackIsEnable(false);
            }
            XMediaplayerJNI xMediaplayerJNI = this.mXMediaplayerJNI;
            this.mHlsReadThread = new FlvLiveReadThread(xMediaplayerJNI, xMediaplayerJNI.getPlayUrl(), this.buffItemQueue);
            this.isRunning = false;
            this.isFirst = true;
        }
        if (this.mHlsReadThread.isAlive() || this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.mHlsReadThread.start();
    }

    public int readData(JNIDataModel jNIDataModel) {
        Logger.log(XMediaplayerJNI.Tag, "FlvLiveAudioFile readData start time:" + System.currentTimeMillis());
        startChacheFile();
        BufferItem bufferItemPoll = null;
        try {
            if (this.buffItemQueue.size() > 0 || PlayerUtil.isConnectNetwork(this.mXMediaplayerJNI.mContext)) {
                Logger.log(XMediaplayerJNI.Tag, "flv readDataT wait");
                this.isPollData = true;
                bufferItemPoll = this.buffItemQueue.poll(20000L, TimeUnit.MILLISECONDS);
                this.isPollData = false;
                Logger.log(XMediaplayerJNI.Tag, "flv readDataT wait end");
            }
            if (bufferItemPoll != null && bufferItemPoll.errorCode == this.LastUseLessBlockCode) {
                Logger.log(XMediaplayerJNI.Tag, "flv dataStreamInputFuncCallBackT releae last data");
                release();
                return -2;
            }
            Logger.log(XMediaplayerJNI.Tag, "flv dataStreamInputFuncCallBackT 3");
            if (bufferItemPoll != null && !bufferItemPoll.fails) {
                if (bufferItemPoll.isLastChunk()) {
                    release();
                    return 0;
                }
                byte[] bArrArray = bufferItemPoll.getBuffer().array();
                jNIDataModel.buf = bArrArray;
                jNIDataModel.fileSize = bArrArray.length;
                jNIDataModel.bufSize = bArrArray.length;
                Logger.log(XMediaplayerJNI.Tag, "flv buf fileSize:" + jNIDataModel.fileSize);
                return jNIDataModel.buf.length;
            }
            Logger.log(XMediaplayerJNI.Tag, "flv dataStreamInputFuncCallBackT timeout item null");
            release();
            return -1;
        } catch (InterruptedException unused) {
            release();
            return -1;
        }
    }

    public void release() {
        Logger.log(XMediaplayerJNI.Tag, "flv FlvLiveFile relase readDataT");
        this.isRunning = false;
        FlvLiveReadThread flvLiveReadThread = this.mHlsReadThread;
        if (flvLiveReadThread != null) {
            flvLiveReadThread.close();
        }
        LinkedBlockingQueue<BufferItem> linkedBlockingQueue = this.buffItemQueue;
        if (linkedBlockingQueue != null) {
            int size = linkedBlockingQueue.size();
            Logger.log(XMediaplayerJNI.Tag, "flv readDataT relase isPollData:" + this.isPollData + " size:" + size);
            if (size != 0 || !this.isPollData) {
                Logger.log(XMediaplayerJNI.Tag, "flv readDataT relase clear item start");
                this.buffItemQueue.clear();
                Logger.log(XMediaplayerJNI.Tag, "flv readDataT relase clear item end");
            } else {
                Logger.log(XMediaplayerJNI.Tag, "flv readDataT relase put last buf item start");
                BufferItem bufferItem = new BufferItem();
                bufferItem.fails = true;
                bufferItem.errorCode = this.LastUseLessBlockCode;
                this.buffItemQueue.add(bufferItem);
                Logger.log(XMediaplayerJNI.Tag, "flv readDataT relase put last buf item end");
            }
        }
    }
}

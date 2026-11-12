package com.ximalaya.ting.android.player.liveflv;

import com.ximalaya.ting.android.player.BufferItem;
import com.ximalaya.ting.android.player.Logger;
import com.ximalaya.ting.android.player.XMediaplayerJNI;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes22.dex */
public class FlvLiveReadThread extends Thread {
    private static final String TAG = "dl_hls";
    private volatile LinkedBlockingQueue<BufferItem> buffItemQueue;
    private boolean isFlvDataCallbackEnable;
    private boolean isLiveDelay;
    private volatile boolean isStop;
    private FlvAacParser mFlvStream;
    public long mLimitConnectTime;
    public long mLimitDownloadSpeed;
    private String mSourceUrl;
    private XMediaplayerJNI mXMediaplayerJNI;

    public FlvLiveReadThread(XMediaplayerJNI xMediaplayerJNI, String str, LinkedBlockingQueue<BufferItem> linkedBlockingQueue) {
        super("FlvLiveReadThreadForPlayer");
        this.isStop = false;
        this.isFlvDataCallbackEnable = true;
        this.isLiveDelay = false;
        this.mXMediaplayerJNI = xMediaplayerJNI;
        this.mSourceUrl = str;
        this.buffItemQueue = linkedBlockingQueue;
        this.isStop = false;
        setPriority(10);
    }

    private void putItem(BufferItem bufferItem) {
        Logger.log(TAG, "putItem buffItemQueue.size()0:" + this.buffItemQueue.size());
        if (this.buffItemQueue.remainingCapacity() < 5) {
            this.isLiveDelay = true;
        } else {
            this.isLiveDelay = false;
        }
        try {
            this.buffItemQueue.put(bufferItem);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Logger.log(TAG, "putItem buffItemQueue.size()1:" + this.buffItemQueue.size());
    }

    public void close() {
        this.isStop = true;
        if (this.buffItemQueue != null) {
            this.buffItemQueue.clear();
        }
        interrupt();
        Logger.log(XMediaplayerJNI.Tag, "HlsReadThread hls readData close");
    }

    public boolean isClose() {
        return this.isStop;
    }

    public boolean isLiveDelay() {
        return this.isLiveDelay;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22211. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instruction units count: 2221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ximalaya.ting.android.player.liveflv.FlvLiveReadThread.run():void");
    }

    public void setFlvDataCallbackIsEnable(boolean z) {
        this.isFlvDataCallbackEnable = z;
        FlvAacParser flvAacParser = this.mFlvStream;
        if (flvAacParser != null) {
            flvAacParser.setFlvDataCallbackIsEnable(z);
        }
    }
}

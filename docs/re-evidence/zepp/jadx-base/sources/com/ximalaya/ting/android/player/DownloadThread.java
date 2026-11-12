package com.ximalaya.ting.android.player;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class DownloadThread {
    private static final String TAG = "dl_mp3";
    public static long downloadedSize;
    private ByteBuffer bBuffer;
    private AudioFile mFile;
    private int mIndex;
    private long mLimitConnectTime;
    private long mLimitDownloadSpeed;
    private boolean stopFlag;

    public DownloadThread(AudioFile audioFile, int i) {
        Logger.log(TAG, "======================DownloadThread Constructor(" + i + ")");
        this.mFile = audioFile;
        this.mIndex = i;
        this.bBuffer = ByteBuffer.allocate(65536);
        this.stopFlag = false;
    }

    public void close() {
        this.stopFlag = true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 57821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public int download() {
        /*
            Method dump skipped, instruction units count: 5782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ximalaya.ting.android.player.DownloadThread.download():int");
    }
}

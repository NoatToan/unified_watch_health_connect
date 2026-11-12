package com.ximalaya.ting.android.player;

import android.os.Process;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes22.dex */
public class ReadThread extends Thread {
    private static final String TAG = "dl_mp3";
    private volatile LinkedBlockingQueue<BufferItem> buffItemQueue;
    private volatile int curIndex;
    private DownloadThread currentDownload;
    private volatile int fromIndex;
    private volatile boolean isResetIndex;
    private int mDownloadIndex;
    private AudioFile mFile;
    private AudioFile mPreBufferAudioFile;
    private String mPreBufferUrl;
    private XMediaplayerJNI mXMediaplayerJNI;
    private int preLoadIndex;
    private volatile boolean stopFlag;
    private volatile Object synKey;

    public ReadThread(AudioFile audioFile, int i, LinkedBlockingQueue<BufferItem> linkedBlockingQueue, XMediaplayerJNI xMediaplayerJNI) {
        super("ReadThreadForPlayer");
        this.curIndex = 0;
        this.synKey = new Object();
        this.preLoadIndex = 0;
        this.mPreBufferUrl = null;
        setPriority(10);
        this.mFile = audioFile;
        this.fromIndex = i;
        this.buffItemQueue = linkedBlockingQueue;
        this.stopFlag = false;
        this.isResetIndex = true;
        this.mXMediaplayerJNI = xMediaplayerJNI;
    }

    private void putItem(BufferItem bufferItem) throws InterruptedException {
        if (this.isResetIndex) {
            Logger.log(TAG, "resetIndex count5:" + this.buffItemQueue.size());
            return;
        }
        Logger.log(TAG, "putItem url:" + this.mFile.getUrl() + " item Index:" + bufferItem.getIndex());
        StringBuilder sb = new StringBuilder();
        sb.append("resetIndex count3 putItem:");
        sb.append(this.buffItemQueue.size());
        Logger.log(TAG, sb.toString());
        this.buffItemQueue.put(bufferItem);
        Logger.log(TAG, "resetIndex count4 putItem:" + this.buffItemQueue.size());
    }

    private BufferItem readChunk(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(65536);
        try {
            if (this.mFile.readChunkData(i, 65536, byteBufferAllocate.array(), 0) != 65536) {
                return null;
            }
            BufferItem bufferItem = new BufferItem();
            bufferItem.setBuffer(byteBufferAllocate);
            bufferItem.setIndex(i);
            return bufferItem;
        } catch (IOException unused) {
            return null;
        }
    }

    public void close() {
        Logger.log(XMediaplayerJNI.Tag, "mReadThread close" + toString());
        this.stopFlag = true;
        this.buffItemQueue.clear();
        DownloadThread downloadThread = this.currentDownload;
        if (downloadThread != null) {
            downloadThread.close();
        }
        this.mXMediaplayerJNI = null;
    }

    public AudioFile getAudioFile() {
        return this.mFile;
    }

    public int getCacheIndex() {
        return this.mDownloadIndex;
    }

    public int getCachePercent() {
        int chargeDataRealLength = this.mXMediaplayerJNI.getChargeDataRealLength() / 65536;
        if (chargeDataRealLength == 0) {
            chargeDataRealLength = this.mFile.getFileInfo().getComChunkNum();
        }
        int i = (int) (((this.mDownloadIndex - 1) / chargeDataRealLength) * 100.0f);
        Logger.log(TAG, "getCachePercent percent:" + i + " mDownloadIndex:" + this.mDownloadIndex + "getComChunkNum:" + this.mFile.getFileInfo().getComChunkNum());
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public boolean isClosed() {
        return this.stopFlag;
    }

    public boolean resetIndex(int i, LinkedBlockingQueue<BufferItem> linkedBlockingQueue) {
        if (this.buffItemQueue == null || this.buffItemQueue.size() <= 0) {
            Logger.log(XMediaplayerJNI.Tag, "resetIndex count0-0 buffItemQueue == null");
        } else {
            Logger.log(XMediaplayerJNI.Tag, "resetIndex count0-0:" + this.buffItemQueue.size());
            this.buffItemQueue.clear();
            Logger.log(XMediaplayerJNI.Tag, "resetIndex count0-1:" + this.buffItemQueue.size());
        }
        synchronized (this.synKey) {
            if (isClosed()) {
                return false;
            }
            Logger.log(XMediaplayerJNI.Tag, "resetIndex count0:" + linkedBlockingQueue.size());
            this.isResetIndex = true;
            this.fromIndex = i;
            if (this.buffItemQueue.size() > 0) {
                this.buffItemQueue.clear();
            }
            this.buffItemQueue = linkedBlockingQueue;
            Logger.log(XMediaplayerJNI.Tag, "resetIndex count1:" + linkedBlockingQueue.size());
            return !isClosed();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i;
        Process.setThreadPriority(-19);
        Logger.log(TAG, "======================ReadThread run() start");
        while (!this.stopFlag && MD5.getFileNameMd5(this.mXMediaplayerJNI.getPlayUrl()).equals(MD5.getFileNameMd5(this.mFile.getFileInfo().getUrl()))) {
            try {
                Logger.log(TAG, "======================ReadThread start while(" + this.curIndex + ":" + this.mFile.getFileInfo().getComChunkNum() + ") stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex);
                FileDesc fileInfo = this.mFile.getFileInfo();
                if (!fileInfo.isValid()) {
                    throw new Exception("fileDes is InValid");
                }
                synchronized (this.synKey) {
                    Logger.log(TAG, "resetIndex count6:" + this.buffItemQueue.size() + " stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex);
                    if (this.isResetIndex) {
                        this.isResetIndex = false;
                        this.curIndex = this.fromIndex;
                        this.mDownloadIndex = this.fromIndex;
                    }
                    Logger.log(TAG, "resetIndex count7:" + this.buffItemQueue.size() + " stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex);
                    StringBuilder sb = new StringBuilder();
                    sb.append("before put last item isResetIndex:");
                    sb.append(this.isResetIndex);
                    Logger.log(TAG, sb.toString());
                    if (this.curIndex >= fileInfo.getComChunkNum()) {
                        BufferItem bufferItem = new BufferItem();
                        bufferItem.setBuffer(ByteBuffer.allocate(65536));
                        bufferItem.setIndex(this.curIndex);
                        bufferItem.setLastChunk();
                        Logger.log(TAG, "putLastChunk stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex + " getComChunkNum" + fileInfo.getComChunkNum());
                        try {
                            putItem(bufferItem);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        this.stopFlag = true;
                        Logger.log(TAG, "put LastChunk and close read thread");
                        break;
                    }
                    if (this.mDownloadIndex < this.curIndex) {
                        this.mDownloadIndex = this.curIndex;
                    }
                    int i2 = XMediaPlayerConstants.DOWNLOAD_QUEUE_SIZE - 3;
                    while (this.mDownloadIndex - this.curIndex < i2 && this.buffItemQueue.size() >= 3 && !this.stopFlag && this.mDownloadIndex < fileInfo.getComChunkNum() && !this.isResetIndex) {
                        String str = this.mPreBufferUrl;
                        if (str != null && !str.equals(this.mFile.getUrl())) {
                            if (this.mPreBufferAudioFile == null) {
                                try {
                                    this.mPreBufferAudioFile = AudioFile.getAudioFile(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY, this.mPreBufferUrl);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    this.mPreBufferAudioFile.getFileInfo().valid = false;
                                }
                            }
                            if (this.mPreBufferAudioFile.getFileInfo().isValid() && (i = this.preLoadIndex) < 30 && i < this.mPreBufferAudioFile.getFileInfo().getComChunkNum() && !this.stopFlag && !this.isResetIndex) {
                                if (!this.mPreBufferAudioFile.getFileInfo().isChunkDownloaded(this.preLoadIndex)) {
                                    new DownloadThread(this.mPreBufferAudioFile, this.preLoadIndex).download();
                                    if (this.mPreBufferAudioFile.getbBuffer() != null) {
                                        AudioFile audioFile = this.mPreBufferAudioFile;
                                        audioFile.writeChunkData(this.preLoadIndex, audioFile.getbBuffer().array(), 0, this.mPreBufferAudioFile.getbBuffer().array().length);
                                        this.mPreBufferAudioFile.setbBuffer(null);
                                        Logger.log(TAG, "预缓冲 url_0:" + this.mPreBufferAudioFile.getUrl() + " preLoadIndex:" + this.preLoadIndex + "下载并且缓存成功");
                                    } else {
                                        Logger.log(TAG, "预缓冲 url_0:" + this.mPreBufferAudioFile.getUrl() + " preLoadIndex:" + this.preLoadIndex + "失败");
                                    }
                                }
                                if (this.preLoadIndex == 0) {
                                    int comChunkNum = this.mPreBufferAudioFile.getFileInfo().getComChunkNum() - 1;
                                    if (!this.mPreBufferAudioFile.getFileInfo().isChunkDownloaded(comChunkNum)) {
                                        new DownloadThread(this.mPreBufferAudioFile, comChunkNum).download();
                                        if (this.mPreBufferAudioFile.getbBuffer() != null) {
                                            AudioFile audioFile2 = this.mPreBufferAudioFile;
                                            audioFile2.writeChunkData(comChunkNum, audioFile2.getbBuffer().array(), 0, this.mPreBufferAudioFile.getbBuffer().array().length);
                                            this.mPreBufferAudioFile.setbBuffer(null);
                                            Logger.log(TAG, "预缓冲 url_0:" + this.mPreBufferAudioFile.getUrl() + " lastIndex:" + comChunkNum + "下载并且缓存成功");
                                        } else {
                                            Logger.log(TAG, "预缓冲 url_0:" + this.mPreBufferAudioFile.getUrl() + " lastIndex:" + comChunkNum + "失败");
                                        }
                                    }
                                }
                                this.preLoadIndex++;
                            }
                        }
                        boolean zIsChunkDownloaded = this.mFile.getFileInfo().isChunkDownloaded(this.mDownloadIndex);
                        this.mXMediaplayerJNI.onBufferingUpdateInner(getCachePercent());
                        if (zIsChunkDownloaded) {
                            this.mDownloadIndex++;
                        } else {
                            if (new DownloadThread(this.mFile, this.mDownloadIndex).download() == 200) {
                                throw new IOException();
                            }
                            if (this.mFile.getbBuffer() == null) {
                                Logger.log(TAG, "url:" + this.mFile.getUrl() + " downloadIndex:" + this.mDownloadIndex + "下载失败error");
                                break;
                            }
                            AudioFile audioFile3 = this.mFile;
                            audioFile3.writeChunkData(this.mDownloadIndex, audioFile3.getbBuffer().array(), 0, this.mFile.getbBuffer().array().length);
                            this.mFile.setbBuffer(null);
                            Logger.log(TAG, "url:" + this.mFile.getUrl() + " downloadIndex:" + this.mDownloadIndex + "下载并且缓存成功");
                            this.mDownloadIndex = this.mDownloadIndex + 1;
                        }
                        Logger.log(TAG, "getCachePercent percent mDownloadIndex0:" + this.mDownloadIndex);
                    }
                    if (this.stopFlag) {
                        Logger.log(TAG, "fileDesc not Valid stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex);
                        break;
                    }
                    if (this.isResetIndex) {
                        Logger.log(TAG, "fileDesc not Valid stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex + " isResetIndex:" + this.isResetIndex);
                    } else {
                        this.mXMediaplayerJNI.onBufferingUpdateInner(getCachePercent());
                        Logger.log(TAG, "开始获取分段数据：url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex);
                        if (this.mFile.getFileInfo().isChunkDownloaded(this.curIndex)) {
                            Logger.log(TAG, "url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex + "缓存命中成功");
                            BufferItem chunk = readChunk(this.curIndex);
                            if (chunk != null) {
                                Logger.log(TAG, "url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex + "缓存获取成功");
                                putItem(chunk);
                                this.curIndex = this.curIndex + 1;
                            } else {
                                String str2 = "url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex + "缓存获取失败error";
                                Logger.log(TAG, str2);
                                DownloadThread downloadThread = new DownloadThread(this.mFile, this.curIndex);
                                this.currentDownload = downloadThread;
                                downloadThread.download();
                                if (this.mFile.getbBuffer() == null) {
                                    throw new IOException(str2 + " and Download fail");
                                }
                                BufferItem bufferItem2 = new BufferItem();
                                bufferItem2.setBuffer(this.mFile.getbBuffer());
                                bufferItem2.setIndex(this.curIndex);
                                putItem(bufferItem2);
                                this.mFile.setbBuffer(null);
                                this.curIndex++;
                            }
                        } else {
                            Logger.log(TAG, "url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex + "缓存命中失败");
                            DownloadThread downloadThread2 = new DownloadThread(this.mFile, this.curIndex);
                            this.currentDownload = downloadThread2;
                            if (downloadThread2.download() == 200) {
                                throw new IOException();
                            }
                            if (this.mFile.getbBuffer() == null) {
                                String str3 = "url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex + "下载失败error";
                                Logger.log(TAG, str3);
                                throw new IOException(str3);
                            }
                            BufferItem bufferItem3 = new BufferItem();
                            bufferItem3.setBuffer(this.mFile.getbBuffer());
                            bufferItem3.setIndex(this.curIndex);
                            putItem(bufferItem3);
                            this.mFile.writeChunkData(this.curIndex, this.mFile.getbBuffer().array(), 0, this.mFile.getbBuffer().array().length);
                            this.mFile.setbBuffer(null);
                            Logger.log(TAG, "url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex + "下载并且缓存成功");
                            this.curIndex = this.curIndex + 1;
                        }
                        Logger.log(TAG, "结束获取分段数据：url:" + this.mFile.getUrl() + " curIndex:" + this.curIndex);
                        Logger.log(TAG, "======================ReadThread end while(" + this.curIndex + ":" + this.mFile.getFileInfo().getComChunkNum() + ") stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex);
                    }
                }
            } catch (Exception e3) {
                Logger.log(TAG, "ReadThread Exception:" + e3.getMessage());
            }
        }
        BufferItem bufferItem4 = new BufferItem();
        bufferItem4.fails = true;
        Logger.log(TAG, "exception0 buffItemQueue.size:" + this.buffItemQueue.size());
        try {
            this.buffItemQueue.put(bufferItem4);
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        }
        Logger.log(TAG, "exception1 buffItemQueue.size:" + this.buffItemQueue.size());
        Logger.log(TAG, "exception2 stopFlag:" + this.stopFlag + " curIndex:" + this.curIndex);
        this.stopFlag = true;
        Logger.log(TAG, "======================ReadThread run() end");
    }

    public void setPreBufferUrl(String str) {
        this.mPreBufferUrl = str;
    }

    public ReadThread(AudioFile audioFile, int i, LinkedBlockingQueue<BufferItem> linkedBlockingQueue, XMediaplayerJNI xMediaplayerJNI, String str) {
        super("ReadThreadForPlayer");
        this.curIndex = 0;
        this.synKey = new Object();
        this.preLoadIndex = 0;
        this.mPreBufferUrl = null;
        setPriority(10);
        this.mFile = audioFile;
        this.fromIndex = i;
        this.buffItemQueue = linkedBlockingQueue;
        this.stopFlag = false;
        this.isResetIndex = true;
        this.mXMediaplayerJNI = xMediaplayerJNI;
        this.mPreBufferUrl = str;
    }
}

package com.ximalaya.ting.android.player;

import android.util.Base64;
import com.ximalaya.ting.android.player.model.JNIDataModel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public class AudioFileRequestHandler {
    public static int RELEASE_TYPE_IO_ERROR = -1;
    public static int RELEASE_TYPE_RESET = -2;
    public static char[] encryFactor = {'x', 'm', 'l', 'y'};
    private LinkedBlockingQueue<BufferItem> buffItemQueue;
    private boolean isLocalServiceSource;
    private volatile boolean isPollData;
    private String mPreBufferUrl;
    private ReadThread mReadThread;
    private volatile int mReleaseType;
    private XMediaplayerJNI mXMediaplayerJNI;
    private int normalReleaseCode;

    public AudioFileRequestHandler(XMediaplayerJNI xMediaplayerJNI, boolean z) {
        this.mPreBufferUrl = null;
        this.isPollData = false;
        this.normalReleaseCode = 1000;
        this.mReleaseType = 0;
        this.mXMediaplayerJNI = xMediaplayerJNI;
        this.mReleaseType = 0;
        this.isLocalServiceSource = z;
    }

    private static byte[] decryptData(byte[] bArr) {
        if (bArr != null && bArr.length >= MediadataCrytoUtil.ENCRYPT_DATA_LENGTH) {
            for (int i = 0; i < 1024; i++) {
                bArr[i] = (byte) (bArr[i] ^ encryFactor[i % 4]);
            }
        }
        return bArr;
    }

    private synchronized int readDataFromSD(String str, int i, byte[] bArr) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        long length = randomAccessFile.length();
        int i10 = 0;
        if (str.endsWith(XMediaPlayerConstants.XM_SUFFIX)) {
            randomAccessFile.seek(12);
            int i11 = randomAccessFile.readInt();
            this.mXMediaplayerJNI.setCurFileSize(length - ((long) i11));
            randomAccessFile.seek(i + i11);
            do {
                i9 = randomAccessFile.read(bArr, i10, bArr.length - i10);
                i10 += i9;
            } while (i9 > 0);
            randomAccessFile.close();
            return i10;
        }
        if (str.endsWith(XMediaPlayerConstants.X2M_SUFFIX) && i < (i6 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH) && length >= i6) {
            this.mXMediaplayerJNI.setCurFileSize(length);
            randomAccessFile.seek(0L);
            int i12 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH;
            byte[] bArr2 = new byte[i12];
            int i13 = 0;
            do {
                i7 = randomAccessFile.read(bArr2, i13, i12 - i13);
                i13 += i7;
            } while (i7 > 0);
            byte[] bArrDecryptData = MediadataCrytoUtil.getInstance().decryptData(bArr2);
            int i14 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH - i;
            if (bArr.length <= i14) {
                while (i10 < bArr.length) {
                    bArr[i10] = bArrDecryptData[i + i10];
                    i10++;
                }
                randomAccessFile.close();
                return bArr.length;
            }
            while (i10 < i14) {
                bArr[i10] = bArrDecryptData[i + i10];
                i10++;
            }
            randomAccessFile.seek(MediadataCrytoUtil.ENCRYPT_DATA_LENGTH);
            do {
                i8 = randomAccessFile.read(bArr, i14, bArr.length - i14);
                i14 += i8;
            } while (i8 > 0);
            randomAccessFile.close();
            return i14;
        }
        if (!str.endsWith(new String(Base64.decode("Lnhtd2lmaQ==", 0))) || i >= (i3 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH) || length < i3) {
            this.mXMediaplayerJNI.setCurFileSize(length);
            randomAccessFile.seek(i);
            do {
                i2 = randomAccessFile.read(bArr, i10, bArr.length - i10);
                i10 += i2;
            } while (i2 > 0);
            randomAccessFile.close();
            return i10;
        }
        this.mXMediaplayerJNI.setCurFileSize(length);
        randomAccessFile.seek(0L);
        int i15 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH;
        byte[] bArr3 = new byte[i15];
        int i16 = 0;
        do {
            i4 = randomAccessFile.read(bArr3, i16, i15 - i16);
            i16 += i4;
        } while (i4 > 0);
        byte[] bArrDecryptData2 = decryptData(bArr3);
        int i17 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH - i;
        if (bArr.length <= i17) {
            while (i10 < bArr.length) {
                bArr[i10] = bArrDecryptData2[i + i10];
                i10++;
            }
            randomAccessFile.close();
            return bArr.length;
        }
        while (i10 < i17) {
            bArr[i10] = bArrDecryptData2[i + i10];
            i10++;
        }
        randomAccessFile.seek(MediadataCrytoUtil.ENCRYPT_DATA_LENGTH);
        do {
            i5 = randomAccessFile.read(bArr, i17, bArr.length - i17);
            i17 += i5;
        } while (i5 > 0);
        randomAccessFile.close();
        return i17;
    }

    private boolean resetLoadDataPosition(int i, JNIDataModel jNIDataModel) {
        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT resetLoadDataPosition");
        this.buffItemQueue = new LinkedBlockingQueue<>(3);
        ReadThread readThread = this.mReadThread;
        if (readThread != null && !readThread.isClosed()) {
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT resetLoadDataPosition1");
            long comFileLen = this.mReadThread.getAudioFile().getFileInfo().getComFileLen();
            jNIDataModel.fileSize = comFileLen;
            this.mXMediaplayerJNI.setCurFileSize(comFileLen);
            if (this.mReadThread.resetIndex(i / 65536, this.buffItemQueue)) {
                return true;
            }
        }
        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT resetLoadDataPosition0");
        try {
            AudioFile audioFile = AudioFile.getAudioFile(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY, this.mXMediaplayerJNI.getPlayUrl());
            if (audioFile == null || !audioFile.getFileInfo().isValid()) {
                Logger.log(XMediaplayerJNI.Tag, "mFile.getFileInfo().inValid()");
                return false;
            }
            ReadThread readThread2 = this.mReadThread;
            if (readThread2 != null) {
                readThread2.close();
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT mReadThread.close" + this.mReadThread.toString());
            }
            if (!audioFile.getFileInfo().isValid()) {
                return false;
            }
            long comFileLen2 = audioFile.getFileInfo().getComFileLen();
            jNIDataModel.fileSize = comFileLen2;
            this.mXMediaplayerJNI.setCurFileSize(comFileLen2);
            int i2 = i / 65536;
            if (this.mPreBufferUrl == null) {
                this.mReadThread = new ReadThread(audioFile, i2, this.buffItemQueue, this.mXMediaplayerJNI);
            } else {
                this.mReadThread = new ReadThread(audioFile, i2, this.buffItemQueue, this.mXMediaplayerJNI, this.mPreBufferUrl);
            }
            Logger.log(XMediaplayerJNI.Tag, "ReadThread.start()");
            this.mReadThread.start();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private boolean shallReloadData() {
        ReadThread readThread;
        return this.buffItemQueue == null || ((readThread = this.mReadThread) != null && readThread.isClosed() && this.buffItemQueue.size() == 0);
    }

    public void cleanAudioFileCache() {
        AudioFile audioFile;
        ReadThread readThread = this.mReadThread;
        if (readThread == null || (audioFile = readThread.getAudioFile()) == null) {
            return;
        }
        try {
            audioFile.clearCache();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getCachePercent() {
        if (PlayerUtil.isLocalFile(this.mXMediaplayerJNI.getPlayUrl())) {
            return 100;
        }
        ReadThread readThread = this.mReadThread;
        if (readThread == null) {
            return 0;
        }
        return readThread.getCachePercent();
    }

    public boolean isRelease() {
        return this.mReleaseType < 0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0137 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0146 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x014a A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x017d A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01cd A[Catch: InterruptedException -> 0x0341, TRY_LEAVE, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x02c4 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0316 A[Catch: InterruptedException -> 0x0341, TryCatch #1 {InterruptedException -> 0x0341, blocks: (B:35:0x0093, B:37:0x0099, B:78:0x0336, B:38:0x00a6, B:40:0x00d1, B:42:0x00d4, B:44:0x0137, B:46:0x0146, B:48:0x014a, B:50:0x017d, B:52:0x01a5, B:56:0x01af, B:58:0x01cd, B:63:0x01fc, B:64:0x0231, B:67:0x0293, B:69:0x0297, B:71:0x029c, B:72:0x02a4, B:73:0x02c4, B:76:0x02de, B:77:0x0316, B:79:0x0339), top: B:91:0x0093 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00a6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00d4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x014a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x017d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x01cd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x02c4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0316, please report this as an issue */
    public int readData(JNIDataModel jNIDataModel, boolean z, int i) {
        BufferItem bufferItemPoll;
        int index;
        int i2;
        int length;
        int i3;
        if (i < 0) {
            return -2;
        }
        if (isRelease()) {
            return this.mReleaseType;
        }
        if (PlayerUtil.isLocalFile(jNIDataModel.filePath)) {
            int i4 = jNIDataModel.bufSize;
            byte[] bArr = new byte[i4 <= 65536 ? i4 : 65536];
            jNIDataModel.buf = bArr;
            try {
                readDataFromSD(jNIDataModel.filePath, i, bArr);
                jNIDataModel.fileSize = this.mXMediaplayerJNI.getCurFileSize();
                this.mXMediaplayerJNI.onBufferingUpdateInner(getCachePercent());
                return jNIDataModel.buf.length;
            } catch (IOException unused) {
                return -1;
            }
        }
        if ((z || shallReloadData()) && !resetLoadDataPosition(i, jNIDataModel)) {
            release(this.mReleaseType);
            return this.mReleaseType;
        }
        long curFileSize = this.mXMediaplayerJNI.getCurFileSize();
        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 0 tCurFileSize:" + curFileSize);
        if (curFileSize <= 0) {
            release(this.mReleaseType);
            return this.mReleaseType;
        }
        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 1");
        if (z) {
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2");
            this.mXMediaplayerJNI.tmepBuf = null;
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2 buffItemQueue.size():" + this.buffItemQueue.size());
            if (isRelease()) {
                return this.mReleaseType;
            }
            this.isPollData = true;
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2 buffItemQueue.size():" + this.buffItemQueue.size() + " isPollData0isPollData0:" + this.isPollData);
            bufferItemPoll = this.buffItemQueue.poll(30000L, TimeUnit.MILLISECONDS);
            this.isPollData = false;
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2 buffItemQueue.size():" + this.buffItemQueue.size() + " isPollData1:" + this.isPollData);
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 3");
            if (bufferItemPoll == null) {
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null");
                release(this.mReleaseType);
                return this.mReleaseType;
            }
            if (bufferItemPoll.fails) {
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null index:" + bufferItemPoll.getIndex() + " bItem.errorCode:" + bufferItemPoll.errorCode);
                release(this.mReleaseType);
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null return -1");
                return this.mReleaseType;
            }
            index = bufferItemPoll.getIndex();
            i2 = (int) (curFileSize / 65536);
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 4 index:" + index + "total index:" + i2);
            if (index >= 0) {
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs index:" + index + "total index:" + i2);
                if (z) {
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 1");
                    int i5 = i % 65536;
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT offset:" + i5);
                    length = bufferItemPoll.getBuffer().array().length;
                    if (curFileSize != 0) {
                        length = (int) (curFileSize % 65536);
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT lastChunkLength:" + length + " index:" + index);
                        String str = XMediaplayerJNI.Tag;
                        StringBuilder sb = new StringBuilder();
                        sb.append("dataStreamInputFuncCallBackT seekParaTimeStampMs 2 index:");
                        sb.append(index);
                        Logger.log(str, sb.toString());
                    }
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT offset:" + i5 + "length:" + length + " index:" + index);
                    ByteBuffer buffer = bufferItemPoll.getBuffer();
                    buffer.position(i5).limit(length);
                    ByteBuffer byteBufferSlice = buffer.slice();
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT slice remaining:" + byteBufferSlice.remaining() + " index:" + index);
                    byte[] bArr2 = new byte[byteBufferSlice.remaining()];
                    jNIDataModel.buf = bArr2;
                    byteBufferSlice.get(bArr2);
                    if (this.isLocalServiceSource) {
                        jNIDataModel.buf = decryptData(jNIDataModel.buf);
                    }
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT slice buf size:" + jNIDataModel.buf.length + " index:" + index);
                } else {
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 3 index:" + index);
                    if (curFileSize == 0) {
                        jNIDataModel.buf = bufferItemPoll.getBuffer().array();
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 5 index:" + index);
                    } else {
                        jNIDataModel.buf = bufferItemPoll.getBuffer().array();
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 5 index:" + index);
                    }
                }
            }
            release(RELEASE_TYPE_IO_ERROR);
            return RELEASE_TYPE_IO_ERROR;
        }
        try {
            XMediaplayerJNI xMediaplayerJNI = this.mXMediaplayerJNI;
            byte[] bArr3 = xMediaplayerJNI.tmepBuf;
            if (bArr3 == null) {
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2");
                this.mXMediaplayerJNI.tmepBuf = null;
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2 buffItemQueue.size():" + this.buffItemQueue.size());
                if (isRelease()) {
                    return this.mReleaseType;
                }
                this.isPollData = true;
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2 buffItemQueue.size():" + this.buffItemQueue.size() + " isPollData0isPollData0:" + this.isPollData);
                bufferItemPoll = this.buffItemQueue.poll(30000L, TimeUnit.MILLISECONDS);
                this.isPollData = false;
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 2 buffItemQueue.size():" + this.buffItemQueue.size() + " isPollData1:" + this.isPollData);
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 3");
                if (bufferItemPoll == null) {
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null");
                    release(this.mReleaseType);
                    return this.mReleaseType;
                }
                if (bufferItemPoll.fails) {
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null index:" + bufferItemPoll.getIndex() + " bItem.errorCode:" + bufferItemPoll.errorCode);
                    release(this.mReleaseType);
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT timeout item null return -1");
                    return this.mReleaseType;
                }
                index = bufferItemPoll.getIndex();
                i2 = (int) (curFileSize / 65536);
                Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 4 index:" + index + "total index:" + i2);
                if (index >= 0 && !bufferItemPoll.isLastChunk() && index <= i2) {
                    Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs index:" + index + "total index:" + i2);
                    if (z) {
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 1");
                        int i6 = i % 65536;
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT offset:" + i6);
                        length = bufferItemPoll.getBuffer().array().length;
                        if (curFileSize != 0 && index == i2) {
                            length = (int) (curFileSize % 65536);
                            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT lastChunkLength:" + length + " index:" + index);
                            String str2 = XMediaplayerJNI.Tag;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("dataStreamInputFuncCallBackT seekParaTimeStampMs 2 index:");
                            sb2.append(index);
                            Logger.log(str2, sb2.toString());
                        }
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT offset:" + i6 + "length:" + length + " index:" + index);
                        ByteBuffer buffer2 = bufferItemPoll.getBuffer();
                        buffer2.position(i6).limit(length);
                        ByteBuffer byteBufferSlice2 = buffer2.slice();
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT slice remaining:" + byteBufferSlice2.remaining() + " index:" + index);
                        byte[] bArr4 = new byte[byteBufferSlice2.remaining()];
                        jNIDataModel.buf = bArr4;
                        byteBufferSlice2.get(bArr4);
                        if (this.isLocalServiceSource && i == 0 && i < (i3 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH) && curFileSize > i3) {
                            jNIDataModel.buf = decryptData(jNIDataModel.buf);
                        }
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT slice buf size:" + jNIDataModel.buf.length + " index:" + index);
                    } else {
                        Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 3 index:" + index);
                        if (curFileSize == 0 && index == i2) {
                            ByteBuffer buffer3 = bufferItemPoll.getBuffer();
                            buffer3.position(0).limit((int) (curFileSize % 65536));
                            ByteBuffer byteBufferSlice3 = buffer3.slice();
                            byte[] bArr5 = new byte[byteBufferSlice3.remaining()];
                            jNIDataModel.buf = bArr5;
                            byteBufferSlice3.get(bArr5);
                            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 4 index:" + index);
                        } else {
                            jNIDataModel.buf = bufferItemPoll.getBuffer().array();
                            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs 5 index:" + index);
                        }
                    }
                }
                release(RELEASE_TYPE_IO_ERROR);
                return RELEASE_TYPE_IO_ERROR;
            }
            jNIDataModel.buf = bArr3;
            xMediaplayerJNI.tmepBuf = null;
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT read temp buf");
        } catch (InterruptedException e) {
            Logger.log(XMediaplayerJNI.Tag, "dataStreamInputFuncCallBackT 19" + e.getMessage());
        }
        jNIDataModel.fileSize = curFileSize;
        byte[] bArr6 = jNIDataModel.buf;
        if (bArr6 != null) {
            return bArr6.length;
        }
        release(RELEASE_TYPE_IO_ERROR);
        return RELEASE_TYPE_IO_ERROR;
    }

    public void release(int i) {
        if (i == 0) {
            i = RELEASE_TYPE_IO_ERROR;
        }
        this.mReleaseType = i;
        Logger.log(XMediaplayerJNI.Tag, "AudioFileRequestHandler release mReadThread.close" + toString());
        ReadThread readThread = this.mReadThread;
        if (readThread != null) {
            readThread.close();
            Logger.log(XMediaplayerJNI.Tag, "AudioFileRequestHandler release mReadThread.close" + this.mReadThread.toString());
        }
        if (this.buffItemQueue != null) {
            Logger.log(XMediaplayerJNI.Tag, "AudioFileRequestHandler release buffItemQueue.size():" + this.buffItemQueue.size() + " isPollData:" + this.isPollData);
            if (this.buffItemQueue.size() != 0 || !this.isPollData) {
                this.buffItemQueue.clear();
                Logger.log(XMediaplayerJNI.Tag, "AudioFileRequestHandler release buffItemQueue.clear");
                return;
            }
            BufferItem bufferItem = new BufferItem();
            bufferItem.fails = true;
            bufferItem.errorCode = this.normalReleaseCode;
            this.buffItemQueue.add(bufferItem);
            Logger.log(XMediaplayerJNI.Tag, "AudioFileRequestHandler release normalReleaseCode:" + this.normalReleaseCode);
        }
    }

    public void restart() {
        this.mReleaseType = 0;
    }

    public void setPreBufferUrl(String str) {
        this.mPreBufferUrl = str;
        ReadThread readThread = this.mReadThread;
        if (readThread == null || readThread.isClosed()) {
            return;
        }
        this.mReadThread.setPreBufferUrl(this.mPreBufferUrl);
    }

    public AudioFileRequestHandler(XMediaplayerJNI xMediaplayerJNI, String str, boolean z) {
        this.mPreBufferUrl = null;
        this.isPollData = false;
        this.normalReleaseCode = 1000;
        this.mReleaseType = 0;
        this.mXMediaplayerJNI = xMediaplayerJNI;
        this.mReleaseType = 0;
        this.mPreBufferUrl = str;
        this.isLocalServiceSource = z;
    }
}

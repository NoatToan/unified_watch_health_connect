package com.ximalaya.ting.android.player;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class AudioFile {
    private static final String TAG = "dl_mp3";
    private ByteBuffer bBuffer;
    private String dirPath;
    private FileDesc fileInfo;
    private String fileName;
    private String mUrl;

    private AudioFile(String str, String str2) throws IOException {
        this.mUrl = null;
        Logger.log(TAG, "======================AudioFile Constructor()");
        this.dirPath = str;
        FileDesc fileDesc = new FileDesc(str, str2);
        this.fileInfo = fileDesc;
        this.fileName = MD5.getFileNameMd5(fileDesc.getUrl());
        this.mUrl = this.fileInfo.getUrl();
    }

    public static AudioFile getAudioFile(String str, String str2) throws IOException {
        return new AudioFile(str, str2);
    }

    private synchronized int readChunkData(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.dirPath + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.fileName + ".chunk", "r");
        Logger.log(TAG, "======================readChunkData0(" + i + ":" + randomAccessFile.length() + ")");
        randomAccessFile.seek((long) i);
        i4 = randomAccessFile.read(bArr, i2, i3);
        randomAccessFile.close();
        return i4;
    }

    private synchronized int writeChunkData(byte[] bArr, int i, int i2) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.dirPath + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.fileName + ".chunk", "rw");
            randomAccessFile.seek((long) (this.fileInfo.getDownloadedChunks() * 65536));
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (IOException unused) {
            return -1;
        }
        return i2;
    }

    public void clearCache() throws IOException {
        String fileNameMd5 = MD5.getFileNameMd5(this.mUrl);
        File file = new File(this.dirPath + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + fileNameMd5 + ".index");
        File file2 = new File(this.dirPath + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + fileNameMd5 + ".chunk");
        if (file.exists()) {
            file.delete();
        }
        if (file2.exists()) {
            file2.delete();
        }
        FileDesc fileDesc = new FileDesc(this.dirPath, this.mUrl);
        this.fileInfo = fileDesc;
        this.fileName = MD5.getFileNameMd5(fileDesc.getUrl());
        this.mUrl = this.fileInfo.getUrl();
    }

    public String getDirPath() {
        return this.dirPath;
    }

    public synchronized FileDesc getFileInfo() {
        return this.fileInfo;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.dirPath + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.fileName;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public ByteBuffer getbBuffer() {
        return this.bBuffer;
    }

    public final synchronized boolean isChunkExists(int i) {
        return this.fileInfo.isChunkDownloaded(i);
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setbBuffer(ByteBuffer byteBuffer) {
        this.bBuffer = byteBuffer;
    }

    public synchronized void writeFails(int i) {
        this.fileInfo.valid = false;
        this.fileInfo.statusCode = i;
    }

    public synchronized void writeChunkData(int i, byte[] bArr, int i2, int i3) {
        if (this.fileInfo.isChunkDownloaded(i)) {
            return;
        }
        if (writeChunkData(bArr, i2, i3) > 0) {
            this.fileInfo.update(i);
        }
    }

    public synchronized int readChunkData(int i, int i2, byte[] bArr, int i3) throws IOException {
        if (!this.fileInfo.chunkExist.get(i)) {
            Logger.log(TAG, "fileInfo.chunkExist.get(" + i + ")false");
            return -1;
        }
        int chunkData = readChunkData(this.fileInfo.chunkOffset.get(i).intValue() * i2, bArr, i3, i2);
        Logger.log(TAG, "======================readChunkData(" + i + ":" + chunkData + ")");
        return chunkData;
    }
}

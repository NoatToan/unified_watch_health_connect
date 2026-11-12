package com.ximalaya.ting.android.player;

import android.net.Uri;
import android.text.TextUtils;
import com.ximalaya.ting.android.player.cdn.CdnCollectDataForPlay;
import com.ximalaya.ting.android.player.cdn.CdnConstants;
import com.ximalaya.ting.android.player.cdn.CdnUtil;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public class FileDesc {
    private static final String TAG = "dl_mp3";
    public volatile BitSet chunkExist;
    private int chunkNum;
    public volatile ArrayList<Integer> chunkOffset;
    private int comChunkNum;
    private long comFileLen;
    private String dirPath;
    public volatile ArrayList<Integer> downloadedChunks;
    private String eTag;
    public volatile int statusCode;
    private String url;
    public volatile boolean valid;

    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    public FileDesc(String str, String str2) throws Throwable {
        DataInputStream dataInputStream;
        this.valid = false;
        Logger.log(TAG, "======================FileDesc Constructor()");
        this.dirPath = str;
        this.url = str2;
        createCacheDir();
        String fileNameMd5 = MD5.getFileNameMd5(str2);
        String str3 = str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + fileNameMd5 + ".index";
        File file = new File(str3);
        File file2 = new File(str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + fileNameMd5 + ".chunk");
        if (file.exists() != file2.exists()) {
            file.delete();
            file2.delete();
        }
        if (!file.exists()) {
            initFileDescFormNet(str, str2);
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str3);
            try {
                dataInputStream = new DataInputStream(fileInputStream2);
                try {
                    String utf = dataInputStream.readUTF();
                    this.url = utf;
                    if (utf != null && MD5.getFileNameMd5(utf).equals(MD5.getFileNameMd5(str2))) {
                        this.comFileLen = dataInputStream.readLong();
                        this.eTag = dataInputStream.readUTF();
                        int iCeil = (int) Math.ceil(this.comFileLen / 65536.0f);
                        Logger.log(TAG, "calc002==comChunkNum==:" + this.comFileLen + ", " + iCeil);
                        this.comChunkNum = iCeil;
                        this.chunkNum = dataInputStream.readInt();
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        for (int i = 0; i < this.chunkNum; i++) {
                            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
                        }
                        if (this.comChunkNum > 0) {
                            this.valid = true;
                            initFromArray(arrayList, iCeil);
                        }
                        fileInputStream2.close();
                        dataInputStream.close();
                        return;
                    }
                    file.delete();
                    file2.delete();
                    initFileDescFormNet(str, str2);
                    fileInputStream2.close();
                    dataInputStream.close();
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    try {
                        file.delete();
                        file2.delete();
                        initFileDescFormNet(str, str2);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (dataInputStream == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                dataInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
            }
        } catch (Exception unused3) {
            dataInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            dataInputStream = null;
        }
    }

    private boolean createCacheDir() {
        File file = new File(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY);
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        Logger.log(TAG, "目录不存在，创建失败！" + XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY);
        return false;
    }

    private void initFromArray(ArrayList<Integer> arrayList, int i) {
        this.chunkExist = new BitSet(i);
        this.chunkOffset = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.chunkOffset.add(i2, -1);
        }
        this.downloadedChunks = arrayList;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.chunkExist.set(arrayList.get(i3).intValue());
            this.chunkOffset.set(arrayList.get(i3).intValue(), Integer.valueOf(i3));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileDesc)) {
            return false;
        }
        FileDesc fileDesc = (FileDesc) obj;
        String url = getUrl();
        if (url == null) {
            return false;
        }
        return url.equals(fileDesc.getUrl());
    }

    public int getComChunkNum() {
        return this.comChunkNum;
    }

    public int getComFileLen() {
        return (int) this.comFileLen;
    }

    public synchronized int getDownloadedChunks() {
        if (this.downloadedChunks == null) {
            return 0;
        }
        return this.downloadedChunks.size();
    }

    public String getETag() {
        return this.eTag;
    }

    public int getErrorCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[PHI: r15
      0x005d: PHI (r15v16 java.lang.String) = (r15v1 java.lang.String), (r15v18 java.lang.String), (r15v17 java.lang.String), (r15v17 java.lang.String) binds: [B:70:0x0203, B:55:0x0171, B:47:0x0147, B:20:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    public void initFileDescFormNet(String str, String str2) throws IOException {
        int i;
        String string = UUID.randomUUID().toString();
        int i2 = 3;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            CdnCollectDataForPlay cdnCollectDataForPlay = new CdnCollectDataForPlay();
            HttpURLConnection connectionUseDnsCache = null;
            try {
                try {
                    String[] strArr = {str2};
                    String host = TextUtils.isEmpty(str2) ? "" : Uri.parse(str2).getHost();
                    connectionUseDnsCache = PlayerUtil.getConnectionUseDnsCache(strArr, null, 1, false, "HEAD");
                    str2 = strArr[0];
                    if (connectionUseDnsCache == null) {
                        if (connectionUseDnsCache != null) {
                            connectionUseDnsCache.disconnect();
                        }
                        CdnUtil.statToXDCSError(CdnConstants.CDN_HEAD_INFO_KEY, cdnCollectDataForPlay.toString());
                        if (!this.valid && !TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) && !TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, CdnUtil.getCdnConfigModel());
                        }
                    } else {
                        this.statusCode = connectionUseDnsCache.getResponseCode();
                        cdnCollectDataForPlay.setType("play_head_fail");
                        String string2 = connectionUseDnsCache.getURL().toString();
                        cdnCollectDataForPlay.setAudioUrl(string2);
                        cdnCollectDataForPlay.setCdnIP(CdnUtil.getUrlIp(string2));
                        cdnCollectDataForPlay.setViaInfo(connectionUseDnsCache.getHeaderField("via"));
                        cdnCollectDataForPlay.setStatusCode(this.statusCode + "");
                        cdnCollectDataForPlay.setCdnDomain(host);
                        cdnCollectDataForPlay.setRequestUUID(string);
                        if (this.statusCode >= 400) {
                            Logger.w(TAG, "Error response code for get head for url: " + str2 + ",status code is: " + this.statusCode + " in handler thread");
                            throw new IOException("http response status code is: " + this.statusCode);
                        }
                        this.valid = true;
                        if (this.statusCode == 301 || this.statusCode == 302) {
                            str2 = connectionUseDnsCache.getHeaderField("Location");
                            connectionUseDnsCache.disconnect();
                            CdnUtil.statToXDCSError(CdnConstants.CDN_HEAD_INFO_KEY, cdnCollectDataForPlay.toString());
                            if (!this.valid && !TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) && !TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, CdnUtil.getCdnConfigModel());
                            }
                        } else {
                            long contentLength = connectionUseDnsCache.getContentLength();
                            this.comFileLen = contentLength;
                            cdnCollectDataForPlay.setAudioBytes(contentLength);
                            Logger.log(TAG, "conn.getContentLength():" + this.comFileLen);
                            if (this.comFileLen <= 0) {
                                cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_UNKNOWN_EXCEPTION);
                                cdnCollectDataForPlay.setExceptionReason("head request comFileLen<=0");
                                this.valid = false;
                            }
                            this.eTag = connectionUseDnsCache.getHeaderField("ETag");
                            if (this.valid) {
                                connectionUseDnsCache.disconnect();
                                CdnUtil.statToXDCSError(CdnConstants.CDN_HEAD_INFO_KEY, cdnCollectDataForPlay.toString());
                                if (!this.valid && !TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) && !TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, CdnUtil.getCdnConfigModel());
                                    break;
                                } else {
                                    break;
                                    break;
                                    break;
                                }
                            }
                            connectionUseDnsCache.disconnect();
                            CdnUtil.statToXDCSError(CdnConstants.CDN_HEAD_INFO_KEY, cdnCollectDataForPlay.toString());
                            if (!this.valid && !TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) && !TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, CdnUtil.getCdnConfigModel());
                            }
                        }
                    }
                } catch (Exception e) {
                    this.valid = false;
                    cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_IO_EXCEPTION);
                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(e));
                    cdnCollectDataForPlay.setDownloadResult("failed");
                    Logger.log(XMediaplayerJNI.Tag, "initFileDescFormNet Exception:" + e.toString());
                    if (connectionUseDnsCache != null) {
                        connectionUseDnsCache.disconnect();
                    }
                    CdnUtil.statToXDCSError(CdnConstants.CDN_HEAD_INFO_KEY, cdnCollectDataForPlay.toString());
                    if (this.valid || TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) || TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                    }
                }
                i2 = i3;
            } catch (Throwable th) {
                if (connectionUseDnsCache != null) {
                    connectionUseDnsCache.disconnect();
                }
                CdnUtil.statToXDCSError(CdnConstants.CDN_HEAD_INFO_KEY, cdnCollectDataForPlay.toString());
                if (!this.valid && !TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) && !TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, CdnUtil.getCdnConfigModel());
                }
                throw th;
            }
        }
        if (!this.valid) {
            Logger.log(TAG, "valid0:" + this.valid + "comFileLen:" + this.comFileLen + "statusCode:" + this.statusCode);
            return;
        }
        Logger.log(TAG, "valid1:" + this.valid + "comFileLen:" + this.comFileLen + "statusCode:" + this.statusCode);
        this.comChunkNum = (int) Math.ceil((double) (((float) this.comFileLen) / 65536.0f));
        Logger.log(TAG, "calc001==comFileLen==:" + this.comFileLen + ",comChunkNum:" + this.comChunkNum + "statusCode:" + this.statusCode);
        this.chunkNum = 0;
        this.chunkExist = new BitSet(this.comChunkNum);
        if (this.comChunkNum <= 0) {
            this.valid = false;
            this.statusCode = 408;
            return;
        }
        this.chunkOffset = new ArrayList<>(this.comChunkNum);
        for (i = 0; i < this.comChunkNum; i++) {
            this.chunkOffset.add(i, -1);
        }
        this.downloadedChunks = new ArrayList<>();
        saveDescHeadToDisk(str, MD5.getFileNameMd5(str2));
        this.valid = true;
    }

    public synchronized boolean isChunkDownloaded(int i) {
        boolean z;
        z = false;
        if (this.chunkExist != null && i >= 0 && i < this.chunkExist.length()) {
            z = this.chunkExist.get(i);
        }
        return z;
    }

    public boolean isIndexAvaliable(int i) {
        return this.chunkExist != null && i >= 0 && i < this.chunkExist.length();
    }

    public boolean isValid() {
        return this.valid && this.comChunkNum > 0;
    }

    public synchronized void saveDescHeadToDisk(String str, String str2) {
        Logger.log(TAG, "saveDescHeadToDisk(" + str + ", " + str2 + ", " + this.comFileLen + ")");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + ".index", false);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(this.url);
            dataOutputStream.writeLong(this.comFileLen);
            String str3 = this.eTag;
            if (str3 == null) {
                str3 = "";
            }
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeInt(0);
            dataOutputStream.flush();
            dataOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            Logger.log(TAG, "exception: saveDescHeadToDisk" + e.getMessage());
        }
    }

    public synchronized boolean saveDescToDisk(String str, String str2) {
        String str3;
        Logger.log(TAG, "======================saveDescToDisk(" + str + ", " + str2 + ")");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + ".index", false);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(this.url);
            dataOutputStream.writeLong(this.comFileLen);
            if (this.eTag == null) {
                str3 = "\"\"";
            } else {
                str3 = "\"" + this.eTag + "\"";
            }
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeInt(this.chunkNum);
            Iterator<Integer> it2 = this.downloadedChunks.iterator();
            while (it2.hasNext()) {
                dataOutputStream.writeInt(it2.next().intValue());
            }
            dataOutputStream.flush();
            dataOutputStream.close();
            fileOutputStream.close();
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    public synchronized void update(int i) {
        if (this.chunkExist == null) {
            return;
        }
        int size = this.downloadedChunks.size();
        this.chunkExist.set(i);
        this.chunkOffset.set(i, Integer.valueOf(size));
        this.downloadedChunks.add(Integer.valueOf(i));
        this.chunkNum++;
        saveDescToDisk(this.dirPath, MD5.getFileNameMd5(this.url));
    }
}

package com.ximalaya.ting.android.player;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ximalaya.ting.android.player.liveflv.FlvLiveAudioFile;
import com.ximalaya.ting.android.player.model.JNIDataModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public abstract class XMediaplayerJNI implements XMediaplayerImpl {
    public static String Tag = "XMPLAY";
    private volatile boolean hasRelease;
    private boolean isLocalServiceSource;
    private boolean isRelease;
    private AudioFileRequestHandler mAudioFileRequestHandler;
    private AudioTrackPlayThread mAudioTrackPlayThread;
    public Context mContext;
    private long mCurFileSize;
    private FlvLiveAudioFile mFlvLiveAudioFile;
    private HlsAudioFile mHlsAudioFile;
    private long mJniHandler;
    public XMediaPlayer.OnPlayDataOutputListener mOnPlayDataOutputListener;
    public byte[] tmepBuf;
    private int mCurrentSeekPosition = -1;
    private int mCurrentSeekPositionState = 0;
    public String mPlayUrl;
    public String mCurrentDataDecodeUrl = this.mPlayUrl;
    private boolean mHasSeek = true;
    private boolean isSeeking = false;
    public volatile boolean isBuffing = false;
    private AudioType mAudioType = AudioType.NORMAL_FILE;
    private volatile boolean isReseting = false;
    private boolean isAfterSetDataSourceStart = false;
    private int chargeDataRealLength = 0;
    private float mTempo = 1.0f;
    private float mPitch = 0.0f;
    private float mRate = 1.0f;

    /* JADX INFO: renamed from: com.ximalaya.ting.android.player.XMediaplayerJNI$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType;

        static {
            int[] iArr = new int[NativeErrorType.values().length];
            $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType = iArr;
            try {
                iArr[NativeErrorType.ERR_DECODEDATA_FILLIO_FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.ERR_DECODE_NOT_SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.ERR_FILE_MANAGER_INNER_ERR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.ERR_M3U8STREAM_FILLIO_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.ERR_M3U8_FILE_CONTENT_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.ERR_NOTOK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.NO_ERR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[NativeErrorType.ERR_ARCH_NOT_SUPPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum AudioType {
        NORMAL_FILE(0),
        M3U8_STATIC_FILE(1),
        HLS_FILE(2),
        M3U8_FILE(3),
        XMLY_FORMAT(4),
        FLV_FILE(5);

        private int value;

        AudioType(int i) {
            this.value = 0;
            this.value = i;
        }

        public int value() {
            return this.value;
        }

        public static AudioType valueOf(int i) {
            if (i == 0) {
                return NORMAL_FILE;
            }
            if (i == 1) {
                return M3U8_STATIC_FILE;
            }
            if (i == 2) {
                return HLS_FILE;
            }
            if (i == 3) {
                return M3U8_FILE;
            }
            if (i == 4) {
                return XMLY_FORMAT;
            }
            if (i != 5) {
                return null;
            }
            return FLV_FILE;
        }
    }

    public enum NativeErrorType {
        NO_ERR(0),
        ERR_NOTOK(-1),
        ERR_DECODE_NOT_SUPPORT(-2),
        ERR_M3U8_FILE_CONTENT_INVALID(-3),
        ERR_FILE_MANAGER_INNER_ERR(-4),
        ERR_DECODEDATA_FILLIO_FAIL(-5),
        ERR_M3U8STREAM_FILLIO_FAIL(-6),
        ERR_ARCH_NOT_SUPPORT(-7),
        ERR_LIB_NOT_LOADED(-8),
        ERR_XMLY_DEC_ERR(-9),
        ERR_FLV_DEC_ERR(-10);

        private int value;

        NativeErrorType(int i) {
            this.value = 0;
            this.value = i;
        }

        public int value() {
            return this.value;
        }

        public static NativeErrorType valueOf(int i) {
            switch (i) {
                case -10:
                    return ERR_FLV_DEC_ERR;
                case -9:
                    return ERR_XMLY_DEC_ERR;
                case -8:
                    return ERR_LIB_NOT_LOADED;
                case -7:
                    return ERR_ARCH_NOT_SUPPORT;
                case -6:
                    return ERR_M3U8STREAM_FILLIO_FAIL;
                case -5:
                    return ERR_DECODEDATA_FILLIO_FAIL;
                case -4:
                    return ERR_FILE_MANAGER_INNER_ERR;
                case -3:
                    return ERR_M3U8_FILE_CONTENT_INVALID;
                case -2:
                    return ERR_DECODE_NOT_SUPPORT;
                case -1:
                    return ERR_NOTOK;
                case 0:
                    return NO_ERR;
                default:
                    return ERR_NOTOK;
            }
        }
    }

    static {
        if (PlayerUtil.isX86Arch()) {
            System.loadLibrary("xmediaplayer_x");
            return;
        }
        boolean zIsArmV7Plus = PlayerUtil.isArmV7Plus();
        boolean zIsArm64V8 = PlayerUtil.isArm64V8();
        Logger.log(Tag, "loadLibrary xmediaplayer isArmV7Plus:" + zIsArmV7Plus + "   isArm64v8" + zIsArm64V8);
        if (zIsArm64V8) {
            Log.i("loadLibrary", "xmediaplayerv8");
            try {
                try {
                    System.loadLibrary("xmediaplayerv8");
                    return;
                } catch (Throwable unused) {
                    System.loadLibrary("xmediaplayerv7");
                    return;
                }
            } catch (Throwable unused2) {
                System.loadLibrary("xmediaplayer");
                return;
            }
        }
        if (!zIsArmV7Plus) {
            Log.i("loadLibrary", "xmediaplayer");
            System.loadLibrary("xmediaplayer");
            return;
        }
        Log.i("loadLibrary", "xmediaplayerv7");
        try {
            System.loadLibrary("xmediaplayerv7");
        } catch (Throwable th) {
            th.printStackTrace();
            System.loadLibrary("xmediaplayer");
        }
    }

    public XMediaplayerJNI(Context context, boolean z) {
        this.isRelease = true;
        this.hasRelease = false;
        this.mContext = context.getApplicationContext();
        this.hasRelease = false;
        this.isRelease = z;
        int iMediaplayerFrameworkInit = MediaplayerFrameworkInit(context, z);
        Logger.log(Tag, "MediaplayerFrameworkInit result:" + iMediaplayerFrameworkInit);
        if (iMediaplayerFrameworkInit < 0) {
            handlePlayerStatus(NativeErrorType.ERR_ARCH_NOT_SUPPORT.value());
        }
    }

    private String getCurPlayUrl() {
        AudioType audioType = this.mAudioType;
        if (audioType != AudioType.M3U8_STATIC_FILE && audioType != AudioType.HLS_FILE && audioType != AudioType.M3U8_FILE) {
            return this.mPlayUrl;
        }
        HlsAudioFile hlsAudioFile = this.mHlsAudioFile;
        if (hlsAudioFile != null) {
            return hlsAudioFile.getPlayUrl();
        }
        throw new RuntimeException("getCurPlayUrl 错误！");
    }

    private void handleSmallBufRequest(JNIDataModel jNIDataModel) {
        byte[] bArr = jNIDataModel.buf;
        if (bArr.length > jNIDataModel.bufSize) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.clear();
            byteBufferWrap.position(jNIDataModel.bufSize).limit(jNIDataModel.buf.length);
            ByteBuffer byteBufferSlice = byteBufferWrap.slice();
            byte[] bArr2 = new byte[byteBufferSlice.remaining()];
            this.tmepBuf = bArr2;
            byteBufferSlice.get(bArr2);
            Logger.log(Tag, "dataStreamInputFuncCallBackT length diff tJNIDataModel.bufSize:" + jNIDataModel.bufSize + " tJNIDataModel.buf:" + jNIDataModel.buf.length);
            if (this.tmepBuf != null) {
                Logger.log(Tag, "dataStreamInputFuncCallBackT length diff tmepBuf:" + this.tmepBuf.length);
            }
            byteBufferWrap.clear();
            byteBufferWrap.position(0).limit(jNIDataModel.bufSize);
            ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
            byte[] bArr3 = new byte[byteBufferSlice2.remaining()];
            jNIDataModel.buf = bArr3;
            byteBufferSlice2.get(bArr3);
            Logger.log(Tag, "dataStreamInputFuncCallBackT length diff tJNIDataModel.buf:" + jNIDataModel.buf.length);
            if (this.tmepBuf != null) {
                Logger.log(Tag, "dataStreamInputFuncCallBackT length diff all1:" + (jNIDataModel.buf.length + this.tmepBuf.length));
            }
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
    }

    private void relaseAudioFile() {
        AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
        if (audioFileRequestHandler != null) {
            audioFileRequestHandler.release(AudioFileRequestHandler.RELEASE_TYPE_RESET);
        }
        HlsAudioFile hlsAudioFile = this.mHlsAudioFile;
        if (hlsAudioFile != null) {
            hlsAudioFile.release();
        }
        FlvLiveAudioFile flvLiveAudioFile = this.mFlvLiveAudioFile;
        if (flvLiveAudioFile != null) {
            flvLiveAudioFile.release();
        }
    }

    private synchronized void releaseAudioTrackPlayThread() {
        AudioTrackPlayThread audioTrackPlayThread = this.mAudioTrackPlayThread;
        if (audioTrackPlayThread != null) {
            audioTrackPlayThread.releasePlay();
            this.mAudioTrackPlayThread = null;
        }
        Logger.log(Tag, "releaseAudioTrackPlayThread releasePlay");
    }

    public native int MediaplayerComplete(long j);

    public native int MediaplayerDestroy(long j);

    public native int MediaplayerFrameworkInit(Context context, boolean z);

    public native int MediaplayerGetCurPlayingFileType(long j);

    public native long MediaplayerGetCurrentDecodedDataTime(long j);

    public native long MediaplayerGetCurrentTime(long j);

    public native long MediaplayerGetMediaDuration(long j);

    public native int MediaplayerGetOutputData(byte[] bArr, int i, long j);

    public native long MediaplayerInit(Context context, boolean z, int i, int i2, int i3, int i4);

    public native int MediaplayerOutputDataAppointment(long j);

    public native int MediaplayerPause(long j);

    public native int MediaplayerPlay(long j);

    public native int MediaplayerPrepareAsync(long j);

    public native int MediaplayerReset(long j);

    public native int MediaplayerSeek(long j, long j2);

    public native int MediaplayerSetDataSourceInfo(String str, int i, long j, double d, double d2);

    public native int MediaplayerStop(long j);

    public int bufferedDataReachThresholdCallBackT(int i) {
        if (!NativeErrorType.NO_ERR.equals(NativeErrorType.valueOf(i))) {
            handlePlayerStatus(i);
            return -1;
        }
        getAudioTrackPlayThread().dataReady();
        Logger.log(Tag, "dataStreamInputFuncCallBackT bufferedDataReachThresholdCallBackT");
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bf  */
    public int dataStreamInputFunCallBackT(JNIDataModel jNIDataModel) {
        byte[] bArr;
        if (!NativeErrorType.NO_ERR.equals(NativeErrorType.valueOf(jNIDataModel.status))) {
            Logger.log(Tag, "dataStreamInputFuncCallBackT readData start error:");
            handlePlayerStatus(jNIDataModel.status);
            return -1;
        }
        if (this.isReseting) {
            return -2;
        }
        Process.setThreadPriority(-19);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.log(Tag, "dataStreamInputFuncCallBackT readData start:" + jCurrentTimeMillis);
        if (jNIDataModel.filePath == null) {
            throw new RuntimeException("dataStreamInputFuncCallBackT tJNIDataModel.filePath==null 异常！！！");
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT fill io start");
        if (!jNIDataModel.filePath.equals(getCurPlayUrl())) {
            this.mCurrentSeekPosition = -1;
            this.mCurFileSize = 0L;
            this.mCurrentSeekPositionState = 0;
            this.mHasSeek = true;
            this.tmepBuf = null;
            Logger.log(Tag, "dataStreamInputFuncCallBackT 重置");
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT filePath:" + jNIDataModel.filePath + " mCurrentSeekPositionState:" + this.mCurrentSeekPositionState + " mCurrentSeekPosition:" + this.mCurrentSeekPosition);
        if (this.mHasSeek) {
            int i = this.mCurrentSeekPosition;
            int i2 = this.mCurrentSeekPositionState;
            if (i != i2) {
                this.mCurrentSeekPosition = i2;
                Logger.log(Tag, "dataStreamInputFuncCallBackT 4 seekParaTimeStampMs true mCurrentSeekPosition:" + this.mCurrentSeekPosition);
            } else {
                this.mHasSeek = false;
            }
        } else {
            this.mHasSeek = false;
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT 5 mCurFileSize:" + this.mCurFileSize + "mCurrentSeekPosition:" + this.mCurrentSeekPosition);
        long j = this.mCurFileSize;
        if (j > 0 && this.mCurrentSeekPosition >= j && !isHttpFlv()) {
            Logger.log(Tag, "dataStreamInputFuncCallBackT xx return 0");
            return 0;
        }
        if (isHls()) {
            if (this.mHlsAudioFile == null) {
                if (XMediaPlayerConstants.isDebug) {
                    throw new RuntimeException("mHlsAudioFile==null");
                }
                Logger.log(Tag, "dataStreamInputFuncCallBackT xx 21");
                return 0;
            }
            if (this.mHasSeek || (bArr = this.tmepBuf) == null) {
                this.tmepBuf = null;
                Logger.log(Tag, "dataStreamInputFuncCallBackT M3U8_FILE");
                if (this.mHlsAudioFile.readData(jNIDataModel) < 0) {
                    return -1;
                }
                this.mCurFileSize = jNIDataModel.fileSize;
            } else {
                jNIDataModel.buf = bArr;
                this.tmepBuf = null;
                jNIDataModel.fileSize = this.mCurFileSize;
                Logger.log(Tag, "dataStreamInputFuncCallBackT read temp buf");
            }
            this.mHasSeek = false;
        } else if (isHttpFlv()) {
            FlvLiveAudioFile flvLiveAudioFile = this.mFlvLiveAudioFile;
            if (flvLiveAudioFile == null) {
                if (XMediaPlayerConstants.isDebug) {
                    throw new RuntimeException("mFlvLiveAudioFile==null");
                }
                return 0;
            }
            int data = flvLiveAudioFile.readData(jNIDataModel);
            if (data < 0) {
                Logger.log(Tag, "dataStreamInputFuncCallBackT mFlvLiveAudioFile result < 0");
                return data;
            }
            if (data == 0) {
                Logger.log(Tag, "dataStreamInputFuncCallBackT mFlvLiveAudioFile result == 0");
                return 0;
            }
        } else {
            Logger.log(Tag, "dataStreamInputFuncCallBackT NORMAL_FILE");
            AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
            if (audioFileRequestHandler == null) {
                if (XMediaPlayerConstants.isDebug) {
                    throw new RuntimeException("mAudioFileRequestHandler==null");
                }
                Logger.log(Tag, "dataStreamInputFuncCallBackT xx 19 return 0 over");
                return 0;
            }
            int i3 = this.mCurrentSeekPosition;
            if (i3 < 0) {
                return -2;
            }
            int data2 = audioFileRequestHandler.readData(jNIDataModel, this.mHasSeek, i3);
            if (data2 <= 0) {
                Logger.log(Tag, "dataStreamInputFuncCallBackT NORMAL_FILE result == " + data2);
                return data2;
            }
            Logger.log(Tag, "dataStreamInputFuncCallBackT NORMAL_FILE result > 0");
            this.mHasSeek = false;
        }
        if (jNIDataModel.buf == null) {
            Logger.log(Tag, "dataStreamInputFuncCallBackT xx tJNIDataModel.buf==null");
            return -1;
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT mCurFileSize:" + this.mCurFileSize + " buf.length:" + jNIDataModel.buf.length + " bufSize:" + jNIDataModel.bufSize);
        handleSmallBufRequest(jNIDataModel);
        byte[] bArr2 = jNIDataModel.buf;
        if (bArr2 != null) {
            this.mCurrentSeekPosition += bArr2.length;
            Logger.log(Tag, "dataStreamInputFuncCallBackT tJNIDataModel.buf.length:" + jNIDataModel.buf.length);
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT mCurFileSize2:" + this.mCurFileSize + " filesize:" + jNIDataModel.fileSize + " readData end:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return jNIDataModel.buf.length;
    }

    public int dataStreamOutReadyFuncCallBackT(int i, int i2) {
        Logger.log(Tag, "dataStreamOutReadyFuncCallBackT");
        if (NativeErrorType.NO_ERR.equals(NativeErrorType.valueOf(i2))) {
            onPreparedInner();
            return 0;
        }
        handlePlayerStatus(i2);
        return -1;
    }

    public int dataStreamSeekFuncCallBackT(String str, long j, int i) {
        Logger.log(Tag, "dataStreamSeekFuncCallBackT 0 offset:" + j);
        if (!NativeErrorType.NO_ERR.equals(NativeErrorType.valueOf(i))) {
            handlePlayerStatus(i);
            return -1;
        }
        if (!TextUtils.isEmpty(str)) {
            this.mCurrentDataDecodeUrl = str;
        }
        this.mHasSeek = true;
        this.mCurrentSeekPositionState = (int) j;
        Logger.log(Tag, "dataStreamInputFuncCallBackT seekParaTimeStampMs true offset:" + j);
        return 0;
    }

    public synchronized AudioTrackPlayThread getAudioTrackPlayThread() {
        AudioTrackPlayThread audioTrackPlayThread = this.mAudioTrackPlayThread;
        if (audioTrackPlayThread != null && audioTrackPlayThread.isRelase()) {
            this.mAudioTrackPlayThread = null;
        }
        if (this.mAudioTrackPlayThread == null) {
            Logger.log(Tag, "dataStreamInputFuncCallBackT getAudioTrackPlayThread new");
            AudioTrackPlayThread audioTrackPlayThread2 = new AudioTrackPlayThread(this);
            this.mAudioTrackPlayThread = audioTrackPlayThread2;
            audioTrackPlayThread2.setSoundTouchAllParams(this.mTempo, this.mPitch, this.mRate);
        }
        return this.mAudioTrackPlayThread;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public AudioType getAudioType() {
        return this.mAudioType;
    }

    public int getCachePercent() {
        if (isHttpFlv()) {
            return 0;
        }
        if (isHls()) {
            HlsAudioFile hlsAudioFile = this.mHlsAudioFile;
            if (hlsAudioFile == null) {
                return 0;
            }
            return hlsAudioFile.getCachePercent();
        }
        AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
        if (audioFileRequestHandler == null) {
            return 0;
        }
        return audioFileRequestHandler.getCachePercent();
    }

    public int getChargeDataRealLength() {
        return this.chargeDataRealLength;
    }

    public long getCurFileSize() {
        return this.mCurFileSize;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getCurrentPosition() {
        return (int) MediaplayerGetCurrentTime(this.mJniHandler);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getDuration() {
        return (int) MediaplayerGetMediaDuration(this.mJniHandler);
    }

    public int getOutputData(byte[] bArr, int i) {
        if (this.mAudioTrackPlayThread == null || this.hasRelease) {
            return -1;
        }
        return MediaplayerGetOutputData(bArr, i, this.mJniHandler);
    }

    public String getPlayUrl() {
        return this.mPlayUrl;
    }

    public void handlePlayerStatus(int i) {
        NativeErrorType nativeErrorTypeValueOf = NativeErrorType.valueOf(i);
        Logger.log(Tag, "handlePlayerStatus status:" + i + "error stack:" + Log.getStackTraceString(new Throwable()));
        if (nativeErrorTypeValueOf == null) {
        }
        switch (AnonymousClass1.$SwitchMap$com$ximalaya$ting$android$player$XMediaplayerJNI$NativeErrorType[nativeErrorTypeValueOf.ordinal()]) {
            case 1:
                onErrorInner(8, XMediaPlayer.MEDIA_ERROR_IO);
                break;
            case 2:
                onErrorInner(8, -1010);
                break;
            case 3:
                onErrorInner(8, 100);
                break;
            case 4:
                onErrorInner(8, XMediaPlayer.MEDIA_ERROR_IO);
                break;
            case 5:
                onErrorInner(8, XMediaPlayer.MEDIA_ERROR_IO);
                break;
            case 6:
                onErrorInner(8, 1);
                break;
            case 7:
                break;
            case 8:
                onErrorInner(8, XMediaPlayer.MEDIA_ERROR_ARCH_UNSUPPORTED);
                break;
            default:
                onErrorInner(8, XMediaPlayer.MEDIA_ERROR_IO);
                break;
        }
    }

    public boolean isHls() {
        return this.mAudioType.value() > 0 && this.mAudioType.value() < 4;
    }

    public boolean isHttpFlv() {
        return this.mAudioType == AudioType.FLV_FILE;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isPlaying() {
        Logger.log(Tag, "dataStreamInputFuncCallBackT isPlaying");
        return getAudioTrackPlayThread().isPlaying();
    }

    public boolean isSeeking() {
        return this.isSeeking;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0 A[Catch: IOException -> 0x01c3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x01c3, blocks: (B:37:0x0111, B:75:0x01c0), top: B:104:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    public int m3u8FileStreamInputFuncCallBackT(JNIDataModel jNIDataModel) throws Throwable {
        int i;
        if (!NativeErrorType.NO_ERR.equals(NativeErrorType.valueOf(jNIDataModel.status))) {
            handlePlayerStatus(jNIDataModel.status);
            return -1;
        }
        if (jNIDataModel.bufSize <= 0) {
            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tJNIDataModel null");
            return -1;
        }
        Logger.log(Tag, "HlsReadThread downUrl0  m3u8FileStreamInputFuncCallBackT");
        int i2 = 3;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            HttpURLConnection httpURLConnection = null;
            InputStream inputStream = null;
            HttpURLConnection httpURLConnection2 = null;
            HttpURLConnection httpURLConnection3 = null;
            httpURLConnection = null;
            try {
                HttpURLConnection connectionUseDnsCache = PlayerUtil.getConnectionUseDnsCache(new String[]{this.mPlayUrl}, null, 2, false, "GET");
                if (connectionUseDnsCache != null) {
                    try {
                        int responseCode = connectionUseDnsCache.getResponseCode();
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT 0 responseCode:" + responseCode);
                        if (responseCode == 200 || responseCode == 206) {
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT 1");
                            inputStream = connectionUseDnsCache.getInputStream();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            while (true) {
                                i = inputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                                Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT len:" + i);
                            }
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT len000:" + i);
                            jNIDataModel.buf = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } else if (responseCode >= 400) {
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT HTTP_BAD_REQUEST responseCode:" + responseCode);
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                            connectionUseDnsCache.disconnect();
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 2");
                            return -1;
                        }
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                        connectionUseDnsCache.disconnect();
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (MalformedURLException e) {
                        e = e;
                        httpURLConnection2 = connectionUseDnsCache;
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT MalformedURLException:" + e.toString());
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                        if (httpURLConnection != 0) {
                            httpURLConnection.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        httpURLConnection3 = connectionUseDnsCache;
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT IOException:" + e.toString());
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                        }
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                        if (httpURLConnection != 0) {
                            httpURLConnection.close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnection = connectionUseDnsCache;
                        try {
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT Exception:" + e.toString());
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                            if (httpURLConnection != 0) {
                                httpURLConnection.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                            if (httpURLConnection != 0) {
                                try {
                                    httpURLConnection.close();
                                } catch (IOException unused2) {
                                }
                            }
                            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 2");
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = 0;
                        httpURLConnection = connectionUseDnsCache;
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                        if (httpURLConnection != 0) {
                            httpURLConnection.close();
                        }
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 2");
                        throw th;
                    }
                    Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 2");
                    byte[] bArr2 = jNIDataModel.buf;
                    if (bArr2 != null && bArr2.length > 0) {
                        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 3");
                        break;
                    }
                } else {
                    Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 0");
                    if (connectionUseDnsCache != null) {
                        connectionUseDnsCache.disconnect();
                    }
                    Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 1");
                    Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 2");
                }
            } catch (MalformedURLException e4) {
                e = e4;
            } catch (IOException e5) {
                e = e5;
            } catch (Exception e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = 0;
            }
            i2 = i3;
        }
        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT tt 4");
        byte[] bArr3 = jNIDataModel.buf;
        if (bArr3 == null || bArr3.length > jNIDataModel.bufSize || bArr3.length == 0) {
            Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT null end 4");
            return -1;
        }
        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT contentLength 5:" + jNIDataModel.buf.length);
        Logger.log(Tag, "m3u8FileStreamInputFuncCallBackT buf:" + new String(jNIDataModel.buf));
        return jNIDataModel.buf.length;
    }

    public int m3u8ParsedNewMediaItemInfoFuncCallBackT(String[] strArr, int i, int i2) {
        if (!NativeErrorType.NO_ERR.equals(NativeErrorType.valueOf(i2))) {
            Logger.log(Tag, "m3u8ParsedNewMediaItemInfoFuncCallBackT onErrorInner");
            handlePlayerStatus(i2);
            return -1;
        }
        if (this.mHlsAudioFile == null) {
            return -1;
        }
        Logger.log(Tag, "HlsReadThread downUrl0 m3u8ParsedNewMediaItemInfoFuncCallBackT length:" + strArr.length);
        int iMediaplayerGetCurPlayingFileType = MediaplayerGetCurPlayingFileType(this.mJniHandler);
        if (iMediaplayerGetCurPlayingFileType >= 0) {
            this.mAudioType = AudioType.valueOf(iMediaplayerGetCurPlayingFileType);
            Logger.log(Tag, "m3u8ParsedNewMediaItemInfoFuncCallBackT mAudioType0:" + this.mAudioType.value());
        } else {
            onErrorInner(8, 1);
            Logger.log(Tag, "m3u8ParsedNewMediaItemInfoFuncCallBackT mAudioType0 error");
        }
        this.mHlsAudioFile.addPlayUrls(strArr);
        return 0;
    }

    public abstract void mOnTimedChangeListenerInner();

    public abstract void onBufferingUpdateInner(int i);

    public void onCompletionInner() {
        resetAllData();
        MediaplayerComplete(this.mJniHandler);
        Logger.log(Tag, "flushAllDataInSoundTouch dataStreamInputFuncCallBackT onCompletionInner");
        releaseAudioTrackPlayThread();
    }

    public void onErrorInner(int i, int i2) {
        Logger.log(Tag, "onErrorInner");
        AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
        if (audioFileRequestHandler != null) {
            if (i2 == 1 || i2 == -1010 || i2 == -1004) {
                audioFileRequestHandler.cleanAudioFileCache();
            }
        }
    }

    public abstract void onInfoInner(int i);

    public void onPreparedInner() {
        if (this.isBuffing) {
            onInfoInner(702);
        }
        if (MediaplayerGetCurPlayingFileType(this.mJniHandler) < 0) {
            onErrorInner(8, 1);
            Logger.log(Tag, "onPreparedInner mAudioType error");
            return;
        }
        Logger.log(Tag, "onPreparedInner mAudioType:" + this.mAudioType.value());
    }

    public abstract void onSeekCompletedInner();

    public int outputDataAppointment() {
        return MediaplayerOutputDataAppointment(this.mJniHandler);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void pause() {
        Logger.log(Tag, "dataStreamInputFuncCallBackT pause");
        this.isAfterSetDataSourceStart = false;
        getAudioTrackPlayThread().pausePlay();
        MediaplayerPause(this.mJniHandler);
        FlvLiveAudioFile flvLiveAudioFile = this.mFlvLiveAudioFile;
        if (flvLiveAudioFile != null) {
            flvLiveAudioFile.release();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void prepareAsync() {
        AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
        if (audioFileRequestHandler != null && audioFileRequestHandler.isRelease()) {
            this.mAudioFileRequestHandler.restart();
        }
        Logger.log(Tag, "prepareAsync");
        if (!this.isBuffing) {
            onInfoInner(701);
        }
        MediaplayerPrepareAsync(this.mJniHandler);
        Logger.log(Tag, "prepareAsync2");
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void release() {
        this.hasRelease = true;
        relaseAudioFile();
        while (MediaplayerReset(this.mJniHandler) < 0) {
            try {
                Thread.sleep(20000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT release");
        releaseAudioTrackPlayThread();
        resetAllData();
        MediaplayerDestroy(this.mJniHandler);
        this.tmepBuf = null;
        this.mTempo = 1.0f;
        this.mPitch = 0.0f;
        this.mRate = 1.0f;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void reset() {
        getAudioTrackPlayThread().flushPlayDataAndPause();
        relaseAudioFile();
        Logger.log(Tag, "reset start");
        this.isReseting = true;
        MediaplayerReset(this.mJniHandler);
        this.isReseting = false;
        Logger.log(Tag, "reset end");
        resetAllData();
    }

    public void resetAllData() {
        this.isAfterSetDataSourceStart = false;
        this.chargeDataRealLength = 0;
        this.mHasSeek = true;
        this.tmepBuf = null;
        this.mCurrentSeekPosition = -1;
        this.mCurrentSeekPositionState = 0;
        this.mCurFileSize = 0L;
        AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
        if (audioFileRequestHandler != null) {
            audioFileRequestHandler.release(AudioFileRequestHandler.RELEASE_TYPE_RESET);
            Logger.log(Tag, "resetAllData mAudioFileRequestHandler.release()");
        } else {
            Logger.log(Tag, "resetAllData mAudioFileRequestHandler null");
        }
        HlsAudioFile hlsAudioFile = this.mHlsAudioFile;
        if (hlsAudioFile != null) {
            hlsAudioFile.release();
            Logger.log(Tag, "resetAllData mHlsAudioFile.release()");
        } else {
            Logger.log(Tag, "resetAllData mHlsAudioFile null");
        }
        FlvLiveAudioFile flvLiveAudioFile = this.mFlvLiveAudioFile;
        if (flvLiveAudioFile != null) {
            flvLiveAudioFile.release();
            Logger.log(Tag, "resetAllData mFlvLiveAudioFile.release()");
        } else {
            Logger.log(Tag, "resetAllData mFlvLiveAudioFile null");
        }
        Logger.log(Tag, "dataStreamInputFuncCallBackT initAllData 重置0");
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void seekTo(int i) {
        if (isHttpFlv()) {
            return;
        }
        Logger.log(Tag, "seekParaTimeStampMs msec:" + i);
        this.isSeeking = true;
        MediaplayerSeek((long) i, this.mJniHandler);
        this.isSeeking = false;
        onSeekCompletedInner();
        mOnTimedChangeListenerInner();
        Logger.log(Tag, "ttseek2:" + System.currentTimeMillis());
    }

    public void setCurFileSize(long j) {
        this.mCurFileSize = j;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(String str) throws Throwable {
        setDataSource(str, (String) null);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPlayDataOutputListener(XMediaPlayer.OnPlayDataOutputListener onPlayDataOutputListener) {
        this.mOnPlayDataOutputListener = onPlayDataOutputListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setPreBufferUrl(String str) {
        AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
        if (audioFileRequestHandler != null) {
            audioFileRequestHandler.setPreBufferUrl(str);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setSoundTouchAllParams(float f, float f2, float f3) {
        this.mTempo = f;
        this.mPitch = f2;
        this.mRate = f3;
        AudioTrackPlayThread audioTrackPlayThread = this.mAudioTrackPlayThread;
        if (audioTrackPlayThread != null) {
            audioTrackPlayThread.setSoundTouchAllParams(f, f2, f3);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setTempo(float f) {
        this.mTempo = f;
        AudioTrackPlayThread audioTrackPlayThread = this.mAudioTrackPlayThread;
        if (audioTrackPlayThread != null) {
            audioTrackPlayThread.setTempo(f);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setVolume(float f, float f2) {
        AudioTrackPlayThread audioTrackPlayThread = getAudioTrackPlayThread();
        if (audioTrackPlayThread != null) {
            audioTrackPlayThread.setVolume(f);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public synchronized void start() {
        Logger.log(Tag, "dataStreamInputFuncCallBackT start mAudioType" + this.mAudioType);
        if (this.mAudioType != AudioType.FLV_FILE || this.isAfterSetDataSourceStart) {
            AudioFileRequestHandler audioFileRequestHandler = this.mAudioFileRequestHandler;
            if (audioFileRequestHandler != null && audioFileRequestHandler.isRelease()) {
                this.mAudioFileRequestHandler.restart();
            }
            getAudioTrackPlayThread().startPlay();
            MediaplayerPlay(this.mJniHandler);
        } else {
            Logger.log(Tag, "FLV_FILE start reset");
            reset();
            setDataSource(this.mPlayUrl);
            prepareAsync();
        }
        this.isAfterSetDataSourceStart = false;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void stop() {
        Logger.log(Tag, "dataStreamInputFuncCallBackT stop");
        getAudioTrackPlayThread().stopPlay();
        relaseAudioFile();
        MediaplayerStop(this.mJniHandler);
        resetAllData();
    }

    public void xmediaplayerInit() {
        this.hasRelease = false;
        Logger.log(Tag, "Mediaplayer Init 0000000000:" + this.mJniHandler);
        this.mJniHandler = MediaplayerInit(this.mContext, this.isRelease, 524288, 65536, 1048576, 1048576);
        Logger.log(Tag, "Mediaplayer Init 1:" + this.mJniHandler);
        Logger.log(Tag, "MediaplayerInit jniHandler:" + this.mJniHandler);
        if (this.mJniHandler == 0) {
            handlePlayerStatus(NativeErrorType.ERR_ARCH_NOT_SUPPORT.value());
        }
        PlayCacheByLRU.getInstance().init();
    }

    public void setDataSource(String str, String str2) throws Throwable {
        double d;
        RandomAccessFile randomAccessFile = null;
        this.mAudioFileRequestHandler = null;
        this.mHlsAudioFile = null;
        this.mFlvLiveAudioFile = null;
        this.isAfterSetDataSourceStart = true;
        Logger.log(Tag, "flushAllDataInSoundTouch setDataSource src:" + str);
        this.chargeDataRealLength = 0;
        releaseAudioTrackPlayThread();
        if (str.contains("totalLength")) {
            String queryParameter = Uri.parse(str).getQueryParameter("totalLength");
            if (!TextUtils.isEmpty(queryParameter)) {
                this.chargeDataRealLength = Integer.parseInt(queryParameter);
                Logger.log(Tag, "chargeDataRealLength:" + this.chargeDataRealLength);
            }
        }
        if (str.endsWith(XMediaPlayerConstants.LOCAL_SERVER_SUFFIX)) {
            this.isLocalServiceSource = true;
        }
        String strReplaceFirst = str.replaceFirst(XMediaPlayerConstants.LOCAL_SERVER_SUFFIX, "");
        this.mPlayUrl = strReplaceFirst;
        if (strReplaceFirst.contains(".flv")) {
            this.mFlvLiveAudioFile = new FlvLiveAudioFile(this);
            AudioType audioType = AudioType.FLV_FILE;
            this.mAudioType = audioType;
            MediaplayerSetDataSourceInfo(this.mPlayUrl, audioType.value(), this.mJniHandler, 0.0d, 0.0d);
        } else if (this.mPlayUrl.contains("m3u8")) {
            this.mHlsAudioFile = new HlsAudioFile(this.mPlayUrl, this);
            AudioType audioType2 = AudioType.M3U8_FILE;
            this.mAudioType = audioType2;
            MediaplayerSetDataSourceInfo(this.mPlayUrl, audioType2.value(), this.mJniHandler, 0.0d, 0.0d);
        } else if (this.mPlayUrl.endsWith(XMediaPlayerConstants.XM_SUFFIX)) {
            this.mAudioFileRequestHandler = new AudioFileRequestHandler(this, this.isLocalServiceSource);
            this.mAudioType = AudioType.XMLY_FORMAT;
            double d2 = 0.0d;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.mPlayUrl, "r");
                try {
                    try {
                        randomAccessFile2.seek(24);
                        d = randomAccessFile2.readDouble();
                        try {
                            d2 = randomAccessFile2.readDouble();
                            try {
                                randomAccessFile2.close();
                            } catch (IOException e) {
                                e = e;
                                e.printStackTrace();
                            }
                        } catch (IOException unused) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    d = 0.0d;
                }
            } catch (IOException unused3) {
                d = 0.0d;
            } catch (Throwable th2) {
                th = th2;
            }
            MediaplayerSetDataSourceInfo(this.mPlayUrl, this.mAudioType.value(), this.mJniHandler, d, d2);
        } else {
            if (str2 == null) {
                this.mAudioFileRequestHandler = new AudioFileRequestHandler(this, this.isLocalServiceSource);
            } else {
                this.mAudioFileRequestHandler = new AudioFileRequestHandler(this, str2, this.isLocalServiceSource);
            }
            AudioType audioType3 = AudioType.NORMAL_FILE;
            this.mAudioType = audioType3;
            MediaplayerSetDataSourceInfo(this.mPlayUrl, audioType3.value(), this.mJniHandler, 0.0d, 0.0d);
        }
        Logger.log(Tag, "setDataSource mAudioType:" + this.mAudioType.value());
        PlayCacheByLRU.getInstance().putPlayUrl(this.mPlayUrl);
    }
}

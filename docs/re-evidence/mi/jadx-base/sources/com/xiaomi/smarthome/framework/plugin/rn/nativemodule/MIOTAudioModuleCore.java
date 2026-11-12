package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnAudioEncoderProvider;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.audio.AudioConvert;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ByteDataBufferCopy;
import com.xiaomi.smarthome.framework.plugin.rn.utils.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import defpackage.ndj;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTAudioModuleCore.NAME)
public class MIOTAudioModuleCore extends MIOTBaseJavaModule implements IMIOTAudio, ReactModuleWithSpec {
    public static final int COMPRESSED_AUDIO_FILE_BIT_RATE = 64000;
    public static final String COMPRESSED_AUDIO_FILE_MIME_TYPE = "audio/mp4a-latm";
    public static final int MIN_VOLUME = 10;
    private static final short MSG_PLAYER_UPDATE_TIME = 1;
    public static final String NAME = "MIOTAudio";
    public static final int SAMPLING_RATE = 48000;
    private static final String TAG = "MIOTAudioModule";
    private byte[] audioPlayerBuffer;
    private ByteDataBufferCopy byteDataBuffer;
    private byte[] g711Buffer;
    private String mAudioPlayerUid;
    private AudioRecord mAudioRecord;
    private AudioTrack mAudioTrack;
    private ByteBuffer mByteBuffer;
    private Handler mHandler;
    private volatile boolean mIsAudioRecording;
    private boolean mIsAudioTrackPlaying;
    private boolean mIsMediaRecording;
    private MediaPlayer mMediaPlayer;
    private MediaRecorder mMediaRecorder;
    private ByteDataBufferCopy mPlayByteDataBuffer;
    private boolean mShouldSendPlayerTime;

    public MIOTAudioModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mMediaRecorder = null;
        this.mMediaPlayer = new MediaPlayer();
        this.mIsMediaRecording = false;
        this.mAudioPlayerUid = "";
        this.mShouldSendPlayerTime = false;
        this.mHandler = null;
        this.mAudioRecord = null;
        this.mIsAudioRecording = false;
        this.mIsAudioTrackPlaying = false;
    }

    private String getPathName(String str) {
        if (str == null) {
            return getFilesPath() + File.separator + "defaultname";
        }
        if (str.startsWith("file://")) {
            return str.substring(7);
        }
        String str2 = File.separator;
        if (str.startsWith(str2)) {
            return str;
        }
        return getFilesPath() + str2 + str;
    }

    private void initHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (MIOTAudioModuleCore.this.mShouldSendPlayerTime && message.what == 1 && MIOTAudioModuleCore.this.mMediaPlayer != null) {
                        try {
                            if (MIOTAudioModuleCore.this.mMediaPlayer.isPlaying()) {
                                MIOTAudioModuleCore.this.getEventProvider().sendAudioPlayerUpdateEvent(MIOTAudioModuleCore.this.mAudioPlayerUid, MIOTAudioModuleCore.this.mMediaPlayer.getCurrentPosition());
                                MIOTAudioModuleCore.this.mHandler.sendEmptyMessageDelayed(1, 1000L);
                            }
                        } catch (IllegalStateException e) {
                            MRnLog.w(MIOTAudioModuleCore.TAG, "sendPlayerEventToJs error:", e);
                        }
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$amrToWav$6(AudioConvert audioConvert, Callback callback) {
        audioConvert.release();
        callback.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAudioRecord$1(String str, String str2, int i, int i2) throws Throwable {
        DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
                    try {
                        byte[] bArr = TextUtils.equals(str2, "G711") ? new byte[i] : new byte[i2];
                        this.mAudioRecord.startRecording();
                        this.mIsAudioRecording = true;
                        this.g711Buffer = new byte[GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH];
                        this.byteDataBuffer = new ByteDataBufferCopy();
                        while (this.mIsAudioRecording) {
                            int i3 = this.mAudioRecord.read(bArr, 0, bArr.length);
                            if (TextUtils.equals(str2, "G711")) {
                                byte[] bArr2 = new byte[i3];
                                System.arraycopy(bArr, 0, bArr2, 0, i3);
                                this.byteDataBuffer.put(bArr2);
                                if (this.byteDataBuffer.take(this.g711Buffer)) {
                                    IRnAudioEncoderProvider iRnAudioEncoderProvider = (IRnAudioEncoderProvider) getProvider(IRnAudioEncoderProvider.class);
                                    byte[] bArr3 = this.g711Buffer;
                                    byte[] bArrEncodeG711 = iRnAudioEncoderProvider.encodeG711(bArr3, 0, bArr3.length);
                                    if (bArrEncodeG711 != null) {
                                        try {
                                            byte[] bArr4 = (byte[]) bArrEncodeG711.clone();
                                            dataOutputStream2.write(bArr4, 0, bArr4.length);
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            } else {
                                dataOutputStream2.write(bArr, 0, i3);
                            }
                            RnPluginLog.i(Thread.currentThread().getName() + "  录制中....");
                        }
                        RnPluginLog.i(Thread.currentThread().getName() + "  录制结束....");
                        stopAudioRecord();
                        dataOutputStream2.flush();
                        dataOutputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        dataOutputStream = dataOutputStream2;
                        e.printStackTrace();
                        if (dataOutputStream == null) {
                            return;
                        }
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAudioTrack$4(Boolean bool, String str, String str2, int i) {
        DataInputStream dataInputStream = null;
        try {
            try {
                dataInputStream = bool.booleanValue() ? new DataInputStream(new BufferedInputStream(new URL(str).openConnection().getInputStream())) : new DataInputStream(new BufferedInputStream(new FileInputStream(str)));
                if (TextUtils.equals(str2, "G711")) {
                    i = 320;
                }
                byte[] bArr = new byte[i];
                int i2 = dataInputStream.read(bArr);
                if (this.mIsAudioTrackPlaying && i2 > 0) {
                    getEventProvider().sendAudioPlayerStartEvent(this.mAudioPlayerUid);
                }
                RnPluginLog.i(Thread.currentThread().getName() + "  开始播放   readCount=" + i2);
                while (this.mIsAudioTrackPlaying && i2 > 0) {
                    if (TextUtils.equals(str2, "G711")) {
                        ((IRnAudioEncoderProvider) getProvider(IRnAudioEncoderProvider.class)).decodeG711(bArr, 0, i, this.audioPlayerBuffer);
                        this.mPlayByteDataBuffer.put((byte[]) this.audioPlayerBuffer.clone());
                        if (this.mPlayByteDataBuffer.take(this.audioPlayerBuffer) && this.mByteBuffer != null) {
                            if (runningOnLollipopOrHigher()) {
                                this.mByteBuffer.clear();
                                this.mByteBuffer.put(this.audioPlayerBuffer);
                                this.mByteBuffer.rewind();
                                AudioTrack audioTrack = this.mAudioTrack;
                                ByteBuffer byteBuffer = this.mByteBuffer;
                                audioTrack.write(byteBuffer, byteBuffer.capacity(), 0);
                            } else {
                                AudioTrack audioTrack2 = this.mAudioTrack;
                                byte[] bArr2 = this.audioPlayerBuffer;
                                audioTrack2.write(bArr2, 0, bArr2.length);
                            }
                            RnPluginLog.i(Thread.currentThread().getName() + "  播放   readCount=" + i2);
                        }
                    } else {
                        this.mAudioTrack.write(bArr, 0, i2);
                        RnPluginLog.i(Thread.currentThread().getName() + "  播放   readCount=" + i2);
                    }
                    i2 = dataInputStream.read(bArr);
                }
                if (i2 <= 0) {
                    getEventProvider().sendAudioPlayerFinishedEvent(this.mAudioPlayerUid);
                }
                RnPluginLog.i(Thread.currentThread().getName() + "  停止播放   readCount=" + i2);
                stopAudioTrack();
            } catch (Throwable th) {
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (dataInputStream == null) {
                return;
            }
        }
        try {
            dataInputStream.close();
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMediaPlayer$2(MediaPlayer mediaPlayer) {
        stopPlay(null);
        getEventProvider().sendAudioPlayerFinishedEvent(this.mAudioPlayerUid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMediaPlayer$3(MediaPlayer mediaPlayer) {
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.start();
        if (this.mShouldSendPlayerTime) {
            this.mHandler.sendEmptyMessageDelayed(1, 1000L);
        }
        getEventProvider().sendAudioPlayerStartEvent(this.mAudioPlayerUid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startMediaRecorder$0(MediaRecorder mediaRecorder, int i, int i2) {
        MRnLog.e("ReactNativeJS", "startMediaRecorder,MediaRecorder get error: what=" + i + ",extra:" + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$wavToAmr$5(AudioConvert audioConvert, Callback callback) {
        audioConvert.release();
        callback.invoke(Boolean.TRUE);
    }

    private static boolean runningOnLollipopOrHigher() {
        return true;
    }

    private void sendPlayerEventToJs(WritableMap writableMap, String str) {
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        writableMap.putString("audioPlayerUid", this.mAudioPlayerUid);
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null) {
            RnPluginLog.e("MIOTAudio reactContext is null ...");
            return;
        }
        RnPluginLog.i("MIOTAudio send event  " + str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    private void startAudioRecord(String str, ReadableMap readableMap) throws Exception {
        final String pathName = getPathName(str);
        MRnLog.i("ReactNativeJS", "录音路径" + pathName);
        File file = new File(pathName);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        try {
            stopAudioRecord();
        } catch (Throwable th) {
            MRnLog.e("ReactNativeJS", Log.getStackTraceString(th));
        }
        int i = MIOTUtils.getInt(readableMap, "AVSampleRateKey");
        int i2 = MIOTUtils.getInt(readableMap, "AVNumberOfChannelsKey");
        int i3 = MIOTUtils.getInt(readableMap, "AVLinearPCMBitDepthKey");
        final String string = MIOTUtils.getString(readableMap, "AVFormatIDKey");
        if (i == 0) {
            i = 44100;
        }
        int i4 = i;
        if (i3 == 0) {
            i3 = 16;
        }
        if (i2 == 0) {
            i2 = 2;
        }
        final int i5 = (i4 * 20) / 1000;
        int i6 = i2 == 1 ? 16 : 12;
        int i7 = i3 == 16 ? 2 : 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i4, i6, i7);
        if (TextUtils.equals(string, "G711") && minBufferSize < i5) {
            minBufferSize = i5;
        }
        this.mAudioRecord = new AudioRecord(1, i4, i6, i7, minBufferSize);
        final int i8 = minBufferSize;
        ThreadPoolManager.executeTask(new Runnable() { // from class: exe
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f17160a.lambda$startAudioRecord$1(pathName, string, i5, i8);
            }
        });
    }

    private void startAudioTrack(String str, ReadableMap readableMap, Callback callback) {
        String pathName = str;
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, "audio path is empty...");
            return;
        }
        boolean z = pathName.startsWith("http://") || pathName.startsWith("https://");
        final Boolean boolValueOf = Boolean.valueOf(z);
        if (!z && !pathName.startsWith("rtsp://")) {
            pathName = getPathName(str);
        }
        final String str2 = pathName;
        if (this.mAudioTrack != null) {
            try {
                stopAudioTrack();
            } catch (Exception unused) {
            }
        }
        this.mAudioPlayerUid = MIOTUtils.getString(readableMap, "audioPlayerUid");
        int i = MIOTUtils.getInt(readableMap, "AVSampleRateKey");
        int i2 = MIOTUtils.getInt(readableMap, "AVNumberOfChannelsKey");
        int i3 = MIOTUtils.getInt(readableMap, "AVLinearPCMBitDepthKey");
        if (i == 0) {
            i = 44100;
        }
        int i4 = i;
        if (i3 == 0) {
            i3 = 16;
        }
        if (i2 == 0) {
            i2 = 2;
        }
        final String string = MIOTUtils.getString(readableMap, "AVFormatIDKey");
        int i5 = i2 == 1 ? 4 : 12;
        int i6 = i3 == 16 ? 2 : 3;
        final int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
        this.mAudioTrack = new AudioTrack(3, i4, i5, i6, minBufferSize, 1);
        ByteDataBufferCopy byteDataBufferCopy = this.mPlayByteDataBuffer;
        if (byteDataBufferCopy != null) {
            byteDataBufferCopy.clear();
            this.mPlayByteDataBuffer = null;
        }
        initBuffer(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
        this.mPlayByteDataBuffer = new ByteDataBufferCopy();
        this.mIsAudioTrackPlaying = true;
        this.mAudioTrack.play();
        callback.invoke(Boolean.TRUE);
        ThreadPoolManager.executeTask(new Runnable() { // from class: ywe
            @Override // java.lang.Runnable
            public final void run() {
                this.f40640a.lambda$startAudioTrack$4(boolValueOf, str2, string, minBufferSize);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0017, B:19:0x0032, B:21:0x004a, B:23:0x0050, B:25:0x0056, B:27:0x005c, B:29:0x0062, B:31:0x008c, B:33:0x0090, B:35:0x009b, B:39:0x00ab, B:43:0x00c6, B:44:0x00ca, B:34:0x0098, B:18:0x002c, B:14:0x0023), top: B:48:0x000b }] */
    private void startMediaPlayer(String str, ReadableMap readableMap, Callback callback) {
        String pathName;
        initHandler();
        if (str != null) {
            try {
                if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("rtsp://")) {
                    pathName = str;
                } else {
                    pathName = getPathName(str);
                }
            } catch (Exception e) {
                callback.invoke(Boolean.FALSE, Log.getStackTraceString(e));
                return;
            }
        } else {
            pathName = getPathName(str);
        }
        this.mShouldSendPlayerTime = readableMap == null ? false : readableMap.hasKey("updateAudioPlayerTimeInterval");
        this.mAudioPlayerUid = MIOTUtils.getString(readableMap, "audioPlayerUid");
        String string = MIOTUtils.getString(readableMap, "streamType");
        int i = 2;
        if (!TextUtils.isEmpty(pathName) && !pathName.startsWith("http://") && !pathName.startsWith("https://") && !pathName.startsWith("rtsp://") && !FileUtils.fileExists(pathName)) {
            RnPluginLog.w("startMediaPlayer, audio file not exist: aPath=" + str + ", pathName=" + pathName);
            callback.invoke(Boolean.FALSE, "audio file not exist");
            return;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            this.mMediaPlayer = new MediaPlayer();
        } else {
            mediaPlayer.reset();
        }
        this.mMediaPlayer.setDataSource(pathName);
        if (!TextUtils.equals(string, "ring")) {
            i = 3;
        }
        this.mMediaPlayer.setAudioStreamType(i);
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(i);
        if (i == 3 && streamMaxVolume < 10) {
            audioManager.setStreamVolume(i, 10, 4);
        }
        this.mMediaPlayer.setLooping(false);
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: cxe
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.f14828a.lambda$startMediaPlayer$2(mediaPlayer2);
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: dxe
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.f16031a.lambda$startMediaPlayer$3(mediaPlayer2);
            }
        });
        this.mMediaPlayer.prepareAsync();
        callback.invoke(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:135:0x0200  */
    /* JADX WARN: Code duplicated, block: B:136:0x0206  */
    /* JADX WARN: Code duplicated, block: B:137:0x020c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0211 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:159:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void startMediaRecorder(String str, ReadableMap readableMap) throws Exception {
        byte b2;
        String pathName = getPathName(str);
        MRnLog.i("ReactNativeJS", "录音路径" + pathName);
        File file = new File(pathName);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        try {
            stopMediaRecorder();
        } catch (Throwable th) {
            MRnLog.e("ReactNativeJS", Log.getStackTraceString(th));
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        int i = MIOTUtils.getInt(readableMap, "AVSampleRateKey");
        int i2 = MIOTUtils.getInt(readableMap, "AVNumberOfChannelsKey");
        int i3 = MIOTUtils.getInt(readableMap, "AVLinearPCMBitDepthKey");
        String string = MIOTUtils.getString(readableMap, "AVFormatIDKey");
        String string2 = MIOTUtils.getString(readableMap, "AVEncoderAudioQualityKey");
        MediaRecorder mediaRecorder2 = this.mMediaRecorder;
        if (i == 0) {
            i = 44100;
        }
        mediaRecorder2.setAudioSamplingRate(i);
        MediaRecorder mediaRecorder3 = this.mMediaRecorder;
        if (i3 == 0) {
            i3 = 16;
        }
        mediaRecorder3.setAudioEncodingBitRate(i3);
        MediaRecorder mediaRecorder4 = this.mMediaRecorder;
        if (i2 == 0) {
            i2 = 2;
        }
        mediaRecorder4.setAudioChannels(i2);
        string.hashCode();
        switch (string.hashCode()) {
            case -1186453540:
                b2 = !string.equals("audioFormat60958AC3") ? (byte) -1 : (byte) 0;
                break;
            case -1061120799:
                b2 = !string.equals("audioFormatMPEG4AAC") ? (byte) -1 : (byte) 1;
                break;
            case -853164747:
                b2 = !string.equals("MPEG4CELP") ? (byte) -1 : (byte) 2;
                break;
            case -852999096:
                b2 = !string.equals("MPEG4HVXC") ? (byte) -1 : (byte) 3;
                break;
            case -295359931:
                b2 = !string.equals("audioFormatMPEG4TwinVQ") ? (byte) -1 : (byte) 4;
                break;
            case 64593:
                b2 = !string.equals("AC3") ? (byte) -1 : (byte) 5;
                break;
            case 64934:
                b2 = !string.equals("AMR") ? (byte) -1 : (byte) 6;
                break;
            case 739019185:
                b2 = !string.equals("audioFormatAMR_WB") ? (byte) -1 : (byte) 7;
                break;
            case 955522415:
                b2 = !string.equals("60958AC3") ? (byte) -1 : (byte) 8;
                break;
            case 981198802:
                b2 = !string.equals("MPEG4TwinVQ") ? (byte) -1 : (byte) 9;
                break;
            case 1080855156:
                b2 = !string.equals("MPEG4AAC") ? (byte) -1 : (byte) 10;
                break;
            case 1465057384:
                b2 = !string.equals("audioFormatMPEG4CELP") ? (byte) -1 : (byte) 11;
                break;
            case 1465223035:
                b2 = !string.equals("audioFormatMPEG4HVXC") ? (byte) -1 : AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                break;
            case 1934542852:
                b2 = !string.equals("AMR_WB") ? (byte) -1 : HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                break;
            case 2036425156:
                b2 = !string.equals("audioFormatAC3") ? (byte) -1 : HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                break;
            case 2036425497:
                b2 = !string.equals("audioFormatAMR") ? (byte) -1 : (byte) 15;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 5:
            case 8:
            case 14:
                this.mMediaRecorder.setOutputFormat(6);
                string2.hashCode();
                switch (string2) {
                    case "Medium":
                    case "audioQualityLow":
                    case "Low":
                    case "audioQualityMedium":
                        this.mMediaRecorder.setAudioEncoder(5);
                    case "audioQualityMax":
                    case "Max":
                    case "High":
                    case "audioQualityHigh":
                        this.mMediaRecorder.setAudioEncoder(4);
                        break;
                    case "audioQualityMin":
                    case "Min":
                        this.mMediaRecorder.setAudioEncoder(3);
                        break;
                    default:
                        this.mMediaRecorder.setAudioEncoder(0);
                        break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 12:
                this.mMediaRecorder.setOutputFormat(2);
                string2.hashCode();
                switch (string2) {
                    case -1994163307:
                        if (!string2.equals("Medium")) {
                        }
                        break;
                    case -1636599221:
                        if (!string2.equals("audioQualityLow")) {
                        }
                        break;
                    case -1636598693:
                        if (!string2.equals("audioQualityMax")) {
                        }
                        break;
                    case -1636598455:
                        if (!string2.equals("audioQualityMin")) {
                        }
                        break;
                    case 76596:
                        if (!string2.equals("Low")) {
                        }
                        break;
                    case 77124:
                        if (!string2.equals("Max")) {
                        }
                        break;
                    case 77362:
                        if (!string2.equals("Min")) {
                        }
                        break;
                    case 2249154:
                        if (!string2.equals("High")) {
                        }
                        break;
                    case 560283934:
                        if (!string2.equals("audioQualityMedium")) {
                        }
                        break;
                    case 804906379:
                        if (!string2.equals("audioQualityHigh")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 734
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore.startMediaRecorder(java.lang.String, com.facebook.react.bridge.ReadableMap):void");
            }

            private synchronized void stopAudioRecord() throws Exception {
                try {
                    RnPluginLog.i(Thread.currentThread().getName() + "  stopAudioRecord...mIsAudioRecording=" + this.mIsAudioRecording);
                    this.mIsAudioRecording = false;
                    AudioRecord audioRecord = this.mAudioRecord;
                    if (audioRecord != null) {
                        audioRecord.stop();
                        this.mAudioRecord.release();
                        this.mAudioRecord = null;
                    }
                    ByteDataBufferCopy byteDataBufferCopy = this.byteDataBuffer;
                    if (byteDataBufferCopy != null) {
                        byteDataBufferCopy.clear();
                        this.byteDataBuffer = null;
                    }
                    this.g711Buffer = null;
                } catch (Throwable th) {
                    throw th;
                }
            }

            private synchronized void stopAudioTrack() throws Exception {
                try {
                    RnPluginLog.i(Thread.currentThread().getName() + "  stopPlayTrack...");
                    this.mIsAudioTrackPlaying = false;
                    AudioTrack audioTrack = this.mAudioTrack;
                    if (audioTrack != null) {
                        if (audioTrack.getPlayState() == 3) {
                            this.mAudioTrack.flush();
                            this.mAudioTrack.stop();
                        }
                        this.mAudioTrack.release();
                        this.mAudioTrack = null;
                    }
                    ByteDataBufferCopy byteDataBufferCopy = this.mPlayByteDataBuffer;
                    if (byteDataBufferCopy != null) {
                        byteDataBufferCopy.clear();
                        this.mPlayByteDataBuffer = null;
                    }
                    this.audioPlayerBuffer = null;
                    ByteBuffer byteBuffer = this.mByteBuffer;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                        this.mByteBuffer = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }

            private void stopMediaPlayer() throws Exception {
                MediaPlayer mediaPlayer = this.mMediaPlayer;
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        this.mMediaPlayer.stop();
                    }
                    this.mMediaPlayer.reset();
                    this.mMediaPlayer.release();
                    this.mMediaPlayer = null;
                }
            }

            private void stopMediaRecorder() throws Exception {
                if (this.mMediaRecorder != null) {
                    RnPluginLog.i("MIOTAudioModule  MediaRecorder will stop...");
                    this.mMediaRecorder.stop();
                    this.mMediaRecorder.release();
                    this.mMediaRecorder = null;
                }
                this.mIsMediaRecording = false;
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void amrToWav(String str, String str2, final Callback callback) {
                try {
                    final AudioConvert audioConvert = new AudioConvert();
                    audioConvert.setEncodeType("audio/x-wav");
                    audioConvert.setIOPath(getPathName(str), getPathName(str2));
                    audioConvert.prepare();
                    audioConvert.startAsync();
                    audioConvert.setOnCompleteListener(new AudioConvert.OnCompleteListener() { // from class: bxe
                        @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.audio.AudioConvert.OnCompleteListener
                        public final void completed() {
                            MIOTAudioModuleCore.lambda$amrToWav$6(audioConvert, callback);
                        }
                    });
                } catch (Throwable th) {
                    callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
                }
            }

            @Override // com.facebook.react.bridge.BaseJavaModule
            public Map<String, Object> getConstants() {
                HashMap map = new HashMap();
                map.put("isAbleToRecord", Boolean.valueOf(getReactApplicationContext().checkPermission("android.permission.RECORD_AUDIO", Process.myPid(), Process.myUid()) == 0));
                return map;
            }

            @Override // com.facebook.react.bridge.NativeModule
            public String getName() {
                return NAME;
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void getRecordingPeakPower(Callback callback) {
                int maxAmplitude;
                if (callback == null) {
                    return;
                }
                MediaRecorder mediaRecorder = this.mMediaRecorder;
                if (mediaRecorder == null) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("MediaRecorder is not init..."));
                    return;
                }
                if (!this.mIsMediaRecording) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("MediaRecorder is not recording..."));
                    return;
                }
                try {
                    maxAmplitude = mediaRecorder.getMaxAmplitude();
                } catch (IllegalStateException e) {
                    RnPluginLog.e(e.toString());
                    maxAmplitude = 0;
                }
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(Integer.valueOf(maxAmplitude)));
            }

            public void initBuffer(int i) {
                ByteDataBufferCopy byteDataBufferCopy = this.mPlayByteDataBuffer;
                if (byteDataBufferCopy != null) {
                    byteDataBufferCopy.clear();
                }
                this.audioPlayerBuffer = new byte[i];
                ByteBuffer byteBuffer = this.mByteBuffer;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                }
                this.mByteBuffer = ByteBuffer.allocateDirect(i);
            }

            @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
            public void onCatalystInstanceDestroy() {
                try {
                    stopMediaPlayer();
                } catch (Exception unused) {
                }
                try {
                    stopAudioTrack();
                } catch (Exception unused2) {
                }
                try {
                    stopMediaRecorder();
                } catch (Exception unused3) {
                }
                try {
                    stopAudioRecord();
                } catch (Exception unused4) {
                }
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void startPlay(String str, ReadableMap readableMap, Callback callback) {
                if (TextUtils.isEmpty(str)) {
                    callback.invoke(Boolean.FALSE, "audio player path is empty...");
                } else if ("audioTrack".equals(MIOTUtils.getString(readableMap, "playerType", "mediaPlayer"))) {
                    startAudioTrack(str, readableMap, callback);
                } else {
                    startMediaPlayer(str, readableMap, callback);
                }
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void startRecord(String str, ReadableMap readableMap, Callback callback) {
                if (TextUtils.isEmpty(str)) {
                    callback.invoke(Boolean.FALSE, "audioName is empty...");
                    return;
                }
                if ("audioRecord".equals(MIOTUtils.getString(readableMap, "RecordType", "mediaRecord"))) {
                    try {
                        startAudioRecord(str, readableMap);
                        callback.invoke(Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        callback.invoke(Boolean.FALSE, e.toString());
                        return;
                    }
                }
                try {
                    startMediaRecorder(str, readableMap);
                    callback.invoke(Boolean.TRUE);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    callback.invoke(Boolean.FALSE, e2.toString());
                }
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void stopPlay(Callback callback) {
                try {
                    stopMediaPlayer();
                    stopAudioTrack();
                    if (callback != null) {
                        callback.invoke(Boolean.TRUE);
                    }
                } catch (Exception e) {
                    if (callback != null) {
                        callback.invoke(Boolean.FALSE, Log.getStackTraceString(e));
                    }
                }
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void stopRecord(Callback callback) {
                try {
                    stopMediaRecorder();
                    stopAudioRecord();
                    callback.invoke(Boolean.TRUE);
                } catch (Exception e) {
                    callback.invoke(Boolean.FALSE, e.toString());
                }
            }

            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAudio
            @ReactMethod
            public void wavToAmr(String str, String str2, final Callback callback) {
                try {
                    final AudioConvert audioConvert = new AudioConvert();
                    audioConvert.setEncodeType("audio/amr-wb");
                    audioConvert.setIOPath(getPathName(str), getPathName(str2));
                    audioConvert.prepare();
                    audioConvert.startAsync();
                    audioConvert.setOnCompleteListener(new AudioConvert.OnCompleteListener() { // from class: axe
                        @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.audio.AudioConvert.OnCompleteListener
                        public final void completed() {
                            MIOTAudioModuleCore.lambda$wavToAmr$5(audioConvert, callback);
                        }
                    });
                } catch (Throwable th) {
                    callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
                }
            }
        }

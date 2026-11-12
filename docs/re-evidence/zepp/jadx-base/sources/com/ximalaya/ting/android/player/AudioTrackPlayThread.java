package com.ximalaya.ting.android.player;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import com.ximalaya.ting.android.player.soundtouch.SoundTouch;
import com.ximalaya.ting.android.player.soundtouch.SoundTouchDataModel;

/* JADX INFO: loaded from: classes22.dex */
public class AudioTrackPlayThread extends Thread {
    public static final int AUDIO_CHANNEL = 12;
    public static final int AUDIO_CHANNEL_NUM = 2;
    public static final int AUDIO_FORMAT = 2;
    public static final int BUFFER_TIME = 1;
    public static final int BYTES_PER_SAMPLE = 2;
    public static final int DEFAULT_MIN_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static int DEF_MAX_BUFF_SIZE = 16384;
    private static int DEF_MIN_BUFF_SIZE = 8192;
    private static int NO_MORE_DECODE_DATA = -2;
    public static final int PLAYBACK_STREAM = 3;
    public static final int SAMPLE_RATE = 44100;
    public static final int WRITE_NON_BLOCKING = 1;
    private volatile boolean isPlaying;
    private volatile boolean isRelaseFlag;
    private boolean isRunning;
    private volatile boolean isWaiting;
    private long lastUpdateTime;
    private volatile AudioTrack mAudioTrack;
    private byte[] mAudiodata;
    private int mBufferSize;
    private SoundTouch mSoundTouch;
    private float mVolume;
    private XMediaplayerJNI mXMediaplayerJNI;
    private boolean shallHandleInSoundTouch;
    private Object syncObject;
    private byte[] tempBuf;
    private int trackId;

    public AudioTrackPlayThread(XMediaplayerJNI xMediaplayerJNI) {
        super("AudioTrackPlayThreadForPlayer");
        this.isRelaseFlag = false;
        this.isRunning = false;
        this.syncObject = new Object();
        this.isWaiting = false;
        this.lastUpdateTime = 0L;
        this.mSoundTouch = null;
        this.trackId = 0;
        this.shallHandleInSoundTouch = false;
        this.isPlaying = false;
        this.mXMediaplayerJNI = xMediaplayerJNI;
        setPriority(10);
        initAudioTrack();
    }

    private synchronized void audioTrackRelease() {
        this.isPlaying = false;
        this.isRelaseFlag = true;
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread audioTrackRelease");
        if (this.mAudioTrack != null) {
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
        this.mSoundTouch = null;
    }

    private synchronized void audioTrackStart() {
        if (this.mAudioTrack == null) {
            return;
        }
        if (this.mAudioTrack.getState() == 1 && this.mAudioTrack.getPlayState() != 3) {
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay3");
            this.mAudioTrack.play();
            this.isPlaying = true;
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay4");
        } else if (this.mAudioTrack != null) {
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay5");
            this.mAudioTrack.release();
            initAudioTrack();
            this.mAudioTrack.play();
            this.isPlaying = true;
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay6");
        } else {
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay7");
            initAudioTrack();
            this.mAudioTrack.play();
            this.isPlaying = true;
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay8");
        }
    }

    private int audioTrackWrite(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z = true;
        if (this.mXMediaplayerJNI.getAudioTrackPlayThread() != this) {
            this.isRelaseFlag = true;
            return 0;
        }
        if (this.mSoundTouch != null && this.shallHandleInSoundTouch && this.mXMediaplayerJNI.getAudioType().equals(XMediaplayerJNI.AudioType.NORMAL_FILE)) {
            SoundTouchDataModel soundTouchDataModel = new SoundTouchDataModel(bArr, i);
            i = this.mSoundTouch.processBytes(soundTouchDataModel);
            bArr = soundTouchDataModel.outputDataBuf;
            if (i == 0 || bArr == null || bArr.length == 0) {
                return 0;
            }
        } else {
            z = false;
        }
        if (this.mAudioTrack == null || this.mAudioTrack.getPlayState() != 3) {
            i2 = 0;
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
            while (i > 0 && this.isPlaying && bArr != null && !this.isRelaseFlag) {
                if (this.mAudioTrack != null && this.mAudioTrack.getPlayState() == 3) {
                    int iWrite = this.mAudioTrack.write(bArr, i2, i);
                    if (iWrite <= 0) {
                        break;
                    }
                    i3 += iWrite;
                    i2 += iWrite;
                    i -= iWrite;
                }
            }
        }
        if (i > 0 && !z) {
            byte[] bArr2 = new byte[i];
            this.tempBuf = bArr2;
            System.arraycopy(bArr, i2, bArr2, 0, i);
        }
        if (i3 > 0 && this.mXMediaplayerJNI.mOnPlayDataOutputListener != null) {
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 0, bArr3, 0, i3);
            this.mXMediaplayerJNI.mOnPlayDataOutputListener.onPlayDataOutput(bArr3);
        }
        return i3;
    }

    private void flushAllDataInSoundTouch() {
        if (this.mSoundTouch != null && this.shallHandleInSoundTouch && this.mXMediaplayerJNI.getAudioType().equals(XMediaplayerJNI.AudioType.NORMAL_FILE)) {
            Logger.log("flushAllDataInSoundTouch 0");
            SoundTouchDataModel soundTouchDataModel = new SoundTouchDataModel();
            int iProcessBytes = this.mSoundTouch.processBytes(soundTouchDataModel);
            byte[] bArr = soundTouchDataModel.outputDataBuf;
            if (iProcessBytes == 0 || bArr == null || bArr.length == 0) {
                Logger.log("flushAllDataInSoundTouch 1");
                return;
            }
            int i = 0;
            if (this.mAudioTrack != null && this.mAudioTrack.getPlayState() == 3) {
                while (iProcessBytes > 0 && this.isPlaying && !this.isRelaseFlag) {
                    if (this.mAudioTrack != null && this.mAudioTrack.getPlayState() == 3) {
                        int iWrite = this.mAudioTrack.write(bArr, i, iProcessBytes);
                        if (iWrite <= 0) {
                            break;
                        }
                        i += iWrite;
                        iProcessBytes -= iWrite;
                    }
                }
            }
            Logger.log("flushAllDataInSoundTouch 2");
        }
    }

    private void initAudioTrack() {
        Logger.log(XMediaplayerJNI.Tag, "initAudioTrack");
        int minBufferSize = AudioTrack.getMinBufferSize(44100, 12, 2);
        this.mBufferSize = minBufferSize * 4;
        int i = DEF_MIN_BUFF_SIZE;
        if (minBufferSize < i) {
            this.mBufferSize = i;
        } else {
            int i2 = DEF_MAX_BUFF_SIZE;
            if (minBufferSize > i2) {
                this.mBufferSize = i2;
            } else {
                this.mBufferSize = minBufferSize;
            }
        }
        this.mAudioTrack = new AudioTrack(3, 44100, 12, 2, this.mBufferSize, 1);
        this.mAudiodata = new byte[this.mBufferSize];
    }

    @TargetApi(21)
    private static void setVolumeV21(AudioTrack audioTrack, float f) {
        if (audioTrack != null) {
            audioTrack.setVolume(f * AudioTrack.getMaxVolume());
        }
    }

    private static void setVolumeV3(AudioTrack audioTrack, float f) {
        if (audioTrack == null) {
            return;
        }
        audioTrack.setStereoVolume(AudioTrack.getMaxVolume() * f, f * AudioTrack.getMaxVolume());
    }

    public void dataReady() {
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread dataReady");
        if (this.isWaiting) {
            synchronized (this.syncObject) {
                Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread notify");
                this.syncObject.notify();
            }
        }
    }

    public void flushPlayData() {
        synchronized (this.syncObject) {
            this.tempBuf = null;
            if (this.mAudioTrack != null && !this.isRelaseFlag) {
                this.mAudioTrack.flush();
            }
        }
    }

    public void flushPlayDataAndPause() {
        pausePlay();
        flushPlayData();
    }

    public int getMinOutputBufferSize() {
        return this.mBufferSize;
    }

    public float getVolume() {
        return this.mVolume;
    }

    public boolean isPlaying() {
        return this.mAudioTrack != null && this.mAudioTrack.getPlayState() == 3;
    }

    public boolean isRelase() {
        return this.isRelaseFlag;
    }

    public synchronized void pausePlay() {
        if (this.mAudioTrack == null) {
            return;
        }
        this.isPlaying = false;
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread pausePlay0");
        if (this.mAudioTrack.getPlayState() == 3) {
            this.mAudioTrack.pause();
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread pausePlay1");
        }
    }

    public synchronized void releasePlay() {
        this.isPlaying = false;
        this.isRelaseFlag = true;
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread releasePlay");
        interrupt();
        if (!this.isRunning) {
            audioTrackRelease();
        }
        synchronized (this.syncObject) {
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread releasePlay notify");
            this.syncObject.notify();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int outputData;
        Process.setThreadPriority(-19);
        this.isRunning = true;
        while (!this.isRelaseFlag) {
            try {
                synchronized (this.syncObject) {
                    if (!this.isRelaseFlag) {
                        byte[] bArr = this.tempBuf;
                        if (bArr != null) {
                            System.arraycopy(bArr, 0, this.mAudiodata, 0, bArr.length);
                            outputData = this.tempBuf.length;
                            this.tempBuf = null;
                        } else {
                            XMediaplayerJNI xMediaplayerJNI = this.mXMediaplayerJNI;
                            byte[] bArr2 = this.mAudiodata;
                            outputData = xMediaplayerJNI.getOutputData(bArr2, bArr2.length);
                        }
                        int iAudioTrackWrite = -1;
                        if (outputData > 0) {
                            while (outputData < this.mBufferSize && !this.isRelaseFlag) {
                                int i = this.mBufferSize - outputData;
                                byte[] bArr3 = new byte[i];
                                if (!this.isRelaseFlag) {
                                    int outputData2 = this.mXMediaplayerJNI.getOutputData(bArr3, i);
                                    int i2 = NO_MORE_DECODE_DATA;
                                    if (outputData2 != i2) {
                                        if (outputData2 != -1) {
                                            if (outputData2 > 0) {
                                                System.arraycopy(bArr3, 0, this.mAudiodata, outputData, outputData2);
                                                outputData += outputData2;
                                            } else if (outputData2 == 0) {
                                                this.isWaiting = true;
                                                Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread mAudioTrack wait0");
                                                this.mXMediaplayerJNI.outputDataAppointment();
                                                if (!this.mXMediaplayerJNI.isBuffing && this.mXMediaplayerJNI.getPlayState() == 4) {
                                                    this.mXMediaplayerJNI.onInfoInner(701);
                                                }
                                                this.syncObject.wait(30000L);
                                                this.isWaiting = false;
                                            }
                                        }
                                        outputData = -1;
                                        break;
                                    }
                                    outputData = i2;
                                    break;
                                }
                                break;
                            }
                        }
                        if (!this.isRelaseFlag) {
                            if (outputData == NO_MORE_DECODE_DATA) {
                                Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread decode over");
                                if (this.mXMediaplayerJNI.isBuffing) {
                                    this.mXMediaplayerJNI.onInfoInner(702);
                                }
                                flushAllDataInSoundTouch();
                                this.mAudioTrack.stop();
                                this.mXMediaplayerJNI.onCompletionInner();
                            } else {
                                if (outputData != -1) {
                                    if (outputData == 0) {
                                        this.isWaiting = true;
                                        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread wait");
                                        this.mXMediaplayerJNI.outputDataAppointment();
                                        if (!this.mXMediaplayerJNI.isBuffing && this.mXMediaplayerJNI.getPlayState() == 4) {
                                            this.mXMediaplayerJNI.onInfoInner(701);
                                        }
                                        this.syncObject.wait(30000L);
                                        this.isWaiting = false;
                                        iAudioTrackWrite = outputData;
                                    } else if (outputData > 0) {
                                        if (this.mXMediaplayerJNI.isBuffing) {
                                            this.mXMediaplayerJNI.onInfoInner(702);
                                        }
                                        iAudioTrackWrite = audioTrackWrite(this.mAudiodata, outputData);
                                        if (System.currentTimeMillis() - this.lastUpdateTime >= 1000) {
                                            this.lastUpdateTime = System.currentTimeMillis();
                                            this.mXMediaplayerJNI.mOnTimedChangeListenerInner();
                                        }
                                    }
                                }
                                if (iAudioTrackWrite < 0) {
                                    this.mXMediaplayerJNI.onErrorInner(8, 1);
                                } else {
                                    while (!this.isPlaying && !this.isRelaseFlag) {
                                        this.isWaiting = true;
                                        this.syncObject.wait(30000L);
                                        this.isWaiting = false;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.isRunning = false;
        stopPlay();
        audioTrackRelease();
    }

    public synchronized void setSoundTouchAllParams(float f, float f2, float f3) {
        if (!this.isRelaseFlag && SoundTouch.ENABLE_SOUND_TOUCH) {
            if (this.mSoundTouch == null) {
                this.mSoundTouch = SoundTouch.getInstance();
            }
            this.shallHandleInSoundTouch = true;
            this.mSoundTouch.setTempo(f);
            this.mSoundTouch.setPitchSemiTones(f2);
            this.mSoundTouch.setRate(f3);
            if (f == 1.0f && f2 == 0.0f && f3 == 1.0f) {
                this.shallHandleInSoundTouch = false;
            }
        }
    }

    public void setTempo(float f) {
        setSoundTouchAllParams(f, 0.0f, 1.0f);
    }

    public synchronized void setVolume(float f) {
        this.mVolume = f;
        if (this.mAudioTrack != null && !this.isRelaseFlag) {
            if (Build.VERSION.SDK_INT >= 21) {
                setVolumeV21(this.mAudioTrack, f);
            } else {
                setVolumeV3(this.mAudioTrack, f);
            }
        }
    }

    public synchronized void startPlay() {
        if (this.mAudioTrack == null) {
            return;
        }
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay0");
        if (this.mAudioTrack.getPlayState() != 3) {
            audioTrackStart();
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay1");
        }
        dataReady();
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay isRunning0");
        if (!this.isRunning) {
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread startPlay isRunning1");
            this.isRunning = true;
            start();
        }
    }

    public synchronized void stopPlay() {
        if (this.mAudioTrack == null) {
            return;
        }
        this.isPlaying = false;
        Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread stopPlay0");
        if (this.mAudioTrack.getPlayState() != 1) {
            this.mAudioTrack.stop();
            this.mAudioTrack.flush();
            Logger.log(XMediaplayerJNI.Tag, "AudioTrackPlayThread stopPlay1");
        }
    }

    @Override // java.lang.Thread
    public String toString() {
        return super.toString() + "." + hashCode();
    }
}

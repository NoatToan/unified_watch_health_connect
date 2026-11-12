package ohos.ace.plugin.audiocapturer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class AudioCapturerPlugin {
    private static final String LOG_TAG = "AudioCapturerPlugin";
    private Context appContext;
    private Map<Long, AudioRecord> mAudioRecords = new HashMap();
    private Map<Long, OnRecordPositionUpdateListenerImpl> positionUpdateListeners = new HashMap();
    private Map<Long, OnRoutingChangedListenerImpl> deviceChangeListeners = new HashMap();
    private Map<Long, OnInfoChangedListenerImpl> infoChangeListeners = new HashMap();

    protected native void nativeInit();

    protected native void nativeOnInfoChanged(long j, AudioDeviceInfo audioDeviceInfo);

    protected native void nativeOnMarkerReached(long j, int i);

    protected native void nativeOnPeriodicNotification(long j, int i);

    protected native void nativeOnRoutingChanged(long j, AudioDeviceInfo audioDeviceInfo);

    public AudioCapturerPlugin(Context context) {
        if (context == null) {
            ALog.e(LOG_TAG, "context is null");
        } else {
            this.appContext = context;
            nativeInit();
        }
    }

    public int createAudioRecord(long j, int i, int i2, int i3, int i4) {
        ALog.i(LOG_TAG, "create audioRecord");
        if (this.mAudioRecords.get(Long.valueOf(j)) != null) {
            return 0;
        }
        if (i4 == 1 && this.appContext.getPackageManager().checkPermission("android.permission.RECORD_AUDIO", this.appContext.getPackageName()) != 0) {
            ALog.e(LOG_TAG, "No microphone permission.createAudioRecord failed.");
            return -3;
        }
        this.mAudioRecords.put(Long.valueOf(j), new AudioRecord.Builder().setAudioSource(i4).setAudioFormat(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i).setChannelIndexMask(i2).build()).build());
        return 0;
    }

    public void finalize(long j) {
        this.mAudioRecords.remove(Long.valueOf(j));
        this.positionUpdateListeners.remove(Long.valueOf(j));
        this.deviceChangeListeners.remove(Long.valueOf(j));
        this.infoChangeListeners.remove(Long.valueOf(j));
    }

    public void startRecording(long j) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return;
        }
        audioRecord.startRecording();
        if (audioRecord.getRecordingState() == 3) {
            ALog.i(LOG_TAG, "audioRecord start success");
        } else {
            ALog.e(LOG_TAG, "audioRecord start failed");
        }
    }

    public void stop(long j) {
        ALog.i(LOG_TAG, "audioRecord stop");
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
        } else {
            audioRecord.stop();
        }
    }

    public void release(long j) {
        ALog.i(LOG_TAG, "audioRecord release");
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
        } else {
            audioRecord.release();
            finalize(j);
        }
    }

    public int getMinBufferSize(long j, int i, int i2, int i3) {
        if (this.mAudioRecords.get(Long.valueOf(j)) == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return -1;
        }
        return AudioRecord.getMinBufferSize(i, i2, i3);
    }

    public int read(long j, byte[] bArr, int i) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "read error, audioRecord is null");
            return -1;
        }
        int i2 = audioRecord.read(bArr, 0, i);
        if (i2 < 0) {
            ALog.e(LOG_TAG, "audioRecord read error:" + i2);
        }
        return i2;
    }

    public int getAudioSource(long j) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return -1;
        }
        return audioRecord.getAudioSource();
    }

    public int setNotificationMarkerPosition(long j, int i) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return -3;
        }
        return audioRecord.setNotificationMarkerPosition(i);
    }

    public void setRecordPositionUpdateListener(long j) {
        if (this.positionUpdateListeners.get(Long.valueOf(j)) != null) {
            return;
        }
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return;
        }
        OnRecordPositionUpdateListenerImpl onRecordPositionUpdateListenerImpl = new OnRecordPositionUpdateListenerImpl();
        audioRecord.setRecordPositionUpdateListener(onRecordPositionUpdateListenerImpl);
        this.positionUpdateListeners.put(Long.valueOf(j), onRecordPositionUpdateListenerImpl);
    }

    public void unsetRecordPositionUpdateListener(long j) {
        if (this.positionUpdateListeners.get(Long.valueOf(j)) == null) {
            return;
        }
        this.positionUpdateListeners.remove(Long.valueOf(j));
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
        } else {
            audioRecord.setRecordPositionUpdateListener(null);
        }
    }

    public int setPositionNotificationPeriod(long j, int i) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return -3;
        }
        return audioRecord.setPositionNotificationPeriod(i);
    }

    public void addOnRoutingChangedListener(long j) {
        if (this.deviceChangeListeners.get(Long.valueOf(j)) != null) {
            return;
        }
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return;
        }
        OnRoutingChangedListenerImpl onRoutingChangedListenerImpl = new OnRoutingChangedListenerImpl();
        audioRecord.addOnRoutingChangedListener(onRoutingChangedListenerImpl, (Handler) null);
        this.deviceChangeListeners.put(Long.valueOf(j), onRoutingChangedListenerImpl);
    }

    public void addOnInfoChangedListener(long j) {
        if (this.infoChangeListeners.get(Long.valueOf(j)) != null) {
            return;
        }
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return;
        }
        OnInfoChangedListenerImpl onInfoChangedListenerImpl = new OnInfoChangedListenerImpl();
        audioRecord.addOnRoutingChangedListener(onInfoChangedListenerImpl, (Handler) null);
        this.infoChangeListeners.put(Long.valueOf(j), onInfoChangedListenerImpl);
    }

    public void removeOnRoutingChangedListener(long j) {
        OnRoutingChangedListenerImpl onRoutingChangedListenerImpl = this.deviceChangeListeners.get(Long.valueOf(j));
        if (onRoutingChangedListenerImpl == null) {
            return;
        }
        this.deviceChangeListeners.remove(Long.valueOf(j));
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
        } else {
            audioRecord.removeOnRoutingChangedListener(onRoutingChangedListenerImpl);
        }
    }

    public void removeOnInfoChangedListener(long j) {
        OnInfoChangedListenerImpl onInfoChangedListenerImpl = this.infoChangeListeners.get(Long.valueOf(j));
        if (onInfoChangedListenerImpl == null) {
            return;
        }
        this.infoChangeListeners.remove(Long.valueOf(j));
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
        } else {
            audioRecord.removeOnRoutingChangedListener(onInfoChangedListenerImpl);
        }
    }

    public AudioFormat getFormat(long j) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return null;
        }
        return audioRecord.getFormat();
    }

    public int getAudioSessionId(long j) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    public int getTimestamp(long j, AudioTimestamp audioTimestamp) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return -3;
        }
        return audioRecord.getTimestamp(audioTimestamp, 0);
    }

    public AudioDeviceInfo getRoutedDevice(long j) {
        AudioRecord audioRecord = this.mAudioRecords.get(Long.valueOf(j));
        if (audioRecord == null) {
            ALog.e(LOG_TAG, "audioRecord is null");
            return null;
        }
        return audioRecord.getRoutedDevice();
    }

    public class OnRecordPositionUpdateListenerImpl implements AudioRecord.OnRecordPositionUpdateListener {
        public OnRecordPositionUpdateListenerImpl() {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onMarkerReached(AudioRecord audioRecord) {
            for (Long l : AudioCapturerPlugin.this.positionUpdateListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnRecordPositionUpdateListenerImpl) AudioCapturerPlugin.this.positionUpdateListeners.get(l)) == this) {
                    AudioCapturerPlugin.this.nativeOnMarkerReached(jLongValue, audioRecord.getNotificationMarkerPosition());
                    return;
                }
            }
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onPeriodicNotification(AudioRecord audioRecord) {
            for (Long l : AudioCapturerPlugin.this.positionUpdateListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnRecordPositionUpdateListenerImpl) AudioCapturerPlugin.this.positionUpdateListeners.get(l)) == this) {
                    AudioCapturerPlugin.this.nativeOnPeriodicNotification(jLongValue, audioRecord.getPositionNotificationPeriod());
                    return;
                }
            }
        }
    }

    public class OnRoutingChangedListenerImpl implements AudioRouting.OnRoutingChangedListener {
        public OnRoutingChangedListenerImpl() {
        }

        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            for (Long l : AudioCapturerPlugin.this.deviceChangeListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnRoutingChangedListenerImpl) AudioCapturerPlugin.this.deviceChangeListeners.get(l)) == this) {
                    AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
                    if (routedDevice != null) {
                        AudioCapturerPlugin.this.nativeOnRoutingChanged(jLongValue, routedDevice);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public class OnInfoChangedListenerImpl implements AudioRouting.OnRoutingChangedListener {
        public OnInfoChangedListenerImpl() {
        }

        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            for (Long l : AudioCapturerPlugin.this.infoChangeListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnInfoChangedListenerImpl) AudioCapturerPlugin.this.infoChangeListeners.get(l)) == this) {
                    AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
                    if (routedDevice != null) {
                        AudioCapturerPlugin.this.nativeOnInfoChanged(jLongValue, routedDevice);
                        return;
                    }
                    return;
                }
            }
        }
    }
}

package ohos.ace.plugin.audiorenderer;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class AudioRendererPlugin {
    private static final String LOG_TAG = "AudioRendererPlugin";
    private Map<Long, AudioTrack> audioTracks = new HashMap();
    private Map<Long, OnPlaybackPositionUpdateListenerImpl> positionUpdateListeners = new HashMap();
    private Map<Long, OnRoutingChangedListenerImpl> deviceChangeListeners = new HashMap();

    protected native void nativeInit();

    protected native void nativeOnMarkerReached(long j, int i);

    protected native void nativeOnPeriodicNotification(long j, int i);

    protected native void nativeOnRoutingChanged(long j, AudioDeviceInfo audioDeviceInfo);

    public AudioRendererPlugin(Context context) {
        if (context == null) {
            Log.e(LOG_TAG, "context is null");
        } else {
            nativeInit();
        }
    }

    public void createAudioTrack(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (this.audioTracks.get(Long.valueOf(j)) != null) {
            return;
        }
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(i5);
        builder.setContentType(i6);
        invoke("android.media.AudioAttributes.Builder", "setAllowedCapturePolicy", builder, new Class[]{Integer.TYPE}, Integer.valueOf(i7));
        AudioAttributes audioAttributesBuild = builder.build();
        AudioFormat.Builder builder2 = new AudioFormat.Builder();
        builder2.setEncoding(i3);
        builder2.setSampleRate(i);
        builder2.setChannelMask(i4);
        AudioFormat audioFormatBuild = builder2.build();
        int minBufferSize = AudioTrack.getMinBufferSize(i, i4, i3);
        Log.i(LOG_TAG, "getMinBufferSize bufferSizeInBytes=" + minBufferSize);
        this.audioTracks.put(Long.valueOf(j), new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild).setAudioFormat(audioFormatBuild).setBufferSizeInBytes((int) (((float) minBufferSize) * f)).build());
    }

    public void finalize(long j) {
        this.audioTracks.remove(Long.valueOf(j));
        this.positionUpdateListeners.remove(Long.valueOf(j));
        this.deviceChangeListeners.remove(Long.valueOf(j));
    }

    public void play(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.play();
        }
    }

    public void pause(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.pause();
        }
    }

    public void stop(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.stop();
        }
    }

    public void release(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.release();
            finalize(j);
        }
    }

    public void flush(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.flush();
        }
    }

    public void setSpeed(long j, float f) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return;
        }
        PlaybackParams playbackParams = audioTrack.getPlaybackParams();
        playbackParams.setSpeed(f);
        audioTrack.setPlaybackParams(playbackParams);
    }

    public float getSpeed(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return 0.0f;
        }
        return audioTrack.getPlaybackParams().getSpeed();
    }

    public int getMinBufferSize(long j, int i, int i2, int i3) {
        if (this.audioTracks.get(Long.valueOf(j)) == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -1;
        }
        return AudioTrack.getMinBufferSize(i, i2, i3);
    }

    public int write(long j, byte[] bArr, int i) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -1;
        }
        return audioTrack.write(bArr, 0, i);
    }

    public int setVolume(long j, float f) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -3;
        }
        return audioTrack.setVolume(f);
    }

    public float getMinVolume(long j) {
        return AudioTrack.getMinVolume();
    }

    public float getMaxVolume(long j) {
        return AudioTrack.getMaxVolume();
    }

    public int getUnderrunCount(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -1;
        }
        return audioTrack.getUnderrunCount();
    }

    public int setNotificationMarkerPosition(long j, int i) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -3;
        }
        return audioTrack.setNotificationMarkerPosition(i);
    }

    public void setPlaybackPositionUpdateListener(long j) {
        if (this.positionUpdateListeners.get(Long.valueOf(j)) != null) {
            return;
        }
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return;
        }
        OnPlaybackPositionUpdateListenerImpl onPlaybackPositionUpdateListenerImpl = new OnPlaybackPositionUpdateListenerImpl();
        audioTrack.setPlaybackPositionUpdateListener(onPlaybackPositionUpdateListenerImpl);
        this.positionUpdateListeners.put(Long.valueOf(j), onPlaybackPositionUpdateListenerImpl);
    }

    public void unsetPlaybackPositionUpdateListener(long j) {
        if (this.positionUpdateListeners.get(Long.valueOf(j)) == null) {
            return;
        }
        this.positionUpdateListeners.remove(Long.valueOf(j));
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.setPlaybackPositionUpdateListener(null);
        }
    }

    public int setPositionNotificationPeriod(long j, int i) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -3;
        }
        return audioTrack.setPositionNotificationPeriod(i);
    }

    public AudioDeviceInfo getCurrentOutputDevices(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return null;
        }
        return audioTrack.getRoutedDevice();
    }

    public int getAudioSessionId(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return -1;
        }
        return audioTrack.getAudioSessionId();
    }

    public void addOnRoutingChangedListener(long j) {
        if (this.deviceChangeListeners.get(Long.valueOf(j)) != null) {
            return;
        }
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return;
        }
        OnRoutingChangedListenerImpl onRoutingChangedListenerImpl = new OnRoutingChangedListenerImpl();
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListenerImpl, (Handler) null);
        this.deviceChangeListeners.put(Long.valueOf(j), onRoutingChangedListenerImpl);
    }

    public void removeOnRoutingChangedListener(long j) {
        OnRoutingChangedListenerImpl onRoutingChangedListenerImpl = this.deviceChangeListeners.get(Long.valueOf(j));
        if (onRoutingChangedListenerImpl == null) {
            return;
        }
        this.deviceChangeListeners.remove(Long.valueOf(j));
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
        } else {
            audioTrack.removeOnRoutingChangedListener(onRoutingChangedListenerImpl);
        }
    }

    public boolean setDualMonoMode(long j, int i) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return false;
        }
        Object objInvoke = invoke("android.media.AudioTrack", "setDualMonoMode", audioTrack, new Class[]{Integer.TYPE}, Integer.valueOf(i));
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public AudioAttributes getAudioAttributes(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return null;
        }
        Object objInvoke = invoke("android.media.AudioTrack", "getAudioAttributes", audioTrack, null, new Object[0]);
        if (objInvoke instanceof AudioAttributes) {
            return (AudioAttributes) objInvoke;
        }
        return null;
    }

    private static Object invoke(String str, String str2, Object obj, Class<?>[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getDeclaredMethod(str2, clsArr).invoke(obj, objArr);
        } catch (ClassNotFoundException e) {
            e = e;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (SecurityException e5) {
            e = e5;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (InvocationTargetException e6) {
            e = e6;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (Exception e7) {
            Log.e(LOG_TAG, "unknown Exception in invoke");
            e7.printStackTrace();
            return null;
        }
    }

    public AudioFormat getFormat(long j) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return null;
        }
        return audioTrack.getFormat();
    }

    public boolean getTimestamp(long j, AudioTimestamp audioTimestamp) {
        AudioTrack audioTrack = this.audioTracks.get(Long.valueOf(j));
        if (audioTrack == null) {
            Log.e(LOG_TAG, "audioTrack is null");
            return false;
        }
        return audioTrack.getTimestamp(audioTimestamp);
    }

    public class OnPlaybackPositionUpdateListenerImpl implements AudioTrack.OnPlaybackPositionUpdateListener {
        public OnPlaybackPositionUpdateListenerImpl() {
        }

        @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
        public void onMarkerReached(AudioTrack audioTrack) {
            for (Long l : AudioRendererPlugin.this.positionUpdateListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnPlaybackPositionUpdateListenerImpl) AudioRendererPlugin.this.positionUpdateListeners.get(l)) == this) {
                    AudioRendererPlugin.this.nativeOnMarkerReached(jLongValue, audioTrack.getNotificationMarkerPosition());
                    return;
                }
            }
        }

        @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
        public void onPeriodicNotification(AudioTrack audioTrack) {
            for (Long l : AudioRendererPlugin.this.positionUpdateListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnPlaybackPositionUpdateListenerImpl) AudioRendererPlugin.this.positionUpdateListeners.get(l)) == this) {
                    AudioRendererPlugin.this.nativeOnPeriodicNotification(jLongValue, audioTrack.getPositionNotificationPeriod());
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
            for (Long l : AudioRendererPlugin.this.deviceChangeListeners.keySet()) {
                long jLongValue = l.longValue();
                if (((OnRoutingChangedListenerImpl) AudioRendererPlugin.this.deviceChangeListeners.get(l)) == this) {
                    AudioRendererPlugin.this.nativeOnRoutingChanged(jLongValue, audioRouting.getRoutedDevice());
                    return;
                }
            }
        }
    }
}

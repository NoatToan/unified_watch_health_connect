package ohos.ace.plugin.audiomanager;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.media.AudioRecordingConfiguration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class AudioManagerPlugin {
    private static final String LOG_TAG = "AudioManagerPlugin";
    private AudioManager audioManager_;
    private OnAudioPlaybackCallbackListenerImpl audioPlaybackCallbacklListeners_;
    private OnAudioRecordingCallbackListenerImpl audioRecordingCallbacklListeners_;
    private AudioDeviceChangeCallbackImpl deviceChangeCallback_;

    protected native void nativeInit();

    protected native void nativeOnAudioCapturerChanged(List<AudioRecordingConfiguration> list);

    protected native void nativeOnAudioDeviceChanged(boolean z, AudioDeviceInfo[] audioDeviceInfoArr);

    protected native void nativeOnAudioRendererChanged(List<AudioPlaybackConfiguration> list);

    public AudioManagerPlugin(Context context) {
        if (context == null) {
            Log.e(LOG_TAG, "context is null");
        } else {
            this.audioManager_ = (AudioManager) context.getSystemService("audio");
            nativeInit();
        }
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

    public int getVolume(int i) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return -1;
        }
        return audioManager.getStreamVolume(i);
    }

    public int getMaxVolume(int i) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return -1;
        }
        return audioManager.getStreamMaxVolume(i);
    }

    public int getMinVolume(int i) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return -1;
        }
        Object objInvoke = invoke("android.media.AudioManager", "getStreamMinVolume", audioManager, new Class[]{Integer.TYPE}, Integer.valueOf(i));
        if (objInvoke instanceof Integer) {
            return ((Integer) objInvoke).intValue();
        }
        return -1;
    }

    public boolean isStreamMute(int i) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return false;
        }
        return audioManager.isStreamMute(i);
    }

    public int getRingerMode() {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return -1;
        }
        return audioManager.getRingerMode();
    }

    public boolean isMicrophoneMute() {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return false;
        }
        return audioManager.isMicrophoneMute();
    }

    public boolean isVolumeFixed() {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return false;
        }
        return audioManager.isVolumeFixed();
    }

    public float getSystemVolumeInDb(int i, int i2, int i3) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return 0.0f;
        }
        Object objInvoke = invoke("android.media.AudioManager", "getStreamVolumeDb", audioManager, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (objInvoke instanceof Float) {
            return ((Float) objInvoke).floatValue();
        }
        return 0.0f;
    }

    public int getAudioScene() {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return -2;
        }
        return audioManager.getMode();
    }

    public AudioDeviceInfo[] getDevices(int i) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return null;
        }
        return audioManager.getDevices(i);
    }

    void registerAudioDeviceCallback() {
        if (this.deviceChangeCallback_ == null) {
            if (this.audioManager_ == null) {
                Log.e(LOG_TAG, "audioManager_ is null");
                return;
            }
            AudioDeviceChangeCallbackImpl audioDeviceChangeCallbackImpl = new AudioDeviceChangeCallbackImpl();
            this.deviceChangeCallback_ = audioDeviceChangeCallbackImpl;
            this.audioManager_.registerAudioDeviceCallback(audioDeviceChangeCallbackImpl, null);
            return;
        }
        Log.w(LOG_TAG, "AudioDeviceCallback has already been registered");
    }

    void unregisterAudioDeviceCallback() {
        AudioDeviceChangeCallbackImpl audioDeviceChangeCallbackImpl = this.deviceChangeCallback_;
        if (audioDeviceChangeCallbackImpl != null) {
            AudioManager audioManager = this.audioManager_;
            if (audioManager == null) {
                Log.e(LOG_TAG, "audioManager_ is null");
                return;
            } else {
                audioManager.unregisterAudioDeviceCallback(audioDeviceChangeCallbackImpl);
                this.deviceChangeCallback_ = null;
                return;
            }
        }
        Log.w(LOG_TAG, "AudioDeviceCallback has not been registered");
    }

    public List<AudioPlaybackConfiguration> getCurrentAudioRendererInfoArray() {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return null;
        }
        return audioManager.getActivePlaybackConfigurations();
    }

    public List<AudioRecordingConfiguration> getCurrentAudioCapturerInfoArray() {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return null;
        }
        return audioManager.getActiveRecordingConfigurations();
    }

    public void registerAudioRendererEventListener() {
        if (this.audioPlaybackCallbacklListeners_ == null) {
            if (this.audioManager_ == null) {
                Log.e(LOG_TAG, "audioManager_ is null");
                return;
            }
            OnAudioPlaybackCallbackListenerImpl onAudioPlaybackCallbackListenerImpl = new OnAudioPlaybackCallbackListenerImpl();
            this.audioPlaybackCallbacklListeners_ = onAudioPlaybackCallbackListenerImpl;
            this.audioManager_.registerAudioPlaybackCallback(onAudioPlaybackCallbackListenerImpl, null);
            return;
        }
        Log.w(LOG_TAG, "AudioPlaybackCallback has already been registered");
    }

    public void unregisterAudioRendererEventListener() {
        OnAudioPlaybackCallbackListenerImpl onAudioPlaybackCallbackListenerImpl = this.audioPlaybackCallbacklListeners_;
        if (onAudioPlaybackCallbackListenerImpl != null) {
            AudioManager audioManager = this.audioManager_;
            if (audioManager == null) {
                Log.e(LOG_TAG, "audioManager_ is null");
                return;
            } else {
                audioManager.unregisterAudioPlaybackCallback(onAudioPlaybackCallbackListenerImpl);
                this.audioPlaybackCallbacklListeners_ = null;
                return;
            }
        }
        Log.w(LOG_TAG, "AudioPlaybackCallback has not been registered");
    }

    public void registerAudioCapturerEventListener() {
        if (this.audioRecordingCallbacklListeners_ == null) {
            if (this.audioManager_ == null) {
                Log.e(LOG_TAG, "audioManager_ is null");
                return;
            }
            OnAudioRecordingCallbackListenerImpl onAudioRecordingCallbackListenerImpl = new OnAudioRecordingCallbackListenerImpl();
            this.audioRecordingCallbacklListeners_ = onAudioRecordingCallbackListenerImpl;
            this.audioManager_.registerAudioRecordingCallback(onAudioRecordingCallbackListenerImpl, null);
            return;
        }
        Log.w(LOG_TAG, "AudioRecordingCallback has already been registered");
    }

    public void unregisterAudioCapturerEventListener() {
        OnAudioRecordingCallbackListenerImpl onAudioRecordingCallbackListenerImpl = this.audioRecordingCallbacklListeners_;
        if (onAudioRecordingCallbackListenerImpl != null) {
            AudioManager audioManager = this.audioManager_;
            if (audioManager == null) {
                Log.e(LOG_TAG, "audioManager_ is null");
                return;
            } else {
                audioManager.unregisterAudioRecordingCallback(onAudioRecordingCallbackListenerImpl);
                this.audioRecordingCallbacklListeners_ = null;
                return;
            }
        }
        Log.w(LOG_TAG, "AudioRecordingCallback has not been registered");
    }

    public boolean setDeviceActive(int i, boolean z) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return false;
        }
        AudioDeviceInfo audioDeviceInfo = null;
        if (!z) {
            invoke("android.media.AudioManager", "clearCommunicationDevice", audioManager, null, new Object[0]);
            return true;
        }
        Object objInvoke = invoke("android.media.AudioManager", "getAvailableCommunicationDevices", audioManager, null, new Object[0]);
        if (!(objInvoke instanceof List)) {
            return false;
        }
        List list = (List) objInvoke;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) list.get(i2);
            if (audioDeviceInfo2.getType() == i && audioDeviceInfo2.isSink()) {
                audioDeviceInfo = audioDeviceInfo2;
                break;
            }
        }
        if (audioDeviceInfo != null) {
            Object objInvoke2 = invoke("android.media.AudioManager", "setCommunicationDevice", this.audioManager_, new Class[]{AudioDeviceInfo.class}, audioDeviceInfo);
            if (objInvoke2 instanceof Boolean) {
                return ((Boolean) objInvoke2).booleanValue();
            }
        }
        return false;
    }

    public boolean isDeviceActive(int i) {
        AudioManager audioManager = this.audioManager_;
        if (audioManager == null) {
            Log.e(LOG_TAG, "audioManager_ is null");
            return false;
        }
        Object objInvoke = invoke("android.media.AudioManager", "getCommunicationDevice", audioManager, null, new Object[0]);
        return (objInvoke instanceof AudioDeviceInfo) && ((AudioDeviceInfo) objInvoke).getType() == i;
    }

    public class AudioDeviceChangeCallbackImpl extends AudioDeviceCallback {
        public AudioDeviceChangeCallbackImpl() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioManagerPlugin.this.nativeOnAudioDeviceChanged(true, audioDeviceInfoArr);
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioManagerPlugin.this.nativeOnAudioDeviceChanged(false, audioDeviceInfoArr);
        }
    }

    public class OnAudioPlaybackCallbackListenerImpl extends AudioManager.AudioPlaybackCallback {
        public OnAudioPlaybackCallbackListenerImpl() {
        }

        @Override // android.media.AudioManager.AudioPlaybackCallback
        public void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
            AudioManagerPlugin.this.nativeOnAudioRendererChanged(list);
        }
    }

    public class OnAudioRecordingCallbackListenerImpl extends AudioManager.AudioRecordingCallback {
        public OnAudioRecordingCallbackListenerImpl() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            AudioManagerPlugin.this.nativeOnAudioCapturerChanged(list);
        }
    }
}

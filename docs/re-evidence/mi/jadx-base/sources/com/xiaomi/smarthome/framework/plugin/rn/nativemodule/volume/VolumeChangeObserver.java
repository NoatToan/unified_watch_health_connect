package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.volume;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class VolumeChangeObserver {
    private static final String ACTION_VOLUME_CHANGED = "android.media.VOLUME_CHANGED_ACTION";
    private static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    private AudioManager mAudioManager;
    private Context mContext;
    private OnVolumeChangeListener mListener;
    private VolumeReceiver mVolumeReceiver;

    public interface OnVolumeChangeListener {
        void onVolumeChanged(double d);
    }

    public static class VolumeReceiver extends BroadcastReceiver {
        private WeakReference<VolumeChangeObserver> mObserver;

        public VolumeReceiver(VolumeChangeObserver volumeChangeObserver) {
            this.mObserver = new WeakReference<>(volumeChangeObserver);
        }

        private boolean isReceiveVolumeChange(Intent intent) {
            return intent != null && intent.getAction() != null && intent.getAction().equals(VolumeChangeObserver.ACTION_VOLUME_CHANGED) && intent.getIntExtra(VolumeChangeObserver.EXTRA_VOLUME_STREAM_TYPE, -1) == 3;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RnPluginLog.d("VolumeReceiver,onReceive");
            WeakReference<VolumeChangeObserver> weakReference = this.mObserver;
            if (weakReference == null) {
                return;
            }
            VolumeChangeObserver volumeChangeObserver = weakReference.get();
            if (isReceiveVolumeChange(intent)) {
                RnPluginLog.d("VolumeReceiver,onReceive,object:" + this);
                volumeChangeObserver.onVolumeChange();
            }
        }
    }

    public VolumeChangeObserver(Context context) {
        this.mContext = context;
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVolumeChange() {
        OnVolumeChangeListener onVolumeChangeListener = this.mListener;
        if (onVolumeChangeListener != null) {
            onVolumeChangeListener.onVolumeChanged(getCurrentVolume());
        }
    }

    public double getCurrentVolume() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null) {
            return 0.0d;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        if (streamMaxVolume != 0) {
            return ((double) streamVolume) / ((double) streamMaxVolume);
        }
        return 0.0d;
    }

    public void registerVolumeReceiver() {
        RnPluginLog.d("registerVolumeReceiver,");
        if (this.mContext == null || this.mVolumeReceiver != null) {
            return;
        }
        RnPluginLog.d("registerVolumeReceiver, need to register");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_VOLUME_CHANGED);
        VolumeReceiver volumeReceiver = new VolumeReceiver(this);
        this.mVolumeReceiver = volumeReceiver;
        this.mContext.registerReceiver(volumeReceiver, intentFilter);
    }

    public void setOnVolumeChangeListener(OnVolumeChangeListener onVolumeChangeListener) {
        this.mListener = onVolumeChangeListener;
    }

    public void unregisterVolumeReceiver() {
        RnPluginLog.d("unregisterVolumeReceiver,");
        if (this.mContext == null || this.mVolumeReceiver == null) {
            return;
        }
        RnPluginLog.d("unregisterVolumeReceiver,need to unregister");
        this.mContext.unregisterReceiver(this.mVolumeReceiver);
        this.mVolumeReceiver = null;
    }
}

package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class VolumeChangeObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9345a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f9346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioManager f9347c;
    private VolumeChangeListener d;
    private Context e;

    public interface VolumeChangeListener {
        void onVolumeChanged(int i);
    }

    public VolumeChangeObserver(Context context) {
        this.e = context;
        if (context != null) {
            this.f9347c = (AudioManager) context.getApplicationContext().getSystemService("audio");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VolumeChangeListener d() {
        return this.d;
    }

    public void b(VolumeChangeListener volumeChangeListener) {
        this.d = volumeChangeListener;
    }

    public int b() {
        AudioManager audioManager = this.f9347c;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public void e() {
        this.f9346b = new d(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.VOLUME_CHANGED_ACTION);
        Context context = this.e;
        if (context != null) {
            context.registerReceiver(this.f9346b, intentFilter);
            this.f9345a = true;
        }
    }

    public void c() {
        Context context;
        if (!this.f9345a || (context = this.e) == null) {
            return;
        }
        context.unregisterReceiver(this.f9346b);
        this.d = null;
        this.f9345a = false;
    }

    static class d extends BroadcastReceiver {
        private WeakReference<VolumeChangeObserver> e;

        d(VolumeChangeObserver volumeChangeObserver) {
            this.e = new WeakReference<>(volumeChangeObserver);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VolumeChangeObserver volumeChangeObserver;
            VolumeChangeListener volumeChangeListenerD;
            if (intent == null) {
                LogUtil.j("Suggestion_VolumeChangeObserver", "onReceive intent is null");
            } else {
                if (!Constants.VOLUME_CHANGED_ACTION.equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (volumeChangeObserver = this.e.get()) == null || (volumeChangeListenerD = volumeChangeObserver.d()) == null) {
                    return;
                }
                volumeChangeListenerD.onVolumeChanged(volumeChangeObserver.b());
            }
        }
    }
}

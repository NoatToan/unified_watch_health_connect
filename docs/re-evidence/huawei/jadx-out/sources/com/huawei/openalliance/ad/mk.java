package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f19621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f19622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19623c;
    private AudioManager d;
    private boolean e = false;

    public interface b {
        void a();
    }

    public void a(b bVar) {
        this.f19621a = bVar;
    }

    public void a() {
        if (this.e) {
            try {
                this.f19623c.unregisterReceiver(this.f19622b);
            } catch (Exception e) {
                hw.b("VolumeChangeObserver", "unregisterReceiver, " + e.getClass().getSimpleName());
            }
            this.f19621a = null;
            this.e = false;
        }
    }

    public float a(boolean z) {
        AudioManager audioManager = this.d;
        if (audioManager != null) {
            return ml.a(audioManager, z);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b b() {
        return this.f19621a;
    }

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<mk> f19624a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            mk mkVar;
            b bVarB;
            try {
                if (!((Constants.VOLUME_CHANGED_ACTION.equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", 0) == 3) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", 0) == 1) || (mkVar = this.f19624a.get()) == null || (bVarB = mkVar.b()) == null) {
                    return;
                }
                bVarB.a();
            } catch (Throwable th) {
                hw.c("VolumeChangeObserver", "onReceive error:" + th.getClass().getSimpleName());
            }
        }
    }

    public mk(Context context) {
        this.f19623c = context;
        this.d = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}

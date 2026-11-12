package com.huawei.healthcloud.plugintrack.manager.voice;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jax;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class BaseSoundEffectManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, jax> f10483a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SoundPool f10484c;
    private final Context d;

    public BaseSoundEffectManager(Context context) {
        if (context == null) {
            this.d = BaseApplication.b();
        } else {
            this.d = context;
        }
        this.f10484c = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).setContentType(4).build()).build();
    }

    public boolean d(String str) {
        return this.f10483a.containsKey(str);
    }

    public void e(List<jax> list) {
        if (this.f10484c == null) {
            LogUtil.e("Track_SoundEffectManager", "soundPool is null");
            return;
        }
        for (jax jaxVar : list) {
            AssetFileDescriptor assetFileDescriptorOpenFd = null;
            try {
                try {
                    assetFileDescriptorOpenFd = BaseApplication.b().getAssets().openFd(jaxVar.e());
                    jaxVar.e(this.f10484c.load(assetFileDescriptorOpenFd, jaxVar.a()));
                    this.f10483a.put(jaxVar.c(), jaxVar);
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused) {
                            LogUtil.e("Track_SoundEffectManager", "close AssetFileDescriptor error");
                        }
                    }
                } catch (IOException e) {
                    LogUtil.e("Track_SoundEffectManager", "AssetFileDescriptor exception: ", LogAnonymous.b(e));
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused2) {
                            LogUtil.e("Track_SoundEffectManager", "close AssetFileDescriptor error");
                        }
                    }
                }
            } catch (Throwable th) {
                if (assetFileDescriptorOpenFd != null) {
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused3) {
                        LogUtil.e("Track_SoundEffectManager", "close AssetFileDescriptor error");
                    }
                }
                throw th;
            }
        }
    }

    public void b(SoundPool.OnLoadCompleteListener onLoadCompleteListener) {
        SoundPool soundPool = this.f10484c;
        if (soundPool == null) {
            LogUtil.e("Track_SoundEffectManager", "soundPool is null");
        } else {
            soundPool.setOnLoadCompleteListener(onLoadCompleteListener);
        }
    }

    public void a(String str) {
        c(str, 0, 1.0f);
    }

    public void c(String str, int i, float f) {
        if (this.f10484c == null || !this.f10483a.containsKey(str)) {
            LogUtil.e("Track_SoundEffectManager", "mSoundPool is null");
            return;
        }
        if (!(this.d.getSystemService("audio") instanceof AudioManager)) {
            LogUtil.a("Track_SoundEffectManager", "playSound object invalid type");
            return;
        }
        jax jaxVar = this.f10483a.get(str);
        if (jaxVar == null) {
            LogUtil.e("Track_SoundEffectManager", "option is null");
        } else {
            this.f10484c.play(jaxVar.d(), f, f, jaxVar.a(), i, 1.0f);
            this.f10484c.stop(jaxVar.d());
        }
    }

    public int a(int i, float f, float f2, int i2, int i3, float f3) {
        SoundPool soundPool = this.f10484c;
        if (soundPool == null) {
            LogUtil.e("Track_SoundEffectManager", "mSoundPool is null");
            return 0;
        }
        return soundPool.play(i, f, f2, i2, i3, f3);
    }

    public void e(int i) {
        SoundPool soundPool = this.f10484c;
        if (soundPool == null) {
            LogUtil.e("Track_SoundEffectManager", "mSoundPool is null");
        } else {
            soundPool.stop(i);
        }
    }

    public void c(int i, float f, float f2) {
        SoundPool soundPool = this.f10484c;
        if (soundPool == null) {
            LogUtil.e("Track_SoundEffectManager", "mSoundPool is null");
        } else {
            soundPool.setVolume(i, f, f2);
        }
    }

    public void e() {
        ReleaseLogUtil.d("Track_SoundEffectManager", "destroy");
        this.f10483a.clear();
        SoundPool soundPool = this.f10484c;
        if (soundPool != null) {
            soundPool.release();
        }
    }
}

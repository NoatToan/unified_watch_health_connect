package com.huawei.healthcloud.plugintrack.trackanimation.recorder;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.jet;
import health.compact.a.StorageParams;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class MusicManager {
    private Context e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioManager f10658c = null;
    private MediaPlayer d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jaq f10657a = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));

    public MusicManager(Context context) {
        this.e = context;
    }

    public void b() {
        Context context = this.e;
        if (context instanceof Activity) {
            ((Activity) context).setVolumeControlStream(3);
        }
        if (this.e.getSystemService("audio") instanceof AudioManager) {
            this.f10658c = (AudioManager) this.e.getSystemService("audio");
        }
    }

    public void a() {
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.d.release();
            this.d = null;
        }
        jet.b().d();
        jaa.e(this.f10658c);
    }

    public void e() {
        MediaPlayer mediaPlayer;
        String strM = this.f10657a.m();
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        this.d = MediaPlayer.create(this.e, Uri.fromFile(new File(strM)));
        if (jaa.b(this.f10658c) == 0 || (mediaPlayer = this.d) == null) {
            return;
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this) { // from class: com.huawei.healthcloud.plugintrack.trackanimation.recorder.MusicManager.1
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.seekTo(0);
                mediaPlayer2.start();
            }
        });
        this.d.start();
    }
}

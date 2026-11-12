package com.garmin.android.apps.connectmobile.view.audiorecording;

import android.media.MediaPlayer;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/a;", "", "", "fileName", "<init>", "(Ljava/lang/String;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0928a f47606c = new C0928a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f47607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f47608b;

    public a(String str) {
        str.getClass();
    }

    public final void a(String str) {
        str.getClass();
        MediaPlayer mediaPlayer = this.f47607a;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            d dVar = this.f47608b;
            if (dVar != null) {
                dVar.a();
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.f47607a = mediaPlayer2;
        try {
            mediaPlayer2.setDataSource(str);
            MediaPlayer mediaPlayer3 = this.f47607a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: s22.a
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer4) {
                        com.garmin.android.apps.connectmobile.view.audiorecording.a.C0928a c0928a = com.garmin.android.apps.connectmobile.view.audiorecording.a.f47606c;
                        this.f156225a.b();
                    }
                });
            }
            MediaPlayer mediaPlayer4 = this.f47607a;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepare();
            }
            MediaPlayer mediaPlayer5 = this.f47607a;
            if (mediaPlayer5 != null) {
                mediaPlayer5.start();
            }
            d dVar2 = this.f47608b;
            if (dVar2 != null) {
                dVar2.b();
                Unit unit = Unit.INSTANCE;
            }
        } catch (IOException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioPlayerEngine", "playRecording Failed!");
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.f47607a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            d dVar = this.f47608b;
            if (dVar != null) {
                AudioRecordingView audioRecordingView = dVar.f47615a;
                audioRecordingView.f47582x = AudioRecordingView.a.STOPPED;
                ImageView imageView = audioRecordingView.f47571k;
                audioRecordingView.f47564d.a();
                audioRecordingView.f47583y = false;
                imageView.setImageResource(2131233731);
                imageView.setContentDescription(audioRecordingView.getContext().getString(R.string.audio_note_play));
            }
            this.f47607a = null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.audiorecording.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0928a {
        public /* synthetic */ C0928a(j jVar) {
            this();
        }

        private C0928a() {
        }
    }
}

package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
final class AudioFocusManager {
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 1;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final String q = "AudioFocusManager";
    private static final float r = 0.2f;
    private static final float s = 1.0f;
    private final AudioManager a;
    private final a b;

    @Nullable
    private PlayerControl c;

    @Nullable
    private AudioAttributes d;
    private int f;
    private AudioFocusRequest h;
    private boolean i;
    private float g = 1.0f;
    private int e = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int playerCommand);

        void setVolumeMultiplier(float volumeMultiplier);
    }

    public class a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler a;

        public a(Handler eventHandler) {
            this.a = eventHandler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i) {
            AudioFocusManager.this.i(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int focusChange) {
            this.a.post(new Runnable() { // from class: com.google.android.exoplayer2.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(focusChange);
                }
            });
        }
    }

    public AudioFocusManager(Context context, Handler eventHandler, PlayerControl playerControl) {
        this.a = (AudioManager) Assertions.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.c = playerControl;
        this.b = new a(eventHandler);
    }

    private void a() {
        this.a.abandonAudioFocus(this.b);
    }

    private void b() {
        if (this.e == 0) {
            return;
        }
        if (Util.SDK_INT >= 26) {
            c();
        } else {
            a();
        }
        o(0);
    }

    @RequiresApi(26)
    private void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(@Nullable AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        int i = audioAttributes.usage;
        switch (i) {
            case 0:
                Log.w(q, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unidentified audio usage: ");
                sb.append(i);
                Log.w(q, sb.toString());
                return 0;
            case 16:
                return Util.SDK_INT >= 19 ? 4 : 2;
        }
    }

    private void f(int playerCommand) {
        PlayerControl playerControl = this.c;
        if (playerControl != null) {
            playerControl.executePlayerCommand(playerCommand);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int focusChange) {
        if (focusChange == -3 || focusChange == -2) {
            if (focusChange != -2 && !r()) {
                o(3);
                return;
            } else {
                f(0);
                o(2);
                return;
            }
        }
        if (focusChange == -1) {
            f(-1);
            b();
        } else if (focusChange == 1) {
            o(1);
            f(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(focusChange);
            Log.w(q, sb.toString());
        }
    }

    private int k() {
        if (this.e == 1) {
            return 1;
        }
        if ((Util.SDK_INT >= 26 ? m() : l()) == 1) {
            o(1);
            return 1;
        }
        o(0);
        return -1;
    }

    private int l() {
        return this.a.requestAudioFocus(this.b, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.d)).usage), this.f);
    }

    @RequiresApi(26)
    private int m() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            this.h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.h)).setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.d)).getAudioAttributesV21()).setWillPauseWhenDucked(r()).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.a.requestAudioFocus(this.h);
    }

    private void o(int audioFocusState) {
        if (this.e == audioFocusState) {
            return;
        }
        this.e = audioFocusState;
        float f = audioFocusState == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        PlayerControl playerControl = this.c;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f);
        }
    }

    private boolean p(int playbackState) {
        return playbackState == 1 || this.f != 1;
    }

    private boolean r() {
        AudioAttributes audioAttributes = this.d;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    @VisibleForTesting
    public AudioManager.OnAudioFocusChangeListener g() {
        return this.b;
    }

    public float h() {
        return this.g;
    }

    public void j() {
        this.c = null;
        b();
    }

    public void n(@Nullable AudioAttributes audioAttributes) {
        if (Util.areEqual(this.d, audioAttributes)) {
            return;
        }
        this.d = audioAttributes;
        int iE = e(audioAttributes);
        this.f = iE;
        boolean z = true;
        if (iE != 1 && iE != 0) {
            z = false;
        }
        Assertions.checkArgument(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int q(boolean playWhenReady, int playbackState) {
        if (p(playbackState)) {
            b();
            return playWhenReady ? 1 : -1;
        }
        if (playWhenReady) {
            return k();
        }
        return -1;
    }
}

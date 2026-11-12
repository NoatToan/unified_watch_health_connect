package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import defpackage.nm1;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f7862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7863b;
    public b c;
    public nm1 d;
    public int f;
    public AudioFocusRequest h;
    public boolean i;
    public float g = 1.0f;
    public int e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f7864a;

        public a(Handler handler) {
            this.f7864a = handler;
        }

        public final /* synthetic */ void b(int i) {
            c.this.h(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f7864a.post(new Runnable() { // from class: vm1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37014a.b(i);
                }
            });
        }
    }

    public interface b {
        void s(float f);

        void t(int i);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f7862a = (AudioManager) rk1.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.c = bVar;
        this.f7863b = new a(handler);
    }

    public static int e(nm1 nm1Var) {
        if (nm1Var == null) {
            return 0;
        }
        int i = nm1Var.c;
        switch (i) {
            case 0:
                toe.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (nm1Var.f28056a == 1) {
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
                toe.h("AudioFocusManager", sb.toString());
                return 0;
            case 16:
                return wlq.f38110a >= 19 ? 4 : 2;
        }
    }

    public final void a() {
        this.f7862a.abandonAudioFocus(this.f7863b);
    }

    public final void b() {
        if (this.e == 0) {
            return;
        }
        if (wlq.f38110a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    @RequiresApi(26)
    public final void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.f7862a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.t(i);
        }
    }

    public float g() {
        return this.g;
    }

    public final void h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !q()) {
                n(3);
                return;
            } else {
                f(0);
                n(2);
                return;
            }
        }
        if (i == -1) {
            f(-1);
            b();
        } else if (i == 1) {
            n(1);
            f(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            toe.h("AudioFocusManager", sb.toString());
        }
    }

    public void i() {
        this.c = null;
        b();
    }

    public final int j() {
        if (this.e == 1) {
            return 1;
        }
        if ((wlq.f38110a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    public final int k() {
        return this.f7862a.requestAudioFocus(this.f7863b, wlq.b0(((nm1) rk1.e(this.d)).c), this.f);
    }

    @RequiresApi(26)
    public final int l() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            this.h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.h)).setAudioAttributes(((nm1) rk1.e(this.d)).a()).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f7863b).build();
            this.i = false;
        }
        return this.f7862a.requestAudioFocus(this.h);
    }

    public void m(nm1 nm1Var) {
        if (wlq.c(this.d, nm1Var)) {
            return;
        }
        this.d = nm1Var;
        int iE = e(nm1Var);
        this.f = iE;
        boolean z = true;
        if (iE != 1 && iE != 0) {
            z = false;
        }
        rk1.b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        b bVar = this.c;
        if (bVar != null) {
            bVar.s(f);
        }
    }

    public final boolean o(int i) {
        return i == 1 || this.f != 1;
    }

    public int p(boolean z, int i) {
        if (o(i)) {
            b();
            return z ? 1 : -1;
        }
        if (z) {
            return j();
        }
        return -1;
    }

    public final boolean q() {
        nm1 nm1Var = this.d;
        return nm1Var != null && nm1Var.f28056a == 1;
    }
}

package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.t;
import com.xiaomi.wearable.play.core.videoview.PlayerVideoView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class e1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerVideoView f16156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f16157b;
    public long c;
    public long d;
    public int e;
    public int f;
    public boolean g = false;
    public boolean h = false;
    public boolean i = true;
    public Handler j = new c(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f16158k = new b(this);
    public gdm l = new a();

    public class a extends gdm {
        public a() {
        }

        @Override // defpackage.gdm, defpackage.p0i
        public void c(int i) {
            super.c(i);
            ArrayList<Integer> arrayList = cil.d().c().get(1);
            if (arrayList == null || arrayList.isEmpty() || !arrayList.contains(Integer.valueOf(i))) {
                return;
            }
            if (e1i.this.f <= 0) {
                e1i.this.x();
            } else {
                e1i.this.D(true);
            }
            e1i.this.h = false;
        }

        @Override // defpackage.gdm, defpackage.p0i
        public void d(int i) {
            super.d(i);
            if (i == msi.j) {
                e1i.this.x();
            }
        }

        @Override // defpackage.gdm, defpackage.p0i
        public void e(int i) {
            super.e(i);
            if (i == msi.h) {
                e1i.this.z();
            }
        }
    }

    public static class b implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<e1i> f16160a;

        public b(e1i e1iVar) {
            this.f16160a = new WeakReference<>(e1iVar);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            e1i e1iVar;
            if (i != -1 || (e1iVar = this.f16160a.get()) == null) {
                return;
            }
            e1iVar.F(false);
        }
    }

    public class c extends pug<e1i> {
        public c(e1i e1iVar) {
            super(e1iVar);
        }

        @Override // defpackage.pug
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Message message, e1i e1iVar) {
            super.a(message, e1iVar);
            e1i e1iVar2 = e1i.this;
            e1iVar2.c = e1iVar2.q();
            e1i e1iVar3 = e1i.this;
            e1iVar3.d = e1iVar3.r();
            e1i e1iVar4 = e1i.this;
            e1iVar4.e = e1iVar4.p();
            e1i.this.f = 0;
            if (e1i.this.d > 0) {
                e1i e1iVar5 = e1i.this;
                e1iVar5.f = (int) ((e1iVar5.c * 100) / e1i.this.d);
            }
            if (!e1i.this.t() || e1i.this.f == 100) {
                return;
            }
            x0i.g().c(e1i.this.c, e1i.this.d, e1i.this.f, e1i.this.e);
        }
    }

    public e1i(PlayerVideoView playerVideoView) {
        this.f16156a = playerVideoView;
    }

    public void A() {
        this.g = false;
        D(true);
    }

    public void B(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("seekTo: ");
        sb.append(i);
        if (this.f16157b != null) {
            this.f16157b.seekTo((r() * ((long) i)) / 100);
        }
    }

    public final void C(int i) {
        Handler handler = this.j;
        if (handler != null) {
            handler.removeMessages(i);
            this.j.sendEmptyMessage(i);
        }
    }

    public final void D(boolean z) {
        v(z);
        F(z);
    }

    public void E(t tVar) {
        this.f16157b = tVar;
    }

    public final void F(boolean z) {
        if (z) {
            if (!t()) {
                x0i.g().onResume();
            }
        } else if (t()) {
            x0i.g().onPause();
        }
        t tVar = this.f16157b;
        if (tVar != null) {
            tVar.z(z);
        }
    }

    public void G() {
        C(5);
    }

    public void m() {
        if (this.h) {
            return;
        }
        this.i = t();
        StringBuilder sb = new StringBuilder();
        sb.append("autoPause: ");
        sb.append(this.i);
        D(false);
        this.h = true;
    }

    public void n() {
        if (this.h) {
            StringBuilder sb = new StringBuilder();
            sb.append("autoResume: ");
            sb.append(this.i);
            D(this.i);
            this.h = false;
        }
    }

    public void o() {
        G();
        q0i.f().g(this.l);
    }

    public int p() {
        t tVar = this.f16157b;
        if (tVar != null) {
            return tVar.R();
        }
        return 0;
    }

    public long q() {
        t tVar = this.f16157b;
        if (tVar != null) {
            return tVar.getCurrentPosition();
        }
        return 0L;
    }

    public long r() {
        t tVar = this.f16157b;
        if (tVar != null) {
            return tVar.getDuration();
        }
        return 0L;
    }

    public int s() {
        t tVar = this.f16157b;
        if (tVar != null) {
            return tVar.getPlaybackState();
        }
        return 1;
    }

    public boolean t() {
        t tVar = this.f16157b;
        if (tVar != null) {
            return tVar.n();
        }
        return false;
    }

    public boolean u() {
        return this.i;
    }

    public void v(boolean z) {
        Context contextB = cil.d().b();
        if (contextB == null || this.f16158k == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) contextB.getSystemService("audio");
        if (z) {
            audioManager.requestAudioFocus(this.f16158k, 3, 1);
        } else {
            audioManager.abandonAudioFocus(this.f16158k);
        }
    }

    public void w() {
        this.g = true;
        D(false);
    }

    public final void x() {
        PlayerVideoView playerVideoView = this.f16156a;
        if (playerVideoView != null) {
            playerVideoView.w();
        }
    }

    public void y() {
        if (this.f16157b == null) {
            return;
        }
        if (t()) {
            w();
            this.g = true;
        } else {
            A();
            this.g = false;
        }
    }

    public void z() {
        D(true);
        B(0);
    }
}

package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase;

/* JADX INFO: loaded from: classes2.dex */
public class u0i extends z92 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerControllerViewBase f35246b;
    public View c;
    public dwc d;
    public long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1i f35245a = new f1i();
    public boolean f = false;
    public Runnable g = new a();
    public SeekBar.OnSeekBarChangeListener h = new b();
    public hdm i = new c();
    public xjp.a j = new d();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0i.this.l();
        }
    }

    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (u0i.this.e > 0 && z) {
                u0i u0iVar = u0i.this;
                u0iVar.w((((long) i) * u0iVar.e) / 100);
            }
            u0i.this.f = z;
            x0i.g().f(seekBar, i, z);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.setThumb(u0i.this.f35246b.getResources().getDrawable(soi.f));
            u0i.this.p();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            u0i.this.f = false;
            u0i.this.q(seekBar);
            u0i.this.o(3000);
            seekBar.setThumb(u0i.this.f35246b.getResources().getDrawable(soi.e));
            x0i.g().onStopTrackingTouch(seekBar);
        }
    }

    public class c extends hdm {
        public c() {
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void a() {
            super.a();
            u0i.this.m();
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void c(long j, long j2, int i, int i2) {
            super.c(j, j2, i, i2);
            u0i.this.f35246b.f(i, i2);
            if (u0i.this.f) {
                return;
            }
            u0i.this.t(j, j2);
            u0i.this.f35246b.setSeekBar(i);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void d() {
            super.d();
            if (u0i.this.d.isPlaying()) {
                u0i.this.m();
            }
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onComplete() {
            super.onComplete();
            u0i.this.m();
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onError() {
            super.onError();
            u0i.this.m();
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onPause() {
            super.onPause();
            u0i.this.s(false);
            u0i.this.p();
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onResume() {
            super.onResume();
            u0i.this.s(true);
            u0i.this.o(3000);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onStart() {
            super.onStart();
            u0i.this.s(true);
        }
    }

    public class d implements xjp.a {
        public d() {
        }

        @Override // xjp.a
        public void a(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                if (u0i.this.c.getVisibility() == 0) {
                    u0i.this.l();
                    return;
                }
                int i = a1i.f525a;
                if (i == 2 || i == 4 || i == 3) {
                    return;
                }
                cil.d().f();
            }
        }
    }

    public u0i(PlayerControllerViewBase playerControllerViewBase) {
        this.f35246b = playerControllerViewBase;
        View animationView = playerControllerViewBase.getAnimationView();
        this.c = animationView;
        i1i.b(animationView, false);
    }

    public void h() {
        xjp.b().c(this.j);
        x0i.g().h(this.i);
    }

    public final void i() {
        q0i.f().b();
        o(3000);
    }

    public final void j() {
        dwc dwcVar = this.d;
        if (dwcVar != null) {
            dwcVar.a();
        }
        o(3000);
    }

    public SeekBar.OnSeekBarChangeListener k() {
        return this.h;
    }

    public void l() {
        this.f35245a.d(new View[]{this.c}, false);
        this.f35246b.g();
        x0i.g().b(false);
    }

    public final void m() {
        i1i.b(this.c, false);
        x0i.g().b(false);
    }

    public void n(View view) {
        int id = view.getId();
        if (id == msi.g) {
            i();
        } else if (id == msi.c) {
            j();
        } else if (id == msi.d) {
            q0i.f().a();
        }
    }

    public void o(int i) {
        if (this.d.isPlaying() && this.f35246b != null) {
            p();
            this.f35246b.postDelayed(this.g, i);
        }
    }

    public void p() {
        PlayerControllerViewBase playerControllerViewBase = this.f35246b;
        if (playerControllerViewBase != null) {
            playerControllerViewBase.removeCallbacks(this.g);
        }
    }

    public void q(SeekBar seekBar) {
        dwc dwcVar = this.d;
        if (dwcVar != null) {
            dwcVar.seekTo(seekBar.getProgress());
        }
    }

    public void r(vta vtaVar) {
    }

    public void s(boolean z) {
        this.f35246b.setPlayImage(z);
    }

    public void t(long j, long j2) {
        try {
            this.e = j2;
            this.f35246b.e(efp.a(j), efp.a(j2));
        } catch (Exception unused) {
        }
    }

    public void u(dwc dwcVar) {
        this.d = dwcVar;
    }

    public void v() {
        xjp.b().d(this.j);
        x0i.g().i(this.i);
    }

    public void w(long j) {
        try {
            this.f35246b.h(efp.a(j));
        } catch (Exception unused) {
        }
    }
}

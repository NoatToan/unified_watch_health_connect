package defpackage;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c1i {
    public static final String f = "c1i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f4825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4826b = true;
    public Bundle c = new Bundle();
    public ConcurrentHashMap<Integer, mzc> d = new ConcurrentHashMap<>();
    public hdm e = new a();

    public class a extends hdm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4827a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4828b = -1;
        public int c = -1;
        public boolean d;

        public a() {
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void a() {
            super.a();
            String unused = c1i.f;
            c1i.this.k(4);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void c(long j, long j2, int i, int i2) {
            super.c(j, j2, i, i2);
            this.f4827a = j;
            c1i.this.f4826b = j == 0;
            String unused = c1i.f;
            StringBuilder sb = new StringBuilder();
            sb.append("onProgress: ");
            sb.append(j);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void d() {
            super.d();
            String unused = c1i.f;
            int i = this.f4828b;
            if (i == 1 || i == 4 || !this.d || this.f4827a <= 0 || this.c >= 100) {
                return;
            }
            c1i.this.k(1);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void e(boolean z, int i) {
            super.e(z, i);
            this.f4828b = i;
            this.d = z;
            String unused = c1i.f;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayerState: ");
            sb.append(z);
            sb.append(" ");
            sb.append(i);
            if (z && this.f4828b == 3) {
                c1i.this.j();
            }
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void f(SeekBar seekBar, int i, boolean z) {
            super.f(seekBar, i, z);
            this.c = i;
            String unused = c1i.f;
            StringBuilder sb = new StringBuilder();
            sb.append("onSeekBarChanged: ");
            sb.append(i);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onComplete() {
            super.onComplete();
            String unused = c1i.f;
            c1i.this.k(2);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onError() {
            super.onError();
            String unused = c1i.f;
            c1i.this.k(3);
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onStart() {
            super.onStart();
            String unused = c1i.f;
            c1i.this.j();
        }
    }

    public c1i(FrameLayout frameLayout) {
        this.f4825a = frameLayout;
    }

    public final mzc e() {
        mzc r0iVar;
        if (this.d.get(2) != null) {
            return this.d.get(2);
        }
        try {
            r0iVar = (mzc) Class.forName(cil.d().e().get(2)).newInstance();
        } catch (Exception unused) {
            r0iVar = new r0i();
        }
        this.d.put(2, r0iVar);
        return r0iVar;
    }

    public final mzc f() {
        mzc v0iVar;
        if (this.d.get(3) != null) {
            return this.d.get(3);
        }
        try {
            v0iVar = (mzc) Class.forName(cil.d().e().get(3)).newInstance();
        } catch (Exception unused) {
            v0iVar = new v0i();
        }
        this.d.put(3, v0iVar);
        return v0iVar;
    }

    public final mzc g() {
        try {
            return (mzc) Class.forName(cil.d().e().get(1)).newInstance();
        } catch (Exception unused) {
            return new y0i();
        }
    }

    public final mzc h() {
        mzc z0iVar;
        if (this.d.get(4) != null) {
            return this.d.get(4);
        }
        try {
            z0iVar = (mzc) Class.forName(cil.d().e().get(4)).newInstance();
        } catch (Exception unused) {
            z0iVar = new z0i();
        }
        this.d.put(4, z0iVar);
        return z0iVar;
    }

    public void i() {
        x0i.g().h(this.e);
    }

    public final void j() {
        FrameLayout frameLayout = this.f4825a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            a1i.f525a = 0;
        }
    }

    public final void k(int i) {
        mzc mzcVarG;
        if (i != a1i.f525a || i == 0) {
            j();
            a1i.f525a = i;
            if (i == 2) {
                mzcVarG = e();
            } else if (i == 4) {
                mzcVarG = h();
            } else {
                mzcVarG = i == 1 ? g() : f();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("showStatusView: ");
            sb.append(i);
            mzcVarG.a(this.f4825a);
            this.c.putBoolean("is_first_loading", this.f4826b);
            mzcVarG.b(this.c);
        }
    }
}

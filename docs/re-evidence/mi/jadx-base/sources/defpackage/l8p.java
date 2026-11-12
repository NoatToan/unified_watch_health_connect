package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.e;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l8p extends e implements Handler.Callback {
    public long A;
    public final Handler m;
    public final j8p n;
    public final uoo o;
    public final a1a p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24789r;
    public boolean s;
    public int t;
    public Format u;
    public too v;
    public voo w;
    public woo x;
    public woo y;
    public int z;

    public l8p(j8p j8pVar, Looper looper, uoo uooVar) {
        super(3);
        this.n = (j8p) rk1.e(j8pVar);
        this.m = looper == null ? null : wlq.w(looper, this);
        this.o = uooVar;
        this.p = new a1a();
        this.A = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public void F() {
        this.u = null;
        this.A = -9223372036854775807L;
        O();
        U();
    }

    @Override // com.google.android.exoplayer2.e
    public void H(long j, boolean z) {
        O();
        this.q = false;
        this.f24789r = false;
        this.A = -9223372036854775807L;
        if (this.t != 0) {
            V();
        } else {
            T();
            ((too) rk1.e(this.v)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void L(Format[] formatArr, long j, long j2) {
        this.u = formatArr[0];
        if (this.v != null) {
            this.t = 1;
        } else {
            R();
        }
    }

    public final void O() {
        X(Collections.emptyList());
    }

    public final long P() {
        if (this.z == -1) {
            return Long.MAX_VALUE;
        }
        rk1.e(this.x);
        if (this.z >= this.x.b()) {
            return Long.MAX_VALUE;
        }
        return this.x.a(this.z);
    }

    public final void Q(SubtitleDecoderException subtitleDecoderException) {
        String strValueOf = String.valueOf(this.u);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        toe.d("TextRenderer", sb.toString(), subtitleDecoderException);
        O();
        V();
    }

    public final void R() {
        this.s = true;
        this.v = this.o.b((Format) rk1.e(this.u));
    }

    public final void S(List<h55> list) {
        this.n.onCues(list);
    }

    public final void T() {
        this.w = null;
        this.z = -1;
        woo wooVar = this.x;
        if (wooVar != null) {
            wooVar.r();
            this.x = null;
        }
        woo wooVar2 = this.y;
        if (wooVar2 != null) {
            wooVar2.r();
            this.y = null;
        }
    }

    public final void U() {
        T();
        ((too) rk1.e(this.v)).release();
        this.v = null;
        this.t = 0;
    }

    public final void V() {
        U();
        R();
    }

    public void W(long j) {
        rk1.g(j());
        this.A = j;
    }

    public final void X(List<h55> list) {
        Handler handler = this.m;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            S(list);
        }
    }

    @Override // defpackage.rkk
    public int a(Format format) {
        if (this.o.a(format)) {
            return rkk.t(format.E == null ? 4 : 2);
        }
        return ayf.r(format.l) ? rkk.t(1) : rkk.t(0);
    }

    @Override // com.google.android.exoplayer2.s
    public boolean b() {
        return this.f24789r;
    }

    @Override // com.google.android.exoplayer2.s, defpackage.rkk
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        S((List) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.s
    public boolean isReady() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    @Override // com.google.android.exoplayer2.s
    public void l(long j, long j2) throws DecoderException {
        boolean z;
        if (j()) {
            long j3 = this.A;
            if (j3 != -9223372036854775807L && j >= j3) {
                T();
                this.f24789r = true;
            }
        }
        if (this.f24789r) {
            return;
        }
        if (this.y == null) {
            ((too) rk1.e(this.v)).b(j);
            try {
                this.y = ((too) rk1.e(this.v)).c();
            } catch (SubtitleDecoderException e) {
                Q(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.x != null) {
            long jP = P();
            z = false;
            while (jP <= j) {
                this.z++;
                jP = P();
                z = true;
            }
        } else {
            z = false;
        }
        woo wooVar = this.y;
        if (wooVar != null) {
            if (!wooVar.n()) {
                if (wooVar.f21056b <= j) {
                    woo wooVar2 = this.x;
                    if (wooVar2 != null) {
                        wooVar2.r();
                    }
                    this.z = wooVar.c(j);
                    this.x = wooVar;
                    this.y = null;
                }
                rk1.e(this.x);
                X(this.x.d(j));
            } else if (!z && P() == Long.MAX_VALUE) {
                if (this.t == 2) {
                    V();
                } else {
                    T();
                    this.f24789r = true;
                }
            }
            if (z) {
                rk1.e(this.x);
                X(this.x.d(j));
            }
        } else if (z) {
            rk1.e(this.x);
            X(this.x.d(j));
        }
        if (this.t == 2) {
            return;
        }
        while (!this.q) {
            try {
                voo vooVarA = this.w;
                if (vooVarA == null) {
                    vooVarA = ((too) rk1.e(this.v)).a();
                    if (vooVarA == null) {
                        return;
                    } else {
                        this.w = vooVarA;
                    }
                }
                if (this.t == 1) {
                    vooVarA.p(4);
                    ((too) rk1.e(this.v)).d(vooVarA);
                    this.w = null;
                    this.t = 2;
                    return;
                }
                int iM = M(this.p, vooVarA, 0);
                if (iM == -4) {
                    if (vooVarA.n()) {
                        this.q = true;
                        this.s = false;
                    } else {
                        Format format = this.p.f517b;
                        if (format == null) {
                            return;
                        }
                        vooVarA.i = format.p;
                        vooVarA.u();
                        this.s &= !vooVarA.o();
                    }
                    if (!this.s) {
                        ((too) rk1.e(this.v)).d(vooVarA);
                        this.w = null;
                    }
                } else if (iM == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                Q(e2);
                return;
            }
        }
    }

    public l8p(j8p j8pVar, Looper looper) {
        this(j8pVar, looper, uoo.f35974a);
    }
}

package qa;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.q;
import androidx.media3.common.w;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.u0;
import com.google.android.exoplayer2.C;
import fa.z;
import j20.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f implements Handler.Callback {
    public boolean A;
    public long B;
    public w C;
    public long D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f143830r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f143831t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f143832v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kb.a f143833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f143834x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public kb.b f143835y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f143836z;

    public c(b bVar, Looper looper, a aVar, boolean z14) {
        Handler handler;
        super(5);
        bVar.getClass();
        this.f143831t = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i14 = z.f70071a;
            handler = new Handler(looper, this);
        }
        this.f143832v = handler;
        aVar.getClass();
        this.f143830r = aVar;
        this.f143834x = z14;
        this.f143833w = new kb.a();
        this.D = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.u0
    public final int a(q qVar) {
        if (this.f143830r.a(qVar)) {
            return u0.h(qVar.L == 0 ? 4 : 2, 0, 0, 0);
        }
        return u0.h(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            x.h();
            return false;
        }
        this.f143831t.Y((w) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public final boolean isEnded() {
        return this.A;
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void m() {
        this.C = null;
        this.f143835y = null;
        this.D = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.f
    public final void o(long j8, boolean z14) {
        this.C = null;
        this.f143836z = false;
        this.A = false;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void render(long j8, long j14) {
        boolean z14 = true;
        while (z14) {
            if (!this.f143836z && this.C == null) {
                kb.a aVar = this.f143833w;
                aVar.c();
                a0 a0Var = this.f8923c;
                a0Var.a();
                int iU = u(a0Var, aVar, 0);
                if (iU == -4) {
                    if (aVar.b(4)) {
                        this.f143836z = true;
                    } else if (aVar.f8633f >= this.f8932l) {
                        aVar.f103756j = this.B;
                        aVar.f();
                        kb.b bVar = this.f143835y;
                        int i14 = z.f70071a;
                        w wVarA = bVar.a(aVar);
                        if (wVarA != null) {
                            ArrayList arrayList = new ArrayList(wVarA.f8574a.length);
                            v(wVarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.C = new w(w(aVar.f8633f), arrayList);
                            }
                        }
                    }
                } else if (iU == -5) {
                    q qVar = a0Var.f8667b;
                    qVar.getClass();
                    this.B = qVar.f8391s;
                }
            }
            w wVar = this.C;
            if (wVar == null || (!this.f143834x && wVar.f8575b > w(j8))) {
                z14 = false;
            } else {
                w wVar2 = this.C;
                Handler handler = this.f143832v;
                if (handler != null) {
                    handler.obtainMessage(1, wVar2).sendToTarget();
                } else {
                    this.f143831t.Y(wVar2);
                }
                this.C = null;
                z14 = true;
            }
            if (this.f143836z && this.C == null) {
                this.A = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void t(q[] qVarArr, long j8, long j14, j.b bVar) {
        this.f143835y = this.f143830r.b(qVarArr[0]);
        w wVar = this.C;
        if (wVar != null) {
            long j15 = wVar.f8575b;
            long j16 = (this.D + j15) - j14;
            if (j15 != j16) {
                wVar = new w(j16, wVar.f8574a);
            }
            this.C = wVar;
        }
        this.D = j14;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void v(w wVar, ArrayList arrayList) {
        int i14 = 0;
        while (true) {
            w.b[] bVarArr = wVar.f8574a;
            if (i14 >= bVarArr.length) {
                return;
            }
            q wrappedMetadataFormat = bVarArr[i14].getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null) {
                a aVar = this.f143830r;
                if (aVar.a(wrappedMetadataFormat)) {
                    kb.b bVarB = aVar.b(wrappedMetadataFormat);
                    byte[] wrappedMetadataBytes = bVarArr[i14].getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    kb.a aVar2 = this.f143833w;
                    aVar2.c();
                    aVar2.e(wrappedMetadataBytes.length);
                    ByteBuffer byteBuffer = aVar2.f8631d;
                    int i15 = z.f70071a;
                    byteBuffer.put(wrappedMetadataBytes);
                    aVar2.f();
                    w wVarA = bVarB.a(aVar2);
                    if (wVarA != null) {
                        v(wVarA, arrayList);
                    }
                } else {
                    arrayList.add(bVarArr[i14]);
                }
            } else {
                arrayList.add(bVarArr[i14]);
            }
            i14++;
        }
    }

    public final long w(long j8) {
        fa.a.d(j8 != C.TIME_UNSET);
        fa.a.d(this.D != C.TIME_UNSET);
        return j8 - this.D;
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f143829a);
    }
}

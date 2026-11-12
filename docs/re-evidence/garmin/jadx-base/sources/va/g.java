package va;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.p;
import androidx.media3.common.q;
import androidx.media3.common.x;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.u0;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import fa.k;
import fa.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import vb.h;
import yb.j;
import yb.l;
import yb.m;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.media3.exoplayer.f implements Handler.Callback {
    public l A;
    public m B;
    public m C;
    public int D;
    public final Handler E;
    public final f F;
    public final a0 I;
    public boolean P;
    public boolean T;
    public q X;
    public long Y;
    public long Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public IOException f176559k0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yb.a f176560r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecoderInputBuffer f176561t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f176562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f176563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f176564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f176565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f176566z;

    public g(f fVar, Looper looper, e eVar) {
        Handler handler;
        super(3);
        fVar.getClass();
        this.F = fVar;
        if (looper == null) {
            handler = null;
        } else {
            int i14 = z.f70071a;
            handler = new Handler(looper, this);
        }
        this.E = handler;
        this.f176563w = eVar;
        this.f176560r = new yb.a();
        this.f176561t = new DecoderInputBuffer(1);
        this.I = new a0();
        this.Z = C.TIME_UNSET;
        this.Y = C.TIME_UNSET;
    }

    public final void A() {
        this.A = null;
        this.D = -1;
        m mVar = this.B;
        if (mVar != null) {
            mVar.d();
            this.B = null;
        }
        m mVar2 = this.C;
        if (mVar2 != null) {
            mVar2.d();
            this.C = null;
        }
    }

    @Override // androidx.media3.exoplayer.u0
    public final int a(q qVar) {
        boolean zEquals = Objects.equals(qVar.f8386n, "application/x-media3-cues");
        String str = qVar.f8386n;
        if (!zEquals) {
            e.a aVar = (e.a) this.f176563w;
            aVar.getClass();
            if (!aVar.f176558b.a(qVar) && !Objects.equals(str, MimeTypes.APPLICATION_CEA608) && !Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) && !Objects.equals(str, MimeTypes.APPLICATION_CEA708)) {
                return x.l(str) ? u0.h(1, 0, 0, 0) : u0.h(0, 0, 0, 0);
            }
        }
        return u0.h(qVar.L == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            j20.x.h();
            return false;
        }
        ea.b bVar = (ea.b) message.obj;
        ImmutableList<ea.a> immutableList = bVar.f63586a;
        f fVar = this.F;
        fVar.onCues(immutableList);
        fVar.n(bVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public final boolean isEnded() {
        return this.T;
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean isReady() {
        if (this.X != null) {
            if (this.f176559k0 == null) {
                try {
                    maybeThrowStreamError();
                } catch (IOException e4) {
                    this.f176559k0 = e4;
                }
            }
            if (this.f176559k0 != null) {
                q qVar = this.X;
                qVar.getClass();
                if (Objects.equals(qVar.f8386n, "application/x-media3-cues")) {
                    a aVar = this.f176562v;
                    aVar.getClass();
                    return aVar.c(this.Y) != Long.MIN_VALUE;
                }
                if (!this.T) {
                    if (this.P) {
                        m mVar = this.B;
                        long j8 = this.Y;
                        if (mVar == null || mVar.getEventTime(mVar.getEventTimeCount() - 1) <= j8) {
                            m mVar2 = this.C;
                            long j14 = this.Y;
                            if ((mVar2 == null || mVar2.getEventTime(mVar2.getEventTimeCount() - 1) <= j14) && this.A != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void m() {
        this.X = null;
        this.Z = C.TIME_UNSET;
        w();
        this.Y = C.TIME_UNSET;
        if (this.f176566z != null) {
            A();
            j jVar = this.f176566z;
            jVar.getClass();
            jVar.release();
            this.f176566z = null;
            this.f176565y = 0;
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void o(long j8, boolean z14) {
        this.Y = j8;
        a aVar = this.f176562v;
        if (aVar != null) {
            aVar.clear();
        }
        w();
        this.P = false;
        this.T = false;
        this.Z = C.TIME_UNSET;
        q qVar = this.X;
        if (qVar == null || Objects.equals(qVar.f8386n, "application/x-media3-cues")) {
            return;
        }
        if (this.f176565y == 0) {
            A();
            j jVar = this.f176566z;
            jVar.getClass();
            jVar.flush();
            jVar.b(this.f8932l);
            return;
        }
        A();
        j jVar2 = this.f176566z;
        jVar2.getClass();
        jVar2.release();
        this.f176566z = null;
        this.f176565y = 0;
        z();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void render(long j8, long j14) {
        boolean z14;
        a0 a0Var;
        long eventTime;
        if (this.f8934n) {
            long j15 = this.Z;
            if (j15 != C.TIME_UNSET && j8 >= j15) {
                A();
                this.T = true;
            }
        }
        if (this.T) {
            return;
        }
        q qVar = this.X;
        qVar.getClass();
        boolean zEquals = Objects.equals(qVar.f8386n, "application/x-media3-cues");
        f fVar = this.F;
        Handler handler = this.E;
        a0 a0Var2 = this.I;
        boolean zA = false;
        if (zEquals) {
            this.f176562v.getClass();
            if (!this.P) {
                DecoderInputBuffer decoderInputBuffer = this.f176561t;
                if (u(a0Var2, decoderInputBuffer, 0) == -4) {
                    if (decoderInputBuffer.b(4)) {
                        this.P = true;
                    } else {
                        decoderInputBuffer.f();
                        ByteBuffer byteBuffer = decoderInputBuffer.f8631d;
                        byteBuffer.getClass();
                        long j16 = decoderInputBuffer.f8633f;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f176560r.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        yb.c cVar = new yb.c(fa.b.a(new p(20), parcelableArrayList), j16, bundle.getLong("d"));
                        decoderInputBuffer.c();
                        zA = this.f176562v.a(cVar, j8);
                    }
                }
            }
            long jC = this.f176562v.c(this.Y);
            if (jC == Long.MIN_VALUE && this.P && !zA) {
                this.T = true;
            }
            if (jC != Long.MIN_VALUE && jC <= j8) {
                zA = true;
            }
            if (zA) {
                ImmutableList<ea.a> immutableListB = this.f176562v.b(j8);
                long jE = this.f176562v.e(j8);
                ea.b bVar = new ea.b(immutableListB, y(jE));
                if (handler != null) {
                    handler.obtainMessage(1, bVar).sendToTarget();
                } else {
                    fVar.onCues(bVar.f63586a);
                    fVar.n(bVar);
                }
                this.f176562v.d(jE);
            }
            this.Y = j8;
            return;
        }
        v();
        this.Y = j8;
        if (this.C == null) {
            j jVar = this.f176566z;
            jVar.getClass();
            jVar.setPositionUs(j8);
            try {
                j jVar2 = this.f176566z;
                jVar2.getClass();
                this.C = jVar2.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e4) {
                k.d("Subtitle decoding failed. streamFormat=" + this.X, e4);
                w();
                A();
                j jVar3 = this.f176566z;
                jVar3.getClass();
                jVar3.release();
                this.f176566z = null;
                this.f176565y = 0;
                z();
                return;
            }
        }
        if (this.f8928h != 2) {
            return;
        }
        if (this.B != null) {
            long jX = x();
            z14 = false;
            while (jX <= j8) {
                this.D++;
                jX = x();
                z14 = true;
            }
        } else {
            z14 = false;
        }
        m mVar = this.C;
        if (mVar == null) {
            a0Var = a0Var2;
        } else if (mVar.b(4)) {
            if (!z14 && x() == Long.MAX_VALUE) {
                if (this.f176565y == 2) {
                    A();
                    j jVar4 = this.f176566z;
                    jVar4.getClass();
                    jVar4.release();
                    this.f176566z = null;
                    this.f176565y = 0;
                    z();
                } else {
                    A();
                    this.T = true;
                }
            }
            a0Var = a0Var2;
        } else {
            a0Var = a0Var2;
            if (mVar.f92385b <= j8) {
                m mVar2 = this.B;
                if (mVar2 != null) {
                    mVar2.d();
                }
                this.D = mVar.getNextEventTimeIndex(j8);
                this.B = mVar;
                this.C = null;
                z14 = true;
            }
        }
        if (z14) {
            this.B.getClass();
            int nextEventTimeIndex = this.B.getNextEventTimeIndex(j8);
            if (nextEventTimeIndex == 0 || this.B.getEventTimeCount() == 0) {
                eventTime = this.B.f92385b;
            } else {
                m mVar3 = this.B;
                eventTime = nextEventTimeIndex == -1 ? mVar3.getEventTime(mVar3.getEventTimeCount() - 1) : mVar3.getEventTime(nextEventTimeIndex - 1);
            }
            ea.b bVar2 = new ea.b(this.B.getCues(j8), y(eventTime));
            if (handler != null) {
                handler.obtainMessage(1, bVar2).sendToTarget();
            } else {
                fVar.onCues(bVar2.f63586a);
                fVar.n(bVar2);
            }
        }
        if (this.f176565y == 2) {
            return;
        }
        while (!this.P) {
            try {
                l lVarDequeueInputBuffer = this.A;
                if (lVarDequeueInputBuffer == null) {
                    j jVar5 = this.f176566z;
                    jVar5.getClass();
                    lVarDequeueInputBuffer = jVar5.dequeueInputBuffer();
                    if (lVarDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.A = lVarDequeueInputBuffer;
                    }
                }
                if (this.f176565y == 1) {
                    lVarDequeueInputBuffer.f92372a = 4;
                    j jVar6 = this.f176566z;
                    jVar6.getClass();
                    jVar6.a(lVarDequeueInputBuffer);
                    this.A = null;
                    this.f176565y = 2;
                    return;
                }
                int iU = u(a0Var, lVarDequeueInputBuffer, 0);
                if (iU == -4) {
                    if (lVarDequeueInputBuffer.b(4)) {
                        this.P = true;
                        this.f176564x = false;
                    } else {
                        q qVar2 = a0Var.f8667b;
                        if (qVar2 == null) {
                            return;
                        }
                        lVarDequeueInputBuffer.f195659j = qVar2.f8391s;
                        lVarDequeueInputBuffer.f();
                        this.f176564x &= !lVarDequeueInputBuffer.b(1);
                    }
                    if (!this.f176564x) {
                        j jVar7 = this.f176566z;
                        jVar7.getClass();
                        jVar7.a(lVarDequeueInputBuffer);
                        this.A = null;
                    }
                } else if (iU == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e14) {
                k.d("Subtitle decoding failed. streamFormat=" + this.X, e14);
                w();
                A();
                j jVar8 = this.f176566z;
                jVar8.getClass();
                jVar8.release();
                this.f176566z = null;
                this.f176565y = 0;
                z();
                return;
            }
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void t(q[] qVarArr, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar) {
        q qVar = qVarArr[0];
        this.X = qVar;
        if (Objects.equals(qVar.f8386n, "application/x-media3-cues")) {
            this.f176562v = this.X.I == 1 ? new c() : new d();
            return;
        }
        v();
        if (this.f176566z != null) {
            this.f176565y = 1;
        } else {
            z();
        }
    }

    public final void v() {
        fa.a.e(Objects.equals(this.X.f8386n, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.X.f8386n, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.X.f8386n, MimeTypes.APPLICATION_CEA708), "Legacy decoding is disabled, can't handle " + this.X.f8386n + " samples (expected application/x-media3-cues).");
    }

    public final void w() {
        ea.b bVar = new ea.b(ImmutableList.of(), y(this.Y));
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
            return;
        }
        ImmutableList<ea.a> immutableList = bVar.f63586a;
        f fVar = this.F;
        fVar.onCues(immutableList);
        fVar.n(bVar);
    }

    public final long x() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        this.B.getClass();
        if (this.D >= this.B.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.B.getEventTime(this.D);
    }

    public final long y(long j8) {
        fa.a.d(j8 != C.TIME_UNSET);
        return j8 - this.f8931k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    public final void z() {
        j bVar;
        byte b14 = 1;
        this.f176564x = true;
        q qVar = this.X;
        qVar.getClass();
        yb.e eVar = ((e.a) this.f176563w).f176558b;
        String str = qVar.f8386n;
        int i14 = qVar.H;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b14 = !str.equals(MimeTypes.APPLICATION_MP4CEA608) ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals(MimeTypes.APPLICATION_CEA608)) {
                        b14 = -1;
                    }
                    break;
                case 1566016562:
                    b14 = !str.equals(MimeTypes.APPLICATION_CEA708) ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b14 = -1;
                    break;
            }
            switch (b14) {
                case 0:
                case 1:
                    bVar = new zb.a(str, i14, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
                    break;
                case 2:
                    bVar = new zb.b(i14, qVar.f8389q);
                    break;
                default:
                    if (eVar.a(qVar)) {
                        h.s(fb1.c.n("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    } else {
                        n nVarC = eVar.c(qVar);
                        bVar = new b(nVarC.getClass().getSimpleName().concat("Decoder"), nVarC);
                    }
                    break;
            }
        } else if (eVar.a(qVar)) {
            h.s(fb1.c.n("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            n nVarC2 = eVar.c(qVar);
            bVar = new b(nVarC2.getClass().getSimpleName().concat("Decoder"), nVarC2);
        }
        this.f176566z = bVar;
        bVar.b(this.f8932l);
    }

    public g(f fVar, Looper looper) {
        this(fVar, looper, e.f176557a);
    }
}

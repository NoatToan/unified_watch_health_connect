package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.e;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class nh3 extends e {
    public final DecoderInputBuffer m;
    public final okh n;
    public long o;
    public mh3 p;
    public long q;

    public nh3() {
        super(6);
        this.m = new DecoderInputBuffer(1);
        this.n = new okh();
    }

    @Override // com.google.android.exoplayer2.e
    public void F() {
        P();
    }

    @Override // com.google.android.exoplayer2.e
    public void H(long j, boolean z) {
        this.q = Long.MIN_VALUE;
        P();
    }

    @Override // com.google.android.exoplayer2.e
    public void L(Format[] formatArr, long j, long j2) {
        this.o = j2;
    }

    public final float[] O(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.n.N(byteBuffer.array(), byteBuffer.limit());
        this.n.P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.n.q());
        }
        return fArr;
    }

    public final void P() {
        mh3 mh3Var = this.p;
        if (mh3Var != null) {
            mh3Var.d();
        }
    }

    @Override // defpackage.rkk
    public int a(Format format) {
        return "application/x-camera-motion".equals(format.l) ? rkk.t(4) : rkk.t(0);
    }

    @Override // com.google.android.exoplayer2.s
    public boolean b() {
        return f();
    }

    @Override // com.google.android.exoplayer2.s, defpackage.rkk
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r.b
    public void h(int i, Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.p = (mh3) obj;
        } else {
            super.h(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.s
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.s
    public void l(long j, long j2) {
        while (!f() && this.q < 100000 + j) {
            this.m.h();
            if (M(B(), this.m, 0) != -4 || this.m.n()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.m;
            this.q = decoderInputBuffer.e;
            if (this.p != null && !decoderInputBuffer.m()) {
                this.m.u();
                float[] fArrO = O((ByteBuffer) wlq.j(this.m.c));
                if (fArrO != null) {
                    ((mh3) wlq.j(this.p)).c(this.q - this.o, fArrO);
                }
            }
        }
    }
}

package ab;

import androidx.media3.common.q;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.u0;
import com.google.android.exoplayer2.util.MimeTypes;
import fa.r;
import fa.z;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.media3.exoplayer.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DecoderInputBuffer f2422r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f2423t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f2424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2425w;

    public b() {
        super(6);
        this.f2422r = new DecoderInputBuffer(1);
        this.f2423t = new r();
    }

    @Override // androidx.media3.exoplayer.u0
    public final int a(q qVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(qVar.f8386n) ? u0.h(4, 0, 0, 0) : u0.h(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.r0.b
    public final void handleMessage(int i14, Object obj) {
        if (i14 == 8) {
            this.f2424v = (a) obj;
        }
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void m() {
        a aVar = this.f2424v;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void o(long j8, boolean z14) {
        this.f2425w = Long.MIN_VALUE;
        a aVar = this.f2424v;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.t0
    public final void render(long j8, long j14) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.f2425w < 100000 + j8) {
            DecoderInputBuffer decoderInputBuffer = this.f2422r;
            decoderInputBuffer.c();
            a0 a0Var = this.f8923c;
            a0Var.a();
            if (u(a0Var, decoderInputBuffer, 0) != -4 || decoderInputBuffer.b(4)) {
                return;
            }
            long j15 = decoderInputBuffer.f8633f;
            this.f2425w = j15;
            boolean z14 = j15 < this.f8932l;
            if (this.f2424v != null && !z14) {
                decoderInputBuffer.f();
                ByteBuffer byteBuffer = decoderInputBuffer.f8631d;
                int i14 = z.f70071a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    r rVar = this.f2423t;
                    rVar.E(bArrArray, iLimit);
                    rVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i15 = 0; i15 < 3; i15++) {
                        fArr2[i15] = Float.intBitsToFloat(rVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f2424v.onCameraMotion(this.f2425w - this.f8931k, fArr);
                }
            }
        }
    }
}

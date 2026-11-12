package oa;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.q;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.u0;
import com.google.android.exoplayer2.C;
import j20.x;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class e extends f {
    public long A;
    public int B;
    public int C;
    public q D;
    public oa.b E;
    public DecoderInputBuffer F;
    public ImageOutput I;
    public Bitmap P;
    public boolean T;
    public b X;
    public b Y;
    public int Z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c.a f131022r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecoderInputBuffer f131023t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque<a> f131024v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f131025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f131026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f131027y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f131028z;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f131029c = new a(C.TIME_UNSET, C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f131030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f131031b;

        public a(long j8, long j14) {
            this.f131030a = j8;
            this.f131031b = j14;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f131032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f131033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap f131034c;

        public b(int i14, long j8) {
            this.f131032a = i14;
            this.f131033b = j8;
        }
    }

    public e(c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f131022r = aVar;
        this.I = imageOutput == null ? ImageOutput.f9170a : imageOutput;
        this.f131023t = new DecoderInputBuffer(0);
        this.f131027y = a.f131029c;
        this.f131024v = new ArrayDeque<>();
        this.A = C.TIME_UNSET;
        this.f131028z = C.TIME_UNSET;
        this.B = 0;
        this.C = 1;
    }

    @Override // androidx.media3.exoplayer.u0
    public final int a(q qVar) {
        return ((oa.b.C2489b) this.f131022r).a(qVar);
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.r0.b
    public final void handleMessage(int i14, Object obj) {
        if (i14 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f9170a;
        }
        this.I = imageOutput;
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public final boolean isEnded() {
        return this.f131026x;
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean isReady() {
        int i14 = this.C;
        if (i14 != 3) {
            return i14 == 0 && this.T;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void m() {
        this.D = null;
        this.f131027y = a.f131029c;
        this.f131024v.clear();
        y();
        this.I.a();
    }

    @Override // androidx.media3.exoplayer.f
    public final void n(boolean z14, boolean z15) {
        this.C = z15 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.f
    public final void o(long j8, boolean z14) {
        this.C = Math.min(this.C, 1);
        this.f131026x = false;
        this.f131025w = false;
        this.P = null;
        this.X = null;
        this.Y = null;
        this.T = false;
        this.F = null;
        oa.b bVar = this.E;
        if (bVar != null) {
            bVar.flush();
        }
        this.f131024v.clear();
    }

    @Override // androidx.media3.exoplayer.f
    public final void p() {
        y();
    }

    @Override // androidx.media3.exoplayer.f
    public final void q() {
        y();
        this.C = Math.min(this.C, 1);
    }

    @Override // androidx.media3.exoplayer.t0
    public final void render(long j8, long j14) throws ExoPlaybackException {
        if (this.f131026x) {
            return;
        }
        if (this.D == null) {
            a0 a0Var = this.f8923c;
            a0Var.a();
            DecoderInputBuffer decoderInputBuffer = this.f131023t;
            decoderInputBuffer.c();
            int iU = u(a0Var, decoderInputBuffer, 2);
            if (iU != -5) {
                if (iU == -4) {
                    fa.a.d(decoderInputBuffer.b(4));
                    this.f131025w = true;
                    this.f131026x = true;
                    return;
                }
                return;
            }
            q qVar = a0Var.f8667b;
            fa.a.f(qVar);
            this.D = qVar;
            x();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (v(j8)) {
            }
            while (w(j8)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e4) {
            throw l(e4, null, false, 4003);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(q[] qVarArr, long j8, long j14, j.b bVar) {
        if (this.f131027y.f131031b != C.TIME_UNSET) {
            ArrayDeque<a> arrayDeque = this.f131024v;
            if (arrayDeque.isEmpty()) {
                long j15 = this.A;
                if (j15 != C.TIME_UNSET) {
                    long j16 = this.f131028z;
                    if (j16 != C.TIME_UNSET) {
                    }
                }
            }
            arrayDeque.add(new a(this.A, j14));
            return;
        }
        this.f131027y = new a(C.TIME_UNSET, j14);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    public final boolean v(long j8) throws ExoPlaybackException {
        boolean z14;
        b bVar;
        Bitmap bitmap;
        long j14;
        boolean z15;
        int i14;
        boolean z16;
        int i15;
        int i16;
        q qVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.P;
        if ((bitmap2 == null || this.X != null) && (this.C != 0 || this.f8928h == 2)) {
            ArrayDeque<a> arrayDeque = this.f131024v;
            if (bitmap2 == null) {
                fa.a.f(this.E);
                d dVarDequeueOutputBuffer = this.E.dequeueOutputBuffer();
                if (dVarDequeueOutputBuffer != null) {
                    if (!dVarDequeueOutputBuffer.b(4)) {
                        fa.a.g(dVarDequeueOutputBuffer.f131021d, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.P = dVarDequeueOutputBuffer.f131021d;
                        dVarDequeueOutputBuffer.d();
                        if (this.T && this.P != null && this.X != null) {
                            fa.a.f(this.D);
                            q qVar2 = this.D;
                            int i17 = qVar2.J;
                            int i18 = qVar2.K;
                            z14 = ((i17 != 1 && i18 == 1) || i17 == -1 || i18 == -1) ? false : true;
                            bVar = this.X;
                            if (bVar.f131034c == null) {
                                if (z14) {
                                    int i19 = bVar.f131032a;
                                    fa.a.f(this.P);
                                    int width = this.P.getWidth();
                                    q qVar3 = this.D;
                                    fa.a.f(qVar3);
                                    int i24 = width / qVar3.J;
                                    int height = this.P.getHeight();
                                    q qVar4 = this.D;
                                    fa.a.f(qVar4);
                                    int i25 = height / qVar4.K;
                                    int i26 = this.D.J;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.P, (i19 % i26) * i24, (i19 / i26) * i25, i24, i25);
                                } else {
                                    bitmapCreateBitmap = this.P;
                                    fa.a.f(bitmapCreateBitmap);
                                }
                                bVar.f131034c = bitmapCreateBitmap;
                            }
                            bitmap = this.X.f131034c;
                            fa.a.f(bitmap);
                            j14 = this.X.f131033b;
                            long j15 = j14 - j8;
                            if (this.f8928h == 2) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            i14 = this.C;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    z15 = true;
                                } else {
                                    if (i14 == 3) {
                                        x.h();
                                        return false;
                                    }
                                    z15 = false;
                                }
                            }
                            if (!z15 || j15 < 30000) {
                                this.I.onImageAvailable(j14 - this.f131027y.f131031b, bitmap);
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                b bVar2 = this.X;
                                fa.a.f(bVar2);
                                long j16 = bVar2.f131033b;
                                this.f131028z = j16;
                                while (!arrayDeque.isEmpty() && j16 >= arrayDeque.peek().f131030a) {
                                    this.f131027y = arrayDeque.removeFirst();
                                }
                                this.C = 3;
                                if (z14) {
                                    b bVar3 = this.X;
                                    fa.a.f(bVar3);
                                    i15 = bVar3.f131032a;
                                    q qVar5 = this.D;
                                    fa.a.f(qVar5);
                                    i16 = qVar5.K;
                                    qVar = this.D;
                                    fa.a.f(qVar);
                                    if (i15 == (i16 * qVar.J) - 1) {
                                        this.P = null;
                                    }
                                } else {
                                    this.P = null;
                                }
                                this.X = this.Y;
                                this.Y = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.B == 3) {
                            y();
                            fa.a.f(this.D);
                            x();
                            return false;
                        }
                        dVarDequeueOutputBuffer.d();
                        if (arrayDeque.isEmpty()) {
                            this.f131026x = true;
                            return false;
                        }
                    }
                }
            } else if (this.T) {
                fa.a.f(this.D);
                q qVar6 = this.D;
                int i110 = qVar6.J;
                int i111 = qVar6.K;
                if (i110 != 1) {
                }
                bVar = this.X;
                if (bVar.f131034c == null) {
                    if (z14) {
                        int i112 = bVar.f131032a;
                        fa.a.f(this.P);
                        int width2 = this.P.getWidth();
                        q qVar7 = this.D;
                        fa.a.f(qVar7);
                        int i27 = width2 / qVar7.J;
                        int height2 = this.P.getHeight();
                        q qVar8 = this.D;
                        fa.a.f(qVar8);
                        int i28 = height2 / qVar8.K;
                        int i29 = this.D.J;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.P, (i112 % i29) * i27, (i112 / i29) * i28, i27, i28);
                    } else {
                        bitmapCreateBitmap = this.P;
                        fa.a.f(bitmapCreateBitmap);
                    }
                    bVar.f131034c = bitmapCreateBitmap;
                }
                bitmap = this.X.f131034c;
                fa.a.f(bitmap);
                j14 = this.X.f131033b;
                long j17 = j14 - j8;
                if (this.f8928h == 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i14 = this.C;
                if (i14 != 0) {
                    if (i14 != 1) {
                        z15 = true;
                    } else {
                        if (i14 == 3) {
                            x.h();
                            return false;
                        }
                        z15 = false;
                    }
                }
                if (z15) {
                    this.I.onImageAvailable(j14 - this.f131027y.f131031b, bitmap);
                    z16 = true;
                } else {
                    this.I.onImageAvailable(j14 - this.f131027y.f131031b, bitmap);
                    z16 = true;
                }
                if (z16) {
                    b bVar4 = this.X;
                    fa.a.f(bVar4);
                    long j18 = bVar4.f131033b;
                    this.f131028z = j18;
                    while (!arrayDeque.isEmpty()) {
                        this.f131027y = arrayDeque.removeFirst();
                    }
                    this.C = 3;
                    if (z14) {
                        b bVar5 = this.X;
                        fa.a.f(bVar5);
                        i15 = bVar5.f131032a;
                        q qVar9 = this.D;
                        fa.a.f(qVar9);
                        i16 = qVar9.K;
                        qVar = this.D;
                        fa.a.f(qVar);
                        if (i15 == (i16 * qVar.J) - 1) {
                            this.P = null;
                        }
                    } else {
                        this.P = null;
                    }
                    this.X = this.Y;
                    this.Y = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    public final boolean w(long j8) {
        int i14;
        DecoderInputBuffer decoderInputBuffer;
        int iU;
        ByteBuffer byteBuffer;
        DecoderInputBuffer decoderInputBuffer2;
        boolean z14;
        DecoderInputBuffer decoderInputBuffer3;
        b bVar;
        long j14;
        boolean z15;
        b bVar2;
        boolean z16;
        q qVar;
        boolean z17;
        boolean z18;
        q qVar2;
        int i15;
        DecoderInputBuffer decoderInputBuffer4;
        if (!this.T || this.X == null) {
            a0 a0Var = this.f8923c;
            a0Var.a();
            oa.b bVar3 = this.E;
            if (bVar3 != null && this.B != 3 && !this.f131025w) {
                if (this.F == null) {
                    DecoderInputBuffer decoderInputBuffer5 = (DecoderInputBuffer) bVar3.dequeueInputBuffer();
                    this.F = decoderInputBuffer5;
                    if (decoderInputBuffer5 != null) {
                        i14 = this.B;
                        decoderInputBuffer = this.F;
                        if (i14 == 2) {
                            fa.a.f(decoderInputBuffer);
                            this.F.f92372a = 4;
                            oa.b bVar4 = this.E;
                            fa.a.f(bVar4);
                            bVar4.c(this.F);
                            this.F = null;
                            this.B = 3;
                            return false;
                        }
                        iU = u(a0Var, decoderInputBuffer, 0);
                        if (iU != -5) {
                            q qVar3 = a0Var.f8667b;
                            fa.a.f(qVar3);
                            this.D = qVar3;
                            this.B = 2;
                            return true;
                        }
                        if (iU != -4) {
                            this.F.f();
                            byteBuffer = this.F.f8631d;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                decoderInputBuffer2 = this.F;
                                fa.a.f(decoderInputBuffer2);
                                if (decoderInputBuffer2.b(4)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = true;
                            }
                            if (z14) {
                                oa.b bVar5 = this.E;
                                fa.a.f(bVar5);
                                DecoderInputBuffer decoderInputBuffer6 = this.F;
                                fa.a.f(decoderInputBuffer6);
                                bVar5.c(decoderInputBuffer6);
                                this.Z = 0;
                            }
                            decoderInputBuffer3 = this.F;
                            fa.a.f(decoderInputBuffer3);
                            if (decoderInputBuffer3.b(4)) {
                                this.T = true;
                            } else {
                                bVar = new b(this.Z, decoderInputBuffer3.f8633f);
                                this.Y = bVar;
                                this.Z++;
                                if (this.T) {
                                    this.X = this.Y;
                                    this.Y = null;
                                } else {
                                    j14 = bVar.f131033b;
                                    if (j14 - 30000 <= j8 || j8 > 30000 + j14) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    bVar2 = this.X;
                                    if (bVar2 != null || bVar2.f131033b > j8 || j8 >= j14) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    qVar = this.D;
                                    fa.a.f(qVar);
                                    if (qVar.J != -1 || (i15 = (qVar2 = this.D).K) == -1) {
                                        z17 = true;
                                    } else if (bVar.f131032a == (i15 * qVar2.J) - 1) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (!z15 || z16 || z17) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    this.T = z18;
                                    if (z16 || z15) {
                                        this.X = this.Y;
                                        this.Y = null;
                                    }
                                }
                            }
                            decoderInputBuffer4 = this.F;
                            fa.a.f(decoderInputBuffer4);
                            if (decoderInputBuffer4.b(4)) {
                                this.f131025w = true;
                                this.F = null;
                                return false;
                            }
                            long j15 = this.A;
                            DecoderInputBuffer decoderInputBuffer7 = this.F;
                            fa.a.f(decoderInputBuffer7);
                            this.A = Math.max(j15, decoderInputBuffer7.f8633f);
                            if (z14) {
                                this.F = null;
                            } else {
                                DecoderInputBuffer decoderInputBuffer8 = this.F;
                                fa.a.f(decoderInputBuffer8);
                                decoderInputBuffer8.c();
                            }
                            return !this.T;
                        }
                        if (iU != -3) {
                            x.h();
                            return false;
                        }
                    }
                } else {
                    i14 = this.B;
                    decoderInputBuffer = this.F;
                    if (i14 == 2) {
                        fa.a.f(decoderInputBuffer);
                        this.F.f92372a = 4;
                        oa.b bVar6 = this.E;
                        fa.a.f(bVar6);
                        bVar6.c(this.F);
                        this.F = null;
                        this.B = 3;
                        return false;
                    }
                    iU = u(a0Var, decoderInputBuffer, 0);
                    if (iU != -5) {
                        q qVar4 = a0Var.f8667b;
                        fa.a.f(qVar4);
                        this.D = qVar4;
                        this.B = 2;
                        return true;
                    }
                    if (iU != -4) {
                        this.F.f();
                        byteBuffer = this.F.f8631d;
                        if (byteBuffer != null) {
                            decoderInputBuffer2 = this.F;
                            fa.a.f(decoderInputBuffer2);
                            if (decoderInputBuffer2.b(4)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            decoderInputBuffer2 = this.F;
                            fa.a.f(decoderInputBuffer2);
                            if (decoderInputBuffer2.b(4)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (z14) {
                            oa.b bVar7 = this.E;
                            fa.a.f(bVar7);
                            DecoderInputBuffer decoderInputBuffer9 = this.F;
                            fa.a.f(decoderInputBuffer9);
                            bVar7.c(decoderInputBuffer9);
                            this.Z = 0;
                        }
                        decoderInputBuffer3 = this.F;
                        fa.a.f(decoderInputBuffer3);
                        if (decoderInputBuffer3.b(4)) {
                            this.T = true;
                        } else {
                            bVar = new b(this.Z, decoderInputBuffer3.f8633f);
                            this.Y = bVar;
                            this.Z++;
                            if (this.T) {
                                j14 = bVar.f131033b;
                                if (j14 - 30000 <= j8) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                bVar2 = this.X;
                                if (bVar2 != null) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                qVar = this.D;
                                fa.a.f(qVar);
                                if (qVar.J != -1) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                if (z15) {
                                    z18 = true;
                                } else {
                                    z18 = true;
                                }
                                this.T = z18;
                                if (z16) {
                                    this.X = this.Y;
                                    this.Y = null;
                                } else {
                                    this.X = this.Y;
                                    this.Y = null;
                                }
                            } else {
                                this.X = this.Y;
                                this.Y = null;
                            }
                        }
                        decoderInputBuffer4 = this.F;
                        fa.a.f(decoderInputBuffer4);
                        if (decoderInputBuffer4.b(4)) {
                            this.f131025w = true;
                            this.F = null;
                            return false;
                        }
                        long j16 = this.A;
                        DecoderInputBuffer decoderInputBuffer10 = this.F;
                        fa.a.f(decoderInputBuffer10);
                        this.A = Math.max(j16, decoderInputBuffer10.f8633f);
                        if (z14) {
                            this.F = null;
                        } else {
                            DecoderInputBuffer decoderInputBuffer11 = this.F;
                            fa.a.f(decoderInputBuffer11);
                            decoderInputBuffer11.c();
                        }
                        return !this.T;
                    }
                    if (iU != -3) {
                        x.h();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void x() throws ExoPlaybackException {
        q qVar = this.D;
        oa.b.C2489b c2489b = (oa.b.C2489b) this.f131022r;
        int iA = c2489b.a(qVar);
        if (iA != u0.h(4, 0, 0, 0) && iA != u0.h(3, 0, 0, 0)) {
            throw l(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.D, false, 4005);
        }
        oa.b bVar = this.E;
        if (bVar != null) {
            bVar.release();
        }
        this.E = new oa.b(c2489b.f131019b, null);
    }

    public final void y() {
        this.F = null;
        this.B = 0;
        this.A = C.TIME_UNSET;
        oa.b bVar = this.E;
        if (bVar != null) {
            bVar.release();
            this.E = null;
        }
    }
}

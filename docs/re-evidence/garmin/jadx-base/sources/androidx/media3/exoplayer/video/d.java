package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import fa.z;
import j20.x;
import sa.n;
import za.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9848d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9851g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9854j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9849e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9850f = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9852h = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9853i = C.TIME_UNSET;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9855k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public fa.c f9856l = fa.c.f70004a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f9857a = C.TIME_UNSET;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9858b = C.TIME_UNSET;
    }

    public interface b {
    }

    public d(Context context, b bVar, long j8) {
        this.f9845a = bVar;
        this.f9847c = j8;
        this.f9846b = new g(context);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0219  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    public final int a(long j8, long j14, long j15, long j16, boolean z14, a aVar) {
        long j17;
        long j18;
        boolean z15;
        boolean z16;
        int i14;
        int i15;
        ?? r24;
        boolean z17;
        ?? r14;
        long j19;
        long j24;
        int i16;
        aVar.f9857a = C.TIME_UNSET;
        aVar.f9858b = C.TIME_UNSET;
        if (this.f9850f == C.TIME_UNSET) {
            this.f9850f = j14;
        }
        if (this.f9852h != j8) {
            g gVar = this.f9846b;
            j17 = 1000;
            long j25 = gVar.f203206n;
            if (j25 != -1) {
                gVar.f203208p = j25;
                gVar.f203209q = gVar.f203207o;
            }
            gVar.f203205m++;
            za.a aVar2 = gVar.f203193a;
            long j26 = j8 * 1000;
            aVar2.f203154a.b(j26);
            if (aVar2.f203154a.a()) {
                aVar2.f203156c = false;
            } else {
                if (aVar2.f203157d != C.TIME_UNSET) {
                    if (aVar2.f203156c) {
                        za.a.C3791a c3791a = aVar2.f203155b;
                        j18 = 0;
                        long j27 = c3791a.f203162d;
                        if (j27 == 0 ? false : c3791a.f203165g[(int) ((j27 - 1) % 15)]) {
                        }
                        aVar2.f203156c = true;
                        aVar2.f203155b.b(j26);
                    } else {
                        j18 = 0;
                    }
                    aVar2.f203155b.c();
                    aVar2.f203155b.b(aVar2.f203157d);
                    aVar2.f203156c = true;
                    aVar2.f203155b.b(j26);
                }
                if (aVar2.f203156c && aVar2.f203155b.a()) {
                    za.a.C3791a c3791a2 = aVar2.f203154a;
                    aVar2.f203154a = aVar2.f203155b;
                    aVar2.f203155b = c3791a2;
                    aVar2.f203156c = false;
                }
                aVar2.f203157d = j26;
                if (aVar2.f203154a.a()) {
                    i16 = 0;
                } else {
                    i16 = aVar2.f203158e + 1;
                }
                aVar2.f203158e = i16;
                gVar.c();
                this.f9852h = j8;
            }
            j18 = 0;
            if (aVar2.f203156c) {
                za.a.C3791a c3791a3 = aVar2.f203154a;
                aVar2.f203154a = aVar2.f203155b;
                aVar2.f203155b = c3791a3;
                aVar2.f203156c = false;
            }
            aVar2.f203157d = j26;
            if (aVar2.f203154a.a()) {
                i16 = 0;
            } else {
                i16 = aVar2.f203158e + 1;
            }
            aVar2.f203158e = i16;
            gVar.c();
            this.f9852h = j8;
        } else {
            j17 = 1000;
            j18 = 0;
        }
        long jO = (long) ((j8 - j14) / ((double) this.f9855k));
        if (this.f9848d) {
            jO -= z.O(this.f9856l.elapsedRealtime()) - j15;
        }
        aVar.f9857a = jO;
        if (this.f9853i == C.TIME_UNSET || this.f9854j) {
            int i17 = this.f9849e;
            if (i17 != 0) {
                if (i17 == 1) {
                    z15 = true;
                } else if (i17 == 2) {
                    z15 = true;
                    if (j14 >= j16) {
                    }
                } else {
                    if (i17 != 3) {
                        x.h();
                        return 0;
                    }
                    z15 = true;
                    long jO2 = z.O(this.f9856l.elapsedRealtime()) - this.f9851g;
                    if (this.f9848d) {
                        ((androidx.media3.exoplayer.video.b) this.f9845a).getClass();
                        if (jO >= -30000 || jO2 <= 100000) {
                        }
                    }
                }
                z16 = z15;
            } else {
                z15 = true;
                z16 = this.f9848d;
            }
            if (z16) {
                return 0;
            }
            if (!this.f9848d && j14 != this.f9850f) {
                long jNanoTime = this.f9856l.nanoTime();
                g gVar2 = this.f9846b;
                long j28 = (aVar.f9857a * j17) + jNanoTime;
                if (gVar2.f203208p == r11 || !gVar2.f203193a.f203154a.a()) {
                    i14 = 3;
                    i15 = 2;
                    r24 = z15;
                } else {
                    za.a aVar3 = gVar2.f203193a;
                    if (aVar3.f203154a.a()) {
                        za.a.C3791a c3791a4 = aVar3.f203154a;
                        long j29 = c3791a4.f203163e;
                        i14 = 3;
                        i15 = 2;
                        j24 = j29 == j18 ? j18 : c3791a4.f203164f / j29;
                    } else {
                        i14 = 3;
                        i15 = 2;
                        j24 = -9223372036854775807L;
                    }
                    boolean z18 = z15;
                    long j34 = gVar2.f203209q + ((long) (((gVar2.f203205m - gVar2.f203208p) * j24) / gVar2.f203201i));
                    if (Math.abs(j28 - j34) <= 20000000) {
                        j28 = j34;
                        r24 = z18;
                    } else {
                        gVar2.f203205m = j18;
                        gVar2.f203208p = -1L;
                        gVar2.f203206n = -1L;
                        r24 = z18;
                    }
                }
                gVar2.f203206n = gVar2.f203205m;
                gVar2.f203207o = j28;
                g.b bVar = gVar2.f203195c;
                if (bVar != null && gVar2.f203203k != C.TIME_UNSET) {
                    long j35 = bVar.f203213a;
                    if (j35 != C.TIME_UNSET) {
                        long j36 = gVar2.f203203k;
                        long j37 = (((j28 - j35) / j36) * j36) + j35;
                        if (j28 <= j37) {
                            j19 = j37 - j36;
                        } else {
                            j19 = j37;
                            j37 = j36 + j37;
                        }
                        if (j37 - j28 >= j28 - j19) {
                            j37 = j19;
                        }
                        j28 = j37 - gVar2.f203204l;
                    }
                }
                aVar.f9858b = j28;
                long j38 = (j28 - jNanoTime) / j17;
                aVar.f9857a = j38;
                ?? r15 = (this.f9853i == C.TIME_UNSET || this.f9854j) ? 0 : r24;
                androidx.media3.exoplayer.video.b bVar2 = (androidx.media3.exoplayer.video.b) this.f9845a;
                bVar2.getClass();
                if (j38 >= -500000 || z14) {
                    z17 = false;
                    r14 = 0;
                } else {
                    n nVar = bVar2.f8929i;
                    nVar.getClass();
                    int iSkipData = nVar.skipData(j14 - bVar2.f8931k);
                    if (iSkipData == 0) {
                        z17 = false;
                        r14 = 0;
                    } else {
                        androidx.media3.exoplayer.g gVar3 = bVar2.f9233u1;
                        if (r15 != 0) {
                            gVar3.f8958d += iSkipData;
                            gVar3.f8960f += bVar2.V1;
                        } else {
                            gVar3.f8964j++;
                            bVar2.A0(iSkipData, bVar2.V1);
                        }
                        if (bVar2.D()) {
                            bVar2.O();
                        }
                        VideoSink videoSink = bVar2.J1;
                        z17 = false;
                        if (videoSink != null) {
                            videoSink.v(false);
                        }
                        r14 = r24;
                    }
                }
                if (r14 != 0) {
                    return 4;
                }
                b bVar3 = this.f9845a;
                long j39 = aVar.f9857a;
                ((androidx.media3.exoplayer.video.b) bVar3).getClass();
                if (((j39 >= -30000 || z14) ? z17 : r24) != 0) {
                    return r15 != 0 ? i14 : i15;
                }
                if (aVar.f9857a > 50000) {
                    return 5;
                }
                return r24;
            }
        }
        z15 = true;
        z16 = false;
        if (z16) {
            return 0;
        }
        return !this.f9848d ? 5 : 5;
    }

    public final boolean b(boolean z14) {
        if (z14 && this.f9849e == 3) {
            this.f9853i = C.TIME_UNSET;
            return true;
        }
        if (this.f9853i == C.TIME_UNSET) {
            return false;
        }
        if (this.f9856l.elapsedRealtime() < this.f9853i) {
            return true;
        }
        this.f9853i = C.TIME_UNSET;
        return false;
    }

    public final void c(boolean z14) {
        this.f9854j = z14;
        long j8 = this.f9847c;
        this.f9853i = j8 > 0 ? this.f9856l.elapsedRealtime() + j8 : C.TIME_UNSET;
    }

    public final void d(int i14) {
        this.f9849e = Math.min(this.f9849e, i14);
    }

    public final void e() {
        this.f9848d = true;
        this.f9851g = z.O(this.f9856l.elapsedRealtime());
        g gVar = this.f9846b;
        gVar.f203196d = true;
        gVar.f203205m = 0L;
        gVar.f203208p = -1L;
        gVar.f203206n = -1L;
        g.a aVar = gVar.f203194b;
        if (aVar != null) {
            DisplayManager displayManager = aVar.f203210a;
            g.b bVar = gVar.f203195c;
            bVar.getClass();
            bVar.f203214b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(aVar, z.m(null));
            g.a(g.this, displayManager.getDisplay(0));
        }
        gVar.d(false);
    }

    public final void f() {
        this.f9848d = false;
        this.f9853i = C.TIME_UNSET;
        g gVar = this.f9846b;
        gVar.f203196d = false;
        g.a aVar = gVar.f203194b;
        if (aVar != null) {
            aVar.f203210a.unregisterDisplayListener(aVar);
            g.b bVar = gVar.f203195c;
            bVar.getClass();
            bVar.f203214b.sendEmptyMessage(3);
        }
        gVar.b();
    }

    public final void g(float f14) {
        g gVar = this.f9846b;
        gVar.f203198f = f14;
        za.a aVar = gVar.f203193a;
        aVar.f203154a.c();
        aVar.f203155b.c();
        aVar.f203156c = false;
        aVar.f203157d = C.TIME_UNSET;
        aVar.f203158e = 0;
        gVar.c();
    }

    public final void h(Surface surface) {
        g gVar = this.f9846b;
        if (gVar.f203197e != surface) {
            gVar.b();
            gVar.f203197e = surface;
            gVar.d(true);
        }
        d(1);
    }

    public final void i(float f14) {
        fa.a.a(f14 > 0.0f);
        if (f14 == this.f9855k) {
            return;
        }
        this.f9855k = f14;
        g gVar = this.f9846b;
        gVar.f203201i = f14;
        gVar.f203205m = 0L;
        gVar.f203208p = -1L;
        gVar.f203206n = -1L;
        gVar.d(false);
    }
}

package androidx.media3.exoplayer;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.f f9171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<ja.q, b> f9180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9181k;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9183b;

        private b() {
        }
    }

    public j(xa.f fVar, int i14, int i15, int i16, int i17, int i18, boolean z14, int i19, boolean z15) {
        h(i16, 0, "bufferForPlaybackMs", "0");
        h(i17, 0, "bufferForPlaybackAfterRebufferMs", "0");
        h(i14, i16, "minBufferMs", "bufferForPlaybackMs");
        h(i14, i17, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        h(i15, i14, "maxBufferMs", "minBufferMs");
        h(i19, 0, "backBufferDurationMs", "0");
        this.f9171a = fVar;
        this.f9172b = fa.z.O(i14);
        this.f9173c = fa.z.O(i15);
        this.f9174d = fa.z.O(i16);
        this.f9175e = fa.z.O(i17);
        this.f9176f = i18;
        this.f9177g = z14;
        this.f9178h = fa.z.O(i19);
        this.f9179i = z15;
        this.f9180j = new HashMap<>();
        this.f9181k = -1L;
    }

    public static void h(int i14, int i15, String str, String str2) {
        fa.a.b(i14 >= i15, str + " cannot be less than " + str2);
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean a(c0.a aVar) {
        int i14;
        long j8 = this.f9173c;
        b bVar = this.f9180j.get(aVar.f8804a);
        bVar.getClass();
        xa.f fVar = this.f9171a;
        synchronized (fVar) {
            i14 = fVar.f189677e * fVar.f189674b;
        }
        boolean z14 = true;
        boolean z15 = i14 >= i();
        long jMin = this.f9172b;
        float f14 = aVar.f8806c;
        if (f14 > 1.0f) {
            jMin = Math.min(fa.z.w(jMin, f14), j8);
        }
        long jMax = Math.max(jMin, 500000L);
        long j14 = aVar.f8805b;
        if (j14 < jMax) {
            if (!this.f9177g && z15) {
                z14 = false;
            }
            bVar.f9182a = z14;
            if (!z14 && j14 < 500000) {
                fa.k.g("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j14 >= j8 || z15) {
            bVar.f9182a = false;
        }
        return bVar.f9182a;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean b() {
        Iterator<b> it = this.f9180j.values().iterator();
        while (it.hasNext()) {
            if (it.next().f9182a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void c(ja.q qVar) {
        HashMap<ja.q, b> map = this.f9180j;
        if (map.remove(qVar) != null) {
            j();
        }
        if (map.isEmpty()) {
            this.f9181k = -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.c0
    public final void d(c0.a aVar, wa.g[] gVarArr) {
        b bVar = this.f9180j.get(aVar.f8804a);
        bVar.getClass();
        int iMax = this.f9176f;
        if (iMax == -1) {
            int length = gVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = 13107200;
                if (i14 < length) {
                    wa.g gVar = gVarArr[i14];
                    if (gVar != null) {
                        switch (gVar.getTrackGroup().f8216c) {
                            case -2:
                                i16 = 0;
                                i15 += i16;
                                break;
                            case -1:
                            case 1:
                                i15 += i16;
                                break;
                            case 0:
                                i16 = DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                                i15 += i16;
                                break;
                            case 2:
                                i16 = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                                i15 += i16;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i16 = 131072;
                                i15 += i16;
                                break;
                            default:
                                vb.h.w();
                                break;
                        }
                        return;
                    }
                    i14++;
                } else {
                    iMax = Math.max(13107200, i15);
                }
            }
        }
        bVar.f9183b = iMax;
        j();
    }

    @Override // androidx.media3.exoplayer.c0
    public final void e(ja.q qVar) {
        if (this.f9180j.remove(qVar) != null) {
            j();
        }
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean f(c0.a aVar) {
        int i14;
        long jZ = fa.z.z(aVar.f8805b, aVar.f8806c);
        long jMin = aVar.f8807d ? this.f9175e : this.f9174d;
        long j8 = aVar.f8808e;
        if (j8 != C.TIME_UNSET) {
            jMin = Math.min(j8 / 2, jMin);
        }
        if (jMin <= 0 || jZ >= jMin) {
            return true;
        }
        if (this.f9177g) {
            return false;
        }
        xa.f fVar = this.f9171a;
        synchronized (fVar) {
            i14 = fVar.f189677e * fVar.f189674b;
        }
        return i14 >= i();
    }

    @Override // androidx.media3.exoplayer.c0
    public final void g(ja.q qVar) {
        long id3 = Thread.currentThread().getId();
        long j8 = this.f9181k;
        fa.a.e(j8 == -1 || j8 == id3, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f9181k = id3;
        HashMap<ja.q, b> map = this.f9180j;
        if (!map.containsKey(qVar)) {
            map.put(qVar, new b());
        }
        b bVar = map.get(qVar);
        bVar.getClass();
        int i14 = this.f9176f;
        if (i14 == -1) {
            i14 = 13107200;
        }
        bVar.f9183b = i14;
        bVar.f9182a = false;
    }

    @Override // androidx.media3.exoplayer.c0
    public final xa.f getAllocator() {
        return this.f9171a;
    }

    @Override // androidx.media3.exoplayer.c0
    public final long getBackBufferDurationUs() {
        return this.f9178h;
    }

    public final int i() {
        Iterator<b> it = this.f9180j.values().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += it.next().f9183b;
        }
        return i14;
    }

    public final void j() {
        boolean zIsEmpty = this.f9180j.isEmpty();
        xa.f fVar = this.f9171a;
        if (!zIsEmpty) {
            fVar.a(i());
            return;
        }
        synchronized (fVar) {
            if (fVar.f189673a) {
                fVar.a(0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean retainBackBufferFromKeyframe() {
        return this.f9179i;
    }

    public j() {
        this(new xa.f(true, 65536), 50000, 50000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }
}

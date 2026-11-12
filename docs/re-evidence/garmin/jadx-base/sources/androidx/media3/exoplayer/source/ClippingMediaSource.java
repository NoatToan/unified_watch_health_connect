package androidx.media3.exoplayer.source;

import androidx.media3.common.d0;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.C;
import fa.z;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<b> f9371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0.c f9372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f9373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IllegalClippingException f9374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9376v;

    public static final class a extends sa.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f9379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f9380f;

        public a(d0 d0Var, long j8, long j14) throws IllegalClippingException {
            super(d0Var);
            boolean z14 = false;
            if (d0Var.h() != 1) {
                throw new IllegalClippingException(0);
            }
            d0.c cVarM = d0Var.m(0, new d0.c(), 0L);
            long jMax = Math.max(0L, j8);
            if (!cVarM.f8206k && jMax != 0 && !cVarM.f8203h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j14 == Long.MIN_VALUE ? cVarM.f8208m : Math.max(0L, j14);
            long j15 = cVarM.f8208m;
            long j16 = C.TIME_UNSET;
            if (j15 != C.TIME_UNSET) {
                long j17 = jMax2 > j15 ? j15 : jMax2;
                if (jMax > j17) {
                    throw new IllegalClippingException(2, jMax, j17);
                }
                jMax2 = j17;
            }
            this.f9377c = jMax;
            this.f9378d = jMax2;
            this.f9379e = jMax2 != C.TIME_UNSET ? jMax2 - jMax : j16;
            if (cVarM.f8204i && (jMax2 == C.TIME_UNSET || (j15 != C.TIME_UNSET && jMax2 == j15))) {
                z14 = true;
            }
            this.f9380f = z14;
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.b f(int i14, d0.b bVar, boolean z14) {
            this.f158114b.f(0, bVar, z14);
            long j8 = bVar.f8191e - this.f9377c;
            long j14 = this.f9379e;
            long j15 = C.TIME_UNSET;
            if (j14 != C.TIME_UNSET) {
                j15 = j14 - j8;
            }
            bVar.i(bVar.f8187a, bVar.f8188b, 0, j15, j8, androidx.media3.common.b.f8153g, false);
            return bVar;
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.c m(int i14, d0.c cVar, long j8) {
            this.f158114b.m(0, cVar, 0L);
            long j14 = cVar.f8211p;
            long j15 = this.f9377c;
            cVar.f8211p = j14 + j15;
            cVar.f8208m = this.f9379e;
            cVar.f8204i = this.f9380f;
            long j16 = cVar.f8207l;
            if (j16 != C.TIME_UNSET) {
                long jMax = Math.max(j16, j15);
                cVar.f8207l = jMax;
                long j17 = this.f9378d;
                if (j17 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j17);
                }
                cVar.f8207l = jMax - j15;
            }
            long jY = z.Y(j15);
            long j18 = cVar.f8200e;
            if (j18 != C.TIME_UNSET) {
                cVar.f8200e = j18 + jY;
            }
            long j19 = cVar.f8201f;
            if (j19 != C.TIME_UNSET) {
                cVar.f8201f = j19 + jY;
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(j jVar, long j8, long j14, boolean z14, boolean z15, boolean z16) {
        super(jVar);
        jVar.getClass();
        fa.a.a(j8 >= 0);
        this.f9366l = j8;
        this.f9367m = j14;
        this.f9368n = z14;
        this.f9369o = z15;
        this.f9370p = z16;
        this.f9371q = new ArrayList<>();
        this.f9372r = new d0.c();
    }

    @Override // androidx.media3.exoplayer.source.x, androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        b bVar3 = new b(this.f9691k.c(bVar, bVar2, j8), this.f9368n, this.f9375u, this.f9376v);
        this.f9371q.add(bVar3);
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.x, androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        ArrayList<b> arrayList = this.f9371q;
        fa.a.d(arrayList.remove(iVar));
        this.f9691k.h(((b) iVar).f9425a);
        if (!arrayList.isEmpty() || this.f9369o) {
            return;
        }
        a aVar = this.f9373s;
        aVar.getClass();
        z(aVar.f158114b);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.j
    public final void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f9374t;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void o(d0 d0Var) {
        if (this.f9374t != null) {
            return;
        }
        z(d0Var);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void r() {
        super.r();
        this.f9374t = null;
        this.f9373s = null;
    }

    public final void z(d0 d0Var) {
        long j8;
        long j14;
        long j15;
        d0.c cVar = this.f9372r;
        d0Var.n(0, cVar);
        long j16 = cVar.f8211p;
        a aVar = this.f9373s;
        long j17 = this.f9367m;
        ArrayList<b> arrayList = this.f9371q;
        if (aVar == null || arrayList.isEmpty() || this.f9369o) {
            boolean z14 = this.f9370p;
            j8 = this.f9366l;
            if (z14) {
                long j18 = cVar.f8207l;
                j8 += j18;
                j14 = j18 + j17;
            } else {
                j14 = j17;
            }
            this.f9375u = j16 + j8;
            this.f9376v = j17 != Long.MIN_VALUE ? j16 + j14 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                b bVar = arrayList.get(i14);
                long j19 = this.f9375u;
                long j24 = this.f9376v;
                bVar.f9429e = j19;
                bVar.f9430f = j24;
            }
            j15 = j14;
        } else {
            j8 = this.f9375u - j16;
            j15 = j17 != Long.MIN_VALUE ? this.f9376v - j16 : Long.MIN_VALUE;
        }
        try {
            a aVar2 = new a(d0Var, j8, j15);
            this.f9373s = aVar2;
            q(aVar2);
        } catch (IllegalClippingException e4) {
            this.f9374t = e4;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                arrayList.get(i15).f9431g = this.f9374t;
            }
        }
    }

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        public IllegalClippingException(int i14, long j8, long j14) {
            super("Illegal clipping: " + getReasonDescription(i14, j8, j14));
            this.reason = i14;
        }

        private static String getReasonDescription(int i14, long j8, long j14) {
            if (i14 == 0) {
                return "invalid period count";
            }
            if (i14 == 1) {
                return "not seekable to start";
            }
            if (i14 != 2) {
                return PrivacyUpdateRequestError.UNKNOWN;
            }
            fa.a.d((j8 == C.TIME_UNSET || j14 == C.TIME_UNSET) ? false : true);
            return "start exceeds end. Start time: " + j8 + ", End time: " + j14;
        }

        public IllegalClippingException(int i14) {
            this(i14, C.TIME_UNSET, C.TIME_UNSET);
        }
    }

    public ClippingMediaSource(j jVar, long j8) {
        this(jVar, 0L, j8, true, false, true);
    }

    public ClippingMediaSource(j jVar, long j8, long j14) {
        this(jVar, j8, j14, true, false, false);
    }
}

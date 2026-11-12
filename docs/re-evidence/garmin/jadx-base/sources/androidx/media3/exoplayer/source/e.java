package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import bb.f0;
import bb.g0;
import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fa.z;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import o62.b0;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9476k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ha.d.a f9478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yb.n.a f9479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f9484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9485j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bb.r f9486a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ha.d.a f9489d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public yb.n.a f9491f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f9487b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f9488c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9490e = true;

        public a(bb.r rVar, yb.n.a aVar) {
            this.f9486a = rVar;
            this.f9491f = aVar;
        }

        public final Supplier<j.a> a(int i14) {
            Supplier<j.a> mVar;
            Supplier<j.a> supplier;
            Integer numValueOf = Integer.valueOf(i14);
            HashMap map = this.f9487b;
            Supplier<j.a> supplier2 = (Supplier) map.get(numValueOf);
            if (supplier2 != null) {
                return supplier2;
            }
            final ha.d.a aVar = this.f9489d;
            aVar.getClass();
            if (i14 != 0) {
                final int i15 = 1;
                if (i14 != 1) {
                    final int i16 = 2;
                    if (i14 != 2) {
                        final int i17 = 3;
                        if (i14 == 3) {
                            mVar = new androidx.media3.exoplayer.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(j.a.class), 7);
                        } else {
                            if (i14 != 4) {
                                vb.h.s(am.j.h(i14, "Unrecognized contentType: "));
                                return null;
                            }
                            mVar = new Supplier() { // from class: sa.f
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    switch (i17) {
                                        case 0:
                                            return androidx.media3.exoplayer.source.e.d((Class) this, aVar);
                                        case 1:
                                            return androidx.media3.exoplayer.source.e.d((Class) this, aVar);
                                        case 2:
                                            return androidx.media3.exoplayer.source.e.d((Class) this, aVar);
                                        default:
                                            return new androidx.media3.exoplayer.source.p.b(aVar, ((androidx.media3.exoplayer.source.e.a) this).f9486a);
                                    }
                                }
                            };
                        }
                    } else {
                        int i18 = HlsMediaSource.Factory.f9013n;
                        final Class clsAsSubclass = HlsMediaSource.Factory.class.asSubclass(j.a.class);
                        supplier = new Supplier() { // from class: sa.f
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                switch (i16) {
                                    case 0:
                                        return androidx.media3.exoplayer.source.e.d((Class) clsAsSubclass, aVar);
                                    case 1:
                                        return androidx.media3.exoplayer.source.e.d((Class) clsAsSubclass, aVar);
                                    case 2:
                                        return androidx.media3.exoplayer.source.e.d((Class) clsAsSubclass, aVar);
                                    default:
                                        return new androidx.media3.exoplayer.source.p.b(aVar, ((androidx.media3.exoplayer.source.e.a) clsAsSubclass).f9486a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(j.a.class);
                    supplier = new Supplier() { // from class: sa.f
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            switch (i15) {
                                case 0:
                                    return androidx.media3.exoplayer.source.e.d((Class) genericDeclarationAsSubclass, aVar);
                                case 1:
                                    return androidx.media3.exoplayer.source.e.d((Class) genericDeclarationAsSubclass, aVar);
                                case 2:
                                    return androidx.media3.exoplayer.source.e.d((Class) genericDeclarationAsSubclass, aVar);
                                default:
                                    return new androidx.media3.exoplayer.source.p.b(aVar, ((androidx.media3.exoplayer.source.e.a) genericDeclarationAsSubclass).f9486a);
                            }
                        }
                    };
                }
                mVar = supplier;
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(j.a.class);
                final int i19 = 0;
                mVar = new Supplier() { // from class: sa.f
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i19) {
                            case 0:
                                return androidx.media3.exoplayer.source.e.d((Class) genericDeclarationAsSubclass2, aVar);
                            case 1:
                                return androidx.media3.exoplayer.source.e.d((Class) genericDeclarationAsSubclass2, aVar);
                            case 2:
                                return androidx.media3.exoplayer.source.e.d((Class) genericDeclarationAsSubclass2, aVar);
                            default:
                                return new androidx.media3.exoplayer.source.p.b(aVar, ((androidx.media3.exoplayer.source.e.a) genericDeclarationAsSubclass2).f9486a);
                        }
                    }
                };
            }
            map.put(Integer.valueOf(i14), mVar);
            return mVar;
        }
    }

    public static final class b implements bb.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.q f9492a;

        public b(androidx.media3.common.q qVar) {
            this.f9492a = qVar;
        }

        @Override // bb.n
        public final int b(bb.o oVar, f0 f0Var) {
            return oVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // bb.n
        public final void c(bb.p pVar) {
            l0 l0VarTrack = pVar.track(0, 3);
            pVar.a(new g0.b(C.TIME_UNSET));
            pVar.endTracks();
            androidx.media3.common.q qVar = this.f9492a;
            androidx.media3.common.q.b bVarA = qVar.a();
            bVarA.f8411m = androidx.media3.common.x.n(MimeTypes.TEXT_UNKNOWN);
            bVarA.f8408j = qVar.f8386n;
            l0VarTrack.d(bVarA.a());
        }

        @Override // bb.n
        public final boolean d(bb.o oVar) {
            return true;
        }

        @Override // bb.n
        public final void release() {
        }

        @Override // bb.n
        public final void seek(long j8, long j14) {
        }
    }

    public e(ha.d.a aVar, bb.r rVar) {
        this.f9478c = aVar;
        yb.e eVar = new yb.e();
        this.f9479d = eVar;
        a aVar2 = new a(rVar, eVar);
        this.f9477b = aVar2;
        if (aVar != aVar2.f9489d) {
            aVar2.f9489d = aVar;
            aVar2.f9487b.clear();
            aVar2.f9488c.clear();
        }
        this.f9480e = C.TIME_UNSET;
        this.f9481f = C.TIME_UNSET;
        this.f9482g = C.TIME_UNSET;
        this.f9483h = -3.4028235E38f;
        this.f9484i = -3.4028235E38f;
        this.f9485j = true;
    }

    public static j.a d(Class cls, ha.d.a aVar) {
        try {
            return (j.a) cls.getConstructor(ha.d.a.class).newInstance(aVar);
        } catch (Exception e4) {
            l2.p(e4);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.source.j.a
    @CanIgnoreReturnValue
    public final void a(yb.n.a aVar) {
        aVar.getClass();
        this.f9479d = aVar;
        a aVar2 = this.f9477b;
        aVar2.f9491f = aVar;
        aVar2.f9486a.a(aVar);
        Iterator it = aVar2.f9488c.values().iterator();
        while (it.hasNext()) {
            ((j.a) it.next()).a(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.j.a
    public final j b(androidx.media3.common.t tVar) {
        androidx.media3.common.t tVarA = tVar;
        tVarA.f8439b.getClass();
        String scheme = tVarA.f8439b.f8482a.getScheme();
        if (scheme != null && scheme.equals(C.SSAI_SCHEME)) {
            throw null;
        }
        boolean zEquals = Objects.equals(tVarA.f8439b.f8483b, "application/x-image-uri");
        androidx.media3.common.t.h hVar = tVarA.f8439b;
        if (zEquals) {
            long j8 = hVar.f8490i;
            int i14 = z.f70071a;
            throw null;
        }
        int iF = z.F(hVar.f8482a, hVar.f8483b);
        if (tVarA.f8439b.f8490i != C.TIME_UNSET) {
            bb.r rVar = this.f9477b.f9486a;
            if (rVar instanceof bb.j) {
                bb.j jVar = (bb.j) rVar;
                synchronized (jVar) {
                    jVar.f17208d = 1;
                }
            }
        }
        try {
            a aVar = this.f9477b;
            HashMap map = aVar.f9488c;
            j.a aVar2 = (j.a) map.get(Integer.valueOf(iF));
            if (aVar2 == null) {
                aVar2 = aVar.a(iF).get();
                aVar2.a(aVar.f9491f);
                aVar2.c(aVar.f9490e);
                map.put(Integer.valueOf(iF), aVar2);
            }
            androidx.media3.common.t.g gVar = tVarA.f8440c;
            gVar.getClass();
            androidx.media3.common.t.g.a aVar3 = new androidx.media3.common.t.g.a();
            androidx.media3.common.t.g gVar2 = tVarA.f8440c;
            if (gVar2.f8472a == C.TIME_UNSET) {
                aVar3.f8477a = this.f9480e;
            }
            if (gVar2.f8475d == -3.4028235E38f) {
                aVar3.f8480d = this.f9483h;
            }
            if (gVar2.f8476e == -3.4028235E38f) {
                aVar3.f8481e = this.f9484i;
            }
            if (gVar2.f8473b == C.TIME_UNSET) {
                aVar3.f8478b = this.f9481f;
            }
            if (gVar2.f8474c == C.TIME_UNSET) {
                aVar3.f8479c = this.f9482g;
            }
            androidx.media3.common.t.g gVar3 = new androidx.media3.common.t.g(aVar3);
            if (!gVar3.equals(tVarA.f8440c)) {
                androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
                cVar.f8458m = new androidx.media3.common.t.g.a();
                tVarA = cVar.a();
            }
            j jVarB = aVar2.b(tVarA);
            ImmutableList<androidx.media3.common.t.k> immutableList = tVarA.f8439b.f8488g;
            if (!immutableList.isEmpty()) {
                j[] jVarArr = new j[immutableList.size() + 1];
                jVarArr[0] = jVarB;
                for (int i15 = 0; i15 < immutableList.size(); i15++) {
                    if (this.f9485j) {
                        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                        bVar.f8411m = androidx.media3.common.x.n(immutableList.get(i15).f8493b);
                        bVar.f8402d = immutableList.get(i15).f8494c;
                        bVar.f8403e = immutableList.get(i15).f8495d;
                        bVar.f8404f = immutableList.get(i15).f8496e;
                        bVar.f8400b = immutableList.get(i15).f8497f;
                        bVar.f8399a = immutableList.get(i15).f8498g;
                        p.b bVar2 = new p.b(this.f9478c, new b0(11, this, bVar.a()));
                        bVar2.f9607g = true;
                        int i16 = i15 + 1;
                        String string = immutableList.get(i15).f8492a.toString();
                        androidx.media3.common.t.c cVar2 = new androidx.media3.common.t.c();
                        cVar2.f8447b = string == null ? null : Uri.parse(string);
                        jVarArr[i16] = bVar2.b(cVar2.a());
                    } else {
                        v.b bVar3 = new v.b(this.f9478c);
                        jVarArr[i15 + 1] = new v(null, immutableList.get(i15), bVar3.f9683a, C.TIME_UNSET, bVar3.f9684b, bVar3.f9685c, null);
                    }
                }
                jVarB = new MergingMediaSource(jVarArr);
            }
            j clippingMediaSource = jVarB;
            androidx.media3.common.t.e eVar = tVarA.f8442e;
            eVar.getClass();
            long j14 = eVar.f8460a;
            if (j14 != Long.MIN_VALUE) {
                clippingMediaSource = new ClippingMediaSource(clippingMediaSource, 0L, j14, true, false, false);
            }
            tVarA.f8439b.getClass();
            if (tVarA.f8439b.f8485d == null) {
                return clippingMediaSource;
            }
            fa.k.g("Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return clippingMediaSource;
        } catch (ClassNotFoundException e4) {
            l2.p(e4);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.source.j.a
    @CanIgnoreReturnValue
    @Deprecated
    public final void c(boolean z14) {
        this.f9485j = z14;
        a aVar = this.f9477b;
        aVar.f9490e = z14;
        aVar.f9486a.b(z14);
        Iterator it = aVar.f9488c.values().iterator();
        while (it.hasNext()) {
            ((j.a) it.next()).c(z14);
        }
    }

    @Override // androidx.media3.exoplayer.source.j.a
    public final int[] getSupportedTypes() {
        a aVar = this.f9477b;
        aVar.getClass();
        try {
            aVar.a(0);
        } catch (ClassNotFoundException unused) {
        }
        try {
            aVar.a(1);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            aVar.a(2);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            aVar.a(3);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            aVar.a(4);
        } catch (ClassNotFoundException unused5) {
        }
        return Ints.toArray(aVar.f9487b.keySet());
    }

    public e(Context context, bb.r rVar) {
        this(new ha.h.a(context), rVar);
    }

    public e(ha.d.a aVar) {
        this(aVar, new bb.j());
    }

    public e(Context context) {
        this(new ha.h.a(context));
    }
}

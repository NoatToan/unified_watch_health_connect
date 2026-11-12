package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import dj.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import jj.r;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public class j<TranscodeType> extends mj.a<j<TranscodeType>> implements Cloneable {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final mj.h f28502k0 = new mj.h().d(wi.j.f185366c).m(g.LOW).s(true);
    public final Class<TranscodeType> A;
    public final b B;
    public final d C;
    public l<?, ? super TranscodeType> D;
    public Object E;
    public ArrayList F;
    public j<TranscodeType> I;
    public j<TranscodeType> P;
    public Float T;
    public final boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f28503y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k f28504z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28506b;

        static {
            int[] iArr = new int[g.values().length];
            f28506b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28506b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28506b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28506b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f28505a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28505a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28505a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28505a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28505a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28505a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28505a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28505a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        mj.h hVar;
        this.X = true;
        this.B = bVar;
        this.f28504z = kVar;
        this.A = cls;
        this.f28503y = context;
        Map<Class<?>, l<?, ?>> map = kVar.f28509a.f28456d.f28482f;
        l value = map.get(cls);
        if (value == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    value = entry.getValue();
                }
            }
        }
        this.D = value == null ? d.f28476k : value;
        this.C = bVar.f28456d;
        Iterator<mj.g<Object>> it = kVar.f28517i.iterator();
        while (it.hasNext()) {
            y((mj.g) it.next());
        }
        synchronized (kVar) {
            hVar = kVar.f28518j;
        }
        a(hVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    public final mj.d A(int i14, int i15, g gVar, l lVar, Object obj, Executor executor, mj.a aVar, mj.e eVar, mj.g gVar2, nj.h hVar) {
        mj.e eVar2;
        mj.e bVar;
        j<TranscodeType> jVar;
        mj.a aVar2;
        mj.d dVarK;
        mj.k kVar;
        int i16;
        int i17;
        j<TranscodeType> jVar2;
        if (this.P != null) {
            bVar = new mj.b(obj, eVar);
            eVar2 = bVar;
        } else {
            eVar2 = null;
            bVar = eVar;
        }
        j<TranscodeType> jVar3 = this.I;
        if (jVar3 == null) {
            jVar = this;
            if (jVar.T != null) {
                kVar = new mj.k(obj, bVar);
                mj.j jVarK = jVar.K(i14, i15, gVar, lVar, obj, executor, aVar, kVar, gVar2, hVar);
                mj.j jVarK2 = jVar.K(i14, i15, jVar.D(gVar), lVar, obj, executor, aVar.clone().r(jVar.T.floatValue()), kVar, gVar2, hVar);
                kVar.f119076c = jVarK;
                kVar.f119077d = jVarK2;
                jVar = this;
            } else {
                aVar2 = aVar;
                dVarK = jVar.K(i14, i15, gVar, lVar, obj, executor, aVar2, bVar, gVar2, hVar);
            }
            if (eVar2 == null) {
                return dVarK;
            }
            j<TranscodeType> jVar4 = jVar.P;
            i16 = jVar4.f119004k;
            i17 = jVar4.f119003j;
            if (m.i(i14, i15)) {
                jVar2 = jVar.P;
                if (!m.i(jVar2.f119004k, jVar2.f119003j)) {
                    i16 = aVar2.f119004k;
                    i17 = aVar2.f119003j;
                }
            }
            int i18 = i17;
            j<TranscodeType> jVar5 = jVar.P;
            mj.b bVar2 = eVar2;
            mj.d dVarA = jVar5.A(i16, i18, jVar5.f118997d, jVar5.D, obj, executor, jVar5, bVar2, gVar2, hVar);
            bVar2.f119018c = dVarK;
            bVar2.f119019d = dVarA;
            return bVar2;
        }
        if (this.Z) {
            vb.h.z("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            return null;
        }
        l lVar2 = jVar3.X ? lVar : jVar3.D;
        g gVarD = mj.a.h(jVar3.f118994a, 8) ? this.I.f118997d : D(gVar);
        j<TranscodeType> jVar6 = this.I;
        int i19 = jVar6.f119004k;
        int i24 = jVar6.f119003j;
        if (m.i(i14, i15)) {
            j<TranscodeType> jVar7 = this.I;
            if (!m.i(jVar7.f119004k, jVar7.f119003j)) {
                i19 = aVar.f119004k;
                i24 = aVar.f119003j;
            }
        }
        kVar = new mj.k(obj, bVar);
        mj.j jVarK3 = K(i14, i15, gVar, lVar, obj, executor, aVar, kVar, gVar2, hVar);
        this.Z = true;
        j<TranscodeType> jVar8 = this.I;
        l lVar3 = lVar2;
        jVar = this;
        mj.d dVarA2 = jVar8.A(i19, i24, gVarD, lVar3, obj, executor, jVar8, kVar, gVar2, hVar);
        jVar.Z = false;
        kVar.f119076c = jVarK3;
        kVar.f119077d = dVarA2;
        aVar2 = aVar;
        dVarK = kVar;
        if (eVar2 == null) {
            return dVarK;
        }
        j<TranscodeType> jVar9 = jVar.P;
        i16 = jVar9.f119004k;
        i17 = jVar9.f119003j;
        if (m.i(i14, i15)) {
            jVar2 = jVar.P;
            if (!m.i(jVar2.f119004k, jVar2.f119003j)) {
                i16 = aVar2.f119004k;
                i17 = aVar2.f119003j;
            }
        }
        int i110 = i17;
        j<TranscodeType> jVar10 = jVar.P;
        mj.b bVar3 = eVar2;
        mj.d dVarA3 = jVar10.A(i16, i110, jVar10.f118997d, jVar10.D, obj, executor, jVar10, bVar3, gVar2, hVar);
        bVar3.f119018c = dVarK;
        bVar3.f119019d = dVarA3;
        return bVar3;
    }

    @Override // mj.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.D = jVar.D.clone();
        if (jVar.F != null) {
            jVar.F = new ArrayList(jVar.F);
        }
        j<TranscodeType> jVar2 = jVar.I;
        if (jVar2 != null) {
            jVar.I = jVar2.b();
        }
        j<TranscodeType> jVar3 = jVar.P;
        if (jVar3 != null) {
            jVar.P = jVar3.b();
        }
        return jVar;
    }

    public final j<TranscodeType> C(j<TranscodeType> jVar) {
        if (this.f119013v) {
            return b().C(jVar);
        }
        this.P = jVar;
        o();
        return this;
    }

    public final g D(g gVar) {
        int i14 = a.f28506b[gVar.ordinal()];
        if (i14 == 1) {
            return g.NORMAL;
        }
        if (i14 == 2) {
            return g.HIGH;
        }
        if (i14 == 3 || i14 == 4) {
            return g.IMMEDIATE;
        }
        n23.j.A(this.f118997d, "unknown priority: ");
        return null;
    }

    public final void E(ImageView imageView) {
        mj.a aVarI;
        nj.h dVar;
        m.a();
        qj.l.b(imageView);
        if (!mj.a.h(this.f118994a, 2048) && this.f119007n && imageView.getScaleType() != null) {
            switch (a.f28505a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarI = b().i(dj.l.f59839c, new dj.i());
                    break;
                case 2:
                    aVarI = b().i(dj.l.f59838b, new dj.j());
                    aVarI.f119014w = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarI = b().i(dj.l.f59837a, new q());
                    aVarI.f119014w = true;
                    break;
                case 6:
                    aVarI = b().i(dj.l.f59838b, new dj.j());
                    aVarI.f119014w = true;
                    break;
                default:
                    aVarI = this;
                    break;
            }
        } else {
            aVarI = this;
        }
        this.C.f28479c.getClass();
        Class<TranscodeType> cls = this.A;
        if (Bitmap.class.equals(cls)) {
            dVar = new nj.b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                vb.h.s(androidx.core.view.j.i(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
                return;
            }
            dVar = new nj.d(imageView);
        }
        F(dVar, null, aVarI, qj.e.f144968a);
    }

    public final void F(nj.h hVar, mj.f fVar, mj.a aVar, Executor executor) {
        qj.l.b(hVar);
        if (!this.Y) {
            vb.h.s("You must call #load() before calling #into()");
            return;
        }
        Object obj = new Object();
        l<?, ? super TranscodeType> lVar = this.D;
        mj.d dVarA = A(aVar.f119004k, aVar.f119003j, aVar.f118997d, lVar, obj, executor, aVar, null, fVar, hVar);
        mj.d request = hVar.getRequest();
        if (dVarA.d(request) && (aVar.f119002i || !request.isComplete())) {
            qj.l.c(request, "Argument must not be null");
            if (request.isRunning()) {
                return;
            }
            request.g();
            return;
        }
        this.f28504z.j(hVar);
        hVar.i(dVarA);
        k kVar = this.f28504z;
        synchronized (kVar) {
            kVar.f28514f.f98946a.add(hVar);
            r rVar = kVar.f28512d;
            rVar.f98930a.add(dVarA);
            if (rVar.f98932c) {
                dVarA.clear();
                rVar.f98931b.add(dVarA);
            } else {
                dVarA.g();
            }
        }
    }

    public final j<TranscodeType> G(mj.g<TranscodeType> gVar) {
        if (this.f119013v) {
            return b().G(gVar);
        }
        this.F = null;
        return y(gVar);
    }

    public final j<TranscodeType> H(Uri uri) {
        j<TranscodeType> jVarJ = J(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return jVarJ;
        }
        Context context = this.f28503y;
        return jVarJ.t(context.getTheme()).q(pj.a.c(context));
    }

    public final j<TranscodeType> I(byte[] bArr) {
        j<TranscodeType> jVarJ = J(bArr);
        if (!mj.a.h(jVarJ.f118994a, 4)) {
            jVarJ = jVarJ.a(new mj.h().d(wi.j.f185365b));
        }
        if (mj.a.h(jVarJ.f118994a, 256)) {
            return jVarJ;
        }
        if (mj.h.f119040y == null) {
            mj.h hVarS = new mj.h().s(true);
            if (hVarS.f119011r && !hVarS.f119013v) {
                vb.h.z("You cannot auto lock an already locked options object, try clone() first");
                return null;
            }
            hVarS.f119013v = true;
            hVarS.f119011r = true;
            mj.h.f119040y = hVarS;
        }
        return jVarJ.a(mj.h.f119040y);
    }

    public final j<TranscodeType> J(Object obj) {
        if (this.f119013v) {
            return b().J(obj);
        }
        this.E = obj;
        this.Y = true;
        o();
        return this;
    }

    public final mj.j K(int i14, int i15, g gVar, l lVar, Object obj, Executor executor, mj.a aVar, mj.e eVar, mj.g gVar2, nj.h hVar) {
        Object obj2 = this.E;
        ArrayList arrayList = this.F;
        d dVar = this.C;
        return mj.j.h(this.f28503y, dVar, obj, obj2, this.A, aVar, i14, i15, gVar, hVar, gVar2, arrayList, eVar, dVar.f28483g, lVar.f28522a, executor);
    }

    public final mj.f L() {
        mj.f fVar = new mj.f(Integer.MIN_VALUE, Integer.MIN_VALUE);
        F(fVar, fVar, this, qj.e.f144969b);
        return fVar;
    }

    @Deprecated
    public final j M() {
        if (this.f119013v) {
            return b().M();
        }
        this.T = Float.valueOf(0.25f);
        o();
        return this;
    }

    @Override // mj.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(jVar) && Objects.equals(this.A, jVar.A) && this.D.equals(jVar.D) && Objects.equals(this.E, jVar.E) && Objects.equals(this.F, jVar.F) && Objects.equals(this.I, jVar.I) && Objects.equals(this.P, jVar.P) && Objects.equals(this.T, jVar.T) && this.X == jVar.X && this.Y == jVar.Y;
    }

    @Override // mj.a
    public final int hashCode() {
        return m.g(this.Y ? 1 : 0, m.g(this.X ? 1 : 0, m.h(m.h(m.h(m.h(m.h(m.h(m.h(super.hashCode(), this.A), this.D), this.E), this.F), this.I), this.P), this.T)));
    }

    public final j<TranscodeType> y(mj.g<TranscodeType> gVar) {
        if (this.f119013v) {
            return b().y(gVar);
        }
        if (gVar != null) {
            if (this.F == null) {
                this.F = new ArrayList();
            }
            this.F.add(gVar);
        }
        o();
        return this;
    }

    @Override // mj.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final j<TranscodeType> a(mj.a<?> aVar) {
        qj.l.b(aVar);
        return (j) super.a(aVar);
    }

    @SuppressLint({"CheckResult"})
    public j(Class<TranscodeType> cls, j<?> jVar) {
        this(jVar.B, jVar.f28504z, cls, jVar.f28503y);
        this.E = jVar.E;
        this.Y = jVar.Y;
    }
}

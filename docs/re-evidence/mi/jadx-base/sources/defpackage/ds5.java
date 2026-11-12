package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class ds5 implements dbi<w14<u14>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v63 f15873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f15874b;
    public final n3d c;
    public final kci d;
    public final dbi<o98> e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final x14 j;

    public class a extends c {
        public a(cg4<w14<u14>> cg4Var, ebi ebiVar, boolean z, int i) {
            super(cg4Var, ebiVar, z, i);
        }

        @Override // ds5.c
        public synchronized boolean D(o98 o98Var, int i) {
            if (e52.e(i)) {
                return false;
            }
            return super.D(o98Var, i);
        }

        @Override // ds5.c
        public int v(o98 o98Var) {
            return o98Var.J();
        }

        @Override // ds5.c
        public tfi w() {
            return z6d.d(0, false, false);
        }
    }

    public class b extends c {
        public final lci j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final kci f15875k;
        public int l;

        public b(cg4<w14<u14>> cg4Var, ebi ebiVar, lci lciVar, kci kciVar, boolean z, int i) {
            super(cg4Var, ebiVar, z, i);
            this.j = (lci) b6i.g(lciVar);
            this.f15875k = (kci) b6i.g(kciVar);
            this.l = 0;
        }

        @Override // ds5.c
        public synchronized boolean D(o98 o98Var, int i) {
            try {
                boolean zD = super.D(o98Var, i);
                if (e52.e(i) || e52.m(i, 8)) {
                    if (!e52.m(i, 4) && o98.O(o98Var) && o98Var.s() == pv5.f30818a) {
                        if (!this.j.g(o98Var)) {
                            return false;
                        }
                        int iD = this.j.d();
                        int i2 = this.l;
                        if (iD <= i2) {
                            return false;
                        }
                        if (iD < this.f15875k.a(i2) && !this.j.e()) {
                            return false;
                        }
                        this.l = iD;
                    }
                }
                return zD;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // ds5.c
        public int v(o98 o98Var) {
            return this.j.c();
        }

        @Override // ds5.c
        public tfi w() {
            return this.f15875k.b(this.j.d());
        }
    }

    public abstract class c extends sy5<o98, w14<u14>> {
        public final String c;
        public final ebi d;
        public final hbi e;
        public final l3d f;
        public boolean g;
        public final krd h;

        public class a implements krd.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ds5 f15876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ebi f15877b;
            public final /* synthetic */ int c;

            public a(ds5 ds5Var, ebi ebiVar, int i) {
                this.f15876a = ds5Var;
                this.f15877b = ebiVar;
                this.c = i;
            }

            @Override // krd.d
            public void a(o98 o98Var, int i) {
                if (o98Var != null) {
                    if (ds5.this.f || !e52.m(i, 16)) {
                        ImageRequest imageRequestB = this.f15877b.b();
                        if (ds5.this.g || !idq.k(imageRequestB.q())) {
                            o98Var.d0(c47.b(imageRequestB.o(), imageRequestB.m(), o98Var, this.c));
                        }
                    }
                    c.this.t(o98Var, i);
                }
            }
        }

        public class b extends ea2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ds5 f15878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f15879b;

            public b(ds5 ds5Var, boolean z) {
                this.f15878a = ds5Var;
                this.f15879b = z;
            }

            @Override // defpackage.ea2, defpackage.fbi
            public void a() {
                if (c.this.d.d()) {
                    c.this.h.h();
                }
            }

            @Override // defpackage.fbi
            public void b() {
                if (this.f15879b) {
                    c.this.x();
                }
            }
        }

        public c(cg4<w14<u14>> cg4Var, ebi ebiVar, boolean z, int i) {
            super(cg4Var);
            this.c = "ProgressiveDecoder";
            this.d = ebiVar;
            this.e = ebiVar.f();
            l3d l3dVarD = ebiVar.b().d();
            this.f = l3dVarD;
            this.g = false;
            this.h = new krd(ds5.this.f15874b, new a(ds5.this, ebiVar, i), l3dVarD.f24600a);
            ebiVar.c(new b(ds5.this, z));
        }

        public final synchronized boolean A() {
            return this.g;
        }

        public final void B(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.g) {
                        o().c(1.0f);
                        this.g = true;
                        this.h.c();
                    }
                }
            }
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            boolean zD;
            try {
                if (epa.d()) {
                    epa.a("DecodeProducer#onNewResultImpl");
                }
                boolean zD2 = e52.d(i);
                if (zD2 && !o98.O(o98Var)) {
                    y(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                } else {
                    if (!D(o98Var, i)) {
                        if (zD) {
                            return;
                        } else {
                            return;
                        }
                    }
                    boolean zM = e52.m(i, 4);
                    if (zD2 || zM || this.d.d()) {
                        this.h.h();
                    }
                }
            } finally {
                if (epa.d()) {
                    epa.b();
                }
            }
        }

        public boolean D(o98 o98Var, int i) {
            return this.h.k(o98Var, i);
        }

        @Override // defpackage.sy5, defpackage.e52
        public void f() {
            x();
        }

        @Override // defpackage.sy5, defpackage.e52
        public void g(Throwable th) {
            y(th);
        }

        @Override // defpackage.sy5, defpackage.e52
        public void i(float f) {
            super.i(f * 0.99f);
        }

        public final void t(o98 o98Var, int i) {
            u14 u14Var;
            int i2 = i;
            if ((o98Var.s() != pv5.f30818a && e52.e(i)) || A() || !o98.O(o98Var)) {
                return;
            }
            l4d l4dVarS = o98Var.s();
            String str = "unknown";
            String strA = l4dVarS != null ? l4dVarS.a() : "unknown";
            String str2 = o98Var.getWidth() + "x" + o98Var.getHeight();
            String strValueOf = String.valueOf(o98Var.E());
            boolean zD = e52.d(i);
            boolean z = zD && !e52.m(i2, 8);
            boolean zM = e52.m(i2, 4);
            ypk ypkVarM = this.d.b().m();
            if (ypkVarM != null) {
                str = ypkVarM.f40404a + "x" + ypkVarM.f40405b;
            }
            String str3 = str;
            try {
                long jF = this.h.f();
                String strValueOf2 = String.valueOf(this.d.b().q());
                int iJ = (z || zM) ? o98Var.J() : v(o98Var);
                tfi tfiVarW = (z || zM) ? z6d.d : w();
                this.e.a(this.d.getId(), "DecodeProducer");
                try {
                    try {
                        u14 u14VarA = ds5.this.c.a(o98Var, iJ, tfiVarW, this.f);
                        try {
                            if (o98Var.E() != 1) {
                                i2 |= 16;
                            }
                            this.e.g(this.d.getId(), "DecodeProducer", u(u14VarA, jF, tfiVarW, zD, strA, str2, str3, strValueOf));
                            z(u14VarA, i2);
                            o98.c(o98Var);
                        } catch (Exception e) {
                            e = e;
                            u14Var = u14VarA;
                            this.e.c(this.d.getId(), "DecodeProducer", e, u(u14Var, jF, tfiVarW, zD, strA, str2, str3, strValueOf));
                            y(e);
                            o98.c(o98Var);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        u14Var = null;
                    }
                } catch (DecodeException e3) {
                    o98 encodedImage = e3.getEncodedImage();
                    cm8.E("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e3.getMessage(), strValueOf2, encodedImage.p(10), Integer.valueOf(encodedImage.J()));
                    throw e3;
                }
            } catch (Throwable th) {
                o98.c(o98Var);
                throw th;
            }
        }

        public final Map<String, String> u(u14 u14Var, long j, tfi tfiVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.e.f(this.d.getId())) {
                return null;
            }
            String strValueOf = String.valueOf(j);
            String strValueOf2 = String.valueOf(tfiVar.b());
            String strValueOf3 = String.valueOf(z);
            if (!(u14Var instanceof z14)) {
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                return ImmutableMap.copyOf((Map) map);
            }
            Bitmap bitmapD = ((z14) u14Var).d();
            String str5 = bitmapD.getWidth() + "x" + bitmapD.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str5);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            return ImmutableMap.copyOf((Map) map2);
        }

        public abstract int v(o98 o98Var);

        public abstract tfi w();

        public final void x() {
            B(true);
            o().a();
        }

        public final void y(Throwable th) {
            B(true);
            o().onFailure(th);
        }

        public final void z(u14 u14Var, int i) {
            w14<u14> w14VarA = ds5.this.j.a(u14Var);
            try {
                B(e52.d(i));
                o().b(w14VarA, i);
            } finally {
                w14.l(w14VarA);
            }
        }
    }

    public ds5(v63 v63Var, Executor executor, n3d n3dVar, kci kciVar, boolean z, boolean z2, boolean z3, dbi<o98> dbiVar, int i, x14 x14Var) {
        this.f15873a = (v63) b6i.g(v63Var);
        this.f15874b = (Executor) b6i.g(executor);
        this.c = (n3d) b6i.g(n3dVar);
        this.d = (kci) b6i.g(kciVar);
        this.f = z;
        this.g = z2;
        this.e = (dbi) b6i.g(dbiVar);
        this.h = z3;
        this.i = i;
        this.j = x14Var;
    }

    @Override // defpackage.dbi
    public void a(cg4<w14<u14>> cg4Var, ebi ebiVar) {
        try {
            if (epa.d()) {
                epa.a("DecodeProducer#produceResults");
            }
            this.e.a(!idq.k(ebiVar.b().q()) ? new a(cg4Var, ebiVar, this.h, this.i) : new b(cg4Var, ebiVar, new lci(this.f15873a), this.d, this.h, this.i), ebiVar);
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }
}

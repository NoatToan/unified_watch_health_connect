package defpackage;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class wpk implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f38218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i f38219b;
    public final dbi<o98> c;
    public final boolean d;
    public final y5d e;

    public class a extends sy5<o98, o98> {
        public final boolean c;
        public final y5d d;
        public final ebi e;
        public boolean f;
        public final krd g;

        /* JADX INFO: renamed from: wpk$a$a, reason: collision with other inner class name */
        public class C1136a implements krd.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ wpk f38220a;

            public C1136a(wpk wpkVar) {
                this.f38220a = wpkVar;
            }

            @Override // krd.d
            public void a(o98 o98Var, int i) throws Throwable {
                a aVar = a.this;
                aVar.v(o98Var, i, (x5d) b6i.g(aVar.d.createImageTranscoder(o98Var.s(), a.this.c)));
            }
        }

        public class b extends ea2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ wpk f38222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ cg4 f38223b;

            public b(wpk wpkVar, cg4 cg4Var) {
                this.f38222a = wpkVar;
                this.f38223b = cg4Var;
            }

            @Override // defpackage.ea2, defpackage.fbi
            public void a() {
                if (a.this.e.d()) {
                    a.this.g.h();
                }
            }

            @Override // defpackage.fbi
            public void b() {
                a.this.g.c();
                a.this.f = true;
                this.f38223b.a();
            }
        }

        public a(cg4<o98> cg4Var, ebi ebiVar, boolean z, y5d y5dVar) {
            super(cg4Var);
            this.f = false;
            this.e = ebiVar;
            Boolean boolN = ebiVar.b().n();
            this.c = boolN != null ? boolN.booleanValue() : z;
            this.d = y5dVar;
            this.g = new krd(wpk.this.f38218a, new C1136a(wpk.this), 100);
            ebiVar.c(new b(wpk.this, cg4Var));
        }

        public final o98 A(o98 o98Var) {
            return (this.e.b().o().c() || o98Var.D() == 0 || o98Var.D() == -1) ? o98Var : x(o98Var, 0);
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            if (this.f) {
                return;
            }
            boolean zD = e52.d(i);
            if (o98Var == null) {
                if (zD) {
                    o().b(null, 1);
                    return;
                }
                return;
            }
            l4d l4dVarS = o98Var.s();
            TriState triStateH = wpk.h(this.e.b(), o98Var, (x5d) b6i.g(this.d.createImageTranscoder(l4dVarS, this.c)));
            if (zD || triStateH != TriState.UNSET) {
                if (triStateH != TriState.YES) {
                    w(o98Var, i, l4dVarS);
                } else if (this.g.k(o98Var, i)) {
                    if (zD || this.e.d()) {
                        this.g.h();
                    }
                }
            }
        }

        public final void v(o98 o98Var, int i, x5d x5dVar) throws Throwable {
            this.e.f().a(this.e.getId(), "ResizeAndRotateProducer");
            ImageRequest imageRequestB = this.e.b();
            p3i p3iVarB = wpk.this.f38219b.b();
            try {
                try {
                    w5d w5dVarD = x5dVar.d(o98Var, p3iVarB, imageRequestB.o(), imageRequestB.m(), null, 85);
                    if (w5dVarD.a() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map<String, String> mapY = y(o98Var, imageRequestB.m(), w5dVarD, x5dVar.a());
                    w14 w14VarD = w14.D(p3iVarB.a());
                    try {
                        o98 o98Var2 = new o98((w14<PooledByteBuffer>) w14VarD);
                        o98Var2.b0(pv5.f30818a);
                        try {
                            o98Var2.P();
                            this.e.f().g(this.e.getId(), "ResizeAndRotateProducer", mapY);
                            if (w5dVarD.a() != 1) {
                                i |= 16;
                            }
                            o().b(o98Var2, i);
                            o98.c(o98Var2);
                            w14.l(w14VarD);
                            p3iVarB.close();
                        } catch (Throwable th) {
                            o98.c(o98Var2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        w14.l(w14VarD);
                        throw th2;
                    }
                } catch (Exception e) {
                    this.e.f().c(this.e.getId(), "ResizeAndRotateProducer", e, null);
                    if (e52.d(i)) {
                        o().onFailure(e);
                    }
                    p3iVarB.close();
                }
            } catch (Throwable th3) {
                p3iVarB.close();
                throw th3;
            }
        }

        public final void w(o98 o98Var, int i, l4d l4dVar) {
            o().b((l4dVar == pv5.f30818a || l4dVar == pv5.f30820k) ? A(o98Var) : z(o98Var), i);
        }

        public final o98 x(o98 o98Var, int i) {
            o98 o98VarB = o98.b(o98Var);
            o98Var.close();
            if (o98VarB != null) {
                o98VarB.c0(i);
            }
            return o98VarB;
        }

        public final Map<String, String> y(o98 o98Var, ypk ypkVar, w5d w5dVar, String str) {
            String str2;
            if (!this.e.f().f(this.e.getId())) {
                return null;
            }
            String str3 = o98Var.getWidth() + "x" + o98Var.getHeight();
            if (ypkVar != null) {
                str2 = ypkVar.f40404a + "x" + ypkVar.f40405b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(o98Var.s()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(w5dVar));
            return ImmutableMap.copyOf((Map) map);
        }

        public final o98 z(o98 o98Var) {
            jxk jxkVarO = this.e.b().o();
            return (jxkVarO.g() || !jxkVarO.f()) ? o98Var : x(o98Var, jxkVarO.e());
        }
    }

    public wpk(Executor executor, n3i n3iVar, dbi<o98> dbiVar, boolean z, y5d y5dVar) {
        this.f38218a = (Executor) b6i.g(executor);
        this.f38219b = (n3i) b6i.g(n3iVar);
        this.c = (dbi) b6i.g(dbiVar);
        this.e = (y5d) b6i.g(y5dVar);
        this.d = z;
    }

    public static boolean f(jxk jxkVar, o98 o98Var) {
        return !jxkVar.c() && (srd.e(jxkVar, o98Var) != 0 || g(jxkVar, o98Var));
    }

    public static boolean g(jxk jxkVar, o98 o98Var) {
        if (jxkVar.f() && !jxkVar.c()) {
            return srd.f33913a.contains(Integer.valueOf(o98Var.o()));
        }
        o98Var.U(0);
        return false;
    }

    public static TriState h(ImageRequest imageRequest, o98 o98Var, x5d x5dVar) {
        if (o98Var == null || o98Var.s() == l4d.c) {
            return TriState.UNSET;
        }
        if (x5dVar.c(o98Var.s())) {
            return TriState.valueOf(f(imageRequest.o(), o98Var) || x5dVar.b(o98Var, imageRequest.o(), imageRequest.m()));
        }
        return TriState.NO;
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        this.c.a(new a(cg4Var, ebiVar, this.d, this.e), ebiVar);
    }
}

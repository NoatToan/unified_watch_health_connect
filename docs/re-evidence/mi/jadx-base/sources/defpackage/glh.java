package defpackage;

import android.net.Uri;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class glh implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53 f19106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f93 f19107b;
    public final n3i c;
    public final v63 d;
    public final dbi<o98> e;

    public class a implements dj4<o98, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hbi f19108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f19109b;
        public final /* synthetic */ cg4 c;
        public final /* synthetic */ ebi d;
        public final /* synthetic */ c93 e;

        public a(hbi hbiVar, String str, cg4 cg4Var, ebi ebiVar, c93 c93Var) {
            this.f19108a = hbiVar;
            this.f19109b = str;
            this.c = cg4Var;
            this.d = ebiVar;
            this.e = c93Var;
        }

        @Override // defpackage.dj4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(k1p<o98> k1pVar) throws Exception {
            if (glh.g(k1pVar)) {
                this.f19108a.h(this.f19109b, "PartialDiskCacheProducer", null);
                this.c.a();
            } else if (k1pVar.n()) {
                this.f19108a.c(this.f19109b, "PartialDiskCacheProducer", k1pVar.i(), null);
                glh.this.i(this.c, this.d, this.e, null);
            } else {
                o98 o98VarJ = k1pVar.j();
                if (o98VarJ != null) {
                    hbi hbiVar = this.f19108a;
                    String str = this.f19109b;
                    hbiVar.g(str, "PartialDiskCacheProducer", glh.f(hbiVar, str, true, o98VarJ.J()));
                    c83 c83VarE = c83.e(o98VarJ.J() - 1);
                    o98VarJ.T(c83VarE);
                    int iJ = o98VarJ.J();
                    ImageRequest imageRequestB = this.d.b();
                    if (c83VarE.a(imageRequestB.b())) {
                        this.f19108a.i(this.f19109b, "PartialDiskCacheProducer", true);
                        this.c.b(o98VarJ, 9);
                    } else {
                        this.c.b(o98VarJ, 8);
                        glh.this.i(this.c, new o0m(ImageRequestBuilder.b(imageRequestB).t(c83.b(iJ - 1)).a(), this.d), this.e, o98VarJ);
                    }
                } else {
                    hbi hbiVar2 = this.f19108a;
                    String str2 = this.f19109b;
                    hbiVar2.g(str2, "PartialDiskCacheProducer", glh.f(hbiVar2, str2, false, 0));
                    glh.this.i(this.c, this.d, this.e, o98VarJ);
                }
            }
            return null;
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f19110a;

        public b(AtomicBoolean atomicBoolean) {
            this.f19110a = atomicBoolean;
        }

        @Override // defpackage.fbi
        public void b() {
            this.f19110a.set(true);
        }
    }

    public static class c extends sy5<o98, o98> {
        public final z53 c;
        public final c93 d;
        public final n3i e;
        public final v63 f;
        public final o98 g;

        public /* synthetic */ c(cg4 cg4Var, z53 z53Var, c93 c93Var, n3i n3iVar, v63 v63Var, o98 o98Var, a aVar) {
            this(cg4Var, z53Var, c93Var, n3iVar, v63Var, o98Var);
        }

        public final void p(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = this.f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int i3 = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (i3 < 0) {
                        break;
                    } else if (i3 > 0) {
                        outputStream.write(bArr, 0, i3);
                        i2 -= i3;
                    }
                } catch (Throwable th) {
                    this.f.release(bArr);
                    throw th;
                }
            }
            this.f.release(bArr);
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        public final p3i q(o98 o98Var, o98 o98Var2) throws IOException {
            p3i p3iVarD = this.e.d(o98Var2.J() + o98Var2.m().f5037a);
            p(o98Var.y(), p3iVarD, o98Var2.m().f5037a);
            p(o98Var2.y(), p3iVarD, o98Var2.J());
            return p3iVarD;
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            if (e52.e(i)) {
                return;
            }
            if (this.g != null) {
                try {
                    if (o98Var.m() != null) {
                        try {
                            s(q(this.g, o98Var));
                        } catch (IOException e) {
                            cm8.j("PartialDiskCacheProducer", "Error while merging image data", e);
                            o().onFailure(e);
                        }
                        o98Var.close();
                        o98Var = this.g;
                        o98Var.close();
                        this.c.q(this.d);
                        return;
                    }
                } catch (Throwable th) {
                    o98Var.close();
                    this.g.close();
                    throw th;
                }
            }
            if (!e52.m(i, 8) || !e52.d(i) || o98Var.s() == l4d.c) {
                o().b(o98Var, i);
            } else {
                this.c.o(this.d, o98Var);
                o().b(o98Var, i);
            }
        }

        public final void s(p3i p3iVar) throws Throwable {
            o98 o98Var;
            Throwable th;
            w14 w14VarD = w14.D(p3iVar.a());
            try {
                o98Var = new o98((w14<PooledByteBuffer>) w14VarD);
                try {
                    o98Var.P();
                    o().b(o98Var, 1);
                    o98.c(o98Var);
                    w14.l(w14VarD);
                } catch (Throwable th2) {
                    th = th2;
                    o98.c(o98Var);
                    w14.l(w14VarD);
                    throw th;
                }
            } catch (Throwable th3) {
                o98Var = null;
                th = th3;
            }
        }

        public c(cg4<o98> cg4Var, z53 z53Var, c93 c93Var, n3i n3iVar, v63 v63Var, o98 o98Var) {
            super(cg4Var);
            this.c = z53Var;
            this.d = c93Var;
            this.e = n3iVar;
            this.f = v63Var;
            this.g = o98Var;
        }
    }

    public glh(z53 z53Var, f93 f93Var, n3i n3iVar, v63 v63Var, dbi<o98> dbiVar) {
        this.f19106a = z53Var;
        this.f19107b = f93Var;
        this.c = n3iVar;
        this.d = v63Var;
        this.e = dbiVar;
    }

    public static Uri e(ImageRequest imageRequest) {
        return imageRequest.q().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    public static Map<String, String> f(hbi hbiVar, String str, boolean z, int i) {
        if (hbiVar.f(str)) {
            return z ? ImmutableMap.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(k1p<?> k1pVar) {
        return k1pVar.l() || (k1pVar.n() && (k1pVar.i() instanceof CancellationException));
    }

    private void j(AtomicBoolean atomicBoolean, ebi ebiVar) {
        ebiVar.c(new b(atomicBoolean));
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        ImageRequest imageRequestB = ebiVar.b();
        if (!imageRequestB.t()) {
            this.e.a(cg4Var, ebiVar);
            return;
        }
        ebiVar.f().a(ebiVar.getId(), "PartialDiskCacheProducer");
        c93 c93VarD = this.f19107b.d(imageRequestB, e(imageRequestB), ebiVar.a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f19106a.m(c93VarD, atomicBoolean).e(h(cg4Var, ebiVar, c93VarD));
        j(atomicBoolean, ebiVar);
    }

    public final dj4<o98, Void> h(cg4<o98> cg4Var, ebi ebiVar, c93 c93Var) {
        return new a(ebiVar.f(), ebiVar.getId(), cg4Var, ebiVar, c93Var);
    }

    public final void i(cg4<o98> cg4Var, ebi ebiVar, c93 c93Var, o98 o98Var) {
        this.e.a(new c(cg4Var, this.f19106a, c93Var, this.c, this.d, o98Var, null), ebiVar);
    }
}

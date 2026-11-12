package defpackage;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class iy6 implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53 f22218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53 f22219b;
    public final f93 c;
    public final dbi<o98> d;

    public class a implements dj4<o98, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hbi f22220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22221b;
        public final /* synthetic */ cg4 c;
        public final /* synthetic */ ebi d;

        public a(hbi hbiVar, String str, cg4 cg4Var, ebi ebiVar) {
            this.f22220a = hbiVar;
            this.f22221b = str;
            this.c = cg4Var;
            this.d = ebiVar;
        }

        @Override // defpackage.dj4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(k1p<o98> k1pVar) throws Exception {
            if (iy6.f(k1pVar)) {
                this.f22220a.h(this.f22221b, "DiskCacheProducer", null);
                this.c.a();
            } else if (k1pVar.n()) {
                this.f22220a.c(this.f22221b, "DiskCacheProducer", k1pVar.i(), null);
                iy6.this.d.a(this.c, this.d);
            } else {
                o98 o98VarJ = k1pVar.j();
                if (o98VarJ != null) {
                    hbi hbiVar = this.f22220a;
                    String str = this.f22221b;
                    hbiVar.g(str, "DiskCacheProducer", iy6.e(hbiVar, str, true, o98VarJ.J()));
                    this.f22220a.i(this.f22221b, "DiskCacheProducer", true);
                    this.c.c(1.0f);
                    this.c.b(o98VarJ, 1);
                    o98VarJ.close();
                } else {
                    hbi hbiVar2 = this.f22220a;
                    String str2 = this.f22221b;
                    hbiVar2.g(str2, "DiskCacheProducer", iy6.e(hbiVar2, str2, false, 0));
                    iy6.this.d.a(this.c, this.d);
                }
            }
            return null;
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f22222a;

        public b(AtomicBoolean atomicBoolean) {
            this.f22222a = atomicBoolean;
        }

        @Override // defpackage.fbi
        public void b() {
            this.f22222a.set(true);
        }
    }

    public iy6(z53 z53Var, z53 z53Var2, f93 f93Var, dbi<o98> dbiVar) {
        this.f22218a = z53Var;
        this.f22219b = z53Var2;
        this.c = f93Var;
        this.d = dbiVar;
    }

    public static Map<String, String> e(hbi hbiVar, String str, boolean z, int i) {
        if (hbiVar.f(str)) {
            return z ? ImmutableMap.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    public static boolean f(k1p<?> k1pVar) {
        return k1pVar.l() || (k1pVar.n() && (k1pVar.i() instanceof CancellationException));
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        ImageRequest imageRequestB = ebiVar.b();
        if (!imageRequestB.t()) {
            g(cg4Var, ebiVar);
            return;
        }
        ebiVar.f().a(ebiVar.getId(), "DiskCacheProducer");
        c93 c93VarB = this.c.b(imageRequestB, ebiVar.a());
        z53 z53Var = imageRequestB.c() == ImageRequest.CacheChoice.SMALL ? this.f22219b : this.f22218a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        z53Var.m(c93VarB, atomicBoolean).e(h(cg4Var, ebiVar));
        i(atomicBoolean, ebiVar);
    }

    public final void g(cg4<o98> cg4Var, ebi ebiVar) {
        if (ebiVar.g().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            cg4Var.b(null, 1);
        } else {
            this.d.a(cg4Var, ebiVar);
        }
    }

    public final dj4<o98, Void> h(cg4<o98> cg4Var, ebi ebiVar) {
        return new a(ebiVar.f(), ebiVar.getId(), cg4Var, ebiVar);
    }

    public final void i(AtomicBoolean atomicBoolean, ebi ebiVar) {
        ebiVar.c(new b(atomicBoolean));
    }
}

package defpackage;

import android.os.SystemClock;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class dkg implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3i f15619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v63 f15620b;
    public final ekg c;

    public class a implements ekg.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yk9 f15621a;

        public a(yk9 yk9Var) {
            this.f15621a = yk9Var;
        }

        @Override // ekg.a
        public void a() {
            dkg.this.j(this.f15621a);
        }

        @Override // ekg.a
        public void b(InputStream inputStream, int i) throws Throwable {
            if (epa.d()) {
                epa.a("NetworkFetcher->onResponse");
            }
            dkg.this.l(this.f15621a, inputStream, i);
            if (epa.d()) {
                epa.b();
            }
        }

        @Override // ekg.a
        public void onFailure(Throwable th) {
            dkg.this.k(this.f15621a, th);
        }
    }

    public dkg(n3i n3iVar, v63 v63Var, ekg ekgVar) {
        this.f15619a = n3iVar;
        this.f15620b = v63Var;
        this.c = ekgVar;
    }

    public static float e(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp(((double) (-i)) / 50000.0d));
    }

    public static void i(p3i p3iVar, int i, c83 c83Var, cg4<o98> cg4Var) throws Throwable {
        w14 w14VarD = w14.D(p3iVar.a());
        o98 o98Var = null;
        try {
            o98 o98Var2 = new o98((w14<PooledByteBuffer>) w14VarD);
            try {
                o98Var2.T(c83Var);
                o98Var2.P();
                cg4Var.b(o98Var2, i);
                o98.c(o98Var2);
                w14.l(w14VarD);
            } catch (Throwable th) {
                th = th;
                o98Var = o98Var2;
                o98.c(o98Var);
                w14.l(w14VarD);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        ebiVar.f().a(ebiVar.getId(), "NetworkFetchProducer");
        yk9 yk9VarB = this.c.b(cg4Var, ebiVar);
        this.c.e(yk9VarB, new a(yk9VarB));
    }

    public final Map<String, String> f(yk9 yk9Var, int i) {
        if (yk9Var.e().f(yk9Var.c())) {
            return this.c.c(yk9Var, i);
        }
        return null;
    }

    public void g(p3i p3iVar, yk9 yk9Var) throws Throwable {
        Map<String, String> mapF = f(yk9Var, p3iVar.size());
        hbi hbiVarE = yk9Var.e();
        hbiVarE.g(yk9Var.c(), "NetworkFetchProducer", mapF);
        hbiVarE.i(yk9Var.c(), "NetworkFetchProducer", true);
        i(p3iVar, yk9Var.f() | 1, yk9Var.g(), yk9Var.a());
    }

    public void h(p3i p3iVar, yk9 yk9Var) throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!m(yk9Var) || jUptimeMillis - yk9Var.d() < 100) {
            return;
        }
        yk9Var.i(jUptimeMillis);
        yk9Var.e().d(yk9Var.c(), "NetworkFetchProducer", "intermediate_result");
        i(p3iVar, yk9Var.f(), yk9Var.g(), yk9Var.a());
    }

    public final void j(yk9 yk9Var) {
        yk9Var.e().h(yk9Var.c(), "NetworkFetchProducer", null);
        yk9Var.a().a();
    }

    public final void k(yk9 yk9Var, Throwable th) {
        yk9Var.e().c(yk9Var.c(), "NetworkFetchProducer", th, null);
        yk9Var.e().i(yk9Var.c(), "NetworkFetchProducer", false);
        yk9Var.a().onFailure(th);
    }

    public void l(yk9 yk9Var, InputStream inputStream, int i) throws Throwable {
        p3i p3iVarD = i > 0 ? this.f15619a.d(i) : this.f15619a.b();
        byte[] bArr = this.f15620b.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    this.c.d(yk9Var, p3iVarD.size());
                    g(p3iVarD, yk9Var);
                    this.f15620b.release(bArr);
                    p3iVarD.close();
                    return;
                }
                if (i2 > 0) {
                    p3iVarD.write(bArr, 0, i2);
                    h(p3iVarD, yk9Var);
                    yk9Var.a().c(e(p3iVarD.size(), i));
                }
            } catch (Throwable th) {
                this.f15620b.release(bArr);
                p3iVarD.close();
                throw th;
            }
        }
    }

    public final boolean m(yk9 yk9Var) {
        if (yk9Var.b().d()) {
            return this.c.a(yk9Var);
        }
        return false;
    }
}

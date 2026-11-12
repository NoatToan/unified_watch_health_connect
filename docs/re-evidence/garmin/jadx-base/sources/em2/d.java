package em2;

import android.content.Context;
import android.os.Looper;
import bd0.c0;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.library.backgroundtaskmanagement.g;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import im2.n;
import java.util.UUID;
import lm2.f;
import o13.p;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rd2.h;
import rd2.i;
import rd2.j;
import sm2.y;

/* JADX INFO: loaded from: classes11.dex */
public class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f64638a = LoggerFactory.getLogger("PAIR#DefaultDbDelegate");

    @Override // sk2.a
    public final void a(rs2.c cVar, p<byte[], UUID> pVar) {
        rd2.f.a().f152047c.j(cVar.getF172494b(), pVar.f128594a);
    }

    @Override // lm2.f
    public final long b(rs2.c cVar, int i14) {
        int iA = km2.b.a(i14);
        h hVarD = h.d();
        long f172494b = cVar.getF172494b();
        hVarD.getClass();
        return h.f(iA, f172494b);
    }

    @Override // lm2.f
    public final void c(bm2.d dVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n(dVar, str, System.currentTimeMillis(), l(), ((c0) lm2.h.d()).a(String.valueOf(dVar.getF172495c())), bArr, bArr2, bArr3);
    }

    @Override // lm2.f
    public final void d(rs2.c cVar, byte[] bArr) {
        rd2.f.a().f152047c.j(cVar.getF172494b(), bArr);
    }

    @Override // lm2.f
    public final boolean e(rs2.c cVar, int i14) {
        int iA = km2.b.a(i14);
        h hVarD = h.d();
        long f172494b = cVar.getF172494b();
        hVarD.getClass();
        return h.e(iA, f172494b);
    }

    @Override // sk2.a
    public final p<byte[], UUID> f(rs2.c cVar) {
        j jVar = rd2.f.a().f152045a;
        long f172494b = cVar.getF172494b();
        jVar.getClass();
        return new p<>(j.j(f172494b), null);
    }

    @Override // lm2.f
    public final void g(Context context, long j8, String str, n.a.C1799a c1799a) {
        g gVar;
        if (c1799a != null) {
            b bVar = new b(this, c1799a);
            pd2.d dVar = g.f50133b;
            gVar = new g(bVar);
            dVar.f137397a.add(gVar);
        } else {
            gVar = null;
        }
        dm2.f.N().M(gVar, context, j8, str);
    }

    @Override // lm2.f
    public final void h(long j8) {
        rd2.f.a().f152047c.getClass();
        i.d(j8);
    }

    @Override // lm2.f
    public final void i(yl2.d dVar, Context context, String str, y.a aVar) {
        bm2.d dVar2 = dVar.f197842d;
        if (dVar2 == null) {
            vb.h.s("Device info should've been populated by now");
        } else {
            bm2.f fVar = dVar.f197840b;
            m(context, dVar2, fVar != null ? fVar.getApplicationKey() : null, System.currentTimeMillis(), l(), dVar.f197848j, str, dVar.f197843e, dVar.f197844f, dVar.f197845g, aVar);
        }
    }

    @Override // lm2.f
    public final void j(rs2.c cVar, int i14, boolean z14) {
        int iA = km2.b.a(i14);
        h hVarD = h.d();
        long f172494b = cVar.getF172494b();
        hVarD.getClass();
        h.g(f172494b, iA, z14);
    }

    @Override // lm2.f
    public final boolean k(long j8) {
        rd2.f.a().f152045a.getClass();
        return j.h(j8) != null;
    }

    public int l() {
        return 0;
    }

    public void m(Context context, bm2.d dVar, String str, long j8, int i14, byte[] bArr, String str2, byte[] bArr2, byte[] bArr3, byte[] bArr4, f.a aVar) {
        c cVar = new c(this, aVar);
        pd2.d dVar2 = g.f50133b;
        g gVar = new g(cVar);
        dVar2.f137397a.add(gVar);
        dm2.f.N().O(gVar, context, dVar, str, j8, i14, bArr, str2, bArr2, bArr3, bArr4, true);
    }

    public void n(final bm2.d dVar, final String str, final long j8, final int i14, final String str2, final byte[] bArr, final byte[] bArr2, final byte[] bArr3) {
        Runnable runnable = new Runnable() { // from class: em2.a
            @Override // java.lang.Runnable
            public final void run() {
                i iVar = rd2.f.a().f152047c;
                bm2.d dVar2 = dVar;
                iVar.g(dVar2.getF172494b(), dVar2.getF172495c(), str, dVar2.f(), dVar2.getF172496d(), String.valueOf(dVar2.getF172497e()), j8, i14, dVar2.getConnectionType(), null, true, str2, bArr, bArr2, bArr3, dVar2.isMultiLinkSupported(), null);
                Configuration configurationB = dVar2.b();
                sd2.e eVar = new sd2.e();
                eVar.f158646a = dVar2.getF172494b();
                eVar.f158647b = dVar2.f();
                eVar.f158648c = configurationB.getCapabilityFlags();
                ConnectDatabase.g().f().c(eVar);
                km2.a.j();
            }
        };
        if (Looper.getMainLooper().getThread().equals(Thread.currentThread())) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }
}

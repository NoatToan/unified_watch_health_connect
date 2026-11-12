package hk0;

import bs2.bb;
import bs2.bk;
import bs2.fk;
import bs2.fs;
import bs2.id;
import bs2.pv;
import bs2.t;
import bs2.ti;
import bs2.zp;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.io.ByteArrayOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhk0/i;", "Lzs2/k;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements zs2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rs2.c f84072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f84073b;

    public i(rs2.c cVar, f fVar) {
        this.f84072a = cVar;
        this.f84073b = fVar;
    }

    @Override // zs2.k
    public final void a(id idVar) {
        h(idVar);
    }

    @Override // zs2.k
    public final void b(t tVar) {
        h(tVar);
    }

    @Override // zs2.k
    public final void c(bb bbVar) {
        h(bbVar);
    }

    @Override // zs2.k
    public final void d(fs fsVar) {
        h(fsVar);
    }

    @Override // zs2.k
    public final void e(ti tiVar) {
        h(tiVar);
    }

    @Override // zs2.k
    public final void f(pv pvVar) {
        h(pvVar);
    }

    @Override // zs2.k
    public final void g(zp zpVar) {
        h(zpVar);
    }

    public final void h(bk bkVar) {
        wd2.g gVar;
        wd2.g gVar2;
        f fVar = this.f84073b;
        rs2.c cVar = this.f84072a;
        long f92746j = cVar.getF92746j();
        cVar.getF92741e();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                new fk(bkVar).b(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byteArray.getClass();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bkVar.q(byteArrayOutputStream2, null);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                    byteArray2.getClass();
                    GarminConnectMobileApp.f28685g.getClass();
                    e eVarF = e.f(GarminConnectMobileApp.a.a());
                    fVar.f84065c.trace("update(): Sending FitDefinitionMessage payload=" + ft2.b.a(byteArray));
                    eVarF.k(f92746j, byteArray);
                    p pVar = p.f84079d;
                    if (pVar != null && (gVar2 = pVar.f84082c) != null) {
                        gVar2.c(f92746j, byteArray);
                    }
                    fVar.f84065c.trace("update(): Sending FitDataMessage payload=" + ft2.b.a(byteArray2));
                    eVarF.k(f92746j, byteArray2);
                    p pVar2 = p.f84079d;
                    if (pVar2 == null || (gVar = pVar2.f84082c) == null) {
                        return;
                    }
                    gVar.c(f92746j, byteArray2);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(byteArrayOutputStream2, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(byteArrayOutputStream, th5);
                    throw th6;
                }
            }
        } catch (Exception e4) {
            fVar.f84065c.error(e4.getMessage());
        }
    }
}

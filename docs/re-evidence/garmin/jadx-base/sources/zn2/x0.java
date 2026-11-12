package zn2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x0 implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f205929b;

    public /* synthetic */ x0(z0 z0Var, int i14) {
        this.f205928a = i14;
        this.f205929b = z0Var;
    }

    @Override // u03.a
    public final void run() {
        g1 g1Var;
        g1 g1Var2;
        int i14 = this.f205928a;
        z0 z0Var = this.f205929b;
        switch (i14) {
            case 0:
                o53.c0.c(z0Var.f205979a.f205537l, null);
                f1.f205508a.getClass();
                f1.f205509b = null;
                z0Var.f205981c.clear();
                break;
            default:
                g1 g1Var3 = z0Var.f205979a;
                Logger logger = z0.f205975h;
                logger.debug("validateDeviceServiceProviders");
                ps2.w wVar = ps2.w.f140538a;
                is2.b bVar = is2.b.FITPAY;
                wVar.getClass();
                List<ps2.n> listJ = ps2.w.j(bVar);
                HashSet hashSet = new HashSet();
                for (ps2.n nVar : listJ) {
                    ps2.w wVar2 = ps2.w.f140538a;
                    is2.b bVar2 = is2.b.FITPAY;
                    ms2.g gVarA = wVar2.a(bVar2);
                    if (gVarA == null || !gVarA.h(nVar.f140498a)) {
                        long j8 = nVar.f140511n;
                        g1Var = g1Var3;
                        logger.warn("validateDeviceServiceProviders: not creating device service provider for " + j8 + ", hasFitPayDevice: " + g1Var.X(j8));
                    } else {
                        ms2.d dVarG = nVar.g(bVar2);
                        long j14 = nVar.f140511n;
                        t tVar = dVarG instanceof t ? (t) dVarG : null;
                        try {
                            if (tVar != null) {
                                Set<fo2.s> set = g1Var3.f205531f;
                                if (!(set instanceof Collection) || !set.isEmpty()) {
                                    Iterator<T> it = set.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            fo2.s sVar = (fo2.s) it.next();
                                            long j15 = sVar.f73103c;
                                            fo2.s sVar2 = tVar.f205819e.f205629a;
                                            g1Var2 = g1Var3;
                                            if (j15 != sVar2.f73103c || p005kotlin.jvm.internal.s.g(sVar.f73101a, sVar2.f73101a)) {
                                                g1Var3 = g1Var2;
                                            }
                                        }
                                    }
                                }
                                g1Var2 = g1Var3;
                                g1Var = g1Var2;
                            } else {
                                g1Var2 = g1Var3;
                            }
                            is2.b bVar3 = is2.b.FITPAY;
                            bVar3.getClass();
                            o62.b0 b0Var = new o62.b0(8, nVar, bVar3);
                            int i15 = w03.b.f181178a;
                            hashSet.add(Long.valueOf(j14));
                        } catch (Exception e4) {
                            logger.error("validateDeviceServiceProviders: failed to create device service provider for " + j14, (Throwable) e4);
                        }
                        wr.g.w("validateDeviceServiceProviders: creating device service provider for ", j14, logger);
                        g1Var = g1Var2;
                    }
                    g1Var3 = g1Var;
                    break;
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    wr.g.w("validateDeviceServiceProviders: Device service provider created fro ", ((Number) it3.next()).longValue(), logger);
                }
                break;
        }
    }
}

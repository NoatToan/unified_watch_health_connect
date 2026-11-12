package jn2;

import ch.qos.logback.classic.Logger;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import java.util.Iterator;
import java.util.Set;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f99626c;

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f99624a = i14;
        this.f99625b = obj;
        this.f99626c = obj2;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        hs2.a aVar;
        is2.a nfcInfo;
        Set<pl2.c> setB;
        int i14 = this.f99624a;
        boolean zContains = false;
        Object obj2 = this.f99626c;
        Object obj3 = this.f99625b;
        switch (i14) {
            case 0:
                m mVar = (m) obj3;
                ps2.m mVar2 = (ps2.m) obj2;
                pl2.l lVar = (pl2.l) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
                mVar.f(hs2.g.CHANGING_PASSCODE);
                if (!lVar.f138589b) {
                    int i15 = lVar.f138588a;
                    if (i15 != 13) {
                        js2.a.C1929a c1929a = js2.a.f100646e;
                        int i16 = lVar.f138591d;
                        c1929a.getClass();
                        mVar2.accept(new js2.a(false, i15, Integer.valueOf(i16), i15 == 12, null));
                    } else {
                        mVar.g(hs2.g.LOCKED_PASSCODE);
                        js2.a.C1929a c1929a2 = js2.a.f100646e;
                        int i17 = lVar.f138588a;
                        int i18 = lVar.f138591d;
                        c1929a2.getClass();
                        mVar2.accept(new js2.a(false, i17, Integer.valueOf(i18), i17 == 12, null));
                    }
                } else {
                    js2.a.C1929a c1929a3 = js2.a.f100646e;
                    int i19 = lVar.f138588a;
                    c1929a3.getClass();
                    mVar2.accept(new js2.a(true, i19, null, false, 12, null));
                }
                break;
            case 1:
                ListeningScheduledExecutorService listeningScheduledExecutorService2 = m.f99646l;
                ((m) obj3).f(hs2.g.RESETTING_SECURE_ELEMENT);
                ((ps2.l) obj2).accept(Boolean.TRUE);
                break;
            case 2:
                m mVar3 = (m) obj3;
                g gVar = (g) obj2;
                pl2.l lVar2 = (pl2.l) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService3 = m.f99646l;
                Integer numValueOf = lVar2 != null ? Integer.valueOf(lVar2.f138588a) : null;
                if ((numValueOf != null && numValueOf.intValue() == 11) || ((numValueOf != null && numValueOf.intValue() == 13) || (numValueOf != null && numValueOf.intValue() == 12))) {
                    if (lVar2.f138588a != 13) {
                        mVar3.f(hs2.g.CHECKING_PASSCODE_AND_OWNER_DATA);
                    } else {
                        mVar3.g(hs2.g.LOCKED_PASSCODE);
                    }
                    mVar3.e(new n(gVar, lVar2));
                } else if (numValueOf == null || numValueOf.intValue() != 22) {
                    mVar3.f99650d.error("Failed to check checkPasscodeData: " + (lVar2 != null ? Integer.valueOf(lVar2.f138588a) : null));
                    mVar3.f(hs2.g.CHECKING_PASSCODE_AND_OWNER_DATA);
                    gVar.accept(null);
                } else {
                    w wVar = w.f140538a;
                    long j8 = mVar3.f99647a;
                    wVar.getClass();
                    ps2.n nVarI = w.i(j8);
                    if (nVarI != null && (aVar = nVarI.f140498a) != null && (nfcInfo = aVar.getNfcInfo()) != null && (setB = nfcInfo.b()) != null) {
                        zContains = setB.contains(pl2.c.f138564k);
                    }
                    if (!zContains) {
                        mVar3.f(hs2.g.CHECKING_PASSCODE_AND_OWNER_DATA);
                        mVar3.e(new p(gVar));
                    } else {
                        mVar3.f(hs2.g.CHECKING_PASSCODE_AND_OWNER_DATA);
                        mVar3.e(new o(mVar3, gVar));
                    }
                }
                break;
            case 3:
                e13.a.C1312a c1312a = (e13.a.C1312a) obj3;
                ps2.n nVar = (ps2.n) obj2;
                Logger logger = nVar.f140504g;
                js2.d dVar = (js2.d) obj;
                if (dVar == null) {
                    c1312a.c(nVar.f140513p);
                } else if (p005kotlin.jvm.internal.s.g(dVar.f100665f, Boolean.TRUE) && dVar.f100662c == js2.c.OWNER_DATA_NOT_SET) {
                    logger.debug("Owner data not set but passcode is set, create owner data");
                    logger.info("delete data for missing owner");
                    try {
                        w.f140538a.getClass();
                        Iterator it = w.f140542e.values().iterator();
                        while (it.hasNext()) {
                            ((ms2.g) it.next()).n().e();
                        }
                        nVar.e();
                    } catch (Exception e4) {
                        logger.error("Failed to delete cloud data for missing owner", (Throwable) e4);
                        nVar.f140513p = dVar;
                        c1312a.c(dVar);
                    }
                    ps2.e eVar = new ps2.e(nVar, 2);
                    int i24 = w03.b.f181178a;
                    v03.c.e(c1312a, new z03.c(eVar).i(new ps2.d(new p90.h(nVar, 6, dVar, c1312a), 5), new p62.e(nVar, 7, dVar, c1312a)));
                } else {
                    nVar.f140513p = dVar;
                    c1312a.c(dVar);
                }
                break;
            default:
                qr2.d dVar2 = (qr2.d) obj3;
                String str = (String) obj2;
                js2.f fVar = (js2.f) obj;
                org.slf4j.Logger logger2 = qr2.d.f146935v;
                Boolean bool = fVar.f100676a;
                int i25 = fVar.f100677b;
                Integer num = fVar.f100678c;
                dVar2.f146947l.m(Boolean.FALSE);
                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    if (dVar2.f146949n) {
                        dVar2.f146949n = false;
                    }
                    if (i25 != 12) {
                        dVar2.A4(qr2.d.c.ENTER_EXISTING_PASSCODE, num);
                    } else {
                        qr2.d.c cVar = qr2.d.c.LOCKED_WALLET;
                        if (num != null && num.intValue() == -1) {
                            num = 3;
                        }
                        dVar2.A4(cVar, num);
                    }
                } else {
                    dVar2.f146942g = str;
                    dVar2.A4(qr2.d.c.CREATE_NEW_PASSCODE, null);
                }
                break;
        }
    }
}

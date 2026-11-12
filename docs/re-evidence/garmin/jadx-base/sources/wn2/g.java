package wn2;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import pn2.t;
import tn2.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186366b;

    public /* synthetic */ g(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, int i14) {
        this.f186365a = i14;
        this.f186366b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f186365a;
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar = this.f186366b;
        switch (i14) {
            case 0:
                rn2.i iVar = aVar.f51029c;
                if (iVar == null) {
                    vb.h.s("No Card please call getCardList or make sure you've done the provision");
                    return null;
                }
                r0 r0Var = aVar.f51030d;
                if (r0Var == null) {
                    p005kotlin.jvm.internal.s.m("felicaService");
                    throw null;
                }
                String cid = iVar.getCid();
                Logger logger = r0.f165631n;
                return r0Var.b(new tn2.m(28), cid);
            case 1:
                rn2.i iVar2 = aVar.f51029c;
                if (iVar2 == null) {
                    vb.h.s("No Card please call getCardList or make sure you've done the provision");
                    return null;
                }
                r0 r0Var2 = aVar.f51030d;
                if (r0Var2 != null) {
                    return r0Var2.i(iVar2.getCid());
                }
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
            case 2:
                rn2.i iVar3 = aVar.f51029c;
                if (iVar3 == null) {
                    vb.h.s("No Card please call getCardList or make sure you've done the provision");
                    return null;
                }
                r0 r0Var3 = aVar.f51030d;
                if (r0Var3 != null) {
                    return r0Var3.n(iVar3.getCid(), "1000", new h(aVar, 3));
                }
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
            case 3:
                rn2.i iVar4 = aVar.f51029c;
                if (iVar4 == null) {
                    vb.h.s("No Card please call getCardList or make sure you've done the provision");
                    return null;
                }
                r0 r0Var4 = aVar.f51030d;
                if (r0Var4 != null) {
                    return r0Var4.o(new h(aVar, 7), iVar4.getCid());
                }
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
            case 4:
                rn2.i iVar5 = aVar.f51029c;
                if (iVar5 == null) {
                    vb.h.s("No Card please call getCardList or make sure you've done the provision");
                    return null;
                }
                r0 r0Var5 = aVar.f51030d;
                if (r0Var5 != null) {
                    return r0Var5.a(iVar5.getCid(), "1000", "token", new h(aVar, 8));
                }
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
            default:
                rn2.i iVar6 = aVar.f51029c;
                if (iVar6 == null) {
                    vb.h.s("No Card please call getCardList or make sure you've done the provision");
                    return null;
                }
                r0 r0Var6 = aVar.f51030d;
                if (r0Var6 != null) {
                    return r0Var6.q(iVar6.getCid(), new t(aVar.f51033g, aVar.f51032f, "19780101", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (String) aVar.f51040n.invoke()));
                }
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
        }
    }
}

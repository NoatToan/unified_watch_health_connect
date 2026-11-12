package ho2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import d53.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o13.r;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.g1;
import zn2.q3;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho2/m;", "Landroidx/lifecycle/u1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f84870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Long, ? extends ns2.a<? extends ms2.e>> f84871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f84872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ps2.n f84873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<Boolean> f84874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f84875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0<q3.a> f84876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y0<io2.d> f84877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qs2.a f84878i;

    public m() {
        int i14 = gt2.c.f79010a;
        this.f84870a = gt2.b.f79005a.h("PAY#PushProvMainViewModel");
        this.f84872c = -1L;
        this.f84874e = new y0<>();
    }

    public final zq2.g x4(qs2.a aVar) {
        Map<Long, ? extends ns2.a<? extends ms2.e>> map = this.f84871b;
        Object obj = null;
        if (map == null) {
            s.m("operatorsByDevice");
            throw null;
        }
        ns2.a<? extends ms2.e> aVar2 = map.get(Long.valueOf(this.f84872c));
        if (aVar2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : aVar2.f127815a) {
            if (obj2 instanceof zq2.g) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            if (((zq2.g) obj3).f206687h == aVar) {
                obj = obj3;
                break;
            }
        }
        return (zq2.g) obj;
    }

    public final zq2.g y4(io2.d dVar) {
        io2.e eVar;
        qs2.a aVar;
        io2.c cVar;
        io2.a aVar2;
        String pushId = (dVar == null || (aVar2 = dVar.f94621b) == null) ? null : aVar2.getPushId();
        io2.f pushProvisioningPayload = (dVar == null || (cVar = dVar.f94620a) == null) ? null : cVar.getPushProvisioningPayload();
        if (g22.n.d(pushId)) {
            return x4(qs2.a.f147378g);
        }
        Logger logger = this.f84870a;
        if (pushProvisioningPayload == null) {
            logger.warn("getItemFromPayload: null payload");
            return null;
        }
        logger.debug("Extracting business operator from deep link payload");
        String pushAccountReceipt = pushProvisioningPayload.getPushAccountReceipt();
        if (pushAccountReceipt == null) {
            logger.warn("getItemFromPayload: cannot get tag from " + pushProvisioningPayload);
            return null;
        }
        io2.e.f94628b.getClass();
        List listX = w.X(pushAccountReceipt, new char[]{'-'});
        String strSubstring = (s.g(listX.get(0), "TST") ? (String) listX.get(1) : (String) listX.get(0)).substring(0, 3);
        io2.e eVar2 = io2.e.PUSH_PROV_MCC_MASTER_CARD_CREDIT_TAG;
        if (strSubstring.equals(eVar2.f94635a)) {
            eVar = eVar2;
        } else {
            eVar = io2.e.PUSH_PROV_DMC_MASTER_CARD_DEBIT_TAG;
            if (!strSubstring.equals(eVar.f94635a)) {
                eVar = io2.e.PUSH_PROV_MSI_MAESTRO_TAG;
                if (!strSubstring.equals(eVar.f94635a)) {
                    eVar = io2.e.PUSH_PROV_PVL_PRIVATE_LABEL_TAG;
                    if (!strSubstring.equals(eVar.f94635a)) {
                        eVar = io2.e.PUSH_PROV_VISA_TAG;
                    }
                }
            }
        }
        String str = eVar.f94635a;
        if (s.g(str, io2.e.PUSH_PROV_VISA_TAG.f94635a)) {
            aVar = qs2.a.f147378g;
        } else if (s.g(str, eVar2.f94635a) || s.g(str, io2.e.PUSH_PROV_DMC_MASTER_CARD_DEBIT_TAG.f94635a)) {
            aVar = qs2.a.f147379h;
        } else {
            if (!s.g(str, io2.e.PUSH_PROV_MSI_MAESTRO_TAG.f94635a)) {
                com.airbnb.lottie.animation.keyframe.a.A("getItemFromPayload: unknown tag ", str, logger);
                return null;
            }
            aVar = qs2.a.f147381j;
        }
        return x4(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z4(io2.d dVar, v13.c cVar) throws NewFitPayException {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f84869c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f84869c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objN0 = lVar.f84867a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f84869c;
        if (i15 == 0) {
            r.b(objN0);
            this.f84870a.debug("verifyPushProvDeepLinkData");
            String str = dVar.f94622c;
            if (str != null) {
                jo2.d dVar2 = new jo2.d(str);
                z0 z0Var = this.f84875f;
                if (z0Var == null) {
                    s.m("serviceProvider");
                    throw null;
                }
                g1 g1Var = z0Var.f205979a;
                lVar.f84869c = 1;
                objN0 = g1Var.n0(dVar2, lVar);
                if (objN0 == aVar) {
                    return aVar;
                }
            } else {
                y0<io2.d> y0Var = this.f84877h;
                if (y0Var == null) {
                    s.m("pushProvDeepLinkData");
                    throw null;
                }
                y0Var.j(dVar);
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objN0);
        jo2.e eVar = (jo2.e) objN0;
        y0<io2.d> y0Var2 = this.f84877h;
        if (y0Var2 == null) {
            s.m("pushProvDeepLinkData");
            throw null;
        }
        io2.d.a aVar2 = io2.d.f94618i;
        String payload = eVar.getPayload();
        aVar2.getClass();
        y0Var2.j(io2.d.a.a(payload));
        return Unit.INSTANCE;
    }
}

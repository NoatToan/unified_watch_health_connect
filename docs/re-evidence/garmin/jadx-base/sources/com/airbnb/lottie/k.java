package com.airbnb.lottie;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import c83.a0;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import e13.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import q03.r;
import tn2.a1;
import tn2.h0;
import tn2.p0;
import tn2.r0;
import tn2.y0;
import tn2.z0;
import vn2.g0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28224d;

    public /* synthetic */ k(String str, r0 r0Var, String str2) {
        this.f28221a = 2;
        this.f28222b = str;
        this.f28223c = r0Var;
        this.f28224d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws FNValidateException {
        Object next;
        int i14 = this.f28221a;
        int i15 = 21;
        char c14 = 1;
        Object obj = this.f28224d;
        Object obj2 = this.f28222b;
        Object obj3 = this.f28223c;
        switch (i14) {
            case 0:
                return LottieCompositionFactory.fromInputStreamSync((Context) obj3, (InputStream) obj, (String) obj2);
            case 1:
                Logger logger = tn2.w.f165679d;
                ps2.w wVar = ps2.w.f140538a;
                long j8 = ((tn2.w) obj3).f165682c;
                wVar.getClass();
                ps2.n nVarI = ps2.w.i(j8);
                nVarI.getClass();
                byte[] bytes = ((String) obj2).getBytes(d53.c.f57666b);
                bytes.getClass();
                return nVarI.p(bytes, (String) obj, Float.POSITIVE_INFINITY);
            case 2:
                String str = (String) obj2;
                r0 r0Var = (r0) obj3;
                String str2 = (String) obj;
                Logger logger2 = r0.f165631n;
                if (!p005kotlin.jvm.internal.s.g(str, "Delete") && !p005kotlin.jvm.internal.s.g(str, "PermanentDelete")) {
                    return z03.f.f200765a;
                }
                e13.o oVarK = r0Var.k(str2);
                tn2.v vVar = new tn2.v(new h0(r0Var, str2, c14 == true ? 1 : 0), 19);
                int i16 = w03.b.f181178a;
                return new e13.k(oVarK, vVar);
            case 3:
                a0 a0Var = (a0) obj3;
                r0.d dVar = (r0.d) obj;
                String str3 = (String) obj2;
                T t7 = a0Var.f25746b;
                t7.getClass();
                pn2.p pVar = (pn2.p) t7;
                tn2.i iVar = new tn2.i(a0Var);
                rn2.s sVarA = iVar.a();
                if (p005kotlin.jvm.internal.s.g(sVarA != null ? sVarA.getResultCode() : null, "0033")) {
                    pn2.d dVarD = pVar.d();
                    if (dVarD == null) {
                        throw new FNValidateException("Incorrect payload: no payload");
                    }
                    String resultConfirmId = ((pn2.v) dVarD).getResultConfirmId();
                    String xMfiVersion = pVar.getHeader().getXMfiVersion();
                    if (xMfiVersion == null) {
                        throw new FNValidateException("Incorrect xMfiVersion: null");
                    }
                    k kVar = new k(dVar, resultConfirmId, 4, xMfiVersion);
                    int i17 = w03.b.f181178a;
                    return new e13.b(kVar);
                }
                if (!iVar.e()) {
                    throw iVar.c();
                }
                pn2.d dVarD2 = pVar.d();
                if (dVarD2 == null) {
                    throw new FNValidateException("Incorrect payload: no payload");
                }
                String resultConfirmId2 = ((pn2.v) dVarD2).getResultConfirmId();
                String xMfiVersion2 = pVar.getHeader().getXMfiVersion();
                if (xMfiVersion2 == null) {
                    throw new FNValidateException("Incorrect xMfiVersion: null");
                }
                String nextAccessToken = pVar.getHeader().getNextAccessToken();
                nextAccessToken.getClass();
                return dVar.b(nextAccessToken, resultConfirmId2, str3, xMfiVersion2);
            case 4:
                r0.d dVar2 = (r0.d) obj3;
                String str4 = (String) obj;
                r rVar = (r) dVar2.f165652e.invoke(new r0.b((String) obj2, str4));
                p0 p0Var = new p0(new sy.i(i15, dVar2, str4), 5);
                rVar.getClass();
                int i18 = w03.b.f181178a;
                return new e13.r(new e13.j(rVar, p0Var), new p0(new tn2.t(dVar2, 2), 6));
            case 5:
                List list = (List) obj3;
                List list2 = (List) obj;
                y0 y0Var = (y0) obj2;
                Logger logger3 = y0.f165733f;
                if (list.size() > 1) {
                    vb.h.z("User has more than 1 card");
                    return null;
                }
                rn2.i iVar2 = (rn2.i) p13.h0.K0(list);
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        com.garmin.device.nfc.b bVar = (com.garmin.device.nfc.b) next;
                        if (iVar2 != null) {
                            String cid = iVar2.getCid();
                            byte[] bArr = bVar.f50857j;
                            bArr.getClass();
                            if (p005kotlin.jvm.internal.s.g(cid, new String(bArr, d53.c.f57666b))) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                boolean z14 = ((com.garmin.device.nfc.b) next) == null;
                if (iVar2 == null) {
                    return r.f(y0.f165734g);
                }
                if (p005kotlin.jvm.internal.s.g(iVar2.getCardStatuses().getCardStatus(), "inProcess") || iVar2.getCardStatuses().getSubStatus().getRecovery()) {
                    return r.f(new y0.c(iVar2, z14, y0.a.NEED_RECOVERY));
                }
                if (iVar2.getCardStatuses().getSubStatus().getBlacklist() || p005kotlin.jvm.internal.s.g(iVar2.getCardStatuses().getSpCardStatus(), "Disabled")) {
                    return r.f(new y0.c(iVar2, z14, y0.a.NEED_DELETION_AND_CALL_CENTER));
                }
                if (iVar2.getCardStatuses().getSubStatus().getForceReissue() || p005kotlin.jvm.internal.s.g(iVar2.getCardStatuses().getSpCardStatus(), "Locked")) {
                    return r.f(new y0.c(iVar2, z14, y0.a.NEED_CALL_CENTER));
                }
                if (p005kotlin.jvm.internal.s.g(iVar2.getCardStatuses().getSpCardStatus(), "Quitted")) {
                    return r.f(new y0.c(iVar2, z14, y0.a.NEED_DELETION_ONLY));
                }
                if (!p005kotlin.jvm.internal.s.g(iVar2.getCardStatuses().getSpCardStatus(), "Enabled") && !p005kotlin.jvm.internal.s.g(iVar2.getCardStatuses().getSpCardStatus(), "Unknown")) {
                    return r.f(new y0.c(iVar2, z14, null));
                }
                e13.j jVarT = y0Var.f165735a.f165632a.t(new tn2.w.d(false, false, false, false, false, false, false, false, false, true, 511, null));
                tn2.v vVar2 = new tn2.v(new tn2.m(i15), 22);
                int i19 = w03.b.f181178a;
                return new b13.k(new b13.f(new l(jVarT, vVar2), new yr2.l(new z0(iVar2, z14))), new e13.b(new a1(iVar2, z14)));
            case 6:
                String str5 = (String) obj2;
                WorkDatabase workDatabase = ((ve.p) obj3).f177585e;
                ((ArrayList) obj).addAll(workDatabase.k().c(str5));
                return workDatabase.j().i(str5);
            default:
                return g0.d1((g0) obj3, (String) obj2, (e23.l) obj);
        }
    }

    public /* synthetic */ k(Object obj, String str, int i14, Object obj2) {
        this.f28221a = i14;
        this.f28223c = obj;
        this.f28222b = str;
        this.f28224d = obj2;
    }

    public /* synthetic */ k(Object obj, int i14, Object obj2, Object obj3) {
        this.f28221a = i14;
        this.f28223c = obj;
        this.f28224d = obj2;
        this.f28222b = obj3;
    }
}

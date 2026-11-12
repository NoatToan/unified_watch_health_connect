package vn2;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn2/n0;", "Lyq2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 implements yq2.b {
    @Override // yq2.b
    public final vr2.q a(fs2.a aVar) {
        as2.a aVarA;
        rn2.u transitInformation;
        rn2.k cardNumber;
        tn2.j.a aVar2 = (tn2.j.a) fs2.a.f(aVar, tn2.j.a.class);
        if (aVar2 == null) {
            vb.h.z(fb1.c.n("Cannot parse provider data into FelicaCacheData from ", aVar.f73435j));
            return null;
        }
        qs2.a aVar3 = aVar.f73428c;
        if (aVar3 == null || (aVarA = yr2.e.a(aVar3)) == null) {
            com.google.firebase.messaging.l.n(aVar, "Null businessOperator in DeviceWalletItem ");
            return null;
        }
        String str = aVar.f73429d;
        pn2.a.f138690a.getClass();
        String strF = pn2.a.f();
        rn2.a additionalInfo = aVar2.getCardInfo().getAdditionalInfo();
        String value = (additionalInfo == null || (transitInformation = additionalInfo.getTransitInformation()) == null || (cardNumber = transitInformation.getCardNumber()) == null) ? null : cardNumber.getValue();
        as2.b<Integer> bVarB = aVar2.b();
        return new vr2.q(str, strF, value, aVarA.b(bVarB != null ? bVarB.a() : null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // yq2.b
    public final Object b(fs2.a aVar, v13.i iVar) {
        ms2.d dVarG;
        rn2.i cardInfo;
        String cid;
        as2.f<Integer> fVar;
        ps2.w wVar = ps2.w.f140538a;
        long j8 = aVar.f73431f;
        is2.b bVar = aVar.f73427b;
        bVar.getClass();
        wVar.getClass();
        ps2.n nVarI = ps2.w.i(j8);
        if (nVarI != null) {
            dVarG = nVarI.g(bVar);
            if (!(dVarG instanceof tn2.d0)) {
                dVarG = null;
            }
        } else {
            dVarG = null;
        }
        tn2.d0 d0Var = (tn2.d0) dVarG;
        tn2.r0 r0Var = d0Var != null ? d0Var.f165543d : null;
        tn2.j.a aVar2 = (tn2.j.a) fs2.a.f(aVar, tn2.j.a.class);
        if (aVar2 != null && (cardInfo = aVar2.getCardInfo()) != null && (cid = cardInfo.getCid()) != null && r0Var != null && (fVar = r0Var.f165643l) != null) {
            fVar.b(cid);
        }
        return Unit.INSTANCE;
    }

    @Override // yq2.b
    public final yq2.b.a d(fs2.a aVar) {
        return new yq2.b.a(R.string.title_error_occurred, R.string.wallet_suica_message_error_accessing);
    }
}

package sm2;

import com.garmin.device.pairing.PairingException;

/* JADX INFO: loaded from: classes11.dex */
public class s implements lm2.i.b<vm2.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f160343a;

    public s(t tVar) {
        this.f160343a = tVar;
    }

    @Override // lm2.i.b
    public final void a(vm2.g gVar) {
        rm2.c cVar;
        vm2.g gVar2 = gVar;
        t tVar = this.f160343a;
        if (gVar2 != null) {
            if (gVar2.f178829a && (cVar = tVar.f160342h) != null) {
                cVar.t(tVar.f160338d.getF197655a());
            }
            tVar.f160338d.f197851m = gVar2.f178830b;
        }
        rm2.c cVar2 = tVar.f160342h;
        if (cVar2 != null) {
            cVar2.v(qm2.k.REGISTERING_DEVICE_SUCCESS);
        }
        tVar.d();
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        boolean z14 = th3 instanceof PairingException;
        t tVar = this.f160343a;
        if (!z14) {
            tVar.e(new PairingException(tVar, yl2.e.NETWORK, th3.getMessage()));
        } else {
            PairingException pairingException = (PairingException) th3;
            tVar.j(pairingException.getPairingFailure(), pairingException.getFailureCode());
        }
    }
}

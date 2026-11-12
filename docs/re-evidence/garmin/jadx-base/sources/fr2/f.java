package fr2;

import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.y;
import ps2.n;
import ps2.r;
import ps2.w;
import v.h;
import w2.a0;
import w52.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00150\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00150\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00060\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lfr2/f;", "Landroidx/lifecycle/u1;", "Lps2/r;", "", "<init>", "()V", "", "Lsd2/f;", "devices", "", "D4", "(Ljava/util/List;)V", "B4", "C4", "onCleared", "Lhs2/b;", "status", "k4", "(Lhs2/b;)V", "Landroidx/lifecycle/s0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Landroidx/lifecycle/s0;", "Landroidx/lifecycle/z0;", "b", "Landroidx/lifecycle/z0;", "observer", "Landroidx/lifecycle/y0;", "Lbr2/f;", "c", "Landroidx/lifecycle/y0;", "y4", "()Landroidx/lifecycle/y0;", "availableDevices", "d", "z4", "pairedDevices", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f extends u1 implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f73346f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f73347g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private s0<ArrayList<sd2.f>> devices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z0<ArrayList<sd2.f>> observer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y0<List<br2.f>> availableDevices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y0<List<sd2.f>> pairedDevices;

    static {
        int i14 = gt2.c.f79010a;
        f73347g = gt2.b.f79005a.h("PAY#WatchesViewModel");
    }

    public f() {
        ab2.b.f2642a.getClass();
        this.devices = ab2.b.a();
        a4.b bVar = new a4.b(this, 22);
        this.observer = bVar;
        this.availableDevices = new y0<>();
        this.pairedDevices = new y0<>();
        this.devices.g(bVar);
        B4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(f fVar, ArrayList arrayList) {
        arrayList.getClass();
        fVar.B4();
        fVar.D4(arrayList);
    }

    private final void B4() {
        ArrayList<sd2.f> arrayListD;
        if (this.devices.d() == null || (arrayListD = this.devices.d()) == null) {
            return;
        }
        for (sd2.f fVar : arrayListD) {
            if (a0.o(fVar)) {
                f73347g.debug(h.u(fVar.getUnitID(), "attempting to register for device wallet status updates for unitId = ", ", name = ", a0.i(fVar)));
                w wVar = w.f140538a;
                long unitID = fVar.getUnitID();
                wVar.getClass();
                n nVarI = w.i(unitID);
                if (nVarI != null) {
                    nVarI.m(this);
                }
            }
        }
    }

    private final void C4() {
        ArrayList<sd2.f> arrayListD;
        if (this.devices.d() == null || (arrayListD = this.devices.d()) == null) {
            return;
        }
        for (sd2.f fVar : arrayListD) {
            if (a0.o(fVar)) {
                f73347g.debug(h.u(fVar.getUnitID(), "attempting to unregister from device wallet status updates for unitId = ", ", name = ", a0.i(fVar)));
                w wVar = w.f140538a;
                long unitID = fVar.getUnitID();
                wVar.getClass();
                n nVarI = w.i(unitID);
                if (nVarI != null) {
                    nVarI.q(this);
                }
            }
        }
    }

    private final void D4(List<? extends sd2.f> devices) {
        hs2.b bVarH;
        y0<List<br2.f>> y0VarS1 = s1();
        ArrayList<sd2.f> arrayList = new ArrayList();
        for (Object obj : devices) {
            sd2.f fVar = (sd2.f) obj;
            if (fVar.isPaired() && fVar.i1() && fVar.getConnectionType() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (sd2.f fVar2 : arrayList) {
            w wVar = w.f140538a;
            long unitID = fVar2.getUnitID();
            wVar.getClass();
            n nVarI = w.i(unitID);
            n nVarI2 = w.i(fVar2.getUnitID());
            if (nVarI2 == null || (bVarH = nVarI2.h()) == null) {
                bVarH = hs2.b.DISCONNECTED;
            }
            Logger logger = f73347g;
            long unitID2 = fVar2.getUnitID();
            long unitID3 = fVar2.getUnitID();
            hs2.b bVarH2 = nVarI != null ? nVarI.h() : null;
            StringBuilder sb3 = new StringBuilder("\ngetting device wallet for unitId = ");
            sb3.append(unitID2);
            sb3.append(" (wallet = ");
            sb3.append(nVarI);
            x.j(unitID3, ")\ngetting device wallet status for unitId = ", " (walletStatus = ", sb3);
            sb3.append(bVarH2);
            sb3.append(")");
            logger.debug(sb3.toString());
            br2.f.a aVar = br2.f.f19598j;
            long unitID4 = fVar2.getUnitID();
            boolean zIsPaired = fVar2.isPaired();
            aVar.getClass();
            br2.d dVarA = br2.f.a.a(unitID4, zIsPaired, bVarH);
            long unitID5 = fVar2.getUnitID();
            String strI = a0.i(fVar2);
            String strT = u0.t(fVar2);
            String str = strT == null ? "" : strT;
            String softwareVersion = fVar2.getSoftwareVersion();
            String str2 = softwareVersion == null ? "" : softwareVersion;
            String softwareVersion2 = fVar2.getSoftwareVersion();
            arrayList2.add(new br2.f(unitID5, strI, str, dVarA, str2, softwareVersion2 == null ? "" : softwareVersion2, false, false, 192, null));
        }
        y0VarS1.m(arrayList2);
        y0<List<sd2.f>> y0VarN0 = N0();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : devices) {
            if (((sd2.f) obj2).isPaired()) {
                arrayList3.add(obj2);
            }
        }
        y0VarN0.m(arrayList3);
    }

    @Override // ps2.r
    public void k4(hs2.b status) {
        status.getClass();
        f73347g.debug("onDeviceWalletStatusChanged: " + status);
        ArrayList<sd2.f> arrayListD = this.devices.d();
        if (arrayListD != null) {
            D4(arrayListD);
        }
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        super.onCleared();
        this.devices.k(this.observer);
        C4();
    }

    /* JADX INFO: renamed from: y4, reason: merged with bridge method [inline-methods] */
    public y0<List<br2.f>> s1() {
        return this.availableDevices;
    }

    /* JADX INFO: renamed from: z4, reason: merged with bridge method [inline-methods] */
    public y0<List<sd2.f>> N0() {
        return this.pairedDevices;
    }
}

package lc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.device.datatypes.DeviceProfile;
import d53.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Llc0/a;", "", "Llm2/i;", "pairingServerDelegate", "Llm2/g;", "pairingGFDIAdapter", "Llm2/f;", "pairingDatabaseDelegate", "Lrd2/j;", "deviceSelectQuery", "Llc0/d;", "checkDeviceSoftwareVersionAvailableUseCase", "<init>", "(Llm2/i;Llm2/g;Llm2/f;Lrd2/j;Llc0/d;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2.i f111921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2.g f111922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2.f f111923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f111924d;

    static {
        new C2144a(null);
    }

    public a(lm2.i iVar, lm2.g gVar, lm2.f fVar, rd2.j jVar, d dVar) {
        iVar.getClass();
        gVar.getClass();
        fVar.getClass();
        jVar.getClass();
        dVar.getClass();
        this.f111921a = iVar;
        this.f111922b = gVar;
        this.f111923c = fVar;
        this.f111924d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x013f A[Catch: Exception -> 0x0174, TryCatch #0 {Exception -> 0x0174, blocks: (B:43:0x011d, B:45:0x0127, B:49:0x0143, B:52:0x014a, B:53:0x014e, B:55:0x0154, B:57:0x015e, B:47:0x013f), top: B:67:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x019d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object a(long j8, v13.c cVar) {
        b bVar;
        bm2.d dVar;
        Integer numI;
        Collection collection;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f111927c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f111927c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object objP = bVar2.f111925a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f111927c;
        if (i15 == 0) {
            r.b(objP);
            sd2.f fVarI = rd2.j.i(j8, null);
            if (fVarI == null) {
                String strE = org.apache.commons.lang3.e.e(j8, "Unable to check SW updates because no device record for unitId: ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "CheckDeviceFirmwareUpdateUseCase", strE);
                int i16 = q.f128596b;
                return new q.b(new Exception(org.apache.commons.lang3.e.e(j8, "No device record for unitId: ")));
            }
            String strD0 = fVarI.d0();
            if (strD0 == null && (strD0 = fVarI.Q()) == null) {
                String strE2 = org.apache.commons.lang3.e.e(j8, "Unable to check SW updates because no MAC address for unitId: ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "CheckDeviceFirmwareUpdateUseCase", strE2);
                int i17 = q.f128596b;
                return new q.b(new Exception(org.apache.commons.lang3.e.e(j8, "No MAC address for unitId: ")));
            }
            String str = strD0;
            DeviceProfile deviceProfileH = ((fm2.c) this.f111922b).h(str);
            if (deviceProfileH != null) {
                dVar = new bm2.d(deviceProfileH);
            } else {
                String productNumber = fVarI.getProductNumber();
                productNumber.getClass();
                Integer numI2 = t.i(productNumber);
                int iIntValue = 0;
                int iIntValue2 = numI2 != null ? numI2.intValue() : 0;
                String productDisplayName = fVarI.getProductDisplayName();
                String softwareVersion = fVarI.getSoftwareVersion();
                if (softwareVersion != null && (numI = t.i(softwareVersion)) != null) {
                    iIntValue = numI.intValue();
                }
                dVar = new bm2.d(j8, iIntValue2, str, productDisplayName, iIntValue, 1, new Configuration());
            }
            byte[] bArr = this.f111923c.f(dVar).f128594a;
            if (bArr == null) {
                String strD = n23.j.d(j8, "Unable to check SW updates because no saved XML for ", str, "/");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "CheckDeviceFirmwareUpdateUseCase", strD);
                int i18 = q.f128596b;
                return new q.b(new Exception("No saved XML for device"));
            }
            bVar2.f111927c = 1;
            o53.k kVar = new o53.k(u13.f.b(bVar2), 1);
            kVar.q();
            d dVar2 = this.f111924d;
            int f172495c = dVar.getF172495c();
            int f172497e = dVar.getF172497e();
            try {
                String strE3 = dVar2.f111931a.e("viable_firmware_version");
                if (strE3 != null) {
                    n63.b.a aVar5 = n63.b.f123892d;
                    aVar5.getClass();
                    collection = (List) aVar5.c(new m63.e(mc0.b.INSTANCE.serializer()), strE3);
                    if (collection == null) {
                        collection = j0.f134944a;
                    }
                } else {
                    collection = j0.f134944a;
                }
                if (collection == null || !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            mc0.b bVar3 = (mc0.b) it.next();
                            if (bVar3.f117769a == f172495c && bVar3.f117770b > f172497e) {
                                ((im2.c) this.f111921a).c(new yl2.c(dVar, bArr), new c(str, j8, kVar));
                                break;
                            }
                        }
                    }
                    objP = kVar.p();
                    u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
                    if (objP == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception unused) {
            }
            String strF = e0.f(dVar.getF172497e(), "Device software version: ", " not available");
            i2.a aVar7 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar7.getClass();
            i2.a.p(a2Var4, "CheckDeviceFirmwareUpdateUseCase", strF);
            int i19 = q.f128596b;
            kVar.resumeWith(q.a(Boolean.FALSE));
            objP = kVar.p();
            u13.a aVar8 = u13.a.COROUTINE_SUSPENDED;
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objP);
        }
        return ((q) objP).f128597a;
    }

    /* JADX INFO: renamed from: lc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2144a {
        public /* synthetic */ C2144a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2144a() {
        }
    }
}

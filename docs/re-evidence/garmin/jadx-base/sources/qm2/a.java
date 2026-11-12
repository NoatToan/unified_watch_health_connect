package qm2;

import android.content.Context;
import bd0.c0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.device.pairing.PairingException;
import d53.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sm2.r;
import sm2.v;
import sm2.y;
import sm2.z;

/* JADX INFO: loaded from: classes11.dex */
public class a implements lm2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yl2.d f145643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f145644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p90.e.a f145645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p90.e.d f145646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lm2.f f145647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lm2.i f145648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public om2.e<r> f145649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2744a f145650i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zl2.b f145652k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f145651j = new AtomicBoolean();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f145653l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f145642a = LoggerFactory.getLogger("PAIR#BleSetupStrategy");

    /* JADX INFO: renamed from: qm2.a$a, reason: collision with other inner class name */
    public class C2744a implements om2.a {
        public C2744a() {
        }

        @Override // om2.a
        public final void onFailure(Exception exc) {
            PairingException pairingException;
            int i14;
            a aVar = a.this;
            aVar.getClass();
            Logger logger = aVar.f145642a;
            ((fm2.c) lm2.h.c()).m(aVar);
            boolean z14 = exc instanceof PairingException;
            if (z14) {
                pairingException = (PairingException) exc;
                int i15 = b.f145655a[pairingException.getPairingFailure().ordinal()];
                if (i15 == 1 || i15 == 2) {
                    logger.warn("***** BLE PAIRING CANCEL ***** " + aVar.f145643b.getF197656b());
                    logger.debug("  >> .onCancelFlow() - sending milestone PAIRING CANCELED to device.");
                    lm2.g gVarC = lm2.h.c();
                    String f197656b = aVar.f145643b.getF197656b();
                    yl2.e eVar = yl2.e.ABORTED;
                    f197656b.getClass();
                    ((fm2.c) gVarC).p(da2.j.FINISHED_WITH_FAILURE, f197656b, eVar, null);
                    logger.debug("  >> .onCancelFlow() - calling disconnect device, asking GDI to forget the invitation.");
                    r.g(aVar.f145643b, aVar.f145645d);
                    aVar.a();
                } else if (i15 != 3) {
                    logger.error("***** BLE PAIRING FAILURE ***** " + aVar.f145643b.getF197656b(), (Throwable) pairingException);
                    lm2.g gVarC2 = lm2.h.c();
                    String f197656b2 = aVar.f145643b.getF197656b();
                    yl2.e pairingFailure = pairingException.getPairingFailure();
                    String failureCode = pairingException.getFailureCode();
                    f197656b2.getClass();
                    ((fm2.c) gVarC2).p(da2.j.FINISHED_WITH_FAILURE, f197656b2, pairingFailure, failureCode);
                    if (pairingException.isConnectionError(aVar.f145643b.f197842d)) {
                        r.g(aVar.f145643b, null);
                    }
                } else {
                    aVar.f145646e.C(pairingException);
                }
            } else {
                logger.error("***** BLE PAIRING FAILURE ***** " + aVar.f145643b.getF197656b(), (Throwable) exc);
                pairingException = new PairingException(yl2.e.OTHER_FATAL, exc.getMessage());
            }
            if (aVar.f145652k != null) {
                yl2.d dVar = aVar.f145643b;
                bm2.f fVar = dVar.f197840b;
                if (fVar != null) {
                    fVar.b(dVar.getF197655a());
                }
                zl2.b bVar = aVar.f145652k;
                yl2.d dVar2 = aVar.f145643b;
                ((yb2.b.a) bVar).a(dVar2.f197840b, dVar2.f197842d, pairingException);
            }
            if (!z14 || ((PairingException) exc).getPairingFailure() != yl2.e.DISCONNECTION || (i14 = aVar.f145653l) >= 1) {
                aVar.f145653l = 0;
                aVar.f145646e.C(pairingException);
                return;
            }
            aVar.f145653l = i14 + 1;
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            logger.warn("***** BLE PAIRING AUTO-RESTART ***** " + aVar.f145643b.getF197656b());
            aVar.f();
        }

        @Override // om2.a
        public final void onSuccess() {
            a aVar = a.this;
            AtomicBoolean atomicBoolean = aVar.f145651j;
            Logger logger = aVar.f145642a;
            atomicBoolean.set(true);
            ((fm2.c) lm2.h.c()).m(aVar);
            if (aVar.f145645d == null) {
                logger.debug(".onCompleteFlow() -- sending milestone PAIRING FINISHED SUCCESS to device.");
                lm2.g gVarC = lm2.h.c();
                String f197656b = aVar.f145643b.getF197656b();
                f197656b.getClass();
                ((fm2.c) gVarC).p(da2.j.FINISHED_WITH_SUCCESS, f197656b, null, null);
            }
            Context context = ((c0) lm2.h.d()).f17547a;
            long f197655a = aVar.f145643b.getF197655a();
            String strF = aVar.f145643b.f();
            cn2.d dVar = cn2.d.f28092a;
            Integer numI = strF != null ? t.i(strF) : null;
            cn2.d.f28092a.getClass();
            cn2.d.a(context, "com.garmin.device.sharing.management.ACTION_NEW_DEVICE_PAIRED", f197655a, numI);
            logger.info("***** BLE PAIRING SUCCESS ***** " + aVar.f145643b.getF197656b());
            if (aVar.f145652k != null) {
                yl2.d dVar2 = aVar.f145643b;
                bm2.f fVar = dVar2.f197840b;
                if (fVar != null) {
                    fVar.b(dVar2.getF197655a());
                }
                zl2.b bVar = aVar.f145652k;
                yl2.d dVar3 = aVar.f145643b;
                ((yb2.b.a) bVar).a(dVar3.f197840b, dVar3.f197842d, null);
            }
            aVar.f145646e.x(aVar.f145643b.f197839a.f145762d == 2);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145655a;

        static {
            int[] iArr = new int[yl2.e.values().length];
            f145655a = iArr;
            try {
                iArr[yl2.e.ABORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f145655a[yl2.e.INVALID_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f145655a[yl2.e.HTTP_CONFLICT_409.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a() {
        boolean z14;
        this.f145646e.F();
        this.f145646e.getClass();
        a2 a2Var = a2.DEVICE_SETUP;
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var, "BleDevicePairUseCase", "cancelRequestReplaceActivityTracker()");
        this.f145646e.getClass();
        aVar.getClass();
        i2.a.b(a2Var, "BleDevicePairUseCase", "cancelRequestDeviceReset()");
        ((fm2.c) lm2.h.c()).m(this);
        om2.e<r> eVar = this.f145649h;
        if (eVar != null) {
            eVar.a();
            om2.e<r> eVar2 = this.f145649h;
            synchronized (eVar2.f132986c) {
                z14 = eVar2.f132992i;
            }
            if (z14) {
                r.g(this.f145643b, this.f145645d);
            }
        }
    }

    public r b() {
        return new sm2.c(this.f145644c, this.f145643b, this.f145645d, this.f145646e);
    }

    public sm2.k c() {
        return new sm2.k(this.f145644c, this.f145643b, this.f145645d, this.f145646e);
    }

    public v d() {
        return new v(this.f145644c, this.f145643b, this.f145645d, this.f145647f, 1);
    }

    public final r e() {
        om2.e<r> eVar = this.f145649h;
        om2.b bVar = null;
        if (eVar == null) {
            return null;
        }
        synchronized (eVar.f132986c) {
            try {
                int i14 = eVar.f132991h;
                if (i14 != Integer.MAX_VALUE) {
                    bVar = (om2.b) eVar.f132987d.get(i14);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return (r) bVar;
    }

    public final void f() {
        boolean z14 = this.f145651j.get();
        Logger logger = this.f145642a;
        if (z14) {
            logger.warn("Attempting to call startDeviceSetup after successful completion");
            return;
        }
        logger.info("***** BLE PAIRING START ***** " + this.f145643b.getF197656b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sm2.o(this.f145644c, this.f145643b, this.f145645d, this.f145646e));
        arrayList.add(new sm2.j(this.f145644c, this.f145643b, this.f145645d, this.f145648g));
        l lVar = this.f145643b.f197839a;
        if (lVar.f145763e == 1 || lVar.f145764f) {
            arrayList.add(b());
        }
        if (this.f145643b.f197839a.f145764f) {
            arrayList.add(c());
        }
        arrayList.add(new sm2.d(this.f145644c, this.f145643b, this.f145645d));
        arrayList.add(d());
        arrayList.addAll(Collections.singletonList(new sm2.t(this.f145644c, this.f145643b, this.f145645d, this.f145647f)));
        yl2.d dVar = this.f145643b;
        if (!dVar.f197839a.f145761c) {
            arrayList.add(new z(this.f145644c, dVar, this.f145645d));
            arrayList.add(new y(this.f145644c, this.f145643b, this.f145645d, this.f145647f));
        }
        yl2.d dVar2 = this.f145643b;
        if (dVar2.f197839a.f145765g != 3) {
            arrayList.add(new sm2.b(this.f145644c, dVar2, this.f145645d));
        }
        yl2.d dVar3 = this.f145643b;
        if (dVar3.f197839a.f145762d == 1) {
            arrayList.add(new sm2.l(this.f145644c, dVar3, this.f145645d, this.f145646e, this.f145647f));
        }
        yl2.d dVar4 = this.f145643b;
        if (dVar4.f197839a.f145761c) {
            arrayList.add(new z(this.f145644c, dVar4, this.f145645d));
            arrayList.add(new y(this.f145644c, this.f145643b, this.f145645d, this.f145647f));
        }
        this.f145649h = new om2.e<>(arrayList, "PAIR#");
        lm2.h.d();
        if (GarminDeviceWakefulService.f33825e) {
            ((fm2.c) lm2.h.c()).a(this);
        }
        C2744a c2744a = new C2744a();
        this.f145650i = c2744a;
        om2.e<r> eVar = this.f145649h;
        ArrayList arrayList2 = eVar.f132987d;
        eVar.f132993j = c2744a;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            eVar.f132989f.submit(new om2.c(eVar, (om2.b) arrayList2.get(i14), i14));
        }
        ((om2.b) arrayList2.get(0)).f132975a.g0(Boolean.TRUE);
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f145642a.debug("onDeviceAuthenticated: " + str);
        Object objE = e();
        if (objE instanceof AuthRegistry.Callback) {
            ((AuthRegistry.Callback) objE).onDeviceAuthenticated(str, bArr, bArr2, bArr3);
        }
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        this.f145642a.debug(bVar.toString());
        Object objE = e();
        if (objE instanceof la2.a) {
            ((la2.a) objE).onDeviceConnected(bVar);
        }
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
        String string = cVar.toString();
        Logger logger = this.f145642a;
        logger.debug(string);
        if (!cVar.a()) {
            Object objE = e();
            if (objE instanceof la2.a) {
                ((la2.a) objE).onDeviceConnectingFailure(cVar);
                return;
            }
            return;
        }
        String string2 = cVar.f111634b.toString();
        logger.debug(".handleConnectingFailureBadBluetoothState()");
        p90.e.a aVar = this.f145645d;
        if (aVar != null) {
            aVar.m(k.CONNECTING_FAILURE_BAD_BLUETOOTH_STATE, yl2.e.BAD_BLUETOOTH, string2);
        }
        a();
        C2744a c2744a = this.f145650i;
        if (c2744a != null) {
            c2744a.onFailure(new PairingException(yl2.e.BAD_BLUETOOTH, string2));
        }
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        this.f145642a.debug(hVar.toString());
        r rVarE = e();
        if (rVarE != null) {
            rVarE.onDeviceDisconnected(hVar);
        }
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onPasskeyRequired(String str, int i14) {
        this.f145642a.debug("onPasskeyRequired: " + str);
        Object objE = e();
        if (objE instanceof AuthRegistry.Callback) {
            ((AuthRegistry.Callback) objE).onPasskeyRequired(str, i14);
        }
    }
}

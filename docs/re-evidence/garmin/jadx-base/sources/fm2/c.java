package fm2;

import al2.l;
import al2.m;
import al2.n;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lm2.g;
import ma2.j;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import ok2.w;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import ue.i0;
import ue.x;
import v13.i;
import vb.h;
import vs2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfm2/c;", "Llm2/g;", "<init>", "()V", "a", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f72120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f72121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72122c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.impl.gdi.PairingGdiAdapter$retrieveGarminDeviceXml$1", f = "PairingGdiAdapter.kt", l = {295}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f72124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sm2.w.b f72125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f72126d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fm2/c$b$a", "Lal2/m;", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements m {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sm2.w.b f72127b;

            public a(sm2.w.b bVar) {
                this.f72127b = bVar;
            }

            @Override // al2.m
            public final void B(n nVar) {
                this.f72127b.a(nVar.f3832d, nVar.f3833e);
            }

            @Override // al2.m
            public final void u(l lVar) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, sm2.w.b bVar, c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f72124b = wVar;
            this.f72125c = bVar;
            this.f72126d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f72124b, this.f72125c, this.f72126d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72123a;
            sm2.w.b bVar = this.f72125c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    w wVar = this.f72124b;
                    a aVar2 = new a(bVar);
                    this.f72123a = 1;
                    obj = wVar.b(false, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar.b((o13.p) obj, null);
            } catch (Exception e4) {
                this.f72126d.f72120a.warn("file-transfer failed to read xml: (" + e4.getMessage() + ")");
                bVar.b(null, e4.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fm2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.impl.gdi.PairingGdiAdapter$sendPairingStateToDevice$1", f = "PairingGdiAdapter.kt", l = {243}, m = "invokeSuspend")
    public static final class C1468c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72128a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f72130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1468c(String str, t13.d<? super C1468c> dVar) {
            super(2, dVar);
            this.f72130c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C1468c(this.f72130c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1468c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ea2.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72128a;
            String str = this.f72130c;
            c cVar = c.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vs2.l lVar = (vs2.l) da2.d.c(cVar.g()).getCapability(str, vs2.l.class);
                    if (lVar != null) {
                        k kVar = k.PAIR_COMPLETE;
                        this.f72128a = 1;
                        obj = lVar.a(kVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    cVar.getClass();
                    str.getClass();
                    aVar = (ea2.a) da2.d.c(cVar.g()).getCapability(str, ea2.a.class);
                    if (aVar != null) {
                        aVar.completeHandshake();
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            } catch (Exception e4) {
                cVar.f72120a.error("Failed to sendPairingComplete", (Throwable) e4);
            }
            cVar.getClass();
            str.getClass();
            aVar = (ea2.a) da2.d.c(cVar.g()).getCapability(str, ea2.a.class);
            if (aVar != null) {
                aVar.completeHandshake();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public c() {
        Logger logger = LoggerFactory.getLogger("PAIR#GdiAdapter");
        logger.getClass();
        this.f72120a = logger;
        this.f72121b = c0.a(t13.g.a.C3052a.d(new a0("PAIR#GdiAdapter"), ge1.b.h()));
        this.f72122c = 2;
    }

    public static da2.a c(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        str.getClass();
        return (bArr == null || bArr2 == null || bArr3 == null) ? new da2.a(str, true) : new da2.a(str, bArr, bArr2, bArr3, true);
    }

    public final void a(lm2.d dVar) {
        dVar.getClass();
        da2.d.c(g()).f58886a.b(dVar);
        AuthRegistry.getInstance().addCallback(dVar);
    }

    public void b(String str, j jVar) {
        str.getClass();
        da2.d.c(g()).f58886a.d(str, jVar);
    }

    public final void d(long j8, String str, boolean z14) {
        List list;
        if (str != null && str.length() != 0) {
            e(str, z14);
            return;
        }
        if (j8 < 0) {
            list = j0.f134944a;
        } else {
            this.f72120a.debug("getMacAddresses: " + j8);
            ArrayList arrayList = new ArrayList();
            for (String str2 : da2.d.c(g()).f58886a.f111646e.b(j8)) {
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(str2);
                }
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((String) it.next(), z14);
        }
    }

    public final void e(String str, boolean z14) {
        str.getClass();
        if (!z14) {
            da2.d.c(g()).f58886a.k(str);
            return;
        }
        this.f72120a.trace("Disconnect device: ".concat(str));
        da2.d.c(g()).f58886a.e(str);
    }

    public final d f(String str) {
        str.getClass();
        da2.a authInfo = AuthRegistry.getInstance().getAuthInfo(str);
        if (authInfo == null || !authInfo.f58874e) {
            return null;
        }
        return new d(authInfo);
    }

    public final Context g() {
        return ((bd0.c0) lm2.h.d()).f17547a;
    }

    public final DeviceProfile h(String str) {
        str.getClass();
        return da2.d.c(g()).a(str);
    }

    public Class<? extends AbstractDeviceConnectionWorker> i() {
        return null;
    }

    public final void j(rs2.c cVar) {
        cVar.getClass();
        String f172493a = cVar.getF92741e();
        f172493a.getClass();
        ea2.a aVar = (ea2.a) da2.d.c(g()).getCapability(f172493a, ea2.a.class);
        if (aVar != null) {
            aVar.completeHandshake();
        }
    }

    public String k(String str) {
        str.getClass();
        yl2.b bVar = (yl2.b) yl2.b.B6.get(str);
        if (bVar != null) {
            return bVar.name();
        }
        return null;
    }

    public final void l(String str) {
        da2.a aVarC = c(str, null, null, null);
        la2.e eVar = da2.d.c(g()).f58886a;
        na2.d dVar = eVar.f111656o;
        if (!eVar.f111657p || dVar == null) {
            return;
        }
        da2.e.a aVar = da2.e.f58888g;
        da2.e eVar2 = eVar.f111659r;
        aVar.getClass();
        dVar.a(aVarC.f58870a, na2.d.b.PAIRING, da2.e.a.a(eVar2, aVarC));
    }

    public final void m(lm2.d dVar) {
        dVar.getClass();
        da2.d.c(g()).f58886a.i(dVar);
        AuthRegistry.getInstance().removeCallback(dVar);
    }

    public final void n(String str, int i14, sm2.k.c cVar) throws RemoteException {
        ma2.a aVar;
        ma2.a.c cVar2;
        str.getClass();
        if (str.length() == 0) {
            throw new RemoteException("Invalid remote device mac address");
        }
        da2.b bVar = da2.d.c(g()).f58886a.f111646e;
        DeviceProfile deviceProfileD = bVar.d(str);
        ea2.a aVar2 = (ea2.a) bVar.getCapability(str, ea2.a.class);
        if (deviceProfileD == null || aVar2 == null) {
            return;
        }
        la2.e eVar = da2.d.c(g()).f58886a;
        eVar.getClass();
        if (eVar.f111658q && (aVar = eVar.f111655n) != null) {
            synchronized (aVar.f117636d) {
                cVar2 = aVar.f117636d.get(str);
            }
            if (cVar2 != null) {
                pj2.j jVar = cVar2.f117648a;
                jVar.f138068b.trace("setAutoReconnect: {}", Boolean.FALSE);
                jVar.f138081o.set(false);
            }
        }
        aVar2.requestFactoryReset(new fm2.a(g(), deviceProfileD, i14, cVar));
    }

    public final void o(String str, sm2.w.b bVar) {
        str.getClass();
        w wVarA = ok2.a0.f132585h.a().a(str);
        if (wVarA != null) {
            ge1.b.T(this.f72121b, null, null, new b(wVarA, bVar, this, null), 3);
            return;
        }
        this.f72120a.debug("file-transfer not configured. Fallback directly to legacy xml read");
        ea2.f fVar = (ea2.f) da2.d.c(g()).getCapability(str, ea2.f.class);
        if (fVar != null) {
            fVar.readGarminDeviceXml(new e(bVar));
        } else {
            bVar.b(null, "Device not connected");
        }
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        str.getClass();
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
        Class<? extends AbstractDeviceConnectionWorker> clsI = i();
        if (clsI == null) {
            return;
        }
        this.f72120a.debug("receive onDeviceAuthenticated: ".concat(str));
        androidx.work.c.a aVar = new androidx.work.c.a();
        int i14 = ue.h.f170065a;
        int length = bArr.length;
        Byte[] bArr4 = new Byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            bArr4[i15] = Byte.valueOf(bArr[i15]);
        }
        LinkedHashMap linkedHashMap = aVar.f11467a;
        linkedHashMap.put("GBLE_DIV_KEY", bArr4);
        int i16 = ue.h.f170065a;
        int length2 = bArr2.length;
        Byte[] bArr5 = new Byte[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            bArr5[i17] = Byte.valueOf(bArr2[i17]);
        }
        linkedHashMap.put("GBLE_RAND_KEY", bArr5);
        int i18 = ue.h.f170065a;
        int length3 = bArr3.length;
        Byte[] bArr6 = new Byte[length3];
        for (int i19 = 0; i19 < length3; i19++) {
            bArr6[i19] = Byte.valueOf(bArr3[i19]);
        }
        linkedHashMap.put("GBLE_LTK_KEY", bArr6);
        Context contextG = g();
        Logger logger = AbstractDeviceConnectionWorker.f50925g;
        if (TextUtils.isEmpty(str)) {
            logger.warn("beginWork called with no device");
            return;
        }
        com.airbnb.lottie.animation.keyframe.a.u("Start worker with action [com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED] for device [", str, "].", logger);
        linkedHashMap.put("DEVICE_MAC_KEY", str);
        linkedHashMap.put("DEVICE_ACTION_KEY", "com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED");
        com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, contextG).a(str, ue.l.REPLACE, new x.a(clsI).f(aVar.a()).e(0L, TimeUnit.MILLISECONDS).a()).a();
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        Class<? extends AbstractDeviceConnectionWorker> clsI = i();
        if (clsI == null) {
            return;
        }
        this.f72120a.debug("receive onDeviceConnected: " + bVar);
        AbstractDeviceConnectionWorker.d(bVar.f111632a, "com.garmin.android.gdi.ACTION_DEVICE_HANDSHAKE_COMPLETED", clsI, g(), null);
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        Class<? extends AbstractDeviceConnectionWorker> clsI = i();
        if (clsI == null) {
            return;
        }
        this.f72120a.debug("receive onDeviceDisconnected: " + hVar);
        androidx.work.c.a aVar = new androidx.work.c.a();
        aVar.f11467a.put("GATT_STATUS_KEY", Integer.valueOf(hVar.f111674b));
        AbstractDeviceConnectionWorker.d(hVar.f111673a, "com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED", clsI, g(), aVar);
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onPasskeyRequired(String str, int i14) {
        str.getClass();
    }

    public void p(da2.j jVar, String str, yl2.e eVar, String str2) {
        jVar.getClass();
        str.getClass();
        q(jVar, str);
    }

    public final void q(da2.j jVar, String str) {
        jVar.getClass();
        str.getClass();
        w wVarA = ok2.a0.f132585h.a().a(str);
        if (wVarA != null && wVarA.l() && jVar == da2.j.FINISHED_WITH_SUCCESS) {
            ge1.b.T(this.f72121b, null, null, new C1468c(str, null), 3);
        } else {
            ea2.a aVar = (ea2.a) da2.d.c(g()).getCapability(str, ea2.a.class);
            if (aVar != null) {
                aVar.setPairingState(jVar);
            }
        }
    }

    public final void r(String str) {
        da2.a aVarC = c(str, null, null, null);
        this.f72120a.debug("startPersistentBtcConnection: " + aVarC);
        la2.e eVar = da2.d.c(g()).f58886a;
        na2.d dVar = eVar.f111656o;
        if (!eVar.f111657p || dVar == null) {
            return;
        }
        da2.e.a aVar = da2.e.f58888g;
        da2.e eVar2 = eVar.f111659r;
        aVar.getClass();
        dVar.a(aVarC.f58870a, na2.d.b.PERSISTENT, da2.e.a.a(eVar2, aVarC));
    }

    public final void s(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        str.getClass();
        da2.a aVarC = c(str, bArr, bArr2, bArr3);
        this.f72120a.debug("startPersistentConnection: " + aVarC);
        da2.d.c(g()).f58886a.m(aVarC);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfm2/c$a;", "", "<init>", "()V", "", "REMOTE_SERVICE_DEAD", "I", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

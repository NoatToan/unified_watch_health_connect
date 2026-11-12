package ch2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.connectiq.z0;
import com.garmin.android.gfdi.framework.BaseServiceSubscriber;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.android.gfdi.framework.PacketQueue;
import dh2.i;
import dh2.j;
import dh2.k;
import dh2.l;
import dh2.m;
import dh2.n;
import dh2.o;
import dh2.p;
import dh2.r;
import dh2.s;
import dh2.t;
import dh2.u;
import dh2.v;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes11.dex */
public class h extends BaseServiceSubscriber implements ea2.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static z0.b f27575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static g f27576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final CopyOnWriteArraySet<String> f27577k = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f27578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ch2.a f27579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f27580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f27581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dh2.f f27582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UUID f27583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f27584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UUID f27585h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27586a;

        static {
            int[] iArr = new int[e.b.values().length];
            f27586a = iArr;
            try {
                iArr[e.b.SUCCESS_ACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27586a[e.b.INVALID_SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27586a[e.b.CRC_MISMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27586a[e.b.TRANSFER_NOT_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27586a[e.b.INVALID_CONNECTION_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27586a[e.b.OUT_OF_MEMORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27586a[e.b.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        NOT_PAIRED,
        NOT_CONNECTED,
        CONNECTED,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public h(Context context, UUID uuid, UUID uuid2, UUID uuid3) {
        super(context);
        String str = "CIQ#MonkeybrainsSubscriber@" + hashCode();
        int i14 = gt2.c.f79010a;
        this.f27578a = gt2.b.f79005a.i(str);
        this.f27582e = null;
        this.f27583f = uuid;
        this.f27584g = uuid2;
        this.f27585h = uuid3;
        synchronized (h.class) {
            try {
                if (f27576j == null) {
                    f27576j = new g();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.garmin.android.gdi.ACTION_DEVICE_HANDSHAKE_COMPLETED");
                    intentFilter.addAction("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED");
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(f27576j, intentFilter, 2);
                    } else {
                        context.registerReceiver(f27576j, intentFilter);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void e(Context context) {
        ma2.b bVarA = ma2.b.a();
        UUID uuid = ma2.h.f117683k;
        h hVar = new h(context, uuid, ma2.h.f117685m, ma2.h.f117684l);
        bVarA.getClass();
        ma2.g.b(uuid, new ma2.b.C2232b(hVar, uuid));
        UUID uuid2 = ma2.h.f117686n;
        ma2.g.b(uuid2, new ma2.b.C2232b(new h(context, uuid2, ma2.h.f117679g, ma2.h.f117678f), uuid2));
    }

    @Override // ea2.d
    public final void a(int i14, byte[] bArr, boolean z14) {
        if (i14 < 0 || i14 > 15) {
            return;
        }
        f fVar = this.f27581d;
        if (fVar == null) {
            this.f27578a.error("Cannot send message because outbound handler is null");
            return;
        }
        f.b bVar = new f.b(fVar, null);
        bVar.f27556a = i14;
        byte[] bArr2 = new byte[bArr.length];
        bVar.f27557b = bArr2;
        bVar.f27565j = z14;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        fVar.f27551b.add(bVar);
        fVar.f27550a.add(bVar);
    }

    @Override // ea2.d
    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        t tVar = new t();
        byte[] bArrD = v.d(str);
        if (bArrD.length != 16) {
            vb.h.s("Application Ids must be 16 bytes in length");
        } else {
            System.arraycopy(bArrD, 0, tVar.f59673a, 2, 16);
            f(tVar);
        }
    }

    @Override // ea2.d
    public final void c(int i14) {
        if (i14 < 0 || i14 > 15) {
            return;
        }
        dh2.c cVar = new dh2.c();
        cVar.f59673a[2] = (byte) i14;
        f(cVar);
    }

    @Override // com.garmin.android.gfdi.framework.BaseServiceSubscriber, ma2.e
    public final ma2.c create(Context context) {
        return new h(context, this.f27583f, this.f27584g, this.f27585h);
    }

    @Override // ea2.d
    public final void d(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        r rVar = new r();
        byte[] bArrD = v.d(str);
        if (bArrD.length != 16) {
            vb.h.s("Application Ids must be 16 bytes in length");
        } else {
            System.arraycopy(bArrD, 0, rVar.f59673a, 2, 16);
            f(rVar);
        }
    }

    public final void f(dh2.e eVar) {
        byte[] bArr = eVar.f59673a;
        if (this.transferQueue != null) {
            this.f27578a.debug("sendCommandMessage: " + ft2.b.a(bArr));
            this.transferQueue.enqueuePacket(this.f27583f, this.f27585h, bArr);
        }
    }

    public final void g(l lVar) {
        if (this.transferQueue != null) {
            this.f27578a.debug("sendDataTransferMessage: " + ft2.b.a(lVar.b()));
            this.transferQueue.enqueuePacket(this.f27583f, this.f27585h, lVar.b());
        }
    }

    @Override // ea2.d
    public final void getApplicationInfo(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        dh2.a aVar = new dh2.a();
        byte[] bArrD = v.d(str);
        if (bArrD.length != 16) {
            vb.h.s("Application Ids must be 16 bytes in length");
        } else {
            System.arraycopy(bArrD, 0, aVar.f59673a, 2, 16);
            f(aVar);
        }
    }

    @Override // com.garmin.android.gfdi.framework.BaseServiceSubscriber
    public final String getTag() {
        return "CIQ#MonkeybrainsSubscriber";
    }

    public final void h(int i14, int i15) {
        if (i14 < 0 || i14 > 15) {
            return;
        }
        o oVar = new o();
        byte[] bArr = oVar.f59673a;
        bArr[3] = (byte) i14;
        bArr[2] = (byte) (i15 != 1 ? o.a.SUCCESS : o.a.INVALID_CONNECTION_ID).f59663a;
        f(oVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.garmin.android.gfdi.framework.BaseServiceSubscriber
    public final void handleMessage(UUID uuid, byte[] bArr) {
        l mVar;
        e.a aVarF;
        e.a aVar;
        f.b next;
        if (bArr.length == 0) {
            this.f27578a.debug("Not handling zero length message");
            return;
        }
        byte b14 = bArr[0];
        dh2.f fVar = null;
        uVar = null;
        dh2.e uVar = null;
        String str = null;
        if (b14 == 0) {
            ch2.a aVar2 = this.f27579b;
            if (bArr.length >= 2) {
                switch (bArr[1]) {
                    case 1:
                        uVar = new u(bArr);
                        break;
                    case 2:
                        uVar = new dh2.d(bArr);
                        break;
                    case 3:
                        uVar = new p(bArr);
                        break;
                    case 4:
                        uVar = new n(bArr);
                        break;
                    case 5:
                        uVar = new dh2.b(bArr);
                        break;
                    case 6:
                        uVar = new s(bArr);
                        break;
                }
            }
            aVar2.getClass();
            Logger logger = ch2.a.f27516b;
            logger.debug("Handling command message");
            try {
                switch (uVar.e()) {
                    case 1:
                        aVar2.h((u) uVar);
                        break;
                    case 2:
                        aVar2.d((dh2.d) uVar);
                        break;
                    case 3:
                        aVar2.f((p) uVar);
                        break;
                    case 4:
                        aVar2.e((n) uVar);
                        break;
                    case 5:
                        aVar2.c((dh2.b) uVar);
                        break;
                    case 6:
                        aVar2.g((s) uVar);
                        break;
                    default:
                        logger.debug("Not handling unknown command message");
                        break;
                }
                return;
            } catch (ClassCastException e4) {
                logger.error("ClassCastException handling command message", (Throwable) e4);
                return;
            }
        }
        if (((b14 & 240) >> 4) == 15) {
            byte b15 = bArr[1];
            if (b15 == 0) {
                mVar = new j(bArr);
            } else if (b15 == 1) {
                mVar = new k(bArr);
            } else if (b15 == 2) {
                mVar = new dh2.f(bArr);
            } else if (b15 != 3) {
                mVar = b15 != 6 ? null : new i(bArr);
            } else {
                mVar = new dh2.g(bArr);
            }
        } else {
            mVar = new m(bArr);
        }
        if (!(mVar instanceof dh2.f)) {
            c cVar = this.f27580c;
            synchronized (cVar) {
                try {
                    if (mVar == null) {
                        aVarF = new e.a(cVar, e.b.CRC_MISMATCH, dh2.f.a.DATA_TRANSMISSION, 0);
                    } else if (mVar.f() == 15) {
                        byte b16 = mVar.f59673a[1];
                        if (b16 == 0) {
                            aVarF = cVar.d((j) mVar);
                        } else if (b16 != 1) {
                            if (b16 == 2) {
                                aVar = new e.a(cVar, e.b.SUCCESS, dh2.f.a.ACK_REQUEST_RESPONSE, mVar.e());
                            } else if (b16 == 3) {
                                aVarF = cVar.b((dh2.g) mVar);
                            } else if (b16 != 6) {
                                aVar = new e.a(cVar, e.b.SUCCESS, dh2.f.a.DATA_TRANSMISSION, mVar.e());
                            } else {
                                aVarF = cVar.c((i) mVar);
                            }
                            aVarF = aVar;
                        } else {
                            aVarF = cVar.e((k) mVar);
                        }
                    } else {
                        aVarF = cVar.f((m) mVar);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            e.b bVar = aVarF.f27536a;
            if (bVar != e.b.SUCCESS) {
                UUID uuid2 = this.f27585h;
                UUID uuid3 = this.f27583f;
                Logger logger2 = this.f27578a;
                dh2.f.a aVar3 = aVarF.f27537b;
                dh2.f.a aVar4 = dh2.f.a.ACK_REQUEST_RESPONSE;
                if (aVar3 == aVar4) {
                    dh2.f fVar2 = this.f27582e;
                    if (fVar2 != null) {
                        dh2.f fVar3 = new dh2.f(fVar2.f59673a);
                        fVar3.f59673a[2] = (byte) aVar4.f59649a;
                        logger2.debug("sendAckResponse: " + ft2.b.a(fVar3.f59673a));
                        PacketQueue packetQueue = this.transferQueue;
                        if (packetQueue != null) {
                            packetQueue.enqueuePacket(uuid3, uuid2, fVar3.f59673a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                switch (a.f27586a[bVar.ordinal()]) {
                    case 1:
                        fVar = new dh2.f(dh2.f.b.SUCCESS);
                        break;
                    case 2:
                        fVar = new dh2.f(dh2.f.b.RESEND_FROM_SEQ);
                        break;
                    case 3:
                        fVar = new dh2.f(dh2.f.b.CRC_MISMATCH);
                        break;
                    case 4:
                        fVar = new dh2.f(dh2.f.b.TRANSFER_NOT_STARTED);
                        break;
                    case 5:
                        fVar = new dh2.f(dh2.f.b.INVALID_CONNECTION_ID);
                        break;
                    case 6:
                        fVar = new dh2.f(dh2.f.b.OUT_OF_MEMORY);
                        break;
                }
                if (fVar != null) {
                    byte[] bArr2 = fVar.f59673a;
                    fVar.g(aVarF.f27538c);
                    bArr2[4] = (byte) aVarF.f27539d;
                    fVar.f59673a[2] = (byte) aVarF.f27537b.f59649a;
                    logger2.debug("sendAck: " + ft2.b.a(bArr2));
                    PacketQueue packetQueue2 = this.transferQueue;
                    if (packetQueue2 != null) {
                        packetQueue2.enqueuePacket(uuid3, uuid2, bArr2);
                    }
                    this.f27582e = fVar;
                    return;
                }
                return;
            }
            return;
        }
        f fVar4 = this.f27581d;
        dh2.f fVar5 = (dh2.f) mVar;
        synchronized (fVar4.f27551b) {
            try {
                Iterator<f.b> it = fVar4.f27551b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.f27556a == fVar5.e() && next.f27560e) {
                        break;
                    }
                }
                if (next != null) {
                    if (fVar5.j() != dh2.f.a.ACK_REQUEST_RESPONSE || next.f27561f) {
                        f.f27549e.debug("Handling ACK with error code: " + fVar5.k().name());
                        switch (f.a.f27555b[fVar5.k().ordinal()]) {
                            case 1:
                                fVar4.f27551b.remove(next);
                                fVar4.b(fVar5.e(), fVar5.k().f59657a);
                                break;
                            case 2:
                                fVar4.f27551b.remove(next);
                                fVar4.b(fVar5.e(), fVar5.k().f59657a);
                                break;
                            case 3:
                                fVar4.f27551b.remove(next);
                                fVar4.b(fVar5.e(), fVar5.k().f59657a);
                                break;
                            case 4:
                                int iF = fVar5.f();
                                ch2.b.C0419b c0419bC = ch2.b.b().c(next.f27556a, fVar4.a());
                                int i14 = (c0419bC == null ? false : c0419bC.f27527h ? 191 : 19) * iF;
                                if (i14 >= next.f27557b.length) {
                                    fVar4.f27551b.remove(next);
                                    fVar4.b(fVar5.e(), fVar5.k().f59657a);
                                } else {
                                    next.f27558c = i14;
                                    next.f27560e = false;
                                    next.f27561f = false;
                                }
                                break;
                            case 5:
                                int i15 = f.a.f27554a[fVar5.j().ordinal()];
                                if (i15 != 1) {
                                    if (i15 != 3) {
                                        if (i15 == 6 && next.f27559d == f.d.KEY_EXCHANGED) {
                                            next.f27559d = f.d.INITIATE;
                                        }
                                    } else if (next.f27559d == f.d.TRANSFERRING) {
                                        next.f27559d = f.d.TRANSFER_COMPLETE;
                                        fVar4.f27551b.remove(next);
                                        int iE = fVar5.e();
                                        try {
                                            if (f27575i != null) {
                                                long jA = fVar4.a();
                                                z0.b bVar2 = f27575i;
                                                if (ch2.b.b().d(jA, iE, true)) {
                                                    ch2.b.C0419b c0419bC2 = ch2.b.b().c(iE, jA);
                                                    str = c0419bC2 == null ? "" : c0419bC2.f27520a;
                                                }
                                                z0.this.k(0, str, jA);
                                            }
                                            break;
                                        } catch (Exception unused) {
                                        }
                                    }
                                } else if (next.f27559d == f.d.INITIATED) {
                                    next.f27559d = f.d.TRANSFERRING;
                                }
                                next.f27560e = false;
                                next.f27561f = false;
                                break;
                            case 6:
                                fVar4.f27551b.remove(next);
                                fVar4.b(fVar5.e(), fVar5.k().f59657a);
                                break;
                            default:
                                fVar4.f27551b.remove(next);
                                fVar4.b(fVar5.e(), fVar5.k().f59657a);
                                break;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.garmin.android.gfdi.framework.BaseServiceSubscriber, ma2.c
    public final void onBleServicesDiscovered(da2.k kVar, UUID uuid, UUID[] uuidArr) {
        String str = kVar.f58911a;
        da2.l lVarF = getRegistry().f(str);
        da2.l lVar = lVarF;
        if (lVarF == null) {
            Logger logger = this.f27578a;
            logger.trace("Creating a remote device proxy for " + str);
            DeviceManager deviceManager = new DeviceManager(str, 1);
            logger.trace("Registering the remote device proxy for " + str);
            getRegistry().g(str, deviceManager);
            lVar = deviceManager;
        }
        if (lVar instanceof DeviceManager) {
            ((DeviceManager) lVar).setGenericCapability(ea2.d.class, this);
            setRemoteDeviceProxy(lVar);
            enableReadCharacteristicNotification(str, this.f27583f, this.f27584g);
        }
        f27577k.add(str);
        this.f27579b = new ch2.a(this);
        this.f27580c = new c(this);
        this.f27581d = new f(this);
    }

    @Override // com.garmin.android.gfdi.framework.BaseServiceSubscriber, ma2.c
    public final void onRemoteDeviceDisconnected(String str) {
        super.onRemoteDeviceDisconnected(str);
        this.f27579b = null;
        this.f27580c = null;
        f fVar = this.f27581d;
        if (fVar != null) {
            fVar.f27552c = true;
            this.f27581d = null;
        }
    }
}

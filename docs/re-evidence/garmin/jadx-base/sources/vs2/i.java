package vs2;

import com.garmin.gfdi.GfdiException;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.google.common.primitives.UnsignedBytes;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;
import p13.u;
import r1.q2;
import rs2.v;
import rs2.w;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvs2/i;", "Lrs2/h;", "Lrs2/w;", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements rs2.h, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f179951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public us2.f f179952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f179953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dt2.d f179954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<e> f179955f = new AtomicReference<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u53.d f179956g = q2.l("SyncMessageManager");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<Set<Integer>> f179957h = new AtomicReference<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f179958i = new AtomicBoolean(true);

    public static LinkedHashSet a(int i14, int i15, byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = bArr[i16 + i14] & UnsignedBytes.MAX_VALUE;
            for (int i18 = 0; i18 < 8; i18++) {
                if (((1 << i18) & i17) != 0) {
                    linkedHashSet.add(Integer.valueOf((i16 * 8) + i18));
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(v13.c cVar) throws GfdiException {
        g gVar;
        GDICore.SyncRequest.Builder builderNewBuilder;
        GDICore.SyncResponse syncResponse;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f179947c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f179947c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objB = gVar.f179945a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f179947c;
        try {
            if (i15 == 0) {
                r.b(objB);
                us2.f fVar = this.f179952c;
                if (fVar == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                if (!fVar.f172500h.contains(new Integer(5))) {
                    us2.f fVar2 = this.f179952c;
                    if (fVar2 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    if (fVar2.f172500h.contains(new Integer(90))) {
                        Logger logger = this.f179951b;
                        if (logger != null) {
                            logger.warn("requestSync not applicable to Sync 2 device");
                            return GDICore.SyncResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS;
                        }
                        s.m("logger");
                        throw null;
                    }
                    us2.f fVar3 = this.f179952c;
                    if (fVar3 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    if (fVar3.f172503k.contains(new Integer(4))) {
                        ft2.d.b(this.f179956g, new h(this, k.HOST_DID_ENTER_FOREGROUND, null));
                    } else {
                        if (!this.f179958i.compareAndSet(true, false)) {
                            return GDICore.SyncResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS;
                        }
                        e();
                    }
                    return GDICore.SyncResponse.ResponseStatus.OK;
                }
                try {
                    builderNewBuilder = GDICore.SyncRequest.newBuilder().setUseThisConnection(false);
                } catch (Throwable th3) {
                    Logger logger2 = this.f179951b;
                    if (logger2 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger2.warn("Failed to set UseThisConnection property on Sync request : " + th3.getMessage());
                    builderNewBuilder = GDICore.SyncRequest.newBuilder();
                }
                GDISmartProto.Smart smartA = pu2.a.a(GDICore.CoreService.newBuilder().setSyncRequest(builderNewBuilder));
                smartA.getClass();
                dt2.d dVar = this.f179954e;
                if (dVar == null) {
                    s.m("protobufMessenger");
                    throw null;
                }
                gVar.f179947c = 1;
                objB = dVar.b(smartA, gVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            GDICore.CoreService coreServiceB = pu2.a.b((GDISmartProto.Smart) objB);
            GDICore.SyncResponse.ResponseStatus status = (coreServiceB == null || !coreServiceB.hasSyncResponse() || (syncResponse = coreServiceB.getSyncResponse()) == null || !syncResponse.hasStatus()) ? null : syncResponse.getStatus();
            if (status != null) {
                return status;
            }
            throw new GfdiException("Device did not return a status", null, 2, null);
        } catch (ProtobufException e4) {
            throw new GfdiException("Failed to send sync now request", e4);
        }
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        this.f179955f.set(null);
        c0.d(this.f179956g, "SyncMessageManager closed");
    }

    public final void e() {
        us2.f fVar = this.f179952c;
        if (fVar == null) {
            s.m("deviceInfo");
            throw null;
        }
        int i14 = fVar.f172495c;
        AtomicReference<Set<Integer>> atomicReference = this.f179957h;
        if ((i14 == 3307 || i14 == 3192) && atomicReference.get() == null) {
            atomicReference.set(l0.f134950a);
        }
        Set<Integer> set = atomicReference.get();
        if (set != null) {
            us2.f fVar2 = this.f179952c;
            if (fVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            if (!fVar2.f172503k.contains(4)) {
                ft2.d.b(this.f179956g, new f(this, j.VISIBLE_AS_NEEDED, set, null, null));
            }
        }
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        j jVar;
        bArr.getClass();
        AtomicReference<Set<Integer>> atomicReference = this.f179957h;
        u53.d dVar = this.f179956g;
        if (i14 == 5009) {
            if (bArr.length < 16) {
                Logger logger = this.f179951b;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.warn("Invalid file ready payload");
                ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
                return;
            }
            int iK = jg.b.K(0, bArr);
            int i15 = bArr[2] & UnsignedBytes.MAX_VALUE;
            byte[] bArrK = p13.s.k(3, 6, bArr);
            byte b14 = bArr[6];
            com.garmin.gfdi.file.e.a aVar = com.garmin.gfdi.file.e.f52394b;
            int i16 = bArr[7] & UnsignedBytes.MAX_VALUE;
            aVar.getClass();
            ws2.c cVar = new ws2.c(iK, i15, bArrK, com.garmin.gfdi.file.e.a.a(i16), (int) jg.b.L(8, bArr), jg.b.L(12, bArr), null);
            ft2.d.a(xVar, dVar, y.ACK, new byte[0]);
            Set<Integer> set = atomicReference.get();
            if (set == null) {
                set = l0.f134950a;
            }
            ft2.d.b(dVar, new f(this, j.MANUAL, set, cVar, null));
            return;
        }
        if (i14 == 5027) {
            Byte bF = u.F(bArr);
            byte bByteValue = bF != null ? bF.byteValue() : (byte) -1;
            if (bByteValue == -1 || bArr.length < bByteValue + 1) {
                Logger logger2 = this.f179951b;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.warn("Invalid queued download payload");
                ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
                return;
            }
            ft2.d.a(xVar, dVar, y.ACK, new byte[]{0});
            atomicReference.set(a(1, bArr[0] & UnsignedBytes.MAX_VALUE, bArr));
            Set<Integer> set2 = atomicReference.get();
            if (set2 == null) {
                return;
            }
            ft2.d.b(dVar, new f(this, j.VISIBLE_AS_NEEDED, set2, null, null));
            return;
        }
        if (i14 != 5037) {
            Logger logger3 = this.f179951b;
            if (logger3 == null) {
                s.m("logger");
                throw null;
            }
            logger3.error("Invalid message type: " + i14);
            return;
        }
        if (bArr.length < 2 || bArr.length < (bArr[1] & UnsignedBytes.MAX_VALUE) + 2) {
            Logger logger4 = this.f179951b;
            if (logger4 == null) {
                s.m("logger");
                throw null;
            }
            logger4.warn("Invalid sync request payload");
            ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
            return;
        }
        int i17 = bArr[0] & UnsignedBytes.MAX_VALUE;
        if (i17 == 0) {
            jVar = j.MANUAL;
        } else if (i17 == 1) {
            jVar = j.INVISIBLE;
        } else if (i17 != 2) {
            Logger logger5 = this.f179951b;
            if (logger5 == null) {
                s.m("logger");
                throw null;
            }
            logger5.warn("Unknown sync option: " + i17);
            jVar = j.VISIBLE_AS_NEEDED;
        } else {
            jVar = j.VISIBLE_AS_NEEDED;
        }
        LinkedHashSet linkedHashSetA = a(2, bArr[1] & UnsignedBytes.MAX_VALUE, bArr);
        ft2.d.a(xVar, dVar, y.ACK, new byte[0]);
        ft2.d.b(dVar, new f(this, jVar, linkedHashSetA, null, null));
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        if (!(cVar instanceof us2.f)) {
            vb.h.z("Expected GfdiDeviceInfo");
            return;
        }
        rs2.d dVar = rs2.d.f154380a;
        us2.f fVar = (us2.f) cVar;
        String str = fVar.f172493a;
        dVar.getClass();
        this.f179951b = LoggerFactory.getLogger(rs2.d.a("SyncMessageManager", -1L, this, str));
        this.f179952c = fVar;
        this.f179953d = vVar;
        us2.b bVar = (us2.b) vVar;
        bVar.d(5009, this);
        bVar.d(5027, this);
        bVar.d(5037, this);
        byte[] bArr = fVar.f172505m;
        if (bArr != null) {
            this.f179957h.set(a(1, bArr[0] & UnsignedBytes.MAX_VALUE, bArr));
        }
    }
}

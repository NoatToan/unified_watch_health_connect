package com.garmin.gfdi.file;

import androidx.media3.common.PlaybackException;
import com.garmin.gfdi.ResponseStatusException;
import com.google.common.primitives.UnsignedBytes;
import e23.p;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o13.r;
import o53.c0;
import o53.f0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.l0;
import p13.u;
import r1.q2;
import rs2.h;
import rs2.v;
import rs2.w;
import rs2.x;
import rs2.y;
import ws2.f;
import ws2.g;
import ws2.i;
import ws2.j;
import ws2.k;
import ys2.o;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/gfdi/file/a;", "Lrs2/h;", "Lrs2/w;", "<init>", "()V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements h, w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52360l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f52361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f52362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rs2.c f52363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52364e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f52368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xs2.c f52369j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u53.d f52365f = q2.l("FileManager");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f52366g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft2.c f52367h = new ft2.c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList<ws2.a> f52370k = new CopyOnWriteArrayList<>();

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52371a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.NAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.UNKNOWN_OR_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52371a = iArr;
        }
    }

    static {
        new C1115a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ws2.b bVar, v13.c cVar) throws FileException {
        ws2.d dVar;
        if (cVar instanceof ws2.d) {
            dVar = (ws2.d) cVar;
            int i14 = dVar.f186973d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f186973d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new ws2.d(this, cVar);
            }
        } else {
            dVar = new ws2.d(this, cVar);
        }
        Object objB = dVar.f186971b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f186973d;
        try {
            if (i15 == 0) {
                r.b(objB);
                v vVar = this.f52362c;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                byte[] bArr = {bVar.f186962a};
                dVar.f186970a = bVar;
                dVar.f186973d = 1;
                objB = vVar.b(5007, bArr, dVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = dVar.f186970a;
                r.b(objB);
            }
            Byte bF = u.F((byte[]) objB);
            if (bF == null) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, "Apply filter response is too short");
            }
            byte bByteValue = bF.byteValue();
            Logger logger = this.f52361b;
            if (bByteValue == 0) {
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.info("Device supports " + bVar.name());
            } else {
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.info("Device does not support " + bVar.name());
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            Logger logger2 = this.f52361b;
            if (logger2 == null) {
                s.m("logger");
                throw null;
            }
            logger2.error("Failed to apply directory filter", (Throwable) e4);
            throw new FileException(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i14, v13.c cVar) throws FileException {
        ws2.e eVar;
        if (cVar instanceof ws2.e) {
            eVar = (ws2.e) cVar;
            int i15 = eVar.f186976c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f186976c = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new ws2.e(this, cVar);
            }
        } else {
            eVar = new ws2.e(this, cVar);
        }
        Object objB = eVar.f186974a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f186976c;
        try {
            if (i16 == 0) {
                r.b(objB);
                byte[] bArr = {0, 0, (byte) e.ARCHIVE.f52398a};
                jg.b.T(0, i14, bArr);
                v vVar = this.f52362c;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                eVar.f186976c = 1;
                objB = vVar.b(5008, bArr, eVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            return Unit.INSTANCE;
        } catch (ResponseStatusException e4) {
            int i17 = b.f52371a[e4.getStatus().ordinal()];
            if (i17 == 1 || i17 == 2) {
                throw new FileException(FileException.a.NOT_SUPPORTED, e4);
            }
            throw new FileException(e4);
        } catch (IOException e14) {
            throw new FileException(e14);
        }
    }

    @Override // rs2.h
    public final void close(String str) {
        xs2.c cVar;
        str.getClass();
        c0.d(this.f52365f, "FileManager closed");
        Logger logger = this.f52361b;
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        logger.debug("FileManager closed");
        synchronized (this.f52366g) {
            this.f52368i = null;
            cVar = this.f52369j;
            this.f52369j = null;
            Unit unit = Unit.INSTANCE;
        }
        if (cVar != null) {
            FileException.a aVar = FileException.a.CONNECTION_CLOSED;
            aVar.getClass();
            o53.r<o13.u<Integer, byte[], x>> rVar = cVar.f192098g.get();
            if (rVar != null) {
                rVar.O(new FileException(aVar));
            }
        }
        this.f52367h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f186979c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f186979c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objB = fVar.f186977a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f186979c;
        CopyOnWriteArrayList<ws2.a> copyOnWriteArrayList = this.f52370k;
        try {
            if (i15 == 0) {
                r.b(objB);
                if (!copyOnWriteArrayList.isEmpty()) {
                    return copyOnWriteArrayList;
                }
                rs2.c cVar2 = this.f52363d;
                if (cVar2 == null) {
                    s.m("device");
                    throw null;
                }
                if (oi0.c.O(cVar2)) {
                    return j0.f134944a;
                }
                v vVar = this.f52362c;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                fVar.f186979c = 1;
                objB = vVar.b(5031, new byte[0], fVar);
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
            byte[] bArr = (byte[]) objB;
            Byte bF = u.F(bArr);
            if (bF == null) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, "Get support file types response is too short");
            }
            byte bByteValue = bF.byteValue();
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 1, bArr.length - 1);
            for (int i16 = 0; i16 < bByteValue; i16++) {
                byteBufferWrap.getClass();
                arrayList.add(new ws2.a(byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, d53.w.j0(f0.C(byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, byteBufferWrap), 0)));
            }
            copyOnWriteArrayList.addAllAbsent(arrayList);
            return arrayList;
        } catch (ResponseStatusException e4) {
            if (e4.getStatus() == y.UNKNOWN_OR_NOT_SUPPORTED) {
                return p13.x.k(new ws2.a(128, 4, "FIT_TYPE_4"), new ws2.a(128, 36, "FIT_TYPE_36"));
            }
            throw e4;
        } catch (Exception e14) {
            throw new FileException(e14);
        }
    }

    public final void f(int i14, byte[] bArr, us2.e.a aVar) {
        xs2.c cVar;
        synchronized (this.f52366g) {
            cVar = this.f52369j;
        }
        if (cVar == null) {
            Logger logger = this.f52361b;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("Received file transfer request with no receiver task");
            ft2.d.b(this.f52365f, new ws2.h(i14, bArr, aVar, this, null));
            return;
        }
        if (i14 == 5004 || i14 == 5054) {
            bArr.getClass();
            o53.r<o13.u<Integer, byte[], x>> rVar = cVar.f192098g.get();
            if (rVar != null) {
                rVar.p(new o13.u<>(Integer.valueOf(i14), bArr, aVar));
            } else {
                vb.h.z("Missing data completion");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable g(ws2.b bVar, v13.c cVar) {
        i iVar;
        List list;
        Object objH;
        List list2;
        ByteBuffer byteBufferWrap;
        int i14;
        ArrayList arrayList;
        int i15;
        Iterator it;
        String str;
        char c14;
        Object next;
        ws2.a aVar;
        ws2.a aVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i16 = iVar.f186991d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                iVar.f186991d = i16 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objE = iVar.f186989b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = iVar.f186991d;
        char c15 = 0;
        if (i17 == 0) {
            r.b(objE);
            iVar.f186991d = 1;
            if (a(bVar, iVar) != aVar3) {
            }
            return aVar3;
        }
        if (i17 == 1) {
            r.b(objE);
        } else {
            if (i17 == 2) {
                r.b(objE);
                list = (List) objE;
                p bVar2 = new wf2.b(22);
                iVar.f186988a = list;
                iVar.f186991d = 3;
                objH = h(0, true, bVar2, iVar);
                if (objH != aVar3) {
                    list2 = list;
                    objE = objH;
                }
                return aVar3;
            }
            if (i17 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = iVar.f186988a;
            r.b(objE);
        }
        byteBufferWrap = ByteBuffer.wrap((byte[]) objE);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferWrap.position(16);
        arrayList = new ArrayList();
        for (i14 = 16; byteBufferWrap.remaining() >= i14; i14 = 16) {
            int i18 = byteBufferWrap.getShort() & 65535;
            i15 = byteBufferWrap.get() & UnsignedBytes.MAX_VALUE;
            byte[] bArr = new byte[3];
            byteBufferWrap.get(bArr);
            byteBufferWrap.get();
            e.a aVar4 = e.f52394b;
            int i19 = byteBufferWrap.get() & UnsignedBytes.MAX_VALUE;
            aVar4.getClass();
            LinkedHashSet linkedHashSetA = e.a.a(i19);
            int i24 = (int) (((long) byteBufferWrap.getInt()) & 4294967295L);
            long j8 = ((long) byteBufferWrap.getInt()) & 4294967295L;
            it = list2.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    c14 = c15;
                    next = null;
                    break;
                }
                next = it.next();
                aVar2 = (ws2.a) next;
                c14 = c15;
                if (aVar2.f186955a != i15 && aVar2.f186956b == bArr[c14]) {
                    break;
                }
                c15 = c14;
            }
            aVar = (ws2.a) next;
            if (aVar != null) {
                str = aVar.f186957c;
            }
            arrayList.add(new ws2.c(i18, i15, bArr, linkedHashSetA, i24, j8, str));
            c15 = c14;
        }
        return arrayList;
        iVar.f186991d = 2;
        objE = e(iVar);
        if (objE != aVar3) {
            list = (List) objE;
            p bVar3 = new wf2.b(22);
            iVar.f186988a = list;
            iVar.f186991d = 3;
            objH = h(0, true, bVar3, iVar);
            if (objH != aVar3) {
                list2 = list;
                objE = objH;
                byteBufferWrap = ByteBuffer.wrap((byte[]) objE);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferWrap.position(16);
                arrayList = new ArrayList();
                while (byteBufferWrap.remaining() >= i14) {
                    int i110 = byteBufferWrap.getShort() & 65535;
                    i15 = byteBufferWrap.get() & UnsignedBytes.MAX_VALUE;
                    byte[] bArr2 = new byte[3];
                    byteBufferWrap.get(bArr2);
                    byteBufferWrap.get();
                    e.a aVar5 = e.f52394b;
                    int i111 = byteBufferWrap.get() & UnsignedBytes.MAX_VALUE;
                    aVar5.getClass();
                    LinkedHashSet linkedHashSetA2 = e.a.a(i111);
                    int i25 = (int) (((long) byteBufferWrap.getInt()) & 4294967295L);
                    long j14 = ((long) byteBufferWrap.getInt()) & 4294967295L;
                    it = list2.iterator();
                    while (true) {
                        str = null;
                        if (it.hasNext()) {
                            c14 = c15;
                            next = null;
                            break;
                        }
                        next = it.next();
                        aVar2 = (ws2.a) next;
                        c14 = c15;
                        if (aVar2.f186955a != i15) {
                        }
                        c15 = c14;
                    }
                    aVar = (ws2.a) next;
                    if (aVar != null) {
                        str = aVar.f186957c;
                    }
                    arrayList.add(new ws2.c(i110, i15, bArr2, linkedHashSetA2, i25, j14, str));
                    c15 = c14;
                }
                return arrayList;
            }
        }
        return aVar3;
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [byte[], java.io.Serializable] */
    public final Serializable h(int i14, boolean z14, p pVar, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i15 = jVar.f186994c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                jVar.f186994c = i15 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objY = jVar.f186992a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = jVar.f186994c;
        if (i16 == 0) {
            r.b(objY);
            jVar.f186994c = 1;
            objY = ge1.b.Y(new com.garmin.gfdi.file.b(this, i14, z14, pVar, null), jVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objY);
        }
        return (byte[]) ((o13.p) objY).f128594a;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee A[Catch: all -> 0x00f1, TryCatch #2 {all -> 0x00f1, blocks: (B:63:0x00e4, B:65:0x00ee, B:68:0x00f3), top: B:110:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122 A[Catch: all -> 0x0034, TryCatch #3 {all -> 0x0034, blocks: (B:12:0x002f, B:77:0x00ff, B:81:0x0106, B:82:0x0121, B:83:0x0122, B:84:0x0127), top: B:112:0x0027 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [v13.c, ws2.k] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, ys2.o] */
    public final Object i(ys2.f fVar, int i14, byte[] bArr, String str, long j8, boolean z14, com.garmin.android.gfdi.framework.c cVar, v13.c cVar2) throws Throwable {
        r0 kVar;
        Object obj;
        ?? oVar;
        boolean z15;
        int i15;
        r0 r0Var;
        Logger logger;
        if (cVar2 instanceof k) {
            k kVar2 = (k) cVar2;
            int i16 = kVar2.f186999e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                kVar2.f186999e = i16 - Integer.MIN_VALUE;
                kVar = kVar2;
            } else {
                kVar = new k(this, cVar2);
            }
        } else {
            kVar = new k(this, cVar2);
        }
        Object objC = kVar.f186997c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = kVar.f186999e;
        try {
            if (i17 != 0) {
                if (i17 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i15 = kVar.f186995a;
                r0Var = kVar.f186996b;
                try {
                    r.b(objC);
                    synchronized (this.f52366g) {
                        try {
                            if (s.g(this.f52368i, r0Var.f105810a)) {
                                this.f52368i = null;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return objC;
                } catch (FileException e4) {
                    e = e4;
                    logger = this.f52361b;
                    if (logger != null) {
                        s.m("logger");
                        throw null;
                    }
                    boolean z16 = i15 != 0;
                    logger.error("Failed sendFile(" + z16 + "): " + e.getReason(), (Throwable) e);
                    throw e;
                }
            }
            r.b(objC);
            boolean z17 = z14 && this.f52364e >= 150;
            if (z14 && !z17) {
                Logger logger2 = this.f52361b;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.trace("Disabling write compression");
            }
            r0 r0Var2 = new r0();
            Object obj2 = this.f52366g;
            synchronized (obj2) {
                try {
                    if (this.f52368i != null) {
                        Logger logger3 = this.f52361b;
                        if (logger3 == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger3.warn("Unable to send file to device - Transfer in progress");
                        fVar.close();
                        FileException.a aVar2 = FileException.a.TRANSFER_IN_PROGRESS;
                        o oVar2 = this.f52368i;
                        throw new FileException(aVar2, aVar2 + " - existing write type " + (oVar2 != null ? new Integer(oVar2.f199246c) : null));
                    }
                    try {
                        try {
                            v vVar = this.f52362c;
                            try {
                                if (vVar == null) {
                                    s.m("messenger");
                                    throw null;
                                }
                                oVar = new o(vVar, fVar, i14, bArr, str, j8, z17, cVar);
                                z15 = z17;
                                r0Var2.f105810a = oVar;
                                this.f52368i = oVar;
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        obj = obj2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj = obj2;
                }
            }
            try {
                kVar.f186996b = r0Var2;
                kVar.f186995a = z15 ? 1 : 0;
                kVar.f186999e = 1;
                objC = oVar.c(kVar);
                if (objC == aVar) {
                    return aVar;
                }
                r0Var = r0Var2;
                synchronized (this.f52366g) {
                    if (s.g(this.f52368i, r0Var.f105810a)) {
                        this.f52368i = null;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    return objC;
                }
            } catch (FileException e14) {
                e = e14;
                i15 = z15 ? 1 : 0;
                logger = this.f52361b;
                if (logger != null) {
                    s.m("logger");
                    throw null;
                }
                if (i15 != 0) {
                }
                logger.error("Failed sendFile(" + z16 + "): " + e.getReason(), (Throwable) e);
                throw e;
            } catch (Throwable th8) {
                th = th8;
                kVar = r0Var2;
                synchronized (this.f52366g) {
                    try {
                        if (s.g(this.f52368i, kVar.f105810a)) {
                            this.f52368i = null;
                        }
                        Unit unit4 = Unit.INSTANCE;
                    } catch (Throwable th9) {
                        throw th9;
                    }
                }
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        xs2.c cVar;
        bArr.getClass();
        if (i14 == 5004) {
            f(i14, bArr, (us2.e.a) xVar);
            return;
        }
        if (i14 != 5022) {
            if (i14 != 5054) {
                return;
            }
            f(i14, bArr, (us2.e.a) xVar);
            return;
        }
        synchronized (this.f52366g) {
            cVar = this.f52369j;
        }
        Logger logger = this.f52361b;
        if (cVar == null) {
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("Received cancel transfer request with no receiver task");
            ft2.d.b(this.f52365f, new g(xVar, this, null));
            return;
        }
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        logger.info("Received cancel transfer request");
        FileException.a aVar = FileException.a.CANCELLED_BY_DEVICE;
        aVar.getClass();
        o53.r<o13.u<Integer, byte[], x>> rVar = cVar.f192098g.get();
        if (rVar != null) {
            rVar.O(new FileException(aVar));
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        rs2.d dVar = rs2.d.f154380a;
        us2.f fVar = (us2.f) cVar;
        String str = fVar.f172493a;
        dVar.getClass();
        this.f52361b = LoggerFactory.getLogger(rs2.d.a("FileManager", -1L, this, str));
        this.f52362c = vVar;
        this.f52363d = cVar;
        if (cVar instanceof us2.f) {
            this.f52364e = fVar.f172506n;
        }
        us2.b bVar = (us2.b) vVar;
        bVar.d(PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, this);
        bVar.d(5054, this);
        bVar.d(5022, this);
    }

    /* JADX INFO: renamed from: com.garmin.gfdi.file.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/garmin/gfdi/file/a$a;", "", "<init>", "()V", "", "DEFAULT_RECEIVE_TIMEOUT", "J", "", "STATUS_ABORT_TRANSFER", "B", "STATUS_ABORT_COMPRESSED_TRANSFER", "", "DIRECTORY_FILE_INDEX", "I", "GARMIN_DEVICE_XML_FILE_INDEX", "PROTOCOL_VERSION_WITH_WRITE_COMPRESSION", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1115a {
        public /* synthetic */ C1115a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1115a() {
        }
    }
}

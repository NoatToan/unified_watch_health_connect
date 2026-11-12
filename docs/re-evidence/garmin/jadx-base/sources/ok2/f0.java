package ok2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.DeviceNotConnectedException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.j0;
import p13.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lok2/f0;", "Lok2/w;", "Lok2/g;", "manager", "<init>", "(Lok2/g;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f132675a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.l<al2.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t13.d<al2.c> f132676a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t13.d<? super al2.c> dVar) {
            this.f132676a = dVar;
        }

        @Override // e23.l
        public final Unit invoke(al2.c cVar) {
            al2.c cVar2 = cVar;
            cVar2.getClass();
            int i14 = o13.q.f128596b;
            this.f132676a.resumeWith(cVar2);
            return Unit.INSTANCE;
        }
    }

    public f0(g gVar) {
        gVar.getClass();
        this.f132675a = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021d  */
    /* JADX WARN: Code duplicated, block: B:108:0x025f A[Catch: all -> 0x0276, TryCatch #1 {all -> 0x0276, blocks: (B:106:0x022d, B:108:0x025f, B:110:0x026d, B:115:0x027c, B:117:0x028f, B:119:0x0293, B:121:0x0297, B:122:0x029f, B:124:0x02ab), top: B:148:0x022d }] */
    /* JADX WARN: Code duplicated, block: B:110:0x026d A[Catch: all -> 0x0276, TryCatch #1 {all -> 0x0276, blocks: (B:106:0x022d, B:108:0x025f, B:110:0x026d, B:115:0x027c, B:117:0x028f, B:119:0x0293, B:121:0x0297, B:122:0x029f, B:124:0x02ab), top: B:148:0x022d }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0279  */
    /* JADX WARN: Code duplicated, block: B:115:0x027c A[Catch: all -> 0x0276, TryCatch #1 {all -> 0x0276, blocks: (B:106:0x022d, B:108:0x025f, B:110:0x026d, B:115:0x027c, B:117:0x028f, B:119:0x0293, B:121:0x0297, B:122:0x029f, B:124:0x02ab), top: B:148:0x022d }] */
    /* JADX WARN: Code duplicated, block: B:117:0x028f A[Catch: all -> 0x0276, TryCatch #1 {all -> 0x0276, blocks: (B:106:0x022d, B:108:0x025f, B:110:0x026d, B:115:0x027c, B:117:0x028f, B:119:0x0293, B:121:0x0297, B:122:0x029f, B:124:0x02ab), top: B:148:0x022d }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02ab A[Catch: all -> 0x0276, TRY_LEAVE, TryCatch #1 {all -> 0x0276, blocks: (B:106:0x022d, B:108:0x025f, B:110:0x026d, B:115:0x027c, B:117:0x028f, B:119:0x0293, B:121:0x0297, B:122:0x029f, B:124:0x02ab), top: B:148:0x022d }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02da  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:0: B:91:0x01c4->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee A[ADDED_TO_REGION] */
    public static final Serializable e(f0 f0Var, boolean z14, al2.m mVar, v13.c cVar) throws Exception {
        c0 c0Var;
        Object next;
        sk2.c cVar2;
        al2.m mVar2;
        f0 f0Var2;
        boolean z15;
        byte[] bArr;
        UUID uuid;
        lk2.b bVarC;
        al2.m mVar3;
        f0 f0Var3;
        sk2.c cVar3;
        lk2.b bVar;
        f0 f0Var4;
        al2.m mVar4;
        byte[] bArr2;
        UUID uuid2;
        boolean z16;
        char c14;
        UUID uuid3;
        byte[] bArr3;
        Object objH;
        sk2.c cVar4;
        lk2.x xVar;
        List<lk2.a> list;
        Iterator<T> it;
        wk2.f fVarN;
        rs2.c cVar5;
        al2.k kVarC;
        zk2.k kVarA;
        UUID uuid4;
        byte[] bArr4;
        f0 f0Var5;
        List<al2.m> list2;
        Boolean boolValueOf;
        f0Var.getClass();
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f132617j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f132617j = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(f0Var, cVar);
            }
        } else {
            c0Var = new c0(f0Var, cVar);
        }
        Object objA = c0Var.f132615h;
        Serializable pVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f132617j;
        if (i15 == 0) {
            o13.r.b(objA);
            Iterator<T> it3 = f0Var.f132675a.f132683b.getConfiguration().f132627g.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(((pk2.f0) next) instanceof sk2.c));
            cVar2 = next instanceof sk2.c ? (sk2.c) next : null;
            if (cVar2 == null) {
                throw new CoreTransferException(e.f132645m, "DeviceXmlReadAgent required to read device xml through TransferManager", null, 4, null);
            }
            rs2.c cVar6 = f0Var.f132675a.f132682a;
            c0Var.f132608a = f0Var;
            mVar2 = mVar;
            c0Var.f132609b = mVar2;
            c0Var.f132610c = cVar2;
            c0Var.f132614g = z14;
            c0Var.f132617j = 1;
            if (sk2.c.F(cVar2, cVar6, c0Var) != pVar) {
                f0Var2 = f0Var;
                z15 = z14;
            }
            return pVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uuid4 = (UUID) c0Var.f132610c;
                    bArr4 = (byte[]) c0Var.f132609b;
                    f0Var5 = c0Var.f132608a;
                    try {
                        o13.r.b(objA);
                        pVar = (o13.p) objA;
                    } catch (Exception e4) {
                        e = e4;
                        pVar = f0Var5.h(e, bArr4, uuid4);
                    }
                    return pVar;
                }
                uuid3 = c0Var.f132612e;
                bArr3 = c0Var.f132611d;
                cVar4 = (sk2.c) c0Var.f132610c;
                mVar3 = (al2.m) c0Var.f132609b;
                f0Var3 = c0Var.f132608a;
                try {
                    o13.r.b(objA);
                    c14 = 0;
                    xVar = (lk2.x) objA;
                    cVar3 = cVar4;
                    mVar4 = mVar3;
                    f0Var4 = f0Var3;
                    if (xVar.f113309a.isEmpty()) {
                        pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                    } else {
                        list = xVar.f113309a;
                        if (list.isEmpty()) {
                            pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                                } else if (p005kotlin.jvm.internal.s.g(((lk2.a) it.next()).f113153b, "GDXml")) {
                                    fVarN = cl2.c.n((lk2.a) p13.h0.b0(xVar.f113309a));
                                    if (p005kotlin.jvm.internal.s.g(fVarN.f185842a, uuid3) || bArr3 == null || bArr3.length == 0 || bArr3.length != fVarN.f185845d) {
                                        g gVar = f0Var4.f132675a;
                                        cVar5 = gVar.f132682a;
                                        kVarC = gVar.C(fVarN.f185842a);
                                        cVar3.getClass();
                                        synchronized (cVar3.f159943i) {
                                            try {
                                                wk2.i.a aVar = wk2.i.f185855a;
                                                wk2.d.f185837a.getClass();
                                                kVarA = wk2.i.a.a(aVar, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                                if (mVar4 != null) {
                                                    list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                                    if (list2 != null) {
                                                        boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                                    } else {
                                                        boolValueOf = null;
                                                    }
                                                    if (boolValueOf == null) {
                                                        HashMap<String, List<al2.m>> map = cVar3.f159946l;
                                                        String f92741e = cVar5.getF92741e();
                                                        al2.m[] mVarArr = new al2.m[1];
                                                        mVarArr[c14] = mVar4;
                                                        map.put(f92741e, p13.x.m(mVarArr));
                                                    }
                                                }
                                                if (kVarC != null && !kVarC.f3817a && kVarC != al2.k.REJECTED) {
                                                    cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                                }
                                                if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                                    cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        f0Var4.f132675a.F(kVarA, true, null);
                                        try {
                                            rs2.c cVar7 = f0Var4.f132675a.f132682a;
                                            c0Var.f132608a = f0Var4;
                                            c0Var.f132609b = bArr3;
                                            c0Var.f132610c = uuid3;
                                            c0Var.f132611d = null;
                                            c0Var.f132612e = null;
                                            c0Var.f132613f = null;
                                            c0Var.f132617j = 4;
                                            objA = cVar3.a(cVar7, c0Var);
                                            if (objA != pVar) {
                                                uuid4 = uuid3;
                                                bArr4 = bArr3;
                                                f0Var5 = f0Var4;
                                                pVar = (o13.p) objA;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            uuid4 = uuid3;
                                            bArr4 = bArr3;
                                            f0Var5 = f0Var4;
                                            pVar = f0Var5.h(e, bArr4, uuid4);
                                        }
                                    } else {
                                        f0Var4.f132675a.f132688g.debug("Skipping xmlRead, " + uuid3 + " is already cached locally");
                                        pVar = new o13.p(bArr3, uuid3);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    pVar = f0Var3.h(new CoreTransferException(e.f132655y, fb1.c.n("Unable to lookup Device XML id: ", e.getMessage()), e), bArr3, uuid3);
                }
                return pVar;
            }
            bVar = c0Var.f132613f;
            uuid2 = c0Var.f132612e;
            bArr2 = c0Var.f132611d;
            cVar3 = (sk2.c) c0Var.f132610c;
            mVar4 = (al2.m) c0Var.f132609b;
            f0Var4 = c0Var.f132608a;
            try {
                o13.r.b(objA);
                xVar = (lk2.x) objA;
                uuid3 = uuid2;
                bArr3 = bArr2;
                c14 = 0;
            } catch (Exception e16) {
                e = e16;
                uuid = uuid2;
                mVar3 = mVar4;
                bArr = bArr2;
                f0Var3 = f0Var4;
                bVarC = bVar;
                cVar2 = cVar3;
                Logger logger = f0Var3.f132675a.f132688g;
                String message = e.getMessage();
                if (bArr != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c14 = 0;
                logger.warn("listFiles failed: " + message + " CacheAvailable:" + z16);
                if (bArr != null || bArr.length == 0) {
                    try {
                        lk2.v vVar = new lk2.v(l0.f134950a, null, null, 6, null);
                        c0Var.f132608a = f0Var3;
                        c0Var.f132609b = mVar3;
                        c0Var.f132610c = cVar2;
                        c0Var.f132611d = bArr;
                        c0Var.f132612e = uuid;
                        c0Var.f132613f = null;
                        c0Var.f132617j = 3;
                        objH = bVarC.h(vVar, c0Var);
                        if (objH != pVar) {
                            UUID uuid5 = uuid;
                            objA = objH;
                            cVar4 = cVar2;
                            uuid3 = uuid5;
                            bArr3 = bArr;
                            xVar = (lk2.x) objA;
                            cVar3 = cVar4;
                            mVar4 = mVar3;
                            f0Var4 = f0Var3;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        uuid3 = uuid;
                        bArr3 = bArr;
                        pVar = f0Var3.h(new CoreTransferException(e.f132655y, fb1.c.n("Unable to lookup Device XML id: ", e.getMessage()), e), bArr3, uuid3);
                    }
                } else {
                    pVar = new o13.p(bArr, uuid);
                }
                return pVar;
            }
            if (xVar.f113309a.isEmpty()) {
                list = xVar.f113309a;
                if (list.isEmpty()) {
                    pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                } else {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                        } else if (p005kotlin.jvm.internal.s.g(((lk2.a) it.next()).f113153b, "GDXml")) {
                            fVarN = cl2.c.n((lk2.a) p13.h0.b0(xVar.f113309a));
                            if (p005kotlin.jvm.internal.s.g(fVarN.f185842a, uuid3)) {
                                g gVar2 = f0Var4.f132675a;
                                cVar5 = gVar2.f132682a;
                                kVarC = gVar2.C(fVarN.f185842a);
                                cVar3.getClass();
                                synchronized (cVar3.f159943i) {
                                    wk2.i.a aVar2 = wk2.i.f185855a;
                                    wk2.d.f185837a.getClass();
                                    kVarA = wk2.i.a.a(aVar2, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                    if (mVar4 != null) {
                                        list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                        if (list2 != null) {
                                            boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (boolValueOf == null) {
                                            HashMap<String, List<al2.m>> map2 = cVar3.f159946l;
                                            String f92741e2 = cVar5.getF92741e();
                                            al2.m[] mVarArr2 = new al2.m[1];
                                            mVarArr2[c14] = mVar4;
                                            map2.put(f92741e2, p13.x.m(mVarArr2));
                                        }
                                    }
                                    if (kVarC != null) {
                                        cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                    }
                                    if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                        cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                    }
                                    f0Var4.f132675a.F(kVarA, true, null);
                                    rs2.c cVar8 = f0Var4.f132675a.f132682a;
                                    c0Var.f132608a = f0Var4;
                                    c0Var.f132609b = bArr3;
                                    c0Var.f132610c = uuid3;
                                    c0Var.f132611d = null;
                                    c0Var.f132612e = null;
                                    c0Var.f132613f = null;
                                    c0Var.f132617j = 4;
                                    objA = cVar3.a(cVar8, c0Var);
                                    if (objA != pVar) {
                                        uuid4 = uuid3;
                                        bArr4 = bArr3;
                                        f0Var5 = f0Var4;
                                        pVar = (o13.p) objA;
                                    }
                                }
                            } else {
                                g gVar3 = f0Var4.f132675a;
                                cVar5 = gVar3.f132682a;
                                kVarC = gVar3.C(fVarN.f185842a);
                                cVar3.getClass();
                                synchronized (cVar3.f159943i) {
                                    wk2.i.a aVar3 = wk2.i.f185855a;
                                    wk2.d.f185837a.getClass();
                                    kVarA = wk2.i.a.a(aVar3, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                    if (mVar4 != null) {
                                        list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                        if (list2 != null) {
                                            boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (boolValueOf == null) {
                                            HashMap<String, List<al2.m>> map3 = cVar3.f159946l;
                                            String f92741e3 = cVar5.getF92741e();
                                            al2.m[] mVarArr3 = new al2.m[1];
                                            mVarArr3[c14] = mVar4;
                                            map3.put(f92741e3, p13.x.m(mVarArr3));
                                        }
                                    }
                                    if (kVarC != null) {
                                        cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                    }
                                    if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                        cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                    }
                                    f0Var4.f132675a.F(kVarA, true, null);
                                    rs2.c cVar9 = f0Var4.f132675a.f132682a;
                                    c0Var.f132608a = f0Var4;
                                    c0Var.f132609b = bArr3;
                                    c0Var.f132610c = uuid3;
                                    c0Var.f132611d = null;
                                    c0Var.f132612e = null;
                                    c0Var.f132613f = null;
                                    c0Var.f132617j = 4;
                                    objA = cVar3.a(cVar9, c0Var);
                                    if (objA != pVar) {
                                        uuid4 = uuid3;
                                        bArr4 = bArr3;
                                        f0Var5 = f0Var4;
                                        pVar = (o13.p) objA;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
            }
            return pVar;
        }
        z15 = c0Var.f132614g;
        cVar2 = (sk2.c) c0Var.f132610c;
        mVar2 = (al2.m) c0Var.f132609b;
        f0Var2 = c0Var.f132608a;
        o13.r.b(objA);
        o13.p<byte[], UUID> pVarE = cVar2.E(f0Var2.f132675a.f132682a);
        bArr = pVarE.f128594a;
        uuid = pVarE.f128595b;
        if (z15 && bArr != null && bArr.length != 0) {
            return new o13.p(bArr, uuid);
        }
        g gVar4 = f0Var2.f132675a;
        bVarC = gVar4.f132683b.c(gVar4.f132682a.getF92741e());
        if (bVarC == null) {
            return f0Var2.h(new DeviceNotConnectedException(), bArr, uuid);
        }
        try {
            lk2.v vVar2 = cVar2.f159941g;
            c0Var.f132608a = f0Var2;
            c0Var.f132609b = mVar2;
            c0Var.f132610c = cVar2;
            c0Var.f132611d = bArr;
            c0Var.f132612e = uuid;
            c0Var.f132613f = bVarC;
            c0Var.f132617j = 2;
            Object objH2 = bVarC.h(vVar2, c0Var);
            if (objH2 != pVar) {
                f0 f0Var6 = f0Var2;
                cVar3 = cVar2;
                bVar = bVarC;
                f0Var4 = f0Var6;
                mVar4 = mVar2;
                bArr2 = bArr;
                uuid2 = uuid;
                objA = objH2;
                xVar = (lk2.x) objA;
                uuid3 = uuid2;
                bArr3 = bArr2;
                c14 = 0;
                if (xVar.f113309a.isEmpty()) {
                    list = xVar.f113309a;
                    if (list.isEmpty()) {
                        pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                            } else if (p005kotlin.jvm.internal.s.g(((lk2.a) it.next()).f113153b, "GDXml")) {
                                fVarN = cl2.c.n((lk2.a) p13.h0.b0(xVar.f113309a));
                                if (p005kotlin.jvm.internal.s.g(fVarN.f185842a, uuid3)) {
                                    g gVar5 = f0Var4.f132675a;
                                    cVar5 = gVar5.f132682a;
                                    kVarC = gVar5.C(fVarN.f185842a);
                                    cVar3.getClass();
                                    synchronized (cVar3.f159943i) {
                                        wk2.i.a aVar4 = wk2.i.f185855a;
                                        wk2.d.f185837a.getClass();
                                        kVarA = wk2.i.a.a(aVar4, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                        if (mVar4 != null) {
                                            list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                            if (list2 != null) {
                                                boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (boolValueOf == null) {
                                                HashMap<String, List<al2.m>> map4 = cVar3.f159946l;
                                                String f92741e4 = cVar5.getF92741e();
                                                al2.m[] mVarArr4 = new al2.m[1];
                                                mVarArr4[c14] = mVar4;
                                                map4.put(f92741e4, p13.x.m(mVarArr4));
                                            }
                                        }
                                        if (kVarC != null) {
                                            cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                        }
                                        if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                            cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                        }
                                        f0Var4.f132675a.F(kVarA, true, null);
                                        rs2.c cVar10 = f0Var4.f132675a.f132682a;
                                        c0Var.f132608a = f0Var4;
                                        c0Var.f132609b = bArr3;
                                        c0Var.f132610c = uuid3;
                                        c0Var.f132611d = null;
                                        c0Var.f132612e = null;
                                        c0Var.f132613f = null;
                                        c0Var.f132617j = 4;
                                        objA = cVar3.a(cVar10, c0Var);
                                        if (objA != pVar) {
                                            uuid4 = uuid3;
                                            bArr4 = bArr3;
                                            f0Var5 = f0Var4;
                                            pVar = (o13.p) objA;
                                        }
                                    }
                                } else {
                                    g gVar6 = f0Var4.f132675a;
                                    cVar5 = gVar6.f132682a;
                                    kVarC = gVar6.C(fVarN.f185842a);
                                    cVar3.getClass();
                                    synchronized (cVar3.f159943i) {
                                        wk2.i.a aVar5 = wk2.i.f185855a;
                                        wk2.d.f185837a.getClass();
                                        kVarA = wk2.i.a.a(aVar5, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                        if (mVar4 != null) {
                                            list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                            if (list2 != null) {
                                                boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (boolValueOf == null) {
                                                HashMap<String, List<al2.m>> map5 = cVar3.f159946l;
                                                String f92741e5 = cVar5.getF92741e();
                                                al2.m[] mVarArr5 = new al2.m[1];
                                                mVarArr5[c14] = mVar4;
                                                map5.put(f92741e5, p13.x.m(mVarArr5));
                                            }
                                        }
                                        if (kVarC != null) {
                                            cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                        }
                                        if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                            cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                        }
                                        f0Var4.f132675a.F(kVarA, true, null);
                                        rs2.c cVar11 = f0Var4.f132675a.f132682a;
                                        c0Var.f132608a = f0Var4;
                                        c0Var.f132609b = bArr3;
                                        c0Var.f132610c = uuid3;
                                        c0Var.f132611d = null;
                                        c0Var.f132612e = null;
                                        c0Var.f132613f = null;
                                        c0Var.f132617j = 4;
                                        objA = cVar3.a(cVar11, c0Var);
                                        if (objA != pVar) {
                                            uuid4 = uuid3;
                                            bArr4 = bArr3;
                                            f0Var5 = f0Var4;
                                            pVar = (o13.p) objA;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                }
            }
        } catch (Exception e18) {
            e = e18;
            mVar3 = mVar2;
            f0Var3 = f0Var2;
            Logger logger2 = f0Var3.f132675a.f132688g;
            String message2 = e.getMessage();
            if (bArr != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            c14 = 0;
            logger2.warn("listFiles failed: " + message2 + " CacheAvailable:" + z16);
            if (bArr != null) {
                lk2.v vVar3 = new lk2.v(l0.f134950a, null, null, 6, null);
                c0Var.f132608a = f0Var3;
                c0Var.f132609b = mVar3;
                c0Var.f132610c = cVar2;
                c0Var.f132611d = bArr;
                c0Var.f132612e = uuid;
                c0Var.f132613f = null;
                c0Var.f132617j = 3;
                objH = bVarC.h(vVar3, c0Var);
                if (objH != pVar) {
                    UUID uuid6 = uuid;
                    objA = objH;
                    cVar4 = cVar2;
                    uuid3 = uuid6;
                    bArr3 = bArr;
                    xVar = (lk2.x) objA;
                    cVar3 = cVar4;
                    mVar4 = mVar3;
                    f0Var4 = f0Var3;
                    if (xVar.f113309a.isEmpty()) {
                        list = xVar.f113309a;
                        if (list.isEmpty()) {
                            pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                                } else if (p005kotlin.jvm.internal.s.g(((lk2.a) it.next()).f113153b, "GDXml")) {
                                    fVarN = cl2.c.n((lk2.a) p13.h0.b0(xVar.f113309a));
                                    if (p005kotlin.jvm.internal.s.g(fVarN.f185842a, uuid3)) {
                                        g gVar7 = f0Var4.f132675a;
                                        cVar5 = gVar7.f132682a;
                                        kVarC = gVar7.C(fVarN.f185842a);
                                        cVar3.getClass();
                                        synchronized (cVar3.f159943i) {
                                            wk2.i.a aVar6 = wk2.i.f185855a;
                                            wk2.d.f185837a.getClass();
                                            kVarA = wk2.i.a.a(aVar6, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                            if (mVar4 != null) {
                                                list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                                if (list2 != null) {
                                                    boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (boolValueOf == null) {
                                                    HashMap<String, List<al2.m>> map6 = cVar3.f159946l;
                                                    String f92741e6 = cVar5.getF92741e();
                                                    al2.m[] mVarArr6 = new al2.m[1];
                                                    mVarArr6[c14] = mVar4;
                                                    map6.put(f92741e6, p13.x.m(mVarArr6));
                                                }
                                            }
                                            if (kVarC != null) {
                                                cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                            }
                                            if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                                cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                            }
                                            f0Var4.f132675a.F(kVarA, true, null);
                                            rs2.c cVar12 = f0Var4.f132675a.f132682a;
                                            c0Var.f132608a = f0Var4;
                                            c0Var.f132609b = bArr3;
                                            c0Var.f132610c = uuid3;
                                            c0Var.f132611d = null;
                                            c0Var.f132612e = null;
                                            c0Var.f132613f = null;
                                            c0Var.f132617j = 4;
                                            objA = cVar3.a(cVar12, c0Var);
                                            if (objA != pVar) {
                                                uuid4 = uuid3;
                                                bArr4 = bArr3;
                                                f0Var5 = f0Var4;
                                                pVar = (o13.p) objA;
                                            }
                                        }
                                    } else {
                                        g gVar8 = f0Var4.f132675a;
                                        cVar5 = gVar8.f132682a;
                                        kVarC = gVar8.C(fVarN.f185842a);
                                        cVar3.getClass();
                                        synchronized (cVar3.f159943i) {
                                            wk2.i.a aVar7 = wk2.i.f185855a;
                                            wk2.d.f185837a.getClass();
                                            kVarA = wk2.i.a.a(aVar7, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                            if (mVar4 != null) {
                                                list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                                if (list2 != null) {
                                                    boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (boolValueOf == null) {
                                                    HashMap<String, List<al2.m>> map7 = cVar3.f159946l;
                                                    String f92741e7 = cVar5.getF92741e();
                                                    al2.m[] mVarArr7 = new al2.m[1];
                                                    mVarArr7[c14] = mVar4;
                                                    map7.put(f92741e7, p13.x.m(mVarArr7));
                                                }
                                            }
                                            if (kVarC != null) {
                                                cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                            }
                                            if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                                cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                            }
                                            f0Var4.f132675a.F(kVarA, true, null);
                                            rs2.c cVar13 = f0Var4.f132675a.f132682a;
                                            c0Var.f132608a = f0Var4;
                                            c0Var.f132609b = bArr3;
                                            c0Var.f132610c = uuid3;
                                            c0Var.f132611d = null;
                                            c0Var.f132612e = null;
                                            c0Var.f132613f = null;
                                            c0Var.f132617j = 4;
                                            objA = cVar3.a(cVar13, c0Var);
                                            if (objA != pVar) {
                                                uuid4 = uuid3;
                                                bArr4 = bArr3;
                                                f0Var5 = f0Var4;
                                                pVar = (o13.p) objA;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                    }
                }
            } else {
                lk2.v vVar4 = new lk2.v(l0.f134950a, null, null, 6, null);
                c0Var.f132608a = f0Var3;
                c0Var.f132609b = mVar3;
                c0Var.f132610c = cVar2;
                c0Var.f132611d = bArr;
                c0Var.f132612e = uuid;
                c0Var.f132613f = null;
                c0Var.f132617j = 3;
                objH = bVarC.h(vVar4, c0Var);
                if (objH != pVar) {
                    UUID uuid7 = uuid;
                    objA = objH;
                    cVar4 = cVar2;
                    uuid3 = uuid7;
                    bArr3 = bArr;
                    xVar = (lk2.x) objA;
                    cVar3 = cVar4;
                    mVar4 = mVar3;
                    f0Var4 = f0Var3;
                    if (xVar.f113309a.isEmpty()) {
                        list = xVar.f113309a;
                        if (list.isEmpty()) {
                            pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                                } else if (p005kotlin.jvm.internal.s.g(((lk2.a) it.next()).f113153b, "GDXml")) {
                                    fVarN = cl2.c.n((lk2.a) p13.h0.b0(xVar.f113309a));
                                    if (p005kotlin.jvm.internal.s.g(fVarN.f185842a, uuid3)) {
                                        g gVar9 = f0Var4.f132675a;
                                        cVar5 = gVar9.f132682a;
                                        kVarC = gVar9.C(fVarN.f185842a);
                                        cVar3.getClass();
                                        synchronized (cVar3.f159943i) {
                                            wk2.i.a aVar8 = wk2.i.f185855a;
                                            wk2.d.f185837a.getClass();
                                            kVarA = wk2.i.a.a(aVar8, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                            if (mVar4 != null) {
                                                list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                                if (list2 != null) {
                                                    boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (boolValueOf == null) {
                                                    HashMap<String, List<al2.m>> map8 = cVar3.f159946l;
                                                    String f92741e8 = cVar5.getF92741e();
                                                    al2.m[] mVarArr8 = new al2.m[1];
                                                    mVarArr8[c14] = mVar4;
                                                    map8.put(f92741e8, p13.x.m(mVarArr8));
                                                }
                                            }
                                            if (kVarC != null) {
                                                cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                            }
                                            if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                                cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                            }
                                            f0Var4.f132675a.F(kVarA, true, null);
                                            rs2.c cVar14 = f0Var4.f132675a.f132682a;
                                            c0Var.f132608a = f0Var4;
                                            c0Var.f132609b = bArr3;
                                            c0Var.f132610c = uuid3;
                                            c0Var.f132611d = null;
                                            c0Var.f132612e = null;
                                            c0Var.f132613f = null;
                                            c0Var.f132617j = 4;
                                            objA = cVar3.a(cVar14, c0Var);
                                            if (objA != pVar) {
                                                uuid4 = uuid3;
                                                bArr4 = bArr3;
                                                f0Var5 = f0Var4;
                                                pVar = (o13.p) objA;
                                            }
                                        }
                                    } else {
                                        g gVar10 = f0Var4.f132675a;
                                        cVar5 = gVar10.f132682a;
                                        kVarC = gVar10.C(fVarN.f185842a);
                                        cVar3.getClass();
                                        synchronized (cVar3.f159943i) {
                                            wk2.i.a aVar9 = wk2.i.f185855a;
                                            wk2.d.f185837a.getClass();
                                            kVarA = wk2.i.a.a(aVar9, fVarN, new wk2.a(cVar5, fVarN, null, 4, null), sk2.c.f159934q, wk2.m.f185866f, null, cVar3, null, null, 432);
                                            if (mVar4 != null) {
                                                list2 = cVar3.f159946l.get(cVar5.getF92741e());
                                                if (list2 != null) {
                                                    boolValueOf = Boolean.valueOf(list2.add(mVar4));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (boolValueOf == null) {
                                                    HashMap<String, List<al2.m>> map9 = cVar3.f159946l;
                                                    String f92741e9 = cVar5.getF92741e();
                                                    al2.m[] mVarArr9 = new al2.m[1];
                                                    mVarArr9[c14] = mVar4;
                                                    map9.put(f92741e9, p13.x.m(mVarArr9));
                                                }
                                            }
                                            if (kVarC != null) {
                                                cVar3.u(new al2.l(cVar5, kVarA, kVarC));
                                            }
                                            if (cVar3.f159945k.get(cVar5.getF92741e()) == null) {
                                                cVar3.f159945k.put(cVar5.getF92741e(), gl.b.b());
                                            }
                                            f0Var4.f132675a.F(kVarA, true, null);
                                            rs2.c cVar15 = f0Var4.f132675a.f132682a;
                                            c0Var.f132608a = f0Var4;
                                            c0Var.f132609b = bArr3;
                                            c0Var.f132610c = uuid3;
                                            c0Var.f132611d = null;
                                            c0Var.f132612e = null;
                                            c0Var.f132613f = null;
                                            c0Var.f132617j = 4;
                                            objA = cVar3.a(cVar15, c0Var);
                                            if (objA != pVar) {
                                                uuid4 = uuid3;
                                                bArr4 = bArr3;
                                                f0Var5 = f0Var4;
                                                pVar = (o13.p) objA;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        pVar = f0Var4.h(new CoreTransferException(e.f132655y, "XML file not in listing", null, 4, null), bArr3, uuid3);
                    }
                }
            }
        }
        return pVar;
    }

    @Override // ok2.w
    public final Object b(boolean z14, fm2.c.b.a aVar, v13.c cVar) {
        return ge1.b.Y(new e0(this, z14, aVar, null), cVar);
    }

    @Override // ok2.z
    public final g0 c() {
        return this.f132675a.c();
    }

    @Override // xk2.b
    public final Object d(xk2.a aVar, xk2.e eVar, uf2.b bVar) {
        g gVar = this.f132675a;
        Logger logger = gVar.f132688g;
        t13.i iVar = new t13.i(u13.f.b(bVar));
        UUID uuid = aVar.f191295a;
        try {
            uuid.getClass();
            wk2.i iVarE = gVar.f132695n.e(uuid);
            if ((iVarE != null ? iVarE.getF205163m() : null) != null && !p005kotlin.jvm.internal.s.g(iVarE.getF205163m(), eVar)) {
                throw new IllegalArgumentException("Item " + uuid + " is already queued with different dataProcessor. cancelTransfer if previous instance no longer relevant");
            }
            al2.k kVarC = gVar.C(uuid);
            if (kVarC != null) {
                if (iVarE != null) {
                    pk2.x f205158h = iVarE.getF205158h();
                    logger.warn("readFileFromDevice(" + uuid + ") - file already queued: result=" + (f205158h != null ? f205158h.f138496a : null) + ", dataProcessor=" + (iVarE.getF205163m() != null) + ", status=" + kVarC);
                }
                if (gVar.c() != null && p13.u.m0(new al2.k[]{al2.k.STARTED, al2.k.FAILURE, al2.k.SUCCESS}).contains(kVarC)) {
                    throw new IllegalStateException("Item " + uuid + " is already in progress in current batch");
                }
            }
            al2.o.f3834f.getClass();
            ge1.b.T(gVar.f132687f, null, null, new d0(this, g(aVar, eVar, new al2.o(j0.f134944a, iVar, null)), uuid, iVar, null), 3);
        } catch (Exception e4) {
            logger.error("readFileFromDevice(" + uuid + ") - failed to queue", (Throwable) e4);
            int i14 = o13.q.f128596b;
            iVar.resumeWith(new o13.q.b(e4));
        }
        Object objA = iVar.a();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, ok2.g0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, ok2.g0] */
    @Override // ok2.w
    public final void f(y yVar, e23.l<? super al2.c, Unit> lVar) {
        r0 r0Var = new r0();
        r0Var.f105810a = g0.USER_INITIATED_GENERAL;
        if (yVar.f132808b != null || yVar.f132807a != null) {
            g.f132677s.getClass();
            r0Var.f105810a = g.f132679u;
        }
        g gVar = this.f132675a;
        gVar.f132688g.info("requestUserSync(" + r0Var.f105810a + ")");
        g0 g0Var = (g0) r0Var.f105810a;
        g0Var.getClass();
        y.a aVar = new y.a(yVar);
        aVar.f132818e = g0Var;
        gVar.H(new y(aVar), new mw1.b(this, 16, r0Var, lVar));
    }

    public final zk2.k g(xk2.a aVar, xk2.e eVar, al2.o oVar) {
        wk2.f fVar = new wk2.f(aVar.f191295a, aVar.f191296b, wk2.h.DEVICE_TO_PHONE, aVar.f191297c, null, null, null, 112, null);
        al2.f.f3791c.getClass();
        al2.i iVar = new al2.i(oVar);
        wk2.d.a aVar2 = wk2.d.f185837a;
        g gVar = this.f132675a;
        rs2.c cVar = gVar.f132682a;
        aVar2.getClass();
        wk2.a aVar3 = new wk2.a(cVar, fVar, null, 4, null);
        wk2.i.a aVar4 = wk2.i.f185855a;
        g.f132677s.getClass();
        return wk2.i.a.a(aVar4, fVar, aVar3, g.f132678t, wk2.m.f185866f, gVar.f132683b.a(), iVar, null, eVar, SyslogConstants.LOG_LOCAL4);
    }

    public final o13.p<byte[], UUID> h(Exception exc, byte[] bArr, UUID uuid) throws Exception {
        this.f132675a.f132688g.warn(exc.getMessage() + " CacheAvailable:" + (bArr != null));
        if (bArr == null || bArr.length == 0) {
            throw exc;
        }
        return new o13.p<>(bArr, uuid);
    }

    @Override // ok2.w
    public final boolean l() {
        return true;
    }

    @Override // ok2.w
    public final void p() {
        g gVar = this.f132675a;
        pk2.b bVar = gVar.f132696o;
        f fVar = new f(gVar, 2);
        int i14 = pk2.b.f138357m;
        bVar.getClass();
        ge1.b.T(bVar.f138361d, null, null, new pk2.w(bVar, 10L, fVar, null), 3);
    }

    @Override // ok2.w
    public final Object q(y yVar, t13.d<? super al2.c> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        try {
            f(yVar, new a(iVar));
        } catch (Exception e4) {
            int i14 = o13.q.f128596b;
            iVar.resumeWith(new o13.q.b(e4));
        }
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    @Override // ok2.w
    public final void r(y yVar, e23.p<? super al2.b, ? super CoreTransferException, Unit> pVar) {
        yVar.getClass();
        this.f132675a.H(yVar, new a3.d(pVar, 27));
    }

    @Override // ok2.w
    public final Object s(UUID uuid, List list, gl2.g gVar) {
        lk2.b bVarC;
        g gVar2 = this.f132675a;
        gVar2.f132688g.debug("removeFlags for " + uuid + " [" + p13.h0.k0(list, null, null, null, null, 63) + "]");
        if (list.isEmpty() || (bVarC = gVar2.f132683b.c(gVar2.f132682a.getF92741e())) == null) {
            return Unit.INSTANCE;
        }
        Object objI = bVarC.i(uuid, list, gVar);
        return objI == u13.a.COROUTINE_SUSPENDED ? objI : Unit.INSTANCE;
    }
}

package bl2;

import com.garmin.device.filetransfer.ItemAccessException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.proto.generated.GDIFileAccess;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import o53.i0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.j0;
import pk2.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbl2/r;", "Lbl2/b;", "Lok2/b;", "helper", "Lo53/b0;", "coroutineScope", "Lrs2/c;", "device", "Lwk2/i;", "item", "Lbl2/b$b;", "queueDelegate", "Lbl2/o$b;", "notificationDelegate", "<init>", "(Lok2/b;Lo53/b0;Lrs2/c;Lwk2/i;Lbl2/b$b;Lbl2/o$b;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f18709p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f18710q = 25000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<UUID> f18711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Timer f18712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<? extends i0<Unit>> f18713o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ok2.b bVar, o53.b0 b0Var, rs2.c cVar, wk2.i iVar, b.InterfaceC0272b interfaceC0272b, o.b bVar2) {
        super(bVar, b0Var, cVar, iVar, interfaceC0272b, bVar2);
        bVar.getClass();
        b0Var.getClass();
        cVar.getClass();
        iVar.getClass();
        interfaceC0272b.getClass();
        bVar2.getClass();
        this.f18711m = new CopyOnWriteArraySet<>();
        this.f18712n = new Timer();
        this.f18713o = j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x0036, Exception -> 0x00b0, Merged into TryCatch #1 {all -> 0x0036, Exception -> 0x00b0, blocks: (B:12:0x0032, B:27:0x0070, B:29:0x008e, B:36:0x00ab, B:38:0x00af, B:41:0x00b2, B:42:0x00b9, B:43:0x00ba, B:21:0x004e, B:23:0x0058), top: B:53:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[Catch: all -> 0x0036, Exception -> 0x00b0, Merged into TryCatch #1 {all -> 0x0036, Exception -> 0x00b0, blocks: (B:12:0x0032, B:27:0x0070, B:29:0x008e, B:36:0x00ab, B:38:0x00af, B:41:0x00b2, B:42:0x00b9, B:43:0x00ba, B:21:0x004e, B:23:0x0058), top: B:53:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [pk2.z] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [pk2.f0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7, types: [T] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, pk2.x] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, pk2.x] */
    /* JADX WARN: Type inference failed for: r8v0, types: [pk2.f0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [wk2.d] */
    /* JADX WARN: Type inference failed for: r9v1, types: [dz2.b] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dz2.b] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [dz2.b] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [dz2.b] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final Object q(r rVar, f0 f0Var, wk2.d dVar, v13.c cVar) {
        y yVar;
        r rVar2;
        Exception e4;
        ?? r14;
        r0 r0Var;
        r0 r0Var2;
        ?? r15;
        ?? r16;
        ?? r17;
        wk2.i iVar = rVar.f18603d;
        rs2.c cVar2 = rVar.f18602c;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f18751h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f18751h = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(rVar, cVar);
            }
        } else {
            yVar = new y(rVar, cVar);
        }
        Object obj = yVar.f18749f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f18751h;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                dVar = dVar.b();
                r0 r0Var3 = new r0();
                try {
                    if (!f0Var.m(cVar2, iVar.getF205152b())) {
                        try {
                            dVar.close();
                            return null;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    yVar.f18744a = rVar;
                    yVar.f18745b = f0Var;
                    yVar.f18746c = dVar;
                    yVar.f18747d = r0Var3;
                    yVar.f18748e = r0Var3;
                    yVar.f18751h = 1;
                    Object objN = f0Var.n(cVar2, iVar, dVar, yVar);
                    if (objN == aVar) {
                        return aVar;
                    }
                    rVar2 = rVar;
                    r0Var2 = r0Var3;
                    r15 = objN;
                    r14 = f0Var;
                    r0Var = r0Var2;
                    dVar = dVar;
                } catch (Exception e14) {
                    rVar2 = rVar;
                    e4 = e14;
                    r14 = f0Var;
                    r0Var = r0Var3;
                    if (e4 instanceof CoreTransferException) {
                        throw e4;
                    }
                    throw new CoreTransferException(ok2.e.A, e4);
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var2 = yVar.f18748e;
                r0Var = yVar.f18747d;
                dVar = yVar.f18746c;
                r14 = yVar.f18745b;
                rVar2 = yVar.f18744a;
                try {
                    o13.r.b(obj);
                    r14 = r14;
                    dVar = dVar;
                    r15 = obj;
                } catch (Exception e15) {
                    e4 = e15;
                    if (e4 instanceof CoreTransferException) {
                        throw e4;
                    }
                    throw new CoreTransferException(ok2.e.A, e4);
                }
            }
            r0Var2.f105810a = r15;
            n nVar = n.f18688a;
            ok2.b bVar = rVar2.f18600a;
            rs2.c cVar3 = rVar2.f18602c;
            wk2.i iVar2 = rVar2.f18603d;
            Object obj2 = r0Var.f105810a;
            pk2.y yVar2 = ((pk2.x) obj2).f138496a;
            ok2.e eVar = ((pk2.x) obj2).f138498c;
            nVar.getClass();
            pk2.y yVarA = n.a(bVar, cVar3, iVar2, yVar2, eVar);
            r17 = r14;
            r16 = dVar;
            if (yVarA != null) {
                r0Var.f105810a = new pk2.x(yVarA, ((pk2.x) r0Var.f105810a).f138497b);
                Unit unit = Unit.INSTANCE;
                r17 = r14;
                r16 = dVar;
            }
        } catch (Exception e16) {
            r0Var.f105810a = rVar2.g(e16);
            r17 = r14;
            r16 = dVar;
        } finally {
            try {
                dVar.close();
            } catch (Exception unused2) {
            }
        }
        return cl2.c.b(r17, rVar2.f18602c, rVar2.f18603d, (pk2.x) r0Var.f105810a, rVar2.d());
    }

    @Override // bl2.b
    public final Object c(a61.d dVar, t13.d dVar2) {
        return s(dVar, true, (v13.c) dVar2);
    }

    @Override // bl2.b
    public final void n(ok2.e eVar) {
        eVar.getClass();
        Iterator<T> it = this.f18713o.iterator();
        while (it.hasNext()) {
            ((i0) it.next()).c(new CancellationException("terminate(" + eVar + ")"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    public final Object r(Collection collection, v13.c cVar) {
        s sVar;
        r rVar;
        Object objO;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f18718e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f18718e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f18716c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f18718e;
        if (i15 == 0) {
            o13.r.b(obj);
            try {
                lk2.b bVarC = this.f18600a.c(this.f18602c.getF172493a());
                wk2.i iVar = this.f18603d;
                if (bVarC != null) {
                    UUID uuid = iVar.getF205152b().f185842a;
                    sVar.f18714a = this;
                    sVar.f18715b = (Collection) collection;
                    sVar.f18718e = 1;
                    objO = bVarC.o(uuid, collection, sVar);
                    if (objO == aVar) {
                        collection = objO;
                        return aVar;
                    }
                } else {
                    d().warn("Unable to archive " + iVar.getF205152b() + " device not connected");
                    collection = collection;
                }
                collection = objO;
            } catch (Exception e4) {
                e = e4;
                rVar = this;
                rVar.d().error("Failed to archive file " + rVar.f18603d.getId() + " with flags " + collection, (Throwable) e);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = sVar.f18715b;
            rVar = sVar.f18714a;
            try {
                o13.r.b(obj);
            } catch (Exception e14) {
                e = e14;
                rVar.d().error("Failed to archive file " + rVar.f18603d.getId() + " with flags " + collection, (Throwable) e);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:122:0x0305  */
    /* JADX WARN: Code duplicated, block: B:129:0x034b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0359  */
    /* JADX WARN: Code duplicated, block: B:138:0x039c  */
    /* JADX WARN: Code duplicated, block: B:139:0x039e A[Catch: all -> 0x0351, PHI: r0 r2 r3 r4 r5 r6 r7
      0x039e: PHI (r0v74 boolean) = (r0v70 boolean), (r0v84 boolean) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r2v60 java.lang.Object) = (r2v57 java.lang.Object), (r2v1 java.lang.Object) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r3v57 java.io.Serializable) = (r3v53 java.io.Serializable), (r3v61 java.io.Serializable) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r4v42 int) = (r4v37 int), (r4v48 int) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r5v37 ??) = (r5v55 ??), (r5v56 ??) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r6v43 e23.p) = (r6v39 e23.p), (r6v49 e23.p) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r7v47 ??) = (r7v49 ??), (r7v50 ??) binds: [B:137:0x039a, B:30:0x00bc] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x0351, blocks: (B:139:0x039e, B:145:0x03bd, B:148:0x03c7, B:162:0x041d, B:164:0x0452, B:165:0x0457, B:130:0x034e, B:136:0x035d), top: B:236:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03bd A[Catch: all -> 0x0351, TRY_ENTER, TryCatch #11 {all -> 0x0351, blocks: (B:139:0x039e, B:145:0x03bd, B:148:0x03c7, B:162:0x041d, B:164:0x0452, B:165:0x0457, B:130:0x034e, B:136:0x035d), top: B:236:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:147:0x03c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x03c7 A[Catch: all -> 0x0351, TRY_LEAVE, TryCatch #11 {all -> 0x0351, blocks: (B:139:0x039e, B:145:0x03bd, B:148:0x03c7, B:162:0x041d, B:164:0x0452, B:165:0x0457, B:130:0x034e, B:136:0x035d), top: B:236:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:151:0x03de  */
    /* JADX WARN: Code duplicated, block: B:154:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x03fe A[Catch: all -> 0x0417, PHI: r0 r3 r4 r5 r6
      0x03fe: PHI (r0v91 e23.p) = (r0v85 e23.p), (r0v96 e23.p) binds: [B:153:0x03fa, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r3v66 java.io.Serializable) = (r3v62 java.io.Serializable), (r3v68 java.io.Serializable) binds: [B:153:0x03fa, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r4v54 int) = (r4v49 int), (r4v57 int) binds: [B:153:0x03fa, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r5v45 ??) = (r5v49 ??), (r5v50 ??) binds: [B:153:0x03fa, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r6v53 ??) = (r6v55 ??), (r6v56 ??) binds: [B:153:0x03fa, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #17 {all -> 0x0417, blocks: (B:155:0x03fe, B:152:0x03e0), top: B:243:0x03e0 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0416 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x041b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x041d A[Catch: all -> 0x0351, TRY_ENTER, TryCatch #11 {all -> 0x0351, blocks: (B:139:0x039e, B:145:0x03bd, B:148:0x03c7, B:162:0x041d, B:164:0x0452, B:165:0x0457, B:130:0x034e, B:136:0x035d), top: B:236:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0452 A[Catch: all -> 0x0351, TryCatch #11 {all -> 0x0351, blocks: (B:139:0x039e, B:145:0x03bd, B:148:0x03c7, B:162:0x041d, B:164:0x0452, B:165:0x0457, B:130:0x034e, B:136:0x035d), top: B:236:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:170:0x047e  */
    /* JADX WARN: Code duplicated, block: B:178:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:184:0x04e5 A[LOOP:2: B:182:0x04df->B:184:0x04e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0504  */
    /* JADX WARN: Code duplicated, block: B:189:0x0508  */
    /* JADX WARN: Code duplicated, block: B:190:0x050e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0516  */
    /* JADX WARN: Code duplicated, block: B:201:0x057a A[LOOP:0: B:199:0x0574->B:201:0x057a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0590  */
    /* JADX WARN: Code duplicated, block: B:205:0x059a  */
    /* JADX WARN: Code duplicated, block: B:208:0x05de A[Catch: all -> 0x01e0, Exception -> 0x01e4, TRY_ENTER, TryCatch #23 {Exception -> 0x01e4, all -> 0x01e0, blocks: (B:72:0x019c, B:74:0x01a4, B:76:0x01b2, B:78:0x01b8, B:83:0x01e8, B:84:0x01f4, B:208:0x05de, B:209:0x05f8), top: B:250:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:219:0x061c A[Catch: Exception -> 0x061f, TRY_LEAVE, TryCatch #10 {Exception -> 0x061f, blocks: (B:217:0x0614, B:219:0x061c), top: B:234:0x0614 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0315 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:? A[LOOP:3: B:120:0x02ff->B:262:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4 A[Catch: all -> 0x01e0, Exception -> 0x01e4, TryCatch #23 {Exception -> 0x01e4, all -> 0x01e0, blocks: (B:72:0x019c, B:74:0x01a4, B:76:0x01b2, B:78:0x01b8, B:83:0x01e8, B:84:0x01f4, B:208:0x05de, B:209:0x05f8), top: B:250:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2 A[Catch: all -> 0x01e0, Exception -> 0x01e4, TryCatch #23 {Exception -> 0x01e4, all -> 0x01e0, blocks: (B:72:0x019c, B:74:0x01a4, B:76:0x01b2, B:78:0x01b8, B:83:0x01e8, B:84:0x01f4, B:208:0x05de, B:209:0x05f8), top: B:250:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8 A[Catch: all -> 0x01e0, Exception -> 0x01e4, TryCatch #23 {Exception -> 0x01e4, all -> 0x01e0, blocks: (B:72:0x019c, B:74:0x01a4, B:76:0x01b2, B:78:0x01b8, B:83:0x01e8, B:84:0x01f4, B:208:0x05de, B:209:0x05f8), top: B:250:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e8 A[Catch: all -> 0x01e0, Exception -> 0x01e4, TryCatch #23 {Exception -> 0x01e4, all -> 0x01e0, blocks: (B:72:0x019c, B:74:0x01a4, B:76:0x01b2, B:78:0x01b8, B:83:0x01e8, B:84:0x01f4, B:208:0x05de, B:209:0x05f8), top: B:250:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fd A[Catch: Exception -> 0x0200, TRY_LEAVE, TryCatch #9 {Exception -> 0x0200, blocks: (B:86:0x01f7, B:88:0x01fd), top: B:232:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0240  */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a1, code lost:
    
        if (ge1.b.e0(r2, r5, r8) == r9) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x055c, code lost:
    
        if (r2 == r9) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0605, code lost:
    
        if (r2 == r9) goto L212;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:162:0x041d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:205:0x059a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:208:0x05de, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01b8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Iterable, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [bl2.b] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [bl2.b, bl2.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [bl2.b] */
    /* JADX WARN: Type inference failed for: r15v9, types: [bl2.r] */
    /* JADX WARN: Type inference failed for: r19v0, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.internal.m0] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r3v0, types: [wk2.i, wk2.n] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v22, types: [bl2.r] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [bl2.b] */
    /* JADX WARN: Type inference failed for: r3v40, types: [bl2.b] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v60, types: [bl2.r] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [bl2.r] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v7, types: [bl2.b] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v50, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53, types: [bl2.r] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47, types: [bl2.b, bl2.r] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(e23.p pVar, boolean z14, v13.c cVar) throws Throwable {
        t tVar;
        ?? r14;
        Serializable serializable;
        wk2.d f205154d;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r24;
        ?? r25;
        ?? r26;
        ?? r27;
        Serializable serializable2;
        ?? r28;
        ?? r29;
        ?? r34;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Set setG1;
        Set set;
        int i14;
        int size;
        ?? r35;
        ?? r36;
        ArrayList arrayList3;
        Iterator it3;
        CopyOnWriteArraySet<UUID> copyOnWriteArraySet;
        pk2.x xVar;
        ?? r37;
        boolean z15;
        ?? r110;
        ?? r38;
        e23.p pVar2;
        wk2.i iVar;
        wk2.d f205154d2;
        ArrayList arrayList4;
        m0 m0Var;
        xk2.d f205163m;
        boolean z16;
        boolean z17;
        e23.p pVar3;
        boolean z18;
        dz2.b bVarB;
        boolean z19;
        wk2.d f205154d3;
        boolean z24;
        ?? r111;
        List<f0> list;
        v vVar;
        b41.a aVar;
        boolean z25;
        e23.p pVar4;
        ?? r112;
        Iterator it4;
        lk2.b bVarC;
        ?? r39;
        ?? r44;
        int i15;
        ?? r45;
        Long l14;
        ?? r46;
        ?? r47;
        ?? r48;
        Boolean bool;
        e23.p pVar5;
        ?? r49;
        ?? r54;
        Object objK;
        Object objS;
        e23.p pVar6 = pVar;
        ?? r55 = this.f18603d;
        String str = "Transferred data was smaller than expected: ";
        String str2 = "No data available for upload: ";
        String str3 = "Skipping transfer from device, ";
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i16 = tVar.f18728j;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                tVar.f18728j = i16 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objT = tVar.f18726h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        try {
            try {
                try {
                    switch (tVar.f18728j) {
                        case 0:
                            o13.r.b(objT);
                            try {
                                if (r55.d() == r55.getF205152b().f185845d) {
                                    z15 = z14;
                                    d().debug("Skipping transfer from device, " + r55.getF205152b() + " was previously transferred");
                                    r110 = this;
                                    pVar2 = pVar6;
                                    iVar = r110.f18603d;
                                    f205154d2 = iVar.getF205154d();
                                    if (f205154d2 == null) {
                                        throw new CoreTransferException(ok2.e.f132644l, "No data available for upload: " + iVar.getF205154d(), null, 4, null);
                                    }
                                    if (f205154d2.getSize() < iVar.getF205152b().f185845d) {
                                        if (iVar.getF205163m() == null) {
                                            throw new CoreTransferException(ok2.e.f132646n, "Transferred data was smaller than expected", null, 4, null);
                                        }
                                        r110.d().warn("Transferred data was smaller than expected: " + f205154d2.getSize() + " instead of " + iVar.getF205152b().f185845d);
                                    }
                                    f205154d3 = iVar.getF205154d();
                                    if (f205154d3 != null) {
                                        f205154d3.a();
                                    }
                                    arrayList4 = new ArrayList();
                                    r110.f18712n.schedule(new u(r110), f18710q);
                                    m0Var = new m0();
                                    f205163m = r110.f18603d.getF205163m();
                                    if (f205163m != null) {
                                        r110.f18603d.getClass();
                                        bVarB = f205154d2.b();
                                        tVar.f18719a = r110;
                                        tVar.f18720b = pVar2;
                                        tVar.f18721c = f205154d2;
                                        tVar.f18722d = arrayList4;
                                        tVar.f18723e = m0Var;
                                        z17 = z15;
                                        tVar.f18724f = z17;
                                        tVar.f18728j = 3;
                                        if (f205163m.b(bVarB) != aVar2) {
                                            pVar3 = pVar2;
                                            z18 = z17;
                                            r110 = r110;
                                            pk2.x.f138495e.getClass();
                                            arrayList4.add(new o13.p(pk2.x.a.e(), j0.f134944a));
                                            wk2.i iVar2 = r110.f18603d;
                                            wk2.l.c(iVar2, iVar2.getF205152b(), null);
                                            z24 = true;
                                            r112 = r110;
                                            m0Var.f105804a = z24;
                                            z19 = z18;
                                            pVar2 = pVar3;
                                            r111 = r112;
                                            list = r111.f18600a.getConfiguration().f132627g;
                                            vVar = new v(r111, f205154d2, arrayList4, null);
                                            aVar = new b41.a(r111, 4);
                                            tVar.f18719a = r111;
                                            tVar.f18720b = pVar2;
                                            tVar.f18721c = arrayList4;
                                            tVar.f18722d = m0Var;
                                            tVar.f18723e = null;
                                            tVar.f18724f = z19;
                                            tVar.f18728j = 4;
                                            f18709p.getClass();
                                            if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                                serializable = m0Var;
                                                r17 = arrayList4;
                                                z25 = z19;
                                                r18 = r111;
                                                pVar4 = pVar2;
                                                if (r17 != 0) {
                                                    it4 = r17.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            r29 = serializable;
                                                            r34 = r17;
                                                            r28 = r18;
                                                            arrayList = new ArrayList();
                                                            while (r5.hasNext()) {
                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                            it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                            }
                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                            set = setG1;
                                                            r36 = r34;
                                                            r35 = r28;
                                                            if (!set.isEmpty()) {
                                                                if (r29.f105804a) {
                                                                    size = r34.size();
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                    size = r34.size() - 1;
                                                                }
                                                                if (size > i14) {
                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                }
                                                                tVar.f18719a = r28;
                                                                tVar.f18720b = r34;
                                                                tVar.f18721c = null;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 11;
                                                                Object objR = r28.r(set, tVar);
                                                                r36 = r34;
                                                                r35 = r28;
                                                                break;
                                                            }
                                                            r35.f18712n.cancel();
                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                            it3 = r36.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                            }
                                                            copyOnWriteArraySet = r35.f18711m;
                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                pk2.x.f138495e.getClass();
                                                                xVar = pk2.x.a.e();
                                                            } else {
                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                pk2.x.a aVar3 = pk2.x.f138495e;
                                                                ok2.e eVar = ok2.e.D;
                                                                aVar3.getClass();
                                                                eVar.getClass();
                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar, null, null));
                                                            }
                                                            return cl2.c.d(arrayList3, xVar);
                                                        }
                                                        if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                            bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                            if (bVarC != null) {
                                                                UUID uuid = r18.f18603d.getF205152b().f185842a;
                                                                long j8 = r18.f18603d.getF205152b().f185845d;
                                                                tVar.f18719a = r18;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r17;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = 0;
                                                                tVar.f18728j = 5;
                                                                objT = bVarC.n(uuid, j8, tVar);
                                                                if (objT != aVar2) {
                                                                    r39 = r18;
                                                                    r44 = r17;
                                                                    i15 = 0;
                                                                    l14 = (Long) objT;
                                                                    r46 = r44;
                                                                    r45 = r39;
                                                                    r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                    wk2.i iVar3 = r45.f18603d;
                                                                    tVar.f18719a = r45;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r46;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18724f = z25;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 6;
                                                                    objT = wk2.l.b(iVar3, l14, tVar);
                                                                    r48 = r46;
                                                                    r47 = r45;
                                                                    if (objT != aVar2) {
                                                                        bool = (Boolean) objT;
                                                                        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                            r48.replaceAll(new p(0));
                                                                            serializable2 = serializable;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                            r27 = 1;
                                                                        } else {
                                                                            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                if (bool == null) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                            } else if (z25) {
                                                                                tVar.f18719a = r47;
                                                                                tVar.f18720b = pVar4;
                                                                                tVar.f18721c = r48;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 7;
                                                                                if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                    pVar5 = pVar4;
                                                                                    r49 = r47;
                                                                                    r54 = r48;
                                                                                    wk2.d f205154d4 = r49.f18603d.getF205154d();
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = pVar5;
                                                                                    tVar.f18721c = r54;
                                                                                    tVar.f18722d = serializable;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 8;
                                                                                    objK = r49.k(f205154d4, "checksumMismatch", tVar);
                                                                                    r54 = r54;
                                                                                    r49 = r49;
                                                                                    if (objK != aVar2) {
                                                                                        tVar.f18719a = r49;
                                                                                        tVar.f18720b = r54;
                                                                                        tVar.f18721c = serializable;
                                                                                        tVar.f18722d = null;
                                                                                        tVar.f18725g = i15;
                                                                                        tVar.f18728j = 9;
                                                                                        objS = r49.s(pVar5, false, tVar);
                                                                                        if (objS != aVar2) {
                                                                                            return objS;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            serializable2 = serializable;
                                                                            r27 = i15;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                        }
                                                                        if (r27 == 0) {
                                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                            x53.c cVar2 = s0.f129406a;
                                                                            x53.b bVar = x53.b.f189152a;
                                                                            w wVar = new w(r25, null);
                                                                            tVar.f18719a = r25;
                                                                            tVar.f18720b = r26;
                                                                            tVar.f18721c = serializable2;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 10;
                                                                            break;
                                                                        }
                                                                        r29 = serializable2;
                                                                        r34 = r26;
                                                                        r28 = r25;
                                                                        arrayList = new ArrayList();
                                                                        while (r5.hasNext()) {
                                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                arrayList.add(obj);
                                                                            }
                                                                        }
                                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                        it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                        }
                                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                                        set = setG1;
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        if (!set.isEmpty()) {
                                                                            if (r29.f105804a) {
                                                                                size = r34.size();
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 1;
                                                                                size = r34.size() - 1;
                                                                            }
                                                                            if (size > i14) {
                                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                            }
                                                                            tVar.f18719a = r28;
                                                                            tVar.f18720b = r34;
                                                                            tVar.f18721c = null;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 11;
                                                                            Object objR2 = r28.r(set, tVar);
                                                                            r36 = r34;
                                                                            r35 = r28;
                                                                            break;
                                                                        }
                                                                        r35.f18712n.cancel();
                                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                        it3 = r36.iterator();
                                                                        while (it3.hasNext()) {
                                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                        }
                                                                        copyOnWriteArraySet = r35.f18711m;
                                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                                            pk2.x.f138495e.getClass();
                                                                            xVar = pk2.x.a.e();
                                                                        } else {
                                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                            pk2.x.a aVar4 = pk2.x.f138495e;
                                                                            ok2.e eVar2 = ok2.e.D;
                                                                            aVar4.getClass();
                                                                            eVar2.getClass();
                                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar2, null, null));
                                                                        }
                                                                        return cl2.c.d(arrayList3, xVar);
                                                                    }
                                                                }
                                                            } else {
                                                                r45 = r18;
                                                                l14 = null;
                                                                r46 = r17;
                                                                i15 = 0;
                                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                wk2.i iVar4 = r45.f18603d;
                                                                tVar.f18719a = r45;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r46;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 6;
                                                                objT = wk2.l.b(iVar4, l14, tVar);
                                                                r48 = r46;
                                                                r47 = r45;
                                                                if (objT != aVar2) {
                                                                    bool = (Boolean) objT;
                                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                        r48.replaceAll(new p(0));
                                                                        serializable2 = serializable;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                        r27 = 1;
                                                                    } else {
                                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                            if (bool == null) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                        } else if (z25) {
                                                                            tVar.f18719a = r47;
                                                                            tVar.f18720b = pVar4;
                                                                            tVar.f18721c = r48;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 7;
                                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                pVar5 = pVar4;
                                                                                r49 = r47;
                                                                                r54 = r48;
                                                                                wk2.d f205154d5 = r49.f18603d.getF205154d();
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = pVar5;
                                                                                tVar.f18721c = r54;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 8;
                                                                                objK = r49.k(f205154d5, "checksumMismatch", tVar);
                                                                                r54 = r54;
                                                                                r49 = r49;
                                                                                if (objK != aVar2) {
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = r54;
                                                                                    tVar.f18721c = serializable;
                                                                                    tVar.f18722d = null;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 9;
                                                                                    objS = r49.s(pVar5, false, tVar);
                                                                                    if (objS != aVar2) {
                                                                                        return objS;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        serializable2 = serializable;
                                                                        r27 = i15;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                    }
                                                                    if (r27 == 0) {
                                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                        x53.c cVar3 = s0.f129406a;
                                                                        x53.b bVar2 = x53.b.f189152a;
                                                                        w wVar2 = new w(r25, null);
                                                                        tVar.f18719a = r25;
                                                                        tVar.f18720b = r26;
                                                                        tVar.f18721c = serializable2;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 10;
                                                                        break;
                                                                    }
                                                                    r29 = serializable2;
                                                                    r34 = r26;
                                                                    r28 = r25;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR3 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar5 = pk2.x.f138495e;
                                                                        ok2.e eVar3 = ok2.e.D;
                                                                        aVar5.getClass();
                                                                        eVar3.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar3, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    it4 = r17.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            r29 = serializable;
                                                            r34 = r17;
                                                            r28 = r18;
                                                            arrayList = new ArrayList();
                                                            while (r5.hasNext()) {
                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                            it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                            }
                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                            set = setG1;
                                                            r36 = r34;
                                                            r35 = r28;
                                                            if (!set.isEmpty()) {
                                                                if (r29.f105804a) {
                                                                    size = r34.size();
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                    size = r34.size() - 1;
                                                                }
                                                                if (size > i14) {
                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                }
                                                                tVar.f18719a = r28;
                                                                tVar.f18720b = r34;
                                                                tVar.f18721c = null;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 11;
                                                                Object objR4 = r28.r(set, tVar);
                                                                r36 = r34;
                                                                r35 = r28;
                                                                break;
                                                            }
                                                            r35.f18712n.cancel();
                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                            it3 = r36.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                            }
                                                            copyOnWriteArraySet = r35.f18711m;
                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                pk2.x.f138495e.getClass();
                                                                xVar = pk2.x.a.e();
                                                            } else {
                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                pk2.x.a aVar6 = pk2.x.f138495e;
                                                                ok2.e eVar4 = ok2.e.D;
                                                                aVar6.getClass();
                                                                eVar4.getClass();
                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar4, null, null));
                                                            }
                                                            return cl2.c.d(arrayList3, xVar);
                                                        }
                                                        if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                            bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                            if (bVarC != null) {
                                                                UUID uuid2 = r18.f18603d.getF205152b().f185842a;
                                                                long j14 = r18.f18603d.getF205152b().f185845d;
                                                                tVar.f18719a = r18;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r17;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = 0;
                                                                tVar.f18728j = 5;
                                                                objT = bVarC.n(uuid2, j14, tVar);
                                                                if (objT != aVar2) {
                                                                    r39 = r18;
                                                                    r44 = r17;
                                                                    i15 = 0;
                                                                    l14 = (Long) objT;
                                                                    r46 = r44;
                                                                    r45 = r39;
                                                                    r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                    wk2.i iVar5 = r45.f18603d;
                                                                    tVar.f18719a = r45;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r46;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18724f = z25;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 6;
                                                                    objT = wk2.l.b(iVar5, l14, tVar);
                                                                    r48 = r46;
                                                                    r47 = r45;
                                                                    if (objT != aVar2) {
                                                                        bool = (Boolean) objT;
                                                                        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                            r48.replaceAll(new p(0));
                                                                            serializable2 = serializable;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                            r27 = 1;
                                                                        } else {
                                                                            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                if (bool == null) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                            } else if (z25) {
                                                                                tVar.f18719a = r47;
                                                                                tVar.f18720b = pVar4;
                                                                                tVar.f18721c = r48;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 7;
                                                                                if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                    pVar5 = pVar4;
                                                                                    r49 = r47;
                                                                                    r54 = r48;
                                                                                    wk2.d f205154d6 = r49.f18603d.getF205154d();
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = pVar5;
                                                                                    tVar.f18721c = r54;
                                                                                    tVar.f18722d = serializable;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 8;
                                                                                    objK = r49.k(f205154d6, "checksumMismatch", tVar);
                                                                                    r54 = r54;
                                                                                    r49 = r49;
                                                                                    if (objK != aVar2) {
                                                                                        tVar.f18719a = r49;
                                                                                        tVar.f18720b = r54;
                                                                                        tVar.f18721c = serializable;
                                                                                        tVar.f18722d = null;
                                                                                        tVar.f18725g = i15;
                                                                                        tVar.f18728j = 9;
                                                                                        objS = r49.s(pVar5, false, tVar);
                                                                                        if (objS != aVar2) {
                                                                                            return objS;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            serializable2 = serializable;
                                                                            r27 = i15;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                        }
                                                                        if (r27 == 0) {
                                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                            x53.c cVar4 = s0.f129406a;
                                                                            x53.b bVar3 = x53.b.f189152a;
                                                                            w wVar3 = new w(r25, null);
                                                                            tVar.f18719a = r25;
                                                                            tVar.f18720b = r26;
                                                                            tVar.f18721c = serializable2;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 10;
                                                                            break;
                                                                        }
                                                                        r29 = serializable2;
                                                                        r34 = r26;
                                                                        r28 = r25;
                                                                        arrayList = new ArrayList();
                                                                        while (r5.hasNext()) {
                                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                arrayList.add(obj);
                                                                            }
                                                                        }
                                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                        it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                        }
                                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                                        set = setG1;
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        if (!set.isEmpty()) {
                                                                            if (r29.f105804a) {
                                                                                size = r34.size();
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 1;
                                                                                size = r34.size() - 1;
                                                                            }
                                                                            if (size > i14) {
                                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                            }
                                                                            tVar.f18719a = r28;
                                                                            tVar.f18720b = r34;
                                                                            tVar.f18721c = null;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 11;
                                                                            Object objR5 = r28.r(set, tVar);
                                                                            r36 = r34;
                                                                            r35 = r28;
                                                                            break;
                                                                        }
                                                                        r35.f18712n.cancel();
                                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                        it3 = r36.iterator();
                                                                        while (it3.hasNext()) {
                                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                        }
                                                                        copyOnWriteArraySet = r35.f18711m;
                                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                                            pk2.x.f138495e.getClass();
                                                                            xVar = pk2.x.a.e();
                                                                        } else {
                                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                            pk2.x.a aVar7 = pk2.x.f138495e;
                                                                            ok2.e eVar5 = ok2.e.D;
                                                                            aVar7.getClass();
                                                                            eVar5.getClass();
                                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar5, null, null));
                                                                        }
                                                                        return cl2.c.d(arrayList3, xVar);
                                                                    }
                                                                }
                                                            } else {
                                                                r45 = r18;
                                                                l14 = null;
                                                                r46 = r17;
                                                                i15 = 0;
                                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                wk2.i iVar6 = r45.f18603d;
                                                                tVar.f18719a = r45;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r46;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 6;
                                                                objT = wk2.l.b(iVar6, l14, tVar);
                                                                r48 = r46;
                                                                r47 = r45;
                                                                if (objT != aVar2) {
                                                                    bool = (Boolean) objT;
                                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                        r48.replaceAll(new p(0));
                                                                        serializable2 = serializable;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                        r27 = 1;
                                                                    } else {
                                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                            if (bool == null) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                        } else if (z25) {
                                                                            tVar.f18719a = r47;
                                                                            tVar.f18720b = pVar4;
                                                                            tVar.f18721c = r48;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 7;
                                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                pVar5 = pVar4;
                                                                                r49 = r47;
                                                                                r54 = r48;
                                                                                wk2.d f205154d7 = r49.f18603d.getF205154d();
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = pVar5;
                                                                                tVar.f18721c = r54;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 8;
                                                                                objK = r49.k(f205154d7, "checksumMismatch", tVar);
                                                                                r54 = r54;
                                                                                r49 = r49;
                                                                                if (objK != aVar2) {
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = r54;
                                                                                    tVar.f18721c = serializable;
                                                                                    tVar.f18722d = null;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 9;
                                                                                    objS = r49.s(pVar5, false, tVar);
                                                                                    if (objS != aVar2) {
                                                                                        return objS;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        serializable2 = serializable;
                                                                        r27 = i15;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                    }
                                                                    if (r27 == 0) {
                                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                        x53.c cVar5 = s0.f129406a;
                                                                        x53.b bVar4 = x53.b.f189152a;
                                                                        w wVar4 = new w(r25, null);
                                                                        tVar.f18719a = r25;
                                                                        tVar.f18720b = r26;
                                                                        tVar.f18721c = serializable2;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 10;
                                                                        break;
                                                                    }
                                                                    r29 = serializable2;
                                                                    r34 = r26;
                                                                    r28 = r25;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR6 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar8 = pk2.x.f138495e;
                                                                        ok2.e eVar6 = ok2.e.D;
                                                                        aVar8.getClass();
                                                                        eVar6.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar6, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        z19 = z15;
                                        r111 = r110;
                                        list = r111.f18600a.getConfiguration().f132627g;
                                        vVar = new v(r111, f205154d2, arrayList4, null);
                                        aVar = new b41.a(r111, 4);
                                        tVar.f18719a = r111;
                                        tVar.f18720b = pVar2;
                                        tVar.f18721c = arrayList4;
                                        tVar.f18722d = m0Var;
                                        tVar.f18723e = null;
                                        tVar.f18724f = z19;
                                        tVar.f18728j = 4;
                                        f18709p.getClass();
                                        if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                            serializable = m0Var;
                                            r17 = arrayList4;
                                            z25 = z19;
                                            r18 = r111;
                                            pVar4 = pVar2;
                                            if (r17 != 0) {
                                                it4 = r17.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        r29 = serializable;
                                                        r34 = r17;
                                                        r28 = r18;
                                                        arrayList = new ArrayList();
                                                        while (r5.hasNext()) {
                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                        }
                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                        set = setG1;
                                                        r36 = r34;
                                                        r35 = r28;
                                                        if (!set.isEmpty()) {
                                                            if (r29.f105804a) {
                                                                size = r34.size();
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                size = r34.size() - 1;
                                                            }
                                                            if (size > i14) {
                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                            }
                                                            tVar.f18719a = r28;
                                                            tVar.f18720b = r34;
                                                            tVar.f18721c = null;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 11;
                                                            Object objR7 = r28.r(set, tVar);
                                                            r36 = r34;
                                                            r35 = r28;
                                                            break;
                                                        }
                                                        r35.f18712n.cancel();
                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                        it3 = r36.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                        }
                                                        copyOnWriteArraySet = r35.f18711m;
                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                            pk2.x.f138495e.getClass();
                                                            xVar = pk2.x.a.e();
                                                        } else {
                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                            pk2.x.a aVar9 = pk2.x.f138495e;
                                                            ok2.e eVar7 = ok2.e.D;
                                                            aVar9.getClass();
                                                            eVar7.getClass();
                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar7, null, null));
                                                        }
                                                        return cl2.c.d(arrayList3, xVar);
                                                    }
                                                    if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                        if (bVarC != null) {
                                                            UUID uuid3 = r18.f18603d.getF205152b().f185842a;
                                                            long j15 = r18.f18603d.getF205152b().f185845d;
                                                            tVar.f18719a = r18;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r17;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = 0;
                                                            tVar.f18728j = 5;
                                                            objT = bVarC.n(uuid3, j15, tVar);
                                                            if (objT != aVar2) {
                                                                r39 = r18;
                                                                r44 = r17;
                                                                i15 = 0;
                                                                l14 = (Long) objT;
                                                                r46 = r44;
                                                                r45 = r39;
                                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                wk2.i iVar7 = r45.f18603d;
                                                                tVar.f18719a = r45;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r46;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 6;
                                                                objT = wk2.l.b(iVar7, l14, tVar);
                                                                r48 = r46;
                                                                r47 = r45;
                                                                if (objT != aVar2) {
                                                                    bool = (Boolean) objT;
                                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                        r48.replaceAll(new p(0));
                                                                        serializable2 = serializable;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                        r27 = 1;
                                                                    } else {
                                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                            if (bool == null) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                        } else if (z25) {
                                                                            tVar.f18719a = r47;
                                                                            tVar.f18720b = pVar4;
                                                                            tVar.f18721c = r48;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 7;
                                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                pVar5 = pVar4;
                                                                                r49 = r47;
                                                                                r54 = r48;
                                                                                wk2.d f205154d8 = r49.f18603d.getF205154d();
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = pVar5;
                                                                                tVar.f18721c = r54;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 8;
                                                                                objK = r49.k(f205154d8, "checksumMismatch", tVar);
                                                                                r54 = r54;
                                                                                r49 = r49;
                                                                                if (objK != aVar2) {
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = r54;
                                                                                    tVar.f18721c = serializable;
                                                                                    tVar.f18722d = null;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 9;
                                                                                    objS = r49.s(pVar5, false, tVar);
                                                                                    if (objS != aVar2) {
                                                                                        return objS;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        serializable2 = serializable;
                                                                        r27 = i15;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                    }
                                                                    if (r27 == 0) {
                                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                        x53.c cVar6 = s0.f129406a;
                                                                        x53.b bVar5 = x53.b.f189152a;
                                                                        w wVar5 = new w(r25, null);
                                                                        tVar.f18719a = r25;
                                                                        tVar.f18720b = r26;
                                                                        tVar.f18721c = serializable2;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 10;
                                                                        break;
                                                                    }
                                                                    r29 = serializable2;
                                                                    r34 = r26;
                                                                    r28 = r25;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR8 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar10 = pk2.x.f138495e;
                                                                        ok2.e eVar8 = ok2.e.D;
                                                                        aVar10.getClass();
                                                                        eVar8.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar8, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        } else {
                                                            r45 = r18;
                                                            l14 = null;
                                                            r46 = r17;
                                                            i15 = 0;
                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                            wk2.i iVar8 = r45.f18603d;
                                                            tVar.f18719a = r45;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r46;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 6;
                                                            objT = wk2.l.b(iVar8, l14, tVar);
                                                            r48 = r46;
                                                            r47 = r45;
                                                            if (objT != aVar2) {
                                                                bool = (Boolean) objT;
                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                    r48.replaceAll(new p(0));
                                                                    serializable2 = serializable;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                    r27 = 1;
                                                                } else {
                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                        if (bool == null) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                    } else if (z25) {
                                                                        tVar.f18719a = r47;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r48;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 7;
                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                            pVar5 = pVar4;
                                                                            r49 = r47;
                                                                            r54 = r48;
                                                                            wk2.d f205154d9 = r49.f18603d.getF205154d();
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = pVar5;
                                                                            tVar.f18721c = r54;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 8;
                                                                            objK = r49.k(f205154d9, "checksumMismatch", tVar);
                                                                            r54 = r54;
                                                                            r49 = r49;
                                                                            if (objK != aVar2) {
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = r54;
                                                                                tVar.f18721c = serializable;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 9;
                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                if (objS != aVar2) {
                                                                                    return objS;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    serializable2 = serializable;
                                                                    r27 = i15;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                }
                                                                if (r27 == 0) {
                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                    x53.c cVar7 = s0.f129406a;
                                                                    x53.b bVar6 = x53.b.f189152a;
                                                                    w wVar6 = new w(r25, null);
                                                                    tVar.f18719a = r25;
                                                                    tVar.f18720b = r26;
                                                                    tVar.f18721c = serializable2;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 10;
                                                                    break;
                                                                }
                                                                r29 = serializable2;
                                                                r34 = r26;
                                                                r28 = r25;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR9 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar11 = pk2.x.f138495e;
                                                                    ok2.e eVar9 = ok2.e.D;
                                                                    aVar11.getClass();
                                                                    eVar9.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar9, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                it4 = r17.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        r29 = serializable;
                                                        r34 = r17;
                                                        r28 = r18;
                                                        arrayList = new ArrayList();
                                                        while (r5.hasNext()) {
                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                        }
                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                        set = setG1;
                                                        r36 = r34;
                                                        r35 = r28;
                                                        if (!set.isEmpty()) {
                                                            if (r29.f105804a) {
                                                                size = r34.size();
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                size = r34.size() - 1;
                                                            }
                                                            if (size > i14) {
                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                            }
                                                            tVar.f18719a = r28;
                                                            tVar.f18720b = r34;
                                                            tVar.f18721c = null;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 11;
                                                            Object objR10 = r28.r(set, tVar);
                                                            r36 = r34;
                                                            r35 = r28;
                                                            break;
                                                        }
                                                        r35.f18712n.cancel();
                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                        it3 = r36.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                        }
                                                        copyOnWriteArraySet = r35.f18711m;
                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                            pk2.x.f138495e.getClass();
                                                            xVar = pk2.x.a.e();
                                                        } else {
                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                            pk2.x.a aVar12 = pk2.x.f138495e;
                                                            ok2.e eVar10 = ok2.e.D;
                                                            aVar12.getClass();
                                                            eVar10.getClass();
                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar10, null, null));
                                                        }
                                                        return cl2.c.d(arrayList3, xVar);
                                                    }
                                                    if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                        if (bVarC != null) {
                                                            UUID uuid4 = r18.f18603d.getF205152b().f185842a;
                                                            long j16 = r18.f18603d.getF205152b().f185845d;
                                                            tVar.f18719a = r18;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r17;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = 0;
                                                            tVar.f18728j = 5;
                                                            objT = bVarC.n(uuid4, j16, tVar);
                                                            if (objT != aVar2) {
                                                                r39 = r18;
                                                                r44 = r17;
                                                                i15 = 0;
                                                                l14 = (Long) objT;
                                                                r46 = r44;
                                                                r45 = r39;
                                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                wk2.i iVar9 = r45.f18603d;
                                                                tVar.f18719a = r45;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r46;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 6;
                                                                objT = wk2.l.b(iVar9, l14, tVar);
                                                                r48 = r46;
                                                                r47 = r45;
                                                                if (objT != aVar2) {
                                                                    bool = (Boolean) objT;
                                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                        r48.replaceAll(new p(0));
                                                                        serializable2 = serializable;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                        r27 = 1;
                                                                    } else {
                                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                            if (bool == null) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                        } else if (z25) {
                                                                            tVar.f18719a = r47;
                                                                            tVar.f18720b = pVar4;
                                                                            tVar.f18721c = r48;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 7;
                                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                pVar5 = pVar4;
                                                                                r49 = r47;
                                                                                r54 = r48;
                                                                                wk2.d f205154d10 = r49.f18603d.getF205154d();
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = pVar5;
                                                                                tVar.f18721c = r54;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 8;
                                                                                objK = r49.k(f205154d10, "checksumMismatch", tVar);
                                                                                r54 = r54;
                                                                                r49 = r49;
                                                                                if (objK != aVar2) {
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = r54;
                                                                                    tVar.f18721c = serializable;
                                                                                    tVar.f18722d = null;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 9;
                                                                                    objS = r49.s(pVar5, false, tVar);
                                                                                    if (objS != aVar2) {
                                                                                        return objS;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        serializable2 = serializable;
                                                                        r27 = i15;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                    }
                                                                    if (r27 == 0) {
                                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                        x53.c cVar8 = s0.f129406a;
                                                                        x53.b bVar7 = x53.b.f189152a;
                                                                        w wVar7 = new w(r25, null);
                                                                        tVar.f18719a = r25;
                                                                        tVar.f18720b = r26;
                                                                        tVar.f18721c = serializable2;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 10;
                                                                        break;
                                                                    }
                                                                    r29 = serializable2;
                                                                    r34 = r26;
                                                                    r28 = r25;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR11 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar13 = pk2.x.f138495e;
                                                                        ok2.e eVar11 = ok2.e.D;
                                                                        aVar13.getClass();
                                                                        eVar11.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        } else {
                                                            r45 = r18;
                                                            l14 = null;
                                                            r46 = r17;
                                                            i15 = 0;
                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                            wk2.i iVar10 = r45.f18603d;
                                                            tVar.f18719a = r45;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r46;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 6;
                                                            objT = wk2.l.b(iVar10, l14, tVar);
                                                            r48 = r46;
                                                            r47 = r45;
                                                            if (objT != aVar2) {
                                                                bool = (Boolean) objT;
                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                    r48.replaceAll(new p(0));
                                                                    serializable2 = serializable;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                    r27 = 1;
                                                                } else {
                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                        if (bool == null) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                    } else if (z25) {
                                                                        tVar.f18719a = r47;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r48;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 7;
                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                            pVar5 = pVar4;
                                                                            r49 = r47;
                                                                            r54 = r48;
                                                                            wk2.d f205154d11 = r49.f18603d.getF205154d();
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = pVar5;
                                                                            tVar.f18721c = r54;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 8;
                                                                            objK = r49.k(f205154d11, "checksumMismatch", tVar);
                                                                            r54 = r54;
                                                                            r49 = r49;
                                                                            if (objK != aVar2) {
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = r54;
                                                                                tVar.f18721c = serializable;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 9;
                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                if (objS != aVar2) {
                                                                                    return objS;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    serializable2 = serializable;
                                                                    r27 = i15;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                }
                                                                if (r27 == 0) {
                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                    x53.c cVar9 = s0.f129406a;
                                                                    x53.b bVar8 = x53.b.f189152a;
                                                                    w wVar8 = new w(r25, null);
                                                                    tVar.f18719a = r25;
                                                                    tVar.f18720b = r26;
                                                                    tVar.f18721c = serializable2;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 10;
                                                                    break;
                                                                }
                                                                r29 = serializable2;
                                                                r34 = r26;
                                                                r28 = r25;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR12 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar14 = pk2.x.f138495e;
                                                                    ok2.e eVar12 = ok2.e.D;
                                                                    aVar14.getClass();
                                                                    eVar12.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar12, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    lk2.b bVarC2 = this.f18600a.c(this.f18602c.getF172493a());
                                    tVar.f18719a = this;
                                    tVar.f18720b = pVar6;
                                    z15 = z14;
                                    tVar.f18724f = z15;
                                    tVar.f18728j = 1;
                                    if (i(bVarC2, r55, pVar6, tVar) != aVar2) {
                                        r38 = this;
                                        r110 = r38;
                                        pVar2 = pVar6;
                                        try {
                                            iVar = r110.f18603d;
                                            f205154d2 = iVar.getF205154d();
                                            if (f205154d2 == null) {
                                                throw new CoreTransferException(ok2.e.f132644l, "No data available for upload: " + iVar.getF205154d(), null, 4, null);
                                            }
                                            if (f205154d2.getSize() < iVar.getF205152b().f185845d) {
                                                if (iVar.getF205163m() == null) {
                                                    throw new CoreTransferException(ok2.e.f132646n, "Transferred data was smaller than expected", null, 4, null);
                                                }
                                                r110.d().warn("Transferred data was smaller than expected: " + f205154d2.getSize() + " instead of " + iVar.getF205152b().f185845d);
                                            }
                                            try {
                                                f205154d3 = iVar.getF205154d();
                                                if (f205154d3 != null) {
                                                    f205154d3.a();
                                                }
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            arrayList4 = new ArrayList();
                                            r110.f18712n.schedule(new u(r110), f18710q);
                                            m0Var = new m0();
                                            f205163m = r110.f18603d.getF205163m();
                                            if (f205163m != null) {
                                                try {
                                                    try {
                                                        r110.f18603d.getClass();
                                                        bVarB = f205154d2.b();
                                                        tVar.f18719a = r110;
                                                        tVar.f18720b = pVar2;
                                                        tVar.f18721c = f205154d2;
                                                        tVar.f18722d = arrayList4;
                                                        tVar.f18723e = m0Var;
                                                        z17 = z15;
                                                        try {
                                                            tVar.f18724f = z17;
                                                            tVar.f18728j = 3;
                                                            if (f205163m.b(bVarB) != aVar2) {
                                                                pVar3 = pVar2;
                                                                z18 = z17;
                                                                r110 = r110;
                                                                pk2.x.f138495e.getClass();
                                                                arrayList4.add(new o13.p(pk2.x.a.e(), j0.f134944a));
                                                                wk2.i iVar11 = r110.f18603d;
                                                                wk2.l.c(iVar11, iVar11.getF205152b(), null);
                                                                z24 = true;
                                                                r112 = r110;
                                                                m0Var.f105804a = z24;
                                                                z19 = z18;
                                                                pVar2 = pVar3;
                                                                r111 = r112;
                                                                list = r111.f18600a.getConfiguration().f132627g;
                                                                vVar = new v(r111, f205154d2, arrayList4, null);
                                                                aVar = new b41.a(r111, 4);
                                                                tVar.f18719a = r111;
                                                                tVar.f18720b = pVar2;
                                                                tVar.f18721c = arrayList4;
                                                                tVar.f18722d = m0Var;
                                                                tVar.f18723e = null;
                                                                tVar.f18724f = z19;
                                                                tVar.f18728j = 4;
                                                                f18709p.getClass();
                                                                if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                                                    serializable = m0Var;
                                                                    r17 = arrayList4;
                                                                    z25 = z19;
                                                                    r18 = r111;
                                                                    pVar4 = pVar2;
                                                                    if (r17 != 0 || !r17.isEmpty()) {
                                                                        it4 = r17.iterator();
                                                                        while (true) {
                                                                            if (it4.hasNext()) {
                                                                                if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                                                    try {
                                                                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                                                        if (bVarC != null) {
                                                                                            try {
                                                                                                UUID uuid5 = r18.f18603d.getF205152b().f185842a;
                                                                                                long j17 = r18.f18603d.getF205152b().f185845d;
                                                                                                tVar.f18719a = r18;
                                                                                                tVar.f18720b = pVar4;
                                                                                                tVar.f18721c = r17;
                                                                                                tVar.f18722d = serializable;
                                                                                                tVar.f18724f = z25;
                                                                                                tVar.f18725g = 0;
                                                                                                tVar.f18728j = 5;
                                                                                                objT = bVarC.n(uuid5, j17, tVar);
                                                                                                if (objT != aVar2) {
                                                                                                    r39 = r18;
                                                                                                    r44 = r17;
                                                                                                    i15 = 0;
                                                                                                    try {
                                                                                                        l14 = (Long) objT;
                                                                                                        r46 = r44;
                                                                                                        r45 = r39;
                                                                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                                                        wk2.i iVar12 = r45.f18603d;
                                                                                                        tVar.f18719a = r45;
                                                                                                        tVar.f18720b = pVar4;
                                                                                                        tVar.f18721c = r46;
                                                                                                        tVar.f18722d = serializable;
                                                                                                        tVar.f18724f = z25;
                                                                                                        tVar.f18725g = i15;
                                                                                                        tVar.f18728j = 6;
                                                                                                        objT = wk2.l.b(iVar12, l14, tVar);
                                                                                                        r48 = r46;
                                                                                                        r47 = r45;
                                                                                                        if (objT != aVar2) {
                                                                                                            bool = (Boolean) objT;
                                                                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                                                                try {
                                                                                                                    r48.replaceAll(new p(0));
                                                                                                                    serializable2 = serializable;
                                                                                                                    r26 = r48;
                                                                                                                    r25 = r47;
                                                                                                                    r27 = 1;
                                                                                                                } catch (Throwable th3) {
                                                                                                                    th = th3;
                                                                                                                    r17 = r48;
                                                                                                                    r18 = r47;
                                                                                                                    r14 = 1;
                                                                                                                    r18.d().warn("Failed to request checksum for " + r18.f18603d.getF205152b().f185842a, th);
                                                                                                                    serializable2 = serializable;
                                                                                                                    r26 = r17;
                                                                                                                    r25 = r18;
                                                                                                                    r27 = r14;
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                                                    if (bool == null) {
                                                                                                                        throw new NoWhenBranchMatchedException();
                                                                                                                    }
                                                                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                                                                } else if (z25) {
                                                                                                                    tVar.f18719a = r47;
                                                                                                                    tVar.f18720b = pVar4;
                                                                                                                    tVar.f18721c = r48;
                                                                                                                    tVar.f18722d = serializable;
                                                                                                                    tVar.f18725g = i15;
                                                                                                                    tVar.f18728j = 7;
                                                                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                                                        pVar5 = pVar4;
                                                                                                                        r49 = r47;
                                                                                                                        r54 = r48;
                                                                                                                        try {
                                                                                                                            wk2.d f205154d12 = r49.f18603d.getF205154d();
                                                                                                                            tVar.f18719a = r49;
                                                                                                                            tVar.f18720b = pVar5;
                                                                                                                            tVar.f18721c = r54;
                                                                                                                            tVar.f18722d = serializable;
                                                                                                                            tVar.f18725g = i15;
                                                                                                                            tVar.f18728j = 8;
                                                                                                                            objK = r49.k(f205154d12, "checksumMismatch", tVar);
                                                                                                                            r54 = r54;
                                                                                                                            r49 = r49;
                                                                                                                            if (objK != aVar2) {
                                                                                                                                tVar.f18719a = r49;
                                                                                                                                tVar.f18720b = r54;
                                                                                                                                tVar.f18721c = serializable;
                                                                                                                                tVar.f18722d = null;
                                                                                                                                tVar.f18725g = i15;
                                                                                                                                tVar.f18728j = 9;
                                                                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                                                                if (objS != aVar2) {
                                                                                                                                    return objS;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Throwable th4) {
                                                                                                                            th = th4;
                                                                                                                            r14 = i15;
                                                                                                                            r24 = r54;
                                                                                                                            r19 = r49;
                                                                                                                            r17 = r24;
                                                                                                                            r18 = r19;
                                                                                                                            r18.d().warn("Failed to request checksum for " + r18.f18603d.getF205152b().f185842a, th);
                                                                                                                            serializable2 = serializable;
                                                                                                                            r26 = r17;
                                                                                                                            r25 = r18;
                                                                                                                            r27 = r14;
                                                                                                                            if (r27 == 0) {
                                                                                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                                                                x53.c cVar10 = s0.f129406a;
                                                                                                                                x53.b bVar9 = x53.b.f189152a;
                                                                                                                                w wVar9 = new w(r25, null);
                                                                                                                                tVar.f18719a = r25;
                                                                                                                                tVar.f18720b = r26;
                                                                                                                                tVar.f18721c = serializable2;
                                                                                                                                tVar.f18722d = null;
                                                                                                                                tVar.f18728j = 10;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            r29 = serializable2;
                                                                                                                            r34 = r26;
                                                                                                                            r28 = r25;
                                                                                                                            arrayList = new ArrayList();
                                                                                                                            for (Object obj : r34) {
                                                                                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                                                                    arrayList.add(obj);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                                                                            it = arrayList.iterator();
                                                                                                                            while (it.hasNext()) {
                                                                                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                                                                            }
                                                                                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                                                                                            set = setG1;
                                                                                                                            r36 = r34;
                                                                                                                            r35 = r28;
                                                                                                                            if (!set.isEmpty()) {
                                                                                                                                if (r29.f105804a) {
                                                                                                                                    i14 = 1;
                                                                                                                                    size = r34.size() - 1;
                                                                                                                                } else {
                                                                                                                                    size = r34.size();
                                                                                                                                    i14 = 1;
                                                                                                                                }
                                                                                                                                if (size > i14) {
                                                                                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                                                                }
                                                                                                                                tVar.f18719a = r28;
                                                                                                                                tVar.f18720b = r34;
                                                                                                                                tVar.f18721c = null;
                                                                                                                                tVar.f18722d = null;
                                                                                                                                tVar.f18728j = 11;
                                                                                                                                Object objR13 = r28.r(set, tVar);
                                                                                                                                r36 = r34;
                                                                                                                                r35 = r28;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            r35.f18712n.cancel();
                                                                                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                                                                            it3 = r36.iterator();
                                                                                                                            while (it3.hasNext()) {
                                                                                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                                                                            }
                                                                                                                            copyOnWriteArraySet = r35.f18711m;
                                                                                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                                                                                pk2.x.f138495e.getClass();
                                                                                                                                xVar = pk2.x.a.e();
                                                                                                                            } else {
                                                                                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                                                                pk2.x.a aVar15 = pk2.x.f138495e;
                                                                                                                                ok2.e eVar13 = ok2.e.D;
                                                                                                                                aVar15.getClass();
                                                                                                                                eVar13.getClass();
                                                                                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar13, null, null));
                                                                                                                            }
                                                                                                                            return cl2.c.d(arrayList3, xVar);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                serializable2 = serializable;
                                                                                                                r27 = i15;
                                                                                                                r26 = r48;
                                                                                                                r25 = r47;
                                                                                                            }
                                                                                                            if (r27 == 0) {
                                                                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                                                x53.c cVar11 = s0.f129406a;
                                                                                                                x53.b bVar10 = x53.b.f189152a;
                                                                                                                w wVar10 = new w(r25, null);
                                                                                                                tVar.f18719a = r25;
                                                                                                                tVar.f18720b = r26;
                                                                                                                tVar.f18721c = serializable2;
                                                                                                                tVar.f18722d = null;
                                                                                                                tVar.f18728j = 10;
                                                                                                                break;
                                                                                                            }
                                                                                                            r29 = serializable2;
                                                                                                            r34 = r26;
                                                                                                            r28 = r25;
                                                                                                            arrayList = new ArrayList();
                                                                                                            while (r5.hasNext()) {
                                                                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                                                    arrayList.add(obj);
                                                                                                                }
                                                                                                            }
                                                                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                                                            it = arrayList.iterator();
                                                                                                            while (it.hasNext()) {
                                                                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                                                            }
                                                                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                                                                            set = setG1;
                                                                                                            r36 = r34;
                                                                                                            r35 = r28;
                                                                                                            if (!set.isEmpty()) {
                                                                                                                if (r29.f105804a) {
                                                                                                                    size = r34.size();
                                                                                                                    i14 = 1;
                                                                                                                } else {
                                                                                                                    i14 = 1;
                                                                                                                    size = r34.size() - 1;
                                                                                                                }
                                                                                                                if (size > i14 && size != setG1.size()) {
                                                                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                                                }
                                                                                                                tVar.f18719a = r28;
                                                                                                                tVar.f18720b = r34;
                                                                                                                tVar.f18721c = null;
                                                                                                                tVar.f18722d = null;
                                                                                                                tVar.f18728j = 11;
                                                                                                                Object objR14 = r28.r(set, tVar);
                                                                                                                r36 = r34;
                                                                                                                r35 = r28;
                                                                                                                break;
                                                                                                            }
                                                                                                            r35.f18712n.cancel();
                                                                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                                                            it3 = r36.iterator();
                                                                                                            while (it3.hasNext()) {
                                                                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                                                            }
                                                                                                            copyOnWriteArraySet = r35.f18711m;
                                                                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                                                                pk2.x.f138495e.getClass();
                                                                                                                xVar = pk2.x.a.e();
                                                                                                            } else {
                                                                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                                                pk2.x.a aVar16 = pk2.x.f138495e;
                                                                                                                ok2.e eVar14 = ok2.e.D;
                                                                                                                aVar16.getClass();
                                                                                                                eVar14.getClass();
                                                                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar14, null, null));
                                                                                                            }
                                                                                                            return cl2.c.d(arrayList3, xVar);
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        th = th5;
                                                                                                        r14 = i15;
                                                                                                        r16 = r44;
                                                                                                        r15 = r39;
                                                                                                        r17 = r16;
                                                                                                        r18 = r15;
                                                                                                        r18.d().warn("Failed to request checksum for " + r18.f18603d.getF205152b().f185842a, th);
                                                                                                        serializable2 = serializable;
                                                                                                        r26 = r17;
                                                                                                        r25 = r18;
                                                                                                        r27 = r14;
                                                                                                        if (r27 == 0) {
                                                                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                                            x53.c cVar12 = s0.f129406a;
                                                                                                            x53.b bVar11 = x53.b.f189152a;
                                                                                                            w wVar11 = new w(r25, null);
                                                                                                            tVar.f18719a = r25;
                                                                                                            tVar.f18720b = r26;
                                                                                                            tVar.f18721c = serializable2;
                                                                                                            tVar.f18722d = null;
                                                                                                            tVar.f18728j = 10;
                                                                                                            break;
                                                                                                        }
                                                                                                        r29 = serializable2;
                                                                                                        r34 = r26;
                                                                                                        r28 = r25;
                                                                                                        arrayList = new ArrayList();
                                                                                                        while (r5.hasNext()) {
                                                                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                                                arrayList.add(obj);
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                                                        it = arrayList.iterator();
                                                                                                        while (it.hasNext()) {
                                                                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                                                        }
                                                                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                                                                        set = setG1;
                                                                                                        r36 = r34;
                                                                                                        r35 = r28;
                                                                                                        if (!set.isEmpty()) {
                                                                                                            if (r29.f105804a) {
                                                                                                                size = r34.size();
                                                                                                                i14 = 1;
                                                                                                            } else {
                                                                                                                i14 = 1;
                                                                                                                size = r34.size() - 1;
                                                                                                            }
                                                                                                            if (size > i14) {
                                                                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                                            }
                                                                                                            tVar.f18719a = r28;
                                                                                                            tVar.f18720b = r34;
                                                                                                            tVar.f18721c = null;
                                                                                                            tVar.f18722d = null;
                                                                                                            tVar.f18728j = 11;
                                                                                                            Object objR15 = r28.r(set, tVar);
                                                                                                            r36 = r34;
                                                                                                            r35 = r28;
                                                                                                            break;
                                                                                                        }
                                                                                                        r35.f18712n.cancel();
                                                                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                                                        it3 = r36.iterator();
                                                                                                        while (it3.hasNext()) {
                                                                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                                                        }
                                                                                                        copyOnWriteArraySet = r35.f18711m;
                                                                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                                                                            pk2.x.f138495e.getClass();
                                                                                                            xVar = pk2.x.a.e();
                                                                                                        } else {
                                                                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                                            pk2.x.a aVar17 = pk2.x.f138495e;
                                                                                                            ok2.e eVar15 = ok2.e.D;
                                                                                                            aVar17.getClass();
                                                                                                            eVar15.getClass();
                                                                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar15, null, null));
                                                                                                        }
                                                                                                        return cl2.c.d(arrayList3, xVar);
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                r14 = 0;
                                                                                                r18.d().warn("Failed to request checksum for " + r18.f18603d.getF205152b().f185842a, th);
                                                                                                serializable2 = serializable;
                                                                                                r26 = r17;
                                                                                                r25 = r18;
                                                                                                r27 = r14;
                                                                                                if (r27 == 0) {
                                                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                                    x53.c cVar13 = s0.f129406a;
                                                                                                    x53.b bVar12 = x53.b.f189152a;
                                                                                                    w wVar12 = new w(r25, null);
                                                                                                    tVar.f18719a = r25;
                                                                                                    tVar.f18720b = r26;
                                                                                                    tVar.f18721c = serializable2;
                                                                                                    tVar.f18722d = null;
                                                                                                    tVar.f18728j = 10;
                                                                                                    break;
                                                                                                }
                                                                                                r29 = serializable2;
                                                                                                r34 = r26;
                                                                                                r28 = r25;
                                                                                                arrayList = new ArrayList();
                                                                                                while (r5.hasNext()) {
                                                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                                        arrayList.add(obj);
                                                                                                    }
                                                                                                }
                                                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                                                it = arrayList.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                                                }
                                                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                                                set = setG1;
                                                                                                r36 = r34;
                                                                                                r35 = r28;
                                                                                                if (!set.isEmpty()) {
                                                                                                    if (r29.f105804a) {
                                                                                                        size = r34.size();
                                                                                                        i14 = 1;
                                                                                                    } else {
                                                                                                        i14 = 1;
                                                                                                        size = r34.size() - 1;
                                                                                                    }
                                                                                                    if (size > i14) {
                                                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                                    }
                                                                                                    tVar.f18719a = r28;
                                                                                                    tVar.f18720b = r34;
                                                                                                    tVar.f18721c = null;
                                                                                                    tVar.f18722d = null;
                                                                                                    tVar.f18728j = 11;
                                                                                                    Object objR16 = r28.r(set, tVar);
                                                                                                    r36 = r34;
                                                                                                    r35 = r28;
                                                                                                    break;
                                                                                                }
                                                                                                r35.f18712n.cancel();
                                                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                                                it3 = r36.iterator();
                                                                                                while (it3.hasNext()) {
                                                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                                                }
                                                                                                copyOnWriteArraySet = r35.f18711m;
                                                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                                                    pk2.x.f138495e.getClass();
                                                                                                    xVar = pk2.x.a.e();
                                                                                                } else {
                                                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                                    pk2.x.a aVar18 = pk2.x.f138495e;
                                                                                                    ok2.e eVar16 = ok2.e.D;
                                                                                                    aVar18.getClass();
                                                                                                    eVar16.getClass();
                                                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar16, null, null));
                                                                                                }
                                                                                                return cl2.c.d(arrayList3, xVar);
                                                                                            }
                                                                                        } else {
                                                                                            r45 = r18;
                                                                                            l14 = null;
                                                                                            r46 = r17;
                                                                                            i15 = 0;
                                                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                                            wk2.i iVar13 = r45.f18603d;
                                                                                            tVar.f18719a = r45;
                                                                                            tVar.f18720b = pVar4;
                                                                                            tVar.f18721c = r46;
                                                                                            tVar.f18722d = serializable;
                                                                                            tVar.f18724f = z25;
                                                                                            tVar.f18725g = i15;
                                                                                            tVar.f18728j = 6;
                                                                                            objT = wk2.l.b(iVar13, l14, tVar);
                                                                                            r48 = r46;
                                                                                            r47 = r45;
                                                                                            if (objT != aVar2) {
                                                                                                bool = (Boolean) objT;
                                                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                                                    r48.replaceAll(new p(0));
                                                                                                    serializable2 = serializable;
                                                                                                    r26 = r48;
                                                                                                    r25 = r47;
                                                                                                    r27 = 1;
                                                                                                } else {
                                                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                                        if (bool == null) {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                                                    } else if (z25) {
                                                                                                        tVar.f18719a = r47;
                                                                                                        tVar.f18720b = pVar4;
                                                                                                        tVar.f18721c = r48;
                                                                                                        tVar.f18722d = serializable;
                                                                                                        tVar.f18725g = i15;
                                                                                                        tVar.f18728j = 7;
                                                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                                            pVar5 = pVar4;
                                                                                                            r49 = r47;
                                                                                                            r54 = r48;
                                                                                                            wk2.d f205154d13 = r49.f18603d.getF205154d();
                                                                                                            tVar.f18719a = r49;
                                                                                                            tVar.f18720b = pVar5;
                                                                                                            tVar.f18721c = r54;
                                                                                                            tVar.f18722d = serializable;
                                                                                                            tVar.f18725g = i15;
                                                                                                            tVar.f18728j = 8;
                                                                                                            objK = r49.k(f205154d13, "checksumMismatch", tVar);
                                                                                                            r54 = r54;
                                                                                                            r49 = r49;
                                                                                                            if (objK != aVar2) {
                                                                                                                tVar.f18719a = r49;
                                                                                                                tVar.f18720b = r54;
                                                                                                                tVar.f18721c = serializable;
                                                                                                                tVar.f18722d = null;
                                                                                                                tVar.f18725g = i15;
                                                                                                                tVar.f18728j = 9;
                                                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                                                if (objS != aVar2) {
                                                                                                                    return objS;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    serializable2 = serializable;
                                                                                                    r27 = i15;
                                                                                                    r26 = r48;
                                                                                                    r25 = r47;
                                                                                                }
                                                                                                if (r27 == 0) {
                                                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                                    x53.c cVar14 = s0.f129406a;
                                                                                                    x53.b bVar13 = x53.b.f189152a;
                                                                                                    w wVar13 = new w(r25, null);
                                                                                                    tVar.f18719a = r25;
                                                                                                    tVar.f18720b = r26;
                                                                                                    tVar.f18721c = serializable2;
                                                                                                    tVar.f18722d = null;
                                                                                                    tVar.f18728j = 10;
                                                                                                    break;
                                                                                                }
                                                                                                r29 = serializable2;
                                                                                                r34 = r26;
                                                                                                r28 = r25;
                                                                                                arrayList = new ArrayList();
                                                                                                while (r5.hasNext()) {
                                                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                                        arrayList.add(obj);
                                                                                                    }
                                                                                                }
                                                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                                                it = arrayList.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                                                }
                                                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                                                set = setG1;
                                                                                                r36 = r34;
                                                                                                r35 = r28;
                                                                                                if (!set.isEmpty()) {
                                                                                                    if (r29.f105804a) {
                                                                                                        size = r34.size();
                                                                                                        i14 = 1;
                                                                                                    } else {
                                                                                                        i14 = 1;
                                                                                                        size = r34.size() - 1;
                                                                                                    }
                                                                                                    if (size > i14) {
                                                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                                    }
                                                                                                    tVar.f18719a = r28;
                                                                                                    tVar.f18720b = r34;
                                                                                                    tVar.f18721c = null;
                                                                                                    tVar.f18722d = null;
                                                                                                    tVar.f18728j = 11;
                                                                                                    Object objR17 = r28.r(set, tVar);
                                                                                                    r36 = r34;
                                                                                                    r35 = r28;
                                                                                                    break;
                                                                                                }
                                                                                                r35.f18712n.cancel();
                                                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                                                it3 = r36.iterator();
                                                                                                while (it3.hasNext()) {
                                                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                                                }
                                                                                                copyOnWriteArraySet = r35.f18711m;
                                                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                                                    pk2.x.f138495e.getClass();
                                                                                                    xVar = pk2.x.a.e();
                                                                                                } else {
                                                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                                    pk2.x.a aVar19 = pk2.x.f138495e;
                                                                                                    ok2.e eVar17 = ok2.e.D;
                                                                                                    aVar19.getClass();
                                                                                                    eVar17.getClass();
                                                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar17, null, null));
                                                                                                }
                                                                                                return cl2.c.d(arrayList3, xVar);
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th7) {
                                                                                        th = th7;
                                                                                        r14 = 0;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    r29 = serializable;
                                                                    r34 = r17;
                                                                    r28 = r18;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR18 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar110 = pk2.x.f138495e;
                                                                        ok2.e eVar18 = ok2.e.D;
                                                                        aVar110.getClass();
                                                                        eVar18.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar18, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            pVar3 = pVar2;
                                                            z18 = z17;
                                                            r110.d().warn("Failed app provided processData(" + r110.f18603d.getId() + ")", (Throwable) e);
                                                            CoreTransferException coreTransferException = new CoreTransferException(ok2.e.A, e);
                                                            pk2.x.f138495e.getClass();
                                                            arrayList4.add(new o13.p(pk2.x.a.d(coreTransferException), j0.f134944a));
                                                            wk2.i iVar14 = r110.f18603d;
                                                            wk2.l.c(iVar14, iVar14.getF205152b(), coreTransferException);
                                                            z24 = true;
                                                            r112 = r110;
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        z17 = z15;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    z16 = true;
                                                    m0Var.f105804a = z16;
                                                    throw th;
                                                }
                                            } else {
                                                z19 = z15;
                                                r111 = r110;
                                                list = r111.f18600a.getConfiguration().f132627g;
                                                vVar = new v(r111, f205154d2, arrayList4, null);
                                                aVar = new b41.a(r111, 4);
                                                tVar.f18719a = r111;
                                                tVar.f18720b = pVar2;
                                                tVar.f18721c = arrayList4;
                                                tVar.f18722d = m0Var;
                                                tVar.f18723e = null;
                                                tVar.f18724f = z19;
                                                tVar.f18728j = 4;
                                                f18709p.getClass();
                                                if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                                    serializable = m0Var;
                                                    r17 = arrayList4;
                                                    z25 = z19;
                                                    r18 = r111;
                                                    pVar4 = pVar2;
                                                    if (r17 != 0) {
                                                        it4 = r17.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                r29 = serializable;
                                                                r34 = r17;
                                                                r28 = r18;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR19 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar111 = pk2.x.f138495e;
                                                                    ok2.e eVar19 = ok2.e.D;
                                                                    aVar111.getClass();
                                                                    eVar19.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar19, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                            if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                                bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                                if (bVarC != null) {
                                                                    UUID uuid6 = r18.f18603d.getF205152b().f185842a;
                                                                    long j18 = r18.f18603d.getF205152b().f185845d;
                                                                    tVar.f18719a = r18;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r17;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18724f = z25;
                                                                    tVar.f18725g = 0;
                                                                    tVar.f18728j = 5;
                                                                    objT = bVarC.n(uuid6, j18, tVar);
                                                                    if (objT != aVar2) {
                                                                        r39 = r18;
                                                                        r44 = r17;
                                                                        i15 = 0;
                                                                        l14 = (Long) objT;
                                                                        r46 = r44;
                                                                        r45 = r39;
                                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                        wk2.i iVar15 = r45.f18603d;
                                                                        tVar.f18719a = r45;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r46;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18724f = z25;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 6;
                                                                        objT = wk2.l.b(iVar15, l14, tVar);
                                                                        r48 = r46;
                                                                        r47 = r45;
                                                                        if (objT != aVar2) {
                                                                            bool = (Boolean) objT;
                                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                                r48.replaceAll(new p(0));
                                                                                serializable2 = serializable;
                                                                                r26 = r48;
                                                                                r25 = r47;
                                                                                r27 = 1;
                                                                            } else {
                                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                    if (bool == null) {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                                } else if (z25) {
                                                                                    tVar.f18719a = r47;
                                                                                    tVar.f18720b = pVar4;
                                                                                    tVar.f18721c = r48;
                                                                                    tVar.f18722d = serializable;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 7;
                                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                        pVar5 = pVar4;
                                                                                        r49 = r47;
                                                                                        r54 = r48;
                                                                                        wk2.d f205154d14 = r49.f18603d.getF205154d();
                                                                                        tVar.f18719a = r49;
                                                                                        tVar.f18720b = pVar5;
                                                                                        tVar.f18721c = r54;
                                                                                        tVar.f18722d = serializable;
                                                                                        tVar.f18725g = i15;
                                                                                        tVar.f18728j = 8;
                                                                                        objK = r49.k(f205154d14, "checksumMismatch", tVar);
                                                                                        r54 = r54;
                                                                                        r49 = r49;
                                                                                        if (objK != aVar2) {
                                                                                            tVar.f18719a = r49;
                                                                                            tVar.f18720b = r54;
                                                                                            tVar.f18721c = serializable;
                                                                                            tVar.f18722d = null;
                                                                                            tVar.f18725g = i15;
                                                                                            tVar.f18728j = 9;
                                                                                            objS = r49.s(pVar5, false, tVar);
                                                                                            if (objS != aVar2) {
                                                                                                return objS;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                serializable2 = serializable;
                                                                                r27 = i15;
                                                                                r26 = r48;
                                                                                r25 = r47;
                                                                            }
                                                                            if (r27 == 0) {
                                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                x53.c cVar15 = s0.f129406a;
                                                                                x53.b bVar14 = x53.b.f189152a;
                                                                                w wVar14 = new w(r25, null);
                                                                                tVar.f18719a = r25;
                                                                                tVar.f18720b = r26;
                                                                                tVar.f18721c = serializable2;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18728j = 10;
                                                                                break;
                                                                            }
                                                                            r29 = serializable2;
                                                                            r34 = r26;
                                                                            r28 = r25;
                                                                            arrayList = new ArrayList();
                                                                            while (r5.hasNext()) {
                                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                    arrayList.add(obj);
                                                                                }
                                                                            }
                                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                            it = arrayList.iterator();
                                                                            while (it.hasNext()) {
                                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                            }
                                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                                            set = setG1;
                                                                            r36 = r34;
                                                                            r35 = r28;
                                                                            if (!set.isEmpty()) {
                                                                                if (r29.f105804a) {
                                                                                    size = r34.size();
                                                                                    i14 = 1;
                                                                                } else {
                                                                                    i14 = 1;
                                                                                    size = r34.size() - 1;
                                                                                }
                                                                                if (size > i14) {
                                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                }
                                                                                tVar.f18719a = r28;
                                                                                tVar.f18720b = r34;
                                                                                tVar.f18721c = null;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18728j = 11;
                                                                                Object objR110 = r28.r(set, tVar);
                                                                                r36 = r34;
                                                                                r35 = r28;
                                                                                break;
                                                                            }
                                                                            r35.f18712n.cancel();
                                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                            it3 = r36.iterator();
                                                                            while (it3.hasNext()) {
                                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                            }
                                                                            copyOnWriteArraySet = r35.f18711m;
                                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                                pk2.x.f138495e.getClass();
                                                                                xVar = pk2.x.a.e();
                                                                            } else {
                                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                pk2.x.a aVar112 = pk2.x.f138495e;
                                                                                ok2.e eVar110 = ok2.e.D;
                                                                                aVar112.getClass();
                                                                                eVar110.getClass();
                                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar110, null, null));
                                                                            }
                                                                            return cl2.c.d(arrayList3, xVar);
                                                                        }
                                                                    }
                                                                } else {
                                                                    r45 = r18;
                                                                    l14 = null;
                                                                    r46 = r17;
                                                                    i15 = 0;
                                                                    r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                    wk2.i iVar16 = r45.f18603d;
                                                                    tVar.f18719a = r45;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r46;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18724f = z25;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 6;
                                                                    objT = wk2.l.b(iVar16, l14, tVar);
                                                                    r48 = r46;
                                                                    r47 = r45;
                                                                    if (objT != aVar2) {
                                                                        bool = (Boolean) objT;
                                                                        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                            r48.replaceAll(new p(0));
                                                                            serializable2 = serializable;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                            r27 = 1;
                                                                        } else {
                                                                            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                if (bool == null) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                            } else if (z25) {
                                                                                tVar.f18719a = r47;
                                                                                tVar.f18720b = pVar4;
                                                                                tVar.f18721c = r48;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 7;
                                                                                if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                    pVar5 = pVar4;
                                                                                    r49 = r47;
                                                                                    r54 = r48;
                                                                                    wk2.d f205154d15 = r49.f18603d.getF205154d();
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = pVar5;
                                                                                    tVar.f18721c = r54;
                                                                                    tVar.f18722d = serializable;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 8;
                                                                                    objK = r49.k(f205154d15, "checksumMismatch", tVar);
                                                                                    r54 = r54;
                                                                                    r49 = r49;
                                                                                    if (objK != aVar2) {
                                                                                        tVar.f18719a = r49;
                                                                                        tVar.f18720b = r54;
                                                                                        tVar.f18721c = serializable;
                                                                                        tVar.f18722d = null;
                                                                                        tVar.f18725g = i15;
                                                                                        tVar.f18728j = 9;
                                                                                        objS = r49.s(pVar5, false, tVar);
                                                                                        if (objS != aVar2) {
                                                                                            return objS;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            serializable2 = serializable;
                                                                            r27 = i15;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                        }
                                                                        if (r27 == 0) {
                                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                            x53.c cVar16 = s0.f129406a;
                                                                            x53.b bVar15 = x53.b.f189152a;
                                                                            w wVar15 = new w(r25, null);
                                                                            tVar.f18719a = r25;
                                                                            tVar.f18720b = r26;
                                                                            tVar.f18721c = serializable2;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 10;
                                                                            break;
                                                                        }
                                                                        r29 = serializable2;
                                                                        r34 = r26;
                                                                        r28 = r25;
                                                                        arrayList = new ArrayList();
                                                                        while (r5.hasNext()) {
                                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                arrayList.add(obj);
                                                                            }
                                                                        }
                                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                        it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                        }
                                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                                        set = setG1;
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        if (!set.isEmpty()) {
                                                                            if (r29.f105804a) {
                                                                                size = r34.size();
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 1;
                                                                                size = r34.size() - 1;
                                                                            }
                                                                            if (size > i14) {
                                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                            }
                                                                            tVar.f18719a = r28;
                                                                            tVar.f18720b = r34;
                                                                            tVar.f18721c = null;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 11;
                                                                            Object objR111 = r28.r(set, tVar);
                                                                            r36 = r34;
                                                                            r35 = r28;
                                                                            break;
                                                                        }
                                                                        r35.f18712n.cancel();
                                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                        it3 = r36.iterator();
                                                                        while (it3.hasNext()) {
                                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                        }
                                                                        copyOnWriteArraySet = r35.f18711m;
                                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                                            pk2.x.f138495e.getClass();
                                                                            xVar = pk2.x.a.e();
                                                                        } else {
                                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                            pk2.x.a aVar113 = pk2.x.f138495e;
                                                                            ok2.e eVar111 = ok2.e.D;
                                                                            aVar113.getClass();
                                                                            eVar111.getClass();
                                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar111, null, null));
                                                                        }
                                                                        return cl2.c.d(arrayList3, xVar);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        it4 = r17.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                r29 = serializable;
                                                                r34 = r17;
                                                                r28 = r18;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR112 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar114 = pk2.x.f138495e;
                                                                    ok2.e eVar112 = ok2.e.D;
                                                                    aVar114.getClass();
                                                                    eVar112.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar112, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                            if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                                bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                                if (bVarC != null) {
                                                                    UUID uuid7 = r18.f18603d.getF205152b().f185842a;
                                                                    long j19 = r18.f18603d.getF205152b().f185845d;
                                                                    tVar.f18719a = r18;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r17;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18724f = z25;
                                                                    tVar.f18725g = 0;
                                                                    tVar.f18728j = 5;
                                                                    objT = bVarC.n(uuid7, j19, tVar);
                                                                    if (objT != aVar2) {
                                                                        r39 = r18;
                                                                        r44 = r17;
                                                                        i15 = 0;
                                                                        l14 = (Long) objT;
                                                                        r46 = r44;
                                                                        r45 = r39;
                                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                        wk2.i iVar17 = r45.f18603d;
                                                                        tVar.f18719a = r45;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r46;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18724f = z25;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 6;
                                                                        objT = wk2.l.b(iVar17, l14, tVar);
                                                                        r48 = r46;
                                                                        r47 = r45;
                                                                        if (objT != aVar2) {
                                                                            bool = (Boolean) objT;
                                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                                r48.replaceAll(new p(0));
                                                                                serializable2 = serializable;
                                                                                r26 = r48;
                                                                                r25 = r47;
                                                                                r27 = 1;
                                                                            } else {
                                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                    if (bool == null) {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                                } else if (z25) {
                                                                                    tVar.f18719a = r47;
                                                                                    tVar.f18720b = pVar4;
                                                                                    tVar.f18721c = r48;
                                                                                    tVar.f18722d = serializable;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 7;
                                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                        pVar5 = pVar4;
                                                                                        r49 = r47;
                                                                                        r54 = r48;
                                                                                        wk2.d f205154d16 = r49.f18603d.getF205154d();
                                                                                        tVar.f18719a = r49;
                                                                                        tVar.f18720b = pVar5;
                                                                                        tVar.f18721c = r54;
                                                                                        tVar.f18722d = serializable;
                                                                                        tVar.f18725g = i15;
                                                                                        tVar.f18728j = 8;
                                                                                        objK = r49.k(f205154d16, "checksumMismatch", tVar);
                                                                                        r54 = r54;
                                                                                        r49 = r49;
                                                                                        if (objK != aVar2) {
                                                                                            tVar.f18719a = r49;
                                                                                            tVar.f18720b = r54;
                                                                                            tVar.f18721c = serializable;
                                                                                            tVar.f18722d = null;
                                                                                            tVar.f18725g = i15;
                                                                                            tVar.f18728j = 9;
                                                                                            objS = r49.s(pVar5, false, tVar);
                                                                                            if (objS != aVar2) {
                                                                                                return objS;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                serializable2 = serializable;
                                                                                r27 = i15;
                                                                                r26 = r48;
                                                                                r25 = r47;
                                                                            }
                                                                            if (r27 == 0) {
                                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                                x53.c cVar17 = s0.f129406a;
                                                                                x53.b bVar16 = x53.b.f189152a;
                                                                                w wVar16 = new w(r25, null);
                                                                                tVar.f18719a = r25;
                                                                                tVar.f18720b = r26;
                                                                                tVar.f18721c = serializable2;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18728j = 10;
                                                                                break;
                                                                            }
                                                                            r29 = serializable2;
                                                                            r34 = r26;
                                                                            r28 = r25;
                                                                            arrayList = new ArrayList();
                                                                            while (r5.hasNext()) {
                                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                    arrayList.add(obj);
                                                                                }
                                                                            }
                                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                            it = arrayList.iterator();
                                                                            while (it.hasNext()) {
                                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                            }
                                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                                            set = setG1;
                                                                            r36 = r34;
                                                                            r35 = r28;
                                                                            if (!set.isEmpty()) {
                                                                                if (r29.f105804a) {
                                                                                    size = r34.size();
                                                                                    i14 = 1;
                                                                                } else {
                                                                                    i14 = 1;
                                                                                    size = r34.size() - 1;
                                                                                }
                                                                                if (size > i14) {
                                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                                }
                                                                                tVar.f18719a = r28;
                                                                                tVar.f18720b = r34;
                                                                                tVar.f18721c = null;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18728j = 11;
                                                                                Object objR113 = r28.r(set, tVar);
                                                                                r36 = r34;
                                                                                r35 = r28;
                                                                                break;
                                                                            }
                                                                            r35.f18712n.cancel();
                                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                            it3 = r36.iterator();
                                                                            while (it3.hasNext()) {
                                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                            }
                                                                            copyOnWriteArraySet = r35.f18711m;
                                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                                pk2.x.f138495e.getClass();
                                                                                xVar = pk2.x.a.e();
                                                                            } else {
                                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                                pk2.x.a aVar115 = pk2.x.f138495e;
                                                                                ok2.e eVar113 = ok2.e.D;
                                                                                aVar115.getClass();
                                                                                eVar113.getClass();
                                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar113, null, null));
                                                                            }
                                                                            return cl2.c.d(arrayList3, xVar);
                                                                        }
                                                                    }
                                                                } else {
                                                                    r45 = r18;
                                                                    l14 = null;
                                                                    r46 = r17;
                                                                    i15 = 0;
                                                                    r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                    wk2.i iVar18 = r45.f18603d;
                                                                    tVar.f18719a = r45;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r46;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18724f = z25;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 6;
                                                                    objT = wk2.l.b(iVar18, l14, tVar);
                                                                    r48 = r46;
                                                                    r47 = r45;
                                                                    if (objT != aVar2) {
                                                                        bool = (Boolean) objT;
                                                                        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                            r48.replaceAll(new p(0));
                                                                            serializable2 = serializable;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                            r27 = 1;
                                                                        } else {
                                                                            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                                if (bool == null) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                            } else if (z25) {
                                                                                tVar.f18719a = r47;
                                                                                tVar.f18720b = pVar4;
                                                                                tVar.f18721c = r48;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 7;
                                                                                if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                    pVar5 = pVar4;
                                                                                    r49 = r47;
                                                                                    r54 = r48;
                                                                                    wk2.d f205154d17 = r49.f18603d.getF205154d();
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = pVar5;
                                                                                    tVar.f18721c = r54;
                                                                                    tVar.f18722d = serializable;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 8;
                                                                                    objK = r49.k(f205154d17, "checksumMismatch", tVar);
                                                                                    r54 = r54;
                                                                                    r49 = r49;
                                                                                    if (objK != aVar2) {
                                                                                        tVar.f18719a = r49;
                                                                                        tVar.f18720b = r54;
                                                                                        tVar.f18721c = serializable;
                                                                                        tVar.f18722d = null;
                                                                                        tVar.f18725g = i15;
                                                                                        tVar.f18728j = 9;
                                                                                        objS = r49.s(pVar5, false, tVar);
                                                                                        if (objS != aVar2) {
                                                                                            return objS;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            serializable2 = serializable;
                                                                            r27 = i15;
                                                                            r26 = r48;
                                                                            r25 = r47;
                                                                        }
                                                                        if (r27 == 0) {
                                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                            x53.c cVar18 = s0.f129406a;
                                                                            x53.b bVar17 = x53.b.f189152a;
                                                                            w wVar17 = new w(r25, null);
                                                                            tVar.f18719a = r25;
                                                                            tVar.f18720b = r26;
                                                                            tVar.f18721c = serializable2;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 10;
                                                                            break;
                                                                        }
                                                                        r29 = serializable2;
                                                                        r34 = r26;
                                                                        r28 = r25;
                                                                        arrayList = new ArrayList();
                                                                        while (r5.hasNext()) {
                                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                                arrayList.add(obj);
                                                                            }
                                                                        }
                                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                        it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                        }
                                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                                        set = setG1;
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        if (!set.isEmpty()) {
                                                                            if (r29.f105804a) {
                                                                                size = r34.size();
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 1;
                                                                                size = r34.size() - 1;
                                                                            }
                                                                            if (size > i14) {
                                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                            }
                                                                            tVar.f18719a = r28;
                                                                            tVar.f18720b = r34;
                                                                            tVar.f18721c = null;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18728j = 11;
                                                                            Object objR114 = r28.r(set, tVar);
                                                                            r36 = r34;
                                                                            r35 = r28;
                                                                            break;
                                                                        }
                                                                        r35.f18712n.cancel();
                                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                        it3 = r36.iterator();
                                                                        while (it3.hasNext()) {
                                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                        }
                                                                        copyOnWriteArraySet = r35.f18711m;
                                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                                            pk2.x.f138495e.getClass();
                                                                            xVar = pk2.x.a.e();
                                                                        } else {
                                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                            pk2.x.a aVar116 = pk2.x.f138495e;
                                                                            ok2.e eVar114 = ok2.e.D;
                                                                            aVar116.getClass();
                                                                            eVar114.getClass();
                                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar114, null, null));
                                                                        }
                                                                        return cl2.c.d(arrayList3, xVar);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            r37 = r110;
                                            tVar.f18719a = r37;
                                            tVar.f18720b = null;
                                            tVar.f18728j = 2;
                                            objT = r37.t(e, tVar);
                                            r55 = r37;
                                            break;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            r55 = r110;
                                            try {
                                                f205154d = r55.f18603d.getF205154d();
                                                if (f205154d != null) {
                                                    f205154d.a();
                                                }
                                                break;
                                            } catch (Exception unused2) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Exception e16) {
                                e = e16;
                                r37 = this;
                                tVar.f18719a = r37;
                                tVar.f18720b = null;
                                tVar.f18728j = 2;
                                objT = r37.t(e, tVar);
                                r55 = r37;
                                break;
                            } catch (Throwable th10) {
                                th = th10;
                                r55 = this;
                                f205154d = r55.f18603d.getF205154d();
                                if (f205154d != null) {
                                    f205154d.a();
                                    break;
                                }
                                throw th;
                            }
                            return aVar2;
                        case 1:
                            boolean z26 = tVar.f18724f;
                            e23.p pVar7 = (e23.p) tVar.f18720b;
                            r rVar = tVar.f18719a;
                            try {
                                o13.r.b(objT);
                                z15 = z26;
                                pVar6 = pVar7;
                                r38 = rVar;
                                r110 = r38;
                                pVar2 = pVar6;
                                iVar = r110.f18603d;
                                f205154d2 = iVar.getF205154d();
                                if (f205154d2 == null) {
                                    throw new CoreTransferException(ok2.e.f132644l, "No data available for upload: " + iVar.getF205154d(), null, 4, null);
                                }
                                if (f205154d2.getSize() < iVar.getF205152b().f185845d) {
                                    if (iVar.getF205163m() == null) {
                                        throw new CoreTransferException(ok2.e.f132646n, "Transferred data was smaller than expected", null, 4, null);
                                    }
                                    r110.d().warn("Transferred data was smaller than expected: " + f205154d2.getSize() + " instead of " + iVar.getF205152b().f185845d);
                                }
                                f205154d3 = iVar.getF205154d();
                                if (f205154d3 != null) {
                                    f205154d3.a();
                                    break;
                                }
                                arrayList4 = new ArrayList();
                                r110.f18712n.schedule(new u(r110), f18710q);
                                m0Var = new m0();
                                f205163m = r110.f18603d.getF205163m();
                                if (f205163m != null) {
                                    r110.f18603d.getClass();
                                    bVarB = f205154d2.b();
                                    tVar.f18719a = r110;
                                    tVar.f18720b = pVar2;
                                    tVar.f18721c = f205154d2;
                                    tVar.f18722d = arrayList4;
                                    tVar.f18723e = m0Var;
                                    z17 = z15;
                                    tVar.f18724f = z17;
                                    tVar.f18728j = 3;
                                    if (f205163m.b(bVarB) != aVar2) {
                                        pVar3 = pVar2;
                                        z18 = z17;
                                        r110 = r110;
                                        pk2.x.f138495e.getClass();
                                        arrayList4.add(new o13.p(pk2.x.a.e(), j0.f134944a));
                                        wk2.i iVar19 = r110.f18603d;
                                        wk2.l.c(iVar19, iVar19.getF205152b(), null);
                                        z24 = true;
                                        r112 = r110;
                                        m0Var.f105804a = z24;
                                        z19 = z18;
                                        pVar2 = pVar3;
                                        r111 = r112;
                                        list = r111.f18600a.getConfiguration().f132627g;
                                        vVar = new v(r111, f205154d2, arrayList4, null);
                                        aVar = new b41.a(r111, 4);
                                        tVar.f18719a = r111;
                                        tVar.f18720b = pVar2;
                                        tVar.f18721c = arrayList4;
                                        tVar.f18722d = m0Var;
                                        tVar.f18723e = null;
                                        tVar.f18724f = z19;
                                        tVar.f18728j = 4;
                                        f18709p.getClass();
                                        if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                            serializable = m0Var;
                                            r17 = arrayList4;
                                            z25 = z19;
                                            r18 = r111;
                                            pVar4 = pVar2;
                                            if (r17 != 0) {
                                                it4 = r17.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        r29 = serializable;
                                                        r34 = r17;
                                                        r28 = r18;
                                                        arrayList = new ArrayList();
                                                        while (r5.hasNext()) {
                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                        }
                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                        set = setG1;
                                                        r36 = r34;
                                                        r35 = r28;
                                                        if (!set.isEmpty()) {
                                                            if (r29.f105804a) {
                                                                size = r34.size();
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                size = r34.size() - 1;
                                                            }
                                                            if (size > i14) {
                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                            }
                                                            tVar.f18719a = r28;
                                                            tVar.f18720b = r34;
                                                            tVar.f18721c = null;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 11;
                                                            Object objR115 = r28.r(set, tVar);
                                                            r36 = r34;
                                                            r35 = r28;
                                                            break;
                                                        }
                                                        r35.f18712n.cancel();
                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                        it3 = r36.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                        }
                                                        copyOnWriteArraySet = r35.f18711m;
                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                            pk2.x.f138495e.getClass();
                                                            xVar = pk2.x.a.e();
                                                        } else {
                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                            pk2.x.a aVar117 = pk2.x.f138495e;
                                                            ok2.e eVar115 = ok2.e.D;
                                                            aVar117.getClass();
                                                            eVar115.getClass();
                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar115, null, null));
                                                        }
                                                        return cl2.c.d(arrayList3, xVar);
                                                    }
                                                    if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                        if (bVarC != null) {
                                                            UUID uuid8 = r18.f18603d.getF205152b().f185842a;
                                                            long j110 = r18.f18603d.getF205152b().f185845d;
                                                            tVar.f18719a = r18;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r17;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = 0;
                                                            tVar.f18728j = 5;
                                                            objT = bVarC.n(uuid8, j110, tVar);
                                                            if (objT != aVar2) {
                                                                r39 = r18;
                                                                r44 = r17;
                                                                i15 = 0;
                                                                l14 = (Long) objT;
                                                                r46 = r44;
                                                                r45 = r39;
                                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                wk2.i iVar110 = r45.f18603d;
                                                                tVar.f18719a = r45;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r46;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 6;
                                                                objT = wk2.l.b(iVar110, l14, tVar);
                                                                r48 = r46;
                                                                r47 = r45;
                                                                if (objT != aVar2) {
                                                                    bool = (Boolean) objT;
                                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                        r48.replaceAll(new p(0));
                                                                        serializable2 = serializable;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                        r27 = 1;
                                                                    } else {
                                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                            if (bool == null) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                        } else if (z25) {
                                                                            tVar.f18719a = r47;
                                                                            tVar.f18720b = pVar4;
                                                                            tVar.f18721c = r48;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 7;
                                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                pVar5 = pVar4;
                                                                                r49 = r47;
                                                                                r54 = r48;
                                                                                wk2.d f205154d18 = r49.f18603d.getF205154d();
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = pVar5;
                                                                                tVar.f18721c = r54;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 8;
                                                                                objK = r49.k(f205154d18, "checksumMismatch", tVar);
                                                                                r54 = r54;
                                                                                r49 = r49;
                                                                                if (objK != aVar2) {
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = r54;
                                                                                    tVar.f18721c = serializable;
                                                                                    tVar.f18722d = null;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 9;
                                                                                    objS = r49.s(pVar5, false, tVar);
                                                                                    if (objS != aVar2) {
                                                                                        return objS;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        serializable2 = serializable;
                                                                        r27 = i15;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                    }
                                                                    if (r27 == 0) {
                                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                        x53.c cVar19 = s0.f129406a;
                                                                        x53.b bVar18 = x53.b.f189152a;
                                                                        w wVar18 = new w(r25, null);
                                                                        tVar.f18719a = r25;
                                                                        tVar.f18720b = r26;
                                                                        tVar.f18721c = serializable2;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 10;
                                                                        break;
                                                                    }
                                                                    r29 = serializable2;
                                                                    r34 = r26;
                                                                    r28 = r25;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR116 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar118 = pk2.x.f138495e;
                                                                        ok2.e eVar116 = ok2.e.D;
                                                                        aVar118.getClass();
                                                                        eVar116.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar116, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        } else {
                                                            r45 = r18;
                                                            l14 = null;
                                                            r46 = r17;
                                                            i15 = 0;
                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                            wk2.i iVar111 = r45.f18603d;
                                                            tVar.f18719a = r45;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r46;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 6;
                                                            objT = wk2.l.b(iVar111, l14, tVar);
                                                            r48 = r46;
                                                            r47 = r45;
                                                            if (objT != aVar2) {
                                                                bool = (Boolean) objT;
                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                    r48.replaceAll(new p(0));
                                                                    serializable2 = serializable;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                    r27 = 1;
                                                                } else {
                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                        if (bool == null) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                    } else if (z25) {
                                                                        tVar.f18719a = r47;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r48;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 7;
                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                            pVar5 = pVar4;
                                                                            r49 = r47;
                                                                            r54 = r48;
                                                                            wk2.d f205154d19 = r49.f18603d.getF205154d();
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = pVar5;
                                                                            tVar.f18721c = r54;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 8;
                                                                            objK = r49.k(f205154d19, "checksumMismatch", tVar);
                                                                            r54 = r54;
                                                                            r49 = r49;
                                                                            if (objK != aVar2) {
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = r54;
                                                                                tVar.f18721c = serializable;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 9;
                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                if (objS != aVar2) {
                                                                                    return objS;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    serializable2 = serializable;
                                                                    r27 = i15;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                }
                                                                if (r27 == 0) {
                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                    x53.c cVar110 = s0.f129406a;
                                                                    x53.b bVar19 = x53.b.f189152a;
                                                                    w wVar19 = new w(r25, null);
                                                                    tVar.f18719a = r25;
                                                                    tVar.f18720b = r26;
                                                                    tVar.f18721c = serializable2;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 10;
                                                                    break;
                                                                }
                                                                r29 = serializable2;
                                                                r34 = r26;
                                                                r28 = r25;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR117 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar119 = pk2.x.f138495e;
                                                                    ok2.e eVar117 = ok2.e.D;
                                                                    aVar119.getClass();
                                                                    eVar117.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar117, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                it4 = r17.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        r29 = serializable;
                                                        r34 = r17;
                                                        r28 = r18;
                                                        arrayList = new ArrayList();
                                                        while (r5.hasNext()) {
                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                        }
                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                        set = setG1;
                                                        r36 = r34;
                                                        r35 = r28;
                                                        if (!set.isEmpty()) {
                                                            if (r29.f105804a) {
                                                                size = r34.size();
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                size = r34.size() - 1;
                                                            }
                                                            if (size > i14) {
                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                            }
                                                            tVar.f18719a = r28;
                                                            tVar.f18720b = r34;
                                                            tVar.f18721c = null;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 11;
                                                            Object objR118 = r28.r(set, tVar);
                                                            r36 = r34;
                                                            r35 = r28;
                                                            break;
                                                        }
                                                        r35.f18712n.cancel();
                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                        it3 = r36.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                        }
                                                        copyOnWriteArraySet = r35.f18711m;
                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                            pk2.x.f138495e.getClass();
                                                            xVar = pk2.x.a.e();
                                                        } else {
                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                            pk2.x.a aVar1110 = pk2.x.f138495e;
                                                            ok2.e eVar118 = ok2.e.D;
                                                            aVar1110.getClass();
                                                            eVar118.getClass();
                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar118, null, null));
                                                        }
                                                        return cl2.c.d(arrayList3, xVar);
                                                    }
                                                    if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                        if (bVarC != null) {
                                                            UUID uuid9 = r18.f18603d.getF205152b().f185842a;
                                                            long j111 = r18.f18603d.getF205152b().f185845d;
                                                            tVar.f18719a = r18;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r17;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = 0;
                                                            tVar.f18728j = 5;
                                                            objT = bVarC.n(uuid9, j111, tVar);
                                                            if (objT != aVar2) {
                                                                r39 = r18;
                                                                r44 = r17;
                                                                i15 = 0;
                                                                l14 = (Long) objT;
                                                                r46 = r44;
                                                                r45 = r39;
                                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                                wk2.i iVar112 = r45.f18603d;
                                                                tVar.f18719a = r45;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r46;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18724f = z25;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 6;
                                                                objT = wk2.l.b(iVar112, l14, tVar);
                                                                r48 = r46;
                                                                r47 = r45;
                                                                if (objT != aVar2) {
                                                                    bool = (Boolean) objT;
                                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                        r48.replaceAll(new p(0));
                                                                        serializable2 = serializable;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                        r27 = 1;
                                                                    } else {
                                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                            if (bool == null) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                        } else if (z25) {
                                                                            tVar.f18719a = r47;
                                                                            tVar.f18720b = pVar4;
                                                                            tVar.f18721c = r48;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 7;
                                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                                pVar5 = pVar4;
                                                                                r49 = r47;
                                                                                r54 = r48;
                                                                                wk2.d f205154d110 = r49.f18603d.getF205154d();
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = pVar5;
                                                                                tVar.f18721c = r54;
                                                                                tVar.f18722d = serializable;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 8;
                                                                                objK = r49.k(f205154d110, "checksumMismatch", tVar);
                                                                                r54 = r54;
                                                                                r49 = r49;
                                                                                if (objK != aVar2) {
                                                                                    tVar.f18719a = r49;
                                                                                    tVar.f18720b = r54;
                                                                                    tVar.f18721c = serializable;
                                                                                    tVar.f18722d = null;
                                                                                    tVar.f18725g = i15;
                                                                                    tVar.f18728j = 9;
                                                                                    objS = r49.s(pVar5, false, tVar);
                                                                                    if (objS != aVar2) {
                                                                                        return objS;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        serializable2 = serializable;
                                                                        r27 = i15;
                                                                        r26 = r48;
                                                                        r25 = r47;
                                                                    }
                                                                    if (r27 == 0) {
                                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                        x53.c cVar111 = s0.f129406a;
                                                                        x53.b bVar110 = x53.b.f189152a;
                                                                        w wVar110 = new w(r25, null);
                                                                        tVar.f18719a = r25;
                                                                        tVar.f18720b = r26;
                                                                        tVar.f18721c = serializable2;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 10;
                                                                        break;
                                                                    }
                                                                    r29 = serializable2;
                                                                    r34 = r26;
                                                                    r28 = r25;
                                                                    arrayList = new ArrayList();
                                                                    while (r5.hasNext()) {
                                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                            arrayList.add(obj);
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                    }
                                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                                    set = setG1;
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    if (!set.isEmpty()) {
                                                                        if (r29.f105804a) {
                                                                            size = r34.size();
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                            size = r34.size() - 1;
                                                                        }
                                                                        if (size > i14) {
                                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                        }
                                                                        tVar.f18719a = r28;
                                                                        tVar.f18720b = r34;
                                                                        tVar.f18721c = null;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18728j = 11;
                                                                        Object objR119 = r28.r(set, tVar);
                                                                        r36 = r34;
                                                                        r35 = r28;
                                                                        break;
                                                                    }
                                                                    r35.f18712n.cancel();
                                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                    it3 = r36.iterator();
                                                                    while (it3.hasNext()) {
                                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                    }
                                                                    copyOnWriteArraySet = r35.f18711m;
                                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                                        pk2.x.f138495e.getClass();
                                                                        xVar = pk2.x.a.e();
                                                                    } else {
                                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                        pk2.x.a aVar1111 = pk2.x.f138495e;
                                                                        ok2.e eVar119 = ok2.e.D;
                                                                        aVar1111.getClass();
                                                                        eVar119.getClass();
                                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar119, null, null));
                                                                    }
                                                                    return cl2.c.d(arrayList3, xVar);
                                                                }
                                                            }
                                                        } else {
                                                            r45 = r18;
                                                            l14 = null;
                                                            r46 = r17;
                                                            i15 = 0;
                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                            wk2.i iVar113 = r45.f18603d;
                                                            tVar.f18719a = r45;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r46;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 6;
                                                            objT = wk2.l.b(iVar113, l14, tVar);
                                                            r48 = r46;
                                                            r47 = r45;
                                                            if (objT != aVar2) {
                                                                bool = (Boolean) objT;
                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                    r48.replaceAll(new p(0));
                                                                    serializable2 = serializable;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                    r27 = 1;
                                                                } else {
                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                        if (bool == null) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                    } else if (z25) {
                                                                        tVar.f18719a = r47;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r48;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 7;
                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                            pVar5 = pVar4;
                                                                            r49 = r47;
                                                                            r54 = r48;
                                                                            wk2.d f205154d111 = r49.f18603d.getF205154d();
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = pVar5;
                                                                            tVar.f18721c = r54;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 8;
                                                                            objK = r49.k(f205154d111, "checksumMismatch", tVar);
                                                                            r54 = r54;
                                                                            r49 = r49;
                                                                            if (objK != aVar2) {
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = r54;
                                                                                tVar.f18721c = serializable;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 9;
                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                if (objS != aVar2) {
                                                                                    return objS;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    serializable2 = serializable;
                                                                    r27 = i15;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                }
                                                                if (r27 == 0) {
                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                    x53.c cVar112 = s0.f129406a;
                                                                    x53.b bVar111 = x53.b.f189152a;
                                                                    w wVar111 = new w(r25, null);
                                                                    tVar.f18719a = r25;
                                                                    tVar.f18720b = r26;
                                                                    tVar.f18721c = serializable2;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 10;
                                                                    break;
                                                                }
                                                                r29 = serializable2;
                                                                r34 = r26;
                                                                r28 = r25;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR1110 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar1112 = pk2.x.f138495e;
                                                                    ok2.e eVar1110 = ok2.e.D;
                                                                    aVar1112.getClass();
                                                                    eVar1110.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1110, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    z19 = z15;
                                    r111 = r110;
                                    list = r111.f18600a.getConfiguration().f132627g;
                                    vVar = new v(r111, f205154d2, arrayList4, null);
                                    aVar = new b41.a(r111, 4);
                                    tVar.f18719a = r111;
                                    tVar.f18720b = pVar2;
                                    tVar.f18721c = arrayList4;
                                    tVar.f18722d = m0Var;
                                    tVar.f18723e = null;
                                    tVar.f18724f = z19;
                                    tVar.f18728j = 4;
                                    f18709p.getClass();
                                    if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                        serializable = m0Var;
                                        r17 = arrayList4;
                                        z25 = z19;
                                        r18 = r111;
                                        pVar4 = pVar2;
                                        if (r17 != 0) {
                                            it4 = r17.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    r29 = serializable;
                                                    r34 = r17;
                                                    r28 = r18;
                                                    arrayList = new ArrayList();
                                                    while (r5.hasNext()) {
                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                            arrayList.add(obj);
                                                        }
                                                    }
                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                    it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                    }
                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                    set = setG1;
                                                    r36 = r34;
                                                    r35 = r28;
                                                    if (!set.isEmpty()) {
                                                        if (r29.f105804a) {
                                                            size = r34.size();
                                                            i14 = 1;
                                                        } else {
                                                            i14 = 1;
                                                            size = r34.size() - 1;
                                                        }
                                                        if (size > i14) {
                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                        }
                                                        tVar.f18719a = r28;
                                                        tVar.f18720b = r34;
                                                        tVar.f18721c = null;
                                                        tVar.f18722d = null;
                                                        tVar.f18728j = 11;
                                                        Object objR1111 = r28.r(set, tVar);
                                                        r36 = r34;
                                                        r35 = r28;
                                                        break;
                                                    }
                                                    r35.f18712n.cancel();
                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                    it3 = r36.iterator();
                                                    while (it3.hasNext()) {
                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                    }
                                                    copyOnWriteArraySet = r35.f18711m;
                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                        pk2.x.f138495e.getClass();
                                                        xVar = pk2.x.a.e();
                                                    } else {
                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                        pk2.x.a aVar1113 = pk2.x.f138495e;
                                                        ok2.e eVar1111 = ok2.e.D;
                                                        aVar1113.getClass();
                                                        eVar1111.getClass();
                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1111, null, null));
                                                    }
                                                    return cl2.c.d(arrayList3, xVar);
                                                }
                                                if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                    bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                    if (bVarC != null) {
                                                        UUID uuid10 = r18.f18603d.getF205152b().f185842a;
                                                        long j112 = r18.f18603d.getF205152b().f185845d;
                                                        tVar.f18719a = r18;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r17;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18724f = z25;
                                                        tVar.f18725g = 0;
                                                        tVar.f18728j = 5;
                                                        objT = bVarC.n(uuid10, j112, tVar);
                                                        if (objT != aVar2) {
                                                            r39 = r18;
                                                            r44 = r17;
                                                            i15 = 0;
                                                            l14 = (Long) objT;
                                                            r46 = r44;
                                                            r45 = r39;
                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                            wk2.i iVar114 = r45.f18603d;
                                                            tVar.f18719a = r45;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r46;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 6;
                                                            objT = wk2.l.b(iVar114, l14, tVar);
                                                            r48 = r46;
                                                            r47 = r45;
                                                            if (objT != aVar2) {
                                                                bool = (Boolean) objT;
                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                    r48.replaceAll(new p(0));
                                                                    serializable2 = serializable;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                    r27 = 1;
                                                                } else {
                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                        if (bool == null) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                    } else if (z25) {
                                                                        tVar.f18719a = r47;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r48;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 7;
                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                            pVar5 = pVar4;
                                                                            r49 = r47;
                                                                            r54 = r48;
                                                                            wk2.d f205154d112 = r49.f18603d.getF205154d();
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = pVar5;
                                                                            tVar.f18721c = r54;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 8;
                                                                            objK = r49.k(f205154d112, "checksumMismatch", tVar);
                                                                            r54 = r54;
                                                                            r49 = r49;
                                                                            if (objK != aVar2) {
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = r54;
                                                                                tVar.f18721c = serializable;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 9;
                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                if (objS != aVar2) {
                                                                                    return objS;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    serializable2 = serializable;
                                                                    r27 = i15;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                }
                                                                if (r27 == 0) {
                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                    x53.c cVar113 = s0.f129406a;
                                                                    x53.b bVar112 = x53.b.f189152a;
                                                                    w wVar112 = new w(r25, null);
                                                                    tVar.f18719a = r25;
                                                                    tVar.f18720b = r26;
                                                                    tVar.f18721c = serializable2;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 10;
                                                                    break;
                                                                }
                                                                r29 = serializable2;
                                                                r34 = r26;
                                                                r28 = r25;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR1112 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar1114 = pk2.x.f138495e;
                                                                    ok2.e eVar1112 = ok2.e.D;
                                                                    aVar1114.getClass();
                                                                    eVar1112.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1112, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                        }
                                                    } else {
                                                        r45 = r18;
                                                        l14 = null;
                                                        r46 = r17;
                                                        i15 = 0;
                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                        wk2.i iVar115 = r45.f18603d;
                                                        tVar.f18719a = r45;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r46;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18724f = z25;
                                                        tVar.f18725g = i15;
                                                        tVar.f18728j = 6;
                                                        objT = wk2.l.b(iVar115, l14, tVar);
                                                        r48 = r46;
                                                        r47 = r45;
                                                        if (objT != aVar2) {
                                                            bool = (Boolean) objT;
                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                r48.replaceAll(new p(0));
                                                                serializable2 = serializable;
                                                                r26 = r48;
                                                                r25 = r47;
                                                                r27 = 1;
                                                            } else {
                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                    if (bool == null) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                } else if (z25) {
                                                                    tVar.f18719a = r47;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r48;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 7;
                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                        pVar5 = pVar4;
                                                                        r49 = r47;
                                                                        r54 = r48;
                                                                        wk2.d f205154d113 = r49.f18603d.getF205154d();
                                                                        tVar.f18719a = r49;
                                                                        tVar.f18720b = pVar5;
                                                                        tVar.f18721c = r54;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 8;
                                                                        objK = r49.k(f205154d113, "checksumMismatch", tVar);
                                                                        r54 = r54;
                                                                        r49 = r49;
                                                                        if (objK != aVar2) {
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = r54;
                                                                            tVar.f18721c = serializable;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 9;
                                                                            objS = r49.s(pVar5, false, tVar);
                                                                            if (objS != aVar2) {
                                                                                return objS;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                serializable2 = serializable;
                                                                r27 = i15;
                                                                r26 = r48;
                                                                r25 = r47;
                                                            }
                                                            if (r27 == 0) {
                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                x53.c cVar114 = s0.f129406a;
                                                                x53.b bVar113 = x53.b.f189152a;
                                                                w wVar113 = new w(r25, null);
                                                                tVar.f18719a = r25;
                                                                tVar.f18720b = r26;
                                                                tVar.f18721c = serializable2;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 10;
                                                                break;
                                                            }
                                                            r29 = serializable2;
                                                            r34 = r26;
                                                            r28 = r25;
                                                            arrayList = new ArrayList();
                                                            while (r5.hasNext()) {
                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                            it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                            }
                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                            set = setG1;
                                                            r36 = r34;
                                                            r35 = r28;
                                                            if (!set.isEmpty()) {
                                                                if (r29.f105804a) {
                                                                    size = r34.size();
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                    size = r34.size() - 1;
                                                                }
                                                                if (size > i14) {
                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                }
                                                                tVar.f18719a = r28;
                                                                tVar.f18720b = r34;
                                                                tVar.f18721c = null;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 11;
                                                                Object objR1113 = r28.r(set, tVar);
                                                                r36 = r34;
                                                                r35 = r28;
                                                                break;
                                                            }
                                                            r35.f18712n.cancel();
                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                            it3 = r36.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                            }
                                                            copyOnWriteArraySet = r35.f18711m;
                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                pk2.x.f138495e.getClass();
                                                                xVar = pk2.x.a.e();
                                                            } else {
                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                pk2.x.a aVar1115 = pk2.x.f138495e;
                                                                ok2.e eVar1113 = ok2.e.D;
                                                                aVar1115.getClass();
                                                                eVar1113.getClass();
                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1113, null, null));
                                                            }
                                                            return cl2.c.d(arrayList3, xVar);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            it4 = r17.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    r29 = serializable;
                                                    r34 = r17;
                                                    r28 = r18;
                                                    arrayList = new ArrayList();
                                                    while (r5.hasNext()) {
                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                            arrayList.add(obj);
                                                        }
                                                    }
                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                    it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                    }
                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                    set = setG1;
                                                    r36 = r34;
                                                    r35 = r28;
                                                    if (!set.isEmpty()) {
                                                        if (r29.f105804a) {
                                                            size = r34.size();
                                                            i14 = 1;
                                                        } else {
                                                            i14 = 1;
                                                            size = r34.size() - 1;
                                                        }
                                                        if (size > i14) {
                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                        }
                                                        tVar.f18719a = r28;
                                                        tVar.f18720b = r34;
                                                        tVar.f18721c = null;
                                                        tVar.f18722d = null;
                                                        tVar.f18728j = 11;
                                                        Object objR1114 = r28.r(set, tVar);
                                                        r36 = r34;
                                                        r35 = r28;
                                                        break;
                                                    }
                                                    r35.f18712n.cancel();
                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                    it3 = r36.iterator();
                                                    while (it3.hasNext()) {
                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                    }
                                                    copyOnWriteArraySet = r35.f18711m;
                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                        pk2.x.f138495e.getClass();
                                                        xVar = pk2.x.a.e();
                                                    } else {
                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                        pk2.x.a aVar1116 = pk2.x.f138495e;
                                                        ok2.e eVar1114 = ok2.e.D;
                                                        aVar1116.getClass();
                                                        eVar1114.getClass();
                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1114, null, null));
                                                    }
                                                    return cl2.c.d(arrayList3, xVar);
                                                }
                                                if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                    bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                    if (bVarC != null) {
                                                        UUID uuid11 = r18.f18603d.getF205152b().f185842a;
                                                        long j113 = r18.f18603d.getF205152b().f185845d;
                                                        tVar.f18719a = r18;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r17;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18724f = z25;
                                                        tVar.f18725g = 0;
                                                        tVar.f18728j = 5;
                                                        objT = bVarC.n(uuid11, j113, tVar);
                                                        if (objT != aVar2) {
                                                            r39 = r18;
                                                            r44 = r17;
                                                            i15 = 0;
                                                            l14 = (Long) objT;
                                                            r46 = r44;
                                                            r45 = r39;
                                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                            wk2.i iVar116 = r45.f18603d;
                                                            tVar.f18719a = r45;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r46;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18724f = z25;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 6;
                                                            objT = wk2.l.b(iVar116, l14, tVar);
                                                            r48 = r46;
                                                            r47 = r45;
                                                            if (objT != aVar2) {
                                                                bool = (Boolean) objT;
                                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                    r48.replaceAll(new p(0));
                                                                    serializable2 = serializable;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                    r27 = 1;
                                                                } else {
                                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                        if (bool == null) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                    } else if (z25) {
                                                                        tVar.f18719a = r47;
                                                                        tVar.f18720b = pVar4;
                                                                        tVar.f18721c = r48;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 7;
                                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                                            pVar5 = pVar4;
                                                                            r49 = r47;
                                                                            r54 = r48;
                                                                            wk2.d f205154d114 = r49.f18603d.getF205154d();
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = pVar5;
                                                                            tVar.f18721c = r54;
                                                                            tVar.f18722d = serializable;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 8;
                                                                            objK = r49.k(f205154d114, "checksumMismatch", tVar);
                                                                            r54 = r54;
                                                                            r49 = r49;
                                                                            if (objK != aVar2) {
                                                                                tVar.f18719a = r49;
                                                                                tVar.f18720b = r54;
                                                                                tVar.f18721c = serializable;
                                                                                tVar.f18722d = null;
                                                                                tVar.f18725g = i15;
                                                                                tVar.f18728j = 9;
                                                                                objS = r49.s(pVar5, false, tVar);
                                                                                if (objS != aVar2) {
                                                                                    return objS;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    serializable2 = serializable;
                                                                    r27 = i15;
                                                                    r26 = r48;
                                                                    r25 = r47;
                                                                }
                                                                if (r27 == 0) {
                                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                    x53.c cVar115 = s0.f129406a;
                                                                    x53.b bVar114 = x53.b.f189152a;
                                                                    w wVar114 = new w(r25, null);
                                                                    tVar.f18719a = r25;
                                                                    tVar.f18720b = r26;
                                                                    tVar.f18721c = serializable2;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 10;
                                                                    break;
                                                                }
                                                                r29 = serializable2;
                                                                r34 = r26;
                                                                r28 = r25;
                                                                arrayList = new ArrayList();
                                                                while (r5.hasNext()) {
                                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                                it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                                }
                                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                                set = setG1;
                                                                r36 = r34;
                                                                r35 = r28;
                                                                if (!set.isEmpty()) {
                                                                    if (r29.f105804a) {
                                                                        size = r34.size();
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        size = r34.size() - 1;
                                                                    }
                                                                    if (size > i14) {
                                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                    }
                                                                    tVar.f18719a = r28;
                                                                    tVar.f18720b = r34;
                                                                    tVar.f18721c = null;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18728j = 11;
                                                                    Object objR1115 = r28.r(set, tVar);
                                                                    r36 = r34;
                                                                    r35 = r28;
                                                                    break;
                                                                }
                                                                r35.f18712n.cancel();
                                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                                it3 = r36.iterator();
                                                                while (it3.hasNext()) {
                                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                                }
                                                                copyOnWriteArraySet = r35.f18711m;
                                                                if (copyOnWriteArraySet.isEmpty()) {
                                                                    pk2.x.f138495e.getClass();
                                                                    xVar = pk2.x.a.e();
                                                                } else {
                                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                    pk2.x.a aVar1117 = pk2.x.f138495e;
                                                                    ok2.e eVar1115 = ok2.e.D;
                                                                    aVar1117.getClass();
                                                                    eVar1115.getClass();
                                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1115, null, null));
                                                                }
                                                                return cl2.c.d(arrayList3, xVar);
                                                            }
                                                        }
                                                    } else {
                                                        r45 = r18;
                                                        l14 = null;
                                                        r46 = r17;
                                                        i15 = 0;
                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                        wk2.i iVar117 = r45.f18603d;
                                                        tVar.f18719a = r45;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r46;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18724f = z25;
                                                        tVar.f18725g = i15;
                                                        tVar.f18728j = 6;
                                                        objT = wk2.l.b(iVar117, l14, tVar);
                                                        r48 = r46;
                                                        r47 = r45;
                                                        if (objT != aVar2) {
                                                            bool = (Boolean) objT;
                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                r48.replaceAll(new p(0));
                                                                serializable2 = serializable;
                                                                r26 = r48;
                                                                r25 = r47;
                                                                r27 = 1;
                                                            } else {
                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                    if (bool == null) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                } else if (z25) {
                                                                    tVar.f18719a = r47;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r48;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 7;
                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                        pVar5 = pVar4;
                                                                        r49 = r47;
                                                                        r54 = r48;
                                                                        wk2.d f205154d115 = r49.f18603d.getF205154d();
                                                                        tVar.f18719a = r49;
                                                                        tVar.f18720b = pVar5;
                                                                        tVar.f18721c = r54;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 8;
                                                                        objK = r49.k(f205154d115, "checksumMismatch", tVar);
                                                                        r54 = r54;
                                                                        r49 = r49;
                                                                        if (objK != aVar2) {
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = r54;
                                                                            tVar.f18721c = serializable;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 9;
                                                                            objS = r49.s(pVar5, false, tVar);
                                                                            if (objS != aVar2) {
                                                                                return objS;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                serializable2 = serializable;
                                                                r27 = i15;
                                                                r26 = r48;
                                                                r25 = r47;
                                                            }
                                                            if (r27 == 0) {
                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                x53.c cVar116 = s0.f129406a;
                                                                x53.b bVar115 = x53.b.f189152a;
                                                                w wVar115 = new w(r25, null);
                                                                tVar.f18719a = r25;
                                                                tVar.f18720b = r26;
                                                                tVar.f18721c = serializable2;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 10;
                                                                break;
                                                            }
                                                            r29 = serializable2;
                                                            r34 = r26;
                                                            r28 = r25;
                                                            arrayList = new ArrayList();
                                                            while (r5.hasNext()) {
                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                            it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                            }
                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                            set = setG1;
                                                            r36 = r34;
                                                            r35 = r28;
                                                            if (!set.isEmpty()) {
                                                                if (r29.f105804a) {
                                                                    size = r34.size();
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                    size = r34.size() - 1;
                                                                }
                                                                if (size > i14) {
                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                }
                                                                tVar.f18719a = r28;
                                                                tVar.f18720b = r34;
                                                                tVar.f18721c = null;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 11;
                                                                Object objR1116 = r28.r(set, tVar);
                                                                r36 = r34;
                                                                r35 = r28;
                                                                break;
                                                            }
                                                            r35.f18712n.cancel();
                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                            it3 = r36.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                            }
                                                            copyOnWriteArraySet = r35.f18711m;
                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                pk2.x.f138495e.getClass();
                                                                xVar = pk2.x.a.e();
                                                            } else {
                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                pk2.x.a aVar1118 = pk2.x.f138495e;
                                                                ok2.e eVar1116 = ok2.e.D;
                                                                aVar1118.getClass();
                                                                eVar1116.getClass();
                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1116, null, null));
                                                            }
                                                            return cl2.c.d(arrayList3, xVar);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return aVar2;
                            } catch (Exception e17) {
                                e = e17;
                                r37 = rVar;
                                tVar.f18719a = r37;
                                tVar.f18720b = null;
                                tVar.f18728j = 2;
                                objT = r37.t(e, tVar);
                                r55 = r37;
                            } catch (Throwable th11) {
                                th = th11;
                                r55 = rVar;
                                f205154d = r55.f18603d.getF205154d();
                                if (f205154d != null) {
                                    f205154d.a();
                                    break;
                                }
                                throw th;
                            }
                            break;
                        case 2:
                            r rVar2 = tVar.f18719a;
                            o13.r.b(objT);
                            r55 = rVar2;
                            try {
                                wk2.d f205154d20 = r55.f18603d.getF205154d();
                                if (f205154d20 != null) {
                                    f205154d20.a();
                                }
                                break;
                            } catch (Exception unused3) {
                            }
                            return objT;
                        case 3:
                            z18 = tVar.f18724f;
                            m0Var = tVar.f18723e;
                            arrayList4 = (ArrayList) tVar.f18722d;
                            f205154d2 = (wk2.d) tVar.f18721c;
                            pVar3 = (e23.p) tVar.f18720b;
                            r110 = tVar.f18719a;
                            try {
                                try {
                                    o13.r.b(objT);
                                    r110 = r110;
                                    pk2.x.f138495e.getClass();
                                    arrayList4.add(new o13.p(pk2.x.a.e(), j0.f134944a));
                                    wk2.i iVar118 = r110.f18603d;
                                    wk2.l.c(iVar118, iVar118.getF205152b(), null);
                                    z24 = true;
                                    r112 = r110;
                                } catch (Exception e18) {
                                    e = e18;
                                    r110.d().warn("Failed app provided processData(" + r110.f18603d.getId() + ")", (Throwable) e);
                                    CoreTransferException coreTransferException2 = new CoreTransferException(ok2.e.A, e);
                                    pk2.x.f138495e.getClass();
                                    arrayList4.add(new o13.p(pk2.x.a.d(coreTransferException2), j0.f134944a));
                                    wk2.i iVar119 = r110.f18603d;
                                    wk2.l.c(iVar119, iVar119.getF205152b(), coreTransferException2);
                                    z24 = true;
                                    r112 = r110;
                                }
                                m0Var.f105804a = z24;
                                z19 = z18;
                                pVar2 = pVar3;
                                r111 = r112;
                                list = r111.f18600a.getConfiguration().f132627g;
                                vVar = new v(r111, f205154d2, arrayList4, null);
                                aVar = new b41.a(r111, 4);
                                tVar.f18719a = r111;
                                tVar.f18720b = pVar2;
                                tVar.f18721c = arrayList4;
                                tVar.f18722d = m0Var;
                                tVar.f18723e = null;
                                tVar.f18724f = z19;
                                tVar.f18728j = 4;
                                f18709p.getClass();
                                if (ge1.b.Y(new q(list, aVar, vVar, null), tVar) != aVar2) {
                                    serializable = m0Var;
                                    r17 = arrayList4;
                                    z25 = z19;
                                    r18 = r111;
                                    pVar4 = pVar2;
                                    if (r17 != 0) {
                                        it4 = r17.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                r29 = serializable;
                                                r34 = r17;
                                                r28 = r18;
                                                arrayList = new ArrayList();
                                                while (r5.hasNext()) {
                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                }
                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                set = setG1;
                                                r36 = r34;
                                                r35 = r28;
                                                if (!set.isEmpty()) {
                                                    if (r29.f105804a) {
                                                        size = r34.size();
                                                        i14 = 1;
                                                    } else {
                                                        i14 = 1;
                                                        size = r34.size() - 1;
                                                    }
                                                    if (size > i14) {
                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                    }
                                                    tVar.f18719a = r28;
                                                    tVar.f18720b = r34;
                                                    tVar.f18721c = null;
                                                    tVar.f18722d = null;
                                                    tVar.f18728j = 11;
                                                    Object objR1117 = r28.r(set, tVar);
                                                    r36 = r34;
                                                    r35 = r28;
                                                    break;
                                                }
                                                r35.f18712n.cancel();
                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                it3 = r36.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                }
                                                copyOnWriteArraySet = r35.f18711m;
                                                if (copyOnWriteArraySet.isEmpty()) {
                                                    pk2.x.f138495e.getClass();
                                                    xVar = pk2.x.a.e();
                                                } else {
                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                    pk2.x.a aVar1119 = pk2.x.f138495e;
                                                    ok2.e eVar1117 = ok2.e.D;
                                                    aVar1119.getClass();
                                                    eVar1117.getClass();
                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1117, null, null));
                                                }
                                                return cl2.c.d(arrayList3, xVar);
                                            }
                                            if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                if (bVarC != null) {
                                                    UUID uuid12 = r18.f18603d.getF205152b().f185842a;
                                                    long j114 = r18.f18603d.getF205152b().f185845d;
                                                    tVar.f18719a = r18;
                                                    tVar.f18720b = pVar4;
                                                    tVar.f18721c = r17;
                                                    tVar.f18722d = serializable;
                                                    tVar.f18724f = z25;
                                                    tVar.f18725g = 0;
                                                    tVar.f18728j = 5;
                                                    objT = bVarC.n(uuid12, j114, tVar);
                                                    if (objT != aVar2) {
                                                        r39 = r18;
                                                        r44 = r17;
                                                        i15 = 0;
                                                        l14 = (Long) objT;
                                                        r46 = r44;
                                                        r45 = r39;
                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                        wk2.i iVar1110 = r45.f18603d;
                                                        tVar.f18719a = r45;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r46;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18724f = z25;
                                                        tVar.f18725g = i15;
                                                        tVar.f18728j = 6;
                                                        objT = wk2.l.b(iVar1110, l14, tVar);
                                                        r48 = r46;
                                                        r47 = r45;
                                                        if (objT != aVar2) {
                                                            bool = (Boolean) objT;
                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                r48.replaceAll(new p(0));
                                                                serializable2 = serializable;
                                                                r26 = r48;
                                                                r25 = r47;
                                                                r27 = 1;
                                                            } else {
                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                    if (bool == null) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                } else if (z25) {
                                                                    tVar.f18719a = r47;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r48;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 7;
                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                        pVar5 = pVar4;
                                                                        r49 = r47;
                                                                        r54 = r48;
                                                                        wk2.d f205154d116 = r49.f18603d.getF205154d();
                                                                        tVar.f18719a = r49;
                                                                        tVar.f18720b = pVar5;
                                                                        tVar.f18721c = r54;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 8;
                                                                        objK = r49.k(f205154d116, "checksumMismatch", tVar);
                                                                        r54 = r54;
                                                                        r49 = r49;
                                                                        if (objK != aVar2) {
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = r54;
                                                                            tVar.f18721c = serializable;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 9;
                                                                            objS = r49.s(pVar5, false, tVar);
                                                                            if (objS != aVar2) {
                                                                                return objS;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                serializable2 = serializable;
                                                                r27 = i15;
                                                                r26 = r48;
                                                                r25 = r47;
                                                            }
                                                            if (r27 == 0) {
                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                x53.c cVar117 = s0.f129406a;
                                                                x53.b bVar116 = x53.b.f189152a;
                                                                w wVar116 = new w(r25, null);
                                                                tVar.f18719a = r25;
                                                                tVar.f18720b = r26;
                                                                tVar.f18721c = serializable2;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 10;
                                                                break;
                                                            }
                                                            r29 = serializable2;
                                                            r34 = r26;
                                                            r28 = r25;
                                                            arrayList = new ArrayList();
                                                            while (r5.hasNext()) {
                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                            it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                            }
                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                            set = setG1;
                                                            r36 = r34;
                                                            r35 = r28;
                                                            if (!set.isEmpty()) {
                                                                if (r29.f105804a) {
                                                                    size = r34.size();
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                    size = r34.size() - 1;
                                                                }
                                                                if (size > i14) {
                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                }
                                                                tVar.f18719a = r28;
                                                                tVar.f18720b = r34;
                                                                tVar.f18721c = null;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 11;
                                                                Object objR1118 = r28.r(set, tVar);
                                                                r36 = r34;
                                                                r35 = r28;
                                                                break;
                                                            }
                                                            r35.f18712n.cancel();
                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                            it3 = r36.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                            }
                                                            copyOnWriteArraySet = r35.f18711m;
                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                pk2.x.f138495e.getClass();
                                                                xVar = pk2.x.a.e();
                                                            } else {
                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                pk2.x.a aVar11110 = pk2.x.f138495e;
                                                                ok2.e eVar1118 = ok2.e.D;
                                                                aVar11110.getClass();
                                                                eVar1118.getClass();
                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1118, null, null));
                                                            }
                                                            return cl2.c.d(arrayList3, xVar);
                                                        }
                                                    }
                                                } else {
                                                    r45 = r18;
                                                    l14 = null;
                                                    r46 = r17;
                                                    i15 = 0;
                                                    r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                    wk2.i iVar1111 = r45.f18603d;
                                                    tVar.f18719a = r45;
                                                    tVar.f18720b = pVar4;
                                                    tVar.f18721c = r46;
                                                    tVar.f18722d = serializable;
                                                    tVar.f18724f = z25;
                                                    tVar.f18725g = i15;
                                                    tVar.f18728j = 6;
                                                    objT = wk2.l.b(iVar1111, l14, tVar);
                                                    r48 = r46;
                                                    r47 = r45;
                                                    if (objT != aVar2) {
                                                        bool = (Boolean) objT;
                                                        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                            r48.replaceAll(new p(0));
                                                            serializable2 = serializable;
                                                            r26 = r48;
                                                            r25 = r47;
                                                            r27 = 1;
                                                        } else {
                                                            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                if (bool == null) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                            } else if (z25) {
                                                                tVar.f18719a = r47;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r48;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 7;
                                                                if (o53.m0.b(300L, tVar) != aVar2) {
                                                                    pVar5 = pVar4;
                                                                    r49 = r47;
                                                                    r54 = r48;
                                                                    wk2.d f205154d117 = r49.f18603d.getF205154d();
                                                                    tVar.f18719a = r49;
                                                                    tVar.f18720b = pVar5;
                                                                    tVar.f18721c = r54;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 8;
                                                                    objK = r49.k(f205154d117, "checksumMismatch", tVar);
                                                                    r54 = r54;
                                                                    r49 = r49;
                                                                    if (objK != aVar2) {
                                                                        tVar.f18719a = r49;
                                                                        tVar.f18720b = r54;
                                                                        tVar.f18721c = serializable;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 9;
                                                                        objS = r49.s(pVar5, false, tVar);
                                                                        if (objS != aVar2) {
                                                                            return objS;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            serializable2 = serializable;
                                                            r27 = i15;
                                                            r26 = r48;
                                                            r25 = r47;
                                                        }
                                                        if (r27 == 0) {
                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                            x53.c cVar118 = s0.f129406a;
                                                            x53.b bVar117 = x53.b.f189152a;
                                                            w wVar117 = new w(r25, null);
                                                            tVar.f18719a = r25;
                                                            tVar.f18720b = r26;
                                                            tVar.f18721c = serializable2;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 10;
                                                            break;
                                                        }
                                                        r29 = serializable2;
                                                        r34 = r26;
                                                        r28 = r25;
                                                        arrayList = new ArrayList();
                                                        while (r5.hasNext()) {
                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                        }
                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                        set = setG1;
                                                        r36 = r34;
                                                        r35 = r28;
                                                        if (!set.isEmpty()) {
                                                            if (r29.f105804a) {
                                                                size = r34.size();
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                size = r34.size() - 1;
                                                            }
                                                            if (size > i14) {
                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                            }
                                                            tVar.f18719a = r28;
                                                            tVar.f18720b = r34;
                                                            tVar.f18721c = null;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 11;
                                                            Object objR1119 = r28.r(set, tVar);
                                                            r36 = r34;
                                                            r35 = r28;
                                                            break;
                                                        }
                                                        r35.f18712n.cancel();
                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                        it3 = r36.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                        }
                                                        copyOnWriteArraySet = r35.f18711m;
                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                            pk2.x.f138495e.getClass();
                                                            xVar = pk2.x.a.e();
                                                        } else {
                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                            pk2.x.a aVar11111 = pk2.x.f138495e;
                                                            ok2.e eVar1119 = ok2.e.D;
                                                            aVar11111.getClass();
                                                            eVar1119.getClass();
                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar1119, null, null));
                                                        }
                                                        return cl2.c.d(arrayList3, xVar);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        it4 = r17.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                r29 = serializable;
                                                r34 = r17;
                                                r28 = r18;
                                                arrayList = new ArrayList();
                                                while (r5.hasNext()) {
                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                }
                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                set = setG1;
                                                r36 = r34;
                                                r35 = r28;
                                                if (!set.isEmpty()) {
                                                    if (r29.f105804a) {
                                                        size = r34.size();
                                                        i14 = 1;
                                                    } else {
                                                        i14 = 1;
                                                        size = r34.size() - 1;
                                                    }
                                                    if (size > i14) {
                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                    }
                                                    tVar.f18719a = r28;
                                                    tVar.f18720b = r34;
                                                    tVar.f18721c = null;
                                                    tVar.f18722d = null;
                                                    tVar.f18728j = 11;
                                                    Object objR11110 = r28.r(set, tVar);
                                                    r36 = r34;
                                                    r35 = r28;
                                                    break;
                                                }
                                                r35.f18712n.cancel();
                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                it3 = r36.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                }
                                                copyOnWriteArraySet = r35.f18711m;
                                                if (copyOnWriteArraySet.isEmpty()) {
                                                    pk2.x.f138495e.getClass();
                                                    xVar = pk2.x.a.e();
                                                } else {
                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                    pk2.x.a aVar11112 = pk2.x.f138495e;
                                                    ok2.e eVar11110 = ok2.e.D;
                                                    aVar11112.getClass();
                                                    eVar11110.getClass();
                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11110, null, null));
                                                }
                                                return cl2.c.d(arrayList3, xVar);
                                            }
                                            if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                                bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                                if (bVarC != null) {
                                                    UUID uuid13 = r18.f18603d.getF205152b().f185842a;
                                                    long j115 = r18.f18603d.getF205152b().f185845d;
                                                    tVar.f18719a = r18;
                                                    tVar.f18720b = pVar4;
                                                    tVar.f18721c = r17;
                                                    tVar.f18722d = serializable;
                                                    tVar.f18724f = z25;
                                                    tVar.f18725g = 0;
                                                    tVar.f18728j = 5;
                                                    objT = bVarC.n(uuid13, j115, tVar);
                                                    if (objT != aVar2) {
                                                        r39 = r18;
                                                        r44 = r17;
                                                        i15 = 0;
                                                        l14 = (Long) objT;
                                                        r46 = r44;
                                                        r45 = r39;
                                                        r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                        wk2.i iVar1112 = r45.f18603d;
                                                        tVar.f18719a = r45;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r46;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18724f = z25;
                                                        tVar.f18725g = i15;
                                                        tVar.f18728j = 6;
                                                        objT = wk2.l.b(iVar1112, l14, tVar);
                                                        r48 = r46;
                                                        r47 = r45;
                                                        if (objT != aVar2) {
                                                            bool = (Boolean) objT;
                                                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                                r48.replaceAll(new p(0));
                                                                serializable2 = serializable;
                                                                r26 = r48;
                                                                r25 = r47;
                                                                r27 = 1;
                                                            } else {
                                                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                    if (bool == null) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                                } else if (z25) {
                                                                    tVar.f18719a = r47;
                                                                    tVar.f18720b = pVar4;
                                                                    tVar.f18721c = r48;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 7;
                                                                    if (o53.m0.b(300L, tVar) != aVar2) {
                                                                        pVar5 = pVar4;
                                                                        r49 = r47;
                                                                        r54 = r48;
                                                                        wk2.d f205154d118 = r49.f18603d.getF205154d();
                                                                        tVar.f18719a = r49;
                                                                        tVar.f18720b = pVar5;
                                                                        tVar.f18721c = r54;
                                                                        tVar.f18722d = serializable;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 8;
                                                                        objK = r49.k(f205154d118, "checksumMismatch", tVar);
                                                                        r54 = r54;
                                                                        r49 = r49;
                                                                        if (objK != aVar2) {
                                                                            tVar.f18719a = r49;
                                                                            tVar.f18720b = r54;
                                                                            tVar.f18721c = serializable;
                                                                            tVar.f18722d = null;
                                                                            tVar.f18725g = i15;
                                                                            tVar.f18728j = 9;
                                                                            objS = r49.s(pVar5, false, tVar);
                                                                            if (objS != aVar2) {
                                                                                return objS;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                serializable2 = serializable;
                                                                r27 = i15;
                                                                r26 = r48;
                                                                r25 = r47;
                                                            }
                                                            if (r27 == 0) {
                                                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                                x53.c cVar119 = s0.f129406a;
                                                                x53.b bVar118 = x53.b.f189152a;
                                                                w wVar118 = new w(r25, null);
                                                                tVar.f18719a = r25;
                                                                tVar.f18720b = r26;
                                                                tVar.f18721c = serializable2;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 10;
                                                                break;
                                                            }
                                                            r29 = serializable2;
                                                            r34 = r26;
                                                            r28 = r25;
                                                            arrayList = new ArrayList();
                                                            while (r5.hasNext()) {
                                                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                            it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                            }
                                                            setG1 = h0.g1(p13.y.s(arrayList2));
                                                            set = setG1;
                                                            r36 = r34;
                                                            r35 = r28;
                                                            if (!set.isEmpty()) {
                                                                if (r29.f105804a) {
                                                                    size = r34.size();
                                                                    i14 = 1;
                                                                } else {
                                                                    i14 = 1;
                                                                    size = r34.size() - 1;
                                                                }
                                                                if (size > i14) {
                                                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                                }
                                                                tVar.f18719a = r28;
                                                                tVar.f18720b = r34;
                                                                tVar.f18721c = null;
                                                                tVar.f18722d = null;
                                                                tVar.f18728j = 11;
                                                                Object objR11111 = r28.r(set, tVar);
                                                                r36 = r34;
                                                                r35 = r28;
                                                                break;
                                                            }
                                                            r35.f18712n.cancel();
                                                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                            it3 = r36.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                            }
                                                            copyOnWriteArraySet = r35.f18711m;
                                                            if (copyOnWriteArraySet.isEmpty()) {
                                                                pk2.x.f138495e.getClass();
                                                                xVar = pk2.x.a.e();
                                                            } else {
                                                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                                pk2.x.a aVar11113 = pk2.x.f138495e;
                                                                ok2.e eVar11111 = ok2.e.D;
                                                                aVar11113.getClass();
                                                                eVar11111.getClass();
                                                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11111, null, null));
                                                            }
                                                            return cl2.c.d(arrayList3, xVar);
                                                        }
                                                    }
                                                } else {
                                                    r45 = r18;
                                                    l14 = null;
                                                    r46 = r17;
                                                    i15 = 0;
                                                    r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                    wk2.i iVar1113 = r45.f18603d;
                                                    tVar.f18719a = r45;
                                                    tVar.f18720b = pVar4;
                                                    tVar.f18721c = r46;
                                                    tVar.f18722d = serializable;
                                                    tVar.f18724f = z25;
                                                    tVar.f18725g = i15;
                                                    tVar.f18728j = 6;
                                                    objT = wk2.l.b(iVar1113, l14, tVar);
                                                    r48 = r46;
                                                    r47 = r45;
                                                    if (objT != aVar2) {
                                                        bool = (Boolean) objT;
                                                        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                            r48.replaceAll(new p(0));
                                                            serializable2 = serializable;
                                                            r26 = r48;
                                                            r25 = r47;
                                                            r27 = 1;
                                                        } else {
                                                            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                                if (bool == null) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                            } else if (z25) {
                                                                tVar.f18719a = r47;
                                                                tVar.f18720b = pVar4;
                                                                tVar.f18721c = r48;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 7;
                                                                if (o53.m0.b(300L, tVar) != aVar2) {
                                                                    pVar5 = pVar4;
                                                                    r49 = r47;
                                                                    r54 = r48;
                                                                    wk2.d f205154d119 = r49.f18603d.getF205154d();
                                                                    tVar.f18719a = r49;
                                                                    tVar.f18720b = pVar5;
                                                                    tVar.f18721c = r54;
                                                                    tVar.f18722d = serializable;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 8;
                                                                    objK = r49.k(f205154d119, "checksumMismatch", tVar);
                                                                    r54 = r54;
                                                                    r49 = r49;
                                                                    if (objK != aVar2) {
                                                                        tVar.f18719a = r49;
                                                                        tVar.f18720b = r54;
                                                                        tVar.f18721c = serializable;
                                                                        tVar.f18722d = null;
                                                                        tVar.f18725g = i15;
                                                                        tVar.f18728j = 9;
                                                                        objS = r49.s(pVar5, false, tVar);
                                                                        if (objS != aVar2) {
                                                                            return objS;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            serializable2 = serializable;
                                                            r27 = i15;
                                                            r26 = r48;
                                                            r25 = r47;
                                                        }
                                                        if (r27 == 0) {
                                                            r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                            x53.c cVar1110 = s0.f129406a;
                                                            x53.b bVar119 = x53.b.f189152a;
                                                            w wVar119 = new w(r25, null);
                                                            tVar.f18719a = r25;
                                                            tVar.f18720b = r26;
                                                            tVar.f18721c = serializable2;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 10;
                                                            break;
                                                        }
                                                        r29 = serializable2;
                                                        r34 = r26;
                                                        r28 = r25;
                                                        arrayList = new ArrayList();
                                                        while (r5.hasNext()) {
                                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                        }
                                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                                        set = setG1;
                                                        r36 = r34;
                                                        r35 = r28;
                                                        if (!set.isEmpty()) {
                                                            if (r29.f105804a) {
                                                                size = r34.size();
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                size = r34.size() - 1;
                                                            }
                                                            if (size > i14) {
                                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                            }
                                                            tVar.f18719a = r28;
                                                            tVar.f18720b = r34;
                                                            tVar.f18721c = null;
                                                            tVar.f18722d = null;
                                                            tVar.f18728j = 11;
                                                            Object objR11112 = r28.r(set, tVar);
                                                            r36 = r34;
                                                            r35 = r28;
                                                            break;
                                                        }
                                                        r35.f18712n.cancel();
                                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                        it3 = r36.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                        }
                                                        copyOnWriteArraySet = r35.f18711m;
                                                        if (copyOnWriteArraySet.isEmpty()) {
                                                            pk2.x.f138495e.getClass();
                                                            xVar = pk2.x.a.e();
                                                        } else {
                                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                            pk2.x.a aVar11114 = pk2.x.f138495e;
                                                            ok2.e eVar11112 = ok2.e.D;
                                                            aVar11114.getClass();
                                                            eVar11112.getClass();
                                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11112, null, null));
                                                        }
                                                        return cl2.c.d(arrayList3, xVar);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return aVar2;
                            } catch (Throwable th12) {
                                th = th12;
                                z16 = true;
                                m0Var.f105804a = z16;
                                throw th;
                            }
                        case 4:
                            z25 = tVar.f18724f;
                            serializable = (m0) tVar.f18722d;
                            ArrayList arrayList5 = (ArrayList) tVar.f18721c;
                            e23.p pVar8 = (e23.p) tVar.f18720b;
                            r rVar3 = tVar.f18719a;
                            o13.r.b(objT);
                            pVar4 = pVar8;
                            r18 = rVar3;
                            r17 = arrayList5;
                            if (r17 != 0) {
                                it4 = r17.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        r29 = serializable;
                                        r34 = r17;
                                        r28 = r18;
                                        arrayList = new ArrayList();
                                        while (r5.hasNext()) {
                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                        }
                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                        set = setG1;
                                        r36 = r34;
                                        r35 = r28;
                                        if (!set.isEmpty()) {
                                            if (r29.f105804a) {
                                                size = r34.size();
                                                i14 = 1;
                                            } else {
                                                i14 = 1;
                                                size = r34.size() - 1;
                                            }
                                            if (size > i14) {
                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                            }
                                            tVar.f18719a = r28;
                                            tVar.f18720b = r34;
                                            tVar.f18721c = null;
                                            tVar.f18722d = null;
                                            tVar.f18728j = 11;
                                            Object objR11113 = r28.r(set, tVar);
                                            r36 = r34;
                                            r35 = r28;
                                            break;
                                        }
                                        r35.f18712n.cancel();
                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                        it3 = r36.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                        }
                                        copyOnWriteArraySet = r35.f18711m;
                                        if (copyOnWriteArraySet.isEmpty()) {
                                            pk2.x.f138495e.getClass();
                                            xVar = pk2.x.a.e();
                                        } else {
                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                            pk2.x.a aVar11115 = pk2.x.f138495e;
                                            ok2.e eVar11113 = ok2.e.D;
                                            aVar11115.getClass();
                                            eVar11113.getClass();
                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11113, null, null));
                                        }
                                        return cl2.c.d(arrayList3, xVar);
                                    }
                                    if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                        if (bVarC != null) {
                                            UUID uuid14 = r18.f18603d.getF205152b().f185842a;
                                            long j116 = r18.f18603d.getF205152b().f185845d;
                                            tVar.f18719a = r18;
                                            tVar.f18720b = pVar4;
                                            tVar.f18721c = r17;
                                            tVar.f18722d = serializable;
                                            tVar.f18724f = z25;
                                            tVar.f18725g = 0;
                                            tVar.f18728j = 5;
                                            objT = bVarC.n(uuid14, j116, tVar);
                                            if (objT != aVar2) {
                                                r39 = r18;
                                                r44 = r17;
                                                i15 = 0;
                                                l14 = (Long) objT;
                                                r46 = r44;
                                                r45 = r39;
                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                wk2.i iVar1114 = r45.f18603d;
                                                tVar.f18719a = r45;
                                                tVar.f18720b = pVar4;
                                                tVar.f18721c = r46;
                                                tVar.f18722d = serializable;
                                                tVar.f18724f = z25;
                                                tVar.f18725g = i15;
                                                tVar.f18728j = 6;
                                                objT = wk2.l.b(iVar1114, l14, tVar);
                                                r48 = r46;
                                                r47 = r45;
                                                if (objT != aVar2) {
                                                    bool = (Boolean) objT;
                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                        r48.replaceAll(new p(0));
                                                        serializable2 = serializable;
                                                        r26 = r48;
                                                        r25 = r47;
                                                        r27 = 1;
                                                    } else {
                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                            if (bool == null) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                        } else if (z25) {
                                                            tVar.f18719a = r47;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r48;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 7;
                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                pVar5 = pVar4;
                                                                r49 = r47;
                                                                r54 = r48;
                                                                wk2.d f205154d1110 = r49.f18603d.getF205154d();
                                                                tVar.f18719a = r49;
                                                                tVar.f18720b = pVar5;
                                                                tVar.f18721c = r54;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 8;
                                                                objK = r49.k(f205154d1110, "checksumMismatch", tVar);
                                                                r54 = r54;
                                                                r49 = r49;
                                                                if (objK != aVar2) {
                                                                    tVar.f18719a = r49;
                                                                    tVar.f18720b = r54;
                                                                    tVar.f18721c = serializable;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 9;
                                                                    objS = r49.s(pVar5, false, tVar);
                                                                    if (objS != aVar2) {
                                                                        return objS;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        serializable2 = serializable;
                                                        r27 = i15;
                                                        r26 = r48;
                                                        r25 = r47;
                                                    }
                                                    if (r27 == 0) {
                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                        x53.c cVar1111 = s0.f129406a;
                                                        x53.b bVar1110 = x53.b.f189152a;
                                                        w wVar1110 = new w(r25, null);
                                                        tVar.f18719a = r25;
                                                        tVar.f18720b = r26;
                                                        tVar.f18721c = serializable2;
                                                        tVar.f18722d = null;
                                                        tVar.f18728j = 10;
                                                        break;
                                                    }
                                                    r29 = serializable2;
                                                    r34 = r26;
                                                    r28 = r25;
                                                    arrayList = new ArrayList();
                                                    while (r5.hasNext()) {
                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                            arrayList.add(obj);
                                                        }
                                                    }
                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                    it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                    }
                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                    set = setG1;
                                                    r36 = r34;
                                                    r35 = r28;
                                                    if (!set.isEmpty()) {
                                                        if (r29.f105804a) {
                                                            size = r34.size();
                                                            i14 = 1;
                                                        } else {
                                                            i14 = 1;
                                                            size = r34.size() - 1;
                                                        }
                                                        if (size > i14) {
                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                        }
                                                        tVar.f18719a = r28;
                                                        tVar.f18720b = r34;
                                                        tVar.f18721c = null;
                                                        tVar.f18722d = null;
                                                        tVar.f18728j = 11;
                                                        Object objR11114 = r28.r(set, tVar);
                                                        r36 = r34;
                                                        r35 = r28;
                                                        break;
                                                    }
                                                    r35.f18712n.cancel();
                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                    it3 = r36.iterator();
                                                    while (it3.hasNext()) {
                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                    }
                                                    copyOnWriteArraySet = r35.f18711m;
                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                        pk2.x.f138495e.getClass();
                                                        xVar = pk2.x.a.e();
                                                    } else {
                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                        pk2.x.a aVar11116 = pk2.x.f138495e;
                                                        ok2.e eVar11114 = ok2.e.D;
                                                        aVar11116.getClass();
                                                        eVar11114.getClass();
                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11114, null, null));
                                                    }
                                                    return cl2.c.d(arrayList3, xVar);
                                                }
                                            }
                                        } else {
                                            r45 = r18;
                                            l14 = null;
                                            r46 = r17;
                                            i15 = 0;
                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                            wk2.i iVar1115 = r45.f18603d;
                                            tVar.f18719a = r45;
                                            tVar.f18720b = pVar4;
                                            tVar.f18721c = r46;
                                            tVar.f18722d = serializable;
                                            tVar.f18724f = z25;
                                            tVar.f18725g = i15;
                                            tVar.f18728j = 6;
                                            objT = wk2.l.b(iVar1115, l14, tVar);
                                            r48 = r46;
                                            r47 = r45;
                                            if (objT != aVar2) {
                                                bool = (Boolean) objT;
                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                    r48.replaceAll(new p(0));
                                                    serializable2 = serializable;
                                                    r26 = r48;
                                                    r25 = r47;
                                                    r27 = 1;
                                                } else {
                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                        if (bool == null) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                    } else if (z25) {
                                                        tVar.f18719a = r47;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r48;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18725g = i15;
                                                        tVar.f18728j = 7;
                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                            pVar5 = pVar4;
                                                            r49 = r47;
                                                            r54 = r48;
                                                            wk2.d f205154d1111 = r49.f18603d.getF205154d();
                                                            tVar.f18719a = r49;
                                                            tVar.f18720b = pVar5;
                                                            tVar.f18721c = r54;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 8;
                                                            objK = r49.k(f205154d1111, "checksumMismatch", tVar);
                                                            r54 = r54;
                                                            r49 = r49;
                                                            if (objK != aVar2) {
                                                                tVar.f18719a = r49;
                                                                tVar.f18720b = r54;
                                                                tVar.f18721c = serializable;
                                                                tVar.f18722d = null;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 9;
                                                                objS = r49.s(pVar5, false, tVar);
                                                                if (objS != aVar2) {
                                                                    return objS;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    serializable2 = serializable;
                                                    r27 = i15;
                                                    r26 = r48;
                                                    r25 = r47;
                                                }
                                                if (r27 == 0) {
                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                    x53.c cVar1112 = s0.f129406a;
                                                    x53.b bVar1111 = x53.b.f189152a;
                                                    w wVar1111 = new w(r25, null);
                                                    tVar.f18719a = r25;
                                                    tVar.f18720b = r26;
                                                    tVar.f18721c = serializable2;
                                                    tVar.f18722d = null;
                                                    tVar.f18728j = 10;
                                                    break;
                                                }
                                                r29 = serializable2;
                                                r34 = r26;
                                                r28 = r25;
                                                arrayList = new ArrayList();
                                                while (r5.hasNext()) {
                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                }
                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                set = setG1;
                                                r36 = r34;
                                                r35 = r28;
                                                if (!set.isEmpty()) {
                                                    if (r29.f105804a) {
                                                        size = r34.size();
                                                        i14 = 1;
                                                    } else {
                                                        i14 = 1;
                                                        size = r34.size() - 1;
                                                    }
                                                    if (size > i14) {
                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                    }
                                                    tVar.f18719a = r28;
                                                    tVar.f18720b = r34;
                                                    tVar.f18721c = null;
                                                    tVar.f18722d = null;
                                                    tVar.f18728j = 11;
                                                    Object objR11115 = r28.r(set, tVar);
                                                    r36 = r34;
                                                    r35 = r28;
                                                    break;
                                                }
                                                r35.f18712n.cancel();
                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                it3 = r36.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                }
                                                copyOnWriteArraySet = r35.f18711m;
                                                if (copyOnWriteArraySet.isEmpty()) {
                                                    pk2.x.f138495e.getClass();
                                                    xVar = pk2.x.a.e();
                                                } else {
                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                    pk2.x.a aVar11117 = pk2.x.f138495e;
                                                    ok2.e eVar11115 = ok2.e.D;
                                                    aVar11117.getClass();
                                                    eVar11115.getClass();
                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11115, null, null));
                                                }
                                                return cl2.c.d(arrayList3, xVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                it4 = r17.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        r29 = serializable;
                                        r34 = r17;
                                        r28 = r18;
                                        arrayList = new ArrayList();
                                        while (r5.hasNext()) {
                                            if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                        }
                                        setG1 = h0.g1(p13.y.s(arrayList2));
                                        set = setG1;
                                        r36 = r34;
                                        r35 = r28;
                                        if (!set.isEmpty()) {
                                            if (r29.f105804a) {
                                                size = r34.size();
                                                i14 = 1;
                                            } else {
                                                i14 = 1;
                                                size = r34.size() - 1;
                                            }
                                            if (size > i14) {
                                                r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                            }
                                            tVar.f18719a = r28;
                                            tVar.f18720b = r34;
                                            tVar.f18721c = null;
                                            tVar.f18722d = null;
                                            tVar.f18728j = 11;
                                            Object objR11116 = r28.r(set, tVar);
                                            r36 = r34;
                                            r35 = r28;
                                            break;
                                        }
                                        r35.f18712n.cancel();
                                        arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                        it3 = r36.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                        }
                                        copyOnWriteArraySet = r35.f18711m;
                                        if (copyOnWriteArraySet.isEmpty()) {
                                            pk2.x.f138495e.getClass();
                                            xVar = pk2.x.a.e();
                                        } else {
                                            r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                            pk2.x.a aVar11118 = pk2.x.f138495e;
                                            ok2.e eVar11116 = ok2.e.D;
                                            aVar11118.getClass();
                                            eVar11116.getClass();
                                            xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11116, null, null));
                                        }
                                        return cl2.c.d(arrayList3, xVar);
                                    }
                                    if (((pk2.x) ((o13.p) it4.next()).f128594a).b()) {
                                        bVarC = r18.f18600a.c(r18.f18602c.getF172493a());
                                        if (bVarC != null) {
                                            UUID uuid15 = r18.f18603d.getF205152b().f185842a;
                                            long j117 = r18.f18603d.getF205152b().f185845d;
                                            tVar.f18719a = r18;
                                            tVar.f18720b = pVar4;
                                            tVar.f18721c = r17;
                                            tVar.f18722d = serializable;
                                            tVar.f18724f = z25;
                                            tVar.f18725g = 0;
                                            tVar.f18728j = 5;
                                            objT = bVarC.n(uuid15, j117, tVar);
                                            if (objT != aVar2) {
                                                r39 = r18;
                                                r44 = r17;
                                                i15 = 0;
                                                l14 = (Long) objT;
                                                r46 = r44;
                                                r45 = r39;
                                                r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                                wk2.i iVar1116 = r45.f18603d;
                                                tVar.f18719a = r45;
                                                tVar.f18720b = pVar4;
                                                tVar.f18721c = r46;
                                                tVar.f18722d = serializable;
                                                tVar.f18724f = z25;
                                                tVar.f18725g = i15;
                                                tVar.f18728j = 6;
                                                objT = wk2.l.b(iVar1116, l14, tVar);
                                                r48 = r46;
                                                r47 = r45;
                                                if (objT != aVar2) {
                                                    bool = (Boolean) objT;
                                                    if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                        r48.replaceAll(new p(0));
                                                        serializable2 = serializable;
                                                        r26 = r48;
                                                        r25 = r47;
                                                        r27 = 1;
                                                    } else {
                                                        if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                            if (bool == null) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                        } else if (z25) {
                                                            tVar.f18719a = r47;
                                                            tVar.f18720b = pVar4;
                                                            tVar.f18721c = r48;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 7;
                                                            if (o53.m0.b(300L, tVar) != aVar2) {
                                                                pVar5 = pVar4;
                                                                r49 = r47;
                                                                r54 = r48;
                                                                wk2.d f205154d1112 = r49.f18603d.getF205154d();
                                                                tVar.f18719a = r49;
                                                                tVar.f18720b = pVar5;
                                                                tVar.f18721c = r54;
                                                                tVar.f18722d = serializable;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 8;
                                                                objK = r49.k(f205154d1112, "checksumMismatch", tVar);
                                                                r54 = r54;
                                                                r49 = r49;
                                                                if (objK != aVar2) {
                                                                    tVar.f18719a = r49;
                                                                    tVar.f18720b = r54;
                                                                    tVar.f18721c = serializable;
                                                                    tVar.f18722d = null;
                                                                    tVar.f18725g = i15;
                                                                    tVar.f18728j = 9;
                                                                    objS = r49.s(pVar5, false, tVar);
                                                                    if (objS != aVar2) {
                                                                        return objS;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        serializable2 = serializable;
                                                        r27 = i15;
                                                        r26 = r48;
                                                        r25 = r47;
                                                    }
                                                    if (r27 == 0) {
                                                        r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                        x53.c cVar1113 = s0.f129406a;
                                                        x53.b bVar1112 = x53.b.f189152a;
                                                        w wVar1112 = new w(r25, null);
                                                        tVar.f18719a = r25;
                                                        tVar.f18720b = r26;
                                                        tVar.f18721c = serializable2;
                                                        tVar.f18722d = null;
                                                        tVar.f18728j = 10;
                                                        break;
                                                    }
                                                    r29 = serializable2;
                                                    r34 = r26;
                                                    r28 = r25;
                                                    arrayList = new ArrayList();
                                                    while (r5.hasNext()) {
                                                        if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                            arrayList.add(obj);
                                                        }
                                                    }
                                                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                    it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                    }
                                                    setG1 = h0.g1(p13.y.s(arrayList2));
                                                    set = setG1;
                                                    r36 = r34;
                                                    r35 = r28;
                                                    if (!set.isEmpty()) {
                                                        if (r29.f105804a) {
                                                            size = r34.size();
                                                            i14 = 1;
                                                        } else {
                                                            i14 = 1;
                                                            size = r34.size() - 1;
                                                        }
                                                        if (size > i14) {
                                                            r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                        }
                                                        tVar.f18719a = r28;
                                                        tVar.f18720b = r34;
                                                        tVar.f18721c = null;
                                                        tVar.f18722d = null;
                                                        tVar.f18728j = 11;
                                                        Object objR11117 = r28.r(set, tVar);
                                                        r36 = r34;
                                                        r35 = r28;
                                                        break;
                                                    }
                                                    r35.f18712n.cancel();
                                                    arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                    it3 = r36.iterator();
                                                    while (it3.hasNext()) {
                                                        arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                    }
                                                    copyOnWriteArraySet = r35.f18711m;
                                                    if (copyOnWriteArraySet.isEmpty()) {
                                                        pk2.x.f138495e.getClass();
                                                        xVar = pk2.x.a.e();
                                                    } else {
                                                        r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                        pk2.x.a aVar11119 = pk2.x.f138495e;
                                                        ok2.e eVar11117 = ok2.e.D;
                                                        aVar11119.getClass();
                                                        eVar11117.getClass();
                                                        xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11117, null, null));
                                                    }
                                                    return cl2.c.d(arrayList3, xVar);
                                                }
                                            }
                                        } else {
                                            r45 = r18;
                                            l14 = null;
                                            r46 = r17;
                                            i15 = 0;
                                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                                            wk2.i iVar1117 = r45.f18603d;
                                            tVar.f18719a = r45;
                                            tVar.f18720b = pVar4;
                                            tVar.f18721c = r46;
                                            tVar.f18722d = serializable;
                                            tVar.f18724f = z25;
                                            tVar.f18725g = i15;
                                            tVar.f18728j = 6;
                                            objT = wk2.l.b(iVar1117, l14, tVar);
                                            r48 = r46;
                                            r47 = r45;
                                            if (objT != aVar2) {
                                                bool = (Boolean) objT;
                                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                                    r48.replaceAll(new p(0));
                                                    serializable2 = serializable;
                                                    r26 = r48;
                                                    r25 = r47;
                                                    r27 = 1;
                                                } else {
                                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                                        if (bool == null) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                                    } else if (z25) {
                                                        tVar.f18719a = r47;
                                                        tVar.f18720b = pVar4;
                                                        tVar.f18721c = r48;
                                                        tVar.f18722d = serializable;
                                                        tVar.f18725g = i15;
                                                        tVar.f18728j = 7;
                                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                                            pVar5 = pVar4;
                                                            r49 = r47;
                                                            r54 = r48;
                                                            wk2.d f205154d1113 = r49.f18603d.getF205154d();
                                                            tVar.f18719a = r49;
                                                            tVar.f18720b = pVar5;
                                                            tVar.f18721c = r54;
                                                            tVar.f18722d = serializable;
                                                            tVar.f18725g = i15;
                                                            tVar.f18728j = 8;
                                                            objK = r49.k(f205154d1113, "checksumMismatch", tVar);
                                                            r54 = r54;
                                                            r49 = r49;
                                                            if (objK != aVar2) {
                                                                tVar.f18719a = r49;
                                                                tVar.f18720b = r54;
                                                                tVar.f18721c = serializable;
                                                                tVar.f18722d = null;
                                                                tVar.f18725g = i15;
                                                                tVar.f18728j = 9;
                                                                objS = r49.s(pVar5, false, tVar);
                                                                if (objS != aVar2) {
                                                                    return objS;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    serializable2 = serializable;
                                                    r27 = i15;
                                                    r26 = r48;
                                                    r25 = r47;
                                                }
                                                if (r27 == 0) {
                                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                                    x53.c cVar1114 = s0.f129406a;
                                                    x53.b bVar1113 = x53.b.f189152a;
                                                    w wVar1113 = new w(r25, null);
                                                    tVar.f18719a = r25;
                                                    tVar.f18720b = r26;
                                                    tVar.f18721c = serializable2;
                                                    tVar.f18722d = null;
                                                    tVar.f18728j = 10;
                                                    break;
                                                }
                                                r29 = serializable2;
                                                r34 = r26;
                                                r28 = r25;
                                                arrayList = new ArrayList();
                                                while (r5.hasNext()) {
                                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                                it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                                }
                                                setG1 = h0.g1(p13.y.s(arrayList2));
                                                set = setG1;
                                                r36 = r34;
                                                r35 = r28;
                                                if (!set.isEmpty()) {
                                                    if (r29.f105804a) {
                                                        size = r34.size();
                                                        i14 = 1;
                                                    } else {
                                                        i14 = 1;
                                                        size = r34.size() - 1;
                                                    }
                                                    if (size > i14) {
                                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                                    }
                                                    tVar.f18719a = r28;
                                                    tVar.f18720b = r34;
                                                    tVar.f18721c = null;
                                                    tVar.f18722d = null;
                                                    tVar.f18728j = 11;
                                                    Object objR11118 = r28.r(set, tVar);
                                                    r36 = r34;
                                                    r35 = r28;
                                                    break;
                                                }
                                                r35.f18712n.cancel();
                                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                                it3 = r36.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                                }
                                                copyOnWriteArraySet = r35.f18711m;
                                                if (copyOnWriteArraySet.isEmpty()) {
                                                    pk2.x.f138495e.getClass();
                                                    xVar = pk2.x.a.e();
                                                } else {
                                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                                    pk2.x.a aVar111110 = pk2.x.f138495e;
                                                    ok2.e eVar11118 = ok2.e.D;
                                                    aVar111110.getClass();
                                                    eVar11118.getClass();
                                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11118, null, null));
                                                }
                                                return cl2.c.d(arrayList3, xVar);
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar2;
                        case 5:
                            int i17 = tVar.f18725g;
                            z25 = tVar.f18724f;
                            m0 m0Var2 = (m0) tVar.f18722d;
                            ArrayList arrayList6 = (ArrayList) tVar.f18721c;
                            pVar4 = (e23.p) tVar.f18720b;
                            r rVar4 = tVar.f18719a;
                            o13.r.b(objT);
                            i15 = i17;
                            serializable = m0Var2;
                            r44 = arrayList6;
                            r39 = rVar4;
                            l14 = (Long) objT;
                            r46 = r44;
                            r45 = r39;
                            r45.d().info("Calculated device checksum for " + r45.f18603d.getF205152b().f185842a + " checksum=" + l14);
                            wk2.i iVar1118 = r45.f18603d;
                            tVar.f18719a = r45;
                            tVar.f18720b = pVar4;
                            tVar.f18721c = r46;
                            tVar.f18722d = serializable;
                            tVar.f18724f = z25;
                            tVar.f18725g = i15;
                            tVar.f18728j = 6;
                            objT = wk2.l.b(iVar1118, l14, tVar);
                            r48 = r46;
                            r47 = r45;
                            if (objT != aVar2) {
                                bool = (Boolean) objT;
                                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                    r48.replaceAll(new p(0));
                                    serializable2 = serializable;
                                    r26 = r48;
                                    r25 = r47;
                                    r27 = 1;
                                } else {
                                    if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                        if (bool == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                    } else if (z25) {
                                        tVar.f18719a = r47;
                                        tVar.f18720b = pVar4;
                                        tVar.f18721c = r48;
                                        tVar.f18722d = serializable;
                                        tVar.f18725g = i15;
                                        tVar.f18728j = 7;
                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                            pVar5 = pVar4;
                                            r49 = r47;
                                            r54 = r48;
                                            wk2.d f205154d1114 = r49.f18603d.getF205154d();
                                            tVar.f18719a = r49;
                                            tVar.f18720b = pVar5;
                                            tVar.f18721c = r54;
                                            tVar.f18722d = serializable;
                                            tVar.f18725g = i15;
                                            tVar.f18728j = 8;
                                            objK = r49.k(f205154d1114, "checksumMismatch", tVar);
                                            r54 = r54;
                                            r49 = r49;
                                            if (objK != aVar2) {
                                                tVar.f18719a = r49;
                                                tVar.f18720b = r54;
                                                tVar.f18721c = serializable;
                                                tVar.f18722d = null;
                                                tVar.f18725g = i15;
                                                tVar.f18728j = 9;
                                                objS = r49.s(pVar5, false, tVar);
                                                if (objS != aVar2) {
                                                    return objS;
                                                }
                                            }
                                        }
                                    }
                                    serializable2 = serializable;
                                    r27 = i15;
                                    r26 = r48;
                                    r25 = r47;
                                }
                                if (r27 == 0) {
                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                    x53.c cVar1115 = s0.f129406a;
                                    x53.b bVar1114 = x53.b.f189152a;
                                    w wVar1114 = new w(r25, null);
                                    tVar.f18719a = r25;
                                    tVar.f18720b = r26;
                                    tVar.f18721c = serializable2;
                                    tVar.f18722d = null;
                                    tVar.f18728j = 10;
                                    break;
                                }
                                r29 = serializable2;
                                r34 = r26;
                                r28 = r25;
                                arrayList = new ArrayList();
                                while (r5.hasNext()) {
                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                        arrayList.add(obj);
                                    }
                                }
                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                }
                                setG1 = h0.g1(p13.y.s(arrayList2));
                                set = setG1;
                                r36 = r34;
                                r35 = r28;
                                if (!set.isEmpty()) {
                                    if (r29.f105804a) {
                                        size = r34.size();
                                        i14 = 1;
                                    } else {
                                        i14 = 1;
                                        size = r34.size() - 1;
                                    }
                                    if (size > i14) {
                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                    }
                                    tVar.f18719a = r28;
                                    tVar.f18720b = r34;
                                    tVar.f18721c = null;
                                    tVar.f18722d = null;
                                    tVar.f18728j = 11;
                                    Object objR11119 = r28.r(set, tVar);
                                    r36 = r34;
                                    r35 = r28;
                                    break;
                                }
                                r35.f18712n.cancel();
                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                it3 = r36.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                }
                                copyOnWriteArraySet = r35.f18711m;
                                if (copyOnWriteArraySet.isEmpty()) {
                                    pk2.x.f138495e.getClass();
                                    xVar = pk2.x.a.e();
                                } else {
                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                    pk2.x.a aVar111111 = pk2.x.f138495e;
                                    ok2.e eVar11119 = ok2.e.D;
                                    aVar111111.getClass();
                                    eVar11119.getClass();
                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar11119, null, null));
                                }
                                return cl2.c.d(arrayList3, xVar);
                            }
                            return aVar2;
                        case 6:
                            int i18 = tVar.f18725g;
                            z25 = tVar.f18724f;
                            m0 m0Var3 = (m0) tVar.f18722d;
                            ArrayList arrayList7 = (ArrayList) tVar.f18721c;
                            pVar4 = (e23.p) tVar.f18720b;
                            r rVar5 = tVar.f18719a;
                            o13.r.b(objT);
                            i15 = i18;
                            serializable = m0Var3;
                            r48 = arrayList7;
                            r47 = rVar5;
                            bool = (Boolean) objT;
                            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                                r48.replaceAll(new p(0));
                                serializable2 = serializable;
                                r26 = r48;
                                r25 = r47;
                                r27 = 1;
                            } else {
                                if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                                    if (z25) {
                                        tVar.f18719a = r47;
                                        tVar.f18720b = pVar4;
                                        tVar.f18721c = r48;
                                        tVar.f18722d = serializable;
                                        tVar.f18725g = i15;
                                        tVar.f18728j = 7;
                                        if (o53.m0.b(300L, tVar) != aVar2) {
                                            pVar5 = pVar4;
                                            r49 = r47;
                                            r54 = r48;
                                            wk2.d f205154d1115 = r49.f18603d.getF205154d();
                                            tVar.f18719a = r49;
                                            tVar.f18720b = pVar5;
                                            tVar.f18721c = r54;
                                            tVar.f18722d = serializable;
                                            tVar.f18725g = i15;
                                            tVar.f18728j = 8;
                                            objK = r49.k(f205154d1115, "checksumMismatch", tVar);
                                            r54 = r54;
                                            r49 = r49;
                                            if (objK != aVar2) {
                                                tVar.f18719a = r49;
                                                tVar.f18720b = r54;
                                                tVar.f18721c = serializable;
                                                tVar.f18722d = null;
                                                tVar.f18725g = i15;
                                                tVar.f18728j = 9;
                                                objS = r49.s(pVar5, false, tVar);
                                                if (objS != aVar2) {
                                                    return objS;
                                                }
                                            }
                                        }
                                    }
                                    return aVar2;
                                }
                                if (bool == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r47.d().warn("Unable to calculate checksum for " + r47.f18603d.getF205152b().f185842a + ", size=" + r47.f18603d.getF205152b().f185845d);
                                serializable2 = serializable;
                                r27 = i15;
                                r26 = r48;
                                r25 = r47;
                            }
                            if (r27 == 0) {
                                r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                x53.c cVar1116 = s0.f129406a;
                                x53.b bVar1115 = x53.b.f189152a;
                                w wVar1115 = new w(r25, null);
                                tVar.f18719a = r25;
                                tVar.f18720b = r26;
                                tVar.f18721c = serializable2;
                                tVar.f18722d = null;
                                tVar.f18728j = 10;
                                break;
                            }
                            r29 = serializable2;
                            r34 = r26;
                            r28 = r25;
                            arrayList = new ArrayList();
                            while (r5.hasNext()) {
                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                    arrayList.add(obj);
                                }
                            }
                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                            }
                            setG1 = h0.g1(p13.y.s(arrayList2));
                            set = setG1;
                            r36 = r34;
                            r35 = r28;
                            if (!set.isEmpty()) {
                                if (r29.f105804a) {
                                    size = r34.size();
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                    size = r34.size() - 1;
                                }
                                if (size > i14) {
                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                }
                                tVar.f18719a = r28;
                                tVar.f18720b = r34;
                                tVar.f18721c = null;
                                tVar.f18722d = null;
                                tVar.f18728j = 11;
                                Object objR111110 = r28.r(set, tVar);
                                r36 = r34;
                                r35 = r28;
                                break;
                            }
                            r35.f18712n.cancel();
                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                            it3 = r36.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                            }
                            copyOnWriteArraySet = r35.f18711m;
                            if (copyOnWriteArraySet.isEmpty()) {
                                pk2.x.f138495e.getClass();
                                xVar = pk2.x.a.e();
                            } else {
                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                pk2.x.a aVar111112 = pk2.x.f138495e;
                                ok2.e eVar111110 = ok2.e.D;
                                aVar111112.getClass();
                                eVar111110.getClass();
                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar111110, null, null));
                            }
                            return cl2.c.d(arrayList3, xVar);
                        case 7:
                            int i19 = tVar.f18725g;
                            m0 m0Var4 = (m0) tVar.f18722d;
                            ArrayList arrayList8 = (ArrayList) tVar.f18721c;
                            pVar5 = (e23.p) tVar.f18720b;
                            r rVar6 = tVar.f18719a;
                            o13.r.b(objT);
                            i15 = i19;
                            serializable = m0Var4;
                            r54 = arrayList8;
                            r49 = rVar6;
                            wk2.d f205154d1116 = r49.f18603d.getF205154d();
                            tVar.f18719a = r49;
                            tVar.f18720b = pVar5;
                            tVar.f18721c = r54;
                            tVar.f18722d = serializable;
                            tVar.f18725g = i15;
                            tVar.f18728j = 8;
                            objK = r49.k(f205154d1116, "checksumMismatch", tVar);
                            r54 = r54;
                            r49 = r49;
                            if (objK != aVar2) {
                                tVar.f18719a = r49;
                                tVar.f18720b = r54;
                                tVar.f18721c = serializable;
                                tVar.f18722d = null;
                                tVar.f18725g = i15;
                                tVar.f18728j = 9;
                                objS = r49.s(pVar5, false, tVar);
                                if (objS != aVar2) {
                                    return objS;
                                }
                            }
                            return aVar2;
                        case 8:
                            int i24 = tVar.f18725g;
                            m0 m0Var5 = (m0) tVar.f18722d;
                            ArrayList arrayList9 = (ArrayList) tVar.f18721c;
                            pVar5 = (e23.p) tVar.f18720b;
                            r rVar7 = tVar.f18719a;
                            o13.r.b(objT);
                            i15 = i24;
                            serializable = m0Var5;
                            r54 = arrayList9;
                            r49 = rVar7;
                            tVar.f18719a = r49;
                            tVar.f18720b = r54;
                            tVar.f18721c = serializable;
                            tVar.f18722d = null;
                            tVar.f18725g = i15;
                            tVar.f18728j = 9;
                            objS = r49.s(pVar5, false, tVar);
                            if (objS != aVar2) {
                                return aVar2;
                            }
                            return objS;
                        case 9:
                            r14 = tVar.f18725g;
                            serializable = (m0) tVar.f18721c;
                            r17 = (ArrayList) tVar.f18720b;
                            r18 = tVar.f18719a;
                            try {
                                o13.r.b(objT);
                                return objT;
                            } catch (Throwable th13) {
                                th = th13;
                                r18.d().warn("Failed to request checksum for " + r18.f18603d.getF205152b().f185842a, th);
                                serializable2 = serializable;
                                r26 = r17;
                                r25 = r18;
                                r27 = r14;
                                if (r27 == 0) {
                                    r25.d().warn("Uploaded invalid content: Reset file content to reread file next time");
                                    x53.c cVar1117 = s0.f129406a;
                                    x53.b bVar1116 = x53.b.f189152a;
                                    w wVar1116 = new w(r25, null);
                                    tVar.f18719a = r25;
                                    tVar.f18720b = r26;
                                    tVar.f18721c = serializable2;
                                    tVar.f18722d = null;
                                    tVar.f18728j = 10;
                                    break;
                                }
                                r29 = serializable2;
                                r34 = r26;
                                r28 = r25;
                                arrayList = new ArrayList();
                                while (r5.hasNext()) {
                                    if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                        arrayList.add(obj);
                                    }
                                }
                                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add((List) ((o13.p) it.next()).f128595b);
                                }
                                setG1 = h0.g1(p13.y.s(arrayList2));
                                set = setG1;
                                r36 = r34;
                                r35 = r28;
                                if (!set.isEmpty()) {
                                    if (r29.f105804a) {
                                        size = r34.size();
                                        i14 = 1;
                                    } else {
                                        i14 = 1;
                                        size = r34.size() - 1;
                                    }
                                    if (size > i14) {
                                        r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                    }
                                    tVar.f18719a = r28;
                                    tVar.f18720b = r34;
                                    tVar.f18721c = null;
                                    tVar.f18722d = null;
                                    tVar.f18728j = 11;
                                    Object objR111111 = r28.r(set, tVar);
                                    r36 = r34;
                                    r35 = r28;
                                    break;
                                }
                                r35.f18712n.cancel();
                                arrayList3 = new ArrayList(p13.y.r(r36, 10));
                                it3 = r36.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                                }
                                copyOnWriteArraySet = r35.f18711m;
                                if (copyOnWriteArraySet.isEmpty()) {
                                    pk2.x.f138495e.getClass();
                                    xVar = pk2.x.a.e();
                                } else {
                                    r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                    pk2.x.a aVar111113 = pk2.x.f138495e;
                                    ok2.e eVar111111 = ok2.e.D;
                                    aVar111113.getClass();
                                    eVar111111.getClass();
                                    xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar111111, null, null));
                                }
                                return cl2.c.d(arrayList3, xVar);
                            }
                        case 10:
                            serializable2 = (m0) tVar.f18721c;
                            r26 = (ArrayList) tVar.f18720b;
                            r25 = tVar.f18719a;
                            o13.r.b(objT);
                            r29 = serializable2;
                            r34 = r26;
                            r28 = r25;
                            arrayList = new ArrayList();
                            while (r5.hasNext()) {
                                if (!((pk2.x) ((o13.p) obj).f128594a).f138496a.f138508a) {
                                    arrayList.add(obj);
                                }
                            }
                            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((List) ((o13.p) it.next()).f128595b);
                            }
                            setG1 = h0.g1(p13.y.s(arrayList2));
                            set = setG1;
                            r36 = r34;
                            r35 = r28;
                            if (!set.isEmpty()) {
                                if (r29.f105804a) {
                                    size = r34.size();
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                    size = r34.size() - 1;
                                }
                                if (size > i14) {
                                    r28.d().info("Item " + r28.f18603d.getId() + " has results for " + size + " agents but only archiving for " + setG1.size());
                                }
                                tVar.f18719a = r28;
                                tVar.f18720b = r34;
                                tVar.f18721c = null;
                                tVar.f18722d = null;
                                tVar.f18728j = 11;
                                Object objR111112 = r28.r(set, tVar);
                                r36 = r34;
                                r35 = r28;
                                break;
                            }
                            r35.f18712n.cancel();
                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                            it3 = r36.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                            }
                            copyOnWriteArraySet = r35.f18711m;
                            if (copyOnWriteArraySet.isEmpty()) {
                                pk2.x.f138495e.getClass();
                                xVar = pk2.x.a.e();
                            } else {
                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                pk2.x.a aVar111114 = pk2.x.f138495e;
                                ok2.e eVar111112 = ok2.e.D;
                                aVar111114.getClass();
                                eVar111112.getClass();
                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar111112, null, null));
                            }
                            return cl2.c.d(arrayList3, xVar);
                        case 11:
                            ArrayList arrayList10 = (ArrayList) tVar.f18720b;
                            r rVar8 = tVar.f18719a;
                            o13.r.b(objT);
                            r36 = arrayList10;
                            r35 = rVar8;
                            r35.f18712n.cancel();
                            arrayList3 = new ArrayList(p13.y.r(r36, 10));
                            it3 = r36.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((pk2.x) ((o13.p) it3.next()).f128594a);
                            }
                            copyOnWriteArraySet = r35.f18711m;
                            if (copyOnWriteArraySet.isEmpty()) {
                                pk2.x.f138495e.getClass();
                                xVar = pk2.x.a.e();
                            } else {
                                r35.d().warn("No agents handled transfer result but flags=" + copyOnWriteArraySet + " were updated for " + r35.f18603d.getId() + ", treating as archived by device");
                                pk2.x.a aVar111115 = pk2.x.f138495e;
                                ok2.e eVar111113 = ok2.e.D;
                                aVar111115.getClass();
                                eVar111113.getClass();
                                xVar = new pk2.x(pk2.y.TREAT_AS_SUCCESS, new CoreTransferException(eVar111113, null, null));
                            }
                            return cl2.c.d(arrayList3, xVar);
                        default:
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    r14 = r55;
                    serializable = "Failed app provided processData(";
                    r16 = str;
                    r15 = str3;
                }
            } catch (Throwable th15) {
                th = th15;
                r14 = r55;
                serializable = "Failed app provided processData(";
                r24 = str;
                r19 = str2;
            }
        } catch (Throwable th16) {
            th = th16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(Exception exc, v13.c cVar) {
        x xVar;
        ArrayList arrayListX;
        pk2.x xVarG;
        ArrayList arrayList;
        pk2.x xVar2;
        List<UUID> listV;
        ok2.e failure;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f18743e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f18743e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.f18741c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f18743e;
        if (i15 == 0) {
            arrayListX = v.h.x(obj);
            HashSet hashSet = new HashSet();
            xVarG = g(exc);
            CoreTransferException coreTransferException = xVarG.f138497b;
            wk2.i iVar = this.f18603d;
            if (iVar.getF205163m() != null && coreTransferException != null && (failure = coreTransferException.getFailure()) != null && !failure.a()) {
                pk2.x.f138495e.getClass();
                arrayListX.add(pk2.x.a.d(coreTransferException));
                wk2.l.c(iVar, iVar.getF205152b(), coreTransferException);
            }
            for (f0 f0Var : this.f18600a.getConfiguration().f132627g) {
                pk2.x xVarB = cl2.c.b(f0Var, this.f18602c, iVar, xVarG, d());
                if (xVarB != null) {
                    if (!xVarB.f138496a.f138508a) {
                        try {
                            listV = f0Var.v(xVarB);
                        } catch (Throwable unused) {
                            listV = f0Var.getF159941g().f113303b;
                        }
                        hashSet.addAll(listV);
                    }
                    arrayListX.add(xVarB);
                }
            }
            ItemAccessException itemAccessException = exc instanceof ItemAccessException ? (ItemAccessException) exc : null;
            if ((itemAccessException != null ? itemAccessException.getItemAccessResult() : null) == GDIFileAccess.ItemAccessResult.UNKNOWN_ITEM) {
                d().warn("Skip archive for device unknown item " + iVar.getId());
            } else if (!hashSet.isEmpty()) {
                d().warn("Item " + iVar.getId() + " BT error but archiving for " + hashSet.size());
                xVar.f18739a = arrayListX;
                xVar.f18740b = xVarG;
                xVar.f18743e = 1;
                if (r(hashSet, xVar) == obj2) {
                    return obj2;
                }
                arrayList = arrayListX;
                xVar2 = xVarG;
            }
            return cl2.c.d(arrayListX, xVarG);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xVar2 = xVar.f18740b;
        arrayList = xVar.f18739a;
        o13.r.b(obj);
        xVarG = xVar2;
        arrayListX = arrayList;
        return cl2.c.d(arrayListX, xVarG);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl2/r$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

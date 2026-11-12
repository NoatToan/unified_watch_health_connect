package ml2;

import com.garmin.device.multilink.MultiLinkClosedException;
import com.garmin.device.multilink.MultiLinkException;
import com.garmin.device.multilink.reliable.MLRConnectionHelper;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o53.e1;
import o53.j0;
import o53.l1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lml2/s;", "Lml2/r;", "", "connectionId", "Lml2/z;", "info", "Lml2/l;", "communicator", "Lml2/i0;", "writer", "Lcom/garmin/device/multilink/reliable/MLRConnectionHelper;", "reliableHelper", "", "", "seedData", "<init>", "(Ljava/lang/String;Lml2/z;Lml2/l;Lml2/i0;Lcom/garmin/device/multilink/reliable/MLRConnectionHelper;Ljava/util/List;)V", "a", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f119441m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f119442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f119443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f119444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MLRConnectionHelper f119445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f119446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cz2.h f119447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o53.i0<Void> f119448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o53.i0<Void> f119449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f119450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f119451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f119452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f119453l;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"ml2/s$b", "Lcom/google/common/util/concurrent/FutureCallback;", "Ljava/lang/Void;", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<Long, Long, Unit> f119454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f119455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f119456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dz2.b f119457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s f119458e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super Long, ? super Long, Unit> pVar, long j8, int i14, dz2.b bVar, s sVar) {
            this.f119454a = pVar;
            this.f119455b = j8;
            this.f119456c = i14;
            this.f119457d = bVar;
            this.f119458e = sVar;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            th3.getClass();
            boolean z14 = th3 instanceof MultiLinkClosedException;
            s sVar = this.f119458e;
            if (!z14) {
                sVar.f119446e.error("Reliable Write failed ", th3);
            } else {
                ds.e0.v("Reliable Write failed ", th3.getMessage(), sVar.f119446e);
            }
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Void r14) {
            e23.p<Long, Long, Unit> pVar = this.f119454a;
            if (pVar != null) {
                pVar.invoke(Long.valueOf(this.f119455b + ((long) this.f119456c)), Long.valueOf(this.f119457d.getF61810d()));
            }
        }
    }

    static {
        new a(null);
    }

    public s(String str, z zVar, l lVar, i0 i0Var, MLRConnectionHelper mLRConnectionHelper, List<byte[]> list) {
        str.getClass();
        zVar.getClass();
        lVar.getClass();
        i0Var.getClass();
        this.f119442a = zVar;
        this.f119443b = lVar;
        this.f119444c = i0Var;
        this.f119445d = mLRConnectionHelper;
        this.f119446e = LoggerFactory.getLogger(m.a("MultiLinkService", str, this));
        this.f119447f = new cz2.h();
        this.f119450i = new byte[0];
        this.f119452k = list != null ? new ArrayList(list) : new ArrayList();
        this.f119453l = Executors.newSingleThreadExecutor();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134 A[PHI: r0
      0x0134: PHI (r0v3 ??) = (r0v8 ??), (r0v29 ??) binds: [B:47:0x00ef, B:35:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149 A[PHI: r0
      0x0149: PHI (r0v15 ??) = (r0v26 ??), (r0v27 ??) binds: [B:59:0x0136, B:63:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [ml2.s] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15, types: [ml2.s] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [ml2.s] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [ml2.s] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [ml2.s] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [ml2.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0108 -> B:54:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0119 -> B:55:0x0114). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(ml2.s r22, dz2.b r23, e23.p r24, v13.c r25) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.s.e(ml2.s, dz2.b, e23.p, v13.c):java.lang.Object");
    }

    @Override // ml2.r
    public final Object a(byte[] bArr, v13.i iVar) {
        Object objC = c(new dz2.f(bArr), null, iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objC != aVar) {
            objC = Unit.INSTANCE;
        }
        return objC == aVar ? objC : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ml2.r
    public final Object b(v13.c cVar) {
        t tVar;
        s sVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f119462d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f119462d = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f119460b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f119462d;
        if (i15 == 0) {
            o13.r.b(obj);
            h();
            try {
                l lVar = this.f119443b;
                z zVar = this.f119442a;
                ListenableFuture<Void> listenableFutureE = lVar.e(zVar.f119488a, zVar.f119490c);
                listenableFutureE.getClass();
                tVar.f119459a = this;
                tVar.f119462d = 1;
                if (t53.c.b(listenableFutureE, tVar) == aVar) {
                    return aVar;
                }
            } catch (Exception e4) {
                e = e4;
                sVar = this;
                sVar.f119446e.error("Failure closing service " + sVar.f119442a.f119488a, (Throwable) e);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sVar = tVar.f119459a;
            try {
                o13.r.b(obj);
            } catch (Exception e14) {
                e = e14;
                sVar.f119446e.error("Failure closing service " + sVar.f119442a.f119488a, (Throwable) e);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // ml2.r
    public final Object c(dz2.b bVar, e23.p pVar, v13.i iVar) {
        if (bVar.getF61810d() <= 0) {
            return Unit.INSTANCE;
        }
        v vVar = new v(this, bVar, pVar, null);
        cz2.h hVar = this.f119447f;
        hVar.getClass();
        Object objY = ge1.b.Y(new cz2.i(vVar, 0, hVar, null), iVar);
        return objY == u13.a.COROUTINE_SUSPENDED ? objY : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    @Override // ml2.r
    public final void d(y yVar) {
        yVar.getClass();
        r0 r0Var = new r0();
        synchronized (this.f119450i) {
            this.f119451j = yVar;
            r0Var.f105810a = this.f119452k;
            this.f119452k = null;
            this.f119453l.submit(new fh2.a(r0Var, 19, yVar, this));
        }
    }

    public final o53.i0<Void> f(dz2.b bVar, int i14, long j8, e23.p<? super Long, ? super Long, Unit> pVar) throws Exception {
        byte[] bArrCopyOf = new byte[i14];
        int iB = bVar.b(0, i14, bArrCopyOf);
        if (iB != i14) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iB);
        }
        try {
            MLRConnectionHelper mLRConnectionHelper = this.f119445d;
            mLRConnectionHelper.getClass();
            ListenableFuture<Void> listenableFutureSendDataBlob = mLRConnectionHelper.sendDataBlob(this.f119442a.f119490c, bArrCopyOf);
            Futures.addCallback(listenableFutureSendDataBlob, new b(pVar, j8, iB, bVar, this), MoreExecutors.directExecutor());
            listenableFutureSendDataBlob.getClass();
            return t53.c.a(listenableFutureSendDataBlob);
        } catch (Exception e4) {
            if (e4 instanceof MultiLinkException) {
                throw e4;
            }
            throw new MultiLinkException("Failed reliable write", e4);
        }
    }

    public final t53.b g(dz2.f fVar) {
        j0 j0VarJ = ge1.b.j(e1.f129333a, null, null, new u(this, fVar, null), 3);
        t53.b bVar = new t53.b(j0VarJ);
        j0VarJ.J(new sy.i(6, bVar, j0VarJ));
        return bVar;
    }

    @Override // ml2.r
    /* JADX INFO: renamed from: getInfo, reason: from getter */
    public final z getF119442a() {
        return this.f119442a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.ArrayList] */
    public final void h() {
        y yVar;
        cz2.h hVar = this.f119447f;
        hVar.getClass();
        r0 r0Var = new r0();
        synchronized (hVar.f56902a) {
            try {
                hVar.f56903b = false;
                PriorityQueue<cz2.h.b> priorityQueue = hVar.f56902a;
                ?? arrayList = new ArrayList(p13.y.r(priorityQueue, 10));
                Iterator<cz2.h.b> it = priorityQueue.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f56906b);
                }
                r0Var.f105810a = arrayList;
                hVar.f56902a.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        cz2.h.b bVar = hVar.f56904c;
        if (bVar != null) {
            g8.i.q("OperationQueue closed", bVar.f56906b);
        }
        Iterator it3 = ((Iterable) r0Var.f105810a).iterator();
        while (it3.hasNext()) {
            g8.i.q("OperationQueue closed", (l1) it3.next());
        }
        o53.i0<Void> i0Var = this.f119448g;
        if (i0Var != null) {
            i0Var.c(null);
        }
        o53.i0<Void> i0Var2 = this.f119449h;
        if (i0Var2 != null) {
            i0Var2.c(null);
        }
        MLRConnectionHelper mLRConnectionHelper = this.f119445d;
        if (mLRConnectionHelper != null) {
            mLRConnectionHelper.onCloseHandle(this.f119442a.f119490c);
        }
        synchronized (this.f119450i) {
            yVar = this.f119451j;
            this.f119451j = null;
            Unit unit2 = Unit.INSTANCE;
        }
        if (yVar != null) {
            yVar.c(this.f119442a.f119488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x0031, B:29:0x0097, B:31:0x009b, B:25:0x0071), top: B:40:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0095 -> B:29:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(dz2.b r12, e23.p r13, v13.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ml2.x
            if (r0 == 0) goto L13
            r0 = r14
            ml2.x r0 = (ml2.x) r0
            int r1 = r0.f119487j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f119487j = r1
            goto L18
        L13:
            ml2.x r0 = new ml2.x
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f119485h
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f119487j
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L39
            int r12 = r0.f119483f
            long r4 = r0.f119484g
            int r13 = r0.f119482e
            byte[] r2 = r0.f119481d
            e23.p r6 = r0.f119480c
            dz2.b r7 = r0.f119479b
            ml2.s r8 = r0.f119478a
            o13.r.b(r14)     // Catch: java.lang.Exception -> L36
            r14 = r6
            goto L97
        L36:
            r12 = move-exception
            goto Lae
        L39:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r12)
            r12 = 0
            return r12
        L40:
            o13.r.b(r14)
            ml2.l r14 = r11.f119443b
            r2 = 0
            int r14 = r14.f(r2)
            int r4 = r14 + 1
            byte[] r4 = new byte[r4]
            ml2.z r5 = r11.f119442a
            int r5 = r5.f119490c
            byte r5 = (byte) r5
            r4[r2] = r5
            r5 = 0
            r2 = r14
            r14 = r13
            r13 = r2
            r8 = r11
            r2 = r4
            r4 = r5
        L5d:
            boolean r6 = r12.d()
            if (r6 == 0) goto Lbc
            int r6 = r12.b(r3, r13, r2)
            if (r6 != r13) goto L6b
            r7 = r2
            goto L71
        L6b:
            int r7 = r6 + 1
            byte[] r7 = java.util.Arrays.copyOf(r2, r7)
        L71:
            ml2.i0 r9 = r8.f119444c     // Catch: java.lang.Exception -> L36
            ml2.z r10 = r8.f119442a     // Catch: java.lang.Exception -> L36
            int r10 = r10.f119490c     // Catch: java.lang.Exception -> L36
            com.google.common.util.concurrent.ListenableFuture r7 = r9.a(r10, r7)     // Catch: java.lang.Exception -> L36
            r7.getClass()     // Catch: java.lang.Exception -> L36
            r0.f119478a = r8     // Catch: java.lang.Exception -> L36
            r0.f119479b = r12     // Catch: java.lang.Exception -> L36
            r0.f119480c = r14     // Catch: java.lang.Exception -> L36
            r0.f119481d = r2     // Catch: java.lang.Exception -> L36
            r0.f119482e = r13     // Catch: java.lang.Exception -> L36
            r0.f119484g = r4     // Catch: java.lang.Exception -> L36
            r0.f119483f = r6     // Catch: java.lang.Exception -> L36
            r0.f119487j = r3     // Catch: java.lang.Exception -> L36
            java.lang.Object r7 = t53.c.b(r7, r0)     // Catch: java.lang.Exception -> L36
            if (r7 != r1) goto L95
            return r1
        L95:
            r7 = r12
            r12 = r6
        L97:
            long r9 = (long) r12     // Catch: java.lang.Exception -> L36
            long r4 = r4 + r9
            if (r14 == 0) goto Lac
            java.lang.Long r12 = new java.lang.Long     // Catch: java.lang.Exception -> L36
            r12.<init>(r4)     // Catch: java.lang.Exception -> L36
            long r9 = r7.getF61810d()     // Catch: java.lang.Exception -> L36
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Exception -> L36
            r6.<init>(r9)     // Catch: java.lang.Exception -> L36
            r14.invoke(r12, r6)     // Catch: java.lang.Exception -> L36
        Lac:
            r12 = r7
            goto L5d
        Lae:
            boolean r13 = r12 instanceof com.garmin.device.multilink.MultiLinkException
            if (r13 == 0) goto Lb3
            goto Lbb
        Lb3:
            com.garmin.device.multilink.MultiLinkException r13 = new com.garmin.device.multilink.MultiLinkException
            java.lang.String r14 = "Failed write"
            r13.<init>(r14, r12)
            r12 = r13
        Lbb:
            throw r12
        Lbc:
            kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.s.i(dz2.b, e23.p, v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lml2/s$a;", "", "<init>", "()V", "", "DEFAULT_RELIABLE_BUFFER_SIZE", "I", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

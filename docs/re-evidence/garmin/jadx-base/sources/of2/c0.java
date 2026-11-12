package of2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.o2;
import r53.p2;
import r53.q2;
import r53.s1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lof2/c0;", "", "Lmf2/c;", "analyticsManager", "Luf2/q0;", "interactorManager", "Lfg2/c;", "deviceProvider", "Lfg2/y;", "sessionTypeProvider", "Lbh2/b;", "getProtobufDataHandler", "Lgg2/e;", "liveActivitySessionServiceManager", "<init>", "(Lmf2/c;Luf2/q0;Lfg2/c;Lfg2/y;Lbh2/b;Lgg2/e;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f131771p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mf2.c f131772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf2.q0 f131773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg2.c f131774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg2.y f131775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bh2.b f131776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f131777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f131778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public au0.d0 f131779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qf2.a f131780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg2.d0 f131781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public au0.c0 f131782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y0 f131783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f131784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f131785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f131786o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {711, 712}, m = "abortSession", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public of2.b f131787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f131788b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f131790d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f131788b = obj;
            this.f131790d |= Integer.MIN_VALUE;
            int i14 = c0.f131771p;
            return c0.this.a(null, this);
        }
    }

    static {
        new a(null);
    }

    public c0(mf2.c cVar, uf2.q0 q0Var, fg2.c cVar2, fg2.y yVar, bh2.b bVar, gg2.e eVar) {
        cVar.getClass();
        q0Var.getClass();
        cVar2.getClass();
        yVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f131772a = cVar;
        this.f131773b = q0Var;
        this.f131774c = cVar2;
        this.f131775d = yVar;
        this.f131776e = bVar;
        this.f131777f = o13.m.b(new oe0.e(2));
        this.f131778g = q2.a(null);
        this.f131780i = new qf2.a(0, 0, 0, false, false, false, 63, null);
        this.f131781j = new fg2.d0();
        Boolean bool = Boolean.FALSE;
        this.f131784m = q2.a(bool);
        this.f131785n = q2.a(bool);
        this.f131786o = new ArrayList();
        x53.c cVar3 = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new k0(this, null), 3);
        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new gg2.d(new gg2.c(this, eVar, cVar2), null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0140  */
    /* JADX WARN: Code duplicated, block: B:37:0x015e  */
    /* JADX WARN: Code duplicated, block: B:39:0x016c  */
    /* JADX WARN: Code duplicated, block: B:42:0x018c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01db  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x0251  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0139, code lost:
    
        if (r17.q(r11, r10, r1, r4, r8, r5, null, null, r9, null, false, true, r13, r14) == r15) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c0, code lost:
    
        if (r17.q(r7, r2, r3, r4, r5, r6, null, null, r9, null, false, true, r13, r14) == r15) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x024b, code lost:
    
        if (r1.g(r4, r5, r0, true, r14) == r15) goto L58;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x01ed, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c0 c0Var, UUID uuid, rs2.c cVar, zf2.a aVar, zf2.i iVar, String str, yf2.a aVar2, boolean z14, t13.d dVar) {
        d0 d0Var;
        rs2.c cVar2;
        zf2.a aVar3;
        zf2.i iVar2;
        boolean z15;
        long j8;
        String str2;
        UUID uuid2;
        rs2.c cVar3;
        zf2.i iVar3;
        boolean z16;
        zf2.a aVar4;
        jg2.a aVar5;
        zg2.c cVar4;
        of2.b bVar;
        String str3;
        jg2.a aVar6;
        UUID uuid3;
        p2 p2Var;
        zg2.a aVar7;
        String str4;
        zf2.a aVar8;
        boolean z17;
        c0Var.getClass();
        if (dVar instanceof d0) {
            d0Var = (d0) dVar;
            int i14 = d0Var.f131805k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f131805k = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(c0Var, dVar);
            }
        } else {
            d0Var = new d0(c0Var, dVar);
        }
        d0 d0Var2 = d0Var;
        Object objC = d0Var2.f131803i;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        switch (d0Var2.f131805k) {
            case 0:
                o13.r.b(objC);
                zg2.c.f204692a.getClass();
                zg2.c.a("LSVSessionManager", "appInitiatedStartSupportedSport");
                long f172494b = cVar.getF92746j();
                d0Var2.f131795a = uuid;
                cVar2 = cVar;
                d0Var2.f131796b = cVar2;
                aVar3 = aVar;
                d0Var2.f131797c = aVar3;
                iVar2 = iVar;
                d0Var2.f131798d = iVar2;
                d0Var2.f131799e = str;
                z15 = z14;
                d0Var2.f131801g = z15;
                d0Var2.f131802h = f172494b;
                d0Var2.f131805k = 1;
                if (c0Var.r(f172494b, uuid, aVar2, d0Var2) != obj) {
                    j8 = f172494b;
                    str2 = str;
                    uuid2 = uuid;
                    d0Var2.f131795a = uuid2;
                    d0Var2.f131796b = cVar2;
                    d0Var2.f131797c = aVar3;
                    d0Var2.f131798d = iVar2;
                    d0Var2.f131799e = str2;
                    d0Var2.f131801g = z15;
                    d0Var2.f131802h = j8;
                    d0Var2.f131805k = 2;
                    objC = c0Var.f131775d.c(j8, uuid2, d0Var2);
                    if (objC != obj) {
                        zf2.i iVar4 = iVar2;
                        cVar3 = cVar2;
                        iVar3 = iVar4;
                        z16 = z15;
                        aVar4 = aVar3;
                        aVar5 = (jg2.a) objC;
                        cVar4 = zg2.c.f204692a;
                        cVar4.getClass();
                        zg2.c.a("LSVSessionManager", "Session type for the app initiated session with uuid = " + uuid2 + " is " + aVar5);
                        bVar = (of2.b) c0Var.f131778g.getValue();
                        if (bVar != null) {
                            zg2.c.d("LSVSessionManager", "No existing session found. Starting a new session.");
                            zf2.h hVar = new zf2.h(null, p13.j0.f134944a);
                            d0Var2.f131795a = null;
                            d0Var2.f131796b = null;
                            d0Var2.f131797c = null;
                            d0Var2.f131798d = null;
                            d0Var2.f131799e = null;
                            d0Var2.f131800f = null;
                            d0Var2.f131801g = z16;
                            d0Var2.f131802h = j8;
                            d0Var2.f131805k = 3;
                        } else {
                            str3 = str2;
                            aVar6 = aVar5;
                            uuid3 = uuid2;
                            p2Var = bVar.f131736o;
                            zg2.c.d("LSVSessionManager", "Existing session found.");
                            if (p005kotlin.jvm.internal.s.g(((b0) p2Var.getValue()).f131744a, uuid3)) {
                                cVar4.getClass();
                                zg2.c.a("LSVSession", "notifyDeviceReconnected");
                                bVar.f131730i.a();
                                aVar7 = bVar.f131729h;
                                if (aVar7 != null) {
                                    aVar7.a();
                                }
                                bVar.d();
                                if (((b0) p2Var.getValue()).f131747d == aVar4.f204562a) {
                                    return Unit.INSTANCE;
                                }
                                zg2.c.d("LSVSessionManager", "Change to supported sport " + aVar4.f204563b);
                                bVar.b(aVar4, null, null, new zf2.h(null, p13.j0.f134944a), z16);
                                fg2.d0 d0Var3 = c0Var.f131781j;
                                b0 b0Var = (b0) p2Var.getValue();
                                qf2.a aVar9 = c0Var.f131780i;
                                boolean z18 = aVar9.f144650e;
                                boolean z19 = aVar9.f144651f;
                                d0Var2.f131795a = null;
                                d0Var2.f131796b = null;
                                d0Var2.f131797c = null;
                                d0Var2.f131798d = null;
                                d0Var2.f131799e = null;
                                d0Var2.f131800f = null;
                                d0Var2.f131801g = z16;
                                d0Var2.f131802h = j8;
                                d0Var2.f131805k = 6;
                            } else if (!((Boolean) c0Var.f131784m.getValue()).booleanValue()) {
                                str4 = str3;
                                UUID uuid4 = uuid3;
                                long j14 = j8;
                                jg2.a aVar10 = aVar6;
                                zf2.i iVar5 = iVar3;
                                rs2.c cVar5 = cVar3;
                                zf2.h hVar2 = new zf2.h(null, p13.j0.f134944a);
                                d0Var2.f131795a = null;
                                d0Var2.f131796b = null;
                                d0Var2.f131797c = null;
                                d0Var2.f131798d = null;
                                d0Var2.f131799e = null;
                                d0Var2.f131800f = null;
                                d0Var2.f131801g = z16;
                                d0Var2.f131802h = j14;
                                d0Var2.f131805k = 5;
                            } else {
                                zg2.c.d("LSVSessionManager", "Aborting the existing session to start a new one.");
                                d0Var2.f131795a = uuid3;
                                d0Var2.f131796b = cVar3;
                                d0Var2.f131797c = aVar4;
                                d0Var2.f131798d = iVar3;
                                d0Var2.f131799e = str3;
                                d0Var2.f131800f = aVar6;
                                d0Var2.f131801g = z16;
                                d0Var2.f131802h = j8;
                                d0Var2.f131805k = 4;
                                if (c0Var.a(bVar, d0Var2) != obj) {
                                    str4 = str3;
                                    aVar8 = aVar4;
                                    z17 = z16;
                                    z16 = z17;
                                    aVar4 = aVar8;
                                    UUID uuid5 = uuid3;
                                    long j15 = j8;
                                    jg2.a aVar11 = aVar6;
                                    zf2.i iVar6 = iVar3;
                                    rs2.c cVar6 = cVar3;
                                    zf2.h hVar3 = new zf2.h(null, p13.j0.f134944a);
                                    d0Var2.f131795a = null;
                                    d0Var2.f131796b = null;
                                    d0Var2.f131797c = null;
                                    d0Var2.f131798d = null;
                                    d0Var2.f131799e = null;
                                    d0Var2.f131800f = null;
                                    d0Var2.f131801g = z16;
                                    d0Var2.f131802h = j15;
                                    d0Var2.f131805k = 5;
                                }
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 1:
                j8 = d0Var2.f131802h;
                boolean z24 = d0Var2.f131801g;
                str2 = d0Var2.f131799e;
                zf2.i iVar7 = d0Var2.f131798d;
                aVar3 = d0Var2.f131797c;
                rs2.c cVar7 = d0Var2.f131796b;
                uuid2 = d0Var2.f131795a;
                o13.r.b(objC);
                iVar2 = iVar7;
                cVar2 = cVar7;
                z15 = z24;
                d0Var2.f131795a = uuid2;
                d0Var2.f131796b = cVar2;
                d0Var2.f131797c = aVar3;
                d0Var2.f131798d = iVar2;
                d0Var2.f131799e = str2;
                d0Var2.f131801g = z15;
                d0Var2.f131802h = j8;
                d0Var2.f131805k = 2;
                objC = c0Var.f131775d.c(j8, uuid2, d0Var2);
                if (objC != obj) {
                    zf2.i iVar8 = iVar2;
                    cVar3 = cVar2;
                    iVar3 = iVar8;
                    z16 = z15;
                    aVar4 = aVar3;
                    aVar5 = (jg2.a) objC;
                    cVar4 = zg2.c.f204692a;
                    cVar4.getClass();
                    zg2.c.a("LSVSessionManager", "Session type for the app initiated session with uuid = " + uuid2 + " is " + aVar5);
                    bVar = (of2.b) c0Var.f131778g.getValue();
                    if (bVar != null) {
                        zg2.c.d("LSVSessionManager", "No existing session found. Starting a new session.");
                        zf2.h hVar4 = new zf2.h(null, p13.j0.f134944a);
                        d0Var2.f131795a = null;
                        d0Var2.f131796b = null;
                        d0Var2.f131797c = null;
                        d0Var2.f131798d = null;
                        d0Var2.f131799e = null;
                        d0Var2.f131800f = null;
                        d0Var2.f131801g = z16;
                        d0Var2.f131802h = j8;
                        d0Var2.f131805k = 3;
                    } else {
                        str3 = str2;
                        aVar6 = aVar5;
                        uuid3 = uuid2;
                        p2Var = bVar.f131736o;
                        zg2.c.d("LSVSessionManager", "Existing session found.");
                        if (p005kotlin.jvm.internal.s.g(((b0) p2Var.getValue()).f131744a, uuid3)) {
                            cVar4.getClass();
                            zg2.c.a("LSVSession", "notifyDeviceReconnected");
                            bVar.f131730i.a();
                            aVar7 = bVar.f131729h;
                            if (aVar7 != null) {
                                aVar7.a();
                            }
                            bVar.d();
                            if (((b0) p2Var.getValue()).f131747d == aVar4.f204562a) {
                                return Unit.INSTANCE;
                            }
                            zg2.c.d("LSVSessionManager", "Change to supported sport " + aVar4.f204563b);
                            bVar.b(aVar4, null, null, new zf2.h(null, p13.j0.f134944a), z16);
                            fg2.d0 d0Var4 = c0Var.f131781j;
                            b0 b0Var2 = (b0) p2Var.getValue();
                            qf2.a aVar12 = c0Var.f131780i;
                            boolean z110 = aVar12.f144650e;
                            boolean z111 = aVar12.f144651f;
                            d0Var2.f131795a = null;
                            d0Var2.f131796b = null;
                            d0Var2.f131797c = null;
                            d0Var2.f131798d = null;
                            d0Var2.f131799e = null;
                            d0Var2.f131800f = null;
                            d0Var2.f131801g = z16;
                            d0Var2.f131802h = j8;
                            d0Var2.f131805k = 6;
                        } else if (!((Boolean) c0Var.f131784m.getValue()).booleanValue()) {
                            str4 = str3;
                            UUID uuid6 = uuid3;
                            long j16 = j8;
                            jg2.a aVar13 = aVar6;
                            zf2.i iVar9 = iVar3;
                            rs2.c cVar8 = cVar3;
                            zf2.h hVar5 = new zf2.h(null, p13.j0.f134944a);
                            d0Var2.f131795a = null;
                            d0Var2.f131796b = null;
                            d0Var2.f131797c = null;
                            d0Var2.f131798d = null;
                            d0Var2.f131799e = null;
                            d0Var2.f131800f = null;
                            d0Var2.f131801g = z16;
                            d0Var2.f131802h = j16;
                            d0Var2.f131805k = 5;
                        } else {
                            zg2.c.d("LSVSessionManager", "Aborting the existing session to start a new one.");
                            d0Var2.f131795a = uuid3;
                            d0Var2.f131796b = cVar3;
                            d0Var2.f131797c = aVar4;
                            d0Var2.f131798d = iVar3;
                            d0Var2.f131799e = str3;
                            d0Var2.f131800f = aVar6;
                            d0Var2.f131801g = z16;
                            d0Var2.f131802h = j8;
                            d0Var2.f131805k = 4;
                            if (c0Var.a(bVar, d0Var2) != obj) {
                                str4 = str3;
                                aVar8 = aVar4;
                                z17 = z16;
                                z16 = z17;
                                aVar4 = aVar8;
                                UUID uuid7 = uuid3;
                                long j17 = j8;
                                jg2.a aVar14 = aVar6;
                                zf2.i iVar10 = iVar3;
                                rs2.c cVar9 = cVar3;
                                zf2.h hVar6 = new zf2.h(null, p13.j0.f134944a);
                                d0Var2.f131795a = null;
                                d0Var2.f131796b = null;
                                d0Var2.f131797c = null;
                                d0Var2.f131798d = null;
                                d0Var2.f131799e = null;
                                d0Var2.f131800f = null;
                                d0Var2.f131801g = z16;
                                d0Var2.f131802h = j17;
                                d0Var2.f131805k = 5;
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 2:
                j8 = d0Var2.f131802h;
                boolean z25 = d0Var2.f131801g;
                str2 = d0Var2.f131799e;
                iVar3 = d0Var2.f131798d;
                aVar3 = d0Var2.f131797c;
                cVar3 = d0Var2.f131796b;
                uuid2 = d0Var2.f131795a;
                o13.r.b(objC);
                z16 = z25;
                aVar4 = aVar3;
                aVar5 = (jg2.a) objC;
                cVar4 = zg2.c.f204692a;
                cVar4.getClass();
                zg2.c.a("LSVSessionManager", "Session type for the app initiated session with uuid = " + uuid2 + " is " + aVar5);
                bVar = (of2.b) c0Var.f131778g.getValue();
                if (bVar != null) {
                    str3 = str2;
                    aVar6 = aVar5;
                    uuid3 = uuid2;
                    p2Var = bVar.f131736o;
                    zg2.c.d("LSVSessionManager", "Existing session found.");
                    if (p005kotlin.jvm.internal.s.g(((b0) p2Var.getValue()).f131744a, uuid3)) {
                        cVar4.getClass();
                        zg2.c.a("LSVSession", "notifyDeviceReconnected");
                        bVar.f131730i.a();
                        aVar7 = bVar.f131729h;
                        if (aVar7 != null) {
                            aVar7.a();
                        }
                        bVar.d();
                        if (((b0) p2Var.getValue()).f131747d == aVar4.f204562a) {
                            return Unit.INSTANCE;
                        }
                        zg2.c.d("LSVSessionManager", "Change to supported sport " + aVar4.f204563b);
                        bVar.b(aVar4, null, null, new zf2.h(null, p13.j0.f134944a), z16);
                        fg2.d0 d0Var5 = c0Var.f131781j;
                        b0 b0Var3 = (b0) p2Var.getValue();
                        qf2.a aVar15 = c0Var.f131780i;
                        boolean z112 = aVar15.f144650e;
                        boolean z113 = aVar15.f144651f;
                        d0Var2.f131795a = null;
                        d0Var2.f131796b = null;
                        d0Var2.f131797c = null;
                        d0Var2.f131798d = null;
                        d0Var2.f131799e = null;
                        d0Var2.f131800f = null;
                        d0Var2.f131801g = z16;
                        d0Var2.f131802h = j8;
                        d0Var2.f131805k = 6;
                    } else if (!((Boolean) c0Var.f131784m.getValue()).booleanValue()) {
                        str4 = str3;
                        UUID uuid8 = uuid3;
                        long j18 = j8;
                        jg2.a aVar16 = aVar6;
                        zf2.i iVar11 = iVar3;
                        rs2.c cVar10 = cVar3;
                        zf2.h hVar7 = new zf2.h(null, p13.j0.f134944a);
                        d0Var2.f131795a = null;
                        d0Var2.f131796b = null;
                        d0Var2.f131797c = null;
                        d0Var2.f131798d = null;
                        d0Var2.f131799e = null;
                        d0Var2.f131800f = null;
                        d0Var2.f131801g = z16;
                        d0Var2.f131802h = j18;
                        d0Var2.f131805k = 5;
                    } else {
                        zg2.c.d("LSVSessionManager", "Aborting the existing session to start a new one.");
                        d0Var2.f131795a = uuid3;
                        d0Var2.f131796b = cVar3;
                        d0Var2.f131797c = aVar4;
                        d0Var2.f131798d = iVar3;
                        d0Var2.f131799e = str3;
                        d0Var2.f131800f = aVar6;
                        d0Var2.f131801g = z16;
                        d0Var2.f131802h = j8;
                        d0Var2.f131805k = 4;
                        if (c0Var.a(bVar, d0Var2) != obj) {
                            str4 = str3;
                            aVar8 = aVar4;
                            z17 = z16;
                            z16 = z17;
                            aVar4 = aVar8;
                            UUID uuid9 = uuid3;
                            long j19 = j8;
                            jg2.a aVar17 = aVar6;
                            zf2.i iVar12 = iVar3;
                            rs2.c cVar11 = cVar3;
                            zf2.h hVar8 = new zf2.h(null, p13.j0.f134944a);
                            d0Var2.f131795a = null;
                            d0Var2.f131796b = null;
                            d0Var2.f131797c = null;
                            d0Var2.f131798d = null;
                            d0Var2.f131799e = null;
                            d0Var2.f131800f = null;
                            d0Var2.f131801g = z16;
                            d0Var2.f131802h = j19;
                            d0Var2.f131805k = 5;
                        }
                    }
                    break;
                } else {
                    zg2.c.d("LSVSessionManager", "No existing session found. Starting a new session.");
                    zf2.h hVar9 = new zf2.h(null, p13.j0.f134944a);
                    d0Var2.f131795a = null;
                    d0Var2.f131796b = null;
                    d0Var2.f131797c = null;
                    d0Var2.f131798d = null;
                    d0Var2.f131799e = null;
                    d0Var2.f131800f = null;
                    d0Var2.f131801g = z16;
                    d0Var2.f131802h = j8;
                    d0Var2.f131805k = 3;
                    break;
                }
                return obj;
            case 3:
                o13.r.b(objC);
                return Unit.INSTANCE;
            case 4:
                j8 = d0Var2.f131802h;
                z17 = d0Var2.f131801g;
                aVar6 = d0Var2.f131800f;
                str4 = d0Var2.f131799e;
                iVar3 = d0Var2.f131798d;
                aVar8 = d0Var2.f131797c;
                cVar3 = d0Var2.f131796b;
                UUID uuid10 = d0Var2.f131795a;
                o13.r.b(objC);
                uuid3 = uuid10;
                z16 = z17;
                aVar4 = aVar8;
                UUID uuid11 = uuid3;
                long j110 = j8;
                jg2.a aVar18 = aVar6;
                zf2.i iVar13 = iVar3;
                rs2.c cVar12 = cVar3;
                zf2.h hVar10 = new zf2.h(null, p13.j0.f134944a);
                d0Var2.f131795a = null;
                d0Var2.f131796b = null;
                d0Var2.f131797c = null;
                d0Var2.f131798d = null;
                d0Var2.f131799e = null;
                d0Var2.f131800f = null;
                d0Var2.f131801g = z16;
                d0Var2.f131802h = j110;
                d0Var2.f131805k = 5;
                break;
            case 5:
                o13.r.b(objC);
                return Unit.INSTANCE;
            case 6:
                o13.r.b(objC);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0245  */
    /* JADX WARN: Code duplicated, block: B:56:0x0287  */
    /* JADX WARN: Code duplicated, block: B:61:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x032c  */
    /* JADX WARN: Code duplicated, block: B:73:0x032f  */
    /* JADX WARN: Code duplicated, block: B:80:0x036f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0387  */
    /* JADX WARN: Code duplicated, block: B:85:0x0399  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:90:0x03ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0401  */
    /* JADX WARN: Code duplicated, block: B:96:0x046b  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0399, please report this as an issue */
    public static final Object c(c0 c0Var, UUID uuid, rs2.c cVar, zf2.a aVar, rf2.l lVar, vf2.p pVar, boolean z14, zf2.h hVar, zf2.g gVar, String str, t13.d dVar) {
        l0 l0Var;
        rs2.c cVar2;
        zf2.a aVar2;
        rf2.l lVar2;
        vf2.p pVar2;
        zf2.h hVar2;
        String str2;
        UUID uuid2;
        boolean z15;
        zf2.g gVar2;
        long j8;
        String str3;
        p2 p2Var;
        b0 b0Var;
        UUID uuid3;
        Object obj;
        long j14;
        int i14;
        UUID uuid4;
        long j15;
        jg2.d dVar2;
        UUID uuid5;
        rs2.c cVar3;
        zf2.a aVar3;
        String str4;
        zf2.g gVar3;
        Object objC;
        UUID uuid6;
        rs2.c cVar4;
        zf2.a aVar4;
        String str5;
        vf2.p pVar3;
        boolean z16;
        zf2.g gVar4;
        long j16;
        zf2.h hVar3;
        jg2.a aVar5;
        zg2.c cVar5;
        rs2.c cVar6;
        String str6;
        of2.b bVar;
        String str7;
        zf2.a aVar6;
        vf2.p pVar4;
        long j17;
        u13.a aVar7;
        l0 l0Var2;
        c0 c0Var2;
        p2 p2Var2;
        zg2.a aVar8;
        fg2.d0 d0Var;
        b0 b0Var2;
        boolean z17;
        boolean z18;
        fg2.d0 d0Var2;
        b0 b0Var3;
        boolean z19;
        boolean z24;
        long j18;
        u13.a aVar9;
        zf2.a aVar10;
        boolean z25;
        rs2.c cVar7;
        String str8;
        rs2.c cVar8;
        long j19;
        u13.a aVar11;
        fg2.y yVar = c0Var.f131775d;
        p2 p2Var3 = c0Var.f131778g;
        if (dVar instanceof l0) {
            l0Var = (l0) dVar;
            int i15 = l0Var.f131870q;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                l0Var.f131870q = i15 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(c0Var, dVar);
            }
        } else {
            l0Var = new l0(c0Var, dVar);
        }
        l0 l0Var3 = l0Var;
        Object obj2 = l0Var3.f131868o;
        u13.a aVar12 = u13.a.COROUTINE_SUSPENDED;
        switch (l0Var3.f131870q) {
            case 0:
                o13.r.b(obj2);
                zg2.c.f204692a.getClass();
                zg2.c.a("LSVSessionManager", "requestStartSupportedSport started");
                long f172494b = cVar.getF92746j();
                of2.b bVar2 = (of2.b) p2Var3.getValue();
                if (bVar2 == null || (p2Var = bVar2.f131736o) == null || (b0Var = (b0) p2Var.getValue()) == null) {
                    cVar2 = cVar;
                    aVar2 = aVar;
                    lVar2 = lVar;
                    pVar2 = pVar;
                    hVar2 = hVar;
                    yVar = yVar;
                    p2Var3 = p2Var3;
                    str2 = "LSVSessionManager";
                    uuid2 = uuid;
                    z15 = z14;
                    gVar2 = gVar;
                    j8 = f172494b;
                    str3 = str;
                } else {
                    uuid3 = b0Var.f131744a;
                    long f172494b2 = b0Var.f131745b.getF92746j();
                    l0Var3.f131854a = uuid;
                    cVar2 = cVar;
                    l0Var3.f131855b = cVar2;
                    aVar2 = aVar;
                    l0Var3.f131856c = aVar2;
                    lVar2 = lVar;
                    l0Var3.f131857d = lVar2;
                    pVar2 = pVar;
                    l0Var3.f131858e = pVar2;
                    hVar2 = hVar;
                    l0Var3.f131859f = hVar2;
                    l0Var3.f131860g = gVar;
                    l0Var3.f131861h = str;
                    l0Var3.f131862i = null;
                    l0Var3.f131863j = uuid3;
                    l0Var3.f131864k = z14;
                    l0Var3.f131865l = f172494b;
                    l0Var3.f131867n = 0;
                    l0Var3.f131866m = f172494b2;
                    l0Var3.f131870q = 1;
                    Object objB = yVar.b(f172494b, l0Var3);
                    if (objB == aVar12) {
                        return aVar12;
                    }
                    obj = objB;
                    j14 = f172494b;
                    i14 = 0;
                    uuid4 = uuid;
                    str3 = str;
                    j15 = f172494b2;
                    z15 = z14;
                    gVar2 = gVar;
                    str2 = "LSVSessionManager";
                    dVar2 = (jg2.d) obj;
                    if (dVar2 != null) {
                        uuid5 = dVar2.f98736a;
                    } else {
                        uuid5 = null;
                    }
                    if (p005kotlin.jvm.internal.s.g(uuid4, uuid3) && j14 == j15 && p005kotlin.jvm.internal.s.g(uuid3, uuid5)) {
                        yf2.a aVar13 = dVar2.f98737b;
                        l0Var3.f131854a = uuid4;
                        l0Var3.f131855b = cVar2;
                        l0Var3.f131856c = aVar2;
                        l0Var3.f131857d = lVar2;
                        l0Var3.f131858e = pVar2;
                        l0Var3.f131859f = hVar2;
                        l0Var3.f131860g = gVar2;
                        l0Var3.f131861h = str3;
                        l0Var3.f131862i = null;
                        l0Var3.f131863j = null;
                        l0Var3.f131864k = z15;
                        l0Var3.f131865l = j14;
                        l0Var3.f131867n = i14;
                        l0Var3.f131866m = j15;
                        l0Var3.f131870q = 2;
                        UUID uuid7 = uuid4;
                        long j24 = j14;
                        j8 = j24;
                        if (c0Var.r(j24, uuid7, aVar13, l0Var3) == aVar12) {
                            aVar12 = aVar12;
                            return aVar12;
                        }
                        aVar12 = aVar12;
                        uuid2 = uuid7;
                        cVar3 = cVar2;
                        aVar3 = aVar2;
                        str4 = str3;
                        gVar3 = gVar2;
                        gVar2 = gVar3;
                        str3 = str4;
                        aVar2 = aVar3;
                        cVar2 = cVar3;
                    } else {
                        j8 = j14;
                        aVar12 = aVar12;
                        uuid2 = uuid4;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                l0Var3.f131854a = uuid2;
                l0Var3.f131855b = cVar2;
                l0Var3.f131856c = aVar2;
                l0Var3.f131857d = lVar2;
                l0Var3.f131858e = pVar2;
                l0Var3.f131859f = hVar2;
                l0Var3.f131860g = gVar2;
                l0Var3.f131861h = str3;
                l0Var3.f131862i = null;
                l0Var3.f131863j = null;
                l0Var3.f131864k = z15;
                l0Var3.f131865l = j8;
                l0Var3.f131870q = 3;
                objC = yVar.c(j8, uuid2, l0Var3);
                if (objC == aVar12) {
                    return aVar12;
                }
                rs2.c cVar9 = cVar2;
                uuid6 = uuid2;
                cVar4 = cVar9;
                vf2.p pVar5 = pVar2;
                aVar4 = aVar2;
                str5 = str3;
                pVar3 = pVar5;
                zf2.h hVar4 = hVar2;
                z16 = z15;
                gVar4 = gVar2;
                j16 = j8;
                hVar3 = hVar4;
                aVar5 = (jg2.a) objC;
                cVar5 = zg2.c.f204692a;
                cVar6 = cVar4;
                cVar5.getClass();
                str6 = str2;
                zg2.c.a(str6, "Session type for the session with uuid = " + uuid6 + " is " + aVar5);
                bVar = (of2.b) p2Var3.getValue();
                if (bVar == null) {
                    zg2.c.d(str6, "No existing session found. Starting a new session.");
                    l0Var3.f131854a = null;
                    l0Var3.f131855b = null;
                    l0Var3.f131856c = null;
                    l0Var3.f131857d = null;
                    l0Var3.f131858e = null;
                    l0Var3.f131859f = null;
                    l0Var3.f131860g = null;
                    l0Var3.f131861h = null;
                    l0Var3.f131862i = null;
                    l0Var3.f131863j = null;
                    l0Var3.f131864k = z16;
                    l0Var3.f131865l = j16;
                    l0Var3.f131870q = 4;
                    if (c0Var.q(uuid6, cVar6, aVar5, aVar4, null, str5, lVar2, pVar3, hVar3, gVar4, true, false, z16, l0Var3) == aVar12) {
                        return aVar12;
                    }
                    return Unit.INSTANCE;
                }
                vf2.p pVar6 = pVar3;
                str7 = str5;
                aVar6 = aVar4;
                pVar4 = pVar6;
                j17 = j16;
                aVar7 = aVar12;
                l0Var2 = l0Var3;
                c0Var2 = c0Var;
                p2Var2 = bVar.f131736o;
                zg2.c.d(str6, "Existing session found.");
                if (!p005kotlin.jvm.internal.s.g(((b0) p2Var2.getValue()).f131744a, uuid6)) {
                    aVar5.getClass();
                    if ((aVar5 instanceof jg2.a.C1897a) || ((Boolean) c0Var2.f131784m.getValue()).booleanValue()) {
                        zg2.c.d(str6, "Aborting the existing session to start a new one.");
                        l0Var2.f131854a = uuid6;
                        l0Var2.f131855b = cVar6;
                        l0Var2.f131856c = aVar6;
                        l0Var2.f131857d = lVar2;
                        l0Var2.f131858e = pVar4;
                        l0Var2.f131859f = hVar3;
                        l0Var2.f131860g = gVar4;
                        l0Var2.f131861h = str7;
                        l0Var2.f131862i = aVar5;
                        l0Var2.f131863j = null;
                        l0Var2.f131864k = z16;
                        j18 = j17;
                        l0Var2.f131865l = j18;
                        l0Var2.f131870q = 5;
                        aVar9 = aVar7;
                        if (c0Var2.a(bVar, l0Var2) == aVar9) {
                            return aVar9;
                        }
                        aVar10 = aVar6;
                        z25 = z16;
                        cVar7 = cVar6;
                        boolean z26 = z25;
                        aVar6 = aVar10;
                        cVar8 = cVar7;
                        z16 = z26;
                        long j25 = j18;
                        str8 = str7;
                        j19 = j25;
                    } else {
                        str8 = str7;
                        cVar8 = cVar6;
                        j19 = j17;
                        aVar9 = aVar7;
                    }
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j19;
                    l0Var2.f131870q = 6;
                    aVar11 = aVar9;
                    if (c0Var2.q(uuid6, cVar8, aVar5, aVar6, null, str8, lVar2, pVar4, hVar3, gVar4, true, false, z16, l0Var2) == aVar11) {
                        return aVar11;
                    }
                    return Unit.INSTANCE;
                }
                cVar5.getClass();
                zg2.c.a("LSVSession", "notifyDeviceReconnected");
                bVar.f131730i.a();
                aVar8 = bVar.f131729h;
                if (aVar8 != null) {
                    aVar8.a();
                }
                bVar.d();
                if (((b0) p2Var2.getValue()).f131747d != aVar6.f204562a) {
                    if (pVar4 != null) {
                        return Unit.INSTANCE;
                    }
                    p2Var2.k(null, b0.a((b0) p2Var2.getValue(), null, null, null, pVar4, null, false, false, 130559));
                    d0Var = c0Var2.f131781j;
                    b0Var2 = (b0) p2Var2.getValue();
                    qf2.a aVar14 = c0Var2.f131780i;
                    z17 = aVar14.f144650e;
                    z18 = aVar14.f144651f;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j17;
                    l0Var2.f131870q = 8;
                    if (d0Var.g(b0Var2, z17, z18, true, l0Var2) == aVar7) {
                        return aVar7;
                    }
                    return Unit.INSTANCE;
                }
                zg2.c.d(str6, "Change to supported sport " + aVar6.f204563b);
                hVar3.getClass();
                bVar.b(aVar6, lVar2, pVar4, hVar3, z16);
                d0Var2 = c0Var2.f131781j;
                b0Var3 = (b0) p2Var2.getValue();
                qf2.a aVar15 = c0Var2.f131780i;
                z19 = aVar15.f144650e;
                z24 = aVar15.f144651f;
                l0Var2.f131854a = null;
                l0Var2.f131855b = null;
                l0Var2.f131856c = null;
                l0Var2.f131857d = null;
                l0Var2.f131858e = null;
                l0Var2.f131859f = null;
                l0Var2.f131860g = null;
                l0Var2.f131861h = null;
                l0Var2.f131862i = null;
                l0Var2.f131863j = null;
                l0Var2.f131864k = z16;
                l0Var2.f131865l = j17;
                l0Var2.f131870q = 7;
                if (d0Var2.g(b0Var3, z19, z24, true, l0Var2) == aVar7) {
                    return aVar7;
                }
                return Unit.INSTANCE;
            case 1:
                long j26 = l0Var3.f131866m;
                int i16 = l0Var3.f131867n;
                long j27 = l0Var3.f131865l;
                boolean z27 = l0Var3.f131864k;
                uuid3 = l0Var3.f131863j;
                String str9 = l0Var3.f131861h;
                zf2.g gVar5 = l0Var3.f131860g;
                hVar2 = l0Var3.f131859f;
                vf2.p pVar7 = l0Var3.f131858e;
                rf2.l lVar3 = l0Var3.f131857d;
                zf2.a aVar16 = l0Var3.f131856c;
                rs2.c cVar10 = l0Var3.f131855b;
                uuid4 = l0Var3.f131854a;
                o13.r.b(obj2);
                j14 = j27;
                str3 = str9;
                i14 = i16;
                lVar2 = lVar3;
                obj = obj2;
                cVar2 = cVar10;
                pVar2 = pVar7;
                j15 = j26;
                gVar2 = gVar5;
                z15 = z27;
                aVar2 = aVar16;
                str2 = "LSVSessionManager";
                dVar2 = (jg2.d) obj;
                if (dVar2 != null) {
                    uuid5 = dVar2.f98736a;
                } else {
                    uuid5 = null;
                }
                if (p005kotlin.jvm.internal.s.g(uuid4, uuid3)) {
                    break;
                }
                j8 = j14;
                aVar12 = aVar12;
                uuid2 = uuid4;
                Unit unit2 = Unit.INSTANCE;
                l0Var3.f131854a = uuid2;
                l0Var3.f131855b = cVar2;
                l0Var3.f131856c = aVar2;
                l0Var3.f131857d = lVar2;
                l0Var3.f131858e = pVar2;
                l0Var3.f131859f = hVar2;
                l0Var3.f131860g = gVar2;
                l0Var3.f131861h = str3;
                l0Var3.f131862i = null;
                l0Var3.f131863j = null;
                l0Var3.f131864k = z15;
                l0Var3.f131865l = j8;
                l0Var3.f131870q = 3;
                objC = yVar.c(j8, uuid2, l0Var3);
                if (objC == aVar12) {
                    return aVar12;
                }
                rs2.c cVar11 = cVar2;
                uuid6 = uuid2;
                cVar4 = cVar11;
                vf2.p pVar8 = pVar2;
                aVar4 = aVar2;
                str5 = str3;
                pVar3 = pVar8;
                zf2.h hVar5 = hVar2;
                z16 = z15;
                gVar4 = gVar2;
                j16 = j8;
                hVar3 = hVar5;
                aVar5 = (jg2.a) objC;
                cVar5 = zg2.c.f204692a;
                cVar6 = cVar4;
                cVar5.getClass();
                str6 = str2;
                zg2.c.a(str6, "Session type for the session with uuid = " + uuid6 + " is " + aVar5);
                bVar = (of2.b) p2Var3.getValue();
                if (bVar == null) {
                    zg2.c.d(str6, "No existing session found. Starting a new session.");
                    l0Var3.f131854a = null;
                    l0Var3.f131855b = null;
                    l0Var3.f131856c = null;
                    l0Var3.f131857d = null;
                    l0Var3.f131858e = null;
                    l0Var3.f131859f = null;
                    l0Var3.f131860g = null;
                    l0Var3.f131861h = null;
                    l0Var3.f131862i = null;
                    l0Var3.f131863j = null;
                    l0Var3.f131864k = z16;
                    l0Var3.f131865l = j16;
                    l0Var3.f131870q = 4;
                    if (c0Var.q(uuid6, cVar6, aVar5, aVar4, null, str5, lVar2, pVar3, hVar3, gVar4, true, false, z16, l0Var3) == aVar12) {
                        return aVar12;
                    }
                    return Unit.INSTANCE;
                }
                vf2.p pVar9 = pVar3;
                str7 = str5;
                aVar6 = aVar4;
                pVar4 = pVar9;
                j17 = j16;
                aVar7 = aVar12;
                l0Var2 = l0Var3;
                c0Var2 = c0Var;
                p2Var2 = bVar.f131736o;
                zg2.c.d(str6, "Existing session found.");
                if (!p005kotlin.jvm.internal.s.g(((b0) p2Var2.getValue()).f131744a, uuid6)) {
                    aVar5.getClass();
                    if (aVar5 instanceof jg2.a.C1897a) {
                        break;
                    }
                    zg2.c.d(str6, "Aborting the existing session to start a new one.");
                    l0Var2.f131854a = uuid6;
                    l0Var2.f131855b = cVar6;
                    l0Var2.f131856c = aVar6;
                    l0Var2.f131857d = lVar2;
                    l0Var2.f131858e = pVar4;
                    l0Var2.f131859f = hVar3;
                    l0Var2.f131860g = gVar4;
                    l0Var2.f131861h = str7;
                    l0Var2.f131862i = aVar5;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    j18 = j17;
                    l0Var2.f131865l = j18;
                    l0Var2.f131870q = 5;
                    aVar9 = aVar7;
                    if (c0Var2.a(bVar, l0Var2) == aVar9) {
                        return aVar9;
                    }
                    aVar10 = aVar6;
                    z25 = z16;
                    cVar7 = cVar6;
                    boolean z28 = z25;
                    aVar6 = aVar10;
                    cVar8 = cVar7;
                    z16 = z28;
                    long j28 = j18;
                    str8 = str7;
                    j19 = j28;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j19;
                    l0Var2.f131870q = 6;
                    aVar11 = aVar9;
                    if (c0Var2.q(uuid6, cVar8, aVar5, aVar6, null, str8, lVar2, pVar4, hVar3, gVar4, true, false, z16, l0Var2) == aVar11) {
                        return aVar11;
                    }
                    return Unit.INSTANCE;
                }
                cVar5.getClass();
                zg2.c.a("LSVSession", "notifyDeviceReconnected");
                bVar.f131730i.a();
                aVar8 = bVar.f131729h;
                if (aVar8 != null) {
                    aVar8.a();
                }
                bVar.d();
                if (((b0) p2Var2.getValue()).f131747d != aVar6.f204562a) {
                    if (pVar4 != null) {
                        return Unit.INSTANCE;
                    }
                    p2Var2.k(null, b0.a((b0) p2Var2.getValue(), null, null, null, pVar4, null, false, false, 130559));
                    d0Var = c0Var2.f131781j;
                    b0Var2 = (b0) p2Var2.getValue();
                    qf2.a aVar17 = c0Var2.f131780i;
                    z17 = aVar17.f144650e;
                    z18 = aVar17.f144651f;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j17;
                    l0Var2.f131870q = 8;
                    if (d0Var.g(b0Var2, z17, z18, true, l0Var2) == aVar7) {
                        return aVar7;
                    }
                    return Unit.INSTANCE;
                }
                zg2.c.d(str6, "Change to supported sport " + aVar6.f204563b);
                hVar3.getClass();
                bVar.b(aVar6, lVar2, pVar4, hVar3, z16);
                d0Var2 = c0Var2.f131781j;
                b0Var3 = (b0) p2Var2.getValue();
                qf2.a aVar18 = c0Var2.f131780i;
                z19 = aVar18.f144650e;
                z24 = aVar18.f144651f;
                l0Var2.f131854a = null;
                l0Var2.f131855b = null;
                l0Var2.f131856c = null;
                l0Var2.f131857d = null;
                l0Var2.f131858e = null;
                l0Var2.f131859f = null;
                l0Var2.f131860g = null;
                l0Var2.f131861h = null;
                l0Var2.f131862i = null;
                l0Var2.f131863j = null;
                l0Var2.f131864k = z16;
                l0Var2.f131865l = j17;
                l0Var2.f131870q = 7;
                if (d0Var2.g(b0Var3, z19, z24, true, l0Var2) == aVar7) {
                    return aVar7;
                }
                return Unit.INSTANCE;
            case 2:
                long j29 = l0Var3.f131865l;
                boolean z29 = l0Var3.f131864k;
                str4 = l0Var3.f131861h;
                gVar3 = l0Var3.f131860g;
                zf2.h hVar6 = l0Var3.f131859f;
                vf2.p pVar10 = l0Var3.f131858e;
                lVar2 = l0Var3.f131857d;
                zf2.a aVar19 = l0Var3.f131856c;
                rs2.c cVar12 = l0Var3.f131855b;
                uuid2 = l0Var3.f131854a;
                o13.r.b(obj2);
                yVar = yVar;
                p2Var3 = p2Var3;
                str2 = "LSVSessionManager";
                aVar3 = aVar19;
                cVar3 = cVar12;
                hVar2 = hVar6;
                pVar2 = pVar10;
                j8 = j29;
                z15 = z29;
                gVar2 = gVar3;
                str3 = str4;
                aVar2 = aVar3;
                cVar2 = cVar3;
                Unit unit3 = Unit.INSTANCE;
                l0Var3.f131854a = uuid2;
                l0Var3.f131855b = cVar2;
                l0Var3.f131856c = aVar2;
                l0Var3.f131857d = lVar2;
                l0Var3.f131858e = pVar2;
                l0Var3.f131859f = hVar2;
                l0Var3.f131860g = gVar2;
                l0Var3.f131861h = str3;
                l0Var3.f131862i = null;
                l0Var3.f131863j = null;
                l0Var3.f131864k = z15;
                l0Var3.f131865l = j8;
                l0Var3.f131870q = 3;
                objC = yVar.c(j8, uuid2, l0Var3);
                if (objC == aVar12) {
                    return aVar12;
                }
                rs2.c cVar13 = cVar2;
                uuid6 = uuid2;
                cVar4 = cVar13;
                vf2.p pVar11 = pVar2;
                aVar4 = aVar2;
                str5 = str3;
                pVar3 = pVar11;
                zf2.h hVar7 = hVar2;
                z16 = z15;
                gVar4 = gVar2;
                j16 = j8;
                hVar3 = hVar7;
                aVar5 = (jg2.a) objC;
                cVar5 = zg2.c.f204692a;
                cVar6 = cVar4;
                cVar5.getClass();
                str6 = str2;
                zg2.c.a(str6, "Session type for the session with uuid = " + uuid6 + " is " + aVar5);
                bVar = (of2.b) p2Var3.getValue();
                if (bVar == null) {
                    zg2.c.d(str6, "No existing session found. Starting a new session.");
                    l0Var3.f131854a = null;
                    l0Var3.f131855b = null;
                    l0Var3.f131856c = null;
                    l0Var3.f131857d = null;
                    l0Var3.f131858e = null;
                    l0Var3.f131859f = null;
                    l0Var3.f131860g = null;
                    l0Var3.f131861h = null;
                    l0Var3.f131862i = null;
                    l0Var3.f131863j = null;
                    l0Var3.f131864k = z16;
                    l0Var3.f131865l = j16;
                    l0Var3.f131870q = 4;
                    if (c0Var.q(uuid6, cVar6, aVar5, aVar4, null, str5, lVar2, pVar3, hVar3, gVar4, true, false, z16, l0Var3) == aVar12) {
                        return aVar12;
                    }
                    return Unit.INSTANCE;
                }
                vf2.p pVar12 = pVar3;
                str7 = str5;
                aVar6 = aVar4;
                pVar4 = pVar12;
                j17 = j16;
                aVar7 = aVar12;
                l0Var2 = l0Var3;
                c0Var2 = c0Var;
                p2Var2 = bVar.f131736o;
                zg2.c.d(str6, "Existing session found.");
                if (!p005kotlin.jvm.internal.s.g(((b0) p2Var2.getValue()).f131744a, uuid6)) {
                    aVar5.getClass();
                    if (aVar5 instanceof jg2.a.C1897a) {
                        break;
                    }
                    zg2.c.d(str6, "Aborting the existing session to start a new one.");
                    l0Var2.f131854a = uuid6;
                    l0Var2.f131855b = cVar6;
                    l0Var2.f131856c = aVar6;
                    l0Var2.f131857d = lVar2;
                    l0Var2.f131858e = pVar4;
                    l0Var2.f131859f = hVar3;
                    l0Var2.f131860g = gVar4;
                    l0Var2.f131861h = str7;
                    l0Var2.f131862i = aVar5;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    j18 = j17;
                    l0Var2.f131865l = j18;
                    l0Var2.f131870q = 5;
                    aVar9 = aVar7;
                    if (c0Var2.a(bVar, l0Var2) == aVar9) {
                        return aVar9;
                    }
                    aVar10 = aVar6;
                    z25 = z16;
                    cVar7 = cVar6;
                    boolean z210 = z25;
                    aVar6 = aVar10;
                    cVar8 = cVar7;
                    z16 = z210;
                    long j210 = j18;
                    str8 = str7;
                    j19 = j210;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j19;
                    l0Var2.f131870q = 6;
                    aVar11 = aVar9;
                    if (c0Var2.q(uuid6, cVar8, aVar5, aVar6, null, str8, lVar2, pVar4, hVar3, gVar4, true, false, z16, l0Var2) == aVar11) {
                        return aVar11;
                    }
                    return Unit.INSTANCE;
                }
                cVar5.getClass();
                zg2.c.a("LSVSession", "notifyDeviceReconnected");
                bVar.f131730i.a();
                aVar8 = bVar.f131729h;
                if (aVar8 != null) {
                    aVar8.a();
                }
                bVar.d();
                if (((b0) p2Var2.getValue()).f131747d != aVar6.f204562a) {
                    if (pVar4 != null) {
                        return Unit.INSTANCE;
                    }
                    p2Var2.k(null, b0.a((b0) p2Var2.getValue(), null, null, null, pVar4, null, false, false, 130559));
                    d0Var = c0Var2.f131781j;
                    b0Var2 = (b0) p2Var2.getValue();
                    qf2.a aVar110 = c0Var2.f131780i;
                    z17 = aVar110.f144650e;
                    z18 = aVar110.f144651f;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j17;
                    l0Var2.f131870q = 8;
                    if (d0Var.g(b0Var2, z17, z18, true, l0Var2) == aVar7) {
                        return aVar7;
                    }
                    return Unit.INSTANCE;
                }
                zg2.c.d(str6, "Change to supported sport " + aVar6.f204563b);
                hVar3.getClass();
                bVar.b(aVar6, lVar2, pVar4, hVar3, z16);
                d0Var2 = c0Var2.f131781j;
                b0Var3 = (b0) p2Var2.getValue();
                qf2.a aVar111 = c0Var2.f131780i;
                z19 = aVar111.f144650e;
                z24 = aVar111.f144651f;
                l0Var2.f131854a = null;
                l0Var2.f131855b = null;
                l0Var2.f131856c = null;
                l0Var2.f131857d = null;
                l0Var2.f131858e = null;
                l0Var2.f131859f = null;
                l0Var2.f131860g = null;
                l0Var2.f131861h = null;
                l0Var2.f131862i = null;
                l0Var2.f131863j = null;
                l0Var2.f131864k = z16;
                l0Var2.f131865l = j17;
                l0Var2.f131870q = 7;
                if (d0Var2.g(b0Var3, z19, z24, true, l0Var2) == aVar7) {
                    return aVar7;
                }
                return Unit.INSTANCE;
            case 3:
                j16 = l0Var3.f131865l;
                boolean z34 = l0Var3.f131864k;
                str5 = l0Var3.f131861h;
                zf2.g gVar6 = l0Var3.f131860g;
                hVar3 = l0Var3.f131859f;
                vf2.p pVar13 = l0Var3.f131858e;
                lVar2 = l0Var3.f131857d;
                aVar4 = l0Var3.f131856c;
                rs2.c cVar14 = l0Var3.f131855b;
                UUID uuid8 = l0Var3.f131854a;
                o13.r.b(obj2);
                uuid6 = uuid8;
                cVar4 = cVar14;
                z16 = z34;
                objC = obj2;
                gVar4 = gVar6;
                pVar3 = pVar13;
                p2Var3 = p2Var3;
                str2 = "LSVSessionManager";
                aVar5 = (jg2.a) objC;
                cVar5 = zg2.c.f204692a;
                cVar6 = cVar4;
                cVar5.getClass();
                str6 = str2;
                zg2.c.a(str6, "Session type for the session with uuid = " + uuid6 + " is " + aVar5);
                bVar = (of2.b) p2Var3.getValue();
                if (bVar == null) {
                    zg2.c.d(str6, "No existing session found. Starting a new session.");
                    l0Var3.f131854a = null;
                    l0Var3.f131855b = null;
                    l0Var3.f131856c = null;
                    l0Var3.f131857d = null;
                    l0Var3.f131858e = null;
                    l0Var3.f131859f = null;
                    l0Var3.f131860g = null;
                    l0Var3.f131861h = null;
                    l0Var3.f131862i = null;
                    l0Var3.f131863j = null;
                    l0Var3.f131864k = z16;
                    l0Var3.f131865l = j16;
                    l0Var3.f131870q = 4;
                    if (c0Var.q(uuid6, cVar6, aVar5, aVar4, null, str5, lVar2, pVar3, hVar3, gVar4, true, false, z16, l0Var3) == aVar12) {
                        return aVar12;
                    }
                    return Unit.INSTANCE;
                }
                vf2.p pVar14 = pVar3;
                str7 = str5;
                aVar6 = aVar4;
                pVar4 = pVar14;
                j17 = j16;
                aVar7 = aVar12;
                l0Var2 = l0Var3;
                c0Var2 = c0Var;
                p2Var2 = bVar.f131736o;
                zg2.c.d(str6, "Existing session found.");
                if (!p005kotlin.jvm.internal.s.g(((b0) p2Var2.getValue()).f131744a, uuid6)) {
                    aVar5.getClass();
                    if (aVar5 instanceof jg2.a.C1897a) {
                        break;
                    }
                    zg2.c.d(str6, "Aborting the existing session to start a new one.");
                    l0Var2.f131854a = uuid6;
                    l0Var2.f131855b = cVar6;
                    l0Var2.f131856c = aVar6;
                    l0Var2.f131857d = lVar2;
                    l0Var2.f131858e = pVar4;
                    l0Var2.f131859f = hVar3;
                    l0Var2.f131860g = gVar4;
                    l0Var2.f131861h = str7;
                    l0Var2.f131862i = aVar5;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    j18 = j17;
                    l0Var2.f131865l = j18;
                    l0Var2.f131870q = 5;
                    aVar9 = aVar7;
                    if (c0Var2.a(bVar, l0Var2) == aVar9) {
                        return aVar9;
                    }
                    aVar10 = aVar6;
                    z25 = z16;
                    cVar7 = cVar6;
                    boolean z211 = z25;
                    aVar6 = aVar10;
                    cVar8 = cVar7;
                    z16 = z211;
                    long j211 = j18;
                    str8 = str7;
                    j19 = j211;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j19;
                    l0Var2.f131870q = 6;
                    aVar11 = aVar9;
                    if (c0Var2.q(uuid6, cVar8, aVar5, aVar6, null, str8, lVar2, pVar4, hVar3, gVar4, true, false, z16, l0Var2) == aVar11) {
                        return aVar11;
                    }
                    return Unit.INSTANCE;
                }
                cVar5.getClass();
                zg2.c.a("LSVSession", "notifyDeviceReconnected");
                bVar.f131730i.a();
                aVar8 = bVar.f131729h;
                if (aVar8 != null) {
                    aVar8.a();
                }
                bVar.d();
                if (((b0) p2Var2.getValue()).f131747d != aVar6.f204562a) {
                    if (pVar4 != null) {
                        return Unit.INSTANCE;
                    }
                    p2Var2.k(null, b0.a((b0) p2Var2.getValue(), null, null, null, pVar4, null, false, false, 130559));
                    d0Var = c0Var2.f131781j;
                    b0Var2 = (b0) p2Var2.getValue();
                    qf2.a aVar112 = c0Var2.f131780i;
                    z17 = aVar112.f144650e;
                    z18 = aVar112.f144651f;
                    l0Var2.f131854a = null;
                    l0Var2.f131855b = null;
                    l0Var2.f131856c = null;
                    l0Var2.f131857d = null;
                    l0Var2.f131858e = null;
                    l0Var2.f131859f = null;
                    l0Var2.f131860g = null;
                    l0Var2.f131861h = null;
                    l0Var2.f131862i = null;
                    l0Var2.f131863j = null;
                    l0Var2.f131864k = z16;
                    l0Var2.f131865l = j17;
                    l0Var2.f131870q = 8;
                    if (d0Var.g(b0Var2, z17, z18, true, l0Var2) == aVar7) {
                        return aVar7;
                    }
                    return Unit.INSTANCE;
                }
                zg2.c.d(str6, "Change to supported sport " + aVar6.f204563b);
                hVar3.getClass();
                bVar.b(aVar6, lVar2, pVar4, hVar3, z16);
                d0Var2 = c0Var2.f131781j;
                b0Var3 = (b0) p2Var2.getValue();
                qf2.a aVar113 = c0Var2.f131780i;
                z19 = aVar113.f144650e;
                z24 = aVar113.f144651f;
                l0Var2.f131854a = null;
                l0Var2.f131855b = null;
                l0Var2.f131856c = null;
                l0Var2.f131857d = null;
                l0Var2.f131858e = null;
                l0Var2.f131859f = null;
                l0Var2.f131860g = null;
                l0Var2.f131861h = null;
                l0Var2.f131862i = null;
                l0Var2.f131863j = null;
                l0Var2.f131864k = z16;
                l0Var2.f131865l = j17;
                l0Var2.f131870q = 7;
                if (d0Var2.g(b0Var3, z19, z24, true, l0Var2) == aVar7) {
                    return aVar7;
                }
                return Unit.INSTANCE;
            case 4:
                o13.r.b(obj2);
                return Unit.INSTANCE;
            case 5:
                long j34 = l0Var3.f131865l;
                z25 = l0Var3.f131864k;
                jg2.a aVar20 = l0Var3.f131862i;
                String str10 = l0Var3.f131861h;
                zf2.g gVar7 = l0Var3.f131860g;
                hVar3 = l0Var3.f131859f;
                vf2.p pVar15 = l0Var3.f131858e;
                lVar2 = l0Var3.f131857d;
                zf2.a aVar21 = l0Var3.f131856c;
                cVar7 = l0Var3.f131855b;
                UUID uuid9 = l0Var3.f131854a;
                o13.r.b(obj2);
                uuid6 = uuid9;
                c0Var2 = c0Var;
                aVar5 = aVar20;
                aVar10 = aVar21;
                aVar9 = aVar12;
                pVar4 = pVar15;
                l0Var2 = l0Var3;
                gVar4 = gVar7;
                str7 = str10;
                j18 = j34;
                boolean z212 = z25;
                aVar6 = aVar10;
                cVar8 = cVar7;
                z16 = z212;
                long j212 = j18;
                str8 = str7;
                j19 = j212;
                l0Var2.f131854a = null;
                l0Var2.f131855b = null;
                l0Var2.f131856c = null;
                l0Var2.f131857d = null;
                l0Var2.f131858e = null;
                l0Var2.f131859f = null;
                l0Var2.f131860g = null;
                l0Var2.f131861h = null;
                l0Var2.f131862i = null;
                l0Var2.f131863j = null;
                l0Var2.f131864k = z16;
                l0Var2.f131865l = j19;
                l0Var2.f131870q = 6;
                aVar11 = aVar9;
                if (c0Var2.q(uuid6, cVar8, aVar5, aVar6, null, str8, lVar2, pVar4, hVar3, gVar4, true, false, z16, l0Var2) == aVar11) {
                    return aVar11;
                }
                return Unit.INSTANCE;
            case 6:
                o13.r.b(obj2);
                return Unit.INSTANCE;
            case 7:
                o13.r.b(obj2);
                return Unit.INSTANCE;
            case 8:
                o13.r.b(obj2);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (f(r8, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(of2.b bVar, t13.d<? super Unit> dVar) {
        b bVar2;
        if (dVar instanceof b) {
            bVar2 = (b) dVar;
            int i14 = bVar2.f131790d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar2.f131790d = i14 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(dVar);
            }
        } else {
            bVar2 = new b(dVar);
        }
        Object obj = bVar2.f131788b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f131790d;
        if (i15 != 0) {
            if (i15 == 1) {
                bVar = bVar2.f131787a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionManager", "abortCurrentSession finished");
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        zg2.c.f204692a.getClass();
        zg2.c.a("LSVSessionManager", "abortCurrentSession started");
        bVar2.f131787a = bVar;
        bVar2.f131790d = 1;
        bVar.getClass();
        Object objE = bVar.e(new rf2.e.c(null), bVar2);
        if (objE != obj2) {
            objE = Unit.INSTANCE;
        }
        if (objE != obj2) {
        }
        return obj2;
        bVar2.f131787a = null;
        bVar2.f131790d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) {
        e0 e0Var;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f131811c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f131811c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object objC = e0Var.f131809a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f131811c;
        p2 p2Var = this.f131785n;
        if (i15 == 0) {
            o13.r.b(objC);
            p2Var.k(null, Boolean.TRUE);
            f0 f0Var = new f0(this, null);
            e0Var.f131811c = 1;
            objC = j2.c(5000L, f0Var, e0Var);
            if (objC != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objC);
                return ((o13.q) objC).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC);
        if (objC != null) {
            e0Var.f131811c = 2;
            Object objP = p(e0Var);
            return objP == obj ? obj : objP;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Timed out waiting for session to become ready before sending start request");
        zg2.c.f204692a.getClass();
        zg2.c.c("LSVSessionManager", illegalStateException);
        p2Var.k(null, Boolean.FALSE);
        int i16 = o13.q.f128596b;
        return new o13.q.b(illegalStateException);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(d2 d2Var, e23.l lVar, v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f131820c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f131820c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objC = g0Var.f131818a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f131820c;
        if (i15 == 0) {
            o13.r.b(objC);
            e53.c.a aVar2 = e53.c.f63094b;
            long jF = e53.e.f(3000L, e53.f.MILLISECONDS);
            h0 h0Var = new h0(d2Var, lVar, null);
            g0Var.f131820c = 1;
            objC = j2.c(o53.m0.e(jF), h0Var, g0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return Boolean.valueOf(objC != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(of2.b bVar, v13.c cVar) {
        i0 i0Var;
        p2 p2Var;
        b0 b0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f131835d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f131835d = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.f131833b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f131835d;
        p2 p2Var2 = this.f131784m;
        if (i15 == 0) {
            o13.r.b(obj);
            zg2.c cVar2 = zg2.c.f204692a;
            String str = "clean HasActiveSession " + p2Var2.getValue();
            cVar2.getClass();
            zg2.c.a("LSVSessionManager", str);
            fg2.d0 d0Var = this.f131781j;
            d0Var.f71430e.setValue(null);
            d0Var.f71426a.k(null, Boolean.FALSE);
            d0Var.f71427b.setValue(null);
            d0Var.f71432g.setValue(null);
            d0Var.f71433h = p13.j0.f134944a;
            d0Var.f71434i = 0;
            d0Var.f71435j = 0;
            d0Var.f71428c.k(null, new yg2.o());
            this.f131772a.a(bVar.f131725d);
            i0Var.f131832a = bVar;
            i0Var.f131835d = 1;
            if (bVar.c(i0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = i0Var.f131832a;
            o13.r.b(obj);
        }
        this.f131786o.remove(bVar);
        of2.b bVarG = g();
        if (p005kotlin.jvm.internal.s.g((bVarG == null || (p2Var = bVarG.f131736o) == null || (b0Var = (b0) p2Var.getValue()) == null) ? null : b0Var.f131744a, ((b0) bVar.f131736o.getValue()).f131744a)) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionManager", "Active session was just ended.");
            this.f131778g.setValue(null);
            this.f131773b.f170467d = null;
            Boolean bool = Boolean.FALSE;
            p2Var2.k(null, bool);
            this.f131785n.k(null, bool);
        }
        return Unit.INSTANCE;
    }

    public final of2.b g() {
        return (of2.b) this.f131778g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j8, yf2.a aVar, v13.c cVar) {
        j0 j0Var;
        boolean z14;
        p2 p2Var;
        b0 b0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f131841d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f131841d = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objB = j0Var.f131839b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f131841d;
        if (i15 == 0) {
            o13.r.b(objB);
            j0Var.f131838a = aVar;
            j0Var.f131841d = 1;
            objB = this.f131775d.b(j8, j0Var);
            if (objB == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = j0Var.f131838a;
            o13.r.b(objB);
        }
        jg2.d dVar = (jg2.d) objB;
        of2.b bVarG = g();
        if (p005kotlin.jvm.internal.s.g((bVarG == null || (p2Var = bVarG.f131736o) == null || (b0Var = (b0) p2Var.getValue()) == null) ? null : b0Var.f131744a, dVar != null ? dVar.f98736a : null)) {
            z14 = (dVar != null ? dVar.f98737b : null) == aVar;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(boolean z14, v13.c cVar) {
        m0 m0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f131875c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f131875c = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object obj = m0Var.f131873a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f131875c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        uf2.s sVarF = this.f131773b.f();
        m0Var.f131875c = 1;
        sVarF.getClass();
        Object objH = uf2.s.h(sVarF, z14, m0Var);
        return objH == aVar ? aVar : objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(v13.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f131880c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f131880c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object obj = n0Var.f131878a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f131880c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        uf2.s sVarF = this.f131773b.f();
        n0Var.f131880c = 1;
        Object objJ = sVarF.j(n0Var);
        return objJ == aVar ? aVar : objJ;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0168, code lost:
    
        if (r14 == r1) goto L60;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0137, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, q0 q0Var, oe2.g gVar, v13.c cVar) {
        o0 o0Var;
        p2 p2Var;
        b0 b0Var;
        tf2.c cVar2;
        tf2.e eVar;
        d2 d2Var;
        String str2;
        d2 d2Var2;
        Object obj;
        e23.l lVar;
        e23.l lVar2;
        d2 d2Var3;
        e23.l lVar3;
        e23.l lVar4;
        boolean zBooleanValue;
        Object objInvoke;
        Object obj2;
        e23.l lVar5;
        String str3;
        Object obj3;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f131892h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f131892h = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objE = o0Var.f131890f;
        Object obj4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f131892h;
        int i16 = 3;
        if (i15 == 0) {
            o13.r.b(objE);
            of2.b bVarG = g();
            if (bVarG == null || (p2Var = bVarG.f131736o) == null || (b0Var = (b0) p2Var.getValue()) == null || (cVar2 = b0Var.f131754k) == null || (eVar = cVar2.f164469a) == null || (d2Var = eVar.f164468a) == null) {
                int i17 = o13.q.f128596b;
                return new o13.q.b(new IllegalStateException("No active session to end."));
            }
            o0Var.f131885a = str;
            o0Var.f131886b = q0Var;
            o0Var.f131887c = gVar;
            o0Var.f131888d = d2Var;
            o0Var.f131892h = 1;
            Object objM = m(o0Var);
            if (objM != obj4) {
                str2 = str;
                d2Var2 = d2Var;
                obj = objM;
                lVar2 = q0Var;
                lVar = gVar;
            }
            return obj4;
        }
        if (i15 == 1) {
            d2Var2 = o0Var.f131888d;
            e23.l lVar6 = o0Var.f131887c;
            e23.l lVar7 = o0Var.f131886b;
            str2 = o0Var.f131885a;
            o13.r.b(objE);
            obj = ((o13.q) objE).f128597a;
            lVar2 = lVar7;
            lVar = lVar6;
        } else {
            if (i15 == 2) {
                d2 d2Var4 = o0Var.f131888d;
                e23.l lVar8 = o0Var.f131887c;
                e23.l lVar9 = o0Var.f131886b;
                str2 = o0Var.f131885a;
                o13.r.b(objE);
                d2Var3 = d2Var4;
                lVar3 = lVar8;
                lVar4 = lVar9;
                zBooleanValue = ((Boolean) objE).booleanValue();
                if (!zBooleanValue) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LSVSessionManager", str2 + " - Timeout pause session.");
                    int i18 = o13.q.f128596b;
                    return new o13.q.b(new IllegalStateException("Timeout pause session."));
                }
                o0Var.f131885a = str2;
                o0Var.f131886b = null;
                o0Var.f131887c = lVar3;
                o0Var.f131888d = d2Var3;
                o0Var.f131889e = zBooleanValue;
                o0Var.f131892h = 3;
                objInvoke = lVar4.invoke(o0Var);
                if (objInvoke != obj4) {
                    obj2 = objInvoke;
                    lVar5 = lVar3;
                    str3 = str2;
                    obj3 = ((o13.q) obj2).f128597a;
                    if (obj3 instanceof o13.q.b) {
                        zg2.c cVar3 = zg2.c.f204692a;
                        String str4 = str3 + " - operation command failed: " + o13.q.b(obj3);
                        cVar3.getClass();
                        zg2.c.b("LSVSessionManager", str4);
                        return obj3;
                    }
                    o0Var.f131885a = str3;
                    o0Var.f131886b = null;
                    o0Var.f131887c = null;
                    o0Var.f131888d = null;
                    o0Var.f131889e = zBooleanValue;
                    o0Var.f131892h = 4;
                    objE = e(d2Var3, lVar5, o0Var);
                }
                return obj4;
            }
            if (i15 == 3) {
                boolean z14 = o0Var.f131889e;
                d2Var3 = o0Var.f131888d;
                e23.l lVar10 = o0Var.f131887c;
                str2 = o0Var.f131885a;
                o13.r.b(objE);
                obj2 = objE;
                zBooleanValue = z14;
                lVar5 = lVar10;
                str3 = str2;
                obj3 = ((o13.q) obj2).f128597a;
                if (obj3 instanceof o13.q.b) {
                    zg2.c cVar4 = zg2.c.f204692a;
                    String str5 = str3 + " - operation command failed: " + o13.q.b(obj3);
                    cVar4.getClass();
                    zg2.c.b("LSVSessionManager", str5);
                    return obj3;
                }
                o0Var.f131885a = str3;
                o0Var.f131886b = null;
                o0Var.f131887c = null;
                o0Var.f131888d = null;
                o0Var.f131889e = zBooleanValue;
                o0Var.f131892h = 4;
                objE = e(d2Var3, lVar5, o0Var);
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = o0Var.f131885a;
                o13.r.b(objE);
            }
        }
        if (((Boolean) objE).booleanValue()) {
            int i19 = o13.q.f128596b;
            return Unit.INSTANCE;
        }
        zg2.c.f204692a.getClass();
        zg2.c.b("LSVSessionManager", str3 + " - Timeout operation.");
        int i24 = o13.q.f128596b;
        return new o13.q.b(new IllegalStateException("Timeout end session."));
        int i25 = o13.q.f128596b;
        if (obj instanceof o13.q.b) {
            zg2.c cVar5 = zg2.c.f204692a;
            String str6 = str2 + " - pause command failed: " + o13.q.b(obj);
            cVar5.getClass();
            zg2.c.b("LSVSessionManager", str6);
            return obj;
        }
        e23.l gVar2 = new oe2.g(i16);
        o0Var.f131885a = str2;
        o0Var.f131886b = lVar2;
        o0Var.f131887c = lVar;
        o0Var.f131888d = d2Var2;
        o0Var.f131892h = 2;
        objE = e(d2Var2, gVar2, o0Var);
        if (objE != obj4) {
            e23.l lVar11 = lVar2;
            d2Var3 = d2Var2;
            lVar3 = lVar;
            lVar4 = lVar11;
            zBooleanValue = ((Boolean) objE).booleanValue();
            if (!zBooleanValue) {
                zg2.c.f204692a.getClass();
                zg2.c.b("LSVSessionManager", str2 + " - Timeout pause session.");
                int i110 = o13.q.f128596b;
                return new o13.q.b(new IllegalStateException("Timeout pause session."));
            }
            o0Var.f131885a = str2;
            o0Var.f131886b = null;
            o0Var.f131887c = lVar3;
            o0Var.f131888d = d2Var3;
            o0Var.f131889e = zBooleanValue;
            o0Var.f131892h = 3;
            objInvoke = lVar4.invoke(o0Var);
            if (objInvoke != obj4) {
                obj2 = objInvoke;
                lVar5 = lVar3;
                str3 = str2;
                obj3 = ((o13.q) obj2).f128597a;
                if (obj3 instanceof o13.q.b) {
                    zg2.c cVar6 = zg2.c.f204692a;
                    String str7 = str3 + " - operation command failed: " + o13.q.b(obj3);
                    cVar6.getClass();
                    zg2.c.b("LSVSessionManager", str7);
                    return obj3;
                }
                o0Var.f131885a = str3;
                o0Var.f131886b = null;
                o0Var.f131887c = null;
                o0Var.f131888d = null;
                o0Var.f131889e = zBooleanValue;
                o0Var.f131892h = 4;
                objE = e(d2Var3, lVar5, o0Var);
            }
        }
        return obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        p0 p0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f131898c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f131898c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object obj = p0Var.f131896a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f131898c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        q0 q0Var = new q0(this, null);
        oe2.g gVar = new oe2.g(2);
        p0Var.f131898c = 1;
        Object objK = k("sendPauseAndSaveRequests", q0Var, gVar, p0Var);
        return objK == obj2 ? obj2 : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(v13.c cVar) {
        r0 r0Var;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i14 = r0Var.f131908c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r0Var.f131908c = i14 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object obj = r0Var.f131906a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r0Var.f131908c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        uf2.s sVarF = this.f131773b.f();
        r0Var.f131908c = 1;
        Object objN = sVarF.n(r0Var);
        return objN == aVar ? aVar : objN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(v13.c cVar) {
        s0 s0Var;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f131913c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f131913c = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object obj = s0Var.f131911a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f131913c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        uf2.s sVarF = this.f131773b.f();
        s0Var.f131913c = 1;
        Object objP = sVarF.p(s0Var);
        return objP == aVar ? aVar : objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Integer num, v13.c cVar) {
        t0 t0Var;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f131918c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f131918c = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object obj = t0Var.f131916a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f131918c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        uf2.s sVarF = this.f131773b.f();
        t0Var.f131918c = 1;
        Object objR = sVarF.r(num, t0Var);
        return objR == aVar ? aVar : objR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(v13.c cVar) {
        u0 u0Var;
        p2 p2Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f131924c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f131924c = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object obj = u0Var.f131922a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f131924c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        of2.b bVarG = g();
        b0 b0Var = (bVarG == null || (p2Var = bVarG.f131736o) == null) ? null : (b0) p2Var.getValue();
        zf2.d dVar = b0Var != null ? b0Var.f131747d : null;
        Integer num = dVar != null ? new Integer(dVar.f204633e) : null;
        Integer num2 = dVar != null ? new Integer(dVar.f204634f) : null;
        zf2.i iVar = b0Var != null ? b0Var.f131750g : null;
        uf2.s sVarF = this.f131773b.f();
        u0Var.f131924c = 1;
        Object objT = sVarF.t(num, num2, iVar, u0Var);
        return objT == aVar ? aVar : objT;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0201  */
    /* JADX WARN: Code duplicated, block: B:72:0x0257  */
    /* JADX WARN: Code duplicated, block: B:76:0x0284  */
    /* JADX WARN: Code duplicated, block: B:81:0x02da  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0332  */
    /* JADX WARN: Code duplicated, block: B:93:0x0337  */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0339, code lost:
    
        if (r2 == r11) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.UUID, o53.d0, of2.b0, rs2.c, t13.d, t13.g, vf2.p, zf2.a] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [of2.b0, rs2.c] */
    /* JADX WARN: Type inference failed for: r13v7, types: [t13.d] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [of2.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(UUID uuid, rs2.c cVar, jg2.a aVar, zf2.a aVar2, zf2.i iVar, String str, rf2.l lVar, vf2.p pVar, zf2.h hVar, zf2.g gVar, boolean z14, boolean z15, boolean z16, v13.c cVar2) {
        v0 v0Var;
        String str2;
        mf2.c cVar3;
        String str3;
        UUID uuid2;
        v0 v0Var2;
        rs2.c cVar4;
        zf2.a aVar3;
        boolean z17;
        boolean z18;
        u13.a aVar4;
        b0 b0Var;
        boolean z19;
        vf2.p pVar2;
        String nameHandleHash;
        Object objF;
        UUID uuid3;
        uf2.r0 r0Var;
        au0.d0 d0Var;
        qf2.a aVar5;
        boolean z24;
        boolean z25;
        ?? r14;
        boolean z26;
        vf2.p pVar3;
        UUID uuid4;
        zf2.a aVar6;
        dt2.g gVar2;
        Object objJ;
        boolean z27;
        vf2.p pVar4;
        ?? r15;
        uf2.q0 q0Var;
        p2 p2Var;
        Object value;
        ?? r16;
        of2.b bVar;
        Object objI;
        u13.a aVar7;
        if (cVar2 instanceof v0) {
            v0Var = (v0) cVar2;
            int i14 = v0Var.f131939l;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f131939l = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar2);
            }
        } else {
            v0Var = new v0(this, cVar2);
        }
        v0 v0Var3 = v0Var;
        Object objA = v0Var3.f131937j;
        u13.a aVar8 = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var3.f131939l;
        mf2.c cVar5 = this.f131772a;
        fg2.c cVar6 = this.f131774c;
        uf2.q0 q0Var2 = this.f131773b;
        if (i15 == 0) {
            o13.r.b(objA);
            if (aVar2.f204562a == zf2.d.f204593g2) {
                zg2.c.f204692a.getClass();
                zg2.c.b("LSVSessionManager", "Trying to start a new session with an unsupported activity type.");
                return Unit.INSTANCE;
            }
            tf2.c cVar7 = new tf2.c(null, null, null, null, 15, null);
            zf2.d dVar = aVar2.f204562a;
            String str4 = aVar2.f204563b;
            List<zf2.c> list = aVar2.f204566e;
            if (str == null) {
                String strA = (pVar == null || (nameHandleHash = pVar.getNameHandleHash()) == null) ? null : cVar6.a(nameHandleHash);
                if (strA != null) {
                    str2 = strA;
                } else if (pVar != null) {
                    strA = pVar.getName();
                    str2 = strA;
                } else {
                    str2 = null;
                }
            } else {
                str2 = str;
            }
            cVar3 = cVar5;
            str3 = "LSVSessionManager";
            b0 b0Var2 = new b0(uuid, cVar, aVar, dVar, str4, list, iVar, str2, lVar, pVar, cVar7, hVar, gVar, aVar2.f204567f, aVar2.f204568g, z16, aVar2.f204569h);
            au0.c0 c0Var = this.f131782k;
            if (c0Var == null) {
                zg2.c.f204692a.getClass();
                zg2.c.b(str3, "Missing initializationHandler.");
                return Unit.INSTANCE;
            }
            uuid2 = uuid;
            v0Var2 = v0Var3;
            v0Var2.f131928a = uuid2;
            cVar4 = cVar;
            v0Var2.f131929b = cVar4;
            aVar3 = aVar2;
            v0Var2.f131930c = aVar3;
            v0Var2.f131931d = pVar;
            v0Var2.f131932e = b0Var2;
            z17 = z14;
            v0Var2.f131934g = z17;
            z18 = z15;
            v0Var2.f131935h = z18;
            v0Var2.f131936i = z16;
            v0Var2.f131939l = 1;
            objA = c0Var.a(b0Var2, v0Var2);
            aVar4 = aVar8;
            if (objA != aVar4) {
                b0Var = b0Var2;
                z19 = z16;
                pVar2 = pVar;
            }
            return aVar4;
        }
        if (i15 == 1) {
            boolean z28 = v0Var3.f131936i;
            boolean z29 = v0Var3.f131935h;
            z17 = v0Var3.f131934g;
            b0 b0Var3 = v0Var3.f131932e;
            pVar2 = v0Var3.f131931d;
            zf2.a aVar9 = v0Var3.f131930c;
            rs2.c cVar8 = v0Var3.f131929b;
            UUID uuid5 = v0Var3.f131928a;
            o13.r.b(objA);
            aVar4 = aVar8;
            uuid2 = uuid5;
            cVar3 = cVar5;
            aVar3 = aVar9;
            cVar4 = cVar8;
            b0Var = b0Var3;
            z18 = z29;
            v0Var2 = v0Var3;
            z19 = z28;
            str3 = "LSVSessionManager";
        } else {
            if (i15 == 2) {
                boolean z34 = v0Var3.f131936i;
                boolean z35 = v0Var3.f131935h;
                z17 = v0Var3.f131934g;
                b0 b0Var4 = v0Var3.f131932e;
                pVar2 = v0Var3.f131931d;
                zf2.a aVar10 = v0Var3.f131930c;
                rs2.c cVar9 = v0Var3.f131929b;
                uuid3 = v0Var3.f131928a;
                o13.r.b(objA);
                cVar3 = cVar5;
                cVar6 = cVar6;
                aVar3 = aVar10;
                cVar4 = cVar9;
                q0Var2 = q0Var2;
                aVar4 = aVar8;
                b0Var = b0Var4;
                z18 = z35;
                v0Var2 = v0Var3;
                z19 = z34;
                str3 = "LSVSessionManager";
                r0Var = (uf2.r0) w5.r.l(this.f131776e.f17917a, cVar4.getF92746j(), uf2.r0.class);
                if (r0Var != null && (gVar2 = r0Var.f170476g) != null) {
                    q0Var2.f().f170501b = gVar2;
                    q0Var2.e().f170501b = gVar2;
                }
                d0Var = this.f131779h;
                if (d0Var != null) {
                    aVar5 = d0Var.a();
                } else {
                    aVar5 = new qf2.a(0, 0, 0, false, false, false, 63, null);
                }
                this.f131780i = aVar5;
                z24 = aVar5.f144650e;
                z25 = aVar5.f144651f;
                v0Var2.f131928a = uuid3;
                r14 = 0;
                v0Var2.f131929b = null;
                v0Var2.f131930c = aVar3;
                v0Var2.f131931d = pVar2;
                v0Var2.f131932e = b0Var;
                v0Var2.f131934g = z17;
                v0Var2.f131935h = z18;
                v0Var2.f131936i = z19;
                v0Var2.f131939l = 3;
                if (this.f131781j.g(b0Var, z24, z25, false, v0Var2) != aVar4) {
                    z26 = z17;
                    pVar3 = pVar2;
                    uuid4 = uuid3;
                    aVar6 = aVar3;
                    s1 s1Var = this.f131781j.f71436k;
                    x53.c cVar10 = o53.s0.f129406a;
                    u53.d dVarA = o53.c0.a(x53.b.f189152a);
                    v0Var2.f131928a = uuid4;
                    v0Var2.f131929b = r14;
                    v0Var2.f131930c = aVar6;
                    v0Var2.f131931d = pVar3;
                    v0Var2.f131932e = r14;
                    v0Var2.f131933f = b0Var;
                    v0Var2.f131934g = z26;
                    v0Var2.f131935h = z18;
                    v0Var2.f131936i = z19;
                    v0Var2.f131939l = 4;
                    objJ = r53.s.J(s1Var, dVarA, v0Var2);
                    if (objJ != aVar4) {
                        vf2.p pVar5 = pVar3;
                        z27 = z26;
                        objA = objJ;
                        pVar4 = pVar5;
                        r15 = r14;
                        of2.b bVar2 = new of2.b(b0Var, (o2) objA, q0Var2.f(), new w0(this, r15), cVar3.b(uuid4, pVar4, aVar6.f204564c, aVar6.f204565d), cVar6);
                        this.f131786o.add(bVar2);
                        p2 p2Var2 = this.f131778g;
                        p2Var2.setValue(bVar2);
                        q0Var = q0Var2;
                        q0Var.f170467d = bVar2;
                        do {
                            p2Var = this.f131784m;
                            value = p2Var.getValue();
                            ((Boolean) value).getClass();
                        } while (!p2Var.b(value, Boolean.valueOf(z27)));
                        if (z27) {
                            r16 = 0;
                            this.f131785n.k(null, Boolean.FALSE);
                        } else {
                            r16 = 0;
                        }
                        bVar = (of2.b) p2Var2.getValue();
                        if (bVar != null) {
                            bVar.f131728g = ge1.b.T(bVar.f131731j, r16, r16, new a0(bVar, r16), 3);
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z18) {
                            v0Var2.f131928a = r16;
                            v0Var2.f131929b = r16;
                            v0Var2.f131930c = r16;
                            v0Var2.f131931d = r16;
                            v0Var2.f131932e = r16;
                            v0Var2.f131933f = r16;
                            v0Var2.f131934g = z27;
                            v0Var2.f131935h = z18;
                            v0Var2.f131936i = z19;
                            v0Var2.f131939l = 5;
                            uf2.s sVarF = q0Var.f();
                            objI = sVarF.c().i(sVarF.f170501b, ((z0) sVarF.f170496e.getValue()).a(), v0Var2);
                            aVar7 = u13.a.COROUTINE_SUSPENDED;
                            if (objI != aVar7) {
                                objI = Unit.INSTANCE;
                            }
                            if (objI != aVar7) {
                                objI = Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar4;
            }
            if (i15 == 3) {
                boolean z36 = v0Var3.f131936i;
                boolean z37 = v0Var3.f131935h;
                boolean z38 = v0Var3.f131934g;
                b0 b0Var5 = v0Var3.f131932e;
                vf2.p pVar6 = v0Var3.f131931d;
                zf2.a aVar11 = v0Var3.f131930c;
                UUID uuid6 = v0Var3.f131928a;
                o13.r.b(objA);
                aVar4 = aVar8;
                pVar3 = pVar6;
                cVar3 = cVar5;
                cVar6 = cVar6;
                z26 = z38;
                aVar6 = aVar11;
                q0Var2 = q0Var2;
                r14 = 0;
                b0Var = b0Var5;
                uuid4 = uuid6;
                z18 = z37;
                v0Var2 = v0Var3;
                z19 = z36;
                str3 = "LSVSessionManager";
                s1 s1Var2 = this.f131781j.f71436k;
                x53.c cVar11 = o53.s0.f129406a;
                u53.d dVarA2 = o53.c0.a(x53.b.f189152a);
                v0Var2.f131928a = uuid4;
                v0Var2.f131929b = r14;
                v0Var2.f131930c = aVar6;
                v0Var2.f131931d = pVar3;
                v0Var2.f131932e = r14;
                v0Var2.f131933f = b0Var;
                v0Var2.f131934g = z26;
                v0Var2.f131935h = z18;
                v0Var2.f131936i = z19;
                v0Var2.f131939l = 4;
                objJ = r53.s.J(s1Var2, dVarA2, v0Var2);
                if (objJ != aVar4) {
                    vf2.p pVar7 = pVar3;
                    z27 = z26;
                    objA = objJ;
                    pVar4 = pVar7;
                    r15 = r14;
                    of2.b bVar3 = new of2.b(b0Var, (o2) objA, q0Var2.f(), new w0(this, r15), cVar3.b(uuid4, pVar4, aVar6.f204564c, aVar6.f204565d), cVar6);
                    this.f131786o.add(bVar3);
                    p2 p2Var3 = this.f131778g;
                    p2Var3.setValue(bVar3);
                    q0Var = q0Var2;
                    q0Var.f170467d = bVar3;
                    do {
                        p2Var = this.f131784m;
                        value = p2Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!p2Var.b(value, Boolean.valueOf(z27)));
                    if (z27) {
                        r16 = 0;
                        this.f131785n.k(null, Boolean.FALSE);
                    } else {
                        r16 = 0;
                    }
                    bVar = (of2.b) p2Var3.getValue();
                    if (bVar != null) {
                        bVar.f131728g = ge1.b.T(bVar.f131731j, r16, r16, new a0(bVar, r16), 3);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (z18) {
                        v0Var2.f131928a = r16;
                        v0Var2.f131929b = r16;
                        v0Var2.f131930c = r16;
                        v0Var2.f131931d = r16;
                        v0Var2.f131932e = r16;
                        v0Var2.f131933f = r16;
                        v0Var2.f131934g = z27;
                        v0Var2.f131935h = z18;
                        v0Var2.f131936i = z19;
                        v0Var2.f131939l = 5;
                        uf2.s sVarF2 = q0Var.f();
                        objI = sVarF2.c().i(sVarF2.f170501b, ((z0) sVarF2.f170496e.getValue()).a(), v0Var2);
                        aVar7 = u13.a.COROUTINE_SUSPENDED;
                        if (objI != aVar7) {
                            objI = Unit.INSTANCE;
                        }
                        if (objI != aVar7) {
                            objI = Unit.INSTANCE;
                        }
                    }
                }
                return aVar4;
            }
            if (i15 == 4) {
                boolean z39 = v0Var3.f131936i;
                boolean z44 = v0Var3.f131935h;
                boolean z45 = v0Var3.f131934g;
                b0 b0Var6 = v0Var3.f131933f;
                vf2.p pVar8 = v0Var3.f131931d;
                aVar6 = v0Var3.f131930c;
                uuid4 = v0Var3.f131928a;
                o13.r.b(objA);
                cVar3 = cVar5;
                cVar6 = cVar6;
                pVar4 = pVar8;
                q0Var2 = q0Var2;
                r15 = 0;
                b0Var = b0Var6;
                aVar4 = aVar8;
                z27 = z45;
                z18 = z44;
                v0Var2 = v0Var3;
                z19 = z39;
                str3 = "LSVSessionManager";
                of2.b bVar4 = new of2.b(b0Var, (o2) objA, q0Var2.f(), new w0(this, r15), cVar3.b(uuid4, pVar4, aVar6.f204564c, aVar6.f204565d), cVar6);
                this.f131786o.add(bVar4);
                p2 p2Var4 = this.f131778g;
                p2Var4.setValue(bVar4);
                q0Var = q0Var2;
                q0Var.f170467d = bVar4;
                do {
                    p2Var = this.f131784m;
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.valueOf(z27)));
                if (z27) {
                    r16 = 0;
                    this.f131785n.k(null, Boolean.FALSE);
                } else {
                    r16 = 0;
                }
                bVar = (of2.b) p2Var4.getValue();
                if (bVar != null) {
                    bVar.f131728g = ge1.b.T(bVar.f131731j, r16, r16, new a0(bVar, r16), 3);
                    Unit unit3 = Unit.INSTANCE;
                }
                if (z18) {
                    v0Var2.f131928a = r16;
                    v0Var2.f131929b = r16;
                    v0Var2.f131930c = r16;
                    v0Var2.f131931d = r16;
                    v0Var2.f131932e = r16;
                    v0Var2.f131933f = r16;
                    v0Var2.f131934g = z27;
                    v0Var2.f131935h = z18;
                    v0Var2.f131936i = z19;
                    v0Var2.f131939l = 5;
                    uf2.s sVarF3 = q0Var.f();
                    objI = sVarF3.c().i(sVarF3.f170501b, ((z0) sVarF3.f170496e.getValue()).a(), v0Var2);
                    aVar7 = u13.a.COROUTINE_SUSPENDED;
                    if (objI != aVar7) {
                        objI = Unit.INSTANCE;
                    }
                    if (objI != aVar7) {
                        objI = Unit.INSTANCE;
                    }
                }
            } else {
                if (i15 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
                str3 = "LSVSessionManager";
            }
        }
        zg2.c.f204692a.getClass();
        zg2.c.a(str3, "Successfully started a new session.");
        return Unit.INSTANCE;
        if (((Boolean) objA).booleanValue()) {
            v0Var2.f131928a = uuid2;
            v0Var2.f131929b = cVar4;
            v0Var2.f131930c = aVar3;
            v0Var2.f131931d = pVar2;
            v0Var2.f131932e = b0Var;
            v0Var2.f131934g = z17;
            v0Var2.f131935h = z18;
            v0Var2.f131936i = z19;
            v0Var2.f131939l = 2;
            of2.b bVarG = g();
            if (bVarG == null || (objF = f(bVarG, v0Var2)) != aVar4) {
                objF = Unit.INSTANCE;
            }
            if (objF != aVar4) {
                uuid3 = uuid2;
                r0Var = (uf2.r0) w5.r.l(this.f131776e.f17917a, cVar4.getF92746j(), uf2.r0.class);
                if (r0Var != null) {
                    q0Var2.f().f170501b = gVar2;
                    q0Var2.e().f170501b = gVar2;
                }
                d0Var = this.f131779h;
                if (d0Var != null) {
                    aVar5 = d0Var.a();
                } else {
                    aVar5 = new qf2.a(0, 0, 0, false, false, false, 63, null);
                }
                this.f131780i = aVar5;
                z24 = aVar5.f144650e;
                z25 = aVar5.f144651f;
                v0Var2.f131928a = uuid3;
                r14 = 0;
                v0Var2.f131929b = null;
                v0Var2.f131930c = aVar3;
                v0Var2.f131931d = pVar2;
                v0Var2.f131932e = b0Var;
                v0Var2.f131934g = z17;
                v0Var2.f131935h = z18;
                v0Var2.f131936i = z19;
                v0Var2.f131939l = 3;
                if (this.f131781j.g(b0Var, z24, z25, false, v0Var2) != aVar4) {
                    z26 = z17;
                    pVar3 = pVar2;
                    uuid4 = uuid3;
                    aVar6 = aVar3;
                    s1 s1Var3 = this.f131781j.f71436k;
                    x53.c cVar12 = o53.s0.f129406a;
                    u53.d dVarA3 = o53.c0.a(x53.b.f189152a);
                    v0Var2.f131928a = uuid4;
                    v0Var2.f131929b = r14;
                    v0Var2.f131930c = aVar6;
                    v0Var2.f131931d = pVar3;
                    v0Var2.f131932e = r14;
                    v0Var2.f131933f = b0Var;
                    v0Var2.f131934g = z26;
                    v0Var2.f131935h = z18;
                    v0Var2.f131936i = z19;
                    v0Var2.f131939l = 4;
                    objJ = r53.s.J(s1Var3, dVarA3, v0Var2);
                    if (objJ != aVar4) {
                        vf2.p pVar9 = pVar3;
                        z27 = z26;
                        objA = objJ;
                        pVar4 = pVar9;
                        r15 = r14;
                        of2.b bVar5 = new of2.b(b0Var, (o2) objA, q0Var2.f(), new w0(this, r15), cVar3.b(uuid4, pVar4, aVar6.f204564c, aVar6.f204565d), cVar6);
                        this.f131786o.add(bVar5);
                        p2 p2Var5 = this.f131778g;
                        p2Var5.setValue(bVar5);
                        q0Var = q0Var2;
                        q0Var.f170467d = bVar5;
                        do {
                            p2Var = this.f131784m;
                            value = p2Var.getValue();
                            ((Boolean) value).getClass();
                        } while (!p2Var.b(value, Boolean.valueOf(z27)));
                        if (z27) {
                            r16 = 0;
                            this.f131785n.k(null, Boolean.FALSE);
                        } else {
                            r16 = 0;
                        }
                        bVar = (of2.b) p2Var5.getValue();
                        if (bVar != null) {
                            bVar.f131728g = ge1.b.T(bVar.f131731j, r16, r16, new a0(bVar, r16), 3);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        if (z18) {
                            v0Var2.f131928a = r16;
                            v0Var2.f131929b = r16;
                            v0Var2.f131930c = r16;
                            v0Var2.f131931d = r16;
                            v0Var2.f131932e = r16;
                            v0Var2.f131933f = r16;
                            v0Var2.f131934g = z27;
                            v0Var2.f131935h = z18;
                            v0Var2.f131936i = z19;
                            v0Var2.f131939l = 5;
                            uf2.s sVarF4 = q0Var.f();
                            objI = sVarF4.c().i(sVarF4.f170501b, ((z0) sVarF4.f170496e.getValue()).a(), v0Var2);
                            aVar7 = u13.a.COROUTINE_SUSPENDED;
                            if (objI != aVar7) {
                                objI = Unit.INSTANCE;
                            }
                            if (objI != aVar7) {
                                objI = Unit.INSTANCE;
                            }
                        }
                        zg2.c.f204692a.getClass();
                        zg2.c.a(str3, "Successfully started a new session.");
                    }
                }
            }
            return aVar4;
        }
        cVar3.e(new sf2.f.b(null, sf2.f.b.a.C3007b.f158999a, cVar4, 1, null));
        zg2.c.f204692a.getClass();
        zg2.c.a(str3, "Missing session configuration provider.");
        return Unit.INSTANCE;
    }

    public final Object r(long j8, UUID uuid, yf2.a aVar, v13.c cVar) {
        jg2.d dVar = aVar != null ? new jg2.d(uuid, aVar) : null;
        zg2.c.f204692a.getClass();
        zg2.c.a("LSVSessionManager", "Set value estimation session: " + dVar);
        Object objA = this.f131775d.a(j8, dVar, cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(long j8, yf2.a aVar, v13.c cVar) {
        x0 x0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f131957e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f131957e = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objH = x0Var.f131955c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f131957e;
        if (i15 == 0) {
            o13.r.b(objH);
            x0Var.f131954b = aVar;
            x0Var.f131953a = j8;
            x0Var.f131957e = 1;
            objH = h(j8, aVar, x0Var);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = x0Var.f131953a;
            aVar = x0Var.f131954b;
            o13.r.b(objH);
        }
        if (((Boolean) objH).booleanValue()) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionManager", "Value estimation session completed for deviceUnitId: " + j8 + " and valueEstimationType: " + aVar);
            of2.b bVarG = g();
            if (bVarG != null) {
                aVar.getClass();
                ge1.b.T(bVarG.f131732k, null, null, new v(bVarG, aVar, null), 3);
            }
        } else {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionManager", "No active value estimation session found for deviceUnitId: " + j8 + " and valueEstimationType: " + aVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lof2/c0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SESSION_READY_TIMEOUT_MS", "J", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

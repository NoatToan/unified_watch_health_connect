package fe2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd0.c6;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfe2/j0;", "Lfe2/p1;", "Lo53/b0;", "", "deviceUnitId", "Lfe2/y0;", "sessionInput", "Lxd2/a1;", "repository", "Lde2/g0;", "deviceManager", "Lwd2/l;", "appDelegate", "<init>", "(JLfe2/y0;Lxd2/a1;Lde2/g0;Lwd2/l;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements p1, o53.b0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f70788r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f70790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd2.a1 f70791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de2.g0 f70792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wd2.l f70793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f70794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o53.m1 f70795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f70796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f70797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae2.e0 f70798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<wd2.f2, ? extends List<wd2.d2>> f70799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<v1> f70800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f70801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f70803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f70804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f70805q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession$onDeviceConnected$1", f = "DeviceDrivenSession.kt", l = {228}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f70806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f70807b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70807b;
            if (i14 == 0) {
                o13.r.b(obj);
                j0 j0Var2 = j0.this;
                this.f70806a = j0Var2;
                this.f70807b = 1;
                Object objS = j0.s(j0Var2, this);
                if (objS == aVar) {
                    return aVar;
                }
                j0Var = j0Var2;
                obj = objS;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j0Var = this.f70806a;
                o13.r.b(obj);
            }
            j0Var.f70797i = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {193, 196}, m = "updateSessionName", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f70809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xd2.g1.b f70810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f70811c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f70813e;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f70811c = obj;
            this.f70813e |= Integer.MIN_VALUE;
            return j0.this.e(null, this);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(long j8, y0 y0Var, xd2.a1 a1Var, de2.g0 g0Var, wd2.l lVar) throws Throwable {
        ae2.e0 e0Var;
        y0Var.getClass();
        a1Var.getClass();
        g0Var.getClass();
        lVar.getClass();
        this.f70789a = j8;
        this.f70790b = y0Var;
        this.f70791c = a1Var;
        this.f70792d = g0Var;
        this.f70793e = lVar;
        this.f70794f = i2.a("DeviceDrivenSession");
        this.f70795g = g8.i.c();
        this.f70796h = o13.m.b(new z(this, 1));
        if (y0Var.f71007b != null) {
            ae2.e0.a.C0042a c0042a = ae2.e0.a.f2836b;
            String strValueOf = String.valueOf(y0Var.f71008c);
            c0042a.getClass();
            ae2.e0.a aVarA = ae2.e0.a.C0042a.a(strValueOf);
            e0Var = new ae2.e0(y0Var.f71007b, aVarA == null ? new ae2.e0.a.c() : aVarA, null, y0Var.f71006a, null, 20, null);
        } else {
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            ge1.b.W(t13.h.f161748a, new o0(this, r0Var, null));
            e0Var = (ae2.e0) r0Var.f105810a;
        }
        this.f70798j = e0Var;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f70799k = k0Var;
        List<wd2.b2> list = y0Var.f71009d;
        ArrayList arrayList = new ArrayList();
        for (wd2.b2 b2Var : list) {
            String str = b2Var.f184400a;
            String str2 = b2Var.f184401b;
            wd2.c2 c2Var = b2Var.f184402c;
            arrayList.add(new v1(str, str2, null, c2Var != null ? xd2.a.e(c2Var) : null, new v1.a(this.f70798j.getIdentifier(), this.f70798j.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a, this.f70798j.getNickname()), null, null, 100, null));
        }
        this.f70800l = arrayList;
        this.f70801m = this.f70790b.f71010e;
        this.f70803o = true;
        this.f70805q = this.f70793e.f().g();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object s(j0 j0Var, v13.c cVar) {
        q0 q0Var;
        j0Var.getClass();
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f70898c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f70898c = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(j0Var, cVar);
            }
        } else {
            q0Var = new q0(j0Var, cVar);
        }
        q0 q0Var2 = q0Var;
        Object objB = q0Var2.f70896a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var2.f70898c;
        if (i15 == 0) {
            o13.r.b(objB);
            j0Var.f70794f.warn("Start session on device " + j0Var.f70789a);
            ae2.e0 e0Var = j0Var.f70798j;
            Long l14 = j0Var.f70801m;
            de2.h0 h0Var = new de2.h0(e0Var, l14 != null ? l14.longValue() : System.currentTimeMillis(), j0Var.f70805q, 86400L, j0Var.f70800l);
            de2.g0 g0Var = j0Var.f70792d;
            long j8 = j0Var.f70789a;
            q0Var2.f70898c = 1;
            objB = g0Var.b(j8, true, h0Var, q0Var2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return Boolean.valueOf(objB instanceof de2.g0.b.d);
    }

    @Override // fe2.p1
    public final boolean a() {
        this.f70794f.debug("Device connected");
        if (!this.f70802n || this.f70797i) {
            return false;
        }
        ge1.b.T(this, null, null, new b(null), 3);
        return true;
    }

    @Override // fe2.p1
    public final void b() {
        this.f70794f.debug("Auto start is not cancellable! Nothing to do");
    }

    @Override // fe2.p1
    public final void c() {
    }

    @Override // fe2.p1
    public final Object d(boolean z14, wd2.b1 b1Var) {
        return this.f70791c.s(this.f70798j, this.f70789a, z14, b1Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // fe2.p1
    public final Object e(String str, t13.d<? super xd2.g1<Unit>> dVar) {
        c cVar;
        String str2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f70813e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f70813e = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object objL = cVar2.f70811c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f70813e;
        if (i15 == 0) {
            o13.r.b(objL);
            str.getClass();
            this.f70805q = str;
            cVar2.f70809a = str;
            cVar2.f70813e = 1;
            objL = this.f70791c.l(this.f70789a, this.f70798j, str, cVar2);
            if (objL != aVar) {
                str2 = str;
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xd2.g1.b bVar = cVar2.f70810b;
            o13.r.b(objL);
            return bVar;
        }
        str2 = cVar2.f70809a;
        o13.r.b(objL);
        xd2.g1 g1Var = (xd2.g1) objL;
        if (g1Var instanceof xd2.g1.b) {
            cVar2.f70809a = null;
            cVar2.f70810b = (xd2.g1.b) g1Var;
            cVar2.f70813e = 2;
            if (this.f70792d.e(this.f70789a, str2, cVar2) == aVar) {
                return aVar;
            }
        }
        return g1Var;
    }

    @Override // fe2.p1
    public final Object f(int i14, long j8, String str, wd2.j jVar, wd2.r0 r0Var) {
        Object objD = ((j1) this.f70796h.getValue()).d(i14, j8, str, w(), jVar, r0Var);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r10.f70791c.b(r3, r0) == r1) goto L48;
     */
    @Override // fe2.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.garmin.android.library.livetrack.i iVar, v13.c cVar) {
        r0 r0Var;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i14 = r0Var.f70905c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r0Var.f70905c = i14 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object objV = r0Var.f70903a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = r0Var.f70905c;
        long j8 = this.f70789a;
        Object obj2 = null;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objV);
            } else if (i15 == 2) {
                o13.r.b(objV);
                this.f70802n = false;
                r0Var.f70905c = 3;
            } else {
                if (i15 != 3) {
                    if (i15 == 4) {
                        o13.r.b(objV);
                        return objV;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objV);
            }
            return new com.garmin.android.library.livetrack.d.b(j8);
        }
        o13.r.b(objV);
        if (p005kotlin.jvm.internal.s.g(iVar, com.garmin.android.library.livetrack.i.b.f50229a)) {
            r0Var.f70905c = 1;
            objV = v(r0Var);
            if (objV != obj) {
            }
        } else {
            if (!(iVar instanceof com.garmin.android.library.livetrack.i.a)) {
                lc.u0.r();
                return null;
            }
            o53.j0 j0VarJ = ge1.b.j(this, null, null, new t0(this, x(), null), 3);
            r0Var.f70905c = 4;
            Object objC = j0VarJ.C(r0Var);
            if (objC != obj) {
                return objC;
            }
        }
        return obj;
        List list = (List) objV;
        if (list != null) {
            for (Object obj3 : list) {
                if (p005kotlin.jvm.internal.s.g(((v1) obj3).f70968d, v1.b.a.f70975a)) {
                    obj2 = obj3;
                    break;
                }
            }
            obj2 = (v1) obj2;
        }
        if (obj2 != null) {
            v1.b bVar = v1.b.a.f70975a;
            r0Var.f70905c = 2;
            if (p(bVar, r0Var) != obj) {
                this.f70802n = false;
                r0Var.f70905c = 3;
            }
        } else {
            this.f70802n = false;
            r0Var.f70905c = 3;
        }
        return obj;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f70795g);
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getDeviceUnitId, reason: from getter */
    public final long getF70633a() {
        return this.f70789a;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF70650r() {
        return this.f70805q;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getPublisher, reason: from getter */
    public final ae2.e0 getF70637e() {
        return this.f70798j;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getStartTime */
    public final DateTime getF70647o() {
        Long l14 = this.f70801m;
        if (l14 != null) {
            return new DateTime(l14.longValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x021a A[EDGE_INSN: B:106:0x021a->B:93:0x021a BREAK  A[LOOP:0: B:85:0x01f7->B:108:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x020e  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
    
        if (r3 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022c, code lost:
    
        if (r2 == r4) goto L97;
     */
    @Override // fe2.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.garmin.android.library.livetrack.i iVar, v13.c cVar) {
        p0 p0Var;
        String identifier;
        boolean zI;
        boolean z14;
        int i14;
        boolean z15;
        Object objA;
        com.garmin.android.library.livetrack.c cVarA;
        t1 t1Var;
        ae2.o oVar;
        be2.g gVar;
        Iterator<T> it;
        Object next;
        v1 v1Var;
        v1 v1Var2;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i15 = p0Var.f70889h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                p0Var.f70889h = i15 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objY = p0Var.f70887f;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = p0Var.f70889h;
        xd2.a1 a1Var = this.f70791c;
        ae2.e0 e0Var = this.f70798j;
        Logger logger = this.f70794f;
        long j8 = this.f70789a;
        Object obj2 = null;
        if (i16 == 0) {
            o13.r.b(objY);
            logger.debug("Start session attempt for " + j8);
            boolean z16 = iVar instanceof com.garmin.android.library.livetrack.i.b;
            this.f70804p = z16;
            if (iVar instanceof com.garmin.android.library.livetrack.i.a) {
                wd2.l lVar = this.f70793e;
                zI = lVar.a().i(j8);
                boolean zH = lVar.f().h(j8);
                c6 c6VarD = lVar.d();
                p0Var.f70882a = e0Var;
                p0Var.f70884c = 1;
                p0Var.f70885d = zI;
                p0Var.f70886e = zH;
                p0Var.f70889h = 1;
                Object objA2 = c6VarD.a(true, p0Var);
                if (objA2 != obj) {
                    z14 = zH;
                    i14 = 1;
                    objY = objA2;
                    boolean z17 = zI;
                    ae2.e0 e0Var2 = e0Var;
                    wd2.g2 g2Var = (wd2.g2) objY;
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    u0 u0Var = new u0(this.f70789a, this.f70805q, new r1(e0Var2, false, z15, z17, z14, g2Var), a1Var, this.f70792d);
                    p0Var.f70882a = null;
                    p0Var.f70889h = 2;
                    objA = u0Var.a(p0Var);
                }
            } else {
                if (!z16) {
                    lc.u0.r();
                    return null;
                }
                identifier = e0Var.getIdentifier();
                if (identifier == null) {
                    return new com.garmin.android.library.livetrack.d.a(j8, com.garmin.android.library.livetrack.c.j.f50195a);
                }
                this.f70802n = true;
                this.f70797i = true;
                p0Var.f70882a = identifier;
                p0Var.f70889h = 3;
                if (u(p0Var) != obj) {
                    gVar = new be2.g(this.f70789a, this.f70805q, identifier, e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a, true, false, w(), null, null, null, 928, null);
                    p0Var.f70882a = null;
                    p0Var.f70889h = 4;
                    if (a1Var.e(gVar, p0Var) != obj) {
                        it = this.f70800l.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            v1Var2 = (v1) next;
                            if (p005kotlin.jvm.internal.s.g(v1Var2.f70968d, v1.b.d.f70978a)) {
                                break;
                                break;
                            }
                        } while (!p005kotlin.jvm.internal.s.g(v1Var2.f70968d, v1.b.a.f70975a));
                        v1Var = (v1) next;
                        if (v1Var != null) {
                            String str = v1Var.f70965a;
                            p0Var.f70882a = null;
                            p0Var.f70883b = v1Var;
                            p0Var.f70889h = 5;
                            objY = y(str, p0Var);
                        }
                    }
                }
            }
            return obj;
        }
        if (i16 == 1) {
            boolean z18 = p0Var.f70886e;
            zI = p0Var.f70885d;
            i14 = p0Var.f70884c;
            e0Var = (ae2.e0) p0Var.f70882a;
            o13.r.b(objY);
            z14 = z18;
            boolean z19 = zI;
            ae2.e0 e0Var3 = e0Var;
            wd2.g2 g2Var2 = (wd2.g2) objY;
            if (i14 != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            u0 u0Var2 = new u0(this.f70789a, this.f70805q, new r1(e0Var3, false, z15, z19, z14, g2Var2), a1Var, this.f70792d);
            p0Var.f70882a = null;
            p0Var.f70889h = 2;
            objA = u0Var2.a(p0Var);
        } else if (i16 != 2) {
            if (i16 == 3) {
                identifier = (String) p0Var.f70882a;
                o13.r.b(objY);
                gVar = new be2.g(this.f70789a, this.f70805q, identifier, e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a, true, false, w(), null, null, null, 928, null);
                p0Var.f70882a = null;
                p0Var.f70889h = 4;
                if (a1Var.e(gVar, p0Var) != obj) {
                    it = this.f70800l.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        v1Var2 = (v1) next;
                        if (p005kotlin.jvm.internal.s.g(v1Var2.f70968d, v1.b.d.f70978a)) {
                            break;
                            break;
                        }
                    } while (!p005kotlin.jvm.internal.s.g(v1Var2.f70968d, v1.b.a.f70975a));
                    v1Var = (v1) next;
                    if (v1Var != null) {
                        String str2 = v1Var.f70965a;
                        p0Var.f70882a = null;
                        p0Var.f70883b = v1Var;
                        p0Var.f70889h = 5;
                        objY = y(str2, p0Var);
                    }
                }
                return obj;
            }
            if (i16 == 4) {
                o13.r.b(objY);
                it = this.f70800l.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    v1Var2 = (v1) next;
                    if (p005kotlin.jvm.internal.s.g(v1Var2.f70968d, v1.b.d.f70978a)) {
                        break;
                    }
                } while (!p005kotlin.jvm.internal.s.g(v1Var2.f70968d, v1.b.a.f70975a));
                v1Var = (v1) next;
                if (v1Var != null) {
                    String str3 = v1Var.f70965a;
                    p0Var.f70882a = null;
                    p0Var.f70883b = v1Var;
                    p0Var.f70889h = 5;
                    objY = y(str3, p0Var);
                }
            } else {
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v1Var = p0Var.f70883b;
                o13.r.b(objY);
            }
            v1Var.f70967c = (String) objY;
        } else {
            o13.r.b(objY);
            objA = objY;
        }
        u1 u1Var = (u1) objA;
        logger.debug("Session creator result for " + j8 + " is " + u1Var);
        if (!(u1Var instanceof u1.a)) {
            if (!(u1Var instanceof u1.b)) {
                lc.u0.r();
                return null;
            }
            List<t1> list = u1Var.f70952a;
            if (list == null || (t1Var = (t1) p13.h0.d0(list)) == null || (oVar = t1Var.f70934a) == null || (cVarA = q1.a(oVar)) == null) {
                cVarA = com.garmin.android.library.livetrack.c.j.f50195a;
            }
            return new com.garmin.android.library.livetrack.d.a(j8, cVarA);
        }
        this.f70802n = r12;
        u1.a aVar = (u1.a) u1Var;
        List<t1> list2 = aVar.f70952a;
        logger.debug("Session for device driven: true errors: " + list2);
        this.f70800l = p13.h0.d1(aVar.f70955d);
        this.f70799k = q1.b(list2);
        DateTime dateTime = aVar.f70953b;
        this.f70801m = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        if (list2 != null) {
            for (Object obj3 : list2) {
                if (((t1) obj3).f70934a instanceof ae2.o.a) {
                    obj2 = obj3;
                    break;
                }
            }
            obj2 = (t1) obj2;
        }
        this.f70797i = obj2 == null;
        return new com.garmin.android.library.livetrack.d.c(this.f70789a, null, 2, null);
        return new com.garmin.android.library.livetrack.d.c(this.f70789a, null, 2, null);
    }

    @Override // fe2.p1
    public final Object i(int i14, long j8, String str, long j14, wd2.q0 q0Var) {
        Object objC = ((j1) this.f70796h.getValue()).c(i14, j8, str, w(), j14, q0Var);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: isCreated, reason: from getter */
    public final boolean getF70648p() {
        return this.f70802n;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF70649q() {
        return this.f70804p;
    }

    @Override // fe2.p1
    public final List<v1> k() {
        return this.f70800l;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getF70803o() {
        return this.f70803o;
    }

    @Override // fe2.p1
    public final void m() {
        this.f70794f.debug("onDeviceDisconnected");
    }

    @Override // fe2.p1
    public final Object n(DateTime dateTime, DateTime dateTime2, ArrayList arrayList, ArrayList arrayList2, b2 b2Var) {
        this.f70802n = true;
        this.f70801m = dateTime != null ? new Long(dateTime.getMillis()) : new Long(System.currentTimeMillis());
        this.f70800l = new ArrayList(arrayList);
        LinkedHashMap linkedHashMapB = q1.b(arrayList2);
        this.f70799k = linkedHashMapB;
        return new com.garmin.android.library.livetrack.d.c(this.f70789a, linkedHashMapB);
    }

    @Override // fe2.p1
    public final Object o(int i14, String str, int i15, List list, Integer num, Integer num2, wd2.o0 o0Var) {
        Object objA = ((j1) this.f70796h.getValue()).a(i14, str, i15, list, num, num2, o0Var);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe2.p1
    public final Object p(v1.b bVar, v13.c cVar) {
        s0 s0Var;
        v1 v1Var;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f70920d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f70920d = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object objC = s0Var.f70918b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f70920d;
        if (i15 == 0) {
            o13.r.b(objC);
            if (!this.f70802n) {
                this.f70794f.warn("No sessions exist for device " + this.f70789a);
                return Unit.INSTANCE;
            }
            Iterator<v1> it = this.f70800l.iterator();
            while (true) {
                if (it.hasNext()) {
                    v1 next = it.next();
                    v1.b bVar2 = next.f70968d;
                    String str = next.f70965a;
                    if (p005kotlin.jvm.internal.s.g(bVar2, bVar) && str != null) {
                        z0 z0Var = new z0(this.f70789a, this.f70798j, x(), this.f70791c, this.f70792d);
                        s0Var.f70917a = next;
                        s0Var.f70920d = 1;
                        objC = z0Var.c(str, s0Var);
                        if (objC != aVar) {
                            v1Var = next;
                            break;
                        }
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v1Var = s0Var.f70917a;
        o13.r.b(objC);
        if (((d2) objC) instanceof d2.b) {
            this.f70800l.remove(v1Var);
        }
        return Unit.INSTANCE;
    }

    @Override // fe2.p1
    public final Map<wd2.f2, List<wd2.d2>> q() {
        return this.f70799k;
    }

    @Override // fe2.p1
    public final Object r(int i14, String str, List list, wd2.p0 p0Var) {
        Object objB = ((j1) this.f70796h.getValue()).b(i14, str, list, p0Var);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(v13.c cVar) {
        k0 k0Var;
        xd2.g1 g1Var;
        ae2.h0 session;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f70823c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f70823c = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        k0 k0Var2 = k0Var;
        Object objA = k0Var2.f70821a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var2.f70823c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (this.f70798j.getIdentifier() != null) {
                String str = this.f70805q;
                DateTime startTime = getF70647o();
                if (startTime == null) {
                    startTime = DateTime.now();
                }
                DateTime dateTime = startTime;
                k0Var2.f70823c = 1;
                int i16 = xd2.a1.f190042a;
                objA = this.f70791c.A(this.f70798j, this.f70789a, str, dateTime, 24, k0Var2);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                g1Var = null;
            }
            if ((g1Var instanceof xd2.g1.b) || (session = ((ae2.l0) ((xd2.g1.b) g1Var).f190167a).getSession()) == null) {
                return null;
            }
            return w1.b(session);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objA);
        g1Var = (xd2.g1) objA;
        if (g1Var instanceof xd2.g1.b) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:0: B:58:0x013e->B:86:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0160, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017d, code lost:
    
        if (r13 == r1) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(v13.c cVar) {
        l0 l0Var;
        v1 v1Var;
        String str;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f70834c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f70834c = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object objV = l0Var.f70832a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var.f70834c;
        Logger logger = this.f70794f;
        Object obj2 = null;
        if (i15 == 0) {
            o13.r.b(objV);
            l0Var.f70834c = 1;
            objV = v(l0Var);
            if (objV != obj) {
            }
            return obj;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(objV);
                    v1 v1Var2 = (v1) objV;
                    if (v1Var2 != null) {
                        this.f70800l.add(v1Var2);
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objV);
                List<v1> arrayList = (List) objV;
                this.f70800l.clear();
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                this.f70800l = arrayList;
                return Unit.INSTANCE;
            }
            o13.r.b(objV);
            if (((Boolean) objV).booleanValue()) {
                logger.debug("Fallback to device info");
                ((v1) p13.h0.m0(this.f70800l)).f70968d = v1.b.C1451b.f70976a;
            }
            for (Object obj3 : this.f70800l) {
                if (p005kotlin.jvm.internal.s.g(((v1) obj3).f70968d, v1.b.a.f70975a)) {
                    obj2 = obj3;
                    break;
                }
            }
            v1Var = (v1) obj2;
            if (v1Var != null) {
                str = v1Var.f70967c;
                if (str != null || str.length() == 0) {
                    l0Var.f70834c = 4;
                    objV = v(l0Var);
                }
                return Unit.INSTANCE;
            }
            l0Var.f70834c = 3;
            objV = t(l0Var);
            return obj;
        }
        o13.r.b(objV);
        List<v1> list = (List) objV;
        if (list != null) {
            ArrayList arrayListC0 = p13.h0.C0(this.f70800l, list);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj4 : arrayListC0) {
                String str2 = ((v1) obj4).f70965a;
                Object arrayList2 = linkedHashMap.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(str2, arrayList2);
                }
                ((List) arrayList2).add(obj4);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() == 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                p13.d0.v(arrayList3, (Iterable) ((Map.Entry) it.next()).getValue());
            }
            v1 v1Var3 = !arrayList3.isEmpty() ? (v1) p13.h0.b0(arrayList3) : null;
            if (v1Var3 != null) {
                v1Var3.f70968d = v1.b.C1451b.f70976a;
            }
            logger.debug("Group track session " + v1Var3);
            this.f70800l.clear();
            this.f70800l = list;
            if (v1Var3 != null) {
                list.add(v1Var3);
            }
            while (r13.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((v1) obj3).f70968d, v1.b.a.f70975a)) {
                    obj2 = obj3;
                    break;
                }
            }
            v1Var = (v1) obj2;
            if (v1Var != null) {
                l0Var.f70834c = 3;
                objV = t(l0Var);
            } else {
                str = v1Var.f70967c;
                if (str != null) {
                }
                l0Var.f70834c = 4;
                objV = v(l0Var);
            }
        } else {
            l0Var.f70834c = 2;
            objV = this.f70791c.G(this.f70789a, l0Var, true);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable v(v13.c cVar) {
        m0 m0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f70845c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f70845c = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        m0 m0Var2 = m0Var;
        Object objP = m0Var2.f70843a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var2.f70845c;
        if (i15 == 0) {
            o13.r.b(objP);
            ae2.e0 e0Var = this.f70798j;
            String identifier = e0Var.getIdentifier();
            if (identifier == null) {
                return null;
            }
            String str = e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a;
            m0Var2.f70845c = 1;
            objP = this.f70791c.p(this.f70789a, identifier, str, m0Var2);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objP);
        }
        xd2.g1 g1Var = (xd2.g1) objP;
        if (!(g1Var instanceof xd2.g1.b)) {
            return null;
        }
        Iterable iterable = (Iterable) ((xd2.g1.b) g1Var).f190167a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(w1.b((ae2.h0) it.next()));
        }
        return arrayList;
    }

    public final String w() {
        Object next;
        Iterator<T> it = this.f70800l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((v1) next).f70968d, v1.b.C1451b.f70976a));
        v1 v1Var = (v1) next;
        if (v1Var != null) {
            return v1Var.f70965a;
        }
        return null;
    }

    public final List<String> x() {
        List<v1> list = this.f70800l;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((v1) it.next()).f70965a;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(String str, v13.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f70862c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f70862c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objT = n0Var.f70860a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f70862c;
        if (i15 == 0) {
            o13.r.b(objT);
            com.airbnb.lottie.animation.keyframe.a.A("Get short url sessionId ", str, this.f70794f);
            if (str == null) {
                return null;
            }
            n0Var.f70862c = 1;
            objT = this.f70791c.t(this.f70789a, str, n0Var);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objT);
        }
        xd2.g1 g1Var = (xd2.g1) objT;
        if (g1Var instanceof xd2.g1.b) {
            return (String) ((xd2.g1.b) g1Var).f190167a;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

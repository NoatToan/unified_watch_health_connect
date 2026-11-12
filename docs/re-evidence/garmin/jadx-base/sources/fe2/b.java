package fe2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import kd0.c6;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfe2/b;", "Lfe2/p1;", "Lo53/b0;", "", "deviceUnitId", "Lxd2/a1;", "repository", "Lde2/g0;", "deviceManager", "Lwd2/l;", "appDelegate", "Lae2/e0;", "publisher", "<init>", "(JLxd2/a1;Lde2/g0;Lwd2/l;Lae2/e0;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements p1, o53.b0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f70632t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd2.a1 f70634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de2.g0 f70635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wd2.l f70636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ae2.e0 f70637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o53.m1 f70638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f70639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f70640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f70641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x1 f70642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f70643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DateTime f70644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<v1> f70645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Map<wd2.f2, ? extends List<wd2.d2>> f70646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DateTime f70647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f70648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f70649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f70650r;

    /* JADX INFO: renamed from: fe2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession$onDeviceConnected$1", f = "ClassicSession.kt", l = {168}, m = "invokeSuspend", v = 2)
    public static final class C1449b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70651a;

        public C1449b(t13.d<? super C1449b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C1449b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1449b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70651a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f70651a = 1;
                int i15 = b.f70632t;
                if (b.this.w(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession$onDeviceDisconnected$1", f = "ClassicSession.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70653a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70653a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f70653a = 1;
                if (b.s(b.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession$onDeviceServiceChanged$1", f = "ClassicSession.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70655a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70655a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f70655a = 1;
                int i15 = b.f70632t;
                if (b.this.x(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b(long j8, xd2.a1 a1Var, de2.g0 g0Var, wd2.l lVar, ae2.e0 e0Var) throws Throwable {
        a1Var.getClass();
        g0Var.getClass();
        lVar.getClass();
        e0Var.getClass();
        this.f70633a = j8;
        this.f70634b = a1Var;
        this.f70635c = g0Var;
        this.f70636d = lVar;
        this.f70637e = e0Var;
        String identifier = e0Var.getIdentifier();
        if (identifier == null || identifier.length() == 0) {
            ge1.b.W(t13.h.f161748a, new fe2.d(this, null));
        }
        this.f70638f = g8.i.c();
        this.f70639g = i2.a("ClassicSession");
        this.f70640h = o13.m.b(new fe2.a(this, 0));
        this.f70645m = p13.j0.f134944a;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f70646n = k0Var;
        this.f70650r = lVar.f().g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object s(b bVar, v13.c cVar) {
        m mVar;
        long j8 = bVar.f70633a;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f70842c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f70842c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(bVar, cVar);
            }
        } else {
            mVar = new m(bVar, cVar);
        }
        Object obj = mVar.f70840a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f70842c;
        if (i15 == 0) {
            o13.r.b(obj);
            de2.g0 g0Var = bVar.f70635c;
            mVar.f70842c = 1;
            if (g0Var.g(j8) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        wr.g.w("Stopped download for device ", j8, bVar.f70639g);
        return Unit.INSTANCE;
    }

    @Override // fe2.p1
    public final boolean a() {
        boolean z14 = this.f70648p;
        Logger logger = this.f70639g;
        wr.g.y("Device connected session isCreated: ", z14, logger);
        if (this.f70648p) {
            DateTime dateTime = this.f70644l;
            if (dateTime != null && dateTime.isAfterNow()) {
                ge1.b.T(this, null, null, new C1449b(null), 3);
                return true;
            }
            logger.warn("sessionsEndDate is after now");
        }
        return false;
    }

    @Override // fe2.p1
    public final void b() {
        this.f70643k = true;
    }

    @Override // fe2.p1
    public final void c() {
        ge1.b.T(this, null, null, new d(null), 3);
    }

    @Override // fe2.p1
    public final Object d(boolean z14, wd2.b1 b1Var) {
        return this.f70634b.s(this.f70637e, this.f70633a, z14, b1Var);
    }

    @Override // fe2.p1
    public final Object e(String str, t13.d<? super xd2.g1<Unit>> dVar) {
        str.getClass();
        this.f70650r = str;
        ae2.e0 e0Var = this.f70637e;
        return this.f70634b.l(this.f70633a, e0Var, str, (v13.c) dVar);
    }

    @Override // fe2.p1
    public final Object f(int i14, long j8, String str, wd2.j jVar, wd2.r0 r0Var) {
        Object objD = ((j1) this.f70640h.getValue()).d(i14, j8, str, t(), jVar, r0Var);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe2.p1
    public final Object g(com.garmin.android.library.livetrack.i iVar, v13.c cVar) {
        i iVar2;
        if (cVar instanceof i) {
            iVar2 = (i) cVar;
            int i14 = iVar2.f70774c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar2.f70774c = i14 - Integer.MIN_VALUE;
            } else {
                iVar2 = new i(this, cVar);
            }
        } else {
            iVar2 = new i(this, cVar);
        }
        Object obj = iVar2.f70772a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f70774c;
        if (i15 == 0) {
            o13.r.b(obj);
            o53.c2 c2VarT = ge1.b.T(this, null, null, new k(this, null), 3);
            iVar2.f70774c = 1;
            if (c2VarT.P(iVar2) != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.j0 j0VarJ = ge1.b.j(this, null, null, new l(this, null), 3);
        iVar2.f70774c = 2;
        Object objC = j0VarJ.C(iVar2);
        return objC == aVar ? aVar : objC;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f70638f);
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getDeviceUnitId, reason: from getter */
    public final long getF70633a() {
        return this.f70633a;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF70650r() {
        return this.f70650r;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getPublisher, reason: from getter */
    public final ae2.e0 getF70637e() {
        return this.f70637e;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final DateTime getF70647o() {
        return this.f70647o;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e3 A[PHI: r1
      0x00e3: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:25:0x00df, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fb A[PHI: r3
      0x00fb: PHI (r3v13 fe2.u1) = (r3v9 fe2.u1), (r3v15 fe2.u1) binds: [B:30:0x00f7, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:46:0x0139 A[LOOP:0: B:44:0x0133->B:46:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x016b  */
    /* JADX WARN: Code duplicated, block: B:54:0x017e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x0189  */
    /* JADX WARN: Code duplicated, block: B:60:0x018c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // fe2.p1
    public final Object h(com.garmin.android.library.livetrack.i iVar, v13.c cVar) {
        e eVar;
        boolean z14;
        ae2.e0 e0Var;
        boolean zI;
        boolean zH;
        u1 u1Var;
        u1.b bVar;
        List<t1> list;
        com.garmin.android.library.livetrack.c cVarA;
        t1 t1Var;
        ae2.o oVar;
        List<t1> list2;
        ArrayList arrayList;
        Object objV;
        u1 u1Var2;
        ArrayList<t1> arrayList2;
        ae2.o.a aVar;
        ArrayList arrayList3;
        u1 u1Var3;
        Object objU;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f70711i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f70711i = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar2 = eVar;
        Object objA = eVar2.f70709g;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f70711i;
        long j8 = this.f70633a;
        switch (i15) {
            case 0:
                o13.r.b(objA);
                wr.g.w("Start session attempt for ", j8, this.f70639g);
                z14 = iVar instanceof com.garmin.android.library.livetrack.i.b;
                this.f70649q = z14;
                e0Var = this.f70637e;
                wd2.l lVar = this.f70636d;
                zI = lVar.a().i(j8);
                zH = lVar.f().h(j8);
                c6 c6VarD = lVar.d();
                eVar2.f70703a = e0Var;
                eVar2.f70706d = z14;
                eVar2.f70707e = zI;
                eVar2.f70708f = zH;
                eVar2.f70711i = 1;
                objA = c6VarD.a(true, eVar2);
                if (objA != obj) {
                    n nVar = new n(this.f70633a, this.f70650r, new r1(e0Var, z14, false, zI, zH, (wd2.g2) objA), this.f70634b, this.f70635c);
                    eVar2.f70703a = null;
                    eVar2.f70711i = 2;
                    objA = nVar.a(eVar2);
                    if (objA != obj) {
                        u1Var = (u1) objA;
                        if (!(u1Var instanceof u1.a)) {
                            if (!(u1Var instanceof u1.b)) {
                                lc.u0.r();
                                return null;
                            }
                            bVar = (u1.b) u1Var;
                            if (this.f70643k) {
                                cVarA = com.garmin.android.library.livetrack.c.i.f50194a;
                            } else {
                                list = bVar.f70952a;
                                if (list != null || (t1Var = (t1) p13.h0.d0(list)) == null || (oVar = t1Var.f70934a) == null || (cVarA = q1.a(oVar)) == null) {
                                    cVarA = com.garmin.android.library.livetrack.c.j.f50195a;
                                }
                            }
                            return new com.garmin.android.library.livetrack.d.a(j8, cVarA);
                        }
                        this.f70648p = true;
                        eVar2.f70703a = null;
                        eVar2.f70704b = u1Var;
                        eVar2.f70711i = 3;
                        if (x(eVar2) != obj) {
                            list2 = u1Var.f70952a;
                            if (list2 != null) {
                                arrayList = new ArrayList(list2);
                            } else {
                                arrayList = new ArrayList();
                            }
                            eVar2.f70703a = null;
                            eVar2.f70704b = u1Var;
                            eVar2.f70705c = arrayList;
                            eVar2.f70711i = 4;
                            objV = v(eVar2);
                            if (objV != obj) {
                                u1Var2 = u1Var;
                                arrayList2 = arrayList;
                                objA = objV;
                                aVar = (ae2.o.a) objA;
                                if (aVar != null) {
                                    arrayList2.add(new t1(aVar, null, 2, null));
                                }
                                arrayList3 = new ArrayList();
                                for (t1 t1Var2 : arrayList2) {
                                    t1Var2.getClass();
                                    ae2.o oVar2 = t1Var2.f70934a;
                                    arrayList3.add(new be2.g.a(oVar2.f2948a, oVar2.f2949b, t1Var2.f70935b));
                                }
                                eVar2.f70703a = null;
                                eVar2.f70704b = u1Var2;
                                eVar2.f70705c = null;
                                eVar2.f70711i = 5;
                                if (xd2.a1.m(this.f70634b, this.f70633a, null, null, arrayList3, eVar2, 14) != obj) {
                                    u1Var3 = u1Var2;
                                    eVar2.f70703a = null;
                                    eVar2.f70704b = null;
                                    eVar2.f70705c = null;
                                    eVar2.f70711i = 6;
                                    objU = u((u1.a) u1Var3, eVar2);
                                    if (objU != obj) {
                                        return objU;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                zH = eVar2.f70708f;
                zI = eVar2.f70707e;
                z14 = eVar2.f70706d;
                e0Var = eVar2.f70703a;
                o13.r.b(objA);
                n nVar2 = new n(this.f70633a, this.f70650r, new r1(e0Var, z14, false, zI, zH, (wd2.g2) objA), this.f70634b, this.f70635c);
                eVar2.f70703a = null;
                eVar2.f70711i = 2;
                objA = nVar2.a(eVar2);
                if (objA != obj) {
                    u1Var = (u1) objA;
                    if (!(u1Var instanceof u1.a)) {
                        if (!(u1Var instanceof u1.b)) {
                            lc.u0.r();
                            return null;
                        }
                        bVar = (u1.b) u1Var;
                        if (this.f70643k) {
                            cVarA = com.garmin.android.library.livetrack.c.i.f50194a;
                        } else {
                            list = bVar.f70952a;
                            if (list != null) {
                                cVarA = com.garmin.android.library.livetrack.c.j.f50195a;
                            } else {
                                cVarA = com.garmin.android.library.livetrack.c.j.f50195a;
                            }
                        }
                        return new com.garmin.android.library.livetrack.d.a(j8, cVarA);
                    }
                    this.f70648p = true;
                    eVar2.f70703a = null;
                    eVar2.f70704b = u1Var;
                    eVar2.f70711i = 3;
                    if (x(eVar2) != obj) {
                        list2 = u1Var.f70952a;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2);
                        } else {
                            arrayList = new ArrayList();
                        }
                        eVar2.f70703a = null;
                        eVar2.f70704b = u1Var;
                        eVar2.f70705c = arrayList;
                        eVar2.f70711i = 4;
                        objV = v(eVar2);
                        if (objV != obj) {
                            u1Var2 = u1Var;
                            arrayList2 = arrayList;
                            objA = objV;
                            aVar = (ae2.o.a) objA;
                            if (aVar != null) {
                                arrayList2.add(new t1(aVar, null, 2, null));
                            }
                            arrayList3 = new ArrayList();
                            while (r1.hasNext()) {
                                t1Var2.getClass();
                                ae2.o oVar3 = t1Var2.f70934a;
                                arrayList3.add(new be2.g.a(oVar3.f2948a, oVar3.f2949b, t1Var2.f70935b));
                            }
                            eVar2.f70703a = null;
                            eVar2.f70704b = u1Var2;
                            eVar2.f70705c = null;
                            eVar2.f70711i = 5;
                            if (xd2.a1.m(this.f70634b, this.f70633a, null, null, arrayList3, eVar2, 14) != obj) {
                                u1Var3 = u1Var2;
                                eVar2.f70703a = null;
                                eVar2.f70704b = null;
                                eVar2.f70705c = null;
                                eVar2.f70711i = 6;
                                objU = u((u1.a) u1Var3, eVar2);
                                if (objU != obj) {
                                    return objU;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                o13.r.b(objA);
                u1Var = (u1) objA;
                if (!(u1Var instanceof u1.a)) {
                    if (!(u1Var instanceof u1.b)) {
                        lc.u0.r();
                        return null;
                    }
                    bVar = (u1.b) u1Var;
                    if (this.f70643k) {
                        cVarA = com.garmin.android.library.livetrack.c.i.f50194a;
                    } else {
                        list = bVar.f70952a;
                        if (list != null) {
                            cVarA = com.garmin.android.library.livetrack.c.j.f50195a;
                        } else {
                            cVarA = com.garmin.android.library.livetrack.c.j.f50195a;
                        }
                    }
                    return new com.garmin.android.library.livetrack.d.a(j8, cVarA);
                }
                this.f70648p = true;
                eVar2.f70703a = null;
                eVar2.f70704b = u1Var;
                eVar2.f70711i = 3;
                if (x(eVar2) != obj) {
                    list2 = u1Var.f70952a;
                    if (list2 != null) {
                        arrayList = new ArrayList(list2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    eVar2.f70703a = null;
                    eVar2.f70704b = u1Var;
                    eVar2.f70705c = arrayList;
                    eVar2.f70711i = 4;
                    objV = v(eVar2);
                    if (objV != obj) {
                        u1Var2 = u1Var;
                        arrayList2 = arrayList;
                        objA = objV;
                        aVar = (ae2.o.a) objA;
                        if (aVar != null) {
                            arrayList2.add(new t1(aVar, null, 2, null));
                        }
                        arrayList3 = new ArrayList();
                        while (r1.hasNext()) {
                            t1Var2.getClass();
                            ae2.o oVar4 = t1Var2.f70934a;
                            arrayList3.add(new be2.g.a(oVar4.f2948a, oVar4.f2949b, t1Var2.f70935b));
                        }
                        eVar2.f70703a = null;
                        eVar2.f70704b = u1Var2;
                        eVar2.f70705c = null;
                        eVar2.f70711i = 5;
                        if (xd2.a1.m(this.f70634b, this.f70633a, null, null, arrayList3, eVar2, 14) != obj) {
                            u1Var3 = u1Var2;
                            eVar2.f70703a = null;
                            eVar2.f70704b = null;
                            eVar2.f70705c = null;
                            eVar2.f70711i = 6;
                            objU = u((u1.a) u1Var3, eVar2);
                            if (objU != obj) {
                                return objU;
                            }
                        }
                    }
                }
                return obj;
            case 3:
                u1Var = eVar2.f70704b;
                o13.r.b(objA);
                list2 = u1Var.f70952a;
                if (list2 != null) {
                    arrayList = new ArrayList(list2);
                } else {
                    arrayList = new ArrayList();
                }
                eVar2.f70703a = null;
                eVar2.f70704b = u1Var;
                eVar2.f70705c = arrayList;
                eVar2.f70711i = 4;
                objV = v(eVar2);
                if (objV != obj) {
                    u1Var2 = u1Var;
                    arrayList2 = arrayList;
                    objA = objV;
                    aVar = (ae2.o.a) objA;
                    if (aVar != null) {
                        arrayList2.add(new t1(aVar, null, 2, null));
                    }
                    arrayList3 = new ArrayList();
                    while (r1.hasNext()) {
                        t1Var2.getClass();
                        ae2.o oVar5 = t1Var2.f70934a;
                        arrayList3.add(new be2.g.a(oVar5.f2948a, oVar5.f2949b, t1Var2.f70935b));
                    }
                    eVar2.f70703a = null;
                    eVar2.f70704b = u1Var2;
                    eVar2.f70705c = null;
                    eVar2.f70711i = 5;
                    if (xd2.a1.m(this.f70634b, this.f70633a, null, null, arrayList3, eVar2, 14) != obj) {
                        u1Var3 = u1Var2;
                        eVar2.f70703a = null;
                        eVar2.f70704b = null;
                        eVar2.f70705c = null;
                        eVar2.f70711i = 6;
                        objU = u((u1.a) u1Var3, eVar2);
                        if (objU != obj) {
                            return objU;
                        }
                    }
                }
                return obj;
            case 4:
                arrayList2 = eVar2.f70705c;
                u1 u1Var4 = eVar2.f70704b;
                o13.r.b(objA);
                u1Var2 = u1Var4;
                aVar = (ae2.o.a) objA;
                if (aVar != null) {
                    arrayList2.add(new t1(aVar, null, 2, null));
                }
                arrayList3 = new ArrayList();
                while (r1.hasNext()) {
                    t1Var2.getClass();
                    ae2.o oVar6 = t1Var2.f70934a;
                    arrayList3.add(new be2.g.a(oVar6.f2948a, oVar6.f2949b, t1Var2.f70935b));
                }
                eVar2.f70703a = null;
                eVar2.f70704b = u1Var2;
                eVar2.f70705c = null;
                eVar2.f70711i = 5;
                if (xd2.a1.m(this.f70634b, this.f70633a, null, null, arrayList3, eVar2, 14) != obj) {
                    u1Var3 = u1Var2;
                    eVar2.f70703a = null;
                    eVar2.f70704b = null;
                    eVar2.f70705c = null;
                    eVar2.f70711i = 6;
                    objU = u((u1.a) u1Var3, eVar2);
                    if (objU != obj) {
                        return objU;
                    }
                }
                return obj;
            case 5:
                u1Var3 = eVar2.f70704b;
                o13.r.b(objA);
                eVar2.f70703a = null;
                eVar2.f70704b = null;
                eVar2.f70705c = null;
                eVar2.f70711i = 6;
                objU = u((u1.a) u1Var3, eVar2);
                if (objU != obj) {
                    return obj;
                }
                return objU;
            case 6:
                o13.r.b(objA);
                return objA;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // fe2.p1
    public final Object i(int i14, long j8, String str, long j14, wd2.q0 q0Var) {
        Object objC = ((j1) this.f70640h.getValue()).c(i14, j8, str, t(), j14, q0Var);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: isCreated, reason: from getter */
    public final boolean getF70648p() {
        return this.f70648p;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF70649q() {
        return this.f70649q;
    }

    @Override // fe2.p1
    public final List<v1> k() {
        return this.f70645m;
    }

    @Override // fe2.p1
    /* JADX INFO: renamed from: l */
    public final boolean getF70803o() {
        return false;
    }

    @Override // fe2.p1
    public final void m() {
        if (this.f70641i != null) {
            this.f70639g.debug("Device disconnected, stopping download");
            ge1.b.T(this, null, null, new c(null), 3);
        }
    }

    @Override // fe2.p1
    public final Object n(DateTime dateTime, DateTime dateTime2, ArrayList arrayList, ArrayList arrayList2, b2 b2Var) {
        this.f70648p = true;
        this.f70644l = dateTime2;
        this.f70647o = dateTime;
        this.f70645m = arrayList;
        this.f70646n = q1.b(arrayList2);
        return w(b2Var);
    }

    @Override // fe2.p1
    public final Object o(int i14, String str, int i15, List list, Integer num, Integer num2, wd2.o0 o0Var) {
        Object objA = ((j1) this.f70640h.getValue()).a(i14, str, i15, list, num, num2, o0Var);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe2.p1
    public final Object p(v1.b bVar, v13.c cVar) {
        j jVar;
        v1 v1Var;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f70787d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f70787d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objC = jVar.f70785b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f70787d;
        if (i15 == 0) {
            o13.r.b(objC);
            if (!this.f70648p) {
                this.f70639g.warn("No sessions exist for device " + this.f70633a);
                return Unit.INSTANCE;
            }
            Iterator<v1> it = this.f70645m.iterator();
            while (true) {
                if (it.hasNext()) {
                    v1 next = it.next();
                    v1.b bVar2 = next.f70968d;
                    String str = next.f70965a;
                    if (p005kotlin.jvm.internal.s.g(bVar2, bVar) && str != null) {
                        q qVar = new q(this.f70633a, this.f70637e, this.f70634b, this.f70635c);
                        jVar.f70784a = next;
                        jVar.f70787d = 1;
                        objC = qVar.c(str, jVar);
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
        v1Var = jVar.f70784a;
        o13.r.b(objC);
        if (((d2) objC) instanceof d2.b) {
            List<v1> list = this.f70645m;
            list.getClass();
            p005kotlin.jvm.internal.y0.b(list).remove(v1Var);
        }
        return Unit.INSTANCE;
    }

    @Override // fe2.p1
    public final Map<wd2.f2, List<wd2.d2>> q() {
        return this.f70646n;
    }

    @Override // fe2.p1
    public final Object r(int i14, String str, List list, wd2.p0 p0Var) {
        Object objB = ((j1) this.f70640h.getValue()).b(i14, str, list, p0Var);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public final String t() {
        Object next;
        Iterator<T> it = this.f70645m.iterator();
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(u1.a aVar, v13.c cVar) {
        fe2.c cVar2;
        t1 t1Var;
        Object next;
        if (cVar instanceof fe2.c) {
            cVar2 = (fe2.c) cVar;
            int i14 = cVar2.f70677c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f70677c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new fe2.c(this, cVar);
            }
        } else {
            cVar2 = new fe2.c(this, cVar);
        }
        Object objG = cVar2.f70675a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f70677c;
        if (i15 == 0) {
            o13.r.b(objG);
            StringBuilder sb3 = new StringBuilder("Session for device ");
            long j8 = this.f70633a;
            sb3.append(j8);
            sb3.append(": ");
            sb3.append(aVar);
            String string = sb3.toString();
            Logger logger = this.f70639g;
            logger.debug(string);
            if (!this.f70643k) {
                List<t1> list = aVar.f70952a;
                LinkedHashMap linkedHashMapB = q1.b(list);
                this.f70646n = linkedHashMapB;
                com.garmin.android.library.livetrack.d.c cVar3 = new com.garmin.android.library.livetrack.d.c(j8, linkedHashMapB);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((t1) next).f70934a instanceof ae2.o.a));
                    t1Var = (t1) next;
                } else {
                    t1Var = null;
                }
                if (t1Var != null) {
                    ge1.b.T(this, null, null, new k(this, null), 3);
                    logger.debug("Session not started on device " + list);
                }
                this.f70647o = aVar.f70953b;
                this.f70644l = aVar.f70954c;
                List<v1> list2 = aVar.f70955d;
                list2.getClass();
                this.f70645m = list2;
                this.f70642j = new x1(j8, this.f70637e, this.f70634b);
                return cVar3;
            }
            wr.g.v("Sessions cancelled for ", j8, ". Terminating sessions.", logger);
            cVar2.f70677c = 1;
            objG = g(com.garmin.android.library.livetrack.i.a.f50228a, cVar2);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        return (com.garmin.android.library.livetrack.d) objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object v(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f70733c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f70733c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        f fVar2 = fVar;
        Object objB = fVar2.f70731a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f70733c;
        if (i15 == 0) {
            o13.r.b(objB);
            this.f70639g.debug("Starting Livetrack on device");
            fVar2.f70733c = 1;
            objB = this.f70635c.b(this.f70633a, false, null, fVar2);
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
        de2.g0.b bVar = (de2.g0.b) objB;
        bVar.getClass();
        if (bVar instanceof de2.g0.b.d) {
            return null;
        }
        return bVar instanceof de2.g0.b.a ? ae2.o.a.b.f2951c : ae2.o.a.c.f2952c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (x(r6) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f70748c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f70748c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        g gVar2 = gVar;
        Object objB = gVar2.f70746a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar2.f70748c;
        long j8 = this.f70633a;
        if (i15 == 0) {
            o13.r.b(objB);
            gVar2.f70748c = 1;
            objB = this.f70635c.b(this.f70633a, false, null, gVar2);
            if (objB != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objB);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return new com.garmin.android.library.livetrack.d.c(j8, this.f70646n);
        de2.g0.b bVar = (de2.g0.b) objB;
        if (!(bVar instanceof de2.g0.b.d)) {
            boolean z14 = bVar instanceof de2.g0.b.a;
            Logger logger = this.f70639g;
            if (z14) {
                logger.error("Device " + j8 + " disconnected, cannot start livetrack");
                return new com.garmin.android.library.livetrack.d.a(j8, com.garmin.android.library.livetrack.c.a.f50186a);
            }
            logger.error("Failed to start livetrack on device " + j8 + ", reason " + bVar);
            return new com.garmin.android.library.livetrack.d.a(j8, com.garmin.android.library.livetrack.c.j.f50195a);
        }
        gVar2.f70748c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(v13.c cVar) {
        h hVar;
        a0 a0Var;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f70764d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f70764d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f70762b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f70764d;
        if (i15 == 0) {
            o13.r.b(obj);
            ae2.e0 e0Var = this.f70637e;
            StringBuilder sb3 = new StringBuilder("Starting data uploader for device ");
            long j8 = this.f70633a;
            sb3.append(j8);
            sb3.append(" and publisher ");
            sb3.append(e0Var);
            this.f70639g.debug(sb3.toString());
            if (this.f70641i == null) {
                this.f70641i = new a0(this.f70633a, this.f70637e, this.f70634b, this.f70636d, new fe2.a(this, 1));
            }
            a0 a0Var2 = this.f70641i;
            if (a0Var2 != null) {
                hVar.f70761a = a0Var2;
                hVar.f70764d = 1;
                de2.z zVarA = this.f70635c.a(j8);
                if (zVarA == aVar) {
                    return aVar;
                }
                a0Var = a0Var2;
                obj = zVarA;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a0Var = hVar.f70761a;
        o13.r.b(obj);
        a0Var.a((Observable) obj);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(long j8, xd2.a1 a1Var, de2.g0 g0Var, wd2.l lVar, ae2.e0 e0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, a1Var, g0Var, lVar, (i14 & 16) != 0 ? new ae2.e0(null, null, null, null, null, 31, null) : e0Var);
    }
}

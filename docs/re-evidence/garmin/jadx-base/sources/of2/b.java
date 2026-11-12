package of2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0014B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012$\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lof2/b;", "", "Lof2/b0;", "sessionData", "Lr53/o2;", "", "isRestStep", "Luf2/s;", "updateListener", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lt13/d;", "", "onSessionEnded", "Lmf2/h;", "analytics", "Lfg2/c;", "deviceProvider", "<init>", "(Lof2/b0;Lr53/o2;Luf2/s;Le23/p;Lmf2/h;Lfg2/c;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f131721p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2<Boolean> f131722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf2.s f131723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.p<? super UUID, ? super t13.d<? super Unit>, ? extends Object> f131724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mf2.h f131725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg2.c f131726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pf2.a f131727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f131728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zg2.a f131729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zg2.g f131730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u53.d f131731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u53.d f131732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f131733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f131734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReference<Boolean> f131735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f131736o;

    /* JADX INFO: renamed from: of2.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2502b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131737a;

        static {
            int[] iArr = new int[zg2.g.b.values().length];
            try {
                iArr[zg2.g.b.TIME_ALERT_5S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zg2.g.b.TIME_ALERT_30M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f131737a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$changeSportCommon$1", f = "LSVSession.kt", l = {541, 543}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f131738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f131739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sf2.a.d f131740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f131741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var, sf2.a.d dVar, b bVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f131739b = b0Var;
            this.f131740c = dVar;
            this.f131741d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f131739b, this.f131740c, this.f131741d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            if (r7 == r0) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f131738a;
            b0 b0Var = this.f131739b;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f131738a = 1;
                if (b0Var.b(this.f131740c, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            pf2.a aVar2 = this.f131741d.f131727f;
            aVar2.getClass();
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVMemoryCache", "clear");
            aVar2.f137574a.set(new ArrayList());
            aVar2.f137575b.set(p13.j0.f134944a);
            sf2.b.a aVar3 = new sf2.b.a(null, 1, null);
            this.f131738a = 2;
            Object objEmit = b0Var.f131754k.f164472d.f164473a.emit(aVar3, this);
            if (objEmit != aVar) {
                objEmit = Unit.INSTANCE;
            }
            if (objEmit != aVar) {
                objEmit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyDeviceConnected$1", f = "LSVSession.kt", l = {426}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f131742a;

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
            int i14 = this.f131742a;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = b.this;
                b0 b0Var = (b0) bVar.f131736o.getValue();
                sf2.d.b bVar2 = new sf2.d.b(((b0) bVar.f131736o.getValue()).f131744a);
                this.f131742a = 1;
                if (b0Var.c(bVar2, this) == aVar) {
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

    public b(b0 b0Var, o2<Boolean> o2Var, uf2.s sVar, e23.p<? super UUID, ? super t13.d<? super Unit>, ? extends Object> pVar, mf2.h hVar, fg2.c cVar) {
        b0Var.getClass();
        o2Var.getClass();
        sVar.getClass();
        hVar.getClass();
        cVar.getClass();
        this.f131722a = o2Var;
        this.f131723b = sVar;
        this.f131724c = pVar;
        this.f131725d = hVar;
        this.f131726e = cVar;
        this.f131727f = new pf2.a();
        this.f131730i = new zg2.g("DisconnectionTimer");
        x53.c cVar2 = o53.s0.f129406a;
        this.f131731j = o53.c0.a(x53.b.f189152a);
        this.f131732k = o53.c0.a(o53.s0.f129406a);
        w13.c cVar3 = qg2.c.f144685k;
        int iA = p13.t0.a(p13.y.r(cVar3, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            pg2.a.f137610c.getClass();
            linkedHashMap.put(next, pg2.a.f137611d);
        }
        p2 p2VarA = q2.a(linkedHashMap);
        this.f131733l = p2VarA;
        this.f131734m = r53.s.d(p2VarA);
        this.f131735n = new AtomicReference<>(Boolean.FALSE);
        this.f131736o = q2.a(b0Var);
    }

    public static final boolean a(b bVar) {
        return ((b0) bVar.f131736o.getValue()).f131747d != zf2.d.f204593g2;
    }

    public final void b(zf2.a aVar, rf2.l lVar, vf2.p pVar, zf2.h hVar, boolean z14) {
        zg2.c.f204692a.getClass();
        zg2.c.d("LSVSession", "Change sport");
        this.f131725d.f118316k.add(new o13.p(Integer.valueOf(aVar.f204564c), Integer.valueOf(aVar.f204565d)));
        p2 p2Var = this.f131736o;
        b0 b0VarA = b0.a((b0) p2Var.getValue(), aVar.f204562a, aVar.f204563b, lVar, pVar, hVar, aVar.f204568g, z14, 13543);
        p2Var.k(null, b0VarA);
        ge1.b.T(this.f131732k, null, null, new c(b0VarA, new sf2.a.d(b0VarA.f131744a, b0VarA.f131748e, b0VarA.f131757n, b0VarA.f131753j), this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(v13.c cVar) {
        of2.c cVar2;
        if (cVar instanceof of2.c) {
            cVar2 = (of2.c) cVar;
            int i14 = cVar2.f131770c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f131770c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new of2.c(this, cVar);
            }
        } else {
            cVar2 = new of2.c(this, cVar);
        }
        Object obj = cVar2.f131768a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f131770c;
        if (i15 == 0) {
            o13.r.b(obj);
            zg2.c cVar3 = zg2.c.f204692a;
            String str = "Cleaning up session " + ((b0) this.f131736o.getValue()).f131744a;
            cVar3.getClass();
            zg2.c.a("LSVSession", str);
            zg2.a aVar2 = this.f131729h;
            if (aVar2 != null) {
                cVar3.getClass();
                zg2.c.a("BatteryPercentageTimer", "Destroying battery percentage provider");
                aVar2.b();
                g8.i.s(aVar2.f204688e.f168725a);
            }
            c2 c2Var = this.f131728g;
            if (c2Var != null) {
                c2Var.c(null);
            }
            this.f131728g = null;
            cVar2.f131770c = 1;
            if (this.f131723b.b(cVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f131730i.a();
        pf2.a aVar3 = this.f131727f;
        aVar3.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LSVMemoryCache", "clear");
        aVar3.f137574a.set(new ArrayList());
        aVar3.f137575b.set(p13.j0.f134944a);
        this.f131724c = null;
        this.f131733l.k(null, new LinkedHashMap());
        return Unit.INSTANCE;
    }

    public final void d() {
        zg2.c cVar = zg2.c.f204692a;
        String str = "notifyDeviceConnected sessionUuid:" + ((b0) this.f131736o.getValue()).f131744a;
        cVar.getClass();
        zg2.c.a("LSVSession", str);
        ge1.b.T(this.f131732k, null, null, new d(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
    
        if (r12.b(r0, r2) == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rf2.e eVar, v13.c cVar) {
        o oVar;
        mf2.h hVar = this.f131725d;
        UUID uuid = hVar.f118306a;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f131884d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f131884d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f131882b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f131884d;
        p2 p2Var = this.f131736o;
        if (i15 != 0) {
            if (i15 == 1) {
                eVar = oVar.f131881a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            zg2.a aVar2 = this.f131729h;
            if (aVar2 != null) {
                zg2.c.f204692a.getClass();
                zg2.c.a("BatteryPercentageTimer", "Destroying battery percentage provider");
                aVar2.b();
                g8.i.s(aVar2.f204688e.f168725a);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(eVar, rf2.e.b.f152471b)) {
            zg2.c.f204692a.getClass();
            zg2.c.d("Analytics", "Session " + uuid + " was discarded");
            hVar.f118310e = Long.valueOf(System.currentTimeMillis());
            hVar.f118309d = "Discarded";
        } else if (p005kotlin.jvm.internal.s.g(eVar, rf2.e.d.f152473b)) {
            zg2.c.f204692a.getClass();
            zg2.c.d("Analytics", "Session " + uuid + " was saved");
            hVar.f118310e = Long.valueOf(System.currentTimeMillis());
            hVar.f118309d = "Saved";
        } else if (p005kotlin.jvm.internal.s.g(eVar, rf2.e.C2869e.f152474b)) {
            zg2.c.f204692a.getClass();
            zg2.c.d("Analytics", "Session " + uuid + " was timed-out");
            hVar.f118310e = Long.valueOf(System.currentTimeMillis());
            hVar.f118309d = "Timeout";
        } else {
            if (!(eVar instanceof rf2.e.c)) {
                lc.u0.r();
                return null;
            }
            zg2.c.f204692a.getClass();
            zg2.c.d("Analytics", "Session " + uuid + " ended with error");
            hVar.f118310e = Long.valueOf(System.currentTimeMillis());
            hVar.f118309d = "Error";
        }
        b0 b0Var = (b0) p2Var.getValue();
        sf2.d.C3004d c3004d = new sf2.d.C3004d(((b0) p2Var.getValue()).f131744a, eVar);
        oVar.f131881a = eVar;
        oVar.f131884d = 1;
        if (b0Var.c(c3004d, oVar) != aVar) {
        }
        return aVar;
        b0 b0Var2 = (b0) p2Var.getValue();
        sf2.a.C3001a c3001a = new sf2.a.C3001a(((b0) p2Var.getValue()).f131744a, eVar);
        oVar.f131881a = null;
        oVar.f131884d = 2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lof2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

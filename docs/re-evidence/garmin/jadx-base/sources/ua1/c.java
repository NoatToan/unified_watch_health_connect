package ua1;

import ab1.q;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sa1.a0;
import va1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lua1/c;", "Landroidx/lifecycle/u1;", "", "courseId", "", "eventName", "<init>", "(JLjava/lang/String;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa1.c f169607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f169608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa1.j f169609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<o> f169610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<o> f169611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<va1.c> f169612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f169613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<Integer> f169614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<sa1.g> f169615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ab1.l f169616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<g3<Unit>> f169617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<ab1.g> f169618n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$saveCyclingAbility$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {214, 216, 220, 223, 228}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f169620b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sa1.a f169622d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sa1.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f169622d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(this.f169622d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        /* JADX WARN: Code duplicated, block: B:30:0x006f  */
        /* JADX WARN: Code duplicated, block: B:32:0x007f  */
        /* JADX WARN: Code duplicated, block: B:35:0x008a  */
        /* JADX WARN: Code duplicated, block: B:37:0x008e  */
        /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
        
            if (r7.C4(null, r9) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        
            if (r7.C4(r10, r9) == r0) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            int i14;
            int i15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f169620b;
            c cVar = c.this;
            if (i16 == 0) {
                r.b(obj);
                this.f169620b = 1;
                if (c.x4(cVar, this) != aVar) {
                }
                return aVar;
            }
            if (i16 == 1) {
                r.b(obj);
            } else if (i16 == 2) {
                r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    i14 = ((PowerZonesDTO) ((v2.b) v2Var).f47386a).f43987b;
                    if (i14 > 0) {
                        this.f169619a = i14;
                        this.f169620b = 3;
                        if (c.y4(cVar, this) != aVar) {
                            i15 = i14;
                            cVar.f169614j.j(Integer.valueOf(i15));
                            cVar.z4(o.SELECT_RIDING_POSITION);
                        }
                    } else {
                        this.f169619a = i14;
                        this.f169620b = 4;
                    }
                    return aVar;
                }
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String string = ((v2.a) v2Var).f47383a.toString();
                this.f169620b = 5;
            } else if (i16 == 3) {
                i15 = this.f169619a;
                r.b(obj);
                cVar.f169614j.j(Integer.valueOf(i15));
                cVar.z4(o.SELECT_RIDING_POSITION);
            } else {
                if (i16 != 4 && i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            sa1.c cVar2 = cVar.f169607c;
            this.f169620b = 2;
            cVar2.getClass();
            obj = f0.J(cVar2, new sa1.e(cVar2, this.f169622d, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    i14 = ((PowerZonesDTO) ((v2.b) v2Var).f47386a).f43987b;
                    if (i14 > 0) {
                        this.f169619a = i14;
                        this.f169620b = 3;
                        if (c.y4(cVar, this) != aVar) {
                            i15 = i14;
                            cVar.f169614j.j(Integer.valueOf(i15));
                            cVar.z4(o.SELECT_RIDING_POSITION);
                            return Unit.INSTANCE;
                        }
                    } else {
                        this.f169619a = i14;
                        this.f169620b = 4;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String string2 = ((v2.a) v2Var).f47383a.toString();
                    this.f169620b = 5;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$setGender$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {242, 244, 250, 258}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sa1.g f169623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f169624b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ab1.r f169626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f169627e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ab1.r rVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f169626d = rVar;
            this.f169627e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f169626d, this.f169627e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0057  */
        /* JADX WARN: Code duplicated, block: B:33:0x009b  */
        /* JADX WARN: Code duplicated, block: B:35:0x009f  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        
            if (r7.C4(r9, r8) == r0) goto L37;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            sa1.g gVarD;
            sa1.g gVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169624b;
            c cVar = c.this;
            if (i14 == 0) {
                r.b(obj);
                this.f169624b = 1;
                if (c.x4(cVar, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().R(this.f169627e);
                    gVarD = cVar.f169615k.d();
                    if (gVarD == null && gVarD != sa1.g.CUSTOM) {
                        this.f169623a = gVarD;
                        this.f169624b = 3;
                        if (c.y4(cVar, this) != aVar) {
                            gVar = gVarD;
                            f12.l.f68084a.getClass();
                            cVar.A4(gVar, f12.l.a.a().w());
                        }
                        return aVar;
                    }
                    o oVar = o.SELECT_ABILITY;
                    y0<o> y0Var = cVar.f169611g;
                    y0Var.m(oVar);
                    y0Var.m(null);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String string = ((v2.a) v2Var).f47383a.toString();
                    this.f169624b = 4;
                }
            } else if (i14 == 3) {
                gVar = this.f169623a;
                r.b(obj);
                f12.l.f68084a.getClass();
                cVar.A4(gVar, f12.l.a.a().w());
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            a0 a0Var = cVar.f169608d;
            this.f169624b = 2;
            a0Var.getClass();
            obj = f0.J(a0Var, new sa1.b0(a0Var, this.f169626d, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().R(this.f169627e);
                    gVarD = cVar.f169615k.d();
                    if (gVarD == null) {
                    }
                    o oVar2 = o.SELECT_ABILITY;
                    y0<o> y0Var2 = cVar.f169611g;
                    y0Var2.m(oVar2);
                    y0Var2.m(null);
                    return Unit.INSTANCE;
                }
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String string2 = ((v2.a) v2Var).f47383a.toString();
                this.f169624b = 4;
            }
            return aVar;
        }
    }

    public c(long j8, String str) {
        this.f169605a = j8;
        this.f169606b = str;
        sa1.c.a aVar = sa1.c.f158261b;
        sa1.b bVar = (sa1.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, sa1.b.class, new c83.h.a[0], null, null, null, 120);
        aVar.getClass();
        bVar.getClass();
        this.f169607c = new sa1.c(bVar);
        this.f169608d = a0.a.a(a0.f158256b);
        this.f169609e = (sa1.j) KoinJavaComponent.get$default(sa1.j.class, null, null, 6, null);
        this.f169610f = new y0<>();
        this.f169611g = new y0<>();
        this.f169612h = new y0<>();
        this.f169613i = 200;
        this.f169614j = new y0<>();
        this.f169615k = new y0<>();
        this.f169617m = new y0<>();
        this.f169618n = new y0<>();
        f12.l.f68084a.getClass();
        if (f12.l.a.a().v3() > 0.0d) {
            z4(o.SELECT_BIKE_WEIGHT);
        } else {
            z4(o.ADD_RIDER_WEIGHT);
        }
    }

    public static final Object x4(c cVar, v13.i iVar) throws Throwable {
        cVar.getClass();
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(u53.o.f168762a, new e(cVar, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public static final Object y4(c cVar, v13.i iVar) throws Throwable {
        cVar.getClass();
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(u53.o.f168762a, new f(cVar, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final void A4(sa1.g gVar, String str) {
        f12.l.f68084a.getClass();
        sa1.a aVar = new sa1.a(str, f12.l.a.a().v3() * ((double) 1000), gVar.f158276a);
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new a(aVar, null), 2);
    }

    public final void B4(String str) {
        ab1.r rVar = new ab1.r(new q(str, null, 2, null));
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new b(rVar, str, null), 2);
    }

    public final Object C4(String str, v13.i iVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(u53.o.f168762a, new d(this, str, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final void z4(o oVar) {
        this.f169610f.j(oVar);
    }
}

package w70;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import j70.v;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.j;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import vb.h;
import zd0.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw70/g;", "Landroidx/lifecycle/u1;", "Ll70/c;", "dashboardRepository", "Lzd0/a0;", "isPrimaryDeviceScreenlessUseCase", "<init>", "(Ll70/c;Lzd0/a0;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f183488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f183489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f183490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f183491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f183492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f183493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2 f183494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f183495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<? extends o70.f> f183496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f183497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f183498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f183499l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj70/f;", "config", "", "<anonymous>", "(Lj70/f;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsViewModel$1", f = "HomeSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j70.f, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f183500a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f183500a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(j70.f fVar, t13.d<? super Unit> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j70.f fVar = (j70.f) this.f183500a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            List<v> listD = fVar.d();
            if (listD == null) {
                listD = j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (v vVar : listD) {
                o70.f.a aVar2 = o70.f.f129966c;
                String sectionType = vVar.getSectionType();
                aVar2.getClass();
                o70.f fVarC = o70.f.a.c(sectionType);
                if (fVarC != null) {
                    arrayList.add(fVarC);
                }
            }
            g gVar = g.this;
            gVar.f183496i = arrayList;
            p2 p2Var = gVar.f183497j;
            boolean zIsEmpty = arrayList.isEmpty();
            List listA = arrayList;
            if (zIsEmpty) {
                o70.f.f129966c.getClass();
                listA = o70.f.a.a();
            }
            p2Var.setValue(listA);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsViewModel$allowEssentialsSelection$1", f = "HomeSettingsViewModel.kt", l = {45, 45}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f183502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f183503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f183504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f183505d;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = g.this.new b(dVar);
            bVar.f183505d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L23;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zI0;
            boolean z14;
            j jVar = (j) this.f183505d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183504c;
            boolean z15 = true;
            if (i14 != 0) {
                if (i14 == 1) {
                    boolean z16 = this.f183503b;
                    j jVar2 = this.f183502a;
                    r.b(obj);
                    z14 = z16;
                    jVar = jVar2;
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            bv.b.f21239a.getClass();
            bv.b.a();
            zI0 = k1.f37122a.I0();
            if (zI0) {
                a0 a0Var = g.this.f183489b;
                this.f183505d = null;
                this.f183502a = jVar;
                this.f183503b = zI0;
                this.f183504c = 1;
                Object objA = a0Var.a(this);
                if (objA != aVar) {
                    z14 = zI0;
                    obj = objA;
                }
            } else {
                z15 = false;
                z14 = zI0;
                Boolean boolValueOf = Boolean.valueOf(z15);
                this.f183505d = null;
                this.f183502a = null;
                this.f183503b = z14;
                this.f183504c = 2;
            }
            return aVar;
            if (!((Boolean) obj).booleanValue()) {
                zI0 = z14;
                z15 = false;
                z14 = zI0;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z15);
            this.f183505d = null;
            this.f183502a = null;
            this.f183503b = z14;
            this.f183504c = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsViewModel$saveSections$1", f = "HomeSettingsViewModel.kt", l = {94, 98, 101}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183507a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f183509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f183509c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new c(this.f183509c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r2.emit(r0, r13) == r8) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r2.emit(r0, r13) == r8) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objV0;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183507a;
            g gVar = g.this;
            if (i14 == 0) {
                r.b(obj);
                List list = (List) gVar.f183497j.getValue();
                gVar.f183490c.k(null, Boolean.TRUE);
                l70.c cVar = gVar.f183488a;
                this.f183507a = 1;
                objV0 = l70.c.V0(cVar, null, list, null, null, null, this, 29);
                if (objV0 != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                objV0 = obj;
            } else {
                if (i14 != 2 && i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            p2 p2Var = gVar.f183490c;
            e2 e2Var = gVar.f183494g;
            p2Var.k(null, Boolean.FALSE);
            boolean z14 = ((v2) objV0) instanceof v2.b;
            boolean z15 = this.f183509c;
            if (z14) {
                if (z15) {
                    fw.p pVar = fw.p.SUCCESS;
                    this.f183507a = 2;
                }
                return Unit.INSTANCE;
            }
            if (z15) {
                fw.p pVar2 = fw.p.ERROR;
                this.f183507a = 3;
            }
            return Unit.INSTANCE;
        }
    }

    public g(l70.c cVar, a0 a0Var) {
        cVar.getClass();
        a0Var.getClass();
        this.f183488a = cVar;
        this.f183489b = a0Var;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA = q2.a(bool);
        this.f183490c = p2VarA;
        this.f183491d = p2VarA;
        p2 p2VarA2 = q2.a(bool);
        this.f183492e = p2VarA2;
        this.f183493f = p2VarA2;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f183494g = e2VarB;
        this.f183495h = e2VarB;
        j0 j0Var = j0.f134944a;
        this.f183496i = j0Var;
        p2 p2VarA3 = q2.a(j0Var);
        this.f183497j = p2VarA3;
        this.f183498k = s.K(new c2(new b(null)), v1.a(this), k2.a.a(k2.f150703a, 2), bool);
        this.f183499l = p2VarA3;
        s.C(new m1(cVar.p(), new a(null)), v1.a(this));
    }

    public static void x4(boolean z14, o70.f fVar) {
        lt.e.a aVar = z14 ? lt.e.a.ToggleOn : lt.e.a.ToggleOff;
        if (fVar == o70.f.YESTERDAY) {
            ht.s sVar = ht.s.f85508a;
            lt.e.o oVar = new lt.e.o(aVar);
            sVar.getClass();
            ht.s.a(oVar);
        }
        if (fVar == o70.f.LAST_SEVEN_DAYS) {
            ht.s sVar2 = ht.s.f85508a;
            lt.e.h hVar = new lt.e.h(aVar);
            sVar2.getClass();
            ht.s.a(hVar);
        }
    }

    public final void y4(boolean z14) {
        ge1.b.T(v1.a(this), null, null, new c(z14, null), 3);
    }
}

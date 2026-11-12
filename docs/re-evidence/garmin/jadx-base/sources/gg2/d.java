package gg2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.service.LiveActivitySessionServiceLifecycleCoordinator$start$1", f = "LiveActivitySessionServiceLifecycleCoordinator.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f77402b;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "sessionActive", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.service.LiveActivitySessionServiceLifecycleCoordinator$start$1$1", f = "LiveActivitySessionServiceLifecycleCoordinator.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f77403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f77404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f77405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f77406d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f77406d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f77406d, dVar);
            aVar.f77405c = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Long l14;
            Long l15;
            p2 p2Var;
            of2.b0 b0Var;
            rs2.c cVar;
            boolean z14 = this.f77405c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f77404b;
            c cVar2 = this.f77406d;
            boolean z15 = true;
            if (i14 == 0) {
                r.b(obj);
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivitySessionServiceLifecycleCoordinator", "Session active: " + z14);
                if (z14) {
                    of2.b bVar = (of2.b) cVar2.f77398a.f131778g.getValue();
                    l14 = (bVar == null || (p2Var = bVar.f131736o) == null || (b0Var = (of2.b0) p2Var.getValue()) == null || (cVar = b0Var.f131745b) == null) ? null : new Long(cVar.getF92746j());
                    if (l14 != null) {
                        fg2.c cVar3 = cVar2.f77400c;
                        long jLongValue = l14.longValue();
                        this.f77403a = l14;
                        this.f77405c = z14;
                        this.f77404b = 1;
                        Object objH = cVar3.h(jLongValue, this);
                        if (objH == aVar) {
                            return aVar;
                        }
                        l15 = l14;
                        obj = objH;
                    } else {
                        z15 = false;
                        l15 = l14;
                    }
                    zg2.c.f204692a.getClass();
                    zg2.c.a("LiveActivitySessionServiceLifecycleCoordinator", "Session service for device[" + l15 + "] supported: " + z15);
                    if (z15) {
                        cVar2.f77399b.a();
                    }
                } else {
                    cVar2.f77399b.b();
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l15 = this.f77403a;
            r.b(obj);
            if (((Boolean) obj).booleanValue()) {
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivitySessionServiceLifecycleCoordinator", "Session service for device[" + l15 + "] supported: " + z15);
                if (z15) {
                    cVar2.f77399b.a();
                }
            } else {
                l14 = l15;
                z15 = false;
                l15 = l14;
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivitySessionServiceLifecycleCoordinator", "Session service for device[" + l15 + "] supported: " + z15);
                if (z15) {
                    cVar2.f77399b.a();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f77402b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f77402b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77401a;
        if (i14 == 0) {
            r.b(obj);
            c cVar = this.f77402b;
            p2 p2Var = cVar.f77398a.f131784m;
            a aVar2 = new a(cVar, null);
            this.f77401a = 1;
            if (s.k(p2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

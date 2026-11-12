package c70;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import j61.j;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc70/i;", "Landroidx/lifecycle/u1;", "Ly60/a;", "repository", "Lzf0/d;", "eventRepo", "Lax1/i;", "trainingPlanRepo", "<init>", "(Ly60/a;Lzf0/d;Lax1/i;)V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y60.a f25232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf0.d f25233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ax1.i f25234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f25235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u82.a f25236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u82.a f25237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a f25238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f25239h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "<unused var>", "Lb70/h;", "<anonymous>", "(Lo82/a;)Lb70/h;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsViewModel$currentReportsDataState$1", f = "CyclingAbilityReportsViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o82.a, t13.d<? super b70.h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25240a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super b70.h> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f25240a;
            if (i14 == 0) {
                r.b(obj);
                i iVar = i.this;
                b70.g gVar = new b70.g(iVar.f25232a, iVar.f25233b, iVar.f25234c);
                this.f25240a = 1;
                obj = gVar.f(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    return null;
                }
                return (b70.h) bVar.f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lk61/b;", "<anonymous>", "(Lo82/a;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsViewModel$dailyReportsDataState$1", f = "CyclingAbilityReportsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super k61.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25243b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = i.this.new b(dVar);
            bVar.f25243b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super k61.b> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f25243b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f25242a;
            if (i14 == 0) {
                r.b(obj);
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                y60.a aVar3 = i.this.f25232a;
                j61.h hVar = j61.h.DAILY;
                this.f25243b = null;
                this.f25242a = 1;
                obj = aVar3.a(cVarA, cVarA2, hVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    return null;
                }
                return i61.a.a((j) bVar.f47386a, null, null);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lk61/b;", "<anonymous>", "(Lo82/a;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsViewModel$monthlyReportsDataState$1", f = "CyclingAbilityReportsViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super k61.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25246b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(dVar);
            cVar.f25246b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super k61.b> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f25246b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f25245a;
            if (i14 == 0) {
                r.b(obj);
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                y60.a aVar3 = i.this.f25232a;
                j61.h hVar = j61.h.MONTHLY;
                this.f25246b = null;
                this.f25245a = 1;
                obj = aVar3.a(cVarA, cVarA2, hVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    return null;
                }
                return i61.a.a((j) bVar.f47386a, null, null);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lk61/b;", "<anonymous>", "(Lo82/a;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsViewModel$weeklyReportsDataState$1", f = "CyclingAbilityReportsViewModel.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super k61.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25249b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = i.this.new d(dVar);
            dVar2.f25249b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super k61.b> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f25249b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f25248a;
            if (i14 == 0) {
                r.b(obj);
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                y60.a aVar3 = i.this.f25232a;
                j61.h hVar = j61.h.WEEKLY;
                this.f25249b = null;
                this.f25248a = 1;
                obj = aVar3.a(cVarA, cVarA2, hVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    return null;
                }
                return i61.a.a((j) bVar.f47386a, null, null);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    public i(y60.a aVar, zf0.d dVar, ax1.i iVar) {
        aVar.getClass();
        dVar.getClass();
        iVar.getClass();
        this.f25232a = aVar;
        this.f25233b = dVar;
        this.f25234c = iVar;
        this.f25235d = s.d(q2.a(new h(null, null, 3, null)));
        this.f25236e = new u82.a(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, 4, null);
        this.f25237f = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
        this.f25238g = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f25239h = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
    }
}

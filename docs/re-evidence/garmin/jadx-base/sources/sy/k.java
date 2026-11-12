package sy;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsy/k;", "Landroidx/lifecycle/u1;", "Loy/a;", "caloriesRepo", "<init>", "(Loy/a;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f161180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u82.a f161181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u82.a f161182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u82.a f161183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sy.b f161184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f161185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f161186g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lny/b;", "<anonymous>", "(Lo82/a;)Lny/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsViewModel$dailyReportsState$1", f = "CaloriesReportsViewModel.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o82.a, t13.d<? super ny.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161188b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = k.this.new a(dVar);
            aVar.f161188b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ny.b> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f161188b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161187a;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                oy.a aVar3 = k.this.f161180a;
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                this.f161188b = null;
                this.f161187a = 1;
                obj = aVar3.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, this);
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
                ny.b bVar = (ny.b) ((v2.b) v2Var).f47386a;
                return bVar == null ? new ny.b(null, null, 3, null) : bVar;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lny/c;", "<anonymous>", "(Lo82/a;)Lny/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsViewModel$oneDayReportState$1", f = "CaloriesReportsViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super ny.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161191b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = k.this.new b(dVar);
            bVar.f161191b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ny.c> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            List<ny.c> listD;
            ny.c cVar;
            o82.a aVar = (o82.a) this.f161191b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161190a;
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                oy.a aVar3 = k.this.f161180a;
                dateTimeAtStartOfDay.getClass();
                this.f161191b = null;
                this.f161190a = 1;
                obj = aVar3.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay, this);
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
                ny.b bVar = (ny.b) ((v2.b) v2Var).f47386a;
                return (bVar == null || (listD = bVar.d()) == null || (cVar = (ny.c) h0.b0(listD)) == null) ? new ny.c(str, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0) : cVar;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lny/d;", "<anonymous>", "(Lo82/a;)Lny/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsViewModel$weeklyReportsState$1", f = "CaloriesReportsViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super ny.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161194b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = k.this.new c(dVar);
            cVar.f161194b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ny.d> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            v2 aVar;
            o82.a aVar2 = (o82.a) this.f161194b;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161193a;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar2.f130844b).toDateTimeAtStartOfDay();
                oy.a aVar4 = k.this.f161180a;
                dateTimeAtStartOfDay.getClass();
                this.f161194b = null;
                this.f161193a = 1;
                obj = aVar4.b(dateTimeAtStartOfDay, this);
                if (obj == aVar3) {
                    return aVar3;
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
                aVar = new v2.b(new ny.d((List) bVar.f47386a), bVar.f47387b, null, null, 12, null);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar5 = (v2.a) v2Var;
                aVar = new v2.a(aVar5.f47383a, aVar5.f47384b, null, 4, null);
            }
            if (aVar instanceof v2.b) {
                return (ny.d) ((v2.b) aVar).f47386a;
            }
            if (aVar instanceof v2.a) {
                throw ((v2.a) aVar).f47383a;
            }
            u0.r();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(oy.a aVar) {
        aVar.getClass();
        this.f161180a = aVar;
        int i14 = 4;
        p005kotlin.jvm.internal.j jVar = null;
        this.f161181b = new u82.a(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, i14, jVar);
        this.f161182c = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f161183d = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, i14, jVar);
        p005kotlin.jvm.internal.j jVar2 = null;
        boolean z14 = false;
        Object[] objArr = 0 == true ? 1 : 0;
        this.f161184e = new sy.b(0, objArr, 0, z14, 15, jVar2);
        p2 p2VarA = q2.a(new l(null, null, z14, 7, jVar2));
        this.f161185f = p2VarA;
        this.f161186g = s.d(p2VarA);
    }
}

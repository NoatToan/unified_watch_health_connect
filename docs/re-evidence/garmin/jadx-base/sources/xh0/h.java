package xh0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import ch.qos.logback.core.joran.action.Action;
import ci0.j;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g22.l;
import gs1.t;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import tf0.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxh0/h;", "Landroidx/lifecycle/u1;", "Luh0/d;", "floorsRepository", "Lis1/e;", "timelineRepository", "Lal0/a;", "goalRepository", "Lci0/j;", "tooltipAvailability", "Lzd0/h;", "getAutorotateEnabledUseCase", "<init>", "(Luh0/d;Lis1/e;Lal0/a;Lci0/j;Lzd0/h;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh0.d f191008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is1.e f191009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al0.a f191010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f191011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f191012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f191013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a f191014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f191015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f191016i;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$1", f = "FloorsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f191017a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = h.this.new a(dVar);
            aVar.f191017a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z14 = this.f191017a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = h.this.f191013f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, g.a((g) value, null, null, false, false, false, false, false, z14, 127)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lsh0/a;", "<anonymous>", "(Lo82/a;)Lsh0/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$dailyReportsDataState$1", f = "FloorsViewModel.kt", l = {101}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super sh0.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f191020b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = h.this.new b(dVar);
            bVar.f191020b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super sh0.a> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f191020b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191019a;
            if (i14 == 0) {
                r.b(obj);
                uh0.d dVar = h.this.f191008a;
                o oVar = aVar.f130843a;
                o oVar2 = aVar.f130844b;
                this.f191020b = null;
                this.f191019a = 1;
                dVar.getClass();
                obj = f0.J(dVar, new uh0.b(dVar, oVar, oVar2, null), this);
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
                return new sh0.a((List) ((v2.b) v2Var).f47386a);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lsh0/d;", "<anonymous>", "(Lo82/a;)Lsh0/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$detailsDataState$1", f = "FloorsViewModel.kt", l = {80, 81, 82}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super sh0.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f191022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f191023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v2 f191024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v2 f191025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f191026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f191027f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lsh0/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$detailsDataState$1$deferredDailyChartData$1", f = "FloorsViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends sh0.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f191029a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f191030b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o82.a f191031c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, o82.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f191030b = hVar;
                this.f191031c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f191030b, this.f191031c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends sh0.c>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f191029a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                uh0.d dVar = this.f191030b.f191008a;
                o oVar = this.f191031c.f130843a;
                this.f191029a = 1;
                dVar.getClass();
                Object objJ = f0.J(dVar, new uh0.a(dVar, oVar, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lzk0/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$detailsDataState$1$deferredFloorsGoal$1", f = "FloorsViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends zk0.h>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f191032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f191033b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o82.a f191034c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, o82.a aVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f191033b = hVar;
                this.f191034c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f191033b, this.f191034c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends zk0.h>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f191032a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                al0.a aVar2 = this.f191033b.f191010c;
                String string = fz0.d.a(this.f191034c.f130843a).toString();
                this.f191032a = 1;
                aVar2.getClass();
                Object objJ = f0.J(aVar2, new al0.f(aVar2, "floors-climbed", string, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        /* JADX INFO: renamed from: xh0.h$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$detailsDataState$1$deferredSnapshotTimeline$1", f = "FloorsViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
        public static final class C3557c extends v13.i implements p<b0, t13.d<? super v2<? extends t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f191035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f191036b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f191037c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3557c(h hVar, DateTime dateTime, t13.d<? super C3557c> dVar) {
                super(2, dVar);
                this.f191036b = hVar;
                this.f191037c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3557c(this.f191036b, this.f191037c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends t>> dVar) {
                return ((C3557c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f191035a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                is1.e eVar = this.f191036b.f191009b;
                DateTime dateTime = this.f191037c;
                dateTime.getClass();
                this.f191035a = 1;
                Object objA = eVar.a(dateTime, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = h.this.new c(dVar);
            cVar.f191027f = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super sh0.d> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            i0 i0VarJ;
            j0 j0Var;
            v2 v2Var;
            i0 i0Var;
            v2 v2Var2;
            Object objAwait;
            v2 v2Var3;
            v2 v2Var4;
            v2 v2Var5;
            v2.b bVar;
            o82.a aVar = (o82.a) this.f191027f;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191026e;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                h hVar = h.this;
                j0 j0VarJ = ge1.b.j(v1.a(hVar), null, null, new a(hVar, aVar, null), 3);
                j0 j0VarJ2 = ge1.b.j(v1.a(hVar), null, null, new C3557c(hVar, dateTimeAtStartOfDay, null), 3);
                i0VarJ = ge1.b.j(v1.a(hVar), null, null, new b(hVar, aVar, null), 3);
                this.f191027f = null;
                this.f191022a = j0VarJ2;
                this.f191023b = i0VarJ;
                this.f191026e = 1;
                Object objC = j0VarJ.C(this);
                if (objC != aVar2) {
                    j0Var = j0VarJ2;
                    obj = objC;
                }
                return aVar2;
            }
            if (i14 == 1) {
                i0VarJ = this.f191023b;
                j0Var = this.f191022a;
                r.b(obj);
            } else {
                if (i14 == 2) {
                    v2Var = this.f191024c;
                    i0Var = this.f191023b;
                    r.b(obj);
                    v2Var2 = (v2) obj;
                    this.f191027f = null;
                    this.f191022a = null;
                    this.f191023b = null;
                    this.f191024c = v2Var;
                    this.f191025d = v2Var2;
                    this.f191026e = 3;
                    objAwait = i0Var.await(this);
                    if (objAwait != aVar2) {
                        v2Var3 = v2Var;
                        v2Var4 = v2Var2;
                        obj = objAwait;
                    }
                    return aVar2;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var4 = this.f191025d;
                v2Var3 = this.f191024c;
                r.b(obj);
            }
            v2Var5 = (v2) obj;
            if (!(v2Var3 instanceof v2.a)) {
                throw ((v2.a) v2Var3).f47383a;
            }
            if (!(v2Var4 instanceof v2.a)) {
                throw ((v2.a) v2Var4).f47383a;
            }
            v2Var3.getClass();
            sh0.c cVar = (sh0.c) ((v2.b) v2Var3).f47386a;
            v2Var4.getClass();
            t tVar = (t) ((v2.b) v2Var4).f47386a;
            if (v2Var5 instanceof v2.b) {
                bVar = (v2.b) v2Var5;
            } else {
                bVar = null;
            }
            return new sh0.d(cVar, tVar, bVar != null ? (zk0.h) bVar.f47386a : null);
            v2 v2Var6 = (v2) obj;
            this.f191027f = null;
            this.f191022a = null;
            this.f191023b = i0VarJ;
            this.f191024c = v2Var6;
            this.f191026e = 2;
            Object objAwait2 = j0Var.await(this);
            if (objAwait2 != aVar2) {
                i0 i0Var2 = i0VarJ;
                v2Var = v2Var6;
                obj = objAwait2;
                i0Var = i0Var2;
                v2Var2 = (v2) obj;
                this.f191027f = null;
                this.f191022a = null;
                this.f191023b = null;
                this.f191024c = v2Var;
                this.f191025d = v2Var2;
                this.f191026e = 3;
                objAwait = i0Var.await(this);
                if (objAwait != aVar2) {
                    v2Var3 = v2Var;
                    v2Var4 = v2Var2;
                    obj = objAwait;
                    v2Var5 = (v2) obj;
                    if (!(v2Var3 instanceof v2.a)) {
                        throw ((v2.a) v2Var3).f47383a;
                    }
                    if (!(v2Var4 instanceof v2.a)) {
                        throw ((v2.a) v2Var4).f47383a;
                    }
                    v2Var3.getClass();
                    sh0.c cVar2 = (sh0.c) ((v2.b) v2Var3).f47386a;
                    v2Var4.getClass();
                    t tVar2 = (t) ((v2.b) v2Var4).f47386a;
                    if (v2Var5 instanceof v2.b) {
                        bVar = (v2.b) v2Var5;
                    } else {
                        bVar = null;
                    }
                    return new sh0.d(cVar2, tVar2, bVar != null ? (zk0.h) bVar.f47386a : null);
                }
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lsh0/e;", "<anonymous>", "(Lo82/a;)Lsh0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsViewModel$weeklyReportDataState$1", f = "FloorsViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super sh0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f191039b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = h.this.new d(dVar);
            dVar2.f191039b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super sh0.e> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f191039b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191038a;
            if (i14 == 0) {
                r.b(obj);
                uh0.d dVar = h.this.f191008a;
                o oVar = aVar.f130844b;
                this.f191039b = null;
                this.f191038a = 1;
                dVar.getClass();
                obj = f0.J(dVar, new uh0.c(dVar, oVar, 52, null), this);
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
                return new sh0.e((List) ((v2.b) v2Var).f47386a);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    public h(uh0.d dVar, is1.e eVar, al0.a aVar, j jVar, zd0.h hVar) {
        dVar.getClass();
        eVar.getClass();
        aVar.getClass();
        jVar.getClass();
        hVar.getClass();
        this.f191008a = dVar;
        this.f191009b = eVar;
        this.f191010c = aVar;
        this.f191011d = jVar;
        this.f191012e = new i(v1.a(this), null, 2, null);
        this.f191013f = q2.a(new g(null, null, false, false, false, false, false, false, 255, null));
        y4();
        s.C(new m1(s.f(new zd0.g(hVar, null)), new a(null)), v1.a(this));
        this.f191014g = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f191015h = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
        this.f191016i = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
    }

    public final void x4(boolean z14) {
        while (true) {
            p2 p2Var = this.f191013f;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, g.a((g) value, null, null, false, false, false, z15, false, false, 223))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void y4() {
        boolean zA;
        Object value;
        p2 p2Var = this.f191013f;
        boolean z14 = ((g) p2Var.getValue()).f191003d;
        j jVar = this.f191011d;
        if (z14) {
            jVar.getClass();
            zA = j.f27658c.c();
        } else {
            jVar.getClass();
            zA = j.f27658c.a();
        }
        boolean z15 = zA;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, g.a((g) value, null, null, false, false, z15, false, false, false, 239)));
    }
}

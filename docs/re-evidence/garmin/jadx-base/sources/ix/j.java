package ix;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import gs1.z;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o13.t;
import o53.b0;
import o53.i0;
import o53.j0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.c2;
import p3.p0;
import r1.q2;
import r53.b2;
import r53.m1;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lix/j;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f95621a = o13.m.b(new ik2.b(14));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f95622b = o13.m.b(new ik2.b(15));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx.a f95623c = (fx.a) KoinJavaComponent.get$default(fx.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zw.a f95624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zd0.h f95625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tf0.i f95626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f95627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f95628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f95629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f95630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f95631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Double f95632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f95633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a f95634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u82.a f95635o;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isAutorotateEnabled", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$2", f = "BodyBatteryReportsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f95636a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = j.this.new a(dVar);
            aVar.f95636a = ((Boolean) obj).booleanValue();
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
            boolean z14 = this.f95636a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = j.this.f95627g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l.a((l) value, false, null, null, false, false, false, false, z14, null, 383)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lbx/f;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$dailyReportsDataState$1", f = "BodyBatteryReportsViewModel.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super List<? extends bx.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f95639b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = j.this.new b(dVar);
            bVar.f95639b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends bx.f>> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f95639b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95638a;
            if (i14 == 0) {
                r.b(obj);
                LocalDate localDateH = g22.l.h(aVar.f130843a);
                LocalDate localDateH2 = g22.l.h(aVar.f130844b);
                dx.a aVar3 = (dx.a) j.this.f95622b.getValue();
                this.f95639b = null;
                this.f95638a = 1;
                obj = aVar3.a(localDateH, localDateH2, this);
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
                return (List) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching daily body battery");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lbx/a;", "<anonymous>", "(Lo82/a;)Lbx/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$detailsDataState$1", f = "BodyBatteryReportsViewModel.kt", l = {122, 123, 124}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super bx.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f95641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f95642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v2 f95643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v2 f95644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f95645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f95646f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lbx/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$detailsDataState$1$deferredBodyBatteryEvents$1", f = "BodyBatteryReportsViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends bx.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f95649b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f95650c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, o oVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f95649b = jVar;
                this.f95650c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f95649b, this.f95650c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends bx.b>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f95648a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                dx.a aVar2 = (dx.a) this.f95649b.f95622b.getValue();
                LocalDate localDateH = g22.l.h(this.f95650c);
                this.f95648a = 1;
                Object objB = aVar2.b(localDateH, this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lbx/e;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$detailsDataState$1$deferredMessagingToday$1", f = "BodyBatteryReportsViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends bx.e>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f95652b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f95652b = jVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f95652b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends bx.e>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f95651a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                dx.a aVar2 = (dx.a) this.f95652b.f95622b.getValue();
                this.f95651a = 1;
                Object objC = aVar2.c(this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX INFO: renamed from: ix.j$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$detailsDataState$1$deferredSnapshotTimeline$1", f = "BodyBatteryReportsViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
        public static final class C1830c extends v13.i implements p<b0, t13.d<? super v2<? extends gs1.t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95653a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f95654b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f95655c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1830c(j jVar, o oVar, t13.d<? super C1830c> dVar) {
                super(2, dVar);
                this.f95654b = jVar;
                this.f95655c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1830c(this.f95654b, this.f95655c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends gs1.t>> dVar) {
                return ((C1830c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f95653a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                is1.e eVar = (is1.e) this.f95654b.f95621a.getValue();
                DateTime dateTimeK = vb.h.k(this.f95655c);
                this.f95653a = 1;
                Object objA = eVar.a(dateTimeK, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = j.this.new c(dVar);
            cVar.f95646f = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super bx.a> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ca A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:43:0x010d  */
        /* JADX WARN: Code duplicated, block: B:45:0x0112  */
        /* JADX WARN: Code duplicated, block: B:47:0x0117  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            j0 j0VarJ;
            i0 i0Var;
            v2 v2Var;
            Object objAwait;
            v2 v2Var2;
            i0 i0Var2;
            v2 v2Var3;
            Object objAwait2;
            v2 v2Var4;
            v2 v2Var5;
            v2 v2Var6;
            o82.a aVar = (o82.a) this.f95646f;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95645e;
            j jVar = j.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    i0Var = this.f95642b;
                    j0VarJ = this.f95641a;
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        v2Var2 = this.f95643c;
                        i0Var2 = this.f95642b;
                        r.b(obj);
                        v2Var3 = (v2) obj;
                        this.f95646f = null;
                        this.f95641a = null;
                        this.f95642b = null;
                        this.f95643c = v2Var2;
                        this.f95644d = v2Var3;
                        this.f95645e = 3;
                        objAwait2 = i0Var2.await(this);
                        if (objAwait2 != aVar2) {
                            v2Var4 = v2Var2;
                            v2Var5 = v2Var3;
                            obj = objAwait2;
                        }
                        return aVar2;
                    }
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v2Var5 = this.f95644d;
                    v2Var4 = this.f95643c;
                    r.b(obj);
                }
                v2Var6 = (v2) obj;
                if (v2Var4 instanceof v2.a) {
                    throw ((v2.a) v2Var4).f47383a;
                }
                if (v2Var5 instanceof v2.a) {
                    throw ((v2.a) v2Var5).f47383a;
                }
                if (v2Var6 instanceof v2.a) {
                    throw ((v2.a) v2Var6).f47383a;
                }
                if (v2Var4 == null) {
                    v2Var5.getClass();
                    gs1.t tVar = (gs1.t) ((v2.b) v2Var5).f47386a;
                    j.x4(jVar, tVar);
                    v2Var6.getClass();
                    return new bx.a(null, tVar, (List) ((v2.b) v2Var6).f47386a, 1, null);
                }
                v2Var5.getClass();
                gs1.t tVar2 = (gs1.t) ((v2.b) v2Var5).f47386a;
                j.x4(jVar, tVar2);
                bx.e eVar = (bx.e) ((v2.b) v2Var4).f47386a;
                v2Var6.getClass();
                return new bx.a(eVar, tVar2, (List) ((v2.b) v2Var6).f47386a);
            }
            r.b(obj);
            o oVar = aVar.f130843a;
            DateTime dateTimeAtStartOfDay = g22.l.h(oVar).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            j0 j0VarJ2 = g22.k.k(dateTimeAtStartOfDay) ? ge1.b.j(v1.a(jVar), null, null, new b(jVar, null), 3) : null;
            j0VarJ = ge1.b.j(v1.a(jVar), null, null, new C1830c(jVar, oVar, null), 3);
            j0 j0VarJ3 = ge1.b.j(v1.a(jVar), null, null, new a(jVar, oVar, null), 3);
            if (j0VarJ2 != null) {
                this.f95646f = null;
                this.f95641a = j0VarJ;
                this.f95642b = j0VarJ3;
                this.f95645e = 1;
                Object objC = j0VarJ2.C(this);
                if (objC != aVar2) {
                    i0Var = j0VarJ3;
                    obj = objC;
                }
            } else {
                i0Var = j0VarJ3;
                v2Var = null;
                this.f95646f = null;
                this.f95641a = null;
                this.f95642b = i0Var;
                this.f95643c = v2Var;
                this.f95645e = 2;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar2) {
                    i0 i0Var3 = i0Var;
                    v2Var2 = v2Var;
                    obj = objAwait;
                    i0Var2 = i0Var3;
                    v2Var3 = (v2) obj;
                    this.f95646f = null;
                    this.f95641a = null;
                    this.f95642b = null;
                    this.f95643c = v2Var2;
                    this.f95644d = v2Var3;
                    this.f95645e = 3;
                    objAwait2 = i0Var2.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var4 = v2Var2;
                        v2Var5 = v2Var3;
                        obj = objAwait2;
                        v2Var6 = (v2) obj;
                        if (v2Var4 instanceof v2.a) {
                            throw ((v2.a) v2Var4).f47383a;
                        }
                        if (v2Var5 instanceof v2.a) {
                            throw ((v2.a) v2Var5).f47383a;
                        }
                        if (v2Var6 instanceof v2.a) {
                            throw ((v2.a) v2Var6).f47383a;
                        }
                        if (v2Var4 == null) {
                            v2Var5.getClass();
                            gs1.t tVar3 = (gs1.t) ((v2.b) v2Var5).f47386a;
                            j.x4(jVar, tVar3);
                            v2Var6.getClass();
                            return new bx.a(null, tVar3, (List) ((v2.b) v2Var6).f47386a, 1, null);
                        }
                        v2Var5.getClass();
                        gs1.t tVar4 = (gs1.t) ((v2.b) v2Var5).f47386a;
                        j.x4(jVar, tVar4);
                        bx.e eVar2 = (bx.e) ((v2.b) v2Var4).f47386a;
                        v2Var6.getClass();
                        return new bx.a(eVar2, tVar4, (List) ((v2.b) v2Var6).f47386a);
                    }
                }
            }
            return aVar2;
            v2Var = (v2) obj;
            this.f95646f = null;
            this.f95641a = null;
            this.f95642b = i0Var;
            this.f95643c = v2Var;
            this.f95645e = 2;
            objAwait = j0VarJ.await(this);
            if (objAwait != aVar2) {
                i0 i0Var4 = i0Var;
                v2Var2 = v2Var;
                obj = objAwait;
                i0Var2 = i0Var4;
                v2Var3 = (v2) obj;
                this.f95646f = null;
                this.f95641a = null;
                this.f95642b = null;
                this.f95643c = v2Var2;
                this.f95644d = v2Var3;
                this.f95645e = 3;
                objAwait2 = i0Var2.await(this);
                if (objAwait2 != aVar2) {
                    v2Var4 = v2Var2;
                    v2Var5 = v2Var3;
                    obj = objAwait2;
                    v2Var6 = (v2) obj;
                    if (v2Var4 instanceof v2.a) {
                        throw ((v2.a) v2Var4).f47383a;
                    }
                    if (v2Var5 instanceof v2.a) {
                        throw ((v2.a) v2Var5).f47383a;
                    }
                    if (v2Var6 instanceof v2.a) {
                        throw ((v2.a) v2Var6).f47383a;
                    }
                    if (v2Var4 == null) {
                        v2Var5.getClass();
                        gs1.t tVar5 = (gs1.t) ((v2.b) v2Var5).f47386a;
                        j.x4(jVar, tVar5);
                        v2Var6.getClass();
                        return new bx.a(null, tVar5, (List) ((v2.b) v2Var6).f47386a, 1, null);
                    }
                    v2Var5.getClass();
                    gs1.t tVar6 = (gs1.t) ((v2.b) v2Var5).f47386a;
                    j.x4(jVar, tVar6);
                    bx.e eVar3 = (bx.e) ((v2.b) v2Var4).f47386a;
                    v2Var6.getClass();
                    return new bx.a(eVar3, tVar6, (List) ((v2.b) v2Var6).f47386a);
                }
            }
            return aVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        Object value;
        zw.a aVar = (zw.a) KoinJavaComponent.get$default(zw.a.class, null, null, 6, null);
        this.f95624d = aVar;
        this.f95625e = (zd0.h) KoinJavaComponent.get$default(zd0.h.class, null, null, 6, null);
        this.f95626f = new tf0.i(v1.a(this), null, 2, 0 == true ? 1 : 0);
        p2 p2VarA = r53.q2.a(new l(false, null, null, false, false, false, false, false, aVar.a(), 255, null));
        this.f95627g = p2VarA;
        this.f95628h = s.d(p2VarA);
        this.f95629i = r53.q2.a(Boolean.TRUE);
        c2 c2VarN = p0.n(null);
        this.f95630j = c2VarN;
        this.f95631k = c2VarN;
        do {
            value = p2VarA.getValue();
        } while (!p2VarA.b(value, l.a((l) value, false, null, null, false, this.f95624d.e(), this.f95624d.d(), false, false, null, 463)));
        ge1.b.T(v1.a(this), null, null, new k(this, null), 3);
        zd0.h hVar = this.f95625e;
        hVar.getClass();
        s.C(new m1(s.f(new zd0.g(hVar, null)), new a(null)), v1.a(this));
        this.f95634n = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f95635o = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
    }

    public static final void x4(j jVar, gs1.t tVar) {
        gs1.l payload;
        Double bodyBatteryVersion;
        jVar.getClass();
        z userDailySummary = tVar.getUserDailySummary();
        double dDoubleValue = (userDailySummary == null || (payload = userDailySummary.getPayload()) == null || (bodyBatteryVersion = payload.getBodyBatteryVersion()) == null) ? 1.0d : bodyBatteryVersion.doubleValue();
        Double d14 = jVar.f95632l;
        if (d14 == null || d14.doubleValue() < dDoubleValue) {
            jVar.f95632l = Double.valueOf(dDoubleValue);
        }
    }

    public static ArrayList y4(boolean z14, boolean z15, boolean z16) {
        ArrayList arrayListD1 = h0.d1(jx.c.f101391g);
        if (!z14) {
            arrayListD1.remove(jx.c.BODY_BATTERY);
        }
        if (!z15) {
            arrayListD1.remove(jx.c.STRESS);
        }
        if (!z16) {
            arrayListD1.remove(jx.c.REST);
        }
        return arrayListD1;
    }

    public final void A4() {
        Object value;
        boolean z14;
        Object value2;
        boolean z15 = ((l) this.f95628h.f150540a.getValue()).f95667g;
        boolean z16 = false;
        zw.a aVar = this.f95624d;
        p2 p2Var = this.f95627g;
        if (z15) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, l.a((l) value2, false, null, null, false, false, false, false, false, null, 495)));
            aVar.f();
        } else {
            do {
                value = p2Var.getValue();
                z14 = z16;
                z16 = z14;
            } while (!p2Var.b(value, l.a((l) value, false, null, null, false, false, z14, false, false, null, 479)));
            aVar.c();
        }
    }

    public final void z4(List<? extends jx.c> list, List<? extends jx.c> list2) {
        p2 p2Var;
        Object value;
        l lVar;
        ArrayList arrayList;
        do {
            p2Var = this.f95627g;
            value = p2Var.getValue();
            lVar = (l) value;
            List<jx.c> list3 = lVar.f95669i;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                if (!((ArrayList) list).contains((jx.c) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(h0.C0(arrayList2, list2));
            this.f95624d.b(arrayList);
        } while (!p2Var.b(value, l.a(lVar, false, null, null, false, false, false, false, false, arrayList, 255)));
    }
}

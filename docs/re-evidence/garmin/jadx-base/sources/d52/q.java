package d52;

import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import aq1.d0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import gs1.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import lc.u0;
import o53.b0;
import o53.i0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.m1;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ld52/q;", "Landroidx/lifecycle/u1;", "La52/a;", "pushesRepository", "Lis1/e;", "timelineRepository", "Lo91/a;", "personalRecordsRepository", "Lx42/b;", "intervalTogglePreferences", "Le52/a;", "tooltipAvailability", "Lzd0/h;", "getAutorotateEnabledUseCase", "<init>", "(La52/a;Lis1/e;Lo91/a;Lx42/b;Le52/a;Lzd0/h;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a52.a f57612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is1.e f57613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o91.a f57614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x42.b f57615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e52.a f57616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tf0.i f57617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f57618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f57619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f57620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f57621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a f57622k;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$1", f = "PushesSummaryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f57623a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = q.this.new a(dVar);
            aVar.f57623a = ((Boolean) obj).booleanValue();
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
            boolean z14 = this.f57623a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = q.this.f57618g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, r.a((r) value, null, null, null, false, false, false, false, false, z14, 255)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lz42/d;", "<anonymous>", "(Lo82/a;)Lz42/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$dailySummaryDataState$1", f = "PushesSummaryViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o82.a, t13.d<? super z42.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f57625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f57626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f57627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f57628d;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = q.this.new b(dVar);
            bVar.f57628d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super z42.d> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f57628d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f57627c;
            q qVar = q.this;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                a52.a aVar3 = qVar.f57612a;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f57628d = null;
                this.f57625a = dateTimeAtStartOfDay2;
                this.f57626b = dateTimeAtStartOfDay;
                this.f57627c = 1;
                Object objF = aVar3.f(dateTimeAtStartOfDay2, dateTimeAtStartOfDay, this);
                if (objF == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objF;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f57626b;
                DateTime dateTime2 = this.f57625a;
                o13.r.b(obj);
                dateTime = dateTime2;
            }
            DateTime dateTime3 = dateTimeAtStartOfDay;
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    throw ((v2.a) v2Var).f47383a;
                }
                u0.r();
                return null;
            }
            z42.a aVar4 = (z42.a) ((v2.b) v2Var).f47386a;
            List<z42.e> listD = aVar4 != null ? aVar4.d() : null;
            if (listD == null) {
                listD = j0.f134944a;
            }
            dateTime.getClass();
            dateTime3.getClass();
            qVar.getClass();
            TreeMap treeMap = new TreeMap();
            p13.u0.k(treeMap, new o13.p[0]);
            new e32.d(null, 1, null).a(dateTime, dateTime3, treeMap, 1, new d0(listD, 3));
            Collection collectionValues = treeMap.values();
            collectionValues.getClass();
            return new z42.d(h0.b1(collectionValues), aVar4 != null ? aVar4.getAggregations() : null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lz42/g;", "<anonymous>", "(Lo82/a;)Lz42/g;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$detailsDataState$1", f = "PushesSummaryViewModel.kt", l = {94, 95, 96, 97}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o82.a, t13.d<? super z42.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f57630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f57631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0 f57632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v2 f57633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v2 f57634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public v2 f57635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f57636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f57637h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lz42/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$detailsDataState$1$deferredDailyChartData$1", f = "PushesSummaryViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends z42.f>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f57639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f57640b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f57641c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, DateTime dateTime, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f57640b = qVar;
                this.f57641c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f57640b, this.f57641c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends z42.f>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f57639a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                a52.a aVar2 = this.f57640b.f57612a;
                DateTime dateTime = this.f57641c;
                dateTime.getClass();
                this.f57639a = 1;
                Object objD = aVar2.d(dateTime, this);
                return objD == aVar ? aVar : objD;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lz42/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$detailsDataState$1$deferredDailyStatsData$1", f = "PushesSummaryViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends z42.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f57642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f57643b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f57644c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, DateTime dateTime, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f57643b = qVar;
                this.f57644c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f57643b, this.f57644c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends z42.c>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f57642a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                a52.a aVar2 = this.f57643b.f57612a;
                DateTime dateTime = this.f57644c;
                dateTime.getClass();
                this.f57642a = 1;
                Object objC = aVar2.c(dateTime, this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX INFO: renamed from: d52.q$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ln91/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$detailsDataState$1$deferredPersonalRecords$1", f = "PushesSummaryViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
        public static final class C1233c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends n91.a>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f57645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f57646b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1233c(q qVar, t13.d<? super C1233c> dVar) {
                super(2, dVar);
                this.f57646b = qVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1233c(this.f57646b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends n91.a>>> dVar) {
                return ((C1233c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f57645a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                o91.a aVar2 = this.f57646b.f57614c;
                this.f57645a = 1;
                Object objI = aVar2.i(this);
                return objI == aVar ? aVar : objI;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$detailsDataState$1$deferredSnapshotTimeline$1", f = "PushesSummaryViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
        public static final class d extends v13.i implements e23.p<b0, t13.d<? super v2<? extends t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f57647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f57648b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f57649c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(q qVar, DateTime dateTime, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f57648b = qVar;
                this.f57649c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f57648b, this.f57649c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends t>> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f57647a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                is1.e eVar = this.f57648b.f57613b;
                DateTime dateTime = this.f57649c;
                dateTime.getClass();
                this.f57647a = 1;
                Object objA = eVar.a(dateTime, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = q.this.new c(dVar);
            cVar.f57637h = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super z42.g> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:36:0x0101  */
        /* JADX WARN: Code duplicated, block: B:38:0x0112  */
        /* JADX WARN: Code duplicated, block: B:39:0x0117  */
        /* JADX WARN: Code duplicated, block: B:43:0x0141  */
        /* JADX WARN: Code duplicated, block: B:45:0x0153  */
        /* JADX WARN: Code duplicated, block: B:50:0x017a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x017c  */
        /* JADX WARN: Code duplicated, block: B:54:0x0199  */
        /* JADX WARN: Code duplicated, block: B:56:0x019c  */
        /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:58:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:60:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:67:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:72:0x01ba A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x013b A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            i0 i0VarJ;
            i0 i0Var;
            o53.j0 j0Var;
            v2 v2Var;
            i0 i0Var2;
            i0 i0Var3;
            v2 v2Var2;
            Object objAwait;
            v2 v2Var3;
            i0 i0Var4;
            v2 v2Var4;
            v2 v2Var5;
            Object objAwait2;
            v2 v2Var6;
            v2 v2Var7;
            v2 v2Var8;
            z42.k userDailySummaryDTO;
            z42.b dailyPushesDTO;
            ArrayList arrayListL;
            long typeId;
            z42.h hVarA;
            Long prStartTimeLocal;
            Long prStartTimeGmt;
            boolean zE;
            o82.a aVar = (o82.a) this.f57637h;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f57636g;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                q qVar = q.this;
                o53.j0 j0VarJ = ge1.b.j(v1.a(qVar), null, null, new b(qVar, dateTimeAtStartOfDay, null), 3);
                o53.j0 j0VarJ2 = ge1.b.j(v1.a(qVar), null, null, new a(qVar, dateTimeAtStartOfDay, null), 3);
                o53.j0 j0VarJ3 = ge1.b.j(v1.a(qVar), null, null, new d(qVar, dateTimeAtStartOfDay, null), 3);
                i0VarJ = ge1.b.j(v1.a(qVar), null, null, new C1233c(qVar, null), 3);
                this.f57637h = null;
                this.f57630a = j0VarJ2;
                this.f57631b = j0VarJ3;
                this.f57632c = i0VarJ;
                this.f57636g = 1;
                Object objC = j0VarJ.C(this);
                if (objC != aVar2) {
                    i0Var = j0VarJ3;
                    obj = objC;
                    j0Var = j0VarJ2;
                }
                return aVar2;
            }
            if (i14 == 1) {
                i0VarJ = this.f57632c;
                i0Var = this.f57631b;
                j0Var = this.f57630a;
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    v2Var = this.f57633d;
                    i0Var3 = this.f57632c;
                    i0Var2 = this.f57631b;
                    o13.r.b(obj);
                    v2Var2 = (v2) obj;
                    this.f57637h = null;
                    this.f57630a = null;
                    this.f57631b = null;
                    this.f57632c = i0Var3;
                    this.f57633d = v2Var;
                    this.f57634e = v2Var2;
                    this.f57636g = 3;
                    objAwait = i0Var2.await(this);
                    if (objAwait != aVar2) {
                        v2 v2Var9 = v2Var;
                        v2Var3 = v2Var2;
                        obj = objAwait;
                        i0Var4 = i0Var3;
                        v2Var4 = v2Var9;
                        v2Var5 = (v2) obj;
                        this.f57637h = null;
                        this.f57630a = null;
                        this.f57631b = null;
                        this.f57632c = null;
                        this.f57633d = v2Var4;
                        this.f57634e = v2Var3;
                        this.f57635f = v2Var5;
                        this.f57636g = 4;
                        objAwait2 = i0Var4.await(this);
                        if (objAwait2 != aVar2) {
                            v2Var6 = v2Var3;
                            v2Var7 = v2Var5;
                            obj = objAwait2;
                        }
                    }
                    return aVar2;
                }
                if (i14 == 3) {
                    v2Var3 = this.f57634e;
                    v2Var4 = this.f57633d;
                    i0Var4 = this.f57632c;
                    o13.r.b(obj);
                    v2Var5 = (v2) obj;
                    this.f57637h = null;
                    this.f57630a = null;
                    this.f57631b = null;
                    this.f57632c = null;
                    this.f57633d = v2Var4;
                    this.f57634e = v2Var3;
                    this.f57635f = v2Var5;
                    this.f57636g = 4;
                    objAwait2 = i0Var4.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var6 = v2Var3;
                        v2Var7 = v2Var5;
                        obj = objAwait2;
                    }
                    return aVar2;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var7 = this.f57635f;
                v2Var6 = this.f57634e;
                v2Var4 = this.f57633d;
                o13.r.b(obj);
            }
            v2Var8 = (v2) obj;
            if (!(v2Var4 instanceof v2.a)) {
                throw ((v2.a) v2Var4).f47383a;
            }
            if (!(v2Var6 instanceof v2.a)) {
                throw ((v2.a) v2Var6).f47383a;
            }
            if (!(v2Var7 instanceof v2.a)) {
                throw ((v2.a) v2Var7).f47383a;
            }
            v2Var4.getClass();
            userDailySummaryDTO = ((z42.c) ((v2.b) v2Var4).f47386a).getUserDailySummaryDTO();
            if (userDailySummaryDTO != null) {
                dailyPushesDTO = userDailySummaryDTO.getDailyPushesDTO();
            } else {
                dailyPushesDTO = null;
            }
            v2Var6.getClass();
            List list = (List) ((v2.b) v2Var6).f47386a;
            v2Var7.getClass();
            t tVar = (t) ((v2.b) v2Var7).f47386a;
            v2Var8.getClass();
            List<n91.a> list2 = (List) ((v2.b) v2Var8).f47386a;
            arrayListL = androidx.core.view.j.l(list2);
            for (n91.a aVar3 : list2) {
                typeId = aVar3.getTypeId();
                if (typeId == q91.d.M0.f143579a) {
                    prStartTimeLocal = aVar3.getPrStartTimeLocal();
                    prStartTimeGmt = aVar3.getPrStartTimeGmt();
                    if (prStartTimeLocal == null && prStartTimeLocal.longValue() != 0) {
                        zE = c22.j0.E(prStartTimeLocal.longValue(), DateTime.now(DateTimeZone.UTC).getMillis());
                    } else if (prStartTimeGmt != null || prStartTimeGmt.longValue() == 0) {
                        zE = false;
                    } else {
                        zE = c22.j0.E(prStartTimeGmt.longValue(), DateTime.now(DateTimeZone.getDefault()).getMillis());
                    }
                    if (zE) {
                        hVarA = s.a(aVar3);
                    } else {
                        hVarA = null;
                    }
                } else {
                    q91.d.f143558e.getClass();
                    if (q91.d.f143560g.contains(Long.valueOf(typeId))) {
                        hVarA = s.a(aVar3);
                    } else {
                        hVarA = null;
                    }
                }
                if (hVarA != null) {
                    arrayListL.add(hVarA);
                }
            }
            return new z42.g(dailyPushesDTO, list, tVar, arrayListL);
            v2 v2Var10 = (v2) obj;
            this.f57637h = null;
            this.f57630a = null;
            this.f57631b = i0Var;
            this.f57632c = i0VarJ;
            this.f57633d = v2Var10;
            this.f57636g = 2;
            Object objAwait3 = j0Var.await(this);
            if (objAwait3 != aVar2) {
                i0 i0Var5 = i0VarJ;
                v2Var = v2Var10;
                obj = objAwait3;
                i0Var2 = i0Var;
                i0Var3 = i0Var5;
                v2Var2 = (v2) obj;
                this.f57637h = null;
                this.f57630a = null;
                this.f57631b = null;
                this.f57632c = i0Var3;
                this.f57633d = v2Var;
                this.f57634e = v2Var2;
                this.f57636g = 3;
                objAwait = i0Var2.await(this);
                if (objAwait != aVar2) {
                    v2 v2Var11 = v2Var;
                    v2Var3 = v2Var2;
                    obj = objAwait;
                    i0Var4 = i0Var3;
                    v2Var4 = v2Var11;
                    v2Var5 = (v2) obj;
                    this.f57637h = null;
                    this.f57630a = null;
                    this.f57631b = null;
                    this.f57632c = null;
                    this.f57633d = v2Var4;
                    this.f57634e = v2Var3;
                    this.f57635f = v2Var5;
                    this.f57636g = 4;
                    objAwait2 = i0Var4.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var6 = v2Var3;
                        v2Var7 = v2Var5;
                        obj = objAwait2;
                        v2Var8 = (v2) obj;
                        if (!(v2Var4 instanceof v2.a)) {
                            throw ((v2.a) v2Var4).f47383a;
                        }
                        if (!(v2Var6 instanceof v2.a)) {
                            throw ((v2.a) v2Var6).f47383a;
                        }
                        if (!(v2Var7 instanceof v2.a)) {
                            throw ((v2.a) v2Var7).f47383a;
                        }
                        v2Var4.getClass();
                        userDailySummaryDTO = ((z42.c) ((v2.b) v2Var4).f47386a).getUserDailySummaryDTO();
                        if (userDailySummaryDTO != null) {
                            dailyPushesDTO = userDailySummaryDTO.getDailyPushesDTO();
                        } else {
                            dailyPushesDTO = null;
                        }
                        v2Var6.getClass();
                        List list3 = (List) ((v2.b) v2Var6).f47386a;
                        v2Var7.getClass();
                        t tVar2 = (t) ((v2.b) v2Var7).f47386a;
                        v2Var8.getClass();
                        List<n91.a> list4 = (List) ((v2.b) v2Var8).f47386a;
                        arrayListL = androidx.core.view.j.l(list4);
                        while (r15.hasNext()) {
                            typeId = aVar3.getTypeId();
                            if (typeId == q91.d.M0.f143579a) {
                                prStartTimeLocal = aVar3.getPrStartTimeLocal();
                                prStartTimeGmt = aVar3.getPrStartTimeGmt();
                                if (prStartTimeLocal == null) {
                                    if (prStartTimeGmt != null) {
                                        zE = false;
                                    } else {
                                        zE = false;
                                    }
                                } else if (prStartTimeGmt != null) {
                                    zE = false;
                                } else {
                                    zE = false;
                                }
                                if (zE) {
                                    hVarA = s.a(aVar3);
                                } else {
                                    hVarA = null;
                                }
                            } else {
                                q91.d.f143558e.getClass();
                                if (q91.d.f143560g.contains(Long.valueOf(typeId))) {
                                    hVarA = s.a(aVar3);
                                } else {
                                    hVarA = null;
                                }
                            }
                            if (hVarA != null) {
                                arrayListL.add(hVarA);
                            }
                        }
                        return new z42.g(dailyPushesDTO, list3, tVar2, arrayListL);
                    }
                }
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lz42/i;", "<anonymous>", "(Lo82/a;)Lz42/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$monthlySummaryDataState$1", f = "PushesSummaryViewModel.kt", l = {159}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super z42.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f57650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f57651b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = q.this.new d(dVar);
            dVar2.f57651b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super z42.i> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f57651b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f57650a;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                a52.a aVar3 = q.this.f57612a;
                dateTimeAtStartOfDay.getClass();
                this.f57651b = null;
                this.f57650a = 1;
                obj = aVar3.a(dateTimeAtStartOfDay, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return new z42.i((List) ((v2.b) v2Var).f47386a);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lz42/i;", "<anonymous>", "(Lo82/a;)Lz42/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesSummaryViewModel$weeklySummaryDataState$1", f = "PushesSummaryViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super z42.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f57653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f57654b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = q.this.new e(dVar);
            eVar.f57654b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super z42.i> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f57654b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f57653a;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                a52.a aVar3 = q.this.f57612a;
                dateTimeAtStartOfDay.getClass();
                this.f57654b = null;
                this.f57653a = 1;
                obj = aVar3.b(dateTimeAtStartOfDay, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return new z42.i((List) ((v2.b) v2Var).f47386a);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    public q(a52.a aVar, is1.e eVar, o91.a aVar2, x42.b bVar, e52.a aVar3, zd0.h hVar) {
        aVar.getClass();
        eVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        aVar3.getClass();
        hVar.getClass();
        this.f57612a = aVar;
        this.f57613b = eVar;
        this.f57614c = aVar2;
        this.f57615d = bVar;
        this.f57616e = aVar3;
        this.f57617f = new tf0.i(v1.a(this), null, 2, null);
        this.f57618g = q2.a(new r(null, null, null, false, false, false, false, false, false, 511, null));
        B4();
        String strA4 = bVar.f188822a.A4("key_pushes_summary_interval_tab", null);
        strA4 = strA4 == null ? "WEEKLY" : strA4;
        yd1.b.f196755b.getClass();
        A4(yd1.b.a.a(strA4));
        r53.s.C(new m1(r53.s.f(new zd0.g(hVar, null)), new a(null)), v1.a(this));
        this.f57619h = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f57620i = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
        this.f57621j = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
        this.f57622k = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
    }

    public final void A4(yd1.b bVar) {
        bVar.getClass();
        p2 p2Var = this.f57618g;
        if (bVar == ((r) p2Var.getValue()).f57658c) {
            return;
        }
        while (true) {
            Object value = p2Var.getValue();
            yd1.b bVar2 = bVar;
            if (p2Var.b(value, r.a((r) value, null, null, bVar2, false, false, false, false, false, false, 507))) {
                x42.b bVar3 = this.f57615d;
                bVar3.getClass();
                bVar3.f188822a.S("key_pushes_summary_interval_tab", bVar2.name());
                return;
            }
            bVar = bVar2;
        }
    }

    public final void B4() {
        boolean zB;
        Object value;
        p2 p2Var = this.f57618g;
        boolean z14 = ((r) p2Var.getValue()).f57660e;
        e52.a aVar = this.f57616e;
        if (z14) {
            aVar.getClass();
            zB = e52.a.f63065c.c();
        } else {
            aVar.getClass();
            zB = e52.a.f63065c.b();
        }
        boolean z15 = zB;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, r.a((r) value, null, null, null, false, false, z15, false, false, false, 479)));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        String str;
        super.onCleared();
        String strA4 = this.f57615d.f188822a.A4("key_pushes_summary_interval_tab", null);
        if (strA4 == null) {
            strA4 = "WEEKLY";
        }
        yd1.b.f196755b.getClass();
        yd1.b bVarA = yd1.b.a.a(strA4);
        if (bVarA == ((r) this.f57618g.getValue()).f57658c) {
            return;
        }
        if (bVarA == yd1.b.WEEKLY) {
            str = "PUSHES_REPORTS_WEEKLY_SELECTED";
        } else {
            if (bVarA != yd1.b.MONTHLY) {
                u0.r();
                return;
            }
            str = "PUSHES_REPORTS_MONTHLY_SELECTED";
        }
        Bundle bundleD = tn.k.d("Screen", "PUSHES_REPORTS", "Action", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "UserAction");
    }

    public final void x4(boolean z14) {
        while (true) {
            p2 p2Var = this.f57618g;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, r.a((r) value, null, null, null, false, false, false, false, z15, false, 383))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void y4(yd1.b bVar) {
        bVar.getClass();
        p2 p2Var = this.f57618g;
        p2Var.k(null, r.a((r) p2Var.getValue(), null, null, bVar, false, false, false, false, false, false, 507));
    }

    public final void z4(boolean z14) {
        while (true) {
            p2 p2Var = this.f57618g;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, r.a((r) value, null, null, null, false, false, false, z15, false, false, 447))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }
}

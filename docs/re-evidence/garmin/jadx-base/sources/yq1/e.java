package yq1;

import android.os.Bundle;
import androidx.core.view.j;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import g22.l;
import gs1.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import jq1.f;
import jq1.g;
import jq1.k;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.p2;
import r53.q2;
import tf0.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyq1/e;", "Landroidx/lifecycle/u1;", "Lkq1/a;", "stepsRepository", "Lis1/e;", "timelineRepository", "Lo91/a;", "personalRecordsRepository", "Lsq1/b;", "tooltipAvailability", "Lhq1/b;", "intervalTogglePreferences", "<init>", "(Lkq1/a;Lis1/e;Lo91/a;Lsq1/b;Lhq1/b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq1.a f198800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is1.e f198801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o91.a f198802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sq1.b f198803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hq1.b f198804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f198805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f198806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f198807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f198808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f198809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a f198810k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ljq1/d;", "<anonymous>", "(Lo82/a;)Ljq1/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$dailySummaryDataState$1", f = "StepsViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o82.a, t13.d<? super jq1.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f198811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f198812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f198813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f198814d;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = e.this.new a(dVar);
            aVar.f198814d = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super jq1.d> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o oVar;
            o oVar2;
            o82.a aVar = (o82.a) this.f198814d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198813c;
            e eVar = e.this;
            if (i14 == 0) {
                r.b(obj);
                o oVar3 = aVar.f130843a;
                oVar = aVar.f130844b;
                kq1.a aVar3 = eVar.f198800a;
                this.f198814d = null;
                this.f198811a = oVar3;
                this.f198812b = oVar;
                this.f198813c = 1;
                Object objD = aVar3.d(oVar3, oVar, this);
                if (objD == aVar2) {
                    return aVar2;
                }
                oVar2 = oVar3;
                obj = objD;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar = this.f198812b;
                oVar2 = this.f198811a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    throw ((v2.a) v2Var).f47383a;
                }
                u0.r();
                return null;
            }
            jq1.a aVar4 = (jq1.a) ((v2.b) v2Var).f47386a;
            List<jq1.e> list = aVar4 != null ? aVar4.f99973a : null;
            if (list == null) {
                list = j0.f134944a;
            }
            DateTime dateTimeK = h.k(oVar2);
            DateTime dateTimeAtStartOfDay = l.h(oVar).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            eVar.getClass();
            TreeMap treeMap = new TreeMap();
            p13.u0.k(treeMap, new o13.p[0]);
            new e32.d(null, 1, null).a(dateTimeK, dateTimeAtStartOfDay, treeMap, 1, new vr.e(list, 1));
            Collection collectionValues = treeMap.values();
            collectionValues.getClass();
            return new jq1.d(h0.b1(collectionValues), aVar4 != null ? aVar4.f99974b : null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ljq1/g;", "<anonymous>", "(Lo82/a;)Ljq1/g;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$detailsDataState$1", f = "StepsViewModel.kt", l = {87, 88, 89, 90}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f198816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f198817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0 f198818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v2 f198819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v2 f198820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public v2 f198821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f198822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f198823h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljq1/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$detailsDataState$1$deferredDailyChartData$1", f = "StepsViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends f>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f198825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f198827c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, o oVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f198826b = eVar;
                this.f198827c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f198826b, this.f198827c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends f>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f198825a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                kq1.a aVar2 = this.f198826b.f198800a;
                this.f198825a = 1;
                Object objB = aVar2.b(this.f198827c, this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX INFO: renamed from: yq1.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljq1/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$detailsDataState$1$deferredDailyStatsData$1", f = "StepsViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
        public static final class C3721b extends v13.i implements p<b0, t13.d<? super v2<? extends jq1.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f198828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198829b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f198830c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3721b(e eVar, o oVar, t13.d<? super C3721b> dVar) {
                super(2, dVar);
                this.f198829b = eVar;
                this.f198830c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3721b(this.f198829b, this.f198830c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends jq1.c>> dVar) {
                return ((C3721b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f198828a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                kq1.a aVar2 = this.f198829b.f198800a;
                this.f198828a = 1;
                Object objF = aVar2.f(this.f198830c, this);
                return objF == aVar ? aVar : objF;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ln91/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$detailsDataState$1$deferredPersonalRecords$1", f = "StepsViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends n91.a>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f198831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198832b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e eVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f198832b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f198832b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends n91.a>>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f198831a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                o91.a aVar2 = this.f198832b.f198802c;
                this.f198831a = 1;
                Object objI = aVar2.i(this);
                return objI == aVar ? aVar : objI;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$detailsDataState$1$deferredSnapshotTimeline$1", f = "StepsViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
        public static final class d extends v13.i implements p<b0, t13.d<? super v2<? extends t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f198833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f198835c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(e eVar, o oVar, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f198834b = eVar;
                this.f198835c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f198834b, this.f198835c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends t>> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f198833a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                is1.e eVar = this.f198834b.f198801b;
                DateTime dateTimeK = h.k(this.f198835c);
                this.f198833a = 1;
                Object objA = eVar.a(dateTimeK, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f198823h = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super g> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:38:0x0107  */
        /* JADX WARN: Code duplicated, block: B:39:0x010a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0136  */
        /* JADX WARN: Code duplicated, block: B:45:0x0146  */
        /* JADX WARN: Code duplicated, block: B:50:0x016d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x016f  */
        /* JADX WARN: Code duplicated, block: B:54:0x018c  */
        /* JADX WARN: Code duplicated, block: B:56:0x018f  */
        /* JADX WARN: Code duplicated, block: B:57:0x0194  */
        /* JADX WARN: Code duplicated, block: B:58:0x0196  */
        /* JADX WARN: Code duplicated, block: B:60:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:69:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:72:0x01a8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x0130 A[SYNTHETIC] */
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
            k kVar;
            jq1.b bVar;
            ArrayList arrayListL;
            long typeId;
            jq1.h hVarA;
            Long prStartTimeLocal;
            Long prStartTimeGmt;
            boolean zE;
            o82.a aVar = (o82.a) this.f198823h;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198822g;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130843a;
                e eVar = e.this;
                o53.j0 j0VarJ = ge1.b.j(v1.a(eVar), null, null, new C3721b(eVar, oVar, null), 3);
                o53.j0 j0VarJ2 = ge1.b.j(v1.a(eVar), null, null, new a(eVar, oVar, null), 3);
                o53.j0 j0VarJ3 = ge1.b.j(v1.a(eVar), null, null, new d(eVar, oVar, null), 3);
                i0VarJ = ge1.b.j(v1.a(eVar), null, null, new c(eVar, null), 3);
                this.f198823h = null;
                this.f198816a = j0VarJ2;
                this.f198817b = j0VarJ3;
                this.f198818c = i0VarJ;
                this.f198822g = 1;
                Object objC = j0VarJ.C(this);
                if (objC != aVar2) {
                    i0Var = j0VarJ3;
                    obj = objC;
                    j0Var = j0VarJ2;
                }
                return aVar2;
            }
            if (i14 == 1) {
                i0VarJ = this.f198818c;
                i0Var = this.f198817b;
                j0Var = this.f198816a;
                r.b(obj);
            } else {
                if (i14 == 2) {
                    v2Var = this.f198819d;
                    i0Var3 = this.f198818c;
                    i0Var2 = this.f198817b;
                    r.b(obj);
                    v2Var2 = (v2) obj;
                    this.f198823h = null;
                    this.f198816a = null;
                    this.f198817b = null;
                    this.f198818c = i0Var3;
                    this.f198819d = v2Var;
                    this.f198820e = v2Var2;
                    this.f198822g = 3;
                    objAwait = i0Var2.await(this);
                    if (objAwait != aVar2) {
                        v2 v2Var9 = v2Var;
                        v2Var3 = v2Var2;
                        obj = objAwait;
                        i0Var4 = i0Var3;
                        v2Var4 = v2Var9;
                        v2Var5 = (v2) obj;
                        this.f198823h = null;
                        this.f198816a = null;
                        this.f198817b = null;
                        this.f198818c = null;
                        this.f198819d = v2Var4;
                        this.f198820e = v2Var3;
                        this.f198821f = v2Var5;
                        this.f198822g = 4;
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
                    v2Var3 = this.f198820e;
                    v2Var4 = this.f198819d;
                    i0Var4 = this.f198818c;
                    r.b(obj);
                    v2Var5 = (v2) obj;
                    this.f198823h = null;
                    this.f198816a = null;
                    this.f198817b = null;
                    this.f198818c = null;
                    this.f198819d = v2Var4;
                    this.f198820e = v2Var3;
                    this.f198821f = v2Var5;
                    this.f198822g = 4;
                    objAwait2 = i0Var4.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var6 = v2Var3;
                        v2Var7 = v2Var5;
                        obj = objAwait2;
                    }
                    return aVar2;
                }
                if (i14 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var7 = this.f198821f;
                v2Var6 = this.f198820e;
                v2Var4 = this.f198819d;
                r.b(obj);
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
            kVar = ((jq1.c) ((v2.b) v2Var4).f47386a).f99990a;
            if (kVar != null) {
                bVar = kVar.f100029a;
            } else {
                bVar = null;
            }
            v2Var6.getClass();
            List list = (List) ((v2.b) v2Var6).f47386a;
            v2Var7.getClass();
            t tVar = (t) ((v2.b) v2Var7).f47386a;
            v2Var8.getClass();
            List<n91.a> list2 = (List) ((v2.b) v2Var8).f47386a;
            List<Long> list3 = pq1.i.f139597a;
            arrayListL = j.l(list2);
            for (n91.a aVar3 : list2) {
                typeId = aVar3.getTypeId();
                if (typeId == 16) {
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
                        hVarA = pq1.i.a(aVar3);
                    } else {
                        hVarA = null;
                    }
                } else if (pq1.i.f139597a.contains(Long.valueOf(typeId))) {
                    hVarA = pq1.i.a(aVar3);
                } else {
                    hVarA = null;
                }
                if (hVarA != null) {
                    arrayListL.add(hVarA);
                }
            }
            return new g(bVar, list, tVar, arrayListL);
            v2 v2Var10 = (v2) obj;
            this.f198823h = null;
            this.f198816a = null;
            this.f198817b = i0Var;
            this.f198818c = i0VarJ;
            this.f198819d = v2Var10;
            this.f198822g = 2;
            Object objAwait3 = j0Var.await(this);
            if (objAwait3 != aVar2) {
                i0 i0Var5 = i0VarJ;
                v2Var = v2Var10;
                obj = objAwait3;
                i0Var2 = i0Var;
                i0Var3 = i0Var5;
                v2Var2 = (v2) obj;
                this.f198823h = null;
                this.f198816a = null;
                this.f198817b = null;
                this.f198818c = i0Var3;
                this.f198819d = v2Var;
                this.f198820e = v2Var2;
                this.f198822g = 3;
                objAwait = i0Var2.await(this);
                if (objAwait != aVar2) {
                    v2 v2Var11 = v2Var;
                    v2Var3 = v2Var2;
                    obj = objAwait;
                    i0Var4 = i0Var3;
                    v2Var4 = v2Var11;
                    v2Var5 = (v2) obj;
                    this.f198823h = null;
                    this.f198816a = null;
                    this.f198817b = null;
                    this.f198818c = null;
                    this.f198819d = v2Var4;
                    this.f198820e = v2Var3;
                    this.f198821f = v2Var5;
                    this.f198822g = 4;
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
                        kVar = ((jq1.c) ((v2.b) v2Var4).f47386a).f99990a;
                        if (kVar != null) {
                            bVar = kVar.f100029a;
                        } else {
                            bVar = null;
                        }
                        v2Var6.getClass();
                        List list4 = (List) ((v2.b) v2Var6).f47386a;
                        v2Var7.getClass();
                        t tVar2 = (t) ((v2.b) v2Var7).f47386a;
                        v2Var8.getClass();
                        List<n91.a> list5 = (List) ((v2.b) v2Var8).f47386a;
                        List<Long> list6 = pq1.i.f139597a;
                        arrayListL = j.l(list5);
                        while (r15.hasNext()) {
                            typeId = aVar3.getTypeId();
                            if (typeId == 16) {
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
                                    hVarA = pq1.i.a(aVar3);
                                } else {
                                    hVarA = null;
                                }
                            } else if (pq1.i.f139597a.contains(Long.valueOf(typeId))) {
                                hVarA = pq1.i.a(aVar3);
                            } else {
                                hVarA = null;
                            }
                            if (hVarA != null) {
                                arrayListL.add(hVarA);
                            }
                        }
                        return new g(bVar, list4, tVar2, arrayListL);
                    }
                }
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ljq1/i;", "<anonymous>", "(Lo82/a;)Ljq1/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$monthlySummaryDataState$1", f = "StepsViewModel.kt", l = {149}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super jq1.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f198837b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = e.this.new c(dVar);
            cVar.f198837b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super jq1.i> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f198837b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198836a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130844b;
                kq1.a aVar3 = e.this.f198800a;
                this.f198837b = null;
                this.f198836a = 1;
                obj = aVar3.c(oVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return new jq1.i((List) ((v2.b) v2Var).f47386a);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ljq1/i;", "<anonymous>", "(Lo82/a;)Ljq1/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.viewmodel.StepsViewModel$weeklySummaryDataState$1", f = "StepsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super jq1.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f198840b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = e.this.new d(dVar);
            dVar2.f198840b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super jq1.i> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f198840b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198839a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130844b;
                kq1.a aVar3 = e.this.f198800a;
                this.f198840b = null;
                this.f198839a = 1;
                obj = aVar3.a(oVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return new jq1.i((List) ((v2.b) v2Var).f47386a);
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    public e(kq1.a aVar, is1.e eVar, o91.a aVar2, sq1.b bVar, hq1.b bVar2) {
        Object value;
        aVar.getClass();
        eVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f198800a = aVar;
        this.f198801b = eVar;
        this.f198802c = aVar2;
        this.f198803d = bVar;
        this.f198804e = bVar2;
        this.f198805f = new i(v1.a(this), null, 2, null);
        p2 p2VarA = q2.a(new yq1.d(null, null, null, false, false, false, false, false, false, 511, null));
        this.f198806g = p2VarA;
        B4();
        String strA4 = bVar2.f85230a.A4("key_steps_summary_date_interval_tab", null);
        strA4 = strA4 == null ? "WEEKLY" : strA4;
        yd1.b.f196755b.getClass();
        yd1.b bVarA = yd1.b.a.a(strA4);
        do {
            value = p2VarA.getValue();
        } while (!p2VarA.b(value, yq1.d.a((yq1.d) value, null, null, bVarA, false, false, false, false, false, 507)));
        this.f198807h = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
        this.f198808i = new u82.a(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, 4, null);
        this.f198809j = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f198810k = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
    }

    public final void A4(yd1.b bVar) {
        bVar.getClass();
        p2 p2Var = this.f198806g;
        if (bVar == ((yq1.d) p2Var.getValue()).f198793c) {
            return;
        }
        while (true) {
            Object value = p2Var.getValue();
            yd1.b bVar2 = bVar;
            if (p2Var.b(value, yq1.d.a((yq1.d) value, null, null, bVar2, false, false, false, false, false, 507))) {
                hq1.b bVar3 = this.f198804e;
                bVar3.getClass();
                bVar3.f85230a.S("key_steps_summary_date_interval_tab", bVar2.name());
                return;
            }
            bVar = bVar2;
        }
    }

    public final void B4() {
        boolean zD;
        Object value;
        p2 p2Var = this.f198806g;
        boolean z14 = ((yq1.d) p2Var.getValue()).f198795e;
        sq1.b bVar = this.f198803d;
        if (z14) {
            bVar.getClass();
            zD = sq1.b.f160530c.a();
        } else {
            bVar.getClass();
            zD = sq1.b.f160530c.d();
        }
        boolean z15 = zD;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, yq1.d.a((yq1.d) value, null, null, null, false, false, z15, false, false, 479)));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        String str;
        super.onCleared();
        String strA4 = this.f198804e.f85230a.A4("key_steps_summary_date_interval_tab", null);
        if (strA4 == null) {
            strA4 = "WEEKLY";
        }
        yd1.b.f196755b.getClass();
        yd1.b bVarA = yd1.b.a.a(strA4);
        if (bVarA == ((yq1.d) this.f198806g.getValue()).f198793c) {
            return;
        }
        if (bVarA == yd1.b.WEEKLY) {
            str = "STEPS_REPORTS_WEEKLY_SELECTED";
        } else {
            if (bVarA != yd1.b.MONTHLY) {
                u0.r();
                return;
            }
            str = "STEPS_REPORTS_MONTHLY_SELECTED";
        }
        Bundle bundleD = tn.k.d("Screen", "STEPS_REPORTS", "Action", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "UserAction");
    }

    public final void x4(boolean z14) {
        while (true) {
            p2 p2Var = this.f198806g;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, yq1.d.a((yq1.d) value, null, null, null, false, false, false, false, z15, 383))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void y4(yd1.b bVar) {
        bVar.getClass();
        p2 p2Var = this.f198806g;
        p2Var.k(null, yq1.d.a((yq1.d) p2Var.getValue(), null, null, bVar, false, false, false, false, false, 507));
    }

    public final void z4(boolean z14) {
        while (true) {
            p2 p2Var = this.f198806g;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, yq1.d.a((yq1.d) value, null, null, null, false, false, false, z15, false, 447))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }
}

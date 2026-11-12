package sz1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import aq1.d0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.u0;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsz1/t;", "Landroidx/lifecycle/u1;", "Lpz1/a;", "repository", "<init>", "(Lpz1/a;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz1.a f161574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u82.a f161576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u82.a f161577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u82.a f161578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u82.a f161579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a f161580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f161581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f161582i;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<anonymous>", "(Lo82/a;)Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$acuteLoadReportsDataState$1", f = "TrainingReadinessViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super TrainingStatusReportDTO>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161584b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = t.this.new a(dVar);
            aVar.f161584b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super TrainingStatusReportDTO> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f161584b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161583a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                pz1.a aVar3 = t.this.f161574a;
                this.f161584b = null;
                this.f161583a = 1;
                obj = aVar3.d(oVar, oVar2, this);
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
                return (TrainingStatusReportDTO) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching details sleep data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lmm1/b;", "<anonymous>", "(Lo82/a;)Lmm1/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$dailyReportsDataState$1", f = "TrainingReadinessViewModel.kt", l = {195}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o82.a, t13.d<? super mm1.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b63.o f161586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b63.o f161587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f161588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f161589d;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = t.this.new b(dVar);
            bVar.f161589d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super mm1.b> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            b63.o oVar;
            Object objF;
            b63.o oVar2;
            Object aVar;
            o82.a aVar2 = (o82.a) this.f161589d;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161588c;
            String str = null;
            boolean z14 = false;
            t tVar = t.this;
            int i15 = 1;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar3 = aVar2.f130843a;
                oVar = aVar2.f130844b;
                pz1.a aVar4 = tVar.f161574a;
                this.f161589d = null;
                this.f161586a = oVar3;
                this.f161587b = oVar;
                this.f161588c = 1;
                objF = aVar4.f(oVar3, oVar, this);
                if (objF == aVar3) {
                    return aVar3;
                }
                oVar2 = oVar3;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar = this.f161587b;
                oVar2 = this.f161586a;
                o13.r.b(obj);
                objF = obj;
            }
            v2 v2Var = (v2) objF;
            DateTime dateTimeK = vb.h.k(oVar2);
            DateTime dateTimeAtStartOfDay = g22.l.h(oVar).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            tVar.getClass();
            if (v2Var instanceof v2.b) {
                TreeMap treeMap = new TreeMap();
                u0.k(treeMap, new o13.p[0]);
                v2.b bVar = (v2.b) v2Var;
                int i16 = bVar.f47387b;
                mm1.b bVar2 = i16 == 200 ? (mm1.b) bVar.f47386a : new mm1.b(j0.f134944a, null, 2, null);
                new e32.d(str, i15, z14 ? 1 : 0).a(dateTimeK, dateTimeAtStartOfDay, treeMap, tVar.f161575b, new d0(bVar2.b(), 25));
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                aVar = new v2.b(mm1.b.a(bVar2, h0.b1(collectionValues)), i16, null, null, 12, null);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                v2.a aVar5 = (v2.a) v2Var;
                aVar = new v2.a(aVar5.f47383a, aVar5.f47384b, null, 4, null);
            }
            if (aVar instanceof v2.b) {
                return (mm1.b) ((v2.b) aVar).f47386a;
            }
            q2.u("Error fetching daily sleep data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lkr1/a;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$dailyReportsStressDataState$1", f = "TrainingReadinessViewModel.kt", l = {215}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o82.a, t13.d<? super List<? extends kr1.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161592b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = t.this.new c(dVar);
            cVar.f161592b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends kr1.a>> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f161592b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161591a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                pz1.a aVar3 = t.this.f161574a;
                this.f161592b = null;
                this.f161591a = 1;
                obj = aVar3.g(oVar, oVar2, this);
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
                return (List) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            lc.u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Li41/b;", "<anonymous>", "(Lo82/a;)Li41/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$hrvOneDayDataState$1", f = "TrainingReadinessViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super i41.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161595b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = t.this.new d(dVar);
            dVar2.f161595b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i41.b> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f161595b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161594a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                pz1.a aVar3 = t.this.f161574a;
                this.f161595b = null;
                this.f161594a = 1;
                obj = aVar3.a(oVar, this);
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
                return (i41.b) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching daily hrv data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Li41/e;", "<anonymous>", "(Lo82/a;)Li41/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$hrvReportsDataState$1", f = "TrainingReadinessViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super i41.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161598b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = t.this.new e(dVar);
            eVar.f161598b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i41.e> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f161598b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161597a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                pz1.a aVar3 = t.this.f161574a;
                this.f161598b = null;
                this.f161597a = 1;
                obj = aVar3.b(oVar, oVar2, this);
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
                return (i41.e) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching daily hrv data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Loz1/b;", "<anonymous>", "(Lo82/a;)Loz1/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$mergedDataState$1", f = "TrainingReadinessViewModel.kt", l = {43, 51}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o82.a, t13.d<? super oz1.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public oz1.b f161600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f161601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f161602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f161603d;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = t.this.new f(dVar);
            fVar.f161603d = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super oz1.b> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x011c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x00db  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:72:0x0142  */
        /* JADX WARN: Code duplicated, block: B:78:0x0164  */
        /* JADX WARN: Code duplicated, block: B:80:0x0168  */
        /* JADX WARN: Code duplicated, block: B:82:0x016d  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            boolean zG;
            oz1.b bVar;
            oz1.b bVar2;
            int size;
            int i14;
            Object next;
            Object next2;
            v2 v2Var;
            o82.a aVar = (o82.a) this.f161603d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f161602c;
            t tVar = t.this;
            if (i15 == 0) {
                o13.r.b(obj);
                zG = p005kotlin.jvm.internal.s.g(aVar.f130843a, g22.l.d(b63.o.INSTANCE));
                pz1.a aVar3 = tVar.f161574a;
                b63.o oVar = aVar.f130843a;
                this.f161603d = aVar;
                this.f161601b = zG;
                this.f161602c = 1;
                obj = aVar3.h(oVar, this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                zG = this.f161601b;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = this.f161600a;
                o13.r.b(obj);
            }
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                oz1.b bVar3 = (oz1.b) h0.d0((List) ((v2.b) v2Var).f47386a);
                return (bVar3 != null || bVar2 == null) ? bVar2 : oz1.b.b(bVar2, bVar3.getAcwrFactorFeedback(), bVar3.getAcwrFactorPercent(), bVar3.getAcuteLoad());
            }
            if (!(v2Var instanceof v2.a)) {
                throw ((v2.a) v2Var).f47383a;
            }
            lc.u0.r();
            return null;
            v2 v2Var2 = (v2) obj;
            if (!(v2Var2 instanceof v2.b)) {
                if (v2Var2 instanceof v2.a) {
                    throw ((v2.a) v2Var2).f47383a;
                }
                lc.u0.r();
                return null;
            }
            List list = (List) ((v2.b) v2Var2).f47386a;
            tVar.getClass();
            if (list.isEmpty()) {
                bVar = null;
            } else {
                oz1.b bVar4 = (oz1.b) h0.d0(list);
                if (!zG || bVar4 == null) {
                    List listN0 = h0.N0(list, new u());
                    if (!zG) {
                        Iterator it = listN0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            oz1.b bVar5 = (oz1.b) next;
                            if (p005kotlin.jvm.internal.s.g(bVar5.getInputContext(), oz1.t.AFTER_WAKEUP_RESET.f134625a) && p005kotlin.jvm.internal.s.g(bVar5.getPrimaryActivityTracker(), Boolean.TRUE)) {
                                break;
                            }
                        }
                        bVar = (oz1.b) next;
                        if (bVar == null) {
                            Iterator it3 = listN0.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                                oz1.b bVar6 = (oz1.b) next2;
                                if (p005kotlin.jvm.internal.s.g(bVar6.getInputContext(), oz1.t.AFTER_WAKEUP_RESET.f134625a) && p005kotlin.jvm.internal.s.g(bVar6.getPrimaryActivityTracker(), Boolean.FALSE)) {
                                    break;
                                }
                            }
                            oz1.b bVar7 = (oz1.b) next2;
                            if (bVar7 == null) {
                                size = list.size();
                                i14 = 0;
                                while (true) {
                                    if (i14 < size) {
                                        bVar = (oz1.b) h0.d0(list);
                                        break;
                                    }
                                    bVar = (oz1.b) list.get(i14);
                                    if ((!zG && p005kotlin.jvm.internal.s.g(bVar.getInputContext(), oz1.t.UPDATE_REALTIME_VARIABLES.f134625a)) || ((zG && p005kotlin.jvm.internal.s.g(bVar.getInputContext(), oz1.t.AFTER_POST_EXERCISE_RESET.f134625a)) || p005kotlin.jvm.internal.s.g(bVar.getInputContext(), oz1.t.AFTER_WAKEUP_RESET.f134625a))) {
                                        break;
                                    }
                                }
                            } else {
                                bVar = bVar7;
                            }
                        }
                    } else {
                        size = list.size();
                        i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                bVar = (oz1.b) h0.d0(list);
                                break;
                            }
                            bVar = (oz1.b) list.get(i14);
                            i14 = !zG ? i14 + 1 : i14 + 1;
                        }
                    }
                } else {
                    bVar = bVar4;
                }
            }
            if (zG) {
                return bVar;
            }
            pz1.a aVar4 = tVar.f161574a;
            b63.o oVar2 = aVar.f130843a;
            this.f161603d = null;
            this.f161600a = bVar;
            this.f161601b = zG;
            this.f161602c = 2;
            obj = aVar4.h(oVar2, this);
            if (obj != aVar2) {
                bVar2 = bVar;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    oz1.b bVar8 = (oz1.b) h0.d0((List) ((v2.b) v2Var).f47386a);
                    if (bVar8 != null) {
                    }
                }
                if (!(v2Var instanceof v2.a)) {
                    throw ((v2.a) v2Var).f47383a;
                }
                lc.u0.r();
                return null;
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lkm1/c;", "<anonymous>", "(Lo82/a;)Lkm1/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessViewModel$sleepDetailsDataState$1", f = "TrainingReadinessViewModel.kt", l = {229}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o82.a, t13.d<? super km1.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f161606b;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = t.this.new g(dVar);
            gVar.f161606b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super km1.c> dVar) {
            return ((g) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f161606b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161605a;
            if (i14 == 0) {
                o13.r.b(obj);
                pz1.a aVar3 = t.this.f161574a;
                b63.o oVar = aVar.f130843a;
                this.f161606b = null;
                this.f161605a = 1;
                obj = aVar3.c(oVar, this);
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
                return (km1.c) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching details sleep data");
            return null;
        }
    }

    public t(pz1.a aVar) {
        aVar.getClass();
        this.f161574a = aVar;
        this.f161575b = 1;
        int i14 = 4;
        p005kotlin.jvm.internal.j jVar = null;
        this.f161576c = new u82.a(v1.a(this), new y82.e(new y82.c(new f(null)), null, 2, null), false, i14, jVar);
        int i15 = 4;
        p005kotlin.jvm.internal.j jVar2 = null;
        boolean z14 = false;
        this.f161577d = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), z14, i15, jVar2);
        this.f161578e = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, i14, jVar);
        this.f161579f = new u82.a(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), z14, i15, jVar2);
        this.f161580g = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, i14, jVar);
        this.f161581h = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), z14, i15, jVar2);
        this.f161582i = new u82.a(v1.a(this), new y82.e(new y82.c(new g(null)), null, 2, null), false, i14, jVar);
    }
}

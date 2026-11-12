package fe1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import aq1.d0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import gs1.t;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import o13.r;
import o53.b0;
import o53.j0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.u0;
import r1.q2;
import r53.b2;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfe1/n;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/respiration/data/c;", "respirationRepository", "Lis1/e;", "timelineRepository", "Lcom/garmin/android/apps/connectmobile/respiration/data/a;", "respirationPreferences", "<init>", "(Lcom/garmin/android/apps/connectmobile/respiration/data/c;Lis1/e;Lcom/garmin/android/apps/connectmobile/respiration/data/a;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.respiration.data.c f70557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is1.e f70558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.respiration.data.a f70559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f70560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f70561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tf0.i f70562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a f70563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f70564h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lbe1/a;", "<anonymous>", "(Lo82/a;)Lbe1/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsViewModel$dailyReportsDataState$1", f = "RespirationReportsViewModel.kt", l = {68, 69}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o82.a, t13.d<? super be1.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f70565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2 f70566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f70567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f70568d;

        /* JADX INFO: renamed from: fe1.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lbe1/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsViewModel$dailyReportsDataState$1$deferredDailyRespiration$1", f = "RespirationReportsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
        public static final class C1448a extends v13.i implements p<b0, t13.d<? super v2<? extends be1.a>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f70571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b63.o f70572c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1448a(n nVar, b63.o oVar, t13.d<? super C1448a> dVar) {
                super(2, dVar);
                this.f70571b = nVar;
                this.f70572c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1448a(this.f70571b, this.f70572c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends be1.a>> dVar) {
                return ((C1448a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f70570a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                com.garmin.android.apps.connectmobile.respiration.data.c cVar = this.f70571b.f70557a;
                this.f70570a = 1;
                Object objA = cVar.a(this.f70572c, this);
                return objA == aVar ? aVar : objA;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsViewModel$dailyReportsDataState$1$deferredSnapshotTimeline$1", f = "RespirationReportsViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f70574b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b63.o f70575c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n nVar, b63.o oVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f70574b = nVar;
                this.f70575c = oVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f70574b, this.f70575c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends t>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f70573a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                is1.e eVar = this.f70574b.f70558b;
                DateTime dateTimeK = vb.h.k(this.f70575c);
                this.f70573a = 1;
                Object objA = eVar.a(dateTimeK, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = n.this.new a(dVar);
            aVar.f70568d = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super be1.a> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (r1 == r2) goto L15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            j0 j0VarJ;
            Object objC;
            v2 v2Var;
            Object objAwait;
            Object value;
            o82.a aVar = (o82.a) this.f70568d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70567c;
            n nVar = n.this;
            if (i14 == 0) {
                r.b(obj);
                b63.o oVar = aVar.f130843a;
                j0 j0VarJ2 = ge1.b.j(v1.a(nVar), null, null, new C1448a(nVar, oVar, null), 3);
                j0VarJ = ge1.b.j(v1.a(nVar), null, null, new b(nVar, oVar, null), 3);
                this.f70568d = null;
                this.f70565a = j0VarJ;
                this.f70567c = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                j0VarJ = this.f70565a;
                r.b(obj);
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2 v2Var2 = this.f70566b;
                r.b(obj);
                v2Var = v2Var2;
                objAwait = obj;
            }
            v2 v2Var3 = (v2) objAwait;
            if (v2Var instanceof v2.a) {
                q2.u("Error fetching daily respiration data");
                return null;
            }
            if (v2Var3 instanceof v2.a) {
                q2.u("Error fetching daily timeline data");
                return null;
            }
            v2Var.getClass();
            v2Var3.getClass();
            be1.a aVar3 = (be1.a) ((v2.b) v2Var).f47386a;
            t tVar = (t) ((v2.b) v2Var3).f47386a;
            be1.a.Companion companion = be1.a.INSTANCE;
            be1.a aVar4 = new be1.a(aVar3.f17714a, aVar3.f17715b, aVar3.f17716c, aVar3.f17717d, aVar3.f17718e, aVar3.f17719f, aVar3.f17720g, aVar3.f17721h, aVar3.f17722i, aVar3.f17723j, aVar3.f17724k, aVar3.f17725l, aVar3.f17726m, aVar3.f17727n, aVar3.f17728o, aVar3.f17729p, aVar3.f17730q, aVar3.f17731r, aVar3.f17732t, aVar3.f17733v, aVar3.f17734w, aVar3.f17735x, tVar);
            Integer num = aVar4.f17735x;
            if (num == null) {
                nVar.getClass();
                return aVar4;
            }
            p2 p2Var = nVar.f70560d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o.a((o) value, false, null, null, null, num, 15)));
            return aVar4;
            v2Var = (v2) objC;
            this.f70568d = null;
            this.f70565a = null;
            this.f70566b = v2Var;
            this.f70567c = 2;
            objAwait = j0VarJ.await(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lbe1/b;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsViewModel$weeklyReportsDataState$1", f = "RespirationReportsViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super List<? extends be1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f70577b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = n.this.new b(dVar);
            bVar.f70577b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends be1.b>> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f70577b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70576a;
            n nVar = n.this;
            int i15 = 1;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.android.apps.connectmobile.respiration.data.c cVar = nVar.f70557a;
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                this.f70577b = aVar;
                this.f70576a = 1;
                obj = cVar.b(oVar, oVar2, this);
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
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching weekly respiration data");
                return null;
            }
            List list = (List) ((v2.b) v2Var).f47386a;
            b63.o oVar3 = aVar.f130843a;
            b63.o oVar4 = aVar.f130844b;
            nVar.getClass();
            TreeMap treeMap = new TreeMap();
            u0.k(treeMap, new o13.p[0]);
            new e32.d(null, i15, 0 == true ? 1 : 0).a(vb.h.k(oVar3), vb.h.k(oVar4), treeMap, 1, new d0(list, 7));
            Collection collectionValues = treeMap.values();
            collectionValues.getClass();
            return h0.b1(collectionValues);
        }
    }

    public n(com.garmin.android.apps.connectmobile.respiration.data.c cVar, is1.e eVar, com.garmin.android.apps.connectmobile.respiration.data.a aVar) {
        cVar.getClass();
        eVar.getClass();
        aVar.getClass();
        this.f70557a = cVar;
        this.f70558b = eVar;
        this.f70559c = aVar;
        p2 p2VarA = r53.q2.a(new o(false, null, null, aVar.a(), null, 23, null));
        this.f70560d = p2VarA;
        this.f70561e = s.d(p2VarA);
        this.f70562f = new tf0.i(v1.a(this), null, 2, null);
        this.f70563g = new u82.a(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, 4, null);
        boolean z14 = false;
        this.f70564h = new u82.a(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), z14, 4, null);
    }
}

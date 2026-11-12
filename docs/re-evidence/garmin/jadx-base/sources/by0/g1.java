package by0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getMultiDayActivityTimelineSummaries$2$newPage$1", f = "MultiDayActivityDataStore.kt", l = {305}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends ActivityListItemDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.r<o53.b0, Integer, Integer, t13.d<? super List<? extends ActivityListItemDTO>>, Object> f21821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21823e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getMultiDayActivityTimelineSummaries$2$newPage$1$result$1", f = "MultiDayActivityDataStore.kt", l = {303}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends ActivityListItemDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.r<o53.b0, Integer, Integer, t13.d<? super List<? extends ActivityListItemDTO>>, Object> f21826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f21827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f21828e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.r<? super o53.b0, ? super Integer, ? super Integer, ? super t13.d<? super List<? extends ActivityListItemDTO>>, ? extends Object> rVar, int i14, int i15, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21826c = rVar;
            this.f21827d = i14;
            this.f21828e = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21826c, this.f21827d, this.f21828e, dVar);
            aVar.f21825b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends ActivityListItemDTO>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f21825b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21824a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Integer num = new Integer(this.f21827d);
            Integer num2 = new Integer(this.f21828e);
            this.f21825b = null;
            this.f21824a = 1;
            Object objInvoke = this.f21826c.invoke(b0Var, num, num2, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(e23.r<? super o53.b0, ? super Integer, ? super Integer, ? super t13.d<? super List<? extends ActivityListItemDTO>>, ? extends Object> rVar, int i14, int i15, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f21821c = rVar;
        this.f21822d = i14;
        this.f21823e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g1 g1Var = new g1(this.f21821c, this.f21822d, this.f21823e, dVar);
        g1Var.f21820b = obj;
        return g1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends ActivityListItemDTO>> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f21820b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21819a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x53.c cVar = o53.s0.f129406a;
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f21821c, this.f21822d, this.f21823e, null), 2);
        this.f21820b = null;
        this.f21819a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}

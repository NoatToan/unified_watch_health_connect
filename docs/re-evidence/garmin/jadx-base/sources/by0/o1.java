package by0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Loz1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getTrainingReadinessData$2$1", f = "MultiDayActivityDataStore.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 2)
public final class o1 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends oz1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<? super List<oz1.b>>, Object> f21987c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Loz1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getTrainingReadinessData$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {238}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends oz1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<? super List<oz1.b>>, Object> f21990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super o53.b0, ? super t13.d<? super List<oz1.b>>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21990c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21990c, dVar);
            aVar.f21989b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends oz1.b>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f21989b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21988a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f21989b = null;
            this.f21988a = 1;
            Object objInvoke = this.f21990c.invoke(b0Var, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1(e23.p<? super o53.b0, ? super t13.d<? super List<oz1.b>>, ? extends Object> pVar, t13.d<? super o1> dVar) {
        super(2, dVar);
        this.f21987c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o1 o1Var = new o1(this.f21987c, dVar);
        o1Var.f21986b = obj;
        return o1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends oz1.b>> dVar) {
        return ((o1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f21986b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21985a;
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
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f21987c, null), 2);
        this.f21986b = null;
        this.f21985a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}

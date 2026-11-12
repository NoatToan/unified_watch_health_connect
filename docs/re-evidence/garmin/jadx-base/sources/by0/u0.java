package by0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ln61/f;", "<anonymous>", "(Lo53/b0;)Ln61/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getEnduranceScoreData$2$1", f = "MultiDayActivityDataStore.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super n61.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<? super n61.f>, Object> f22080c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ln61/f;", "<anonymous>", "(Lo53/b0;)Ln61/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getEnduranceScoreData$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {255}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super n61.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<? super n61.f>, Object> f22083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super o53.b0, ? super t13.d<? super n61.f>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f22083c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f22083c, dVar);
            aVar.f22082b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super n61.f> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f22082b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f22081a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f22082b = null;
            this.f22081a = 1;
            Object objInvoke = this.f22083c.invoke(b0Var, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(e23.p<? super o53.b0, ? super t13.d<? super n61.f>, ? extends Object> pVar, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f22080c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f22080c, dVar);
        u0Var.f22079b = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super n61.f> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f22079b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f22078a;
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
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f22080c, null), 2);
        this.f22079b = null;
        this.f22078a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}

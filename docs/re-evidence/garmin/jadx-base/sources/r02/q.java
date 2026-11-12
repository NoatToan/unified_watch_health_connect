package r02;

import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState$fling$2", f = "ZoomableState.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f148934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f148935c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState$fling$2$1", f = "ZoomableState.kt", l = {264}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f148937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f148938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148937b = mVar;
            this.f148938c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148937b, this.f148938c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148936a;
            if (i14 == 0) {
                o13.r.b(obj);
                m mVar = this.f148937b;
                s1.b<Float, s1.n> bVar = mVar.f148896d;
                Float f14 = new Float(g6.s.c(this.f148938c));
                y<Float> yVar = mVar.f148893a;
                this.f148936a = 1;
                if (s1.b.b(bVar, f14, yVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState$fling$2$2", f = "ZoomableState.kt", l = {270}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f148940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f148941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar, long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f148940b = mVar;
            this.f148941c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f148940b, this.f148941c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148939a;
            if (i14 == 0) {
                o13.r.b(obj);
                m mVar = this.f148940b;
                s1.b<Float, s1.n> bVar = mVar.f148897e;
                Float f14 = new Float(g6.s.d(this.f148941c));
                y<Float> yVar = mVar.f148893a;
                this.f148939a = 1;
                if (s1.b.b(bVar, f14, yVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, long j8, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f148934b = mVar;
        this.f148935c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f148934b, this.f148935c, dVar);
        qVar.f148933a = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super l1> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f148933a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l1 l1Var = (l1) b0Var.getF195311f().get(l1.f129368i0);
        m mVar = this.f148934b;
        mVar.f148900h = l1Var;
        long j8 = this.f148935c;
        ge1.b.T(b0Var, null, null, new a(mVar, j8, null), 3);
        return ge1.b.T(b0Var, null, null, new b(mVar, j8, null), 3);
    }
}

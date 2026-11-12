package l72;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.MapCompassKt$MapCompass$1$1", f = "MapCompass.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f111219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f111220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f111221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<o53.l1> f111222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f111223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f111224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f111225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f111226h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.MapCompassKt$MapCompass$1$1$1", f = "MapCompass.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f111228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f111229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f111230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f111231e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, float f14, float f15, p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f111228b = j8;
            this.f111229c = f14;
            this.f111230d = f15;
            this.f111231e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f111228b, this.f111229c, this.f111230d, this.f111231e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f111227a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f111227a = 1;
                if (o53.m0.b(this.f111228b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (Math.abs(this.f111229c - this.f111230d) < 0.1f) {
                this.f111231e.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(boolean z14, boolean z15, p3.p1<o53.l1> p1Var, long j8, float f14, float f15, p3.p1<Boolean> p1Var2, t13.d<? super r2> dVar) {
        super(2, dVar);
        this.f111220b = z14;
        this.f111221c = z15;
        this.f111222d = p1Var;
        this.f111223e = j8;
        this.f111224f = f14;
        this.f111225g = f15;
        this.f111226h = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r2 r2Var = new r2(this.f111220b, this.f111221c, this.f111222d, this.f111223e, this.f111224f, this.f111225g, this.f111226h, dVar);
        r2Var.f111219a = obj;
        return r2Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f111219a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.p1<o53.l1> p1Var = this.f111222d;
        o53.l1 f182175a = p1Var.getF182175a();
        if (f182175a != null) {
            f182175a.c(null);
        }
        boolean z14 = this.f111220b;
        p3.p1<Boolean> p1Var2 = this.f111226h;
        if (z14 && this.f111221c) {
            p1Var.setValue(ge1.b.T(b0Var, null, null, new a(this.f111223e, this.f111224f, this.f111225g, this.f111226h, null), 3));
        } else {
            p1Var2.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}

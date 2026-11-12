package t20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.biz.CoursesBizManager$convertActivityToCourse$1", f = "CoursesBizManager.kt", l = {73, 74}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f161782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<v2<com.garmin.android.apps.connectmobile.courses.model.e>, Unit> f161783c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.biz.CoursesBizManager$convertActivityToCourse$1$1", f = "CoursesBizManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<v2<com.garmin.android.apps.connectmobile.courses.model.e>, Unit> f161784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v2<com.garmin.android.apps.connectmobile.courses.model.e> f161785b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super v2<com.garmin.android.apps.connectmobile.courses.model.e>, Unit> lVar, v2<com.garmin.android.apps.connectmobile.courses.model.e> v2Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f161784a = lVar;
            this.f161785b = v2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f161784a, this.f161785b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f161784a.invoke(this.f161785b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(long j8, e23.l<? super v2<com.garmin.android.apps.connectmobile.courses.model.e>, Unit> lVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f161782b = j8;
        this.f161783c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f161782b, this.f161783c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (ge1.b.e0(r1, r3, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161781a;
        if (i14 == 0) {
            r.b(obj);
            d60.b bVarG = u0.g(d60.b.f57806c);
            this.f161781a = 1;
            obj = f0.J(bVarG, new d60.c(bVarG, this.f161782b, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar2 = new a(this.f161783c, (v2) obj, null);
        this.f161781a = 2;
    }
}

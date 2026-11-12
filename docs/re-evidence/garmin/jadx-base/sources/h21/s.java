package h21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import r53.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.screen.NutritionReportsScreenKt$NutritionReportsScreen$3$2$3$1$1", f = "NutritionReportsScreen.kt", l = {285}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n82.f f81156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i21.d f81157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o82.g f81158d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "currentPageInterval", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.screen.NutritionReportsScreenKt$NutritionReportsScreen$3$2$3$1$1$2", f = "NutritionReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i21.d f81160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.g f81161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i21.d dVar, o82.g gVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f81160b = dVar;
            this.f81161c = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f81160b, this.f81161c, dVar);
            aVar.f81159a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o82.a aVar = (o82.a) this.f81159a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i21.d dVar = this.f81160b;
            dVar.getClass();
            o82.g gVar = this.f81161c;
            gVar.getClass();
            aVar.getClass();
            dVar.f87280l = new o13.p<>(gVar, aVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n82.f fVar, i21.d dVar, o82.g gVar, t13.d<? super s> dVar2) {
        super(2, dVar2);
        this.f81156b = fVar;
        this.f81157c = dVar;
        this.f81158d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f81156b, this.f81157c, this.f81158d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81155a;
        if (i14 == 0) {
            o13.r.b(obj);
            c2 c2VarS = p0.s(new d52.p(this.f81156b, 1));
            a aVar2 = new a(this.f81157c, this.f81158d, null);
            this.f81155a = 1;
            if (r53.s.k(c2VarS, aVar2, this) == aVar) {
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

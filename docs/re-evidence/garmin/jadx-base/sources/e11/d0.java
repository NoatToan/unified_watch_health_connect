package e11;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.screen.CreateMealScreenKt$CreateMealScreen$2$1", f = "CreateMealScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f61871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f11.g f61872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<f11.g.c> f61873c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61874a;

        static {
            int[] iArr = new int[f11.g.c.values().length];
            try {
                iArr[f11.g.c.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f61874a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(e23.l<? super Boolean, Unit> lVar, f11.g gVar, x3<? extends f11.g.c> x3Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f61871a = lVar;
        this.f61872b = gVar;
        this.f61873c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f61871a, this.f61872b, this.f61873c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (a.f61874a[this.f61873c.getF182175a().ordinal()] == 1) {
            this.f61871a.invoke(Boolean.valueOf(this.f61872b.f67938j));
        }
        return Unit.INSTANCE;
    }
}

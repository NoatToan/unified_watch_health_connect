package e11;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.screen.CreateEditFoodScreenKt$CreateFoodScreen$3$1", f = "CreateEditFoodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f11.a.c f61893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f61894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f11.a f61895c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61896a;

        static {
            int[] iArr = new int[f11.a.c.values().length];
            try {
                iArr[f11.a.c.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f61896a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(f11.a.c cVar, e23.l<? super Boolean, Unit> lVar, f11.a aVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f61893a = cVar;
        this.f61894b = lVar;
        this.f61895c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f61893a, this.f61894b, this.f61895c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (a.f61896a[this.f61893a.ordinal()] == 1) {
            this.f61894b.invoke(Boolean.valueOf(this.f61895c.f67890j));
        }
        return Unit.INSTANCE;
    }
}

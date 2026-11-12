package e11;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.screen.QuickAddScreenKt$QuickAddScreen$2$1", f = "QuickAddScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<b63.o, b11.i.c, Unit> f61899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f11.j f61900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<f11.j.c> f61901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<f11.j.b> f61902d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61903a;

        static {
            int[] iArr = new int[f11.j.c.values().length];
            try {
                iArr[f11.j.c.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f61903a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(e23.p<? super b63.o, ? super b11.i.c, Unit> pVar, f11.j jVar, x3<? extends f11.j.c> x3Var, x3<f11.j.b> x3Var2, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f61899a = pVar;
        this.f61900b = jVar;
        this.f61901c = x3Var;
        this.f61902d = x3Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f61899a, this.f61900b, this.f61901c, this.f61902d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (a.f61903a[this.f61901c.getF182175a().ordinal()] == 1) {
            b63.o oVar = this.f61900b.f67964a;
            f11.j.b f182175a = this.f61902d.getF182175a();
            this.f61899a.invoke(oVar, f182175a != null ? f182175a.f67982a : null);
        }
        return Unit.INSTANCE;
    }
}

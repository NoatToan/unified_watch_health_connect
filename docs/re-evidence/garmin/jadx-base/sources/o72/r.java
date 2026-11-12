package o72;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.ChipSelectionExamplesKt$ChipGridGroupSample$2$2$1", f = "ChipSelectionExamples.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f130524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f130525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f130526c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.ChipSelectionExamplesKt$ChipGridGroupSample$2$2$1$1", f = "ChipSelectionExamples.kt", l = {215}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f130528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f130529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2.i0 i0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130528b = i0Var;
            this.f130529c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130528b, this.f130529c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130527a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130527a = 1;
                if (e2.i0.f(this.f130528b, this.f130529c, this) == aVar) {
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
    public r(o53.b0 b0Var, e2.i0 i0Var, int i14, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f130524a = b0Var;
        this.f130525b = i0Var;
        this.f130526c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f130524a, this.f130525b, this.f130526c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(this.f130524a, null, null, new a(this.f130525b, this.f130526c, null), 3);
        return Unit.INSTANCE;
    }
}

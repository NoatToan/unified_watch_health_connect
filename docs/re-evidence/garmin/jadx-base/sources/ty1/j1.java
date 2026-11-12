package ty1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.TIAddTriathlonEventDistanceFragment$setUpSwimTypeChip$1$1$1$2$1", f = "TIAddTriathlonEventDistanceFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f167144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f167145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f167146c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.TIAddTriathlonEventDistanceFragment$setUpSwimTypeChip$1$1$1$2$1$1", f = "TIAddTriathlonEventDistanceFragment.kt", l = {425}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f167148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f167149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2.i0 i0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f167148b = i0Var;
            this.f167149c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f167148b, this.f167149c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167147a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167147a = 1;
                if (e2.i0.f(this.f167148b, this.f167149c, this) == aVar) {
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
    public j1(o53.b0 b0Var, e2.i0 i0Var, int i14, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f167144a = b0Var;
        this.f167145b = i0Var;
        this.f167146c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j1(this.f167144a, this.f167145b, this.f167146c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(this.f167144a, null, null, new a(this.f167145b, this.f167146c, null), 3);
        return Unit.INSTANCE;
    }
}

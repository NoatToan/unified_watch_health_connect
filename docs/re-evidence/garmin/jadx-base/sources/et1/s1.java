package et1;

import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$6$1", f = "TrailsMainScreen.kt", l = {533}, m = "invokeSuspend", v = 2)
public final class s1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.o1 f65847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f65848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f65849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3.a1 f65850e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$6$1$1", f = "TrailsMainScreen.kt", l = {529}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f65851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i3.a1 f65852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3.o1 f65853c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i3.a1 a1Var, p3.o1 o1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f65852b = a1Var;
            this.f65853c = o1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f65852b, this.f65853c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f65851a;
            if (i14 == 0) {
                o13.r.b(obj);
                mc mcVar = this.f65852b.f87409a;
                this.f65851a = 1;
                if (mcVar.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f65853c.k(-1L);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s1(p3.o1 o1Var, o53.b0 b0Var, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, i3.a1 a1Var, t13.d<? super s1> dVar) {
        super(2, dVar);
        this.f65847b = o1Var;
        this.f65848c = b0Var;
        this.f65849d = lVar;
        this.f65850e = a1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s1(this.f65847b, this.f65848c, this.f65849d, this.f65850e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65846a;
        if (i14 == 0) {
            o13.r.b(obj);
            p3.o1 o1Var = this.f65847b;
            if (o1Var.j() > 0) {
                ge1.b.T(this.f65848c, null, null, new a(this.f65850e, o1Var, null), 3);
            } else {
                this.f65846a = 1;
                if (this.f65849d.invoke(this) == aVar) {
                    return aVar;
                }
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

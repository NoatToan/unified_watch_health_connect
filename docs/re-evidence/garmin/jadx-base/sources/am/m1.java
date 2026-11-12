package am;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityTypesListContentKt$ActivityTypesListContent$1$1", f = "ActivityTypesListContent.kt", l = {197}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gr.b f4100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f4101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<String> f4102d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f4103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<String> f4104b;

        public a(e2.i0 i0Var, x3<String> x3Var) {
            this.f4103a = i0Var;
            this.f4104b = x3Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objF;
            return (d53.w.J(this.f4104b.getF182175a()) && (objF = e2.i0.f(this.f4103a, ((Number) obj).intValue(), dVar)) == u13.a.COROUTINE_SUSPENDED) ? objF : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gr.b bVar, e2.i0 i0Var, x3<String> x3Var, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f4100b = bVar;
        this.f4101c = i0Var;
        this.f4102d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f4100b, this.f4101c, this.f4102d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4099a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.e eVar = this.f4100b.f78527d;
            a aVar2 = new a(this.f4101c, this.f4102d);
            this.f4099a = 1;
            if (eVar.collect(aVar2, this) == aVar) {
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

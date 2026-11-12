package ds;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.TemplatesCarouselKt$TemplatesCarousel$3$1", f = "TemplatesCarousel.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2.j0 f60944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f60945c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f60946a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Integer, Unit> lVar) {
            this.f60946a = lVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int iIntValue = ((Number) obj).intValue();
            e23.l<Integer, Unit> lVar = this.f60946a;
            if (lVar != null) {
                lVar.invoke(new Integer(iIntValue));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(h2.j0 j0Var, e23.l<? super Integer, Unit> lVar, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f60944b = j0Var;
        this.f60945c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f60944b, this.f60945c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60943a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.i iVarS = r53.s.s(p0.s(new g0(this.f60944b, 0)));
            a aVar2 = new a(this.f60945c);
            this.f60943a = 1;
            if (iVarS.collect(aVar2, this) == aVar) {
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
